package org.jsoup.nodes;

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
        org.jsoup.nodes.Evaluator.IndexLessThan indexLessThan1 = new org.jsoup.nodes.Evaluator.IndexLessThan((int) (byte) -1);
        org.jsoup.nodes.Document document4 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node5 = document4.parentNode;
        org.jsoup.select.Elements elements7 = document4.getElementsByIndexLessThan((int) 'a');
        boolean boolean8 = indexLessThan1.matches((org.jsoup.nodes.Element) document4);
        org.jsoup.nodes.Document document11 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node12 = document11.parentNode;
        org.jsoup.select.Elements elements13 = document11.getAllElements();
        org.jsoup.select.Elements elements14 = org.jsoup.select.Collector.collect((org.jsoup.nodes.Evaluator) indexLessThan1, (org.jsoup.nodes.Element) document11);
        org.jsoup.nodes.Element element15 = document11.body();
        java.lang.StringBuilder stringBuilder16 = null;
        // The following exception was thrown during execution in test generation
        try {
            element15.outerHtml(stringBuilder16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(element15);
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1502");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("#text", "");
        org.jsoup.nodes.Element element3 = document2.body();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element3);
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1503");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("<?head>");
        java.util.Set<java.lang.String> strSet2 = document1.classNames();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(strSet2);
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1504");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str3 = document2.outerHtml();
        org.jsoup.nodes.Document document6 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node7 = document6.parentNode;
        java.lang.String str8 = document6.title();
        org.jsoup.nodes.Element element10 = document6.text("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element11 = document2.appendChild((org.jsoup.nodes.Node) document6);
        org.jsoup.nodes.Attributes attributes12 = document6.attributes();
        boolean boolean14 = attributes12.hasKey("hi!");
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor15 = attributes12.iterator();
        org.jsoup.nodes.Document document18 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node19 = document18.parentNode;
        java.lang.String str20 = document18.title();
        org.jsoup.nodes.Attributes attributes21 = document18.attributes();
        java.lang.String str22 = attributes21.html();
        attributes12.addAll(attributes21);
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor24 = attributes12.iterator();
        org.jsoup.nodes.Document document27 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str28 = document27.outerHtml();
        org.jsoup.nodes.Document document31 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node32 = document31.parentNode;
        java.lang.String str33 = document31.title();
        org.jsoup.nodes.Element element35 = document31.text("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element36 = document27.appendChild((org.jsoup.nodes.Node) document31);
        org.jsoup.nodes.Attributes attributes37 = document31.attributes();
        boolean boolean39 = attributes37.hasKey("hi!");
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor40 = attributes37.iterator();
        org.jsoup.nodes.Document document43 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node44 = document43.parentNode;
        java.lang.String str45 = document43.title();
        org.jsoup.nodes.Attributes attributes46 = document43.attributes();
        java.lang.String str47 = attributes46.html();
        attributes37.addAll(attributes46);
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor49 = attributes46.iterator();
        attributes12.addAll(attributes46);
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator51 = attributes46.spliterator();
        attributes46.remove("hi!");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str3, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(attributes12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(attributeItor15);
        org.junit.Assert.assertNotNull(document18);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(attributes21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(attributeItor24);
        org.junit.Assert.assertNotNull(document27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str28, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document31);
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertNotNull(element36);
        org.junit.Assert.assertNotNull(attributes37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(attributeItor40);
        org.junit.Assert.assertNotNull(document43);
        org.junit.Assert.assertNull(node44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertNotNull(attributes46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertNotNull(attributeItor49);
        org.junit.Assert.assertNotNull(attributeSpliterator51);
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1505");
        org.jsoup.nodes.Evaluator.IndexLessThan indexLessThan1 = new org.jsoup.nodes.Evaluator.IndexLessThan((int) (byte) -1);
        org.jsoup.nodes.Document document4 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node5 = document4.parentNode;
        org.jsoup.select.Elements elements7 = document4.getElementsByIndexLessThan((int) 'a');
        boolean boolean8 = indexLessThan1.matches((org.jsoup.nodes.Element) document4);
        indexLessThan1.index = (byte) 10;
        org.jsoup.nodes.Document document12 = org.jsoup.Jsoup.parseBodyFragment("head");
        boolean boolean13 = indexLessThan1.matches((org.jsoup.nodes.Element) document12);
        org.junit.Assert.assertNotNull(document4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1506");
        org.jsoup.nodes.Evaluator.Tag tag1 = new org.jsoup.nodes.Evaluator.Tag("#document");
        org.jsoup.nodes.Evaluator.IndexLessThan indexLessThan3 = new org.jsoup.nodes.Evaluator.IndexLessThan((int) (byte) -1);
        org.jsoup.nodes.Document document6 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node7 = document6.parentNode;
        org.jsoup.select.Elements elements9 = document6.getElementsByIndexLessThan((int) 'a');
        boolean boolean10 = indexLessThan3.matches((org.jsoup.nodes.Element) document6);
        org.jsoup.nodes.Document document13 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node14 = document13.parentNode;
        org.jsoup.select.Elements elements15 = document13.getAllElements();
        org.jsoup.select.Elements elements16 = org.jsoup.select.Collector.collect((org.jsoup.nodes.Evaluator) indexLessThan3, (org.jsoup.nodes.Element) document13);
        boolean boolean17 = tag1.matches((org.jsoup.nodes.Element) document13);
        document13.baseUri = "hi=\"\"";
        org.jsoup.nodes.Element element21 = document13.appendText("");
        org.jsoup.nodes.Element element23 = element21.prependText(" !");
        org.jsoup.nodes.Element element25 = element23.addClass("\n<!---->");
        java.util.List<org.jsoup.nodes.Node> nodeList26 = element23.childNodes();
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(nodeList26);
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1507");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("head", "hi!");
        java.lang.String str3 = attribute2.getKey();
        org.jsoup.nodes.Evaluator.AllElements allElements4 = new org.jsoup.nodes.Evaluator.AllElements();
        org.jsoup.nodes.Document document7 = org.jsoup.Jsoup.parseBodyFragment("hi", "hi");
        boolean boolean8 = allElements4.matches((org.jsoup.nodes.Element) document7);
        boolean boolean9 = attribute2.equals((java.lang.Object) allElements4);
        org.jsoup.nodes.Evaluator.Tag tag11 = new org.jsoup.nodes.Evaluator.Tag("hi");
        org.jsoup.nodes.Document document14 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str15 = document14.outerHtml();
        org.jsoup.nodes.Document document18 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node19 = document18.parentNode;
        java.lang.String str20 = document18.title();
        org.jsoup.nodes.Element element22 = document18.text("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element23 = document14.appendChild((org.jsoup.nodes.Node) document18);
        org.jsoup.nodes.Document document26 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node27 = document26.parentNode;
        java.lang.String str28 = document26.title();
        org.jsoup.nodes.Attributes attributes29 = document26.attributes();
        org.jsoup.nodes.Document document32 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node33 = document32.parentNode;
        org.jsoup.select.Elements elements35 = document32.getElementsByIndexLessThan((int) 'a');
        org.jsoup.nodes.Element element36 = document26.prependChild((org.jsoup.nodes.Node) document32);
        org.jsoup.select.Elements elements38 = document26.select("hi");
        org.jsoup.nodes.Element element39 = document18.appendChild((org.jsoup.nodes.Node) document26);
        org.jsoup.nodes.Element element41 = element39.prependText("#document");
        org.jsoup.nodes.Document document43 = org.jsoup.nodes.Document.createShell(" !");
        org.jsoup.nodes.Element element44 = element41.appendChild((org.jsoup.nodes.Node) document43);
        boolean boolean45 = tag11.matches(element41);
        org.jsoup.nodes.DataNode dataNode48 = new org.jsoup.nodes.DataNode("", "#document");
        org.jsoup.nodes.Element element49 = element41.prependChild((org.jsoup.nodes.Node) dataNode48);
        boolean boolean50 = attribute2.equals((java.lang.Object) element41);
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "head" + "'", str3, "head");
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(document14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str15, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document18);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(document26);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(attributes29);
        org.junit.Assert.assertNotNull(document32);
        org.junit.Assert.assertNull(node33);
        org.junit.Assert.assertNotNull(elements35);
        org.junit.Assert.assertNotNull(element36);
        org.junit.Assert.assertNotNull(elements38);
        org.junit.Assert.assertNotNull(element39);
        org.junit.Assert.assertNotNull(element41);
        org.junit.Assert.assertNotNull(document43);
        org.junit.Assert.assertNotNull(element44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(element49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1508");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node3 = document2.parentNode;
        org.jsoup.select.Elements elements4 = document2.getAllElements();
        org.jsoup.nodes.Element element6 = document2.createElement("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.select.Elements elements7 = element6.getAllElements();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = element6.childNodes;
        org.jsoup.nodes.Document document11 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node12 = document11.parentNode;
        java.lang.String str13 = document11.title();
        org.jsoup.nodes.Attributes attributes14 = document11.attributes();
        org.jsoup.nodes.Document document17 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node18 = document17.parentNode;
        org.jsoup.select.Elements elements20 = document17.getElementsByIndexLessThan((int) 'a');
        org.jsoup.nodes.Element element21 = document11.prependChild((org.jsoup.nodes.Node) document17);
        java.lang.String str22 = document17.baseUri();
        org.jsoup.nodes.Document document25 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str26 = document25.outerHtml();
        org.jsoup.nodes.Document document29 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node30 = document29.parentNode;
        java.lang.String str31 = document29.title();
        org.jsoup.nodes.Element element33 = document29.text("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element34 = document25.appendChild((org.jsoup.nodes.Node) document29);
        org.jsoup.nodes.Attributes attributes35 = document29.attributes();
        document17.addChild((org.jsoup.nodes.Node) document29);
        org.jsoup.nodes.Document document38 = org.jsoup.Jsoup.parseBodyFragment("head");
        org.jsoup.nodes.Element element39 = document29.prependChild((org.jsoup.nodes.Node) document38);
        element6.setParentNode((org.jsoup.nodes.Node) document38);
        org.jsoup.nodes.Element element42 = document38.addClass("#declaration");
        org.jsoup.select.Elements elements45 = element42.getElementsByAttributeValueContaining("<html>\n<head>\n</head>\n<body>\n [ , !]\n</body>\n</html>", "hi=\"\"");
        java.util.Collection<org.jsoup.nodes.Element> elementCollection47 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean48 = elements45.addAll(0, elementCollection47);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(attributes14);
        org.junit.Assert.assertNotNull(document17);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertNotNull(elements20);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(document25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str26, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document29);
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertNotNull(element34);
        org.junit.Assert.assertNotNull(attributes35);
        org.junit.Assert.assertNotNull(document38);
        org.junit.Assert.assertNotNull(element39);
        org.junit.Assert.assertNotNull(element42);
        org.junit.Assert.assertNotNull(elements45);
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1509");
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parse("#declaration", "\n<body>\n <!----> hi!\n</body>");
        org.jsoup.nodes.Document document5 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node6 = document5.parentNode;
        java.lang.String str7 = document5.title();
        org.jsoup.nodes.Attributes attributes8 = document5.attributes();
        org.jsoup.nodes.Document document11 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node12 = document11.parentNode;
        org.jsoup.select.Elements elements14 = document11.getElementsByIndexLessThan((int) 'a');
        org.jsoup.nodes.Element element15 = document5.prependChild((org.jsoup.nodes.Node) document11);
        java.lang.String str16 = document11.baseUri();
        org.jsoup.nodes.Document document19 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str20 = document19.outerHtml();
        org.jsoup.nodes.Document document23 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node24 = document23.parentNode;
        java.lang.String str25 = document23.title();
        org.jsoup.nodes.Element element27 = document23.text("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element28 = document19.appendChild((org.jsoup.nodes.Node) document23);
        org.jsoup.nodes.Attributes attributes29 = document23.attributes();
        document11.addChild((org.jsoup.nodes.Node) document23);
        org.jsoup.nodes.Document document32 = org.jsoup.Jsoup.parseBodyFragment("head");
        org.jsoup.nodes.Element element33 = document23.prependChild((org.jsoup.nodes.Node) document32);
        org.jsoup.select.Elements elements34 = document32.siblingElements();
        org.jsoup.nodes.Node node35 = document32.nextSibling();
        boolean boolean37 = document32.hasClass("<html> \n<head> \n</head> \n<body>\n  [ , !]  \n</body>\n</html>\n<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element39 = document32.prependElement("#declaration");
        // The following exception was thrown during execution in test generation
        try {
            document2.replaceWith((org.jsoup.nodes.Node) document32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(document5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(document19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str20, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document23);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertNotNull(attributes29);
        org.junit.Assert.assertNotNull(document32);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertNotNull(elements34);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(element39);
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1510");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node3 = document2.parentNode;
        org.jsoup.select.Elements elements5 = document2.getElementsByIndexLessThan((int) 'a');
        org.jsoup.select.Elements elements7 = elements5.val("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        java.util.stream.Stream<org.jsoup.nodes.Element> elementStream8 = elements5.stream();
        org.jsoup.select.Elements elements10 = elements5.toggleClass("#document");
        java.util.Iterator<org.jsoup.nodes.Element> elementItor11 = elements10.iterator();
        org.jsoup.select.Elements elements13 = elements10.removeAttr("#comment");
        org.jsoup.select.Elements elements15 = elements10.append("");
        org.jsoup.nodes.Document document18 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node19 = document18.parentNode;
        org.jsoup.select.Elements elements21 = document18.getElementsByIndexLessThan((int) 'a');
        java.util.stream.Stream<org.jsoup.nodes.Element> elementStream22 = elements21.stream();
        org.jsoup.select.Elements elements24 = elements21.addClass("hi");
        org.jsoup.select.Elements elements25 = new org.jsoup.select.Elements((java.util.Collection<org.jsoup.nodes.Element>) elements24);
        org.jsoup.select.Elements elements28 = elements24.attr("head", "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.select.Elements elements30 = elements28.val("#text");
        org.jsoup.select.Elements elements32 = elements30.removeAttr("<html> \n<head> \n</head> \n<body>\n  [ , !]  \n</body>\n</html>\n<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        boolean boolean33 = elements15.addAll((java.util.Collection<org.jsoup.nodes.Element>) elements30);
        org.jsoup.nodes.Document document36 = org.jsoup.nodes.Document.createShell("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element38 = document36.appendText("<html> \n<head> \n</head> \n<body>\n  [ , !]  \n</body>\n</html>\n<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.select.Elements elements41 = document36.getElementsByAttributeValueEnding("<html class=\" hi\">\n<head class=\" hi\">\n</head>\n<body class=\" hi\"> hi!\n</body>\n</html>\n<head class=\" hi\">\n</head>\n<body class=\" hi\"> hi!\n</body>\n\nhi!", "<html>\n<head>\n</head>\n<body>\n</body>\n</html><<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>>\n</<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>>");
        org.jsoup.select.Elements elements44 = document36.getElementsByAttributeValueContaining(" #document", "<html>\n<head>\n</head>\n<body> #text\n</body>\n</html>\n<html> \n<head> \n</head> \n<body>\n  head  \n</body>\n</html>");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean45 = elements15.addAll((int) '<', (java.util.Collection<org.jsoup.nodes.Element>) elements44);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 60, Size: 8");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(elementStream8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(elementItor11);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(document18);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNotNull(elements21);
        org.junit.Assert.assertNotNull(elementStream22);
        org.junit.Assert.assertNotNull(elements24);
        org.junit.Assert.assertNotNull(elements28);
        org.junit.Assert.assertNotNull(elements30);
        org.junit.Assert.assertNotNull(elements32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(document36);
        org.junit.Assert.assertNotNull(element38);
        org.junit.Assert.assertNotNull(elements41);
        org.junit.Assert.assertNotNull(elements44);
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1511");
        org.jsoup.nodes.Evaluator.Attribute attribute1 = new org.jsoup.nodes.Evaluator.Attribute("#data");
        org.jsoup.nodes.Document document4 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node5 = document4.parentNode;
        org.jsoup.select.Elements elements6 = document4.getAllElements();
        org.jsoup.nodes.Element element8 = document4.createElement("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.select.Elements elements9 = element8.getAllElements();
        java.lang.String str10 = element8.html();
        boolean boolean11 = element8.preserveWhitespace();
        org.jsoup.nodes.Document document14 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str15 = document14.outerHtml();
        org.jsoup.select.Elements elements16 = document14.getAllElements();
        java.lang.String str17 = document14.data();
        org.jsoup.nodes.Element element19 = document14.text("");
        org.jsoup.nodes.Node node20 = document14.parentNode;
        org.jsoup.select.Elements elements22 = document14.getElementsByIndexGreaterThan((int) '4');
        org.jsoup.nodes.Element element24 = document14.text("hi=\"\"");
        boolean boolean25 = document14.hasText();
        boolean boolean26 = element8.equals((java.lang.Object) boolean25);
        boolean boolean27 = attribute1.matches(element8);
        org.junit.Assert.assertNotNull(document4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(document14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str15, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertNotNull(elements22);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1512");
        org.jsoup.nodes.Evaluator.AttributeWithValueContaining attributeWithValueContaining2 = new org.jsoup.nodes.Evaluator.AttributeWithValueContaining("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html><#root>\n<html>\n <head>\n </head>\n <body>\n  &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;\n </body>\n</html>\n</#root>", "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>\n<head>\n</head>\n<body> hi!\n</body>\n\nhi!");
        org.jsoup.nodes.Evaluator.AttributeWithValueStarting attributeWithValueStarting5 = new org.jsoup.nodes.Evaluator.AttributeWithValueStarting("hi", "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        attributeWithValueStarting5.value = "hi!";
        attributeWithValueStarting5.key = "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>";
        org.jsoup.nodes.Document document12 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str13 = document12.outerHtml();
        document12.setBaseUri("hi");
        boolean boolean16 = attributeWithValueStarting5.matches((org.jsoup.nodes.Element) document12);
        org.jsoup.nodes.Document document19 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str20 = document19.outerHtml();
        org.jsoup.nodes.Document document23 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node24 = document23.parentNode;
        java.lang.String str25 = document23.title();
        org.jsoup.nodes.Element element27 = document23.text("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element28 = document19.appendChild((org.jsoup.nodes.Node) document23);
        org.jsoup.nodes.Document document31 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node32 = document31.parentNode;
        java.lang.String str33 = document31.title();
        org.jsoup.nodes.Attributes attributes34 = document31.attributes();
        org.jsoup.nodes.Document document37 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node38 = document37.parentNode;
        org.jsoup.select.Elements elements40 = document37.getElementsByIndexLessThan((int) 'a');
        org.jsoup.nodes.Element element41 = document31.prependChild((org.jsoup.nodes.Node) document37);
        org.jsoup.select.Elements elements43 = document31.select("hi");
        org.jsoup.nodes.Element element44 = document23.appendChild((org.jsoup.nodes.Node) document31);
        org.jsoup.nodes.Element element45 = document31.body();
        boolean boolean46 = attributeWithValueStarting5.matches((org.jsoup.nodes.Element) document31);
        boolean boolean47 = attributeWithValueContaining2.matches((org.jsoup.nodes.Element) document31);
        org.jsoup.nodes.Document document50 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node51 = document50.parentNode;
        org.jsoup.select.Elements elements52 = document50.getAllElements();
        org.jsoup.nodes.Element element54 = document50.createElement("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.select.Elements elements55 = element54.getAllElements();
        java.lang.String str56 = element54.html();
        boolean boolean57 = element54.preserveWhitespace();
        org.jsoup.nodes.Document document60 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str61 = document60.outerHtml();
        org.jsoup.select.Elements elements62 = document60.getAllElements();
        java.lang.String str63 = document60.data();
        org.jsoup.nodes.Element element65 = document60.text("");
        org.jsoup.nodes.Node node66 = document60.parentNode;
        org.jsoup.select.Elements elements68 = document60.getElementsByIndexGreaterThan((int) '4');
        org.jsoup.nodes.Element element70 = document60.text("hi=\"\"");
        boolean boolean71 = document60.hasText();
        boolean boolean72 = element54.equals((java.lang.Object) boolean71);
        org.jsoup.nodes.Document document75 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str76 = document75.outerHtml();
        org.jsoup.select.Elements elements77 = document75.getAllElements();
        java.lang.String str78 = document75.data();
        org.jsoup.nodes.Element element80 = document75.text("");
        boolean boolean82 = document75.hasClass("hi!");
        boolean boolean83 = element54.equals((java.lang.Object) document75);
        java.lang.String str85 = document75.absUrl("i");
        boolean boolean86 = document75.hasText();
        org.jsoup.select.Elements elements87 = org.jsoup.select.Collector.collect((org.jsoup.nodes.Evaluator) attributeWithValueContaining2, (org.jsoup.nodes.Element) document75);
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str13, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(document19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str20, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document23);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertNotNull(document31);
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(attributes34);
        org.junit.Assert.assertNotNull(document37);
        org.junit.Assert.assertNull(node38);
        org.junit.Assert.assertNotNull(elements40);
        org.junit.Assert.assertNotNull(element41);
        org.junit.Assert.assertNotNull(elements43);
        org.junit.Assert.assertNotNull(element44);
        org.junit.Assert.assertNotNull(element45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(document50);
        org.junit.Assert.assertNull(node51);
        org.junit.Assert.assertNotNull(elements52);
        org.junit.Assert.assertNotNull(element54);
        org.junit.Assert.assertNotNull(elements55);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(document60);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str61, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(elements62);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertNotNull(element65);
        org.junit.Assert.assertNull(node66);
        org.junit.Assert.assertNotNull(elements68);
        org.junit.Assert.assertNotNull(element70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(document75);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str76, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(elements77);
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "" + "'", str78, "");
        org.junit.Assert.assertNotNull(element80);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "" + "'", str85, "");
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertNotNull(elements87);
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1513");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean2 = tag1.preserveWhitespace();
        java.lang.String str3 = tag1.toString();
        org.jsoup.nodes.Document document6 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node7 = document6.parentNode;
        java.lang.String str8 = document6.title();
        org.jsoup.nodes.Attributes attributes9 = document6.attributes();
        org.jsoup.nodes.Node node12 = document6.attr("hi!", "hi!");
        org.jsoup.select.Elements elements13 = document6.getAllElements();
        elements13.clear();
        org.jsoup.select.Elements elements16 = elements13.val("<html>\n<head>\n</head>\n<body>\n head\n</body>\n</html>");
        boolean boolean17 = tag1.equals((java.lang.Object) "<html>\n<head>\n</head>\n<body>\n head\n</body>\n</html>");
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1514");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node3 = document2.parentNode;
        java.lang.String str4 = document2.title();
        org.jsoup.nodes.Attributes attributes5 = document2.attributes();
        org.jsoup.nodes.Document document8 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node9 = document8.parentNode;
        org.jsoup.select.Elements elements11 = document8.getElementsByIndexLessThan((int) 'a');
        org.jsoup.nodes.Element element12 = document2.prependChild((org.jsoup.nodes.Node) document8);
        java.util.List<org.jsoup.nodes.Node> nodeList13 = document2.childNodes;
        org.jsoup.select.Elements elements15 = document2.getElementsByTag("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.nodes.Document document18 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str19 = document18.outerHtml();
        org.jsoup.nodes.Document document22 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node23 = document22.parentNode;
        java.lang.String str24 = document22.title();
        org.jsoup.nodes.Element element26 = document22.text("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element27 = document18.appendChild((org.jsoup.nodes.Node) document22);
        org.jsoup.nodes.Attributes attributes28 = document22.attributes();
        java.lang.String str29 = document22.title();
        int int30 = elements15.lastIndexOf((java.lang.Object) document22);
        org.jsoup.nodes.Element element32 = document22.val("\n<!---->");
        org.jsoup.select.Elements elements34 = element32.getElementsByIndexGreaterThan((int) (byte) 1);
        java.util.stream.Stream<org.jsoup.nodes.Element> elementStream35 = elements34.stream();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(document18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str19, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document22);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertNotNull(attributes28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(element32);
        org.junit.Assert.assertNotNull(elements34);
        org.junit.Assert.assertNotNull(elementStream35);
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1515");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node3 = document2.parentNode;
        org.jsoup.select.Elements elements5 = document2.getElementsByIndexLessThan((int) 'a');
        org.jsoup.select.Elements elements7 = elements5.val("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        java.util.stream.Stream<org.jsoup.nodes.Element> elementStream8 = elements5.stream();
        org.jsoup.select.Elements elements10 = elements5.prepend("hi");
        org.jsoup.select.Elements elements12 = elements10.toggleClass("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>\n<head>\n</head>\n<body> hi!\n</body>\n\nhi!");
        org.jsoup.select.Elements elements15 = elements10.attr("body", "<html>\n<head>\n</head>\n<body>\n</body>\n</html><<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>>\n</<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>><hi!>\n</hi!>");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(elementStream8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(elements15);
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1516");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node3 = document2.parentNode;
        org.jsoup.select.Elements elements5 = document2.getElementsByIndexLessThan((int) 'a');
        java.lang.String str6 = document2.text();
        org.jsoup.select.Elements elements9 = document2.getElementsByAttributeValueNot("hi=\"\"", "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.nodes.Document document12 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.select.Elements elements13 = document12.getAllElements();
        org.jsoup.select.Elements elements15 = document12.getElementsByIndexLessThan((int) (short) 10);
        boolean boolean16 = elements9.equals((java.lang.Object) elements15);
        java.util.stream.Stream<org.jsoup.nodes.Element> elementStream17 = elements15.stream();
        org.jsoup.nodes.Document document20 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node21 = document20.parentNode;
        java.lang.String str22 = document20.title();
        org.jsoup.nodes.Attributes attributes23 = document20.attributes();
        org.jsoup.nodes.Document document26 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node27 = document26.parentNode;
        org.jsoup.select.Elements elements29 = document26.getElementsByIndexLessThan((int) 'a');
        org.jsoup.nodes.Element element30 = document20.prependChild((org.jsoup.nodes.Node) document26);
        org.jsoup.select.Elements elements32 = document20.select("hi");
        org.jsoup.select.Elements elements33 = document20.children();
        org.jsoup.nodes.Element element34 = null;
        org.jsoup.nodes.Element[] elementArray35 = new org.jsoup.nodes.Element[] { element34 };
        org.jsoup.select.Elements elements36 = new org.jsoup.select.Elements(elementArray35);
        boolean boolean37 = elements33.remove((java.lang.Object) elements36);
        int int38 = elements15.lastIndexOf((java.lang.Object) elements36);
        org.jsoup.nodes.Document document40 = org.jsoup.nodes.Document.createShell(" hi=\"\"");
        boolean boolean41 = elements15.contains((java.lang.Object) " hi=\"\"");
        elements15.clear();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(elementStream17);
        org.junit.Assert.assertNotNull(document20);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(attributes23);
        org.junit.Assert.assertNotNull(document26);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertNotNull(elements29);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertNotNull(elements32);
        org.junit.Assert.assertNotNull(elements33);
        org.junit.Assert.assertNotNull(elementArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertNotNull(document40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1517");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean2 = tag1.preserveWhitespace();
        org.jsoup.nodes.Document document6 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str7 = document6.outerHtml();
        org.jsoup.nodes.Document document10 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node11 = document10.parentNode;
        java.lang.String str12 = document10.title();
        org.jsoup.nodes.Element element14 = document10.text("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element15 = document6.appendChild((org.jsoup.nodes.Node) document10);
        org.jsoup.nodes.Attributes attributes16 = document10.attributes();
        boolean boolean18 = attributes16.hasKey("hi!");
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor19 = attributes16.iterator();
        org.jsoup.nodes.Document document22 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node23 = document22.parentNode;
        java.lang.String str24 = document22.title();
        org.jsoup.nodes.Attributes attributes25 = document22.attributes();
        java.lang.String str26 = attributes25.html();
        attributes16.addAll(attributes25);
        java.lang.String str28 = attributes16.toString();
        org.jsoup.nodes.Element element29 = new org.jsoup.nodes.Element(tag1, "4", attributes16);
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str7, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(attributes16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(attributeItor19);
        org.junit.Assert.assertNotNull(document22);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(attributes25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1518");
        org.jsoup.nodes.Evaluator.AttributeWithValueEnding attributeWithValueEnding2 = new org.jsoup.nodes.Evaluator.AttributeWithValueEnding("\n<!---->", "hi!");
        org.jsoup.nodes.Document document5 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str6 = document5.outerHtml();
        document5.setBaseUri("hi");
        boolean boolean9 = attributeWithValueEnding2.matches((org.jsoup.nodes.Element) document5);
        org.jsoup.nodes.Element element11 = document5.prependText("<#root>\n<html>\n <head>\n </head>\n <body> hi!\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.select.Elements elements12 = document5.children();
        boolean boolean13 = document5.hasText();
        org.junit.Assert.assertNotNull(document5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str6, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1519");
        org.jsoup.nodes.Evaluator.Tag tag1 = new org.jsoup.nodes.Evaluator.Tag(" !");
        org.jsoup.parser.Tag tag3 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.nodes.Element element5 = new org.jsoup.nodes.Element(tag3, "!");
        boolean boolean6 = tag3.isData();
        org.jsoup.nodes.Evaluator.Tag tag8 = new org.jsoup.nodes.Evaluator.Tag("hi!");
        org.jsoup.nodes.Document document11 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str12 = document11.outerHtml();
        org.jsoup.nodes.Document document15 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node16 = document15.parentNode;
        java.lang.String str17 = document15.title();
        org.jsoup.nodes.Element element19 = document15.text("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element20 = document11.appendChild((org.jsoup.nodes.Node) document15);
        boolean boolean21 = tag8.matches((org.jsoup.nodes.Element) document11);
        boolean boolean22 = tag3.equals((java.lang.Object) tag8);
        org.jsoup.nodes.Element element24 = new org.jsoup.nodes.Element(tag3, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>\n<head>\n</head>\n<body> hi!\n</body>\n\nhi!");
        org.jsoup.nodes.Element element25 = element24.empty();
        boolean boolean26 = tag1.matches(element25);
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str12, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document15);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1520");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node3 = document2.parentNode;
        org.jsoup.select.Elements elements5 = document2.getElementsByIndexLessThan((int) 'a');
        java.util.stream.Stream<org.jsoup.nodes.Element> elementStream6 = elements5.stream();
        org.jsoup.select.Elements elements8 = elements5.addClass("hi");
        java.lang.String str9 = elements8.html();
        java.lang.String str10 = elements8.val();
        org.jsoup.select.Elements elements12 = elements8.val("hi");
        org.jsoup.nodes.Document document15 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str16 = document15.outerHtml();
        org.jsoup.nodes.Document document19 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node20 = document19.parentNode;
        java.lang.String str21 = document19.title();
        org.jsoup.nodes.Element element23 = document19.text("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element24 = document15.appendChild((org.jsoup.nodes.Node) document19);
        org.jsoup.nodes.Document document27 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node28 = document27.parentNode;
        java.lang.String str29 = document27.title();
        org.jsoup.nodes.Attributes attributes30 = document27.attributes();
        org.jsoup.nodes.Document document33 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node34 = document33.parentNode;
        org.jsoup.select.Elements elements36 = document33.getElementsByIndexLessThan((int) 'a');
        org.jsoup.nodes.Element element37 = document27.prependChild((org.jsoup.nodes.Node) document33);
        org.jsoup.select.Elements elements39 = document27.select("hi");
        org.jsoup.nodes.Element element40 = document19.appendChild((org.jsoup.nodes.Node) document27);
        org.jsoup.nodes.Element element42 = document27.addClass("#declaration");
        boolean boolean43 = elements8.add(element42);
        boolean boolean45 = element42.hasClass("#document");
        org.jsoup.nodes.Element element46 = element42.previousElementSibling();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elementStream6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<html class=\" hi\">\n<head class=\" hi\">\n</head>\n<body class=\" hi\"> hi!\n</body>\n</html>\n<head class=\" hi\">\n</head>\n<body class=\" hi\"> hi!\n</body>\n\nhi!" + "'", str9, "<html class=\" hi\">\n<head class=\" hi\">\n</head>\n<body class=\" hi\"> hi!\n</body>\n</html>\n<head class=\" hi\">\n</head>\n<body class=\" hi\"> hi!\n</body>\n\nhi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(document15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str16, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document19);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(document27);
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(attributes30);
        org.junit.Assert.assertNotNull(document33);
        org.junit.Assert.assertNull(node34);
        org.junit.Assert.assertNotNull(elements36);
        org.junit.Assert.assertNotNull(element37);
        org.junit.Assert.assertNotNull(elements39);
        org.junit.Assert.assertNotNull(element40);
        org.junit.Assert.assertNotNull(element42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(element46);
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1521");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node3 = document2.parentNode;
        org.jsoup.select.Elements elements4 = document2.getAllElements();
        org.jsoup.nodes.Element element6 = document2.createElement("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.select.Elements elements7 = element6.getAllElements();
        org.jsoup.nodes.Element element9 = element6.addClass("<html> \n<head> \n</head> \n<body> org.jsoup.select.Selector$SelectorParseException:  hi!  &lt;#root&gt; \n <html> \n  <head> \n  </head> \n  <body>\n    &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;   \n  </body>\n </html>\n</body>\n</html>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements11 = element9.select("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(element9);
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1522");
        org.jsoup.nodes.Evaluator.AttributeWithValue attributeWithValue2 = new org.jsoup.nodes.Evaluator.AttributeWithValue("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html><#root>\n<html>\n <head>\n </head>\n <body>\n  &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;\n </body>\n</html>\n</#root>", "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>\n<head>\n</head>\n<body> hi!\n</body>\n\nhi!");
        org.jsoup.nodes.Document document5 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str6 = document5.outerHtml();
        org.jsoup.nodes.Document document9 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node10 = document9.parentNode;
        java.lang.String str11 = document9.title();
        org.jsoup.nodes.Element element13 = document9.text("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element14 = document5.appendChild((org.jsoup.nodes.Node) document9);
        org.jsoup.nodes.Element element15 = document9.head();
        org.jsoup.nodes.Evaluator.Tag tag17 = new org.jsoup.nodes.Evaluator.Tag("#document");
        org.jsoup.nodes.Document document20 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str21 = document20.outerHtml();
        org.jsoup.nodes.Document document24 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node25 = document24.parentNode;
        java.lang.String str26 = document24.title();
        org.jsoup.nodes.Element element28 = document24.text("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element29 = document20.appendChild((org.jsoup.nodes.Node) document24);
        org.jsoup.nodes.Element element30 = document24.head();
        java.lang.String str31 = element30.id();
        boolean boolean32 = tag17.matches(element30);
        java.lang.String str33 = element30.baseUri();
        element15.parentNode = element30;
        boolean boolean35 = attributeWithValue2.matches(element30);
        java.lang.String str36 = attributeWithValue2.value;
        java.lang.String str37 = attributeWithValue2.value;
        org.jsoup.nodes.Document document40 = org.jsoup.parser.Parser.parseBodyFragment("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>\n<head>\n</head>\n<body> hi!\n</body>\n\nhi!", " hi=\"\"");
        boolean boolean41 = attributeWithValue2.matches((org.jsoup.nodes.Element) document40);
        org.jsoup.nodes.Document document44 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str45 = document44.outerHtml();
        org.jsoup.nodes.Document document48 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node49 = document48.parentNode;
        java.lang.String str50 = document48.title();
        org.jsoup.nodes.Element element52 = document48.text("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element53 = document44.appendChild((org.jsoup.nodes.Node) document48);
        org.jsoup.nodes.Attributes attributes54 = document48.attributes();
        org.jsoup.select.Elements elements56 = document48.getElementsByTag("hi!");
        org.jsoup.nodes.Element element58 = document48.createElement("[!]");
        org.jsoup.nodes.Element element59 = element58.parent();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean60 = attributeWithValue2.matches(element59);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str6, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(document20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str21, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document24);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>\n<head>\n</head>\n<body> hi!\n</body>\n\nhi!" + "'", str36, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>\n<head>\n</head>\n<body> hi!\n</body>\n\nhi!");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>\n<head>\n</head>\n<body> hi!\n</body>\n\nhi!" + "'", str37, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>\n<head>\n</head>\n<body> hi!\n</body>\n\nhi!");
        org.junit.Assert.assertNotNull(document40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(document44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str45, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document48);
        org.junit.Assert.assertNull(node49);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertNotNull(element52);
        org.junit.Assert.assertNotNull(element53);
        org.junit.Assert.assertNotNull(attributes54);
        org.junit.Assert.assertNotNull(elements56);
        org.junit.Assert.assertNotNull(element58);
        org.junit.Assert.assertNull(element59);
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1523");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element4 = document1.attr("", "<html> <head> </head> <body> hi! </body> </html> hi! hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1524");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node3 = document2.parentNode;
        org.jsoup.select.Elements elements5 = document2.getElementsByIndexLessThan((int) 'a');
        java.util.stream.Stream<org.jsoup.nodes.Element> elementStream6 = elements5.stream();
        org.jsoup.select.Elements elements8 = elements5.toggleClass("[ , !]");
        java.lang.String str10 = elements8.attr("#comment");
        org.jsoup.parser.TokenQueue tokenQueue12 = new org.jsoup.parser.TokenQueue("[4]");
        tokenQueue12.addFirst(" head=\"[ , #, d, o, c, u, m, e, n, t]\"");
        boolean boolean15 = elements8.contains((java.lang.Object) tokenQueue12);
        boolean boolean16 = tokenQueue12.isEmpty();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elementStream6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1525");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        java.lang.String str2 = document1.className();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1526");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node3 = document2.parentNode;
        java.lang.String str4 = document2.title();
        org.jsoup.nodes.Attributes attributes5 = document2.attributes();
        org.jsoup.nodes.Document document8 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node9 = document8.parentNode;
        org.jsoup.select.Elements elements11 = document8.getElementsByIndexLessThan((int) 'a');
        org.jsoup.nodes.Element element12 = document2.prependChild((org.jsoup.nodes.Node) document8);
        org.jsoup.select.Elements elements14 = document8.getElementsByClass("!");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration18 = new org.jsoup.nodes.XmlDeclaration("hi!", "!", false);
        org.jsoup.nodes.Document document21 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node22 = document21.parentNode;
        boolean boolean23 = document21.isBlock();
        xmlDeclaration18.addChild((org.jsoup.nodes.Node) document21);
        org.jsoup.nodes.Element element25 = document8.appendChild((org.jsoup.nodes.Node) xmlDeclaration18);
        org.jsoup.nodes.Element element27 = element25.toggleClass("&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;  &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;");
        org.jsoup.nodes.Document document30 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str31 = document30.outerHtml();
        org.jsoup.select.Elements elements32 = document30.getAllElements();
        java.lang.String str33 = document30.data();
        org.jsoup.nodes.Element element35 = document30.text("");
        org.jsoup.nodes.Node node36 = document30.parentNode;
        org.jsoup.select.Elements elements38 = document30.getElementsByIndexGreaterThan((int) '4');
        java.lang.String str39 = document30.baseUri();
        org.jsoup.nodes.Element element41 = document30.appendText("<#root>\n<html>\n <head>\n </head>\n <body> hi!\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.nodes.Document document42 = document30.normalise();
        element25.parentNode = document30;
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(document21);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertNotNull(document30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str31, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(elements32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertNull(node36);
        org.junit.Assert.assertNotNull(elements38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
        org.junit.Assert.assertNotNull(element41);
        org.junit.Assert.assertNotNull(document42);
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1527");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str3 = document2.outerHtml();
        org.jsoup.nodes.Document document6 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node7 = document6.parentNode;
        java.lang.String str8 = document6.title();
        org.jsoup.nodes.Element element10 = document6.text("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element11 = document2.appendChild((org.jsoup.nodes.Node) document6);
        org.jsoup.nodes.Attributes attributes12 = document6.attributes();
        boolean boolean14 = attributes12.hasKey("hi!");
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor15 = attributes12.iterator();
        org.jsoup.nodes.Document document18 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node19 = document18.parentNode;
        java.lang.String str20 = document18.title();
        org.jsoup.nodes.Attributes attributes21 = document18.attributes();
        java.lang.String str22 = attributes21.html();
        attributes12.addAll(attributes21);
        org.jsoup.parser.Tag tag25 = org.jsoup.parser.Tag.valueOf("#document");
        boolean boolean26 = attributes12.equals((java.lang.Object) tag25);
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator27 = attributes12.spliterator();
        attributes12.remove("<html> \n<head> \n</head> \n<body> org.jsoup.select.Selector$SelectorParseException:  hi!  &lt;#root&gt; \n <html> \n  <head> \n  </head> \n  <body>\n    &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;   \n  </body>\n </html>\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str3, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(attributes12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(attributeItor15);
        org.junit.Assert.assertNotNull(document18);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(attributes21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(tag25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(attributeSpliterator27);
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1528");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node3 = document2.parentNode;
        org.jsoup.select.Elements elements5 = document2.getElementsByIndexLessThan((int) 'a');
        org.jsoup.select.Elements elements7 = elements5.val("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        java.util.stream.Stream<org.jsoup.nodes.Element> elementStream8 = elements5.stream();
        org.jsoup.select.Elements elements10 = elements5.prepend("hi");
        org.jsoup.nodes.Document document13 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node14 = document13.parentNode;
        java.lang.String str15 = document13.title();
        org.jsoup.nodes.Attributes attributes16 = document13.attributes();
        org.jsoup.nodes.Document document19 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node20 = document19.parentNode;
        org.jsoup.select.Elements elements22 = document19.getElementsByIndexLessThan((int) 'a');
        org.jsoup.nodes.Element element23 = document13.prependChild((org.jsoup.nodes.Node) document19);
        java.lang.String str24 = document19.baseUri();
        java.lang.String str25 = document19.className();
        org.jsoup.nodes.Document document28 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str29 = document28.outerHtml();
        org.jsoup.nodes.Document document32 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node33 = document32.parentNode;
        java.lang.String str34 = document32.title();
        org.jsoup.nodes.Element element36 = document32.text("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element37 = document28.appendChild((org.jsoup.nodes.Node) document32);
        org.jsoup.nodes.Element element39 = document28.removeClass("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html><#root>\n<html>\n <head>\n </head>\n <body>\n  &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;\n </body>\n</html>\n</#root>");
        java.lang.String str40 = document28.text();
        org.jsoup.nodes.Element element42 = document28.addClass("#document");
        org.jsoup.nodes.Element element44 = document28.createElement("hi!");
        org.jsoup.select.Elements elements47 = document28.getElementsByAttributeValueContaining("#comment", "#comment");
        java.lang.Integer int48 = org.jsoup.nodes.Node.indexInList((org.jsoup.nodes.Element) document19, (java.util.List<org.jsoup.nodes.Element>) elements47);
        java.lang.String str49 = elements47.html();
        boolean boolean50 = elements5.addAll((java.util.Collection<org.jsoup.nodes.Element>) elements47);
        java.lang.Object[] objArray51 = elements5.toArray();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(elementStream8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(attributes16);
        org.junit.Assert.assertNotNull(document19);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertNotNull(elements22);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(document28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str29, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document32);
        org.junit.Assert.assertNull(node33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(element36);
        org.junit.Assert.assertNotNull(element37);
        org.junit.Assert.assertNotNull(element39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi! <html> <head> </head> <body> hi! </body> </html>" + "'", str40, "hi! <html> <head> </head> <body> hi! </body> </html>");
        org.junit.Assert.assertNotNull(element42);
        org.junit.Assert.assertNotNull(element44);
        org.junit.Assert.assertNotNull(elements47);
        org.junit.Assert.assertNull(int48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray51), "[hi\n<html value=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt; hi!\n&lt;/body&gt;\n&lt;/html&gt;\">\nhi\n<head value=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt; hi!\n&lt;/body&gt;\n&lt;/html&gt;\">\n hi\n</head>\n<body value=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt; hi!\n&lt;/body&gt;\n&lt;/html&gt;\">\n hi hi!\n</body>\n</html>, \n<html value=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt; hi!\n&lt;/body&gt;\n&lt;/html&gt;\">\nhi\n<head value=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt; hi!\n&lt;/body&gt;\n&lt;/html&gt;\">\n hi\n</head>\n<body value=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt; hi!\n&lt;/body&gt;\n&lt;/html&gt;\">\n hi hi!\n</body>\n</html>, \n<head value=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt; hi!\n&lt;/body&gt;\n&lt;/html&gt;\">\n hi\n</head>, \n<body value=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt; hi!\n&lt;/body&gt;\n&lt;/html&gt;\">\n hi hi!\n</body>]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray51), "[hi\n<html value=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt; hi!\n&lt;/body&gt;\n&lt;/html&gt;\">\nhi\n<head value=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt; hi!\n&lt;/body&gt;\n&lt;/html&gt;\">\n hi\n</head>\n<body value=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt; hi!\n&lt;/body&gt;\n&lt;/html&gt;\">\n hi hi!\n</body>\n</html>, \n<html value=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt; hi!\n&lt;/body&gt;\n&lt;/html&gt;\">\nhi\n<head value=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt; hi!\n&lt;/body&gt;\n&lt;/html&gt;\">\n hi\n</head>\n<body value=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt; hi!\n&lt;/body&gt;\n&lt;/html&gt;\">\n hi hi!\n</body>\n</html>, \n<head value=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt; hi!\n&lt;/body&gt;\n&lt;/html&gt;\">\n hi\n</head>, \n<body value=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt; hi!\n&lt;/body&gt;\n&lt;/html&gt;\">\n hi hi!\n</body>]");
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1529");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str3 = document2.outerHtml();
        org.jsoup.nodes.Document document6 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node7 = document6.parentNode;
        java.lang.String str8 = document6.title();
        org.jsoup.nodes.Element element10 = document6.text("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element11 = document2.appendChild((org.jsoup.nodes.Node) document6);
        org.jsoup.nodes.Element element13 = document2.removeClass("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html><#root>\n<html>\n <head>\n </head>\n <body>\n  &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;\n </body>\n</html>\n</#root>");
        java.lang.String str14 = document2.text();
        org.jsoup.nodes.Element element16 = document2.addClass("#document");
        java.lang.String str17 = element16.baseUri;
        org.jsoup.nodes.Element element20 = element16.attr("<html class=\" hi\" head=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt; hi!\n&lt;/body&gt;\n&lt;/html&gt;\" value=\"#text\">\n<head class=\" hi\" head=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt; hi!\n&lt;/body&gt;\n&lt;/html&gt;\" value=\"#text\">\n</head>\n<body class=\" hi\" head=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt; hi!\n&lt;/body&gt;\n&lt;/html&gt;\" value=\"#text\"> hi!\n</body>\n</html>\n\n<html class=\" hi\" head=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt; hi!\n&lt;/body&gt;\n&lt;/html&gt;\" value=\"#text\">\n<head class=\" hi\" head=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt; hi!\n&lt;/body&gt;\n&lt;/html&gt;\" value=\"#text\">\n</head>\n<body class=\" hi\" head=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt; hi!\n&lt;/body&gt;\n&lt;/html&gt;\" value=\"#text\"> hi!\n</body>\n</html>\n\n<head class=\" hi\" head=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt; hi!\n&lt;/body&gt;\n&lt;/html&gt;\" value=\"#text\">\n</head>\n\n<body class=\" hi\" head=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt; hi!\n&lt;/body&gt;\n&lt;/html&gt;\" value=\"#text\"> hi!\n</body>", "hi! <html> <head> </head> <body> hi! </body> </html>");
        java.lang.String str22 = element20.absUrl("<html>\n <head>\n </head>\n <body>\n </body>\n</html>");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str3, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi! <html> <head> </head> <body> hi! </body> </html>" + "'", str14, "hi! <html> <head> </head> <body> hi! </body> </html>");
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1530");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node3 = document2.parentNode;
        java.lang.String str4 = document2.title();
        org.jsoup.nodes.Attributes attributes5 = document2.attributes();
        org.jsoup.nodes.Document document8 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node9 = document8.parentNode;
        org.jsoup.select.Elements elements11 = document8.getElementsByIndexLessThan((int) 'a');
        org.jsoup.nodes.Element element12 = document2.prependChild((org.jsoup.nodes.Node) document8);
        java.util.List<org.jsoup.nodes.Node> nodeList13 = document2.childNodes;
        org.jsoup.select.Elements elements15 = document2.getElementsByTag("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.select.Elements elements17 = elements15.removeAttr("hi");
        org.jsoup.nodes.Document document20 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node21 = document20.parentNode;
        java.lang.String str22 = document20.title();
        org.jsoup.nodes.Attributes attributes23 = document20.attributes();
        org.jsoup.nodes.Document document26 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node27 = document26.parentNode;
        org.jsoup.select.Elements elements29 = document26.getElementsByIndexLessThan((int) 'a');
        org.jsoup.nodes.Element element30 = document20.prependChild((org.jsoup.nodes.Node) document26);
        java.util.List<org.jsoup.nodes.Node> nodeList31 = document20.childNodes;
        org.jsoup.select.Elements elements33 = document20.getElementsByTag("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element35 = document20.addClass("<html>\n<head>\n</head>\n<body>\n hi\n</body>\n</html>");
        boolean boolean36 = element35.preserveWhitespace();
        org.jsoup.select.Elements elements38 = element35.getElementsByIndexLessThan(0);
        boolean boolean39 = elements17.retainAll((java.util.Collection<org.jsoup.nodes.Element>) elements38);
        org.jsoup.nodes.Element element40 = null;
        org.jsoup.nodes.Element[] elementArray41 = new org.jsoup.nodes.Element[] { element40 };
        org.jsoup.select.Elements elements42 = new org.jsoup.select.Elements(elementArray41);
        org.jsoup.select.Elements elements43 = new org.jsoup.select.Elements(elementArray41);
        boolean boolean44 = elements17.retainAll((java.util.Collection<org.jsoup.nodes.Element>) elements43);
        org.jsoup.nodes.Element element45 = elements43.last();
        org.jsoup.nodes.Element element46 = elements43.last();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertNotNull(document20);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(attributes23);
        org.junit.Assert.assertNotNull(document26);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertNotNull(elements29);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertNotNull(nodeList31);
        org.junit.Assert.assertNotNull(elements33);
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(elements38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(elementArray41);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNull(element45);
        org.junit.Assert.assertNull(element46);
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1531");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str3 = document2.outerHtml();
        org.jsoup.nodes.Document document6 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node7 = document6.parentNode;
        java.lang.String str8 = document6.title();
        org.jsoup.nodes.Element element10 = document6.text("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element11 = document2.appendChild((org.jsoup.nodes.Node) document6);
        org.jsoup.nodes.Attributes attributes12 = document6.attributes();
        boolean boolean14 = attributes12.hasKey("hi!");
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor15 = attributes12.iterator();
        org.jsoup.nodes.Document document18 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node19 = document18.parentNode;
        java.lang.String str20 = document18.title();
        org.jsoup.nodes.Attributes attributes21 = document18.attributes();
        java.lang.String str22 = attributes21.html();
        attributes12.addAll(attributes21);
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor24 = attributes12.iterator();
        org.jsoup.nodes.Document document27 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str28 = document27.outerHtml();
        org.jsoup.nodes.Document document31 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node32 = document31.parentNode;
        java.lang.String str33 = document31.title();
        org.jsoup.nodes.Element element35 = document31.text("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element36 = document27.appendChild((org.jsoup.nodes.Node) document31);
        org.jsoup.nodes.Attributes attributes37 = document31.attributes();
        boolean boolean39 = attributes37.hasKey("hi!");
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor40 = attributes37.iterator();
        org.jsoup.nodes.Document document43 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node44 = document43.parentNode;
        java.lang.String str45 = document43.title();
        org.jsoup.nodes.Attributes attributes46 = document43.attributes();
        java.lang.String str47 = attributes46.html();
        attributes37.addAll(attributes46);
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor49 = attributes46.iterator();
        attributes12.addAll(attributes46);
        org.jsoup.nodes.Attribute attribute53 = org.jsoup.nodes.Attribute.createFromEncoded("hi", "");
        org.jsoup.nodes.Document document56 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node57 = document56.parentNode;
        java.lang.String str58 = document56.title();
        boolean boolean59 = attribute53.equals((java.lang.Object) str58);
        attributes12.put(attribute53);
        attributes12.put("<html>\n<head>\n</head>\n<body>\n &lt;#root&gt; \n <html> \n  <head> \n  </head> \n  <body>\n    hi!    \n   <html> \n    <head> \n    </head> \n    <body>\n      hi!  \n    </body>\n   </html>\n  </body>\n </html>\n</body>\n</html>", "<html>\n <head>\n </head>\n <body>\n </body>\n</html>");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str3, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(attributes12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(attributeItor15);
        org.junit.Assert.assertNotNull(document18);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(attributes21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(attributeItor24);
        org.junit.Assert.assertNotNull(document27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str28, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document31);
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertNotNull(element36);
        org.junit.Assert.assertNotNull(attributes37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(attributeItor40);
        org.junit.Assert.assertNotNull(document43);
        org.junit.Assert.assertNull(node44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertNotNull(attributes46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertNotNull(attributeItor49);
        org.junit.Assert.assertNotNull(attribute53);
        org.junit.Assert.assertNotNull(document56);
        org.junit.Assert.assertNull(node57);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1532");
        org.jsoup.nodes.Evaluator.Tag tag1 = new org.jsoup.nodes.Evaluator.Tag("#document");
        org.jsoup.nodes.Evaluator.IndexLessThan indexLessThan3 = new org.jsoup.nodes.Evaluator.IndexLessThan((int) (byte) -1);
        org.jsoup.nodes.Document document6 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node7 = document6.parentNode;
        org.jsoup.select.Elements elements9 = document6.getElementsByIndexLessThan((int) 'a');
        boolean boolean10 = indexLessThan3.matches((org.jsoup.nodes.Element) document6);
        org.jsoup.nodes.Document document13 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node14 = document13.parentNode;
        org.jsoup.select.Elements elements15 = document13.getAllElements();
        org.jsoup.select.Elements elements16 = org.jsoup.select.Collector.collect((org.jsoup.nodes.Evaluator) indexLessThan3, (org.jsoup.nodes.Element) document13);
        boolean boolean17 = tag1.matches((org.jsoup.nodes.Element) document13);
        document13.baseUri = "hi=\"\"";
        org.jsoup.nodes.Element element21 = document13.appendText("");
        org.jsoup.nodes.Element element23 = element21.prependText(" !");
        java.lang.String str24 = element21.data();
        org.jsoup.select.Elements elements26 = element21.getElementsByAttribute("&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt; hi!\n&lt;/body&gt;\n&lt;/html&gt;");
        java.util.stream.Stream<org.jsoup.nodes.Element> elementStream27 = elements26.parallelStream();
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(elements26);
        org.junit.Assert.assertNotNull(elementStream27);
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1533");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node3 = document2.parentNode;
        org.jsoup.select.Elements elements5 = document2.getElementsByIndexLessThan((int) 'a');
        org.jsoup.select.Elements elements7 = elements5.val("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        java.util.stream.Stream<org.jsoup.nodes.Element> elementStream8 = elements5.stream();
        org.jsoup.select.Elements elements10 = elements5.toggleClass("#document");
        org.jsoup.select.Elements elements12 = elements10.select("#declaration");
        org.jsoup.nodes.Element element13 = elements10.first();
        org.jsoup.nodes.Element element15 = element13.append(" hi=\"\"");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(elementStream8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element15);
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1534");
        org.jsoup.nodes.Evaluator.AllElements allElements0 = new org.jsoup.nodes.Evaluator.AllElements();
        org.jsoup.nodes.Document document3 = org.jsoup.Jsoup.parseBodyFragment("hi", "hi");
        boolean boolean4 = allElements0.matches((org.jsoup.nodes.Element) document3);
        org.jsoup.select.Elements elements6 = document3.getElementsByClass("<html> <head> </head> <body> hi! </body> </html> <head> </head> <body> hi! </body> hi!");
        java.lang.String str7 = document3.toString();
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<html>\n<head>\n</head>\n<body>\n hi\n</body>\n</html>" + "'", str7, "<html>\n<head>\n</head>\n<body>\n hi\n</body>\n</html>");
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1535");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str3 = document2.outerHtml();
        org.jsoup.select.Elements elements4 = document2.getAllElements();
        java.lang.String str5 = document2.data();
        java.lang.String str6 = document2.baseUri();
        org.jsoup.nodes.Element element8 = document2.text("<#root>\n<html>\n <head>\n </head>\n <body> hi!\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element10 = document2.prependText(" #document");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str3, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1536");
        org.jsoup.nodes.Evaluator.AttributeWithValueStarting attributeWithValueStarting2 = new org.jsoup.nodes.Evaluator.AttributeWithValueStarting("\n<body>\n <!----> hi!\n</body>", "\n<!--<html class=\" hi\">\n<head class=\" hi\">\n</head>\n<body class=\" hi\"> hi!\n</body>\n</html>\n<head class=\" hi\">\n</head>\n<body class=\" hi\"> hi!\n</body>\n\nhi!-->");
        org.jsoup.nodes.Document document5 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str6 = document5.outerHtml();
        org.jsoup.select.Elements elements7 = document5.getAllElements();
        java.lang.String str8 = document5.data();
        org.jsoup.nodes.Element element10 = document5.getElementById("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = attributeWithValueStarting2.matches(element10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str6, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(element10);
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1537");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str3 = document2.outerHtml();
        org.jsoup.nodes.Document document6 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node7 = document6.parentNode;
        java.lang.String str8 = document6.title();
        org.jsoup.nodes.Element element10 = document6.text("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element11 = document2.appendChild((org.jsoup.nodes.Node) document6);
        org.jsoup.nodes.Attributes attributes12 = document6.attributes();
        boolean boolean14 = attributes12.hasKey("hi!");
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor15 = attributes12.iterator();
        org.jsoup.nodes.Document document18 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node19 = document18.parentNode;
        java.lang.String str20 = document18.title();
        org.jsoup.nodes.Attributes attributes21 = document18.attributes();
        java.lang.String str22 = attributes21.html();
        attributes12.addAll(attributes21);
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor24 = attributes12.iterator();
        org.jsoup.nodes.Document document27 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str28 = document27.outerHtml();
        org.jsoup.nodes.Document document31 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node32 = document31.parentNode;
        java.lang.String str33 = document31.title();
        org.jsoup.nodes.Element element35 = document31.text("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element36 = document27.appendChild((org.jsoup.nodes.Node) document31);
        org.jsoup.nodes.Attributes attributes37 = document31.attributes();
        boolean boolean39 = attributes37.hasKey("hi!");
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor40 = attributes37.iterator();
        org.jsoup.nodes.Document document43 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node44 = document43.parentNode;
        java.lang.String str45 = document43.title();
        org.jsoup.nodes.Attributes attributes46 = document43.attributes();
        java.lang.String str47 = attributes46.html();
        attributes37.addAll(attributes46);
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor49 = attributes46.iterator();
        attributes12.addAll(attributes46);
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator51 = attributes46.spliterator();
        java.lang.String str52 = attributes46.html();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str3, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(attributes12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(attributeItor15);
        org.junit.Assert.assertNotNull(document18);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(attributes21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(attributeItor24);
        org.junit.Assert.assertNotNull(document27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str28, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document31);
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertNotNull(element36);
        org.junit.Assert.assertNotNull(attributes37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(attributeItor40);
        org.junit.Assert.assertNotNull(document43);
        org.junit.Assert.assertNull(node44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertNotNull(attributes46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertNotNull(attributeItor49);
        org.junit.Assert.assertNotNull(attributeSpliterator51);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1538");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node3 = document2.parentNode;
        org.jsoup.select.Elements elements5 = document2.getElementsByIndexLessThan((int) 'a');
        java.util.stream.Stream<org.jsoup.nodes.Element> elementStream6 = elements5.stream();
        org.jsoup.select.Elements elements8 = elements5.addClass("hi");
        java.lang.Object[] objArray9 = elements8.toArray();
        org.jsoup.nodes.Document document12 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str13 = document12.outerHtml();
        org.jsoup.nodes.Document document16 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node17 = document16.parentNode;
        java.lang.String str18 = document16.title();
        org.jsoup.nodes.Element element20 = document16.text("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element21 = document12.appendChild((org.jsoup.nodes.Node) document16);
        org.jsoup.nodes.Element element22 = document16.nextElementSibling();
        org.jsoup.select.Elements elements23 = document16.siblingElements();
        java.util.stream.Stream<org.jsoup.nodes.Element> elementStream24 = elements23.stream();
        org.jsoup.nodes.Document document27 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node28 = document27.parentNode;
        org.jsoup.select.Elements elements30 = document27.getElementsByIndexLessThan((int) 'a');
        java.util.stream.Stream<org.jsoup.nodes.Element> elementStream31 = elements30.stream();
        org.jsoup.select.Elements elements33 = elements30.addClass("hi");
        java.lang.String str34 = elements33.html();
        boolean boolean35 = elements23.removeAll((java.util.Collection<org.jsoup.nodes.Element>) elements33);
        boolean boolean36 = elements8.removeAll((java.util.Collection<org.jsoup.nodes.Element>) elements33);
        org.jsoup.nodes.Document document39 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node40 = document39.parentNode;
        org.jsoup.select.Elements elements42 = document39.getElementsByIndexLessThan((int) 'a');
        java.util.stream.Stream<org.jsoup.nodes.Element> elementStream43 = elements42.stream();
        org.jsoup.select.Elements elements45 = elements42.addClass("hi");
        org.jsoup.select.Elements elements46 = new org.jsoup.select.Elements((java.util.Collection<org.jsoup.nodes.Element>) elements45);
        org.jsoup.select.Elements elements49 = elements45.attr("head", "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.select.Elements elements51 = elements49.val("#text");
        org.jsoup.nodes.Document document54 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node55 = document54.parentNode;
        java.lang.String str56 = document54.title();
        org.jsoup.nodes.Attributes attributes57 = document54.attributes();
        org.jsoup.nodes.Document document60 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node61 = document60.parentNode;
        org.jsoup.select.Elements elements63 = document60.getElementsByIndexLessThan((int) 'a');
        org.jsoup.nodes.Element element64 = document54.prependChild((org.jsoup.nodes.Node) document60);
        org.jsoup.select.Elements elements66 = document60.getElementsByClass("!");
        org.jsoup.nodes.Element element68 = document60.append("hi!");
        int int69 = elements49.lastIndexOf((java.lang.Object) document60);
        org.jsoup.select.Elements elements71 = elements49.prepend("\n&lt;!----&gt;");
        boolean boolean72 = elements8.addAll((java.util.Collection<org.jsoup.nodes.Element>) elements71);
        org.jsoup.nodes.Evaluator.AttributeWithValueEnding attributeWithValueEnding75 = new org.jsoup.nodes.Evaluator.AttributeWithValueEnding("\n<!---->", "hi!");
        org.jsoup.nodes.Document document78 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str79 = document78.outerHtml();
        document78.setBaseUri("hi");
        boolean boolean82 = attributeWithValueEnding75.matches((org.jsoup.nodes.Element) document78);
        org.jsoup.nodes.Element element84 = document78.prependText("<#root>\n<html>\n <head>\n </head>\n <body> hi!\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.select.Elements elements85 = document78.children();
        boolean boolean87 = elements85.contains((java.lang.Object) "[ , !]");
        boolean boolean88 = elements8.addAll((java.util.Collection<org.jsoup.nodes.Element>) elements85);
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elementStream6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[<html class=\" hi\">\n<head class=\" hi\">\n</head>\n<body class=\" hi\"> hi!\n</body>\n</html>, \n<html class=\" hi\">\n<head class=\" hi\">\n</head>\n<body class=\" hi\"> hi!\n</body>\n</html>, \n<head class=\" hi\">\n</head>, \n<body class=\" hi\"> hi!\n</body>]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[<html class=\" hi\">\n<head class=\" hi\">\n</head>\n<body class=\" hi\"> hi!\n</body>\n</html>, \n<html class=\" hi\">\n<head class=\" hi\">\n</head>\n<body class=\" hi\"> hi!\n</body>\n</html>, \n<head class=\" hi\">\n</head>, \n<body class=\" hi\"> hi!\n</body>]");
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str13, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document16);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNull(element22);
        org.junit.Assert.assertNotNull(elements23);
        org.junit.Assert.assertNotNull(elementStream24);
        org.junit.Assert.assertNotNull(document27);
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertNotNull(elements30);
        org.junit.Assert.assertNotNull(elementStream31);
        org.junit.Assert.assertNotNull(elements33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "<html class=\" hi\">\n<head class=\" hi\">\n</head>\n<body class=\" hi\"> hi!\n</body>\n</html>\n<head class=\" hi\">\n</head>\n<body class=\" hi\"> hi!\n</body>\n\nhi!" + "'", str34, "<html class=\" hi\">\n<head class=\" hi\">\n</head>\n<body class=\" hi\"> hi!\n</body>\n</html>\n<head class=\" hi\">\n</head>\n<body class=\" hi\"> hi!\n</body>\n\nhi!");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(document39);
        org.junit.Assert.assertNull(node40);
        org.junit.Assert.assertNotNull(elements42);
        org.junit.Assert.assertNotNull(elementStream43);
        org.junit.Assert.assertNotNull(elements45);
        org.junit.Assert.assertNotNull(elements49);
        org.junit.Assert.assertNotNull(elements51);
        org.junit.Assert.assertNotNull(document54);
        org.junit.Assert.assertNull(node55);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertNotNull(attributes57);
        org.junit.Assert.assertNotNull(document60);
        org.junit.Assert.assertNull(node61);
        org.junit.Assert.assertNotNull(elements63);
        org.junit.Assert.assertNotNull(element64);
        org.junit.Assert.assertNotNull(elements66);
        org.junit.Assert.assertNotNull(element68);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + (-1) + "'", int69 == (-1));
        org.junit.Assert.assertNotNull(elements71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertNotNull(document78);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str79, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNotNull(element84);
        org.junit.Assert.assertNotNull(elements85);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + true + "'", boolean88 == true);
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1539");
        org.jsoup.nodes.Element element0 = null;
        org.jsoup.nodes.Element[] elementArray1 = new org.jsoup.nodes.Element[] { element0 };
        org.jsoup.select.Elements elements2 = new org.jsoup.select.Elements(elementArray1);
        org.jsoup.nodes.Document document6 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str7 = document6.outerHtml();
        org.jsoup.select.Elements elements8 = document6.getAllElements();
        org.jsoup.select.Elements elements10 = elements8.prepend("");
        org.jsoup.select.Elements elements12 = elements10.prepend("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        int int14 = elements12.lastIndexOf((java.lang.Object) '#');
        elements12.clear();
        boolean boolean16 = elements2.addAll(0, (java.util.Collection<org.jsoup.nodes.Element>) elements12);
        org.jsoup.parser.Tag tag18 = org.jsoup.parser.Tag.valueOf("hi!");
        org.jsoup.nodes.Element element20 = new org.jsoup.nodes.Element(tag18, "!");
        boolean boolean21 = tag18.isData();
        org.jsoup.nodes.Evaluator.Tag tag23 = new org.jsoup.nodes.Evaluator.Tag("hi!");
        org.jsoup.nodes.Document document26 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str27 = document26.outerHtml();
        org.jsoup.nodes.Document document30 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node31 = document30.parentNode;
        java.lang.String str32 = document30.title();
        org.jsoup.nodes.Element element34 = document30.text("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element35 = document26.appendChild((org.jsoup.nodes.Node) document30);
        boolean boolean36 = tag23.matches((org.jsoup.nodes.Element) document26);
        boolean boolean37 = tag18.equals((java.lang.Object) tag23);
        org.jsoup.nodes.Element element39 = new org.jsoup.nodes.Element(tag18, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>\n<head>\n</head>\n<body> hi!\n</body>\n\nhi!");
        boolean boolean40 = elements12.add(element39);
        org.jsoup.select.Elements elements42 = elements12.eq((int) '!');
        java.lang.Class<?> wildcardClass43 = elements12.getClass();
        org.junit.Assert.assertNotNull(elementArray1);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str7, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(tag18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(document26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str27, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document30);
        org.junit.Assert.assertNull(node31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(element34);
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(elements42);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1540");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("<#root>\n<html>\n <head>\n </head>\n <body> hi!\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>", "<html>\n<head>\n</head>\n<body>\n hi\n</body>\n</html>=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n hi\n&lt;/body&gt;\n&lt;/html&gt;\"");
        org.jsoup.nodes.Element element3 = document2.head();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements6 = document2.getElementsByAttributeValueContaining("", "&lt;html class=&quot; hi &lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n [ , !]\n&lt;/body&gt;\n&lt;/html&gt;&quot; head=&quot;&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt; hi!\n&lt;/body&gt;\n&lt;/html&gt;&quot; value=&quot;#text&quot;&gt;\n&lt;head class=&quot; hi &lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n [ , !]\n&lt;/body&gt;\n&lt;/html&gt;&quot; head=&quot;&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt; hi!\n&lt;/body&gt;\n&lt;/html&gt;&quot; value=&quot;#text&quot;&gt;\n&lt;/head&gt;\n&lt;body class=&quot; hi &lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n [ , !]\n&lt;/body&gt;\n&lt;/html&gt;&quot; head=&quot;&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt; hi!\n&lt;/body&gt;\n&lt;/html&gt;&quot; value=&quot;#text&quot;&gt; hi!\n&lt;/body&gt;\n&lt;/html&gt;\n\n&lt;html class=&quot; hi &lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n [ , !]\n&lt;/body&gt;\n&lt;/html&gt;&quot; head=&quot;&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt; hi!\n&lt;/body&gt;\n&lt;/html&gt;&quot; value=&quot;#text&quot;&gt;\n&lt;head class=&quot; hi &lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n [ , !]\n&lt;/body&gt;\n&lt;/html&gt;&quot; head=&quot;&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt; hi!\n&lt;/body&gt;\n&lt;/html&gt;&quot; value=&quot;#text&quot;&gt;\n&lt;/head&gt;\n&lt;body class=&quot; hi &lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n [ , !]\n&lt;/body&gt;\n&lt;/html&gt;&quot; head=&quot;&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt; hi!\n&lt;/body&gt;\n&lt;/html&gt;&quot; value=&quot;#text&quot;&gt; hi!\n&lt;/body&gt;\n&lt;/html&gt;\n\n&lt;head class=&quot; hi &lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n [ , !]\n&lt;/body&gt;\n&lt;/html&gt;&quot; head=&quot;&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt; hi!\n&lt;/body&gt;\n&lt;/html&gt;&quot; value=&quot;#text&quot;&gt;\n&lt;/head&gt;\n\n&lt;body class=&quot; hi &lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n [ , !]\n&lt;/body&gt;\n&lt;/html&gt;&quot; head=&quot;&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt; hi!\n&lt;/body&gt;\n&lt;/html&gt;&quot; value=&quot;#text&quot;&gt; hi!\n&lt;/body&gt;");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element3);
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1541");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        document1.baseUri = "";
        org.jsoup.nodes.Element element5 = document1.html("#document");
        org.jsoup.nodes.Element element7 = element5.removeClass(" !");
        org.jsoup.nodes.Element element9 = element7.addClass("hi");
        java.lang.String str10 = element7.nodeName();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#document" + "'", str10, "#document");
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1542");
        org.jsoup.nodes.Evaluator.AttributeWithValueContaining attributeWithValueContaining2 = new org.jsoup.nodes.Evaluator.AttributeWithValueContaining("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html><#root>\n<html>\n <head>\n </head>\n <body>\n  &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;\n </body>\n</html>\n</#root>", "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>\n<head>\n</head>\n<body> hi!\n</body>\n\nhi!");
        org.jsoup.nodes.Evaluator.AttributeWithValueStarting attributeWithValueStarting5 = new org.jsoup.nodes.Evaluator.AttributeWithValueStarting("hi", "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        attributeWithValueStarting5.value = "hi!";
        attributeWithValueStarting5.key = "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>";
        org.jsoup.nodes.Document document12 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str13 = document12.outerHtml();
        document12.setBaseUri("hi");
        boolean boolean16 = attributeWithValueStarting5.matches((org.jsoup.nodes.Element) document12);
        org.jsoup.nodes.Document document19 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str20 = document19.outerHtml();
        org.jsoup.nodes.Document document23 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node24 = document23.parentNode;
        java.lang.String str25 = document23.title();
        org.jsoup.nodes.Element element27 = document23.text("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element28 = document19.appendChild((org.jsoup.nodes.Node) document23);
        org.jsoup.nodes.Document document31 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node32 = document31.parentNode;
        java.lang.String str33 = document31.title();
        org.jsoup.nodes.Attributes attributes34 = document31.attributes();
        org.jsoup.nodes.Document document37 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node38 = document37.parentNode;
        org.jsoup.select.Elements elements40 = document37.getElementsByIndexLessThan((int) 'a');
        org.jsoup.nodes.Element element41 = document31.prependChild((org.jsoup.nodes.Node) document37);
        org.jsoup.select.Elements elements43 = document31.select("hi");
        org.jsoup.nodes.Element element44 = document23.appendChild((org.jsoup.nodes.Node) document31);
        org.jsoup.nodes.Element element45 = document31.body();
        boolean boolean46 = attributeWithValueStarting5.matches((org.jsoup.nodes.Element) document31);
        boolean boolean47 = attributeWithValueContaining2.matches((org.jsoup.nodes.Element) document31);
        org.jsoup.nodes.Node node50 = document31.attr("<html>\n    <head>\n    </head>\n    <body>\n     &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;\n    </body>\n   </html>", "<html>\n<head>\n</head>\n<body>\n hi=&quot;&quot;\n</body>\n</html>");
        java.lang.String str51 = document31.title();
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str13, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(document19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str20, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document23);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertNotNull(document31);
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(attributes34);
        org.junit.Assert.assertNotNull(document37);
        org.junit.Assert.assertNull(node38);
        org.junit.Assert.assertNotNull(elements40);
        org.junit.Assert.assertNotNull(element41);
        org.junit.Assert.assertNotNull(elements43);
        org.junit.Assert.assertNotNull(element44);
        org.junit.Assert.assertNotNull(element45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1543");
        org.jsoup.nodes.Evaluator.AttributeWithValueNot attributeWithValueNot2 = new org.jsoup.nodes.Evaluator.AttributeWithValueNot("<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "org.jsoup.select.Selector$SelectorParseException: <html> <head> </head> <body> hi! </body> </html><#root> <html> <head> </head> <body> &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt; </body> </html> </#root>");
        org.jsoup.nodes.Evaluator.AttributeWithValueEnding attributeWithValueEnding5 = new org.jsoup.nodes.Evaluator.AttributeWithValueEnding("\n<!---->", "hi!");
        org.jsoup.nodes.Document document8 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str9 = document8.outerHtml();
        document8.setBaseUri("hi");
        boolean boolean12 = attributeWithValueEnding5.matches((org.jsoup.nodes.Element) document8);
        org.jsoup.nodes.Document document15 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node16 = document15.parentNode;
        java.lang.String str17 = document15.title();
        org.jsoup.nodes.Attributes attributes18 = document15.attributes();
        org.jsoup.nodes.Document document21 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node22 = document21.parentNode;
        org.jsoup.select.Elements elements24 = document21.getElementsByIndexLessThan((int) 'a');
        org.jsoup.nodes.Element element25 = document15.prependChild((org.jsoup.nodes.Node) document21);
        java.lang.String str26 = document21.baseUri();
        org.jsoup.nodes.Document document29 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str30 = document29.outerHtml();
        org.jsoup.nodes.Document document33 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node34 = document33.parentNode;
        java.lang.String str35 = document33.title();
        org.jsoup.nodes.Element element37 = document33.text("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element38 = document29.appendChild((org.jsoup.nodes.Node) document33);
        org.jsoup.nodes.Attributes attributes39 = document33.attributes();
        document21.addChild((org.jsoup.nodes.Node) document33);
        org.jsoup.nodes.Document document42 = org.jsoup.Jsoup.parseBodyFragment("head");
        org.jsoup.nodes.Element element43 = document33.prependChild((org.jsoup.nodes.Node) document42);
        boolean boolean44 = attributeWithValueEnding5.matches((org.jsoup.nodes.Element) document33);
        org.jsoup.nodes.Element element46 = document33.text("hi=\"\"");
        boolean boolean47 = attributeWithValueNot2.matches((org.jsoup.nodes.Element) document33);
        attributeWithValueNot2.value = "[ , #, d, o, c, u, m, e, n, t]";
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str9, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(document15);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(attributes18);
        org.junit.Assert.assertNotNull(document21);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertNotNull(elements24);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertNotNull(document29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str30, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document33);
        org.junit.Assert.assertNull(node34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(element37);
        org.junit.Assert.assertNotNull(element38);
        org.junit.Assert.assertNotNull(attributes39);
        org.junit.Assert.assertNotNull(document42);
        org.junit.Assert.assertNotNull(element43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(element46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1544");
        org.jsoup.nodes.Evaluator.Class class1 = new org.jsoup.nodes.Evaluator.Class("");
        org.jsoup.nodes.Document document4 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str5 = document4.outerHtml();
        org.jsoup.nodes.Document document8 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node9 = document8.parentNode;
        java.lang.String str10 = document8.title();
        org.jsoup.nodes.Element element12 = document8.text("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element13 = document4.appendChild((org.jsoup.nodes.Node) document8);
        org.jsoup.nodes.Element element15 = document4.removeClass("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html><#root>\n<html>\n <head>\n </head>\n <body>\n  &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;\n </body>\n</html>\n</#root>");
        java.lang.String str16 = document4.text();
        org.jsoup.select.Elements elements18 = document4.getElementsByIndexLessThan((int) (byte) 1);
        document4.title(" !");
        boolean boolean21 = class1.matches((org.jsoup.nodes.Element) document4);
        boolean boolean23 = document4.hasAttr("");
        org.junit.Assert.assertNotNull(document4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str5, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi! <html> <head> </head> <body> hi! </body> </html>" + "'", str16, "hi! <html> <head> </head> <body> hi! </body> </html>");
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1545");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("\n<!-- #document-->", "<html>\n<head>\n</head>\n<body>\n</body>\n</html><<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>>\n</<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>><hi!>\n</hi!>");
        org.junit.Assert.assertNotNull(document2);
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1546");
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parseBodyFragment("hi", "hi");
        java.lang.String str3 = document2.baseUri();
        java.lang.String str4 = document2.html();
        boolean boolean6 = document2.hasClass("<html>\n<head>\n #document\n</head>\n<body> hi!#document\n</body>#document\n</html>#document\n<head>\n #document\n</head>\n<body> hi!#document\n</body>#document\n#document\nhi!#document");
        document2.title("[4]");
        boolean boolean9 = document2.preserveWhitespace();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi" + "'", str3, "hi");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<html>\n<head>\n</head>\n<body>\n hi\n</body>\n</html>" + "'", str4, "<html>\n<head>\n</head>\n<body>\n hi\n</body>\n</html>");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1547");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("#declaration", "<html>\n<head>\n</head>\n<body>\n &lt;#root&gt; \n <html> \n  <head> \n  </head> \n  <body>\n    hi!    \n   <html> \n    <head> \n    </head> \n    <body>\n      hi!  \n    </body>\n   </html>\n  </body>\n </html>\n</body>\n</html><&lt;!----&gt;>\n</&lt;!----&gt;>");
        org.jsoup.nodes.Element element5 = document2.attr("\n<<html>\n<head>\n</head>\n<body>\n</body>\n</html>>\n</<html>\n<head>\n</head>\n<body>\n</body>\n</html>>", "<html> <head> </head> <body> hi! </body> </html> <html> <head> </head> <body> hi! </body> </html>  <html> <head> </head> <body> hi! </body> </html>");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element5);
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1548");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("<html>\n<head>\n</head>\n<body>\n head\n</body>\n</html>");
        org.jsoup.nodes.Element element2 = document1.empty();
        org.jsoup.nodes.Document document5 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node6 = document5.parentNode;
        org.jsoup.select.Elements elements8 = document5.getElementsByIndexLessThan((int) 'a');
        org.jsoup.select.Elements elements10 = elements8.append("hi=\"\"");
        org.jsoup.select.Elements elements12 = elements10.removeClass("<html>\n<head>\n</head>\n<body>\n [ , !]\n</body>\n</html>");
        org.jsoup.nodes.Document document14 = org.jsoup.Jsoup.parse("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.select.Elements elements17 = document14.getElementsByAttributeValue("hi=\"\"", "#data");
        org.jsoup.parser.Tag tag18 = document14.tag();
        boolean boolean19 = elements12.add((org.jsoup.nodes.Element) document14);
        org.jsoup.nodes.Element element20 = document1.prependChild((org.jsoup.nodes.Node) document14);
        org.jsoup.nodes.Document document23 = org.jsoup.parser.Parser.parse("#declaration", "\n&lt;!----&gt;");
        boolean boolean24 = document14.equals((java.lang.Object) document23);
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(document5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(document14);
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertNotNull(tag18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(document23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1549");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str3 = document2.outerHtml();
        org.jsoup.nodes.Document document6 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node7 = document6.parentNode;
        java.lang.String str8 = document6.title();
        org.jsoup.nodes.Element element10 = document6.text("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element11 = document2.appendChild((org.jsoup.nodes.Node) document6);
        org.jsoup.nodes.Document document12 = document2.normalise();
        org.jsoup.nodes.Attributes attributes13 = document2.attributes();
        int int14 = attributes13.size();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str3, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1550");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node3 = document2.parentNode;
        java.lang.String str4 = document2.title();
        org.jsoup.nodes.Element element6 = document2.text("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.select.Elements elements7 = document2.children();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements7);
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1551");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str3 = document2.outerHtml();
        org.jsoup.nodes.Document document6 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node7 = document6.parentNode;
        java.lang.String str8 = document6.title();
        org.jsoup.nodes.Element element10 = document6.text("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element11 = document2.appendChild((org.jsoup.nodes.Node) document6);
        org.jsoup.nodes.Document document12 = document2.normalise();
        org.jsoup.nodes.Element element13 = document2.empty();
        org.jsoup.select.Elements elements15 = element13.getElementsByIndexLessThan((int) (byte) 0);
        java.lang.String str17 = elements15.attr("");
        org.jsoup.select.Elements elements19 = elements15.eq((int) (byte) 0);
        org.jsoup.nodes.Document document23 = org.jsoup.Jsoup.parse("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>\n<head>\n</head>\n<body> hi!\n</body>\n\nhi!", "<html>\n<head>\n</head>\n<body>\n [ , !]\n</body>\n</html>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element24 = elements15.set((int) ' ', (org.jsoup.nodes.Element) document23);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str3, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertNotNull(document23);
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1552");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node3 = document2.parentNode;
        org.jsoup.select.Elements elements4 = document2.getAllElements();
        org.jsoup.nodes.Element element6 = document2.createElement("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.select.Elements elements7 = element6.getAllElements();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = element6.childNodes;
        org.jsoup.nodes.Document document11 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node12 = document11.parentNode;
        java.lang.String str13 = document11.title();
        org.jsoup.nodes.Attributes attributes14 = document11.attributes();
        org.jsoup.nodes.Document document17 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node18 = document17.parentNode;
        org.jsoup.select.Elements elements20 = document17.getElementsByIndexLessThan((int) 'a');
        org.jsoup.nodes.Element element21 = document11.prependChild((org.jsoup.nodes.Node) document17);
        java.lang.String str22 = document17.baseUri();
        org.jsoup.nodes.Document document25 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str26 = document25.outerHtml();
        org.jsoup.nodes.Document document29 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node30 = document29.parentNode;
        java.lang.String str31 = document29.title();
        org.jsoup.nodes.Element element33 = document29.text("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element34 = document25.appendChild((org.jsoup.nodes.Node) document29);
        org.jsoup.nodes.Attributes attributes35 = document29.attributes();
        document17.addChild((org.jsoup.nodes.Node) document29);
        org.jsoup.nodes.Document document38 = org.jsoup.Jsoup.parseBodyFragment("head");
        org.jsoup.nodes.Element element39 = document29.prependChild((org.jsoup.nodes.Node) document38);
        element6.setParentNode((org.jsoup.nodes.Node) document38);
        org.jsoup.select.Elements elements41 = element6.children();
        boolean boolean42 = elements41.hasText();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(attributes14);
        org.junit.Assert.assertNotNull(document17);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertNotNull(elements20);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(document25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str26, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document29);
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertNotNull(element34);
        org.junit.Assert.assertNotNull(attributes35);
        org.junit.Assert.assertNotNull(document38);
        org.junit.Assert.assertNotNull(element39);
        org.junit.Assert.assertNotNull(elements41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1553");
        org.jsoup.nodes.Evaluator.IndexLessThan indexLessThan1 = new org.jsoup.nodes.Evaluator.IndexLessThan((int) (byte) -1);
        org.jsoup.nodes.Document document4 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node5 = document4.parentNode;
        org.jsoup.select.Elements elements7 = document4.getElementsByIndexLessThan((int) 'a');
        boolean boolean8 = indexLessThan1.matches((org.jsoup.nodes.Element) document4);
        org.jsoup.nodes.Document document11 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node12 = document11.parentNode;
        org.jsoup.select.Elements elements13 = document11.getAllElements();
        org.jsoup.select.Elements elements14 = org.jsoup.select.Collector.collect((org.jsoup.nodes.Evaluator) indexLessThan1, (org.jsoup.nodes.Element) document11);
        java.lang.String str15 = document11.title();
        org.junit.Assert.assertNotNull(document4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1554");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str3 = document2.outerHtml();
        org.jsoup.select.Elements elements4 = document2.getAllElements();
        org.jsoup.select.Elements elements6 = elements4.prepend("");
        org.jsoup.nodes.Document document10 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str11 = document10.outerHtml();
        org.jsoup.nodes.Document document14 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node15 = document14.parentNode;
        java.lang.String str16 = document14.title();
        org.jsoup.nodes.Element element18 = document14.text("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element19 = document10.appendChild((org.jsoup.nodes.Node) document14);
        org.jsoup.nodes.Element element20 = document14.nextElementSibling();
        org.jsoup.select.Elements elements21 = document14.siblingElements();
        org.jsoup.nodes.Element element22 = elements4.set(1, (org.jsoup.nodes.Element) document14);
        java.lang.String str23 = document14.nodeName();
        org.jsoup.nodes.Element element25 = document14.prependText("#data");
        java.util.List<org.jsoup.nodes.Node> nodeList26 = document14.siblingNodes();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str3, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str11, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document14);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNull(element20);
        org.junit.Assert.assertNotNull(elements21);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "#document" + "'", str23, "#document");
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(nodeList26);
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1555");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node3 = document2.parentNode;
        org.jsoup.select.Elements elements5 = document2.getElementsByIndexLessThan((int) 'a');
        java.util.stream.Stream<org.jsoup.nodes.Element> elementStream6 = elements5.stream();
        org.jsoup.select.Elements elements8 = elements5.addClass("hi");
        org.jsoup.select.Elements elements9 = new org.jsoup.select.Elements((java.util.Collection<org.jsoup.nodes.Element>) elements8);
        org.jsoup.select.Elements elements12 = elements8.attr("head", "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.nodes.Document document15 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node16 = document15.parentNode;
        java.lang.String str17 = document15.title();
        org.jsoup.nodes.Attributes attributes18 = document15.attributes();
        org.jsoup.nodes.Document document21 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node22 = document21.parentNode;
        org.jsoup.select.Elements elements24 = document21.getElementsByIndexLessThan((int) 'a');
        org.jsoup.nodes.Element element25 = document15.prependChild((org.jsoup.nodes.Node) document21);
        org.jsoup.select.Elements elements27 = document15.select("hi");
        org.jsoup.nodes.Document document30 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str31 = document30.outerHtml();
        org.jsoup.select.Elements elements32 = document30.getAllElements();
        java.lang.String str33 = document30.data();
        org.jsoup.nodes.Element element35 = document30.text("");
        org.jsoup.nodes.Node node36 = document30.parentNode;
        org.jsoup.select.Elements elements38 = document30.getElementsByIndexGreaterThan((int) '4');
        boolean boolean39 = elements27.retainAll((java.util.Collection<org.jsoup.nodes.Element>) elements38);
        org.jsoup.select.Elements elements41 = elements38.select(" hi=\"\"");
        org.jsoup.nodes.Evaluator.AttributeWithValueStarting attributeWithValueStarting44 = new org.jsoup.nodes.Evaluator.AttributeWithValueStarting("hi", "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        attributeWithValueStarting44.value = "hi!";
        attributeWithValueStarting44.key = "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>";
        org.jsoup.nodes.Document document51 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str52 = document51.outerHtml();
        document51.setBaseUri("hi");
        boolean boolean55 = attributeWithValueStarting44.matches((org.jsoup.nodes.Element) document51);
        org.jsoup.nodes.Document document58 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str59 = document58.outerHtml();
        org.jsoup.nodes.Document document62 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node63 = document62.parentNode;
        java.lang.String str64 = document62.title();
        org.jsoup.nodes.Element element66 = document62.text("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element67 = document58.appendChild((org.jsoup.nodes.Node) document62);
        org.jsoup.nodes.Document document70 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node71 = document70.parentNode;
        java.lang.String str72 = document70.title();
        org.jsoup.nodes.Attributes attributes73 = document70.attributes();
        org.jsoup.nodes.Document document76 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node77 = document76.parentNode;
        org.jsoup.select.Elements elements79 = document76.getElementsByIndexLessThan((int) 'a');
        org.jsoup.nodes.Element element80 = document70.prependChild((org.jsoup.nodes.Node) document76);
        org.jsoup.select.Elements elements82 = document70.select("hi");
        org.jsoup.nodes.Element element83 = document62.appendChild((org.jsoup.nodes.Node) document70);
        org.jsoup.nodes.Element element84 = document70.body();
        boolean boolean85 = attributeWithValueStarting44.matches((org.jsoup.nodes.Element) document70);
        boolean boolean86 = elements38.equals((java.lang.Object) boolean85);
        boolean boolean87 = elements12.retainAll((java.util.Collection<org.jsoup.nodes.Element>) elements38);
        org.jsoup.nodes.Document document90 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str91 = document90.outerHtml();
        org.jsoup.select.Elements elements94 = document90.getElementsByAttributeValueContaining("<?hi>", "[!]");
        org.jsoup.select.Elements elements96 = document90.getElementsByTag("<html class=\" hi\">\n<head class=\" hi\">\n</head>\n<body class=\" hi\"> hi!\n</body>\n</html>\n<head class=\" hi\">\n</head>\n<body class=\" hi\"> hi!\n</body>\n\nhi!");
        boolean boolean97 = elements38.retainAll((java.util.Collection<org.jsoup.nodes.Element>) elements96);
        int int98 = elements38.size();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elementStream6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(document15);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(attributes18);
        org.junit.Assert.assertNotNull(document21);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertNotNull(elements24);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(elements27);
        org.junit.Assert.assertNotNull(document30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str31, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(elements32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertNull(node36);
        org.junit.Assert.assertNotNull(elements38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(elements41);
        org.junit.Assert.assertNotNull(document51);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str52, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(document58);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str59, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document62);
        org.junit.Assert.assertNull(node63);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertNotNull(element66);
        org.junit.Assert.assertNotNull(element67);
        org.junit.Assert.assertNotNull(document70);
        org.junit.Assert.assertNull(node71);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "" + "'", str72, "");
        org.junit.Assert.assertNotNull(attributes73);
        org.junit.Assert.assertNotNull(document76);
        org.junit.Assert.assertNull(node77);
        org.junit.Assert.assertNotNull(elements79);
        org.junit.Assert.assertNotNull(element80);
        org.junit.Assert.assertNotNull(elements82);
        org.junit.Assert.assertNotNull(element83);
        org.junit.Assert.assertNotNull(element84);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
        org.junit.Assert.assertNotNull(document90);
        org.junit.Assert.assertEquals("'" + str91 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str91, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(elements94);
        org.junit.Assert.assertNotNull(elements96);
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + false + "'", boolean97 == false);
        org.junit.Assert.assertTrue("'" + int98 + "' != '" + 0 + "'", int98 == 0);
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1556");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        document1.baseUri = "";
        org.jsoup.select.Elements elements5 = document1.getElementsByIndexEquals((int) (byte) -1);
        org.jsoup.nodes.Element element7 = document1.append("#document");
        org.jsoup.select.Elements elements8 = document1.getAllElements();
        java.util.Spliterator<org.jsoup.nodes.Element> elementSpliterator9 = elements8.spliterator();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(elementSpliterator9);
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1557");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str3 = document2.outerHtml();
        org.jsoup.select.Elements elements4 = document2.getAllElements();
        java.lang.String str5 = document2.data();
        org.jsoup.nodes.Element element7 = document2.text("");
        org.jsoup.nodes.Node node8 = document2.parentNode;
        org.jsoup.select.Elements elements10 = document2.getElementsByIndexGreaterThan((int) '4');
        java.lang.String str11 = document2.baseUri();
        org.jsoup.nodes.Element element13 = document2.appendText("<#root>\n<html>\n <head>\n </head>\n <body> hi!\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element14 = document2.body();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str3, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element14);
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1558");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str3 = document2.outerHtml();
        org.jsoup.select.Elements elements4 = document2.getAllElements();
        java.lang.String str5 = document2.data();
        java.lang.String str6 = document2.baseUri();
        org.jsoup.nodes.Element element8 = document2.text("<#root>\n<html>\n <head>\n </head>\n <body> hi!\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element10 = element8.val("#declaration");
        boolean boolean11 = element8.isBlock();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str3, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1559");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str3 = document2.outerHtml();
        org.jsoup.nodes.Document document6 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node7 = document6.parentNode;
        java.lang.String str8 = document6.title();
        org.jsoup.nodes.Element element10 = document6.text("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element11 = document2.appendChild((org.jsoup.nodes.Node) document6);
        java.lang.String str12 = element11.outerHtml();
        org.jsoup.select.Elements elements14 = element11.getElementsByIndexEquals((int) (byte) 0);
        org.jsoup.nodes.Element element16 = element11.val("hi!");
        org.jsoup.nodes.Document document18 = org.jsoup.nodes.Document.createShell("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element20 = document18.text("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>\n<head>\n</head>\n<body> hi!\n</body>\n\nhi!");
        java.lang.String str21 = element20.tagName();
        org.jsoup.nodes.Element element22 = element16.appendChild((org.jsoup.nodes.Node) element20);
        java.lang.String str23 = element16.nodeName();
        element16.baseUri = "i";
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str3, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html><#root>\n<html>\n <head>\n </head>\n <body>\n  &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;\n </body>\n</html>\n</#root>" + "'", str12, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html><#root>\n<html>\n <head>\n </head>\n <body>\n  &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;\n </body>\n</html>\n</#root>");
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(document18);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "#root" + "'", str21, "#root");
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "#document" + "'", str23, "#document");
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1560");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node3 = document2.parentNode;
        java.lang.String str4 = document2.title();
        org.jsoup.nodes.Attributes attributes5 = document2.attributes();
        org.jsoup.nodes.Document document8 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node9 = document8.parentNode;
        org.jsoup.select.Elements elements11 = document8.getElementsByIndexLessThan((int) 'a');
        org.jsoup.nodes.Element element12 = document2.prependChild((org.jsoup.nodes.Node) document8);
        java.lang.String str13 = document8.baseUri();
        org.jsoup.nodes.Document document16 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str17 = document16.outerHtml();
        org.jsoup.nodes.Document document20 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node21 = document20.parentNode;
        java.lang.String str22 = document20.title();
        org.jsoup.nodes.Element element24 = document20.text("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element25 = document16.appendChild((org.jsoup.nodes.Node) document20);
        org.jsoup.nodes.Attributes attributes26 = document20.attributes();
        document8.addChild((org.jsoup.nodes.Node) document20);
        org.jsoup.nodes.Element element29 = document20.wrap("<html class=\" hi\">\n<head class=\" hi\">\n</head>\n<body class=\" hi\"> hi!\n</body>\n</html>\n<head class=\" hi\">\n</head>\n<body class=\" hi\"> hi!\n</body>\n\nhi!");
        org.jsoup.select.Elements elements30 = element29.getAllElements();
        org.jsoup.nodes.Element element31 = elements30.first();
        org.jsoup.nodes.Document document34 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str35 = document34.outerHtml();
        org.jsoup.select.Elements elements36 = document34.getAllElements();
        java.lang.String str37 = document34.data();
        org.jsoup.nodes.Element element39 = document34.text("");
        org.jsoup.nodes.Node node40 = document34.parentNode;
        org.jsoup.select.Elements elements43 = document34.getElementsByAttributeValue("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html><#root>\n<html>\n <head>\n </head>\n <body>\n  &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;\n </body>\n</html>\n</#root>", "<#root>\n<html>\n <head>\n </head>\n <body> hi!\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        boolean boolean44 = elements30.addAll((java.util.Collection<org.jsoup.nodes.Element>) elements43);
        java.lang.String str45 = elements30.html();
        org.jsoup.nodes.Document document48 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node49 = document48.parentNode;
        org.jsoup.select.Elements elements51 = document48.getElementsByIndexLessThan((int) 'a');
        org.jsoup.select.Elements elements53 = elements51.val("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.select.Elements elements55 = elements53.append("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        java.lang.String str57 = elements55.attr("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        elements55.clear();
        org.jsoup.select.Elements elements59 = new org.jsoup.select.Elements((java.util.List<org.jsoup.nodes.Element>) elements55);
        org.jsoup.nodes.Element element60 = elements55.first();
        org.jsoup.nodes.Evaluator.IndexLessThan indexLessThan62 = new org.jsoup.nodes.Evaluator.IndexLessThan((int) (byte) -1);
        org.jsoup.nodes.Document document65 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node66 = document65.parentNode;
        org.jsoup.select.Elements elements68 = document65.getElementsByIndexLessThan((int) 'a');
        boolean boolean69 = indexLessThan62.matches((org.jsoup.nodes.Element) document65);
        org.jsoup.nodes.Document document72 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node73 = document72.parentNode;
        org.jsoup.select.Elements elements74 = document72.getAllElements();
        org.jsoup.select.Elements elements75 = org.jsoup.select.Collector.collect((org.jsoup.nodes.Evaluator) indexLessThan62, (org.jsoup.nodes.Element) document72);
        org.jsoup.nodes.Element element76 = document72.body();
        int int77 = elements55.indexOf((java.lang.Object) document72);
        boolean boolean78 = elements30.addAll((java.util.Collection<org.jsoup.nodes.Element>) elements55);
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(document16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str17, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document20);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(attributes26);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertNotNull(elements30);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertNotNull(document34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str35, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(elements36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNotNull(element39);
        org.junit.Assert.assertNull(node40);
        org.junit.Assert.assertNotNull(elements43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "<html>\n    <head>\n    </head>\n    <body>\n     &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;\n    </body>\n   </html>\n<head>\n    </head>\n    <body>\n     &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;\n    </body>\n\n&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;" + "'", str45, "<html>\n    <head>\n    </head>\n    <body>\n     &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;\n    </body>\n   </html>\n<head>\n    </head>\n    <body>\n     &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;\n    </body>\n\n&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;");
        org.junit.Assert.assertNotNull(document48);
        org.junit.Assert.assertNull(node49);
        org.junit.Assert.assertNotNull(elements51);
        org.junit.Assert.assertNotNull(elements53);
        org.junit.Assert.assertNotNull(elements55);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertNull(element60);
        org.junit.Assert.assertNotNull(document65);
        org.junit.Assert.assertNull(node66);
        org.junit.Assert.assertNotNull(elements68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(document72);
        org.junit.Assert.assertNull(node73);
        org.junit.Assert.assertNotNull(elements74);
        org.junit.Assert.assertNotNull(elements75);
        org.junit.Assert.assertNotNull(element76);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + (-1) + "'", int77 == (-1));
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1561");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node3 = document2.parentNode;
        org.jsoup.select.Elements elements5 = document2.getElementsByIndexLessThan((int) 'a');
        java.lang.String str6 = document2.text();
        org.jsoup.nodes.Element element8 = document2.text("");
        org.jsoup.nodes.Element element11 = document2.attr("!", "#text");
        org.jsoup.select.Elements elements13 = document2.getElementsByClass("hi=\"\" hi!hi=\"\"hi=\"\"hi=\"\" hi=\"\" hi!hi=\"\"hi=\"\" hi=\"\" hi!hi=\"\"");
        org.jsoup.select.Elements elements15 = document2.getElementsByIndexEquals((int) 'h');
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor16 = elements15.listIterator();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(elementItor16);
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1562");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str3 = document2.outerHtml();
        org.jsoup.nodes.Document document6 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node7 = document6.parentNode;
        java.lang.String str8 = document6.title();
        org.jsoup.nodes.Element element10 = document6.text("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element11 = document2.appendChild((org.jsoup.nodes.Node) document6);
        org.jsoup.nodes.Element element13 = document2.removeClass("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html><#root>\n<html>\n <head>\n </head>\n <body>\n  &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;\n </body>\n</html>\n</#root>");
        java.lang.String str14 = document2.text();
        org.jsoup.nodes.Element element16 = document2.addClass("#document");
        java.lang.String str17 = element16.baseUri;
        org.jsoup.nodes.Element element19 = element16.prependText("hi! hi! hi!");
        org.jsoup.nodes.Document document22 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str23 = document22.outerHtml();
        org.jsoup.select.Elements elements24 = document22.getAllElements();
        java.lang.String str25 = document22.data();
        java.lang.String str26 = document22.baseUri();
        org.jsoup.nodes.Element element27 = element16.appendChild((org.jsoup.nodes.Node) document22);
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str3, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi! <html> <head> </head> <body> hi! </body> </html>" + "'", str14, "hi! <html> <head> </head> <body> hi! </body> </html>");
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(document22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str23, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(elements24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertNotNull(element27);
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1563");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str3 = document2.outerHtml();
        org.jsoup.nodes.Document document6 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node7 = document6.parentNode;
        java.lang.String str8 = document6.title();
        org.jsoup.nodes.Element element10 = document6.text("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element11 = document2.appendChild((org.jsoup.nodes.Node) document6);
        org.jsoup.nodes.Element element13 = document2.removeClass("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html><#root>\n<html>\n <head>\n </head>\n <body>\n  &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;\n </body>\n</html>\n</#root>");
        java.lang.String str14 = document2.text();
        org.jsoup.select.Elements elements16 = document2.getElementsByIndexLessThan((int) (byte) 1);
        document2.title(" !");
        java.lang.String str19 = document2.id();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str3, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi! <html> <head> </head> <body> hi! </body> </html>" + "'", str14, "hi! <html> <head> </head> <body> hi! </body> </html>");
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1564");
        org.jsoup.nodes.DataNode dataNode2 = new org.jsoup.nodes.DataNode("hi", "<html class=\" hi\">\n<head class=\" hi\">\n</head>\n<body class=\" hi\"> hi!\n</body>\n</html>\n<head class=\" hi\">\n</head>\n<body class=\" hi\"> hi!\n</body>\n\nhi!");
        java.lang.String str3 = dataNode2.toString();
        java.lang.String str4 = dataNode2.nodeName();
        org.jsoup.nodes.Evaluator.IndexGreaterThan indexGreaterThan6 = new org.jsoup.nodes.Evaluator.IndexGreaterThan((int) (byte) 10);
        org.jsoup.nodes.Document document8 = new org.jsoup.nodes.Document(" hi=\"\"");
        boolean boolean9 = indexGreaterThan6.matches((org.jsoup.nodes.Element) document8);
        dataNode2.setParentNode((org.jsoup.nodes.Node) document8);
        boolean boolean11 = document8.hasText();
        org.jsoup.nodes.Element element13 = document8.toggleClass("[4]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi" + "'", str3, "hi");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#data" + "'", str4, "#data");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(element13);
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1565");
        org.jsoup.nodes.Evaluator.AttributeWithValueEnding attributeWithValueEnding2 = new org.jsoup.nodes.Evaluator.AttributeWithValueEnding("\n<!---->", "hi!");
        org.jsoup.nodes.Document document5 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str6 = document5.outerHtml();
        document5.setBaseUri("hi");
        boolean boolean9 = attributeWithValueEnding2.matches((org.jsoup.nodes.Element) document5);
        attributeWithValueEnding2.value = "hi! <html> <head> </head> <body> hi! </body> </html>";
        org.jsoup.nodes.Document document14 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str15 = document14.outerHtml();
        org.jsoup.nodes.Document document18 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node19 = document18.parentNode;
        java.lang.String str20 = document18.title();
        org.jsoup.nodes.Element element22 = document18.text("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element23 = document14.appendChild((org.jsoup.nodes.Node) document18);
        java.lang.String str24 = element23.outerHtml();
        boolean boolean25 = attributeWithValueEnding2.matches(element23);
        org.jsoup.nodes.Element element27 = element23.prependElement("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element28 = element27.firstElementSibling();
        java.lang.String str29 = element28.toString();
        org.jsoup.nodes.Document document32 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str33 = document32.outerHtml();
        org.jsoup.select.Elements elements34 = document32.getAllElements();
        java.lang.String str35 = document32.data();
        org.jsoup.nodes.Element element37 = document32.text("");
        org.jsoup.nodes.Node node38 = document32.parentNode;
        org.jsoup.select.Elements elements40 = document32.getElementsByIndexGreaterThan((int) '4');
        org.jsoup.nodes.Element element42 = document32.text("hi=\"\"");
        boolean boolean43 = document32.hasText();
        org.jsoup.nodes.Element element45 = document32.text("hi=\"\"");
        org.jsoup.nodes.Element element47 = element45.removeClass("#declaration");
        element28.addChild((org.jsoup.nodes.Node) element47);
        org.junit.Assert.assertNotNull(document5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str6, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(document14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str15, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document18);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html><#root>\n<html>\n <head>\n </head>\n <body>\n  &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;\n </body>\n</html>\n</#root>" + "'", str24, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html><#root>\n<html>\n <head>\n </head>\n <body>\n  &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;\n </body>\n</html>\n</#root>");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "\n<<html>\n<head>\n</head>\n<body>\n</body>\n</html>>\n</<html>\n<head>\n</head>\n<body>\n</body>\n</html>>" + "'", str29, "\n<<html>\n<head>\n</head>\n<body>\n</body>\n</html>>\n</<html>\n<head>\n</head>\n<body>\n</body>\n</html>>");
        org.junit.Assert.assertNotNull(document32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str33, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(elements34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(element37);
        org.junit.Assert.assertNull(node38);
        org.junit.Assert.assertNotNull(elements40);
        org.junit.Assert.assertNotNull(element42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(element45);
        org.junit.Assert.assertNotNull(element47);
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1566");
        org.jsoup.nodes.Evaluator.Attribute attribute1 = new org.jsoup.nodes.Evaluator.Attribute("<html>\n<head>\n hi=&quot;&quot;\n</head>\n<body> hi!hi=&quot;&quot;\n</body>hi=&quot;&quot;\n</html>hi=&quot;&quot;\n\n<html>\n<head>\n hi=&quot;&quot;\n</head>\n<body> hi!hi=&quot;&quot;\n</body>hi=&quot;&quot;\n</html>\n\n<head>\n hi=&quot;&quot;\n</head>\n\n<body> hi!hi=&quot;&quot;\n</body>");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element5 = document3.text("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>\n<head>\n</head>\n<body> hi!\n</body>\n\nhi!");
        int int6 = element5.nodeDepth();
        boolean boolean7 = attribute1.matches(element5);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1567");
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parseBodyFragment("<html>\n<head>\n</head>\n<body>\n</body>\n</html><<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>>\n</<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>><hi!>\n</hi!>");
        java.lang.String str3 = document2.nodeName();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements4 = org.jsoup.select.Selector.select("<html class=\" hi\" head=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt; hi!\n&lt;/body&gt;\n&lt;/html&gt;\" value=\"#text\">\n<head class=\" hi\" head=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt; hi!\n&lt;/body&gt;\n&lt;/html&gt;\" value=\"#text\">\n</head>\n<body class=\" hi\" head=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt; hi!\n&lt;/body&gt;\n&lt;/html&gt;\" value=\"#text\"> hi!\n</body>\n</html>\n\n<html class=\" hi\" head=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt; hi!\n&lt;/body&gt;\n&lt;/html&gt;\" value=\"#text\">\n<head class=\" hi\" head=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt; hi!\n&lt;/body&gt;\n&lt;/html&gt;\" value=\"#text\">\n</head>\n<body class=\" hi\" head=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt; hi!\n&lt;/body&gt;\n&lt;/html&gt;\" value=\"#text\"> hi!\n</body>\n</html>\n\n<head class=\" hi\" head=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt; hi!\n&lt;/body&gt;\n&lt;/html&gt;\" value=\"#text\">\n</head>\n\n<body class=\" hi\" head=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt; hi!\n&lt;/body&gt;\n&lt;/html&gt;\" value=\"#text\"> hi!\n</body>", (org.jsoup.nodes.Element) document2);
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query <html class=\" hi\" head=\"&lt;html&gt;?&lt;head&gt;?&lt;/head&gt;?&lt;body&gt; hi!?&lt;/body&gt;?&lt;/html&gt;\" value=\"#text\">?<head class=\" hi\" head=\"&lt;html&gt;?&lt;head&gt;?&lt;/head&gt;?&lt;body&gt; hi!?&lt;/body&gt;?&lt;/html&gt;\" value=\"#text\">?</head>?<body class=\" hi\" head=\"&lt;html&gt;?&lt;head&gt;?&lt;/head&gt;?&lt;body&gt; hi!?&lt;/body&gt;?&lt;/html&gt;\" value=\"#text\"> hi!?</body>?</html>??<html class=\" hi\" head=\"&lt;html&gt;?&lt;head&gt;?&lt;/head&gt;?&lt;body&gt; hi!?&lt;/body&gt;?&lt;/html&gt;\" value=\"#text\">?<head class=\" hi\" head=\"&lt;html&gt;?&lt;head&gt;?&lt;/head&gt;?&lt;body&gt; hi!?&lt;/body&gt;?&lt;/html&gt;\" value=\"#text\">?</head>?<body class=\" hi\" head=\"&lt;html&gt;?&lt;head&gt;?&lt;/head&gt;?&lt;body&gt; hi!?&lt;/body&gt;?&lt;/html&gt;\" value=\"#text\"> hi!?</body>?</html>??<head class=\" hi\" head=\"&lt;html&gt;?&lt;head&gt;?&lt;/head&gt;?&lt;body&gt; hi!?&lt;/body&gt;?&lt;/html&gt;\" value=\"#text\">?</head>??<body class=\" hi\" head=\"&lt;html&gt;?&lt;head&gt;?&lt;/head&gt;?&lt;body&gt; hi!?&lt;/body&gt;?&lt;/html&gt;\" value=\"#text\"> hi!?</body>");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1568");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node3 = document2.parentNode;
        java.lang.String str4 = document2.title();
        org.jsoup.nodes.Attributes attributes5 = document2.attributes();
        org.jsoup.nodes.Document document8 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node9 = document8.parentNode;
        org.jsoup.select.Elements elements11 = document8.getElementsByIndexLessThan((int) 'a');
        org.jsoup.nodes.Element element12 = document2.prependChild((org.jsoup.nodes.Node) document8);
        java.lang.String str13 = document8.baseUri();
        org.jsoup.nodes.Document document16 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str17 = document16.outerHtml();
        org.jsoup.nodes.Document document20 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node21 = document20.parentNode;
        java.lang.String str22 = document20.title();
        org.jsoup.nodes.Element element24 = document20.text("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element25 = document16.appendChild((org.jsoup.nodes.Node) document20);
        org.jsoup.nodes.Attributes attributes26 = document20.attributes();
        document8.addChild((org.jsoup.nodes.Node) document20);
        org.jsoup.nodes.Element element29 = document20.wrap("<html class=\" hi\">\n<head class=\" hi\">\n</head>\n<body class=\" hi\"> hi!\n</body>\n</html>\n<head class=\" hi\">\n</head>\n<body class=\" hi\"> hi!\n</body>\n\nhi!");
        org.jsoup.select.Elements elements30 = element29.getAllElements();
        org.jsoup.nodes.Element element32 = element29.prepend("<!---->=\"\"");
        java.util.List<org.jsoup.nodes.Node> nodeList33 = element29.childNodes;
        org.jsoup.nodes.Document document36 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str37 = document36.outerHtml();
        org.jsoup.select.Elements elements38 = document36.getAllElements();
        java.lang.String str39 = document36.data();
        org.jsoup.nodes.Element element41 = document36.text("");
        org.jsoup.select.Elements elements43 = element41.getElementsByIndexLessThan((int) (byte) -1);
        org.jsoup.nodes.Element element44 = element29.prependChild((org.jsoup.nodes.Node) element41);
        org.jsoup.nodes.Element element46 = element29.wrap("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        element46.setBaseUri("\n<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>\n<html>\n <head>\n </head>\n <body>\n  &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;\n </body>\n</html>");
        org.jsoup.nodes.Element element50 = element46.appendText("<html class=\" hi &lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n [ , !]\n&lt;/body&gt;\n&lt;/html&gt;\" head=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt; hi!\n&lt;/body&gt;\n&lt;/html&gt;\" value=\"#text\">\n<head class=\" hi &lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n [ , !]\n&lt;/body&gt;\n&lt;/html&gt;\" head=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt; hi!\n&lt;/body&gt;\n&lt;/html&gt;\" value=\"#text\">\n</head>\n<body class=\" hi &lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n [ , !]\n&lt;/body&gt;\n&lt;/html&gt;\" head=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt; hi!\n&lt;/body&gt;\n&lt;/html&gt;\" value=\"#text\"> hi!\n</body>\n</html>\n\n<html class=\" hi &lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n [ , !]\n&lt;/body&gt;\n&lt;/html&gt;\" head=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt; hi!\n&lt;/body&gt;\n&lt;/html&gt;\" value=\"#text\">\n<head class=\" hi &lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n [ , !]\n&lt;/body&gt;\n&lt;/html&gt;\" head=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt; hi!\n&lt;/body&gt;\n&lt;/html&gt;\" value=\"#text\">\n</head>\n<body class=\" hi &lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n [ , !]\n&lt;/body&gt;\n&lt;/html&gt;\" head=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt; hi!\n&lt;/body&gt;\n&lt;/html&gt;\" value=\"#text\"> hi!\n</body>\n</html>\n\n<head class=\" hi &lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n [ , !]\n&lt;/body&gt;\n&lt;/html&gt;\" head=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt; hi!\n&lt;/body&gt;\n&lt;/html&gt;\" value=\"#text\">\n</head>\n\n<body class=\" hi &lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n [ , !]\n&lt;/body&gt;\n&lt;/html&gt;\" head=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt; hi!\n&lt;/body&gt;\n&lt;/html&gt;\" value=\"#text\"> hi!\n</body>");
        org.jsoup.nodes.Element element52 = element50.html("<?head>");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(document16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str17, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document20);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(attributes26);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertNotNull(elements30);
        org.junit.Assert.assertNotNull(element32);
        org.junit.Assert.assertNotNull(nodeList33);
        org.junit.Assert.assertNotNull(document36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str37, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(elements38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(element41);
        org.junit.Assert.assertNotNull(elements43);
        org.junit.Assert.assertNotNull(element44);
        org.junit.Assert.assertNotNull(element46);
        org.junit.Assert.assertNotNull(element50);
        org.junit.Assert.assertNotNull(element52);
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1569");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node3 = document2.parentNode;
        org.jsoup.select.Elements elements5 = document2.getElementsByIndexLessThan((int) 'a');
        java.util.stream.Stream<org.jsoup.nodes.Element> elementStream6 = elements5.stream();
        org.jsoup.select.Elements elements8 = elements5.addClass("hi");
        java.lang.String str9 = elements8.html();
        java.lang.String str10 = elements8.val();
        org.jsoup.select.Elements elements12 = elements8.val("hi");
        org.jsoup.nodes.Document document15 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str16 = document15.outerHtml();
        org.jsoup.nodes.Document document19 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node20 = document19.parentNode;
        java.lang.String str21 = document19.title();
        org.jsoup.nodes.Element element23 = document19.text("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element24 = document15.appendChild((org.jsoup.nodes.Node) document19);
        org.jsoup.nodes.Document document27 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node28 = document27.parentNode;
        java.lang.String str29 = document27.title();
        org.jsoup.nodes.Attributes attributes30 = document27.attributes();
        org.jsoup.nodes.Document document33 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node34 = document33.parentNode;
        org.jsoup.select.Elements elements36 = document33.getElementsByIndexLessThan((int) 'a');
        org.jsoup.nodes.Element element37 = document27.prependChild((org.jsoup.nodes.Node) document33);
        org.jsoup.select.Elements elements39 = document27.select("hi");
        org.jsoup.nodes.Element element40 = document19.appendChild((org.jsoup.nodes.Node) document27);
        org.jsoup.nodes.Element element42 = document27.addClass("#declaration");
        boolean boolean43 = elements8.add(element42);
        java.lang.String str44 = elements8.val();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elementStream6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<html class=\" hi\">\n<head class=\" hi\">\n</head>\n<body class=\" hi\"> hi!\n</body>\n</html>\n<head class=\" hi\">\n</head>\n<body class=\" hi\"> hi!\n</body>\n\nhi!" + "'", str9, "<html class=\" hi\">\n<head class=\" hi\">\n</head>\n<body class=\" hi\"> hi!\n</body>\n</html>\n<head class=\" hi\">\n</head>\n<body class=\" hi\"> hi!\n</body>\n\nhi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(document15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str16, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document19);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(document27);
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(attributes30);
        org.junit.Assert.assertNotNull(document33);
        org.junit.Assert.assertNull(node34);
        org.junit.Assert.assertNotNull(elements36);
        org.junit.Assert.assertNotNull(element37);
        org.junit.Assert.assertNotNull(elements39);
        org.junit.Assert.assertNotNull(element40);
        org.junit.Assert.assertNotNull(element42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi" + "'", str44, "hi");
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1570");
        org.jsoup.nodes.Evaluator.Tag tag1 = new org.jsoup.nodes.Evaluator.Tag("hi!");
        org.jsoup.nodes.Document document4 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str5 = document4.outerHtml();
        org.jsoup.nodes.Document document8 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node9 = document8.parentNode;
        java.lang.String str10 = document8.title();
        org.jsoup.nodes.Element element12 = document8.text("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element13 = document4.appendChild((org.jsoup.nodes.Node) document8);
        boolean boolean14 = tag1.matches((org.jsoup.nodes.Element) document4);
        java.lang.String str15 = document4.toString();
        java.lang.String str17 = document4.attr("<html class=\" hi\">\n<head class=\" hi\">\n</head>\n<body class=\" hi\"> hi!\n</body>\n</html>\n<head class=\" hi\">\n</head>\n<body class=\" hi\"> hi!\n</body>\n\nhi!");
        boolean boolean18 = document4.isBlock();
        org.junit.Assert.assertNotNull(document4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str5, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html><#root>\n<html>\n <head>\n </head>\n <body>\n  &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;\n </body>\n</html>\n</#root>" + "'", str15, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html><#root>\n<html>\n <head>\n </head>\n <body>\n  &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;\n </body>\n</html>\n</#root>");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }
}

