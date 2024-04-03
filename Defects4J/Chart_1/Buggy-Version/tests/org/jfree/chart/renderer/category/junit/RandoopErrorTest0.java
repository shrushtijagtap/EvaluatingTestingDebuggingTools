package org.jfree.chart.renderer.category;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RandoopErrorTest0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test001");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color3 = java.awt.Color.BLUE;
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color3);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator8 = lineAndShapeRenderer2.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator9 = null;
        lineAndShapeRenderer2.setLegendItemURLGenerator(categorySeriesLabelGenerator9);
        java.awt.Paint paint12 = lineAndShapeRenderer2.getSeriesPaint(1);
        java.awt.Paint paint16 = lineAndShapeRenderer2.getItemFillPaint((-1), (int) (short) 100, false);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer20 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color21 = java.awt.Color.BLUE;
        lineAndShapeRenderer20.setBaseItemLabelPaint((java.awt.Paint) color21);
        java.awt.Shape shape23 = lineAndShapeRenderer20.getBaseShape();
        lineAndShapeRenderer2.setLegendShape((int) (byte) 1, shape23);
        org.jfree.chart.entity.ChartEntity chartEntity26 = new org.jfree.chart.entity.ChartEntity(shape23, "");
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on lineAndShapeRenderer20 and lineAndShapeRenderer2.", lineAndShapeRenderer20.equals(lineAndShapeRenderer2) == lineAndShapeRenderer2.equals(lineAndShapeRenderer20));
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test002");
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
        org.jfree.data.category.CategoryDataset categoryDataset25 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis27 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float28 = categoryAxis27.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis29 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer32 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color33 = java.awt.Color.BLUE;
        lineAndShapeRenderer32.setBaseItemLabelPaint((java.awt.Paint) color33);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator38 = lineAndShapeRenderer32.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot39 = new org.jfree.chart.plot.CategoryPlot(categoryDataset25, categoryAxis27, valueAxis29, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer32);
        boolean boolean40 = lineAndShapeRenderer2.equals((java.lang.Object) valueAxis29);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryPlot21 and categoryPlot39", categoryPlot21.equals(categoryPlot39) ? categoryPlot21.hashCode() == categoryPlot39.hashCode() : true);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test003");
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float2 = categoryAxis1.getTickMarkInsideLength();
        categoryAxis1.setMaximumCategoryLabelLines((int) (byte) 1);
        categoryAxis1.setMaximumCategoryLabelLines(10);
        java.awt.Color color7 = java.awt.Color.gray;
        categoryAxis1.setTickMarkPaint((java.awt.Paint) color7);
        java.lang.String str9 = categoryAxis1.getLabelToolTip();
        java.awt.Graphics2D graphics2D10 = null;
        java.awt.geom.Rectangle2D rectangle2D12 = null;
        org.jfree.data.category.CategoryDataset categoryDataset13 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis15 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float16 = categoryAxis15.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis17 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer20 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color21 = java.awt.Color.BLUE;
        lineAndShapeRenderer20.setBaseItemLabelPaint((java.awt.Paint) color21);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator26 = lineAndShapeRenderer20.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot27 = new org.jfree.chart.plot.CategoryPlot(categoryDataset13, categoryAxis15, valueAxis17, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer20);
        java.lang.Object obj28 = categoryPlot27.clone();
        org.jfree.chart.util.RectangleEdge rectangleEdge30 = categoryPlot27.getDomainAxisEdge((int) ' ');
        org.jfree.chart.axis.AxisState axisState31 = null;
        categoryAxis1.drawTickMarks(graphics2D10, (double) (byte) 1, rectangle2D12, rectangleEdge30, axisState31);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryPlot27 and obj28", categoryPlot27.equals(obj28) ? categoryPlot27.hashCode() == obj28.hashCode() : true);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test004");
        org.jfree.chart.LegendItem legendItem1 = new org.jfree.chart.LegendItem("hi!");
        java.awt.Color color5 = java.awt.Color.getHSBColor((float) (short) 1, (float) ' ', 0.0f);
        legendItem1.setLinePaint((java.awt.Paint) color5);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer9 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color10 = java.awt.Color.BLUE;
        lineAndShapeRenderer9.setBaseItemLabelPaint((java.awt.Paint) color10);
        java.awt.Shape shape12 = lineAndShapeRenderer9.getBaseShape();
        org.jfree.chart.entity.ChartEntity chartEntity14 = new org.jfree.chart.entity.ChartEntity(shape12, "");
        legendItem1.setLine(shape12);
        java.awt.Stroke stroke16 = legendItem1.getLineStroke();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer19 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color20 = java.awt.Color.BLUE;
        lineAndShapeRenderer19.setBaseItemLabelPaint((java.awt.Paint) color20);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator25 = lineAndShapeRenderer19.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator26 = null;
        lineAndShapeRenderer19.setLegendItemURLGenerator(categorySeriesLabelGenerator26);
        java.awt.Paint paint29 = lineAndShapeRenderer19.getSeriesPaint(1);
        java.awt.Paint paint33 = lineAndShapeRenderer19.getItemFillPaint((-1), (int) (short) 100, false);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer37 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color38 = java.awt.Color.BLUE;
        lineAndShapeRenderer37.setBaseItemLabelPaint((java.awt.Paint) color38);
        java.awt.Shape shape40 = lineAndShapeRenderer37.getBaseShape();
        lineAndShapeRenderer19.setLegendShape((int) (byte) 1, shape40);
        java.awt.Paint paint42 = lineAndShapeRenderer19.getBaseItemLabelPaint();
        legendItem1.setOutlinePaint(paint42);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on lineAndShapeRenderer9 and lineAndShapeRenderer19.", lineAndShapeRenderer9.equals(lineAndShapeRenderer19) == lineAndShapeRenderer19.equals(lineAndShapeRenderer9));
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test005");
        org.jfree.chart.util.SortOrder sortOrder0 = org.jfree.chart.util.SortOrder.ASCENDING;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer3 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color4 = java.awt.Color.BLUE;
        lineAndShapeRenderer3.setBaseItemLabelPaint((java.awt.Paint) color4);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator9 = lineAndShapeRenderer3.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator10 = null;
        lineAndShapeRenderer3.setLegendItemURLGenerator(categorySeriesLabelGenerator10);
        java.awt.Paint paint13 = lineAndShapeRenderer3.getSeriesPaint(1);
        java.awt.Paint paint17 = lineAndShapeRenderer3.getItemFillPaint((-1), (int) (short) 100, false);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer21 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color22 = java.awt.Color.BLUE;
        lineAndShapeRenderer21.setBaseItemLabelPaint((java.awt.Paint) color22);
        java.awt.Shape shape24 = lineAndShapeRenderer21.getBaseShape();
        lineAndShapeRenderer3.setLegendShape((int) (byte) 1, shape24);
        boolean boolean26 = sortOrder0.equals((java.lang.Object) shape24);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on lineAndShapeRenderer21 and lineAndShapeRenderer3.", lineAndShapeRenderer21.equals(lineAndShapeRenderer3) == lineAndShapeRenderer3.equals(lineAndShapeRenderer21));
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test006");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color3 = java.awt.Color.BLUE;
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color3);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator8 = lineAndShapeRenderer2.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator9 = null;
        lineAndShapeRenderer2.setLegendItemURLGenerator(categorySeriesLabelGenerator9);
        java.awt.Paint paint12 = lineAndShapeRenderer2.getSeriesPaint(1);
        org.jfree.chart.renderer.RenderAttributes renderAttributes13 = lineAndShapeRenderer2.getSelectedItemAttributes();
        java.awt.Color color15 = java.awt.Color.BLUE;
        renderAttributes13.setSeriesFillPaint((int) 'a', (java.awt.Paint) color15);
        org.jfree.chart.axis.CategoryAxis categoryAxis18 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float19 = categoryAxis18.getTickMarkInsideLength();
        categoryAxis18.setMaximumCategoryLabelLines((int) (byte) 1);
        boolean boolean22 = categoryAxis18.isVisible();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer26 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator27 = null;
        lineAndShapeRenderer26.setBaseURLGenerator(categoryURLGenerator27);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator30 = null;
        lineAndShapeRenderer26.setSeriesToolTipGenerator(10, categoryToolTipGenerator30);
        boolean boolean32 = lineAndShapeRenderer26.getBaseSeriesVisibleInLegend();
        java.awt.Stroke stroke34 = null;
        lineAndShapeRenderer26.setSeriesStroke((int) 'a', stroke34, true);
        org.jfree.chart.labels.ItemLabelAnchor itemLabelAnchor38 = org.jfree.chart.labels.ItemLabelAnchor.INSIDE3;
        java.awt.Color color39 = java.awt.Color.yellow;
        boolean boolean40 = itemLabelAnchor38.equals((java.lang.Object) color39);
        lineAndShapeRenderer26.setSeriesFillPaint((int) ' ', (java.awt.Paint) color39);
        categoryAxis18.setTickLabelPaint((java.lang.Comparable) false, (java.awt.Paint) color39);
        renderAttributes13.setDefaultOutlinePaint((java.awt.Paint) color39);
        java.awt.Color color45 = org.jfree.chart.ChartColor.DARK_YELLOW;
        renderAttributes13.setSeriesFillPaint((int) (byte) 0, (java.awt.Paint) color45);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer50 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator51 = null;
        lineAndShapeRenderer50.setBaseURLGenerator(categoryURLGenerator51);
        java.awt.Shape shape54 = lineAndShapeRenderer50.getLegendShape(0);
        lineAndShapeRenderer50.setAutoPopulateSeriesStroke(false);
        java.awt.Font font58 = lineAndShapeRenderer50.getSeriesItemLabelFont(0);
        lineAndShapeRenderer50.setUseSeriesOffset(true);
        java.awt.Font font62 = null;
        lineAndShapeRenderer50.setSeriesItemLabelFont((int) (short) 1, font62, false);
        java.awt.Stroke stroke68 = lineAndShapeRenderer50.getItemOutlineStroke(0, 1, false);
        renderAttributes13.setSeriesStroke(10, stroke68);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer72 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        boolean boolean74 = lineAndShapeRenderer72.isSeriesVisibleInLegend(1);
        java.awt.Font font75 = lineAndShapeRenderer72.getBaseLegendTextFont();
        java.awt.Stroke stroke76 = lineAndShapeRenderer72.getBaseOutlineStroke();
        renderAttributes13.setDefaultStroke(stroke76);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on lineAndShapeRenderer72 and lineAndShapeRenderer26.", lineAndShapeRenderer72.equals(lineAndShapeRenderer26) == lineAndShapeRenderer26.equals(lineAndShapeRenderer72));
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test007");
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
        org.jfree.chart.renderer.category.BarRenderer barRenderer34 = new org.jfree.chart.renderer.category.BarRenderer();
        boolean boolean35 = barRenderer34.isDrawBarOutline();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer38 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color39 = java.awt.Color.BLUE;
        lineAndShapeRenderer38.setBaseItemLabelPaint((java.awt.Paint) color39);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator44 = lineAndShapeRenderer38.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition45 = lineAndShapeRenderer38.getBaseNegativeItemLabelPosition();
        barRenderer34.setNegativeItemLabelPositionFallback(itemLabelPosition45);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer49 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator50 = null;
        lineAndShapeRenderer49.setBaseURLGenerator(categoryURLGenerator50);
        java.awt.Shape shape53 = lineAndShapeRenderer49.getLegendShape(0);
        lineAndShapeRenderer49.setAutoPopulateSeriesStroke(false);
        java.awt.Font font57 = lineAndShapeRenderer49.getSeriesItemLabelFont(0);
        lineAndShapeRenderer49.setUseSeriesOffset(true);
        java.awt.Shape shape61 = null;
        lineAndShapeRenderer49.setSeriesShape((int) (short) 10, shape61, true);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition64 = lineAndShapeRenderer49.getBasePositiveItemLabelPosition();
        org.jfree.chart.text.TextAnchor textAnchor65 = itemLabelPosition64.getTextAnchor();
        barRenderer34.setPositiveItemLabelPositionFallback(itemLabelPosition64);
        barRenderer0.setNegativeItemLabelPositionFallback(itemLabelPosition64);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on itemLabelPosition11 and itemLabelPosition45", itemLabelPosition11.equals(itemLabelPosition45) ? itemLabelPosition11.hashCode() == itemLabelPosition45.hashCode() : true);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test008");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float3 = categoryAxis2.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis4 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer7 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color8 = java.awt.Color.BLUE;
        lineAndShapeRenderer7.setBaseItemLabelPaint((java.awt.Paint) color8);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator13 = lineAndShapeRenderer7.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot14 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis2, valueAxis4, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer7);
        java.lang.Object obj15 = categoryPlot14.clone();
        org.jfree.chart.util.RectangleEdge rectangleEdge17 = categoryPlot14.getDomainAxisEdge((int) ' ');
        boolean boolean18 = categoryPlot14.isRangeZeroBaselineVisible();
        org.jfree.chart.axis.CategoryAxis categoryAxis20 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float21 = categoryAxis20.getTickMarkInsideLength();
        categoryAxis20.setTickLabelsVisible(false);
        double double24 = categoryAxis20.getLowerMargin();
        boolean boolean25 = categoryPlot14.equals((java.lang.Object) categoryAxis20);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer28 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator29 = null;
        lineAndShapeRenderer28.setBaseURLGenerator(categoryURLGenerator29);
        java.awt.Shape shape32 = lineAndShapeRenderer28.getLegendShape(0);
        lineAndShapeRenderer28.setAutoPopulateSeriesStroke(false);
        java.awt.Graphics2D graphics2D35 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer38 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color39 = java.awt.Color.BLUE;
        lineAndShapeRenderer38.setBaseItemLabelPaint((java.awt.Paint) color39);
        java.awt.Stroke stroke42 = lineAndShapeRenderer38.getSeriesOutlineStroke((int) (short) 1);
        org.jfree.data.category.CategoryDataset categoryDataset43 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis45 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float46 = categoryAxis45.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis47 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer50 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color51 = java.awt.Color.BLUE;
        lineAndShapeRenderer50.setBaseItemLabelPaint((java.awt.Paint) color51);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator56 = lineAndShapeRenderer50.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot57 = new org.jfree.chart.plot.CategoryPlot(categoryDataset43, categoryAxis45, valueAxis47, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer50);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer58 = categoryPlot57.getRenderer();
        org.jfree.chart.axis.ValueAxis valueAxis60 = lineAndShapeRenderer38.getRangeAxis(categoryPlot57, (int) '4');
        boolean boolean61 = categoryPlot57.isRangeCrosshairVisible();
        java.awt.Paint paint62 = categoryPlot57.getRangeZeroBaselinePaint();
        categoryPlot57.mapDatasetToDomainAxis((int) (byte) 1, (int) (short) 10);
        org.jfree.chart.axis.ValueAxis valueAxis66 = null;
        org.jfree.chart.plot.Marker marker67 = null;
        java.awt.geom.Rectangle2D rectangle2D68 = null;
        lineAndShapeRenderer28.drawRangeMarker(graphics2D35, categoryPlot57, valueAxis66, marker67, rectangle2D68);
        org.jfree.data.category.CategoryDataset categoryDataset71 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis73 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float74 = categoryAxis73.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis75 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer78 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color79 = java.awt.Color.BLUE;
        lineAndShapeRenderer78.setBaseItemLabelPaint((java.awt.Paint) color79);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator84 = lineAndShapeRenderer78.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot85 = new org.jfree.chart.plot.CategoryPlot(categoryDataset71, categoryAxis73, valueAxis75, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer78);
        org.jfree.chart.util.RectangleInsets rectangleInsets86 = categoryAxis73.getLabelInsets();
        categoryPlot57.setDomainAxis(10, categoryAxis73, true);
        categoryPlot14.setDomainAxis(categoryAxis73);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj15 and categoryPlot85", obj15.equals(categoryPlot85) ? obj15.hashCode() == categoryPlot85.hashCode() : true);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test009");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator3 = null;
        lineAndShapeRenderer2.setBaseURLGenerator(categoryURLGenerator3);
        java.awt.Shape shape6 = lineAndShapeRenderer2.getLegendShape(0);
        lineAndShapeRenderer2.setAutoPopulateSeriesStroke(false);
        java.awt.Font font10 = lineAndShapeRenderer2.getSeriesItemLabelFont(0);
        lineAndShapeRenderer2.setUseSeriesOffset(true);
        int int13 = lineAndShapeRenderer2.getColumnCount();
        lineAndShapeRenderer2.setBaseSeriesVisibleInLegend(true);
        boolean boolean17 = lineAndShapeRenderer2.isSeriesVisibleInLegend(3);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator19 = lineAndShapeRenderer2.getSeriesToolTipGenerator((int) (byte) 0);
        org.jfree.chart.labels.StandardCategorySeriesLabelGenerator standardCategorySeriesLabelGenerator21 = new org.jfree.chart.labels.StandardCategorySeriesLabelGenerator("{0}");
        lineAndShapeRenderer2.setLegendItemURLGenerator((org.jfree.chart.labels.CategorySeriesLabelGenerator) standardCategorySeriesLabelGenerator21);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer25 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color26 = java.awt.Color.BLUE;
        lineAndShapeRenderer25.setBaseItemLabelPaint((java.awt.Paint) color26);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator31 = lineAndShapeRenderer25.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator32 = null;
        lineAndShapeRenderer25.setLegendItemURLGenerator(categorySeriesLabelGenerator32);
        java.awt.Paint paint35 = lineAndShapeRenderer25.getSeriesPaint(1);
        java.awt.Paint paint39 = lineAndShapeRenderer25.getItemFillPaint((-1), (int) (short) 100, false);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer43 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color44 = java.awt.Color.BLUE;
        lineAndShapeRenderer43.setBaseItemLabelPaint((java.awt.Paint) color44);
        java.awt.Shape shape46 = lineAndShapeRenderer43.getBaseShape();
        lineAndShapeRenderer25.setLegendShape((int) (byte) 1, shape46);
        lineAndShapeRenderer2.setBaseLegendShape(shape46);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on lineAndShapeRenderer43 and lineAndShapeRenderer25.", lineAndShapeRenderer43.equals(lineAndShapeRenderer25) == lineAndShapeRenderer25.equals(lineAndShapeRenderer43));
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test010");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator3 = null;
        lineAndShapeRenderer2.setBaseURLGenerator(categoryURLGenerator3);
        java.awt.Shape shape6 = lineAndShapeRenderer2.getLegendShape(0);
        lineAndShapeRenderer2.setAutoPopulateSeriesStroke(false);
        java.awt.Font font10 = lineAndShapeRenderer2.getSeriesItemLabelFont(0);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator12 = null;
        lineAndShapeRenderer2.setSeriesToolTipGenerator(0, categoryToolTipGenerator12);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer16 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color17 = java.awt.Color.BLUE;
        lineAndShapeRenderer16.setBaseItemLabelPaint((java.awt.Paint) color17);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator22 = lineAndShapeRenderer16.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator23 = null;
        lineAndShapeRenderer16.setLegendItemURLGenerator(categorySeriesLabelGenerator23);
        java.awt.Paint paint26 = lineAndShapeRenderer16.getSeriesPaint(1);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer30 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color31 = java.awt.Color.BLUE;
        lineAndShapeRenderer30.setBaseItemLabelPaint((java.awt.Paint) color31);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator36 = lineAndShapeRenderer30.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator37 = null;
        lineAndShapeRenderer30.setLegendItemURLGenerator(categorySeriesLabelGenerator37);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator42 = lineAndShapeRenderer30.getToolTipGenerator((int) '#', (int) (byte) 10, false);
        lineAndShapeRenderer30.setBaseSeriesVisible(true, true);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition47 = lineAndShapeRenderer30.getSeriesNegativeItemLabelPosition((int) (byte) -1);
        lineAndShapeRenderer16.setSeriesPositiveItemLabelPosition(100, itemLabelPosition47, false);
        lineAndShapeRenderer2.setBasePositiveItemLabelPosition(itemLabelPosition47, true);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on lineAndShapeRenderer30 and lineAndShapeRenderer16.", lineAndShapeRenderer30.equals(lineAndShapeRenderer16) == lineAndShapeRenderer16.equals(lineAndShapeRenderer30));
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test011");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator3 = null;
        lineAndShapeRenderer2.setBaseURLGenerator(categoryURLGenerator3);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator6 = null;
        lineAndShapeRenderer2.setSeriesToolTipGenerator(10, categoryToolTipGenerator6);
        boolean boolean8 = lineAndShapeRenderer2.getBaseSeriesVisibleInLegend();
        java.awt.Stroke stroke10 = null;
        lineAndShapeRenderer2.setSeriesStroke((int) 'a', stroke10, true);
        org.jfree.chart.labels.ItemLabelAnchor itemLabelAnchor14 = org.jfree.chart.labels.ItemLabelAnchor.INSIDE3;
        java.awt.Color color15 = java.awt.Color.yellow;
        boolean boolean16 = itemLabelAnchor14.equals((java.lang.Object) color15);
        lineAndShapeRenderer2.setSeriesFillPaint((int) ' ', (java.awt.Paint) color15);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer20 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color21 = java.awt.Color.BLUE;
        lineAndShapeRenderer20.setBaseItemLabelPaint((java.awt.Paint) color21);
        java.awt.Stroke stroke24 = lineAndShapeRenderer20.getSeriesOutlineStroke((int) (short) 1);
        org.jfree.data.category.CategoryDataset categoryDataset25 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis27 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float28 = categoryAxis27.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis29 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer32 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color33 = java.awt.Color.BLUE;
        lineAndShapeRenderer32.setBaseItemLabelPaint((java.awt.Paint) color33);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator38 = lineAndShapeRenderer32.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot39 = new org.jfree.chart.plot.CategoryPlot(categoryDataset25, categoryAxis27, valueAxis29, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer32);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer40 = categoryPlot39.getRenderer();
        org.jfree.chart.axis.ValueAxis valueAxis42 = lineAndShapeRenderer20.getRangeAxis(categoryPlot39, (int) '4');
        boolean boolean43 = categoryPlot39.isRangeCrosshairVisible();
        lineAndShapeRenderer2.addChangeListener((org.jfree.chart.event.RendererChangeListener) categoryPlot39);
        org.jfree.data.category.CategoryDataset categoryDataset46 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis48 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float49 = categoryAxis48.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis50 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer53 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color54 = java.awt.Color.BLUE;
        lineAndShapeRenderer53.setBaseItemLabelPaint((java.awt.Paint) color54);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator59 = lineAndShapeRenderer53.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot60 = new org.jfree.chart.plot.CategoryPlot(categoryDataset46, categoryAxis48, valueAxis50, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer53);
        lineAndShapeRenderer53.setSeriesVisibleInLegend(3, (java.lang.Boolean) false, false);
        org.jfree.chart.axis.CategoryAxis categoryAxis67 = new org.jfree.chart.axis.CategoryAxis("hi!");
        java.lang.Object obj68 = categoryAxis67.clone();
        java.awt.Font font69 = categoryAxis67.getTickLabelFont();
        lineAndShapeRenderer53.setSeriesItemLabelFont((int) '#', font69);
        lineAndShapeRenderer2.setSeriesItemLabelFont((int) (byte) 10, font69);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on lineAndShapeRenderer20 and lineAndShapeRenderer53.", lineAndShapeRenderer20.equals(lineAndShapeRenderer53) == lineAndShapeRenderer53.equals(lineAndShapeRenderer20));
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test012");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float3 = categoryAxis2.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis4 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer7 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color8 = java.awt.Color.BLUE;
        lineAndShapeRenderer7.setBaseItemLabelPaint((java.awt.Paint) color8);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator13 = lineAndShapeRenderer7.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot14 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis2, valueAxis4, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer7);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer15 = categoryPlot14.getRenderer();
        categoryItemRenderer15.setSeriesItemLabelsVisible((int) 'a', (java.lang.Boolean) true, true);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator21 = null;
        categoryItemRenderer15.setSeriesToolTipGenerator((int) (byte) 100, categoryToolTipGenerator21, false);
        org.jfree.chart.JFreeChart jFreeChart24 = null;
        org.jfree.chart.event.ChartChangeEventType chartChangeEventType25 = org.jfree.chart.event.ChartChangeEventType.NEW_DATASET;
        org.jfree.chart.event.ChartChangeEvent chartChangeEvent26 = new org.jfree.chart.event.ChartChangeEvent((java.lang.Object) categoryItemRenderer15, jFreeChart24, chartChangeEventType25);
        org.jfree.chart.event.ChartChangeEventType chartChangeEventType27 = chartChangeEvent26.getType();
        org.jfree.data.category.CategoryDataset categoryDataset28 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis30 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float31 = categoryAxis30.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis32 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer35 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color36 = java.awt.Color.BLUE;
        lineAndShapeRenderer35.setBaseItemLabelPaint((java.awt.Paint) color36);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator41 = lineAndShapeRenderer35.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot42 = new org.jfree.chart.plot.CategoryPlot(categoryDataset28, categoryAxis30, valueAxis32, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer35);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer43 = categoryPlot42.getRenderer();
        categoryItemRenderer43.setSeriesItemLabelsVisible((int) 'a', (java.lang.Boolean) true, true);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator49 = null;
        categoryItemRenderer43.setSeriesToolTipGenerator((int) (byte) 100, categoryToolTipGenerator49, false);
        org.jfree.chart.JFreeChart jFreeChart52 = null;
        org.jfree.chart.event.ChartChangeEventType chartChangeEventType53 = org.jfree.chart.event.ChartChangeEventType.NEW_DATASET;
        org.jfree.chart.event.ChartChangeEvent chartChangeEvent54 = new org.jfree.chart.event.ChartChangeEvent((java.lang.Object) categoryItemRenderer43, jFreeChart52, chartChangeEventType53);
        chartChangeEvent26.setType(chartChangeEventType53);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryPlot14 and categoryPlot42", categoryPlot14.equals(categoryPlot42) ? categoryPlot14.hashCode() == categoryPlot42.hashCode() : true);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test013");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float3 = categoryAxis2.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis4 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer7 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color8 = java.awt.Color.BLUE;
        lineAndShapeRenderer7.setBaseItemLabelPaint((java.awt.Paint) color8);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator13 = lineAndShapeRenderer7.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot14 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis2, valueAxis4, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer7);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent15 = new org.jfree.chart.event.PlotChangeEvent((org.jfree.chart.plot.Plot) categoryPlot14);
        org.jfree.chart.plot.Plot plot16 = plotChangeEvent15.getPlot();
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
        categoryItemRenderer32.setSeriesItemLabelsVisible((int) 'a', (java.lang.Boolean) true, true);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator38 = null;
        categoryItemRenderer32.setSeriesToolTipGenerator((int) (byte) 100, categoryToolTipGenerator38, false);
        org.jfree.chart.JFreeChart jFreeChart41 = null;
        org.jfree.chart.event.ChartChangeEventType chartChangeEventType42 = org.jfree.chart.event.ChartChangeEventType.NEW_DATASET;
        org.jfree.chart.event.ChartChangeEvent chartChangeEvent43 = new org.jfree.chart.event.ChartChangeEvent((java.lang.Object) categoryItemRenderer32, jFreeChart41, chartChangeEventType42);
        plotChangeEvent15.setType(chartChangeEventType42);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on lineAndShapeRenderer7 and lineAndShapeRenderer24.", lineAndShapeRenderer7.equals(lineAndShapeRenderer24) == lineAndShapeRenderer24.equals(lineAndShapeRenderer7));
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test014");
        org.jfree.data.KeyedObjects keyedObjects0 = new org.jfree.data.KeyedObjects();
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
        org.jfree.chart.util.RectangleEdge rectangleEdge28 = categoryPlot23.getDomainAxisEdge();
        boolean boolean29 = categoryPlot23.isRangeZeroBaselineVisible();
        boolean boolean30 = categoryPlot23.isDomainGridlinesVisible();
        keyedObjects0.addObject((java.lang.Comparable) (short) 100, (java.lang.Object) categoryPlot23);
        java.awt.Stroke stroke32 = categoryPlot23.getDomainGridlineStroke();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer35 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color36 = java.awt.Color.BLUE;
        lineAndShapeRenderer35.setBaseItemLabelPaint((java.awt.Paint) color36);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator41 = lineAndShapeRenderer35.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator42 = null;
        lineAndShapeRenderer35.setLegendItemURLGenerator(categorySeriesLabelGenerator42);
        java.awt.Paint paint45 = lineAndShapeRenderer35.getSeriesPaint(1);
        java.awt.Paint paint49 = lineAndShapeRenderer35.getItemFillPaint((-1), (int) (short) 100, false);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer53 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color54 = java.awt.Color.BLUE;
        lineAndShapeRenderer53.setBaseItemLabelPaint((java.awt.Paint) color54);
        java.awt.Shape shape56 = lineAndShapeRenderer53.getBaseShape();
        lineAndShapeRenderer35.setLegendShape((int) (byte) 1, shape56);
        java.awt.Paint paint58 = lineAndShapeRenderer35.getBaseItemLabelPaint();
        categoryPlot23.setNoDataMessagePaint(paint58);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on lineAndShapeRenderer4 and lineAndShapeRenderer35.", lineAndShapeRenderer4.equals(lineAndShapeRenderer35) == lineAndShapeRenderer35.equals(lineAndShapeRenderer4));
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test015");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator3 = null;
        lineAndShapeRenderer2.setBaseURLGenerator(categoryURLGenerator3);
        java.awt.Shape shape6 = lineAndShapeRenderer2.getLegendShape(0);
        lineAndShapeRenderer2.setAutoPopulateSeriesStroke(false);
        java.awt.Font font10 = lineAndShapeRenderer2.getSeriesItemLabelFont(0);
        java.awt.Paint paint12 = lineAndShapeRenderer2.lookupLegendTextPaint(4);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition13 = lineAndShapeRenderer2.getBasePositiveItemLabelPosition();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer17 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color18 = java.awt.Color.BLUE;
        lineAndShapeRenderer17.setBaseItemLabelPaint((java.awt.Paint) color18);
        java.awt.Shape shape20 = lineAndShapeRenderer17.getBaseShape();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer23 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator24 = null;
        lineAndShapeRenderer23.setBaseURLGenerator(categoryURLGenerator24);
        java.awt.Shape shape27 = lineAndShapeRenderer23.getLegendShape(0);
        lineAndShapeRenderer23.setAutoPopulateSeriesStroke(false);
        java.awt.Font font31 = lineAndShapeRenderer23.getSeriesItemLabelFont(0);
        lineAndShapeRenderer23.setUseSeriesOffset(true);
        java.awt.Font font35 = null;
        lineAndShapeRenderer23.setSeriesItemLabelFont((int) (short) 1, font35, false);
        java.awt.Stroke stroke41 = lineAndShapeRenderer23.getItemOutlineStroke(0, 1, false);
        lineAndShapeRenderer17.setBaseStroke(stroke41, true);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition44 = lineAndShapeRenderer17.getBasePositiveItemLabelPosition();
        lineAndShapeRenderer2.setSeriesPositiveItemLabelPosition(1, itemLabelPosition44, true);
        org.jfree.data.category.CategoryDataset categoryDataset47 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis49 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float50 = categoryAxis49.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis51 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer54 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color55 = java.awt.Color.BLUE;
        lineAndShapeRenderer54.setBaseItemLabelPaint((java.awt.Paint) color55);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator60 = lineAndShapeRenderer54.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot61 = new org.jfree.chart.plot.CategoryPlot(categoryDataset47, categoryAxis49, valueAxis51, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer54);
        org.jfree.chart.axis.AxisLocation axisLocation62 = org.jfree.chart.axis.AxisLocation.TOP_OR_LEFT;
        categoryPlot61.setRangeAxisLocation(axisLocation62);
        categoryPlot61.configureDomainAxes();
        org.jfree.chart.util.SortOrder sortOrder65 = org.jfree.chart.util.SortOrder.ASCENDING;
        categoryPlot61.setRowRenderingOrder(sortOrder65);
        java.awt.geom.GeneralPath generalPath67 = null;
        java.awt.geom.Rectangle2D rectangle2D68 = null;
        org.jfree.chart.RenderingSource renderingSource69 = null;
        categoryPlot61.select(generalPath67, rectangle2D68, renderingSource69);
        java.awt.Paint paint71 = categoryPlot61.getRangeCrosshairPaint();
        lineAndShapeRenderer2.setBaseFillPaint(paint71, true);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on itemLabelPosition13 and itemLabelPosition44", itemLabelPosition13.equals(itemLabelPosition44) ? itemLabelPosition13.hashCode() == itemLabelPosition44.hashCode() : true);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test016");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator3 = null;
        lineAndShapeRenderer2.setBaseURLGenerator(categoryURLGenerator3);
        java.awt.Shape shape6 = lineAndShapeRenderer2.getLegendShape(0);
        lineAndShapeRenderer2.setAutoPopulateSeriesStroke(false);
        java.awt.Font font10 = lineAndShapeRenderer2.getSeriesItemLabelFont(0);
        lineAndShapeRenderer2.setUseSeriesOffset(true);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier13 = lineAndShapeRenderer2.getDrawingSupplier();
        lineAndShapeRenderer2.setBaseCreateEntities(false);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer18 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color19 = java.awt.Color.BLUE;
        lineAndShapeRenderer18.setBaseItemLabelPaint((java.awt.Paint) color19);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator24 = lineAndShapeRenderer18.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator25 = null;
        lineAndShapeRenderer18.setLegendItemURLGenerator(categorySeriesLabelGenerator25);
        java.awt.Paint paint28 = lineAndShapeRenderer18.getSeriesPaint(1);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer32 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color33 = java.awt.Color.BLUE;
        lineAndShapeRenderer32.setBaseItemLabelPaint((java.awt.Paint) color33);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator38 = lineAndShapeRenderer32.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator39 = null;
        lineAndShapeRenderer32.setLegendItemURLGenerator(categorySeriesLabelGenerator39);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator44 = lineAndShapeRenderer32.getToolTipGenerator((int) '#', (int) (byte) 10, false);
        lineAndShapeRenderer32.setBaseSeriesVisible(true, true);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition49 = lineAndShapeRenderer32.getSeriesNegativeItemLabelPosition((int) (byte) -1);
        lineAndShapeRenderer18.setSeriesPositiveItemLabelPosition(100, itemLabelPosition49, false);
        org.jfree.chart.LegendItem legendItem54 = new org.jfree.chart.LegendItem("hi!");
        java.awt.Color color58 = java.awt.Color.getHSBColor((float) (short) 1, (float) ' ', 0.0f);
        legendItem54.setLinePaint((java.awt.Paint) color58);
        boolean boolean60 = legendItem54.isShapeOutlineVisible();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer63 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color64 = java.awt.Color.BLUE;
        lineAndShapeRenderer63.setBaseItemLabelPaint((java.awt.Paint) color64);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator69 = lineAndShapeRenderer63.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition71 = lineAndShapeRenderer63.getSeriesPositiveItemLabelPosition((int) 'a');
        java.awt.Shape shape73 = lineAndShapeRenderer63.lookupLegendShape(8);
        legendItem54.setLine(shape73);
        lineAndShapeRenderer18.setSeriesShape(0, shape73);
        lineAndShapeRenderer2.setBaseShape(shape73, false);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on lineAndShapeRenderer32 and lineAndShapeRenderer18.", lineAndShapeRenderer32.equals(lineAndShapeRenderer18) == lineAndShapeRenderer18.equals(lineAndShapeRenderer32));
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test017");
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
        java.awt.Color color35 = org.jfree.chart.ChartColor.DARK_MAGENTA;
        barRenderer0.setShadowPaint((java.awt.Paint) color35);
        barRenderer0.setDrawBarOutline(true);
        org.jfree.chart.renderer.category.BarRenderer barRenderer39 = new org.jfree.chart.renderer.category.BarRenderer();
        boolean boolean40 = barRenderer39.isDrawBarOutline();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer43 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color44 = java.awt.Color.BLUE;
        lineAndShapeRenderer43.setBaseItemLabelPaint((java.awt.Paint) color44);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator49 = lineAndShapeRenderer43.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition50 = lineAndShapeRenderer43.getBaseNegativeItemLabelPosition();
        barRenderer39.setNegativeItemLabelPositionFallback(itemLabelPosition50);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer54 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator55 = null;
        lineAndShapeRenderer54.setBaseURLGenerator(categoryURLGenerator55);
        java.awt.Shape shape58 = lineAndShapeRenderer54.getLegendShape(0);
        lineAndShapeRenderer54.setAutoPopulateSeriesStroke(false);
        java.awt.Font font62 = lineAndShapeRenderer54.getSeriesItemLabelFont(0);
        lineAndShapeRenderer54.setUseSeriesOffset(true);
        java.awt.Shape shape66 = null;
        lineAndShapeRenderer54.setSeriesShape((int) (short) 10, shape66, true);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition69 = lineAndShapeRenderer54.getBasePositiveItemLabelPosition();
        org.jfree.chart.text.TextAnchor textAnchor70 = itemLabelPosition69.getTextAnchor();
        barRenderer39.setPositiveItemLabelPositionFallback(itemLabelPosition69);
        boolean boolean72 = barRenderer39.getShadowsVisible();
        org.jfree.chart.renderer.category.BarPainter barPainter73 = barRenderer39.getBarPainter();
        barRenderer0.setBarPainter(barPainter73);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on itemLabelPosition11 and itemLabelPosition50", itemLabelPosition11.equals(itemLabelPosition50) ? itemLabelPosition11.hashCode() == itemLabelPosition50.hashCode() : true);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test018");
        org.jfree.chart.LegendItem legendItem1 = new org.jfree.chart.LegendItem("hi!");
        java.awt.Color color5 = java.awt.Color.getHSBColor((float) (short) 1, (float) ' ', 0.0f);
        legendItem1.setLinePaint((java.awt.Paint) color5);
        boolean boolean7 = legendItem1.isShapeOutlineVisible();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer10 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color11 = java.awt.Color.BLUE;
        lineAndShapeRenderer10.setBaseItemLabelPaint((java.awt.Paint) color11);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator16 = lineAndShapeRenderer10.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition18 = lineAndShapeRenderer10.getSeriesPositiveItemLabelPosition((int) 'a');
        java.awt.Shape shape20 = lineAndShapeRenderer10.lookupLegendShape(8);
        legendItem1.setLine(shape20);
        org.jfree.data.category.CategoryDataset categoryDataset22 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis24 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float25 = categoryAxis24.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis26 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer29 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color30 = java.awt.Color.BLUE;
        lineAndShapeRenderer29.setBaseItemLabelPaint((java.awt.Paint) color30);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator35 = lineAndShapeRenderer29.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot36 = new org.jfree.chart.plot.CategoryPlot(categoryDataset22, categoryAxis24, valueAxis26, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer29);
        java.lang.Object obj37 = categoryPlot36.clone();
        org.jfree.chart.util.RectangleEdge rectangleEdge39 = categoryPlot36.getDomainAxisEdge((int) ' ');
        boolean boolean40 = categoryPlot36.isRangeZeroBaselineVisible();
        org.jfree.chart.axis.CategoryAxis categoryAxis42 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float43 = categoryAxis42.getTickMarkInsideLength();
        categoryAxis42.setTickLabelsVisible(false);
        double double46 = categoryAxis42.getLowerMargin();
        boolean boolean47 = categoryPlot36.equals((java.lang.Object) categoryAxis42);
        org.jfree.chart.entity.PlotEntity plotEntity49 = new org.jfree.chart.entity.PlotEntity(shape20, (org.jfree.chart.plot.Plot) categoryPlot36, "TextAnchor.BOTTOM_CENTER");
        java.lang.String str50 = plotEntity49.getShapeType();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryPlot36 and obj37", categoryPlot36.equals(obj37) ? categoryPlot36.hashCode() == obj37.hashCode() : true);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test019");
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
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo29 = null;
        java.awt.geom.Point2D point2D30 = null;
        categoryPlot21.zoomDomainAxes(1.0d, (double) (-1L), plotRenderingInfo29, point2D30);
        categoryPlot21.setDomainCrosshairVisible(false);
        org.jfree.chart.axis.ValueAxis valueAxis35 = null;
        categoryPlot21.setRangeAxis(100, valueAxis35);
        org.jfree.data.category.DefaultCategoryDataset defaultCategoryDataset37 = new org.jfree.data.category.DefaultCategoryDataset();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer38 = categoryPlot21.getRendererForDataset((org.jfree.data.category.CategoryDataset) defaultCategoryDataset37);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer41 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color42 = java.awt.Color.BLUE;
        lineAndShapeRenderer41.setBaseItemLabelPaint((java.awt.Paint) color42);
        java.awt.Stroke stroke45 = lineAndShapeRenderer41.getSeriesOutlineStroke((int) (short) 1);
        org.jfree.data.category.CategoryDataset categoryDataset46 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis48 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float49 = categoryAxis48.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis50 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer53 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color54 = java.awt.Color.BLUE;
        lineAndShapeRenderer53.setBaseItemLabelPaint((java.awt.Paint) color54);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator59 = lineAndShapeRenderer53.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot60 = new org.jfree.chart.plot.CategoryPlot(categoryDataset46, categoryAxis48, valueAxis50, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer53);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer61 = categoryPlot60.getRenderer();
        org.jfree.chart.axis.ValueAxis valueAxis63 = lineAndShapeRenderer41.getRangeAxis(categoryPlot60, (int) '4');
        boolean boolean64 = categoryPlot60.isRangeCrosshairVisible();
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder65 = categoryPlot60.getDatasetRenderingOrder();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo68 = null;
        java.awt.geom.Point2D point2D69 = null;
        categoryPlot60.zoomDomainAxes(1.0d, (double) (-1L), plotRenderingInfo68, point2D69);
        categoryPlot60.setDomainCrosshairVisible(false);
        org.jfree.chart.axis.ValueAxis valueAxis74 = null;
        categoryPlot60.setRangeAxis(100, valueAxis74);
        org.jfree.data.category.DefaultCategoryDataset defaultCategoryDataset76 = new org.jfree.data.category.DefaultCategoryDataset();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer77 = categoryPlot60.getRendererForDataset((org.jfree.data.category.CategoryDataset) defaultCategoryDataset76);
        defaultCategoryDataset37.setSelectionState((org.jfree.data.category.CategoryDatasetSelectionState) defaultCategoryDataset76);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryPlot21 and categoryPlot60", categoryPlot21.equals(categoryPlot60) ? categoryPlot21.hashCode() == categoryPlot60.hashCode() : true);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test020");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float3 = categoryAxis2.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis4 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer7 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color8 = java.awt.Color.BLUE;
        lineAndShapeRenderer7.setBaseItemLabelPaint((java.awt.Paint) color8);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator13 = lineAndShapeRenderer7.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot14 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis2, valueAxis4, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer7);
        org.jfree.chart.axis.AxisLocation axisLocation15 = org.jfree.chart.axis.AxisLocation.TOP_OR_LEFT;
        categoryPlot14.setRangeAxisLocation(axisLocation15);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer19 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color20 = java.awt.Color.BLUE;
        lineAndShapeRenderer19.setBaseItemLabelPaint((java.awt.Paint) color20);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator25 = lineAndShapeRenderer19.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator26 = null;
        lineAndShapeRenderer19.setLegendItemURLGenerator(categorySeriesLabelGenerator26);
        java.awt.Paint paint29 = lineAndShapeRenderer19.getSeriesPaint(1);
        java.awt.Paint paint33 = lineAndShapeRenderer19.getItemFillPaint((-1), (int) (short) 100, false);
        java.awt.Shape shape35 = lineAndShapeRenderer19.lookupLegendShape(4);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer38 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator39 = null;
        lineAndShapeRenderer38.setBaseURLGenerator(categoryURLGenerator39);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator42 = null;
        lineAndShapeRenderer38.setSeriesToolTipGenerator(10, categoryToolTipGenerator42);
        boolean boolean44 = lineAndShapeRenderer38.getBaseSeriesVisibleInLegend();
        java.awt.Stroke stroke46 = null;
        lineAndShapeRenderer38.setSeriesStroke((int) 'a', stroke46, true);
        org.jfree.chart.labels.ItemLabelAnchor itemLabelAnchor50 = org.jfree.chart.labels.ItemLabelAnchor.INSIDE3;
        java.awt.Color color51 = java.awt.Color.yellow;
        boolean boolean52 = itemLabelAnchor50.equals((java.lang.Object) color51);
        lineAndShapeRenderer38.setSeriesFillPaint((int) ' ', (java.awt.Paint) color51);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer56 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color57 = java.awt.Color.BLUE;
        lineAndShapeRenderer56.setBaseItemLabelPaint((java.awt.Paint) color57);
        java.awt.Stroke stroke60 = lineAndShapeRenderer56.getSeriesOutlineStroke((int) (short) 1);
        org.jfree.data.category.CategoryDataset categoryDataset61 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis63 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float64 = categoryAxis63.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis65 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer68 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color69 = java.awt.Color.BLUE;
        lineAndShapeRenderer68.setBaseItemLabelPaint((java.awt.Paint) color69);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator74 = lineAndShapeRenderer68.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot75 = new org.jfree.chart.plot.CategoryPlot(categoryDataset61, categoryAxis63, valueAxis65, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer68);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer76 = categoryPlot75.getRenderer();
        org.jfree.chart.axis.ValueAxis valueAxis78 = lineAndShapeRenderer56.getRangeAxis(categoryPlot75, (int) '4');
        boolean boolean79 = categoryPlot75.isRangeCrosshairVisible();
        lineAndShapeRenderer38.addChangeListener((org.jfree.chart.event.RendererChangeListener) categoryPlot75);
        org.jfree.chart.entity.PlotEntity plotEntity81 = new org.jfree.chart.entity.PlotEntity(shape35, (org.jfree.chart.plot.Plot) categoryPlot75);
        org.jfree.chart.plot.Plot plot82 = plotEntity81.getPlot();
        categoryPlot14.setParent(plot82);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent84 = null;
        plot82.markerChanged(markerChangeEvent84);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryPlot14 and plot82", categoryPlot14.equals(plot82) ? categoryPlot14.hashCode() == plot82.hashCode() : true);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test021");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator3 = null;
        lineAndShapeRenderer2.setBaseURLGenerator(categoryURLGenerator3);
        java.awt.Shape shape6 = lineAndShapeRenderer2.getLegendShape(0);
        lineAndShapeRenderer2.setAutoPopulateSeriesStroke(false);
        java.awt.Font font10 = lineAndShapeRenderer2.getSeriesItemLabelFont(0);
        lineAndShapeRenderer2.setUseSeriesOffset(true);
        java.awt.Shape shape14 = null;
        lineAndShapeRenderer2.setSeriesShape((int) (short) 10, shape14, true);
        org.jfree.data.category.CategoryDataset categoryDataset17 = null;
        org.jfree.data.Range range18 = lineAndShapeRenderer2.findRangeBounds(categoryDataset17);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator19 = null;
        lineAndShapeRenderer2.setBaseToolTipGenerator(categoryToolTipGenerator19);
        java.awt.Paint paint22 = lineAndShapeRenderer2.lookupSeriesOutlinePaint(0);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition26 = lineAndShapeRenderer2.getPositiveItemLabelPosition((int) (byte) 0, 11, true);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer29 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        boolean boolean31 = lineAndShapeRenderer29.isSeriesVisibleInLegend(1);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator33 = null;
        lineAndShapeRenderer29.setSeriesURLGenerator(0, categoryURLGenerator33, false);
        java.awt.Color color36 = org.jfree.chart.ChartColor.LIGHT_GREEN;
        java.awt.color.ColorSpace colorSpace37 = color36.getColorSpace();
        lineAndShapeRenderer29.setBaseFillPaint((java.awt.Paint) color36);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer41 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator42 = null;
        lineAndShapeRenderer41.setBaseURLGenerator(categoryURLGenerator42);
        java.awt.Shape shape45 = lineAndShapeRenderer41.getLegendShape(0);
        lineAndShapeRenderer41.setAutoPopulateSeriesStroke(false);
        java.awt.Font font49 = lineAndShapeRenderer41.getSeriesItemLabelFont(0);
        lineAndShapeRenderer41.setUseSeriesOffset(true);
        java.awt.Shape shape53 = null;
        lineAndShapeRenderer41.setSeriesShape((int) (short) 10, shape53, true);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition56 = lineAndShapeRenderer41.getBasePositiveItemLabelPosition();
        lineAndShapeRenderer29.setBasePositiveItemLabelPosition(itemLabelPosition56);
        java.awt.Stroke stroke58 = lineAndShapeRenderer29.getBaseOutlineStroke();
        lineAndShapeRenderer2.setBaseOutlineStroke(stroke58, true);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on itemLabelPosition26 and itemLabelPosition56", itemLabelPosition26.equals(itemLabelPosition56) ? itemLabelPosition26.hashCode() == itemLabelPosition56.hashCode() : true);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test022");
        org.jfree.data.category.AbstractCategoryDataset abstractCategoryDataset0 = new org.jfree.data.category.AbstractCategoryDataset();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer3 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color4 = java.awt.Color.BLUE;
        lineAndShapeRenderer3.setBaseItemLabelPaint((java.awt.Paint) color4);
        java.awt.Stroke stroke7 = lineAndShapeRenderer3.getSeriesOutlineStroke((int) (short) 1);
        org.jfree.data.category.CategoryDataset categoryDataset8 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis10 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float11 = categoryAxis10.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis12 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer15 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color16 = java.awt.Color.BLUE;
        lineAndShapeRenderer15.setBaseItemLabelPaint((java.awt.Paint) color16);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator21 = lineAndShapeRenderer15.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot22 = new org.jfree.chart.plot.CategoryPlot(categoryDataset8, categoryAxis10, valueAxis12, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer15);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer23 = categoryPlot22.getRenderer();
        org.jfree.chart.axis.ValueAxis valueAxis25 = lineAndShapeRenderer3.getRangeAxis(categoryPlot22, (int) '4');
        boolean boolean26 = categoryPlot22.isRangeCrosshairVisible();
        java.awt.Paint paint27 = categoryPlot22.getRangeZeroBaselinePaint();
        abstractCategoryDataset0.addChangeListener((org.jfree.data.event.DatasetChangeListener) categoryPlot22);
        org.jfree.data.category.AbstractCategoryDataset abstractCategoryDataset29 = new org.jfree.data.category.AbstractCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup30 = abstractCategoryDataset29.getGroup();
        abstractCategoryDataset0.setGroup(datasetGroup30);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer34 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color35 = java.awt.Color.BLUE;
        lineAndShapeRenderer34.setBaseItemLabelPaint((java.awt.Paint) color35);
        java.awt.Stroke stroke38 = lineAndShapeRenderer34.getSeriesOutlineStroke((int) (short) 1);
        org.jfree.data.category.CategoryDataset categoryDataset39 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis41 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float42 = categoryAxis41.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis43 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer46 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color47 = java.awt.Color.BLUE;
        lineAndShapeRenderer46.setBaseItemLabelPaint((java.awt.Paint) color47);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator52 = lineAndShapeRenderer46.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot53 = new org.jfree.chart.plot.CategoryPlot(categoryDataset39, categoryAxis41, valueAxis43, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer46);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer54 = categoryPlot53.getRenderer();
        org.jfree.chart.axis.ValueAxis valueAxis56 = lineAndShapeRenderer34.getRangeAxis(categoryPlot53, (int) '4');
        double double57 = categoryPlot53.getRangeCrosshairValue();
        java.awt.Paint paint58 = categoryPlot53.getRangeZeroBaselinePaint();
        org.jfree.data.category.CategoryDataset categoryDataset59 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis61 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float62 = categoryAxis61.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis63 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer66 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color67 = java.awt.Color.BLUE;
        lineAndShapeRenderer66.setBaseItemLabelPaint((java.awt.Paint) color67);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator72 = lineAndShapeRenderer66.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot73 = new org.jfree.chart.plot.CategoryPlot(categoryDataset59, categoryAxis61, valueAxis63, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer66);
        boolean boolean74 = categoryPlot73.canSelectByPoint();
        org.jfree.chart.axis.AxisLocation axisLocation76 = categoryPlot73.getDomainAxisLocation((int) (byte) 0);
        categoryPlot53.setDomainAxisLocation(axisLocation76);
        abstractCategoryDataset0.addChangeListener((org.jfree.data.event.DatasetChangeListener) categoryPlot53);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryPlot22 and categoryPlot73", categoryPlot22.equals(categoryPlot73) ? categoryPlot22.hashCode() == categoryPlot73.hashCode() : true);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test023");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color3 = java.awt.Color.BLUE;
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color3);
        java.awt.Shape shape5 = lineAndShapeRenderer2.getBaseShape();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer8 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator9 = null;
        lineAndShapeRenderer8.setBaseURLGenerator(categoryURLGenerator9);
        java.awt.Shape shape12 = lineAndShapeRenderer8.getLegendShape(0);
        lineAndShapeRenderer8.setAutoPopulateSeriesStroke(false);
        java.awt.Font font16 = lineAndShapeRenderer8.getSeriesItemLabelFont(0);
        lineAndShapeRenderer8.setUseSeriesOffset(true);
        java.awt.Font font20 = null;
        lineAndShapeRenderer8.setSeriesItemLabelFont((int) (short) 1, font20, false);
        java.awt.Stroke stroke26 = lineAndShapeRenderer8.getItemOutlineStroke(0, 1, false);
        lineAndShapeRenderer2.setBaseStroke(stroke26, true);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition29 = lineAndShapeRenderer2.getBasePositiveItemLabelPosition();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator31 = null;
        lineAndShapeRenderer2.setSeriesItemLabelGenerator(11, categoryItemLabelGenerator31);
        double double33 = lineAndShapeRenderer2.getItemLabelAnchorOffset();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer36 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator37 = null;
        lineAndShapeRenderer36.setBaseURLGenerator(categoryURLGenerator37);
        java.awt.Shape shape40 = lineAndShapeRenderer36.getLegendShape(0);
        lineAndShapeRenderer36.setAutoPopulateSeriesStroke(false);
        java.awt.Font font44 = lineAndShapeRenderer36.getSeriesItemLabelFont(0);
        java.awt.Paint paint46 = lineAndShapeRenderer36.lookupLegendTextPaint(4);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition47 = lineAndShapeRenderer36.getBasePositiveItemLabelPosition();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer51 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color52 = java.awt.Color.BLUE;
        lineAndShapeRenderer51.setBaseItemLabelPaint((java.awt.Paint) color52);
        java.awt.Shape shape54 = lineAndShapeRenderer51.getBaseShape();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer57 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator58 = null;
        lineAndShapeRenderer57.setBaseURLGenerator(categoryURLGenerator58);
        java.awt.Shape shape61 = lineAndShapeRenderer57.getLegendShape(0);
        lineAndShapeRenderer57.setAutoPopulateSeriesStroke(false);
        java.awt.Font font65 = lineAndShapeRenderer57.getSeriesItemLabelFont(0);
        lineAndShapeRenderer57.setUseSeriesOffset(true);
        java.awt.Font font69 = null;
        lineAndShapeRenderer57.setSeriesItemLabelFont((int) (short) 1, font69, false);
        java.awt.Stroke stroke75 = lineAndShapeRenderer57.getItemOutlineStroke(0, 1, false);
        lineAndShapeRenderer51.setBaseStroke(stroke75, true);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition78 = lineAndShapeRenderer51.getBasePositiveItemLabelPosition();
        lineAndShapeRenderer36.setSeriesPositiveItemLabelPosition(1, itemLabelPosition78, true);
        lineAndShapeRenderer2.setBaseNegativeItemLabelPosition(itemLabelPosition78, false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on itemLabelPosition29 and itemLabelPosition47", itemLabelPosition29.equals(itemLabelPosition47) ? itemLabelPosition29.hashCode() == itemLabelPosition47.hashCode() : true);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test024");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator3 = null;
        lineAndShapeRenderer2.setBaseURLGenerator(categoryURLGenerator3);
        java.awt.Shape shape6 = lineAndShapeRenderer2.getLegendShape(0);
        lineAndShapeRenderer2.setAutoPopulateSeriesStroke(false);
        java.awt.Font font10 = lineAndShapeRenderer2.getSeriesItemLabelFont(0);
        java.awt.Paint paint12 = lineAndShapeRenderer2.lookupLegendTextPaint(4);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition13 = lineAndShapeRenderer2.getBasePositiveItemLabelPosition();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer16 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator17 = null;
        lineAndShapeRenderer16.setBaseURLGenerator(categoryURLGenerator17);
        java.awt.Shape shape20 = lineAndShapeRenderer16.getLegendShape(0);
        lineAndShapeRenderer16.setAutoPopulateSeriesStroke(false);
        java.awt.Font font24 = lineAndShapeRenderer16.getSeriesItemLabelFont(0);
        lineAndShapeRenderer16.setUseSeriesOffset(true);
        java.awt.Font font28 = null;
        lineAndShapeRenderer16.setSeriesItemLabelFont((int) (short) 1, font28, false);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition32 = lineAndShapeRenderer16.getSeriesPositiveItemLabelPosition((int) (byte) 100);
        org.jfree.chart.labels.ItemLabelAnchor itemLabelAnchor33 = itemLabelPosition32.getItemLabelAnchor();
        lineAndShapeRenderer2.setBasePositiveItemLabelPosition(itemLabelPosition32, true);
        java.awt.Paint paint37 = lineAndShapeRenderer2.lookupSeriesOutlinePaint(0);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on itemLabelPosition13 and itemLabelPosition32", itemLabelPosition13.equals(itemLabelPosition32) ? itemLabelPosition13.hashCode() == itemLabelPosition32.hashCode() : true);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test025");
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
        categoryPlot21.clearSelection();
        boolean boolean33 = categoryPlot21.canSelectByPoint();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer36 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color37 = java.awt.Color.BLUE;
        lineAndShapeRenderer36.setBaseItemLabelPaint((java.awt.Paint) color37);
        java.awt.Stroke stroke40 = lineAndShapeRenderer36.getSeriesOutlineStroke((int) (short) 1);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator42 = null;
        lineAndShapeRenderer36.setSeriesItemLabelGenerator((int) (short) 100, categoryItemLabelGenerator42);
        lineAndShapeRenderer36.setDrawOutlines(true);
        boolean boolean46 = lineAndShapeRenderer36.getBaseCreateEntities();
        java.awt.Paint paint50 = lineAndShapeRenderer36.getItemFillPaint((-12517568), (-1), true);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer54 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator55 = null;
        lineAndShapeRenderer54.setBaseURLGenerator(categoryURLGenerator55);
        java.awt.Shape shape58 = lineAndShapeRenderer54.getLegendShape(0);
        lineAndShapeRenderer54.setAutoPopulateSeriesStroke(false);
        java.awt.Font font62 = lineAndShapeRenderer54.getSeriesItemLabelFont(0);
        lineAndShapeRenderer54.setUseSeriesOffset(true);
        int int65 = lineAndShapeRenderer54.getColumnCount();
        lineAndShapeRenderer54.setBaseSeriesVisibleInLegend(true);
        java.awt.Stroke stroke71 = lineAndShapeRenderer54.getItemOutlineStroke((int) (byte) -1, (int) (byte) 100, false);
        lineAndShapeRenderer36.setSeriesOutlineStroke((int) (short) 100, stroke71);
        categoryPlot21.setRangeGridlineStroke(stroke71);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on lineAndShapeRenderer2 and lineAndShapeRenderer36.", lineAndShapeRenderer2.equals(lineAndShapeRenderer36) == lineAndShapeRenderer36.equals(lineAndShapeRenderer2));
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test026");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color3 = java.awt.Color.BLUE;
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color3);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator8 = lineAndShapeRenderer2.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator9 = null;
        lineAndShapeRenderer2.setLegendItemURLGenerator(categorySeriesLabelGenerator9);
        java.awt.Paint paint12 = lineAndShapeRenderer2.getSeriesPaint(1);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer16 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color17 = java.awt.Color.BLUE;
        lineAndShapeRenderer16.setBaseItemLabelPaint((java.awt.Paint) color17);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator22 = lineAndShapeRenderer16.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator23 = null;
        lineAndShapeRenderer16.setLegendItemURLGenerator(categorySeriesLabelGenerator23);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator28 = lineAndShapeRenderer16.getToolTipGenerator((int) '#', (int) (byte) 10, false);
        lineAndShapeRenderer16.setBaseSeriesVisible(true, true);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition33 = lineAndShapeRenderer16.getSeriesNegativeItemLabelPosition((int) (byte) -1);
        lineAndShapeRenderer2.setSeriesPositiveItemLabelPosition(100, itemLabelPosition33, false);
        org.jfree.chart.LegendItem legendItem38 = new org.jfree.chart.LegendItem("hi!");
        java.awt.Color color42 = java.awt.Color.getHSBColor((float) (short) 1, (float) ' ', 0.0f);
        legendItem38.setLinePaint((java.awt.Paint) color42);
        boolean boolean44 = legendItem38.isShapeOutlineVisible();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer47 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color48 = java.awt.Color.BLUE;
        lineAndShapeRenderer47.setBaseItemLabelPaint((java.awt.Paint) color48);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator53 = lineAndShapeRenderer47.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition55 = lineAndShapeRenderer47.getSeriesPositiveItemLabelPosition((int) 'a');
        java.awt.Shape shape57 = lineAndShapeRenderer47.lookupLegendShape(8);
        legendItem38.setLine(shape57);
        lineAndShapeRenderer2.setSeriesShape(0, shape57);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer62 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color63 = java.awt.Color.BLUE;
        lineAndShapeRenderer62.setBaseItemLabelPaint((java.awt.Paint) color63);
        java.awt.Stroke stroke66 = lineAndShapeRenderer62.getSeriesOutlineStroke((int) (short) 1);
        org.jfree.data.category.CategoryDataset categoryDataset67 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis69 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float70 = categoryAxis69.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis71 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer74 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color75 = java.awt.Color.BLUE;
        lineAndShapeRenderer74.setBaseItemLabelPaint((java.awt.Paint) color75);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator80 = lineAndShapeRenderer74.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot81 = new org.jfree.chart.plot.CategoryPlot(categoryDataset67, categoryAxis69, valueAxis71, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer74);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer82 = categoryPlot81.getRenderer();
        org.jfree.chart.axis.ValueAxis valueAxis84 = lineAndShapeRenderer62.getRangeAxis(categoryPlot81, (int) '4');
        boolean boolean85 = categoryPlot81.isRangeCrosshairVisible();
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder86 = categoryPlot81.getDatasetRenderingOrder();
        boolean boolean87 = categoryPlot81.canSelectByPoint();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent88 = null;
        categoryPlot81.datasetChanged(datasetChangeEvent88);
        org.jfree.chart.entity.PlotEntity plotEntity90 = new org.jfree.chart.entity.PlotEntity(shape57, (org.jfree.chart.plot.Plot) categoryPlot81);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on lineAndShapeRenderer16 and lineAndShapeRenderer2.", lineAndShapeRenderer16.equals(lineAndShapeRenderer2) == lineAndShapeRenderer2.equals(lineAndShapeRenderer16));
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test027");
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
        lineAndShapeRenderer2.setSeriesItemLabelsVisible(4, (java.lang.Boolean) false, true);
        java.awt.Stroke stroke46 = lineAndShapeRenderer2.getBaseOutlineStroke();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer50 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color51 = java.awt.Color.BLUE;
        lineAndShapeRenderer50.setBaseItemLabelPaint((java.awt.Paint) color51);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator56 = lineAndShapeRenderer50.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition58 = lineAndShapeRenderer50.getSeriesPositiveItemLabelPosition((int) 'a');
        boolean boolean59 = lineAndShapeRenderer50.getBaseItemLabelsVisible();
        org.jfree.chart.LegendItem legendItem61 = new org.jfree.chart.LegendItem("hi!");
        java.awt.Color color65 = java.awt.Color.getHSBColor((float) (short) 1, (float) ' ', 0.0f);
        legendItem61.setLinePaint((java.awt.Paint) color65);
        lineAndShapeRenderer50.setBaseItemLabelPaint((java.awt.Paint) color65);
        java.awt.Font font68 = lineAndShapeRenderer50.getBaseItemLabelFont();
        lineAndShapeRenderer2.setSeriesItemLabelFont((int) (byte) 0, font68, true);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on itemLabelPosition27 and itemLabelPosition58", itemLabelPosition27.equals(itemLabelPosition58) ? itemLabelPosition27.hashCode() == itemLabelPosition58.hashCode() : true);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test028");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator3 = null;
        lineAndShapeRenderer2.setBaseURLGenerator(categoryURLGenerator3);
        java.awt.Shape shape6 = lineAndShapeRenderer2.getLegendShape(0);
        lineAndShapeRenderer2.setAutoPopulateSeriesFillPaint(false);
        java.lang.Boolean boolean10 = lineAndShapeRenderer2.getSeriesVisible((int) (byte) 10);
        java.awt.Graphics2D graphics2D11 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation12 = null;
        java.awt.geom.Rectangle2D rectangle2D13 = null;
        java.awt.geom.Rectangle2D rectangle2D14 = null;
        org.jfree.data.category.CategoryDataset categoryDataset15 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis17 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float18 = categoryAxis17.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis19 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer22 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color23 = java.awt.Color.BLUE;
        lineAndShapeRenderer22.setBaseItemLabelPaint((java.awt.Paint) color23);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator28 = lineAndShapeRenderer22.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot29 = new org.jfree.chart.plot.CategoryPlot(categoryDataset15, categoryAxis17, valueAxis19, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer22);
        java.lang.Object obj30 = categoryPlot29.clone();
        org.jfree.chart.util.RectangleInsets rectangleInsets31 = org.jfree.chart.axis.Axis.DEFAULT_AXIS_LABEL_INSETS;
        double double33 = rectangleInsets31.extendWidth((double) 10L);
        double double35 = rectangleInsets31.extendWidth((double) (short) -1);
        double double36 = rectangleInsets31.getRight();
        categoryPlot29.setInsets(rectangleInsets31, false);
        double double40 = rectangleInsets31.extendWidth((double) (-1));
        double double41 = rectangleInsets31.getBottom();
        double double43 = rectangleInsets31.calculateRightOutset(0.0d);
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType44 = null;
        org.jfree.chart.util.RectangleAnchor rectangleAnchor45 = null;
        java.awt.geom.Point2D point2D46 = lineAndShapeRenderer2.calculateRangeMarkerTextAnchorPoint(graphics2D11, plotOrientation12, rectangle2D13, rectangle2D14, rectangleInsets31, lengthAdjustmentType44, rectangleAnchor45);
        java.awt.Paint paint48 = lineAndShapeRenderer2.getSeriesOutlinePaint((int) (byte) 10);
        java.awt.Paint paint52 = lineAndShapeRenderer2.getItemLabelPaint((-1), 4, true);
        java.awt.Graphics2D graphics2D53 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation54 = null;
        java.awt.geom.Rectangle2D rectangle2D55 = null;
        java.awt.geom.Rectangle2D rectangle2D56 = null;
        org.jfree.data.category.CategoryDataset categoryDataset57 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis59 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float60 = categoryAxis59.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis61 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer64 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color65 = java.awt.Color.BLUE;
        lineAndShapeRenderer64.setBaseItemLabelPaint((java.awt.Paint) color65);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator70 = lineAndShapeRenderer64.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot71 = new org.jfree.chart.plot.CategoryPlot(categoryDataset57, categoryAxis59, valueAxis61, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer64);
        boolean boolean72 = categoryPlot71.canSelectByPoint();
        org.jfree.chart.axis.ValueAxis valueAxis74 = categoryPlot71.getRangeAxisForDataset((int) '4');
        org.jfree.chart.util.RectangleInsets rectangleInsets75 = categoryPlot71.getInsets();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType76 = null;
        org.jfree.chart.util.RectangleAnchor rectangleAnchor77 = null;
        java.awt.geom.Point2D point2D78 = lineAndShapeRenderer2.calculateDomainMarkerTextAnchorPoint(graphics2D53, plotOrientation54, rectangle2D55, rectangle2D56, rectangleInsets75, lengthAdjustmentType76, rectangleAnchor77);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj30 and categoryPlot71", obj30.equals(categoryPlot71) ? obj30.hashCode() == categoryPlot71.hashCode() : true);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test029");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float3 = categoryAxis2.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis4 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer7 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color8 = java.awt.Color.BLUE;
        lineAndShapeRenderer7.setBaseItemLabelPaint((java.awt.Paint) color8);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator13 = lineAndShapeRenderer7.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot14 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis2, valueAxis4, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer7);
        java.lang.Object obj15 = categoryPlot14.clone();
        org.jfree.chart.util.RectangleEdge rectangleEdge17 = categoryPlot14.getDomainAxisEdge((int) ' ');
        boolean boolean18 = categoryPlot14.isRangeZeroBaselineVisible();
        org.jfree.chart.axis.CategoryAxis categoryAxis20 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float21 = categoryAxis20.getTickMarkInsideLength();
        categoryAxis20.setTickLabelsVisible(false);
        double double24 = categoryAxis20.getLowerMargin();
        boolean boolean25 = categoryPlot14.equals((java.lang.Object) categoryAxis20);
        float float26 = categoryAxis20.getTickMarkInsideLength();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryPlot14 and obj15", categoryPlot14.equals(obj15) ? categoryPlot14.hashCode() == obj15.hashCode() : true);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test030");
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
        org.jfree.data.category.CategoryDataset categoryDataset27 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis29 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float30 = categoryAxis29.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis31 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer34 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color35 = java.awt.Color.BLUE;
        lineAndShapeRenderer34.setBaseItemLabelPaint((java.awt.Paint) color35);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator40 = lineAndShapeRenderer34.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot41 = new org.jfree.chart.plot.CategoryPlot(categoryDataset27, categoryAxis29, valueAxis31, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer34);
        boolean boolean42 = categoryPlot41.canSelectByPoint();
        org.jfree.chart.axis.AxisLocation axisLocation44 = categoryPlot41.getDomainAxisLocation((int) (byte) 0);
        categoryPlot21.setDomainAxisLocation(axisLocation44);
        org.jfree.data.category.DefaultCategoryDataset defaultCategoryDataset47 = new org.jfree.data.category.DefaultCategoryDataset();
        int int49 = defaultCategoryDataset47.getColumnIndex((java.lang.Comparable) 3.0d);
        categoryPlot21.setDataset((int) 'a', (org.jfree.data.category.CategoryDataset) defaultCategoryDataset47);
        org.jfree.chart.axis.CategoryAxis categoryAxis52 = new org.jfree.chart.axis.CategoryAxis("hi!");
        categoryAxis52.setLowerMargin((double) 10L);
        org.jfree.chart.axis.ValueAxis valueAxis55 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer58 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Graphics2D graphics2D59 = null;
        org.jfree.data.category.CategoryDataset categoryDataset60 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis62 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float63 = categoryAxis62.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis64 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer67 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color68 = java.awt.Color.BLUE;
        lineAndShapeRenderer67.setBaseItemLabelPaint((java.awt.Paint) color68);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator73 = lineAndShapeRenderer67.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot74 = new org.jfree.chart.plot.CategoryPlot(categoryDataset60, categoryAxis62, valueAxis64, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer67);
        org.jfree.chart.axis.CategoryAxis categoryAxis75 = categoryPlot74.getDomainAxis();
        org.jfree.chart.axis.ValueAxis valueAxis76 = null;
        org.jfree.data.Range range77 = categoryPlot74.getDataRange(valueAxis76);
        org.jfree.chart.axis.ValueAxis valueAxis78 = null;
        org.jfree.chart.plot.Marker marker79 = null;
        java.awt.geom.Rectangle2D rectangle2D80 = null;
        lineAndShapeRenderer58.drawRangeMarker(graphics2D59, categoryPlot74, valueAxis78, marker79, rectangle2D80);
        java.awt.Color color83 = java.awt.Color.GRAY;
        lineAndShapeRenderer58.setSeriesFillPaint(100, (java.awt.Paint) color83, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot86 = new org.jfree.chart.plot.CategoryPlot((org.jfree.data.category.CategoryDataset) defaultCategoryDataset47, categoryAxis52, valueAxis55, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer58);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryPlot21 and categoryPlot41", categoryPlot21.equals(categoryPlot41) ? categoryPlot21.hashCode() == categoryPlot41.hashCode() : true);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test031");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color3 = java.awt.Color.BLUE;
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color3);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer7 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color8 = java.awt.Color.BLUE;
        lineAndShapeRenderer7.setBaseItemLabelPaint((java.awt.Paint) color8);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator13 = lineAndShapeRenderer7.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition15 = lineAndShapeRenderer7.getSeriesPositiveItemLabelPosition((int) 'a');
        boolean boolean16 = lineAndShapeRenderer7.getBaseItemLabelsVisible();
        org.jfree.chart.LegendItem legendItem18 = new org.jfree.chart.LegendItem("hi!");
        java.awt.Color color22 = java.awt.Color.getHSBColor((float) (short) 1, (float) ' ', 0.0f);
        legendItem18.setLinePaint((java.awt.Paint) color22);
        lineAndShapeRenderer7.setBaseItemLabelPaint((java.awt.Paint) color22);
        java.awt.color.ColorSpace colorSpace25 = color22.getColorSpace();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer28 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        boolean boolean30 = lineAndShapeRenderer28.isSeriesVisibleInLegend(1);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator32 = null;
        lineAndShapeRenderer28.setSeriesURLGenerator(0, categoryURLGenerator32, false);
        java.awt.Color color35 = org.jfree.chart.ChartColor.LIGHT_GREEN;
        java.awt.color.ColorSpace colorSpace36 = color35.getColorSpace();
        lineAndShapeRenderer28.setBaseFillPaint((java.awt.Paint) color35);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer40 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator41 = null;
        lineAndShapeRenderer40.setBaseURLGenerator(categoryURLGenerator41);
        java.awt.Shape shape44 = lineAndShapeRenderer40.getLegendShape(0);
        lineAndShapeRenderer40.setAutoPopulateSeriesStroke(false);
        java.awt.Font font48 = lineAndShapeRenderer40.getSeriesItemLabelFont(0);
        lineAndShapeRenderer40.setUseSeriesOffset(true);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator51 = null;
        lineAndShapeRenderer40.setBaseToolTipGenerator(categoryToolTipGenerator51);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer56 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color57 = java.awt.Color.BLUE;
        lineAndShapeRenderer56.setBaseItemLabelPaint((java.awt.Paint) color57);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator62 = lineAndShapeRenderer56.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator63 = null;
        lineAndShapeRenderer56.setLegendItemURLGenerator(categorySeriesLabelGenerator63);
        java.awt.Paint paint66 = lineAndShapeRenderer56.getSeriesPaint(1);
        org.jfree.chart.renderer.RenderAttributes renderAttributes67 = lineAndShapeRenderer56.getSelectedItemAttributes();
        java.awt.Paint paint68 = renderAttributes67.getDefaultLabelPaint();
        java.awt.Shape shape70 = renderAttributes67.getSeriesShape((-1));
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer73 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator74 = null;
        lineAndShapeRenderer73.setBaseURLGenerator(categoryURLGenerator74);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator77 = null;
        lineAndShapeRenderer73.setSeriesToolTipGenerator(10, categoryToolTipGenerator77);
        boolean boolean79 = lineAndShapeRenderer73.getBaseSeriesVisibleInLegend();
        java.awt.Stroke stroke81 = null;
        lineAndShapeRenderer73.setSeriesStroke((int) 'a', stroke81, true);
        org.jfree.chart.labels.ItemLabelAnchor itemLabelAnchor85 = org.jfree.chart.labels.ItemLabelAnchor.INSIDE3;
        java.awt.Color color86 = java.awt.Color.yellow;
        boolean boolean87 = itemLabelAnchor85.equals((java.lang.Object) color86);
        lineAndShapeRenderer73.setSeriesFillPaint((int) ' ', (java.awt.Paint) color86);
        renderAttributes67.setDefaultOutlinePaint((java.awt.Paint) color86);
        lineAndShapeRenderer40.setSeriesFillPaint(2, (java.awt.Paint) color86);
        float[] floatArray94 = new float[] { 10.0f, 1, (byte) 0 };
        float[] floatArray95 = color86.getRGBColorComponents(floatArray94);
        float[] floatArray96 = color35.getColorComponents(floatArray95);
        float[] floatArray97 = color3.getColorComponents(colorSpace25, floatArray96);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on lineAndShapeRenderer7 and lineAndShapeRenderer73.", lineAndShapeRenderer7.equals(lineAndShapeRenderer73) == lineAndShapeRenderer73.equals(lineAndShapeRenderer7));
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test032");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float3 = categoryAxis2.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis4 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer7 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color8 = java.awt.Color.BLUE;
        lineAndShapeRenderer7.setBaseItemLabelPaint((java.awt.Paint) color8);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator13 = lineAndShapeRenderer7.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot14 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis2, valueAxis4, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer7);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer18 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator19 = null;
        lineAndShapeRenderer18.setBaseURLGenerator(categoryURLGenerator19);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator22 = null;
        lineAndShapeRenderer18.setSeriesToolTipGenerator(10, categoryToolTipGenerator22);
        boolean boolean24 = lineAndShapeRenderer18.getBaseSeriesVisibleInLegend();
        java.awt.Stroke stroke26 = null;
        lineAndShapeRenderer18.setSeriesStroke((int) 'a', stroke26, true);
        org.jfree.chart.labels.ItemLabelAnchor itemLabelAnchor30 = org.jfree.chart.labels.ItemLabelAnchor.INSIDE3;
        java.awt.Color color31 = java.awt.Color.yellow;
        boolean boolean32 = itemLabelAnchor30.equals((java.lang.Object) color31);
        lineAndShapeRenderer18.setSeriesFillPaint((int) ' ', (java.awt.Paint) color31);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer36 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color37 = java.awt.Color.BLUE;
        lineAndShapeRenderer36.setBaseItemLabelPaint((java.awt.Paint) color37);
        java.awt.Stroke stroke40 = lineAndShapeRenderer36.getSeriesOutlineStroke((int) (short) 1);
        org.jfree.data.category.CategoryDataset categoryDataset41 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis43 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float44 = categoryAxis43.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis45 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer48 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color49 = java.awt.Color.BLUE;
        lineAndShapeRenderer48.setBaseItemLabelPaint((java.awt.Paint) color49);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator54 = lineAndShapeRenderer48.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot55 = new org.jfree.chart.plot.CategoryPlot(categoryDataset41, categoryAxis43, valueAxis45, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer48);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer56 = categoryPlot55.getRenderer();
        org.jfree.chart.axis.ValueAxis valueAxis58 = lineAndShapeRenderer36.getRangeAxis(categoryPlot55, (int) '4');
        boolean boolean59 = categoryPlot55.isRangeCrosshairVisible();
        lineAndShapeRenderer18.addChangeListener((org.jfree.chart.event.RendererChangeListener) categoryPlot55);
        lineAndShapeRenderer18.setDefaultEntityRadius((int) '#');
        lineAndShapeRenderer18.setSeriesCreateEntities(3, (java.lang.Boolean) false, true);
        java.awt.Font font68 = null;
        lineAndShapeRenderer18.setSeriesItemLabelFont(11, font68);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition71 = lineAndShapeRenderer18.getSeriesNegativeItemLabelPosition(0);
        lineAndShapeRenderer7.setSeriesNegativeItemLabelPosition(0, itemLabelPosition71, true);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on categoryPlot55 and categoryPlot14.", categoryPlot55.equals(categoryPlot14) == categoryPlot14.equals(categoryPlot55));
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test033");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator3 = null;
        lineAndShapeRenderer2.setBaseURLGenerator(categoryURLGenerator3);
        java.awt.Shape shape6 = lineAndShapeRenderer2.getLegendShape(0);
        lineAndShapeRenderer2.setAutoPopulateSeriesStroke(false);
        java.awt.Font font10 = lineAndShapeRenderer2.getSeriesItemLabelFont(0);
        lineAndShapeRenderer2.setUseSeriesOffset(true);
        java.awt.Font font14 = null;
        lineAndShapeRenderer2.setSeriesItemLabelFont((int) (short) 1, font14, false);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition18 = lineAndShapeRenderer2.getSeriesPositiveItemLabelPosition((int) (byte) 100);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer22 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color23 = java.awt.Color.BLUE;
        lineAndShapeRenderer22.setBaseItemLabelPaint((java.awt.Paint) color23);
        java.awt.Stroke stroke26 = lineAndShapeRenderer22.getSeriesOutlineStroke((int) (short) 1);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator28 = null;
        lineAndShapeRenderer22.setSeriesItemLabelGenerator((int) (short) 100, categoryItemLabelGenerator28);
        lineAndShapeRenderer22.setDrawOutlines(true);
        java.awt.Shape shape32 = lineAndShapeRenderer22.getBaseShape();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition34 = lineAndShapeRenderer22.getSeriesPositiveItemLabelPosition((int) '#');
        lineAndShapeRenderer2.setSeriesNegativeItemLabelPosition((int) (short) 10, itemLabelPosition34, false);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer40 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color41 = java.awt.Color.BLUE;
        lineAndShapeRenderer40.setBaseItemLabelPaint((java.awt.Paint) color41);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator46 = lineAndShapeRenderer40.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator47 = null;
        lineAndShapeRenderer40.setLegendItemURLGenerator(categorySeriesLabelGenerator47);
        java.awt.Paint paint50 = lineAndShapeRenderer40.getSeriesPaint(1);
        org.jfree.chart.renderer.RenderAttributes renderAttributes51 = lineAndShapeRenderer40.getSelectedItemAttributes();
        java.awt.Paint paint52 = renderAttributes51.getDefaultLabelPaint();
        java.awt.Color color53 = org.jfree.chart.ChartColor.LIGHT_GREEN;
        renderAttributes51.setDefaultOutlinePaint((java.awt.Paint) color53);
        java.awt.Paint paint57 = renderAttributes51.getItemOutlinePaint(0, (-12517568));
        lineAndShapeRenderer2.setLegendTextPaint((int) 'a', paint57);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on itemLabelPosition18 and itemLabelPosition34", itemLabelPosition18.equals(itemLabelPosition34) ? itemLabelPosition18.hashCode() == itemLabelPosition34.hashCode() : true);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test034");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator3 = null;
        lineAndShapeRenderer2.setBaseURLGenerator(categoryURLGenerator3);
        java.awt.Shape shape6 = lineAndShapeRenderer2.getLegendShape(0);
        lineAndShapeRenderer2.setAutoPopulateSeriesStroke(false);
        java.awt.Font font10 = lineAndShapeRenderer2.getSeriesItemLabelFont(0);
        java.awt.Paint paint12 = lineAndShapeRenderer2.lookupLegendTextPaint(4);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition13 = lineAndShapeRenderer2.getBasePositiveItemLabelPosition();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer17 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color18 = java.awt.Color.BLUE;
        lineAndShapeRenderer17.setBaseItemLabelPaint((java.awt.Paint) color18);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator23 = lineAndShapeRenderer17.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator24 = null;
        lineAndShapeRenderer17.setLegendItemURLGenerator(categorySeriesLabelGenerator24);
        java.awt.Paint paint27 = lineAndShapeRenderer17.getSeriesPaint(1);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer31 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color32 = java.awt.Color.BLUE;
        lineAndShapeRenderer31.setBaseItemLabelPaint((java.awt.Paint) color32);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator37 = lineAndShapeRenderer31.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator38 = null;
        lineAndShapeRenderer31.setLegendItemURLGenerator(categorySeriesLabelGenerator38);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator43 = lineAndShapeRenderer31.getToolTipGenerator((int) '#', (int) (byte) 10, false);
        lineAndShapeRenderer31.setBaseSeriesVisible(true, true);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition48 = lineAndShapeRenderer31.getSeriesNegativeItemLabelPosition((int) (byte) -1);
        lineAndShapeRenderer17.setSeriesPositiveItemLabelPosition(100, itemLabelPosition48, false);
        org.jfree.chart.LegendItem legendItem53 = new org.jfree.chart.LegendItem("hi!");
        java.awt.Color color57 = java.awt.Color.getHSBColor((float) (short) 1, (float) ' ', 0.0f);
        legendItem53.setLinePaint((java.awt.Paint) color57);
        boolean boolean59 = legendItem53.isShapeOutlineVisible();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer62 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color63 = java.awt.Color.BLUE;
        lineAndShapeRenderer62.setBaseItemLabelPaint((java.awt.Paint) color63);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator68 = lineAndShapeRenderer62.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition70 = lineAndShapeRenderer62.getSeriesPositiveItemLabelPosition((int) 'a');
        java.awt.Shape shape72 = lineAndShapeRenderer62.lookupLegendShape(8);
        legendItem53.setLine(shape72);
        lineAndShapeRenderer17.setSeriesShape(0, shape72);
        org.jfree.data.category.CategoryDataset categoryDataset76 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis78 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float79 = categoryAxis78.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis80 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer83 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color84 = java.awt.Color.BLUE;
        lineAndShapeRenderer83.setBaseItemLabelPaint((java.awt.Paint) color84);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator89 = lineAndShapeRenderer83.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot90 = new org.jfree.chart.plot.CategoryPlot(categoryDataset76, categoryAxis78, valueAxis80, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer83);
        boolean boolean91 = categoryPlot90.canSelectByPoint();
        org.jfree.chart.LegendItemCollection legendItemCollection92 = categoryPlot90.getFixedLegendItems();
        java.awt.Stroke stroke93 = categoryPlot90.getRangeGridlineStroke();
        lineAndShapeRenderer17.setSeriesOutlineStroke((int) (short) 1, stroke93);
        lineAndShapeRenderer2.setSeriesStroke(255, stroke93, false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on itemLabelPosition13 and itemLabelPosition70", itemLabelPosition13.equals(itemLabelPosition70) ? itemLabelPosition13.hashCode() == itemLabelPosition70.hashCode() : true);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test035");
        org.jfree.data.category.AbstractCategoryDataset abstractCategoryDataset0 = new org.jfree.data.category.AbstractCategoryDataset();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer3 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color4 = java.awt.Color.BLUE;
        lineAndShapeRenderer3.setBaseItemLabelPaint((java.awt.Paint) color4);
        java.awt.Stroke stroke7 = lineAndShapeRenderer3.getSeriesOutlineStroke((int) (short) 1);
        org.jfree.data.category.CategoryDataset categoryDataset8 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis10 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float11 = categoryAxis10.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis12 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer15 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color16 = java.awt.Color.BLUE;
        lineAndShapeRenderer15.setBaseItemLabelPaint((java.awt.Paint) color16);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator21 = lineAndShapeRenderer15.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot22 = new org.jfree.chart.plot.CategoryPlot(categoryDataset8, categoryAxis10, valueAxis12, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer15);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer23 = categoryPlot22.getRenderer();
        org.jfree.chart.axis.ValueAxis valueAxis25 = lineAndShapeRenderer3.getRangeAxis(categoryPlot22, (int) '4');
        boolean boolean26 = categoryPlot22.isRangeCrosshairVisible();
        java.awt.Paint paint27 = categoryPlot22.getRangeZeroBaselinePaint();
        abstractCategoryDataset0.addChangeListener((org.jfree.data.event.DatasetChangeListener) categoryPlot22);
        org.jfree.data.category.AbstractCategoryDataset abstractCategoryDataset29 = new org.jfree.data.category.AbstractCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup30 = abstractCategoryDataset29.getGroup();
        abstractCategoryDataset0.setGroup(datasetGroup30);
        org.jfree.data.category.CategoryDataset categoryDataset32 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis34 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float35 = categoryAxis34.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis36 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer39 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color40 = java.awt.Color.BLUE;
        lineAndShapeRenderer39.setBaseItemLabelPaint((java.awt.Paint) color40);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator45 = lineAndShapeRenderer39.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot46 = new org.jfree.chart.plot.CategoryPlot(categoryDataset32, categoryAxis34, valueAxis36, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer39);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent47 = new org.jfree.chart.event.PlotChangeEvent((org.jfree.chart.plot.Plot) categoryPlot46);
        org.jfree.chart.plot.Plot plot48 = plotChangeEvent47.getPlot();
        abstractCategoryDataset0.addChangeListener((org.jfree.data.event.DatasetChangeListener) plot48);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryPlot22 and plot48", categoryPlot22.equals(plot48) ? categoryPlot22.hashCode() == plot48.hashCode() : true);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test036");
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
        org.jfree.data.category.CategoryDataset categoryDataset27 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis29 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float30 = categoryAxis29.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis31 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer34 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color35 = java.awt.Color.BLUE;
        lineAndShapeRenderer34.setBaseItemLabelPaint((java.awt.Paint) color35);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator40 = lineAndShapeRenderer34.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot41 = new org.jfree.chart.plot.CategoryPlot(categoryDataset27, categoryAxis29, valueAxis31, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer34);
        org.jfree.chart.axis.AxisLocation axisLocation42 = org.jfree.chart.axis.AxisLocation.TOP_OR_LEFT;
        categoryPlot41.setRangeAxisLocation(axisLocation42);
        categoryPlot21.setRangeAxisLocation(axisLocation42, true);
        java.awt.Color color46 = org.jfree.chart.ChartColor.LIGHT_GREEN;
        categoryPlot21.setRangeMinorGridlinePaint((java.awt.Paint) color46);
        categoryPlot21.setRangeMinorGridlinesVisible(true);
        java.awt.Paint paint50 = categoryPlot21.getBackgroundPaint();
        org.jfree.data.category.CategoryDataset categoryDataset52 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis54 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float55 = categoryAxis54.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis56 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer59 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color60 = java.awt.Color.BLUE;
        lineAndShapeRenderer59.setBaseItemLabelPaint((java.awt.Paint) color60);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator65 = lineAndShapeRenderer59.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot66 = new org.jfree.chart.plot.CategoryPlot(categoryDataset52, categoryAxis54, valueAxis56, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer59);
        float float67 = categoryAxis54.getTickMarkOutsideLength();
        categoryPlot21.setDomainAxis((int) (short) 1, categoryAxis54, true);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryPlot41 and categoryPlot66", categoryPlot41.equals(categoryPlot66) ? categoryPlot41.hashCode() == categoryPlot66.hashCode() : true);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test037");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float3 = categoryAxis2.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis4 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer7 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color8 = java.awt.Color.BLUE;
        lineAndShapeRenderer7.setBaseItemLabelPaint((java.awt.Paint) color8);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator13 = lineAndShapeRenderer7.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot14 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis2, valueAxis4, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer7);
        java.lang.Object obj15 = categoryPlot14.clone();
        org.jfree.chart.util.RectangleEdge rectangleEdge17 = categoryPlot14.getDomainAxisEdge((int) ' ');
        boolean boolean18 = categoryPlot14.isRangeZeroBaselineVisible();
        org.jfree.chart.axis.CategoryAxis categoryAxis20 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float21 = categoryAxis20.getTickMarkInsideLength();
        categoryAxis20.setTickLabelsVisible(false);
        double double24 = categoryAxis20.getLowerMargin();
        boolean boolean25 = categoryPlot14.equals((java.lang.Object) categoryAxis20);
        boolean boolean26 = categoryAxis20.isTickLabelsVisible();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryPlot14 and obj15", categoryPlot14.equals(obj15) ? categoryPlot14.hashCode() == obj15.hashCode() : true);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test038");
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
        org.jfree.data.category.CategoryDataset categoryDataset27 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis29 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float30 = categoryAxis29.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis31 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer34 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color35 = java.awt.Color.BLUE;
        lineAndShapeRenderer34.setBaseItemLabelPaint((java.awt.Paint) color35);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator40 = lineAndShapeRenderer34.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot41 = new org.jfree.chart.plot.CategoryPlot(categoryDataset27, categoryAxis29, valueAxis31, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer34);
        org.jfree.chart.axis.AxisLocation axisLocation42 = org.jfree.chart.axis.AxisLocation.TOP_OR_LEFT;
        categoryPlot41.setRangeAxisLocation(axisLocation42);
        categoryPlot21.setRangeAxisLocation(axisLocation42, true);
        java.awt.Color color46 = org.jfree.chart.ChartColor.LIGHT_GREEN;
        categoryPlot21.setRangeMinorGridlinePaint((java.awt.Paint) color46);
        categoryPlot21.setRangeMinorGridlinesVisible(true);
        org.jfree.chart.util.Layer layer50 = null;
        java.util.Collection collection51 = categoryPlot21.getRangeMarkers(layer50);
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent52 = null;
        categoryPlot21.rendererChanged(rendererChangeEvent52);
        int int54 = categoryPlot21.getRendererCount();
        org.jfree.data.category.CategoryDataset categoryDataset55 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis57 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float58 = categoryAxis57.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis59 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer62 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color63 = java.awt.Color.BLUE;
        lineAndShapeRenderer62.setBaseItemLabelPaint((java.awt.Paint) color63);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator68 = lineAndShapeRenderer62.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot69 = new org.jfree.chart.plot.CategoryPlot(categoryDataset55, categoryAxis57, valueAxis59, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer62);
        java.lang.Object obj70 = categoryPlot69.clone();
        org.jfree.chart.util.RectangleEdge rectangleEdge72 = categoryPlot69.getDomainAxisEdge((int) ' ');
        categoryPlot69.setNotify(false);
        org.jfree.chart.axis.AxisLocation axisLocation76 = categoryPlot69.getDomainAxisLocation((int) '4');
        categoryPlot21.setDomainAxisLocation(axisLocation76, true);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryPlot41 and obj70", categoryPlot41.equals(obj70) ? categoryPlot41.hashCode() == obj70.hashCode() : true);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test039");
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
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer33 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color34 = java.awt.Color.BLUE;
        lineAndShapeRenderer33.setBaseItemLabelPaint((java.awt.Paint) color34);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator39 = lineAndShapeRenderer33.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition40 = lineAndShapeRenderer33.getBaseNegativeItemLabelPosition();
        lineAndShapeRenderer2.setSeriesNegativeItemLabelPosition((int) (short) 100, itemLabelPosition40, true);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer45 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator46 = null;
        lineAndShapeRenderer45.setBaseURLGenerator(categoryURLGenerator46);
        java.awt.Shape shape49 = lineAndShapeRenderer45.getLegendShape(0);
        lineAndShapeRenderer45.setAutoPopulateSeriesStroke(false);
        java.awt.Font font53 = lineAndShapeRenderer45.getSeriesItemLabelFont(0);
        lineAndShapeRenderer45.setUseSeriesOffset(true);
        java.awt.Shape shape57 = null;
        lineAndShapeRenderer45.setSeriesShape((int) (short) 10, shape57, true);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer62 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color63 = java.awt.Color.BLUE;
        lineAndShapeRenderer62.setBaseItemLabelPaint((java.awt.Paint) color63);
        java.awt.Stroke stroke66 = lineAndShapeRenderer62.getSeriesOutlineStroke((int) (short) 1);
        org.jfree.data.category.CategoryDataset categoryDataset67 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis69 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float70 = categoryAxis69.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis71 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer74 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color75 = java.awt.Color.BLUE;
        lineAndShapeRenderer74.setBaseItemLabelPaint((java.awt.Paint) color75);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator80 = lineAndShapeRenderer74.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot81 = new org.jfree.chart.plot.CategoryPlot(categoryDataset67, categoryAxis69, valueAxis71, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer74);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer82 = categoryPlot81.getRenderer();
        org.jfree.chart.axis.ValueAxis valueAxis84 = lineAndShapeRenderer62.getRangeAxis(categoryPlot81, (int) '4');
        double double85 = categoryPlot81.getRangeCrosshairValue();
        lineAndShapeRenderer45.addChangeListener((org.jfree.chart.event.RendererChangeListener) categoryPlot81);
        java.lang.Boolean boolean88 = lineAndShapeRenderer45.getSeriesVisible(10);
        boolean boolean89 = itemLabelPosition40.equals((java.lang.Object) boolean88);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryPlot18 and categoryPlot81", categoryPlot18.equals(categoryPlot81) ? categoryPlot18.hashCode() == categoryPlot81.hashCode() : true);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test040");
        java.awt.Paint[] paintArray0 = org.jfree.chart.plot.DefaultDrawingSupplier.DEFAULT_FILL_PAINT_SEQUENCE;
        java.awt.Paint[] paintArray1 = org.jfree.chart.plot.DefaultDrawingSupplier.DEFAULT_FILL_PAINT_SEQUENCE;
        org.jfree.chart.LegendItem legendItem3 = new org.jfree.chart.LegendItem("hi!");
        java.text.AttributedString attributedString4 = legendItem3.getAttributedLabel();
        java.lang.String str5 = legendItem3.getDescription();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer8 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator9 = null;
        lineAndShapeRenderer8.setBaseURLGenerator(categoryURLGenerator9);
        java.awt.Shape shape12 = lineAndShapeRenderer8.getLegendShape(0);
        lineAndShapeRenderer8.setAutoPopulateSeriesStroke(false);
        java.awt.Font font16 = lineAndShapeRenderer8.getSeriesItemLabelFont(0);
        lineAndShapeRenderer8.setUseSeriesOffset(true);
        java.awt.Shape shape20 = null;
        lineAndShapeRenderer8.setSeriesShape((int) (short) 10, shape20, true);
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
        lineAndShapeRenderer8.addChangeListener((org.jfree.chart.event.RendererChangeListener) categoryPlot44);
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray50 = new org.jfree.chart.axis.CategoryAxis[] {};
        categoryPlot44.setDomainAxes(categoryAxisArray50);
        categoryPlot44.setDomainGridlinesVisible(true);
        java.awt.Color color54 = java.awt.Color.BLUE;
        int int55 = color54.getRed();
        categoryPlot44.setRangeCrosshairPaint((java.awt.Paint) color54);
        legendItem3.setOutlinePaint((java.awt.Paint) color54);
        java.awt.Color color58 = org.jfree.chart.ChartColor.LIGHT_GREEN;
        legendItem3.setLinePaint((java.awt.Paint) color58);
        java.awt.Stroke stroke60 = legendItem3.getLineStroke();
        java.awt.Stroke[] strokeArray61 = new java.awt.Stroke[] { stroke60 };
        java.awt.Stroke[] strokeArray62 = org.jfree.chart.plot.DefaultDrawingSupplier.DEFAULT_STROKE_SEQUENCE;
        org.jfree.chart.LegendItem legendItem64 = new org.jfree.chart.LegendItem("hi!");
        java.text.AttributedString attributedString65 = legendItem64.getAttributedLabel();
        boolean boolean66 = legendItem64.isShapeFilled();
        java.lang.String str67 = legendItem64.getDescription();
        java.lang.Object obj68 = legendItem64.clone();
        java.awt.Shape shape69 = legendItem64.getShape();
        java.awt.Shape shape70 = legendItem64.getShape();
        java.awt.Shape[] shapeArray71 = new java.awt.Shape[] { shape70 };
        org.jfree.chart.plot.DefaultDrawingSupplier defaultDrawingSupplier72 = new org.jfree.chart.plot.DefaultDrawingSupplier(paintArray0, paintArray1, strokeArray61, strokeArray62, shapeArray71);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on legendItem64 and obj68", legendItem64.equals(obj68) ? legendItem64.hashCode() == obj68.hashCode() : true);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test041");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float3 = categoryAxis2.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis4 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer7 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color8 = java.awt.Color.BLUE;
        lineAndShapeRenderer7.setBaseItemLabelPaint((java.awt.Paint) color8);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator13 = lineAndShapeRenderer7.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot14 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis2, valueAxis4, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer7);
        org.jfree.chart.axis.AxisLocation axisLocation15 = org.jfree.chart.axis.AxisLocation.TOP_OR_LEFT;
        categoryPlot14.setRangeAxisLocation(axisLocation15);
        categoryPlot14.configureDomainAxes();
        org.jfree.chart.util.SortOrder sortOrder18 = org.jfree.chart.util.SortOrder.ASCENDING;
        categoryPlot14.setRowRenderingOrder(sortOrder18);
        java.awt.geom.GeneralPath generalPath20 = null;
        java.awt.geom.Rectangle2D rectangle2D21 = null;
        org.jfree.chart.RenderingSource renderingSource22 = null;
        categoryPlot14.select(generalPath20, rectangle2D21, renderingSource22);
        org.jfree.data.category.CategoryDataset categoryDataset24 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis26 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float27 = categoryAxis26.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis28 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer31 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color32 = java.awt.Color.BLUE;
        lineAndShapeRenderer31.setBaseItemLabelPaint((java.awt.Paint) color32);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator37 = lineAndShapeRenderer31.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot38 = new org.jfree.chart.plot.CategoryPlot(categoryDataset24, categoryAxis26, valueAxis28, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer31);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent39 = new org.jfree.chart.event.PlotChangeEvent((org.jfree.chart.plot.Plot) categoryPlot38);
        org.jfree.chart.plot.Plot plot40 = plotChangeEvent39.getPlot();
        categoryPlot14.notifyListeners(plotChangeEvent39);
        org.jfree.chart.plot.Plot plot42 = plotChangeEvent39.getPlot();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryPlot14 and plot42", categoryPlot14.equals(plot42) ? categoryPlot14.hashCode() == plot42.hashCode() : true);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test042");
        org.jfree.chart.LegendItem legendItem1 = new org.jfree.chart.LegendItem("hi!");
        java.awt.Color color5 = java.awt.Color.getHSBColor((float) (short) 1, (float) ' ', 0.0f);
        legendItem1.setLinePaint((java.awt.Paint) color5);
        boolean boolean7 = legendItem1.isShapeOutlineVisible();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer10 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color11 = java.awt.Color.BLUE;
        lineAndShapeRenderer10.setBaseItemLabelPaint((java.awt.Paint) color11);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator16 = lineAndShapeRenderer10.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition18 = lineAndShapeRenderer10.getSeriesPositiveItemLabelPosition((int) 'a');
        java.awt.Shape shape20 = lineAndShapeRenderer10.lookupLegendShape(8);
        legendItem1.setLine(shape20);
        org.jfree.data.category.CategoryDataset categoryDataset22 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis24 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float25 = categoryAxis24.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis26 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer29 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color30 = java.awt.Color.BLUE;
        lineAndShapeRenderer29.setBaseItemLabelPaint((java.awt.Paint) color30);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator35 = lineAndShapeRenderer29.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot36 = new org.jfree.chart.plot.CategoryPlot(categoryDataset22, categoryAxis24, valueAxis26, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer29);
        java.lang.Object obj37 = categoryPlot36.clone();
        org.jfree.chart.util.RectangleEdge rectangleEdge39 = categoryPlot36.getDomainAxisEdge((int) ' ');
        boolean boolean40 = categoryPlot36.isRangeZeroBaselineVisible();
        org.jfree.chart.axis.CategoryAxis categoryAxis42 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float43 = categoryAxis42.getTickMarkInsideLength();
        categoryAxis42.setTickLabelsVisible(false);
        double double46 = categoryAxis42.getLowerMargin();
        boolean boolean47 = categoryPlot36.equals((java.lang.Object) categoryAxis42);
        org.jfree.chart.entity.PlotEntity plotEntity49 = new org.jfree.chart.entity.PlotEntity(shape20, (org.jfree.chart.plot.Plot) categoryPlot36, "TextAnchor.BOTTOM_CENTER");
        org.jfree.chart.LegendItem legendItem51 = new org.jfree.chart.LegendItem("hi!");
        java.awt.Color color55 = java.awt.Color.getHSBColor((float) (short) 1, (float) ' ', 0.0f);
        legendItem51.setLinePaint((java.awt.Paint) color55);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer59 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color60 = java.awt.Color.BLUE;
        lineAndShapeRenderer59.setBaseItemLabelPaint((java.awt.Paint) color60);
        java.awt.Shape shape62 = lineAndShapeRenderer59.getBaseShape();
        org.jfree.chart.entity.ChartEntity chartEntity64 = new org.jfree.chart.entity.ChartEntity(shape62, "");
        legendItem51.setLine(shape62);
        java.awt.Shape shape66 = legendItem51.getShape();
        java.lang.String str67 = legendItem51.getLabel();
        int int68 = legendItem51.getSeriesIndex();
        boolean boolean69 = plotEntity49.equals((java.lang.Object) int68);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on legendItem1 and legendItem51", legendItem1.equals(legendItem51) ? legendItem1.hashCode() == legendItem51.hashCode() : true);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test043");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color3 = java.awt.Color.BLUE;
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color3);
        java.awt.Shape shape5 = lineAndShapeRenderer2.getBaseShape();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer8 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator9 = null;
        lineAndShapeRenderer8.setBaseURLGenerator(categoryURLGenerator9);
        java.awt.Shape shape12 = lineAndShapeRenderer8.getLegendShape(0);
        lineAndShapeRenderer8.setAutoPopulateSeriesStroke(false);
        java.awt.Font font16 = lineAndShapeRenderer8.getSeriesItemLabelFont(0);
        lineAndShapeRenderer8.setUseSeriesOffset(true);
        java.awt.Font font20 = null;
        lineAndShapeRenderer8.setSeriesItemLabelFont((int) (short) 1, font20, false);
        java.awt.Stroke stroke26 = lineAndShapeRenderer8.getItemOutlineStroke(0, 1, false);
        lineAndShapeRenderer2.setBaseStroke(stroke26, true);
        lineAndShapeRenderer2.clearSeriesStrokes(true);
        java.awt.Paint paint32 = lineAndShapeRenderer2.lookupSeriesPaint((int) (short) -1);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer36 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color37 = java.awt.Color.BLUE;
        lineAndShapeRenderer36.setBaseItemLabelPaint((java.awt.Paint) color37);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator42 = lineAndShapeRenderer36.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator43 = null;
        lineAndShapeRenderer36.setLegendItemURLGenerator(categorySeriesLabelGenerator43);
        java.awt.Paint paint46 = lineAndShapeRenderer36.getSeriesPaint(1);
        java.awt.Paint paint47 = lineAndShapeRenderer36.getBaseFillPaint();
        boolean boolean48 = lineAndShapeRenderer36.getBaseSeriesVisibleInLegend();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer52 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color53 = java.awt.Color.BLUE;
        lineAndShapeRenderer52.setBaseItemLabelPaint((java.awt.Paint) color53);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator58 = lineAndShapeRenderer52.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition60 = lineAndShapeRenderer52.getSeriesPositiveItemLabelPosition((int) 'a');
        boolean boolean61 = lineAndShapeRenderer52.getBaseItemLabelsVisible();
        java.awt.Stroke stroke65 = lineAndShapeRenderer52.getItemOutlineStroke((int) (byte) 100, (int) (short) -1, false);
        lineAndShapeRenderer36.setSeriesStroke((int) '4', stroke65);
        lineAndShapeRenderer2.setSeriesOutlineStroke(11, stroke65, true);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on lineAndShapeRenderer52 and lineAndShapeRenderer36.", lineAndShapeRenderer52.equals(lineAndShapeRenderer36) == lineAndShapeRenderer36.equals(lineAndShapeRenderer52));
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test044");
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
        org.jfree.data.category.CategoryDataset categoryDataset27 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis29 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float30 = categoryAxis29.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis31 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer34 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color35 = java.awt.Color.BLUE;
        lineAndShapeRenderer34.setBaseItemLabelPaint((java.awt.Paint) color35);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator40 = lineAndShapeRenderer34.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot41 = new org.jfree.chart.plot.CategoryPlot(categoryDataset27, categoryAxis29, valueAxis31, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer34);
        boolean boolean42 = categoryPlot41.canSelectByPoint();
        org.jfree.chart.axis.AxisLocation axisLocation44 = categoryPlot41.getDomainAxisLocation((int) (byte) 0);
        categoryPlot21.setDomainAxisLocation(axisLocation44);
        org.jfree.data.category.DefaultCategoryDataset defaultCategoryDataset47 = new org.jfree.data.category.DefaultCategoryDataset();
        int int49 = defaultCategoryDataset47.getColumnIndex((java.lang.Comparable) 3.0d);
        categoryPlot21.setDataset((int) 'a', (org.jfree.data.category.CategoryDataset) defaultCategoryDataset47);
        int int52 = defaultCategoryDataset47.getColumnIndex((java.lang.Comparable) 1.0d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryPlot21 and categoryPlot41", categoryPlot21.equals(categoryPlot41) ? categoryPlot21.hashCode() == categoryPlot41.hashCode() : true);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test045");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color3 = java.awt.Color.BLUE;
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color3);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator8 = lineAndShapeRenderer2.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator9 = null;
        lineAndShapeRenderer2.setLegendItemURLGenerator(categorySeriesLabelGenerator9);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator12 = null;
        lineAndShapeRenderer2.setSeriesItemLabelGenerator(0, categoryItemLabelGenerator12);
        java.awt.Paint paint14 = lineAndShapeRenderer2.getBaseItemLabelPaint();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer18 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color19 = java.awt.Color.BLUE;
        lineAndShapeRenderer18.setBaseItemLabelPaint((java.awt.Paint) color19);
        java.awt.Shape shape21 = lineAndShapeRenderer18.getBaseShape();
        java.awt.Stroke stroke22 = lineAndShapeRenderer18.getBaseOutlineStroke();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator23 = null;
        lineAndShapeRenderer18.setBaseItemLabelGenerator(categoryItemLabelGenerator23, false);
        java.awt.Font font27 = lineAndShapeRenderer18.getLegendTextFont((-1));
        org.jfree.data.category.CategoryDataset categoryDataset28 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis30 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float31 = categoryAxis30.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis32 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer35 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color36 = java.awt.Color.BLUE;
        lineAndShapeRenderer35.setBaseItemLabelPaint((java.awt.Paint) color36);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator41 = lineAndShapeRenderer35.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot42 = new org.jfree.chart.plot.CategoryPlot(categoryDataset28, categoryAxis30, valueAxis32, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer35);
        lineAndShapeRenderer35.setSeriesVisibleInLegend(3, (java.lang.Boolean) false, false);
        org.jfree.chart.axis.CategoryAxis categoryAxis49 = new org.jfree.chart.axis.CategoryAxis("hi!");
        java.lang.Object obj50 = categoryAxis49.clone();
        java.awt.Font font51 = categoryAxis49.getTickLabelFont();
        lineAndShapeRenderer35.setSeriesItemLabelFont((int) '#', font51);
        lineAndShapeRenderer18.setBaseItemLabelFont(font51);
        lineAndShapeRenderer2.setSeriesItemLabelFont((int) ' ', font51, false);
        java.awt.Font font57 = lineAndShapeRenderer2.getLegendTextFont(192);
        java.lang.Object obj58 = lineAndShapeRenderer2.clone();
        java.lang.Boolean boolean60 = lineAndShapeRenderer2.getSeriesLinesVisible(11);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer63 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color64 = java.awt.Color.BLUE;
        lineAndShapeRenderer63.setBaseItemLabelPaint((java.awt.Paint) color64);
        java.awt.Stroke stroke67 = lineAndShapeRenderer63.getSeriesOutlineStroke((int) (short) 1);
        org.jfree.data.category.CategoryDataset categoryDataset68 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis70 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float71 = categoryAxis70.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis72 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer75 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color76 = java.awt.Color.BLUE;
        lineAndShapeRenderer75.setBaseItemLabelPaint((java.awt.Paint) color76);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator81 = lineAndShapeRenderer75.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot82 = new org.jfree.chart.plot.CategoryPlot(categoryDataset68, categoryAxis70, valueAxis72, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer75);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer83 = categoryPlot82.getRenderer();
        org.jfree.chart.axis.ValueAxis valueAxis85 = lineAndShapeRenderer63.getRangeAxis(categoryPlot82, (int) '4');
        boolean boolean86 = categoryPlot82.isRangeCrosshairVisible();
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder87 = categoryPlot82.getDatasetRenderingOrder();
        org.jfree.chart.plot.Marker marker89 = null;
        org.jfree.chart.util.Layer layer90 = null;
        boolean boolean92 = categoryPlot82.removeDomainMarker((int) (short) 0, marker89, layer90, false);
        double double93 = categoryPlot82.getAnchorValue();
        lineAndShapeRenderer2.removeChangeListener((org.jfree.chart.event.RendererChangeListener) categoryPlot82);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on lineAndShapeRenderer63 and lineAndShapeRenderer35.", lineAndShapeRenderer63.equals(lineAndShapeRenderer35) == lineAndShapeRenderer35.equals(lineAndShapeRenderer63));
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test046");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer3 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color4 = java.awt.Color.BLUE;
        lineAndShapeRenderer3.setBaseItemLabelPaint((java.awt.Paint) color4);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator9 = lineAndShapeRenderer3.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator10 = null;
        lineAndShapeRenderer3.setLegendItemURLGenerator(categorySeriesLabelGenerator10);
        java.awt.Paint paint13 = lineAndShapeRenderer3.getSeriesPaint(1);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer17 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color18 = java.awt.Color.BLUE;
        lineAndShapeRenderer17.setBaseItemLabelPaint((java.awt.Paint) color18);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator23 = lineAndShapeRenderer17.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator24 = null;
        lineAndShapeRenderer17.setLegendItemURLGenerator(categorySeriesLabelGenerator24);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator29 = lineAndShapeRenderer17.getToolTipGenerator((int) '#', (int) (byte) 10, false);
        lineAndShapeRenderer17.setBaseSeriesVisible(true, true);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition34 = lineAndShapeRenderer17.getSeriesNegativeItemLabelPosition((int) (byte) -1);
        lineAndShapeRenderer3.setSeriesPositiveItemLabelPosition(100, itemLabelPosition34, false);
        boolean boolean38 = lineAndShapeRenderer3.isSeriesVisible((int) 'a');
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer42 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color43 = java.awt.Color.BLUE;
        lineAndShapeRenderer42.setBaseItemLabelPaint((java.awt.Paint) color43);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator48 = lineAndShapeRenderer42.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator49 = null;
        lineAndShapeRenderer42.setLegendItemURLGenerator(categorySeriesLabelGenerator49);
        java.awt.Paint paint52 = lineAndShapeRenderer42.getSeriesPaint(1);
        org.jfree.chart.renderer.RenderAttributes renderAttributes53 = lineAndShapeRenderer42.getSelectedItemAttributes();
        java.awt.Paint paint54 = renderAttributes53.getDefaultLabelPaint();
        java.awt.Color color55 = org.jfree.chart.ChartColor.LIGHT_GREEN;
        renderAttributes53.setDefaultOutlinePaint((java.awt.Paint) color55);
        org.jfree.data.category.CategoryDataset categoryDataset58 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis60 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float61 = categoryAxis60.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis62 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer65 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color66 = java.awt.Color.BLUE;
        lineAndShapeRenderer65.setBaseItemLabelPaint((java.awt.Paint) color66);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator71 = lineAndShapeRenderer65.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot72 = new org.jfree.chart.plot.CategoryPlot(categoryDataset58, categoryAxis60, valueAxis62, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer65);
        org.jfree.chart.axis.AxisLocation axisLocation73 = org.jfree.chart.axis.AxisLocation.TOP_OR_LEFT;
        categoryPlot72.setRangeAxisLocation(axisLocation73);
        categoryPlot72.configureDomainAxes();
        org.jfree.chart.util.SortOrder sortOrder76 = org.jfree.chart.util.SortOrder.ASCENDING;
        categoryPlot72.setRowRenderingOrder(sortOrder76);
        java.awt.geom.GeneralPath generalPath78 = null;
        java.awt.geom.Rectangle2D rectangle2D79 = null;
        org.jfree.chart.RenderingSource renderingSource80 = null;
        categoryPlot72.select(generalPath78, rectangle2D79, renderingSource80);
        java.awt.Paint paint82 = categoryPlot72.getRangeCrosshairPaint();
        renderAttributes53.setSeriesFillPaint(0, paint82);
        lineAndShapeRenderer3.setSeriesOutlinePaint((int) '4', paint82);
        org.jfree.chart.LegendItem legendItem85 = new org.jfree.chart.LegendItem("", paint82);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on lineAndShapeRenderer17 and lineAndShapeRenderer3.", lineAndShapeRenderer17.equals(lineAndShapeRenderer3) == lineAndShapeRenderer3.equals(lineAndShapeRenderer17));
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test047");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color3 = java.awt.Color.BLUE;
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color3);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator8 = lineAndShapeRenderer2.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator9 = null;
        lineAndShapeRenderer2.setLegendItemURLGenerator(categorySeriesLabelGenerator9);
        java.awt.Paint paint12 = lineAndShapeRenderer2.getSeriesPaint(1);
        org.jfree.chart.renderer.RenderAttributes renderAttributes13 = lineAndShapeRenderer2.getSelectedItemAttributes();
        lineAndShapeRenderer2.setSeriesCreateEntities((int) (short) 10, (java.lang.Boolean) true);
        lineAndShapeRenderer2.setSeriesShapesFilled(3, (java.lang.Boolean) false);
        java.awt.Shape shape21 = lineAndShapeRenderer2.lookupLegendShape(2);
        java.awt.Color color23 = org.jfree.chart.ChartColor.VERY_DARK_BLUE;
        lineAndShapeRenderer2.setSeriesPaint(192, (java.awt.Paint) color23, false);
        org.jfree.data.category.CategoryDataset categoryDataset26 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis28 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float29 = categoryAxis28.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis30 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer33 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color34 = java.awt.Color.BLUE;
        lineAndShapeRenderer33.setBaseItemLabelPaint((java.awt.Paint) color34);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator39 = lineAndShapeRenderer33.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot40 = new org.jfree.chart.plot.CategoryPlot(categoryDataset26, categoryAxis28, valueAxis30, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer33);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer41 = categoryPlot40.getRenderer();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer44 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        boolean boolean46 = lineAndShapeRenderer44.isSeriesVisibleInLegend(1);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator48 = null;
        lineAndShapeRenderer44.setSeriesURLGenerator(0, categoryURLGenerator48, false);
        java.awt.Color color51 = org.jfree.chart.ChartColor.LIGHT_GREEN;
        java.awt.color.ColorSpace colorSpace52 = color51.getColorSpace();
        lineAndShapeRenderer44.setBaseFillPaint((java.awt.Paint) color51);
        categoryPlot40.setDomainCrosshairPaint((java.awt.Paint) color51);
        org.jfree.chart.axis.CategoryAnchor categoryAnchor55 = categoryPlot40.getDomainGridlinePosition();
        lineAndShapeRenderer2.removeChangeListener((org.jfree.chart.event.RendererChangeListener) categoryPlot40);
        org.jfree.chart.event.PlotChangeListener plotChangeListener57 = null;
        categoryPlot40.removeChangeListener(plotChangeListener57);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on lineAndShapeRenderer33 and lineAndShapeRenderer2.", lineAndShapeRenderer33.equals(lineAndShapeRenderer2) == lineAndShapeRenderer2.equals(lineAndShapeRenderer33));
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test048");
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
        org.jfree.data.category.CategoryDataset categoryDataset27 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis29 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float30 = categoryAxis29.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis31 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer34 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color35 = java.awt.Color.BLUE;
        lineAndShapeRenderer34.setBaseItemLabelPaint((java.awt.Paint) color35);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator40 = lineAndShapeRenderer34.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot41 = new org.jfree.chart.plot.CategoryPlot(categoryDataset27, categoryAxis29, valueAxis31, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer34);
        boolean boolean42 = categoryPlot41.canSelectByPoint();
        org.jfree.chart.axis.AxisLocation axisLocation44 = categoryPlot41.getDomainAxisLocation((int) (byte) 0);
        categoryPlot21.setDomainAxisLocation(axisLocation44);
        org.jfree.data.category.DefaultCategoryDataset defaultCategoryDataset47 = new org.jfree.data.category.DefaultCategoryDataset();
        int int49 = defaultCategoryDataset47.getColumnIndex((java.lang.Comparable) 3.0d);
        categoryPlot21.setDataset((int) 'a', (org.jfree.data.category.CategoryDataset) defaultCategoryDataset47);
        int int52 = defaultCategoryDataset47.getRowIndex((java.lang.Comparable) 2.0d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryPlot21 and categoryPlot41", categoryPlot21.equals(categoryPlot41) ? categoryPlot21.hashCode() == categoryPlot41.hashCode() : true);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test049");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator3 = null;
        lineAndShapeRenderer2.setBaseURLGenerator(categoryURLGenerator3);
        java.awt.Shape shape6 = lineAndShapeRenderer2.getLegendShape(0);
        lineAndShapeRenderer2.setAutoPopulateSeriesStroke(false);
        java.awt.Font font10 = lineAndShapeRenderer2.getSeriesItemLabelFont(0);
        lineAndShapeRenderer2.setUseSeriesOffset(true);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier13 = lineAndShapeRenderer2.getDrawingSupplier();
        lineAndShapeRenderer2.setBaseCreateEntities(false);
        java.awt.Font font19 = lineAndShapeRenderer2.getItemLabelFont((int) (short) 0, 0, false);
        org.jfree.chart.labels.StandardCategorySeriesLabelGenerator standardCategorySeriesLabelGenerator21 = new org.jfree.chart.labels.StandardCategorySeriesLabelGenerator("{0}");
        lineAndShapeRenderer2.setLegendItemToolTipGenerator((org.jfree.chart.labels.CategorySeriesLabelGenerator) standardCategorySeriesLabelGenerator21);
        org.jfree.data.category.CategoryDataset categoryDataset23 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis25 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float26 = categoryAxis25.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis27 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer30 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color31 = java.awt.Color.BLUE;
        lineAndShapeRenderer30.setBaseItemLabelPaint((java.awt.Paint) color31);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator36 = lineAndShapeRenderer30.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot37 = new org.jfree.chart.plot.CategoryPlot(categoryDataset23, categoryAxis25, valueAxis27, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer30);
        boolean boolean38 = categoryPlot37.canSelectByPoint();
        org.jfree.chart.axis.ValueAxis valueAxis40 = categoryPlot37.getRangeAxisForDataset((int) '4');
        org.jfree.chart.axis.AxisLocation axisLocation42 = categoryPlot37.getRangeAxisLocation((int) '4');
        lineAndShapeRenderer2.setPlot(categoryPlot37);
        org.jfree.data.category.CategoryDataset categoryDataset44 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis46 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float47 = categoryAxis46.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis48 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer51 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color52 = java.awt.Color.BLUE;
        lineAndShapeRenderer51.setBaseItemLabelPaint((java.awt.Paint) color52);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator57 = lineAndShapeRenderer51.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot58 = new org.jfree.chart.plot.CategoryPlot(categoryDataset44, categoryAxis46, valueAxis48, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer51);
        boolean boolean59 = categoryPlot58.canSelectByPoint();
        org.jfree.chart.LegendItemCollection legendItemCollection60 = categoryPlot58.getFixedLegendItems();
        java.awt.Stroke stroke61 = categoryPlot58.getRangeGridlineStroke();
        lineAndShapeRenderer2.setBaseStroke(stroke61, false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryPlot37 and categoryPlot58", categoryPlot37.equals(categoryPlot58) ? categoryPlot37.hashCode() == categoryPlot58.hashCode() : true);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test050");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color3 = java.awt.Color.BLUE;
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color3);
        java.awt.Stroke stroke6 = lineAndShapeRenderer2.getSeriesOutlineStroke((int) (short) 1);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator8 = null;
        lineAndShapeRenderer2.setSeriesItemLabelGenerator((int) (short) 100, categoryItemLabelGenerator8);
        lineAndShapeRenderer2.setDrawOutlines(true);
        org.jfree.chart.LegendItem legendItem13 = new org.jfree.chart.LegendItem("hi!");
        java.awt.Color color17 = java.awt.Color.getHSBColor((float) (short) 1, (float) ' ', 0.0f);
        legendItem13.setLinePaint((java.awt.Paint) color17);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer21 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator22 = null;
        lineAndShapeRenderer21.setBaseURLGenerator(categoryURLGenerator22);
        java.awt.Shape shape25 = lineAndShapeRenderer21.getLegendShape(0);
        lineAndShapeRenderer21.setAutoPopulateSeriesStroke(false);
        java.awt.Font font29 = lineAndShapeRenderer21.getSeriesItemLabelFont(0);
        lineAndShapeRenderer21.setSeriesItemLabelsVisible(100, (java.lang.Boolean) true, false);
        java.awt.Font font35 = lineAndShapeRenderer21.getSeriesItemLabelFont((int) (byte) -1);
        java.awt.Paint paint36 = lineAndShapeRenderer21.getBaseOutlinePaint();
        org.jfree.chart.LegendItem legendItem38 = new org.jfree.chart.LegendItem("hi!");
        java.text.AttributedString attributedString39 = legendItem38.getAttributedLabel();
        java.lang.String str40 = legendItem38.getDescription();
        legendItem38.setSeriesKey((java.lang.Comparable) (byte) 100);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer45 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color46 = java.awt.Color.BLUE;
        lineAndShapeRenderer45.setBaseItemLabelPaint((java.awt.Paint) color46);
        java.awt.Shape shape48 = lineAndShapeRenderer45.getBaseShape();
        org.jfree.chart.entity.ChartEntity chartEntity50 = new org.jfree.chart.entity.ChartEntity(shape48, "");
        legendItem38.setShape(shape48);
        org.jfree.chart.entity.ChartEntity chartEntity54 = new org.jfree.chart.entity.ChartEntity(shape48, "ItemLabelAnchor.OUTSIDE6", "ChartChangeEventType.GENERAL");
        lineAndShapeRenderer21.setBaseLegendShape(shape48);
        legendItem13.setShape(shape48);
        lineAndShapeRenderer2.setBaseShape(shape48);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on legendItem13 and legendItem38", legendItem13.equals(legendItem38) ? legendItem13.hashCode() == legendItem38.hashCode() : true);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test051");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer3 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color4 = java.awt.Color.BLUE;
        lineAndShapeRenderer3.setBaseItemLabelPaint((java.awt.Paint) color4);
        java.awt.Stroke stroke7 = lineAndShapeRenderer3.getSeriesOutlineStroke((int) (short) 1);
        org.jfree.data.category.CategoryDataset categoryDataset8 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis10 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float11 = categoryAxis10.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis12 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer15 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color16 = java.awt.Color.BLUE;
        lineAndShapeRenderer15.setBaseItemLabelPaint((java.awt.Paint) color16);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator21 = lineAndShapeRenderer15.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot22 = new org.jfree.chart.plot.CategoryPlot(categoryDataset8, categoryAxis10, valueAxis12, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer15);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer23 = categoryPlot22.getRenderer();
        org.jfree.chart.axis.ValueAxis valueAxis25 = lineAndShapeRenderer3.getRangeAxis(categoryPlot22, (int) '4');
        double double26 = categoryPlot22.getRangeCrosshairValue();
        java.awt.Paint paint27 = categoryPlot22.getRangeZeroBaselinePaint();
        int int28 = categoryPlot22.getRangeAxisCount();
        java.awt.Color color29 = java.awt.Color.BLUE;
        categoryPlot22.setRangeMinorGridlinePaint((java.awt.Paint) color29);
        java.awt.Stroke stroke31 = categoryPlot22.getRangeMinorGridlineStroke();
        float float32 = categoryPlot22.getBackgroundAlpha();
        org.jfree.data.category.DefaultCategoryDataset defaultCategoryDataset33 = new org.jfree.data.category.DefaultCategoryDataset();
        int int35 = defaultCategoryDataset33.getColumnIndex((java.lang.Comparable) 3.0d);
        int int37 = defaultCategoryDataset33.getRowIndex((java.lang.Comparable) (byte) 10);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer40 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color41 = java.awt.Color.BLUE;
        lineAndShapeRenderer40.setBaseItemLabelPaint((java.awt.Paint) color41);
        java.awt.Stroke stroke44 = lineAndShapeRenderer40.getSeriesOutlineStroke((int) (short) 1);
        org.jfree.data.category.CategoryDataset categoryDataset45 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis47 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float48 = categoryAxis47.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis49 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer52 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color53 = java.awt.Color.BLUE;
        lineAndShapeRenderer52.setBaseItemLabelPaint((java.awt.Paint) color53);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator58 = lineAndShapeRenderer52.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot59 = new org.jfree.chart.plot.CategoryPlot(categoryDataset45, categoryAxis47, valueAxis49, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer52);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer60 = categoryPlot59.getRenderer();
        org.jfree.chart.axis.ValueAxis valueAxis62 = lineAndShapeRenderer40.getRangeAxis(categoryPlot59, (int) '4');
        double double63 = categoryPlot59.getRangeCrosshairValue();
        java.awt.Paint paint64 = categoryPlot59.getRangeZeroBaselinePaint();
        int int65 = categoryPlot59.getRangeAxisCount();
        java.awt.Color color66 = java.awt.Color.BLUE;
        categoryPlot59.setRangeMinorGridlinePaint((java.awt.Paint) color66);
        java.awt.Stroke stroke68 = categoryPlot59.getRangeMinorGridlineStroke();
        float float69 = categoryPlot59.getBackgroundAlpha();
        defaultCategoryDataset33.addChangeListener((org.jfree.data.event.DatasetChangeListener) categoryPlot59);
        org.jfree.data.category.CategoryDatasetSelectionState categoryDatasetSelectionState71 = defaultCategoryDataset33.getSelectionState();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer72 = categoryPlot22.getRendererForDataset((org.jfree.data.category.CategoryDataset) defaultCategoryDataset33);
        org.jfree.data.KeyedObject keyedObject73 = new org.jfree.data.KeyedObject((java.lang.Comparable) (byte) 1, (java.lang.Object) categoryPlot22);
        java.lang.Object obj74 = null;
        keyedObject73.setObject(obj74);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryPlot22 and categoryPlot59", categoryPlot22.equals(categoryPlot59) ? categoryPlot22.hashCode() == categoryPlot59.hashCode() : true);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test052");
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
        org.jfree.data.category.CategoryDataset categoryDataset27 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis29 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float30 = categoryAxis29.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis31 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer34 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color35 = java.awt.Color.BLUE;
        lineAndShapeRenderer34.setBaseItemLabelPaint((java.awt.Paint) color35);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator40 = lineAndShapeRenderer34.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot41 = new org.jfree.chart.plot.CategoryPlot(categoryDataset27, categoryAxis29, valueAxis31, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer34);
        org.jfree.chart.axis.AxisLocation axisLocation42 = org.jfree.chart.axis.AxisLocation.TOP_OR_LEFT;
        categoryPlot41.setRangeAxisLocation(axisLocation42);
        categoryPlot21.setRangeAxisLocation(axisLocation42, true);
        java.lang.String str46 = axisLocation42.toString();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryPlot21 and categoryPlot41", categoryPlot21.equals(categoryPlot41) ? categoryPlot21.hashCode() == categoryPlot41.hashCode() : true);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test053");
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
        java.awt.Color color35 = org.jfree.chart.ChartColor.DARK_MAGENTA;
        barRenderer0.setShadowPaint((java.awt.Paint) color35);
        barRenderer0.setBaseItemLabelsVisible(false, false);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer43 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color44 = java.awt.Color.BLUE;
        lineAndShapeRenderer43.setBaseItemLabelPaint((java.awt.Paint) color44);
        java.awt.Shape shape46 = lineAndShapeRenderer43.getBaseShape();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer49 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator50 = null;
        lineAndShapeRenderer49.setBaseURLGenerator(categoryURLGenerator50);
        java.awt.Shape shape53 = lineAndShapeRenderer49.getLegendShape(0);
        lineAndShapeRenderer49.setAutoPopulateSeriesStroke(false);
        java.awt.Font font57 = lineAndShapeRenderer49.getSeriesItemLabelFont(0);
        lineAndShapeRenderer49.setUseSeriesOffset(true);
        java.awt.Font font61 = null;
        lineAndShapeRenderer49.setSeriesItemLabelFont((int) (short) 1, font61, false);
        java.awt.Stroke stroke67 = lineAndShapeRenderer49.getItemOutlineStroke(0, 1, false);
        lineAndShapeRenderer43.setBaseStroke(stroke67, true);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition70 = lineAndShapeRenderer43.getBasePositiveItemLabelPosition();
        barRenderer0.setSeriesPositiveItemLabelPosition(3, itemLabelPosition70, true);
        java.awt.Stroke stroke73 = barRenderer0.getBaseStroke();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on itemLabelPosition30 and itemLabelPosition70", itemLabelPosition30.equals(itemLabelPosition70) ? itemLabelPosition30.hashCode() == itemLabelPosition70.hashCode() : true);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test054");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color3 = java.awt.Color.BLUE;
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color3);
        java.awt.Shape shape5 = lineAndShapeRenderer2.getBaseShape();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer8 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator9 = null;
        lineAndShapeRenderer8.setBaseURLGenerator(categoryURLGenerator9);
        java.awt.Shape shape12 = lineAndShapeRenderer8.getLegendShape(0);
        lineAndShapeRenderer8.setAutoPopulateSeriesStroke(false);
        java.awt.Font font16 = lineAndShapeRenderer8.getSeriesItemLabelFont(0);
        lineAndShapeRenderer8.setUseSeriesOffset(true);
        java.awt.Font font20 = null;
        lineAndShapeRenderer8.setSeriesItemLabelFont((int) (short) 1, font20, false);
        java.awt.Stroke stroke26 = lineAndShapeRenderer8.getItemOutlineStroke(0, 1, false);
        lineAndShapeRenderer2.setBaseStroke(stroke26, true);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition29 = lineAndShapeRenderer2.getBasePositiveItemLabelPosition();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer33 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator34 = null;
        lineAndShapeRenderer33.setBaseURLGenerator(categoryURLGenerator34);
        java.awt.Shape shape37 = lineAndShapeRenderer33.getLegendShape(0);
        lineAndShapeRenderer33.setAutoPopulateSeriesStroke(false);
        java.awt.Font font41 = lineAndShapeRenderer33.getSeriesItemLabelFont(0);
        lineAndShapeRenderer33.setUseSeriesOffset(true);
        java.awt.Shape shape45 = null;
        lineAndShapeRenderer33.setSeriesShape((int) (short) 10, shape45, true);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer50 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color51 = java.awt.Color.BLUE;
        lineAndShapeRenderer50.setBaseItemLabelPaint((java.awt.Paint) color51);
        java.awt.Stroke stroke54 = lineAndShapeRenderer50.getSeriesOutlineStroke((int) (short) 1);
        org.jfree.data.category.CategoryDataset categoryDataset55 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis57 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float58 = categoryAxis57.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis59 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer62 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color63 = java.awt.Color.BLUE;
        lineAndShapeRenderer62.setBaseItemLabelPaint((java.awt.Paint) color63);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator68 = lineAndShapeRenderer62.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot69 = new org.jfree.chart.plot.CategoryPlot(categoryDataset55, categoryAxis57, valueAxis59, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer62);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer70 = categoryPlot69.getRenderer();
        org.jfree.chart.axis.ValueAxis valueAxis72 = lineAndShapeRenderer50.getRangeAxis(categoryPlot69, (int) '4');
        double double73 = categoryPlot69.getRangeCrosshairValue();
        lineAndShapeRenderer33.addChangeListener((org.jfree.chart.event.RendererChangeListener) categoryPlot69);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator75 = lineAndShapeRenderer33.getBaseToolTipGenerator();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition76 = lineAndShapeRenderer33.getBasePositiveItemLabelPosition();
        lineAndShapeRenderer2.setSeriesPositiveItemLabelPosition(255, itemLabelPosition76);
        org.jfree.chart.ChartColor chartColor82 = new org.jfree.chart.ChartColor(0, 8, (int) ' ');
        lineAndShapeRenderer2.setSeriesPaint(0, (java.awt.Paint) chartColor82);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on itemLabelPosition29 and itemLabelPosition76", itemLabelPosition29.equals(itemLabelPosition76) ? itemLabelPosition29.hashCode() == itemLabelPosition76.hashCode() : true);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test055");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float3 = categoryAxis2.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis4 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer7 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color8 = java.awt.Color.BLUE;
        lineAndShapeRenderer7.setBaseItemLabelPaint((java.awt.Paint) color8);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator13 = lineAndShapeRenderer7.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot14 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis2, valueAxis4, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer7);
        org.jfree.chart.axis.AxisLocation axisLocation15 = org.jfree.chart.axis.AxisLocation.TOP_OR_LEFT;
        categoryPlot14.setRangeAxisLocation(axisLocation15);
        categoryPlot14.configureDomainAxes();
        org.jfree.chart.util.SortOrder sortOrder18 = org.jfree.chart.util.SortOrder.ASCENDING;
        categoryPlot14.setRowRenderingOrder(sortOrder18);
        java.awt.geom.GeneralPath generalPath20 = null;
        java.awt.geom.Rectangle2D rectangle2D21 = null;
        org.jfree.chart.RenderingSource renderingSource22 = null;
        categoryPlot14.select(generalPath20, rectangle2D21, renderingSource22);
        org.jfree.data.category.CategoryDataset categoryDataset24 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis26 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float27 = categoryAxis26.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis28 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer31 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color32 = java.awt.Color.BLUE;
        lineAndShapeRenderer31.setBaseItemLabelPaint((java.awt.Paint) color32);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator37 = lineAndShapeRenderer31.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot38 = new org.jfree.chart.plot.CategoryPlot(categoryDataset24, categoryAxis26, valueAxis28, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer31);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent39 = new org.jfree.chart.event.PlotChangeEvent((org.jfree.chart.plot.Plot) categoryPlot38);
        org.jfree.chart.plot.Plot plot40 = plotChangeEvent39.getPlot();
        categoryPlot14.notifyListeners(plotChangeEvent39);
        java.lang.String str42 = plotChangeEvent39.toString();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryPlot14 and categoryPlot38", categoryPlot14.equals(categoryPlot38) ? categoryPlot14.hashCode() == categoryPlot38.hashCode() : true);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test056");
        org.jfree.data.KeyedObjects keyedObjects0 = new org.jfree.data.KeyedObjects();
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
        org.jfree.chart.util.RectangleEdge rectangleEdge28 = categoryPlot23.getDomainAxisEdge();
        boolean boolean29 = categoryPlot23.isRangeZeroBaselineVisible();
        boolean boolean30 = categoryPlot23.isDomainGridlinesVisible();
        keyedObjects0.addObject((java.lang.Comparable) (short) 100, (java.lang.Object) categoryPlot23);
        org.jfree.data.category.CategoryDataset categoryDataset32 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis34 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float35 = categoryAxis34.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis36 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer39 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color40 = java.awt.Color.BLUE;
        lineAndShapeRenderer39.setBaseItemLabelPaint((java.awt.Paint) color40);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator45 = lineAndShapeRenderer39.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot46 = new org.jfree.chart.plot.CategoryPlot(categoryDataset32, categoryAxis34, valueAxis36, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer39);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent47 = new org.jfree.chart.event.PlotChangeEvent((org.jfree.chart.plot.Plot) categoryPlot46);
        java.awt.Stroke stroke48 = categoryPlot46.getRangeMinorGridlineStroke();
        java.awt.Paint paint49 = categoryPlot46.getDomainGridlinePaint();
        boolean boolean50 = keyedObjects0.equals((java.lang.Object) paint49);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryPlot23 and categoryPlot46", categoryPlot23.equals(categoryPlot46) ? categoryPlot23.hashCode() == categoryPlot46.hashCode() : true);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test057");
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
        org.jfree.data.category.CategoryDataset categoryDataset27 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis29 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float30 = categoryAxis29.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis31 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer34 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color35 = java.awt.Color.BLUE;
        lineAndShapeRenderer34.setBaseItemLabelPaint((java.awt.Paint) color35);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator40 = lineAndShapeRenderer34.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot41 = new org.jfree.chart.plot.CategoryPlot(categoryDataset27, categoryAxis29, valueAxis31, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer34);
        boolean boolean42 = categoryPlot41.canSelectByPoint();
        org.jfree.chart.axis.AxisLocation axisLocation44 = categoryPlot41.getDomainAxisLocation((int) (byte) 0);
        categoryPlot21.setDomainAxisLocation(axisLocation44);
        org.jfree.data.category.DefaultCategoryDataset defaultCategoryDataset47 = new org.jfree.data.category.DefaultCategoryDataset();
        int int49 = defaultCategoryDataset47.getColumnIndex((java.lang.Comparable) 3.0d);
        categoryPlot21.setDataset((int) 'a', (org.jfree.data.category.CategoryDataset) defaultCategoryDataset47);
        java.util.List list51 = defaultCategoryDataset47.getRowKeys();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryPlot21 and categoryPlot41", categoryPlot21.equals(categoryPlot41) ? categoryPlot21.hashCode() == categoryPlot41.hashCode() : true);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test058");
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
        java.awt.Color color35 = org.jfree.chart.ChartColor.DARK_MAGENTA;
        barRenderer0.setShadowPaint((java.awt.Paint) color35);
        barRenderer0.setBaseItemLabelsVisible(false, false);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer43 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color44 = java.awt.Color.BLUE;
        lineAndShapeRenderer43.setBaseItemLabelPaint((java.awt.Paint) color44);
        java.awt.Shape shape46 = lineAndShapeRenderer43.getBaseShape();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer49 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator50 = null;
        lineAndShapeRenderer49.setBaseURLGenerator(categoryURLGenerator50);
        java.awt.Shape shape53 = lineAndShapeRenderer49.getLegendShape(0);
        lineAndShapeRenderer49.setAutoPopulateSeriesStroke(false);
        java.awt.Font font57 = lineAndShapeRenderer49.getSeriesItemLabelFont(0);
        lineAndShapeRenderer49.setUseSeriesOffset(true);
        java.awt.Font font61 = null;
        lineAndShapeRenderer49.setSeriesItemLabelFont((int) (short) 1, font61, false);
        java.awt.Stroke stroke67 = lineAndShapeRenderer49.getItemOutlineStroke(0, 1, false);
        lineAndShapeRenderer43.setBaseStroke(stroke67, true);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition70 = lineAndShapeRenderer43.getBasePositiveItemLabelPosition();
        barRenderer0.setSeriesPositiveItemLabelPosition(3, itemLabelPosition70, true);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer75 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color76 = java.awt.Color.BLUE;
        lineAndShapeRenderer75.setBaseItemLabelPaint((java.awt.Paint) color76);
        java.awt.Shape shape78 = lineAndShapeRenderer75.getBaseShape();
        java.awt.Stroke stroke79 = lineAndShapeRenderer75.getBaseOutlineStroke();
        barRenderer0.setBaseOutlineStroke(stroke79, false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on itemLabelPosition30 and itemLabelPosition70", itemLabelPosition30.equals(itemLabelPosition70) ? itemLabelPosition30.hashCode() == itemLabelPosition70.hashCode() : true);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test059");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color3 = java.awt.Color.BLUE;
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color3);
        java.awt.Stroke stroke6 = lineAndShapeRenderer2.getSeriesOutlineStroke((int) (short) 1);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition8 = lineAndShapeRenderer2.getSeriesNegativeItemLabelPosition((int) (short) 1);
        lineAndShapeRenderer2.setSeriesCreateEntities((int) (short) 1, (java.lang.Boolean) false, false);
        lineAndShapeRenderer2.setAutoPopulateSeriesOutlineStroke(true);
        boolean boolean15 = lineAndShapeRenderer2.getBaseShapesFilled();
        boolean boolean18 = lineAndShapeRenderer2.getItemShapeFilled((int) (byte) -1, (int) (byte) 10);
        org.jfree.chart.renderer.category.BarRenderer barRenderer19 = new org.jfree.chart.renderer.category.BarRenderer();
        boolean boolean20 = barRenderer19.isDrawBarOutline();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition21 = barRenderer19.getBasePositiveItemLabelPosition();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition22 = barRenderer19.getPositiveItemLabelPositionFallback();
        org.jfree.chart.LegendItem legendItem24 = new org.jfree.chart.LegendItem("hi!");
        java.text.AttributedString attributedString25 = legendItem24.getAttributedLabel();
        java.lang.String str26 = legendItem24.getDescription();
        legendItem24.setSeriesKey((java.lang.Comparable) (byte) 100);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer31 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color32 = java.awt.Color.BLUE;
        lineAndShapeRenderer31.setBaseItemLabelPaint((java.awt.Paint) color32);
        java.awt.Shape shape34 = lineAndShapeRenderer31.getBaseShape();
        org.jfree.chart.entity.ChartEntity chartEntity36 = new org.jfree.chart.entity.ChartEntity(shape34, "");
        legendItem24.setShape(shape34);
        barRenderer19.setBaseShape(shape34, true);
        lineAndShapeRenderer2.setBaseShape(shape34);
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
        org.jfree.chart.event.PlotChangeListener plotChangeListener57 = null;
        categoryPlot55.addChangeListener(plotChangeListener57);
        java.awt.Color color59 = org.jfree.chart.ChartColor.VERY_DARK_BLUE;
        categoryPlot55.setOutlinePaint((java.awt.Paint) color59);
        boolean boolean61 = categoryPlot55.isDomainGridlinesVisible();
        org.jfree.chart.entity.PlotEntity plotEntity63 = new org.jfree.chart.entity.PlotEntity(shape34, (org.jfree.chart.plot.Plot) categoryPlot55, "SortOrder.ASCENDING");
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on lineAndShapeRenderer31 and lineAndShapeRenderer2.", lineAndShapeRenderer31.equals(lineAndShapeRenderer2) == lineAndShapeRenderer2.equals(lineAndShapeRenderer31));
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test060");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator3 = null;
        lineAndShapeRenderer2.setBaseURLGenerator(categoryURLGenerator3);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator6 = null;
        lineAndShapeRenderer2.setSeriesToolTipGenerator(10, categoryToolTipGenerator6);
        boolean boolean8 = lineAndShapeRenderer2.getBaseSeriesVisibleInLegend();
        java.awt.Stroke stroke10 = null;
        lineAndShapeRenderer2.setSeriesStroke((int) 'a', stroke10, true);
        java.awt.Font font14 = lineAndShapeRenderer2.getSeriesItemLabelFont(0);
        org.jfree.data.category.CategoryDataset categoryDataset15 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis17 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float18 = categoryAxis17.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis19 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer22 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color23 = java.awt.Color.BLUE;
        lineAndShapeRenderer22.setBaseItemLabelPaint((java.awt.Paint) color23);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator28 = lineAndShapeRenderer22.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot29 = new org.jfree.chart.plot.CategoryPlot(categoryDataset15, categoryAxis17, valueAxis19, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer22);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent30 = new org.jfree.chart.event.PlotChangeEvent((org.jfree.chart.plot.Plot) categoryPlot29);
        org.jfree.chart.axis.ValueAxis valueAxis32 = lineAndShapeRenderer2.getRangeAxis(categoryPlot29, (int) (byte) 100);
        int int33 = lineAndShapeRenderer2.getPassCount();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer37 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator38 = null;
        lineAndShapeRenderer37.setBaseURLGenerator(categoryURLGenerator38);
        java.awt.Shape shape41 = lineAndShapeRenderer37.getLegendShape(0);
        lineAndShapeRenderer37.setAutoPopulateSeriesStroke(false);
        java.awt.Font font45 = lineAndShapeRenderer37.getSeriesItemLabelFont(0);
        lineAndShapeRenderer37.setUseSeriesOffset(true);
        java.awt.Font font49 = null;
        lineAndShapeRenderer37.setSeriesItemLabelFont((int) (short) 1, font49, false);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator55 = lineAndShapeRenderer37.getURLGenerator(4, (int) (short) 100, false);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator56 = null;
        lineAndShapeRenderer37.setBaseToolTipGenerator(categoryToolTipGenerator56);
        org.jfree.data.category.CategoryDataset categoryDataset59 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis61 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float62 = categoryAxis61.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis63 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer66 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color67 = java.awt.Color.BLUE;
        lineAndShapeRenderer66.setBaseItemLabelPaint((java.awt.Paint) color67);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator72 = lineAndShapeRenderer66.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot73 = new org.jfree.chart.plot.CategoryPlot(categoryDataset59, categoryAxis61, valueAxis63, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer66);
        org.jfree.chart.axis.CategoryAxis categoryAxis74 = categoryPlot73.getDomainAxis();
        java.awt.Stroke stroke75 = categoryPlot73.getRangeCrosshairStroke();
        lineAndShapeRenderer37.setSeriesOutlineStroke(1, stroke75, false);
        lineAndShapeRenderer2.setSeriesStroke((int) ' ', stroke75);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryPlot29 and categoryPlot73", categoryPlot29.equals(categoryPlot73) ? categoryPlot29.hashCode() == categoryPlot73.hashCode() : true);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test061");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer5 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color6 = java.awt.Color.BLUE;
        lineAndShapeRenderer5.setBaseItemLabelPaint((java.awt.Paint) color6);
        java.awt.Stroke stroke9 = lineAndShapeRenderer5.getSeriesStroke((int) (short) 10);
        org.jfree.chart.plot.CategoryPlot categoryPlot10 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer5);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo12 = null;
        org.jfree.data.category.CategoryDataset categoryDataset13 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis15 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float16 = categoryAxis15.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis17 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer20 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color21 = java.awt.Color.BLUE;
        lineAndShapeRenderer20.setBaseItemLabelPaint((java.awt.Paint) color21);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator26 = lineAndShapeRenderer20.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot27 = new org.jfree.chart.plot.CategoryPlot(categoryDataset13, categoryAxis15, valueAxis17, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer20);
        org.jfree.chart.axis.CategoryAxis categoryAxis28 = categoryPlot27.getDomainAxis();
        org.jfree.chart.axis.ValueAxis valueAxis29 = null;
        org.jfree.data.Range range30 = categoryPlot27.getDataRange(valueAxis29);
        org.jfree.chart.axis.AxisLocation axisLocation31 = categoryPlot27.getRangeAxisLocation();
        categoryPlot27.configureDomainAxes();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo35 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer38 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Graphics2D graphics2D39 = null;
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
        org.jfree.chart.axis.ValueAxis valueAxis58 = null;
        org.jfree.chart.plot.Marker marker59 = null;
        java.awt.geom.Rectangle2D rectangle2D60 = null;
        lineAndShapeRenderer38.drawRangeMarker(graphics2D39, categoryPlot54, valueAxis58, marker59, rectangle2D60);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo63 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer66 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator67 = null;
        lineAndShapeRenderer66.setBaseURLGenerator(categoryURLGenerator67);
        java.awt.Shape shape70 = lineAndShapeRenderer66.getLegendShape(0);
        lineAndShapeRenderer66.setAutoPopulateSeriesStroke(false);
        java.awt.Font font74 = lineAndShapeRenderer66.getSeriesItemLabelFont(0);
        lineAndShapeRenderer66.setUseSeriesOffset(true);
        java.awt.Shape shape78 = null;
        lineAndShapeRenderer66.setSeriesShape((int) (short) 10, shape78, true);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition81 = lineAndShapeRenderer66.getBasePositiveItemLabelPosition();
        java.awt.Graphics2D graphics2D82 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation83 = null;
        java.awt.geom.Rectangle2D rectangle2D84 = null;
        java.awt.geom.Rectangle2D rectangle2D85 = null;
        org.jfree.chart.util.RectangleInsets rectangleInsets86 = org.jfree.chart.axis.Axis.DEFAULT_AXIS_LABEL_INSETS;
        double double88 = rectangleInsets86.calculateBottomInset(0.0d);
        double double90 = rectangleInsets86.trimWidth((double) '#');
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType91 = null;
        org.jfree.chart.util.RectangleAnchor rectangleAnchor92 = null;
        java.awt.geom.Point2D point2D93 = lineAndShapeRenderer66.calculateDomainMarkerTextAnchorPoint(graphics2D82, plotOrientation83, rectangle2D84, rectangle2D85, rectangleInsets86, lengthAdjustmentType91, rectangleAnchor92);
        categoryPlot54.panDomainAxes((double) (-1L), plotRenderingInfo63, point2D93);
        categoryPlot27.zoomRangeAxes((double) 11, (double) (-1.0f), plotRenderingInfo35, point2D93);
        categoryPlot10.zoomDomainAxes(14.0d, plotRenderingInfo12, point2D93, false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryPlot27 and categoryPlot54", categoryPlot27.equals(categoryPlot54) ? categoryPlot27.hashCode() == categoryPlot54.hashCode() : true);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test062");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float3 = categoryAxis2.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis4 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer7 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color8 = java.awt.Color.BLUE;
        lineAndShapeRenderer7.setBaseItemLabelPaint((java.awt.Paint) color8);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator13 = lineAndShapeRenderer7.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot14 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis2, valueAxis4, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer7);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent15 = new org.jfree.chart.event.PlotChangeEvent((org.jfree.chart.plot.Plot) categoryPlot14);
        org.jfree.data.category.CategoryDataset categoryDataset16 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis18 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float19 = categoryAxis18.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis20 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer23 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color24 = java.awt.Color.BLUE;
        lineAndShapeRenderer23.setBaseItemLabelPaint((java.awt.Paint) color24);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator29 = lineAndShapeRenderer23.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot30 = new org.jfree.chart.plot.CategoryPlot(categoryDataset16, categoryAxis18, valueAxis20, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer23);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer31 = categoryPlot30.getRenderer();
        categoryItemRenderer31.setSeriesItemLabelsVisible((int) 'a', (java.lang.Boolean) true, true);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator37 = null;
        categoryItemRenderer31.setSeriesToolTipGenerator((int) (byte) 100, categoryToolTipGenerator37, false);
        org.jfree.chart.JFreeChart jFreeChart40 = null;
        org.jfree.chart.event.ChartChangeEventType chartChangeEventType41 = org.jfree.chart.event.ChartChangeEventType.NEW_DATASET;
        org.jfree.chart.event.ChartChangeEvent chartChangeEvent42 = new org.jfree.chart.event.ChartChangeEvent((java.lang.Object) categoryItemRenderer31, jFreeChart40, chartChangeEventType41);
        org.jfree.chart.event.ChartChangeEventType chartChangeEventType43 = chartChangeEvent42.getType();
        plotChangeEvent15.setType(chartChangeEventType43);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on lineAndShapeRenderer7 and lineAndShapeRenderer23.", lineAndShapeRenderer7.equals(lineAndShapeRenderer23) == lineAndShapeRenderer23.equals(lineAndShapeRenderer7));
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test063");
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
        int int16 = categoryAxis15.getCategoryLabelPositionOffset();
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
        org.jfree.chart.axis.CategoryAxis categoryAxis34 = categoryPlot31.getDomainAxisForDataset(2);
        java.awt.Font font35 = categoryAxis34.getTickLabelFont();
        java.awt.Paint paint36 = categoryAxis34.getTickLabelPaint();
        categoryAxis34.setMinorTickMarksVisible(false);
        double double39 = categoryAxis34.getLowerMargin();
        org.jfree.chart.axis.CategoryLabelPositions categoryLabelPositions40 = categoryAxis34.getCategoryLabelPositions();
        categoryAxis15.setCategoryLabelPositions(categoryLabelPositions40);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryPlot14 and categoryPlot31", categoryPlot14.equals(categoryPlot31) ? categoryPlot14.hashCode() == categoryPlot31.hashCode() : true);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test064");
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
        barRenderer0.setSeriesItemLabelsVisible(10, true);
        barRenderer0.setBase((double) 0);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition38 = barRenderer0.getPositiveItemLabelPositionFallback();
        org.jfree.chart.renderer.category.BarRenderer barRenderer39 = new org.jfree.chart.renderer.category.BarRenderer();
        boolean boolean40 = barRenderer39.isDrawBarOutline();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer43 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color44 = java.awt.Color.BLUE;
        lineAndShapeRenderer43.setBaseItemLabelPaint((java.awt.Paint) color44);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator49 = lineAndShapeRenderer43.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition50 = lineAndShapeRenderer43.getBaseNegativeItemLabelPosition();
        barRenderer39.setNegativeItemLabelPositionFallback(itemLabelPosition50);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition52 = barRenderer39.getPositiveItemLabelPositionFallback();
        double double53 = barRenderer39.getMaximumBarWidth();
        org.jfree.chart.util.StandardGradientPaintTransformer standardGradientPaintTransformer54 = new org.jfree.chart.util.StandardGradientPaintTransformer();
        java.lang.Object obj55 = standardGradientPaintTransformer54.clone();
        barRenderer39.setGradientPaintTransformer((org.jfree.chart.util.GradientPaintTransformer) standardGradientPaintTransformer54);
        barRenderer0.setGradientPaintTransformer((org.jfree.chart.util.GradientPaintTransformer) standardGradientPaintTransformer54);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on itemLabelPosition11 and itemLabelPosition50", itemLabelPosition11.equals(itemLabelPosition50) ? itemLabelPosition11.hashCode() == itemLabelPosition50.hashCode() : true);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test065");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator3 = null;
        lineAndShapeRenderer2.setBaseURLGenerator(categoryURLGenerator3);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator6 = null;
        lineAndShapeRenderer2.setSeriesToolTipGenerator(10, categoryToolTipGenerator6);
        boolean boolean8 = lineAndShapeRenderer2.getBaseSeriesVisibleInLegend();
        java.awt.Stroke stroke10 = null;
        lineAndShapeRenderer2.setSeriesStroke((int) 'a', stroke10, true);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator13 = lineAndShapeRenderer2.getLegendItemURLGenerator();
        org.jfree.data.category.CategoryDataset categoryDataset14 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis16 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float17 = categoryAxis16.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis18 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer21 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color22 = java.awt.Color.BLUE;
        lineAndShapeRenderer21.setBaseItemLabelPaint((java.awt.Paint) color22);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator27 = lineAndShapeRenderer21.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot28 = new org.jfree.chart.plot.CategoryPlot(categoryDataset14, categoryAxis16, valueAxis18, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer21);
        java.lang.Object obj29 = categoryPlot28.clone();
        java.awt.Stroke stroke30 = categoryPlot28.getDomainCrosshairStroke();
        lineAndShapeRenderer2.setPlot(categoryPlot28);
        java.awt.Font font35 = lineAndShapeRenderer2.getItemLabelFont(3, (int) (short) 10, false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryPlot28 and obj29", categoryPlot28.equals(obj29) ? categoryPlot28.hashCode() == obj29.hashCode() : true);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test066");
        org.jfree.chart.renderer.category.BarRenderer barRenderer0 = new org.jfree.chart.renderer.category.BarRenderer();
        boolean boolean1 = barRenderer0.isDrawBarOutline();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition2 = barRenderer0.getBasePositiveItemLabelPosition();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition3 = barRenderer0.getPositiveItemLabelPositionFallback();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer6 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator7 = null;
        lineAndShapeRenderer6.setBaseURLGenerator(categoryURLGenerator7);
        java.awt.Paint paint10 = lineAndShapeRenderer6.getSeriesOutlinePaint(0);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer13 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        boolean boolean15 = lineAndShapeRenderer13.isSeriesVisibleInLegend(1);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator17 = null;
        lineAndShapeRenderer13.setSeriesURLGenerator(0, categoryURLGenerator17, false);
        java.awt.Color color20 = org.jfree.chart.ChartColor.LIGHT_GREEN;
        java.awt.color.ColorSpace colorSpace21 = color20.getColorSpace();
        lineAndShapeRenderer13.setBaseFillPaint((java.awt.Paint) color20);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer25 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator26 = null;
        lineAndShapeRenderer25.setBaseURLGenerator(categoryURLGenerator26);
        java.awt.Shape shape29 = lineAndShapeRenderer25.getLegendShape(0);
        lineAndShapeRenderer25.setAutoPopulateSeriesStroke(false);
        java.awt.Font font33 = lineAndShapeRenderer25.getSeriesItemLabelFont(0);
        lineAndShapeRenderer25.setUseSeriesOffset(true);
        java.awt.Font font37 = null;
        lineAndShapeRenderer25.setSeriesItemLabelFont((int) (short) 1, font37, false);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition41 = lineAndShapeRenderer25.getSeriesPositiveItemLabelPosition((int) (byte) 100);
        lineAndShapeRenderer13.setBasePositiveItemLabelPosition(itemLabelPosition41, false);
        lineAndShapeRenderer6.setBasePositiveItemLabelPosition(itemLabelPosition41, true);
        barRenderer0.setNegativeItemLabelPositionFallback(itemLabelPosition41);
        barRenderer0.setBaseSeriesVisible(false, false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on itemLabelPosition2 and itemLabelPosition41", itemLabelPosition2.equals(itemLabelPosition41) ? itemLabelPosition2.hashCode() == itemLabelPosition41.hashCode() : true);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test067");
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
        org.jfree.chart.axis.ValueAxis valueAxis16 = null;
        org.jfree.data.Range range17 = categoryPlot14.getDataRange(valueAxis16);
        org.jfree.chart.axis.AxisLocation axisLocation18 = categoryPlot14.getRangeAxisLocation();
        org.jfree.data.category.CategoryDataset categoryDataset19 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis21 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float22 = categoryAxis21.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis23 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer26 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color27 = java.awt.Color.BLUE;
        lineAndShapeRenderer26.setBaseItemLabelPaint((java.awt.Paint) color27);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator32 = lineAndShapeRenderer26.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot33 = new org.jfree.chart.plot.CategoryPlot(categoryDataset19, categoryAxis21, valueAxis23, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer26);
        boolean boolean34 = categoryPlot33.canSelectByPoint();
        org.jfree.chart.axis.AxisLocation axisLocation36 = categoryPlot33.getDomainAxisLocation((int) (byte) 0);
        boolean boolean37 = categoryPlot33.isRangePannable();
        org.jfree.chart.plot.PlotOrientation plotOrientation38 = categoryPlot33.getOrientation();
        org.jfree.chart.util.RectangleEdge rectangleEdge39 = org.jfree.chart.plot.Plot.resolveDomainAxisLocation(axisLocation18, plotOrientation38);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryPlot14 and categoryPlot33", categoryPlot14.equals(categoryPlot33) ? categoryPlot14.hashCode() == categoryPlot33.hashCode() : true);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test068");
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
        boolean boolean27 = categoryPlot21.canSelectByPoint();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent28 = null;
        categoryPlot21.datasetChanged(datasetChangeEvent28);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer32 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Graphics2D graphics2D33 = null;
        org.jfree.data.category.CategoryDataset categoryDataset34 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis36 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float37 = categoryAxis36.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis38 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer41 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color42 = java.awt.Color.BLUE;
        lineAndShapeRenderer41.setBaseItemLabelPaint((java.awt.Paint) color42);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator47 = lineAndShapeRenderer41.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot48 = new org.jfree.chart.plot.CategoryPlot(categoryDataset34, categoryAxis36, valueAxis38, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer41);
        org.jfree.chart.axis.CategoryAxis categoryAxis49 = categoryPlot48.getDomainAxis();
        org.jfree.chart.axis.ValueAxis valueAxis50 = null;
        org.jfree.data.Range range51 = categoryPlot48.getDataRange(valueAxis50);
        org.jfree.chart.axis.ValueAxis valueAxis52 = null;
        org.jfree.chart.plot.Marker marker53 = null;
        java.awt.geom.Rectangle2D rectangle2D54 = null;
        lineAndShapeRenderer32.drawRangeMarker(graphics2D33, categoryPlot48, valueAxis52, marker53, rectangle2D54);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator57 = lineAndShapeRenderer32.getSeriesToolTipGenerator((int) 'a');
        boolean boolean58 = categoryPlot21.equals((java.lang.Object) lineAndShapeRenderer32);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator60 = null;
        lineAndShapeRenderer32.setSeriesToolTipGenerator(0, categoryToolTipGenerator60, true);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryPlot21 and categoryPlot48", categoryPlot21.equals(categoryPlot48) ? categoryPlot21.hashCode() == categoryPlot48.hashCode() : true);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test069");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color3 = java.awt.Color.BLUE;
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color3);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator8 = lineAndShapeRenderer2.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator9 = null;
        lineAndShapeRenderer2.setLegendItemURLGenerator(categorySeriesLabelGenerator9);
        java.awt.Paint paint12 = lineAndShapeRenderer2.getSeriesPaint(1);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer16 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color17 = java.awt.Color.BLUE;
        lineAndShapeRenderer16.setBaseItemLabelPaint((java.awt.Paint) color17);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator22 = lineAndShapeRenderer16.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator23 = null;
        lineAndShapeRenderer16.setLegendItemURLGenerator(categorySeriesLabelGenerator23);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator28 = lineAndShapeRenderer16.getToolTipGenerator((int) '#', (int) (byte) 10, false);
        lineAndShapeRenderer16.setBaseSeriesVisible(true, true);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition33 = lineAndShapeRenderer16.getSeriesNegativeItemLabelPosition((int) (byte) -1);
        lineAndShapeRenderer2.setSeriesPositiveItemLabelPosition(100, itemLabelPosition33, false);
        org.jfree.chart.LegendItem legendItem38 = new org.jfree.chart.LegendItem("hi!");
        java.awt.Color color42 = java.awt.Color.getHSBColor((float) (short) 1, (float) ' ', 0.0f);
        legendItem38.setLinePaint((java.awt.Paint) color42);
        boolean boolean44 = legendItem38.isShapeOutlineVisible();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer47 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color48 = java.awt.Color.BLUE;
        lineAndShapeRenderer47.setBaseItemLabelPaint((java.awt.Paint) color48);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator53 = lineAndShapeRenderer47.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition55 = lineAndShapeRenderer47.getSeriesPositiveItemLabelPosition((int) 'a');
        java.awt.Shape shape57 = lineAndShapeRenderer47.lookupLegendShape(8);
        legendItem38.setLine(shape57);
        lineAndShapeRenderer2.setSeriesShape(0, shape57);
        org.jfree.data.category.CategoryDataset categoryDataset61 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis63 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float64 = categoryAxis63.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis65 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer68 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color69 = java.awt.Color.BLUE;
        lineAndShapeRenderer68.setBaseItemLabelPaint((java.awt.Paint) color69);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator74 = lineAndShapeRenderer68.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot75 = new org.jfree.chart.plot.CategoryPlot(categoryDataset61, categoryAxis63, valueAxis65, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer68);
        boolean boolean76 = categoryPlot75.canSelectByPoint();
        org.jfree.chart.LegendItemCollection legendItemCollection77 = categoryPlot75.getFixedLegendItems();
        java.awt.Stroke stroke78 = categoryPlot75.getRangeGridlineStroke();
        lineAndShapeRenderer2.setSeriesOutlineStroke((int) (short) 1, stroke78);
        java.lang.Object obj80 = lineAndShapeRenderer2.clone();
        java.awt.Stroke stroke82 = org.jfree.chart.axis.Axis.DEFAULT_TICK_MARK_STROKE;
        lineAndShapeRenderer2.setSeriesStroke((int) '4', stroke82, false);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on lineAndShapeRenderer16 and obj80.", lineAndShapeRenderer16.equals(obj80) == obj80.equals(lineAndShapeRenderer16));
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test070");
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
        org.jfree.data.category.CategoryDataset categoryDataset27 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis29 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float30 = categoryAxis29.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis31 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer34 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color35 = java.awt.Color.BLUE;
        lineAndShapeRenderer34.setBaseItemLabelPaint((java.awt.Paint) color35);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator40 = lineAndShapeRenderer34.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot41 = new org.jfree.chart.plot.CategoryPlot(categoryDataset27, categoryAxis29, valueAxis31, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer34);
        org.jfree.chart.axis.AxisLocation axisLocation42 = org.jfree.chart.axis.AxisLocation.TOP_OR_LEFT;
        categoryPlot41.setRangeAxisLocation(axisLocation42);
        categoryPlot21.setRangeAxisLocation(axisLocation42, true);
        java.awt.Color color46 = org.jfree.chart.ChartColor.LIGHT_GREEN;
        categoryPlot21.setRangeMinorGridlinePaint((java.awt.Paint) color46);
        categoryPlot21.setRangeMinorGridlinesVisible(true);
        org.jfree.chart.util.Layer layer50 = null;
        java.util.Collection collection51 = categoryPlot21.getRangeMarkers(layer50);
        org.jfree.chart.LegendItemCollection legendItemCollection52 = categoryPlot21.getLegendItems();
        org.jfree.chart.axis.AxisLocation axisLocation53 = categoryPlot21.getRangeAxisLocation();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer56 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color57 = java.awt.Color.BLUE;
        lineAndShapeRenderer56.setBaseItemLabelPaint((java.awt.Paint) color57);
        java.awt.Stroke stroke60 = lineAndShapeRenderer56.getSeriesOutlineStroke((int) (short) 1);
        org.jfree.data.category.CategoryDataset categoryDataset61 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis63 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float64 = categoryAxis63.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis65 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer68 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color69 = java.awt.Color.BLUE;
        lineAndShapeRenderer68.setBaseItemLabelPaint((java.awt.Paint) color69);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator74 = lineAndShapeRenderer68.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot75 = new org.jfree.chart.plot.CategoryPlot(categoryDataset61, categoryAxis63, valueAxis65, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer68);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer76 = categoryPlot75.getRenderer();
        org.jfree.chart.axis.ValueAxis valueAxis78 = lineAndShapeRenderer56.getRangeAxis(categoryPlot75, (int) '4');
        org.jfree.chart.plot.PlotOrientation plotOrientation79 = categoryPlot75.getOrientation();
        java.lang.String str80 = plotOrientation79.toString();
        org.jfree.chart.util.RectangleEdge rectangleEdge81 = org.jfree.chart.plot.Plot.resolveDomainAxisLocation(axisLocation53, plotOrientation79);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryPlot41 and categoryPlot75", categoryPlot41.equals(categoryPlot75) ? categoryPlot41.hashCode() == categoryPlot75.hashCode() : true);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test071");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer3 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color4 = java.awt.Color.BLUE;
        lineAndShapeRenderer3.setBaseItemLabelPaint((java.awt.Paint) color4);
        java.awt.Stroke stroke7 = lineAndShapeRenderer3.getSeriesOutlineStroke((int) (short) 1);
        org.jfree.data.category.CategoryDataset categoryDataset8 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis10 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float11 = categoryAxis10.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis12 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer15 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color16 = java.awt.Color.BLUE;
        lineAndShapeRenderer15.setBaseItemLabelPaint((java.awt.Paint) color16);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator21 = lineAndShapeRenderer15.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot22 = new org.jfree.chart.plot.CategoryPlot(categoryDataset8, categoryAxis10, valueAxis12, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer15);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer23 = categoryPlot22.getRenderer();
        org.jfree.chart.axis.ValueAxis valueAxis25 = lineAndShapeRenderer3.getRangeAxis(categoryPlot22, (int) '4');
        double double26 = categoryPlot22.getRangeCrosshairValue();
        java.awt.Paint paint27 = categoryPlot22.getRangeZeroBaselinePaint();
        int int28 = categoryPlot22.getRangeAxisCount();
        java.awt.Color color29 = java.awt.Color.BLUE;
        categoryPlot22.setRangeMinorGridlinePaint((java.awt.Paint) color29);
        java.awt.Stroke stroke31 = categoryPlot22.getRangeMinorGridlineStroke();
        float float32 = categoryPlot22.getBackgroundAlpha();
        org.jfree.data.category.DefaultCategoryDataset defaultCategoryDataset33 = new org.jfree.data.category.DefaultCategoryDataset();
        int int35 = defaultCategoryDataset33.getColumnIndex((java.lang.Comparable) 3.0d);
        int int37 = defaultCategoryDataset33.getRowIndex((java.lang.Comparable) (byte) 10);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer40 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color41 = java.awt.Color.BLUE;
        lineAndShapeRenderer40.setBaseItemLabelPaint((java.awt.Paint) color41);
        java.awt.Stroke stroke44 = lineAndShapeRenderer40.getSeriesOutlineStroke((int) (short) 1);
        org.jfree.data.category.CategoryDataset categoryDataset45 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis47 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float48 = categoryAxis47.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis49 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer52 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color53 = java.awt.Color.BLUE;
        lineAndShapeRenderer52.setBaseItemLabelPaint((java.awt.Paint) color53);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator58 = lineAndShapeRenderer52.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot59 = new org.jfree.chart.plot.CategoryPlot(categoryDataset45, categoryAxis47, valueAxis49, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer52);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer60 = categoryPlot59.getRenderer();
        org.jfree.chart.axis.ValueAxis valueAxis62 = lineAndShapeRenderer40.getRangeAxis(categoryPlot59, (int) '4');
        double double63 = categoryPlot59.getRangeCrosshairValue();
        java.awt.Paint paint64 = categoryPlot59.getRangeZeroBaselinePaint();
        int int65 = categoryPlot59.getRangeAxisCount();
        java.awt.Color color66 = java.awt.Color.BLUE;
        categoryPlot59.setRangeMinorGridlinePaint((java.awt.Paint) color66);
        java.awt.Stroke stroke68 = categoryPlot59.getRangeMinorGridlineStroke();
        float float69 = categoryPlot59.getBackgroundAlpha();
        defaultCategoryDataset33.addChangeListener((org.jfree.data.event.DatasetChangeListener) categoryPlot59);
        org.jfree.data.category.CategoryDatasetSelectionState categoryDatasetSelectionState71 = defaultCategoryDataset33.getSelectionState();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer72 = categoryPlot22.getRendererForDataset((org.jfree.data.category.CategoryDataset) defaultCategoryDataset33);
        org.jfree.data.KeyedObject keyedObject73 = new org.jfree.data.KeyedObject((java.lang.Comparable) (byte) 1, (java.lang.Object) categoryPlot22);
        java.awt.Color color74 = java.awt.Color.black;
        boolean boolean75 = keyedObject73.equals((java.lang.Object) color74);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryPlot22 and categoryPlot59", categoryPlot22.equals(categoryPlot59) ? categoryPlot22.hashCode() == categoryPlot59.hashCode() : true);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test072");
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
        org.jfree.data.category.CategoryDataset categoryDataset27 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis29 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float30 = categoryAxis29.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis31 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer34 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color35 = java.awt.Color.BLUE;
        lineAndShapeRenderer34.setBaseItemLabelPaint((java.awt.Paint) color35);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator40 = lineAndShapeRenderer34.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot41 = new org.jfree.chart.plot.CategoryPlot(categoryDataset27, categoryAxis29, valueAxis31, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer34);
        boolean boolean42 = categoryPlot41.canSelectByPoint();
        org.jfree.chart.axis.AxisLocation axisLocation44 = categoryPlot41.getDomainAxisLocation((int) (byte) 0);
        categoryPlot21.setDomainAxisLocation(axisLocation44);
        org.jfree.data.category.DefaultCategoryDataset defaultCategoryDataset47 = new org.jfree.data.category.DefaultCategoryDataset();
        int int49 = defaultCategoryDataset47.getColumnIndex((java.lang.Comparable) 3.0d);
        categoryPlot21.setDataset((int) 'a', (org.jfree.data.category.CategoryDataset) defaultCategoryDataset47);
        org.jfree.data.category.AbstractCategoryDataset abstractCategoryDataset51 = new org.jfree.data.category.AbstractCategoryDataset();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer54 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color55 = java.awt.Color.BLUE;
        lineAndShapeRenderer54.setBaseItemLabelPaint((java.awt.Paint) color55);
        java.awt.Stroke stroke58 = lineAndShapeRenderer54.getSeriesOutlineStroke((int) (short) 1);
        org.jfree.data.category.CategoryDataset categoryDataset59 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis61 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float62 = categoryAxis61.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis63 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer66 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color67 = java.awt.Color.BLUE;
        lineAndShapeRenderer66.setBaseItemLabelPaint((java.awt.Paint) color67);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator72 = lineAndShapeRenderer66.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot73 = new org.jfree.chart.plot.CategoryPlot(categoryDataset59, categoryAxis61, valueAxis63, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer66);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer74 = categoryPlot73.getRenderer();
        org.jfree.chart.axis.ValueAxis valueAxis76 = lineAndShapeRenderer54.getRangeAxis(categoryPlot73, (int) '4');
        boolean boolean77 = categoryPlot73.isRangeCrosshairVisible();
        java.awt.Paint paint78 = categoryPlot73.getRangeZeroBaselinePaint();
        abstractCategoryDataset51.addChangeListener((org.jfree.data.event.DatasetChangeListener) categoryPlot73);
        org.jfree.data.general.DatasetGroup datasetGroup80 = abstractCategoryDataset51.getGroup();
        defaultCategoryDataset47.setGroup(datasetGroup80);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryPlot21 and categoryPlot41", categoryPlot21.equals(categoryPlot41) ? categoryPlot21.hashCode() == categoryPlot41.hashCode() : true);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test073");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color3 = java.awt.Color.BLUE;
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color3);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator8 = lineAndShapeRenderer2.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition9 = lineAndShapeRenderer2.getBaseNegativeItemLabelPosition();
        java.awt.Graphics2D graphics2D10 = null;
        java.awt.geom.Rectangle2D rectangle2D11 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer14 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color15 = java.awt.Color.BLUE;
        lineAndShapeRenderer14.setBaseItemLabelPaint((java.awt.Paint) color15);
        java.awt.Stroke stroke18 = lineAndShapeRenderer14.getSeriesOutlineStroke((int) (short) 1);
        org.jfree.data.category.CategoryDataset categoryDataset19 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis21 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float22 = categoryAxis21.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis23 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer26 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color27 = java.awt.Color.BLUE;
        lineAndShapeRenderer26.setBaseItemLabelPaint((java.awt.Paint) color27);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator32 = lineAndShapeRenderer26.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot33 = new org.jfree.chart.plot.CategoryPlot(categoryDataset19, categoryAxis21, valueAxis23, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer26);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer34 = categoryPlot33.getRenderer();
        org.jfree.chart.axis.ValueAxis valueAxis36 = lineAndShapeRenderer14.getRangeAxis(categoryPlot33, (int) '4');
        boolean boolean37 = categoryPlot33.isRangeCrosshairVisible();
        org.jfree.chart.util.RectangleEdge rectangleEdge38 = categoryPlot33.getDomainAxisEdge();
        org.jfree.data.category.CategoryDataset categoryDataset39 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo40 = null;
        org.jfree.chart.renderer.category.CategoryItemRendererState categoryItemRendererState41 = lineAndShapeRenderer2.initialise(graphics2D10, rectangle2D11, categoryPlot33, categoryDataset39, plotRenderingInfo40);
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
        org.jfree.chart.event.PlotChangeListener plotChangeListener59 = null;
        categoryPlot57.addChangeListener(plotChangeListener59);
        java.awt.Color color61 = org.jfree.chart.ChartColor.VERY_DARK_BLUE;
        categoryPlot57.setOutlinePaint((java.awt.Paint) color61);
        lineAndShapeRenderer2.setSeriesItemLabelPaint(0, (java.awt.Paint) color61, false);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier65 = lineAndShapeRenderer2.getDrawingSupplier();
        java.awt.Shape shape66 = drawingSupplier65.getNextShape();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on lineAndShapeRenderer14 and lineAndShapeRenderer2.", lineAndShapeRenderer14.equals(lineAndShapeRenderer2) == lineAndShapeRenderer2.equals(lineAndShapeRenderer14));
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test074");
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
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo29 = null;
        java.awt.geom.Point2D point2D30 = null;
        categoryPlot21.zoomDomainAxes(1.0d, (double) (-1L), plotRenderingInfo29, point2D30);
        categoryPlot21.setDomainCrosshairVisible(false);
        org.jfree.chart.axis.ValueAxis valueAxis35 = null;
        categoryPlot21.setRangeAxis(100, valueAxis35);
        org.jfree.data.category.CategoryDataset categoryDataset37 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis39 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float40 = categoryAxis39.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis41 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer44 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color45 = java.awt.Color.BLUE;
        lineAndShapeRenderer44.setBaseItemLabelPaint((java.awt.Paint) color45);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator50 = lineAndShapeRenderer44.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot51 = new org.jfree.chart.plot.CategoryPlot(categoryDataset37, categoryAxis39, valueAxis41, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer44);
        org.jfree.chart.axis.AxisLocation axisLocation52 = org.jfree.chart.axis.AxisLocation.TOP_OR_LEFT;
        categoryPlot51.setRangeAxisLocation(axisLocation52);
        categoryPlot51.configureDomainAxes();
        org.jfree.chart.util.SortOrder sortOrder55 = org.jfree.chart.util.SortOrder.ASCENDING;
        categoryPlot51.setRowRenderingOrder(sortOrder55);
        java.awt.geom.GeneralPath generalPath57 = null;
        java.awt.geom.Rectangle2D rectangle2D58 = null;
        org.jfree.chart.RenderingSource renderingSource59 = null;
        categoryPlot51.select(generalPath57, rectangle2D58, renderingSource59);
        org.jfree.chart.axis.AxisSpace axisSpace61 = categoryPlot51.getFixedRangeAxisSpace();
        categoryPlot21.setParent((org.jfree.chart.plot.Plot) categoryPlot51);
        int int63 = categoryPlot21.getRendererCount();
        org.jfree.chart.axis.AxisLocation axisLocation64 = categoryPlot21.getRangeAxisLocation();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer67 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color68 = java.awt.Color.BLUE;
        lineAndShapeRenderer67.setBaseItemLabelPaint((java.awt.Paint) color68);
        java.awt.Shape shape70 = lineAndShapeRenderer67.getBaseShape();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer73 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator74 = null;
        lineAndShapeRenderer73.setBaseURLGenerator(categoryURLGenerator74);
        java.awt.Shape shape77 = lineAndShapeRenderer73.getLegendShape(0);
        lineAndShapeRenderer73.setAutoPopulateSeriesStroke(false);
        java.awt.Font font81 = lineAndShapeRenderer73.getSeriesItemLabelFont(0);
        lineAndShapeRenderer73.setUseSeriesOffset(true);
        java.awt.Font font85 = null;
        lineAndShapeRenderer73.setSeriesItemLabelFont((int) (short) 1, font85, false);
        java.awt.Stroke stroke91 = lineAndShapeRenderer73.getItemOutlineStroke(0, 1, false);
        lineAndShapeRenderer67.setBaseStroke(stroke91, true);
        lineAndShapeRenderer67.clearSeriesStrokes(true);
        java.awt.Paint paint96 = lineAndShapeRenderer67.getBasePaint();
        java.lang.Boolean boolean98 = lineAndShapeRenderer67.getSeriesItemLabelsVisible(1);
        boolean boolean99 = axisLocation64.equals((java.lang.Object) lineAndShapeRenderer67);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryPlot21 and categoryPlot51", categoryPlot21.equals(categoryPlot51) ? categoryPlot21.hashCode() == categoryPlot51.hashCode() : true);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test075");
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
        org.jfree.data.category.CategoryDataset categoryDataset27 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis29 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float30 = categoryAxis29.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis31 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer34 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color35 = java.awt.Color.BLUE;
        lineAndShapeRenderer34.setBaseItemLabelPaint((java.awt.Paint) color35);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator40 = lineAndShapeRenderer34.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot41 = new org.jfree.chart.plot.CategoryPlot(categoryDataset27, categoryAxis29, valueAxis31, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer34);
        org.jfree.chart.axis.AxisLocation axisLocation42 = org.jfree.chart.axis.AxisLocation.TOP_OR_LEFT;
        categoryPlot41.setRangeAxisLocation(axisLocation42);
        categoryPlot21.setRangeAxisLocation(axisLocation42, true);
        org.jfree.chart.plot.PlotOrientation plotOrientation46 = categoryPlot21.getOrientation();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer49 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color50 = java.awt.Color.BLUE;
        lineAndShapeRenderer49.setBaseItemLabelPaint((java.awt.Paint) color50);
        java.awt.Stroke stroke53 = lineAndShapeRenderer49.getSeriesOutlineStroke((int) (short) 1);
        org.jfree.data.category.CategoryDataset categoryDataset54 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis56 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float57 = categoryAxis56.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis58 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer61 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color62 = java.awt.Color.BLUE;
        lineAndShapeRenderer61.setBaseItemLabelPaint((java.awt.Paint) color62);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator67 = lineAndShapeRenderer61.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot68 = new org.jfree.chart.plot.CategoryPlot(categoryDataset54, categoryAxis56, valueAxis58, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer61);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer69 = categoryPlot68.getRenderer();
        org.jfree.chart.axis.ValueAxis valueAxis71 = lineAndShapeRenderer49.getRangeAxis(categoryPlot68, (int) '4');
        double double72 = categoryPlot68.getRangeCrosshairValue();
        java.awt.Paint paint73 = categoryPlot68.getRangeZeroBaselinePaint();
        int int74 = categoryPlot68.getRangeAxisCount();
        java.awt.Color color75 = java.awt.Color.BLUE;
        categoryPlot68.setRangeMinorGridlinePaint((java.awt.Paint) color75);
        java.awt.Stroke stroke77 = categoryPlot68.getRangeMinorGridlineStroke();
        categoryPlot68.clearRangeMarkers();
        categoryPlot68.clearSelection();
        boolean boolean80 = categoryPlot68.isRangeCrosshairVisible();
        boolean boolean81 = plotOrientation46.equals((java.lang.Object) categoryPlot68);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryPlot21 and categoryPlot41", categoryPlot21.equals(categoryPlot41) ? categoryPlot21.hashCode() == categoryPlot41.hashCode() : true);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test076");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator3 = null;
        lineAndShapeRenderer2.setBaseURLGenerator(categoryURLGenerator3);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator6 = null;
        lineAndShapeRenderer2.setSeriesToolTipGenerator(10, categoryToolTipGenerator6);
        boolean boolean8 = lineAndShapeRenderer2.getBaseSeriesVisibleInLegend();
        java.awt.Stroke stroke10 = null;
        lineAndShapeRenderer2.setSeriesStroke((int) 'a', stroke10, true);
        java.awt.Font font14 = lineAndShapeRenderer2.getSeriesItemLabelFont(0);
        double double15 = lineAndShapeRenderer2.getItemMargin();
        lineAndShapeRenderer2.setUseOutlinePaint(true);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer21 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color22 = java.awt.Color.BLUE;
        lineAndShapeRenderer21.setBaseItemLabelPaint((java.awt.Paint) color22);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator27 = lineAndShapeRenderer21.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator28 = null;
        lineAndShapeRenderer21.setLegendItemURLGenerator(categorySeriesLabelGenerator28);
        java.awt.Paint paint31 = lineAndShapeRenderer21.getSeriesPaint(1);
        org.jfree.chart.renderer.RenderAttributes renderAttributes32 = lineAndShapeRenderer21.getSelectedItemAttributes();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator33 = null;
        lineAndShapeRenderer21.setLegendItemURLGenerator(categorySeriesLabelGenerator33);
        java.awt.Font font38 = lineAndShapeRenderer21.getItemLabelFont((int) '4', (int) 'a', false);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer42 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator43 = null;
        lineAndShapeRenderer42.setBaseURLGenerator(categoryURLGenerator43);
        java.awt.Shape shape46 = lineAndShapeRenderer42.getLegendShape(0);
        lineAndShapeRenderer42.setAutoPopulateSeriesStroke(false);
        java.awt.Font font50 = lineAndShapeRenderer42.getSeriesItemLabelFont(0);
        lineAndShapeRenderer42.setUseSeriesOffset(true);
        java.awt.Shape shape54 = null;
        lineAndShapeRenderer42.setSeriesShape((int) (short) 10, shape54, true);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition57 = lineAndShapeRenderer42.getBasePositiveItemLabelPosition();
        org.jfree.chart.text.TextAnchor textAnchor58 = itemLabelPosition57.getTextAnchor();
        lineAndShapeRenderer21.setSeriesPositiveItemLabelPosition(1, itemLabelPosition57, false);
        lineAndShapeRenderer2.setSeriesNegativeItemLabelPosition((int) (short) 0, itemLabelPosition57);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer65 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator66 = null;
        lineAndShapeRenderer65.setBaseURLGenerator(categoryURLGenerator66);
        java.awt.Shape shape69 = lineAndShapeRenderer65.getLegendShape(0);
        lineAndShapeRenderer65.setAutoPopulateSeriesStroke(false);
        java.awt.Font font73 = lineAndShapeRenderer65.getSeriesItemLabelFont(0);
        lineAndShapeRenderer65.setUseSeriesOffset(true);
        java.awt.Font font77 = null;
        lineAndShapeRenderer65.setSeriesItemLabelFont((int) (short) 1, font77, false);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition81 = lineAndShapeRenderer65.getSeriesPositiveItemLabelPosition((int) (byte) 100);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator82 = lineAndShapeRenderer65.getLegendItemURLGenerator();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer85 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color86 = java.awt.Color.BLUE;
        lineAndShapeRenderer85.setBaseItemLabelPaint((java.awt.Paint) color86);
        java.awt.Shape shape88 = lineAndShapeRenderer85.getBaseShape();
        java.awt.Stroke stroke89 = lineAndShapeRenderer85.getBaseOutlineStroke();
        lineAndShapeRenderer65.setBaseOutlineStroke(stroke89, true);
        org.jfree.chart.LegendItemCollection legendItemCollection92 = lineAndShapeRenderer65.getLegendItems();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition96 = lineAndShapeRenderer65.getNegativeItemLabelPosition((int) 'a', (int) '4', false);
        lineAndShapeRenderer2.setSeriesNegativeItemLabelPosition(0, itemLabelPosition96);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on itemLabelPosition57 and itemLabelPosition81", itemLabelPosition57.equals(itemLabelPosition81) ? itemLabelPosition57.hashCode() == itemLabelPosition81.hashCode() : true);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test077");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color3 = java.awt.Color.BLUE;
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color3);
        java.awt.Stroke stroke6 = lineAndShapeRenderer2.getSeriesOutlineStroke((int) (short) 1);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition8 = lineAndShapeRenderer2.getSeriesNegativeItemLabelPosition((int) (short) 1);
        lineAndShapeRenderer2.setSeriesCreateEntities((int) (short) 1, (java.lang.Boolean) false, false);
        lineAndShapeRenderer2.setAutoPopulateSeriesOutlineStroke(true);
        boolean boolean15 = lineAndShapeRenderer2.getBaseShapesFilled();
        boolean boolean18 = lineAndShapeRenderer2.getItemShapeFilled((int) (byte) -1, (int) (byte) 10);
        org.jfree.chart.renderer.category.BarRenderer barRenderer19 = new org.jfree.chart.renderer.category.BarRenderer();
        boolean boolean20 = barRenderer19.isDrawBarOutline();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition21 = barRenderer19.getBasePositiveItemLabelPosition();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition22 = barRenderer19.getPositiveItemLabelPositionFallback();
        org.jfree.chart.LegendItem legendItem24 = new org.jfree.chart.LegendItem("hi!");
        java.text.AttributedString attributedString25 = legendItem24.getAttributedLabel();
        java.lang.String str26 = legendItem24.getDescription();
        legendItem24.setSeriesKey((java.lang.Comparable) (byte) 100);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer31 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color32 = java.awt.Color.BLUE;
        lineAndShapeRenderer31.setBaseItemLabelPaint((java.awt.Paint) color32);
        java.awt.Shape shape34 = lineAndShapeRenderer31.getBaseShape();
        org.jfree.chart.entity.ChartEntity chartEntity36 = new org.jfree.chart.entity.ChartEntity(shape34, "");
        legendItem24.setShape(shape34);
        barRenderer19.setBaseShape(shape34, true);
        lineAndShapeRenderer2.setBaseShape(shape34);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer43 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator44 = null;
        lineAndShapeRenderer43.setBaseURLGenerator(categoryURLGenerator44);
        java.awt.Shape shape47 = lineAndShapeRenderer43.getLegendShape(0);
        lineAndShapeRenderer43.setAutoPopulateSeriesStroke(false);
        java.awt.Font font51 = lineAndShapeRenderer43.getSeriesItemLabelFont(0);
        lineAndShapeRenderer43.setUseSeriesOffset(true);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier54 = lineAndShapeRenderer43.getDrawingSupplier();
        lineAndShapeRenderer43.setBaseCreateEntities(false);
        java.awt.Font font60 = lineAndShapeRenderer43.getItemLabelFont((int) (short) 0, 0, false);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer64 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator65 = null;
        lineAndShapeRenderer64.setBaseURLGenerator(categoryURLGenerator65);
        java.awt.Shape shape68 = lineAndShapeRenderer64.getLegendShape(0);
        lineAndShapeRenderer64.setAutoPopulateSeriesStroke(false);
        java.awt.Font font72 = lineAndShapeRenderer64.getSeriesItemLabelFont(0);
        lineAndShapeRenderer64.setUseSeriesOffset(true);
        java.awt.Font font76 = null;
        lineAndShapeRenderer64.setSeriesItemLabelFont((int) (short) 1, font76, false);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition80 = lineAndShapeRenderer64.getSeriesPositiveItemLabelPosition((int) (byte) 100);
        org.jfree.chart.labels.ItemLabelAnchor itemLabelAnchor81 = itemLabelPosition80.getItemLabelAnchor();
        lineAndShapeRenderer43.setSeriesNegativeItemLabelPosition(1, itemLabelPosition80, false);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition85 = lineAndShapeRenderer43.getSeriesNegativeItemLabelPosition(0);
        lineAndShapeRenderer43.setSeriesItemLabelsVisible(0, (java.lang.Boolean) true);
        java.awt.Stroke stroke90 = lineAndShapeRenderer43.lookupSeriesOutlineStroke(15);
        lineAndShapeRenderer2.setBaseOutlineStroke(stroke90, false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on itemLabelPosition8 and itemLabelPosition85", itemLabelPosition8.equals(itemLabelPosition85) ? itemLabelPosition8.hashCode() == itemLabelPosition85.hashCode() : true);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test078");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        boolean boolean4 = lineAndShapeRenderer2.isSeriesVisibleInLegend(1);
        boolean boolean7 = lineAndShapeRenderer2.getItemVisible((int) (byte) 100, 0);
        java.awt.Graphics2D graphics2D8 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer11 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color12 = java.awt.Color.BLUE;
        lineAndShapeRenderer11.setBaseItemLabelPaint((java.awt.Paint) color12);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator17 = lineAndShapeRenderer11.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator18 = null;
        lineAndShapeRenderer11.setLegendItemURLGenerator(categorySeriesLabelGenerator18);
        java.awt.Paint paint21 = lineAndShapeRenderer11.getSeriesPaint(1);
        java.awt.Paint paint25 = lineAndShapeRenderer11.getItemFillPaint((-1), (int) (short) 100, false);
        java.awt.Shape shape27 = lineAndShapeRenderer11.lookupLegendShape(4);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer30 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator31 = null;
        lineAndShapeRenderer30.setBaseURLGenerator(categoryURLGenerator31);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator34 = null;
        lineAndShapeRenderer30.setSeriesToolTipGenerator(10, categoryToolTipGenerator34);
        boolean boolean36 = lineAndShapeRenderer30.getBaseSeriesVisibleInLegend();
        java.awt.Stroke stroke38 = null;
        lineAndShapeRenderer30.setSeriesStroke((int) 'a', stroke38, true);
        org.jfree.chart.labels.ItemLabelAnchor itemLabelAnchor42 = org.jfree.chart.labels.ItemLabelAnchor.INSIDE3;
        java.awt.Color color43 = java.awt.Color.yellow;
        boolean boolean44 = itemLabelAnchor42.equals((java.lang.Object) color43);
        lineAndShapeRenderer30.setSeriesFillPaint((int) ' ', (java.awt.Paint) color43);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer48 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color49 = java.awt.Color.BLUE;
        lineAndShapeRenderer48.setBaseItemLabelPaint((java.awt.Paint) color49);
        java.awt.Stroke stroke52 = lineAndShapeRenderer48.getSeriesOutlineStroke((int) (short) 1);
        org.jfree.data.category.CategoryDataset categoryDataset53 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis55 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float56 = categoryAxis55.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis57 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer60 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color61 = java.awt.Color.BLUE;
        lineAndShapeRenderer60.setBaseItemLabelPaint((java.awt.Paint) color61);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator66 = lineAndShapeRenderer60.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot67 = new org.jfree.chart.plot.CategoryPlot(categoryDataset53, categoryAxis55, valueAxis57, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer60);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer68 = categoryPlot67.getRenderer();
        org.jfree.chart.axis.ValueAxis valueAxis70 = lineAndShapeRenderer48.getRangeAxis(categoryPlot67, (int) '4');
        boolean boolean71 = categoryPlot67.isRangeCrosshairVisible();
        lineAndShapeRenderer30.addChangeListener((org.jfree.chart.event.RendererChangeListener) categoryPlot67);
        org.jfree.chart.entity.PlotEntity plotEntity73 = new org.jfree.chart.entity.PlotEntity(shape27, (org.jfree.chart.plot.Plot) categoryPlot67);
        org.jfree.data.category.CategoryDataset categoryDataset74 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis76 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float77 = categoryAxis76.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis78 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer81 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color82 = java.awt.Color.BLUE;
        lineAndShapeRenderer81.setBaseItemLabelPaint((java.awt.Paint) color82);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator87 = lineAndShapeRenderer81.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot88 = new org.jfree.chart.plot.CategoryPlot(categoryDataset74, categoryAxis76, valueAxis78, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer81);
        org.jfree.chart.axis.CategoryAxis categoryAxis89 = categoryPlot88.getDomainAxis();
        org.jfree.chart.axis.ValueAxis valueAxis90 = null;
        org.jfree.data.Range range91 = categoryPlot88.getDataRange(valueAxis90);
        org.jfree.chart.axis.AxisLocation axisLocation92 = categoryPlot88.getRangeAxisLocation();
        categoryPlot67.setRangeAxisLocation(axisLocation92, false);
        org.jfree.chart.axis.ValueAxis valueAxis95 = null;
        org.jfree.chart.plot.Marker marker96 = null;
        java.awt.geom.Rectangle2D rectangle2D97 = null;
        lineAndShapeRenderer2.drawRangeMarker(graphics2D8, categoryPlot67, valueAxis95, marker96, rectangle2D97);
        boolean boolean99 = categoryPlot67.isRangeZoomable();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on lineAndShapeRenderer2 and lineAndShapeRenderer30.", lineAndShapeRenderer2.equals(lineAndShapeRenderer30) == lineAndShapeRenderer30.equals(lineAndShapeRenderer2));
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test079");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator3 = null;
        lineAndShapeRenderer2.setBaseURLGenerator(categoryURLGenerator3);
        java.awt.Shape shape6 = lineAndShapeRenderer2.getLegendShape(0);
        lineAndShapeRenderer2.setAutoPopulateSeriesStroke(false);
        java.awt.Font font10 = lineAndShapeRenderer2.getSeriesItemLabelFont(0);
        lineAndShapeRenderer2.setUseSeriesOffset(true);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator13 = null;
        lineAndShapeRenderer2.setBaseToolTipGenerator(categoryToolTipGenerator13);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer18 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color19 = java.awt.Color.BLUE;
        lineAndShapeRenderer18.setBaseItemLabelPaint((java.awt.Paint) color19);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator24 = lineAndShapeRenderer18.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator25 = null;
        lineAndShapeRenderer18.setLegendItemURLGenerator(categorySeriesLabelGenerator25);
        java.awt.Paint paint28 = lineAndShapeRenderer18.getSeriesPaint(1);
        org.jfree.chart.renderer.RenderAttributes renderAttributes29 = lineAndShapeRenderer18.getSelectedItemAttributes();
        java.awt.Paint paint30 = renderAttributes29.getDefaultLabelPaint();
        java.awt.Shape shape32 = renderAttributes29.getSeriesShape((-1));
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer35 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator36 = null;
        lineAndShapeRenderer35.setBaseURLGenerator(categoryURLGenerator36);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator39 = null;
        lineAndShapeRenderer35.setSeriesToolTipGenerator(10, categoryToolTipGenerator39);
        boolean boolean41 = lineAndShapeRenderer35.getBaseSeriesVisibleInLegend();
        java.awt.Stroke stroke43 = null;
        lineAndShapeRenderer35.setSeriesStroke((int) 'a', stroke43, true);
        org.jfree.chart.labels.ItemLabelAnchor itemLabelAnchor47 = org.jfree.chart.labels.ItemLabelAnchor.INSIDE3;
        java.awt.Color color48 = java.awt.Color.yellow;
        boolean boolean49 = itemLabelAnchor47.equals((java.lang.Object) color48);
        lineAndShapeRenderer35.setSeriesFillPaint((int) ' ', (java.awt.Paint) color48);
        renderAttributes29.setDefaultOutlinePaint((java.awt.Paint) color48);
        lineAndShapeRenderer2.setSeriesFillPaint(2, (java.awt.Paint) color48);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator53 = null;
        lineAndShapeRenderer2.setBaseItemLabelGenerator(categoryItemLabelGenerator53);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer57 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color58 = java.awt.Color.BLUE;
        lineAndShapeRenderer57.setBaseItemLabelPaint((java.awt.Paint) color58);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator63 = lineAndShapeRenderer57.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator64 = null;
        lineAndShapeRenderer57.setLegendItemURLGenerator(categorySeriesLabelGenerator64);
        java.awt.Paint paint67 = lineAndShapeRenderer57.getSeriesPaint(1);
        org.jfree.chart.renderer.RenderAttributes renderAttributes68 = lineAndShapeRenderer57.getSelectedItemAttributes();
        lineAndShapeRenderer57.setSeriesCreateEntities((int) (short) 10, (java.lang.Boolean) true);
        lineAndShapeRenderer57.setSeriesShapesFilled(3, (java.lang.Boolean) false);
        java.awt.Shape shape76 = lineAndShapeRenderer57.lookupLegendShape(2);
        lineAndShapeRenderer2.setBaseShape(shape76);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on lineAndShapeRenderer18 and lineAndShapeRenderer57.", lineAndShapeRenderer18.equals(lineAndShapeRenderer57) == lineAndShapeRenderer57.equals(lineAndShapeRenderer18));
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test080");
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = new org.jfree.chart.axis.CategoryAxis("hi!");
        double double2 = categoryAxis1.getFixedDimension();
        org.jfree.chart.plot.Plot plot3 = categoryAxis1.getPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets4 = categoryAxis1.getLabelInsets();
        org.jfree.chart.axis.CategoryLabelPositions categoryLabelPositions5 = categoryAxis1.getCategoryLabelPositions();
        float float6 = categoryAxis1.getMaximumCategoryLabelWidthRatio();
        categoryAxis1.removeCategoryLabelToolTip((java.lang.Comparable) "RectangleInsets[t=3.0,l=3.0,b=3.0,r=3.0]");
        categoryAxis1.setLowerMargin((double) (byte) 10);
        org.jfree.data.category.CategoryDataset categoryDataset11 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis13 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float14 = categoryAxis13.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis15 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer18 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color19 = java.awt.Color.BLUE;
        lineAndShapeRenderer18.setBaseItemLabelPaint((java.awt.Paint) color19);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator24 = lineAndShapeRenderer18.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot25 = new org.jfree.chart.plot.CategoryPlot(categoryDataset11, categoryAxis13, valueAxis15, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer18);
        org.jfree.chart.axis.AxisLocation axisLocation26 = org.jfree.chart.axis.AxisLocation.TOP_OR_LEFT;
        categoryPlot25.setRangeAxisLocation(axisLocation26);
        categoryPlot25.clearSelection();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer30 = categoryPlot25.getRenderer((int) 'a');
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo32 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer35 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Graphics2D graphics2D36 = null;
        org.jfree.data.category.CategoryDataset categoryDataset37 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis39 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float40 = categoryAxis39.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis41 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer44 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color45 = java.awt.Color.BLUE;
        lineAndShapeRenderer44.setBaseItemLabelPaint((java.awt.Paint) color45);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator50 = lineAndShapeRenderer44.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot51 = new org.jfree.chart.plot.CategoryPlot(categoryDataset37, categoryAxis39, valueAxis41, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer44);
        org.jfree.chart.axis.CategoryAxis categoryAxis52 = categoryPlot51.getDomainAxis();
        org.jfree.chart.axis.ValueAxis valueAxis53 = null;
        org.jfree.data.Range range54 = categoryPlot51.getDataRange(valueAxis53);
        org.jfree.chart.axis.ValueAxis valueAxis55 = null;
        org.jfree.chart.plot.Marker marker56 = null;
        java.awt.geom.Rectangle2D rectangle2D57 = null;
        lineAndShapeRenderer35.drawRangeMarker(graphics2D36, categoryPlot51, valueAxis55, marker56, rectangle2D57);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo60 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer63 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator64 = null;
        lineAndShapeRenderer63.setBaseURLGenerator(categoryURLGenerator64);
        java.awt.Shape shape67 = lineAndShapeRenderer63.getLegendShape(0);
        lineAndShapeRenderer63.setAutoPopulateSeriesStroke(false);
        java.awt.Font font71 = lineAndShapeRenderer63.getSeriesItemLabelFont(0);
        lineAndShapeRenderer63.setUseSeriesOffset(true);
        java.awt.Shape shape75 = null;
        lineAndShapeRenderer63.setSeriesShape((int) (short) 10, shape75, true);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition78 = lineAndShapeRenderer63.getBasePositiveItemLabelPosition();
        java.awt.Graphics2D graphics2D79 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation80 = null;
        java.awt.geom.Rectangle2D rectangle2D81 = null;
        java.awt.geom.Rectangle2D rectangle2D82 = null;
        org.jfree.chart.util.RectangleInsets rectangleInsets83 = org.jfree.chart.axis.Axis.DEFAULT_AXIS_LABEL_INSETS;
        double double85 = rectangleInsets83.calculateBottomInset(0.0d);
        double double87 = rectangleInsets83.trimWidth((double) '#');
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType88 = null;
        org.jfree.chart.util.RectangleAnchor rectangleAnchor89 = null;
        java.awt.geom.Point2D point2D90 = lineAndShapeRenderer63.calculateDomainMarkerTextAnchorPoint(graphics2D79, plotOrientation80, rectangle2D81, rectangle2D82, rectangleInsets83, lengthAdjustmentType88, rectangleAnchor89);
        categoryPlot51.panDomainAxes((double) (-1L), plotRenderingInfo60, point2D90);
        categoryPlot25.zoomDomainAxes((double) 1, plotRenderingInfo32, point2D90);
        categoryAxis1.setPlot((org.jfree.chart.plot.Plot) categoryPlot25);
        float float94 = categoryAxis1.getTickMarkOutsideLength();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryPlot25 and categoryPlot51", categoryPlot25.equals(categoryPlot51) ? categoryPlot25.hashCode() == categoryPlot51.hashCode() : true);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test081");
        org.jfree.chart.labels.ItemLabelAnchor itemLabelAnchor0 = org.jfree.chart.labels.ItemLabelAnchor.INSIDE7;
        org.jfree.chart.text.TextAnchor textAnchor1 = org.jfree.chart.text.TextAnchor.BASELINE_CENTER;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer4 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator5 = null;
        lineAndShapeRenderer4.setBaseURLGenerator(categoryURLGenerator5);
        java.awt.Shape shape8 = lineAndShapeRenderer4.getLegendShape(0);
        lineAndShapeRenderer4.setAutoPopulateSeriesStroke(false);
        java.awt.Font font12 = lineAndShapeRenderer4.getSeriesItemLabelFont(0);
        lineAndShapeRenderer4.setUseSeriesOffset(true);
        java.awt.Shape shape16 = null;
        lineAndShapeRenderer4.setSeriesShape((int) (short) 10, shape16, true);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition19 = lineAndShapeRenderer4.getBasePositiveItemLabelPosition();
        org.jfree.chart.text.TextAnchor textAnchor20 = itemLabelPosition19.getTextAnchor();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition22 = new org.jfree.chart.labels.ItemLabelPosition(itemLabelAnchor0, textAnchor1, textAnchor20, 29.0d);
        java.lang.String str23 = itemLabelAnchor0.toString();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer26 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator27 = null;
        lineAndShapeRenderer26.setBaseURLGenerator(categoryURLGenerator27);
        java.awt.Shape shape30 = lineAndShapeRenderer26.getLegendShape(0);
        lineAndShapeRenderer26.setAutoPopulateSeriesStroke(false);
        java.awt.Font font34 = lineAndShapeRenderer26.getSeriesItemLabelFont(0);
        lineAndShapeRenderer26.setUseSeriesOffset(true);
        java.awt.Shape shape38 = null;
        lineAndShapeRenderer26.setSeriesShape((int) (short) 10, shape38, true);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition41 = lineAndShapeRenderer26.getBasePositiveItemLabelPosition();
        org.jfree.chart.text.TextAnchor textAnchor42 = itemLabelPosition41.getTextAnchor();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer45 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator46 = null;
        lineAndShapeRenderer45.setBaseURLGenerator(categoryURLGenerator46);
        java.awt.Shape shape49 = lineAndShapeRenderer45.getLegendShape(0);
        lineAndShapeRenderer45.setAutoPopulateSeriesStroke(false);
        java.awt.Font font53 = lineAndShapeRenderer45.getSeriesItemLabelFont(0);
        lineAndShapeRenderer45.setUseSeriesOffset(true);
        java.awt.Shape shape57 = null;
        lineAndShapeRenderer45.setSeriesShape((int) (short) 10, shape57, true);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition60 = lineAndShapeRenderer45.getBasePositiveItemLabelPosition();
        org.jfree.chart.text.TextAnchor textAnchor61 = itemLabelPosition60.getTextAnchor();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition63 = new org.jfree.chart.labels.ItemLabelPosition(itemLabelAnchor0, textAnchor42, textAnchor61, (double) 15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on itemLabelPosition19 and itemLabelPosition41", itemLabelPosition19.equals(itemLabelPosition41) ? itemLabelPosition19.hashCode() == itemLabelPosition41.hashCode() : true);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test082");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float3 = categoryAxis2.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis4 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer7 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color8 = java.awt.Color.BLUE;
        lineAndShapeRenderer7.setBaseItemLabelPaint((java.awt.Paint) color8);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator13 = lineAndShapeRenderer7.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot14 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis2, valueAxis4, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer7);
        java.lang.Object obj15 = categoryPlot14.clone();
        org.jfree.chart.util.RectangleEdge rectangleEdge17 = categoryPlot14.getDomainAxisEdge((int) ' ');
        boolean boolean18 = categoryPlot14.isRangeZeroBaselineVisible();
        org.jfree.chart.axis.CategoryAxis categoryAxis20 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float21 = categoryAxis20.getTickMarkInsideLength();
        categoryAxis20.setTickLabelsVisible(false);
        double double24 = categoryAxis20.getLowerMargin();
        boolean boolean25 = categoryPlot14.equals((java.lang.Object) categoryAxis20);
        boolean boolean26 = categoryAxis20.isVisible();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryPlot14 and obj15", categoryPlot14.equals(obj15) ? categoryPlot14.hashCode() == obj15.hashCode() : true);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test083");
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
        java.awt.Color color35 = org.jfree.chart.ChartColor.DARK_MAGENTA;
        barRenderer0.setShadowPaint((java.awt.Paint) color35);
        barRenderer0.setBaseItemLabelsVisible(false, false);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer43 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color44 = java.awt.Color.BLUE;
        lineAndShapeRenderer43.setBaseItemLabelPaint((java.awt.Paint) color44);
        java.awt.Shape shape46 = lineAndShapeRenderer43.getBaseShape();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer49 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator50 = null;
        lineAndShapeRenderer49.setBaseURLGenerator(categoryURLGenerator50);
        java.awt.Shape shape53 = lineAndShapeRenderer49.getLegendShape(0);
        lineAndShapeRenderer49.setAutoPopulateSeriesStroke(false);
        java.awt.Font font57 = lineAndShapeRenderer49.getSeriesItemLabelFont(0);
        lineAndShapeRenderer49.setUseSeriesOffset(true);
        java.awt.Font font61 = null;
        lineAndShapeRenderer49.setSeriesItemLabelFont((int) (short) 1, font61, false);
        java.awt.Stroke stroke67 = lineAndShapeRenderer49.getItemOutlineStroke(0, 1, false);
        lineAndShapeRenderer43.setBaseStroke(stroke67, true);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition70 = lineAndShapeRenderer43.getBasePositiveItemLabelPosition();
        barRenderer0.setSeriesPositiveItemLabelPosition(3, itemLabelPosition70, true);
        barRenderer0.setDrawBarOutline(false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on itemLabelPosition30 and itemLabelPosition70", itemLabelPosition30.equals(itemLabelPosition70) ? itemLabelPosition30.hashCode() == itemLabelPosition70.hashCode() : true);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test084");
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
        org.jfree.chart.util.GradientPaintTransformer gradientPaintTransformer35 = barRenderer0.getGradientPaintTransformer();
        double double36 = barRenderer0.getMinimumBarLength();
        double double37 = barRenderer0.getShadowXOffset();
        java.awt.Paint paint39 = barRenderer0.getSeriesItemLabelPaint(0);
        boolean boolean40 = barRenderer0.getIncludeBaseInRange();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer43 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        boolean boolean45 = lineAndShapeRenderer43.isSeriesVisibleInLegend(1);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator47 = null;
        lineAndShapeRenderer43.setSeriesURLGenerator(0, categoryURLGenerator47, false);
        java.awt.Color color50 = org.jfree.chart.ChartColor.LIGHT_GREEN;
        java.awt.color.ColorSpace colorSpace51 = color50.getColorSpace();
        lineAndShapeRenderer43.setBaseFillPaint((java.awt.Paint) color50);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer55 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator56 = null;
        lineAndShapeRenderer55.setBaseURLGenerator(categoryURLGenerator56);
        java.awt.Shape shape59 = lineAndShapeRenderer55.getLegendShape(0);
        lineAndShapeRenderer55.setAutoPopulateSeriesStroke(false);
        java.awt.Font font63 = lineAndShapeRenderer55.getSeriesItemLabelFont(0);
        lineAndShapeRenderer55.setUseSeriesOffset(true);
        java.awt.Shape shape67 = null;
        lineAndShapeRenderer55.setSeriesShape((int) (short) 10, shape67, true);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition70 = lineAndShapeRenderer55.getBasePositiveItemLabelPosition();
        lineAndShapeRenderer43.setBasePositiveItemLabelPosition(itemLabelPosition70);
        java.awt.Stroke stroke72 = lineAndShapeRenderer43.getBaseOutlineStroke();
        java.awt.Font font74 = lineAndShapeRenderer43.lookupLegendTextFont(11);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition78 = lineAndShapeRenderer43.getNegativeItemLabelPosition(192, 192, false);
        barRenderer0.setBaseNegativeItemLabelPosition(itemLabelPosition78);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on itemLabelPosition30 and itemLabelPosition70", itemLabelPosition30.equals(itemLabelPosition70) ? itemLabelPosition30.hashCode() == itemLabelPosition70.hashCode() : true);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test085");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color3 = java.awt.Color.BLUE;
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color3);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator8 = lineAndShapeRenderer2.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator9 = null;
        lineAndShapeRenderer2.setLegendItemURLGenerator(categorySeriesLabelGenerator9);
        java.awt.Paint paint12 = lineAndShapeRenderer2.getSeriesPaint(1);
        org.jfree.chart.renderer.RenderAttributes renderAttributes13 = lineAndShapeRenderer2.getSelectedItemAttributes();
        lineAndShapeRenderer2.setSeriesCreateEntities((int) (short) 10, (java.lang.Boolean) true);
        lineAndShapeRenderer2.setSeriesShapesFilled(3, (java.lang.Boolean) false);
        java.awt.Shape shape21 = lineAndShapeRenderer2.lookupLegendShape(2);
        java.awt.Color color23 = org.jfree.chart.ChartColor.VERY_DARK_BLUE;
        lineAndShapeRenderer2.setSeriesPaint(192, (java.awt.Paint) color23, false);
        org.jfree.data.category.CategoryDataset categoryDataset26 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis28 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float29 = categoryAxis28.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis30 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer33 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color34 = java.awt.Color.BLUE;
        lineAndShapeRenderer33.setBaseItemLabelPaint((java.awt.Paint) color34);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator39 = lineAndShapeRenderer33.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot40 = new org.jfree.chart.plot.CategoryPlot(categoryDataset26, categoryAxis28, valueAxis30, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer33);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer41 = categoryPlot40.getRenderer();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer44 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        boolean boolean46 = lineAndShapeRenderer44.isSeriesVisibleInLegend(1);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator48 = null;
        lineAndShapeRenderer44.setSeriesURLGenerator(0, categoryURLGenerator48, false);
        java.awt.Color color51 = org.jfree.chart.ChartColor.LIGHT_GREEN;
        java.awt.color.ColorSpace colorSpace52 = color51.getColorSpace();
        lineAndShapeRenderer44.setBaseFillPaint((java.awt.Paint) color51);
        categoryPlot40.setDomainCrosshairPaint((java.awt.Paint) color51);
        org.jfree.chart.axis.CategoryAnchor categoryAnchor55 = categoryPlot40.getDomainGridlinePosition();
        lineAndShapeRenderer2.removeChangeListener((org.jfree.chart.event.RendererChangeListener) categoryPlot40);
        boolean boolean57 = lineAndShapeRenderer2.getAutoPopulateSeriesOutlinePaint();
        java.awt.Graphics2D graphics2D58 = null;
        java.awt.geom.Rectangle2D rectangle2D59 = null;
        org.jfree.data.category.CategoryDataset categoryDataset60 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis62 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float63 = categoryAxis62.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis64 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer67 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color68 = java.awt.Color.BLUE;
        lineAndShapeRenderer67.setBaseItemLabelPaint((java.awt.Paint) color68);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator73 = lineAndShapeRenderer67.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot74 = new org.jfree.chart.plot.CategoryPlot(categoryDataset60, categoryAxis62, valueAxis64, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer67);
        boolean boolean75 = categoryPlot74.canSelectByPoint();
        org.jfree.chart.axis.ValueAxis valueAxis77 = categoryPlot74.getRangeAxisForDataset((int) '4');
        double double78 = categoryPlot74.getRangeCrosshairValue();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer81 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator82 = null;
        lineAndShapeRenderer81.setBaseURLGenerator(categoryURLGenerator82);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator85 = null;
        lineAndShapeRenderer81.setSeriesToolTipGenerator(10, categoryToolTipGenerator85);
        boolean boolean87 = lineAndShapeRenderer81.getBaseSeriesVisibleInLegend();
        boolean boolean88 = lineAndShapeRenderer81.getDataBoundsIncludesVisibleSeriesOnly();
        org.jfree.data.category.DefaultCategoryDataset defaultCategoryDataset89 = new org.jfree.data.category.DefaultCategoryDataset();
        defaultCategoryDataset89.clear();
        defaultCategoryDataset89.clearSelection();
        org.jfree.data.Range range92 = lineAndShapeRenderer81.findRangeBounds((org.jfree.data.category.CategoryDataset) defaultCategoryDataset89);
        org.jfree.data.general.DatasetGroup datasetGroup93 = defaultCategoryDataset89.getGroup();
        org.jfree.data.category.CategoryDatasetSelectionState categoryDatasetSelectionState94 = defaultCategoryDataset89.getSelectionState();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo95 = null;
        org.jfree.chart.renderer.category.CategoryItemRendererState categoryItemRendererState96 = lineAndShapeRenderer2.initialise(graphics2D58, rectangle2D59, categoryPlot74, (org.jfree.data.category.CategoryDataset) defaultCategoryDataset89, plotRenderingInfo95);
        defaultCategoryDataset89.clearSelection();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on lineAndShapeRenderer33 and lineAndShapeRenderer2.", lineAndShapeRenderer33.equals(lineAndShapeRenderer2) == lineAndShapeRenderer2.equals(lineAndShapeRenderer33));
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test086");
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
        org.jfree.chart.util.GradientPaintTransformer gradientPaintTransformer35 = barRenderer0.getGradientPaintTransformer();
        double double36 = barRenderer0.getMinimumBarLength();
        double double37 = barRenderer0.getShadowXOffset();
        java.awt.Paint paint39 = barRenderer0.getSeriesItemLabelPaint(0);
        boolean boolean40 = barRenderer0.getIncludeBaseInRange();
        org.jfree.chart.plot.DefaultDrawingSupplier defaultDrawingSupplier41 = new org.jfree.chart.plot.DefaultDrawingSupplier();
        java.awt.Paint paint42 = defaultDrawingSupplier41.getNextFillPaint();
        barRenderer0.setShadowPaint(paint42);
        org.jfree.chart.plot.DefaultDrawingSupplier defaultDrawingSupplier45 = new org.jfree.chart.plot.DefaultDrawingSupplier();
        java.lang.Object obj46 = defaultDrawingSupplier45.clone();
        java.awt.Stroke stroke47 = defaultDrawingSupplier45.getNextStroke();
        barRenderer0.setSeriesStroke(5, stroke47, false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultDrawingSupplier41 and obj46", defaultDrawingSupplier41.equals(obj46) ? defaultDrawingSupplier41.hashCode() == obj46.hashCode() : true);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test087");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float3 = categoryAxis2.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis4 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer7 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color8 = java.awt.Color.BLUE;
        lineAndShapeRenderer7.setBaseItemLabelPaint((java.awt.Paint) color8);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator13 = lineAndShapeRenderer7.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot14 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis2, valueAxis4, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer7);
        java.lang.Object obj15 = categoryPlot14.clone();
        java.awt.Stroke stroke16 = categoryPlot14.getDomainCrosshairStroke();
        org.jfree.chart.plot.PlotOrientation plotOrientation17 = categoryPlot14.getOrientation();
        java.lang.String str18 = plotOrientation17.toString();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryPlot14 and obj15", categoryPlot14.equals(obj15) ? categoryPlot14.hashCode() == obj15.hashCode() : true);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test088");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color3 = java.awt.Color.BLUE;
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color3);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator8 = lineAndShapeRenderer2.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator9 = null;
        lineAndShapeRenderer2.setLegendItemURLGenerator(categorySeriesLabelGenerator9);
        java.awt.Paint paint12 = lineAndShapeRenderer2.getSeriesPaint(1);
        org.jfree.chart.renderer.RenderAttributes renderAttributes13 = lineAndShapeRenderer2.getSelectedItemAttributes();
        lineAndShapeRenderer2.setSeriesCreateEntities((int) (short) 10, (java.lang.Boolean) true);
        lineAndShapeRenderer2.setSeriesShapesFilled(3, (java.lang.Boolean) false);
        java.awt.Shape shape21 = lineAndShapeRenderer2.lookupLegendShape(2);
        java.awt.Color color23 = org.jfree.chart.ChartColor.VERY_DARK_BLUE;
        lineAndShapeRenderer2.setSeriesPaint(192, (java.awt.Paint) color23, false);
        org.jfree.data.category.CategoryDataset categoryDataset26 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis28 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float29 = categoryAxis28.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis30 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer33 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color34 = java.awt.Color.BLUE;
        lineAndShapeRenderer33.setBaseItemLabelPaint((java.awt.Paint) color34);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator39 = lineAndShapeRenderer33.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot40 = new org.jfree.chart.plot.CategoryPlot(categoryDataset26, categoryAxis28, valueAxis30, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer33);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer41 = categoryPlot40.getRenderer();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer44 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        boolean boolean46 = lineAndShapeRenderer44.isSeriesVisibleInLegend(1);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator48 = null;
        lineAndShapeRenderer44.setSeriesURLGenerator(0, categoryURLGenerator48, false);
        java.awt.Color color51 = org.jfree.chart.ChartColor.LIGHT_GREEN;
        java.awt.color.ColorSpace colorSpace52 = color51.getColorSpace();
        lineAndShapeRenderer44.setBaseFillPaint((java.awt.Paint) color51);
        categoryPlot40.setDomainCrosshairPaint((java.awt.Paint) color51);
        org.jfree.chart.axis.CategoryAnchor categoryAnchor55 = categoryPlot40.getDomainGridlinePosition();
        lineAndShapeRenderer2.removeChangeListener((org.jfree.chart.event.RendererChangeListener) categoryPlot40);
        boolean boolean57 = lineAndShapeRenderer2.getAutoPopulateSeriesOutlinePaint();
        java.awt.Graphics2D graphics2D58 = null;
        java.awt.geom.Rectangle2D rectangle2D59 = null;
        org.jfree.data.category.CategoryDataset categoryDataset60 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis62 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float63 = categoryAxis62.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis64 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer67 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color68 = java.awt.Color.BLUE;
        lineAndShapeRenderer67.setBaseItemLabelPaint((java.awt.Paint) color68);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator73 = lineAndShapeRenderer67.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot74 = new org.jfree.chart.plot.CategoryPlot(categoryDataset60, categoryAxis62, valueAxis64, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer67);
        boolean boolean75 = categoryPlot74.canSelectByPoint();
        org.jfree.chart.axis.ValueAxis valueAxis77 = categoryPlot74.getRangeAxisForDataset((int) '4');
        double double78 = categoryPlot74.getRangeCrosshairValue();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer81 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator82 = null;
        lineAndShapeRenderer81.setBaseURLGenerator(categoryURLGenerator82);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator85 = null;
        lineAndShapeRenderer81.setSeriesToolTipGenerator(10, categoryToolTipGenerator85);
        boolean boolean87 = lineAndShapeRenderer81.getBaseSeriesVisibleInLegend();
        boolean boolean88 = lineAndShapeRenderer81.getDataBoundsIncludesVisibleSeriesOnly();
        org.jfree.data.category.DefaultCategoryDataset defaultCategoryDataset89 = new org.jfree.data.category.DefaultCategoryDataset();
        defaultCategoryDataset89.clear();
        defaultCategoryDataset89.clearSelection();
        org.jfree.data.Range range92 = lineAndShapeRenderer81.findRangeBounds((org.jfree.data.category.CategoryDataset) defaultCategoryDataset89);
        org.jfree.data.general.DatasetGroup datasetGroup93 = defaultCategoryDataset89.getGroup();
        org.jfree.data.category.CategoryDatasetSelectionState categoryDatasetSelectionState94 = defaultCategoryDataset89.getSelectionState();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo95 = null;
        org.jfree.chart.renderer.category.CategoryItemRendererState categoryItemRendererState96 = lineAndShapeRenderer2.initialise(graphics2D58, rectangle2D59, categoryPlot74, (org.jfree.data.category.CategoryDataset) defaultCategoryDataset89, plotRenderingInfo95);
        org.jfree.chart.axis.AxisSpace axisSpace97 = categoryPlot74.getFixedDomainAxisSpace();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on lineAndShapeRenderer33 and lineAndShapeRenderer2.", lineAndShapeRenderer33.equals(lineAndShapeRenderer2) == lineAndShapeRenderer2.equals(lineAndShapeRenderer33));
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test089");
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
        org.jfree.chart.axis.ValueAxis valueAxis16 = null;
        org.jfree.data.Range range17 = categoryPlot14.getDataRange(valueAxis16);
        org.jfree.chart.axis.AxisLocation axisLocation18 = categoryPlot14.getRangeAxisLocation();
        categoryPlot14.clearRangeMarkers(0);
        org.jfree.data.category.DefaultCategoryDataset defaultCategoryDataset21 = new org.jfree.data.category.DefaultCategoryDataset();
        int int23 = defaultCategoryDataset21.getColumnIndex((java.lang.Comparable) 3.0d);
        int int25 = defaultCategoryDataset21.getRowIndex((java.lang.Comparable) (byte) 10);
        defaultCategoryDataset21.clearSelection();
        int int27 = categoryPlot14.indexOf((org.jfree.data.category.CategoryDataset) defaultCategoryDataset21);
        java.util.List list28 = defaultCategoryDataset21.getRowKeys();
        org.jfree.chart.axis.CategoryAxis categoryAxis30 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float31 = categoryAxis30.getTickMarkInsideLength();
        categoryAxis30.setMaximumCategoryLabelLines((int) (byte) 1);
        boolean boolean34 = categoryAxis30.isVisible();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer38 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator39 = null;
        lineAndShapeRenderer38.setBaseURLGenerator(categoryURLGenerator39);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator42 = null;
        lineAndShapeRenderer38.setSeriesToolTipGenerator(10, categoryToolTipGenerator42);
        boolean boolean44 = lineAndShapeRenderer38.getBaseSeriesVisibleInLegend();
        java.awt.Stroke stroke46 = null;
        lineAndShapeRenderer38.setSeriesStroke((int) 'a', stroke46, true);
        org.jfree.chart.labels.ItemLabelAnchor itemLabelAnchor50 = org.jfree.chart.labels.ItemLabelAnchor.INSIDE3;
        java.awt.Color color51 = java.awt.Color.yellow;
        boolean boolean52 = itemLabelAnchor50.equals((java.lang.Object) color51);
        lineAndShapeRenderer38.setSeriesFillPaint((int) ' ', (java.awt.Paint) color51);
        categoryAxis30.setTickLabelPaint((java.lang.Comparable) false, (java.awt.Paint) color51);
        categoryAxis30.addCategoryLabelToolTip((java.lang.Comparable) "hi!", "DatasetRenderingOrder.REVERSE");
        java.awt.Font font58 = categoryAxis30.getLabelFont();
        boolean boolean59 = defaultCategoryDataset21.equals((java.lang.Object) categoryAxis30);
        org.jfree.data.category.CategoryDataset categoryDataset60 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis62 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float63 = categoryAxis62.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis64 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer67 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color68 = java.awt.Color.BLUE;
        lineAndShapeRenderer67.setBaseItemLabelPaint((java.awt.Paint) color68);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator73 = lineAndShapeRenderer67.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot74 = new org.jfree.chart.plot.CategoryPlot(categoryDataset60, categoryAxis62, valueAxis64, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer67);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent75 = new org.jfree.chart.event.PlotChangeEvent((org.jfree.chart.plot.Plot) categoryPlot74);
        java.awt.Graphics2D graphics2D76 = null;
        java.awt.geom.Rectangle2D rectangle2D77 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo79 = null;
        org.jfree.chart.plot.CategoryCrosshairState categoryCrosshairState80 = null;
        boolean boolean81 = categoryPlot74.render(graphics2D76, rectangle2D77, (int) ' ', plotRenderingInfo79, categoryCrosshairState80);
        defaultCategoryDataset21.addChangeListener((org.jfree.data.event.DatasetChangeListener) categoryPlot74);
        int int83 = defaultCategoryDataset21.getColumnCount();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryPlot14 and categoryPlot74", categoryPlot14.equals(categoryPlot74) ? categoryPlot14.hashCode() == categoryPlot74.hashCode() : true);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test090");
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
        org.jfree.chart.util.RectangleEdge rectangleEdge26 = categoryPlot21.getDomainAxisEdge();
        boolean boolean27 = categoryPlot21.isRangeZeroBaselineVisible();
        boolean boolean28 = categoryPlot21.isDomainGridlinesVisible();
        java.awt.Stroke stroke29 = categoryPlot21.getOutlineStroke();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer32 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color33 = java.awt.Color.BLUE;
        lineAndShapeRenderer32.setBaseItemLabelPaint((java.awt.Paint) color33);
        java.awt.Shape shape35 = lineAndShapeRenderer32.getBaseShape();
        java.awt.Stroke stroke36 = lineAndShapeRenderer32.getBaseOutlineStroke();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator37 = null;
        lineAndShapeRenderer32.setBaseItemLabelGenerator(categoryItemLabelGenerator37, false);
        java.awt.Font font41 = lineAndShapeRenderer32.getLegendTextFont((-1));
        org.jfree.data.category.CategoryDataset categoryDataset42 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis44 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float45 = categoryAxis44.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis46 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer49 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color50 = java.awt.Color.BLUE;
        lineAndShapeRenderer49.setBaseItemLabelPaint((java.awt.Paint) color50);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator55 = lineAndShapeRenderer49.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot56 = new org.jfree.chart.plot.CategoryPlot(categoryDataset42, categoryAxis44, valueAxis46, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer49);
        lineAndShapeRenderer49.setSeriesVisibleInLegend(3, (java.lang.Boolean) false, false);
        org.jfree.chart.axis.CategoryAxis categoryAxis63 = new org.jfree.chart.axis.CategoryAxis("hi!");
        java.lang.Object obj64 = categoryAxis63.clone();
        java.awt.Font font65 = categoryAxis63.getTickLabelFont();
        lineAndShapeRenderer49.setSeriesItemLabelFont((int) '#', font65);
        lineAndShapeRenderer32.setBaseItemLabelFont(font65);
        categoryPlot21.setNoDataMessageFont(font65);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on lineAndShapeRenderer2 and lineAndShapeRenderer49.", lineAndShapeRenderer2.equals(lineAndShapeRenderer49) == lineAndShapeRenderer49.equals(lineAndShapeRenderer2));
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test091");
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
        org.jfree.chart.util.GradientPaintTransformer gradientPaintTransformer35 = barRenderer0.getGradientPaintTransformer();
        double double36 = barRenderer0.getMinimumBarLength();
        double double37 = barRenderer0.getShadowXOffset();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer41 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator42 = null;
        lineAndShapeRenderer41.setBaseURLGenerator(categoryURLGenerator42);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator45 = null;
        lineAndShapeRenderer41.setSeriesToolTipGenerator(10, categoryToolTipGenerator45);
        java.lang.Boolean boolean48 = lineAndShapeRenderer41.getSeriesItemLabelsVisible(2);
        java.awt.Paint paint50 = lineAndShapeRenderer41.getSeriesPaint(8);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition52 = lineAndShapeRenderer41.getSeriesNegativeItemLabelPosition((int) (byte) -1);
        org.jfree.data.category.CategoryDataset categoryDataset53 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis54 = null;
        org.jfree.chart.axis.ValueAxis valueAxis55 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer58 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color59 = java.awt.Color.BLUE;
        lineAndShapeRenderer58.setBaseItemLabelPaint((java.awt.Paint) color59);
        java.awt.Stroke stroke62 = lineAndShapeRenderer58.getSeriesStroke((int) (short) 10);
        org.jfree.chart.plot.CategoryPlot categoryPlot63 = new org.jfree.chart.plot.CategoryPlot(categoryDataset53, categoryAxis54, valueAxis55, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer58);
        lineAndShapeRenderer41.removeChangeListener((org.jfree.chart.event.RendererChangeListener) categoryPlot63);
        java.awt.Paint paint65 = lineAndShapeRenderer41.getBaseFillPaint();
        barRenderer0.setSeriesPaint((int) ' ', paint65);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on itemLabelPosition11 and itemLabelPosition52", itemLabelPosition11.equals(itemLabelPosition52) ? itemLabelPosition11.hashCode() == itemLabelPosition52.hashCode() : true);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test092");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color3 = java.awt.Color.BLUE;
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color3);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator8 = lineAndShapeRenderer2.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition10 = lineAndShapeRenderer2.getSeriesPositiveItemLabelPosition((int) 'a');
        lineAndShapeRenderer2.setBaseSeriesVisible(false, true);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer16 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color17 = java.awt.Color.BLUE;
        lineAndShapeRenderer16.setBaseItemLabelPaint((java.awt.Paint) color17);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator22 = lineAndShapeRenderer16.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition24 = lineAndShapeRenderer16.getSeriesPositiveItemLabelPosition((int) 'a');
        java.awt.Shape shape26 = lineAndShapeRenderer16.lookupLegendShape(8);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer29 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator30 = null;
        lineAndShapeRenderer29.setBaseURLGenerator(categoryURLGenerator30);
        java.awt.Shape shape33 = lineAndShapeRenderer29.getLegendShape(0);
        lineAndShapeRenderer29.setAutoPopulateSeriesStroke(false);
        java.awt.Font font37 = lineAndShapeRenderer29.getSeriesItemLabelFont(0);
        lineAndShapeRenderer29.setUseSeriesOffset(true);
        java.awt.Shape shape41 = null;
        lineAndShapeRenderer29.setSeriesShape((int) (short) 10, shape41, true);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer46 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color47 = java.awt.Color.BLUE;
        lineAndShapeRenderer46.setBaseItemLabelPaint((java.awt.Paint) color47);
        java.awt.Stroke stroke50 = lineAndShapeRenderer46.getSeriesOutlineStroke((int) (short) 1);
        org.jfree.data.category.CategoryDataset categoryDataset51 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis53 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float54 = categoryAxis53.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis55 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer58 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color59 = java.awt.Color.BLUE;
        lineAndShapeRenderer58.setBaseItemLabelPaint((java.awt.Paint) color59);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator64 = lineAndShapeRenderer58.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot65 = new org.jfree.chart.plot.CategoryPlot(categoryDataset51, categoryAxis53, valueAxis55, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer58);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer66 = categoryPlot65.getRenderer();
        org.jfree.chart.axis.ValueAxis valueAxis68 = lineAndShapeRenderer46.getRangeAxis(categoryPlot65, (int) '4');
        double double69 = categoryPlot65.getRangeCrosshairValue();
        lineAndShapeRenderer29.addChangeListener((org.jfree.chart.event.RendererChangeListener) categoryPlot65);
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray71 = new org.jfree.chart.axis.CategoryAxis[] {};
        categoryPlot65.setDomainAxes(categoryAxisArray71);
        categoryPlot65.setDomainGridlinesVisible(true);
        int int75 = categoryPlot65.getCrosshairDatasetIndex();
        org.jfree.chart.entity.PlotEntity plotEntity77 = new org.jfree.chart.entity.PlotEntity(shape26, (org.jfree.chart.plot.Plot) categoryPlot65, "-3,-3,3,3");
        org.jfree.chart.axis.ValueAxis valueAxis79 = categoryPlot65.getRangeAxis(8);
        boolean boolean80 = lineAndShapeRenderer2.hasListener((java.util.EventListener) categoryPlot65);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on itemLabelPosition10 and itemLabelPosition24", itemLabelPosition10.equals(itemLabelPosition24) ? itemLabelPosition10.hashCode() == itemLabelPosition24.hashCode() : true);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test093");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator3 = null;
        lineAndShapeRenderer2.setBaseURLGenerator(categoryURLGenerator3);
        java.awt.Shape shape6 = lineAndShapeRenderer2.getLegendShape(0);
        lineAndShapeRenderer2.setAutoPopulateSeriesStroke(false);
        java.awt.Font font10 = lineAndShapeRenderer2.getSeriesItemLabelFont(0);
        lineAndShapeRenderer2.setUseSeriesOffset(true);
        java.awt.Shape shape14 = null;
        lineAndShapeRenderer2.setSeriesShape((int) (short) 10, shape14, true);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition17 = lineAndShapeRenderer2.getBasePositiveItemLabelPosition();
        java.awt.Graphics2D graphics2D18 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation19 = null;
        java.awt.geom.Rectangle2D rectangle2D20 = null;
        java.awt.geom.Rectangle2D rectangle2D21 = null;
        org.jfree.chart.util.RectangleInsets rectangleInsets22 = org.jfree.chart.axis.Axis.DEFAULT_AXIS_LABEL_INSETS;
        double double24 = rectangleInsets22.calculateBottomInset(0.0d);
        double double26 = rectangleInsets22.trimWidth((double) '#');
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType27 = null;
        org.jfree.chart.util.RectangleAnchor rectangleAnchor28 = null;
        java.awt.geom.Point2D point2D29 = lineAndShapeRenderer2.calculateDomainMarkerTextAnchorPoint(graphics2D18, plotOrientation19, rectangle2D20, rectangle2D21, rectangleInsets22, lengthAdjustmentType27, rectangleAnchor28);
        lineAndShapeRenderer2.setBaseCreateEntities(true, true);
        boolean boolean33 = lineAndShapeRenderer2.getUseFillPaint();
        org.jfree.chart.renderer.category.BarRenderer barRenderer35 = new org.jfree.chart.renderer.category.BarRenderer();
        boolean boolean36 = barRenderer35.isDrawBarOutline();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer39 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color40 = java.awt.Color.BLUE;
        lineAndShapeRenderer39.setBaseItemLabelPaint((java.awt.Paint) color40);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator45 = lineAndShapeRenderer39.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition46 = lineAndShapeRenderer39.getBaseNegativeItemLabelPosition();
        barRenderer35.setNegativeItemLabelPositionFallback(itemLabelPosition46);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer50 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator51 = null;
        lineAndShapeRenderer50.setBaseURLGenerator(categoryURLGenerator51);
        java.awt.Shape shape54 = lineAndShapeRenderer50.getLegendShape(0);
        lineAndShapeRenderer50.setAutoPopulateSeriesStroke(false);
        java.awt.Font font58 = lineAndShapeRenderer50.getSeriesItemLabelFont(0);
        lineAndShapeRenderer50.setUseSeriesOffset(true);
        java.awt.Shape shape62 = null;
        lineAndShapeRenderer50.setSeriesShape((int) (short) 10, shape62, true);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition65 = lineAndShapeRenderer50.getBasePositiveItemLabelPosition();
        org.jfree.chart.text.TextAnchor textAnchor66 = itemLabelPosition65.getTextAnchor();
        barRenderer35.setPositiveItemLabelPositionFallback(itemLabelPosition65);
        boolean boolean68 = barRenderer35.getShadowsVisible();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition69 = barRenderer35.getNegativeItemLabelPositionFallback();
        lineAndShapeRenderer2.setSeriesNegativeItemLabelPosition((int) 'a', itemLabelPosition69, true);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on itemLabelPosition17 and itemLabelPosition65", itemLabelPosition17.equals(itemLabelPosition65) ? itemLabelPosition17.hashCode() == itemLabelPosition65.hashCode() : true);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test094");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color3 = java.awt.Color.BLUE;
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color3);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator8 = lineAndShapeRenderer2.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator9 = null;
        lineAndShapeRenderer2.setLegendItemURLGenerator(categorySeriesLabelGenerator9);
        java.awt.Paint paint12 = lineAndShapeRenderer2.getSeriesPaint(1);
        java.awt.Paint paint16 = lineAndShapeRenderer2.getItemFillPaint((-1), (int) (short) 100, false);
        java.awt.Shape shape18 = lineAndShapeRenderer2.lookupLegendShape(4);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer21 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator22 = null;
        lineAndShapeRenderer21.setBaseURLGenerator(categoryURLGenerator22);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator25 = null;
        lineAndShapeRenderer21.setSeriesToolTipGenerator(10, categoryToolTipGenerator25);
        boolean boolean27 = lineAndShapeRenderer21.getBaseSeriesVisibleInLegend();
        java.awt.Stroke stroke29 = null;
        lineAndShapeRenderer21.setSeriesStroke((int) 'a', stroke29, true);
        org.jfree.chart.labels.ItemLabelAnchor itemLabelAnchor33 = org.jfree.chart.labels.ItemLabelAnchor.INSIDE3;
        java.awt.Color color34 = java.awt.Color.yellow;
        boolean boolean35 = itemLabelAnchor33.equals((java.lang.Object) color34);
        lineAndShapeRenderer21.setSeriesFillPaint((int) ' ', (java.awt.Paint) color34);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer39 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color40 = java.awt.Color.BLUE;
        lineAndShapeRenderer39.setBaseItemLabelPaint((java.awt.Paint) color40);
        java.awt.Stroke stroke43 = lineAndShapeRenderer39.getSeriesOutlineStroke((int) (short) 1);
        org.jfree.data.category.CategoryDataset categoryDataset44 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis46 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float47 = categoryAxis46.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis48 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer51 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color52 = java.awt.Color.BLUE;
        lineAndShapeRenderer51.setBaseItemLabelPaint((java.awt.Paint) color52);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator57 = lineAndShapeRenderer51.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot58 = new org.jfree.chart.plot.CategoryPlot(categoryDataset44, categoryAxis46, valueAxis48, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer51);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer59 = categoryPlot58.getRenderer();
        org.jfree.chart.axis.ValueAxis valueAxis61 = lineAndShapeRenderer39.getRangeAxis(categoryPlot58, (int) '4');
        boolean boolean62 = categoryPlot58.isRangeCrosshairVisible();
        lineAndShapeRenderer21.addChangeListener((org.jfree.chart.event.RendererChangeListener) categoryPlot58);
        org.jfree.chart.entity.PlotEntity plotEntity64 = new org.jfree.chart.entity.PlotEntity(shape18, (org.jfree.chart.plot.Plot) categoryPlot58);
        org.jfree.chart.plot.Plot plot65 = plotEntity64.getPlot();
        java.lang.String str66 = plotEntity64.getShapeCoords();
        plotEntity64.setToolTipText("java.awt.Color[r=64,g=255,b=64]");
        java.lang.String str69 = plotEntity64.getShapeType();
        java.lang.String str70 = plotEntity64.toString();
        java.lang.Object obj71 = plotEntity64.clone();
        java.lang.String str72 = plotEntity64.getShapeCoords();
        org.jfree.chart.plot.DefaultDrawingSupplier defaultDrawingSupplier73 = new org.jfree.chart.plot.DefaultDrawingSupplier();
        java.awt.Shape shape74 = defaultDrawingSupplier73.getNextShape();
        java.lang.Object obj75 = defaultDrawingSupplier73.clone();
        java.lang.Object obj76 = defaultDrawingSupplier73.clone();
        boolean boolean77 = plotEntity64.equals(obj76);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on defaultDrawingSupplier73 and obj75", defaultDrawingSupplier73.equals(obj75) ? defaultDrawingSupplier73.hashCode() == obj75.hashCode() : true);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test095");
        org.jfree.data.category.CategoryDataset categoryDataset1 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis3 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float4 = categoryAxis3.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis5 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer8 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color9 = java.awt.Color.BLUE;
        lineAndShapeRenderer8.setBaseItemLabelPaint((java.awt.Paint) color9);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator14 = lineAndShapeRenderer8.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot15 = new org.jfree.chart.plot.CategoryPlot(categoryDataset1, categoryAxis3, valueAxis5, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer8);
        org.jfree.chart.axis.AxisLocation axisLocation16 = org.jfree.chart.axis.AxisLocation.TOP_OR_LEFT;
        categoryPlot15.setRangeAxisLocation(axisLocation16);
        categoryPlot15.configureDomainAxes();
        categoryPlot15.setBackgroundImageAlpha((float) 0);
        boolean boolean21 = categoryPlot15.isRangeZoomable();
        org.jfree.data.KeyedObject keyedObject22 = new org.jfree.data.KeyedObject((java.lang.Comparable) "ItemLabelAnchor.INSIDE10", (java.lang.Object) boolean21);
        org.jfree.data.category.CategoryDataset categoryDataset23 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis25 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float26 = categoryAxis25.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis27 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer30 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color31 = java.awt.Color.BLUE;
        lineAndShapeRenderer30.setBaseItemLabelPaint((java.awt.Paint) color31);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator36 = lineAndShapeRenderer30.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot37 = new org.jfree.chart.plot.CategoryPlot(categoryDataset23, categoryAxis25, valueAxis27, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer30);
        categoryAxis25.setUpperMargin(10.0d);
        org.jfree.chart.util.ObjectList objectList41 = new org.jfree.chart.util.ObjectList(8);
        int int43 = objectList41.indexOf((java.lang.Object) "hi!");
        boolean boolean44 = categoryAxis25.equals((java.lang.Object) objectList41);
        java.lang.Object obj46 = objectList41.get((int) (byte) 1);
        org.jfree.chart.axis.CategoryAxis categoryAxis48 = new org.jfree.chart.axis.CategoryAxis("hi!");
        java.lang.Object obj49 = categoryAxis48.clone();
        java.awt.Font font50 = categoryAxis48.getTickLabelFont();
        java.awt.Paint paint51 = categoryAxis48.getLabelPaint();
        java.awt.Stroke stroke52 = categoryAxis48.getAxisLineStroke();
        int int53 = objectList41.indexOf((java.lang.Object) stroke52);
        java.lang.Object obj55 = objectList41.get(192);
        keyedObject22.setObject((java.lang.Object) objectList41);
        org.jfree.chart.util.StrokeList strokeList57 = new org.jfree.chart.util.StrokeList();
        keyedObject22.setObject((java.lang.Object) strokeList57);
        java.lang.Object obj59 = keyedObject22.clone();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on objectList41 and strokeList57.", objectList41.equals(strokeList57) == strokeList57.equals(objectList41));
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test096");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color3 = java.awt.Color.BLUE;
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color3);
        java.awt.Stroke stroke6 = lineAndShapeRenderer2.getSeriesOutlineStroke((int) (short) 1);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition8 = lineAndShapeRenderer2.getSeriesNegativeItemLabelPosition((int) (short) 1);
        lineAndShapeRenderer2.setSeriesCreateEntities((int) (short) 1, (java.lang.Boolean) false, false);
        lineAndShapeRenderer2.setAutoPopulateSeriesOutlineStroke(true);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer18 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color19 = java.awt.Color.BLUE;
        lineAndShapeRenderer18.setBaseItemLabelPaint((java.awt.Paint) color19);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator24 = lineAndShapeRenderer18.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition25 = lineAndShapeRenderer18.getBaseNegativeItemLabelPosition();
        lineAndShapeRenderer2.setSeriesPositiveItemLabelPosition(5, itemLabelPosition25, false);
        boolean boolean29 = lineAndShapeRenderer2.isSeriesVisibleInLegend(9);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on itemLabelPosition8 and itemLabelPosition25", itemLabelPosition8.equals(itemLabelPosition25) ? itemLabelPosition8.hashCode() == itemLabelPosition25.hashCode() : true);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test097");
        org.jfree.chart.LegendItem legendItem1 = new org.jfree.chart.LegendItem("hi!");
        java.awt.Color color5 = java.awt.Color.getHSBColor((float) (short) 1, (float) ' ', 0.0f);
        legendItem1.setLinePaint((java.awt.Paint) color5);
        boolean boolean7 = legendItem1.isShapeOutlineVisible();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer10 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color11 = java.awt.Color.BLUE;
        lineAndShapeRenderer10.setBaseItemLabelPaint((java.awt.Paint) color11);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator16 = lineAndShapeRenderer10.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition18 = lineAndShapeRenderer10.getSeriesPositiveItemLabelPosition((int) 'a');
        java.awt.Shape shape20 = lineAndShapeRenderer10.lookupLegendShape(8);
        legendItem1.setLine(shape20);
        org.jfree.data.category.CategoryDataset categoryDataset22 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis24 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float25 = categoryAxis24.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis26 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer29 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color30 = java.awt.Color.BLUE;
        lineAndShapeRenderer29.setBaseItemLabelPaint((java.awt.Paint) color30);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator35 = lineAndShapeRenderer29.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot36 = new org.jfree.chart.plot.CategoryPlot(categoryDataset22, categoryAxis24, valueAxis26, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer29);
        java.lang.Object obj37 = categoryPlot36.clone();
        org.jfree.chart.util.RectangleEdge rectangleEdge39 = categoryPlot36.getDomainAxisEdge((int) ' ');
        boolean boolean40 = categoryPlot36.isRangeZeroBaselineVisible();
        org.jfree.chart.axis.CategoryAxis categoryAxis42 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float43 = categoryAxis42.getTickMarkInsideLength();
        categoryAxis42.setTickLabelsVisible(false);
        double double46 = categoryAxis42.getLowerMargin();
        boolean boolean47 = categoryPlot36.equals((java.lang.Object) categoryAxis42);
        org.jfree.chart.entity.PlotEntity plotEntity49 = new org.jfree.chart.entity.PlotEntity(shape20, (org.jfree.chart.plot.Plot) categoryPlot36, "TextAnchor.BOTTOM_CENTER");
        org.jfree.chart.plot.Plot plot50 = plotEntity49.getPlot();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on plot50 and obj37", plot50.equals(obj37) ? plot50.hashCode() == obj37.hashCode() : true);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test098");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        boolean boolean4 = lineAndShapeRenderer2.isSeriesVisibleInLegend(1);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator6 = null;
        lineAndShapeRenderer2.setSeriesItemLabelGenerator((int) (short) 100, categoryItemLabelGenerator6, true);
        boolean boolean10 = lineAndShapeRenderer2.isSeriesVisible(1);
        java.awt.Graphics2D graphics2D11 = null;
        java.awt.geom.Rectangle2D rectangle2D12 = null;
        org.jfree.data.category.CategoryDataset categoryDataset13 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis15 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float16 = categoryAxis15.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis17 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer20 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color21 = java.awt.Color.BLUE;
        lineAndShapeRenderer20.setBaseItemLabelPaint((java.awt.Paint) color21);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator26 = lineAndShapeRenderer20.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot27 = new org.jfree.chart.plot.CategoryPlot(categoryDataset13, categoryAxis15, valueAxis17, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer20);
        java.lang.Object obj28 = categoryPlot27.clone();
        boolean boolean29 = categoryPlot27.isRangeZoomable();
        categoryPlot27.setOutlineVisible(true);
        org.jfree.data.category.DefaultCategoryDataset defaultCategoryDataset32 = new org.jfree.data.category.DefaultCategoryDataset();
        int int34 = defaultCategoryDataset32.getColumnIndex((java.lang.Comparable) 3.0d);
        int int36 = defaultCategoryDataset32.getRowIndex((java.lang.Comparable) (byte) 10);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer39 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color40 = java.awt.Color.BLUE;
        lineAndShapeRenderer39.setBaseItemLabelPaint((java.awt.Paint) color40);
        java.awt.Stroke stroke43 = lineAndShapeRenderer39.getSeriesOutlineStroke((int) (short) 1);
        org.jfree.data.category.CategoryDataset categoryDataset44 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis46 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float47 = categoryAxis46.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis48 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer51 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color52 = java.awt.Color.BLUE;
        lineAndShapeRenderer51.setBaseItemLabelPaint((java.awt.Paint) color52);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator57 = lineAndShapeRenderer51.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot58 = new org.jfree.chart.plot.CategoryPlot(categoryDataset44, categoryAxis46, valueAxis48, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer51);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer59 = categoryPlot58.getRenderer();
        org.jfree.chart.axis.ValueAxis valueAxis61 = lineAndShapeRenderer39.getRangeAxis(categoryPlot58, (int) '4');
        double double62 = categoryPlot58.getRangeCrosshairValue();
        java.awt.Paint paint63 = categoryPlot58.getRangeZeroBaselinePaint();
        int int64 = categoryPlot58.getRangeAxisCount();
        java.awt.Color color65 = java.awt.Color.BLUE;
        categoryPlot58.setRangeMinorGridlinePaint((java.awt.Paint) color65);
        java.awt.Stroke stroke67 = categoryPlot58.getRangeMinorGridlineStroke();
        float float68 = categoryPlot58.getBackgroundAlpha();
        defaultCategoryDataset32.addChangeListener((org.jfree.data.event.DatasetChangeListener) categoryPlot58);
        org.jfree.data.category.CategoryDatasetSelectionState categoryDatasetSelectionState70 = defaultCategoryDataset32.getSelectionState();
        defaultCategoryDataset32.addValue((double) (-1L), (java.lang.Comparable) (-1.6776955E7d), (java.lang.Comparable) 3.0d);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo75 = null;
        org.jfree.chart.renderer.category.CategoryItemRendererState categoryItemRendererState76 = lineAndShapeRenderer2.initialise(graphics2D11, rectangle2D12, categoryPlot27, (org.jfree.data.category.CategoryDataset) defaultCategoryDataset32, plotRenderingInfo75);
        java.awt.Font font78 = null;
        lineAndShapeRenderer2.setSeriesItemLabelFont(0, font78);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryPlot27 and obj28", categoryPlot27.equals(obj28) ? categoryPlot27.hashCode() == obj28.hashCode() : true);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test099");
        org.jfree.chart.renderer.category.BarRenderer barRenderer0 = new org.jfree.chart.renderer.category.BarRenderer();
        boolean boolean1 = barRenderer0.isDrawBarOutline();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer4 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color5 = java.awt.Color.BLUE;
        lineAndShapeRenderer4.setBaseItemLabelPaint((java.awt.Paint) color5);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator10 = lineAndShapeRenderer4.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition11 = lineAndShapeRenderer4.getBaseNegativeItemLabelPosition();
        barRenderer0.setNegativeItemLabelPositionFallback(itemLabelPosition11);
        boolean boolean13 = barRenderer0.getIncludeBaseInRange();
        org.jfree.chart.renderer.category.BarRenderer barRenderer14 = new org.jfree.chart.renderer.category.BarRenderer();
        boolean boolean15 = barRenderer14.isDrawBarOutline();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer18 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color19 = java.awt.Color.BLUE;
        lineAndShapeRenderer18.setBaseItemLabelPaint((java.awt.Paint) color19);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator24 = lineAndShapeRenderer18.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition25 = lineAndShapeRenderer18.getBaseNegativeItemLabelPosition();
        barRenderer14.setNegativeItemLabelPositionFallback(itemLabelPosition25);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer29 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator30 = null;
        lineAndShapeRenderer29.setBaseURLGenerator(categoryURLGenerator30);
        java.awt.Shape shape33 = lineAndShapeRenderer29.getLegendShape(0);
        lineAndShapeRenderer29.setAutoPopulateSeriesStroke(false);
        java.awt.Font font37 = lineAndShapeRenderer29.getSeriesItemLabelFont(0);
        lineAndShapeRenderer29.setUseSeriesOffset(true);
        java.awt.Shape shape41 = null;
        lineAndShapeRenderer29.setSeriesShape((int) (short) 10, shape41, true);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition44 = lineAndShapeRenderer29.getBasePositiveItemLabelPosition();
        org.jfree.chart.text.TextAnchor textAnchor45 = itemLabelPosition44.getTextAnchor();
        barRenderer14.setPositiveItemLabelPositionFallback(itemLabelPosition44);
        boolean boolean47 = barRenderer14.getShadowsVisible();
        org.jfree.chart.renderer.category.BarPainter barPainter48 = barRenderer14.getBarPainter();
        org.jfree.chart.renderer.category.BarRenderer.setDefaultBarPainter(barPainter48);
        barRenderer0.setBarPainter(barPainter48);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on itemLabelPosition11 and itemLabelPosition25", itemLabelPosition11.equals(itemLabelPosition25) ? itemLabelPosition11.hashCode() == itemLabelPosition25.hashCode() : true);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test100");
        org.jfree.data.KeyedObjects keyedObjects0 = new org.jfree.data.KeyedObjects();
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
        org.jfree.chart.util.RectangleEdge rectangleEdge28 = categoryPlot23.getDomainAxisEdge();
        boolean boolean29 = categoryPlot23.isRangeZeroBaselineVisible();
        boolean boolean30 = categoryPlot23.isDomainGridlinesVisible();
        keyedObjects0.addObject((java.lang.Comparable) (short) 100, (java.lang.Object) categoryPlot23);
        int int32 = keyedObjects0.getItemCount();
        org.jfree.data.KeyedObjects keyedObjects34 = new org.jfree.data.KeyedObjects();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer38 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color39 = java.awt.Color.BLUE;
        lineAndShapeRenderer38.setBaseItemLabelPaint((java.awt.Paint) color39);
        java.awt.Stroke stroke42 = lineAndShapeRenderer38.getSeriesOutlineStroke((int) (short) 1);
        org.jfree.data.category.CategoryDataset categoryDataset43 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis45 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float46 = categoryAxis45.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis47 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer50 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color51 = java.awt.Color.BLUE;
        lineAndShapeRenderer50.setBaseItemLabelPaint((java.awt.Paint) color51);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator56 = lineAndShapeRenderer50.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot57 = new org.jfree.chart.plot.CategoryPlot(categoryDataset43, categoryAxis45, valueAxis47, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer50);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer58 = categoryPlot57.getRenderer();
        org.jfree.chart.axis.ValueAxis valueAxis60 = lineAndShapeRenderer38.getRangeAxis(categoryPlot57, (int) '4');
        boolean boolean61 = categoryPlot57.isRangeCrosshairVisible();
        org.jfree.chart.util.RectangleEdge rectangleEdge62 = categoryPlot57.getDomainAxisEdge();
        boolean boolean63 = categoryPlot57.isRangeZeroBaselineVisible();
        boolean boolean64 = categoryPlot57.isDomainGridlinesVisible();
        keyedObjects34.addObject((java.lang.Comparable) (short) 100, (java.lang.Object) categoryPlot57);
        org.jfree.chart.axis.CategoryAxis categoryAxis66 = null;
        java.util.List list67 = categoryPlot57.getCategoriesForAxis(categoryAxis66);
        keyedObjects0.addObject((java.lang.Comparable) "CategoryAnchor.MIDDLE", (java.lang.Object) categoryAxis66);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryPlot23 and categoryPlot57", categoryPlot23.equals(categoryPlot57) ? categoryPlot23.hashCode() == categoryPlot57.hashCode() : true);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test101");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float3 = categoryAxis2.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis4 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer7 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color8 = java.awt.Color.BLUE;
        lineAndShapeRenderer7.setBaseItemLabelPaint((java.awt.Paint) color8);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator13 = lineAndShapeRenderer7.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot14 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis2, valueAxis4, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer7);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer15 = categoryPlot14.getRenderer();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer18 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        boolean boolean20 = lineAndShapeRenderer18.isSeriesVisibleInLegend(1);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator22 = null;
        lineAndShapeRenderer18.setSeriesURLGenerator(0, categoryURLGenerator22, false);
        java.awt.Color color25 = org.jfree.chart.ChartColor.LIGHT_GREEN;
        java.awt.color.ColorSpace colorSpace26 = color25.getColorSpace();
        lineAndShapeRenderer18.setBaseFillPaint((java.awt.Paint) color25);
        categoryPlot14.setDomainCrosshairPaint((java.awt.Paint) color25);
        org.jfree.chart.axis.CategoryAnchor categoryAnchor29 = categoryPlot14.getDomainGridlinePosition();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer32 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color33 = java.awt.Color.BLUE;
        lineAndShapeRenderer32.setBaseItemLabelPaint((java.awt.Paint) color33);
        java.awt.Stroke stroke36 = lineAndShapeRenderer32.getSeriesOutlineStroke((int) (short) 1);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator38 = null;
        lineAndShapeRenderer32.setSeriesItemLabelGenerator((int) (short) 100, categoryItemLabelGenerator38);
        lineAndShapeRenderer32.setDrawOutlines(true);
        boolean boolean42 = lineAndShapeRenderer32.getBaseCreateEntities();
        java.awt.Paint paint46 = lineAndShapeRenderer32.getItemFillPaint((-12517568), (-1), true);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer50 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator51 = null;
        lineAndShapeRenderer50.setBaseURLGenerator(categoryURLGenerator51);
        java.awt.Shape shape54 = lineAndShapeRenderer50.getLegendShape(0);
        lineAndShapeRenderer50.setAutoPopulateSeriesStroke(false);
        java.awt.Font font58 = lineAndShapeRenderer50.getSeriesItemLabelFont(0);
        lineAndShapeRenderer50.setUseSeriesOffset(true);
        int int61 = lineAndShapeRenderer50.getColumnCount();
        lineAndShapeRenderer50.setBaseSeriesVisibleInLegend(true);
        java.awt.Stroke stroke67 = lineAndShapeRenderer50.getItemOutlineStroke((int) (byte) -1, (int) (byte) 100, false);
        lineAndShapeRenderer32.setSeriesOutlineStroke((int) (short) 100, stroke67);
        boolean boolean69 = categoryAnchor29.equals((java.lang.Object) stroke67);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on lineAndShapeRenderer7 and lineAndShapeRenderer32.", lineAndShapeRenderer7.equals(lineAndShapeRenderer32) == lineAndShapeRenderer32.equals(lineAndShapeRenderer7));
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test102");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer3 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color4 = java.awt.Color.BLUE;
        lineAndShapeRenderer3.setBaseItemLabelPaint((java.awt.Paint) color4);
        java.awt.Stroke stroke7 = lineAndShapeRenderer3.getSeriesOutlineStroke((int) (short) 1);
        org.jfree.data.category.CategoryDataset categoryDataset8 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis10 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float11 = categoryAxis10.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis12 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer15 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color16 = java.awt.Color.BLUE;
        lineAndShapeRenderer15.setBaseItemLabelPaint((java.awt.Paint) color16);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator21 = lineAndShapeRenderer15.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot22 = new org.jfree.chart.plot.CategoryPlot(categoryDataset8, categoryAxis10, valueAxis12, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer15);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer23 = categoryPlot22.getRenderer();
        org.jfree.chart.axis.ValueAxis valueAxis25 = lineAndShapeRenderer3.getRangeAxis(categoryPlot22, (int) '4');
        double double26 = categoryPlot22.getRangeCrosshairValue();
        java.awt.Paint paint27 = categoryPlot22.getRangeZeroBaselinePaint();
        int int28 = categoryPlot22.getRangeAxisCount();
        java.awt.Color color29 = java.awt.Color.BLUE;
        categoryPlot22.setRangeMinorGridlinePaint((java.awt.Paint) color29);
        java.awt.Stroke stroke31 = categoryPlot22.getRangeMinorGridlineStroke();
        float float32 = categoryPlot22.getBackgroundAlpha();
        org.jfree.data.category.DefaultCategoryDataset defaultCategoryDataset33 = new org.jfree.data.category.DefaultCategoryDataset();
        int int35 = defaultCategoryDataset33.getColumnIndex((java.lang.Comparable) 3.0d);
        int int37 = defaultCategoryDataset33.getRowIndex((java.lang.Comparable) (byte) 10);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer40 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color41 = java.awt.Color.BLUE;
        lineAndShapeRenderer40.setBaseItemLabelPaint((java.awt.Paint) color41);
        java.awt.Stroke stroke44 = lineAndShapeRenderer40.getSeriesOutlineStroke((int) (short) 1);
        org.jfree.data.category.CategoryDataset categoryDataset45 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis47 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float48 = categoryAxis47.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis49 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer52 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color53 = java.awt.Color.BLUE;
        lineAndShapeRenderer52.setBaseItemLabelPaint((java.awt.Paint) color53);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator58 = lineAndShapeRenderer52.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot59 = new org.jfree.chart.plot.CategoryPlot(categoryDataset45, categoryAxis47, valueAxis49, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer52);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer60 = categoryPlot59.getRenderer();
        org.jfree.chart.axis.ValueAxis valueAxis62 = lineAndShapeRenderer40.getRangeAxis(categoryPlot59, (int) '4');
        double double63 = categoryPlot59.getRangeCrosshairValue();
        java.awt.Paint paint64 = categoryPlot59.getRangeZeroBaselinePaint();
        int int65 = categoryPlot59.getRangeAxisCount();
        java.awt.Color color66 = java.awt.Color.BLUE;
        categoryPlot59.setRangeMinorGridlinePaint((java.awt.Paint) color66);
        java.awt.Stroke stroke68 = categoryPlot59.getRangeMinorGridlineStroke();
        float float69 = categoryPlot59.getBackgroundAlpha();
        defaultCategoryDataset33.addChangeListener((org.jfree.data.event.DatasetChangeListener) categoryPlot59);
        org.jfree.data.category.CategoryDatasetSelectionState categoryDatasetSelectionState71 = defaultCategoryDataset33.getSelectionState();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer72 = categoryPlot22.getRendererForDataset((org.jfree.data.category.CategoryDataset) defaultCategoryDataset33);
        org.jfree.data.KeyedObject keyedObject73 = new org.jfree.data.KeyedObject((java.lang.Comparable) (byte) 1, (java.lang.Object) categoryPlot22);
        java.lang.Object obj74 = keyedObject73.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryPlot22 and categoryPlot59", categoryPlot22.equals(categoryPlot59) ? categoryPlot22.hashCode() == categoryPlot59.hashCode() : true);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test103");
        org.jfree.data.KeyedObjects keyedObjects0 = new org.jfree.data.KeyedObjects();
        java.lang.Object obj1 = keyedObjects0.clone();
        int int3 = keyedObjects0.getIndex((java.lang.Comparable) (-1.0d));
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer6 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        boolean boolean8 = lineAndShapeRenderer6.isSeriesVisibleInLegend(1);
        java.awt.Font font9 = lineAndShapeRenderer6.getBaseItemLabelFont();
        java.awt.Stroke stroke13 = lineAndShapeRenderer6.getItemStroke(100, 0, true);
        boolean boolean15 = lineAndShapeRenderer6.isSeriesVisible(4);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer19 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color20 = java.awt.Color.BLUE;
        lineAndShapeRenderer19.setBaseItemLabelPaint((java.awt.Paint) color20);
        java.awt.Shape shape22 = lineAndShapeRenderer19.getBaseShape();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer25 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator26 = null;
        lineAndShapeRenderer25.setBaseURLGenerator(categoryURLGenerator26);
        java.awt.Shape shape29 = lineAndShapeRenderer25.getLegendShape(0);
        lineAndShapeRenderer25.setAutoPopulateSeriesStroke(false);
        java.awt.Font font33 = lineAndShapeRenderer25.getSeriesItemLabelFont(0);
        lineAndShapeRenderer25.setUseSeriesOffset(true);
        java.awt.Font font37 = null;
        lineAndShapeRenderer25.setSeriesItemLabelFont((int) (short) 1, font37, false);
        java.awt.Stroke stroke43 = lineAndShapeRenderer25.getItemOutlineStroke(0, 1, false);
        lineAndShapeRenderer19.setBaseStroke(stroke43, true);
        lineAndShapeRenderer19.clearSeriesStrokes(true);
        java.awt.Stroke stroke48 = lineAndShapeRenderer19.getBaseOutlineStroke();
        lineAndShapeRenderer6.setSeriesOutlineStroke((int) ' ', stroke48, true);
        org.jfree.data.category.CategoryDataset categoryDataset51 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis53 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float54 = categoryAxis53.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis55 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer58 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color59 = java.awt.Color.BLUE;
        lineAndShapeRenderer58.setBaseItemLabelPaint((java.awt.Paint) color59);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator64 = lineAndShapeRenderer58.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot65 = new org.jfree.chart.plot.CategoryPlot(categoryDataset51, categoryAxis53, valueAxis55, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer58);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent66 = new org.jfree.chart.event.PlotChangeEvent((org.jfree.chart.plot.Plot) categoryPlot65);
        java.awt.Stroke stroke67 = categoryPlot65.getRangeMinorGridlineStroke();
        java.awt.Paint paint68 = categoryPlot65.getDomainGridlinePaint();
        lineAndShapeRenderer6.setPlot(categoryPlot65);
        org.jfree.data.category.CategoryDataset categoryDataset70 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis72 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float73 = categoryAxis72.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis74 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer77 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color78 = java.awt.Color.BLUE;
        lineAndShapeRenderer77.setBaseItemLabelPaint((java.awt.Paint) color78);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator83 = lineAndShapeRenderer77.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot84 = new org.jfree.chart.plot.CategoryPlot(categoryDataset70, categoryAxis72, valueAxis74, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer77);
        java.lang.Object obj85 = categoryPlot84.clone();
        org.jfree.chart.util.RectangleInsets rectangleInsets86 = org.jfree.chart.axis.Axis.DEFAULT_AXIS_LABEL_INSETS;
        double double88 = rectangleInsets86.extendWidth((double) 10L);
        double double90 = rectangleInsets86.extendWidth((double) (short) -1);
        double double91 = rectangleInsets86.getRight();
        categoryPlot84.setInsets(rectangleInsets86, false);
        categoryPlot84.clearDomainAxes();
        org.jfree.chart.util.SortOrder sortOrder95 = categoryPlot84.getColumnRenderingOrder();
        categoryPlot65.setRowRenderingOrder(sortOrder95);
        keyedObjects0.sortByKeys(sortOrder95);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryPlot65 and obj85", categoryPlot65.equals(obj85) ? categoryPlot65.hashCode() == obj85.hashCode() : true);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test104");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color3 = java.awt.Color.BLUE;
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color3);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator8 = lineAndShapeRenderer2.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator9 = null;
        lineAndShapeRenderer2.setLegendItemURLGenerator(categorySeriesLabelGenerator9);
        java.awt.Paint paint12 = lineAndShapeRenderer2.getSeriesPaint(1);
        org.jfree.chart.renderer.RenderAttributes renderAttributes13 = lineAndShapeRenderer2.getSelectedItemAttributes();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator14 = null;
        lineAndShapeRenderer2.setLegendItemURLGenerator(categorySeriesLabelGenerator14);
        java.awt.Font font19 = lineAndShapeRenderer2.getItemLabelFont((int) '4', (int) 'a', false);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer23 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator24 = null;
        lineAndShapeRenderer23.setBaseURLGenerator(categoryURLGenerator24);
        java.awt.Shape shape27 = lineAndShapeRenderer23.getLegendShape(0);
        lineAndShapeRenderer23.setAutoPopulateSeriesStroke(false);
        java.awt.Font font31 = lineAndShapeRenderer23.getSeriesItemLabelFont(0);
        lineAndShapeRenderer23.setUseSeriesOffset(true);
        java.awt.Shape shape35 = null;
        lineAndShapeRenderer23.setSeriesShape((int) (short) 10, shape35, true);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition38 = lineAndShapeRenderer23.getBasePositiveItemLabelPosition();
        org.jfree.chart.text.TextAnchor textAnchor39 = itemLabelPosition38.getTextAnchor();
        lineAndShapeRenderer2.setSeriesPositiveItemLabelPosition(1, itemLabelPosition38, false);
        org.jfree.chart.ChartColor chartColor45 = new org.jfree.chart.ChartColor(0, 8, (int) ' ');
        lineAndShapeRenderer2.setBasePaint((java.awt.Paint) chartColor45);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer49 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color50 = java.awt.Color.BLUE;
        lineAndShapeRenderer49.setBaseItemLabelPaint((java.awt.Paint) color50);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator55 = lineAndShapeRenderer49.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition57 = lineAndShapeRenderer49.getSeriesPositiveItemLabelPosition((int) 'a');
        boolean boolean58 = lineAndShapeRenderer49.getBaseItemLabelsVisible();
        java.awt.Paint paint60 = lineAndShapeRenderer49.getSeriesItemLabelPaint(0);
        java.awt.Stroke stroke61 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_STROKE;
        lineAndShapeRenderer49.setBaseStroke(stroke61);
        lineAndShapeRenderer2.setBaseOutlineStroke(stroke61, false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on itemLabelPosition38 and itemLabelPosition57", itemLabelPosition38.equals(itemLabelPosition57) ? itemLabelPosition38.hashCode() == itemLabelPosition57.hashCode() : true);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test105");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float3 = categoryAxis2.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis4 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer7 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color8 = java.awt.Color.BLUE;
        lineAndShapeRenderer7.setBaseItemLabelPaint((java.awt.Paint) color8);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator13 = lineAndShapeRenderer7.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot14 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis2, valueAxis4, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer7);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent15 = new org.jfree.chart.event.PlotChangeEvent((org.jfree.chart.plot.Plot) categoryPlot14);
        org.jfree.chart.LegendItemCollection legendItemCollection16 = categoryPlot14.getLegendItems();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer19 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color20 = java.awt.Color.BLUE;
        lineAndShapeRenderer19.setBaseItemLabelPaint((java.awt.Paint) color20);
        java.awt.Stroke stroke23 = lineAndShapeRenderer19.getSeriesOutlineStroke((int) (short) 1);
        org.jfree.data.category.CategoryDataset categoryDataset24 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis26 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float27 = categoryAxis26.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis28 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer31 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color32 = java.awt.Color.BLUE;
        lineAndShapeRenderer31.setBaseItemLabelPaint((java.awt.Paint) color32);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator37 = lineAndShapeRenderer31.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot38 = new org.jfree.chart.plot.CategoryPlot(categoryDataset24, categoryAxis26, valueAxis28, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer31);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer39 = categoryPlot38.getRenderer();
        org.jfree.chart.axis.ValueAxis valueAxis41 = lineAndShapeRenderer19.getRangeAxis(categoryPlot38, (int) '4');
        boolean boolean42 = categoryPlot38.isRangeCrosshairVisible();
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder43 = categoryPlot38.getDatasetRenderingOrder();
        org.jfree.data.category.CategoryDataset categoryDataset44 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis46 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float47 = categoryAxis46.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis48 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer51 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color52 = java.awt.Color.BLUE;
        lineAndShapeRenderer51.setBaseItemLabelPaint((java.awt.Paint) color52);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator57 = lineAndShapeRenderer51.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot58 = new org.jfree.chart.plot.CategoryPlot(categoryDataset44, categoryAxis46, valueAxis48, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer51);
        org.jfree.chart.axis.AxisLocation axisLocation59 = org.jfree.chart.axis.AxisLocation.TOP_OR_LEFT;
        categoryPlot58.setRangeAxisLocation(axisLocation59);
        categoryPlot38.setRangeAxisLocation(axisLocation59, true);
        java.awt.Color color63 = org.jfree.chart.ChartColor.LIGHT_GREEN;
        categoryPlot38.setRangeMinorGridlinePaint((java.awt.Paint) color63);
        categoryPlot38.setRangeMinorGridlinesVisible(true);
        org.jfree.chart.util.Layer layer67 = null;
        java.util.Collection collection68 = categoryPlot38.getRangeMarkers(layer67);
        org.jfree.chart.LegendItemCollection legendItemCollection69 = categoryPlot38.getLegendItems();
        org.jfree.chart.axis.CategoryAnchor categoryAnchor70 = categoryPlot38.getDomainGridlinePosition();
        java.lang.String str71 = categoryAnchor70.toString();
        categoryPlot14.setDomainGridlinePosition(categoryAnchor70);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on legendItemCollection16 and legendItemCollection69", legendItemCollection16.equals(legendItemCollection69) ? legendItemCollection16.hashCode() == legendItemCollection69.hashCode() : true);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test106");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        boolean boolean4 = lineAndShapeRenderer2.isSeriesVisibleInLegend(1);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator6 = null;
        lineAndShapeRenderer2.setSeriesURLGenerator(0, categoryURLGenerator6, false);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator10 = lineAndShapeRenderer2.getSeriesToolTipGenerator((int) '#');
        boolean boolean11 = lineAndShapeRenderer2.getAutoPopulateSeriesOutlineStroke();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer15 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator16 = null;
        lineAndShapeRenderer15.setBaseURLGenerator(categoryURLGenerator16);
        java.awt.Shape shape19 = lineAndShapeRenderer15.getLegendShape(0);
        lineAndShapeRenderer15.setAutoPopulateSeriesStroke(false);
        java.awt.Font font23 = lineAndShapeRenderer15.getSeriesItemLabelFont(0);
        lineAndShapeRenderer15.setUseSeriesOffset(true);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator26 = null;
        lineAndShapeRenderer15.setBaseToolTipGenerator(categoryToolTipGenerator26);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator28 = lineAndShapeRenderer15.getLegendItemLabelGenerator();
        java.awt.Paint paint29 = lineAndShapeRenderer15.getBaseItemLabelPaint();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition31 = null;
        lineAndShapeRenderer15.setSeriesPositiveItemLabelPosition((int) (byte) 0, itemLabelPosition31);
        java.awt.Color color34 = org.jfree.chart.ChartColor.VERY_DARK_YELLOW;
        lineAndShapeRenderer15.setSeriesItemLabelPaint((int) ' ', (java.awt.Paint) color34);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer39 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator40 = null;
        lineAndShapeRenderer39.setBaseURLGenerator(categoryURLGenerator40);
        java.awt.Shape shape43 = lineAndShapeRenderer39.getLegendShape(0);
        lineAndShapeRenderer39.setAutoPopulateSeriesStroke(false);
        java.awt.Font font47 = lineAndShapeRenderer39.getSeriesItemLabelFont(0);
        lineAndShapeRenderer39.setUseSeriesOffset(true);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator50 = null;
        lineAndShapeRenderer39.setBaseToolTipGenerator(categoryToolTipGenerator50);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator52 = lineAndShapeRenderer39.getLegendItemLabelGenerator();
        java.awt.Paint paint53 = lineAndShapeRenderer39.getBaseItemLabelPaint();
        lineAndShapeRenderer15.setSeriesPaint(5, paint53);
        lineAndShapeRenderer2.setSeriesPaint(11, paint53, true);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on lineAndShapeRenderer39 and lineAndShapeRenderer15.", lineAndShapeRenderer39.equals(lineAndShapeRenderer15) == lineAndShapeRenderer15.equals(lineAndShapeRenderer39));
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test107");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer6 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color7 = java.awt.Color.BLUE;
        lineAndShapeRenderer6.setBaseItemLabelPaint((java.awt.Paint) color7);
        boolean boolean9 = lineAndShapeRenderer6.getAutoPopulateSeriesPaint();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer13 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color14 = java.awt.Color.BLUE;
        lineAndShapeRenderer13.setBaseItemLabelPaint((java.awt.Paint) color14);
        java.awt.Shape shape16 = lineAndShapeRenderer13.getBaseShape();
        org.jfree.chart.entity.ChartEntity chartEntity18 = new org.jfree.chart.entity.ChartEntity(shape16, "");
        java.lang.String str19 = chartEntity18.getShapeCoords();
        java.awt.Shape shape20 = chartEntity18.getArea();
        lineAndShapeRenderer6.setSeriesShape((int) '#', shape20);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer24 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator25 = null;
        lineAndShapeRenderer24.setBaseURLGenerator(categoryURLGenerator25);
        java.awt.Shape shape28 = lineAndShapeRenderer24.getLegendShape(0);
        lineAndShapeRenderer24.setAutoPopulateSeriesStroke(false);
        java.awt.Font font32 = lineAndShapeRenderer24.getSeriesItemLabelFont(0);
        lineAndShapeRenderer24.setUseSeriesOffset(true);
        java.awt.Font font36 = null;
        lineAndShapeRenderer24.setSeriesItemLabelFont((int) (short) 1, font36, false);
        java.awt.Stroke stroke42 = lineAndShapeRenderer24.getItemOutlineStroke(0, 1, false);
        java.lang.Boolean boolean44 = lineAndShapeRenderer24.getSeriesItemLabelsVisible(8);
        boolean boolean45 = lineAndShapeRenderer24.getBaseLinesVisible();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer48 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color49 = java.awt.Color.BLUE;
        lineAndShapeRenderer48.setBaseItemLabelPaint((java.awt.Paint) color49);
        java.awt.Stroke stroke52 = lineAndShapeRenderer48.getSeriesOutlineStroke((int) (short) 1);
        org.jfree.data.category.CategoryDataset categoryDataset53 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis55 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float56 = categoryAxis55.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis57 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer60 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color61 = java.awt.Color.BLUE;
        lineAndShapeRenderer60.setBaseItemLabelPaint((java.awt.Paint) color61);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator66 = lineAndShapeRenderer60.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot67 = new org.jfree.chart.plot.CategoryPlot(categoryDataset53, categoryAxis55, valueAxis57, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer60);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer68 = categoryPlot67.getRenderer();
        org.jfree.chart.axis.ValueAxis valueAxis70 = lineAndShapeRenderer48.getRangeAxis(categoryPlot67, (int) '4');
        double double71 = categoryPlot67.getRangeCrosshairValue();
        java.awt.Paint paint72 = categoryPlot67.getRangeZeroBaselinePaint();
        int int73 = categoryPlot67.getRangeAxisCount();
        java.awt.Color color74 = java.awt.Color.BLUE;
        categoryPlot67.setRangeMinorGridlinePaint((java.awt.Paint) color74);
        java.awt.Paint paint76 = categoryPlot67.getBackgroundPaint();
        lineAndShapeRenderer24.setBaseItemLabelPaint(paint76, true);
        org.jfree.chart.LegendItem legendItem79 = new org.jfree.chart.LegendItem("ItemLabelAnchor.INSIDE10", "PlotOrientation.VERTICAL", "SortOrder.ASCENDING", "SortOrder.ASCENDING", shape20, paint76);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on lineAndShapeRenderer13 and lineAndShapeRenderer6.", lineAndShapeRenderer13.equals(lineAndShapeRenderer6) == lineAndShapeRenderer6.equals(lineAndShapeRenderer13));
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test108");
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
        barRenderer0.setSeriesItemLabelsVisible(10, true);
        barRenderer0.setBase((double) 0);
        barRenderer0.setMinimumBarLength((double) (short) 10);
        barRenderer0.setIncludeBaseInRange(false);
        org.jfree.chart.LegendItem legendItem47 = new org.jfree.chart.LegendItem("hi!");
        java.awt.Color color51 = java.awt.Color.getHSBColor((float) (short) 1, (float) ' ', 0.0f);
        legendItem47.setLinePaint((java.awt.Paint) color51);
        boolean boolean53 = legendItem47.isShapeOutlineVisible();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer56 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color57 = java.awt.Color.BLUE;
        lineAndShapeRenderer56.setBaseItemLabelPaint((java.awt.Paint) color57);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator62 = lineAndShapeRenderer56.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition64 = lineAndShapeRenderer56.getSeriesPositiveItemLabelPosition((int) 'a');
        java.awt.Shape shape66 = lineAndShapeRenderer56.lookupLegendShape(8);
        legendItem47.setLine(shape66);
        java.awt.Stroke stroke68 = org.jfree.chart.plot.CategoryPlot.DEFAULT_CROSSHAIR_STROKE;
        java.awt.Color color69 = java.awt.Color.orange;
        org.jfree.chart.LegendItem legendItem70 = new org.jfree.chart.LegendItem("SortOrder.ASCENDING", "{0}", "-3,-3,3,3", "", shape66, stroke68, (java.awt.Paint) color69);
        barRenderer0.setBaseShape(shape66, false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on itemLabelPosition30 and itemLabelPosition64", itemLabelPosition30.equals(itemLabelPosition64) ? itemLabelPosition30.hashCode() == itemLabelPosition64.hashCode() : true);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test109");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color3 = java.awt.Color.BLUE;
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color3);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator8 = lineAndShapeRenderer2.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition10 = lineAndShapeRenderer2.getSeriesPositiveItemLabelPosition((int) 'a');
        boolean boolean11 = lineAndShapeRenderer2.getBaseItemLabelsVisible();
        java.awt.Stroke stroke15 = lineAndShapeRenderer2.getItemOutlineStroke((int) (byte) 100, (int) (short) -1, false);
        lineAndShapeRenderer2.setSeriesLinesVisible(0, false);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer21 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator22 = null;
        lineAndShapeRenderer21.setBaseURLGenerator(categoryURLGenerator22);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator25 = null;
        lineAndShapeRenderer21.setSeriesToolTipGenerator(10, categoryToolTipGenerator25);
        boolean boolean27 = lineAndShapeRenderer21.getBaseSeriesVisibleInLegend();
        boolean boolean28 = lineAndShapeRenderer21.getDataBoundsIncludesVisibleSeriesOnly();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer32 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        boolean boolean34 = lineAndShapeRenderer32.isSeriesVisibleInLegend(1);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator36 = null;
        lineAndShapeRenderer32.setSeriesURLGenerator(0, categoryURLGenerator36, false);
        java.awt.Color color39 = org.jfree.chart.ChartColor.LIGHT_GREEN;
        java.awt.color.ColorSpace colorSpace40 = color39.getColorSpace();
        lineAndShapeRenderer32.setBaseFillPaint((java.awt.Paint) color39);
        boolean boolean42 = lineAndShapeRenderer32.getBaseShapesVisible();
        java.awt.Graphics2D graphics2D43 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer46 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color47 = java.awt.Color.BLUE;
        lineAndShapeRenderer46.setBaseItemLabelPaint((java.awt.Paint) color47);
        java.awt.Stroke stroke50 = lineAndShapeRenderer46.getSeriesOutlineStroke((int) (short) 1);
        org.jfree.data.category.CategoryDataset categoryDataset51 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis53 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float54 = categoryAxis53.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis55 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer58 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color59 = java.awt.Color.BLUE;
        lineAndShapeRenderer58.setBaseItemLabelPaint((java.awt.Paint) color59);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator64 = lineAndShapeRenderer58.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot65 = new org.jfree.chart.plot.CategoryPlot(categoryDataset51, categoryAxis53, valueAxis55, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer58);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer66 = categoryPlot65.getRenderer();
        org.jfree.chart.axis.ValueAxis valueAxis68 = lineAndShapeRenderer46.getRangeAxis(categoryPlot65, (int) '4');
        boolean boolean69 = categoryPlot65.isRangeCrosshairVisible();
        java.awt.Paint paint70 = categoryPlot65.getRangeZeroBaselinePaint();
        categoryPlot65.mapDatasetToDomainAxis((int) (byte) 1, (int) (short) 10);
        org.jfree.chart.plot.PlotOrientation plotOrientation74 = categoryPlot65.getOrientation();
        org.jfree.data.category.CategoryDataset categoryDataset75 = null;
        lineAndShapeRenderer32.drawItemLabel(graphics2D43, plotOrientation74, categoryDataset75, 2, (-1), true, 1.0d, (double) 'a', false);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer85 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator86 = null;
        lineAndShapeRenderer85.setBaseURLGenerator(categoryURLGenerator86);
        java.awt.Font font91 = lineAndShapeRenderer85.getItemLabelFont(3, (int) ' ', true);
        lineAndShapeRenderer32.setBaseItemLabelFont(font91);
        lineAndShapeRenderer21.setLegendTextFont((int) (byte) 100, font91);
        java.awt.Paint paint97 = lineAndShapeRenderer21.getItemOutlinePaint(8, (-1), true);
        lineAndShapeRenderer2.setBaseItemLabelPaint(paint97, true);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on lineAndShapeRenderer85 and lineAndShapeRenderer21.", lineAndShapeRenderer85.equals(lineAndShapeRenderer21) == lineAndShapeRenderer21.equals(lineAndShapeRenderer85));
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test110");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color3 = java.awt.Color.BLUE;
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color3);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator8 = lineAndShapeRenderer2.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator9 = null;
        lineAndShapeRenderer2.setLegendItemURLGenerator(categorySeriesLabelGenerator9);
        java.awt.Paint paint12 = lineAndShapeRenderer2.getSeriesPaint(1);
        org.jfree.chart.renderer.RenderAttributes renderAttributes13 = lineAndShapeRenderer2.getSelectedItemAttributes();
        lineAndShapeRenderer2.setSeriesCreateEntities((int) (short) 10, (java.lang.Boolean) true);
        lineAndShapeRenderer2.setSeriesShapesFilled(3, (java.lang.Boolean) false);
        lineAndShapeRenderer2.setBaseItemLabelsVisible(false);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer25 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator26 = null;
        lineAndShapeRenderer25.setBaseURLGenerator(categoryURLGenerator26);
        java.awt.Shape shape29 = lineAndShapeRenderer25.getLegendShape(0);
        lineAndShapeRenderer25.setAutoPopulateSeriesStroke(false);
        java.awt.Font font33 = lineAndShapeRenderer25.getSeriesItemLabelFont(0);
        lineAndShapeRenderer25.setUseSeriesOffset(true);
        java.awt.Font font37 = null;
        lineAndShapeRenderer25.setSeriesItemLabelFont((int) (short) 1, font37, false);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition41 = lineAndShapeRenderer25.getSeriesPositiveItemLabelPosition((int) (byte) 100);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer45 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color46 = java.awt.Color.BLUE;
        lineAndShapeRenderer45.setBaseItemLabelPaint((java.awt.Paint) color46);
        java.awt.Stroke stroke49 = lineAndShapeRenderer45.getSeriesOutlineStroke((int) (short) 1);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator51 = null;
        lineAndShapeRenderer45.setSeriesItemLabelGenerator((int) (short) 100, categoryItemLabelGenerator51);
        lineAndShapeRenderer45.setDrawOutlines(true);
        java.awt.Shape shape55 = lineAndShapeRenderer45.getBaseShape();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition57 = lineAndShapeRenderer45.getSeriesPositiveItemLabelPosition((int) '#');
        lineAndShapeRenderer25.setSeriesNegativeItemLabelPosition((int) (short) 10, itemLabelPosition57, false);
        lineAndShapeRenderer2.setSeriesPositiveItemLabelPosition((int) (short) 0, itemLabelPosition57, false);
        java.awt.Paint paint62 = lineAndShapeRenderer2.getBaseLegendTextPaint();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on itemLabelPosition41 and itemLabelPosition57", itemLabelPosition41.equals(itemLabelPosition57) ? itemLabelPosition41.hashCode() == itemLabelPosition57.hashCode() : true);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test111");
        org.jfree.chart.renderer.category.BarRenderer barRenderer0 = new org.jfree.chart.renderer.category.BarRenderer();
        boolean boolean1 = barRenderer0.isDrawBarOutline();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition2 = barRenderer0.getBasePositiveItemLabelPosition();
        java.awt.Paint paint4 = barRenderer0.getSeriesOutlinePaint(15);
        java.awt.Paint paint5 = barRenderer0.getShadowPaint();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer8 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color9 = java.awt.Color.BLUE;
        lineAndShapeRenderer8.setBaseItemLabelPaint((java.awt.Paint) color9);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator14 = lineAndShapeRenderer8.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator15 = null;
        lineAndShapeRenderer8.setLegendItemURLGenerator(categorySeriesLabelGenerator15);
        java.awt.Paint paint18 = lineAndShapeRenderer8.getSeriesPaint(1);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer22 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color23 = java.awt.Color.BLUE;
        lineAndShapeRenderer22.setBaseItemLabelPaint((java.awt.Paint) color23);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator28 = lineAndShapeRenderer22.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator29 = null;
        lineAndShapeRenderer22.setLegendItemURLGenerator(categorySeriesLabelGenerator29);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator34 = lineAndShapeRenderer22.getToolTipGenerator((int) '#', (int) (byte) 10, false);
        lineAndShapeRenderer22.setBaseSeriesVisible(true, true);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition39 = lineAndShapeRenderer22.getSeriesNegativeItemLabelPosition((int) (byte) -1);
        lineAndShapeRenderer8.setSeriesPositiveItemLabelPosition(100, itemLabelPosition39, false);
        barRenderer0.setNegativeItemLabelPositionFallback(itemLabelPosition39);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on lineAndShapeRenderer22 and lineAndShapeRenderer8.", lineAndShapeRenderer22.equals(lineAndShapeRenderer8) == lineAndShapeRenderer8.equals(lineAndShapeRenderer22));
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test112");
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
        java.awt.Color color35 = org.jfree.chart.ChartColor.DARK_MAGENTA;
        barRenderer0.setShadowPaint((java.awt.Paint) color35);
        barRenderer0.setBaseItemLabelsVisible(false, false);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer43 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color44 = java.awt.Color.BLUE;
        lineAndShapeRenderer43.setBaseItemLabelPaint((java.awt.Paint) color44);
        java.awt.Shape shape46 = lineAndShapeRenderer43.getBaseShape();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer49 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator50 = null;
        lineAndShapeRenderer49.setBaseURLGenerator(categoryURLGenerator50);
        java.awt.Shape shape53 = lineAndShapeRenderer49.getLegendShape(0);
        lineAndShapeRenderer49.setAutoPopulateSeriesStroke(false);
        java.awt.Font font57 = lineAndShapeRenderer49.getSeriesItemLabelFont(0);
        lineAndShapeRenderer49.setUseSeriesOffset(true);
        java.awt.Font font61 = null;
        lineAndShapeRenderer49.setSeriesItemLabelFont((int) (short) 1, font61, false);
        java.awt.Stroke stroke67 = lineAndShapeRenderer49.getItemOutlineStroke(0, 1, false);
        lineAndShapeRenderer43.setBaseStroke(stroke67, true);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition70 = lineAndShapeRenderer43.getBasePositiveItemLabelPosition();
        barRenderer0.setSeriesPositiveItemLabelPosition(3, itemLabelPosition70, true);
        double double73 = barRenderer0.getShadowXOffset();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on itemLabelPosition30 and itemLabelPosition70", itemLabelPosition30.equals(itemLabelPosition70) ? itemLabelPosition30.hashCode() == itemLabelPosition70.hashCode() : true);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test113");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator3 = null;
        lineAndShapeRenderer2.setBaseURLGenerator(categoryURLGenerator3);
        java.awt.Shape shape6 = lineAndShapeRenderer2.getLegendShape(0);
        lineAndShapeRenderer2.setAutoPopulateSeriesStroke(false);
        java.awt.Font font10 = lineAndShapeRenderer2.getSeriesItemLabelFont(0);
        lineAndShapeRenderer2.setUseSeriesOffset(true);
        java.awt.Font font14 = null;
        lineAndShapeRenderer2.setSeriesItemLabelFont((int) (short) 1, font14, false);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator20 = lineAndShapeRenderer2.getURLGenerator(4, (int) (short) 100, false);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator21 = null;
        lineAndShapeRenderer2.setBaseToolTipGenerator(categoryToolTipGenerator21);
        org.jfree.data.category.CategoryDataset categoryDataset24 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis26 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float27 = categoryAxis26.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis28 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer31 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color32 = java.awt.Color.BLUE;
        lineAndShapeRenderer31.setBaseItemLabelPaint((java.awt.Paint) color32);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator37 = lineAndShapeRenderer31.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot38 = new org.jfree.chart.plot.CategoryPlot(categoryDataset24, categoryAxis26, valueAxis28, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer31);
        org.jfree.chart.axis.CategoryAxis categoryAxis39 = categoryPlot38.getDomainAxis();
        java.awt.Stroke stroke40 = categoryPlot38.getRangeCrosshairStroke();
        lineAndShapeRenderer2.setSeriesOutlineStroke(1, stroke40, false);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator43 = null;
        lineAndShapeRenderer2.setBaseURLGenerator(categoryURLGenerator43);
        java.awt.Font font45 = lineAndShapeRenderer2.getBaseItemLabelFont();
        lineAndShapeRenderer2.setSeriesCreateEntities(0, (java.lang.Boolean) false, true);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer53 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color54 = java.awt.Color.BLUE;
        lineAndShapeRenderer53.setBaseItemLabelPaint((java.awt.Paint) color54);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator59 = lineAndShapeRenderer53.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.LegendItem legendItem62 = lineAndShapeRenderer53.getLegendItem((int) (byte) 100, 5);
        java.awt.Color color64 = org.jfree.chart.ChartColor.LIGHT_GREEN;
        lineAndShapeRenderer53.setSeriesItemLabelPaint((int) (byte) 0, (java.awt.Paint) color64, false);
        lineAndShapeRenderer2.setLegendTextPaint(8, (java.awt.Paint) color64);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on lineAndShapeRenderer31 and lineAndShapeRenderer53.", lineAndShapeRenderer31.equals(lineAndShapeRenderer53) == lineAndShapeRenderer53.equals(lineAndShapeRenderer31));
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test114");
        org.jfree.chart.LegendItem legendItem1 = new org.jfree.chart.LegendItem("hi!");
        java.text.AttributedString attributedString2 = legendItem1.getAttributedLabel();
        boolean boolean3 = legendItem1.isShapeFilled();
        java.lang.String str4 = legendItem1.getDescription();
        boolean boolean5 = legendItem1.isShapeFilled();
        java.awt.Shape shape6 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_SHAPE;
        legendItem1.setShape(shape6);
        legendItem1.setShapeVisible(true);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer12 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator13 = null;
        lineAndShapeRenderer12.setBaseURLGenerator(categoryURLGenerator13);
        java.awt.Shape shape16 = lineAndShapeRenderer12.getLegendShape(0);
        lineAndShapeRenderer12.setAutoPopulateSeriesStroke(false);
        java.awt.Font font20 = lineAndShapeRenderer12.getSeriesItemLabelFont(0);
        lineAndShapeRenderer12.setUseSeriesOffset(true);
        java.awt.Shape shape24 = null;
        lineAndShapeRenderer12.setSeriesShape((int) (short) 10, shape24, true);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer29 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color30 = java.awt.Color.BLUE;
        lineAndShapeRenderer29.setBaseItemLabelPaint((java.awt.Paint) color30);
        java.awt.Stroke stroke33 = lineAndShapeRenderer29.getSeriesOutlineStroke((int) (short) 1);
        org.jfree.data.category.CategoryDataset categoryDataset34 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis36 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float37 = categoryAxis36.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis38 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer41 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color42 = java.awt.Color.BLUE;
        lineAndShapeRenderer41.setBaseItemLabelPaint((java.awt.Paint) color42);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator47 = lineAndShapeRenderer41.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot48 = new org.jfree.chart.plot.CategoryPlot(categoryDataset34, categoryAxis36, valueAxis38, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer41);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer49 = categoryPlot48.getRenderer();
        org.jfree.chart.axis.ValueAxis valueAxis51 = lineAndShapeRenderer29.getRangeAxis(categoryPlot48, (int) '4');
        double double52 = categoryPlot48.getRangeCrosshairValue();
        lineAndShapeRenderer12.addChangeListener((org.jfree.chart.event.RendererChangeListener) categoryPlot48);
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray54 = new org.jfree.chart.axis.CategoryAxis[] {};
        categoryPlot48.setDomainAxes(categoryAxisArray54);
        categoryPlot48.setDomainGridlinesVisible(true);
        java.awt.Color color58 = java.awt.Color.BLUE;
        int int59 = color58.getRed();
        categoryPlot48.setRangeCrosshairPaint((java.awt.Paint) color58);
        boolean boolean61 = categoryPlot48.isSubplot();
        java.lang.Object obj62 = categoryPlot48.clone();
        java.util.List list63 = categoryPlot48.getAnnotations();
        java.awt.Image image64 = categoryPlot48.getBackgroundImage();
        boolean boolean65 = legendItem1.equals((java.lang.Object) image64);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryPlot48 and obj62", categoryPlot48.equals(obj62) ? categoryPlot48.hashCode() == obj62.hashCode() : true);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test115");
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
        org.jfree.data.category.CategoryDataset categoryDataset27 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis29 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float30 = categoryAxis29.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis31 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer34 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color35 = java.awt.Color.BLUE;
        lineAndShapeRenderer34.setBaseItemLabelPaint((java.awt.Paint) color35);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator40 = lineAndShapeRenderer34.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot41 = new org.jfree.chart.plot.CategoryPlot(categoryDataset27, categoryAxis29, valueAxis31, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer34);
        boolean boolean42 = categoryPlot41.canSelectByPoint();
        org.jfree.chart.axis.AxisLocation axisLocation44 = categoryPlot41.getDomainAxisLocation((int) (byte) 0);
        categoryPlot21.setDomainAxisLocation(axisLocation44);
        org.jfree.data.category.DefaultCategoryDataset defaultCategoryDataset47 = new org.jfree.data.category.DefaultCategoryDataset();
        int int49 = defaultCategoryDataset47.getColumnIndex((java.lang.Comparable) 3.0d);
        categoryPlot21.setDataset((int) 'a', (org.jfree.data.category.CategoryDataset) defaultCategoryDataset47);
        defaultCategoryDataset47.clear();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryPlot21 and categoryPlot41", categoryPlot21.equals(categoryPlot41) ? categoryPlot21.hashCode() == categoryPlot41.hashCode() : true);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test116");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float3 = categoryAxis2.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis4 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer7 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color8 = java.awt.Color.BLUE;
        lineAndShapeRenderer7.setBaseItemLabelPaint((java.awt.Paint) color8);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator13 = lineAndShapeRenderer7.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot14 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis2, valueAxis4, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer7);
        java.lang.Object obj15 = categoryPlot14.clone();
        org.jfree.chart.axis.AxisSpace axisSpace16 = categoryPlot14.getFixedRangeAxisSpace();
        org.jfree.chart.plot.PlotOrientation plotOrientation17 = categoryPlot14.getOrientation();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer20 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator21 = null;
        lineAndShapeRenderer20.setBaseURLGenerator(categoryURLGenerator21);
        java.awt.Shape shape24 = lineAndShapeRenderer20.getLegendShape(0);
        lineAndShapeRenderer20.setAutoPopulateSeriesStroke(false);
        java.awt.Font font28 = lineAndShapeRenderer20.getSeriesItemLabelFont(0);
        lineAndShapeRenderer20.setUseSeriesOffset(true);
        java.awt.Shape shape32 = null;
        lineAndShapeRenderer20.setSeriesShape((int) (short) 10, shape32, true);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer37 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color38 = java.awt.Color.BLUE;
        lineAndShapeRenderer37.setBaseItemLabelPaint((java.awt.Paint) color38);
        java.awt.Stroke stroke41 = lineAndShapeRenderer37.getSeriesOutlineStroke((int) (short) 1);
        org.jfree.data.category.CategoryDataset categoryDataset42 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis44 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float45 = categoryAxis44.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis46 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer49 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color50 = java.awt.Color.BLUE;
        lineAndShapeRenderer49.setBaseItemLabelPaint((java.awt.Paint) color50);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator55 = lineAndShapeRenderer49.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot56 = new org.jfree.chart.plot.CategoryPlot(categoryDataset42, categoryAxis44, valueAxis46, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer49);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer57 = categoryPlot56.getRenderer();
        org.jfree.chart.axis.ValueAxis valueAxis59 = lineAndShapeRenderer37.getRangeAxis(categoryPlot56, (int) '4');
        double double60 = categoryPlot56.getRangeCrosshairValue();
        lineAndShapeRenderer20.addChangeListener((org.jfree.chart.event.RendererChangeListener) categoryPlot56);
        boolean boolean62 = plotOrientation17.equals((java.lang.Object) categoryPlot56);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryPlot14 and obj15", categoryPlot14.equals(obj15) ? categoryPlot14.hashCode() == obj15.hashCode() : true);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test117");
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
        org.jfree.chart.util.GradientPaintTransformer gradientPaintTransformer35 = barRenderer0.getGradientPaintTransformer();
        double double36 = barRenderer0.getMinimumBarLength();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer39 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator40 = null;
        lineAndShapeRenderer39.setBaseURLGenerator(categoryURLGenerator40);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator43 = null;
        lineAndShapeRenderer39.setSeriesToolTipGenerator(10, categoryToolTipGenerator43);
        int int45 = lineAndShapeRenderer39.getRowCount();
        boolean boolean48 = lineAndShapeRenderer39.getItemVisible((int) (byte) 100, (int) '4');
        boolean boolean49 = lineAndShapeRenderer39.getAutoPopulateSeriesFillPaint();
        java.awt.Color color50 = org.jfree.chart.ChartColor.LIGHT_GREEN;
        java.awt.color.ColorSpace colorSpace51 = color50.getColorSpace();
        lineAndShapeRenderer39.setBasePaint((java.awt.Paint) color50);
        barRenderer0.setBasePaint((java.awt.Paint) color50);
        double double54 = barRenderer0.getBase();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition56 = barRenderer0.getSeriesPositiveItemLabelPosition(255);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer59 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color60 = java.awt.Color.BLUE;
        lineAndShapeRenderer59.setBaseItemLabelPaint((java.awt.Paint) color60);
        java.awt.Shape shape62 = lineAndShapeRenderer59.getBaseShape();
        java.awt.Stroke stroke63 = lineAndShapeRenderer59.getBaseOutlineStroke();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator64 = null;
        lineAndShapeRenderer59.setBaseItemLabelGenerator(categoryItemLabelGenerator64, false);
        java.awt.Font font68 = lineAndShapeRenderer59.getLegendTextFont((-1));
        org.jfree.data.category.CategoryDataset categoryDataset69 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis71 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float72 = categoryAxis71.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis73 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer76 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color77 = java.awt.Color.BLUE;
        lineAndShapeRenderer76.setBaseItemLabelPaint((java.awt.Paint) color77);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator82 = lineAndShapeRenderer76.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot83 = new org.jfree.chart.plot.CategoryPlot(categoryDataset69, categoryAxis71, valueAxis73, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer76);
        lineAndShapeRenderer76.setSeriesVisibleInLegend(3, (java.lang.Boolean) false, false);
        org.jfree.chart.axis.CategoryAxis categoryAxis90 = new org.jfree.chart.axis.CategoryAxis("hi!");
        java.lang.Object obj91 = categoryAxis90.clone();
        java.awt.Font font92 = categoryAxis90.getTickLabelFont();
        lineAndShapeRenderer76.setSeriesItemLabelFont((int) '#', font92);
        lineAndShapeRenderer59.setBaseItemLabelFont(font92);
        java.awt.Paint paint98 = lineAndShapeRenderer59.getItemFillPaint((-16776961), (-1), false);
        barRenderer0.setBaseFillPaint(paint98);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on lineAndShapeRenderer4 and lineAndShapeRenderer76.", lineAndShapeRenderer4.equals(lineAndShapeRenderer76) == lineAndShapeRenderer76.equals(lineAndShapeRenderer4));
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test118");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color3 = java.awt.Color.BLUE;
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color3);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator8 = lineAndShapeRenderer2.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator9 = null;
        lineAndShapeRenderer2.setLegendItemURLGenerator(categorySeriesLabelGenerator9);
        java.awt.Paint paint12 = lineAndShapeRenderer2.getSeriesPaint(1);
        org.jfree.chart.renderer.RenderAttributes renderAttributes13 = lineAndShapeRenderer2.getSelectedItemAttributes();
        lineAndShapeRenderer2.setSeriesCreateEntities((int) (short) 10, (java.lang.Boolean) true);
        lineAndShapeRenderer2.setSeriesShapesFilled(3, (java.lang.Boolean) false);
        java.awt.Shape shape21 = lineAndShapeRenderer2.lookupLegendShape(2);
        java.awt.Color color23 = org.jfree.chart.ChartColor.VERY_DARK_BLUE;
        lineAndShapeRenderer2.setSeriesPaint(192, (java.awt.Paint) color23, false);
        org.jfree.data.category.CategoryDataset categoryDataset26 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis28 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float29 = categoryAxis28.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis30 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer33 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color34 = java.awt.Color.BLUE;
        lineAndShapeRenderer33.setBaseItemLabelPaint((java.awt.Paint) color34);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator39 = lineAndShapeRenderer33.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot40 = new org.jfree.chart.plot.CategoryPlot(categoryDataset26, categoryAxis28, valueAxis30, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer33);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer41 = categoryPlot40.getRenderer();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer44 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        boolean boolean46 = lineAndShapeRenderer44.isSeriesVisibleInLegend(1);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator48 = null;
        lineAndShapeRenderer44.setSeriesURLGenerator(0, categoryURLGenerator48, false);
        java.awt.Color color51 = org.jfree.chart.ChartColor.LIGHT_GREEN;
        java.awt.color.ColorSpace colorSpace52 = color51.getColorSpace();
        lineAndShapeRenderer44.setBaseFillPaint((java.awt.Paint) color51);
        categoryPlot40.setDomainCrosshairPaint((java.awt.Paint) color51);
        org.jfree.chart.axis.CategoryAnchor categoryAnchor55 = categoryPlot40.getDomainGridlinePosition();
        lineAndShapeRenderer2.removeChangeListener((org.jfree.chart.event.RendererChangeListener) categoryPlot40);
        boolean boolean57 = lineAndShapeRenderer2.getAutoPopulateSeriesOutlinePaint();
        java.awt.Graphics2D graphics2D58 = null;
        java.awt.geom.Rectangle2D rectangle2D59 = null;
        org.jfree.data.category.CategoryDataset categoryDataset60 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis62 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float63 = categoryAxis62.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis64 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer67 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color68 = java.awt.Color.BLUE;
        lineAndShapeRenderer67.setBaseItemLabelPaint((java.awt.Paint) color68);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator73 = lineAndShapeRenderer67.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot74 = new org.jfree.chart.plot.CategoryPlot(categoryDataset60, categoryAxis62, valueAxis64, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer67);
        boolean boolean75 = categoryPlot74.canSelectByPoint();
        org.jfree.chart.axis.ValueAxis valueAxis77 = categoryPlot74.getRangeAxisForDataset((int) '4');
        double double78 = categoryPlot74.getRangeCrosshairValue();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer81 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator82 = null;
        lineAndShapeRenderer81.setBaseURLGenerator(categoryURLGenerator82);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator85 = null;
        lineAndShapeRenderer81.setSeriesToolTipGenerator(10, categoryToolTipGenerator85);
        boolean boolean87 = lineAndShapeRenderer81.getBaseSeriesVisibleInLegend();
        boolean boolean88 = lineAndShapeRenderer81.getDataBoundsIncludesVisibleSeriesOnly();
        org.jfree.data.category.DefaultCategoryDataset defaultCategoryDataset89 = new org.jfree.data.category.DefaultCategoryDataset();
        defaultCategoryDataset89.clear();
        defaultCategoryDataset89.clearSelection();
        org.jfree.data.Range range92 = lineAndShapeRenderer81.findRangeBounds((org.jfree.data.category.CategoryDataset) defaultCategoryDataset89);
        org.jfree.data.general.DatasetGroup datasetGroup93 = defaultCategoryDataset89.getGroup();
        org.jfree.data.category.CategoryDatasetSelectionState categoryDatasetSelectionState94 = defaultCategoryDataset89.getSelectionState();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo95 = null;
        org.jfree.chart.renderer.category.CategoryItemRendererState categoryItemRendererState96 = lineAndShapeRenderer2.initialise(graphics2D58, rectangle2D59, categoryPlot74, (org.jfree.data.category.CategoryDataset) defaultCategoryDataset89, plotRenderingInfo95);
        java.lang.Object obj97 = defaultCategoryDataset89.clone();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on lineAndShapeRenderer33 and lineAndShapeRenderer2.", lineAndShapeRenderer33.equals(lineAndShapeRenderer2) == lineAndShapeRenderer2.equals(lineAndShapeRenderer33));
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test119");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator3 = null;
        lineAndShapeRenderer2.setBaseURLGenerator(categoryURLGenerator3);
        boolean boolean5 = lineAndShapeRenderer2.getBaseLinesVisible();
        boolean boolean6 = lineAndShapeRenderer2.getDataBoundsIncludesVisibleSeriesOnly();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis9 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float10 = categoryAxis9.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis11 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer14 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color15 = java.awt.Color.BLUE;
        lineAndShapeRenderer14.setBaseItemLabelPaint((java.awt.Paint) color15);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator20 = lineAndShapeRenderer14.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot21 = new org.jfree.chart.plot.CategoryPlot(categoryDataset7, categoryAxis9, valueAxis11, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer14);
        org.jfree.chart.axis.CategoryAxis categoryAxis22 = categoryPlot21.getDomainAxis();
        org.jfree.chart.axis.ValueAxis valueAxis23 = null;
        org.jfree.data.Range range24 = categoryPlot21.getDataRange(valueAxis23);
        org.jfree.chart.axis.AxisLocation axisLocation25 = categoryPlot21.getRangeAxisLocation();
        categoryPlot21.clearRangeMarkers(0);
        org.jfree.data.category.DefaultCategoryDataset defaultCategoryDataset28 = new org.jfree.data.category.DefaultCategoryDataset();
        int int30 = defaultCategoryDataset28.getColumnIndex((java.lang.Comparable) 3.0d);
        int int32 = defaultCategoryDataset28.getRowIndex((java.lang.Comparable) (byte) 10);
        defaultCategoryDataset28.clearSelection();
        int int34 = categoryPlot21.indexOf((org.jfree.data.category.CategoryDataset) defaultCategoryDataset28);
        defaultCategoryDataset28.validateObject();
        org.jfree.data.Range range36 = lineAndShapeRenderer2.findRangeBounds((org.jfree.data.category.CategoryDataset) defaultCategoryDataset28);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer39 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator40 = null;
        lineAndShapeRenderer39.setBaseURLGenerator(categoryURLGenerator40);
        java.awt.Shape shape43 = lineAndShapeRenderer39.getLegendShape(0);
        lineAndShapeRenderer39.setAutoPopulateSeriesStroke(false);
        java.awt.Font font47 = lineAndShapeRenderer39.getSeriesItemLabelFont(0);
        lineAndShapeRenderer39.setUseSeriesOffset(true);
        java.awt.Shape shape51 = null;
        lineAndShapeRenderer39.setSeriesShape((int) (short) 10, shape51, true);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer56 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color57 = java.awt.Color.BLUE;
        lineAndShapeRenderer56.setBaseItemLabelPaint((java.awt.Paint) color57);
        java.awt.Stroke stroke60 = lineAndShapeRenderer56.getSeriesOutlineStroke((int) (short) 1);
        org.jfree.data.category.CategoryDataset categoryDataset61 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis63 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float64 = categoryAxis63.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis65 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer68 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color69 = java.awt.Color.BLUE;
        lineAndShapeRenderer68.setBaseItemLabelPaint((java.awt.Paint) color69);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator74 = lineAndShapeRenderer68.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot75 = new org.jfree.chart.plot.CategoryPlot(categoryDataset61, categoryAxis63, valueAxis65, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer68);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer76 = categoryPlot75.getRenderer();
        org.jfree.chart.axis.ValueAxis valueAxis78 = lineAndShapeRenderer56.getRangeAxis(categoryPlot75, (int) '4');
        double double79 = categoryPlot75.getRangeCrosshairValue();
        lineAndShapeRenderer39.addChangeListener((org.jfree.chart.event.RendererChangeListener) categoryPlot75);
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray81 = new org.jfree.chart.axis.CategoryAxis[] {};
        categoryPlot75.setDomainAxes(categoryAxisArray81);
        categoryPlot75.setDomainGridlinesVisible(true);
        java.awt.Color color85 = java.awt.Color.BLUE;
        int int86 = color85.getRed();
        categoryPlot75.setRangeCrosshairPaint((java.awt.Paint) color85);
        boolean boolean88 = categoryPlot75.isSubplot();
        java.lang.Object obj89 = categoryPlot75.clone();
        java.util.List list90 = categoryPlot75.getAnnotations();
        java.awt.Image image91 = categoryPlot75.getBackgroundImage();
        defaultCategoryDataset28.addChangeListener((org.jfree.data.event.DatasetChangeListener) categoryPlot75);
        org.jfree.data.category.CategoryDatasetSelectionState categoryDatasetSelectionState93 = defaultCategoryDataset28.getSelectionState();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryPlot75 and obj89", categoryPlot75.equals(obj89) ? categoryPlot75.hashCode() == obj89.hashCode() : true);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test120");
        org.jfree.chart.renderer.category.BarRenderer barRenderer0 = new org.jfree.chart.renderer.category.BarRenderer();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer3 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator4 = null;
        lineAndShapeRenderer3.setBaseURLGenerator(categoryURLGenerator4);
        java.awt.Paint paint7 = lineAndShapeRenderer3.getSeriesOutlinePaint(0);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer10 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        boolean boolean12 = lineAndShapeRenderer10.isSeriesVisibleInLegend(1);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator14 = null;
        lineAndShapeRenderer10.setSeriesURLGenerator(0, categoryURLGenerator14, false);
        java.awt.Color color17 = org.jfree.chart.ChartColor.LIGHT_GREEN;
        java.awt.color.ColorSpace colorSpace18 = color17.getColorSpace();
        lineAndShapeRenderer10.setBaseFillPaint((java.awt.Paint) color17);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer22 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator23 = null;
        lineAndShapeRenderer22.setBaseURLGenerator(categoryURLGenerator23);
        java.awt.Shape shape26 = lineAndShapeRenderer22.getLegendShape(0);
        lineAndShapeRenderer22.setAutoPopulateSeriesStroke(false);
        java.awt.Font font30 = lineAndShapeRenderer22.getSeriesItemLabelFont(0);
        lineAndShapeRenderer22.setUseSeriesOffset(true);
        java.awt.Font font34 = null;
        lineAndShapeRenderer22.setSeriesItemLabelFont((int) (short) 1, font34, false);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition38 = lineAndShapeRenderer22.getSeriesPositiveItemLabelPosition((int) (byte) 100);
        lineAndShapeRenderer10.setBasePositiveItemLabelPosition(itemLabelPosition38, false);
        lineAndShapeRenderer3.setBasePositiveItemLabelPosition(itemLabelPosition38, true);
        barRenderer0.setPositiveItemLabelPositionFallback(itemLabelPosition38);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer46 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Graphics2D graphics2D47 = null;
        org.jfree.data.category.CategoryDataset categoryDataset48 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis50 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float51 = categoryAxis50.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis52 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer55 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color56 = java.awt.Color.BLUE;
        lineAndShapeRenderer55.setBaseItemLabelPaint((java.awt.Paint) color56);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator61 = lineAndShapeRenderer55.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot62 = new org.jfree.chart.plot.CategoryPlot(categoryDataset48, categoryAxis50, valueAxis52, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer55);
        org.jfree.chart.axis.CategoryAxis categoryAxis63 = categoryPlot62.getDomainAxis();
        org.jfree.chart.axis.ValueAxis valueAxis64 = null;
        org.jfree.data.Range range65 = categoryPlot62.getDataRange(valueAxis64);
        org.jfree.chart.axis.ValueAxis valueAxis66 = null;
        org.jfree.chart.plot.Marker marker67 = null;
        java.awt.geom.Rectangle2D rectangle2D68 = null;
        lineAndShapeRenderer46.drawRangeMarker(graphics2D47, categoryPlot62, valueAxis66, marker67, rectangle2D68);
        java.awt.Color color71 = java.awt.Color.GRAY;
        lineAndShapeRenderer46.setSeriesFillPaint(100, (java.awt.Paint) color71, false);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer77 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color78 = java.awt.Color.BLUE;
        lineAndShapeRenderer77.setBaseItemLabelPaint((java.awt.Paint) color78);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator83 = lineAndShapeRenderer77.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition84 = lineAndShapeRenderer77.getBaseNegativeItemLabelPosition();
        lineAndShapeRenderer46.setSeriesNegativeItemLabelPosition((int) (short) 100, itemLabelPosition84, true);
        org.jfree.chart.labels.ItemLabelAnchor itemLabelAnchor87 = itemLabelPosition84.getItemLabelAnchor();
        barRenderer0.setNegativeItemLabelPositionFallback(itemLabelPosition84);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on lineAndShapeRenderer3 and lineAndShapeRenderer46.", lineAndShapeRenderer3.equals(lineAndShapeRenderer46) == lineAndShapeRenderer46.equals(lineAndShapeRenderer3));
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test121");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 1);
        java.lang.Object obj3 = null;
        keyedObjects2D0.setObject(obj3, (java.lang.Comparable) 4.0d, (java.lang.Comparable) ' ');
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer9 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color10 = java.awt.Color.BLUE;
        lineAndShapeRenderer9.setBaseItemLabelPaint((java.awt.Paint) color10);
        java.awt.Stroke stroke13 = lineAndShapeRenderer9.getSeriesOutlineStroke((int) (short) 1);
        org.jfree.data.category.CategoryDataset categoryDataset14 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis16 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float17 = categoryAxis16.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis18 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer21 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color22 = java.awt.Color.BLUE;
        lineAndShapeRenderer21.setBaseItemLabelPaint((java.awt.Paint) color22);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator27 = lineAndShapeRenderer21.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot28 = new org.jfree.chart.plot.CategoryPlot(categoryDataset14, categoryAxis16, valueAxis18, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer21);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer29 = categoryPlot28.getRenderer();
        org.jfree.chart.axis.ValueAxis valueAxis31 = lineAndShapeRenderer9.getRangeAxis(categoryPlot28, (int) '4');
        boolean boolean32 = categoryPlot28.isRangeCrosshairVisible();
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder33 = categoryPlot28.getDatasetRenderingOrder();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo36 = null;
        java.awt.geom.Point2D point2D37 = null;
        categoryPlot28.zoomDomainAxes(1.0d, (double) (-1L), plotRenderingInfo36, point2D37);
        categoryPlot28.setDomainCrosshairVisible(false);
        java.awt.Stroke stroke41 = categoryPlot28.getRangeZeroBaselineStroke();
        boolean boolean42 = keyedObjects2D0.equals((java.lang.Object) stroke41);
        java.lang.Object obj43 = null;
        keyedObjects2D0.addObject(obj43, (java.lang.Comparable) "ItemLabelAnchor.INSIDE7", (java.lang.Comparable) "ChartChangeEventType.GENERAL");
        org.jfree.data.category.CategoryDataset categoryDataset47 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis49 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float50 = categoryAxis49.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis51 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer54 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color55 = java.awt.Color.BLUE;
        lineAndShapeRenderer54.setBaseItemLabelPaint((java.awt.Paint) color55);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator60 = lineAndShapeRenderer54.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot61 = new org.jfree.chart.plot.CategoryPlot(categoryDataset47, categoryAxis49, valueAxis51, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer54);
        java.lang.Object obj62 = categoryPlot61.clone();
        org.jfree.chart.util.RectangleEdge rectangleEdge64 = categoryPlot61.getDomainAxisEdge((int) ' ');
        categoryPlot61.setNotify(false);
        java.awt.Paint paint67 = categoryPlot61.getOutlinePaint();
        keyedObjects2D0.addObject((java.lang.Object) paint67, (java.lang.Comparable) "SortOrder.ASCENDING", (java.lang.Comparable) "TextAnchor.BOTTOM_CENTER");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryPlot28 and obj62", categoryPlot28.equals(obj62) ? categoryPlot28.hashCode() == obj62.hashCode() : true);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test122");
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
        java.awt.Color color35 = org.jfree.chart.ChartColor.DARK_MAGENTA;
        barRenderer0.setShadowPaint((java.awt.Paint) color35);
        double double37 = barRenderer0.getShadowXOffset();
        java.awt.Color color38 = org.jfree.chart.ChartColor.VERY_LIGHT_CYAN;
        barRenderer0.setShadowPaint((java.awt.Paint) color38);
        org.jfree.chart.renderer.category.BarRenderer barRenderer40 = new org.jfree.chart.renderer.category.BarRenderer();
        boolean boolean41 = barRenderer40.isDrawBarOutline();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer44 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color45 = java.awt.Color.BLUE;
        lineAndShapeRenderer44.setBaseItemLabelPaint((java.awt.Paint) color45);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator50 = lineAndShapeRenderer44.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition51 = lineAndShapeRenderer44.getBaseNegativeItemLabelPosition();
        barRenderer40.setNegativeItemLabelPositionFallback(itemLabelPosition51);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer55 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator56 = null;
        lineAndShapeRenderer55.setBaseURLGenerator(categoryURLGenerator56);
        java.awt.Shape shape59 = lineAndShapeRenderer55.getLegendShape(0);
        lineAndShapeRenderer55.setAutoPopulateSeriesStroke(false);
        java.awt.Font font63 = lineAndShapeRenderer55.getSeriesItemLabelFont(0);
        lineAndShapeRenderer55.setUseSeriesOffset(true);
        java.awt.Shape shape67 = null;
        lineAndShapeRenderer55.setSeriesShape((int) (short) 10, shape67, true);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition70 = lineAndShapeRenderer55.getBasePositiveItemLabelPosition();
        org.jfree.chart.text.TextAnchor textAnchor71 = itemLabelPosition70.getTextAnchor();
        barRenderer40.setPositiveItemLabelPositionFallback(itemLabelPosition70);
        boolean boolean73 = barRenderer40.getShadowsVisible();
        org.jfree.chart.renderer.category.BarPainter barPainter74 = barRenderer40.getBarPainter();
        org.jfree.chart.util.GradientPaintTransformer gradientPaintTransformer75 = barRenderer40.getGradientPaintTransformer();
        barRenderer0.setGradientPaintTransformer(gradientPaintTransformer75);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on itemLabelPosition11 and itemLabelPosition51", itemLabelPosition11.equals(itemLabelPosition51) ? itemLabelPosition11.hashCode() == itemLabelPosition51.hashCode() : true);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test123");
        org.jfree.data.category.DefaultCategoryDataset defaultCategoryDataset0 = new org.jfree.data.category.DefaultCategoryDataset();
        int int2 = defaultCategoryDataset0.getColumnIndex((java.lang.Comparable) 3.0d);
        java.util.List list3 = defaultCategoryDataset0.getColumnKeys();
        defaultCategoryDataset0.validateObject();
        org.jfree.data.general.DatasetGroup datasetGroup5 = new org.jfree.data.general.DatasetGroup();
        java.lang.Object obj6 = datasetGroup5.clone();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis9 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float10 = categoryAxis9.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis11 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer14 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color15 = java.awt.Color.BLUE;
        lineAndShapeRenderer14.setBaseItemLabelPaint((java.awt.Paint) color15);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator20 = lineAndShapeRenderer14.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot21 = new org.jfree.chart.plot.CategoryPlot(categoryDataset7, categoryAxis9, valueAxis11, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer14);
        lineAndShapeRenderer14.setSeriesVisibleInLegend(3, (java.lang.Boolean) false, false);
        org.jfree.chart.axis.CategoryAxis categoryAxis28 = new org.jfree.chart.axis.CategoryAxis("hi!");
        java.lang.Object obj29 = categoryAxis28.clone();
        java.awt.Font font30 = categoryAxis28.getTickLabelFont();
        lineAndShapeRenderer14.setSeriesItemLabelFont((int) '#', font30);
        boolean boolean32 = datasetGroup5.equals((java.lang.Object) '#');
        defaultCategoryDataset0.setGroup(datasetGroup5);
        java.lang.Object obj34 = datasetGroup5.clone();
        java.lang.String str35 = datasetGroup5.getID();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj6 and obj34", obj6.equals(obj34) ? obj6.hashCode() == obj34.hashCode() : true);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test124");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float3 = categoryAxis2.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis4 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer7 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color8 = java.awt.Color.BLUE;
        lineAndShapeRenderer7.setBaseItemLabelPaint((java.awt.Paint) color8);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator13 = lineAndShapeRenderer7.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot14 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis2, valueAxis4, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer7);
        java.lang.Object obj15 = categoryPlot14.clone();
        org.jfree.chart.axis.AxisSpace axisSpace16 = categoryPlot14.getFixedRangeAxisSpace();
        org.jfree.chart.plot.PlotOrientation plotOrientation17 = categoryPlot14.getOrientation();
        org.jfree.data.category.CategoryDataset categoryDataset18 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis20 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float21 = categoryAxis20.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis22 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer25 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color26 = java.awt.Color.BLUE;
        lineAndShapeRenderer25.setBaseItemLabelPaint((java.awt.Paint) color26);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator31 = lineAndShapeRenderer25.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot32 = new org.jfree.chart.plot.CategoryPlot(categoryDataset18, categoryAxis20, valueAxis22, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer25);
        org.jfree.chart.axis.CategoryAxis categoryAxis33 = categoryPlot32.getDomainAxis();
        org.jfree.chart.axis.ValueAxis valueAxis34 = null;
        org.jfree.data.Range range35 = categoryPlot32.getDataRange(valueAxis34);
        org.jfree.chart.axis.AxisLocation axisLocation36 = categoryPlot32.getRangeAxisLocation();
        categoryPlot32.clearRangeMarkers(0);
        org.jfree.data.category.DefaultCategoryDataset defaultCategoryDataset39 = new org.jfree.data.category.DefaultCategoryDataset();
        int int41 = defaultCategoryDataset39.getColumnIndex((java.lang.Comparable) 3.0d);
        int int43 = defaultCategoryDataset39.getRowIndex((java.lang.Comparable) (byte) 10);
        defaultCategoryDataset39.clearSelection();
        int int45 = categoryPlot32.indexOf((org.jfree.data.category.CategoryDataset) defaultCategoryDataset39);
        defaultCategoryDataset39.validateObject();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer49 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color50 = java.awt.Color.BLUE;
        lineAndShapeRenderer49.setBaseItemLabelPaint((java.awt.Paint) color50);
        java.awt.Stroke stroke53 = lineAndShapeRenderer49.getSeriesOutlineStroke((int) (short) 1);
        org.jfree.data.category.CategoryDataset categoryDataset54 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis56 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float57 = categoryAxis56.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis58 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer61 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color62 = java.awt.Color.BLUE;
        lineAndShapeRenderer61.setBaseItemLabelPaint((java.awt.Paint) color62);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator67 = lineAndShapeRenderer61.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot68 = new org.jfree.chart.plot.CategoryPlot(categoryDataset54, categoryAxis56, valueAxis58, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer61);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer69 = categoryPlot68.getRenderer();
        org.jfree.chart.axis.ValueAxis valueAxis71 = lineAndShapeRenderer49.getRangeAxis(categoryPlot68, (int) '4');
        boolean boolean72 = categoryPlot68.isRangeCrosshairVisible();
        java.awt.Paint paint73 = categoryPlot68.getRangeZeroBaselinePaint();
        categoryPlot68.mapDatasetToDomainAxis((int) (byte) 1, (int) (short) 10);
        org.jfree.chart.plot.PlotOrientation plotOrientation77 = categoryPlot68.getOrientation();
        java.awt.Color color78 = org.jfree.chart.ChartColor.LIGHT_GREEN;
        java.awt.color.ColorSpace colorSpace79 = color78.getColorSpace();
        categoryPlot68.setRangeGridlinePaint((java.awt.Paint) color78);
        defaultCategoryDataset39.removeChangeListener((org.jfree.data.event.DatasetChangeListener) categoryPlot68);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer84 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator85 = null;
        lineAndShapeRenderer84.setBaseURLGenerator(categoryURLGenerator85);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator88 = null;
        lineAndShapeRenderer84.setSeriesToolTipGenerator(10, categoryToolTipGenerator88);
        boolean boolean90 = lineAndShapeRenderer84.getBaseSeriesVisibleInLegend();
        boolean boolean91 = lineAndShapeRenderer84.getDataBoundsIncludesVisibleSeriesOnly();
        org.jfree.data.category.DefaultCategoryDataset defaultCategoryDataset92 = new org.jfree.data.category.DefaultCategoryDataset();
        defaultCategoryDataset92.clear();
        defaultCategoryDataset92.clearSelection();
        org.jfree.data.Range range95 = lineAndShapeRenderer84.findRangeBounds((org.jfree.data.category.CategoryDataset) defaultCategoryDataset92);
        org.jfree.data.general.DatasetGroup datasetGroup96 = defaultCategoryDataset92.getGroup();
        defaultCategoryDataset92.fireSelectionEvent();
        boolean boolean98 = defaultCategoryDataset39.equals((java.lang.Object) defaultCategoryDataset92);
        int int99 = categoryPlot14.indexOf((org.jfree.data.category.CategoryDataset) defaultCategoryDataset92);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj15 and categoryPlot32", obj15.equals(categoryPlot32) ? obj15.hashCode() == categoryPlot32.hashCode() : true);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test125");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator3 = null;
        lineAndShapeRenderer2.setBaseURLGenerator(categoryURLGenerator3);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator6 = null;
        lineAndShapeRenderer2.setSeriesToolTipGenerator(10, categoryToolTipGenerator6);
        java.lang.Boolean boolean9 = lineAndShapeRenderer2.getSeriesItemLabelsVisible(2);
        java.awt.Paint paint11 = lineAndShapeRenderer2.getSeriesPaint(8);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition13 = lineAndShapeRenderer2.getSeriesNegativeItemLabelPosition((int) (byte) -1);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer16 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color17 = java.awt.Color.BLUE;
        lineAndShapeRenderer16.setBaseItemLabelPaint((java.awt.Paint) color17);
        java.awt.Stroke stroke20 = lineAndShapeRenderer16.getSeriesOutlineStroke((int) (short) 1);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition22 = lineAndShapeRenderer16.getSeriesNegativeItemLabelPosition((int) (short) 1);
        lineAndShapeRenderer16.setSeriesCreateEntities((int) (short) 1, (java.lang.Boolean) false, false);
        lineAndShapeRenderer16.setDrawOutlines(true);
        java.awt.Shape shape30 = lineAndShapeRenderer16.getSeriesShape(255);
        org.jfree.chart.LegendItem legendItem33 = new org.jfree.chart.LegendItem("hi!");
        java.awt.Color color37 = java.awt.Color.getHSBColor((float) (short) 1, (float) ' ', 0.0f);
        legendItem33.setLinePaint((java.awt.Paint) color37);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer41 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color42 = java.awt.Color.BLUE;
        lineAndShapeRenderer41.setBaseItemLabelPaint((java.awt.Paint) color42);
        java.awt.Shape shape44 = lineAndShapeRenderer41.getBaseShape();
        org.jfree.chart.entity.ChartEntity chartEntity46 = new org.jfree.chart.entity.ChartEntity(shape44, "");
        legendItem33.setLine(shape44);
        lineAndShapeRenderer16.setSeriesShape(5, shape44, false);
        lineAndShapeRenderer2.setBaseLegendShape(shape44);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on itemLabelPosition13 and itemLabelPosition22", itemLabelPosition13.equals(itemLabelPosition22) ? itemLabelPosition13.hashCode() == itemLabelPosition22.hashCode() : true);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test126");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator3 = null;
        lineAndShapeRenderer2.setBaseURLGenerator(categoryURLGenerator3);
        java.awt.Shape shape6 = lineAndShapeRenderer2.getLegendShape(0);
        lineAndShapeRenderer2.setAutoPopulateSeriesStroke(false);
        java.awt.Font font10 = lineAndShapeRenderer2.getSeriesItemLabelFont(0);
        java.awt.Paint paint12 = lineAndShapeRenderer2.lookupLegendTextPaint(4);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition13 = lineAndShapeRenderer2.getBasePositiveItemLabelPosition();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer17 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color18 = java.awt.Color.BLUE;
        lineAndShapeRenderer17.setBaseItemLabelPaint((java.awt.Paint) color18);
        java.awt.Shape shape20 = lineAndShapeRenderer17.getBaseShape();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer23 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator24 = null;
        lineAndShapeRenderer23.setBaseURLGenerator(categoryURLGenerator24);
        java.awt.Shape shape27 = lineAndShapeRenderer23.getLegendShape(0);
        lineAndShapeRenderer23.setAutoPopulateSeriesStroke(false);
        java.awt.Font font31 = lineAndShapeRenderer23.getSeriesItemLabelFont(0);
        lineAndShapeRenderer23.setUseSeriesOffset(true);
        java.awt.Font font35 = null;
        lineAndShapeRenderer23.setSeriesItemLabelFont((int) (short) 1, font35, false);
        java.awt.Stroke stroke41 = lineAndShapeRenderer23.getItemOutlineStroke(0, 1, false);
        lineAndShapeRenderer17.setBaseStroke(stroke41, true);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition44 = lineAndShapeRenderer17.getBasePositiveItemLabelPosition();
        lineAndShapeRenderer2.setSeriesPositiveItemLabelPosition(1, itemLabelPosition44, true);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer50 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color51 = java.awt.Color.BLUE;
        lineAndShapeRenderer50.setBaseItemLabelPaint((java.awt.Paint) color51);
        java.awt.Stroke stroke54 = lineAndShapeRenderer50.getSeriesOutlineStroke((int) (short) 1);
        org.jfree.data.category.CategoryDataset categoryDataset55 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis57 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float58 = categoryAxis57.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis59 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer62 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color63 = java.awt.Color.BLUE;
        lineAndShapeRenderer62.setBaseItemLabelPaint((java.awt.Paint) color63);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator68 = lineAndShapeRenderer62.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot69 = new org.jfree.chart.plot.CategoryPlot(categoryDataset55, categoryAxis57, valueAxis59, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer62);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer70 = categoryPlot69.getRenderer();
        org.jfree.chart.axis.ValueAxis valueAxis72 = lineAndShapeRenderer50.getRangeAxis(categoryPlot69, (int) '4');
        boolean boolean73 = categoryPlot69.isRangeCrosshairVisible();
        org.jfree.chart.util.RectangleEdge rectangleEdge74 = categoryPlot69.getDomainAxisEdge();
        boolean boolean75 = categoryPlot69.isRangeZeroBaselineVisible();
        boolean boolean76 = categoryPlot69.isDomainZoomable();
        categoryPlot69.clearDomainMarkers((int) (byte) 100);
        java.awt.Paint paint79 = categoryPlot69.getRangeZeroBaselinePaint();
        lineAndShapeRenderer2.setSeriesItemLabelPaint((int) '4', paint79);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on itemLabelPosition13 and itemLabelPosition44", itemLabelPosition13.equals(itemLabelPosition44) ? itemLabelPosition13.hashCode() == itemLabelPosition44.hashCode() : true);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test127");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color3 = java.awt.Color.BLUE;
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color3);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator8 = lineAndShapeRenderer2.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition10 = lineAndShapeRenderer2.getSeriesPositiveItemLabelPosition((int) 'a');
        java.awt.Shape shape12 = lineAndShapeRenderer2.lookupLegendShape(8);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer15 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator16 = null;
        lineAndShapeRenderer15.setBaseURLGenerator(categoryURLGenerator16);
        java.awt.Shape shape19 = lineAndShapeRenderer15.getLegendShape(0);
        lineAndShapeRenderer15.setAutoPopulateSeriesStroke(false);
        java.awt.Font font23 = lineAndShapeRenderer15.getSeriesItemLabelFont(0);
        java.awt.Paint paint25 = lineAndShapeRenderer15.lookupLegendTextPaint(4);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition26 = lineAndShapeRenderer15.getBasePositiveItemLabelPosition();
        org.jfree.chart.util.GradientPaintTransformType gradientPaintTransformType28 = org.jfree.chart.util.GradientPaintTransformType.HORIZONTAL;
        org.jfree.chart.util.StandardGradientPaintTransformer standardGradientPaintTransformer29 = new org.jfree.chart.util.StandardGradientPaintTransformer(gradientPaintTransformType28);
        org.jfree.chart.axis.CategoryAxis categoryAxis31 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float32 = categoryAxis31.getTickMarkInsideLength();
        categoryAxis31.setMaximumCategoryLabelLines((int) (byte) 1);
        boolean boolean35 = categoryAxis31.isVisible();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer39 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator40 = null;
        lineAndShapeRenderer39.setBaseURLGenerator(categoryURLGenerator40);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator43 = null;
        lineAndShapeRenderer39.setSeriesToolTipGenerator(10, categoryToolTipGenerator43);
        boolean boolean45 = lineAndShapeRenderer39.getBaseSeriesVisibleInLegend();
        java.awt.Stroke stroke47 = null;
        lineAndShapeRenderer39.setSeriesStroke((int) 'a', stroke47, true);
        org.jfree.chart.labels.ItemLabelAnchor itemLabelAnchor51 = org.jfree.chart.labels.ItemLabelAnchor.INSIDE3;
        java.awt.Color color52 = java.awt.Color.yellow;
        boolean boolean53 = itemLabelAnchor51.equals((java.lang.Object) color52);
        lineAndShapeRenderer39.setSeriesFillPaint((int) ' ', (java.awt.Paint) color52);
        categoryAxis31.setTickLabelPaint((java.lang.Comparable) false, (java.awt.Paint) color52);
        boolean boolean56 = standardGradientPaintTransformer29.equals((java.lang.Object) color52);
        org.jfree.chart.util.DefaultShadowGenerator defaultShadowGenerator60 = new org.jfree.chart.util.DefaultShadowGenerator(0, color52, (float) 2, 100, (double) (short) 100);
        lineAndShapeRenderer15.setBaseFillPaint((java.awt.Paint) color52, true);
        lineAndShapeRenderer2.setBaseLegendTextPaint((java.awt.Paint) color52);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on itemLabelPosition10 and itemLabelPosition26", itemLabelPosition10.equals(itemLabelPosition26) ? itemLabelPosition10.hashCode() == itemLabelPosition26.hashCode() : true);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test128");
        org.jfree.chart.renderer.RenderAttributes renderAttributes1 = new org.jfree.chart.renderer.RenderAttributes(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.awt.Paint paint3 = renderAttributes1.getSeriesLabelPaint((-12517568));
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test129");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator3 = null;
        lineAndShapeRenderer2.setBaseURLGenerator(categoryURLGenerator3);
        java.awt.Shape shape6 = lineAndShapeRenderer2.getLegendShape(0);
        lineAndShapeRenderer2.setAutoPopulateSeriesStroke(false);
        java.awt.Shape shape10 = lineAndShapeRenderer2.lookupSeriesShape(1);
        lineAndShapeRenderer2.setSeriesCreateEntities(100, (java.lang.Boolean) false);
        org.jfree.data.category.CategoryDataset categoryDataset14 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis16 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float17 = categoryAxis16.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis18 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer21 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color22 = java.awt.Color.BLUE;
        lineAndShapeRenderer21.setBaseItemLabelPaint((java.awt.Paint) color22);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator27 = lineAndShapeRenderer21.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot28 = new org.jfree.chart.plot.CategoryPlot(categoryDataset14, categoryAxis16, valueAxis18, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer21);
        org.jfree.chart.axis.CategoryAxis categoryAxis29 = categoryPlot28.getDomainAxis();
        org.jfree.chart.axis.ValueAxis valueAxis30 = null;
        org.jfree.data.Range range31 = categoryPlot28.getDataRange(valueAxis30);
        org.jfree.chart.axis.AxisLocation axisLocation32 = categoryPlot28.getRangeAxisLocation();
        categoryPlot28.configureDomainAxes();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo36 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer39 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Graphics2D graphics2D40 = null;
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
        org.jfree.chart.axis.ValueAxis valueAxis59 = null;
        org.jfree.chart.plot.Marker marker60 = null;
        java.awt.geom.Rectangle2D rectangle2D61 = null;
        lineAndShapeRenderer39.drawRangeMarker(graphics2D40, categoryPlot55, valueAxis59, marker60, rectangle2D61);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo64 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer67 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator68 = null;
        lineAndShapeRenderer67.setBaseURLGenerator(categoryURLGenerator68);
        java.awt.Shape shape71 = lineAndShapeRenderer67.getLegendShape(0);
        lineAndShapeRenderer67.setAutoPopulateSeriesStroke(false);
        java.awt.Font font75 = lineAndShapeRenderer67.getSeriesItemLabelFont(0);
        lineAndShapeRenderer67.setUseSeriesOffset(true);
        java.awt.Shape shape79 = null;
        lineAndShapeRenderer67.setSeriesShape((int) (short) 10, shape79, true);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition82 = lineAndShapeRenderer67.getBasePositiveItemLabelPosition();
        java.awt.Graphics2D graphics2D83 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation84 = null;
        java.awt.geom.Rectangle2D rectangle2D85 = null;
        java.awt.geom.Rectangle2D rectangle2D86 = null;
        org.jfree.chart.util.RectangleInsets rectangleInsets87 = org.jfree.chart.axis.Axis.DEFAULT_AXIS_LABEL_INSETS;
        double double89 = rectangleInsets87.calculateBottomInset(0.0d);
        double double91 = rectangleInsets87.trimWidth((double) '#');
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType92 = null;
        org.jfree.chart.util.RectangleAnchor rectangleAnchor93 = null;
        java.awt.geom.Point2D point2D94 = lineAndShapeRenderer67.calculateDomainMarkerTextAnchorPoint(graphics2D83, plotOrientation84, rectangle2D85, rectangle2D86, rectangleInsets87, lengthAdjustmentType92, rectangleAnchor93);
        categoryPlot55.panDomainAxes((double) (-1L), plotRenderingInfo64, point2D94);
        categoryPlot28.zoomRangeAxes((double) 11, (double) (-1.0f), plotRenderingInfo36, point2D94);
        org.jfree.chart.LegendItemCollection legendItemCollection97 = categoryPlot28.getLegendItems();
        int int98 = categoryPlot28.getDomainAxisCount();
        boolean boolean99 = lineAndShapeRenderer2.equals((java.lang.Object) int98);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryPlot28 and categoryPlot55", categoryPlot28.equals(categoryPlot55) ? categoryPlot28.hashCode() == categoryPlot55.hashCode() : true);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test130");
        org.jfree.data.category.CategoryDataset categoryDataset1 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis3 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float4 = categoryAxis3.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis5 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer8 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color9 = java.awt.Color.BLUE;
        lineAndShapeRenderer8.setBaseItemLabelPaint((java.awt.Paint) color9);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator14 = lineAndShapeRenderer8.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot15 = new org.jfree.chart.plot.CategoryPlot(categoryDataset1, categoryAxis3, valueAxis5, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer8);
        org.jfree.chart.axis.AxisLocation axisLocation16 = org.jfree.chart.axis.AxisLocation.TOP_OR_LEFT;
        categoryPlot15.setRangeAxisLocation(axisLocation16);
        categoryPlot15.configureDomainAxes();
        categoryPlot15.setBackgroundImageAlpha((float) 0);
        boolean boolean21 = categoryPlot15.isRangeZoomable();
        org.jfree.data.KeyedObject keyedObject22 = new org.jfree.data.KeyedObject((java.lang.Comparable) "ItemLabelAnchor.INSIDE10", (java.lang.Object) boolean21);
        org.jfree.data.category.CategoryDataset categoryDataset23 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis25 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float26 = categoryAxis25.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis27 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer30 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color31 = java.awt.Color.BLUE;
        lineAndShapeRenderer30.setBaseItemLabelPaint((java.awt.Paint) color31);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator36 = lineAndShapeRenderer30.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot37 = new org.jfree.chart.plot.CategoryPlot(categoryDataset23, categoryAxis25, valueAxis27, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer30);
        categoryAxis25.setUpperMargin(10.0d);
        org.jfree.chart.util.ObjectList objectList41 = new org.jfree.chart.util.ObjectList(8);
        int int43 = objectList41.indexOf((java.lang.Object) "hi!");
        boolean boolean44 = categoryAxis25.equals((java.lang.Object) objectList41);
        java.lang.Object obj46 = objectList41.get((int) (byte) 1);
        org.jfree.chart.axis.CategoryAxis categoryAxis48 = new org.jfree.chart.axis.CategoryAxis("hi!");
        java.lang.Object obj49 = categoryAxis48.clone();
        java.awt.Font font50 = categoryAxis48.getTickLabelFont();
        java.awt.Paint paint51 = categoryAxis48.getLabelPaint();
        java.awt.Stroke stroke52 = categoryAxis48.getAxisLineStroke();
        int int53 = objectList41.indexOf((java.lang.Object) stroke52);
        java.lang.Object obj55 = objectList41.get(192);
        keyedObject22.setObject((java.lang.Object) objectList41);
        org.jfree.chart.util.StrokeList strokeList57 = new org.jfree.chart.util.StrokeList();
        keyedObject22.setObject((java.lang.Object) strokeList57);
        java.lang.Object obj59 = strokeList57.clone();
        java.awt.Stroke stroke61 = strokeList57.getStroke(500);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on objectList41 and obj59.", objectList41.equals(obj59) == obj59.equals(objectList41));
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test131");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color3 = java.awt.Color.BLUE;
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color3);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator8 = lineAndShapeRenderer2.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator9 = null;
        lineAndShapeRenderer2.setLegendItemURLGenerator(categorySeriesLabelGenerator9);
        java.awt.Paint paint12 = lineAndShapeRenderer2.getSeriesPaint(1);
        org.jfree.chart.renderer.RenderAttributes renderAttributes13 = lineAndShapeRenderer2.getSelectedItemAttributes();
        java.awt.Color color15 = java.awt.Color.BLUE;
        renderAttributes13.setSeriesFillPaint((int) 'a', (java.awt.Paint) color15);
        org.jfree.chart.LegendItem legendItem19 = new org.jfree.chart.LegendItem("hi!");
        java.awt.Color color23 = java.awt.Color.getHSBColor((float) (short) 1, (float) ' ', 0.0f);
        legendItem19.setLinePaint((java.awt.Paint) color23);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer27 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color28 = java.awt.Color.BLUE;
        lineAndShapeRenderer27.setBaseItemLabelPaint((java.awt.Paint) color28);
        java.awt.Shape shape30 = lineAndShapeRenderer27.getBaseShape();
        org.jfree.chart.entity.ChartEntity chartEntity32 = new org.jfree.chart.entity.ChartEntity(shape30, "");
        legendItem19.setLine(shape30);
        java.awt.Stroke stroke34 = legendItem19.getLineStroke();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer37 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        boolean boolean39 = lineAndShapeRenderer37.isSeriesVisibleInLegend(1);
        java.awt.Font font40 = lineAndShapeRenderer37.getBaseLegendTextFont();
        java.awt.Color color43 = java.awt.Color.GRAY;
        org.jfree.chart.util.DefaultShadowGenerator defaultShadowGenerator47 = new org.jfree.chart.util.DefaultShadowGenerator((int) (byte) 0, color43, 1.0f, (-1), 10.0d);
        lineAndShapeRenderer37.setSeriesPaint(0, (java.awt.Paint) color43, false);
        int int50 = color43.getAlpha();
        legendItem19.setOutlinePaint((java.awt.Paint) color43);
        renderAttributes13.setSeriesFillPaint((int) ' ', (java.awt.Paint) color43);
        boolean boolean53 = renderAttributes13.getAllowNull();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer57 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        boolean boolean59 = lineAndShapeRenderer57.isSeriesVisibleInLegend(1);
        java.awt.Font font60 = lineAndShapeRenderer57.getBaseItemLabelFont();
        java.awt.Stroke stroke64 = lineAndShapeRenderer57.getItemStroke(100, 0, true);
        renderAttributes13.setSeriesStroke(255, stroke64);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on lineAndShapeRenderer57 and lineAndShapeRenderer37.", lineAndShapeRenderer57.equals(lineAndShapeRenderer37) == lineAndShapeRenderer37.equals(lineAndShapeRenderer57));
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test132");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator3 = null;
        lineAndShapeRenderer2.setBaseURLGenerator(categoryURLGenerator3);
        java.awt.Shape shape6 = lineAndShapeRenderer2.getLegendShape(0);
        lineAndShapeRenderer2.setAutoPopulateSeriesStroke(false);
        java.awt.Font font10 = lineAndShapeRenderer2.getSeriesItemLabelFont(0);
        lineAndShapeRenderer2.setUseSeriesOffset(true);
        java.awt.Font font14 = null;
        lineAndShapeRenderer2.setSeriesItemLabelFont((int) (short) 1, font14, false);
        lineAndShapeRenderer2.setSeriesVisible((int) '#', (java.lang.Boolean) true, false);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer23 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color24 = java.awt.Color.BLUE;
        lineAndShapeRenderer23.setBaseItemLabelPaint((java.awt.Paint) color24);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator29 = lineAndShapeRenderer23.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator30 = null;
        lineAndShapeRenderer23.setLegendItemURLGenerator(categorySeriesLabelGenerator30);
        java.awt.Paint paint33 = lineAndShapeRenderer23.getSeriesPaint(1);
        java.awt.Paint paint34 = lineAndShapeRenderer23.getBaseFillPaint();
        boolean boolean35 = lineAndShapeRenderer23.getBaseSeriesVisibleInLegend();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer39 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color40 = java.awt.Color.BLUE;
        lineAndShapeRenderer39.setBaseItemLabelPaint((java.awt.Paint) color40);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator45 = lineAndShapeRenderer39.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition47 = lineAndShapeRenderer39.getSeriesPositiveItemLabelPosition((int) 'a');
        boolean boolean48 = lineAndShapeRenderer39.getBaseItemLabelsVisible();
        java.awt.Stroke stroke52 = lineAndShapeRenderer39.getItemOutlineStroke((int) (byte) 100, (int) (short) -1, false);
        lineAndShapeRenderer23.setSeriesStroke((int) '4', stroke52);
        lineAndShapeRenderer2.setBaseStroke(stroke52, true);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on lineAndShapeRenderer39 and lineAndShapeRenderer23.", lineAndShapeRenderer39.equals(lineAndShapeRenderer23) == lineAndShapeRenderer23.equals(lineAndShapeRenderer39));
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test133");
        org.jfree.data.category.DefaultCategoryDataset defaultCategoryDataset0 = new org.jfree.data.category.DefaultCategoryDataset();
        int int2 = defaultCategoryDataset0.getColumnIndex((java.lang.Comparable) 3.0d);
        java.util.List list3 = defaultCategoryDataset0.getColumnKeys();
        defaultCategoryDataset0.validateObject();
        org.jfree.data.general.DatasetGroup datasetGroup5 = new org.jfree.data.general.DatasetGroup();
        java.lang.Object obj6 = datasetGroup5.clone();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis9 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float10 = categoryAxis9.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis11 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer14 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color15 = java.awt.Color.BLUE;
        lineAndShapeRenderer14.setBaseItemLabelPaint((java.awt.Paint) color15);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator20 = lineAndShapeRenderer14.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot21 = new org.jfree.chart.plot.CategoryPlot(categoryDataset7, categoryAxis9, valueAxis11, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer14);
        lineAndShapeRenderer14.setSeriesVisibleInLegend(3, (java.lang.Boolean) false, false);
        org.jfree.chart.axis.CategoryAxis categoryAxis28 = new org.jfree.chart.axis.CategoryAxis("hi!");
        java.lang.Object obj29 = categoryAxis28.clone();
        java.awt.Font font30 = categoryAxis28.getTickLabelFont();
        lineAndShapeRenderer14.setSeriesItemLabelFont((int) '#', font30);
        boolean boolean32 = datasetGroup5.equals((java.lang.Object) '#');
        defaultCategoryDataset0.setGroup(datasetGroup5);
        java.util.List list34 = defaultCategoryDataset0.getColumnKeys();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on datasetGroup5 and obj6", datasetGroup5.equals(obj6) ? datasetGroup5.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test134");
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
        lineAndShapeRenderer2.setBaseCreateEntities(true);
        org.jfree.chart.axis.CategoryAxis categoryAxis45 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float46 = categoryAxis45.getTickMarkInsideLength();
        categoryAxis45.setMaximumCategoryLabelLines((int) (byte) 1);
        boolean boolean49 = categoryAxis45.isVisible();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer53 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator54 = null;
        lineAndShapeRenderer53.setBaseURLGenerator(categoryURLGenerator54);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator57 = null;
        lineAndShapeRenderer53.setSeriesToolTipGenerator(10, categoryToolTipGenerator57);
        boolean boolean59 = lineAndShapeRenderer53.getBaseSeriesVisibleInLegend();
        java.awt.Stroke stroke61 = null;
        lineAndShapeRenderer53.setSeriesStroke((int) 'a', stroke61, true);
        org.jfree.chart.labels.ItemLabelAnchor itemLabelAnchor65 = org.jfree.chart.labels.ItemLabelAnchor.INSIDE3;
        java.awt.Color color66 = java.awt.Color.yellow;
        boolean boolean67 = itemLabelAnchor65.equals((java.lang.Object) color66);
        lineAndShapeRenderer53.setSeriesFillPaint((int) ' ', (java.awt.Paint) color66);
        categoryAxis45.setTickLabelPaint((java.lang.Comparable) false, (java.awt.Paint) color66);
        categoryAxis45.addCategoryLabelToolTip((java.lang.Comparable) "hi!", "DatasetRenderingOrder.REVERSE");
        java.awt.Font font73 = categoryAxis45.getLabelFont();
        lineAndShapeRenderer2.setBaseItemLabelFont(font73);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on lineAndShapeRenderer19 and lineAndShapeRenderer53.", lineAndShapeRenderer19.equals(lineAndShapeRenderer53) == lineAndShapeRenderer53.equals(lineAndShapeRenderer19));
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test135");
        org.jfree.data.category.DefaultCategoryDataset defaultCategoryDataset0 = new org.jfree.data.category.DefaultCategoryDataset();
        int int2 = defaultCategoryDataset0.getColumnIndex((java.lang.Comparable) 3.0d);
        java.util.List list3 = defaultCategoryDataset0.getColumnKeys();
        defaultCategoryDataset0.validateObject();
        org.jfree.data.general.DatasetGroup datasetGroup5 = new org.jfree.data.general.DatasetGroup();
        java.lang.Object obj6 = datasetGroup5.clone();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis9 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float10 = categoryAxis9.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis11 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer14 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color15 = java.awt.Color.BLUE;
        lineAndShapeRenderer14.setBaseItemLabelPaint((java.awt.Paint) color15);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator20 = lineAndShapeRenderer14.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot21 = new org.jfree.chart.plot.CategoryPlot(categoryDataset7, categoryAxis9, valueAxis11, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer14);
        lineAndShapeRenderer14.setSeriesVisibleInLegend(3, (java.lang.Boolean) false, false);
        org.jfree.chart.axis.CategoryAxis categoryAxis28 = new org.jfree.chart.axis.CategoryAxis("hi!");
        java.lang.Object obj29 = categoryAxis28.clone();
        java.awt.Font font30 = categoryAxis28.getTickLabelFont();
        lineAndShapeRenderer14.setSeriesItemLabelFont((int) '#', font30);
        boolean boolean32 = datasetGroup5.equals((java.lang.Object) '#');
        defaultCategoryDataset0.setGroup(datasetGroup5);
        defaultCategoryDataset0.addValue((java.lang.Number) (-1), (java.lang.Comparable) false, (java.lang.Comparable) 'a');
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on datasetGroup5 and obj6", datasetGroup5.equals(obj6) ? datasetGroup5.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test136");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 1);
        java.lang.Object obj3 = null;
        keyedObjects2D0.setObject(obj3, (java.lang.Comparable) 4.0d, (java.lang.Comparable) ' ');
        int int7 = keyedObjects2D0.getColumnCount();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer10 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color11 = java.awt.Color.BLUE;
        lineAndShapeRenderer10.setBaseItemLabelPaint((java.awt.Paint) color11);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator16 = lineAndShapeRenderer10.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator17 = null;
        lineAndShapeRenderer10.setLegendItemURLGenerator(categorySeriesLabelGenerator17);
        java.awt.Paint paint20 = lineAndShapeRenderer10.getSeriesPaint(1);
        java.awt.Paint paint24 = lineAndShapeRenderer10.getItemFillPaint((-1), (int) (short) 100, false);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer28 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color29 = java.awt.Color.BLUE;
        lineAndShapeRenderer28.setBaseItemLabelPaint((java.awt.Paint) color29);
        java.awt.Shape shape31 = lineAndShapeRenderer28.getBaseShape();
        lineAndShapeRenderer10.setLegendShape((int) (byte) 1, shape31);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator33 = null;
        lineAndShapeRenderer10.setBaseToolTipGenerator(categoryToolTipGenerator33);
        boolean boolean35 = lineAndShapeRenderer10.getAutoPopulateSeriesPaint();
        java.awt.Font font39 = lineAndShapeRenderer10.getItemLabelFont((int) (short) 100, (int) (short) -1, true);
        boolean boolean40 = keyedObjects2D0.equals((java.lang.Object) true);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on lineAndShapeRenderer28 and lineAndShapeRenderer10.", lineAndShapeRenderer28.equals(lineAndShapeRenderer10) == lineAndShapeRenderer10.equals(lineAndShapeRenderer28));
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test137");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator3 = null;
        lineAndShapeRenderer2.setBaseURLGenerator(categoryURLGenerator3);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator6 = null;
        lineAndShapeRenderer2.setSeriesToolTipGenerator(10, categoryToolTipGenerator6);
        boolean boolean8 = lineAndShapeRenderer2.getBaseSeriesVisibleInLegend();
        java.awt.Stroke stroke10 = null;
        lineAndShapeRenderer2.setSeriesStroke((int) 'a', stroke10, true);
        java.awt.Font font14 = lineAndShapeRenderer2.getSeriesItemLabelFont(0);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer17 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator18 = null;
        lineAndShapeRenderer17.setBaseURLGenerator(categoryURLGenerator18);
        java.awt.Paint paint21 = lineAndShapeRenderer17.getSeriesOutlinePaint(0);
        java.awt.Font font22 = lineAndShapeRenderer17.getBaseItemLabelFont();
        java.awt.Shape shape24 = lineAndShapeRenderer17.lookupSeriesShape(2);
        lineAndShapeRenderer2.setBaseShape(shape24, false);
        org.jfree.chart.entity.ChartEntity chartEntity27 = new org.jfree.chart.entity.ChartEntity(shape24);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on lineAndShapeRenderer2 and lineAndShapeRenderer17", lineAndShapeRenderer2.equals(lineAndShapeRenderer17) ? lineAndShapeRenderer2.hashCode() == lineAndShapeRenderer17.hashCode() : true);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test138");
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
        java.awt.Color color35 = org.jfree.chart.ChartColor.DARK_MAGENTA;
        barRenderer0.setShadowPaint((java.awt.Paint) color35);
        barRenderer0.setBaseItemLabelsVisible(false, false);
        org.jfree.chart.renderer.category.BarRenderer barRenderer40 = new org.jfree.chart.renderer.category.BarRenderer();
        boolean boolean41 = barRenderer40.isDrawBarOutline();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer44 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color45 = java.awt.Color.BLUE;
        lineAndShapeRenderer44.setBaseItemLabelPaint((java.awt.Paint) color45);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator50 = lineAndShapeRenderer44.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition51 = lineAndShapeRenderer44.getBaseNegativeItemLabelPosition();
        barRenderer40.setNegativeItemLabelPositionFallback(itemLabelPosition51);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition53 = barRenderer40.getPositiveItemLabelPositionFallback();
        double double54 = barRenderer40.getMaximumBarWidth();
        org.jfree.chart.util.StandardGradientPaintTransformer standardGradientPaintTransformer55 = new org.jfree.chart.util.StandardGradientPaintTransformer();
        java.lang.Object obj56 = standardGradientPaintTransformer55.clone();
        barRenderer40.setGradientPaintTransformer((org.jfree.chart.util.GradientPaintTransformer) standardGradientPaintTransformer55);
        barRenderer0.setGradientPaintTransformer((org.jfree.chart.util.GradientPaintTransformer) standardGradientPaintTransformer55);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on itemLabelPosition11 and itemLabelPosition51", itemLabelPosition11.equals(itemLabelPosition51) ? itemLabelPosition11.hashCode() == itemLabelPosition51.hashCode() : true);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test139");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float3 = categoryAxis2.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis4 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer7 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color8 = java.awt.Color.BLUE;
        lineAndShapeRenderer7.setBaseItemLabelPaint((java.awt.Paint) color8);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator13 = lineAndShapeRenderer7.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot14 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis2, valueAxis4, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer7);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer15 = categoryPlot14.getRenderer();
        categoryItemRenderer15.setSeriesItemLabelsVisible((int) 'a', (java.lang.Boolean) true, true);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator21 = null;
        categoryItemRenderer15.setSeriesToolTipGenerator((int) (byte) 100, categoryToolTipGenerator21, false);
        org.jfree.chart.JFreeChart jFreeChart24 = null;
        org.jfree.chart.event.ChartChangeEventType chartChangeEventType25 = org.jfree.chart.event.ChartChangeEventType.NEW_DATASET;
        org.jfree.chart.event.ChartChangeEvent chartChangeEvent26 = new org.jfree.chart.event.ChartChangeEvent((java.lang.Object) categoryItemRenderer15, jFreeChart24, chartChangeEventType25);
        org.jfree.data.category.CategoryDataset categoryDataset27 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis29 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float30 = categoryAxis29.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis31 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer34 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color35 = java.awt.Color.BLUE;
        lineAndShapeRenderer34.setBaseItemLabelPaint((java.awt.Paint) color35);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator40 = lineAndShapeRenderer34.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot41 = new org.jfree.chart.plot.CategoryPlot(categoryDataset27, categoryAxis29, valueAxis31, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer34);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer42 = categoryPlot41.getRenderer();
        categoryItemRenderer42.setSeriesItemLabelsVisible((int) 'a', (java.lang.Boolean) true, true);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator48 = null;
        categoryItemRenderer42.setSeriesToolTipGenerator((int) (byte) 100, categoryToolTipGenerator48, false);
        org.jfree.chart.JFreeChart jFreeChart51 = null;
        org.jfree.chart.event.ChartChangeEventType chartChangeEventType52 = org.jfree.chart.event.ChartChangeEventType.NEW_DATASET;
        org.jfree.chart.event.ChartChangeEvent chartChangeEvent53 = new org.jfree.chart.event.ChartChangeEvent((java.lang.Object) categoryItemRenderer42, jFreeChart51, chartChangeEventType52);
        org.jfree.chart.event.ChartChangeEventType chartChangeEventType54 = chartChangeEvent53.getType();
        java.lang.Object obj55 = chartChangeEvent53.getSource();
        org.jfree.chart.event.ChartChangeEventType chartChangeEventType56 = chartChangeEvent53.getType();
        java.lang.String str57 = chartChangeEventType56.toString();
        chartChangeEvent26.setType(chartChangeEventType56);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryPlot14 and categoryPlot41", categoryPlot14.equals(categoryPlot41) ? categoryPlot14.hashCode() == categoryPlot41.hashCode() : true);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test140");
        org.jfree.chart.LegendItem legendItem1 = new org.jfree.chart.LegendItem("hi!");
        java.awt.Color color5 = java.awt.Color.getHSBColor((float) (short) 1, (float) ' ', 0.0f);
        legendItem1.setLinePaint((java.awt.Paint) color5);
        boolean boolean7 = legendItem1.isShapeOutlineVisible();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer10 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color11 = java.awt.Color.BLUE;
        lineAndShapeRenderer10.setBaseItemLabelPaint((java.awt.Paint) color11);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator16 = lineAndShapeRenderer10.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition18 = lineAndShapeRenderer10.getSeriesPositiveItemLabelPosition((int) 'a');
        java.awt.Shape shape20 = lineAndShapeRenderer10.lookupLegendShape(8);
        legendItem1.setLine(shape20);
        org.jfree.data.category.CategoryDataset categoryDataset22 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis24 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float25 = categoryAxis24.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis26 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer29 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color30 = java.awt.Color.BLUE;
        lineAndShapeRenderer29.setBaseItemLabelPaint((java.awt.Paint) color30);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator35 = lineAndShapeRenderer29.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot36 = new org.jfree.chart.plot.CategoryPlot(categoryDataset22, categoryAxis24, valueAxis26, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer29);
        java.lang.Object obj37 = categoryPlot36.clone();
        org.jfree.chart.util.RectangleEdge rectangleEdge39 = categoryPlot36.getDomainAxisEdge((int) ' ');
        boolean boolean40 = categoryPlot36.isRangeZeroBaselineVisible();
        org.jfree.chart.axis.CategoryAxis categoryAxis42 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float43 = categoryAxis42.getTickMarkInsideLength();
        categoryAxis42.setTickLabelsVisible(false);
        double double46 = categoryAxis42.getLowerMargin();
        boolean boolean47 = categoryPlot36.equals((java.lang.Object) categoryAxis42);
        org.jfree.chart.entity.PlotEntity plotEntity49 = new org.jfree.chart.entity.PlotEntity(shape20, (org.jfree.chart.plot.Plot) categoryPlot36, "TextAnchor.BOTTOM_CENTER");
        java.lang.String str50 = plotEntity49.toString();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryPlot36 and obj37", categoryPlot36.equals(obj37) ? categoryPlot36.hashCode() == obj37.hashCode() : true);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test141");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float3 = categoryAxis2.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis4 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer7 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color8 = java.awt.Color.BLUE;
        lineAndShapeRenderer7.setBaseItemLabelPaint((java.awt.Paint) color8);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator13 = lineAndShapeRenderer7.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot14 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis2, valueAxis4, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer7);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer15 = categoryPlot14.getRenderer();
        org.jfree.chart.axis.CategoryAxis categoryAxis17 = categoryPlot14.getDomainAxisForDataset(2);
        boolean boolean18 = categoryPlot14.canSelectByPoint();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent19 = null;
        categoryPlot14.datasetChanged(datasetChangeEvent19);
        org.jfree.chart.util.RectangleEdge rectangleEdge22 = categoryPlot14.getDomainAxisEdge(8);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer25 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color26 = java.awt.Color.BLUE;
        lineAndShapeRenderer25.setBaseItemLabelPaint((java.awt.Paint) color26);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator31 = lineAndShapeRenderer25.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator32 = null;
        lineAndShapeRenderer25.setLegendItemURLGenerator(categorySeriesLabelGenerator32);
        java.awt.Paint paint35 = lineAndShapeRenderer25.getSeriesPaint(1);
        org.jfree.chart.renderer.RenderAttributes renderAttributes36 = lineAndShapeRenderer25.getSelectedItemAttributes();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator37 = null;
        lineAndShapeRenderer25.setLegendItemURLGenerator(categorySeriesLabelGenerator37);
        java.awt.Font font42 = lineAndShapeRenderer25.getItemLabelFont((int) '4', (int) 'a', false);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer46 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator47 = null;
        lineAndShapeRenderer46.setBaseURLGenerator(categoryURLGenerator47);
        java.awt.Shape shape50 = lineAndShapeRenderer46.getLegendShape(0);
        lineAndShapeRenderer46.setAutoPopulateSeriesStroke(false);
        java.awt.Font font54 = lineAndShapeRenderer46.getSeriesItemLabelFont(0);
        lineAndShapeRenderer46.setUseSeriesOffset(true);
        java.awt.Shape shape58 = null;
        lineAndShapeRenderer46.setSeriesShape((int) (short) 10, shape58, true);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition61 = lineAndShapeRenderer46.getBasePositiveItemLabelPosition();
        org.jfree.chart.text.TextAnchor textAnchor62 = itemLabelPosition61.getTextAnchor();
        lineAndShapeRenderer25.setSeriesPositiveItemLabelPosition(1, itemLabelPosition61, false);
        categoryPlot14.setRenderer((org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer25);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer68 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator69 = null;
        lineAndShapeRenderer68.setBaseURLGenerator(categoryURLGenerator69);
        java.awt.Shape shape72 = lineAndShapeRenderer68.getLegendShape(0);
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation73 = null;
        boolean boolean74 = lineAndShapeRenderer68.removeAnnotation(categoryAnnotation73);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer77 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator78 = null;
        lineAndShapeRenderer77.setBaseURLGenerator(categoryURLGenerator78);
        java.awt.Shape shape81 = lineAndShapeRenderer77.getLegendShape(0);
        lineAndShapeRenderer77.setAutoPopulateSeriesStroke(false);
        java.awt.Font font85 = lineAndShapeRenderer77.getSeriesItemLabelFont(0);
        java.awt.Paint paint87 = lineAndShapeRenderer77.lookupLegendTextPaint(4);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition88 = lineAndShapeRenderer77.getBasePositiveItemLabelPosition();
        lineAndShapeRenderer68.setBaseNegativeItemLabelPosition(itemLabelPosition88);
        java.awt.Paint paint90 = lineAndShapeRenderer68.getBasePaint();
        categoryPlot14.setRangeGridlinePaint(paint90);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on lineAndShapeRenderer7 and lineAndShapeRenderer25.", lineAndShapeRenderer7.equals(lineAndShapeRenderer25) == lineAndShapeRenderer25.equals(lineAndShapeRenderer7));
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test142");
        org.jfree.chart.util.RectangleInsets rectangleInsets0 = org.jfree.chart.axis.Axis.DEFAULT_AXIS_LABEL_INSETS;
        double double2 = rectangleInsets0.calculateBottomInset(0.0d);
        org.jfree.chart.util.UnitType unitType3 = rectangleInsets0.getUnitType();
        org.jfree.data.category.CategoryDataset categoryDataset4 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis6 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float7 = categoryAxis6.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis8 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer11 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color12 = java.awt.Color.BLUE;
        lineAndShapeRenderer11.setBaseItemLabelPaint((java.awt.Paint) color12);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator17 = lineAndShapeRenderer11.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot18 = new org.jfree.chart.plot.CategoryPlot(categoryDataset4, categoryAxis6, valueAxis8, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer11);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent19 = new org.jfree.chart.event.PlotChangeEvent((org.jfree.chart.plot.Plot) categoryPlot18);
        java.awt.Stroke stroke20 = categoryPlot18.getRangeMinorGridlineStroke();
        java.awt.Paint paint21 = categoryPlot18.getDomainGridlinePaint();
        boolean boolean22 = unitType3.equals((java.lang.Object) categoryPlot18);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer25 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator26 = null;
        lineAndShapeRenderer25.setBaseURLGenerator(categoryURLGenerator26);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator29 = null;
        lineAndShapeRenderer25.setSeriesToolTipGenerator(10, categoryToolTipGenerator29);
        boolean boolean31 = lineAndShapeRenderer25.getBaseSeriesVisibleInLegend();
        java.awt.Stroke stroke33 = null;
        lineAndShapeRenderer25.setSeriesStroke((int) 'a', stroke33, true);
        org.jfree.chart.labels.ItemLabelAnchor itemLabelAnchor37 = org.jfree.chart.labels.ItemLabelAnchor.INSIDE3;
        java.awt.Color color38 = java.awt.Color.yellow;
        boolean boolean39 = itemLabelAnchor37.equals((java.lang.Object) color38);
        lineAndShapeRenderer25.setSeriesFillPaint((int) ' ', (java.awt.Paint) color38);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer43 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color44 = java.awt.Color.BLUE;
        lineAndShapeRenderer43.setBaseItemLabelPaint((java.awt.Paint) color44);
        java.awt.Stroke stroke47 = lineAndShapeRenderer43.getSeriesOutlineStroke((int) (short) 1);
        org.jfree.data.category.CategoryDataset categoryDataset48 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis50 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float51 = categoryAxis50.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis52 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer55 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color56 = java.awt.Color.BLUE;
        lineAndShapeRenderer55.setBaseItemLabelPaint((java.awt.Paint) color56);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator61 = lineAndShapeRenderer55.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot62 = new org.jfree.chart.plot.CategoryPlot(categoryDataset48, categoryAxis50, valueAxis52, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer55);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer63 = categoryPlot62.getRenderer();
        org.jfree.chart.axis.ValueAxis valueAxis65 = lineAndShapeRenderer43.getRangeAxis(categoryPlot62, (int) '4');
        boolean boolean66 = categoryPlot62.isRangeCrosshairVisible();
        lineAndShapeRenderer25.addChangeListener((org.jfree.chart.event.RendererChangeListener) categoryPlot62);
        lineAndShapeRenderer25.setDefaultEntityRadius((int) '#');
        lineAndShapeRenderer25.setSeriesCreateEntities(3, (java.lang.Boolean) false, true);
        java.awt.Shape shape75 = lineAndShapeRenderer25.getLegendShape(11);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator77 = null;
        lineAndShapeRenderer25.setSeriesURLGenerator((int) (byte) 100, categoryURLGenerator77);
        boolean boolean79 = unitType3.equals((java.lang.Object) (byte) 100);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryPlot18 and categoryPlot62", categoryPlot18.equals(categoryPlot62) ? categoryPlot18.hashCode() == categoryPlot62.hashCode() : true);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test143");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float3 = categoryAxis2.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis4 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer7 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color8 = java.awt.Color.BLUE;
        lineAndShapeRenderer7.setBaseItemLabelPaint((java.awt.Paint) color8);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator13 = lineAndShapeRenderer7.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot14 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis2, valueAxis4, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer7);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer15 = categoryPlot14.getRenderer();
        org.jfree.chart.axis.CategoryAxis categoryAxis17 = categoryPlot14.getDomainAxisForDataset(2);
        org.jfree.chart.LegendItemCollection legendItemCollection18 = categoryPlot14.getLegendItems();
        java.util.Iterator iterator19 = legendItemCollection18.iterator();
        java.lang.Object obj20 = legendItemCollection18.clone();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer23 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color24 = java.awt.Color.BLUE;
        lineAndShapeRenderer23.setBaseItemLabelPaint((java.awt.Paint) color24);
        java.awt.Stroke stroke27 = lineAndShapeRenderer23.getSeriesOutlineStroke((int) (short) 1);
        org.jfree.data.category.CategoryDataset categoryDataset28 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis30 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float31 = categoryAxis30.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis32 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer35 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color36 = java.awt.Color.BLUE;
        lineAndShapeRenderer35.setBaseItemLabelPaint((java.awt.Paint) color36);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator41 = lineAndShapeRenderer35.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot42 = new org.jfree.chart.plot.CategoryPlot(categoryDataset28, categoryAxis30, valueAxis32, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer35);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer43 = categoryPlot42.getRenderer();
        org.jfree.chart.axis.ValueAxis valueAxis45 = lineAndShapeRenderer23.getRangeAxis(categoryPlot42, (int) '4');
        boolean boolean46 = categoryPlot42.isRangeCrosshairVisible();
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder47 = categoryPlot42.getDatasetRenderingOrder();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo50 = null;
        java.awt.geom.Point2D point2D51 = null;
        categoryPlot42.zoomDomainAxes(1.0d, (double) (-1L), plotRenderingInfo50, point2D51);
        categoryPlot42.setDomainCrosshairVisible(false);
        float float55 = categoryPlot42.getForegroundAlpha();
        org.jfree.chart.LegendItemCollection legendItemCollection56 = categoryPlot42.getLegendItems();
        legendItemCollection18.addAll(legendItemCollection56);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on categoryPlot14 and categoryPlot42", categoryPlot14.equals(categoryPlot42) ? categoryPlot14.hashCode() == categoryPlot42.hashCode() : true);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test144");
        org.jfree.data.category.DefaultCategoryDataset defaultCategoryDataset0 = new org.jfree.data.category.DefaultCategoryDataset();
        int int2 = defaultCategoryDataset0.getColumnIndex((java.lang.Comparable) 3.0d);
        java.util.List list3 = defaultCategoryDataset0.getColumnKeys();
        defaultCategoryDataset0.validateObject();
        org.jfree.data.general.DatasetGroup datasetGroup5 = new org.jfree.data.general.DatasetGroup();
        java.lang.Object obj6 = datasetGroup5.clone();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis9 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float10 = categoryAxis9.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis11 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer14 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color15 = java.awt.Color.BLUE;
        lineAndShapeRenderer14.setBaseItemLabelPaint((java.awt.Paint) color15);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator20 = lineAndShapeRenderer14.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot21 = new org.jfree.chart.plot.CategoryPlot(categoryDataset7, categoryAxis9, valueAxis11, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer14);
        lineAndShapeRenderer14.setSeriesVisibleInLegend(3, (java.lang.Boolean) false, false);
        org.jfree.chart.axis.CategoryAxis categoryAxis28 = new org.jfree.chart.axis.CategoryAxis("hi!");
        java.lang.Object obj29 = categoryAxis28.clone();
        java.awt.Font font30 = categoryAxis28.getTickLabelFont();
        lineAndShapeRenderer14.setSeriesItemLabelFont((int) '#', font30);
        boolean boolean32 = datasetGroup5.equals((java.lang.Object) '#');
        defaultCategoryDataset0.setGroup(datasetGroup5);
        defaultCategoryDataset0.setValue((-7.0d), (java.lang.Comparable) 1L, (java.lang.Comparable) 35.0d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on datasetGroup5 and obj6", datasetGroup5.equals(obj6) ? datasetGroup5.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test145");
        org.jfree.chart.renderer.category.BarRenderer barRenderer0 = new org.jfree.chart.renderer.category.BarRenderer();
        boolean boolean1 = barRenderer0.isDrawBarOutline();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer4 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color5 = java.awt.Color.BLUE;
        lineAndShapeRenderer4.setBaseItemLabelPaint((java.awt.Paint) color5);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator10 = lineAndShapeRenderer4.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition11 = lineAndShapeRenderer4.getBaseNegativeItemLabelPosition();
        barRenderer0.setNegativeItemLabelPositionFallback(itemLabelPosition11);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition13 = barRenderer0.getPositiveItemLabelPositionFallback();
        double double14 = barRenderer0.getMaximumBarWidth();
        org.jfree.chart.util.StandardGradientPaintTransformer standardGradientPaintTransformer15 = new org.jfree.chart.util.StandardGradientPaintTransformer();
        java.lang.Object obj16 = standardGradientPaintTransformer15.clone();
        barRenderer0.setGradientPaintTransformer((org.jfree.chart.util.GradientPaintTransformer) standardGradientPaintTransformer15);
        double double18 = barRenderer0.getBase();
        java.awt.Stroke stroke20 = barRenderer0.getSeriesOutlineStroke(0);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator21 = null;
        barRenderer0.setBaseItemLabelGenerator(categoryItemLabelGenerator21);
        org.jfree.chart.renderer.category.BarRenderer barRenderer23 = new org.jfree.chart.renderer.category.BarRenderer();
        boolean boolean24 = barRenderer23.isDrawBarOutline();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer27 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color28 = java.awt.Color.BLUE;
        lineAndShapeRenderer27.setBaseItemLabelPaint((java.awt.Paint) color28);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator33 = lineAndShapeRenderer27.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition34 = lineAndShapeRenderer27.getBaseNegativeItemLabelPosition();
        barRenderer23.setNegativeItemLabelPositionFallback(itemLabelPosition34);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer38 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator39 = null;
        lineAndShapeRenderer38.setBaseURLGenerator(categoryURLGenerator39);
        java.awt.Shape shape42 = lineAndShapeRenderer38.getLegendShape(0);
        lineAndShapeRenderer38.setAutoPopulateSeriesStroke(false);
        java.awt.Font font46 = lineAndShapeRenderer38.getSeriesItemLabelFont(0);
        lineAndShapeRenderer38.setUseSeriesOffset(true);
        java.awt.Shape shape50 = null;
        lineAndShapeRenderer38.setSeriesShape((int) (short) 10, shape50, true);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition53 = lineAndShapeRenderer38.getBasePositiveItemLabelPosition();
        org.jfree.chart.text.TextAnchor textAnchor54 = itemLabelPosition53.getTextAnchor();
        barRenderer23.setPositiveItemLabelPositionFallback(itemLabelPosition53);
        boolean boolean56 = barRenderer23.getShadowsVisible();
        org.jfree.chart.renderer.category.BarPainter barPainter57 = barRenderer23.getBarPainter();
        java.awt.Color color58 = org.jfree.chart.ChartColor.DARK_MAGENTA;
        barRenderer23.setShadowPaint((java.awt.Paint) color58);
        barRenderer0.setShadowPaint((java.awt.Paint) color58);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on itemLabelPosition11 and itemLabelPosition34", itemLabelPosition11.equals(itemLabelPosition34) ? itemLabelPosition11.hashCode() == itemLabelPosition34.hashCode() : true);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test146");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float3 = categoryAxis2.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis4 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer7 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color8 = java.awt.Color.BLUE;
        lineAndShapeRenderer7.setBaseItemLabelPaint((java.awt.Paint) color8);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator13 = lineAndShapeRenderer7.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot14 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis2, valueAxis4, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer7);
        java.lang.Object obj15 = categoryPlot14.clone();
        org.jfree.chart.util.RectangleEdge rectangleEdge17 = categoryPlot14.getDomainAxisEdge((int) ' ');
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo19 = null;
        org.jfree.data.category.CategoryDataset categoryDataset20 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis22 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float23 = categoryAxis22.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis24 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer27 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color28 = java.awt.Color.BLUE;
        lineAndShapeRenderer27.setBaseItemLabelPaint((java.awt.Paint) color28);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator33 = lineAndShapeRenderer27.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot34 = new org.jfree.chart.plot.CategoryPlot(categoryDataset20, categoryAxis22, valueAxis24, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer27);
        org.jfree.chart.axis.CategoryAxis categoryAxis35 = categoryPlot34.getDomainAxis();
        java.awt.Stroke stroke36 = categoryPlot34.getRangeCrosshairStroke();
        categoryPlot34.configureDomainAxes();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo39 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer42 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator43 = null;
        lineAndShapeRenderer42.setBaseURLGenerator(categoryURLGenerator43);
        java.awt.Shape shape46 = lineAndShapeRenderer42.getLegendShape(0);
        lineAndShapeRenderer42.setAutoPopulateSeriesFillPaint(false);
        java.lang.Boolean boolean50 = lineAndShapeRenderer42.getSeriesVisible((int) (byte) 10);
        java.awt.Graphics2D graphics2D51 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation52 = null;
        java.awt.geom.Rectangle2D rectangle2D53 = null;
        java.awt.geom.Rectangle2D rectangle2D54 = null;
        org.jfree.data.category.CategoryDataset categoryDataset55 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis57 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float58 = categoryAxis57.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis59 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer62 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color63 = java.awt.Color.BLUE;
        lineAndShapeRenderer62.setBaseItemLabelPaint((java.awt.Paint) color63);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator68 = lineAndShapeRenderer62.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot69 = new org.jfree.chart.plot.CategoryPlot(categoryDataset55, categoryAxis57, valueAxis59, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer62);
        java.lang.Object obj70 = categoryPlot69.clone();
        org.jfree.chart.util.RectangleInsets rectangleInsets71 = org.jfree.chart.axis.Axis.DEFAULT_AXIS_LABEL_INSETS;
        double double73 = rectangleInsets71.extendWidth((double) 10L);
        double double75 = rectangleInsets71.extendWidth((double) (short) -1);
        double double76 = rectangleInsets71.getRight();
        categoryPlot69.setInsets(rectangleInsets71, false);
        double double80 = rectangleInsets71.extendWidth((double) (-1));
        double double81 = rectangleInsets71.getBottom();
        double double83 = rectangleInsets71.calculateRightOutset(0.0d);
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType84 = null;
        org.jfree.chart.util.RectangleAnchor rectangleAnchor85 = null;
        java.awt.geom.Point2D point2D86 = lineAndShapeRenderer42.calculateRangeMarkerTextAnchorPoint(graphics2D51, plotOrientation52, rectangle2D53, rectangle2D54, rectangleInsets71, lengthAdjustmentType84, rectangleAnchor85);
        categoryPlot34.zoomDomainAxes(16.0d, plotRenderingInfo39, point2D86, false);
        categoryPlot14.panRangeAxes((double) 128, plotRenderingInfo19, point2D86);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj15 and categoryPlot34", obj15.equals(categoryPlot34) ? obj15.hashCode() == categoryPlot34.hashCode() : true);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test147");
        org.jfree.chart.renderer.category.BarRenderer barRenderer0 = new org.jfree.chart.renderer.category.BarRenderer();
        boolean boolean1 = barRenderer0.isDrawBarOutline();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition2 = barRenderer0.getBasePositiveItemLabelPosition();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition3 = barRenderer0.getPositiveItemLabelPositionFallback();
        boolean boolean4 = barRenderer0.getIncludeBaseInRange();
        org.jfree.data.category.CategoryDataset categoryDataset5 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis7 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float8 = categoryAxis7.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis9 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer12 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color13 = java.awt.Color.BLUE;
        lineAndShapeRenderer12.setBaseItemLabelPaint((java.awt.Paint) color13);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator18 = lineAndShapeRenderer12.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot19 = new org.jfree.chart.plot.CategoryPlot(categoryDataset5, categoryAxis7, valueAxis9, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer12);
        boolean boolean20 = categoryPlot19.canSelectByPoint();
        org.jfree.chart.LegendItemCollection legendItemCollection21 = categoryPlot19.getFixedLegendItems();
        java.awt.Stroke stroke22 = categoryPlot19.getRangeGridlineStroke();
        org.jfree.chart.axis.CategoryAxis categoryAxis24 = new org.jfree.chart.axis.CategoryAxis("hi!");
        double double25 = categoryAxis24.getFixedDimension();
        org.jfree.chart.plot.Plot plot26 = categoryAxis24.getPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets27 = categoryAxis24.getLabelInsets();
        double double29 = rectangleInsets27.calculateTopInset((double) 1.0f);
        categoryPlot19.setAxisOffset(rectangleInsets27);
        categoryPlot19.setRangeCrosshairVisible(false);
        org.jfree.chart.axis.ValueAxis valueAxis34 = categoryPlot19.getRangeAxisForDataset(4);
        barRenderer0.addChangeListener((org.jfree.chart.event.RendererChangeListener) categoryPlot19);
        java.awt.Font font37 = barRenderer0.getSeriesItemLabelFont((-1));
        org.jfree.chart.labels.ItemLabelAnchor itemLabelAnchor38 = org.jfree.chart.labels.ItemLabelAnchor.INSIDE7;
        org.jfree.chart.text.TextAnchor textAnchor39 = org.jfree.chart.text.TextAnchor.BASELINE_CENTER;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer42 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator43 = null;
        lineAndShapeRenderer42.setBaseURLGenerator(categoryURLGenerator43);
        java.awt.Shape shape46 = lineAndShapeRenderer42.getLegendShape(0);
        lineAndShapeRenderer42.setAutoPopulateSeriesStroke(false);
        java.awt.Font font50 = lineAndShapeRenderer42.getSeriesItemLabelFont(0);
        lineAndShapeRenderer42.setUseSeriesOffset(true);
        java.awt.Shape shape54 = null;
        lineAndShapeRenderer42.setSeriesShape((int) (short) 10, shape54, true);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition57 = lineAndShapeRenderer42.getBasePositiveItemLabelPosition();
        org.jfree.chart.text.TextAnchor textAnchor58 = itemLabelPosition57.getTextAnchor();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition60 = new org.jfree.chart.labels.ItemLabelPosition(itemLabelAnchor38, textAnchor39, textAnchor58, 29.0d);
        barRenderer0.setBaseNegativeItemLabelPosition(itemLabelPosition60);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on itemLabelPosition2 and itemLabelPosition57", itemLabelPosition2.equals(itemLabelPosition57) ? itemLabelPosition2.hashCode() == itemLabelPosition57.hashCode() : true);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test148");
        org.jfree.data.category.CategoryDataset categoryDataset1 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis3 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float4 = categoryAxis3.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis5 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer8 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color9 = java.awt.Color.BLUE;
        lineAndShapeRenderer8.setBaseItemLabelPaint((java.awt.Paint) color9);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator14 = lineAndShapeRenderer8.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot15 = new org.jfree.chart.plot.CategoryPlot(categoryDataset1, categoryAxis3, valueAxis5, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer8);
        org.jfree.chart.axis.AxisLocation axisLocation16 = org.jfree.chart.axis.AxisLocation.TOP_OR_LEFT;
        categoryPlot15.setRangeAxisLocation(axisLocation16);
        categoryPlot15.configureDomainAxes();
        categoryPlot15.setBackgroundImageAlpha((float) 0);
        boolean boolean21 = categoryPlot15.isRangeZoomable();
        org.jfree.data.KeyedObject keyedObject22 = new org.jfree.data.KeyedObject((java.lang.Comparable) "ItemLabelAnchor.INSIDE10", (java.lang.Object) boolean21);
        org.jfree.data.category.CategoryDataset categoryDataset23 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis25 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float26 = categoryAxis25.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis27 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer30 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color31 = java.awt.Color.BLUE;
        lineAndShapeRenderer30.setBaseItemLabelPaint((java.awt.Paint) color31);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator36 = lineAndShapeRenderer30.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot37 = new org.jfree.chart.plot.CategoryPlot(categoryDataset23, categoryAxis25, valueAxis27, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer30);
        categoryAxis25.setUpperMargin(10.0d);
        org.jfree.chart.util.ObjectList objectList41 = new org.jfree.chart.util.ObjectList(8);
        int int43 = objectList41.indexOf((java.lang.Object) "hi!");
        boolean boolean44 = categoryAxis25.equals((java.lang.Object) objectList41);
        java.lang.Object obj46 = objectList41.get((int) (byte) 1);
        org.jfree.chart.axis.CategoryAxis categoryAxis48 = new org.jfree.chart.axis.CategoryAxis("hi!");
        java.lang.Object obj49 = categoryAxis48.clone();
        java.awt.Font font50 = categoryAxis48.getTickLabelFont();
        java.awt.Paint paint51 = categoryAxis48.getLabelPaint();
        java.awt.Stroke stroke52 = categoryAxis48.getAxisLineStroke();
        int int53 = objectList41.indexOf((java.lang.Object) stroke52);
        java.lang.Object obj55 = objectList41.get(192);
        keyedObject22.setObject((java.lang.Object) objectList41);
        org.jfree.chart.util.StrokeList strokeList57 = new org.jfree.chart.util.StrokeList();
        keyedObject22.setObject((java.lang.Object) strokeList57);
        java.lang.Object obj59 = strokeList57.clone();
        java.lang.Object obj60 = strokeList57.clone();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on objectList41 and obj59.", objectList41.equals(obj59) == obj59.equals(objectList41));
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test149");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator3 = null;
        lineAndShapeRenderer2.setBaseURLGenerator(categoryURLGenerator3);
        java.awt.Shape shape6 = lineAndShapeRenderer2.getLegendShape(0);
        lineAndShapeRenderer2.setAutoPopulateSeriesStroke(false);
        java.awt.Font font10 = lineAndShapeRenderer2.getSeriesItemLabelFont(0);
        java.awt.Paint paint12 = lineAndShapeRenderer2.lookupLegendTextPaint(4);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition13 = lineAndShapeRenderer2.getBasePositiveItemLabelPosition();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer16 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator17 = null;
        lineAndShapeRenderer16.setBaseURLGenerator(categoryURLGenerator17);
        java.awt.Shape shape20 = lineAndShapeRenderer16.getLegendShape(0);
        lineAndShapeRenderer16.setAutoPopulateSeriesStroke(false);
        java.awt.Font font24 = lineAndShapeRenderer16.getSeriesItemLabelFont(0);
        lineAndShapeRenderer16.setUseSeriesOffset(true);
        java.awt.Font font28 = null;
        lineAndShapeRenderer16.setSeriesItemLabelFont((int) (short) 1, font28, false);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition32 = lineAndShapeRenderer16.getSeriesPositiveItemLabelPosition((int) (byte) 100);
        org.jfree.chart.labels.ItemLabelAnchor itemLabelAnchor33 = itemLabelPosition32.getItemLabelAnchor();
        lineAndShapeRenderer2.setBasePositiveItemLabelPosition(itemLabelPosition32, true);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator37 = null;
        lineAndShapeRenderer2.setSeriesToolTipGenerator((int) (byte) 100, categoryToolTipGenerator37, false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on itemLabelPosition13 and itemLabelPosition32", itemLabelPosition13.equals(itemLabelPosition32) ? itemLabelPosition13.hashCode() == itemLabelPosition32.hashCode() : true);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test150");
        org.jfree.data.category.DefaultCategoryDataset defaultCategoryDataset0 = new org.jfree.data.category.DefaultCategoryDataset();
        int int2 = defaultCategoryDataset0.getColumnIndex((java.lang.Comparable) 3.0d);
        int int4 = defaultCategoryDataset0.getRowIndex((java.lang.Comparable) (byte) 10);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer7 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color8 = java.awt.Color.BLUE;
        lineAndShapeRenderer7.setBaseItemLabelPaint((java.awt.Paint) color8);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator13 = lineAndShapeRenderer7.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator14 = null;
        lineAndShapeRenderer7.setLegendItemURLGenerator(categorySeriesLabelGenerator14);
        java.awt.Paint paint17 = lineAndShapeRenderer7.getSeriesPaint(1);
        org.jfree.chart.renderer.RenderAttributes renderAttributes18 = lineAndShapeRenderer7.getSelectedItemAttributes();
        java.awt.Color color20 = java.awt.Color.BLUE;
        renderAttributes18.setSeriesFillPaint((int) 'a', (java.awt.Paint) color20);
        org.jfree.chart.axis.CategoryAxis categoryAxis23 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float24 = categoryAxis23.getTickMarkInsideLength();
        categoryAxis23.setMaximumCategoryLabelLines((int) (byte) 1);
        boolean boolean27 = categoryAxis23.isVisible();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer31 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator32 = null;
        lineAndShapeRenderer31.setBaseURLGenerator(categoryURLGenerator32);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator35 = null;
        lineAndShapeRenderer31.setSeriesToolTipGenerator(10, categoryToolTipGenerator35);
        boolean boolean37 = lineAndShapeRenderer31.getBaseSeriesVisibleInLegend();
        java.awt.Stroke stroke39 = null;
        lineAndShapeRenderer31.setSeriesStroke((int) 'a', stroke39, true);
        org.jfree.chart.labels.ItemLabelAnchor itemLabelAnchor43 = org.jfree.chart.labels.ItemLabelAnchor.INSIDE3;
        java.awt.Color color44 = java.awt.Color.yellow;
        boolean boolean45 = itemLabelAnchor43.equals((java.lang.Object) color44);
        lineAndShapeRenderer31.setSeriesFillPaint((int) ' ', (java.awt.Paint) color44);
        categoryAxis23.setTickLabelPaint((java.lang.Comparable) false, (java.awt.Paint) color44);
        renderAttributes18.setDefaultOutlinePaint((java.awt.Paint) color44);
        java.awt.Color color50 = org.jfree.chart.ChartColor.DARK_YELLOW;
        renderAttributes18.setSeriesFillPaint((int) (byte) 0, (java.awt.Paint) color50);
        java.awt.Paint paint53 = renderAttributes18.getSeriesPaint((int) (short) 10);
        java.awt.Shape shape56 = renderAttributes18.getItemShape(100, (int) 'a');
        java.lang.Boolean boolean57 = renderAttributes18.getDefaultCreateEntity();
        boolean boolean58 = defaultCategoryDataset0.equals((java.lang.Object) renderAttributes18);
        defaultCategoryDataset0.fireSelectionEvent();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer62 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color63 = java.awt.Color.BLUE;
        lineAndShapeRenderer62.setBaseItemLabelPaint((java.awt.Paint) color63);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator68 = lineAndShapeRenderer62.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator69 = null;
        lineAndShapeRenderer62.setLegendItemURLGenerator(categorySeriesLabelGenerator69);
        java.awt.Paint paint72 = lineAndShapeRenderer62.getSeriesPaint(1);
        java.awt.Paint paint76 = lineAndShapeRenderer62.getItemFillPaint((-1), (int) (short) 100, false);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer80 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color81 = java.awt.Color.BLUE;
        lineAndShapeRenderer80.setBaseItemLabelPaint((java.awt.Paint) color81);
        java.awt.Shape shape83 = lineAndShapeRenderer80.getBaseShape();
        lineAndShapeRenderer62.setLegendShape((int) (byte) 1, shape83);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator85 = null;
        lineAndShapeRenderer62.setBaseToolTipGenerator(categoryToolTipGenerator85);
        boolean boolean87 = lineAndShapeRenderer62.getBaseShapesFilled();
        boolean boolean88 = defaultCategoryDataset0.equals((java.lang.Object) boolean87);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on lineAndShapeRenderer7 and lineAndShapeRenderer62.", lineAndShapeRenderer7.equals(lineAndShapeRenderer62) == lineAndShapeRenderer62.equals(lineAndShapeRenderer7));
    }
}

