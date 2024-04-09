package org.jsoup.parser;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RandoopRegressionTest5 {

    public static boolean debug = false;

    @Test
    public void test2501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2501");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n []\n&lt;/body&gt;\n&lt;/html&gt;", "");
        org.junit.Assert.assertNotNull(document2);
    }

    @Test
    public void test2502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2502");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.hasText();
        java.lang.String str3 = document1.nodeName();
        org.jsoup.select.Elements elements4 = document1.children();
        org.jsoup.select.Elements elements6 = elements4.append("\n<!--#document#document-->");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(elements6);
    }

    @Test
    public void test2503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2503");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        java.lang.String str4 = elements3.val();
        java.lang.Object obj5 = null;
        int int6 = elements3.lastIndexOf(obj5);
        org.jsoup.select.Elements elements8 = elements3.eq((int) '#');
        boolean boolean10 = elements3.hasAttr("#root");
        boolean boolean12 = elements3.is("#root=\"hi!\"");
        org.jsoup.nodes.Document document14 = org.jsoup.Jsoup.parseBodyFragment("# ");
        boolean boolean15 = elements3.contains((java.lang.Object) document14);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(document14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2504");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        java.lang.String str4 = elements3.outerHtml();
        java.lang.String str5 = elements3.val();
        org.jsoup.select.Elements elements6 = new org.jsoup.select.Elements((java.util.List<org.jsoup.nodes.Element>) elements3);
        java.lang.String str8 = elements3.attr("org.jsoup.select.Selector$SelectorParseException: ");
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor9 = elements3.listIterator();
        org.jsoup.select.Elements elements11 = elements3.select("<!--#document-->");
        org.jsoup.nodes.Document document13 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements15 = document13.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements17 = elements15.prepend("");
        org.jsoup.select.Elements elements19 = elements17.removeAttr("");
        org.jsoup.nodes.Document document21 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements23 = document21.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements25 = elements23.prepend("");
        org.jsoup.select.Elements elements27 = elements25.removeAttr("");
        boolean boolean28 = elements17.containsAll((java.util.Collection<org.jsoup.nodes.Element>) elements25);
        org.jsoup.nodes.Document document30 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements32 = document30.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements34 = elements32.prepend("");
        org.jsoup.select.Elements elements36 = elements34.removeAttr("");
        org.jsoup.nodes.Document document38 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements40 = document38.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements42 = elements40.prepend("");
        org.jsoup.select.Elements elements44 = elements42.removeAttr("");
        boolean boolean45 = elements34.containsAll((java.util.Collection<org.jsoup.nodes.Element>) elements42);
        org.jsoup.select.Elements elements47 = elements42.wrap("#root");
        boolean boolean48 = elements25.containsAll((java.util.Collection<org.jsoup.nodes.Element>) elements47);
        org.jsoup.select.Elements elements50 = elements25.removeClass("");
        org.jsoup.select.Elements elements53 = elements50.attr("#data", " class=\"hi!\"");
        org.jsoup.select.Elements elements56 = elements53.attr("<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "[#, d, o, c, u, m, e, n, t]");
        boolean boolean57 = elements3.containsAll((java.util.Collection<org.jsoup.nodes.Element>) elements56);
        org.jsoup.select.Elements elements59 = elements3.val("<html>\n<head>\n</head>\n<body>\n org.jsoup.select.selector$selectorparseexception:\n</body>\n</html>");
        boolean boolean61 = elements59.hasClass("#comment");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(elementItor9);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertNotNull(elements23);
        org.junit.Assert.assertNotNull(elements25);
        org.junit.Assert.assertNotNull(elements27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(elements32);
        org.junit.Assert.assertNotNull(elements34);
        org.junit.Assert.assertNotNull(elements36);
        org.junit.Assert.assertNotNull(elements40);
        org.junit.Assert.assertNotNull(elements42);
        org.junit.Assert.assertNotNull(elements44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(elements47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(elements50);
        org.junit.Assert.assertNotNull(elements53);
        org.junit.Assert.assertNotNull(elements56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(elements59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
    }

    @Test
    public void test2505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2505");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements5 = elements3.prepend("");
        org.jsoup.select.Elements elements7 = elements5.removeAttr("");
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements11 = document9.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements13 = elements11.prepend("");
        org.jsoup.select.Elements elements15 = elements13.removeAttr("");
        boolean boolean16 = elements5.containsAll((java.util.Collection<org.jsoup.nodes.Element>) elements13);
        java.lang.Object[] objArray17 = elements5.toArray();
        org.jsoup.nodes.Document document19 = new org.jsoup.nodes.Document("");
        boolean boolean20 = document19.hasText();
        java.lang.String str21 = document19.nodeName();
        java.lang.String str22 = document19.val();
        boolean boolean23 = elements5.add((org.jsoup.nodes.Element) document19);
        org.jsoup.nodes.Element element25 = document19.appendText("#document#documenthi!");
        java.lang.String str26 = document19.tagName();
        java.lang.String str27 = document19.title();
        org.jsoup.select.Elements elements30 = document19.getElementsByAttributeValueContaining("<#root hi!=\"#root\">\n</#root>", "class=\"hi!\"");
        boolean boolean32 = document19.hasClass("<html>\n<head>\n</head>\n<body>\n</body>\n</html>=\"\"=\"hi!\"");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "#document" + "'", str21, "#document");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "#root" + "'", str26, "#root");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(elements30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test2506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2506");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.hasText();
        boolean boolean3 = document1.hasText();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        boolean boolean6 = document5.hasText();
        java.lang.String str7 = document5.nodeName();
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet10 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet10, strArray9);
        org.jsoup.nodes.Element element12 = document5.classNames((java.util.Set<java.lang.String>) strSet10);
        org.jsoup.nodes.Element element13 = document1.classNames((java.util.Set<java.lang.String>) strSet10);
        org.jsoup.nodes.Document document15 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element18 = document15.attr("hi!", "#root");
        java.lang.String str19 = document15.id();
        org.jsoup.select.Elements elements20 = document15.children();
        org.jsoup.nodes.Element element21 = document1.prependChild((org.jsoup.nodes.Node) document15);
        java.lang.String str23 = element21.attr("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#document" + "'", str7, "#document");
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(elements20);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test2507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2507");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Document document2 = document1.normalise();
        org.jsoup.nodes.Element element3 = document2.head();
        org.jsoup.nodes.Element element6 = document2.attr("org.jsoup.select.Selector$SelectorParseException: ", "[]");
        org.jsoup.select.Elements elements9 = document2.getElementsByAttributeValueContaining("hi!=\"#root=&quot;hi!&quot;\"", "#root");
        java.lang.String str11 = elements9.attr("<html>\n<head>\n</head>\n<body>\n</body>\n</html>=\"\"");
        int int12 = elements9.size();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test2508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2508");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.hasText();
        java.lang.String str3 = document1.nodeName();
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        org.jsoup.nodes.Element element8 = document1.classNames((java.util.Set<java.lang.String>) strSet6);
        org.jsoup.nodes.Element element10 = document1.append("#document");
        org.jsoup.nodes.Element element12 = document1.prepend("#document");
        org.jsoup.nodes.Attributes attributes13 = element12.attributes();
        org.jsoup.nodes.Document document15 = org.jsoup.Jsoup.parse("hi!");
        org.jsoup.select.Elements elements18 = document15.getElementsByAttributeValue("hi!", "hi!");
        org.jsoup.nodes.Attributes attributes19 = document15.attributes();
        attributes19.remove("#root=\"hi!\"");
        attributes13.addAll(attributes19);
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor23 = attributes19.iterator();
        org.jsoup.nodes.Attributes attributes24 = new org.jsoup.nodes.Attributes();
        int int25 = attributes24.size();
        java.lang.String str26 = attributes24.html();
        java.lang.String str27 = attributes24.html();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator28 = attributes24.spliterator();
        boolean boolean30 = attributes24.hasKey("");
        org.jsoup.parser.Tag tag32 = org.jsoup.parser.Tag.valueOf("org.jsoup.select.Selector$SelectorParseException: ");
        boolean boolean33 = tag32.isData();
        org.jsoup.nodes.Attributes attributes35 = new org.jsoup.nodes.Attributes();
        int int36 = attributes35.size();
        java.lang.String str37 = attributes35.html();
        org.jsoup.nodes.Element element38 = new org.jsoup.nodes.Element(tag32, "org.jsoup.select.selector$selectorparseexception:", attributes35);
        org.jsoup.nodes.Attribute attribute41 = org.jsoup.nodes.Attribute.createFromEncoded("hi!", "hi!");
        attribute41.setKey("#root");
        java.lang.String str44 = attribute41.html();
        attributes35.put(attribute41);
        java.lang.String str46 = attribute41.html();
        attribute41.setValue("<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        attributes24.put(attribute41);
        java.lang.String str51 = attributes24.get("[#, d, o, c, u, m, e, n, t, #, d, o, c, u, m, e, n, t, =, \", #, d, o, c, u, m, e, n, t, #, d, o, c, u, m, e, n, t, \"]");
        attributes19.addAll(attributes24);
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor53 = attributes19.iterator();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator54 = attributes19.spliterator();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertNotNull(document15);
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertNotNull(attributes19);
        org.junit.Assert.assertNotNull(attributeItor23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(attributeSpliterator28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(tag32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNotNull(attribute41);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "#root=\"hi!\"" + "'", str44, "#root=\"hi!\"");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "#root=\"hi!\"" + "'", str46, "#root=\"hi!\"");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertNotNull(attributeItor53);
        org.junit.Assert.assertNotNull(attributeSpliterator54);
    }

    @Test
    public void test2509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2509");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        java.lang.String str5 = elements3.attr("#root");
        org.jsoup.nodes.Document document7 = new org.jsoup.nodes.Document("");
        boolean boolean8 = document7.hasText();
        java.lang.String str9 = document7.nodeName();
        org.jsoup.select.Elements elements10 = document7.children();
        org.jsoup.nodes.Element element12 = document7.prependElement("[#, d, o, c, u, m, e, n, t]");
        int int13 = elements3.lastIndexOf((java.lang.Object) document7);
        java.lang.String str14 = document7.data();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element16 = document7.createElement("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#document" + "'", str9, "#document");
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test2510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2510");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.hasText();
        java.lang.String str3 = document1.nodeName();
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        org.jsoup.nodes.Element element8 = document1.classNames((java.util.Set<java.lang.String>) strSet6);
        org.jsoup.nodes.Element element10 = document1.append("#document");
        org.jsoup.nodes.Element element12 = element10.html("");
        org.jsoup.nodes.Element element15 = element10.attr("#root", "hi!");
        org.jsoup.nodes.Element element16 = element10.parent();
        org.jsoup.nodes.Document document19 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements21 = document19.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements23 = elements21.prepend("");
        elements23.clear();
        int int26 = elements23.indexOf((java.lang.Object) "org.jsoup.select.Selector$SelectorParseException: ");
        org.jsoup.select.Elements elements28 = elements23.removeClass("#data");
        org.jsoup.select.Elements elements29 = org.jsoup.select.Selector.select("#data", (java.lang.Iterable<org.jsoup.nodes.Element>) elements28);
        org.jsoup.nodes.Document document32 = org.jsoup.parser.Parser.parse("#root", "");
        java.lang.String str33 = document32.outerHtml();
        org.jsoup.nodes.Element element35 = document32.append("<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        org.jsoup.select.Elements elements37 = document32.getElementsByIndexEquals(1);
        boolean boolean39 = elements37.contains((java.lang.Object) "#comment");
        org.jsoup.select.Elements elements40 = elements37.parents();
        boolean boolean41 = elements29.addAll((java.util.Collection<org.jsoup.nodes.Element>) elements40);
        org.jsoup.nodes.Element element42 = elements29.first();
        java.util.Set<java.lang.String> strSet43 = element42.classNames();
        org.jsoup.nodes.Element element45 = element42.prependElement("<html>\n<head>\n</head>\n<body>\n []\n</body>\n</html>");
        boolean boolean46 = element10.equals((java.lang.Object) element45);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNull(element16);
        org.junit.Assert.assertNotNull(elements21);
        org.junit.Assert.assertNotNull(elements23);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(elements28);
        org.junit.Assert.assertNotNull(elements29);
        org.junit.Assert.assertNotNull(document32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>" + "'", str33, "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertNotNull(elements37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(elements40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(element42);
        org.junit.Assert.assertNotNull(strSet43);
        org.junit.Assert.assertNotNull(element45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test2511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2511");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.hasText();
        java.lang.String str3 = document1.nodeName();
        java.lang.String str4 = document1.val();
        java.lang.String str5 = document1.outerHtml();
        java.lang.String[] strArray8 = new java.lang.String[] { "\n<!--#document-->", "#data" };
        java.util.LinkedHashSet<java.lang.String> strSet9 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet9, strArray8);
        org.jsoup.nodes.Element element11 = document1.classNames((java.util.Set<java.lang.String>) strSet9);
        org.jsoup.nodes.Document document12 = document1.normalise();
        org.jsoup.select.Elements elements15 = document12.getElementsByAttributeValueStarting("#declaration", "#document#document=\"#document#document\"");
        org.jsoup.select.Elements elements17 = document12.getElementsByIndexGreaterThan((int) (short) 0);
        java.lang.String str18 = document12.nodeName();
        java.lang.String str19 = document12.className();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "#document" + "'", str18, "#document");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\n<!--#document--> #data" + "'", str19, "\n<!--#document--> #data");
    }

    @Test
    public void test2512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2512");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Document document2 = document1.normalise();
        java.lang.String str3 = document1.nodeName();
        java.lang.String str4 = document1.val();
        org.jsoup.nodes.Document document6 = new org.jsoup.nodes.Document("");
        boolean boolean7 = document6.hasText();
        boolean boolean8 = document6.hasText();
        org.jsoup.nodes.Document document10 = new org.jsoup.nodes.Document("");
        boolean boolean11 = document10.hasText();
        java.lang.String str12 = document10.nodeName();
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet15 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet15, strArray14);
        org.jsoup.nodes.Element element17 = document10.classNames((java.util.Set<java.lang.String>) strSet15);
        org.jsoup.nodes.Element element18 = document6.classNames((java.util.Set<java.lang.String>) strSet15);
        org.jsoup.nodes.Element element20 = document6.appendText("hi!");
        org.jsoup.parser.Tag tag21 = document6.tag();
        org.jsoup.nodes.Element element22 = document1.prependChild((org.jsoup.nodes.Node) document6);
        org.jsoup.nodes.Element element23 = document1.body();
        org.jsoup.nodes.Element element24 = element23.empty();
        org.jsoup.select.Elements elements27 = element23.getElementsByAttributeValue("&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n []\n&lt;/body&gt;\n&lt;/html&gt;", "&lt;?hi!&gt;");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "#document" + "'", str12, "#document");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(tag21);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(elements27);
    }

    @Test
    public void test2513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2513");
        org.jsoup.nodes.DataNode dataNode2 = new org.jsoup.nodes.DataNode(" class=&quot;hi!&quot;", "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Node node4 = dataNode2.removeAttr("a");
        java.lang.String str5 = dataNode2.nodeName();
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#data" + "'", str5, "#data");
    }

    @Test
    public void test2514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2514");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        java.lang.String str4 = elements3.val();
        java.lang.Object obj5 = null;
        int int6 = elements3.lastIndexOf(obj5);
        org.jsoup.select.Elements elements8 = elements3.eq((int) '#');
        boolean boolean10 = elements3.hasAttr("#root");
        org.jsoup.select.Elements elements11 = new org.jsoup.select.Elements((java.util.List<org.jsoup.nodes.Element>) elements3);
        java.util.stream.Stream<org.jsoup.nodes.Element> elementStream12 = elements3.parallelStream();
        org.jsoup.select.Elements elements15 = elements3.attr("<html> \n <head> \n </head> \n <body>\n   #root  \n </body>\n</html>", "");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(elementStream12);
        org.junit.Assert.assertNotNull(elements15);
    }

    @Test
    public void test2515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2515");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Document document2 = document1.normalise();
        java.lang.String str3 = document1.nodeName();
        java.lang.String str4 = document1.val();
        org.jsoup.nodes.Attributes attributes5 = document1.attributes();
        int int6 = attributes5.size();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test2516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2516");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.hasText();
        java.lang.String str3 = document1.nodeName();
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        org.jsoup.nodes.Element element8 = document1.classNames((java.util.Set<java.lang.String>) strSet6);
        org.jsoup.nodes.Element element10 = document1.append("#document");
        org.jsoup.nodes.Element element12 = element10.html("");
        org.jsoup.nodes.Element element15 = element10.attr("#root", "hi!");
        org.jsoup.select.Elements elements17 = element15.getElementsByAttribute("\n&lt;!--#root--&gt;");
        org.jsoup.nodes.Document document21 = org.jsoup.Jsoup.parse("#root=\"hi!\"", "body");
        org.jsoup.parser.Tag tag22 = document21.tag();
        org.jsoup.nodes.Element element24 = document21.text("<#document#document=\"#document#document\">\n</#document#document=\"#document#document\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element25 = elements17.set(1, element24);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertNotNull(document21);
        org.junit.Assert.assertNotNull(tag22);
        org.junit.Assert.assertNotNull(element24);
    }

    @Test
    public void test2517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2517");
        org.jsoup.nodes.Document document2 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document2.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements6 = elements4.prepend("");
        org.jsoup.select.Elements elements8 = elements6.removeAttr("");
        org.jsoup.nodes.Document document10 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements12 = document10.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements14 = elements12.prepend("");
        org.jsoup.select.Elements elements16 = elements14.removeAttr("");
        boolean boolean17 = elements6.containsAll((java.util.Collection<org.jsoup.nodes.Element>) elements14);
        java.lang.Object[] objArray18 = elements6.toArray();
        org.jsoup.select.Elements elements20 = elements6.select("#document#document");
        org.jsoup.select.Elements elements21 = org.jsoup.select.Selector.select("hi!", (java.lang.Iterable<org.jsoup.nodes.Element>) elements6);
        org.jsoup.select.Elements elements24 = elements6.attr("", "");
        org.jsoup.select.Elements elements26 = elements6.wrap("&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[]");
        org.junit.Assert.assertNotNull(elements20);
        org.junit.Assert.assertNotNull(elements21);
        org.junit.Assert.assertNotNull(elements24);
        org.junit.Assert.assertNotNull(elements26);
    }

    @Test
    public void test2518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2518");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Document document2 = document1.normalise();
        org.jsoup.nodes.Element element3 = document1.head();
        org.jsoup.nodes.Element element5 = element3.append("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        boolean boolean7 = element5.equals((java.lang.Object) "#root=\"hi!\"");
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        boolean boolean10 = document9.hasText();
        java.lang.String str11 = document9.nodeName();
        java.lang.String str12 = document9.val();
        java.lang.String str13 = document9.outerHtml();
        java.lang.String[] strArray16 = new java.lang.String[] { "\n<!--#document-->", "#data" };
        java.util.LinkedHashSet<java.lang.String> strSet17 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet17, strArray16);
        org.jsoup.nodes.Element element19 = document9.classNames((java.util.Set<java.lang.String>) strSet17);
        org.jsoup.nodes.Element element20 = element5.classNames((java.util.Set<java.lang.String>) strSet17);
        org.jsoup.nodes.Element element22 = element20.val("#document");
        org.jsoup.select.Elements elements24 = element22.getElementsByIndexEquals((int) (byte) -1);
        org.jsoup.parser.TokenQueue tokenQueue26 = new org.jsoup.parser.TokenQueue("");
        tokenQueue26.addFirst((java.lang.Character) ' ');
        boolean boolean29 = tokenQueue26.matchesWord();
        boolean boolean30 = tokenQueue26.matchesWord();
        boolean boolean31 = elements24.equals((java.lang.Object) tokenQueue26);
        java.lang.String str33 = elements24.attr("<?>");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#document" + "'", str11, "#document");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(elements24);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
    }

    @Test
    public void test2519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2519");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("#comment");
        org.jsoup.nodes.Element element3 = document1.val(" #comment=\"\"");
        java.lang.String str4 = document1.html();
        java.util.Set<java.lang.String> strSet5 = document1.classNames();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>" + "'", str4, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.junit.Assert.assertNotNull(strSet5);
    }

    @Test
    public void test2520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2520");
        org.jsoup.nodes.Evaluator evaluator0 = null;
        org.jsoup.nodes.Document document2 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document2.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element6 = document2.prepend("#document");
        org.jsoup.nodes.Element element7 = element6.empty();
        org.jsoup.select.Elements elements9 = element7.getElementsByIndexLessThan(10);
        org.jsoup.nodes.Document document11 = org.jsoup.Jsoup.parse("hi!");
        org.jsoup.select.Elements elements13 = document11.getElementsByAttribute("org.jsoup.select.selector$selectorparseexception:");
        org.jsoup.nodes.Element element14 = element7.prependChild((org.jsoup.nodes.Node) document11);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements15 = org.jsoup.select.Collector.collect(evaluator0, element14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(element14);
    }

    @Test
    public void test2521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2521");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("#document", "");
        org.jsoup.nodes.Element element4 = document2.addClass("hi!");
        org.jsoup.nodes.Element element5 = document2.body();
        org.jsoup.nodes.Element element6 = document2.body();
        java.lang.String str7 = document2.html();
        java.lang.String str9 = document2.attr("org.jsoup.select.Selector$SelectorParseException: org.jsoup.select.selector$selectorparseexception:");
        org.jsoup.nodes.Element element11 = document2.child(0);
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<html>\n<head>\n</head>\n<body>\n #document\n</body>\n</html>" + "'", str7, "<html>\n<head>\n</head>\n<body>\n #document\n</body>\n</html>");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(element11);
    }

    @Test
    public void test2522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2522");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("#root", "");
        org.jsoup.nodes.Element element5 = document2.attr("#root", "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        java.lang.String str6 = element5.id();
        org.jsoup.nodes.Element element8 = element5.html("\n<!--org.jsoup.select.selector$selectorparseexception: org.jsoup.select.selector$selectorparseexception:=\"#root\"-->");
        org.jsoup.nodes.TextNode textNode11 = org.jsoup.nodes.TextNode.createFromEncoded(" class=\"hi!\"", "org.jsoup.select.Selector$SelectorParseException: ");
        java.lang.String str12 = textNode11.toString();
        java.lang.String str13 = textNode11.nodeName();
        org.jsoup.nodes.TextNode textNode15 = textNode11.text("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.lang.String str16 = textNode15.nodeName();
        org.jsoup.nodes.Element element17 = element8.appendChild((org.jsoup.nodes.Node) textNode15);
        org.jsoup.nodes.Element element19 = element17.addClass("#document#documentdocument");
        org.jsoup.nodes.Element element21 = element19.prepend("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements23 = element21.select("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query <html>?<head>?</head>?<body>?</body>?</html>");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(textNode11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + " class=&quot;hi!&quot;" + "'", str12, " class=&quot;hi!&quot;");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "#text" + "'", str13, "#text");
        org.junit.Assert.assertNotNull(textNode15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "#text" + "'", str16, "#text");
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(element21);
    }

    @Test
    public void test2523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2523");
        org.jsoup.nodes.DataNode dataNode2 = org.jsoup.nodes.DataNode.createFromEncoded(" class=\"hi!\" #root=\"hi!\"", "<!--#root-->\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.junit.Assert.assertNotNull(dataNode2);
    }

    @Test
    public void test2524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2524");
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parseBodyFragment("#data", "[#, d, o, c, u, m, e, n, t]");
        org.jsoup.nodes.Element element3 = document2.head();
        org.jsoup.nodes.Element element5 = element3.toggleClass("#data=\"\"");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
    }

    @Test
    public void test2525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2525");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        java.lang.String str4 = elements3.val();
        java.lang.Object obj5 = null;
        int int6 = elements3.lastIndexOf(obj5);
        org.jsoup.select.Elements elements8 = elements3.eq((int) '#');
        boolean boolean10 = elements3.hasAttr("#root");
        org.jsoup.select.Elements elements11 = new org.jsoup.select.Elements((java.util.List<org.jsoup.nodes.Element>) elements3);
        java.util.stream.Stream<org.jsoup.nodes.Element> elementStream12 = elements3.parallelStream();
        org.jsoup.nodes.Document document14 = org.jsoup.nodes.Document.createShell(" class=&quot;hi!&quot;");
        boolean boolean15 = elements3.equals((java.lang.Object) " class=&quot;hi!&quot;");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(elementStream12);
        org.junit.Assert.assertNotNull(document14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2526");
        org.jsoup.nodes.Document document3 = org.jsoup.parser.Parser.parse("#root", "");
        org.jsoup.nodes.Element element6 = document3.attr("#root", "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        java.lang.String str7 = document3.tagName();
        java.lang.String str8 = document3.toString();
        org.jsoup.nodes.Document document10 = new org.jsoup.nodes.Document("");
        boolean boolean11 = document10.hasText();
        java.lang.String str12 = document10.nodeName();
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet15 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet15, strArray14);
        org.jsoup.nodes.Element element17 = document10.classNames((java.util.Set<java.lang.String>) strSet15);
        org.jsoup.nodes.Element element19 = document10.append("#document");
        org.jsoup.nodes.Element element21 = element19.html("<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        org.jsoup.nodes.Element element22 = document3.appendChild((org.jsoup.nodes.Node) element21);
        org.jsoup.select.Elements elements23 = org.jsoup.select.Selector.select("#text", element21);
        org.jsoup.nodes.Element element25 = element21.appendElement("<?#document#document>");
        org.jsoup.select.Elements elements28 = element25.getElementsByAttributeValueNot("class=\"hi!\"", "head");
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#root" + "'", str7, "#root");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>" + "'", str8, "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "#document" + "'", str12, "#document");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(elements23);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(elements28);
    }

    @Test
    public void test2527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2527");
        org.jsoup.nodes.Document document2 = new org.jsoup.nodes.Document("");
        boolean boolean3 = document2.hasText();
        java.lang.String str4 = document2.nodeName();
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet7 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet7, strArray6);
        org.jsoup.nodes.Element element9 = document2.classNames((java.util.Set<java.lang.String>) strSet7);
        org.jsoup.nodes.Element element11 = document2.append("#document");
        org.jsoup.nodes.Element element13 = document2.prepend("#document");
        org.jsoup.nodes.Element element15 = element13.wrap("#document");
        java.lang.String str16 = element13.baseUri();
        java.lang.String str17 = element13.nodeName();
        org.jsoup.select.Elements elements20 = element13.getElementsByAttributeValue("<?#document#documentdocument>", "org.jsoup.select.Selector$SelectorParseException:  hi!=\"#root\"");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements21 = org.jsoup.select.Selector.select("<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>", element13);
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query <html>?<head>?</head>?<body>? #root ?</body>?</html>");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#document" + "'", str4, "#document");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNull(element15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "#document" + "'", str17, "#document");
        org.junit.Assert.assertNotNull(elements20);
    }

    @Test
    public void test2528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2528");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements5 = elements3.prepend("");
        org.jsoup.select.Elements elements7 = elements5.removeAttr("");
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements11 = document9.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements13 = elements11.prepend("");
        org.jsoup.select.Elements elements15 = elements13.removeAttr("");
        boolean boolean16 = elements5.containsAll((java.util.Collection<org.jsoup.nodes.Element>) elements13);
        org.jsoup.nodes.Document document18 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements20 = document18.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements22 = elements20.prepend("");
        org.jsoup.select.Elements elements24 = elements22.removeAttr("");
        org.jsoup.nodes.Document document26 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements28 = document26.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements30 = elements28.prepend("");
        org.jsoup.select.Elements elements32 = elements30.removeAttr("");
        boolean boolean33 = elements22.containsAll((java.util.Collection<org.jsoup.nodes.Element>) elements30);
        org.jsoup.select.Elements elements35 = elements30.wrap("#root");
        boolean boolean36 = elements13.containsAll((java.util.Collection<org.jsoup.nodes.Element>) elements35);
        org.jsoup.select.Elements elements37 = new org.jsoup.select.Elements((java.util.Collection<org.jsoup.nodes.Element>) elements13);
        org.jsoup.nodes.Element element38 = elements13.first();
        org.jsoup.nodes.Document document41 = org.jsoup.parser.Parser.parseBodyFragment("\n<!--#root-->", "#root");
        org.jsoup.nodes.Element element43 = document41.removeClass("#root=\"hi!\"");
        boolean boolean44 = elements13.add(element43);
        org.jsoup.select.Elements elements47 = elements13.attr("<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>", " ");
        org.jsoup.select.Elements elements50 = elements13.attr("\n<org.jsoup.select.selector$selectorparseexception: org.jsoup.select.selector$selectorparseexception:>\n</org.jsoup.select.selector$selectorparseexception: org.jsoup.select.selector$selectorparseexception:>", "");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(elements20);
        org.junit.Assert.assertNotNull(elements22);
        org.junit.Assert.assertNotNull(elements24);
        org.junit.Assert.assertNotNull(elements28);
        org.junit.Assert.assertNotNull(elements30);
        org.junit.Assert.assertNotNull(elements32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(elements35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNull(element38);
        org.junit.Assert.assertNotNull(document41);
        org.junit.Assert.assertNotNull(element43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(elements47);
        org.junit.Assert.assertNotNull(elements50);
    }

    @Test
    public void test2529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2529");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("<#root class=\"hi!\">\nhi!\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "[]");
        org.jsoup.nodes.Attributes attributes3 = document2.attributes();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(attributes3);
    }

    @Test
    public void test2530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2530");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parse("<html>\n<head>\n</head>\n<body>\n</body>\n</html>=\"\"");
        org.jsoup.nodes.Element element3 = document1.createElement(" #comment=\"\"");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
    }

    @Test
    public void test2531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2531");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element5 = document1.prepend("#document");
        org.jsoup.nodes.Element element6 = element5.empty();
        org.jsoup.select.Elements elements8 = element5.getElementsByTag("org.jsoup.select.Selector$SelectorParseException: ");
        org.jsoup.select.Elements elements10 = elements8.removeClass("#root");
        org.jsoup.select.Elements elements12 = elements8.append("");
        boolean boolean14 = elements8.hasAttr("#document#document");
        java.lang.String str16 = elements8.attr("#document#documentdocument");
        org.jsoup.select.Elements elements17 = new org.jsoup.select.Elements((java.util.List<org.jsoup.nodes.Element>) elements8);
        org.jsoup.select.Elements elements18 = elements17.parents();
        org.jsoup.select.Elements elements20 = elements18.prepend("#root=\"hi!\"");
        java.util.function.UnaryOperator<org.jsoup.nodes.Element> elementUnaryOperator21 = null;
        // The following exception was thrown during execution in test generation
        try {
            elements20.replaceAll(elementUnaryOperator21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertNotNull(elements20);
    }

    @Test
    public void test2532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2532");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("org.jsoup.select.Selector$SelectorParseException: ");
        boolean boolean2 = tag1.isData();
        org.jsoup.nodes.Attributes attributes4 = new org.jsoup.nodes.Attributes();
        int int5 = attributes4.size();
        java.lang.String str6 = attributes4.html();
        org.jsoup.nodes.Element element7 = new org.jsoup.nodes.Element(tag1, "org.jsoup.select.selector$selectorparseexception:", attributes4);
        boolean boolean8 = tag1.isBlock();
        boolean boolean9 = tag1.preserveWhitespace();
        org.jsoup.nodes.TextNode textNode13 = org.jsoup.nodes.TextNode.createFromEncoded("", "\n<!--#root-->");
        java.lang.String str14 = textNode13.getWholeText();
        org.jsoup.nodes.TextNode textNode16 = textNode13.text("hi!");
        org.jsoup.nodes.TextNode textNode18 = textNode13.text("#root=\"hi!\"");
        boolean boolean19 = textNode18.isBlank();
        org.jsoup.nodes.Attributes attributes20 = textNode18.attributes();
        org.jsoup.nodes.Element element21 = new org.jsoup.nodes.Element(tag1, "hi!", attributes20);
        boolean boolean22 = tag1.requiresSpecificParent();
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(textNode13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(textNode16);
        org.junit.Assert.assertNotNull(textNode18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(attributes20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test2533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2533");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element5 = document1.prepend("#document");
        org.jsoup.select.Elements elements7 = element5.getElementsByAttribute("hi!");
        java.lang.Object obj8 = null;
        int int9 = elements7.lastIndexOf(obj8);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test2534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2534");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.hasText();
        java.lang.String str3 = document1.nodeName();
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        org.jsoup.nodes.Element element8 = document1.classNames((java.util.Set<java.lang.String>) strSet6);
        org.jsoup.nodes.Element element10 = document1.append("#document");
        org.jsoup.nodes.Element element12 = document1.prepend("#document");
        org.jsoup.nodes.Attributes attributes13 = element12.attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator14 = attributes13.spliterator();
        org.jsoup.nodes.Attributes attributes15 = new org.jsoup.nodes.Attributes();
        int int16 = attributes15.size();
        java.lang.String str17 = attributes15.html();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor18 = attributes15.iterator();
        boolean boolean19 = attributes13.equals((java.lang.Object) attributes15);
        java.lang.String str20 = attributes13.toString();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator21 = attributes13.spliterator();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor22 = attributes13.iterator();
        org.jsoup.parser.Tag tag24 = org.jsoup.parser.Tag.valueOf("org.jsoup.select.Selector$SelectorParseException: ");
        boolean boolean25 = tag24.isData();
        org.jsoup.nodes.Attributes attributes27 = new org.jsoup.nodes.Attributes();
        int int28 = attributes27.size();
        java.lang.String str29 = attributes27.html();
        org.jsoup.nodes.Element element30 = new org.jsoup.nodes.Element(tag24, "org.jsoup.select.selector$selectorparseexception:", attributes27);
        org.jsoup.nodes.Attribute attribute33 = org.jsoup.nodes.Attribute.createFromEncoded("hi!", "hi!");
        attribute33.setKey("#root");
        java.lang.String str36 = attribute33.html();
        attributes27.put(attribute33);
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor38 = attributes27.iterator();
        attributes13.addAll(attributes27);
        java.lang.String str40 = attributes27.html();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator41 = attributes27.spliterator();
        java.util.List<org.jsoup.nodes.Attribute> attributeList42 = attributes27.asList();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor43 = attributes27.iterator();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertNotNull(attributeSpliterator14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(attributeItor18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + " class=\"hi!\"" + "'", str20, " class=\"hi!\"");
        org.junit.Assert.assertNotNull(attributeSpliterator21);
        org.junit.Assert.assertNotNull(attributeItor22);
        org.junit.Assert.assertNotNull(tag24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(attribute33);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "#root=\"hi!\"" + "'", str36, "#root=\"hi!\"");
        org.junit.Assert.assertNotNull(attributeItor38);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + " #root=\"hi!\"" + "'", str40, " #root=\"hi!\"");
        org.junit.Assert.assertNotNull(attributeSpliterator41);
        org.junit.Assert.assertNotNull(attributeList42);
        org.junit.Assert.assertNotNull(attributeItor43);
    }

    @Test
    public void test2535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2535");
        org.jsoup.nodes.Document document2 = org.jsoup.nodes.Document.createShell("#comment");
        org.jsoup.nodes.Element element4 = document2.val(" #comment=\"\"");
        org.jsoup.select.Elements elements7 = element4.getElementsByAttributeValueStarting("<html>\n<head>\n</head>\n<body>\n</body>\n</html>=\"\"", " #comment=\"\"");
        org.jsoup.select.Elements elements8 = org.jsoup.select.Selector.select("<[#, d, o, c, u, m, e, n, t]>\n</[#, d, o, c, u, m, e, n, t]>#root=&quot;hi!&quot;", (java.lang.Iterable<org.jsoup.nodes.Element>) elements7);
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(elements8);
    }

    @Test
    public void test2536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2536");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements5 = elements3.prepend("");
        org.jsoup.select.Elements elements7 = elements5.removeAttr("");
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements11 = document9.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements13 = elements11.prepend("");
        org.jsoup.select.Elements elements15 = elements13.removeAttr("");
        boolean boolean16 = elements5.containsAll((java.util.Collection<org.jsoup.nodes.Element>) elements13);
        org.jsoup.nodes.Document document18 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements20 = document18.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements22 = elements20.prepend("");
        org.jsoup.select.Elements elements24 = elements22.removeAttr("");
        org.jsoup.nodes.Document document26 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements28 = document26.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements30 = elements28.prepend("");
        org.jsoup.select.Elements elements32 = elements30.removeAttr("");
        boolean boolean33 = elements22.containsAll((java.util.Collection<org.jsoup.nodes.Element>) elements30);
        org.jsoup.select.Elements elements35 = elements30.wrap("#root");
        boolean boolean36 = elements13.containsAll((java.util.Collection<org.jsoup.nodes.Element>) elements35);
        org.jsoup.select.Elements elements37 = new org.jsoup.select.Elements((java.util.Collection<org.jsoup.nodes.Element>) elements13);
        org.jsoup.nodes.Document document39 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements41 = document39.getElementsByAttribute("hi!");
        java.lang.String str42 = elements41.val();
        java.lang.Object obj43 = null;
        int int44 = elements41.lastIndexOf(obj43);
        org.jsoup.nodes.Document document46 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements48 = document46.getElementsByAttribute("hi!");
        java.lang.String str49 = elements48.val();
        java.lang.Object obj50 = null;
        int int51 = elements48.lastIndexOf(obj50);
        org.jsoup.select.Elements elements53 = elements48.eq((int) '#');
        boolean boolean54 = elements41.retainAll((java.util.Collection<org.jsoup.nodes.Element>) elements48);
        org.jsoup.select.Elements elements55 = new org.jsoup.select.Elements((java.util.Collection<org.jsoup.nodes.Element>) elements48);
        boolean boolean56 = elements37.removeAll((java.util.Collection<org.jsoup.nodes.Element>) elements48);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(elements20);
        org.junit.Assert.assertNotNull(elements22);
        org.junit.Assert.assertNotNull(elements24);
        org.junit.Assert.assertNotNull(elements28);
        org.junit.Assert.assertNotNull(elements30);
        org.junit.Assert.assertNotNull(elements32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(elements35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(elements41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertNotNull(elements48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertNotNull(elements53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
    }

    @Test
    public void test2537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2537");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!", "hi!");
        attribute2.setKey("#root");
        java.lang.String str5 = attribute2.html();
        attribute2.setKey("#data");
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements11 = document9.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements13 = elements11.prepend("");
        org.jsoup.select.Elements elements15 = elements13.removeAttr("");
        org.jsoup.nodes.Document document17 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements19 = document17.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements21 = elements19.prepend("");
        org.jsoup.select.Elements elements23 = elements21.removeAttr("");
        boolean boolean24 = elements13.containsAll((java.util.Collection<org.jsoup.nodes.Element>) elements21);
        java.lang.Object[] objArray25 = elements13.toArray();
        org.jsoup.nodes.Document document27 = new org.jsoup.nodes.Document("");
        boolean boolean28 = document27.hasText();
        java.lang.String str29 = document27.nodeName();
        java.lang.String str30 = document27.val();
        boolean boolean31 = elements13.add((org.jsoup.nodes.Element) document27);
        boolean boolean32 = attribute2.equals((java.lang.Object) boolean31);
        java.lang.String str33 = attribute2.getKey();
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#root=\"hi!\"" + "'", str5, "#root=\"hi!\"");
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertNotNull(elements21);
        org.junit.Assert.assertNotNull(elements23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[]");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "#document" + "'", str29, "#document");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "#data" + "'", str33, "#data");
    }

    @Test
    public void test2538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2538");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("#document");
        java.lang.String str2 = tokenQueue1.remainder();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#document" + "'", str2, "#document");
    }

    @Test
    public void test2539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2539");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.hasText();
        boolean boolean3 = document1.hasText();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        boolean boolean6 = document5.hasText();
        java.lang.String str7 = document5.nodeName();
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet10 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet10, strArray9);
        org.jsoup.nodes.Element element12 = document5.classNames((java.util.Set<java.lang.String>) strSet10);
        org.jsoup.nodes.Element element13 = document1.classNames((java.util.Set<java.lang.String>) strSet10);
        org.jsoup.nodes.Element element15 = document1.appendText("hi!");
        org.jsoup.parser.Tag tag16 = document1.tag();
        org.jsoup.nodes.Element element18 = new org.jsoup.nodes.Element(tag16, "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        boolean boolean19 = tag16.preserveWhitespace();
        boolean boolean20 = tag16.isData();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#document" + "'", str7, "#document");
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(tag16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test2540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2540");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        java.lang.String str4 = elements3.val();
        java.lang.Object obj5 = null;
        int int6 = elements3.lastIndexOf(obj5);
        org.jsoup.nodes.Document document8 = new org.jsoup.nodes.Document("");
        boolean boolean9 = document8.hasText();
        boolean boolean10 = document8.hasText();
        org.jsoup.nodes.Document document12 = new org.jsoup.nodes.Document("");
        boolean boolean13 = document12.hasText();
        java.lang.String str14 = document12.nodeName();
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet17 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet17, strArray16);
        org.jsoup.nodes.Element element19 = document12.classNames((java.util.Set<java.lang.String>) strSet17);
        org.jsoup.nodes.Element element20 = document8.classNames((java.util.Set<java.lang.String>) strSet17);
        org.jsoup.nodes.Document document22 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element25 = document22.attr("hi!", "#root");
        java.lang.String str26 = document22.id();
        org.jsoup.select.Elements elements27 = document22.children();
        org.jsoup.nodes.Element element28 = document8.prependChild((org.jsoup.nodes.Node) document22);
        boolean boolean29 = elements3.add(element28);
        org.jsoup.select.Elements elements31 = element28.getElementsByIndexLessThan(4);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#document" + "'", str14, "#document");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(elements27);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(elements31);
    }

    @Test
    public void test2541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2541");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("#root", "");
        java.lang.String str3 = document2.outerHtml();
        org.jsoup.nodes.Element element5 = document2.append("<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        org.jsoup.select.Elements elements8 = document2.getElementsByAttributeValueStarting("#root=\"hi!\"", "org.jsoup.select.Selector$SelectorParseException: ");
        org.jsoup.nodes.Element element10 = document2.prepend("#root=\"hi!\"");
        java.lang.String str11 = element10.id();
        org.jsoup.nodes.Element element13 = element10.addClass("org.jsoup.select.Selector$SelectorParseException: \n<!--#document-->");
        java.lang.String str14 = element13.nodeName();
        org.jsoup.select.Elements elements16 = element13.getElementsByIndexLessThan((int) (short) 1);
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>" + "'", str3, "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#document" + "'", str14, "#document");
        org.junit.Assert.assertNotNull(elements16);
    }

    @Test
    public void test2542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2542");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parse("hi!");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValue("hi!", "hi!");
        org.jsoup.nodes.Attributes attributes5 = document1.attributes();
        org.jsoup.nodes.Element element6 = document1.head();
        org.jsoup.select.Elements elements7 = element6.getAllElements();
        org.jsoup.nodes.DataNode dataNode10 = org.jsoup.nodes.DataNode.createFromEncoded("#document", "#document");
        java.lang.String str11 = dataNode10.nodeName();
        boolean boolean12 = elements7.remove((java.lang.Object) dataNode10);
        org.jsoup.select.Elements elements14 = elements7.addClass("<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        org.jsoup.select.Elements elements16 = elements7.removeClass("");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(dataNode10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#data" + "'", str11, "#data");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(elements16);
    }

    @Test
    public void test2543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2543");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("#document#documenthi!", " class=\"hi!\"");
        org.jsoup.select.Elements elements4 = document2.getElementsByIndexLessThan((int) (byte) -1);
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(elements4);
    }

    @Test
    public void test2544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2544");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        java.lang.String str5 = elements3.attr("#root");
        org.jsoup.nodes.Document document7 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element[] elementArray8 = new org.jsoup.nodes.Element[] { document7 };
        java.util.ArrayList<org.jsoup.nodes.Element> elementList9 = new java.util.ArrayList<org.jsoup.nodes.Element>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<org.jsoup.nodes.Element>) elementList9, elementArray8);
        java.util.Spliterator<org.jsoup.nodes.Element> elementSpliterator11 = elementList9.spliterator();
        java.util.Spliterator<org.jsoup.nodes.Element> elementSpliterator12 = elementList9.spliterator();
        boolean boolean13 = elements3.containsAll((java.util.Collection<org.jsoup.nodes.Element>) elementList9);
        org.jsoup.select.Elements elements14 = new org.jsoup.select.Elements((java.util.List<org.jsoup.nodes.Element>) elementList9);
        org.jsoup.select.Elements elements15 = new org.jsoup.select.Elements((java.util.Collection<org.jsoup.nodes.Element>) elements14);
        java.lang.String str16 = elements15.html();
        org.jsoup.select.Elements elements18 = elements15.eq((int) 'd');
        java.lang.Object[] objArray19 = elements18.toArray();
        boolean boolean21 = elements18.hasClass("#document#document=\"\"");
        org.jsoup.select.Elements elements22 = elements18.parents();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(elementArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(elementSpliterator11);
        org.junit.Assert.assertNotNull(elementSpliterator12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(elements22);
    }

    @Test
    public void test2545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2545");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("a", "#data");
        java.lang.String str3 = comment2.toString();
        java.lang.String str4 = comment2.toString();
        java.lang.String str5 = comment2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n<!--a-->" + "'", str3, "\n<!--a-->");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\n<!--a-->" + "'", str4, "\n<!--a-->");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\n<!--a-->" + "'", str5, "\n<!--a-->");
    }

    @Test
    public void test2546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2546");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragmentRelaxed("body", "");
        org.jsoup.select.Elements elements4 = document2.getElementsByIndexEquals((-1));
        org.jsoup.nodes.Node node7 = document2.attr("<!--#document-->", "");
        org.jsoup.select.Elements elements9 = document2.getElementsByIndexLessThan((int) '4');
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(elements9);
    }

    @Test
    public void test2547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2547");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        java.lang.String str5 = elements3.attr("#root");
        org.jsoup.nodes.Document document7 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element[] elementArray8 = new org.jsoup.nodes.Element[] { document7 };
        java.util.ArrayList<org.jsoup.nodes.Element> elementList9 = new java.util.ArrayList<org.jsoup.nodes.Element>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<org.jsoup.nodes.Element>) elementList9, elementArray8);
        java.util.Spliterator<org.jsoup.nodes.Element> elementSpliterator11 = elementList9.spliterator();
        java.util.Spliterator<org.jsoup.nodes.Element> elementSpliterator12 = elementList9.spliterator();
        boolean boolean13 = elements3.containsAll((java.util.Collection<org.jsoup.nodes.Element>) elementList9);
        org.jsoup.select.Elements elements15 = elements3.prepend("#root=\"hi!\"");
        org.jsoup.select.Elements elements17 = elements15.append("<html>\n<head>\n</head>\n<body>\n</body>\n</html>=\"\"");
        org.jsoup.parser.TokenQueue tokenQueue19 = new org.jsoup.parser.TokenQueue("");
        boolean boolean21 = tokenQueue19.matches("org.jsoup.select.Selector$SelectorParseException: ");
        java.lang.String str23 = tokenQueue19.consumeTo("");
        int int24 = elements15.lastIndexOf((java.lang.Object) tokenQueue19);
        java.lang.String str26 = tokenQueue19.chompTo("#document\n<html>\n<head>\n</head>\n<body>\n</body>\n</html><#comment>\n</#comment>");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(elementArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(elementSpliterator11);
        org.junit.Assert.assertNotNull(elementSpliterator12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test2548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2548");
        org.jsoup.nodes.Element[] elementArray0 = new org.jsoup.nodes.Element[] {};
        org.jsoup.select.Elements elements1 = new org.jsoup.select.Elements(elementArray0);
        org.jsoup.select.Elements elements2 = new org.jsoup.select.Elements(elementArray0);
        org.jsoup.select.Elements elements3 = new org.jsoup.select.Elements(elementArray0);
        org.jsoup.select.Elements elements4 = new org.jsoup.select.Elements(elementArray0);
        org.jsoup.select.Elements elements5 = new org.jsoup.select.Elements(elementArray0);
        org.jsoup.select.Elements elements6 = new org.jsoup.select.Elements(elementArray0);
        org.jsoup.select.Elements elements7 = new org.jsoup.select.Elements(elementArray0);
        org.jsoup.select.Elements elements8 = new org.jsoup.select.Elements(elementArray0);
        org.junit.Assert.assertNotNull(elementArray0);
    }

    @Test
    public void test2549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2549");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        java.lang.String str4 = elements3.outerHtml();
        java.lang.String str5 = elements3.val();
        org.jsoup.select.Elements elements6 = new org.jsoup.select.Elements((java.util.List<org.jsoup.nodes.Element>) elements3);
        java.lang.String str8 = elements3.attr("org.jsoup.select.Selector$SelectorParseException: ");
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor9 = elements3.listIterator();
        boolean boolean10 = elements3.hasText();
        org.jsoup.select.Elements elements12 = elements3.prepend(" class=&quot;hi!&quot;");
        org.jsoup.select.Elements elements14 = elements12.addClass("\n<body>\n #root \n</body>");
        java.lang.String str15 = elements14.html();
        // The following exception was thrown during execution in test generation
        try {
            java.util.ListIterator<org.jsoup.nodes.Element> elementItor17 = elements14.listIterator((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(elementItor9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test2550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2550");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        java.lang.String str5 = elements3.attr("#root");
        org.jsoup.nodes.Document document7 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element[] elementArray8 = new org.jsoup.nodes.Element[] { document7 };
        java.util.ArrayList<org.jsoup.nodes.Element> elementList9 = new java.util.ArrayList<org.jsoup.nodes.Element>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<org.jsoup.nodes.Element>) elementList9, elementArray8);
        java.util.Spliterator<org.jsoup.nodes.Element> elementSpliterator11 = elementList9.spliterator();
        java.util.Spliterator<org.jsoup.nodes.Element> elementSpliterator12 = elementList9.spliterator();
        boolean boolean13 = elements3.containsAll((java.util.Collection<org.jsoup.nodes.Element>) elementList9);
        org.jsoup.select.Elements elements15 = elements3.prepend("#root=\"hi!\"");
        org.jsoup.select.Elements elements17 = elements15.append("<html>\n<head>\n</head>\n<body>\n</body>\n</html>=\"\"");
        org.jsoup.parser.TokenQueue tokenQueue19 = new org.jsoup.parser.TokenQueue("");
        boolean boolean21 = tokenQueue19.matches("org.jsoup.select.Selector$SelectorParseException: ");
        java.lang.String str23 = tokenQueue19.consumeTo("");
        int int24 = elements15.lastIndexOf((java.lang.Object) tokenQueue19);
        java.lang.Character char25 = tokenQueue19.peek();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(elementArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(elementSpliterator11);
        org.junit.Assert.assertNotNull(elementSpliterator12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNull(char25);
    }

    @Test
    public void test2551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2551");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements5 = elements3.prepend("");
        org.jsoup.select.Elements elements7 = elements5.removeAttr("");
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements11 = document9.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements13 = elements11.prepend("");
        org.jsoup.select.Elements elements15 = elements13.removeAttr("");
        boolean boolean16 = elements5.containsAll((java.util.Collection<org.jsoup.nodes.Element>) elements13);
        org.jsoup.select.Elements elements18 = elements5.removeAttr("#document#documentdocument");
        java.lang.String str19 = elements5.text();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test2552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2552");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("org.jsoup.select.Selector$SelectorParseException: ");
        java.lang.String str2 = tag1.getName();
        boolean boolean3 = tag1.canContainBlock();
        org.jsoup.parser.Tag tag5 = org.jsoup.parser.Tag.valueOf("#declaration");
        java.lang.String str6 = tag5.toString();
        boolean boolean7 = tag5.requiresSpecificParent();
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements11 = document9.getElementsByAttribute("hi!");
        java.lang.String str13 = elements11.attr("#root");
        org.jsoup.nodes.Document document15 = new org.jsoup.nodes.Document("");
        boolean boolean16 = document15.hasText();
        java.lang.String str17 = document15.nodeName();
        org.jsoup.select.Elements elements18 = document15.children();
        org.jsoup.nodes.Element element20 = document15.prependElement("[#, d, o, c, u, m, e, n, t]");
        int int21 = elements11.lastIndexOf((java.lang.Object) document15);
        org.jsoup.nodes.Element element22 = document15.parent();
        org.jsoup.nodes.Element element24 = document15.append("#root=\"hi!\"");
        boolean boolean25 = tag5.equals((java.lang.Object) document15);
        boolean boolean26 = tag1.isValidAncestor(tag5);
        org.jsoup.parser.Tag tag28 = org.jsoup.parser.Tag.valueOf("org.jsoup.select.Selector$SelectorParseException: ");
        java.lang.String str29 = tag28.getName();
        boolean boolean30 = tag28.isInline();
        boolean boolean31 = tag28.isEmpty();
        org.jsoup.parser.Tag tag33 = org.jsoup.parser.Tag.valueOf("org.jsoup.select.Selector$SelectorParseException: ");
        java.lang.String str34 = tag33.getName();
        boolean boolean35 = tag33.isInline();
        boolean boolean36 = tag33.isEmpty();
        boolean boolean37 = tag33.isEmpty();
        org.jsoup.nodes.Document document40 = org.jsoup.parser.Parser.parse("#root", "");
        org.jsoup.nodes.Element element43 = document40.attr("#root", "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        java.lang.String str44 = document40.tagName();
        java.lang.String str45 = document40.text();
        boolean boolean46 = document40.isBlock();
        boolean boolean47 = tag33.equals((java.lang.Object) document40);
        boolean boolean48 = tag28.isValidParent(tag33);
        java.lang.String str49 = tag28.toString();
        boolean boolean50 = tag5.isValidParent(tag28);
        org.jsoup.parser.Tag tag51 = tag28.getImplicitParent();
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.jsoup.select.selector$selectorparseexception:" + "'", str2, "org.jsoup.select.selector$selectorparseexception:");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#declaration" + "'", str6, "#declaration");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "#document" + "'", str17, "#document");
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNull(element22);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(tag28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "org.jsoup.select.selector$selectorparseexception:" + "'", str29, "org.jsoup.select.selector$selectorparseexception:");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(tag33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "org.jsoup.select.selector$selectorparseexception:" + "'", str34, "org.jsoup.select.selector$selectorparseexception:");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(document40);
        org.junit.Assert.assertNotNull(element43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "#root" + "'", str44, "#root");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "#root" + "'", str45, "#root");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "org.jsoup.select.selector$selectorparseexception:" + "'", str49, "org.jsoup.select.selector$selectorparseexception:");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(tag51);
    }

    @Test
    public void test2553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2553");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.hasText();
        java.lang.String str3 = document1.nodeName();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element8 = document5.attr("hi!", "#root");
        org.jsoup.nodes.Attributes attributes9 = document5.attributes();
        boolean boolean10 = document1.equals((java.lang.Object) attributes9);
        attributes9.remove("<#root hi!=\"#root\">\n</#root>");
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator13 = attributes9.spliterator();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(attributeSpliterator13);
    }

    @Test
    public void test2554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2554");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("#root", "");
        java.lang.String str3 = document2.outerHtml();
        org.jsoup.nodes.Element element5 = document2.append("<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        boolean boolean7 = element5.hasClass("#document");
        java.lang.String str9 = element5.absUrl("<org.jsoup.select.selector$selectorparseexception: hi!=\"#root\">\n</org.jsoup.select.selector$selectorparseexception:>");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>" + "'", str3, "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test2555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2555");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.hasText();
        java.lang.String str3 = document1.nodeName();
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        org.jsoup.nodes.Element element8 = document1.classNames((java.util.Set<java.lang.String>) strSet6);
        org.jsoup.nodes.Element element10 = document1.append("#document");
        org.jsoup.nodes.Element element12 = document1.prepend("#document");
        org.jsoup.nodes.Attributes attributes13 = element12.attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator14 = attributes13.spliterator();
        java.lang.String str16 = attributes13.get("hi!");
        org.jsoup.nodes.Document document19 = org.jsoup.parser.Parser.parse("#root", "");
        org.jsoup.nodes.Element element22 = document19.attr("#root", "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        boolean boolean23 = attributes13.equals((java.lang.Object) "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        org.jsoup.parser.Tag tag25 = org.jsoup.parser.Tag.valueOf("org.jsoup.select.Selector$SelectorParseException: ");
        boolean boolean26 = tag25.isData();
        org.jsoup.nodes.Attributes attributes28 = new org.jsoup.nodes.Attributes();
        int int29 = attributes28.size();
        java.lang.String str30 = attributes28.html();
        org.jsoup.nodes.Element element31 = new org.jsoup.nodes.Element(tag25, "org.jsoup.select.selector$selectorparseexception:", attributes28);
        org.jsoup.nodes.Attribute attribute34 = org.jsoup.nodes.Attribute.createFromEncoded("hi!", "hi!");
        attribute34.setKey("#root");
        java.lang.String str37 = attribute34.html();
        attributes28.put(attribute34);
        attributes13.addAll(attributes28);
        attributes13.remove("#document#document");
        java.lang.String str42 = attributes13.html();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertNotNull(attributeSpliterator14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(document19);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(tag25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(attribute34);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "#root=\"hi!\"" + "'", str37, "#root=\"hi!\"");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + " class=\"hi!\" #root=\"hi!\"" + "'", str42, " class=\"hi!\" #root=\"hi!\"");
    }

    @Test
    public void test2556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2556");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("#document#document", " <?hi!>=\"#data\"");
        org.junit.Assert.assertNotNull(document2);
    }

    @Test
    public void test2557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2557");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("#document#documenthi!");
        org.jsoup.nodes.Document document4 = new org.jsoup.nodes.Document("");
        boolean boolean5 = document4.hasText();
        java.lang.String str6 = document4.nodeName();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet9 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet9, strArray8);
        org.jsoup.nodes.Element element11 = document4.classNames((java.util.Set<java.lang.String>) strSet9);
        org.jsoup.nodes.Element element13 = document4.append("#document");
        org.jsoup.nodes.Element element15 = document4.prepend("#document");
        org.jsoup.nodes.Attributes attributes16 = element15.attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator17 = attributes16.spliterator();
        org.jsoup.nodes.Attributes attributes18 = new org.jsoup.nodes.Attributes();
        int int19 = attributes18.size();
        java.lang.String str20 = attributes18.html();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor21 = attributes18.iterator();
        boolean boolean22 = attributes16.equals((java.lang.Object) attributes18);
        java.lang.String str23 = attributes16.toString();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator24 = attributes16.spliterator();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor25 = attributes16.iterator();
        org.jsoup.parser.Tag tag27 = org.jsoup.parser.Tag.valueOf("org.jsoup.select.Selector$SelectorParseException: ");
        boolean boolean28 = tag27.isData();
        org.jsoup.nodes.Attributes attributes30 = new org.jsoup.nodes.Attributes();
        int int31 = attributes30.size();
        java.lang.String str32 = attributes30.html();
        org.jsoup.nodes.Element element33 = new org.jsoup.nodes.Element(tag27, "org.jsoup.select.selector$selectorparseexception:", attributes30);
        org.jsoup.nodes.Attribute attribute36 = org.jsoup.nodes.Attribute.createFromEncoded("hi!", "hi!");
        attribute36.setKey("#root");
        java.lang.String str39 = attribute36.html();
        attributes30.put(attribute36);
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor41 = attributes30.iterator();
        attributes16.addAll(attributes30);
        org.jsoup.nodes.Element element43 = new org.jsoup.nodes.Element(tag1, "\n<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>", attributes30);
        org.jsoup.parser.Tag tag44 = tag1.getImplicitParent();
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#document" + "'", str6, "#document");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(attributes16);
        org.junit.Assert.assertNotNull(attributeSpliterator17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(attributeItor21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + " class=\"hi!\"" + "'", str23, " class=\"hi!\"");
        org.junit.Assert.assertNotNull(attributeSpliterator24);
        org.junit.Assert.assertNotNull(attributeItor25);
        org.junit.Assert.assertNotNull(tag27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(attribute36);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "#root=\"hi!\"" + "'", str39, "#root=\"hi!\"");
        org.junit.Assert.assertNotNull(attributeItor41);
        org.junit.Assert.assertNotNull(tag44);
    }

    @Test
    public void test2558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2558");
        org.jsoup.select.Selector.SelectorParseException selectorParseException1 = new org.jsoup.select.Selector.SelectorParseException("#document#documenthi!");
    }

    @Test
    public void test2559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2559");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element4 = document1.attr("hi!", "#root");
        org.jsoup.select.Elements elements5 = element4.parents();
        java.lang.String str6 = element4.id();
        org.jsoup.select.Elements elements9 = element4.getElementsByAttributeValueContaining("4", "body");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(elements9);
    }

    @Test
    public void test2560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2560");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("#root");
        org.jsoup.parser.Tag tag2 = tag1.getImplicitParent();
        org.jsoup.parser.Tag tag4 = org.jsoup.parser.Tag.valueOf("org.jsoup.select.Selector$SelectorParseException: ");
        boolean boolean5 = tag4.isData();
        boolean boolean6 = tag4.requiresSpecificParent();
        boolean boolean7 = tag4.isBlock();
        org.jsoup.parser.Tag tag9 = org.jsoup.parser.Tag.valueOf("org.jsoup.select.Selector$SelectorParseException: ");
        boolean boolean10 = tag9.isData();
        boolean boolean11 = tag9.requiresSpecificParent();
        boolean boolean12 = tag9.isBlock();
        boolean boolean13 = tag4.canContain(tag9);
        boolean boolean14 = tag4.isBlock();
        boolean boolean15 = tag4.isData();
        boolean boolean16 = tag4.isBlock();
        org.jsoup.parser.Tag tag17 = tag4.getImplicitParent();
        boolean boolean18 = tag1.isValidAncestor(tag17);
        org.jsoup.nodes.Document document20 = new org.jsoup.nodes.Document("");
        boolean boolean21 = document20.hasText();
        boolean boolean22 = document20.hasText();
        org.jsoup.nodes.Document document24 = new org.jsoup.nodes.Document("");
        boolean boolean25 = document24.hasText();
        java.lang.String str26 = document24.nodeName();
        java.lang.String[] strArray28 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet29 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet29, strArray28);
        org.jsoup.nodes.Element element31 = document24.classNames((java.util.Set<java.lang.String>) strSet29);
        org.jsoup.nodes.Element element32 = document20.classNames((java.util.Set<java.lang.String>) strSet29);
        org.jsoup.nodes.Element element34 = document20.appendText("hi!");
        org.jsoup.parser.Tag tag35 = document20.tag();
        boolean boolean36 = tag35.requiresSpecificParent();
        org.jsoup.parser.Tag tag37 = tag35.getImplicitParent();
        boolean boolean38 = tag37.requiresSpecificParent();
        boolean boolean39 = tag1.canContain(tag37);
        boolean boolean40 = tag1.canContainBlock();
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertNotNull(tag2);
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(tag17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "#document" + "'", str26, "#document");
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertNotNull(element32);
        org.junit.Assert.assertNotNull(element34);
        org.junit.Assert.assertNotNull(tag35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(tag37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
    }

    @Test
    public void test2561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2561");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element5 = document1.prepend("#document");
        org.jsoup.nodes.Element element6 = element5.empty();
        org.jsoup.select.Elements elements8 = element5.getElementsByTag("org.jsoup.select.Selector$SelectorParseException: ");
        org.jsoup.select.Elements elements10 = elements8.removeClass("#root");
        org.jsoup.nodes.Document document12 = new org.jsoup.nodes.Document("");
        boolean boolean13 = document12.hasText();
        java.lang.String str14 = document12.nodeName();
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet17 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet17, strArray16);
        org.jsoup.nodes.Element element19 = document12.classNames((java.util.Set<java.lang.String>) strSet17);
        org.jsoup.nodes.Element element21 = document12.append("#document");
        org.jsoup.nodes.Element element23 = document12.prepend("#document");
        org.jsoup.nodes.Attributes attributes24 = element23.attributes();
        org.jsoup.nodes.Element element26 = element23.append("hi!");
        org.jsoup.select.Elements elements28 = element26.getElementsByIndexLessThan((int) (short) 0);
        boolean boolean29 = elements8.equals((java.lang.Object) elements28);
        org.jsoup.select.Elements elements31 = elements8.append("#document");
        org.jsoup.select.Elements elements33 = elements31.wrap("\n<!--#root-->");
        org.jsoup.nodes.Document document35 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements37 = document35.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements39 = elements37.prepend("");
        org.jsoup.select.Elements elements41 = elements39.removeAttr("");
        org.jsoup.nodes.Document document43 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements45 = document43.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements47 = elements45.prepend("");
        org.jsoup.select.Elements elements49 = elements47.removeAttr("");
        boolean boolean50 = elements39.containsAll((java.util.Collection<org.jsoup.nodes.Element>) elements47);
        org.jsoup.nodes.Document document52 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements54 = document52.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements56 = elements54.prepend("");
        org.jsoup.select.Elements elements58 = elements56.removeAttr("");
        org.jsoup.nodes.Document document60 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements62 = document60.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements64 = elements62.prepend("");
        org.jsoup.select.Elements elements66 = elements64.removeAttr("");
        boolean boolean67 = elements56.containsAll((java.util.Collection<org.jsoup.nodes.Element>) elements64);
        org.jsoup.select.Elements elements69 = elements64.wrap("#root");
        boolean boolean70 = elements47.containsAll((java.util.Collection<org.jsoup.nodes.Element>) elements69);
        org.jsoup.select.Elements elements72 = elements47.removeClass("");
        org.jsoup.select.Elements elements73 = elements47.parents();
        org.jsoup.nodes.Document document75 = org.jsoup.Jsoup.parse("#root=\"hi!\"");
        boolean boolean76 = elements73.remove((java.lang.Object) "#root=\"hi!\"");
        boolean boolean77 = elements31.addAll((java.util.Collection<org.jsoup.nodes.Element>) elements73);
        java.util.function.UnaryOperator<org.jsoup.nodes.Element> elementUnaryOperator78 = null;
        // The following exception was thrown during execution in test generation
        try {
            elements73.replaceAll(elementUnaryOperator78);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#document" + "'", str14, "#document");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(attributes24);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertNotNull(elements28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(elements31);
        org.junit.Assert.assertNotNull(elements33);
        org.junit.Assert.assertNotNull(elements37);
        org.junit.Assert.assertNotNull(elements39);
        org.junit.Assert.assertNotNull(elements41);
        org.junit.Assert.assertNotNull(elements45);
        org.junit.Assert.assertNotNull(elements47);
        org.junit.Assert.assertNotNull(elements49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(elements54);
        org.junit.Assert.assertNotNull(elements56);
        org.junit.Assert.assertNotNull(elements58);
        org.junit.Assert.assertNotNull(elements62);
        org.junit.Assert.assertNotNull(elements64);
        org.junit.Assert.assertNotNull(elements66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(elements69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertNotNull(elements72);
        org.junit.Assert.assertNotNull(elements73);
        org.junit.Assert.assertNotNull(document75);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
    }

    @Test
    public void test2562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2562");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("#document#document=\"#document#document\"", "body");
        org.jsoup.select.Elements elements5 = document2.getElementsByAttributeValue("[#, d, o, c, u, m, e, n, t, #, d, o, c, u, m, e, n, t, d, o, c, u, m, e, n, t]", "org.jsoup.select.Selector$SelectorParseException:");
        org.jsoup.nodes.Document document7 = new org.jsoup.nodes.Document("");
        boolean boolean8 = document7.hasText();
        java.lang.String str9 = document7.nodeName();
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet12 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet12, strArray11);
        org.jsoup.nodes.Element element14 = document7.classNames((java.util.Set<java.lang.String>) strSet12);
        org.jsoup.nodes.Element element16 = document7.append("#document");
        org.jsoup.nodes.Element element18 = document7.prepend("#document");
        org.jsoup.nodes.Attributes attributes19 = element18.attributes();
        org.jsoup.nodes.Document document21 = org.jsoup.Jsoup.parse("hi!");
        org.jsoup.select.Elements elements24 = document21.getElementsByAttributeValue("hi!", "hi!");
        org.jsoup.nodes.Attributes attributes25 = document21.attributes();
        attributes25.remove("#root=\"hi!\"");
        attributes19.addAll(attributes25);
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor29 = attributes19.iterator();
        boolean boolean30 = elements5.equals((java.lang.Object) attributeItor29);
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#document" + "'", str9, "#document");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(attributes19);
        org.junit.Assert.assertNotNull(document21);
        org.junit.Assert.assertNotNull(elements24);
        org.junit.Assert.assertNotNull(attributes25);
        org.junit.Assert.assertNotNull(attributeItor29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test2563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2563");
        java.net.URL uRL0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parse(uRL0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2564");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        int int1 = attributes0.size();
        java.lang.String str2 = attributes0.html();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor3 = attributes0.iterator();
        attributes0.put("#comment", "");
        boolean boolean8 = attributes0.hasKey("org.jsoup.select.selector$selectorparseexception: org.jsoup.select.selector$selectorparseexception:=\"#root\"");
        java.util.List<org.jsoup.nodes.Attribute> attributeList9 = attributes0.asList();
        org.jsoup.nodes.Document document11 = org.jsoup.Jsoup.parse("hi!");
        org.jsoup.select.Elements elements14 = document11.getElementsByAttributeValue("hi!", "hi!");
        org.jsoup.nodes.Attributes attributes15 = document11.attributes();
        attributes15.remove("\n<!--#declaration-->");
        attributes0.addAll(attributes15);
        org.jsoup.nodes.Attribute attribute19 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes15.put(attribute19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(attributeItor3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(attributeList9);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(attributes15);
    }

    @Test
    public void test2565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2565");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.hasText();
        boolean boolean3 = document1.hasText();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        boolean boolean6 = document5.hasText();
        java.lang.String str7 = document5.nodeName();
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet10 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet10, strArray9);
        org.jsoup.nodes.Element element12 = document5.classNames((java.util.Set<java.lang.String>) strSet10);
        org.jsoup.nodes.Element element13 = document1.classNames((java.util.Set<java.lang.String>) strSet10);
        java.util.Set<java.lang.String> strSet14 = document1.classNames();
        org.jsoup.nodes.Element element16 = document1.getElementById("#document#document");
        org.jsoup.nodes.Element element18 = document1.prependText("");
        org.jsoup.nodes.Element element20 = element18.prependText("[]");
        org.jsoup.nodes.Element element22 = element20.addClass("body");
        org.jsoup.select.Elements elements25 = element22.getElementsByAttributeValue("<!--#root-->=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n #root \n&lt;/body&gt;\n&lt;/html&gt;\"", " class=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#document" + "'", str7, "#document");
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNull(element16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(elements25);
    }

    @Test
    public void test2566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2566");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment(" class=&quot;hi!&quot;", "org.jsoup.select.Selector$SelectorParseException:");
        org.junit.Assert.assertNotNull(document2);
    }

    @Test
    public void test2567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2567");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("org.jsoup.select.Selector$SelectorParseException: ");
        boolean boolean2 = tag1.isData();
        boolean boolean3 = tag1.requiresSpecificParent();
        boolean boolean4 = tag1.isBlock();
        org.jsoup.parser.Tag tag6 = org.jsoup.parser.Tag.valueOf("org.jsoup.select.Selector$SelectorParseException: ");
        boolean boolean7 = tag6.isData();
        boolean boolean8 = tag6.requiresSpecificParent();
        boolean boolean9 = tag6.isBlock();
        boolean boolean10 = tag1.canContain(tag6);
        boolean boolean11 = tag1.isEmpty();
        boolean boolean12 = tag1.isData();
        boolean boolean13 = tag1.canContainBlock();
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test2568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2568");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        java.lang.String str5 = elements3.attr("#root");
        org.jsoup.nodes.Document document7 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element[] elementArray8 = new org.jsoup.nodes.Element[] { document7 };
        java.util.ArrayList<org.jsoup.nodes.Element> elementList9 = new java.util.ArrayList<org.jsoup.nodes.Element>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<org.jsoup.nodes.Element>) elementList9, elementArray8);
        java.util.Spliterator<org.jsoup.nodes.Element> elementSpliterator11 = elementList9.spliterator();
        java.util.Spliterator<org.jsoup.nodes.Element> elementSpliterator12 = elementList9.spliterator();
        boolean boolean13 = elements3.containsAll((java.util.Collection<org.jsoup.nodes.Element>) elementList9);
        org.jsoup.select.Elements elements14 = new org.jsoup.select.Elements((java.util.List<org.jsoup.nodes.Element>) elementList9);
        org.jsoup.select.Elements elements15 = new org.jsoup.select.Elements((java.util.Collection<org.jsoup.nodes.Element>) elements14);
        java.lang.String str16 = elements15.html();
        org.jsoup.nodes.Document document18 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements20 = document18.getElementsByAttribute("hi!");
        java.lang.String str22 = elements20.attr("#root");
        org.jsoup.select.Elements elements23 = elements20.parents();
        boolean boolean24 = elements15.containsAll((java.util.Collection<org.jsoup.nodes.Element>) elements20);
        org.jsoup.select.Elements elements26 = elements15.eq(0);
        org.jsoup.select.Elements elements28 = elements26.removeClass("hi!");
        org.jsoup.select.Elements elements30 = elements28.val("#root=&quot;hi!&quot;");
        org.jsoup.select.Elements elements32 = elements28.addClass("<#document#document=\"#document#document\">\n</#document#document=\"#document#document\">");
        java.lang.String str33 = elements28.html();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(elementArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(elementSpliterator11);
        org.junit.Assert.assertNotNull(elementSpliterator12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(elements20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(elements23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(elements26);
        org.junit.Assert.assertNotNull(elements28);
        org.junit.Assert.assertNotNull(elements30);
        org.junit.Assert.assertNotNull(elements32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
    }

    @Test
    public void test2569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2569");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("org.jsoup.select.Selector$SelectorParseException: ");
        java.lang.String str2 = tag1.getName();
        boolean boolean3 = tag1.isInline();
        boolean boolean4 = tag1.isEmpty();
        org.jsoup.parser.Tag tag6 = org.jsoup.parser.Tag.valueOf("org.jsoup.select.Selector$SelectorParseException: ");
        java.lang.String str7 = tag6.getName();
        boolean boolean8 = tag6.isInline();
        boolean boolean9 = tag6.isEmpty();
        boolean boolean10 = tag6.isEmpty();
        boolean boolean11 = tag1.isValidAncestor(tag6);
        org.jsoup.nodes.Element element13 = new org.jsoup.nodes.Element(tag1, " class=\"hi!\"");
        java.lang.String str14 = element13.text();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration18 = new org.jsoup.nodes.XmlDeclaration("hi!", "hi!", false);
        java.lang.String str19 = xmlDeclaration18.getWholeDeclaration();
        java.lang.String str20 = xmlDeclaration18.getWholeDeclaration();
        org.jsoup.nodes.Element element21 = element13.prependChild((org.jsoup.nodes.Node) xmlDeclaration18);
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.jsoup.select.selector$selectorparseexception:" + "'", str2, "org.jsoup.select.selector$selectorparseexception:");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "org.jsoup.select.selector$selectorparseexception:" + "'", str7, "org.jsoup.select.selector$selectorparseexception:");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(element21);
    }

    @Test
    public void test2570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2570");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment(" class=\"hi!\" #root=\"hi!\"", "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.lang.String str3 = comment2.toString();
        java.lang.String str4 = comment2.nodeName();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n<!-- class=\"hi!\" #root=\"hi!\"-->" + "'", str3, "\n<!-- class=\"hi!\" #root=\"hi!\"-->");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#comment" + "'", str4, "#comment");
    }

    @Test
    public void test2571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2571");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("org.jsoup.select.Selector$SelectorParseException: ");
        boolean boolean2 = tag1.isData();
        org.jsoup.nodes.Attributes attributes4 = new org.jsoup.nodes.Attributes();
        int int5 = attributes4.size();
        java.lang.String str6 = attributes4.html();
        org.jsoup.nodes.Element element7 = new org.jsoup.nodes.Element(tag1, "org.jsoup.select.selector$selectorparseexception:", attributes4);
        org.jsoup.nodes.Attribute attribute10 = org.jsoup.nodes.Attribute.createFromEncoded("hi!", "hi!");
        attribute10.setKey("#root");
        java.lang.String str13 = attribute10.html();
        attributes4.put(attribute10);
        org.jsoup.nodes.Document document16 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element19 = document16.attr("hi!", "#root");
        org.jsoup.nodes.Attributes attributes20 = document16.attributes();
        org.jsoup.select.Elements elements21 = document16.children();
        java.util.Set<java.lang.String> strSet22 = document16.classNames();
        org.jsoup.select.Elements elements24 = document16.getElementsByTag("hi!=\"#root=&quot;hi!&quot;\"");
        org.jsoup.nodes.Element element26 = document16.addClass("\n<!--#root-->");
        boolean boolean27 = attribute10.equals((java.lang.Object) element26);
        org.jsoup.select.Elements elements29 = element26.getElementsByTag("<html>\n<head>\n</head>\n<body>\n</body>\n</html>=\"\"");
        org.jsoup.nodes.Document document31 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements33 = document31.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element35 = document31.prepend("#document");
        org.jsoup.nodes.Element element36 = element35.empty();
        org.jsoup.select.Elements elements38 = element35.getElementsByTag("org.jsoup.select.Selector$SelectorParseException: ");
        org.jsoup.select.Elements elements40 = elements38.removeClass("#root");
        org.jsoup.nodes.Document document42 = new org.jsoup.nodes.Document("");
        boolean boolean43 = document42.hasText();
        java.lang.String str44 = document42.nodeName();
        java.lang.String[] strArray46 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet47 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet47, strArray46);
        org.jsoup.nodes.Element element49 = document42.classNames((java.util.Set<java.lang.String>) strSet47);
        org.jsoup.nodes.Element element51 = document42.append("#document");
        org.jsoup.nodes.Element element53 = document42.prepend("#document");
        org.jsoup.nodes.Attributes attributes54 = element53.attributes();
        org.jsoup.nodes.Element element56 = element53.append("hi!");
        org.jsoup.select.Elements elements58 = element56.getElementsByIndexLessThan((int) (short) 0);
        boolean boolean59 = elements38.equals((java.lang.Object) elements58);
        org.jsoup.nodes.Document document62 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements64 = document62.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements66 = elements64.prepend("");
        elements66.clear();
        int int69 = elements66.indexOf((java.lang.Object) "org.jsoup.select.Selector$SelectorParseException: ");
        org.jsoup.select.Elements elements71 = elements66.removeClass("#data");
        org.jsoup.select.Elements elements72 = org.jsoup.select.Selector.select("#data", (java.lang.Iterable<org.jsoup.nodes.Element>) elements71);
        org.jsoup.nodes.Element element73 = elements72.last();
        org.jsoup.select.Elements elements75 = elements72.html("#data");
        boolean boolean76 = elements58.containsAll((java.util.Collection<org.jsoup.nodes.Element>) elements72);
        int int77 = elements58.size();
        org.jsoup.nodes.Document document79 = org.jsoup.Jsoup.parse("hi!");
        org.jsoup.select.Elements elements81 = document79.getElementsByAttribute("org.jsoup.select.selector$selectorparseexception:");
        java.lang.String str82 = elements81.text();
        boolean boolean83 = elements58.retainAll((java.util.Collection<org.jsoup.nodes.Element>) elements81);
        boolean boolean84 = elements29.equals((java.lang.Object) elements58);
        boolean boolean86 = elements29.is("#root=&quot;hi!&quot;");
        boolean boolean88 = elements29.hasAttr("");
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attribute10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "#root=\"hi!\"" + "'", str13, "#root=\"hi!\"");
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(attributes20);
        org.junit.Assert.assertNotNull(elements21);
        org.junit.Assert.assertNotNull(strSet22);
        org.junit.Assert.assertNotNull(elements24);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(elements29);
        org.junit.Assert.assertNotNull(elements33);
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertNotNull(element36);
        org.junit.Assert.assertNotNull(elements38);
        org.junit.Assert.assertNotNull(elements40);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "#document" + "'", str44, "#document");
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(element49);
        org.junit.Assert.assertNotNull(element51);
        org.junit.Assert.assertNotNull(element53);
        org.junit.Assert.assertNotNull(attributes54);
        org.junit.Assert.assertNotNull(element56);
        org.junit.Assert.assertNotNull(elements58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(elements64);
        org.junit.Assert.assertNotNull(elements66);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + (-1) + "'", int69 == (-1));
        org.junit.Assert.assertNotNull(elements71);
        org.junit.Assert.assertNotNull(elements72);
        org.junit.Assert.assertNull(element73);
        org.junit.Assert.assertNotNull(elements75);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 0 + "'", int77 == 0);
        org.junit.Assert.assertNotNull(document79);
        org.junit.Assert.assertNotNull(elements81);
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "" + "'", str82, "");
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
    }

    @Test
    public void test2572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2572");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("head", "org.jsoup.select.selector$selectorparseexception: \n<!--#document-->=\"#document#document=&quot;#document#document&quot;\"");
    }

    @Test
    public void test2573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2573");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parse("<html>\n<head>\n</head>\n<body> \n <!--#root-->\n</body>\n</html>");
        org.jsoup.nodes.Document document3 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element6 = document3.attr("hi!", "#root");
        org.jsoup.select.Elements elements8 = element6.getElementsByTag("\n<!--#root-->");
        boolean boolean9 = document1.equals((java.lang.Object) elements8);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element11 = elements8.remove((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2574");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Document document2 = document1.normalise();
        org.jsoup.nodes.Element element3 = document2.head();
        org.jsoup.nodes.Element element6 = document2.attr("org.jsoup.select.Selector$SelectorParseException: ", "[]");
        java.lang.String str7 = document2.outerHtml();
        org.jsoup.nodes.Element element8 = document2.body();
        org.jsoup.nodes.Element element9 = document2.head();
        org.jsoup.select.Elements elements11 = element9.getElementsByAttribute("#comment");
        boolean boolean13 = elements11.hasClass("<html>\n<head>\n</head>\n<body> \n <!--#root-->\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>" + "'", str7, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2575");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.hasText();
        boolean boolean3 = document1.hasText();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        boolean boolean6 = document5.hasText();
        java.lang.String str7 = document5.nodeName();
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet10 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet10, strArray9);
        org.jsoup.nodes.Element element12 = document5.classNames((java.util.Set<java.lang.String>) strSet10);
        org.jsoup.nodes.Element element13 = document1.classNames((java.util.Set<java.lang.String>) strSet10);
        org.jsoup.nodes.Element element15 = document1.appendText("hi!");
        org.jsoup.parser.Tag tag16 = document1.tag();
        boolean boolean17 = tag16.requiresSpecificParent();
        org.jsoup.parser.Tag tag18 = tag16.getImplicitParent();
        boolean boolean19 = tag18.isInline();
        boolean boolean20 = tag18.requiresSpecificParent();
        boolean boolean21 = tag18.preserveWhitespace();
        org.jsoup.nodes.Element element23 = new org.jsoup.nodes.Element(tag18, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>=\"\"=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#document" + "'", str7, "#document");
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(tag16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(tag18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test2576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2576");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("#document");
        java.lang.String str2 = tokenQueue1.consumeAttributeKey();
        java.lang.String str4 = tokenQueue1.consumeTo("#root=\"hi!\"");
        boolean boolean5 = tokenQueue1.matchesWhitespace();
        org.jsoup.parser.TokenQueue tokenQueue7 = new org.jsoup.parser.TokenQueue("");
        boolean boolean9 = tokenQueue7.matchChomp("org.jsoup.select.selector$selectorparseexception:");
        java.lang.String str10 = tokenQueue7.consumeWord();
        org.jsoup.parser.TokenQueue tokenQueue12 = new org.jsoup.parser.TokenQueue("");
        boolean boolean13 = tokenQueue12.isEmpty();
        java.lang.String[] strArray17 = new java.lang.String[] { " class=\"hi!\"", "#data", "[]" };
        java.lang.String str18 = tokenQueue12.consumeToAny(strArray17);
        java.lang.String str19 = tokenQueue7.consumeToAny(strArray17);
        boolean boolean20 = tokenQueue1.matchesAny(strArray17);
        tokenQueue1.addFirst("<!--#document--><#root hi!=\"#root\">\n</#root>");
        java.lang.String str23 = tokenQueue1.consumeAttributeKey();
        boolean boolean25 = tokenQueue1.matchChomp("body=\"# \"");
        tokenQueue1.addFirst("head");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#document" + "'", str4, "#document");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test2577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2577");
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parse("<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>", "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.lang.String str3 = document2.nodeName();
        org.jsoup.nodes.Element element4 = document2.empty();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(element4);
    }

    @Test
    public void test2578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2578");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("#document");
        java.lang.String str2 = tokenQueue1.consumeAttributeKey();
        java.lang.String str4 = tokenQueue1.consumeTo("#root=\"hi!\"");
        java.lang.String str5 = tokenQueue1.toString();
        java.lang.String str7 = tokenQueue1.chompTo("");
        boolean boolean8 = tokenQueue1.matchesWord();
        boolean boolean9 = tokenQueue1.isEmpty();
        boolean boolean11 = tokenQueue1.matches("org.jsoup.select.selector$selectorparseexception:");
        tokenQueue1.addFirst("<html> \n<head> \n</head> \n<body>\n  #root  \n</body>\n</html>");
        boolean boolean14 = tokenQueue1.matchesWord();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#document" + "'", str4, "#document");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2579");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element4 = document1.attr("hi!", "#root");
        org.jsoup.select.Elements elements5 = element4.parents();
        boolean boolean7 = element4.hasAttr("#root=\"hi!\"");
        org.jsoup.select.Elements elements9 = element4.getElementsByClass("<html>\n<head>\n</head>\n<body>\n org.jsoup.select.selector$selectorparseexception:\n</body>\n</html>");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(elements9);
    }

    @Test
    public void test2580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2580");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n #root \n&lt;/body&gt;\n&lt;/html&gt;\n&lt;html&gt; \n&lt;head&gt; \n&lt;/head&gt; \n&lt;body&gt;\n  #root  \n&lt;/body&gt;\n&lt;/html&gt;");
        org.junit.Assert.assertNotNull(document1);
    }

    @Test
    public void test2581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2581");
        org.jsoup.nodes.DataNode dataNode2 = new org.jsoup.nodes.DataNode("<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "hi!=\"#root=&quot;hi!&quot;\"");
        org.jsoup.nodes.Attributes attributes3 = dataNode2.attributes();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements7 = document5.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements9 = elements7.prepend("");
        elements9.clear();
        int int12 = elements9.indexOf((java.lang.Object) "org.jsoup.select.Selector$SelectorParseException: ");
        org.jsoup.nodes.Document document14 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements16 = document14.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements18 = elements16.prepend("");
        elements18.clear();
        int int21 = elements18.indexOf((java.lang.Object) "org.jsoup.select.Selector$SelectorParseException: ");
        org.jsoup.select.Elements elements23 = elements18.removeClass("#data");
        org.jsoup.nodes.Element element24 = elements18.first();
        org.jsoup.nodes.Document document26 = new org.jsoup.nodes.Document("");
        boolean boolean27 = document26.hasText();
        java.lang.String str28 = document26.nodeName();
        java.lang.String[] strArray30 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet31 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet31, strArray30);
        org.jsoup.nodes.Element element33 = document26.classNames((java.util.Set<java.lang.String>) strSet31);
        org.jsoup.nodes.Element element35 = element33.addClass("#document");
        org.jsoup.select.Elements elements38 = element35.getElementsByAttributeValueNot("#root", "org.jsoup.select.Selector$SelectorParseException: ");
        java.lang.String str39 = elements38.html();
        org.jsoup.nodes.Attributes attributes40 = new org.jsoup.nodes.Attributes();
        int int41 = attributes40.size();
        java.lang.String str42 = attributes40.html();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor43 = attributes40.iterator();
        boolean boolean44 = elements38.contains((java.lang.Object) attributes40);
        org.jsoup.nodes.Attributes attributes45 = new org.jsoup.nodes.Attributes();
        int int46 = attributes45.size();
        java.lang.String str47 = attributes45.html();
        java.lang.String str48 = attributes45.html();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator49 = attributes45.spliterator();
        java.lang.String str50 = attributes45.html();
        attributes40.addAll(attributes45);
        org.jsoup.nodes.Attributes[] attributesArray52 = new org.jsoup.nodes.Attributes[] { attributes45 };
        org.jsoup.nodes.Attributes[] attributesArray53 = elements18.toArray(attributesArray52);
        org.jsoup.nodes.Attributes[] attributesArray54 = elements9.toArray(attributesArray52);
        boolean boolean55 = attributes3.equals((java.lang.Object) attributesArray54);
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(elements23);
        org.junit.Assert.assertNull(element24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "#document" + "'", str28, "#document");
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertNotNull(elements38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertNotNull(attributeItor43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertNotNull(attributeSpliterator49);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertNotNull(attributesArray52);
        org.junit.Assert.assertNotNull(attributesArray53);
        org.junit.Assert.assertNotNull(attributesArray54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
    }

    @Test
    public void test2582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2582");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("#document");
        java.lang.String str2 = tokenQueue1.consumeAttributeKey();
        java.lang.String str3 = tokenQueue1.consumeCssIdentifier();
        tokenQueue1.addFirst((java.lang.Character) 'o');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test2583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2583");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("#root");
        org.jsoup.nodes.Element element3 = document1.html("org.jsoup.select.Selector$SelectorParseException: ");
        java.lang.String str4 = document1.title();
        boolean boolean6 = document1.hasAttr("");
        boolean boolean8 = document1.hasAttr("#root=\"hi!\"");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = document1.childNodes();
        org.jsoup.nodes.Element element11 = document1.appendElement("<html>\n<head>\n</head>\n<body>\n #document#document=&quot;#document#document&quot; \n</body>\n</html>");
        org.jsoup.nodes.Element element13 = document1.html("<html>\n<head>\n</head>\n<body>\n</body>\n</html>=\"\"");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element13);
    }

    @Test
    public void test2584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2584");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element4 = document1.attr("hi!", "#root");
        org.jsoup.nodes.Attributes attributes5 = document1.attributes();
        boolean boolean6 = document1.isBlock();
        org.jsoup.nodes.Element element8 = document1.prepend("");
        org.jsoup.select.Elements elements10 = document1.getElementsByIndexEquals((int) (byte) 100);
        org.jsoup.nodes.Element element12 = document1.createElement("<?hi!>");
        org.jsoup.nodes.Element element14 = document1.append("");
        org.jsoup.nodes.Attributes attributes15 = element14.attributes();
        java.lang.String str16 = attributes15.toString();
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(attributes15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + " hi!=\"#root\"" + "'", str16, " hi!=\"#root\"");
    }

    @Test
    public void test2585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2585");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("#root", "");
        org.jsoup.nodes.Element element5 = document2.attr("#root", "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        java.lang.String str6 = document2.tagName();
        java.lang.String str7 = document2.text();
        org.jsoup.nodes.Element element9 = document2.text("#document#documentdocument");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = document2.childNodes();
        org.jsoup.nodes.Attributes attributes11 = document2.attributes();
        document2.setBaseUri("<!--#root-->=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n #root \n&lt;/body&gt;\n&lt;/html&gt;\"");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#root" + "'", str6, "#root");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#root" + "'", str7, "#root");
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(attributes11);
    }

    @Test
    public void test2586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2586");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "<html>\n<head>\n</head>\n<body>\n #document\n</body>\n</html>");
        java.lang.String str3 = textNode2.getWholeText();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test2587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2587");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements5 = elements3.prepend("");
        elements5.clear();
        int int8 = elements5.indexOf((java.lang.Object) "org.jsoup.select.Selector$SelectorParseException: ");
        org.jsoup.select.Elements elements10 = elements5.append("#document");
        java.util.Iterator<org.jsoup.nodes.Element> elementItor11 = elements5.iterator();
        org.jsoup.nodes.Document document13 = org.jsoup.Jsoup.parseBodyFragment(" class=\"hi!\"");
        boolean boolean14 = elements5.add((org.jsoup.nodes.Element) document13);
        java.lang.String str15 = document13.className();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(elementItor11);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test2588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2588");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        int int1 = attributes0.size();
        org.jsoup.nodes.Document document3 = new org.jsoup.nodes.Document("");
        boolean boolean4 = document3.hasText();
        java.lang.String str5 = document3.nodeName();
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet8 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet8, strArray7);
        org.jsoup.nodes.Element element10 = document3.classNames((java.util.Set<java.lang.String>) strSet8);
        org.jsoup.nodes.Element element12 = document3.append("#document");
        org.jsoup.nodes.Element element14 = document3.prepend("#document");
        org.jsoup.nodes.Attributes attributes15 = element14.attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator16 = attributes15.spliterator();
        org.jsoup.nodes.Attributes attributes17 = new org.jsoup.nodes.Attributes();
        int int18 = attributes17.size();
        java.lang.String str19 = attributes17.html();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor20 = attributes17.iterator();
        boolean boolean21 = attributes15.equals((java.lang.Object) attributes17);
        attributes0.addAll(attributes15);
        java.lang.String str23 = attributes0.html();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#document" + "'", str5, "#document");
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(attributes15);
        org.junit.Assert.assertNotNull(attributeSpliterator16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(attributeItor20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + " class=\"hi!\"" + "'", str23, " class=\"hi!\"");
    }

    @Test
    public void test2589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2589");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements5 = elements3.prepend("");
        org.jsoup.select.Elements elements7 = elements5.removeAttr("");
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements11 = document9.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements13 = elements11.prepend("");
        org.jsoup.select.Elements elements15 = elements13.removeAttr("");
        boolean boolean16 = elements5.containsAll((java.util.Collection<org.jsoup.nodes.Element>) elements13);
        java.lang.Object[] objArray17 = elements5.toArray();
        org.jsoup.select.Elements elements19 = elements5.select("#document#document");
        org.jsoup.nodes.Document document21 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements23 = document21.getElementsByAttribute("hi!");
        boolean boolean25 = document21.hasClass("");
        java.lang.String str26 = document21.nodeName();
        boolean boolean27 = elements19.contains((java.lang.Object) document21);
        org.jsoup.nodes.Element element29 = document21.appendElement("[#, d, o, c, u, m, e, n, t, #, d, o, c, u, m, e, n, t, =, \", #, d, o, c, u, m, e, n, t, #, d, o, c, u, m, e, n, t, \"]");
        org.jsoup.nodes.Element element31 = element29.removeClass("org.jsoup.select.selector$selectorparseexception:");
        org.jsoup.select.Elements elements33 = element31.getElementsByTag("\n<!--a-->");
        org.jsoup.nodes.Element element35 = element31.val("\n<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[]");
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertNotNull(elements23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "#document" + "'", str26, "#document");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertNotNull(elements33);
        org.junit.Assert.assertNotNull(element35);
    }

    @Test
    public void test2590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2590");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("#document#document", "\n<!--#document-->", false);
        java.lang.String str4 = xmlDeclaration3.nodeName();
        java.lang.String str5 = xmlDeclaration3.nodeName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#declaration" + "'", str4, "#declaration");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#declaration" + "'", str5, "#declaration");
    }

    @Test
    public void test2591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2591");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parse("hi!");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("org.jsoup.select.selector$selectorparseexception:");
        java.lang.String str4 = elements3.text();
        org.jsoup.select.Elements elements6 = elements3.html("");
        java.lang.Object[] objArray7 = elements6.toArray();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
    }

    @Test
    public void test2592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2592");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        java.lang.String str4 = document1.nodeName();
        java.lang.String str5 = document1.outerHtml();
        boolean boolean7 = document1.hasAttr("#document#document");
        org.jsoup.nodes.Element element9 = document1.val("[#, d, o, c, u, m, e, n, t]");
        java.lang.String str10 = element9.val();
        org.jsoup.nodes.Element element13 = element9.attr(" ", "[<, h, t, m, l, >, \n, <, h, e, a, d, >, \n, <, /, h, e, a, d, >, \n, <, b, o, d, y, >, \n,  , #, r, o, o, t,  , \n, <, /, b, o, d, y, >, \n, <, /, h, t, m, l, >, #, d, o, c, u, m, e, n, t, #, d, o, c, u, m, e, n, t, d, o, c, u, m, e, n, t]");
        org.jsoup.select.Elements elements15 = element13.getElementsByAttribute("\n<body>\n</body>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements18 = element13.getElementsByAttributeValueStarting("#root=&quot;hi!&quot;\n<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>\n<html> \n<head> \n</head> \n<body>\n  #root  \n</body>\n</html>", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#document" + "'", str4, "#document");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[#, d, o, c, u, m, e, n, t]" + "'", str10, "[#, d, o, c, u, m, e, n, t]");
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(elements15);
    }

    @Test
    public void test2593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2593");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.hasText();
        boolean boolean3 = document1.hasText();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        boolean boolean6 = document5.hasText();
        java.lang.String str7 = document5.nodeName();
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet10 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet10, strArray9);
        org.jsoup.nodes.Element element12 = document5.classNames((java.util.Set<java.lang.String>) strSet10);
        org.jsoup.nodes.Element element13 = document1.classNames((java.util.Set<java.lang.String>) strSet10);
        java.lang.String str14 = element13.html();
        org.jsoup.nodes.Document document16 = new org.jsoup.nodes.Document("");
        boolean boolean17 = document16.hasText();
        java.lang.String str18 = document16.nodeName();
        java.lang.String[] strArray20 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet21 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet21, strArray20);
        org.jsoup.nodes.Element element23 = document16.classNames((java.util.Set<java.lang.String>) strSet21);
        org.jsoup.nodes.Element element24 = element13.classNames((java.util.Set<java.lang.String>) strSet21);
        org.jsoup.select.Elements elements27 = element24.getElementsByAttributeValue("<?hi!>", "[]");
        org.jsoup.nodes.Element element30 = element24.attr("<#root class=\"hi!\">\nhi!\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "<#root hi!=\"#root\">\n</#root>");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#document" + "'", str7, "#document");
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "#document" + "'", str18, "#document");
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(elements27);
        org.junit.Assert.assertNotNull(element30);
    }

    @Test
    public void test2594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2594");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements5 = elements3.prepend("");
        org.jsoup.select.Elements elements7 = elements5.removeAttr("");
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements11 = document9.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements13 = elements11.prepend("");
        org.jsoup.select.Elements elements15 = elements13.removeAttr("");
        boolean boolean16 = elements5.containsAll((java.util.Collection<org.jsoup.nodes.Element>) elements13);
        java.lang.Object[] objArray17 = elements5.toArray();
        org.jsoup.nodes.Document document19 = new org.jsoup.nodes.Document("");
        boolean boolean20 = document19.hasText();
        java.lang.String str21 = document19.nodeName();
        java.lang.String str22 = document19.val();
        boolean boolean23 = elements5.add((org.jsoup.nodes.Element) document19);
        org.jsoup.nodes.Element element25 = document19.appendText("#document#documenthi!");
        java.lang.String str26 = document19.tagName();
        org.jsoup.nodes.Document document27 = document19.normalise();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "#document" + "'", str21, "#document");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "#root" + "'", str26, "#root");
        org.junit.Assert.assertNotNull(document27);
    }

    @Test
    public void test2595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2595");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("#document");
        java.lang.String str2 = tokenQueue1.consumeAttributeKey();
        java.lang.String str4 = tokenQueue1.consumeTo("#root=\"hi!\"");
        boolean boolean5 = tokenQueue1.matchesWhitespace();
        org.jsoup.parser.TokenQueue tokenQueue7 = new org.jsoup.parser.TokenQueue("");
        boolean boolean9 = tokenQueue7.matchChomp("org.jsoup.select.selector$selectorparseexception:");
        java.lang.String str10 = tokenQueue7.consumeWord();
        org.jsoup.parser.TokenQueue tokenQueue12 = new org.jsoup.parser.TokenQueue("");
        boolean boolean13 = tokenQueue12.isEmpty();
        java.lang.String[] strArray17 = new java.lang.String[] { " class=\"hi!\"", "#data", "[]" };
        java.lang.String str18 = tokenQueue12.consumeToAny(strArray17);
        java.lang.String str19 = tokenQueue7.consumeToAny(strArray17);
        boolean boolean20 = tokenQueue1.matchesAny(strArray17);
        java.lang.Character char21 = tokenQueue1.peek();
        tokenQueue1.addFirst("org.jsoup.select.Selector$SelectorParseException: \n<!--<html>\n<head>\n</head>\n<body>\n</body>\n</html>-->");
        boolean boolean24 = tokenQueue1.consumeWhitespace();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#document" + "'", str4, "#document");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(char21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test2596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2596");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements5 = elements3.prepend("");
        org.jsoup.select.Elements elements7 = elements5.removeAttr("");
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements11 = document9.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements13 = elements11.prepend("");
        org.jsoup.select.Elements elements15 = elements13.removeAttr("");
        boolean boolean16 = elements5.containsAll((java.util.Collection<org.jsoup.nodes.Element>) elements13);
        org.jsoup.select.Elements elements18 = elements13.wrap("#root");
        org.jsoup.select.Elements elements19 = new org.jsoup.select.Elements((java.util.Collection<org.jsoup.nodes.Element>) elements18);
        org.jsoup.nodes.Document document21 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements23 = document21.getElementsByAttribute("hi!");
        java.lang.String str25 = elements23.attr("#root");
        java.lang.String str26 = elements23.text();
        org.jsoup.select.Elements elements28 = elements23.eq((int) (short) 10);
        boolean boolean29 = elements19.containsAll((java.util.Collection<org.jsoup.nodes.Element>) elements23);
        org.jsoup.select.Elements elements31 = elements19.html("#root");
        org.jsoup.nodes.Document document33 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements35 = document33.getElementsByAttribute("hi!");
        java.lang.String str36 = elements35.val();
        java.lang.Object obj37 = null;
        int int38 = elements35.lastIndexOf(obj37);
        org.jsoup.select.Elements elements40 = elements35.eq((int) '#');
        boolean boolean42 = elements35.hasAttr("#root");
        int int44 = elements35.indexOf((java.lang.Object) (byte) 100);
        org.jsoup.select.Elements elements46 = elements35.addClass("");
        boolean boolean47 = elements31.removeAll((java.util.Collection<org.jsoup.nodes.Element>) elements35);
        org.jsoup.select.Elements elements49 = elements35.eq((int) (byte) 10);
        org.jsoup.nodes.Document document51 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements53 = document51.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements55 = elements53.prepend("");
        elements55.clear();
        int int58 = elements55.indexOf((java.lang.Object) "org.jsoup.select.Selector$SelectorParseException: ");
        org.jsoup.select.Elements elements60 = elements55.removeClass("#data");
        org.jsoup.nodes.Element element61 = elements55.first();
        org.jsoup.select.Elements elements63 = elements55.eq((int) 'd');
        java.lang.String str64 = elements55.val();
        boolean boolean65 = elements35.addAll((java.util.Collection<org.jsoup.nodes.Element>) elements55);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertNotNull(elements23);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(elements28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(elements31);
        org.junit.Assert.assertNotNull(elements35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertNotNull(elements40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertNotNull(elements46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(elements49);
        org.junit.Assert.assertNotNull(elements53);
        org.junit.Assert.assertNotNull(elements55);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
        org.junit.Assert.assertNotNull(elements60);
        org.junit.Assert.assertNull(element61);
        org.junit.Assert.assertNotNull(elements63);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
    }

    @Test
    public void test2597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2597");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        java.lang.String str4 = elements3.outerHtml();
        java.lang.String str5 = elements3.val();
        java.lang.Object obj6 = null;
        boolean boolean7 = elements3.equals(obj6);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2598");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.hasText();
        java.lang.String str3 = document1.nodeName();
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        org.jsoup.nodes.Element element8 = document1.classNames((java.util.Set<java.lang.String>) strSet6);
        org.jsoup.nodes.Element element10 = element8.addClass("#document");
        java.lang.String str11 = element10.html();
        org.jsoup.nodes.Element element13 = element10.appendElement("#document");
        java.lang.String str14 = element13.html();
        org.jsoup.select.Elements elements17 = element13.getElementsByAttributeValueStarting("#root=\"hi!\"", "[#, d, o, c, u, m, e, n, t]");
        org.jsoup.select.Elements elements20 = element13.getElementsByAttributeValueContaining("org.jsoup.select.selector$selectorparseexception:", "org.jsoup.select.selector$selectorparseexception: org.jsoup.select.selector$selectorparseexception:=\"#root\"");
        org.jsoup.select.Elements elements22 = element13.getElementsByIndexGreaterThan(2);
        org.jsoup.select.Elements elements24 = elements22.prepend("#document#document=\"\"");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertNotNull(elements20);
        org.junit.Assert.assertNotNull(elements22);
        org.junit.Assert.assertNotNull(elements24);
    }

    @Test
    public void test2599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2599");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element4 = document1.attr("hi!", "#root");
        org.jsoup.nodes.Attributes attributes5 = document1.attributes();
        org.jsoup.select.Elements elements6 = document1.children();
        java.util.Set<java.lang.String> strSet7 = document1.classNames();
        org.jsoup.select.Elements elements9 = document1.getElementsByTag("hi!=\"#root=&quot;hi!&quot;\"");
        org.jsoup.nodes.Element element11 = document1.addClass("\n<!--#root-->");
        // The following exception was thrown during execution in test generation
        try {
            document1.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(element11);
    }

    @Test
    public void test2600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2600");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("#document", "");
        org.jsoup.nodes.Element element4 = document2.addClass("hi!");
        org.jsoup.nodes.Element element5 = document2.body();
        org.jsoup.nodes.Element element6 = document2.body();
        org.jsoup.nodes.Element element7 = element6.previousElementSibling();
        org.jsoup.nodes.Element element9 = element7.html("#root=&quot;hi!&quot;");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
    }

    @Test
    public void test2601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2601");
        org.jsoup.nodes.DataNode dataNode2 = org.jsoup.nodes.DataNode.createFromEncoded("org.jsoup.select.selector$selectorparseexception:", "hi!");
        java.lang.String str3 = dataNode2.getWholeData();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = dataNode2.childNodes();
        java.lang.String str5 = dataNode2.getWholeData();
        org.junit.Assert.assertNotNull(dataNode2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "org.jsoup.select.selector$selectorparseexception:" + "'", str3, "org.jsoup.select.selector$selectorparseexception:");
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "org.jsoup.select.selector$selectorparseexception:" + "'", str5, "org.jsoup.select.selector$selectorparseexception:");
    }

    @Test
    public void test2602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2602");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.hasText();
        java.lang.String str3 = document1.nodeName();
        org.jsoup.select.Elements elements4 = document1.children();
        org.jsoup.select.Elements elements6 = document1.getElementsByTag("#document#documenthi!");
        org.jsoup.nodes.Element element9 = document1.attr("[#, d, o, c, u, m, e, n, t, #, d, o, c, u, m, e, n, t, =, \", #, d, o, c, u, m, e, n, t, #, d, o, c, u, m, e, n, t, \"]", "[]");
        java.lang.String str10 = document1.nodeName();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#document" + "'", str10, "#document");
    }

    @Test
    public void test2603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2603");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        int int1 = attributes0.size();
        java.lang.String str2 = attributes0.html();
        java.lang.String str3 = attributes0.html();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator4 = attributes0.spliterator();
        attributes0.put("\n&lt;!--#root--&gt;", " class=&quot;hi!&quot;");
        org.jsoup.nodes.TextNode textNode10 = org.jsoup.nodes.TextNode.createFromEncoded("body", "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.lang.String str11 = textNode10.nodeName();
        boolean boolean12 = attributes0.equals((java.lang.Object) textNode10);
        java.lang.String str13 = attributes0.html();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(attributeSpliterator4);
        org.junit.Assert.assertNotNull(textNode10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#text" + "'", str11, "#text");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + " &lt;!--#root--&gt;=\" class=&amp;quot;hi!&amp;quot;\"" + "'", str13, " &lt;!--#root--&gt;=\" class=&amp;quot;hi!&amp;quot;\"");
    }

    @Test
    public void test2604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2604");
        org.jsoup.nodes.Document document3 = org.jsoup.parser.Parser.parse("#root", "\n<!--#root-->");
        org.jsoup.select.Elements elements4 = org.jsoup.select.Selector.select("#declaration", (org.jsoup.nodes.Element) document3);
        org.jsoup.nodes.Element element5 = document3.body();
        org.jsoup.nodes.Document document7 = new org.jsoup.nodes.Document("");
        boolean boolean8 = document7.hasText();
        java.lang.String str9 = document7.nodeName();
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet12 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet12, strArray11);
        org.jsoup.nodes.Element element14 = document7.classNames((java.util.Set<java.lang.String>) strSet12);
        org.jsoup.nodes.Element element16 = document7.append("#document");
        org.jsoup.nodes.Element element18 = document7.prepend("#document");
        org.jsoup.select.Elements elements19 = document7.parents();
        org.jsoup.nodes.Element element20 = element5.appendChild((org.jsoup.nodes.Node) document7);
        org.jsoup.select.Elements elements21 = element20.getAllElements();
        org.jsoup.select.Elements elements23 = elements21.html("<html> \n <head> \n </head> \n <body>\n   #root  \n </body>\n</html>");
        org.jsoup.select.Elements elements25 = elements23.toggleClass("#data");
        org.jsoup.nodes.Element element26 = elements25.first();
        java.lang.Object[] objArray27 = elements25.toArray();
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#document" + "'", str9, "#document");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(elements21);
        org.junit.Assert.assertNotNull(elements23);
        org.junit.Assert.assertNotNull(elements25);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[\n<body class=\" #data\">\n <html> \n  <head> \n  </head> \n  <body>\n    #root  \n  </body>\n </html>\n</body>, <html> \n   <head> \n   </head> \n   <body>\n     #root  \n   </body>\n  </html>]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[\n<body class=\" #data\">\n <html> \n  <head> \n  </head> \n  <body>\n    #root  \n  </body>\n </html>\n</body>, <html> \n   <head> \n   </head> \n   <body>\n     #root  \n   </body>\n  </html>]");
    }

    @Test
    public void test2605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2605");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.hasText();
        boolean boolean3 = document1.hasText();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        boolean boolean6 = document5.hasText();
        java.lang.String str7 = document5.nodeName();
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet10 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet10, strArray9);
        org.jsoup.nodes.Element element12 = document5.classNames((java.util.Set<java.lang.String>) strSet10);
        org.jsoup.nodes.Element element13 = document1.classNames((java.util.Set<java.lang.String>) strSet10);
        org.jsoup.nodes.Element element15 = document1.appendText("hi!");
        org.jsoup.parser.Tag tag16 = document1.tag();
        boolean boolean17 = tag16.requiresSpecificParent();
        org.jsoup.parser.Tag tag18 = tag16.getImplicitParent();
        org.jsoup.nodes.Element element20 = new org.jsoup.nodes.Element(tag16, "<?#document#document>");
        org.jsoup.nodes.Attributes attributes22 = new org.jsoup.nodes.Attributes();
        int int23 = attributes22.size();
        org.jsoup.nodes.Document document25 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements27 = document25.getElementsByAttribute("hi!");
        java.lang.String str28 = elements27.val();
        java.lang.Object obj29 = null;
        int int30 = elements27.lastIndexOf(obj29);
        org.jsoup.select.Elements elements32 = elements27.eq((int) '#');
        boolean boolean33 = attributes22.equals((java.lang.Object) elements32);
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor34 = attributes22.iterator();
        org.jsoup.nodes.Element element35 = new org.jsoup.nodes.Element(tag16, "#document#document=\"#document#document\"", attributes22);
        org.jsoup.nodes.Element element36 = element35.parent();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#document" + "'", str7, "#document");
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(tag16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(tag18);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(elements27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(elements32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(attributeItor34);
        org.junit.Assert.assertNull(element36);
    }

    @Test
    public void test2606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2606");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("");
        tokenQueue1.addFirst((java.lang.Character) ' ');
        tokenQueue1.addFirst((java.lang.Character) '#');
        boolean boolean7 = tokenQueue1.matches("#text");
        boolean boolean9 = tokenQueue1.matchChomp("<!--#root-->=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n #root \n&lt;/body&gt;\n&lt;/html&gt;\"");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2607");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.hasText();
        java.lang.String str3 = document1.nodeName();
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        org.jsoup.nodes.Element element8 = document1.classNames((java.util.Set<java.lang.String>) strSet6);
        org.jsoup.nodes.Element element10 = document1.append("#document");
        org.jsoup.nodes.Element element12 = document1.prepend("#document");
        org.jsoup.nodes.Attributes attributes13 = element12.attributes();
        org.jsoup.nodes.Element element15 = element12.append("hi!");
        org.jsoup.nodes.Element element17 = element15.appendText("#root=\"hi!\"");
        java.lang.String str18 = element15.toString();
        org.jsoup.nodes.Document document20 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements22 = document20.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements24 = elements22.prepend("");
        org.jsoup.select.Elements elements26 = elements24.removeAttr("");
        org.jsoup.nodes.Document document28 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements30 = document28.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements32 = elements30.prepend("");
        org.jsoup.select.Elements elements34 = elements32.removeAttr("");
        boolean boolean35 = elements24.containsAll((java.util.Collection<org.jsoup.nodes.Element>) elements32);
        java.lang.Object[] objArray36 = elements24.toArray();
        org.jsoup.nodes.Document document38 = new org.jsoup.nodes.Document("");
        boolean boolean39 = document38.hasText();
        java.lang.String str40 = document38.nodeName();
        java.lang.String str41 = document38.val();
        boolean boolean42 = elements24.add((org.jsoup.nodes.Element) document38);
        org.jsoup.nodes.Element element44 = document38.appendText("#document#documenthi!");
        java.lang.String str45 = document38.tagName();
        org.jsoup.nodes.Element element46 = document38.body();
        org.jsoup.nodes.Element element47 = element15.appendChild((org.jsoup.nodes.Node) document38);
        org.jsoup.select.Elements elements49 = document38.getElementsByIndexLessThan((int) '#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "#document#documenthi!#root=&quot;hi!&quot;" + "'", str18, "#document#documenthi!#root=&quot;hi!&quot;");
        org.junit.Assert.assertNotNull(elements22);
        org.junit.Assert.assertNotNull(elements24);
        org.junit.Assert.assertNotNull(elements26);
        org.junit.Assert.assertNotNull(elements30);
        org.junit.Assert.assertNotNull(elements32);
        org.junit.Assert.assertNotNull(elements34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray36), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray36), "[]");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "#document" + "'", str40, "#document");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(element44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "#root" + "'", str45, "#root");
        org.junit.Assert.assertNull(element46);
        org.junit.Assert.assertNotNull(element47);
        org.junit.Assert.assertNotNull(elements49);
    }

    @Test
    public void test2608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2608");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements5 = elements3.prepend("");
        org.jsoup.select.Elements elements7 = elements5.removeAttr("");
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements11 = document9.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements13 = elements11.prepend("");
        org.jsoup.select.Elements elements15 = elements13.removeAttr("");
        boolean boolean16 = elements5.containsAll((java.util.Collection<org.jsoup.nodes.Element>) elements13);
        org.jsoup.select.Elements elements18 = elements13.wrap("#root");
        org.jsoup.select.Elements elements19 = new org.jsoup.select.Elements((java.util.Collection<org.jsoup.nodes.Element>) elements18);
        org.jsoup.nodes.Document document21 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements23 = document21.getElementsByAttribute("hi!");
        java.lang.String str25 = elements23.attr("#root");
        java.lang.String str26 = elements23.text();
        org.jsoup.select.Elements elements28 = elements23.eq((int) (short) 10);
        boolean boolean29 = elements19.containsAll((java.util.Collection<org.jsoup.nodes.Element>) elements23);
        org.jsoup.select.Elements elements31 = elements19.html("#root");
        org.jsoup.select.Elements elements33 = elements19.html("body");
        java.lang.String str35 = elements33.attr("");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertNotNull(elements23);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(elements28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(elements31);
        org.junit.Assert.assertNotNull(elements33);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
    }

    @Test
    public void test2609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2609");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        java.lang.String str4 = elements3.val();
        java.lang.Object obj5 = null;
        int int6 = elements3.lastIndexOf(obj5);
        org.jsoup.nodes.Document document8 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements10 = document8.getElementsByAttribute("hi!");
        java.lang.String str11 = elements10.val();
        java.lang.Object obj12 = null;
        int int13 = elements10.lastIndexOf(obj12);
        org.jsoup.select.Elements elements15 = elements10.eq((int) '#');
        boolean boolean16 = elements3.retainAll((java.util.Collection<org.jsoup.nodes.Element>) elements10);
        org.jsoup.select.Elements elements17 = new org.jsoup.select.Elements((java.util.Collection<org.jsoup.nodes.Element>) elements10);
        org.jsoup.select.Elements elements19 = elements17.addClass("<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        org.jsoup.select.Elements elements21 = elements17.eq((int) '4');
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertNotNull(elements21);
    }

    @Test
    public void test2610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2610");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("org.jsoup.select.Selector$SelectorParseException: ");
        boolean boolean2 = tag1.isData();
        org.jsoup.nodes.Attributes attributes4 = new org.jsoup.nodes.Attributes();
        int int5 = attributes4.size();
        java.lang.String str6 = attributes4.html();
        org.jsoup.nodes.Element element7 = new org.jsoup.nodes.Element(tag1, "org.jsoup.select.selector$selectorparseexception:", attributes4);
        org.jsoup.nodes.Attribute attribute10 = org.jsoup.nodes.Attribute.createFromEncoded("hi!", "hi!");
        attribute10.setKey("#root");
        java.lang.String str13 = attribute10.html();
        attributes4.put(attribute10);
        java.lang.String str15 = attribute10.html();
        attribute10.setValue("<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        org.jsoup.nodes.Document document19 = new org.jsoup.nodes.Document("");
        boolean boolean20 = document19.hasText();
        java.lang.String str21 = document19.nodeName();
        java.lang.String[] strArray23 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet24 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet24, strArray23);
        org.jsoup.nodes.Element element26 = document19.classNames((java.util.Set<java.lang.String>) strSet24);
        org.jsoup.nodes.Element element28 = document19.append("#document");
        org.jsoup.nodes.Element element30 = document19.prepend("#document");
        org.jsoup.nodes.Attributes attributes31 = element30.attributes();
        org.jsoup.nodes.Element element33 = element30.append("hi!");
        org.jsoup.select.Elements elements36 = element30.getElementsByAttributeValueContaining("org.jsoup.select.Selector$SelectorParseException: org.jsoup.select.selector$selectorparseexception:", "#document#documenthi!#root=&quot;hi!&quot;");
        boolean boolean37 = attribute10.equals((java.lang.Object) elements36);
        java.util.stream.Stream<org.jsoup.nodes.Element> elementStream38 = elements36.parallelStream();
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attribute10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "#root=\"hi!\"" + "'", str13, "#root=\"hi!\"");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "#root=\"hi!\"" + "'", str15, "#root=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "#document" + "'", str21, "#document");
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertNotNull(attributes31);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertNotNull(elements36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(elementStream38);
    }

    @Test
    public void test2611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2611");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("#document");
        boolean boolean3 = tokenQueue1.matches("\n<!--#root-->");
        boolean boolean5 = tokenQueue1.matchChomp("#data");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!=\"#root=&quot;hi!&quot;\"" };
        java.lang.String str8 = tokenQueue1.consumeToAny(strArray7);
        java.lang.String str9 = tokenQueue1.remainder();
        java.lang.String str10 = tokenQueue1.remainder();
        java.lang.String str11 = tokenQueue1.toString();
        org.jsoup.nodes.Document document15 = org.jsoup.parser.Parser.parse("#root", "");
        org.jsoup.nodes.Element element18 = document15.attr("#root", "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        java.lang.String str19 = document15.tagName();
        java.lang.String str20 = document15.toString();
        org.jsoup.nodes.Document document22 = new org.jsoup.nodes.Document("");
        boolean boolean23 = document22.hasText();
        java.lang.String str24 = document22.nodeName();
        java.lang.String[] strArray26 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet27 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet27, strArray26);
        org.jsoup.nodes.Element element29 = document22.classNames((java.util.Set<java.lang.String>) strSet27);
        org.jsoup.nodes.Element element31 = document22.append("#document");
        org.jsoup.nodes.Element element33 = element31.html("<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        org.jsoup.nodes.Element element34 = document15.appendChild((org.jsoup.nodes.Node) element33);
        org.jsoup.select.Elements elements35 = org.jsoup.select.Selector.select("#text", element33);
        org.jsoup.nodes.Document document37 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element40 = document37.attr("hi!", "#root");
        org.jsoup.select.Elements elements42 = element40.getElementsByTag("\n<!--#root-->");
        boolean boolean44 = elements42.hasAttr("\n<!--#root-->");
        org.jsoup.nodes.Document document46 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements48 = document46.getElementsByAttribute("hi!");
        java.lang.String str50 = elements48.attr("#root");
        java.lang.String str51 = elements48.text();
        org.jsoup.select.Elements elements53 = elements48.eq((int) (short) 10);
        boolean boolean54 = elements42.removeAll((java.util.Collection<org.jsoup.nodes.Element>) elements48);
        org.jsoup.parser.TokenQueue tokenQueue56 = new org.jsoup.parser.TokenQueue("#document");
        java.lang.String str57 = tokenQueue56.consumeAttributeKey();
        java.lang.String str59 = tokenQueue56.consumeTo("#root=\"hi!\"");
        boolean boolean60 = tokenQueue56.matchesWhitespace();
        org.jsoup.parser.TokenQueue tokenQueue62 = new org.jsoup.parser.TokenQueue("");
        boolean boolean64 = tokenQueue62.matchChomp("org.jsoup.select.selector$selectorparseexception:");
        java.lang.String str65 = tokenQueue62.consumeWord();
        org.jsoup.parser.TokenQueue tokenQueue67 = new org.jsoup.parser.TokenQueue("");
        boolean boolean68 = tokenQueue67.isEmpty();
        java.lang.String[] strArray72 = new java.lang.String[] { " class=\"hi!\"", "#data", "[]" };
        java.lang.String str73 = tokenQueue67.consumeToAny(strArray72);
        java.lang.String str74 = tokenQueue62.consumeToAny(strArray72);
        boolean boolean75 = tokenQueue56.matchesAny(strArray72);
        java.io.Serializable[] serializableArray76 = elements42.toArray((java.io.Serializable[]) strArray72);
        java.lang.String[] strArray77 = elements35.toArray(strArray72);
        java.lang.String str78 = tokenQueue1.consumeToAny(strArray77);
        java.lang.String str79 = tokenQueue1.toString();
        java.lang.String str80 = tokenQueue1.consumeAttributeKey();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#document" + "'", str8, "#document");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertNotNull(document15);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "#root" + "'", str19, "#root");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>" + "'", str20, "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "#document" + "'", str24, "#document");
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertNotNull(element34);
        org.junit.Assert.assertNotNull(elements35);
        org.junit.Assert.assertNotNull(element40);
        org.junit.Assert.assertNotNull(elements42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(elements48);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertNotNull(elements53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "#document" + "'", str59, "#document");
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertNotNull(strArray72);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "" + "'", str73, "");
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "" + "'", str74, "");
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(serializableArray76);
        org.junit.Assert.assertNotNull(strArray77);
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "" + "'", str78, "");
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "[]" + "'", str79, "[]");
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "" + "'", str80, "");
    }

    @Test
    public void test2612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2612");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements5 = elements3.prepend("");
        org.jsoup.select.Elements elements7 = elements5.removeAttr("");
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements11 = document9.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements13 = elements11.prepend("");
        org.jsoup.select.Elements elements15 = elements13.removeAttr("");
        boolean boolean16 = elements5.containsAll((java.util.Collection<org.jsoup.nodes.Element>) elements13);
        java.lang.Object[] objArray17 = elements5.toArray();
        org.jsoup.select.Elements elements19 = elements5.select("#document#document");
        org.jsoup.nodes.Document document21 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements23 = document21.getElementsByAttribute("hi!");
        boolean boolean25 = document21.hasClass("");
        java.lang.String str26 = document21.nodeName();
        boolean boolean27 = elements19.contains((java.lang.Object) document21);
        org.jsoup.nodes.Element element29 = document21.appendElement("[#, d, o, c, u, m, e, n, t, #, d, o, c, u, m, e, n, t, =, \", #, d, o, c, u, m, e, n, t, #, d, o, c, u, m, e, n, t, \"]");
        java.lang.String str30 = document21.nodeName();
        org.jsoup.nodes.Document document31 = document21.normalise();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[]");
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertNotNull(elements23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "#document" + "'", str26, "#document");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "#document" + "'", str30, "#document");
        org.junit.Assert.assertNotNull(document31);
    }

    @Test
    public void test2613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2613");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements5 = elements3.prepend("");
        org.jsoup.select.Elements elements7 = elements5.removeAttr("");
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements11 = document9.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements13 = elements11.prepend("");
        org.jsoup.select.Elements elements15 = elements13.removeAttr("");
        boolean boolean16 = elements5.containsAll((java.util.Collection<org.jsoup.nodes.Element>) elements13);
        org.jsoup.nodes.Document document18 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements20 = document18.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements22 = elements20.prepend("");
        org.jsoup.select.Elements elements24 = elements22.removeAttr("");
        org.jsoup.nodes.Document document26 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements28 = document26.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements30 = elements28.prepend("");
        org.jsoup.select.Elements elements32 = elements30.removeAttr("");
        boolean boolean33 = elements22.containsAll((java.util.Collection<org.jsoup.nodes.Element>) elements30);
        org.jsoup.select.Elements elements35 = elements30.wrap("#root");
        boolean boolean36 = elements13.containsAll((java.util.Collection<org.jsoup.nodes.Element>) elements35);
        org.jsoup.select.Elements elements38 = elements13.val("#root=\"hi!\"");
        org.jsoup.select.Elements elements40 = elements13.wrap("[#, d, o, c, u, m, e, n, t]");
        java.util.Iterator<org.jsoup.nodes.Element> elementItor41 = elements13.iterator();
        org.jsoup.select.Elements elements43 = elements13.removeAttr(" class=\"hi!\"");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(elements20);
        org.junit.Assert.assertNotNull(elements22);
        org.junit.Assert.assertNotNull(elements24);
        org.junit.Assert.assertNotNull(elements28);
        org.junit.Assert.assertNotNull(elements30);
        org.junit.Assert.assertNotNull(elements32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(elements35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(elements38);
        org.junit.Assert.assertNotNull(elements40);
        org.junit.Assert.assertNotNull(elementItor41);
        org.junit.Assert.assertNotNull(elements43);
    }

    @Test
    public void test2614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2614");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("#root", "");
        java.lang.String str3 = document2.outerHtml();
        org.jsoup.nodes.Element element5 = document2.append("<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        org.jsoup.select.Elements elements7 = document2.getElementsByIndexEquals(1);
        org.jsoup.nodes.Element element8 = document2.body();
        java.lang.String str9 = element8.toString();
        org.jsoup.select.Elements elements11 = element8.getElementsByIndexLessThan(4);
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>" + "'", str3, "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\n<body>\n #root \n</body>" + "'", str9, "\n<body>\n #root \n</body>");
        org.junit.Assert.assertNotNull(elements11);
    }

    @Test
    public void test2615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2615");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements5 = elements3.prepend("");
        org.jsoup.select.Elements elements7 = elements5.removeAttr("");
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements11 = document9.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements13 = elements11.prepend("");
        org.jsoup.select.Elements elements15 = elements13.removeAttr("");
        boolean boolean16 = elements5.containsAll((java.util.Collection<org.jsoup.nodes.Element>) elements13);
        java.lang.Object[] objArray17 = elements5.toArray();
        org.jsoup.nodes.Document document19 = new org.jsoup.nodes.Document("");
        boolean boolean20 = document19.hasText();
        java.lang.String str21 = document19.nodeName();
        java.lang.String str22 = document19.val();
        boolean boolean23 = elements5.add((org.jsoup.nodes.Element) document19);
        org.jsoup.nodes.Element element25 = document19.appendText("#document#documenthi!");
        org.jsoup.select.Elements elements27 = element25.getElementsByClass("#data");
        java.lang.String str28 = element25.tagName();
        org.jsoup.nodes.Element element29 = element25.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements32 = element29.getElementsByAttributeValueEnding("<#document#document=\"#document#document\">\n</#document#document=\"#document#document\">", "hi!=\"#root=&quot;hi!&quot;\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "#document" + "'", str21, "#document");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(elements27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "#root" + "'", str28, "#root");
        org.junit.Assert.assertNull(element29);
    }

    @Test
    public void test2616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2616");
        org.jsoup.safety.Whitelist whitelist2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.jsoup.Jsoup.clean("[#, d, o, c, u, m, e, n, t]", "\n<!--#root-->", whitelist2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2617");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements5 = elements3.prepend("");
        org.jsoup.select.Elements elements7 = elements5.removeAttr("");
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements11 = document9.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements13 = elements11.prepend("");
        org.jsoup.select.Elements elements15 = elements13.removeAttr("");
        boolean boolean16 = elements5.containsAll((java.util.Collection<org.jsoup.nodes.Element>) elements13);
        org.jsoup.select.Elements elements18 = elements13.wrap("#root");
        java.lang.String str20 = elements18.attr("hi!");
        org.jsoup.select.Elements elements21 = new org.jsoup.select.Elements((java.util.List<org.jsoup.nodes.Element>) elements18);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element23 = elements21.remove(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test2618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2618");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse(" text=\"#data\"", "<org.jsoup.select.selector$selectorparseexception: hi!=\"#root\">\n</org.jsoup.select.selector$selectorparseexception:>");
        document2.setBaseUri("\n<!--a-->");
        org.junit.Assert.assertNotNull(document2);
    }

    @Test
    public void test2619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2619");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("#root=&quot;hi!&quot;", "\n<!--#document-->");
        org.jsoup.nodes.Element element4 = document2.addClass("#data=\"\"");
        java.lang.String str5 = document2.nodeName();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#document" + "'", str5, "#document");
    }

    @Test
    public void test2620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2620");
        org.jsoup.select.Selector.SelectorParseException selectorParseException1 = new org.jsoup.select.Selector.SelectorParseException("&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;");
    }

    @Test
    public void test2621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2621");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("#document", "");
        org.jsoup.nodes.Element element4 = document2.addClass("hi!");
        org.jsoup.nodes.Element element5 = document2.body();
        org.jsoup.nodes.Document document7 = new org.jsoup.nodes.Document("");
        boolean boolean8 = document7.hasText();
        java.lang.String str9 = document7.nodeName();
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet12 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet12, strArray11);
        org.jsoup.nodes.Element element14 = document7.classNames((java.util.Set<java.lang.String>) strSet12);
        org.jsoup.nodes.Element element16 = element14.addClass("#document");
        org.jsoup.nodes.Document document18 = new org.jsoup.nodes.Document("");
        boolean boolean19 = document18.hasText();
        boolean boolean20 = document18.hasText();
        org.jsoup.nodes.Document document22 = new org.jsoup.nodes.Document("");
        boolean boolean23 = document22.hasText();
        java.lang.String str24 = document22.nodeName();
        java.lang.String[] strArray26 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet27 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet27, strArray26);
        org.jsoup.nodes.Element element29 = document22.classNames((java.util.Set<java.lang.String>) strSet27);
        org.jsoup.nodes.Element element30 = document18.classNames((java.util.Set<java.lang.String>) strSet27);
        java.util.Set<java.lang.String> strSet31 = document18.classNames();
        org.jsoup.nodes.Element element32 = element14.classNames(strSet31);
        org.jsoup.nodes.Element element33 = element5.classNames(strSet31);
        org.jsoup.select.Elements elements34 = element33.getAllElements();
        org.jsoup.nodes.Document document37 = org.jsoup.Jsoup.parseBodyFragment("#document#document", "#comment");
        boolean boolean38 = elements34.contains((java.lang.Object) document37);
        org.jsoup.nodes.Document document40 = new org.jsoup.nodes.Document("");
        boolean boolean41 = document40.hasText();
        java.lang.String str42 = document40.nodeName();
        java.lang.String[] strArray44 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet45 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet45, strArray44);
        org.jsoup.nodes.Element element47 = document40.classNames((java.util.Set<java.lang.String>) strSet45);
        org.jsoup.nodes.Element element49 = document40.append("#document");
        org.jsoup.nodes.Element element51 = element49.html("<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        org.jsoup.nodes.Element element52 = document37.prependChild((org.jsoup.nodes.Node) element51);
        org.jsoup.select.Elements elements53 = element51.siblingElements();
        org.jsoup.select.Elements elements56 = element51.getElementsByAttributeValue("#declaration", "<#root hi!=\"#root\">\n</#root>");
        org.jsoup.nodes.Element element58 = element51.prependElement("<html>\n<head>\n</head>\n<body>\n []\n</body>\n</html>");
        java.lang.String str59 = element51.data();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#document" + "'", str9, "#document");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "#document" + "'", str24, "#document");
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertNotNull(strSet31);
        org.junit.Assert.assertNotNull(element32);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertNotNull(elements34);
        org.junit.Assert.assertNotNull(document37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "#document" + "'", str42, "#document");
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(element47);
        org.junit.Assert.assertNotNull(element49);
        org.junit.Assert.assertNotNull(element51);
        org.junit.Assert.assertNotNull(element52);
        org.junit.Assert.assertNotNull(elements53);
        org.junit.Assert.assertNotNull(elements56);
        org.junit.Assert.assertNotNull(element58);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
    }

    @Test
    public void test2622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2622");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("# ");
        java.lang.String str2 = document1.outerHtml();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "<html>\n<head>\n</head>\n<body>\n # \n</body>\n</html>" + "'", str2, "<html>\n<head>\n</head>\n<body>\n # \n</body>\n</html>");
    }

    @Test
    public void test2623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2623");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.hasText();
        boolean boolean3 = document1.hasText();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        boolean boolean6 = document5.hasText();
        java.lang.String str7 = document5.nodeName();
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet10 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet10, strArray9);
        org.jsoup.nodes.Element element12 = document5.classNames((java.util.Set<java.lang.String>) strSet10);
        org.jsoup.nodes.Element element13 = document1.classNames((java.util.Set<java.lang.String>) strSet10);
        java.util.Set<java.lang.String> strSet14 = document1.classNames();
        org.jsoup.nodes.Element element16 = document1.getElementById("#document#document");
        java.lang.String str17 = document1.id();
        boolean boolean19 = document1.hasAttr("#root");
        org.jsoup.select.Elements elements20 = document1.getAllElements();
        org.jsoup.nodes.Element element21 = document1.head();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = element21.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#document" + "'", str7, "#document");
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNull(element16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(elements20);
        org.junit.Assert.assertNull(element21);
    }

    @Test
    public void test2624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2624");
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parse("", "");
        java.lang.String str3 = document2.nodeName();
        java.lang.String str4 = document2.text();
        org.jsoup.nodes.Element element5 = document2.head();
        org.jsoup.select.Elements elements6 = element5.children();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements6);
    }

    @Test
    public void test2625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2625");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        java.lang.String str4 = elements3.outerHtml();
        java.lang.String str5 = elements3.val();
        org.jsoup.select.Elements elements6 = new org.jsoup.select.Elements((java.util.List<org.jsoup.nodes.Element>) elements3);
        org.jsoup.select.Elements elements7 = new org.jsoup.select.Elements((java.util.Collection<org.jsoup.nodes.Element>) elements3);
        org.jsoup.select.Elements elements9 = elements7.addClass("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Document document12 = org.jsoup.parser.Parser.parseBodyFragment("#document", "");
        org.jsoup.nodes.Element element14 = document12.addClass("hi!");
        org.jsoup.nodes.Element element15 = document12.body();
        org.jsoup.nodes.Document document17 = new org.jsoup.nodes.Document("");
        boolean boolean18 = document17.hasText();
        java.lang.String str19 = document17.nodeName();
        java.lang.String[] strArray21 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet22 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet22, strArray21);
        org.jsoup.nodes.Element element24 = document17.classNames((java.util.Set<java.lang.String>) strSet22);
        org.jsoup.nodes.Element element26 = element24.addClass("#document");
        org.jsoup.nodes.Document document28 = new org.jsoup.nodes.Document("");
        boolean boolean29 = document28.hasText();
        boolean boolean30 = document28.hasText();
        org.jsoup.nodes.Document document32 = new org.jsoup.nodes.Document("");
        boolean boolean33 = document32.hasText();
        java.lang.String str34 = document32.nodeName();
        java.lang.String[] strArray36 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet37 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet37, strArray36);
        org.jsoup.nodes.Element element39 = document32.classNames((java.util.Set<java.lang.String>) strSet37);
        org.jsoup.nodes.Element element40 = document28.classNames((java.util.Set<java.lang.String>) strSet37);
        java.util.Set<java.lang.String> strSet41 = document28.classNames();
        org.jsoup.nodes.Element element42 = element24.classNames(strSet41);
        org.jsoup.nodes.Element element43 = element15.classNames(strSet41);
        org.jsoup.select.Elements elements44 = element43.getAllElements();
        org.jsoup.nodes.Element element46 = element43.append(" class=\"hi!\"");
        boolean boolean47 = elements9.add(element46);
        java.lang.String str48 = element46.html();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "#document" + "'", str19, "#document");
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "#document" + "'", str34, "#document");
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(element39);
        org.junit.Assert.assertNotNull(element40);
        org.junit.Assert.assertNotNull(strSet41);
        org.junit.Assert.assertNotNull(element42);
        org.junit.Assert.assertNotNull(element43);
        org.junit.Assert.assertNotNull(elements44);
        org.junit.Assert.assertNotNull(element46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "#document class=&quot;hi!&quot;" + "'", str48, "#document class=&quot;hi!&quot;");
    }

    @Test
    public void test2626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2626");
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parse("\n<!--<html>\n<head>\n</head>\n<body>\n</body>\n</html>-->", "\n<!--#root-->");
        org.junit.Assert.assertNotNull(document2);
    }

    @Test
    public void test2627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2627");
        org.jsoup.select.Selector.SelectorParseException selectorParseException1 = new org.jsoup.select.Selector.SelectorParseException("org.jsoup.select.selector$selectorparseexception:");
        org.jsoup.select.Selector.SelectorParseException selectorParseException3 = new org.jsoup.select.Selector.SelectorParseException("org.jsoup.select.selector$selectorparseexception:");
        java.lang.Throwable[] throwableArray4 = selectorParseException3.getSuppressed();
        org.jsoup.select.Selector.SelectorParseException selectorParseException6 = new org.jsoup.select.Selector.SelectorParseException("\n<!--#document-->");
        selectorParseException3.addSuppressed((java.lang.Throwable) selectorParseException6);
        selectorParseException1.addSuppressed((java.lang.Throwable) selectorParseException6);
        org.jsoup.select.Selector.SelectorParseException selectorParseException10 = new org.jsoup.select.Selector.SelectorParseException("org.jsoup.select.selector$selectorparseexception:");
        org.jsoup.select.Selector.SelectorParseException selectorParseException12 = new org.jsoup.select.Selector.SelectorParseException("org.jsoup.select.selector$selectorparseexception:");
        java.lang.Throwable[] throwableArray13 = selectorParseException12.getSuppressed();
        org.jsoup.select.Selector.SelectorParseException selectorParseException15 = new org.jsoup.select.Selector.SelectorParseException("\n<!--#document-->");
        selectorParseException12.addSuppressed((java.lang.Throwable) selectorParseException15);
        selectorParseException10.addSuppressed((java.lang.Throwable) selectorParseException15);
        org.jsoup.select.Selector.SelectorParseException selectorParseException19 = new org.jsoup.select.Selector.SelectorParseException("org.jsoup.select.selector$selectorparseexception:");
        java.lang.Throwable[] throwableArray20 = selectorParseException19.getSuppressed();
        org.jsoup.select.Selector.SelectorParseException selectorParseException22 = new org.jsoup.select.Selector.SelectorParseException("\n<!--#document-->");
        selectorParseException19.addSuppressed((java.lang.Throwable) selectorParseException22);
        selectorParseException15.addSuppressed((java.lang.Throwable) selectorParseException19);
        selectorParseException1.addSuppressed((java.lang.Throwable) selectorParseException19);
        java.lang.Throwable[] throwableArray26 = selectorParseException1.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertNotNull(throwableArray26);
    }

    @Test
    public void test2628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2628");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("#root", "");
        org.jsoup.select.Elements elements3 = document2.parents();
        java.lang.String str4 = document2.nodeName();
        org.jsoup.nodes.Document document5 = document2.normalise();
        org.jsoup.nodes.Node node6 = document2.parent();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#document" + "'", str4, "#document");
        org.junit.Assert.assertNotNull(document5);
        org.junit.Assert.assertNull(node6);
    }

    @Test
    public void test2629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2629");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.hasText();
        boolean boolean3 = document1.hasText();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        boolean boolean6 = document5.hasText();
        java.lang.String str7 = document5.nodeName();
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet10 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet10, strArray9);
        org.jsoup.nodes.Element element12 = document5.classNames((java.util.Set<java.lang.String>) strSet10);
        org.jsoup.nodes.Element element13 = document1.classNames((java.util.Set<java.lang.String>) strSet10);
        java.util.Set<java.lang.String> strSet14 = document1.classNames();
        org.jsoup.nodes.Element element16 = document1.getElementById("#document#document");
        java.lang.String str17 = document1.id();
        org.jsoup.parser.Tag tag18 = document1.tag();
        org.jsoup.nodes.Document document19 = document1.normalise();
        boolean boolean21 = document1.hasAttr("\n<!--#declaration-->");
        java.lang.String str22 = document1.title();
        org.jsoup.nodes.Element element24 = document1.html("<!#declaration>");
        org.jsoup.select.Elements elements26 = document1.getElementsByIndexLessThan(4);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#document" + "'", str7, "#document");
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNull(element16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(tag18);
        org.junit.Assert.assertNotNull(document19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(elements26);
    }

    @Test
    public void test2630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2630");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("org.jsoup.select.Selector$SelectorParseException: ", "");
        java.lang.String str4 = textNode2.absUrl("#data");
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("#data");
        org.jsoup.nodes.Document document8 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements10 = document8.getElementsByAttribute("hi!");
        java.lang.String str12 = elements10.attr("#root");
        org.jsoup.nodes.Document document14 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element[] elementArray15 = new org.jsoup.nodes.Element[] { document14 };
        java.util.ArrayList<org.jsoup.nodes.Element> elementList16 = new java.util.ArrayList<org.jsoup.nodes.Element>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<org.jsoup.nodes.Element>) elementList16, elementArray15);
        java.util.Spliterator<org.jsoup.nodes.Element> elementSpliterator18 = elementList16.spliterator();
        java.util.Spliterator<org.jsoup.nodes.Element> elementSpliterator19 = elementList16.spliterator();
        boolean boolean20 = elements10.containsAll((java.util.Collection<org.jsoup.nodes.Element>) elementList16);
        org.jsoup.select.Elements elements21 = new org.jsoup.select.Elements((java.util.List<org.jsoup.nodes.Element>) elementList16);
        org.jsoup.select.Elements elements22 = new org.jsoup.select.Elements((java.util.Collection<org.jsoup.nodes.Element>) elements21);
        org.jsoup.nodes.Document document24 = org.jsoup.Jsoup.parse("hi!");
        int int25 = elements21.indexOf((java.lang.Object) document24);
        java.lang.String str26 = document24.nodeName();
        boolean boolean27 = textNode2.equals((java.lang.Object) document24);
        java.lang.String str28 = document24.text();
        document24.title("org.jsoup.select.selector$selectorparseexception: \n<!--#document-->=\"#document#document=&quot;#document#document&quot;\"");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(textNode6);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(elementArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(elementSpliterator18);
        org.junit.Assert.assertNotNull(elementSpliterator19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(document24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "#document" + "'", str26, "#document");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
    }

    @Test
    public void test2631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2631");
        java.net.URL uRL0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parse(uRL0, (int) '<');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2632");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element5 = document1.prepend("#document");
        org.jsoup.nodes.Element element6 = element5.empty();
        org.jsoup.select.Elements elements8 = element6.getElementsByIndexLessThan(10);
        java.util.stream.Stream<org.jsoup.nodes.Element> elementStream9 = elements8.stream();
        org.jsoup.nodes.Document document12 = org.jsoup.parser.Parser.parseBodyFragmentRelaxed("body", "");
        org.jsoup.select.Elements elements14 = document12.getElementsByIndexEquals((-1));
        org.jsoup.select.Elements elements17 = elements14.attr(" #root=\"hi!\"", "#data");
        boolean boolean18 = elements8.retainAll((java.util.Collection<org.jsoup.nodes.Element>) elements14);
        org.jsoup.select.Elements elements19 = elements8.parents();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(elementStream9);
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(elements19);
    }

    @Test
    public void test2633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2633");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements5 = elements3.prepend("");
        org.jsoup.select.Elements elements7 = elements5.removeAttr("");
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements11 = document9.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements13 = elements11.prepend("");
        org.jsoup.select.Elements elements15 = elements13.removeAttr("");
        boolean boolean16 = elements5.containsAll((java.util.Collection<org.jsoup.nodes.Element>) elements13);
        org.jsoup.select.Elements elements18 = elements13.wrap("#root");
        org.jsoup.nodes.Document document20 = new org.jsoup.nodes.Document("");
        boolean boolean21 = document20.hasText();
        java.lang.String str22 = document20.nodeName();
        java.lang.String[] strArray24 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet25 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet25, strArray24);
        org.jsoup.nodes.Element element27 = document20.classNames((java.util.Set<java.lang.String>) strSet25);
        org.jsoup.nodes.Element element29 = element27.addClass("#document");
        org.jsoup.select.Elements elements32 = element29.getElementsByAttributeValueNot("#root", "org.jsoup.select.Selector$SelectorParseException: ");
        java.lang.String str33 = elements32.html();
        org.jsoup.nodes.Attributes attributes35 = new org.jsoup.nodes.Attributes();
        int int36 = attributes35.size();
        org.jsoup.nodes.Document document38 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements40 = document38.getElementsByAttribute("hi!");
        java.lang.String str41 = elements40.val();
        java.lang.Object obj42 = null;
        int int43 = elements40.lastIndexOf(obj42);
        org.jsoup.select.Elements elements45 = elements40.eq((int) '#');
        boolean boolean46 = attributes35.equals((java.lang.Object) elements45);
        boolean boolean48 = elements45.hasClass("<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        boolean boolean49 = elements32.addAll(1, (java.util.Collection<org.jsoup.nodes.Element>) elements45);
        boolean boolean50 = elements18.removeAll((java.util.Collection<org.jsoup.nodes.Element>) elements32);
        org.jsoup.select.Elements elements52 = elements32.eq((int) (byte) 0);
        org.jsoup.select.Elements elements53 = elements52.parents();
        boolean boolean55 = elements53.hasAttr("\n<body>\n #root \n</body>");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "#document" + "'", str22, "#document");
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertNotNull(elements32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(elements40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertNotNull(elements45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(elements52);
        org.junit.Assert.assertNotNull(elements53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
    }

    @Test
    public void test2634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2634");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.hasText();
        boolean boolean3 = document1.hasText();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        boolean boolean6 = document5.hasText();
        java.lang.String str7 = document5.nodeName();
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet10 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet10, strArray9);
        org.jsoup.nodes.Element element12 = document5.classNames((java.util.Set<java.lang.String>) strSet10);
        org.jsoup.nodes.Element element13 = document1.classNames((java.util.Set<java.lang.String>) strSet10);
        java.lang.String str14 = element13.text();
        org.jsoup.nodes.Element element16 = element13.appendElement("#document#document=\"#document#document\"");
        java.lang.String str17 = element16.html();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#document" + "'", str7, "#document");
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test2635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2635");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("org.jsoup.select.Selector$SelectorParseException: ");
        boolean boolean2 = tag1.isData();
        org.jsoup.nodes.Attributes attributes4 = new org.jsoup.nodes.Attributes();
        int int5 = attributes4.size();
        java.lang.String str6 = attributes4.html();
        org.jsoup.nodes.Element element7 = new org.jsoup.nodes.Element(tag1, "org.jsoup.select.selector$selectorparseexception:", attributes4);
        org.jsoup.nodes.Attributes attributes8 = new org.jsoup.nodes.Attributes();
        int int9 = attributes8.size();
        boolean boolean11 = attributes8.hasKey("");
        java.lang.String str12 = attributes8.toString();
        attributes4.addAll(attributes8);
        org.jsoup.nodes.Document document15 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements17 = document15.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element19 = document15.prepend("#document");
        org.jsoup.nodes.Element element20 = element19.empty();
        org.jsoup.select.Elements elements22 = element19.getElementsByTag("org.jsoup.select.Selector$SelectorParseException: ");
        org.jsoup.select.Elements elements24 = elements22.removeClass("#root");
        org.jsoup.nodes.Document document26 = new org.jsoup.nodes.Document("");
        boolean boolean27 = document26.hasText();
        java.lang.String str28 = document26.nodeName();
        java.lang.String[] strArray30 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet31 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet31, strArray30);
        org.jsoup.nodes.Element element33 = document26.classNames((java.util.Set<java.lang.String>) strSet31);
        org.jsoup.nodes.Element element35 = document26.append("#document");
        org.jsoup.nodes.Element element37 = document26.prepend("#document");
        org.jsoup.nodes.Attributes attributes38 = element37.attributes();
        org.jsoup.nodes.Element element40 = element37.append("hi!");
        org.jsoup.select.Elements elements42 = element40.getElementsByIndexLessThan((int) (short) 0);
        boolean boolean43 = elements22.equals((java.lang.Object) elements42);
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor45 = elements42.listIterator(0);
        org.jsoup.select.Elements elements47 = elements42.append("");
        org.jsoup.select.Elements elements49 = elements42.html(" class=\"hi!\"");
        boolean boolean50 = elements42.hasText();
        boolean boolean51 = attributes4.equals((java.lang.Object) boolean50);
        java.lang.String str52 = attributes4.toString();
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(elements22);
        org.junit.Assert.assertNotNull(elements24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "#document" + "'", str28, "#document");
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertNotNull(element37);
        org.junit.Assert.assertNotNull(attributes38);
        org.junit.Assert.assertNotNull(element40);
        org.junit.Assert.assertNotNull(elements42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(elementItor45);
        org.junit.Assert.assertNotNull(elements47);
        org.junit.Assert.assertNotNull(elements49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
    }

    @Test
    public void test2636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2636");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element4 = document1.attr("hi!", "#root");
        org.jsoup.nodes.Attributes attributes5 = document1.attributes();
        org.jsoup.select.Elements elements6 = document1.children();
        java.util.Set<java.lang.String> strSet7 = document1.classNames();
        org.jsoup.parser.Tag tag8 = document1.tag();
        org.jsoup.nodes.Document document10 = new org.jsoup.nodes.Document("");
        boolean boolean11 = document10.hasText();
        boolean boolean12 = document10.hasText();
        org.jsoup.nodes.Document document14 = new org.jsoup.nodes.Document("");
        boolean boolean15 = document14.hasText();
        java.lang.String str16 = document14.nodeName();
        java.lang.String[] strArray18 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet19 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet19, strArray18);
        org.jsoup.nodes.Element element21 = document14.classNames((java.util.Set<java.lang.String>) strSet19);
        org.jsoup.nodes.Element element22 = document10.classNames((java.util.Set<java.lang.String>) strSet19);
        org.jsoup.nodes.Element element24 = document10.appendText("hi!");
        org.jsoup.parser.Tag tag25 = document10.tag();
        boolean boolean26 = tag25.requiresSpecificParent();
        org.jsoup.parser.Tag tag27 = tag25.getImplicitParent();
        org.jsoup.nodes.Element element29 = new org.jsoup.nodes.Element(tag25, "<?#document#document>");
        boolean boolean30 = tag25.isData();
        boolean boolean31 = tag8.isValidParent(tag25);
        org.jsoup.parser.Tag tag34 = org.jsoup.parser.Tag.valueOf("org.jsoup.select.Selector$SelectorParseException: ");
        boolean boolean35 = tag34.isData();
        org.jsoup.nodes.Attributes attributes37 = new org.jsoup.nodes.Attributes();
        int int38 = attributes37.size();
        java.lang.String str39 = attributes37.html();
        org.jsoup.nodes.Element element40 = new org.jsoup.nodes.Element(tag34, "org.jsoup.select.selector$selectorparseexception:", attributes37);
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator41 = attributes37.spliterator();
        java.lang.String str42 = attributes37.toString();
        org.jsoup.parser.Tag tag44 = org.jsoup.parser.Tag.valueOf("org.jsoup.select.Selector$SelectorParseException: ");
        boolean boolean45 = tag44.isData();
        org.jsoup.nodes.Attributes attributes47 = new org.jsoup.nodes.Attributes();
        int int48 = attributes47.size();
        java.lang.String str49 = attributes47.html();
        org.jsoup.nodes.Element element50 = new org.jsoup.nodes.Element(tag44, "org.jsoup.select.selector$selectorparseexception:", attributes47);
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator51 = attributes47.spliterator();
        attributes47.put("#comment", "#document#document=\"#document#document\"");
        int int55 = attributes47.size();
        attributes37.addAll(attributes47);
        org.jsoup.nodes.Element element57 = new org.jsoup.nodes.Element(tag25, "#data", attributes37);
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor58 = attributes37.iterator();
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "#document" + "'", str16, "#document");
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(tag25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(tag27);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(tag34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(attributeSpliterator41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertNotNull(tag44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertNotNull(attributeSpliterator51);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 1 + "'", int55 == 1);
        org.junit.Assert.assertNotNull(attributeItor58);
    }

    @Test
    public void test2637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2637");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.hasText();
        java.lang.String str3 = document1.nodeName();
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        org.jsoup.nodes.Element element8 = document1.classNames((java.util.Set<java.lang.String>) strSet6);
        org.jsoup.nodes.Element element10 = element8.addClass("#document");
        org.jsoup.select.Elements elements13 = element10.getElementsByAttributeValueNot("#root", "org.jsoup.select.Selector$SelectorParseException: ");
        java.lang.String str14 = elements13.html();
        org.jsoup.nodes.Attributes attributes15 = new org.jsoup.nodes.Attributes();
        int int16 = attributes15.size();
        java.lang.String str17 = attributes15.html();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor18 = attributes15.iterator();
        boolean boolean19 = elements13.contains((java.lang.Object) attributes15);
        attributes15.remove("<?#document#document>");
        java.util.List<org.jsoup.nodes.Attribute> attributeList22 = attributes15.asList();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(attributeItor18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(attributeList22);
    }

    @Test
    public void test2638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2638");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parse("hi!");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValue("hi!", "hi!");
        org.jsoup.nodes.Attributes attributes5 = document1.attributes();
        org.jsoup.nodes.Element element6 = document1.head();
        org.jsoup.select.Elements elements7 = element6.getAllElements();
        org.jsoup.select.Elements elements8 = element6.getAllElements();
        org.jsoup.select.Elements elements10 = elements8.val(" class=\"hi!\"");
        org.jsoup.nodes.Element element11 = elements8.last();
        org.jsoup.nodes.Document document13 = new org.jsoup.nodes.Document("");
        boolean boolean14 = document13.hasText();
        java.lang.String str15 = document13.nodeName();
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet18 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet18, strArray17);
        org.jsoup.nodes.Element element20 = document13.classNames((java.util.Set<java.lang.String>) strSet18);
        org.jsoup.nodes.Element element22 = element20.addClass("#document");
        org.jsoup.nodes.Document document24 = new org.jsoup.nodes.Document("");
        boolean boolean25 = document24.hasText();
        boolean boolean26 = document24.hasText();
        org.jsoup.nodes.Document document28 = new org.jsoup.nodes.Document("");
        boolean boolean29 = document28.hasText();
        java.lang.String str30 = document28.nodeName();
        java.lang.String[] strArray32 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet33 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet33, strArray32);
        org.jsoup.nodes.Element element35 = document28.classNames((java.util.Set<java.lang.String>) strSet33);
        org.jsoup.nodes.Element element36 = document24.classNames((java.util.Set<java.lang.String>) strSet33);
        java.util.Set<java.lang.String> strSet37 = document24.classNames();
        org.jsoup.nodes.Element element38 = element20.classNames(strSet37);
        element11.replaceWith((org.jsoup.nodes.Node) element20);
        org.jsoup.nodes.Element element40 = element11.empty();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "#document" + "'", str15, "#document");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "#document" + "'", str30, "#document");
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertNotNull(element36);
        org.junit.Assert.assertNotNull(strSet37);
        org.junit.Assert.assertNotNull(element38);
        org.junit.Assert.assertNotNull(element40);
    }

    @Test
    public void test2639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2639");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parse("<html>\n<head>\n</head>\n<body>\n #document#document \n</body>\n</html>");
        document1.title("<html>\n<head>\n</head>\n<body>\n</body>\n</html>=\"\"=\"hi!\"");
        org.junit.Assert.assertNotNull(document1);
    }

    @Test
    public void test2640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2640");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("org.jsoup.select.selector$selectorparseexception:");
        org.jsoup.nodes.Element element2 = document1.body();
        org.jsoup.select.Elements elements3 = element2.children();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(elements3);
    }

    @Test
    public void test2641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2641");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("#document#document=\"#document#document\"");
        java.lang.String str2 = tokenQueue1.toString();
        java.lang.String str3 = tokenQueue1.consumeWord();
        boolean boolean4 = tokenQueue1.matchesWord();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[#, d, o, c, u, m, e, n, t, #, d, o, c, u, m, e, n, t, =, \", #, d, o, c, u, m, e, n, t, #, d, o, c, u, m, e, n, t, \"]" + "'", str2, "[#, d, o, c, u, m, e, n, t, #, d, o, c, u, m, e, n, t, =, \", #, d, o, c, u, m, e, n, t, #, d, o, c, u, m, e, n, t, \"]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test2642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2642");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element4 = document1.attr("hi!", "#root");
        org.jsoup.nodes.Attributes attributes5 = document1.attributes();
        org.jsoup.select.Elements elements6 = document1.children();
        java.util.Set<java.lang.String> strSet7 = document1.classNames();
        org.jsoup.parser.Tag tag8 = document1.tag();
        org.jsoup.nodes.Document document10 = new org.jsoup.nodes.Document("");
        boolean boolean11 = document10.hasText();
        boolean boolean12 = document10.hasText();
        org.jsoup.nodes.Document document14 = new org.jsoup.nodes.Document("");
        boolean boolean15 = document14.hasText();
        java.lang.String str16 = document14.nodeName();
        java.lang.String[] strArray18 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet19 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet19, strArray18);
        org.jsoup.nodes.Element element21 = document14.classNames((java.util.Set<java.lang.String>) strSet19);
        org.jsoup.nodes.Element element22 = document10.classNames((java.util.Set<java.lang.String>) strSet19);
        org.jsoup.nodes.Element element24 = document10.appendText("hi!");
        org.jsoup.parser.Tag tag25 = document10.tag();
        boolean boolean26 = tag25.requiresSpecificParent();
        org.jsoup.parser.Tag tag27 = tag25.getImplicitParent();
        org.jsoup.nodes.Element element29 = new org.jsoup.nodes.Element(tag25, "<?#document#document>");
        boolean boolean30 = tag25.isData();
        boolean boolean31 = tag8.isValidParent(tag25);
        org.jsoup.parser.Tag tag33 = org.jsoup.parser.Tag.valueOf("org.jsoup.select.Selector$SelectorParseException: ");
        java.lang.String str34 = tag33.getName();
        java.lang.String str35 = tag33.toString();
        java.lang.String str36 = tag33.getName();
        boolean boolean37 = tag33.isInline();
        boolean boolean38 = tag33.isEmpty();
        boolean boolean39 = tag25.isValidParent(tag33);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "#document" + "'", str16, "#document");
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(tag25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(tag27);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(tag33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "org.jsoup.select.selector$selectorparseexception:" + "'", str34, "org.jsoup.select.selector$selectorparseexception:");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "org.jsoup.select.selector$selectorparseexception:" + "'", str35, "org.jsoup.select.selector$selectorparseexception:");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "org.jsoup.select.selector$selectorparseexception:" + "'", str36, "org.jsoup.select.selector$selectorparseexception:");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test2643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2643");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.hasText();
        java.lang.String str3 = document1.nodeName();
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        org.jsoup.nodes.Element element8 = document1.classNames((java.util.Set<java.lang.String>) strSet6);
        org.jsoup.nodes.Element element10 = document1.append("#document");
        java.lang.String str11 = document1.outerHtml();
        java.lang.String str12 = document1.toString();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#document" + "'", str11, "#document");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "#document" + "'", str12, "#document");
    }

    @Test
    public void test2644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2644");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element5 = document1.prepend("#document");
        org.jsoup.nodes.Element element7 = document1.createElement("#data");
        org.jsoup.select.Elements elements9 = element7.getElementsByTag("\n&lt;!--#root--&gt;");
        org.jsoup.select.Elements elements11 = element7.getElementsByAttribute("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.jsoup.select.Elements elements13 = elements11.removeAttr(" class=&quot;hi!&quot;");
        java.util.Iterator<org.jsoup.nodes.Element> elementItor14 = elements13.iterator();
        org.jsoup.nodes.Document document16 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements18 = document16.getElementsByIndexGreaterThan((int) ' ');
        org.jsoup.select.Elements elements21 = document16.getElementsByAttributeValueStarting("\n&lt;!--#root--&gt;", "#text");
        org.jsoup.select.Elements elements23 = elements21.eq(100);
        int int24 = elements13.indexOf((java.lang.Object) elements23);
        org.jsoup.select.Elements elements25 = new org.jsoup.select.Elements((java.util.List<org.jsoup.nodes.Element>) elements23);
        org.jsoup.nodes.Element element26 = elements25.first();
        org.jsoup.nodes.Document document29 = org.jsoup.Jsoup.parseBodyFragment(" class=\"hi!\"");
        org.jsoup.nodes.Element element31 = document29.prependText("#document#documentdocument");
        // The following exception was thrown during execution in test generation
        try {
            elements25.add((int) (byte) 10, element31);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(elementItor14);
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertNotNull(elements21);
        org.junit.Assert.assertNotNull(elements23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNull(element26);
        org.junit.Assert.assertNotNull(document29);
        org.junit.Assert.assertNotNull(element31);
    }

    @Test
    public void test2645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2645");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.hasText();
        java.lang.String str3 = document1.nodeName();
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        org.jsoup.nodes.Element element8 = document1.classNames((java.util.Set<java.lang.String>) strSet6);
        org.jsoup.nodes.Element element10 = element8.addClass("#document");
        java.lang.String str11 = element10.html();
        org.jsoup.nodes.Element element13 = element10.appendElement("#document");
        org.jsoup.nodes.Document document15 = new org.jsoup.nodes.Document("");
        boolean boolean16 = document15.hasText();
        java.lang.String str17 = document15.nodeName();
        java.lang.String[] strArray19 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet20 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet20, strArray19);
        org.jsoup.nodes.Element element22 = document15.classNames((java.util.Set<java.lang.String>) strSet20);
        org.jsoup.nodes.Element element24 = document15.append("#document");
        org.jsoup.nodes.Element element26 = document15.prepend("#document");
        org.jsoup.nodes.Element element28 = element26.wrap("#document");
        java.lang.String str29 = element26.baseUri();
        org.jsoup.nodes.Element element30 = element10.prependChild((org.jsoup.nodes.Node) element26);
        org.jsoup.select.Elements elements32 = element26.getElementsByTag("org.jsoup.select.Selector$SelectorParseException: ");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements35 = element26.getElementsByAttributeValueEnding("", " hi!=\"#root\"");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "#document" + "'", str17, "#document");
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertNull(element28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertNotNull(elements32);
    }

    @Test
    public void test2646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2646");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("#root=\"\n&lt;!--#root--&gt;\"");
        org.junit.Assert.assertNotNull(document1);
    }

    @Test
    public void test2647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2647");
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parseBodyFragment("hi!=\"#root=&quot;hi!&quot;\"", "#root=\"hi!\"");
        java.lang.String str3 = document2.id();
        java.lang.String str4 = document2.nodeName();
        java.lang.String str5 = document2.html();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#document" + "'", str4, "#document");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n<head>\n</head>\n<body>\n hi!=&quot;#root=&quot;hi!&quot;&quot;\n</body>\n</html>" + "'", str5, "<html>\n<head>\n</head>\n<body>\n hi!=&quot;#root=&quot;hi!&quot;&quot;\n</body>\n</html>");
    }

    @Test
    public void test2648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2648");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("#document");
        java.lang.String str2 = tokenQueue1.consumeAttributeKey();
        java.lang.String str3 = tokenQueue1.consumeCssIdentifier();
        boolean boolean4 = tokenQueue1.consumeWhitespace();
        java.lang.String str6 = tokenQueue1.chompTo("hi!=\"#root=&quot;hi!&quot;\"");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#document" + "'", str6, "#document");
    }

    @Test
    public void test2649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2649");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.hasText();
        java.lang.String str3 = document1.nodeName();
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        org.jsoup.nodes.Element element8 = document1.classNames((java.util.Set<java.lang.String>) strSet6);
        org.jsoup.nodes.Element element10 = document1.append("#document");
        org.jsoup.nodes.Element element12 = document1.prepend("#document");
        org.jsoup.nodes.Element element14 = element12.wrap("#document");
        java.lang.String str15 = element12.baseUri();
        java.lang.String str16 = element12.nodeName();
        org.jsoup.select.Elements elements19 = element12.getElementsByAttributeValue("<?#document#documentdocument>", "org.jsoup.select.Selector$SelectorParseException:  hi!=\"#root\"");
        java.lang.String str20 = element12.text();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNull(element14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "#document" + "'", str16, "#document");
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "#document#document" + "'", str20, "#document#document");
    }

    @Test
    public void test2650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2650");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.hasText();
        java.lang.String str3 = document1.nodeName();
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        org.jsoup.nodes.Element element8 = document1.classNames((java.util.Set<java.lang.String>) strSet6);
        org.jsoup.nodes.Element element10 = document1.append("");
        org.jsoup.nodes.Element element12 = element10.addClass("#document#document");
        org.jsoup.select.Elements elements15 = element12.getElementsByAttributeValueNot("<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "\n<!--#declaration-->");
        org.jsoup.nodes.Element element16 = elements15.last();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(element16);
    }

    @Test
    public void test2651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2651");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("#root");
        org.jsoup.parser.Tag tag2 = tag1.getImplicitParent();
        org.jsoup.parser.Tag tag4 = org.jsoup.parser.Tag.valueOf("org.jsoup.select.Selector$SelectorParseException: ");
        boolean boolean5 = tag4.isData();
        boolean boolean6 = tag4.requiresSpecificParent();
        boolean boolean7 = tag4.isBlock();
        org.jsoup.parser.Tag tag9 = org.jsoup.parser.Tag.valueOf("org.jsoup.select.Selector$SelectorParseException: ");
        boolean boolean10 = tag9.isData();
        boolean boolean11 = tag9.requiresSpecificParent();
        boolean boolean12 = tag9.isBlock();
        boolean boolean13 = tag4.canContain(tag9);
        boolean boolean14 = tag4.isBlock();
        boolean boolean15 = tag4.isData();
        boolean boolean16 = tag4.isBlock();
        org.jsoup.parser.Tag tag17 = tag4.getImplicitParent();
        boolean boolean18 = tag1.isValidAncestor(tag17);
        org.jsoup.parser.Tag tag19 = tag17.getImplicitParent();
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertNotNull(tag2);
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(tag17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(tag19);
    }

    @Test
    public void test2652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2652");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!", "hi!");
        attribute2.setKey("#root");
        java.lang.String str5 = attribute2.getKey();
        java.lang.String str6 = attribute2.html();
        attribute2.setKey("<html>\n<head>\n <title>&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n #root \n&lt;/body&gt;\n&lt;/html&gt;</title>\n</head>\n<body>\n</body>\n</html>");
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#root" + "'", str5, "#root");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#root=\"hi!\"" + "'", str6, "#root=\"hi!\"");
    }

    @Test
    public void test2653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2653");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element4 = document1.attr("hi!", "#root");
        org.jsoup.nodes.Attributes attributes5 = document1.attributes();
        org.jsoup.select.Elements elements6 = document1.children();
        java.util.Set<java.lang.String> strSet7 = document1.classNames();
        org.jsoup.select.Elements elements9 = document1.getElementsByTag("hi!=\"#root=&quot;hi!&quot;\"");
        org.jsoup.nodes.Element element11 = document1.addClass("\n<!--#root-->");
        org.jsoup.nodes.Element element13 = document1.val("#document#documentdocument");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element13);
    }

    @Test
    public void test2654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2654");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element5 = document1.prepend("#document");
        org.jsoup.select.Elements elements7 = element5.getElementsByAttribute("hi!");
        int int8 = elements7.size();
        org.jsoup.select.Elements elements10 = elements7.toggleClass("#document#document=\"#document#document\"");
        int int11 = elements10.size();
        org.jsoup.select.Elements elements12 = new org.jsoup.select.Elements((java.util.List<org.jsoup.nodes.Element>) elements10);
        org.jsoup.nodes.Document document14 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements16 = document14.getElementsByAttribute("hi!");
        java.lang.String str18 = elements16.attr("#root");
        org.jsoup.nodes.Document document20 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element[] elementArray21 = new org.jsoup.nodes.Element[] { document20 };
        java.util.ArrayList<org.jsoup.nodes.Element> elementList22 = new java.util.ArrayList<org.jsoup.nodes.Element>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<org.jsoup.nodes.Element>) elementList22, elementArray21);
        java.util.Spliterator<org.jsoup.nodes.Element> elementSpliterator24 = elementList22.spliterator();
        java.util.Spliterator<org.jsoup.nodes.Element> elementSpliterator25 = elementList22.spliterator();
        boolean boolean26 = elements16.containsAll((java.util.Collection<org.jsoup.nodes.Element>) elementList22);
        org.jsoup.select.Elements elements27 = new org.jsoup.select.Elements((java.util.List<org.jsoup.nodes.Element>) elementList22);
        org.jsoup.select.Elements elements28 = new org.jsoup.select.Elements((java.util.Collection<org.jsoup.nodes.Element>) elements27);
        java.lang.String str29 = elements28.html();
        org.jsoup.nodes.Document document31 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements33 = document31.getElementsByAttribute("hi!");
        java.lang.String str35 = elements33.attr("#root");
        org.jsoup.select.Elements elements36 = elements33.parents();
        boolean boolean37 = elements28.containsAll((java.util.Collection<org.jsoup.nodes.Element>) elements33);
        org.jsoup.select.Elements elements39 = elements28.eq(0);
        org.jsoup.nodes.Element element40 = elements28.last();
        org.jsoup.nodes.Element element42 = element40.appendElement("[#, d, o, c, u, m, e, n, t]");
        boolean boolean43 = elements10.add(element42);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(elementArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(elementSpliterator24);
        org.junit.Assert.assertNotNull(elementSpliterator25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(elements33);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(elements36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(elements39);
        org.junit.Assert.assertNotNull(element40);
        org.junit.Assert.assertNotNull(element42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
    }

    @Test
    public void test2655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2655");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parse("hi!");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValue("hi!", "hi!");
        document1.title("[]");
        org.jsoup.nodes.Element element8 = document1.prependText("#document#document");
        org.jsoup.nodes.Element element10 = element8.appendText("hi!=\"#root=&quot;hi!&quot;\"");
        org.jsoup.select.Elements elements12 = element10.getElementsByTag("#text");
        org.jsoup.select.Elements elements15 = element10.getElementsByAttributeValueEnding("<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>#document#documentdocument", "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>\n<html> \n<head> \n</head> \n<body>\n  #root  \n</body>\n</html>");
        org.jsoup.nodes.Element element17 = element10.append("\n<#document#document class=\" org.jsoup.select.selector$selectorparseexception: org.jsoup.select.selector$selectorparseexception:=&quot;#root&quot;\">\n</#document#document>");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(element17);
    }

    @Test
    public void test2656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2656");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.hasText();
        java.lang.String str3 = document1.nodeName();
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        org.jsoup.nodes.Element element8 = document1.classNames((java.util.Set<java.lang.String>) strSet6);
        org.jsoup.nodes.Element element10 = document1.append("#document");
        org.jsoup.nodes.Element element12 = document1.prepend("#document");
        org.jsoup.nodes.Attributes attributes13 = element12.attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator14 = attributes13.spliterator();
        org.jsoup.nodes.Attributes attributes15 = new org.jsoup.nodes.Attributes();
        int int16 = attributes15.size();
        java.lang.String str17 = attributes15.html();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor18 = attributes15.iterator();
        boolean boolean19 = attributes13.equals((java.lang.Object) attributes15);
        java.lang.String str20 = attributes13.toString();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator21 = attributes13.spliterator();
        attributes13.remove("\n<!--#document#document-->");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertNotNull(attributeSpliterator14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(attributeItor18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + " class=\"hi!\"" + "'", str20, " class=\"hi!\"");
        org.junit.Assert.assertNotNull(attributeSpliterator21);
    }

    @Test
    public void test2657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2657");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("org.jsoup.select.Selector$SelectorParseException: ");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Document document4 = document3.normalise();
        org.jsoup.nodes.Element element5 = document3.head();
        org.jsoup.nodes.Element element7 = element5.append("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element9 = element5.wrap("#text");
        boolean boolean10 = tag1.equals((java.lang.Object) element9);
        boolean boolean11 = tag1.isBlock();
        boolean boolean12 = tag1.isEmpty();
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(document4);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNull(element9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2658");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element4 = document1.attr("hi!", "#root");
        org.jsoup.nodes.Attributes attributes5 = document1.attributes();
        org.jsoup.nodes.Document document6 = document1.normalise();
        java.lang.String str7 = document1.nodeName();
        org.jsoup.nodes.Element element9 = document1.createElement("a");
        org.jsoup.select.Elements elements12 = element9.getElementsByAttributeValueContaining("<html>\n<head>\n</head>\n<body>\n</body>\n</html>=\"\"=\"hi!\"", " hi!");
        org.jsoup.nodes.Element element14 = element9.toggleClass("\n<body>\n</body>");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#document" + "'", str7, "#document");
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(element14);
    }

    @Test
    public void test2659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2659");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!", "\n&lt;!--#root--&gt;");
        attribute2.setValue("\n<!--org.jsoup.select.selector$selectorparseexception: org.jsoup.select.selector$selectorparseexception:=\"#root\"-->");
        java.lang.String str5 = attribute2.toString();
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!=\"\n&lt;!--org.jsoup.select.selector$selectorparseexception: org.jsoup.select.selector$selectorparseexception:=&quot;#root&quot;--&gt;\"" + "'", str5, "hi!=\"\n&lt;!--org.jsoup.select.selector$selectorparseexception: org.jsoup.select.selector$selectorparseexception:=&quot;#root&quot;--&gt;\"");
    }

    @Test
    public void test2660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2660");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        java.lang.String str4 = document1.nodeName();
        java.lang.String str5 = document1.outerHtml();
        boolean boolean7 = document1.hasAttr("#document#document");
        org.jsoup.select.Elements elements10 = document1.getElementsByAttributeValueEnding("#document", "#comment");
        org.jsoup.nodes.Element element12 = document1.prependElement("org.jsoup.select.selector$selectorparseexception:");
        org.jsoup.nodes.Element element13 = element12.nextElementSibling();
        boolean boolean14 = element12.isBlock();
        org.jsoup.nodes.Node node15 = element12.parent();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#document" + "'", str4, "#document");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNull(element13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node15);
    }

    @Test
    public void test2661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2661");
        org.jsoup.nodes.Evaluator evaluator0 = null;
        org.jsoup.nodes.Document document2 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Document document3 = document2.normalise();
        org.jsoup.nodes.Element element4 = document2.head();
        org.jsoup.nodes.Element element6 = element4.append("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        boolean boolean8 = element6.equals((java.lang.Object) "#root=\"hi!\"");
        org.jsoup.nodes.Document document10 = new org.jsoup.nodes.Document("");
        boolean boolean11 = document10.hasText();
        java.lang.String str12 = document10.nodeName();
        java.lang.String str13 = document10.val();
        java.lang.String str14 = document10.outerHtml();
        java.lang.String[] strArray17 = new java.lang.String[] { "\n<!--#document-->", "#data" };
        java.util.LinkedHashSet<java.lang.String> strSet18 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet18, strArray17);
        org.jsoup.nodes.Element element20 = document10.classNames((java.util.Set<java.lang.String>) strSet18);
        org.jsoup.nodes.Element element21 = element6.classNames((java.util.Set<java.lang.String>) strSet18);
        org.jsoup.nodes.Element element23 = element21.val("#document");
        org.jsoup.select.Elements elements26 = element23.getElementsByAttributeValueContaining("<[#, d, o, c, u, m, e, n, t]>\n</[#, d, o, c, u, m, e, n, t]>#root=&quot;hi!&quot;", "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>\n<html> \n<head> \n</head> \n<body>\n  #root  \n</body>\n</html>");
        org.jsoup.nodes.Element element27 = element23.lastElementSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements28 = org.jsoup.select.Collector.collect(evaluator0, element27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "#document" + "'", str12, "#document");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(elements26);
        org.junit.Assert.assertNotNull(element27);
    }

    @Test
    public void test2662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2662");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements5 = elements3.prepend("");
        org.jsoup.select.Elements elements7 = elements5.removeAttr("");
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements11 = document9.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements13 = elements11.prepend("");
        org.jsoup.select.Elements elements15 = elements13.removeAttr("");
        boolean boolean16 = elements5.containsAll((java.util.Collection<org.jsoup.nodes.Element>) elements13);
        java.lang.Object[] objArray17 = elements5.toArray();
        org.jsoup.nodes.Document document19 = new org.jsoup.nodes.Document("");
        boolean boolean20 = document19.hasText();
        java.lang.String str21 = document19.nodeName();
        java.lang.String str22 = document19.val();
        boolean boolean23 = elements5.add((org.jsoup.nodes.Element) document19);
        org.jsoup.select.Elements elements24 = new org.jsoup.select.Elements((java.util.Collection<org.jsoup.nodes.Element>) elements5);
        org.jsoup.select.Elements elements26 = elements5.addClass("class=\"hi!\"");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "#document" + "'", str21, "#document");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(elements26);
    }

    @Test
    public void test2663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2663");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        java.lang.String str4 = elements3.outerHtml();
        java.lang.String str5 = elements3.val();
        org.jsoup.select.Elements elements6 = new org.jsoup.select.Elements((java.util.List<org.jsoup.nodes.Element>) elements3);
        org.jsoup.select.Elements elements7 = new org.jsoup.select.Elements((java.util.Collection<org.jsoup.nodes.Element>) elements3);
        boolean boolean9 = elements3.is("<?#document#document>=\"[#, d, o, c, u, m, e, n, t]\"");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2664");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("org.jsoup.select.Selector$SelectorParseException: org.jsoup.select.selector$selectorparseexception:", "#document#document=\"#document#document\"");
        org.jsoup.select.Elements elements4 = document2.getElementsByIndexLessThan((int) (byte) 1);
        java.lang.String str5 = document2.nodeName();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#document" + "'", str5, "#document");
    }

    @Test
    public void test2665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2665");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.hasText();
        java.lang.String str3 = document1.nodeName();
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        org.jsoup.nodes.Element element8 = document1.classNames((java.util.Set<java.lang.String>) strSet6);
        org.jsoup.nodes.Element element10 = document1.append("#document");
        org.jsoup.nodes.Element element12 = document1.prepend("#document");
        org.jsoup.nodes.Attributes attributes13 = element12.attributes();
        org.jsoup.nodes.Document document15 = org.jsoup.Jsoup.parse("hi!");
        org.jsoup.select.Elements elements18 = document15.getElementsByAttributeValue("hi!", "hi!");
        org.jsoup.nodes.Attributes attributes19 = document15.attributes();
        attributes19.remove("#root=\"hi!\"");
        attributes13.addAll(attributes19);
        java.lang.String str24 = attributes19.get("<<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>>\n</<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>>");
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor25 = attributes19.iterator();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertNotNull(document15);
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertNotNull(attributes19);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(attributeItor25);
    }

    @Test
    public void test2666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2666");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragmentRelaxed("hi!", "#data");
        java.lang.String str3 = document2.text();
        java.util.Set<java.lang.String> strSet4 = document2.classNames();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(strSet4);
    }

    @Test
    public void test2667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2667");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("<#document#document=\"#document#document\">\n</#document#document=\"#document#document\">", "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>", true);
        java.lang.String str4 = xmlDeclaration3.nodeName();
        java.lang.String str5 = xmlDeclaration3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#declaration" + "'", str4, "#declaration");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!<#document#document=\"#document#document\">\n</#document#document=\"#document#document\">>" + "'", str5, "<!<#document#document=\"#document#document\">\n</#document#document=\"#document#document\">>");
    }

    @Test
    public void test2668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2668");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("<#root class=\"hi!\">\nhi!\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "[]");
        org.jsoup.nodes.Element element4 = document2.prependText("<html>\n<head>\n</head>\n<body>\n hi!=&quot;#root=&quot;hi!&quot;&quot;\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
    }

    @Test
    public void test2669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2669");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("#data");
        org.junit.Assert.assertNotNull(document1);
    }

    @Test
    public void test2670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2670");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element5 = document1.prepend("#document");
        org.jsoup.nodes.Element element6 = element5.empty();
        org.jsoup.select.Elements elements8 = element5.getElementsByTag("org.jsoup.select.Selector$SelectorParseException: ");
        org.jsoup.select.Elements elements10 = elements8.removeClass("#root");
        org.jsoup.select.Elements elements12 = elements8.append("");
        java.util.stream.Stream<org.jsoup.nodes.Element> elementStream13 = elements12.stream();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(elementStream13);
    }

    @Test
    public void test2671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2671");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parse("&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;");
        org.junit.Assert.assertNotNull(document1);
    }

    @Test
    public void test2672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2672");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("org.jsoup.select.selector$selectorparseexception: org.jsoup.select.selector$selectorparseexception:=\"#root\"", "\n<!--#data-->");
        org.jsoup.nodes.Document document3 = document2.normalise();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(document3);
    }

    @Test
    public void test2673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2673");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.hasText();
        java.lang.String str3 = document1.nodeName();
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        org.jsoup.nodes.Element element8 = document1.classNames((java.util.Set<java.lang.String>) strSet6);
        org.jsoup.nodes.Element element10 = document1.append("#document");
        org.jsoup.nodes.Element element12 = document1.prepend("#document");
        org.jsoup.select.Elements elements13 = document1.parents();
        org.jsoup.select.Elements elements14 = document1.children();
        org.jsoup.nodes.Element element15 = document1.parent();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNull(element15);
    }

    @Test
    public void test2674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2674");
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parseBodyFragment("hi!=\"#root=&quot;hi!&quot;\"", "#root=\"hi!\"");
        org.jsoup.select.Elements elements5 = document2.getElementsByAttributeValueContaining("[]", "#root");
        java.lang.String str6 = document2.nodeName();
        org.jsoup.select.Elements elements9 = document2.getElementsByAttributeValueEnding(" ", "<!>");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#document" + "'", str6, "#document");
        org.junit.Assert.assertNotNull(elements9);
    }

    @Test
    public void test2675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2675");
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parse("", "");
        java.lang.String str3 = document2.nodeName();
        java.lang.String str4 = document2.text();
        org.jsoup.nodes.Node node7 = document2.attr("hi!=\"#root=&quot;hi!&quot;\"", "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element9 = document2.createElement("#root");
        org.jsoup.nodes.Element element11 = element9.removeClass("");
        org.jsoup.nodes.Node node12 = element11.parent();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test2676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2676");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("org.jsoup.select.Selector$SelectorParseException: ");
        boolean boolean2 = tag1.isData();
        boolean boolean3 = tag1.requiresSpecificParent();
        boolean boolean4 = tag1.isBlock();
        org.jsoup.parser.Tag tag6 = org.jsoup.parser.Tag.valueOf("org.jsoup.select.Selector$SelectorParseException: ");
        boolean boolean7 = tag6.isData();
        boolean boolean8 = tag6.requiresSpecificParent();
        boolean boolean9 = tag6.isBlock();
        boolean boolean10 = tag1.canContain(tag6);
        org.jsoup.nodes.Document document13 = new org.jsoup.nodes.Document("");
        boolean boolean14 = document13.hasText();
        java.lang.String str15 = document13.nodeName();
        org.jsoup.nodes.Document document17 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element20 = document17.attr("hi!", "#root");
        org.jsoup.nodes.Attributes attributes21 = document17.attributes();
        boolean boolean22 = document13.equals((java.lang.Object) attributes21);
        org.jsoup.nodes.Element element23 = new org.jsoup.nodes.Element(tag1, "#document#document=\"#document#document\"", attributes21);
        org.jsoup.nodes.Document document25 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements27 = document25.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements29 = elements27.prepend("");
        org.jsoup.select.Elements elements31 = elements29.removeAttr("");
        org.jsoup.nodes.Document document33 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements35 = document33.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements37 = elements35.prepend("");
        org.jsoup.select.Elements elements39 = elements37.removeAttr("");
        boolean boolean40 = elements29.containsAll((java.util.Collection<org.jsoup.nodes.Element>) elements37);
        org.jsoup.select.Elements elements42 = elements37.wrap("#root");
        org.jsoup.select.Elements elements43 = new org.jsoup.select.Elements((java.util.Collection<org.jsoup.nodes.Element>) elements42);
        org.jsoup.nodes.Document document45 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements47 = document45.getElementsByAttribute("hi!");
        java.lang.String str49 = elements47.attr("#root");
        java.lang.String str50 = elements47.text();
        org.jsoup.select.Elements elements52 = elements47.eq((int) (short) 10);
        boolean boolean53 = elements43.containsAll((java.util.Collection<org.jsoup.nodes.Element>) elements47);
        org.jsoup.select.Elements elements55 = elements43.html("#root");
        org.jsoup.nodes.Document document57 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements59 = document57.getElementsByAttribute("hi!");
        java.lang.String str60 = elements59.val();
        java.lang.Object obj61 = null;
        int int62 = elements59.lastIndexOf(obj61);
        org.jsoup.select.Elements elements64 = elements59.eq((int) '#');
        boolean boolean66 = elements59.hasAttr("#root");
        int int68 = elements59.indexOf((java.lang.Object) (byte) 100);
        org.jsoup.select.Elements elements70 = elements59.addClass("");
        boolean boolean71 = elements55.removeAll((java.util.Collection<org.jsoup.nodes.Element>) elements59);
        boolean boolean72 = attributes21.equals((java.lang.Object) elements55);
        attributes21.put("\n<!--#data-->", " hi!");
        attributes21.remove("[<, h, t, m, l, >, \n, <, h, e, a, d, >, \n, <, /, h, e, a, d, >, \n, <, b, o, d, y, >, \n,  , #, r, o, o, t,  , \n, <, /, b, o, d, y, >, \n, <, /, h, t, m, l, >, #, d, o, c, u, m, e, n, t, #, d, o, c, u, m, e, n, t, d, o, c, u, m, e, n, t]");
        java.util.List<org.jsoup.nodes.Attribute> attributeList78 = attributes21.asList();
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "#document" + "'", str15, "#document");
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(attributes21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(elements27);
        org.junit.Assert.assertNotNull(elements29);
        org.junit.Assert.assertNotNull(elements31);
        org.junit.Assert.assertNotNull(elements35);
        org.junit.Assert.assertNotNull(elements37);
        org.junit.Assert.assertNotNull(elements39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(elements42);
        org.junit.Assert.assertNotNull(elements47);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertNotNull(elements52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(elements55);
        org.junit.Assert.assertNotNull(elements59);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-1) + "'", int62 == (-1));
        org.junit.Assert.assertNotNull(elements64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + (-1) + "'", int68 == (-1));
        org.junit.Assert.assertNotNull(elements70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(attributeList78);
    }

    @Test
    public void test2677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2677");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("#root", "");
        org.jsoup.nodes.Element element5 = document2.attr("#root", "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        java.lang.String str6 = document2.tagName();
        org.jsoup.nodes.Element element7 = document2.empty();
        java.lang.String str9 = document2.absUrl("#data");
        org.jsoup.nodes.Document document11 = new org.jsoup.nodes.Document("");
        boolean boolean12 = document11.hasText();
        boolean boolean13 = document11.hasText();
        org.jsoup.nodes.Document document15 = new org.jsoup.nodes.Document("");
        boolean boolean16 = document15.hasText();
        java.lang.String str17 = document15.nodeName();
        java.lang.String[] strArray19 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet20 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet20, strArray19);
        org.jsoup.nodes.Element element22 = document15.classNames((java.util.Set<java.lang.String>) strSet20);
        org.jsoup.nodes.Element element23 = document11.classNames((java.util.Set<java.lang.String>) strSet20);
        java.util.Set<java.lang.String> strSet24 = document11.classNames();
        org.jsoup.nodes.Element element26 = document11.getElementById("#document#document");
        java.lang.String str27 = document11.id();
        org.jsoup.parser.Tag tag28 = document11.tag();
        org.jsoup.parser.Tag tag30 = org.jsoup.parser.Tag.valueOf("#declaration");
        java.lang.String str31 = tag30.toString();
        boolean boolean32 = tag28.isValidParent(tag30);
        org.jsoup.nodes.Element element34 = new org.jsoup.nodes.Element(tag28, "");
        java.lang.String str35 = element34.text();
        org.jsoup.nodes.Element element36 = document2.prependChild((org.jsoup.nodes.Node) element34);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements38 = document2.select("<org.jsoup.select.selector$selectorparseexception: hi!=\"#root\">\n</org.jsoup.select.selector$selectorparseexception:>");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query <org.jsoup.select.selector$selectorparseexception: hi!=\"#root\">?</org.jsoup.select.selector$selectorparseexception:>");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#root" + "'", str6, "#root");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "#document" + "'", str17, "#document");
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(strSet24);
        org.junit.Assert.assertNull(element26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(tag28);
        org.junit.Assert.assertNotNull(tag30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "#declaration" + "'", str31, "#declaration");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(element36);
    }

    @Test
    public void test2678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2678");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.hasText();
        java.lang.String str3 = document1.nodeName();
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        org.jsoup.nodes.Element element8 = document1.classNames((java.util.Set<java.lang.String>) strSet6);
        org.jsoup.nodes.Element element10 = document1.append("#document");
        org.jsoup.nodes.Element element12 = document1.prepend("#document");
        org.jsoup.nodes.Attributes attributes13 = element12.attributes();
        org.jsoup.nodes.Element element15 = element12.append("hi!");
        boolean boolean17 = element12.hasClass("");
        org.jsoup.nodes.Element element19 = element12.val("[]");
        org.jsoup.select.Elements elements22 = element19.getElementsByAttributeValueStarting("\n<!--#document--> #data", "<html> \n<head> \n</head> \n<body>\n  #root  \n</body>\n</html>");
        java.lang.String str23 = element19.id();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(elements22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test2679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2679");
        org.jsoup.nodes.DataNode dataNode2 = org.jsoup.nodes.DataNode.createFromEncoded("org.jsoup.select.Selector$SelectorParseException: ", "");
        java.lang.String str3 = dataNode2.nodeName();
        org.junit.Assert.assertNotNull(dataNode2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#data" + "'", str3, "#data");
    }

    @Test
    public void test2680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2680");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element4 = document1.attr("hi!", "#root");
        org.jsoup.nodes.Attributes attributes5 = document1.attributes();
        org.jsoup.nodes.Document document6 = document1.normalise();
        org.jsoup.nodes.Element element7 = document1.head();
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNotNull(element7);
    }

    @Test
    public void test2681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2681");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.hasText();
        boolean boolean3 = document1.hasText();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        boolean boolean6 = document5.hasText();
        java.lang.String str7 = document5.nodeName();
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet10 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet10, strArray9);
        org.jsoup.nodes.Element element12 = document5.classNames((java.util.Set<java.lang.String>) strSet10);
        org.jsoup.nodes.Element element13 = document1.classNames((java.util.Set<java.lang.String>) strSet10);
        org.jsoup.nodes.Element element15 = document1.appendText("hi!");
        org.jsoup.parser.Tag tag16 = document1.tag();
        boolean boolean17 = tag16.requiresSpecificParent();
        org.jsoup.parser.Tag tag18 = tag16.getImplicitParent();
        boolean boolean19 = tag18.isInline();
        boolean boolean20 = tag18.requiresSpecificParent();
        boolean boolean21 = tag18.preserveWhitespace();
        boolean boolean22 = tag18.isInline();
        boolean boolean23 = tag18.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#document" + "'", str7, "#document");
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(tag16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(tag18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test2682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2682");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.hasText();
        java.lang.String str3 = document1.nodeName();
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        org.jsoup.nodes.Element element8 = document1.classNames((java.util.Set<java.lang.String>) strSet6);
        org.jsoup.nodes.Element element10 = element8.addClass("#document");
        java.lang.String str11 = element10.html();
        org.jsoup.nodes.Element element13 = element10.appendElement("#document");
        java.lang.String str14 = element13.html();
        org.jsoup.select.Elements elements17 = element13.getElementsByAttributeValueStarting("#root=\"hi!\"", "[#, d, o, c, u, m, e, n, t]");
        org.jsoup.select.Elements elements20 = element13.getElementsByAttributeValueContaining("org.jsoup.select.selector$selectorparseexception:", "org.jsoup.select.selector$selectorparseexception: org.jsoup.select.selector$selectorparseexception:=\"#root\"");
        org.jsoup.select.Elements elements22 = elements20.val("#document class=&quot;hi!&quot;");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertNotNull(elements20);
        org.junit.Assert.assertNotNull(elements22);
    }

    @Test
    public void test2683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2683");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        java.lang.String str4 = elements3.outerHtml();
        java.lang.String str5 = elements3.val();
        org.jsoup.select.Elements elements6 = new org.jsoup.select.Elements((java.util.List<org.jsoup.nodes.Element>) elements3);
        java.lang.String str8 = elements3.attr("org.jsoup.select.Selector$SelectorParseException: ");
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor9 = elements3.listIterator();
        org.jsoup.select.Elements elements11 = elements3.select("<!--#document-->");
        org.jsoup.nodes.Document document13 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements15 = document13.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements17 = elements15.prepend("");
        org.jsoup.select.Elements elements19 = elements17.removeAttr("");
        org.jsoup.nodes.Document document21 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements23 = document21.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements25 = elements23.prepend("");
        org.jsoup.select.Elements elements27 = elements25.removeAttr("");
        boolean boolean28 = elements17.containsAll((java.util.Collection<org.jsoup.nodes.Element>) elements25);
        org.jsoup.nodes.Document document30 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements32 = document30.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements34 = elements32.prepend("");
        org.jsoup.select.Elements elements36 = elements34.removeAttr("");
        org.jsoup.nodes.Document document38 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements40 = document38.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements42 = elements40.prepend("");
        org.jsoup.select.Elements elements44 = elements42.removeAttr("");
        boolean boolean45 = elements34.containsAll((java.util.Collection<org.jsoup.nodes.Element>) elements42);
        org.jsoup.select.Elements elements47 = elements42.wrap("#root");
        boolean boolean48 = elements25.containsAll((java.util.Collection<org.jsoup.nodes.Element>) elements47);
        org.jsoup.select.Elements elements50 = elements25.removeClass("");
        org.jsoup.select.Elements elements53 = elements50.attr("#data", " class=\"hi!\"");
        org.jsoup.select.Elements elements56 = elements53.attr("<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "[#, d, o, c, u, m, e, n, t]");
        boolean boolean57 = elements3.containsAll((java.util.Collection<org.jsoup.nodes.Element>) elements56);
        org.jsoup.select.Elements elements59 = elements3.val("<html>\n<head>\n</head>\n<body>\n org.jsoup.select.selector$selectorparseexception:\n</body>\n</html>");
        boolean boolean61 = elements59.is("<html>\n<head>\n</head>\n<body>\n #document#document=&quot;#document#document&quot; \n</body>\n</html>");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(elementItor9);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertNotNull(elements23);
        org.junit.Assert.assertNotNull(elements25);
        org.junit.Assert.assertNotNull(elements27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(elements32);
        org.junit.Assert.assertNotNull(elements34);
        org.junit.Assert.assertNotNull(elements36);
        org.junit.Assert.assertNotNull(elements40);
        org.junit.Assert.assertNotNull(elements42);
        org.junit.Assert.assertNotNull(elements44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(elements47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(elements50);
        org.junit.Assert.assertNotNull(elements53);
        org.junit.Assert.assertNotNull(elements56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(elements59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
    }

    @Test
    public void test2684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2684");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        java.lang.String str4 = document1.nodeName();
        org.jsoup.nodes.Element element6 = document1.appendElement("#document#document");
        org.jsoup.nodes.Element element8 = element6.addClass("org.jsoup.select.selector$selectorparseexception: org.jsoup.select.selector$selectorparseexception:=\"#root\"");
        java.lang.String str9 = element6.outerHtml();
        org.jsoup.nodes.Element element11 = element6.prependText("\n<!--#document--> #data");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#document" + "'", str4, "#document");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\n<#document#document class=\" org.jsoup.select.selector$selectorparseexception: org.jsoup.select.selector$selectorparseexception:=&quot;#root&quot;\">\n</#document#document>" + "'", str9, "\n<#document#document class=\" org.jsoup.select.selector$selectorparseexception: org.jsoup.select.selector$selectorparseexception:=&quot;#root&quot;\">\n</#document#document>");
        org.junit.Assert.assertNotNull(element11);
    }

    @Test
    public void test2685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2685");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("<!--#document--><#root hi!=\"#root\">\n</#root>");
        org.junit.Assert.assertNotNull(document1);
    }

    @Test
    public void test2686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2686");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "\n<!--#root-->");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.toString();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test2687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2687");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.hasText();
        java.lang.String str3 = document1.nodeName();
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        org.jsoup.nodes.Element element8 = document1.classNames((java.util.Set<java.lang.String>) strSet6);
        org.jsoup.nodes.Element element10 = document1.append("#document");
        org.jsoup.nodes.Element element12 = document1.prepend("#document");
        org.jsoup.nodes.Element element14 = element12.wrap("#document");
        java.lang.String str15 = element12.text();
        java.lang.String str16 = element12.id();
        org.jsoup.select.Elements elements18 = element12.getElementsByAttribute("#data");
        org.jsoup.select.Elements elements20 = element12.getElementsByAttribute("body");
        org.jsoup.select.Elements elements22 = elements20.html("<html>\n<head>\n <title>&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n #root \n&lt;/body&gt;\n&lt;/html&gt;</title>\n</head>\n<body>\n</body>\n</html>");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNull(element14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "#document#document" + "'", str15, "#document#document");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertNotNull(elements20);
        org.junit.Assert.assertNotNull(elements22);
    }

    @Test
    public void test2688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2688");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        java.lang.String str5 = elements3.attr("#root");
        org.jsoup.nodes.Document document7 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element[] elementArray8 = new org.jsoup.nodes.Element[] { document7 };
        java.util.ArrayList<org.jsoup.nodes.Element> elementList9 = new java.util.ArrayList<org.jsoup.nodes.Element>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<org.jsoup.nodes.Element>) elementList9, elementArray8);
        java.util.Spliterator<org.jsoup.nodes.Element> elementSpliterator11 = elementList9.spliterator();
        java.util.Spliterator<org.jsoup.nodes.Element> elementSpliterator12 = elementList9.spliterator();
        boolean boolean13 = elements3.containsAll((java.util.Collection<org.jsoup.nodes.Element>) elementList9);
        org.jsoup.select.Elements elements14 = new org.jsoup.select.Elements((java.util.List<org.jsoup.nodes.Element>) elementList9);
        org.jsoup.select.Elements elements15 = new org.jsoup.select.Elements((java.util.Collection<org.jsoup.nodes.Element>) elements14);
        java.lang.String str16 = elements15.html();
        org.jsoup.nodes.Element element17 = elements15.last();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element19 = elements15.get((int) 'd');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(elementArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(elementSpliterator11);
        org.junit.Assert.assertNotNull(elementSpliterator12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(element17);
    }

    @Test
    public void test2689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2689");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements5 = elements3.prepend("");
        org.jsoup.select.Elements elements7 = elements5.removeAttr("");
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements11 = document9.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements13 = elements11.prepend("");
        org.jsoup.select.Elements elements15 = elements13.removeAttr("");
        boolean boolean16 = elements5.containsAll((java.util.Collection<org.jsoup.nodes.Element>) elements13);
        org.jsoup.select.Selector.SelectorParseException selectorParseException18 = new org.jsoup.select.Selector.SelectorParseException("<!--#document-->");
        boolean boolean19 = elements13.remove((java.lang.Object) selectorParseException18);
        java.lang.Throwable[] throwableArray20 = selectorParseException18.getSuppressed();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(throwableArray20);
    }

    @Test
    public void test2690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2690");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("<?>");
        java.lang.String str2 = tag1.getName();
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "<?>" + "'", str2, "<?>");
    }

    @Test
    public void test2691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2691");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("#document");
        boolean boolean3 = tokenQueue1.matches("\n<!--#root-->");
        boolean boolean5 = tokenQueue1.matchChomp("#data");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!=\"#root=&quot;hi!&quot;\"" };
        java.lang.String str8 = tokenQueue1.consumeToAny(strArray7);
        boolean boolean9 = tokenQueue1.consumeWhitespace();
        boolean boolean11 = tokenQueue1.matchChomp("hi!");
        java.lang.String[] strArray12 = new java.lang.String[] {};
        boolean boolean13 = tokenQueue1.matchesAny(strArray12);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#document" + "'", str8, "#document");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2692");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element4 = document1.attr("hi!", "#root");
        java.lang.String str5 = document1.id();
        org.jsoup.nodes.Element element7 = document1.append("hi!=\"#root=&quot;hi!&quot;\"");
        boolean boolean9 = document1.hasClass("");
        org.jsoup.nodes.Element element11 = document1.createElement("#document#documentdocument");
        org.jsoup.nodes.Element element13 = document1.append("<?#document#document>");
        org.jsoup.select.Elements elements16 = element13.getElementsByAttributeValue("#root=\"hi!\"", "#document=\"#comment\"");
        boolean boolean18 = element13.hasClass("");
        org.jsoup.nodes.Document document21 = org.jsoup.Jsoup.parse("[]", "<!--#document-->");
        boolean boolean22 = element13.equals((java.lang.Object) "<!--#document-->");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(document21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test2693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2693");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("org.jsoup.select.Selector$SelectorParseException: ");
        boolean boolean2 = tag1.isData();
        boolean boolean3 = tag1.requiresSpecificParent();
        boolean boolean4 = tag1.isBlock();
        org.jsoup.parser.Tag tag6 = org.jsoup.parser.Tag.valueOf("org.jsoup.select.Selector$SelectorParseException: ");
        boolean boolean7 = tag6.isData();
        boolean boolean8 = tag6.requiresSpecificParent();
        boolean boolean9 = tag6.isBlock();
        boolean boolean10 = tag1.canContain(tag6);
        boolean boolean11 = tag1.isBlock();
        boolean boolean12 = tag1.isData();
        java.lang.String str13 = tag1.getName();
        boolean boolean14 = tag1.requiresSpecificParent();
        org.jsoup.parser.Tag tag16 = org.jsoup.parser.Tag.valueOf("#root");
        boolean boolean17 = tag16.isInline();
        boolean boolean18 = tag1.canContain(tag16);
        org.jsoup.nodes.Document document21 = org.jsoup.parser.Parser.parse("#root", "");
        java.lang.String str22 = document21.outerHtml();
        org.jsoup.nodes.Element element24 = document21.append("<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        org.jsoup.select.Elements elements26 = document21.getElementsByIndexEquals(1);
        org.jsoup.nodes.Element element27 = document21.body();
        org.jsoup.select.Elements elements28 = element27.getAllElements();
        boolean boolean29 = tag16.equals((java.lang.Object) element27);
        boolean boolean31 = element27.hasClass("<!--#document--><#root hi!=\"#root\">\n</#root>");
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "org.jsoup.select.selector$selectorparseexception:" + "'", str13, "org.jsoup.select.selector$selectorparseexception:");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(tag16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(document21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>" + "'", str22, "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(elements26);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertNotNull(elements28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test2694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2694");
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parseBodyFragment("hi!=\"#root=&quot;hi!&quot;\"", "#root=\"hi!\"");
        java.lang.String str3 = document2.id();
        boolean boolean5 = document2.hasAttr("hi!=\"#root\"");
        java.lang.String str6 = document2.id();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test2695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2695");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("#root", "#root=\"hi!\"");
        java.lang.String str3 = attribute2.html();
        attribute2.setKey("hi!=\"#root\"");
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#root=\"#root=&quot;hi!&quot;\"" + "'", str3, "#root=\"#root=&quot;hi!&quot;\"");
    }

    @Test
    public void test2696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2696");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("#root");
        org.jsoup.nodes.Element element4 = document1.attr("#root=&quot;hi!&quot;\n<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>\n<html> \n<head> \n</head> \n<body>\n  #root  \n</body>\n</html>", "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.select.Elements elements7 = element4.getElementsByAttributeValueEnding("\n<org.jsoup.select.selector$selectorparseexception: org.jsoup.select.selector$selectorparseexception:>\n</org.jsoup.select.selector$selectorparseexception: org.jsoup.select.selector$selectorparseexception:>", " class=\"hi!\" #root=\"hi!\"");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements7);
    }

    @Test
    public void test2697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2697");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element5 = document1.prepend("#document");
        org.jsoup.nodes.Element element6 = element5.empty();
        org.jsoup.select.Elements elements8 = element5.getElementsByTag("org.jsoup.select.Selector$SelectorParseException: ");
        org.jsoup.select.Elements elements10 = elements8.html("#document");
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor11 = elements10.listIterator();
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor12 = elements10.listIterator();
        org.jsoup.select.Elements elements14 = elements10.html("<?hi!>");
        org.jsoup.nodes.Document document16 = new org.jsoup.nodes.Document("");
        boolean boolean17 = document16.hasText();
        boolean boolean18 = document16.hasText();
        org.jsoup.nodes.Document document20 = new org.jsoup.nodes.Document("");
        boolean boolean21 = document20.hasText();
        java.lang.String str22 = document20.nodeName();
        java.lang.String[] strArray24 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet25 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet25, strArray24);
        org.jsoup.nodes.Element element27 = document20.classNames((java.util.Set<java.lang.String>) strSet25);
        org.jsoup.nodes.Element element28 = document16.classNames((java.util.Set<java.lang.String>) strSet25);
        java.util.Set<java.lang.String> strSet29 = document16.classNames();
        org.jsoup.nodes.Element element31 = document16.getElementById("#document#document");
        java.lang.String str32 = document16.id();
        org.jsoup.parser.Tag tag33 = document16.tag();
        org.jsoup.nodes.Document document36 = org.jsoup.parser.Parser.parse("#root", "");
        org.jsoup.nodes.Element element39 = document36.attr("#root", "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        java.lang.String str40 = element39.id();
        java.util.Set<java.lang.String> strSet41 = element39.classNames();
        boolean boolean42 = tag33.equals((java.lang.Object) element39);
        org.jsoup.nodes.Element element44 = element39.appendElement("<?hi!>");
        org.jsoup.nodes.Element element45 = element44.firstElementSibling();
        org.jsoup.select.Elements elements46 = element44.children();
        boolean boolean47 = elements10.removeAll((java.util.Collection<org.jsoup.nodes.Element>) elements46);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(elementItor11);
        org.junit.Assert.assertNotNull(elementItor12);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "#document" + "'", str22, "#document");
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertNotNull(strSet29);
        org.junit.Assert.assertNull(element31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(tag33);
        org.junit.Assert.assertNotNull(document36);
        org.junit.Assert.assertNotNull(element39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNotNull(strSet41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(element44);
        org.junit.Assert.assertNotNull(element45);
        org.junit.Assert.assertNotNull(elements46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test2698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2698");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.hasText();
        java.lang.String str3 = document1.nodeName();
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        org.jsoup.nodes.Element element8 = document1.classNames((java.util.Set<java.lang.String>) strSet6);
        org.jsoup.nodes.Element element10 = element8.addClass("#document");
        java.lang.String str11 = element10.html();
        org.jsoup.nodes.Element element13 = element10.appendElement("#document");
        java.lang.String str14 = element13.html();
        org.jsoup.select.Elements elements17 = element13.getElementsByAttributeValueStarting("#root=\"hi!\"", "[#, d, o, c, u, m, e, n, t]");
        org.jsoup.select.Elements elements20 = element13.getElementsByAttributeValueContaining("org.jsoup.select.selector$selectorparseexception:", "org.jsoup.select.selector$selectorparseexception: org.jsoup.select.selector$selectorparseexception:=\"#root\"");
        org.jsoup.select.Elements elements22 = element13.getElementsByIndexGreaterThan(2);
        org.jsoup.nodes.Document document24 = new org.jsoup.nodes.Document("");
        boolean boolean25 = document24.hasText();
        java.lang.String str26 = document24.nodeName();
        java.lang.String[] strArray28 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet29 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet29, strArray28);
        org.jsoup.nodes.Element element31 = document24.classNames((java.util.Set<java.lang.String>) strSet29);
        org.jsoup.nodes.Element element33 = document24.append("#document");
        org.jsoup.nodes.Element element35 = element33.html("");
        org.jsoup.select.Elements elements38 = element33.getElementsByAttributeValueNot("#root", "org.jsoup.select.Selector$SelectorParseException: ");
        org.jsoup.select.Elements elements40 = element33.getElementsByClass("<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        org.jsoup.select.Elements elements41 = new org.jsoup.select.Elements((java.util.Collection<org.jsoup.nodes.Element>) elements40);
        java.util.Spliterator<org.jsoup.nodes.Element> elementSpliterator42 = elements41.spliterator();
        boolean boolean43 = elements22.retainAll((java.util.Collection<org.jsoup.nodes.Element>) elements41);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertNotNull(elements20);
        org.junit.Assert.assertNotNull(elements22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "#document" + "'", str26, "#document");
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertNotNull(elements38);
        org.junit.Assert.assertNotNull(elements40);
        org.junit.Assert.assertNotNull(elementSpliterator42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test2699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2699");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element5 = document1.prepend("#document");
        org.jsoup.nodes.Element element6 = element5.empty();
        org.jsoup.select.Elements elements8 = element5.getElementsByTag("org.jsoup.select.Selector$SelectorParseException: ");
        org.jsoup.select.Elements elements10 = elements8.removeClass("#root");
        org.jsoup.nodes.Element element11 = elements8.first();
        java.lang.String str12 = elements8.outerHtml();
        org.jsoup.select.Selector.SelectorParseException selectorParseException14 = new org.jsoup.select.Selector.SelectorParseException("\n<!--#document-->");
        org.jsoup.select.Selector.SelectorParseException selectorParseException16 = new org.jsoup.select.Selector.SelectorParseException("org.jsoup.select.selector$selectorparseexception:");
        java.lang.Throwable[] throwableArray17 = selectorParseException16.getSuppressed();
        selectorParseException14.addSuppressed((java.lang.Throwable) selectorParseException16);
        org.jsoup.select.Selector.SelectorParseException selectorParseException20 = new org.jsoup.select.Selector.SelectorParseException("\n<!--#document-->");
        org.jsoup.select.Selector.SelectorParseException selectorParseException22 = new org.jsoup.select.Selector.SelectorParseException("org.jsoup.select.selector$selectorparseexception:");
        java.lang.Throwable[] throwableArray23 = selectorParseException22.getSuppressed();
        selectorParseException20.addSuppressed((java.lang.Throwable) selectorParseException22);
        selectorParseException16.addSuppressed((java.lang.Throwable) selectorParseException22);
        java.lang.Throwable[] throwableArray26 = new java.lang.Throwable[] { selectorParseException16 };
        org.jsoup.select.Selector.SelectorParseException selectorParseException28 = new org.jsoup.select.Selector.SelectorParseException("\n<!--#document-->");
        org.jsoup.select.Selector.SelectorParseException selectorParseException30 = new org.jsoup.select.Selector.SelectorParseException("org.jsoup.select.selector$selectorparseexception:");
        java.lang.Throwable[] throwableArray31 = selectorParseException30.getSuppressed();
        selectorParseException28.addSuppressed((java.lang.Throwable) selectorParseException30);
        org.jsoup.select.Selector.SelectorParseException selectorParseException34 = new org.jsoup.select.Selector.SelectorParseException("\n<!--#document-->");
        org.jsoup.select.Selector.SelectorParseException selectorParseException36 = new org.jsoup.select.Selector.SelectorParseException("org.jsoup.select.selector$selectorparseexception:");
        java.lang.Throwable[] throwableArray37 = selectorParseException36.getSuppressed();
        selectorParseException34.addSuppressed((java.lang.Throwable) selectorParseException36);
        selectorParseException30.addSuppressed((java.lang.Throwable) selectorParseException36);
        java.lang.Throwable[] throwableArray40 = new java.lang.Throwable[] { selectorParseException30 };
        org.jsoup.select.Selector.SelectorParseException selectorParseException42 = new org.jsoup.select.Selector.SelectorParseException("\n<!--#document-->");
        org.jsoup.select.Selector.SelectorParseException selectorParseException44 = new org.jsoup.select.Selector.SelectorParseException("org.jsoup.select.selector$selectorparseexception:");
        java.lang.Throwable[] throwableArray45 = selectorParseException44.getSuppressed();
        selectorParseException42.addSuppressed((java.lang.Throwable) selectorParseException44);
        org.jsoup.select.Selector.SelectorParseException selectorParseException48 = new org.jsoup.select.Selector.SelectorParseException("\n<!--#document-->");
        org.jsoup.select.Selector.SelectorParseException selectorParseException50 = new org.jsoup.select.Selector.SelectorParseException("org.jsoup.select.selector$selectorparseexception:");
        java.lang.Throwable[] throwableArray51 = selectorParseException50.getSuppressed();
        selectorParseException48.addSuppressed((java.lang.Throwable) selectorParseException50);
        selectorParseException44.addSuppressed((java.lang.Throwable) selectorParseException50);
        java.lang.Throwable[] throwableArray54 = new java.lang.Throwable[] { selectorParseException44 };
        java.lang.Throwable[][] throwableArray55 = new java.lang.Throwable[][] { throwableArray26, throwableArray40, throwableArray54 };
        java.lang.Throwable[][] throwableArray56 = elements8.toArray(throwableArray55);
        org.jsoup.select.Elements elements57 = new org.jsoup.select.Elements((java.util.Collection<org.jsoup.nodes.Element>) elements8);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNull(element11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(throwableArray23);
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertNotNull(throwableArray31);
        org.junit.Assert.assertNotNull(throwableArray37);
        org.junit.Assert.assertNotNull(throwableArray40);
        org.junit.Assert.assertNotNull(throwableArray45);
        org.junit.Assert.assertNotNull(throwableArray51);
        org.junit.Assert.assertNotNull(throwableArray54);
        org.junit.Assert.assertNotNull(throwableArray55);
        org.junit.Assert.assertNotNull(throwableArray56);
    }

    @Test
    public void test2700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2700");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("body");
        boolean boolean2 = tokenQueue1.consumeWhitespace();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2701");
        org.jsoup.nodes.Evaluator evaluator0 = null;
        org.jsoup.nodes.Document document4 = org.jsoup.parser.Parser.parse("#root", "\n<!--#root-->");
        org.jsoup.select.Elements elements5 = org.jsoup.select.Selector.select("#declaration", (org.jsoup.nodes.Element) document4);
        org.jsoup.nodes.Element element6 = document4.body();
        org.jsoup.nodes.Document document8 = new org.jsoup.nodes.Document("");
        boolean boolean9 = document8.hasText();
        java.lang.String str10 = document8.nodeName();
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet13 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet13, strArray12);
        org.jsoup.nodes.Element element15 = document8.classNames((java.util.Set<java.lang.String>) strSet13);
        org.jsoup.nodes.Element element17 = document8.append("#document");
        org.jsoup.nodes.Element element19 = document8.prepend("#document");
        org.jsoup.select.Elements elements20 = document8.parents();
        org.jsoup.nodes.Element element21 = element6.appendChild((org.jsoup.nodes.Node) document8);
        org.jsoup.nodes.Element element23 = element6.removeClass("org.jsoup.select.Selector$SelectorParseException: ");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements24 = org.jsoup.select.Collector.collect(evaluator0, element23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document4);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#document" + "'", str10, "#document");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(elements20);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(element23);
    }

    @Test
    public void test2702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2702");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        java.lang.String str5 = elements3.attr("#root");
        org.jsoup.nodes.Document document7 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element[] elementArray8 = new org.jsoup.nodes.Element[] { document7 };
        java.util.ArrayList<org.jsoup.nodes.Element> elementList9 = new java.util.ArrayList<org.jsoup.nodes.Element>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<org.jsoup.nodes.Element>) elementList9, elementArray8);
        java.util.Spliterator<org.jsoup.nodes.Element> elementSpliterator11 = elementList9.spliterator();
        java.util.Spliterator<org.jsoup.nodes.Element> elementSpliterator12 = elementList9.spliterator();
        boolean boolean13 = elements3.containsAll((java.util.Collection<org.jsoup.nodes.Element>) elementList9);
        org.jsoup.select.Elements elements14 = new org.jsoup.select.Elements((java.util.List<org.jsoup.nodes.Element>) elementList9);
        org.jsoup.select.Elements elements15 = new org.jsoup.select.Elements((java.util.Collection<org.jsoup.nodes.Element>) elements14);
        java.lang.String str16 = elements15.html();
        org.jsoup.nodes.Document document18 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements20 = document18.getElementsByAttribute("hi!");
        java.lang.String str22 = elements20.attr("#root");
        org.jsoup.select.Elements elements23 = elements20.parents();
        boolean boolean24 = elements15.containsAll((java.util.Collection<org.jsoup.nodes.Element>) elements20);
        org.jsoup.select.Elements elements26 = elements15.eq(0);
        org.jsoup.select.Elements elements28 = elements26.removeClass("hi!");
        org.jsoup.select.Elements elements30 = elements28.val("#root=&quot;hi!&quot;");
        org.jsoup.select.Elements elements32 = elements28.addClass("<#document#document=\"#document#document\">\n</#document#document=\"#document#document\">");
        boolean boolean34 = elements28.hasAttr("\n<body>\n #root \n</body>");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(elementArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(elementSpliterator11);
        org.junit.Assert.assertNotNull(elementSpliterator12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(elements20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(elements23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(elements26);
        org.junit.Assert.assertNotNull(elements28);
        org.junit.Assert.assertNotNull(elements30);
        org.junit.Assert.assertNotNull(elements32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test2703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2703");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements5 = elements3.prepend("");
        org.jsoup.select.Elements elements7 = elements5.removeAttr("");
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements11 = document9.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements13 = elements11.prepend("");
        org.jsoup.select.Elements elements15 = elements13.removeAttr("");
        boolean boolean16 = elements5.containsAll((java.util.Collection<org.jsoup.nodes.Element>) elements13);
        java.lang.Object[] objArray17 = elements5.toArray();
        org.jsoup.nodes.Document document19 = new org.jsoup.nodes.Document("");
        boolean boolean20 = document19.hasText();
        java.lang.String str21 = document19.nodeName();
        java.lang.String str22 = document19.val();
        boolean boolean23 = elements5.add((org.jsoup.nodes.Element) document19);
        org.jsoup.nodes.Element element25 = document19.appendText("#document#documenthi!");
        org.jsoup.nodes.Document document28 = org.jsoup.parser.Parser.parse("#root", "");
        org.jsoup.nodes.Element element31 = document28.attr("#root", "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        java.lang.String str32 = element31.id();
        java.util.Set<java.lang.String> strSet33 = element31.classNames();
        org.jsoup.nodes.Element element34 = document19.classNames(strSet33);
        java.lang.String str35 = document19.html();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "#document" + "'", str21, "#document");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(document28);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(strSet33);
        org.junit.Assert.assertNotNull(element34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "#document#documenthi!" + "'", str35, "#document#documenthi!");
    }

    @Test
    public void test2704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2704");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.hasText();
        java.lang.String str3 = document1.nodeName();
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        org.jsoup.nodes.Element element8 = document1.classNames((java.util.Set<java.lang.String>) strSet6);
        org.jsoup.nodes.Element element10 = element8.addClass("#document");
        org.jsoup.select.Elements elements13 = element10.getElementsByAttributeValueNot("#root", "org.jsoup.select.Selector$SelectorParseException: ");
        java.lang.String str14 = elements13.html();
        int int15 = elements13.size();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test2705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2705");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByIndexGreaterThan((int) ' ');
        org.jsoup.nodes.Node node4 = document1.parent();
        org.jsoup.nodes.Element element6 = document1.prependElement("org.jsoup.select.Selector$SelectorParseException:");
        boolean boolean8 = document1.hasAttr("ocument");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2706");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("#root", "");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("#document");
        org.jsoup.nodes.TextNode textNode6 = textNode2.text(" class=\"hi!\"");
        java.lang.String str7 = textNode6.getWholeText();
        org.jsoup.nodes.TextNode textNode9 = textNode6.text("<html> \n <head> \n </head> \n <body>\n   #root  \n </body>\n</html>");
        java.lang.String str10 = textNode6.nodeName();
        java.lang.String str11 = textNode6.toString();
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertNotNull(textNode6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + " class=\"hi!\"" + "'", str7, " class=\"hi!\"");
        org.junit.Assert.assertNotNull(textNode9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#text" + "'", str10, "#text");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "&lt;html&gt; \n &lt;head&gt; \n &lt;/head&gt; \n &lt;body&gt;\n   #root  \n &lt;/body&gt;\n&lt;/html&gt;" + "'", str11, "&lt;html&gt; \n &lt;head&gt; \n &lt;/head&gt; \n &lt;body&gt;\n   #root  \n &lt;/body&gt;\n&lt;/html&gt;");
    }

    @Test
    public void test2707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2707");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.hasText();
        org.jsoup.nodes.Element element4 = document1.addClass("\n<!--#document-->");
        org.jsoup.nodes.Element element5 = element4.parent();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNull(element5);
    }

    @Test
    public void test2708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2708");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        java.lang.String str5 = elements3.attr("#root");
        org.jsoup.nodes.Document document7 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element[] elementArray8 = new org.jsoup.nodes.Element[] { document7 };
        java.util.ArrayList<org.jsoup.nodes.Element> elementList9 = new java.util.ArrayList<org.jsoup.nodes.Element>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<org.jsoup.nodes.Element>) elementList9, elementArray8);
        java.util.Spliterator<org.jsoup.nodes.Element> elementSpliterator11 = elementList9.spliterator();
        java.util.Spliterator<org.jsoup.nodes.Element> elementSpliterator12 = elementList9.spliterator();
        boolean boolean13 = elements3.containsAll((java.util.Collection<org.jsoup.nodes.Element>) elementList9);
        org.jsoup.select.Elements elements15 = elements3.prepend("#root=\"hi!\"");
        org.jsoup.nodes.Document document17 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element20 = document17.attr("hi!", "#root");
        java.lang.String str21 = document17.id();
        boolean boolean23 = document17.hasAttr("#root");
        org.jsoup.nodes.Element element25 = document17.addClass("");
        boolean boolean26 = elements15.add((org.jsoup.nodes.Element) document17);
        boolean boolean27 = elements15.hasText();
        boolean boolean29 = elements15.hasAttr("<[#, d, o, c, u, m, e, n, t]>\n</[#, d, o, c, u, m, e, n, t]>#root=&quot;hi!&quot;");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(elementArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(elementSpliterator11);
        org.junit.Assert.assertNotNull(elementSpliterator12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test2709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2709");
        org.jsoup.nodes.Element[] elementArray0 = new org.jsoup.nodes.Element[] {};
        org.jsoup.select.Elements elements1 = new org.jsoup.select.Elements(elementArray0);
        org.jsoup.select.Elements elements2 = new org.jsoup.select.Elements(elementArray0);
        org.jsoup.select.Elements elements4 = elements2.select("<[#, d, o, c, u, m, e, n, t]>\n</[#, d, o, c, u, m, e, n, t]>#root=&quot;hi!&quot;");
        java.lang.String str5 = elements4.val();
        org.jsoup.select.Elements elements6 = new org.jsoup.select.Elements((java.util.List<org.jsoup.nodes.Element>) elements4);
        org.jsoup.nodes.Document document8 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements10 = document8.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element12 = document8.prepend("#document");
        org.jsoup.nodes.Element element13 = element12.empty();
        org.jsoup.select.Elements elements15 = element12.getElementsByTag("org.jsoup.select.Selector$SelectorParseException: ");
        org.jsoup.select.Elements elements17 = elements15.removeClass("#root");
        org.jsoup.select.Elements elements19 = elements15.append("");
        org.jsoup.select.Elements elements21 = elements19.addClass("");
        boolean boolean22 = elements6.removeAll((java.util.Collection<org.jsoup.nodes.Element>) elements19);
        org.junit.Assert.assertNotNull(elementArray0);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertNotNull(elements21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test2710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2710");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element4 = document1.attr("hi!", "#root");
        org.jsoup.nodes.Attributes attributes5 = document1.attributes();
        org.jsoup.nodes.Document document6 = document1.normalise();
        org.jsoup.nodes.Element element8 = document1.createElement("&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n #root \n&lt;/body&gt;\n&lt;/html&gt;\n&lt;html&gt; \n&lt;head&gt; \n&lt;/head&gt; \n&lt;body&gt;\n  #root  \n&lt;/body&gt;\n&lt;/html&gt;");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNotNull(element8);
    }

    @Test
    public void test2711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2711");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.hasText();
        java.lang.String str3 = document1.nodeName();
        java.lang.String str4 = document1.outerHtml();
        org.jsoup.parser.Tag tag5 = document1.tag();
        boolean boolean6 = tag5.requiresSpecificParent();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2712");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element4 = document1.attr("hi!", "#root");
        org.jsoup.nodes.Attributes attributes5 = document1.attributes();
        boolean boolean6 = document1.isBlock();
        org.jsoup.nodes.Element element8 = document1.prepend("");
        org.jsoup.select.Elements elements11 = element8.getElementsByAttributeValue("#root=\"hi!\"", "<html>\n<head>\n</head>\n<body>\n</body>\n</html>=\"\"");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements11);
    }

    @Test
    public void test2713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2713");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parse("hi!");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValue("hi!", "hi!");
        org.jsoup.nodes.Attributes attributes5 = document1.attributes();
        org.jsoup.nodes.Element element6 = document1.head();
        org.jsoup.select.Elements elements7 = element6.getAllElements();
        org.jsoup.select.Elements elements8 = element6.getAllElements();
        org.jsoup.select.Elements elements10 = elements8.removeAttr("head");
        // The following exception was thrown during execution in test generation
        try {
            java.util.ListIterator<org.jsoup.nodes.Element> elementItor12 = elements8.listIterator((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 52");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(elements10);
    }

    @Test
    public void test2714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2714");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element5 = document1.prepend("#document");
        java.lang.String str6 = element5.outerHtml();
        org.jsoup.select.Elements elements8 = element5.getElementsByAttribute("head=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n #document\n&lt;/body&gt;\n&lt;/html&gt;\"");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#document" + "'", str6, "#document");
        org.junit.Assert.assertNotNull(elements8);
    }

    @Test
    public void test2715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2715");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("\n<head>\n</head>", "<!--#root-->=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n #root \n&lt;/body&gt;\n&lt;/html&gt;\"");
        org.junit.Assert.assertNotNull(attribute2);
    }

    @Test
    public void test2716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2716");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        java.lang.String str4 = elements3.val();
        java.lang.Object obj5 = null;
        int int6 = elements3.lastIndexOf(obj5);
        org.jsoup.nodes.Document document8 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements10 = document8.getElementsByAttribute("hi!");
        java.lang.String str11 = elements10.val();
        java.lang.Object obj12 = null;
        int int13 = elements10.lastIndexOf(obj12);
        org.jsoup.select.Elements elements15 = elements10.eq((int) '#');
        boolean boolean16 = elements3.retainAll((java.util.Collection<org.jsoup.nodes.Element>) elements10);
        org.jsoup.select.Elements elements18 = elements10.toggleClass("<html>\n<head>\n</head>\n<body>\n ocument \n</body>\n</html>");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(elements18);
    }

    @Test
    public void test2717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2717");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parse("hi!");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValue("hi!", "hi!");
        org.jsoup.nodes.Attributes attributes5 = document1.attributes();
        org.jsoup.nodes.Element element6 = document1.head();
        org.jsoup.select.Elements elements7 = element6.getAllElements();
        org.jsoup.select.Elements elements8 = element6.getAllElements();
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor9 = elements8.listIterator();
        int int10 = elements8.size();
        org.jsoup.nodes.Element element11 = elements8.last();
        java.lang.String str12 = element11.toString();
        org.jsoup.select.Elements elements14 = element11.getElementsByTag("# ");
        org.jsoup.nodes.Element element16 = element11.addClass("[#, d, o, c, u, m, e, n, t]");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(elementItor9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\n<head>\n</head>" + "'", str12, "\n<head>\n</head>");
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(element16);
    }

    @Test
    public void test2718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2718");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("#root", "");
        java.lang.String str3 = document2.outerHtml();
        org.jsoup.nodes.Element element5 = document2.append("<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        org.jsoup.select.Elements elements7 = document2.getElementsByIndexEquals(1);
        org.jsoup.nodes.Element element8 = document2.body();
        org.jsoup.select.Elements elements9 = element8.getAllElements();
        java.lang.Class<?> wildcardClass10 = elements9.getClass();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>" + "'", str3, "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2719");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.hasText();
        boolean boolean3 = document1.hasText();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        boolean boolean6 = document5.hasText();
        java.lang.String str7 = document5.nodeName();
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet10 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet10, strArray9);
        org.jsoup.nodes.Element element12 = document5.classNames((java.util.Set<java.lang.String>) strSet10);
        org.jsoup.nodes.Element element13 = document1.classNames((java.util.Set<java.lang.String>) strSet10);
        element13.setBaseUri("\n<!--#root-->");
        org.jsoup.nodes.Document document18 = org.jsoup.parser.Parser.parse("#root", "");
        org.jsoup.nodes.Element element21 = document18.attr("#root", "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        java.lang.String str22 = document18.tagName();
        java.lang.String str23 = document18.toString();
        org.jsoup.nodes.Node node25 = document18.removeAttr("[#, d, o, c, u, m, e, n, t]");
        org.jsoup.nodes.Element element26 = element13.prependChild((org.jsoup.nodes.Node) document18);
        org.jsoup.nodes.Element element27 = element13.empty();
        java.lang.String str28 = element27.nodeName();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#document" + "'", str7, "#document");
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(document18);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "#root" + "'", str22, "#root");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>" + "'", str23, "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "#document" + "'", str28, "#document");
    }

    @Test
    public void test2720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2720");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.hasText();
        boolean boolean3 = document1.hasText();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        boolean boolean6 = document5.hasText();
        java.lang.String str7 = document5.nodeName();
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet10 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet10, strArray9);
        org.jsoup.nodes.Element element12 = document5.classNames((java.util.Set<java.lang.String>) strSet10);
        org.jsoup.nodes.Element element13 = document1.classNames((java.util.Set<java.lang.String>) strSet10);
        org.jsoup.nodes.Element element15 = document1.appendText("hi!");
        org.jsoup.parser.Tag tag16 = document1.tag();
        boolean boolean17 = tag16.requiresSpecificParent();
        org.jsoup.parser.Tag tag18 = tag16.getImplicitParent();
        org.jsoup.nodes.Element element20 = new org.jsoup.nodes.Element(tag16, "<?#document#document>");
        org.jsoup.nodes.Document document23 = new org.jsoup.nodes.Document("");
        boolean boolean24 = document23.hasText();
        java.lang.String str25 = document23.nodeName();
        java.lang.String[] strArray27 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet28 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet28, strArray27);
        org.jsoup.nodes.Element element30 = document23.classNames((java.util.Set<java.lang.String>) strSet28);
        org.jsoup.nodes.Element element32 = document23.append("#document");
        org.jsoup.nodes.Element element34 = document23.prepend("#document");
        org.jsoup.nodes.Attributes attributes35 = element34.attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator36 = attributes35.spliterator();
        java.lang.String str38 = attributes35.get("hi!");
        org.jsoup.nodes.Document document41 = org.jsoup.parser.Parser.parse("#root", "");
        org.jsoup.nodes.Element element44 = document41.attr("#root", "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        boolean boolean45 = attributes35.equals((java.lang.Object) "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        org.jsoup.parser.Tag tag47 = org.jsoup.parser.Tag.valueOf("org.jsoup.select.Selector$SelectorParseException: ");
        boolean boolean48 = tag47.isData();
        org.jsoup.nodes.Attributes attributes50 = new org.jsoup.nodes.Attributes();
        int int51 = attributes50.size();
        java.lang.String str52 = attributes50.html();
        org.jsoup.nodes.Element element53 = new org.jsoup.nodes.Element(tag47, "org.jsoup.select.selector$selectorparseexception:", attributes50);
        org.jsoup.nodes.Attribute attribute56 = org.jsoup.nodes.Attribute.createFromEncoded("hi!", "hi!");
        attribute56.setKey("#root");
        java.lang.String str59 = attribute56.html();
        attributes50.put(attribute56);
        attributes35.addAll(attributes50);
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor62 = attributes35.iterator();
        org.jsoup.nodes.Element element63 = new org.jsoup.nodes.Element(tag16, "\n<!--#document-->", attributes35);
        java.lang.String str64 = attributes35.toString();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor65 = attributes35.iterator();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#document" + "'", str7, "#document");
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(tag16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(tag18);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "#document" + "'", str25, "#document");
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertNotNull(element32);
        org.junit.Assert.assertNotNull(element34);
        org.junit.Assert.assertNotNull(attributes35);
        org.junit.Assert.assertNotNull(attributeSpliterator36);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNotNull(document41);
        org.junit.Assert.assertNotNull(element44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(tag47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertNotNull(attribute56);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "#root=\"hi!\"" + "'", str59, "#root=\"hi!\"");
        org.junit.Assert.assertNotNull(attributeItor62);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + " class=\"hi!\" #root=\"hi!\"" + "'", str64, " class=\"hi!\" #root=\"hi!\"");
        org.junit.Assert.assertNotNull(attributeItor65);
    }

    @Test
    public void test2721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2721");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.hasText();
        java.lang.String str3 = document1.nodeName();
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        org.jsoup.nodes.Element element8 = document1.classNames((java.util.Set<java.lang.String>) strSet6);
        org.jsoup.nodes.Element element10 = document1.append("#document");
        org.jsoup.nodes.Element element12 = element10.html("");
        org.jsoup.select.Elements elements15 = element10.getElementsByAttributeValueNot("#root", "org.jsoup.select.Selector$SelectorParseException: ");
        org.jsoup.select.Elements elements17 = elements15.removeAttr("#document#document=\"\"");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(elements17);
    }

    @Test
    public void test2722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2722");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element4 = document1.attr("hi!", "#root");
        org.jsoup.nodes.Attributes attributes5 = document1.attributes();
        org.jsoup.select.Elements elements6 = document1.children();
        java.util.Set<java.lang.String> strSet7 = document1.classNames();
        org.jsoup.parser.Tag tag8 = document1.tag();
        boolean boolean9 = tag8.requiresSpecificParent();
        org.jsoup.nodes.Element element11 = new org.jsoup.nodes.Element(tag8, "");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2723");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements5 = elements3.prepend("");
        org.jsoup.select.Elements elements7 = elements5.removeAttr("");
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements11 = document9.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements13 = elements11.prepend("");
        org.jsoup.select.Elements elements15 = elements13.removeAttr("");
        boolean boolean16 = elements5.containsAll((java.util.Collection<org.jsoup.nodes.Element>) elements13);
        java.lang.Object[] objArray17 = elements5.toArray();
        org.jsoup.select.Elements elements19 = elements5.select("#document#document");
        org.jsoup.nodes.Document document21 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements23 = document21.getElementsByAttribute("hi!");
        boolean boolean25 = document21.hasClass("");
        java.lang.String str26 = document21.nodeName();
        boolean boolean27 = elements19.contains((java.lang.Object) document21);
        org.jsoup.nodes.Element element29 = document21.appendElement("[#, d, o, c, u, m, e, n, t, #, d, o, c, u, m, e, n, t, =, \", #, d, o, c, u, m, e, n, t, #, d, o, c, u, m, e, n, t, \"]");
        org.jsoup.nodes.Element element31 = document21.toggleClass(" \n<!--#root-->");
        java.lang.String str32 = element31.nodeName();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[]");
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertNotNull(elements23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "#document" + "'", str26, "#document");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "#document" + "'", str32, "#document");
    }

    @Test
    public void test2724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2724");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("#root", "");
        org.jsoup.nodes.Element element5 = document2.attr("#root", "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        java.lang.String str6 = document2.tagName();
        org.jsoup.nodes.Element element7 = document2.parent();
        org.jsoup.nodes.Element element9 = document2.text("#root");
        java.lang.String str10 = document2.nodeName();
        org.jsoup.nodes.Element element11 = document2.head();
        boolean boolean12 = document2.hasText();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#root" + "'", str6, "#root");
        org.junit.Assert.assertNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#document" + "'", str10, "#document");
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test2725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2725");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("#root", "");
        org.jsoup.nodes.Element element5 = document2.attr("#root", "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        java.lang.String str6 = element5.id();
        org.jsoup.select.Elements elements8 = element5.getElementsByIndexEquals((int) (short) 1);
        java.lang.Object[] objArray9 = elements8.toArray();
        java.util.stream.Stream<org.jsoup.nodes.Element> elementStream10 = elements8.parallelStream();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[\n<body>\n #root \n</body>]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[\n<body>\n #root \n</body>]");
        org.junit.Assert.assertNotNull(elementStream10);
    }

    @Test
    public void test2726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2726");
        org.jsoup.parser.Tag tag2 = org.jsoup.parser.Tag.valueOf("#root");
        boolean boolean3 = tag2.isInline();
        boolean boolean4 = tag2.isInline();
        org.jsoup.nodes.Document document6 = new org.jsoup.nodes.Document("");
        boolean boolean7 = document6.hasText();
        java.lang.String str8 = document6.nodeName();
        java.lang.String[] strArray10 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet11 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet11, strArray10);
        org.jsoup.nodes.Element element13 = document6.classNames((java.util.Set<java.lang.String>) strSet11);
        org.jsoup.nodes.Element element15 = element13.addClass("#document");
        org.jsoup.nodes.Document document17 = new org.jsoup.nodes.Document("");
        boolean boolean18 = document17.hasText();
        boolean boolean19 = document17.hasText();
        org.jsoup.nodes.Document document21 = new org.jsoup.nodes.Document("");
        boolean boolean22 = document21.hasText();
        java.lang.String str23 = document21.nodeName();
        java.lang.String[] strArray25 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet26 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet26, strArray25);
        org.jsoup.nodes.Element element28 = document21.classNames((java.util.Set<java.lang.String>) strSet26);
        org.jsoup.nodes.Element element29 = document17.classNames((java.util.Set<java.lang.String>) strSet26);
        java.util.Set<java.lang.String> strSet30 = document17.classNames();
        org.jsoup.nodes.Element element31 = element13.classNames(strSet30);
        boolean boolean32 = tag2.equals((java.lang.Object) element13);
        org.jsoup.select.Elements elements33 = org.jsoup.select.Selector.select("body", element13);
        boolean boolean35 = element13.hasAttr("#root=\"hi!\"");
        org.jsoup.nodes.Document document37 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element40 = document37.attr("hi!", "#root");
        org.jsoup.nodes.Attributes attributes41 = document37.attributes();
        org.jsoup.select.Elements elements44 = document37.getElementsByAttributeValueNot("org.jsoup.select.selector$selectorparseexception:", "hi!");
        org.jsoup.select.Elements elements46 = elements44.html("#document#documentdocument");
        boolean boolean47 = element13.equals((java.lang.Object) "#document#documentdocument");
        java.lang.String str48 = element13.id();
        org.junit.Assert.assertNotNull(tag2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#document" + "'", str8, "#document");
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "#document" + "'", str23, "#document");
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertNotNull(strSet30);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(elements33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(element40);
        org.junit.Assert.assertNotNull(attributes41);
        org.junit.Assert.assertNotNull(elements44);
        org.junit.Assert.assertNotNull(elements46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
    }

    @Test
    public void test2727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2727");
        org.jsoup.nodes.Document document3 = org.jsoup.parser.Parser.parse("#root", "\n<!--#root-->");
        org.jsoup.select.Elements elements4 = org.jsoup.select.Selector.select("#declaration", (org.jsoup.nodes.Element) document3);
        org.jsoup.nodes.Element element5 = document3.body();
        org.jsoup.nodes.Document document7 = new org.jsoup.nodes.Document("");
        boolean boolean8 = document7.hasText();
        java.lang.String str9 = document7.nodeName();
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet12 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet12, strArray11);
        org.jsoup.nodes.Element element14 = document7.classNames((java.util.Set<java.lang.String>) strSet12);
        org.jsoup.nodes.Element element16 = document7.append("#document");
        org.jsoup.nodes.Element element18 = document7.prepend("#document");
        org.jsoup.select.Elements elements19 = document7.parents();
        org.jsoup.nodes.Element element20 = element5.appendChild((org.jsoup.nodes.Node) document7);
        org.jsoup.nodes.Element element22 = element20.text("[#, d, o, c, u, m, e, n, t]");
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#document" + "'", str9, "#document");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(element22);
    }

    @Test
    public void test2728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2728");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("org.jsoup.select.Selector$SelectorParseException: ");
        boolean boolean2 = tag1.isData();
        boolean boolean3 = tag1.requiresSpecificParent();
        boolean boolean4 = tag1.isBlock();
        org.jsoup.parser.Tag tag6 = org.jsoup.parser.Tag.valueOf("org.jsoup.select.Selector$SelectorParseException: ");
        boolean boolean7 = tag6.isData();
        boolean boolean8 = tag6.requiresSpecificParent();
        boolean boolean9 = tag6.isBlock();
        boolean boolean10 = tag1.canContain(tag6);
        boolean boolean11 = tag1.isBlock();
        boolean boolean12 = tag1.isData();
        boolean boolean13 = tag1.isBlock();
        boolean boolean14 = tag1.isBlock();
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2729");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.hasText();
        java.lang.String str3 = document1.nodeName();
        java.lang.String str4 = document1.val();
        org.jsoup.nodes.Node node5 = document1.parent();
        org.jsoup.nodes.Element element7 = document1.appendElement("org.jsoup.select.selector$selectorparseexception: org.jsoup.select.selector$selectorparseexception:");
        java.lang.String str8 = element7.className();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test2730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2730");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = org.jsoup.Jsoup.parse(file0, "document", "class=\"hi!\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2731");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element5 = document1.prepend("#document");
        org.jsoup.nodes.Element element6 = element5.empty();
        org.jsoup.select.Elements elements8 = element5.getElementsByTag("org.jsoup.select.Selector$SelectorParseException: ");
        org.jsoup.select.Elements elements10 = elements8.removeClass("#root");
        org.jsoup.select.Elements elements12 = elements8.append("");
        boolean boolean14 = elements8.hasAttr("#document#document");
        org.jsoup.nodes.Document document16 = new org.jsoup.nodes.Document("");
        boolean boolean17 = document16.hasText();
        java.lang.String str18 = document16.nodeName();
        java.lang.String[] strArray20 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet21 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet21, strArray20);
        org.jsoup.nodes.Element element23 = document16.classNames((java.util.Set<java.lang.String>) strSet21);
        org.jsoup.nodes.Element element25 = document16.append("#document");
        org.jsoup.nodes.Element element27 = element25.html("");
        org.jsoup.select.Elements elements30 = element25.getElementsByAttributeValueNot("#root", "org.jsoup.select.Selector$SelectorParseException: ");
        org.jsoup.select.Elements elements32 = element25.getElementsByClass("<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        int int33 = elements8.lastIndexOf((java.lang.Object) elements32);
        org.jsoup.nodes.Element element34 = elements32.first();
        org.jsoup.nodes.Document document36 = org.jsoup.Jsoup.parse("hi!");
        org.jsoup.select.Elements elements39 = document36.getElementsByAttributeValue("hi!", "hi!");
        org.jsoup.select.Selector.SelectorParseException selectorParseException41 = new org.jsoup.select.Selector.SelectorParseException("");
        boolean boolean42 = elements39.contains((java.lang.Object) "");
        boolean boolean44 = elements39.is("[]");
        org.jsoup.nodes.Document document46 = new org.jsoup.nodes.Document("");
        boolean boolean47 = document46.hasText();
        java.lang.String str48 = document46.nodeName();
        java.lang.String str49 = document46.val();
        java.lang.String str50 = document46.outerHtml();
        java.lang.String[] strArray53 = new java.lang.String[] { "\n<!--#document-->", "#data" };
        java.util.LinkedHashSet<java.lang.String> strSet54 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet54, strArray53);
        org.jsoup.nodes.Element element56 = document46.classNames((java.util.Set<java.lang.String>) strSet54);
        java.util.LinkedHashSet[] linkedHashSetArray58 = new java.util.LinkedHashSet[1];
        @SuppressWarnings("unchecked")
        java.util.LinkedHashSet<java.lang.String>[] strSetArray59 = (java.util.LinkedHashSet<java.lang.String>[]) linkedHashSetArray58;
        strSetArray59[0] = strSet54;
        java.util.LinkedHashSet<java.lang.String>[] strSetArray62 = elements39.toArray(strSetArray59);
        org.jsoup.select.Elements elements64 = elements39.select("org.jsoup.select.Selector$SelectorParseException: \n<!--#document-->");
        boolean boolean65 = elements32.retainAll((java.util.Collection<org.jsoup.nodes.Element>) elements64);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "#document" + "'", str18, "#document");
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertNotNull(elements30);
        org.junit.Assert.assertNotNull(elements32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNull(element34);
        org.junit.Assert.assertNotNull(document36);
        org.junit.Assert.assertNotNull(elements39);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "#document" + "'", str48, "#document");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(element56);
        org.junit.Assert.assertNotNull(linkedHashSetArray58);
        org.junit.Assert.assertNotNull(strSetArray59);
        org.junit.Assert.assertNotNull(strSetArray62);
        org.junit.Assert.assertNotNull(elements64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
    }

    @Test
    public void test2732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2732");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "<html> \n <head> \n </head> \n <body>\n   #root  \n </body>\n</html>");
        java.lang.String str3 = comment2.getData();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>" + "'", str3, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
    }

    @Test
    public void test2733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2733");
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parse("#root=\"hi!\"", "body");
        org.jsoup.nodes.Element element4 = document2.prependElement(" \n<!--#root-->");
        org.jsoup.nodes.Element element6 = element4.append("<#root hi!=\"#root\">\n</#root>");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
    }

    @Test
    public void test2734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2734");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("#root", "");
        java.lang.String str3 = document2.outerHtml();
        org.jsoup.nodes.Element element5 = document2.append("<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        org.jsoup.select.Elements elements8 = document2.getElementsByAttributeValueStarting("#root=\"hi!\"", "org.jsoup.select.Selector$SelectorParseException: ");
        org.jsoup.nodes.Element element10 = document2.prepend("#root=\"hi!\"");
        java.lang.String str11 = element10.id();
        org.jsoup.select.Elements elements13 = element10.getElementsByIndexGreaterThan((int) (byte) 100);
        org.jsoup.nodes.Document document17 = org.jsoup.parser.Parser.parse("#root", "");
        org.jsoup.nodes.Element element20 = document17.attr("#root", "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        java.lang.String str21 = document17.tagName();
        java.lang.String str22 = document17.toString();
        org.jsoup.nodes.Document document24 = new org.jsoup.nodes.Document("");
        boolean boolean25 = document24.hasText();
        java.lang.String str26 = document24.nodeName();
        java.lang.String[] strArray28 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet29 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet29, strArray28);
        org.jsoup.nodes.Element element31 = document24.classNames((java.util.Set<java.lang.String>) strSet29);
        org.jsoup.nodes.Element element33 = document24.append("#document");
        org.jsoup.nodes.Element element35 = element33.html("<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        org.jsoup.nodes.Element element36 = document17.appendChild((org.jsoup.nodes.Node) element35);
        org.jsoup.select.Elements elements37 = org.jsoup.select.Selector.select("#text", element35);
        java.lang.String str38 = element35.id();
        org.jsoup.select.Elements elements41 = element35.getElementsByAttributeValueContaining("<!--#document-->", "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        int int42 = elements13.lastIndexOf((java.lang.Object) elements41);
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>" + "'", str3, "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(document17);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "#root" + "'", str21, "#root");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>" + "'", str22, "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "#document" + "'", str26, "#document");
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertNotNull(element36);
        org.junit.Assert.assertNotNull(elements37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNotNull(elements41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
    }

    @Test
    public void test2735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2735");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element4 = document1.attr("hi!", "#root");
        org.jsoup.nodes.Attributes attributes5 = document1.attributes();
        org.jsoup.select.Elements elements6 = document1.children();
        java.util.Set<java.lang.String> strSet7 = document1.classNames();
        org.jsoup.parser.Tag tag8 = document1.tag();
        org.jsoup.nodes.Document document10 = new org.jsoup.nodes.Document("");
        boolean boolean11 = document10.hasText();
        boolean boolean12 = document10.hasText();
        org.jsoup.nodes.Document document14 = new org.jsoup.nodes.Document("");
        boolean boolean15 = document14.hasText();
        java.lang.String str16 = document14.nodeName();
        java.lang.String[] strArray18 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet19 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet19, strArray18);
        org.jsoup.nodes.Element element21 = document14.classNames((java.util.Set<java.lang.String>) strSet19);
        org.jsoup.nodes.Element element22 = document10.classNames((java.util.Set<java.lang.String>) strSet19);
        org.jsoup.nodes.Element element24 = document10.appendText("hi!");
        org.jsoup.parser.Tag tag25 = document10.tag();
        boolean boolean26 = tag25.requiresSpecificParent();
        org.jsoup.parser.Tag tag27 = tag25.getImplicitParent();
        org.jsoup.nodes.Element element29 = new org.jsoup.nodes.Element(tag25, "<?#document#document>");
        boolean boolean30 = tag25.isData();
        boolean boolean31 = tag8.isValidParent(tag25);
        org.jsoup.parser.Tag tag32 = tag25.getImplicitParent();
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "#document" + "'", str16, "#document");
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(tag25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(tag27);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(tag32);
    }

    @Test
    public void test2736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2736");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element4 = elements3.first();
        org.jsoup.select.Elements elements6 = elements3.toggleClass("#document");
        org.jsoup.select.Elements elements8 = elements3.removeClass("#root=\"hi!\"");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements8);
    }

    @Test
    public void test2737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2737");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Document document2 = document1.normalise();
        org.jsoup.nodes.Element element3 = document1.head();
        org.jsoup.nodes.Element element5 = element3.append("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        boolean boolean7 = element5.equals((java.lang.Object) "#root=\"hi!\"");
        org.jsoup.nodes.Element element8 = element5.parent();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(element8);
    }

    @Test
    public void test2738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2738");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.hasText();
        java.lang.String str3 = document1.nodeName();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element8 = document5.attr("hi!", "#root");
        org.jsoup.nodes.Attributes attributes9 = document5.attributes();
        boolean boolean10 = document1.equals((java.lang.Object) attributes9);
        int int11 = attributes9.size();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test2739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2739");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("#root", "#document");
        org.jsoup.nodes.Element element4 = document2.removeClass("#document#documenthi!");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
    }

    @Test
    public void test2740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2740");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("org.jsoup.select.Selector$SelectorParseException: ");
        java.lang.String str2 = tag1.getName();
        boolean boolean3 = tag1.isInline();
        org.jsoup.nodes.Document document6 = new org.jsoup.nodes.Document("");
        boolean boolean7 = document6.hasText();
        java.lang.String str8 = document6.nodeName();
        java.lang.String[] strArray10 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet11 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet11, strArray10);
        org.jsoup.nodes.Element element13 = document6.classNames((java.util.Set<java.lang.String>) strSet11);
        org.jsoup.nodes.Element element15 = document6.append("#document");
        org.jsoup.nodes.Element element17 = document6.prepend("#document");
        org.jsoup.nodes.Attributes attributes18 = element17.attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator19 = attributes18.spliterator();
        java.lang.String str21 = attributes18.get("hi!");
        org.jsoup.nodes.Document document24 = org.jsoup.parser.Parser.parse("#root", "");
        org.jsoup.nodes.Element element27 = document24.attr("#root", "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        boolean boolean28 = attributes18.equals((java.lang.Object) "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        java.lang.String str29 = attributes18.html();
        org.jsoup.nodes.Element element30 = new org.jsoup.nodes.Element(tag1, "", attributes18);
        org.jsoup.select.Elements elements32 = element30.getElementsByIndexLessThan((int) 'o');
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.jsoup.select.selector$selectorparseexception:" + "'", str2, "org.jsoup.select.selector$selectorparseexception:");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#document" + "'", str8, "#document");
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(attributes18);
        org.junit.Assert.assertNotNull(attributeSpliterator19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(document24);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + " class=\"hi!\"" + "'", str29, " class=\"hi!\"");
        org.junit.Assert.assertNotNull(elements32);
    }

    @Test
    public void test2741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2741");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element5 = document1.prepend("#document");
        org.jsoup.nodes.Element element6 = element5.empty();
        org.jsoup.select.Elements elements8 = element5.getElementsByTag("org.jsoup.select.Selector$SelectorParseException: ");
        org.jsoup.select.Elements elements10 = elements8.removeClass("#root");
        org.jsoup.select.Elements elements12 = elements8.append("");
        boolean boolean14 = elements8.hasAttr("#document#document");
        org.jsoup.select.Elements elements16 = elements8.eq((int) 'a');
        java.util.stream.Stream<org.jsoup.nodes.Element> elementStream17 = elements16.stream();
        org.jsoup.nodes.Document document19 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements21 = document19.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element23 = document19.prepend("#document");
        org.jsoup.nodes.Element element24 = element23.empty();
        org.jsoup.select.Elements elements26 = element23.getElementsByTag("org.jsoup.select.Selector$SelectorParseException: ");
        org.jsoup.select.Elements elements28 = elements26.removeClass("#root");
        org.jsoup.nodes.Document document30 = new org.jsoup.nodes.Document("");
        boolean boolean31 = document30.hasText();
        java.lang.String str32 = document30.nodeName();
        java.lang.String[] strArray34 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet35 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet35, strArray34);
        org.jsoup.nodes.Element element37 = document30.classNames((java.util.Set<java.lang.String>) strSet35);
        org.jsoup.nodes.Element element39 = document30.append("#document");
        org.jsoup.nodes.Element element41 = document30.prepend("#document");
        org.jsoup.nodes.Attributes attributes42 = element41.attributes();
        org.jsoup.nodes.Element element44 = element41.append("hi!");
        org.jsoup.select.Elements elements46 = element44.getElementsByIndexLessThan((int) (short) 0);
        boolean boolean47 = elements26.equals((java.lang.Object) elements46);
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor49 = elements46.listIterator(0);
        org.jsoup.select.Elements elements51 = elements46.append("");
        org.jsoup.select.Elements elements53 = elements46.html(" class=\"hi!\"");
        org.jsoup.select.Elements elements55 = elements46.html("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Document document57 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements59 = document57.getElementsByAttribute("hi!");
        java.lang.String str60 = elements59.val();
        org.jsoup.nodes.Document document62 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element65 = document62.attr("hi!", "#root");
        org.jsoup.nodes.Attributes attributes66 = document62.attributes();
        org.jsoup.select.Elements elements67 = document62.children();
        java.util.Set<java.lang.String> strSet68 = document62.classNames();
        boolean boolean69 = elements59.equals((java.lang.Object) strSet68);
        boolean boolean70 = elements55.retainAll((java.util.Collection<org.jsoup.nodes.Element>) elements59);
        boolean boolean71 = elements16.removeAll((java.util.Collection<org.jsoup.nodes.Element>) elements55);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertNotNull(elementStream17);
        org.junit.Assert.assertNotNull(elements21);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(elements26);
        org.junit.Assert.assertNotNull(elements28);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "#document" + "'", str32, "#document");
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(element37);
        org.junit.Assert.assertNotNull(element39);
        org.junit.Assert.assertNotNull(element41);
        org.junit.Assert.assertNotNull(attributes42);
        org.junit.Assert.assertNotNull(element44);
        org.junit.Assert.assertNotNull(elements46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(elementItor49);
        org.junit.Assert.assertNotNull(elements51);
        org.junit.Assert.assertNotNull(elements53);
        org.junit.Assert.assertNotNull(elements55);
        org.junit.Assert.assertNotNull(elements59);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertNotNull(element65);
        org.junit.Assert.assertNotNull(attributes66);
        org.junit.Assert.assertNotNull(elements67);
        org.junit.Assert.assertNotNull(strSet68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
    }

    @Test
    public void test2742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2742");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.hasText();
        java.lang.String str3 = document1.nodeName();
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        org.jsoup.nodes.Element element8 = document1.classNames((java.util.Set<java.lang.String>) strSet6);
        org.jsoup.nodes.Element element10 = document1.append("#document");
        org.jsoup.nodes.Element element12 = document1.prepend("#document");
        org.jsoup.nodes.Attributes attributes13 = element12.attributes();
        org.jsoup.nodes.Document document15 = org.jsoup.Jsoup.parse("hi!");
        org.jsoup.select.Elements elements18 = document15.getElementsByAttributeValue("hi!", "hi!");
        org.jsoup.nodes.Attributes attributes19 = document15.attributes();
        attributes19.remove("#root=\"hi!\"");
        attributes13.addAll(attributes19);
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor23 = attributes19.iterator();
        org.jsoup.nodes.Attributes attributes24 = new org.jsoup.nodes.Attributes();
        int int25 = attributes24.size();
        java.lang.String str26 = attributes24.html();
        java.lang.String str27 = attributes24.html();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator28 = attributes24.spliterator();
        boolean boolean30 = attributes24.hasKey("");
        org.jsoup.parser.Tag tag32 = org.jsoup.parser.Tag.valueOf("org.jsoup.select.Selector$SelectorParseException: ");
        boolean boolean33 = tag32.isData();
        org.jsoup.nodes.Attributes attributes35 = new org.jsoup.nodes.Attributes();
        int int36 = attributes35.size();
        java.lang.String str37 = attributes35.html();
        org.jsoup.nodes.Element element38 = new org.jsoup.nodes.Element(tag32, "org.jsoup.select.selector$selectorparseexception:", attributes35);
        org.jsoup.nodes.Attribute attribute41 = org.jsoup.nodes.Attribute.createFromEncoded("hi!", "hi!");
        attribute41.setKey("#root");
        java.lang.String str44 = attribute41.html();
        attributes35.put(attribute41);
        java.lang.String str46 = attribute41.html();
        attribute41.setValue("<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        attributes24.put(attribute41);
        java.lang.String str51 = attributes24.get("[#, d, o, c, u, m, e, n, t, #, d, o, c, u, m, e, n, t, =, \", #, d, o, c, u, m, e, n, t, #, d, o, c, u, m, e, n, t, \"]");
        attributes19.addAll(attributes24);
        org.jsoup.nodes.Attribute attribute55 = org.jsoup.nodes.Attribute.createFromEncoded("org.jsoup.select.Selector$SelectorParseException: \n<!--#document-->", "#document#document=\"#document#document\"");
        attribute55.setValue("<?>");
        attributes19.put(attribute55);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertNotNull(document15);
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertNotNull(attributes19);
        org.junit.Assert.assertNotNull(attributeItor23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(attributeSpliterator28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(tag32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNotNull(attribute41);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "#root=\"hi!\"" + "'", str44, "#root=\"hi!\"");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "#root=\"hi!\"" + "'", str46, "#root=\"hi!\"");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertNotNull(attribute55);
    }

    @Test
    public void test2743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2743");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("org.jsoup.select.Selector$SelectorParseException: ");
        boolean boolean2 = tag1.isData();
        boolean boolean3 = tag1.requiresSpecificParent();
        boolean boolean4 = tag1.isBlock();
        org.jsoup.parser.Tag tag6 = org.jsoup.parser.Tag.valueOf("org.jsoup.select.Selector$SelectorParseException: ");
        boolean boolean7 = tag6.isData();
        boolean boolean8 = tag6.requiresSpecificParent();
        boolean boolean9 = tag6.isBlock();
        boolean boolean10 = tag1.canContain(tag6);
        boolean boolean11 = tag1.isEmpty();
        boolean boolean12 = tag1.isData();
        org.jsoup.parser.Tag tag14 = org.jsoup.parser.Tag.valueOf("org.jsoup.select.Selector$SelectorParseException: ");
        java.lang.String str15 = tag14.getName();
        java.lang.String str16 = tag14.toString();
        java.lang.String str17 = tag14.getName();
        boolean boolean18 = tag14.isInline();
        boolean boolean19 = tag14.isEmpty();
        org.jsoup.nodes.Attribute attribute22 = org.jsoup.nodes.Attribute.createFromEncoded("hi!", "hi!");
        attribute22.setValue("#root=\"hi!\"");
        java.lang.String str25 = attribute22.getKey();
        java.lang.String str26 = attribute22.getKey();
        attribute22.setKey("<#root hi!=\"#root\">\n</#root>");
        org.jsoup.nodes.Document document31 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements33 = document31.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements35 = elements33.prepend("");
        elements35.clear();
        int int38 = elements35.indexOf((java.lang.Object) "org.jsoup.select.Selector$SelectorParseException: ");
        org.jsoup.select.Elements elements40 = elements35.removeClass("#data");
        org.jsoup.select.Elements elements41 = org.jsoup.select.Selector.select("#data", (java.lang.Iterable<org.jsoup.nodes.Element>) elements40);
        org.jsoup.parser.Tag tag43 = org.jsoup.parser.Tag.valueOf("org.jsoup.select.Selector$SelectorParseException: ");
        boolean boolean44 = tag43.isData();
        boolean boolean45 = tag43.requiresSpecificParent();
        boolean boolean46 = tag43.isBlock();
        org.jsoup.parser.Tag tag48 = org.jsoup.parser.Tag.valueOf("org.jsoup.select.Selector$SelectorParseException: ");
        boolean boolean49 = tag48.isData();
        boolean boolean50 = tag48.requiresSpecificParent();
        boolean boolean51 = tag48.isBlock();
        boolean boolean52 = tag43.canContain(tag48);
        boolean boolean53 = elements40.equals((java.lang.Object) tag48);
        boolean boolean54 = attribute22.equals((java.lang.Object) tag48);
        boolean boolean55 = tag14.isValidParent(tag48);
        boolean boolean56 = tag1.isValidParent(tag48);
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(tag14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "org.jsoup.select.selector$selectorparseexception:" + "'", str15, "org.jsoup.select.selector$selectorparseexception:");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "org.jsoup.select.selector$selectorparseexception:" + "'", str16, "org.jsoup.select.selector$selectorparseexception:");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "org.jsoup.select.selector$selectorparseexception:" + "'", str17, "org.jsoup.select.selector$selectorparseexception:");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(attribute22);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertNotNull(elements33);
        org.junit.Assert.assertNotNull(elements35);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertNotNull(elements40);
        org.junit.Assert.assertNotNull(elements41);
        org.junit.Assert.assertNotNull(tag43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(tag48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
    }

    @Test
    public void test2744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2744");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        int int1 = attributes0.size();
        boolean boolean3 = attributes0.hasKey("");
        attributes0.put("org.jsoup.select.Selector$SelectorParseException: #document#document=\"#document#document\"", "hi!=\"#root=&quot;hi!&quot;\"");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test2745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2745");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element5 = document1.prepend("#document");
        org.jsoup.nodes.Element element6 = element5.empty();
        org.jsoup.select.Elements elements8 = element5.getElementsByTag("org.jsoup.select.Selector$SelectorParseException: ");
        org.jsoup.select.Elements elements10 = elements8.removeClass("#root");
        org.jsoup.select.Elements elements12 = elements8.append("");
        boolean boolean14 = elements8.hasAttr("#document#document");
        org.jsoup.select.Elements elements16 = elements8.toggleClass("#document#document");
        org.jsoup.select.Elements elements19 = elements16.attr("<org.jsoup.select.selector$selectorparseexception: hi!=\"#root\">\n</org.jsoup.select.selector$selectorparseexception:>", "[<, ?, >, #, d, o, c, u, m, e, n, t, #, d, o, c, u, m, e, n, t, d, o, c, u, m, e, n, t]");
        org.jsoup.select.Elements elements21 = elements19.append("<html> \n<head> \n</head> \n<body>\n  #root  \n</body>\n</html>");
        org.jsoup.nodes.Element[] elementArray22 = new org.jsoup.nodes.Element[] {};
        org.jsoup.select.Elements elements23 = new org.jsoup.select.Elements(elementArray22);
        org.jsoup.select.Elements elements24 = new org.jsoup.select.Elements(elementArray22);
        org.jsoup.select.Elements elements26 = elements24.select("<[#, d, o, c, u, m, e, n, t]>\n</[#, d, o, c, u, m, e, n, t]>#root=&quot;hi!&quot;");
        java.lang.String str27 = elements26.val();
        org.jsoup.select.Elements elements28 = new org.jsoup.select.Elements((java.util.List<org.jsoup.nodes.Element>) elements26);
        boolean boolean29 = elements21.removeAll((java.util.Collection<org.jsoup.nodes.Element>) elements26);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertNotNull(elements21);
        org.junit.Assert.assertNotNull(elementArray22);
        org.junit.Assert.assertNotNull(elements26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test2746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2746");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Document document2 = document1.normalise();
        org.jsoup.nodes.Element element4 = document1.prependElement("org.jsoup.select.selector$selectorparseexception:");
        org.jsoup.nodes.Element element6 = element4.wrap("#root");
        org.jsoup.nodes.Document document8 = new org.jsoup.nodes.Document("");
        boolean boolean9 = document8.hasText();
        java.lang.String str10 = document8.nodeName();
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet13 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet13, strArray12);
        org.jsoup.nodes.Element element15 = document8.classNames((java.util.Set<java.lang.String>) strSet13);
        org.jsoup.nodes.Element element17 = element15.addClass("#document");
        java.lang.String str18 = element17.html();
        org.jsoup.nodes.Element element20 = element17.appendElement("#document");
        org.jsoup.nodes.Document document22 = new org.jsoup.nodes.Document("");
        boolean boolean23 = document22.hasText();
        java.lang.String str24 = document22.nodeName();
        java.lang.String[] strArray26 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet27 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet27, strArray26);
        org.jsoup.nodes.Element element29 = document22.classNames((java.util.Set<java.lang.String>) strSet27);
        org.jsoup.nodes.Element element31 = document22.append("#document");
        org.jsoup.nodes.Element element33 = document22.prepend("#document");
        org.jsoup.nodes.Element element35 = element33.wrap("#document");
        java.lang.String str36 = element33.baseUri();
        org.jsoup.nodes.Element element37 = element17.prependChild((org.jsoup.nodes.Node) element33);
        org.jsoup.nodes.Element element39 = element37.addClass("#document#document");
        org.jsoup.nodes.Element element40 = element4.prependChild((org.jsoup.nodes.Node) element39);
        org.jsoup.select.Elements elements41 = element4.siblingElements();
        org.jsoup.select.Elements elements43 = element4.getElementsByTag("<!--#document-->=\"#document#document\"");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNull(element6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#document" + "'", str10, "#document");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "#document" + "'", str24, "#document");
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertNull(element35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(element37);
        org.junit.Assert.assertNotNull(element39);
        org.junit.Assert.assertNotNull(element40);
        org.junit.Assert.assertNotNull(elements41);
        org.junit.Assert.assertNotNull(elements43);
    }

    @Test
    public void test2747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2747");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.hasText();
        java.lang.String str3 = document1.nodeName();
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        org.jsoup.nodes.Element element8 = document1.classNames((java.util.Set<java.lang.String>) strSet6);
        org.jsoup.nodes.Element element10 = element8.addClass("#document");
        org.jsoup.nodes.Document document12 = new org.jsoup.nodes.Document("");
        boolean boolean13 = document12.hasText();
        boolean boolean14 = document12.hasText();
        org.jsoup.nodes.Document document16 = new org.jsoup.nodes.Document("");
        boolean boolean17 = document16.hasText();
        java.lang.String str18 = document16.nodeName();
        java.lang.String[] strArray20 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet21 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet21, strArray20);
        org.jsoup.nodes.Element element23 = document16.classNames((java.util.Set<java.lang.String>) strSet21);
        org.jsoup.nodes.Element element24 = document12.classNames((java.util.Set<java.lang.String>) strSet21);
        java.util.Set<java.lang.String> strSet25 = document12.classNames();
        org.jsoup.nodes.Element element26 = element8.classNames(strSet25);
        java.lang.String str27 = element8.toString();
        org.jsoup.nodes.Document document29 = new org.jsoup.nodes.Document("");
        boolean boolean30 = document29.hasText();
        java.lang.String str31 = document29.nodeName();
        java.lang.String str32 = document29.val();
        java.lang.String str33 = document29.outerHtml();
        java.lang.String[] strArray36 = new java.lang.String[] { "\n<!--#document-->", "#data" };
        java.util.LinkedHashSet<java.lang.String> strSet37 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet37, strArray36);
        org.jsoup.nodes.Element element39 = document29.classNames((java.util.Set<java.lang.String>) strSet37);
        org.jsoup.nodes.Document document40 = document29.normalise();
        org.jsoup.select.Elements elements43 = document40.getElementsByAttributeValueStarting("#declaration", "#document#document=\"#document#document\"");
        org.jsoup.select.Elements elements45 = document40.getElementsByIndexGreaterThan((int) (short) 0);
        java.lang.String str46 = document40.nodeName();
        org.jsoup.nodes.Element element48 = document40.appendText(" hi!=\"#root\"");
        java.util.Set<java.lang.String> strSet49 = element48.classNames();
        org.jsoup.nodes.Element element50 = element8.classNames(strSet49);
        org.jsoup.select.Elements elements52 = element50.getElementsByIndexEquals((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "#document" + "'", str18, "#document");
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(strSet25);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "#document" + "'", str31, "#document");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(element39);
        org.junit.Assert.assertNotNull(document40);
        org.junit.Assert.assertNotNull(elements43);
        org.junit.Assert.assertNotNull(elements45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "#document" + "'", str46, "#document");
        org.junit.Assert.assertNotNull(element48);
        org.junit.Assert.assertNotNull(strSet49);
        org.junit.Assert.assertNotNull(element50);
        org.junit.Assert.assertNotNull(elements52);
    }

    @Test
    public void test2748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2748");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element4 = document1.attr("hi!", "#root");
        java.lang.String str5 = document1.id();
        boolean boolean7 = document1.hasAttr("#root");
        java.lang.String str8 = document1.baseUri();
        boolean boolean10 = document1.hasAttr("");
        java.lang.String str11 = document1.tagName();
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#root" + "'", str11, "#root");
    }

    @Test
    public void test2749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2749");
        org.jsoup.nodes.Evaluator evaluator0 = null;
        org.jsoup.nodes.Document document2 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document2.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element6 = document2.prepend("#document");
        org.jsoup.nodes.Element element7 = element6.empty();
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements11 = document9.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements13 = elements11.prepend("");
        org.jsoup.select.Elements elements15 = elements13.removeAttr("");
        org.jsoup.nodes.Document document17 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements19 = document17.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements21 = elements19.prepend("");
        org.jsoup.select.Elements elements23 = elements21.removeAttr("");
        boolean boolean24 = elements13.containsAll((java.util.Collection<org.jsoup.nodes.Element>) elements21);
        org.jsoup.nodes.Document document26 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements28 = document26.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements30 = elements28.prepend("");
        org.jsoup.select.Elements elements32 = elements30.removeAttr("");
        org.jsoup.nodes.Document document34 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements36 = document34.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements38 = elements36.prepend("");
        org.jsoup.select.Elements elements40 = elements38.removeAttr("");
        boolean boolean41 = elements30.containsAll((java.util.Collection<org.jsoup.nodes.Element>) elements38);
        org.jsoup.select.Elements elements43 = elements38.wrap("#root");
        boolean boolean44 = elements21.containsAll((java.util.Collection<org.jsoup.nodes.Element>) elements43);
        org.jsoup.select.Elements elements45 = new org.jsoup.select.Elements((java.util.Collection<org.jsoup.nodes.Element>) elements21);
        org.jsoup.nodes.Element element46 = elements21.first();
        org.jsoup.nodes.Document document49 = org.jsoup.parser.Parser.parseBodyFragment("\n<!--#root-->", "#root");
        org.jsoup.nodes.Element element51 = document49.removeClass("#root=\"hi!\"");
        boolean boolean52 = elements21.add(element51);
        org.jsoup.nodes.Element element53 = element7.appendChild((org.jsoup.nodes.Node) element51);
        org.jsoup.nodes.Element element55 = element53.prependElement(" data=\"org.jsoup.select.selector$selectorparseexception:\" <!--#document-->=\" hi!\"");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements56 = org.jsoup.select.Collector.collect(evaluator0, element53);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertNotNull(elements21);
        org.junit.Assert.assertNotNull(elements23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(elements28);
        org.junit.Assert.assertNotNull(elements30);
        org.junit.Assert.assertNotNull(elements32);
        org.junit.Assert.assertNotNull(elements36);
        org.junit.Assert.assertNotNull(elements38);
        org.junit.Assert.assertNotNull(elements40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(elements43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNull(element46);
        org.junit.Assert.assertNotNull(document49);
        org.junit.Assert.assertNotNull(element51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(element53);
        org.junit.Assert.assertNotNull(element55);
    }

    @Test
    public void test2750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2750");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("#root", "");
        java.lang.String str3 = document2.outerHtml();
        org.jsoup.nodes.Element element5 = document2.append("<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        org.jsoup.select.Elements elements7 = document2.getElementsByIndexEquals(1);
        java.lang.String str8 = document2.title();
        org.jsoup.nodes.Element element10 = document2.prepend(" class=\"hi!\"");
        org.jsoup.nodes.Element element12 = element10.appendElement("<html> \n <head> \n </head> \n <body>\n   #root  \n </body>\n</html><<?#document#document>>\n</<?#document#document>>");
        org.jsoup.select.Elements elements15 = element10.getElementsByAttributeValueContaining("<hi!=\"#root=&quot;hi!&quot;\">\n</hi!=\"#root=&quot;hi!&quot;\">\n<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>", " data=\"org.jsoup.select.selector$selectorparseexception:\" <!--#document-->=\" hi!\"");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>" + "'", str3, "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(elements15);
    }

    @Test
    public void test2751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2751");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parse("hi!");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValue("hi!", "hi!");
        org.jsoup.nodes.Attributes attributes5 = document1.attributes();
        org.jsoup.nodes.Element element6 = document1.head();
        org.jsoup.select.Elements elements7 = element6.getAllElements();
        org.jsoup.select.Elements elements8 = element6.getAllElements();
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor9 = elements8.listIterator();
        int int10 = elements8.size();
        org.jsoup.nodes.Element element11 = elements8.last();
        java.lang.String str12 = element11.toString();
        org.jsoup.parser.Tag tag13 = element11.tag();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(elementItor9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\n<head>\n</head>" + "'", str12, "\n<head>\n</head>");
        org.junit.Assert.assertNotNull(tag13);
    }

    @Test
    public void test2752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2752");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element5 = document1.prepend("#document");
        org.jsoup.nodes.Element element6 = element5.empty();
        org.jsoup.select.Elements elements8 = element5.getElementsByTag("org.jsoup.select.Selector$SelectorParseException: ");
        org.jsoup.nodes.Document document10 = org.jsoup.Jsoup.parse("hi!");
        org.jsoup.select.Elements elements13 = document10.getElementsByAttributeValue("hi!", "hi!");
        org.jsoup.select.Selector.SelectorParseException selectorParseException15 = new org.jsoup.select.Selector.SelectorParseException("");
        boolean boolean16 = elements13.contains((java.lang.Object) "");
        java.util.Spliterator<org.jsoup.nodes.Element> elementSpliterator17 = elements13.spliterator();
        boolean boolean18 = elements8.addAll((java.util.Collection<org.jsoup.nodes.Element>) elements13);
        org.jsoup.select.Elements elements20 = elements8.html("\n<!--#declaration-->");
        java.util.Spliterator<org.jsoup.nodes.Element> elementSpliterator21 = elements20.spliterator();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(elementSpliterator17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(elements20);
        org.junit.Assert.assertNotNull(elementSpliterator21);
    }

    @Test
    public void test2753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2753");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("hi!", " &lt;!--#root--&gt;=\" class=&amp;quot;hi!&amp;quot;\"", false);
        java.lang.String str4 = xmlDeclaration3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<?hi!>" + "'", str4, "<?hi!>");
    }

    @Test
    public void test2754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2754");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.hasText();
        java.lang.String str3 = document1.nodeName();
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        org.jsoup.nodes.Element element8 = document1.classNames((java.util.Set<java.lang.String>) strSet6);
        org.jsoup.nodes.Element element10 = document1.append("#document");
        org.jsoup.nodes.Element element12 = element10.html("");
        org.jsoup.select.Elements elements15 = element10.getElementsByAttributeValueNot("#root", "org.jsoup.select.Selector$SelectorParseException: ");
        boolean boolean17 = element10.hasClass("a");
        java.lang.String str18 = element10.val();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test2755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2755");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("org.jsoup.select.Selector$SelectorParseException: ");
        java.lang.String str2 = tag1.getName();
        boolean boolean3 = tag1.canContainBlock();
        boolean boolean4 = tag1.isInline();
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.jsoup.select.selector$selectorparseexception:" + "'", str2, "org.jsoup.select.selector$selectorparseexception:");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test2756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2756");
        org.jsoup.nodes.Document document3 = org.jsoup.parser.Parser.parse("#root", "");
        org.jsoup.nodes.Element element6 = document3.attr("#root", "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        java.lang.String str7 = document3.tagName();
        java.lang.String str8 = document3.toString();
        org.jsoup.nodes.Document document10 = new org.jsoup.nodes.Document("");
        boolean boolean11 = document10.hasText();
        java.lang.String str12 = document10.nodeName();
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet15 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet15, strArray14);
        org.jsoup.nodes.Element element17 = document10.classNames((java.util.Set<java.lang.String>) strSet15);
        org.jsoup.nodes.Element element19 = document10.append("#document");
        org.jsoup.nodes.Element element21 = element19.html("<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        org.jsoup.nodes.Element element22 = document3.appendChild((org.jsoup.nodes.Node) element21);
        org.jsoup.select.Elements elements23 = org.jsoup.select.Selector.select("#text", element21);
        java.lang.String str24 = element21.tagName();
        org.jsoup.parser.Tag tag25 = element21.tag();
        boolean boolean26 = tag25.isInline();
        org.jsoup.parser.Tag tag28 = org.jsoup.parser.Tag.valueOf("<?#document#document>");
        org.jsoup.parser.Tag tag30 = org.jsoup.parser.Tag.valueOf("org.jsoup.select.Selector$SelectorParseException: ");
        boolean boolean31 = tag30.isData();
        boolean boolean32 = tag30.requiresSpecificParent();
        boolean boolean33 = tag30.isBlock();
        org.jsoup.parser.Tag tag35 = org.jsoup.parser.Tag.valueOf("org.jsoup.select.Selector$SelectorParseException: ");
        boolean boolean36 = tag35.isData();
        boolean boolean37 = tag35.requiresSpecificParent();
        boolean boolean38 = tag35.isBlock();
        boolean boolean39 = tag30.canContain(tag35);
        boolean boolean40 = tag30.isBlock();
        boolean boolean41 = tag30.isData();
        java.lang.String str42 = tag30.getName();
        boolean boolean43 = tag30.requiresSpecificParent();
        org.jsoup.parser.Tag tag45 = org.jsoup.parser.Tag.valueOf("#root");
        boolean boolean46 = tag45.isInline();
        boolean boolean47 = tag30.canContain(tag45);
        boolean boolean48 = tag28.canContain(tag30);
        org.jsoup.parser.Tag tag49 = tag28.getImplicitParent();
        org.jsoup.parser.Tag tag51 = org.jsoup.parser.Tag.valueOf("org.jsoup.select.Selector$SelectorParseException: ");
        java.lang.String str52 = tag51.getName();
        java.lang.String str53 = tag51.toString();
        java.lang.String str54 = tag51.getName();
        boolean boolean55 = tag51.isInline();
        boolean boolean56 = tag49.canContain(tag51);
        boolean boolean57 = tag25.isValidAncestor(tag51);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#root" + "'", str7, "#root");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>" + "'", str8, "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "#document" + "'", str12, "#document");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(elements23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "#root" + "'", str24, "#root");
        org.junit.Assert.assertNotNull(tag25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(tag28);
        org.junit.Assert.assertNotNull(tag30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(tag35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "org.jsoup.select.selector$selectorparseexception:" + "'", str42, "org.jsoup.select.selector$selectorparseexception:");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(tag45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(tag49);
        org.junit.Assert.assertNotNull(tag51);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "org.jsoup.select.selector$selectorparseexception:" + "'", str52, "org.jsoup.select.selector$selectorparseexception:");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "org.jsoup.select.selector$selectorparseexception:" + "'", str53, "org.jsoup.select.selector$selectorparseexception:");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "org.jsoup.select.selector$selectorparseexception:" + "'", str54, "org.jsoup.select.selector$selectorparseexception:");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
    }

    @Test
    public void test2757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2757");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("");
        boolean boolean3 = tokenQueue1.matches("org.jsoup.select.Selector$SelectorParseException: ");
        java.lang.String str4 = tokenQueue1.consumeWord();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test2758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2758");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.hasText();
        boolean boolean3 = document1.hasText();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        boolean boolean6 = document5.hasText();
        java.lang.String str7 = document5.nodeName();
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet10 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet10, strArray9);
        org.jsoup.nodes.Element element12 = document5.classNames((java.util.Set<java.lang.String>) strSet10);
        org.jsoup.nodes.Element element13 = document1.classNames((java.util.Set<java.lang.String>) strSet10);
        java.util.Set<java.lang.String> strSet14 = document1.classNames();
        org.jsoup.nodes.Element element16 = document1.getElementById("#document#document");
        java.lang.String str17 = document1.id();
        java.lang.String str18 = document1.nodeName();
        org.jsoup.nodes.Element element20 = document1.html("<html> \n <head> \n </head> \n <body>\n   #root  \n </body>\n</html><<?#document#document>>\n</<?#document#document>>");
        org.jsoup.nodes.Document document24 = org.jsoup.parser.Parser.parse("#root", "\n<!--#root-->");
        org.jsoup.select.Elements elements25 = org.jsoup.select.Selector.select("#declaration", (org.jsoup.nodes.Element) document24);
        org.jsoup.nodes.Element element26 = document24.body();
        org.jsoup.nodes.Document document28 = new org.jsoup.nodes.Document("");
        boolean boolean29 = document28.hasText();
        java.lang.String str30 = document28.nodeName();
        java.lang.String[] strArray32 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet33 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet33, strArray32);
        org.jsoup.nodes.Element element35 = document28.classNames((java.util.Set<java.lang.String>) strSet33);
        org.jsoup.nodes.Element element37 = document28.append("#document");
        org.jsoup.nodes.Element element39 = document28.prepend("#document");
        org.jsoup.select.Elements elements40 = document28.parents();
        org.jsoup.nodes.Element element41 = element26.appendChild((org.jsoup.nodes.Node) document28);
        org.jsoup.select.Elements elements43 = document28.getElementsByAttribute("#data");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element44 = element20.prependChild((org.jsoup.nodes.Node) document28);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.lang.NotImplementedException; message: Cannot (yet) move nodes in tree");
        } catch (org.apache.commons.lang.NotImplementedException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#document" + "'", str7, "#document");
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNull(element16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "#document" + "'", str18, "#document");
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(document24);
        org.junit.Assert.assertNotNull(elements25);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "#document" + "'", str30, "#document");
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertNotNull(element37);
        org.junit.Assert.assertNotNull(element39);
        org.junit.Assert.assertNotNull(elements40);
        org.junit.Assert.assertNotNull(element41);
        org.junit.Assert.assertNotNull(elements43);
    }

    @Test
    public void test2759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2759");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.hasText();
        java.lang.String str3 = document1.nodeName();
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        org.jsoup.nodes.Element element8 = document1.classNames((java.util.Set<java.lang.String>) strSet6);
        org.jsoup.nodes.Element element10 = element8.addClass("#document");
        org.jsoup.nodes.Document document12 = new org.jsoup.nodes.Document("");
        boolean boolean13 = document12.hasText();
        boolean boolean14 = document12.hasText();
        org.jsoup.nodes.Document document16 = new org.jsoup.nodes.Document("");
        boolean boolean17 = document16.hasText();
        java.lang.String str18 = document16.nodeName();
        java.lang.String[] strArray20 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet21 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet21, strArray20);
        org.jsoup.nodes.Element element23 = document16.classNames((java.util.Set<java.lang.String>) strSet21);
        org.jsoup.nodes.Element element24 = document12.classNames((java.util.Set<java.lang.String>) strSet21);
        java.util.Set<java.lang.String> strSet25 = document12.classNames();
        org.jsoup.nodes.Element element26 = element8.classNames(strSet25);
        org.jsoup.nodes.Element element27 = element8.empty();
        java.lang.Class<?> wildcardClass28 = element27.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "#document" + "'", str18, "#document");
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(strSet25);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2760");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragmentRelaxed("body", "");
        org.jsoup.select.Elements elements4 = document2.getElementsByIndexEquals((-1));
        org.jsoup.nodes.Document document6 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element9 = document6.attr("hi!", "#root");
        org.jsoup.select.Elements elements10 = element9.parents();
        org.jsoup.nodes.Document document12 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements14 = document12.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements16 = elements14.prepend("");
        org.jsoup.select.Elements elements18 = elements16.removeAttr("");
        org.jsoup.select.Elements elements20 = elements16.addClass("#document#documenthi!");
        int int21 = elements10.indexOf((java.lang.Object) elements16);
        boolean boolean22 = elements4.contains((java.lang.Object) int21);
        org.jsoup.select.Elements elements24 = elements4.removeClass("ocument");
        org.jsoup.nodes.Element element25 = elements4.first();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertNotNull(elements20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(elements24);
        org.junit.Assert.assertNull(element25);
    }

    @Test
    public void test2761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2761");
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parseBodyFragment("hi!=\"#root=&quot;hi!&quot;\"", "#root=\"hi!\"");
        java.lang.String str3 = document2.id();
        org.jsoup.select.Elements elements4 = document2.getAllElements();
        document2.setBaseUri("#data");
        org.jsoup.nodes.Element element8 = document2.appendElement(" &lt;!--#root--&gt;=\" class=&amp;quot;hi!&amp;quot;\"");
        boolean boolean10 = document2.hasClass("<html>\n<head>\n</head>\n<body> \n <!--#root-->\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2762");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element4 = elements3.first();
        org.jsoup.select.Elements elements6 = elements3.toggleClass("#document");
        org.jsoup.parser.Tag tag8 = org.jsoup.parser.Tag.valueOf("org.jsoup.select.Selector$SelectorParseException: ");
        boolean boolean9 = tag8.isData();
        boolean boolean10 = tag8.requiresSpecificParent();
        boolean boolean11 = tag8.isBlock();
        org.jsoup.parser.Tag tag13 = org.jsoup.parser.Tag.valueOf("org.jsoup.select.Selector$SelectorParseException: ");
        boolean boolean14 = tag13.isData();
        boolean boolean15 = tag13.requiresSpecificParent();
        boolean boolean16 = tag13.isBlock();
        boolean boolean17 = tag8.canContain(tag13);
        java.lang.String str18 = tag13.getName();
        int int19 = elements6.indexOf((java.lang.Object) tag13);
        java.lang.String str20 = elements6.val();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(tag13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "org.jsoup.select.selector$selectorparseexception:" + "'", str18, "org.jsoup.select.selector$selectorparseexception:");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test2763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2763");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("#root", "");
        java.lang.String str3 = document2.outerHtml();
        org.jsoup.nodes.Element element5 = document2.append("<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        org.jsoup.select.Elements elements7 = document2.getElementsByIndexEquals(1);
        java.lang.String str8 = document2.nodeName();
        org.jsoup.nodes.Document document10 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element13 = document10.attr("hi!", "#root");
        org.jsoup.nodes.Attributes attributes14 = document10.attributes();
        org.jsoup.select.Elements elements15 = document10.children();
        java.util.Set<java.lang.String> strSet16 = document10.classNames();
        org.jsoup.nodes.Element element17 = document2.classNames(strSet16);
        org.jsoup.nodes.Element element19 = element17.append("&lt;?hi!&gt;");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>" + "'", str3, "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#document" + "'", str8, "#document");
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(attributes14);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(element19);
    }

    @Test
    public void test2764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2764");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("#root", "");
        java.lang.String str3 = document2.outerHtml();
        org.jsoup.nodes.Element element5 = document2.createElement("#document#documenthi!");
        org.jsoup.nodes.Element element8 = document2.attr("<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "org.jsoup.select.Selector$SelectorParseException: \n<!--#document-->");
        org.jsoup.parser.Tag tag9 = element8.tag();
        org.jsoup.parser.Tag tag10 = tag9.getImplicitParent();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>" + "'", str3, "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertNotNull(tag10);
    }

    @Test
    public void test2765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2765");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.hasText();
        boolean boolean3 = document1.hasText();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        boolean boolean6 = document5.hasText();
        java.lang.String str7 = document5.nodeName();
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet10 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet10, strArray9);
        org.jsoup.nodes.Element element12 = document5.classNames((java.util.Set<java.lang.String>) strSet10);
        org.jsoup.nodes.Element element13 = document1.classNames((java.util.Set<java.lang.String>) strSet10);
        org.jsoup.nodes.Element element15 = document1.appendText("hi!");
        org.jsoup.parser.Tag tag16 = document1.tag();
        boolean boolean17 = tag16.requiresSpecificParent();
        boolean boolean18 = tag16.isData();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#document" + "'", str7, "#document");
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(tag16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test2766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2766");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.hasText();
        java.lang.String str3 = document1.nodeName();
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        org.jsoup.nodes.Element element8 = document1.classNames((java.util.Set<java.lang.String>) strSet6);
        org.jsoup.nodes.Element element10 = element8.addClass("#document");
        org.jsoup.nodes.Document document12 = new org.jsoup.nodes.Document("");
        boolean boolean13 = document12.hasText();
        boolean boolean14 = document12.hasText();
        org.jsoup.nodes.Document document16 = new org.jsoup.nodes.Document("");
        boolean boolean17 = document16.hasText();
        java.lang.String str18 = document16.nodeName();
        java.lang.String[] strArray20 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet21 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet21, strArray20);
        org.jsoup.nodes.Element element23 = document16.classNames((java.util.Set<java.lang.String>) strSet21);
        org.jsoup.nodes.Element element24 = document12.classNames((java.util.Set<java.lang.String>) strSet21);
        java.util.Set<java.lang.String> strSet25 = document12.classNames();
        org.jsoup.nodes.Element element26 = element8.classNames(strSet25);
        org.jsoup.nodes.Element element27 = element8.empty();
        java.lang.String str28 = element8.nodeName();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "#document" + "'", str18, "#document");
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(strSet25);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "#document" + "'", str28, "#document");
    }

    @Test
    public void test2767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2767");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element5 = document1.prepend("#document");
        org.jsoup.nodes.Element element6 = element5.empty();
        org.jsoup.select.Elements elements8 = element5.getElementsByTag("org.jsoup.select.Selector$SelectorParseException: ");
        org.jsoup.select.Elements elements10 = elements8.removeClass("#root");
        org.jsoup.nodes.Document document12 = new org.jsoup.nodes.Document("");
        boolean boolean13 = document12.hasText();
        java.lang.String str14 = document12.nodeName();
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet17 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet17, strArray16);
        org.jsoup.nodes.Element element19 = document12.classNames((java.util.Set<java.lang.String>) strSet17);
        org.jsoup.nodes.Element element21 = document12.append("#document");
        org.jsoup.nodes.Element element23 = document12.prepend("#document");
        org.jsoup.nodes.Attributes attributes24 = element23.attributes();
        org.jsoup.nodes.Element element26 = element23.append("hi!");
        org.jsoup.select.Elements elements28 = element26.getElementsByIndexLessThan((int) (short) 0);
        boolean boolean29 = elements8.equals((java.lang.Object) elements28);
        org.jsoup.nodes.Document document32 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements34 = document32.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements36 = elements34.prepend("");
        elements36.clear();
        int int39 = elements36.indexOf((java.lang.Object) "org.jsoup.select.Selector$SelectorParseException: ");
        org.jsoup.select.Elements elements41 = elements36.removeClass("#data");
        org.jsoup.select.Elements elements42 = org.jsoup.select.Selector.select("#data", (java.lang.Iterable<org.jsoup.nodes.Element>) elements41);
        org.jsoup.nodes.Element element43 = elements42.last();
        org.jsoup.select.Elements elements45 = elements42.html("#data");
        boolean boolean46 = elements28.containsAll((java.util.Collection<org.jsoup.nodes.Element>) elements42);
        java.lang.String str47 = elements28.html();
        boolean boolean48 = elements28.hasText();
        elements28.clear();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#document" + "'", str14, "#document");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(attributes24);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertNotNull(elements28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(elements34);
        org.junit.Assert.assertNotNull(elements36);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNotNull(elements41);
        org.junit.Assert.assertNotNull(elements42);
        org.junit.Assert.assertNull(element43);
        org.junit.Assert.assertNotNull(elements45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test2768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2768");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parse(file0, "#root=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n #root \n&lt;/body&gt;\n&lt;/html&gt;\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2769");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.hasText();
        boolean boolean3 = document1.hasText();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        boolean boolean6 = document5.hasText();
        java.lang.String str7 = document5.nodeName();
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet10 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet10, strArray9);
        org.jsoup.nodes.Element element12 = document5.classNames((java.util.Set<java.lang.String>) strSet10);
        org.jsoup.nodes.Element element13 = document1.classNames((java.util.Set<java.lang.String>) strSet10);
        element13.setBaseUri("\n<!--#root-->");
        org.jsoup.nodes.Document document18 = org.jsoup.parser.Parser.parse("#root", "");
        org.jsoup.nodes.Element element21 = document18.attr("#root", "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        java.lang.String str22 = document18.tagName();
        java.lang.String str23 = document18.toString();
        org.jsoup.nodes.Node node25 = document18.removeAttr("[#, d, o, c, u, m, e, n, t]");
        org.jsoup.nodes.Element element26 = element13.prependChild((org.jsoup.nodes.Node) document18);
        org.jsoup.select.Elements elements27 = element26.getAllElements();
        org.jsoup.nodes.Element element29 = element26.text("#document#documentdocument=\"&lt;?hi!&gt;\"");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#document" + "'", str7, "#document");
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(document18);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "#root" + "'", str22, "#root");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>" + "'", str23, "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertNotNull(elements27);
        org.junit.Assert.assertNotNull(element29);
    }

    @Test
    public void test2770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2770");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        java.lang.String str2 = tag1.getName();
        java.lang.String str3 = tag1.toString();
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>" + "'", str2, "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>" + "'", str3, "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
    }

    @Test
    public void test2771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2771");
        org.jsoup.nodes.Document document3 = org.jsoup.parser.Parser.parse("#root", "");
        java.lang.String str4 = document3.html();
        java.lang.String str6 = document3.attr("org.jsoup.select.selector$selectorparseexception:");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements7 = org.jsoup.select.Selector.select("<hi!=\"#root=&quot;hi!&quot;\">\n</hi!=\"#root=&quot;hi!&quot;\">\n<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>", (org.jsoup.nodes.Element) document3);
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query <hi!=\"#root=&quot;hi!&quot;\">?</hi!=\"#root=&quot;hi!&quot;\">?<html>?<head>?</head>?<body>? #root ?</body>?</html>");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>" + "'", str4, "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test2772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2772");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        java.lang.String str5 = elements3.attr("#root");
        org.jsoup.nodes.Document document7 = new org.jsoup.nodes.Document("");
        boolean boolean8 = document7.hasText();
        java.lang.String str9 = document7.nodeName();
        org.jsoup.select.Elements elements10 = document7.children();
        org.jsoup.nodes.Element element12 = document7.prependElement("[#, d, o, c, u, m, e, n, t]");
        int int13 = elements3.lastIndexOf((java.lang.Object) document7);
        org.jsoup.nodes.Element element14 = document7.parent();
        org.jsoup.nodes.Element element16 = document7.append("#root=\"hi!\"");
        java.lang.String str17 = element16.toString();
        org.jsoup.nodes.Document document19 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Document document20 = document19.normalise();
        org.jsoup.nodes.Element element21 = document19.head();
        org.jsoup.nodes.Element element23 = element21.append("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        boolean boolean25 = element23.equals((java.lang.Object) "#root=\"hi!\"");
        org.jsoup.nodes.Document document27 = new org.jsoup.nodes.Document("");
        boolean boolean28 = document27.hasText();
        java.lang.String str29 = document27.nodeName();
        java.lang.String str30 = document27.val();
        java.lang.String str31 = document27.outerHtml();
        java.lang.String[] strArray34 = new java.lang.String[] { "\n<!--#document-->", "#data" };
        java.util.LinkedHashSet<java.lang.String> strSet35 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet35, strArray34);
        org.jsoup.nodes.Element element37 = document27.classNames((java.util.Set<java.lang.String>) strSet35);
        org.jsoup.nodes.Element element38 = element23.classNames((java.util.Set<java.lang.String>) strSet35);
        org.jsoup.nodes.Element element39 = element16.classNames((java.util.Set<java.lang.String>) strSet35);
        java.lang.String str40 = element39.nodeName();
        org.jsoup.nodes.Element element42 = element39.getElementById("#document#document");
        org.jsoup.select.Elements elements43 = element39.parents();
        org.jsoup.nodes.Element element46 = element39.attr("[]", "<hi!=\"#root=&quot;hi!&quot;\">\n</hi!=\"#root=&quot;hi!&quot;\">\n<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#document" + "'", str9, "#document");
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNull(element14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "<[#, d, o, c, u, m, e, n, t]>\n</[#, d, o, c, u, m, e, n, t]>#root=&quot;hi!&quot;" + "'", str17, "<[#, d, o, c, u, m, e, n, t]>\n</[#, d, o, c, u, m, e, n, t]>#root=&quot;hi!&quot;");
        org.junit.Assert.assertNotNull(document19);
        org.junit.Assert.assertNotNull(document20);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "#document" + "'", str29, "#document");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(element37);
        org.junit.Assert.assertNotNull(element38);
        org.junit.Assert.assertNotNull(element39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "#document" + "'", str40, "#document");
        org.junit.Assert.assertNull(element42);
        org.junit.Assert.assertNotNull(elements43);
        org.junit.Assert.assertNotNull(element46);
    }

    @Test
    public void test2773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2773");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        java.lang.String str5 = elements3.attr("#root");
        org.jsoup.nodes.Document document7 = new org.jsoup.nodes.Document("");
        boolean boolean8 = document7.hasText();
        java.lang.String str9 = document7.nodeName();
        org.jsoup.select.Elements elements10 = document7.children();
        org.jsoup.nodes.Element element12 = document7.prependElement("[#, d, o, c, u, m, e, n, t]");
        int int13 = elements3.lastIndexOf((java.lang.Object) document7);
        org.jsoup.select.Elements elements14 = new org.jsoup.select.Elements((java.util.Collection<org.jsoup.nodes.Element>) elements3);
        org.jsoup.select.Elements elements15 = new org.jsoup.select.Elements((java.util.List<org.jsoup.nodes.Element>) elements3);
        org.jsoup.parser.Tag tag17 = org.jsoup.parser.Tag.valueOf("org.jsoup.select.Selector$SelectorParseException: ");
        java.lang.String str18 = tag17.getName();
        boolean boolean19 = tag17.isInline();
        org.jsoup.nodes.Document document22 = new org.jsoup.nodes.Document("");
        boolean boolean23 = document22.hasText();
        java.lang.String str24 = document22.nodeName();
        java.lang.String[] strArray26 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet27 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet27, strArray26);
        org.jsoup.nodes.Element element29 = document22.classNames((java.util.Set<java.lang.String>) strSet27);
        org.jsoup.nodes.Element element31 = document22.append("#document");
        org.jsoup.nodes.Element element33 = document22.prepend("#document");
        org.jsoup.nodes.Attributes attributes34 = element33.attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator35 = attributes34.spliterator();
        java.lang.String str37 = attributes34.get("hi!");
        org.jsoup.nodes.Document document40 = org.jsoup.parser.Parser.parse("#root", "");
        org.jsoup.nodes.Element element43 = document40.attr("#root", "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        boolean boolean44 = attributes34.equals((java.lang.Object) "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        java.lang.String str45 = attributes34.html();
        org.jsoup.nodes.Element element46 = new org.jsoup.nodes.Element(tag17, "", attributes34);
        org.jsoup.nodes.Attribute attribute49 = new org.jsoup.nodes.Attribute("<?#document#document>", "org.jsoup.select.Selector$SelectorParseException: ");
        attribute49.setValue("[#, d, o, c, u, m, e, n, t]");
        attributes34.put(attribute49);
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor53 = attributes34.iterator();
        int int54 = attributes34.size();
        java.lang.String str56 = attributes34.get("body");
        boolean boolean57 = elements3.remove((java.lang.Object) str56);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#document" + "'", str9, "#document");
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(tag17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "org.jsoup.select.selector$selectorparseexception:" + "'", str18, "org.jsoup.select.selector$selectorparseexception:");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "#document" + "'", str24, "#document");
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertNotNull(attributes34);
        org.junit.Assert.assertNotNull(attributeSpliterator35);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNotNull(document40);
        org.junit.Assert.assertNotNull(element43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + " class=\"hi!\"" + "'", str45, " class=\"hi!\"");
        org.junit.Assert.assertNotNull(attributeItor53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 2 + "'", int54 == 2);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
    }

    @Test
    public void test2774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2774");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("#comment", "#root=\"#root=&quot;hi!&quot;\"");
        java.lang.String str3 = comment2.nodeName();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#comment" + "'", str3, "#comment");
    }

    @Test
    public void test2775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2775");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.hasText();
        boolean boolean3 = document1.hasText();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        boolean boolean6 = document5.hasText();
        java.lang.String str7 = document5.nodeName();
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet10 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet10, strArray9);
        org.jsoup.nodes.Element element12 = document5.classNames((java.util.Set<java.lang.String>) strSet10);
        org.jsoup.nodes.Element element13 = document1.classNames((java.util.Set<java.lang.String>) strSet10);
        org.jsoup.nodes.Element element15 = document1.appendText("hi!");
        org.jsoup.parser.Tag tag16 = document1.tag();
        org.jsoup.nodes.Element element17 = document1.head();
        java.lang.String str18 = document1.toString();
        org.jsoup.nodes.Element element20 = document1.createElement("#root");
        org.jsoup.nodes.Node node22 = element20.removeAttr("<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>#document#documentdocument");
        java.lang.String str24 = node22.absUrl("[#, d, o, c, u, m, e, n, t, #, d, o, c, u, m, e, n, t, =, \", #, d, o, c, u, m, e, n, t, #, d, o, c, u, m, e, n, t, \"]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#document" + "'", str7, "#document");
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(tag16);
        org.junit.Assert.assertNull(element17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test2776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2776");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        int int1 = attributes0.size();
        org.jsoup.nodes.Document document3 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements5 = document3.getElementsByAttribute("hi!");
        java.lang.String str6 = elements5.val();
        java.lang.Object obj7 = null;
        int int8 = elements5.lastIndexOf(obj7);
        org.jsoup.select.Elements elements10 = elements5.eq((int) '#');
        boolean boolean11 = attributes0.equals((java.lang.Object) elements10);
        boolean boolean13 = elements10.hasClass("<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        org.jsoup.nodes.Element element14 = elements10.last();
        org.jsoup.select.Elements elements16 = elements10.removeClass("hi!");
        org.jsoup.nodes.Element element17 = elements16.first();
        org.jsoup.select.Elements elements18 = new org.jsoup.select.Elements((java.util.List<org.jsoup.nodes.Element>) elements16);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(element14);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertNull(element17);
    }

    @Test
    public void test2777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2777");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.hasText();
        java.lang.String str3 = document1.nodeName();
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        org.jsoup.nodes.Element element8 = document1.classNames((java.util.Set<java.lang.String>) strSet6);
        org.jsoup.nodes.Element element10 = element8.addClass("#document");
        org.jsoup.nodes.Document document12 = new org.jsoup.nodes.Document("");
        boolean boolean13 = document12.hasText();
        boolean boolean14 = document12.hasText();
        org.jsoup.nodes.Document document16 = new org.jsoup.nodes.Document("");
        boolean boolean17 = document16.hasText();
        java.lang.String str18 = document16.nodeName();
        java.lang.String[] strArray20 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet21 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet21, strArray20);
        org.jsoup.nodes.Element element23 = document16.classNames((java.util.Set<java.lang.String>) strSet21);
        org.jsoup.nodes.Element element24 = document12.classNames((java.util.Set<java.lang.String>) strSet21);
        java.util.Set<java.lang.String> strSet25 = document12.classNames();
        org.jsoup.nodes.Element element26 = element8.classNames(strSet25);
        org.jsoup.nodes.Element element28 = element26.toggleClass("body");
        org.jsoup.nodes.Element element30 = element26.val("");
        java.lang.String str32 = element26.absUrl("org.jsoup.select.Selector$SelectorParseException: \n<!--#document-->");
        org.jsoup.nodes.Element element34 = element26.toggleClass("#document#document=\"#document#document\"");
        org.jsoup.nodes.Element element35 = element26.empty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "#document" + "'", str18, "#document");
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(strSet25);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(element34);
        org.junit.Assert.assertNotNull(element35);
    }

    @Test
    public void test2778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2778");
        org.jsoup.nodes.Document document2 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document2.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements6 = elements4.prepend("");
        elements6.clear();
        int int9 = elements6.indexOf((java.lang.Object) "org.jsoup.select.Selector$SelectorParseException: ");
        org.jsoup.select.Elements elements11 = elements6.removeClass("#data");
        org.jsoup.select.Elements elements12 = org.jsoup.select.Selector.select("#data", (java.lang.Iterable<org.jsoup.nodes.Element>) elements11);
        org.jsoup.nodes.Document document15 = org.jsoup.parser.Parser.parse("#root", "");
        java.lang.String str16 = document15.outerHtml();
        org.jsoup.nodes.Element element18 = document15.append("<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        org.jsoup.select.Elements elements20 = document15.getElementsByIndexEquals(1);
        boolean boolean22 = elements20.contains((java.lang.Object) "#comment");
        org.jsoup.select.Elements elements23 = elements20.parents();
        boolean boolean24 = elements12.addAll((java.util.Collection<org.jsoup.nodes.Element>) elements23);
        org.jsoup.nodes.Element element25 = elements12.first();
        java.util.Set<java.lang.String> strSet26 = element25.classNames();
        org.jsoup.nodes.Element element27 = element25.empty();
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(document15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>" + "'", str16, "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(elements20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(elements23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(strSet26);
        org.junit.Assert.assertNotNull(element27);
    }

    @Test
    public void test2779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2779");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("#document", "");
        org.jsoup.nodes.Element element4 = document2.addClass("hi!");
        org.jsoup.nodes.Element element5 = document2.body();
        org.jsoup.nodes.Element element7 = document2.toggleClass(" #comment=\"\"");
        org.jsoup.select.Elements elements8 = document2.children();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(elements8);
    }

    @Test
    public void test2780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2780");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "\n<!--#root-->");
        java.lang.String str3 = textNode2.getWholeText();
        org.jsoup.nodes.TextNode textNode5 = textNode2.text("hi!");
        org.jsoup.nodes.TextNode textNode7 = textNode2.text("#root=\"hi!\"");
        java.lang.String str8 = textNode7.nodeName();
        java.lang.String str9 = textNode7.text();
        org.jsoup.nodes.TextNode textNode11 = textNode7.text("\n<!--a-->");
        java.lang.String str12 = textNode11.getWholeText();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(textNode5);
        org.junit.Assert.assertNotNull(textNode7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#text" + "'", str8, "#text");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#root=&quot;hi!&quot;" + "'", str9, "#root=&quot;hi!&quot;");
        org.junit.Assert.assertNotNull(textNode11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\n<!--a-->" + "'", str12, "\n<!--a-->");
    }

    @Test
    public void test2781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2781");
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parse("", "");
        java.lang.String str3 = document2.nodeName();
        java.lang.String str4 = document2.text();
        org.jsoup.nodes.Node node7 = document2.attr("hi!=\"#root=&quot;hi!&quot;\"", "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element9 = document2.createElement("#root");
        org.jsoup.select.Elements elements12 = document2.getElementsByAttributeValueContaining("#document#document", "\n<!--#root-->");
        org.jsoup.nodes.Element element14 = document2.prependText("hi!=\"#root=&quot;hi!&quot;\"");
        org.jsoup.select.Elements elements17 = element14.getElementsByAttributeValue("#document#document", " ");
        org.jsoup.nodes.Element element19 = element14.appendText("\n<org.jsoup.select.selector$selectorparseexception: org.jsoup.select.selector$selectorparseexception:>\n</org.jsoup.select.selector$selectorparseexception: org.jsoup.select.selector$selectorparseexception:>");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertNotNull(element19);
    }

    @Test
    public void test2782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2782");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.hasText();
        java.lang.String str3 = document1.nodeName();
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        org.jsoup.nodes.Element element8 = document1.classNames((java.util.Set<java.lang.String>) strSet6);
        org.jsoup.nodes.Element element10 = element8.addClass("#document");
        java.lang.String str11 = element10.html();
        org.jsoup.nodes.Element element13 = element10.appendElement("#document");
        org.jsoup.nodes.Document document15 = new org.jsoup.nodes.Document("");
        boolean boolean16 = document15.hasText();
        java.lang.String str17 = document15.nodeName();
        java.lang.String[] strArray19 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet20 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet20, strArray19);
        org.jsoup.nodes.Element element22 = document15.classNames((java.util.Set<java.lang.String>) strSet20);
        org.jsoup.nodes.Element element24 = document15.append("#document");
        org.jsoup.nodes.Element element26 = document15.prepend("#document");
        org.jsoup.nodes.Element element28 = element26.wrap("#document");
        java.lang.String str29 = element26.baseUri();
        org.jsoup.nodes.Element element30 = element10.prependChild((org.jsoup.nodes.Node) element26);
        org.jsoup.select.Elements elements32 = element30.getElementsByAttribute("a");
        java.lang.String str33 = element30.baseUri();
        org.jsoup.nodes.Element element35 = element30.prepend("hi! #document body");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "#document" + "'", str17, "#document");
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertNull(element28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertNotNull(elements32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(element35);
    }

    @Test
    public void test2783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2783");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.hasText();
        boolean boolean3 = document1.hasText();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        boolean boolean6 = document5.hasText();
        java.lang.String str7 = document5.nodeName();
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet10 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet10, strArray9);
        org.jsoup.nodes.Element element12 = document5.classNames((java.util.Set<java.lang.String>) strSet10);
        org.jsoup.nodes.Element element13 = document1.classNames((java.util.Set<java.lang.String>) strSet10);
        org.jsoup.nodes.Element element15 = document1.appendText("hi!");
        org.jsoup.parser.Tag tag16 = document1.tag();
        org.jsoup.nodes.Element element17 = document1.head();
        java.lang.String str18 = document1.toString();
        org.jsoup.nodes.Element element20 = document1.createElement("#root");
        org.jsoup.nodes.Node node22 = element20.removeAttr("<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>#document#documentdocument");
        org.jsoup.select.Elements elements23 = element20.children();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#document" + "'", str7, "#document");
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(tag16);
        org.junit.Assert.assertNull(element17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(elements23);
    }

    @Test
    public void test2784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2784");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements5 = elements3.prepend("");
        org.jsoup.select.Elements elements7 = elements5.removeAttr("");
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements11 = document9.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements13 = elements11.prepend("");
        org.jsoup.select.Elements elements15 = elements13.removeAttr("");
        boolean boolean16 = elements5.containsAll((java.util.Collection<org.jsoup.nodes.Element>) elements13);
        org.jsoup.select.Elements elements18 = elements13.wrap("#root");
        org.jsoup.nodes.Document document20 = new org.jsoup.nodes.Document("");
        boolean boolean21 = document20.hasText();
        java.lang.String str22 = document20.nodeName();
        java.lang.String[] strArray24 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet25 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet25, strArray24);
        org.jsoup.nodes.Element element27 = document20.classNames((java.util.Set<java.lang.String>) strSet25);
        org.jsoup.nodes.Element element29 = element27.addClass("#document");
        org.jsoup.select.Elements elements32 = element29.getElementsByAttributeValueNot("#root", "org.jsoup.select.Selector$SelectorParseException: ");
        java.lang.String str33 = elements32.html();
        org.jsoup.nodes.Attributes attributes35 = new org.jsoup.nodes.Attributes();
        int int36 = attributes35.size();
        org.jsoup.nodes.Document document38 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements40 = document38.getElementsByAttribute("hi!");
        java.lang.String str41 = elements40.val();
        java.lang.Object obj42 = null;
        int int43 = elements40.lastIndexOf(obj42);
        org.jsoup.select.Elements elements45 = elements40.eq((int) '#');
        boolean boolean46 = attributes35.equals((java.lang.Object) elements45);
        boolean boolean48 = elements45.hasClass("<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        boolean boolean49 = elements32.addAll(1, (java.util.Collection<org.jsoup.nodes.Element>) elements45);
        boolean boolean50 = elements18.removeAll((java.util.Collection<org.jsoup.nodes.Element>) elements32);
        org.jsoup.select.Elements elements52 = elements32.eq((int) (byte) 0);
        org.jsoup.select.Elements elements53 = elements52.parents();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Element> elementList56 = elements53.subList((-1), (int) 'd');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: fromIndex = -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "#document" + "'", str22, "#document");
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertNotNull(elements32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(elements40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertNotNull(elements45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(elements52);
        org.junit.Assert.assertNotNull(elements53);
    }

    @Test
    public void test2785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2785");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragmentRelaxed(" ", "#root");
        org.jsoup.nodes.Document document5 = org.jsoup.parser.Parser.parse("#root", "");
        org.jsoup.nodes.Element element8 = document5.attr("#root", "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        java.lang.String str9 = element8.id();
        org.jsoup.select.Elements elements11 = element8.getElementsByIndexEquals((int) (short) 1);
        java.lang.String str12 = element8.toString();
        org.jsoup.nodes.Element element13 = document2.prependChild((org.jsoup.nodes.Node) element8);
        java.lang.String str14 = element13.baseUri();
        org.jsoup.select.Elements elements15 = element13.parents();
        elements15.clear();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(document5);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>" + "'", str12, "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#root" + "'", str14, "#root");
        org.junit.Assert.assertNotNull(elements15);
    }

    @Test
    public void test2786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2786");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("#data", "");
        java.lang.String str3 = attribute2.html();
        attribute2.setValue("document");
        attribute2.setKey(" class=\"hi!\"");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#data=\"\"" + "'", str3, "#data=\"\"");
    }

    @Test
    public void test2787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2787");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element4 = elements3.first();
        org.jsoup.select.Elements elements6 = elements3.toggleClass("#document");
        org.jsoup.parser.Tag tag8 = org.jsoup.parser.Tag.valueOf("org.jsoup.select.Selector$SelectorParseException: ");
        boolean boolean9 = tag8.isData();
        boolean boolean10 = tag8.requiresSpecificParent();
        boolean boolean11 = tag8.isBlock();
        org.jsoup.parser.Tag tag13 = org.jsoup.parser.Tag.valueOf("org.jsoup.select.Selector$SelectorParseException: ");
        boolean boolean14 = tag13.isData();
        boolean boolean15 = tag13.requiresSpecificParent();
        boolean boolean16 = tag13.isBlock();
        boolean boolean17 = tag8.canContain(tag13);
        java.lang.String str18 = tag13.getName();
        int int19 = elements6.indexOf((java.lang.Object) tag13);
        boolean boolean20 = tag13.isInline();
        org.jsoup.parser.Tag tag21 = tag13.getImplicitParent();
        boolean boolean22 = tag13.requiresSpecificParent();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(tag13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "org.jsoup.select.selector$selectorparseexception:" + "'", str18, "org.jsoup.select.selector$selectorparseexception:");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(tag21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test2788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2788");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragmentRelaxed("#document#document", " ");
        org.jsoup.nodes.Element element3 = document2.parent();
        java.lang.String str4 = document2.outerHtml();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<html>\n<head>\n</head>\n<body>\n #document#document\n</body>\n</html>" + "'", str4, "<html>\n<head>\n</head>\n<body>\n #document#document\n</body>\n</html>");
    }

    @Test
    public void test2789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2789");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.hasText();
        java.lang.String str3 = document1.nodeName();
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        org.jsoup.nodes.Element element8 = document1.classNames((java.util.Set<java.lang.String>) strSet6);
        org.jsoup.nodes.Element element10 = document1.append("#document");
        org.jsoup.nodes.Element element12 = document1.prepend("#document");
        org.jsoup.nodes.Attributes attributes13 = element12.attributes();
        org.jsoup.nodes.Document document15 = org.jsoup.Jsoup.parse("hi!");
        org.jsoup.select.Elements elements18 = document15.getElementsByAttributeValue("hi!", "hi!");
        org.jsoup.nodes.Attributes attributes19 = document15.attributes();
        attributes19.remove("#root=\"hi!\"");
        attributes13.addAll(attributes19);
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor23 = attributes19.iterator();
        java.util.List<org.jsoup.nodes.Attribute> attributeList24 = attributes19.asList();
        attributes19.put(" text=\"#data\"", "\n<body>\n  &lt;!--#root--&gt; \n</body>");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertNotNull(document15);
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertNotNull(attributes19);
        org.junit.Assert.assertNotNull(attributeItor23);
        org.junit.Assert.assertNotNull(attributeList24);
    }

    @Test
    public void test2790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2790");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element4 = document1.attr("hi!", "#root");
        org.jsoup.nodes.Attributes attributes5 = document1.attributes();
        org.jsoup.select.Elements elements6 = document1.children();
        java.util.Set<java.lang.String> strSet7 = document1.classNames();
        org.jsoup.select.Elements elements9 = document1.getElementsByIndexEquals((int) (byte) 0);
        boolean boolean11 = document1.hasAttr("<?#document#document>");
        org.jsoup.select.Elements elements13 = document1.getElementsByAttribute("\n<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(elements13);
    }

    @Test
    public void test2791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2791");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>#document#documentdocument", "body=\"# \"");
        org.junit.Assert.assertNotNull(document2);
    }

    @Test
    public void test2792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2792");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("#root");
        org.jsoup.nodes.Element element3 = document1.html("org.jsoup.select.Selector$SelectorParseException: ");
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        boolean boolean6 = document5.hasText();
        boolean boolean7 = document5.hasText();
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        boolean boolean10 = document9.hasText();
        java.lang.String str11 = document9.nodeName();
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet14 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet14, strArray13);
        org.jsoup.nodes.Element element16 = document9.classNames((java.util.Set<java.lang.String>) strSet14);
        org.jsoup.nodes.Element element17 = document5.classNames((java.util.Set<java.lang.String>) strSet14);
        java.lang.String str18 = element17.text();
        org.jsoup.nodes.Element element20 = element17.prependElement("#comment");
        java.lang.String str21 = element20.id();
        org.jsoup.select.Elements elements23 = element20.getElementsByIndexLessThan((-1));
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element24 = document1.prependChild((org.jsoup.nodes.Node) element20);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.lang.NotImplementedException; message: Cannot (yet) move nodes in tree");
        } catch (org.apache.commons.lang.NotImplementedException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#document" + "'", str11, "#document");
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(elements23);
    }

    @Test
    public void test2793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2793");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.hasText();
        java.lang.String str3 = document1.nodeName();
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        org.jsoup.nodes.Element element8 = document1.classNames((java.util.Set<java.lang.String>) strSet6);
        org.jsoup.nodes.Element element10 = document1.append("");
        org.jsoup.nodes.Element element12 = element10.addClass("#document#document");
        org.jsoup.nodes.Node node14 = element10.removeAttr("<html> \n<head> \n</head> \n<body>\n  #root  \n</body>\n</html>");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(node14);
    }

    @Test
    public void test2794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2794");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragmentRelaxed("<[#, d, o, c, u, m, e, n, t]>\n</[#, d, o, c, u, m, e, n, t]>#root=&quot;hi!&quot;", "#declaration");
        org.junit.Assert.assertNotNull(document2);
    }

    @Test
    public void test2795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2795");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element5 = document1.prepend("#document");
        org.jsoup.nodes.Element element6 = element5.empty();
        org.jsoup.select.Elements elements8 = element5.getElementsByTag("org.jsoup.select.Selector$SelectorParseException: ");
        org.jsoup.select.Elements elements10 = elements8.removeClass("#root");
        org.jsoup.nodes.Document document12 = new org.jsoup.nodes.Document("");
        boolean boolean13 = document12.hasText();
        java.lang.String str14 = document12.nodeName();
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet17 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet17, strArray16);
        org.jsoup.nodes.Element element19 = document12.classNames((java.util.Set<java.lang.String>) strSet17);
        org.jsoup.nodes.Element element21 = document12.append("#document");
        org.jsoup.nodes.Element element23 = document12.prepend("#document");
        org.jsoup.nodes.Attributes attributes24 = element23.attributes();
        org.jsoup.nodes.Element element26 = element23.append("hi!");
        org.jsoup.select.Elements elements28 = element26.getElementsByIndexLessThan((int) (short) 0);
        boolean boolean29 = elements8.equals((java.lang.Object) elements28);
        org.jsoup.select.Elements elements31 = elements8.append("#document");
        org.jsoup.nodes.DataNode dataNode34 = org.jsoup.nodes.DataNode.createFromEncoded("\n<!--#root-->", "#document");
        boolean boolean35 = elements8.equals((java.lang.Object) dataNode34);
        org.jsoup.select.Elements elements37 = elements8.append(" class=\"hi!\"");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#document" + "'", str14, "#document");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(attributes24);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertNotNull(elements28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(elements31);
        org.junit.Assert.assertNotNull(dataNode34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(elements37);
    }

    @Test
    public void test2796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2796");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.hasText();
        boolean boolean3 = document1.hasText();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        boolean boolean6 = document5.hasText();
        java.lang.String str7 = document5.nodeName();
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet10 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet10, strArray9);
        org.jsoup.nodes.Element element12 = document5.classNames((java.util.Set<java.lang.String>) strSet10);
        org.jsoup.nodes.Element element13 = document1.classNames((java.util.Set<java.lang.String>) strSet10);
        java.util.Set<java.lang.String> strSet14 = document1.classNames();
        org.jsoup.nodes.Element element16 = document1.getElementById("#document#document");
        org.jsoup.nodes.Element element18 = document1.prependText("");
        org.jsoup.nodes.Element element20 = element18.prependText("[]");
        java.lang.String str21 = element20.html();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#document" + "'", str7, "#document");
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNull(element16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "[]" + "'", str21, "[]");
    }

    @Test
    public void test2797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2797");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        java.lang.String str4 = elements3.val();
        java.lang.Object obj5 = null;
        int int6 = elements3.lastIndexOf(obj5);
        org.jsoup.select.Elements elements8 = elements3.eq((int) '#');
        boolean boolean10 = elements3.hasAttr("#root");
        int int12 = elements3.indexOf((java.lang.Object) (byte) 100);
        java.lang.String str14 = elements3.attr("org.jsoup.select.Selector$SelectorParseException: ");
        org.jsoup.select.Elements elements16 = elements3.toggleClass("org.jsoup.select.Selector$SelectorParseException:");
        org.jsoup.select.Elements elements18 = elements16.toggleClass("<html>\n<head>\n</head>\n<body>\n ocument \n</body>\n</html>");
        org.jsoup.nodes.Document document21 = new org.jsoup.nodes.Document("<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>\n<html> \n<head> \n</head> \n<body>\n  #root  \n</body>\n</html>");
        // The following exception was thrown during execution in test generation
        try {
            elements18.add((int) (byte) -1, (org.jsoup.nodes.Element) document21);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertNotNull(elements18);
    }

    @Test
    public void test2798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2798");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.hasText();
        java.lang.String str3 = document1.nodeName();
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        org.jsoup.nodes.Element element8 = document1.classNames((java.util.Set<java.lang.String>) strSet6);
        org.jsoup.nodes.Element element10 = document1.append("#document");
        org.jsoup.nodes.Element element12 = document1.prepend("#document");
        org.jsoup.nodes.Attributes attributes13 = element12.attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator14 = attributes13.spliterator();
        org.jsoup.nodes.Attributes attributes15 = new org.jsoup.nodes.Attributes();
        int int16 = attributes15.size();
        java.lang.String str17 = attributes15.html();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor18 = attributes15.iterator();
        boolean boolean19 = attributes13.equals((java.lang.Object) attributes15);
        java.lang.String str20 = attributes13.toString();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator21 = attributes13.spliterator();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor22 = attributes13.iterator();
        org.jsoup.parser.Tag tag24 = org.jsoup.parser.Tag.valueOf("org.jsoup.select.Selector$SelectorParseException: ");
        boolean boolean25 = tag24.isData();
        org.jsoup.nodes.Attributes attributes27 = new org.jsoup.nodes.Attributes();
        int int28 = attributes27.size();
        java.lang.String str29 = attributes27.html();
        org.jsoup.nodes.Element element30 = new org.jsoup.nodes.Element(tag24, "org.jsoup.select.selector$selectorparseexception:", attributes27);
        org.jsoup.nodes.Attribute attribute33 = org.jsoup.nodes.Attribute.createFromEncoded("hi!", "hi!");
        attribute33.setKey("#root");
        java.lang.String str36 = attribute33.html();
        attributes27.put(attribute33);
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor38 = attributes27.iterator();
        attributes13.addAll(attributes27);
        java.lang.String str40 = attributes27.html();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator41 = attributes27.spliterator();
        java.util.List<org.jsoup.nodes.Attribute> attributeList42 = attributes27.asList();
        boolean boolean44 = attributes27.hasKey("o");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertNotNull(attributeSpliterator14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(attributeItor18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + " class=\"hi!\"" + "'", str20, " class=\"hi!\"");
        org.junit.Assert.assertNotNull(attributeSpliterator21);
        org.junit.Assert.assertNotNull(attributeItor22);
        org.junit.Assert.assertNotNull(tag24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(attribute33);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "#root=\"hi!\"" + "'", str36, "#root=\"hi!\"");
        org.junit.Assert.assertNotNull(attributeItor38);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + " #root=\"hi!\"" + "'", str40, " #root=\"hi!\"");
        org.junit.Assert.assertNotNull(attributeSpliterator41);
        org.junit.Assert.assertNotNull(attributeList42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test2799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2799");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element5 = document1.prepend("#document");
        org.jsoup.nodes.Element element6 = element5.empty();
        org.jsoup.select.Elements elements8 = element5.getElementsByTag("org.jsoup.select.Selector$SelectorParseException: ");
        org.jsoup.select.Elements elements10 = elements8.removeClass("#root");
        org.jsoup.nodes.Document document12 = new org.jsoup.nodes.Document("");
        boolean boolean13 = document12.hasText();
        java.lang.String str14 = document12.nodeName();
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet17 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet17, strArray16);
        org.jsoup.nodes.Element element19 = document12.classNames((java.util.Set<java.lang.String>) strSet17);
        org.jsoup.nodes.Element element21 = document12.append("#document");
        org.jsoup.nodes.Element element23 = document12.prepend("#document");
        org.jsoup.nodes.Attributes attributes24 = element23.attributes();
        org.jsoup.nodes.Element element26 = element23.append("hi!");
        org.jsoup.select.Elements elements28 = element26.getElementsByIndexLessThan((int) (short) 0);
        boolean boolean29 = elements8.equals((java.lang.Object) elements28);
        org.jsoup.nodes.Document document32 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements34 = document32.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements36 = elements34.prepend("");
        elements36.clear();
        int int39 = elements36.indexOf((java.lang.Object) "org.jsoup.select.Selector$SelectorParseException: ");
        org.jsoup.select.Elements elements41 = elements36.removeClass("#data");
        org.jsoup.select.Elements elements42 = org.jsoup.select.Selector.select("#data", (java.lang.Iterable<org.jsoup.nodes.Element>) elements41);
        org.jsoup.nodes.Element element43 = elements42.last();
        org.jsoup.select.Elements elements45 = elements42.html("#data");
        boolean boolean46 = elements28.containsAll((java.util.Collection<org.jsoup.nodes.Element>) elements42);
        int int47 = elements28.size();
        org.jsoup.select.Elements elements49 = elements28.addClass("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        boolean boolean51 = elements49.is("<#document#document=\"#document#document\">\n</#document#document=\"#document#document\">");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#document" + "'", str14, "#document");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(attributes24);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertNotNull(elements28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(elements34);
        org.junit.Assert.assertNotNull(elements36);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNotNull(elements41);
        org.junit.Assert.assertNotNull(elements42);
        org.junit.Assert.assertNull(element43);
        org.junit.Assert.assertNotNull(elements45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNotNull(elements49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test2800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2800");
        org.jsoup.nodes.Document document3 = org.jsoup.parser.Parser.parse("#root", "");
        org.jsoup.nodes.Element element6 = document3.attr("#root", "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        java.lang.String str7 = document3.tagName();
        java.lang.String str8 = document3.toString();
        org.jsoup.nodes.Document document10 = new org.jsoup.nodes.Document("");
        boolean boolean11 = document10.hasText();
        java.lang.String str12 = document10.nodeName();
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet15 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet15, strArray14);
        org.jsoup.nodes.Element element17 = document10.classNames((java.util.Set<java.lang.String>) strSet15);
        org.jsoup.nodes.Element element19 = document10.append("#document");
        org.jsoup.nodes.Element element21 = element19.html("<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        org.jsoup.nodes.Element element22 = document3.appendChild((org.jsoup.nodes.Node) element21);
        org.jsoup.select.Elements elements23 = org.jsoup.select.Selector.select("#text", element21);
        java.lang.String str24 = element21.toString();
        java.lang.String str25 = element21.toString();
        org.jsoup.nodes.Attributes attributes26 = element21.attributes();
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#root" + "'", str7, "#root");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>" + "'", str8, "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "#document" + "'", str12, "#document");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(elements23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "<html> \n <head> \n </head> \n <body>\n   #root  \n </body>\n</html>" + "'", str24, "<html> \n <head> \n </head> \n <body>\n   #root  \n </body>\n</html>");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "<html> \n <head> \n </head> \n <body>\n   #root  \n </body>\n</html>" + "'", str25, "<html> \n <head> \n </head> \n <body>\n   #root  \n </body>\n</html>");
        org.junit.Assert.assertNotNull(attributes26);
    }

    @Test
    public void test2801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2801");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "\n<!--#root-->");
        java.lang.String str3 = textNode2.getWholeText();
        org.jsoup.nodes.TextNode textNode5 = textNode2.text("hi!");
        java.lang.String str6 = textNode2.toString();
        java.lang.String str7 = textNode2.nodeName();
        java.lang.String str9 = textNode2.absUrl("<html>\n<head>\n</head>\n<body>\n</body>\n</html>=\"\"");
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(textNode5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#text" + "'", str7, "#text");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test2802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2802");
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parseBodyFragment("org.jsoup.select.selector$selectorparseexception: org.jsoup.select.selector$selectorparseexception:=\"#root\"", "<#root class=\"hi!\">\nhi!\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements5 = document2.getElementsByAttributeValueNot("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
    }

    @Test
    public void test2803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2803");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("#text", "<?#document#document>");
        org.jsoup.nodes.Document document4 = new org.jsoup.nodes.Document("");
        boolean boolean5 = document4.hasText();
        boolean boolean6 = document4.hasText();
        org.jsoup.nodes.Document document8 = new org.jsoup.nodes.Document("");
        boolean boolean9 = document8.hasText();
        java.lang.String str10 = document8.nodeName();
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet13 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet13, strArray12);
        org.jsoup.nodes.Element element15 = document8.classNames((java.util.Set<java.lang.String>) strSet13);
        org.jsoup.nodes.Element element16 = document4.classNames((java.util.Set<java.lang.String>) strSet13);
        org.jsoup.nodes.Element element18 = document4.appendText("hi!");
        org.jsoup.nodes.Element element19 = document4.head();
        boolean boolean20 = attribute2.equals((java.lang.Object) element19);
        org.jsoup.nodes.Document document22 = new org.jsoup.nodes.Document("");
        boolean boolean23 = document22.hasText();
        org.jsoup.nodes.Element element25 = document22.addClass("\n<!--#document-->");
        boolean boolean27 = element25.hasAttr("<#root hi!=\"#root\">\n</#root>");
        boolean boolean28 = attribute2.equals((java.lang.Object) element25);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#document" + "'", str10, "#document");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNull(element19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test2804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2804");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "\n<!--#root-->");
        java.lang.String str3 = textNode2.text();
        java.lang.String str4 = textNode2.nodeName();
        java.lang.String str5 = textNode2.getWholeText();
        org.jsoup.nodes.TextNode textNode7 = textNode2.text("body");
        java.lang.String str8 = textNode7.text();
        java.lang.String str9 = textNode7.text();
        boolean boolean10 = textNode7.isBlank();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#text" + "'", str4, "#text");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(textNode7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "body" + "'", str8, "body");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "body" + "'", str9, "body");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2805");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("<!--#document-->");
        org.jsoup.nodes.Element element3 = document1.prependText("#document#documenthi!#root=&quot;hi!&quot;");
        org.jsoup.select.Elements elements4 = element3.getAllElements();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(elements4);
    }

    @Test
    public void test2806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2806");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        int int1 = attributes0.size();
        java.lang.String str2 = attributes0.html();
        java.lang.String str3 = attributes0.html();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator4 = attributes0.spliterator();
        attributes0.put("\n&lt;!--#root--&gt;", " class=&quot;hi!&quot;");
        org.jsoup.nodes.TextNode textNode10 = org.jsoup.nodes.TextNode.createFromEncoded("body", "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.lang.String str11 = textNode10.nodeName();
        boolean boolean12 = attributes0.equals((java.lang.Object) textNode10);
        org.jsoup.nodes.Attributes attributes13 = new org.jsoup.nodes.Attributes();
        int int14 = attributes13.size();
        java.lang.String str15 = attributes13.html();
        java.lang.String str16 = attributes13.html();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator17 = attributes13.spliterator();
        boolean boolean19 = attributes13.hasKey("");
        org.jsoup.parser.Tag tag21 = org.jsoup.parser.Tag.valueOf("org.jsoup.select.Selector$SelectorParseException: ");
        java.lang.String str22 = tag21.getName();
        boolean boolean23 = tag21.isInline();
        org.jsoup.nodes.Document document26 = new org.jsoup.nodes.Document("");
        boolean boolean27 = document26.hasText();
        java.lang.String str28 = document26.nodeName();
        java.lang.String[] strArray30 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet31 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet31, strArray30);
        org.jsoup.nodes.Element element33 = document26.classNames((java.util.Set<java.lang.String>) strSet31);
        org.jsoup.nodes.Element element35 = document26.append("#document");
        org.jsoup.nodes.Element element37 = document26.prepend("#document");
        org.jsoup.nodes.Attributes attributes38 = element37.attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator39 = attributes38.spliterator();
        java.lang.String str41 = attributes38.get("hi!");
        org.jsoup.nodes.Document document44 = org.jsoup.parser.Parser.parse("#root", "");
        org.jsoup.nodes.Element element47 = document44.attr("#root", "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        boolean boolean48 = attributes38.equals((java.lang.Object) "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        java.lang.String str49 = attributes38.html();
        org.jsoup.nodes.Element element50 = new org.jsoup.nodes.Element(tag21, "", attributes38);
        org.jsoup.nodes.Attribute attribute53 = new org.jsoup.nodes.Attribute("<?#document#document>", "org.jsoup.select.Selector$SelectorParseException: ");
        attribute53.setValue("[#, d, o, c, u, m, e, n, t]");
        attributes38.put(attribute53);
        attributes13.put(attribute53);
        attributes0.put(attribute53);
        java.lang.String str59 = attribute53.getValue();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(attributeSpliterator4);
        org.junit.Assert.assertNotNull(textNode10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#text" + "'", str11, "#text");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(attributeSpliterator17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(tag21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "org.jsoup.select.selector$selectorparseexception:" + "'", str22, "org.jsoup.select.selector$selectorparseexception:");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "#document" + "'", str28, "#document");
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertNotNull(element37);
        org.junit.Assert.assertNotNull(attributes38);
        org.junit.Assert.assertNotNull(attributeSpliterator39);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(document44);
        org.junit.Assert.assertNotNull(element47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + " class=\"hi!\"" + "'", str49, " class=\"hi!\"");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "[#, d, o, c, u, m, e, n, t]" + "'", str59, "[#, d, o, c, u, m, e, n, t]");
    }

    @Test
    public void test2807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2807");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements5 = elements3.prepend("");
        org.jsoup.select.Elements elements7 = elements3.toggleClass("org.jsoup.select.selector$selectorparseexception: org.jsoup.select.selector$selectorparseexception:=\"#root\"");
        boolean boolean9 = elements3.hasAttr("#text");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2808");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("#document");
        java.lang.String str2 = tokenQueue1.consumeAttributeKey();
        java.lang.String str4 = tokenQueue1.consumeTo("#root=\"hi!\"");
        boolean boolean5 = tokenQueue1.isEmpty();
        java.lang.String str6 = tokenQueue1.remainder();
        java.lang.String str8 = tokenQueue1.chompTo("&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#document" + "'", str4, "#document");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test2809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2809");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element4 = document1.attr("hi!", "#root");
        org.jsoup.nodes.Attributes attributes5 = document1.attributes();
        org.jsoup.select.Elements elements6 = document1.children();
        java.util.Set<java.lang.String> strSet7 = document1.classNames();
        org.jsoup.parser.Tag tag8 = document1.tag();
        org.jsoup.nodes.Document document10 = new org.jsoup.nodes.Document("");
        boolean boolean11 = document10.hasText();
        boolean boolean12 = document10.hasText();
        org.jsoup.nodes.Document document14 = new org.jsoup.nodes.Document("");
        boolean boolean15 = document14.hasText();
        java.lang.String str16 = document14.nodeName();
        java.lang.String[] strArray18 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet19 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet19, strArray18);
        org.jsoup.nodes.Element element21 = document14.classNames((java.util.Set<java.lang.String>) strSet19);
        org.jsoup.nodes.Element element22 = document10.classNames((java.util.Set<java.lang.String>) strSet19);
        org.jsoup.nodes.Element element24 = document10.appendText("hi!");
        org.jsoup.parser.Tag tag25 = document10.tag();
        boolean boolean26 = tag25.requiresSpecificParent();
        org.jsoup.parser.Tag tag27 = tag25.getImplicitParent();
        org.jsoup.nodes.Element element29 = new org.jsoup.nodes.Element(tag25, "<?#document#document>");
        boolean boolean30 = tag25.isData();
        boolean boolean31 = tag8.isValidParent(tag25);
        org.jsoup.parser.Tag tag34 = org.jsoup.parser.Tag.valueOf("org.jsoup.select.Selector$SelectorParseException: ");
        boolean boolean35 = tag34.isData();
        org.jsoup.nodes.Attributes attributes37 = new org.jsoup.nodes.Attributes();
        int int38 = attributes37.size();
        java.lang.String str39 = attributes37.html();
        org.jsoup.nodes.Element element40 = new org.jsoup.nodes.Element(tag34, "org.jsoup.select.selector$selectorparseexception:", attributes37);
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator41 = attributes37.spliterator();
        java.lang.String str42 = attributes37.toString();
        org.jsoup.parser.Tag tag44 = org.jsoup.parser.Tag.valueOf("org.jsoup.select.Selector$SelectorParseException: ");
        boolean boolean45 = tag44.isData();
        org.jsoup.nodes.Attributes attributes47 = new org.jsoup.nodes.Attributes();
        int int48 = attributes47.size();
        java.lang.String str49 = attributes47.html();
        org.jsoup.nodes.Element element50 = new org.jsoup.nodes.Element(tag44, "org.jsoup.select.selector$selectorparseexception:", attributes47);
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator51 = attributes47.spliterator();
        attributes47.put("#comment", "#document#document=\"#document#document\"");
        int int55 = attributes47.size();
        attributes37.addAll(attributes47);
        org.jsoup.nodes.Element element57 = new org.jsoup.nodes.Element(tag25, "#data", attributes37);
        boolean boolean58 = element57.isBlock();
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "#document" + "'", str16, "#document");
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(tag25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(tag27);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(tag34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(attributeSpliterator41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertNotNull(tag44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertNotNull(attributeSpliterator51);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 1 + "'", int55 == 1);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
    }

    @Test
    public void test2810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2810");
        org.jsoup.nodes.Document document3 = org.jsoup.parser.Parser.parse("#root", "\n<!--#root-->");
        org.jsoup.select.Elements elements4 = org.jsoup.select.Selector.select("#declaration", (org.jsoup.nodes.Element) document3);
        org.jsoup.nodes.Element element5 = document3.body();
        org.jsoup.nodes.Document document7 = new org.jsoup.nodes.Document("");
        boolean boolean8 = document7.hasText();
        java.lang.String str9 = document7.nodeName();
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet12 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet12, strArray11);
        org.jsoup.nodes.Element element14 = document7.classNames((java.util.Set<java.lang.String>) strSet12);
        org.jsoup.nodes.Element element16 = document7.append("#document");
        org.jsoup.nodes.Element element18 = document7.prepend("#document");
        org.jsoup.select.Elements elements19 = document7.parents();
        org.jsoup.nodes.Element element20 = element5.appendChild((org.jsoup.nodes.Node) document7);
        org.jsoup.select.Elements elements21 = element20.getAllElements();
        org.jsoup.nodes.Element element22 = element20.previousElementSibling();
        org.jsoup.nodes.Element element24 = element22.val("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#document" + "'", str9, "#document");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(elements21);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(element24);
    }

    @Test
    public void test2811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2811");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("#document");
        java.lang.String str2 = tokenQueue1.consumeAttributeKey();
        java.lang.String str4 = tokenQueue1.consumeTo("#root=\"hi!\"");
        java.lang.String str5 = tokenQueue1.toString();
        tokenQueue1.addFirst("#document#document=\"\"");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#document" + "'", str4, "#document");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
    }

    @Test
    public void test2812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2812");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("[]a#document#documentdocument");
        org.jsoup.nodes.Element element3 = document1.text("hi!=&quot;#root=&amp;quot;hi!&amp;quot;&quot;\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>\n\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>\n\n<head>\n</head>\n\n<body>\n</body>");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
    }

    @Test
    public void test2813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2813");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "\n<!--#root-->");
        java.lang.String str3 = textNode2.getWholeText();
        org.jsoup.nodes.TextNode textNode5 = textNode2.text("hi!");
        java.lang.String str6 = textNode2.getWholeText();
        boolean boolean7 = textNode2.isBlank();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(textNode5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2814");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element4 = document1.attr("hi!", "#root");
        org.jsoup.nodes.Attributes attributes5 = document1.attributes();
        org.jsoup.nodes.Document document6 = document1.normalise();
        java.lang.String str7 = document1.title();
        org.jsoup.select.Elements elements9 = document1.getElementsByIndexEquals((int) (short) 0);
        org.jsoup.nodes.Element element12 = document1.attr("#data", "hi!");
        java.lang.String str13 = document1.outerHtml();
        org.jsoup.select.Elements elements16 = document1.getElementsByAttributeValueContaining("<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "#document#documenthi!");
        boolean boolean18 = elements16.hasAttr(" ");
        java.lang.String str19 = elements16.html();
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>" + "'", str13, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test2815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2815");
        org.jsoup.nodes.Document document3 = org.jsoup.parser.Parser.parse("#root", "\n<!--#root-->");
        org.jsoup.select.Elements elements4 = org.jsoup.select.Selector.select("#declaration", (org.jsoup.nodes.Element) document3);
        org.jsoup.nodes.Element element5 = document3.body();
        org.jsoup.nodes.Document document7 = new org.jsoup.nodes.Document("");
        boolean boolean8 = document7.hasText();
        java.lang.String str9 = document7.nodeName();
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet12 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet12, strArray11);
        org.jsoup.nodes.Element element14 = document7.classNames((java.util.Set<java.lang.String>) strSet12);
        org.jsoup.nodes.Element element16 = document7.append("#document");
        org.jsoup.nodes.Element element18 = document7.prepend("#document");
        org.jsoup.select.Elements elements19 = document7.parents();
        org.jsoup.nodes.Element element20 = element5.appendChild((org.jsoup.nodes.Node) document7);
        org.jsoup.select.Elements elements22 = element5.getElementsByIndexEquals((int) (byte) 10);
        org.jsoup.nodes.Element element24 = element5.html("org.jsoup.select.selector$selectorparseexception: org.jsoup.select.selector$selectorparseexception:");
        org.jsoup.nodes.Element element27 = element5.attr("<html>\n<head>\n</head>\n<body>\n</body>\n</html>\n<head>\n</head>\n<body>\n</body>\n", "#root=&quot;hi!&quot;");
        org.jsoup.select.Elements elements28 = element27.parents();
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#document" + "'", str9, "#document");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(elements22);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertNotNull(elements28);
    }

    @Test
    public void test2816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2816");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("#root");
        org.jsoup.nodes.Element element3 = document1.html("org.jsoup.select.Selector$SelectorParseException: ");
        java.lang.String str4 = element3.toString();
        org.jsoup.select.Elements elements6 = element3.getElementsByAttribute("a");
        java.lang.Object obj7 = null;
        boolean boolean8 = elements6.remove(obj7);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "org.jsoup.select.Selector$SelectorParseException:" + "'", str4, "org.jsoup.select.Selector$SelectorParseException:");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2817");
        org.jsoup.safety.Whitelist whitelist1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.jsoup.Jsoup.clean(" #comment=\"\"", whitelist1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2818");
        org.jsoup.safety.Whitelist whitelist2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.jsoup.Jsoup.clean("<html>\n<head>\n <title><html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html></title>\n</head>\n<body>\n</body>\n</html>", "org.jsoup.select.Selector$SelectorParseException:", whitelist2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2819");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("#document", "");
        org.jsoup.nodes.Element element4 = document2.addClass("hi!");
        org.jsoup.nodes.Element element5 = document2.body();
        org.jsoup.nodes.Document document7 = new org.jsoup.nodes.Document("");
        boolean boolean8 = document7.hasText();
        java.lang.String str9 = document7.nodeName();
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet12 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet12, strArray11);
        org.jsoup.nodes.Element element14 = document7.classNames((java.util.Set<java.lang.String>) strSet12);
        org.jsoup.nodes.Element element16 = element14.addClass("#document");
        org.jsoup.nodes.Document document18 = new org.jsoup.nodes.Document("");
        boolean boolean19 = document18.hasText();
        boolean boolean20 = document18.hasText();
        org.jsoup.nodes.Document document22 = new org.jsoup.nodes.Document("");
        boolean boolean23 = document22.hasText();
        java.lang.String str24 = document22.nodeName();
        java.lang.String[] strArray26 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet27 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet27, strArray26);
        org.jsoup.nodes.Element element29 = document22.classNames((java.util.Set<java.lang.String>) strSet27);
        org.jsoup.nodes.Element element30 = document18.classNames((java.util.Set<java.lang.String>) strSet27);
        java.util.Set<java.lang.String> strSet31 = document18.classNames();
        org.jsoup.nodes.Element element32 = element14.classNames(strSet31);
        org.jsoup.nodes.Element element33 = element5.classNames(strSet31);
        java.util.List<org.jsoup.nodes.Node> nodeList34 = element33.childNodes();
        java.util.Set<java.lang.String> strSet35 = element33.classNames();
        boolean boolean36 = element33.isBlock();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#document" + "'", str9, "#document");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "#document" + "'", str24, "#document");
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertNotNull(strSet31);
        org.junit.Assert.assertNotNull(element32);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertNotNull(nodeList34);
        org.junit.Assert.assertNotNull(strSet35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
    }

    @Test
    public void test2820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2820");
        org.jsoup.nodes.DataNode dataNode2 = org.jsoup.nodes.DataNode.createFromEncoded("org.jsoup.select.selector$selectorparseexception:", "hi!");
        java.lang.String str3 = dataNode2.getWholeData();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = dataNode2.childNodes();
        java.lang.String str5 = dataNode2.nodeName();
        java.lang.String str6 = dataNode2.toString();
        org.junit.Assert.assertNotNull(dataNode2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "org.jsoup.select.selector$selectorparseexception:" + "'", str3, "org.jsoup.select.selector$selectorparseexception:");
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#data" + "'", str5, "#data");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "org.jsoup.select.selector$selectorparseexception:" + "'", str6, "org.jsoup.select.selector$selectorparseexception:");
    }

    @Test
    public void test2821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2821");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parse("hi!");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValue("hi!", "hi!");
        boolean boolean5 = document1.hasText();
        org.jsoup.select.Elements elements7 = document1.getElementsByIndexLessThan((int) (byte) 10);
        boolean boolean8 = elements7.isEmpty();
        java.lang.Object obj9 = null;
        boolean boolean10 = elements7.contains(obj9);
        boolean boolean11 = elements7.isEmpty();
        org.jsoup.nodes.Document document14 = new org.jsoup.nodes.Document("");
        boolean boolean15 = document14.hasText();
        boolean boolean16 = document14.hasText();
        org.jsoup.nodes.Document document18 = new org.jsoup.nodes.Document("");
        boolean boolean19 = document18.hasText();
        java.lang.String str20 = document18.nodeName();
        java.lang.String[] strArray22 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet23 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet23, strArray22);
        org.jsoup.nodes.Element element25 = document18.classNames((java.util.Set<java.lang.String>) strSet23);
        org.jsoup.nodes.Element element26 = document14.classNames((java.util.Set<java.lang.String>) strSet23);
        java.lang.String str27 = element26.text();
        org.jsoup.nodes.Element element29 = element26.prependElement("#comment");
        java.lang.String str30 = element29.id();
        org.jsoup.select.Elements elements32 = element29.getElementsByIndexLessThan((-1));
        // The following exception was thrown during execution in test generation
        try {
            elements7.add((int) (byte) 10, element29);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "#document" + "'", str20, "#document");
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(elements32);
    }

    @Test
    public void test2822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2822");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment(" class=\"hi!\"");
        org.jsoup.nodes.Element element3 = document1.prependText("#document#documentdocument");
        org.jsoup.nodes.Element element5 = document1.getElementById("[#, d, o, c, u, m, e, n, t]");
        org.jsoup.nodes.Element element7 = document1.getElementById("\n<!-- class=\"hi!\" #root=\"hi!\"-->");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNull(element5);
        org.junit.Assert.assertNull(element7);
    }

    @Test
    public void test2823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2823");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("org.jsoup.select.Selector$SelectorParseException: ");
        boolean boolean2 = tag1.isData();
        boolean boolean3 = tag1.requiresSpecificParent();
        boolean boolean4 = tag1.isBlock();
        org.jsoup.parser.Tag tag6 = org.jsoup.parser.Tag.valueOf("org.jsoup.select.Selector$SelectorParseException: ");
        boolean boolean7 = tag6.isData();
        boolean boolean8 = tag6.requiresSpecificParent();
        boolean boolean9 = tag6.isBlock();
        boolean boolean10 = tag1.canContain(tag6);
        org.jsoup.nodes.Document document13 = new org.jsoup.nodes.Document("");
        boolean boolean14 = document13.hasText();
        java.lang.String str15 = document13.nodeName();
        org.jsoup.nodes.Document document17 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element20 = document17.attr("hi!", "#root");
        org.jsoup.nodes.Attributes attributes21 = document17.attributes();
        boolean boolean22 = document13.equals((java.lang.Object) attributes21);
        org.jsoup.nodes.Element element23 = new org.jsoup.nodes.Element(tag1, "#document#document=\"#document#document\"", attributes21);
        java.util.List<org.jsoup.nodes.Node> nodeList24 = element23.childNodes();
        org.jsoup.nodes.Attributes attributes25 = element23.attributes();
        int int26 = attributes25.size();
        java.lang.String str27 = attributes25.toString();
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "#document" + "'", str15, "#document");
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(attributes21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(nodeList24);
        org.junit.Assert.assertNotNull(attributes25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + " hi!=\"#root\"" + "'", str27, " hi!=\"#root\"");
    }

    @Test
    public void test2824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2824");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Document document2 = document1.normalise();
        org.jsoup.nodes.Element element3 = document2.head();
        org.jsoup.nodes.Element element6 = document2.attr("org.jsoup.select.Selector$SelectorParseException: ", "[]");
        java.lang.String str7 = document2.outerHtml();
        org.jsoup.nodes.Element element8 = document2.body();
        java.lang.String str9 = document2.html();
        org.jsoup.nodes.Element element10 = document2.body();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>" + "'", str7, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>" + "'", str9, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.junit.Assert.assertNotNull(element10);
    }

    @Test
    public void test2825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2825");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment(" class=\"hi!\" #root=\"hi!\"", "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.lang.String str3 = comment2.toString();
        java.lang.String str4 = comment2.getData();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n<!-- class=\"hi!\" #root=\"hi!\"-->" + "'", str3, "\n<!-- class=\"hi!\" #root=\"hi!\"-->");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + " class=\"hi!\" #root=\"hi!\"" + "'", str4, " class=\"hi!\" #root=\"hi!\"");
    }

    @Test
    public void test2826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2826");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("\n<!-- class=\"hi!\" #root=\"hi!\"-->");
        org.junit.Assert.assertNotNull(document1);
    }

    @Test
    public void test2827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2827");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements5 = elements3.prepend("");
        org.jsoup.select.Elements elements7 = elements5.removeAttr("");
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements11 = document9.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements13 = elements11.prepend("");
        org.jsoup.select.Elements elements15 = elements13.removeAttr("");
        boolean boolean16 = elements5.containsAll((java.util.Collection<org.jsoup.nodes.Element>) elements13);
        java.lang.Object[] objArray17 = elements5.toArray();
        org.jsoup.nodes.Document document19 = new org.jsoup.nodes.Document("");
        boolean boolean20 = document19.hasText();
        java.lang.String str21 = document19.nodeName();
        java.lang.String str22 = document19.val();
        boolean boolean23 = elements5.add((org.jsoup.nodes.Element) document19);
        org.jsoup.nodes.Element element24 = document19.empty();
        org.jsoup.select.Elements elements26 = document19.getElementsByIndexGreaterThan((int) (byte) -1);
        org.jsoup.nodes.Document document28 = new org.jsoup.nodes.Document("");
        boolean boolean29 = document28.hasText();
        java.lang.String str30 = document28.nodeName();
        java.lang.String[] strArray32 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet33 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet33, strArray32);
        org.jsoup.nodes.Element element35 = document28.classNames((java.util.Set<java.lang.String>) strSet33);
        org.jsoup.nodes.Element element37 = document28.append("#document");
        org.jsoup.nodes.Element element39 = document28.prepend("#document");
        org.jsoup.nodes.Attributes attributes40 = element39.attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator41 = attributes40.spliterator();
        org.jsoup.nodes.Attributes attributes42 = new org.jsoup.nodes.Attributes();
        int int43 = attributes42.size();
        java.lang.String str44 = attributes42.html();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor45 = attributes42.iterator();
        boolean boolean46 = attributes40.equals((java.lang.Object) attributes42);
        java.lang.String str47 = attributes40.toString();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator48 = attributes40.spliterator();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor49 = attributes40.iterator();
        org.jsoup.parser.Tag tag51 = org.jsoup.parser.Tag.valueOf("org.jsoup.select.Selector$SelectorParseException: ");
        boolean boolean52 = tag51.isData();
        org.jsoup.nodes.Attributes attributes54 = new org.jsoup.nodes.Attributes();
        int int55 = attributes54.size();
        java.lang.String str56 = attributes54.html();
        org.jsoup.nodes.Element element57 = new org.jsoup.nodes.Element(tag51, "org.jsoup.select.selector$selectorparseexception:", attributes54);
        org.jsoup.nodes.Attribute attribute60 = org.jsoup.nodes.Attribute.createFromEncoded("hi!", "hi!");
        attribute60.setKey("#root");
        java.lang.String str63 = attribute60.html();
        attributes54.put(attribute60);
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor65 = attributes54.iterator();
        attributes40.addAll(attributes54);
        boolean boolean67 = elements26.equals((java.lang.Object) attributes40);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "#document" + "'", str21, "#document");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(elements26);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "#document" + "'", str30, "#document");
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertNotNull(element37);
        org.junit.Assert.assertNotNull(element39);
        org.junit.Assert.assertNotNull(attributes40);
        org.junit.Assert.assertNotNull(attributeSpliterator41);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertNotNull(attributeItor45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + " class=\"hi!\"" + "'", str47, " class=\"hi!\"");
        org.junit.Assert.assertNotNull(attributeSpliterator48);
        org.junit.Assert.assertNotNull(attributeItor49);
        org.junit.Assert.assertNotNull(tag51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertNotNull(attribute60);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "#root=\"hi!\"" + "'", str63, "#root=\"hi!\"");
        org.junit.Assert.assertNotNull(attributeItor65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
    }

    @Test
    public void test2828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2828");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("#root", "#root");
        java.lang.String str4 = comment2.attr("\n<!--#document-->");
        java.lang.String str5 = comment2.getData();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#root" + "'", str5, "#root");
    }

    @Test
    public void test2829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2829");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.hasText();
        java.lang.String str3 = document1.nodeName();
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        org.jsoup.nodes.Element element8 = document1.classNames((java.util.Set<java.lang.String>) strSet6);
        org.jsoup.nodes.Element element10 = document1.append("#document");
        org.jsoup.nodes.Element element12 = document1.prepend("#document");
        org.jsoup.nodes.Attributes attributes13 = element12.attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator14 = attributes13.spliterator();
        int int15 = attributes13.size();
        org.jsoup.nodes.Attribute attribute18 = new org.jsoup.nodes.Attribute("#document#document", "#document#document");
        java.lang.String str19 = attribute18.html();
        attributes13.put(attribute18);
        boolean boolean22 = attributes13.hasKey("[#, d, o, c, u, m, e, n, t]");
        org.jsoup.nodes.DataNode dataNode25 = org.jsoup.nodes.DataNode.createFromEncoded("org.jsoup.select.selector$selectorparseexception:", "hi!");
        java.lang.String str26 = dataNode25.getWholeData();
        java.util.List<org.jsoup.nodes.Node> nodeList27 = dataNode25.childNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList28 = dataNode25.childNodes();
        java.lang.String str29 = dataNode25.getWholeData();
        org.jsoup.nodes.Attributes attributes30 = dataNode25.attributes();
        attributes30.put("<!--#document-->", " hi!");
        int int34 = attributes30.size();
        attributes13.addAll(attributes30);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertNotNull(attributeSpliterator14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "#document#document=\"#document#document\"" + "'", str19, "#document#document=\"#document#document\"");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(dataNode25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "org.jsoup.select.selector$selectorparseexception:" + "'", str26, "org.jsoup.select.selector$selectorparseexception:");
        org.junit.Assert.assertNotNull(nodeList27);
        org.junit.Assert.assertNotNull(nodeList28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "org.jsoup.select.selector$selectorparseexception:" + "'", str29, "org.jsoup.select.selector$selectorparseexception:");
        org.junit.Assert.assertNotNull(attributes30);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2 + "'", int34 == 2);
    }

    @Test
    public void test2830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2830");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.hasText();
        boolean boolean3 = document1.hasText();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        boolean boolean6 = document5.hasText();
        java.lang.String str7 = document5.nodeName();
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet10 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet10, strArray9);
        org.jsoup.nodes.Element element12 = document5.classNames((java.util.Set<java.lang.String>) strSet10);
        org.jsoup.nodes.Element element13 = document1.classNames((java.util.Set<java.lang.String>) strSet10);
        java.util.Set<java.lang.String> strSet14 = document1.classNames();
        org.jsoup.nodes.Element element16 = document1.getElementById("#document#document");
        java.lang.String str17 = document1.id();
        java.lang.String str18 = document1.nodeName();
        org.jsoup.nodes.Element element20 = document1.html("<html> \n <head> \n </head> \n <body>\n   #root  \n </body>\n</html><<?#document#document>>\n</<?#document#document>>");
        org.jsoup.nodes.Document document23 = org.jsoup.parser.Parser.parse("#root", "");
        java.lang.String str24 = document23.outerHtml();
        org.jsoup.nodes.Element element26 = document23.append("<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        org.jsoup.select.Elements elements29 = document23.getElementsByAttributeValueStarting("#root=\"hi!\"", "org.jsoup.select.Selector$SelectorParseException: ");
        org.jsoup.nodes.Element element31 = document23.prepend("#root=\"hi!\"");
        org.jsoup.nodes.Element element33 = element31.html("#root=&quot;hi!&quot;");
        org.jsoup.nodes.Element element34 = element20.appendChild((org.jsoup.nodes.Node) element33);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#document" + "'", str7, "#document");
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNull(element16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "#document" + "'", str18, "#document");
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(document23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>" + "'", str24, "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertNotNull(elements29);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertNotNull(element34);
    }

    @Test
    public void test2831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2831");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragmentRelaxed(" ", "#root");
        org.jsoup.nodes.Document document5 = org.jsoup.parser.Parser.parse("#root", "");
        org.jsoup.nodes.Element element8 = document5.attr("#root", "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        java.lang.String str9 = element8.id();
        org.jsoup.select.Elements elements11 = element8.getElementsByIndexEquals((int) (short) 1);
        java.lang.String str12 = element8.toString();
        org.jsoup.nodes.Element element13 = document2.prependChild((org.jsoup.nodes.Node) element8);
        java.lang.String str14 = element13.baseUri();
        org.jsoup.select.Elements elements15 = element13.parents();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node17 = element13.childNode((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(document5);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>" + "'", str12, "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#root" + "'", str14, "#root");
        org.junit.Assert.assertNotNull(elements15);
    }

    @Test
    public void test2832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2832");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parse("hi!");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("org.jsoup.select.selector$selectorparseexception:");
        java.lang.String str4 = document1.nodeName();
        org.jsoup.nodes.Element element6 = document1.appendText("\n&lt;!--#root--&gt;");
        org.jsoup.nodes.Node node9 = document1.attr("hi!=\"#root=&quot;hi!&quot;\"", "#root=\"hi!\"");
        org.jsoup.nodes.Document document10 = document1.normalise();
        org.jsoup.nodes.Element element12 = document1.text("#document#documentdocument=\"&lt;?hi!&gt;\"");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements14 = element12.select("org.jsoup.select.selector$selectorparseexception: \n<!--#document-->=\"#document#document=&quot;#document#document&quot;\"");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query org.jsoup.select.selector$selectorparseexception: ?<!--#document-->=\"#document#document=&quot;#document#document&quot;\"");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#document" + "'", str4, "#document");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertNotNull(element12);
    }

    @Test
    public void test2833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2833");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("#root", "");
        java.lang.String str3 = document2.outerHtml();
        org.jsoup.nodes.Element element5 = document2.append("<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        org.jsoup.select.Elements elements8 = document2.getElementsByAttributeValueStarting("#root=\"hi!\"", "org.jsoup.select.Selector$SelectorParseException: ");
        org.jsoup.nodes.Element element10 = document2.prepend("#root=\"hi!\"");
        java.lang.String str11 = element10.id();
        org.jsoup.nodes.Element element13 = element10.addClass("org.jsoup.select.Selector$SelectorParseException: \n<!--#document-->");
        java.lang.String str14 = element10.val();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>" + "'", str3, "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test2834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2834");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragmentRelaxed("", "");
        org.jsoup.nodes.Element element3 = document2.body();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element3);
    }

    @Test
    public void test2835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2835");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("org.jsoup.select.Selector$SelectorParseException: ");
        boolean boolean2 = tag1.isData();
        boolean boolean3 = tag1.requiresSpecificParent();
        boolean boolean4 = tag1.isBlock();
        org.jsoup.parser.Tag tag6 = org.jsoup.parser.Tag.valueOf("org.jsoup.select.Selector$SelectorParseException: ");
        boolean boolean7 = tag6.isData();
        boolean boolean8 = tag6.requiresSpecificParent();
        boolean boolean9 = tag6.isBlock();
        boolean boolean10 = tag1.canContain(tag6);
        org.jsoup.nodes.Document document13 = new org.jsoup.nodes.Document("");
        boolean boolean14 = document13.hasText();
        java.lang.String str15 = document13.nodeName();
        org.jsoup.nodes.Document document17 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element20 = document17.attr("hi!", "#root");
        org.jsoup.nodes.Attributes attributes21 = document17.attributes();
        boolean boolean22 = document13.equals((java.lang.Object) attributes21);
        org.jsoup.nodes.Element element23 = new org.jsoup.nodes.Element(tag1, "#document#document=\"#document#document\"", attributes21);
        java.util.List<org.jsoup.nodes.Node> nodeList24 = element23.childNodes();
        org.jsoup.nodes.Attributes attributes25 = element23.attributes();
        int int26 = attributes25.size();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator27 = attributes25.spliterator();
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "#document" + "'", str15, "#document");
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(attributes21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(nodeList24);
        org.junit.Assert.assertNotNull(attributes25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(attributeSpliterator27);
    }

    @Test
    public void test2836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2836");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        java.lang.String str4 = elements3.outerHtml();
        java.lang.String str5 = elements3.val();
        org.jsoup.select.Elements elements6 = new org.jsoup.select.Elements((java.util.List<org.jsoup.nodes.Element>) elements3);
        java.lang.String str8 = elements3.attr("org.jsoup.select.Selector$SelectorParseException: ");
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor9 = elements3.listIterator();
        org.jsoup.select.Elements elements11 = elements3.select("<!--#document-->");
        org.jsoup.nodes.Document document13 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements15 = document13.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements17 = elements15.prepend("");
        org.jsoup.select.Elements elements19 = elements17.removeAttr("");
        org.jsoup.nodes.Document document21 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements23 = document21.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements25 = elements23.prepend("");
        org.jsoup.select.Elements elements27 = elements25.removeAttr("");
        boolean boolean28 = elements17.containsAll((java.util.Collection<org.jsoup.nodes.Element>) elements25);
        org.jsoup.nodes.Document document30 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements32 = document30.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements34 = elements32.prepend("");
        org.jsoup.select.Elements elements36 = elements34.removeAttr("");
        org.jsoup.nodes.Document document38 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements40 = document38.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements42 = elements40.prepend("");
        org.jsoup.select.Elements elements44 = elements42.removeAttr("");
        boolean boolean45 = elements34.containsAll((java.util.Collection<org.jsoup.nodes.Element>) elements42);
        org.jsoup.select.Elements elements47 = elements42.wrap("#root");
        boolean boolean48 = elements25.containsAll((java.util.Collection<org.jsoup.nodes.Element>) elements47);
        org.jsoup.select.Elements elements50 = elements25.removeClass("");
        org.jsoup.select.Elements elements53 = elements50.attr("#data", " class=\"hi!\"");
        org.jsoup.select.Elements elements56 = elements53.attr("<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "[#, d, o, c, u, m, e, n, t]");
        boolean boolean57 = elements3.containsAll((java.util.Collection<org.jsoup.nodes.Element>) elements56);
        org.jsoup.select.Elements elements59 = elements3.val("<html>\n<head>\n</head>\n<body>\n org.jsoup.select.selector$selectorparseexception:\n</body>\n</html>");
        org.jsoup.nodes.Document document61 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements63 = document61.getElementsByAttribute("hi!");
        java.lang.String str64 = elements63.val();
        java.lang.Object obj65 = null;
        int int66 = elements63.lastIndexOf(obj65);
        org.jsoup.nodes.Document document68 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements70 = document68.getElementsByAttribute("hi!");
        java.lang.String str71 = elements70.val();
        java.lang.Object obj72 = null;
        int int73 = elements70.lastIndexOf(obj72);
        org.jsoup.select.Elements elements75 = elements70.eq((int) '#');
        boolean boolean76 = elements63.retainAll((java.util.Collection<org.jsoup.nodes.Element>) elements70);
        org.jsoup.select.Elements elements78 = elements70.eq((int) (byte) 100);
        org.jsoup.nodes.Element element79 = elements78.last();
        boolean boolean80 = elements3.equals((java.lang.Object) elements78);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(elementItor9);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertNotNull(elements23);
        org.junit.Assert.assertNotNull(elements25);
        org.junit.Assert.assertNotNull(elements27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(elements32);
        org.junit.Assert.assertNotNull(elements34);
        org.junit.Assert.assertNotNull(elements36);
        org.junit.Assert.assertNotNull(elements40);
        org.junit.Assert.assertNotNull(elements42);
        org.junit.Assert.assertNotNull(elements44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(elements47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(elements50);
        org.junit.Assert.assertNotNull(elements53);
        org.junit.Assert.assertNotNull(elements56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(elements59);
        org.junit.Assert.assertNotNull(elements63);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + (-1) + "'", int66 == (-1));
        org.junit.Assert.assertNotNull(elements70);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + (-1) + "'", int73 == (-1));
        org.junit.Assert.assertNotNull(elements75);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(elements78);
        org.junit.Assert.assertNull(element79);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
    }

    @Test
    public void test2837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2837");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element4 = document1.attr("hi!", "#root");
        org.jsoup.nodes.Attributes attributes5 = document1.attributes();
        org.jsoup.select.Elements elements6 = document1.children();
        java.util.Set<java.lang.String> strSet7 = document1.classNames();
        org.jsoup.select.Elements elements9 = document1.getElementsByTag("hi!=\"#root=&quot;hi!&quot;\"");
        org.jsoup.nodes.Element element11 = document1.addClass("\n<!--#root-->");
        org.jsoup.nodes.Document document13 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements15 = document13.getElementsByAttribute("hi!");
        java.lang.String str16 = elements15.outerHtml();
        org.jsoup.nodes.Document document20 = org.jsoup.parser.Parser.parse("#root", "");
        org.jsoup.nodes.Element element23 = document20.attr("#root", "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        java.lang.String str24 = document20.tagName();
        org.jsoup.nodes.Element element25 = document20.empty();
        java.lang.String str27 = document20.absUrl("#data");
        org.jsoup.select.Elements elements29 = document20.getElementsByClass("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.jsoup.nodes.Element element30 = elements29.last();
        boolean boolean31 = elements15.addAll(0, (java.util.Collection<org.jsoup.nodes.Element>) elements29);
        java.lang.String str33 = elements29.attr("ocument");
        boolean boolean34 = document1.equals((java.lang.Object) "ocument");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(document20);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "#root" + "'", str24, "#root");
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(elements29);
        org.junit.Assert.assertNull(element30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test2838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2838");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        java.lang.String str5 = elements3.attr("#root");
        org.jsoup.nodes.Document document7 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element[] elementArray8 = new org.jsoup.nodes.Element[] { document7 };
        java.util.ArrayList<org.jsoup.nodes.Element> elementList9 = new java.util.ArrayList<org.jsoup.nodes.Element>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<org.jsoup.nodes.Element>) elementList9, elementArray8);
        java.util.Spliterator<org.jsoup.nodes.Element> elementSpliterator11 = elementList9.spliterator();
        java.util.Spliterator<org.jsoup.nodes.Element> elementSpliterator12 = elementList9.spliterator();
        boolean boolean13 = elements3.containsAll((java.util.Collection<org.jsoup.nodes.Element>) elementList9);
        org.jsoup.select.Elements elements16 = elements3.attr("hi!", "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Document document18 = new org.jsoup.nodes.Document("");
        boolean boolean19 = document18.hasText();
        java.lang.String str20 = document18.nodeName();
        java.lang.String[] strArray22 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet23 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet23, strArray22);
        org.jsoup.nodes.Element element25 = document18.classNames((java.util.Set<java.lang.String>) strSet23);
        org.jsoup.nodes.Element element27 = document18.append("");
        org.jsoup.nodes.Element element29 = element27.addClass("#document#document");
        org.jsoup.select.Elements elements32 = element27.getElementsByAttributeValueStarting("body", "org.jsoup.select.Selector$SelectorParseException: ");
        boolean boolean33 = elements16.add(element27);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(elementArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(elementSpliterator11);
        org.junit.Assert.assertNotNull(elementSpliterator12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "#document" + "'", str20, "#document");
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertNotNull(elements32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
    }

    @Test
    public void test2839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2839");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("#root", "hi!");
        org.jsoup.nodes.Document document4 = new org.jsoup.nodes.Document("");
        boolean boolean5 = document4.hasText();
        java.lang.String str6 = document4.nodeName();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet9 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet9, strArray8);
        org.jsoup.nodes.Element element11 = document4.classNames((java.util.Set<java.lang.String>) strSet9);
        org.jsoup.nodes.Element element13 = document4.append("#document");
        org.jsoup.nodes.Element element15 = document4.prepend("#document");
        org.jsoup.nodes.Attributes attributes16 = element15.attributes();
        org.jsoup.nodes.Element element18 = element15.append("hi!");
        org.jsoup.nodes.Document document20 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements22 = document20.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element24 = document20.prepend("#document");
        org.jsoup.nodes.Element element25 = element24.empty();
        org.jsoup.select.Elements elements27 = element24.getElementsByTag("org.jsoup.select.Selector$SelectorParseException: ");
        org.jsoup.select.Elements elements29 = elements27.removeClass("#root");
        org.jsoup.nodes.Document document31 = new org.jsoup.nodes.Document("");
        boolean boolean32 = document31.hasText();
        java.lang.String str33 = document31.nodeName();
        java.lang.String[] strArray35 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet36 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet36, strArray35);
        org.jsoup.nodes.Element element38 = document31.classNames((java.util.Set<java.lang.String>) strSet36);
        org.jsoup.nodes.Element element40 = document31.append("#document");
        org.jsoup.nodes.Element element42 = document31.prepend("#document");
        org.jsoup.nodes.Attributes attributes43 = element42.attributes();
        org.jsoup.nodes.Element element45 = element42.append("hi!");
        org.jsoup.select.Elements elements47 = element45.getElementsByIndexLessThan((int) (short) 0);
        boolean boolean48 = elements27.equals((java.lang.Object) elements47);
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor50 = elements47.listIterator(0);
        boolean boolean51 = element18.equals((java.lang.Object) elements47);
        boolean boolean52 = attribute2.equals((java.lang.Object) element18);
        java.lang.String str53 = attribute2.getKey();
        java.lang.Object obj54 = null;
        boolean boolean55 = attribute2.equals(obj54);
        attribute2.setKey("#document#document#root=&quot;#root=&amp;quot;hi!&amp;quot;&quot;");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#document" + "'", str6, "#document");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(attributes16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(elements22);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(elements27);
        org.junit.Assert.assertNotNull(elements29);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "#document" + "'", str33, "#document");
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(element38);
        org.junit.Assert.assertNotNull(element40);
        org.junit.Assert.assertNotNull(element42);
        org.junit.Assert.assertNotNull(attributes43);
        org.junit.Assert.assertNotNull(element45);
        org.junit.Assert.assertNotNull(elements47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(elementItor50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "#root" + "'", str53, "#root");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
    }

    @Test
    public void test2840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2840");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element5 = document1.prepend("#document");
        org.jsoup.nodes.Element element6 = element5.empty();
        org.jsoup.select.Elements elements8 = element5.getElementsByTag("org.jsoup.select.Selector$SelectorParseException: ");
        org.jsoup.select.Elements elements10 = elements8.removeClass("#root");
        org.jsoup.select.Elements elements12 = elements8.append("");
        org.jsoup.nodes.Document document15 = org.jsoup.parser.Parser.parse("#root", "");
        java.lang.String str16 = document15.outerHtml();
        org.jsoup.nodes.Element element18 = document15.createElement("#document#documenthi!");
        boolean boolean19 = elements12.remove((java.lang.Object) document15);
        org.jsoup.nodes.Element element21 = document15.prependElement("hi!=\"#root=&quot;hi!&quot;\"");
        java.lang.String str22 = document15.val();
        java.lang.String str23 = document15.outerHtml();
        java.lang.String str24 = document15.nodeName();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(document15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>" + "'", str16, "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "<hi!=\"#root=&quot;hi!&quot;\">\n</hi!=\"#root=&quot;hi!&quot;\">\n<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>" + "'", str23, "<hi!=\"#root=&quot;hi!&quot;\">\n</hi!=\"#root=&quot;hi!&quot;\">\n<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "#document" + "'", str24, "#document");
    }

    @Test
    public void test2841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2841");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "\n<!--#root-->");
        java.lang.String str3 = textNode2.toString();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test2842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2842");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("#root", "");
        java.lang.String str3 = document2.outerHtml();
        org.jsoup.nodes.Element element5 = document2.append("<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        org.jsoup.select.Elements elements7 = document2.getElementsByIndexEquals(1);
        java.lang.String str8 = document2.nodeName();
        org.jsoup.nodes.Document document10 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element13 = document10.attr("hi!", "#root");
        org.jsoup.nodes.Attributes attributes14 = document10.attributes();
        org.jsoup.select.Elements elements15 = document10.children();
        java.util.Set<java.lang.String> strSet16 = document10.classNames();
        org.jsoup.nodes.Element element17 = document2.classNames(strSet16);
        java.lang.String str18 = document2.tagName();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>" + "'", str3, "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#document" + "'", str8, "#document");
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(attributes14);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "#root" + "'", str18, "#root");
    }

    @Test
    public void test2843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2843");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("#document");
        boolean boolean3 = tokenQueue1.matches("\n<!--#root-->");
        boolean boolean5 = tokenQueue1.matchChomp("#data");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!=\"#root=&quot;hi!&quot;\"" };
        java.lang.String str8 = tokenQueue1.consumeToAny(strArray7);
        boolean boolean9 = tokenQueue1.consumeWhitespace();
        boolean boolean11 = tokenQueue1.matchChomp("hi!");
        java.lang.Character char12 = tokenQueue1.peek();
        org.jsoup.parser.TokenQueue tokenQueue14 = new org.jsoup.parser.TokenQueue("#document");
        boolean boolean16 = tokenQueue14.matches("\n<!--#root-->");
        boolean boolean18 = tokenQueue14.matchChomp("#data");
        java.lang.String[] strArray20 = new java.lang.String[] { "hi!=\"#root=&quot;hi!&quot;\"" };
        java.lang.String str21 = tokenQueue14.consumeToAny(strArray20);
        java.lang.String str22 = tokenQueue1.consumeToAny(strArray20);
        boolean boolean23 = tokenQueue1.matchesWhitespace();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#document" + "'", str8, "#document");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(char12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "#document" + "'", str21, "#document");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test2844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2844");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        boolean boolean5 = document1.hasClass("");
        java.lang.String str6 = document1.nodeName();
        java.lang.String str7 = document1.toString();
        org.jsoup.nodes.Document document8 = document1.normalise();
        java.lang.String str9 = document8.val();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#document" + "'", str6, "#document");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test2845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2845");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element5 = document1.prepend("#document");
        org.jsoup.nodes.Element element6 = element5.empty();
        org.jsoup.select.Elements elements8 = element5.getElementsByTag("org.jsoup.select.Selector$SelectorParseException: ");
        org.jsoup.select.Elements elements10 = elements8.removeClass("#root");
        java.util.stream.Stream<org.jsoup.nodes.Element> elementStream11 = elements10.stream();
        boolean boolean12 = elements10.isEmpty();
        org.jsoup.nodes.Element[] elementArray14 = new org.jsoup.nodes.Element[] {};
        org.jsoup.select.Elements elements15 = new org.jsoup.select.Elements(elementArray14);
        org.jsoup.select.Elements elements16 = new org.jsoup.select.Elements(elementArray14);
        org.jsoup.select.Elements elements18 = elements16.select("<[#, d, o, c, u, m, e, n, t]>\n</[#, d, o, c, u, m, e, n, t]>#root=&quot;hi!&quot;");
        java.lang.String str19 = elements18.val();
        org.jsoup.select.Elements elements20 = new org.jsoup.select.Elements((java.util.List<org.jsoup.nodes.Element>) elements18);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = elements10.addAll((int) '4', (java.util.Collection<org.jsoup.nodes.Element>) elements20);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 52, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(elementStream11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(elementArray14);
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test2846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2846");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element4 = document1.attr("hi!", "#root");
        org.jsoup.nodes.Attributes attributes5 = document1.attributes();
        boolean boolean6 = document1.isBlock();
        org.jsoup.nodes.Element element8 = document1.prepend("");
        org.jsoup.select.Elements elements10 = document1.getElementsByIndexEquals((int) (byte) 100);
        org.jsoup.nodes.Element element12 = document1.createElement("<?hi!>");
        org.jsoup.nodes.Element element14 = document1.append("");
        org.jsoup.nodes.Attributes attributes15 = element14.attributes();
        org.jsoup.parser.Tag tag17 = org.jsoup.parser.Tag.valueOf("org.jsoup.select.Selector$SelectorParseException: ");
        boolean boolean18 = tag17.isData();
        boolean boolean19 = tag17.requiresSpecificParent();
        boolean boolean20 = tag17.isBlock();
        org.jsoup.parser.Tag tag22 = org.jsoup.parser.Tag.valueOf("org.jsoup.select.Selector$SelectorParseException: ");
        boolean boolean23 = tag22.isData();
        boolean boolean24 = tag22.requiresSpecificParent();
        boolean boolean25 = tag22.isBlock();
        boolean boolean26 = tag17.canContain(tag22);
        org.jsoup.nodes.Document document29 = new org.jsoup.nodes.Document("");
        boolean boolean30 = document29.hasText();
        java.lang.String str31 = document29.nodeName();
        org.jsoup.nodes.Document document33 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element36 = document33.attr("hi!", "#root");
        org.jsoup.nodes.Attributes attributes37 = document33.attributes();
        boolean boolean38 = document29.equals((java.lang.Object) attributes37);
        org.jsoup.nodes.Element element39 = new org.jsoup.nodes.Element(tag17, "#document#document=\"#document#document\"", attributes37);
        org.jsoup.nodes.Document document41 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements43 = document41.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements45 = elements43.prepend("");
        org.jsoup.select.Elements elements47 = elements45.removeAttr("");
        org.jsoup.nodes.Document document49 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements51 = document49.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements53 = elements51.prepend("");
        org.jsoup.select.Elements elements55 = elements53.removeAttr("");
        boolean boolean56 = elements45.containsAll((java.util.Collection<org.jsoup.nodes.Element>) elements53);
        org.jsoup.select.Elements elements58 = elements53.wrap("#root");
        org.jsoup.select.Elements elements59 = new org.jsoup.select.Elements((java.util.Collection<org.jsoup.nodes.Element>) elements58);
        org.jsoup.nodes.Document document61 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements63 = document61.getElementsByAttribute("hi!");
        java.lang.String str65 = elements63.attr("#root");
        java.lang.String str66 = elements63.text();
        org.jsoup.select.Elements elements68 = elements63.eq((int) (short) 10);
        boolean boolean69 = elements59.containsAll((java.util.Collection<org.jsoup.nodes.Element>) elements63);
        org.jsoup.select.Elements elements71 = elements59.html("#root");
        org.jsoup.nodes.Document document73 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements75 = document73.getElementsByAttribute("hi!");
        java.lang.String str76 = elements75.val();
        java.lang.Object obj77 = null;
        int int78 = elements75.lastIndexOf(obj77);
        org.jsoup.select.Elements elements80 = elements75.eq((int) '#');
        boolean boolean82 = elements75.hasAttr("#root");
        int int84 = elements75.indexOf((java.lang.Object) (byte) 100);
        org.jsoup.select.Elements elements86 = elements75.addClass("");
        boolean boolean87 = elements71.removeAll((java.util.Collection<org.jsoup.nodes.Element>) elements75);
        boolean boolean88 = attributes37.equals((java.lang.Object) elements71);
        attributes37.put("\n<!--#data-->", " hi!");
        attributes15.addAll(attributes37);
        int int93 = attributes15.size();
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(attributes15);
        org.junit.Assert.assertNotNull(tag17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(tag22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "#document" + "'", str31, "#document");
        org.junit.Assert.assertNotNull(element36);
        org.junit.Assert.assertNotNull(attributes37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(elements43);
        org.junit.Assert.assertNotNull(elements45);
        org.junit.Assert.assertNotNull(elements47);
        org.junit.Assert.assertNotNull(elements51);
        org.junit.Assert.assertNotNull(elements53);
        org.junit.Assert.assertNotNull(elements55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(elements58);
        org.junit.Assert.assertNotNull(elements63);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
        org.junit.Assert.assertNotNull(elements68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertNotNull(elements71);
        org.junit.Assert.assertNotNull(elements75);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "" + "'", str76, "");
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + (-1) + "'", int78 == (-1));
        org.junit.Assert.assertNotNull(elements80);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + (-1) + "'", int84 == (-1));
        org.junit.Assert.assertNotNull(elements86);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + int93 + "' != '" + 2 + "'", int93 == 2);
    }

    @Test
    public void test2847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2847");
        org.jsoup.select.Selector.SelectorParseException selectorParseException1 = new org.jsoup.select.Selector.SelectorParseException(" #comment=\"\"");
        java.lang.String str2 = selectorParseException1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.jsoup.select.Selector$SelectorParseException:  #comment=\"\"" + "'", str2, "org.jsoup.select.Selector$SelectorParseException:  #comment=\"\"");
    }

    @Test
    public void test2848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2848");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragmentRelaxed("\n<!--#declaration-->", " class=\"hi!\"");
        org.junit.Assert.assertNotNull(document2);
    }

    @Test
    public void test2849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2849");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element4 = document1.attr("hi!", "#root");
        org.jsoup.nodes.Attributes attributes5 = document1.attributes();
        boolean boolean6 = document1.isBlock();
        org.jsoup.nodes.Element element8 = document1.prepend("");
        org.jsoup.select.Elements elements10 = document1.getElementsByIndexEquals((int) (byte) 100);
        org.jsoup.nodes.Element element12 = document1.createElement("<?hi!>");
        org.jsoup.nodes.Element element14 = document1.append("");
        java.lang.String str15 = document1.outerHtml();
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test2850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2850");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("#document");
        java.lang.String str2 = tokenQueue1.consumeAttributeKey();
        java.lang.String str4 = tokenQueue1.consumeTo("#root=\"hi!\"");
        java.lang.String str5 = tokenQueue1.toString();
        java.lang.String str7 = tokenQueue1.chompTo("");
        boolean boolean8 = tokenQueue1.matchesWord();
        boolean boolean10 = tokenQueue1.matchChomp("<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        boolean boolean11 = tokenQueue1.matchesWord();
        java.lang.String str12 = tokenQueue1.remainder();
        org.jsoup.parser.TokenQueue tokenQueue14 = new org.jsoup.parser.TokenQueue("");
        boolean boolean16 = tokenQueue14.matchChomp("org.jsoup.select.selector$selectorparseexception:");
        java.lang.String str17 = tokenQueue14.consumeCssIdentifier();
        org.jsoup.parser.TokenQueue tokenQueue19 = new org.jsoup.parser.TokenQueue("");
        boolean boolean21 = tokenQueue19.matchChomp("org.jsoup.select.selector$selectorparseexception:");
        java.lang.String str22 = tokenQueue19.consumeWord();
        org.jsoup.parser.TokenQueue tokenQueue24 = new org.jsoup.parser.TokenQueue("");
        boolean boolean25 = tokenQueue24.isEmpty();
        java.lang.String[] strArray29 = new java.lang.String[] { " class=\"hi!\"", "#data", "[]" };
        java.lang.String str30 = tokenQueue24.consumeToAny(strArray29);
        java.lang.String str31 = tokenQueue19.consumeToAny(strArray29);
        boolean boolean32 = tokenQueue14.matchesAny(strArray29);
        java.lang.String str33 = tokenQueue1.consumeToAny(strArray29);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#document" + "'", str4, "#document");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
    }

    @Test
    public void test2851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2851");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        java.lang.String str4 = elements3.val();
        java.lang.Object obj5 = null;
        int int6 = elements3.lastIndexOf(obj5);
        org.jsoup.select.Elements elements8 = elements3.eq((int) '#');
        boolean boolean10 = elements3.hasAttr("#root");
        int int12 = elements3.indexOf((java.lang.Object) (byte) 100);
        java.lang.String str14 = elements3.attr("org.jsoup.select.Selector$SelectorParseException: ");
        java.lang.Object[] objArray15 = elements3.toArray();
        java.lang.String str16 = elements3.val();
        java.lang.String str17 = elements3.val();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[]");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test2852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2852");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("#root", "");
        org.jsoup.nodes.Element element5 = document2.attr("#root", "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        java.lang.String str6 = document2.tagName();
        org.jsoup.nodes.Element element7 = document2.empty();
        java.lang.String str9 = document2.absUrl("#data");
        org.jsoup.select.Elements elements11 = document2.getElementsByClass("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.jsoup.nodes.Element element14 = document2.attr("<!--#document-->=\"#document#document\"", "");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#root" + "'", str6, "#root");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(element14);
    }

    @Test
    public void test2853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2853");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragmentRelaxed("#document#document", " ");
        org.jsoup.nodes.Element element3 = document2.parent();
        org.jsoup.nodes.Document document7 = org.jsoup.parser.Parser.parse("#root", "\n<!--#root-->");
        org.jsoup.select.Elements elements8 = org.jsoup.select.Selector.select("#declaration", (org.jsoup.nodes.Element) document7);
        org.jsoup.nodes.Element element9 = document7.body();
        org.jsoup.nodes.Element element10 = element9.firstElementSibling();
        boolean boolean11 = document2.equals((java.lang.Object) element9);
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2854");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element5 = document1.prepend("#document");
        org.jsoup.nodes.Element element6 = element5.empty();
        org.jsoup.nodes.Document document8 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements10 = document8.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements12 = elements10.prepend("");
        org.jsoup.select.Elements elements14 = elements12.removeAttr("");
        org.jsoup.nodes.Document document16 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements18 = document16.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements20 = elements18.prepend("");
        org.jsoup.select.Elements elements22 = elements20.removeAttr("");
        boolean boolean23 = elements12.containsAll((java.util.Collection<org.jsoup.nodes.Element>) elements20);
        org.jsoup.nodes.Document document25 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements27 = document25.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements29 = elements27.prepend("");
        org.jsoup.select.Elements elements31 = elements29.removeAttr("");
        org.jsoup.nodes.Document document33 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements35 = document33.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements37 = elements35.prepend("");
        org.jsoup.select.Elements elements39 = elements37.removeAttr("");
        boolean boolean40 = elements29.containsAll((java.util.Collection<org.jsoup.nodes.Element>) elements37);
        org.jsoup.select.Elements elements42 = elements37.wrap("#root");
        boolean boolean43 = elements20.containsAll((java.util.Collection<org.jsoup.nodes.Element>) elements42);
        org.jsoup.select.Elements elements44 = new org.jsoup.select.Elements((java.util.Collection<org.jsoup.nodes.Element>) elements20);
        org.jsoup.nodes.Element element45 = elements20.first();
        org.jsoup.nodes.Document document48 = org.jsoup.parser.Parser.parseBodyFragment("\n<!--#root-->", "#root");
        org.jsoup.nodes.Element element50 = document48.removeClass("#root=\"hi!\"");
        boolean boolean51 = elements20.add(element50);
        org.jsoup.nodes.Element element52 = element6.appendChild((org.jsoup.nodes.Node) element50);
        org.jsoup.nodes.Document document54 = new org.jsoup.nodes.Document("");
        boolean boolean55 = document54.hasText();
        java.lang.String str56 = document54.nodeName();
        org.jsoup.select.Elements elements57 = document54.children();
        org.jsoup.select.Elements elements59 = document54.getElementsByTag("#document#documenthi!");
        org.jsoup.select.Elements elements61 = elements59.removeClass("#document#documentdocument");
        org.jsoup.select.Elements elements63 = elements59.html("#text");
        org.jsoup.select.Elements elements65 = elements59.prepend("<?>");
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor66 = elements65.listIterator();
        boolean boolean67 = element52.equals((java.lang.Object) elements65);
        org.jsoup.nodes.Element element69 = element52.wrap("\n&lt;!--#data--&gt;");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertNotNull(elements20);
        org.junit.Assert.assertNotNull(elements22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(elements27);
        org.junit.Assert.assertNotNull(elements29);
        org.junit.Assert.assertNotNull(elements31);
        org.junit.Assert.assertNotNull(elements35);
        org.junit.Assert.assertNotNull(elements37);
        org.junit.Assert.assertNotNull(elements39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(elements42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNull(element45);
        org.junit.Assert.assertNotNull(document48);
        org.junit.Assert.assertNotNull(element50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(element52);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "#document" + "'", str56, "#document");
        org.junit.Assert.assertNotNull(elements57);
        org.junit.Assert.assertNotNull(elements59);
        org.junit.Assert.assertNotNull(elements61);
        org.junit.Assert.assertNotNull(elements63);
        org.junit.Assert.assertNotNull(elements65);
        org.junit.Assert.assertNotNull(elementItor66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNull(element69);
    }

    @Test
    public void test2855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2855");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("\n<!--org.jsoup.select.selector$selectorparseexception: org.jsoup.select.selector$selectorparseexception:=\"#root\"-->");
        java.lang.String str2 = document1.val();
        org.jsoup.nodes.Node node3 = document1.parent();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(node3);
    }

    @Test
    public void test2856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2856");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements5 = elements3.prepend("");
        org.jsoup.select.Elements elements7 = elements5.removeAttr("");
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements11 = document9.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements13 = elements11.prepend("");
        org.jsoup.select.Elements elements15 = elements13.removeAttr("");
        boolean boolean16 = elements5.containsAll((java.util.Collection<org.jsoup.nodes.Element>) elements13);
        org.jsoup.nodes.Document document18 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements20 = document18.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements22 = elements20.prepend("");
        org.jsoup.select.Elements elements24 = elements22.removeAttr("");
        org.jsoup.nodes.Document document26 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements28 = document26.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements30 = elements28.prepend("");
        org.jsoup.select.Elements elements32 = elements30.removeAttr("");
        boolean boolean33 = elements22.containsAll((java.util.Collection<org.jsoup.nodes.Element>) elements30);
        org.jsoup.select.Elements elements35 = elements30.wrap("#root");
        boolean boolean36 = elements13.containsAll((java.util.Collection<org.jsoup.nodes.Element>) elements35);
        org.jsoup.select.Elements elements37 = new org.jsoup.select.Elements((java.util.Collection<org.jsoup.nodes.Element>) elements13);
        org.jsoup.nodes.Element element38 = elements13.first();
        org.jsoup.nodes.Document document41 = org.jsoup.parser.Parser.parseBodyFragment("\n<!--#root-->", "#root");
        org.jsoup.nodes.Element element43 = document41.removeClass("#root=\"hi!\"");
        boolean boolean44 = elements13.add(element43);
        org.jsoup.select.Elements elements47 = elements13.attr("<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>", " ");
        org.jsoup.nodes.Document document50 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element53 = document50.attr("hi!", "#root");
        org.jsoup.nodes.Attributes attributes54 = document50.attributes();
        org.jsoup.select.Elements elements57 = document50.getElementsByAttributeValueNot("org.jsoup.select.selector$selectorparseexception:", "hi!");
        java.lang.String str59 = elements57.attr("#document#document=\"#document#document\"");
        java.util.stream.Stream<org.jsoup.nodes.Element> elementStream60 = elements57.parallelStream();
        boolean boolean61 = elements57.isEmpty();
        boolean boolean62 = elements47.addAll(0, (java.util.Collection<org.jsoup.nodes.Element>) elements57);
        boolean boolean64 = elements47.hasClass("");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(elements20);
        org.junit.Assert.assertNotNull(elements22);
        org.junit.Assert.assertNotNull(elements24);
        org.junit.Assert.assertNotNull(elements28);
        org.junit.Assert.assertNotNull(elements30);
        org.junit.Assert.assertNotNull(elements32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(elements35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNull(element38);
        org.junit.Assert.assertNotNull(document41);
        org.junit.Assert.assertNotNull(element43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(elements47);
        org.junit.Assert.assertNotNull(element53);
        org.junit.Assert.assertNotNull(attributes54);
        org.junit.Assert.assertNotNull(elements57);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertNotNull(elementStream60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
    }

    @Test
    public void test2857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2857");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("", "org.jsoup.select.selector$selectorparseexception:");
        java.lang.String str3 = document2.nodeName();
        document2.title("\n<!--a-->");
        org.jsoup.nodes.Element element6 = document2.empty();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(element6);
    }

    @Test
    public void test2858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2858");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.hasText();
        java.lang.String str3 = document1.nodeName();
        java.lang.String str4 = document1.val();
        java.lang.String str5 = document1.outerHtml();
        java.lang.String[] strArray8 = new java.lang.String[] { "\n<!--#document-->", "#data" };
        java.util.LinkedHashSet<java.lang.String> strSet9 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet9, strArray8);
        org.jsoup.nodes.Element element11 = document1.classNames((java.util.Set<java.lang.String>) strSet9);
        org.jsoup.nodes.Document document12 = document1.normalise();
        org.jsoup.select.Elements elements15 = document12.getElementsByAttributeValueStarting("#declaration", "#document#document=\"#document#document\"");
        org.jsoup.select.Elements elements17 = document12.getElementsByIndexGreaterThan((int) (short) 0);
        java.util.function.UnaryOperator<org.jsoup.nodes.Element> elementUnaryOperator18 = null;
        // The following exception was thrown during execution in test generation
        try {
            elements17.replaceAll(elementUnaryOperator18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(elements17);
    }

    @Test
    public void test2859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2859");
        org.jsoup.nodes.Document document2 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document2.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements6 = elements4.prepend("");
        org.jsoup.select.Elements elements8 = elements6.removeAttr("");
        org.jsoup.nodes.Document document10 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements12 = document10.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements14 = elements12.prepend("");
        org.jsoup.select.Elements elements16 = elements14.removeAttr("");
        boolean boolean17 = elements6.containsAll((java.util.Collection<org.jsoup.nodes.Element>) elements14);
        java.lang.Object[] objArray18 = elements6.toArray();
        org.jsoup.select.Elements elements20 = elements6.select("#document#document");
        org.jsoup.nodes.Element element21 = elements20.first();
        org.jsoup.nodes.Document document23 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements25 = document23.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements27 = elements25.prepend("");
        org.jsoup.select.Elements elements29 = elements27.removeAttr("");
        org.jsoup.nodes.Document document31 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements33 = document31.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements35 = elements33.prepend("");
        org.jsoup.select.Elements elements37 = elements35.removeAttr("");
        boolean boolean38 = elements27.containsAll((java.util.Collection<org.jsoup.nodes.Element>) elements35);
        org.jsoup.nodes.Document document40 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements42 = document40.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements44 = elements42.prepend("");
        org.jsoup.select.Elements elements46 = elements44.removeAttr("");
        org.jsoup.nodes.Document document48 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements50 = document48.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements52 = elements50.prepend("");
        org.jsoup.select.Elements elements54 = elements52.removeAttr("");
        boolean boolean55 = elements44.containsAll((java.util.Collection<org.jsoup.nodes.Element>) elements52);
        org.jsoup.select.Elements elements57 = elements52.wrap("#root");
        boolean boolean58 = elements35.containsAll((java.util.Collection<org.jsoup.nodes.Element>) elements57);
        org.jsoup.select.Elements elements60 = elements35.val("#root=\"hi!\"");
        boolean boolean61 = elements20.addAll((java.util.Collection<org.jsoup.nodes.Element>) elements35);
        boolean boolean63 = elements35.is("<[#, d, o, c, u, m, e, n, t]>\n</[#, d, o, c, u, m, e, n, t]>#root=&quot;hi!&quot;");
        boolean boolean65 = elements35.hasClass("hi!=\"#root=&quot;hi!&quot;\"");
        org.jsoup.nodes.Document document67 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements69 = document67.getElementsByAttribute("hi!");
        java.lang.String str70 = elements69.val();
        java.lang.Object obj71 = null;
        int int72 = elements69.lastIndexOf(obj71);
        org.jsoup.select.Elements elements74 = elements69.eq((int) '#');
        boolean boolean75 = elements35.containsAll((java.util.Collection<org.jsoup.nodes.Element>) elements69);
        org.jsoup.select.Elements elements76 = org.jsoup.select.Selector.select("<html> \n <head> \n </head> \n <body>\n   #root  \n </body>\n</html>", (java.lang.Iterable<org.jsoup.nodes.Element>) elements69);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[]");
        org.junit.Assert.assertNotNull(elements20);
        org.junit.Assert.assertNull(element21);
        org.junit.Assert.assertNotNull(elements25);
        org.junit.Assert.assertNotNull(elements27);
        org.junit.Assert.assertNotNull(elements29);
        org.junit.Assert.assertNotNull(elements33);
        org.junit.Assert.assertNotNull(elements35);
        org.junit.Assert.assertNotNull(elements37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(elements42);
        org.junit.Assert.assertNotNull(elements44);
        org.junit.Assert.assertNotNull(elements46);
        org.junit.Assert.assertNotNull(elements50);
        org.junit.Assert.assertNotNull(elements52);
        org.junit.Assert.assertNotNull(elements54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(elements57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(elements60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(elements69);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + (-1) + "'", int72 == (-1));
        org.junit.Assert.assertNotNull(elements74);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertNotNull(elements76);
    }

    @Test
    public void test2860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2860");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("#root");
        org.jsoup.nodes.Element element3 = document1.html("org.jsoup.select.Selector$SelectorParseException: ");
        org.jsoup.select.Elements elements4 = document1.getAllElements();
        org.jsoup.select.Elements elements6 = elements4.val("\n<body>\n #document\n</body>");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(elements6);
    }

    @Test
    public void test2861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2861");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("#document#document", "");
        java.lang.String str3 = attribute2.html();
        java.lang.String str4 = attribute2.html();
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document#document=\"\"" + "'", str3, "#document#document=\"\"");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#document#document=\"\"" + "'", str4, "#document#document=\"\"");
    }

    @Test
    public void test2862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2862");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements5 = elements3.prepend("");
        org.jsoup.select.Elements elements7 = elements5.removeAttr("");
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements11 = document9.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements13 = elements11.prepend("");
        org.jsoup.select.Elements elements15 = elements13.removeAttr("");
        boolean boolean16 = elements5.containsAll((java.util.Collection<org.jsoup.nodes.Element>) elements13);
        java.lang.Object[] objArray17 = elements5.toArray();
        org.jsoup.select.Elements elements19 = elements5.select("#document#document");
        org.jsoup.nodes.Document document21 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements23 = document21.getElementsByAttribute("hi!");
        boolean boolean25 = document21.hasClass("");
        java.lang.String str26 = document21.nodeName();
        boolean boolean27 = elements19.contains((java.lang.Object) document21);
        org.jsoup.nodes.Element element29 = document21.appendElement("[#, d, o, c, u, m, e, n, t, #, d, o, c, u, m, e, n, t, =, \", #, d, o, c, u, m, e, n, t, #, d, o, c, u, m, e, n, t, \"]");
        org.jsoup.nodes.Element element30 = element29.parent();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[]");
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertNotNull(elements23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "#document" + "'", str26, "#document");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertNotNull(element30);
    }

    @Test
    public void test2863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2863");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parse(file0, "#document#document=\"#document#document\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2864");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("org.jsoup.select.Selector$SelectorParseException: ");
        boolean boolean2 = tag1.isData();
        org.jsoup.nodes.Attributes attributes4 = new org.jsoup.nodes.Attributes();
        int int5 = attributes4.size();
        java.lang.String str6 = attributes4.html();
        org.jsoup.nodes.Element element7 = new org.jsoup.nodes.Element(tag1, "org.jsoup.select.selector$selectorparseexception:", attributes4);
        org.jsoup.nodes.Attribute attribute10 = org.jsoup.nodes.Attribute.createFromEncoded("hi!", "hi!");
        attribute10.setKey("#root");
        java.lang.String str13 = attribute10.html();
        attributes4.put(attribute10);
        java.lang.String str15 = attribute10.html();
        java.lang.String str16 = attribute10.getKey();
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attribute10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "#root=\"hi!\"" + "'", str13, "#root=\"hi!\"");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "#root=\"hi!\"" + "'", str15, "#root=\"hi!\"");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "#root" + "'", str16, "#root");
    }

    @Test
    public void test2865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2865");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!=\"#root=&quot;hi!&quot;\"");
        org.junit.Assert.assertNotNull(document1);
    }

    @Test
    public void test2866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2866");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("", "org.jsoup.select.selector$selectorparseexception:");
        boolean boolean4 = document2.hasAttr("#root");
        org.jsoup.nodes.Element element6 = document2.appendText("#root");
        java.lang.String str7 = document2.className();
        java.lang.String str8 = document2.tagName();
        org.jsoup.select.Elements elements11 = document2.getElementsByAttributeValueStarting("<html>\n<head>\n</head>\n<body>\n hi!=&quot;#root=&quot;hi!&quot;&quot;\n</body>\n</html>", "#document#document");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#root" + "'", str8, "#root");
        org.junit.Assert.assertNotNull(elements11);
    }

    @Test
    public void test2867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2867");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        java.lang.String str5 = elements3.attr("#root");
        org.jsoup.nodes.Document document7 = new org.jsoup.nodes.Document("");
        boolean boolean8 = document7.hasText();
        java.lang.String str9 = document7.nodeName();
        org.jsoup.select.Elements elements10 = document7.children();
        org.jsoup.nodes.Element element12 = document7.prependElement("[#, d, o, c, u, m, e, n, t]");
        int int13 = elements3.lastIndexOf((java.lang.Object) document7);
        org.jsoup.select.Elements elements14 = new org.jsoup.select.Elements((java.util.Collection<org.jsoup.nodes.Element>) elements3);
        org.jsoup.select.Elements elements15 = new org.jsoup.select.Elements((java.util.List<org.jsoup.nodes.Element>) elements3);
        org.jsoup.nodes.Document document18 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element21 = document18.attr("hi!", "#root");
        java.lang.String str22 = document18.id();
        org.jsoup.nodes.Element element24 = document18.append("hi!=\"#root=&quot;hi!&quot;\"");
        boolean boolean26 = document18.hasClass("");
        org.jsoup.nodes.Element element28 = document18.createElement("#document#documentdocument");
        org.jsoup.nodes.Element element30 = document18.append("<?#document#document>");
        org.jsoup.select.Elements elements33 = element30.getElementsByAttributeValue("#root=\"hi!\"", "#document=\"#comment\"");
        boolean boolean35 = element30.hasClass("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element36 = elements15.set(100, element30);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#document" + "'", str9, "#document");
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertNotNull(elements33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
    }

    @Test
    public void test2868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2868");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("org.jsoup.select.Selector$SelectorParseException: ", "");
        java.lang.String str4 = textNode2.absUrl("#data");
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("#data");
        org.jsoup.nodes.Document document8 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements10 = document8.getElementsByAttribute("hi!");
        java.lang.String str12 = elements10.attr("#root");
        org.jsoup.nodes.Document document14 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element[] elementArray15 = new org.jsoup.nodes.Element[] { document14 };
        java.util.ArrayList<org.jsoup.nodes.Element> elementList16 = new java.util.ArrayList<org.jsoup.nodes.Element>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<org.jsoup.nodes.Element>) elementList16, elementArray15);
        java.util.Spliterator<org.jsoup.nodes.Element> elementSpliterator18 = elementList16.spliterator();
        java.util.Spliterator<org.jsoup.nodes.Element> elementSpliterator19 = elementList16.spliterator();
        boolean boolean20 = elements10.containsAll((java.util.Collection<org.jsoup.nodes.Element>) elementList16);
        org.jsoup.select.Elements elements21 = new org.jsoup.select.Elements((java.util.List<org.jsoup.nodes.Element>) elementList16);
        org.jsoup.select.Elements elements22 = new org.jsoup.select.Elements((java.util.Collection<org.jsoup.nodes.Element>) elements21);
        org.jsoup.nodes.Document document24 = org.jsoup.Jsoup.parse("hi!");
        int int25 = elements21.indexOf((java.lang.Object) document24);
        java.lang.String str26 = document24.nodeName();
        boolean boolean27 = textNode2.equals((java.lang.Object) document24);
        org.jsoup.nodes.TextNode textNode29 = textNode2.text("<?hi!>");
        java.lang.String str30 = textNode29.getWholeText();
        org.jsoup.nodes.TextNode textNode32 = textNode29.text("");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(textNode6);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(elementArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(elementSpliterator18);
        org.junit.Assert.assertNotNull(elementSpliterator19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(document24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "#document" + "'", str26, "#document");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(textNode29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "<?hi!>" + "'", str30, "<?hi!>");
        org.junit.Assert.assertNotNull(textNode32);
    }

    @Test
    public void test2869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2869");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("org.jsoup.select.Selector$SelectorParseException: ");
        java.lang.String str2 = tag1.getName();
        boolean boolean3 = tag1.canContainBlock();
        org.jsoup.parser.Tag tag5 = org.jsoup.parser.Tag.valueOf("#declaration");
        java.lang.String str6 = tag5.toString();
        boolean boolean7 = tag5.requiresSpecificParent();
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements11 = document9.getElementsByAttribute("hi!");
        java.lang.String str13 = elements11.attr("#root");
        org.jsoup.nodes.Document document15 = new org.jsoup.nodes.Document("");
        boolean boolean16 = document15.hasText();
        java.lang.String str17 = document15.nodeName();
        org.jsoup.select.Elements elements18 = document15.children();
        org.jsoup.nodes.Element element20 = document15.prependElement("[#, d, o, c, u, m, e, n, t]");
        int int21 = elements11.lastIndexOf((java.lang.Object) document15);
        org.jsoup.nodes.Element element22 = document15.parent();
        org.jsoup.nodes.Element element24 = document15.append("#root=\"hi!\"");
        boolean boolean25 = tag5.equals((java.lang.Object) document15);
        boolean boolean26 = tag1.isValidAncestor(tag5);
        boolean boolean27 = tag1.preserveWhitespace();
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.jsoup.select.selector$selectorparseexception:" + "'", str2, "org.jsoup.select.selector$selectorparseexception:");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#declaration" + "'", str6, "#declaration");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "#document" + "'", str17, "#document");
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNull(element22);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test2870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2870");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("#document#document=\"#document#document\"");
        boolean boolean2 = tokenQueue1.isEmpty();
        boolean boolean3 = tokenQueue1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test2871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2871");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("#root");
        document1.setBaseUri("\n&lt;!--#root--&gt;");
        org.junit.Assert.assertNotNull(document1);
    }

    @Test
    public void test2872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2872");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.hasText();
        boolean boolean3 = document1.hasText();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        boolean boolean6 = document5.hasText();
        java.lang.String str7 = document5.nodeName();
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet10 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet10, strArray9);
        org.jsoup.nodes.Element element12 = document5.classNames((java.util.Set<java.lang.String>) strSet10);
        org.jsoup.nodes.Element element13 = document1.classNames((java.util.Set<java.lang.String>) strSet10);
        org.jsoup.nodes.Element element15 = document1.appendText("hi!");
        org.jsoup.parser.Tag tag16 = document1.tag();
        org.jsoup.nodes.Element element17 = document1.head();
        org.jsoup.nodes.Element element18 = document1.body();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Tag tag19 = element18.tag();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#document" + "'", str7, "#document");
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(tag16);
        org.junit.Assert.assertNull(element17);
        org.junit.Assert.assertNull(element18);
    }

    @Test
    public void test2873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2873");
        org.jsoup.parser.Tag tag2 = org.jsoup.parser.Tag.valueOf("#root");
        boolean boolean3 = tag2.isInline();
        boolean boolean4 = tag2.isInline();
        org.jsoup.nodes.Document document6 = new org.jsoup.nodes.Document("");
        boolean boolean7 = document6.hasText();
        java.lang.String str8 = document6.nodeName();
        java.lang.String[] strArray10 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet11 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet11, strArray10);
        org.jsoup.nodes.Element element13 = document6.classNames((java.util.Set<java.lang.String>) strSet11);
        org.jsoup.nodes.Element element15 = element13.addClass("#document");
        org.jsoup.nodes.Document document17 = new org.jsoup.nodes.Document("");
        boolean boolean18 = document17.hasText();
        boolean boolean19 = document17.hasText();
        org.jsoup.nodes.Document document21 = new org.jsoup.nodes.Document("");
        boolean boolean22 = document21.hasText();
        java.lang.String str23 = document21.nodeName();
        java.lang.String[] strArray25 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet26 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet26, strArray25);
        org.jsoup.nodes.Element element28 = document21.classNames((java.util.Set<java.lang.String>) strSet26);
        org.jsoup.nodes.Element element29 = document17.classNames((java.util.Set<java.lang.String>) strSet26);
        java.util.Set<java.lang.String> strSet30 = document17.classNames();
        org.jsoup.nodes.Element element31 = element13.classNames(strSet30);
        boolean boolean32 = tag2.equals((java.lang.Object) element13);
        org.jsoup.select.Elements elements33 = org.jsoup.select.Selector.select("body", element13);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements35 = elements33.wrap("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#document" + "'", str8, "#document");
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "#document" + "'", str23, "#document");
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertNotNull(strSet30);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(elements33);
    }

    @Test
    public void test2874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2874");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        int int1 = attributes0.size();
        org.jsoup.nodes.Document document3 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements5 = document3.getElementsByAttribute("hi!");
        java.lang.String str6 = elements5.val();
        java.lang.Object obj7 = null;
        int int8 = elements5.lastIndexOf(obj7);
        org.jsoup.select.Elements elements10 = elements5.eq((int) '#');
        boolean boolean11 = attributes0.equals((java.lang.Object) elements10);
        java.lang.String str12 = elements10.outerHtml();
        int int14 = elements10.lastIndexOf((java.lang.Object) "\n<!--#document--> #data");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test2875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2875");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements5 = elements3.prepend("");
        org.jsoup.select.Elements elements7 = elements5.removeAttr("");
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements11 = document9.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements13 = elements11.prepend("");
        org.jsoup.select.Elements elements15 = elements13.removeAttr("");
        boolean boolean16 = elements5.containsAll((java.util.Collection<org.jsoup.nodes.Element>) elements13);
        java.lang.Object[] objArray17 = elements5.toArray();
        org.jsoup.nodes.Document document19 = new org.jsoup.nodes.Document("");
        boolean boolean20 = document19.hasText();
        java.lang.String str21 = document19.nodeName();
        java.lang.String str22 = document19.val();
        boolean boolean23 = elements5.add((org.jsoup.nodes.Element) document19);
        org.jsoup.nodes.Element element24 = document19.empty();
        org.jsoup.nodes.Element element26 = document19.createElement("#document#document#root=&quot;#root=&amp;quot;hi!&amp;quot;&quot;");
        org.jsoup.select.Elements elements27 = element26.parents();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "#document" + "'", str21, "#document");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertNotNull(elements27);
    }

    @Test
    public void test2876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2876");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        int int1 = attributes0.size();
        org.jsoup.nodes.Document document3 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements5 = document3.getElementsByAttribute("hi!");
        java.lang.String str6 = elements5.val();
        java.lang.Object obj7 = null;
        int int8 = elements5.lastIndexOf(obj7);
        org.jsoup.select.Elements elements10 = elements5.eq((int) '#');
        boolean boolean11 = attributes0.equals((java.lang.Object) elements10);
        boolean boolean12 = elements10.hasText();
        org.jsoup.nodes.Document document15 = org.jsoup.parser.Parser.parseBodyFragmentRelaxed("#document", "#root");
        boolean boolean16 = elements10.remove((java.lang.Object) document15);
        org.jsoup.nodes.Element element17 = document15.empty();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(document15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(element17);
    }

    @Test
    public void test2877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2877");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;", "a");
        java.lang.String str3 = textNode2.text();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;" + "'", str3, "&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;");
    }

    @Test
    public void test2878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2878");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.hasText();
        java.lang.String str3 = document1.nodeName();
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        org.jsoup.nodes.Element element8 = document1.classNames((java.util.Set<java.lang.String>) strSet6);
        org.jsoup.nodes.Element element10 = document1.append("#document");
        org.jsoup.nodes.Element element12 = element10.html("");
        org.jsoup.nodes.Element element15 = element10.attr("#root", "hi!");
        org.jsoup.nodes.Element element16 = element10.parent();
        org.jsoup.nodes.Element element18 = element10.prependText("<?#document#document>");
        org.jsoup.nodes.Element element20 = element18.val("<[#, d, o, c, u, m, e, n, t]>\n</[#, d, o, c, u, m, e, n, t]>#root=&quot;hi!&quot;");
        org.jsoup.nodes.Element element21 = element18.parent();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNull(element16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNull(element21);
    }

    @Test
    public void test2879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2879");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        int int1 = attributes0.size();
        boolean boolean3 = attributes0.hasKey("");
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator4 = attributes0.spliterator();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(attributeSpliterator4);
    }

    @Test
    public void test2880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2880");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element5 = document1.prepend("#document");
        org.jsoup.nodes.Element element6 = element5.empty();
        org.jsoup.select.Elements elements8 = element5.getElementsByTag("org.jsoup.select.Selector$SelectorParseException: ");
        org.jsoup.select.Elements elements10 = elements8.removeClass("#root");
        org.jsoup.nodes.Document document12 = new org.jsoup.nodes.Document("");
        boolean boolean13 = document12.hasText();
        java.lang.String str14 = document12.nodeName();
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet17 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet17, strArray16);
        org.jsoup.nodes.Element element19 = document12.classNames((java.util.Set<java.lang.String>) strSet17);
        org.jsoup.nodes.Element element21 = document12.append("#document");
        org.jsoup.nodes.Element element23 = document12.prepend("#document");
        org.jsoup.nodes.Attributes attributes24 = element23.attributes();
        org.jsoup.nodes.Element element26 = element23.append("hi!");
        org.jsoup.select.Elements elements28 = element26.getElementsByIndexLessThan((int) (short) 0);
        boolean boolean29 = elements8.equals((java.lang.Object) elements28);
        org.jsoup.nodes.Document document32 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements34 = document32.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements36 = elements34.prepend("");
        elements36.clear();
        int int39 = elements36.indexOf((java.lang.Object) "org.jsoup.select.Selector$SelectorParseException: ");
        org.jsoup.select.Elements elements41 = elements36.removeClass("#data");
        org.jsoup.select.Elements elements42 = org.jsoup.select.Selector.select("#data", (java.lang.Iterable<org.jsoup.nodes.Element>) elements41);
        org.jsoup.nodes.Element element43 = elements42.last();
        org.jsoup.select.Elements elements45 = elements42.html("#data");
        boolean boolean46 = elements28.containsAll((java.util.Collection<org.jsoup.nodes.Element>) elements42);
        int int47 = elements28.size();
        org.jsoup.select.Elements elements49 = elements28.addClass("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.jsoup.select.Elements elements51 = elements49.toggleClass("org.jsoup.select.selector$selectorparseexception:");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#document" + "'", str14, "#document");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(attributes24);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertNotNull(elements28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(elements34);
        org.junit.Assert.assertNotNull(elements36);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNotNull(elements41);
        org.junit.Assert.assertNotNull(elements42);
        org.junit.Assert.assertNull(element43);
        org.junit.Assert.assertNotNull(elements45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNotNull(elements49);
        org.junit.Assert.assertNotNull(elements51);
    }

    @Test
    public void test2881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2881");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.hasText();
        java.lang.String str3 = document1.nodeName();
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        org.jsoup.nodes.Element element8 = document1.classNames((java.util.Set<java.lang.String>) strSet6);
        org.jsoup.nodes.Element element10 = element8.addClass("#document");
        java.lang.String str11 = element10.html();
        org.jsoup.nodes.Element element13 = element10.appendElement("#document");
        java.lang.String str14 = element13.html();
        org.jsoup.nodes.Document document17 = org.jsoup.parser.Parser.parse("#root", "");
        java.lang.String str18 = document17.outerHtml();
        org.jsoup.nodes.Element element20 = document17.createElement("#document#documenthi!");
        org.jsoup.nodes.Element element21 = element13.prependChild((org.jsoup.nodes.Node) element20);
        java.lang.String str22 = element13.tagName();
        org.jsoup.nodes.Document document24 = new org.jsoup.nodes.Document("");
        boolean boolean25 = document24.hasText();
        boolean boolean26 = document24.hasText();
        org.jsoup.nodes.Document document28 = new org.jsoup.nodes.Document("");
        boolean boolean29 = document28.hasText();
        java.lang.String str30 = document28.nodeName();
        java.lang.String[] strArray32 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet33 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet33, strArray32);
        org.jsoup.nodes.Element element35 = document28.classNames((java.util.Set<java.lang.String>) strSet33);
        org.jsoup.nodes.Element element36 = document24.classNames((java.util.Set<java.lang.String>) strSet33);
        org.jsoup.nodes.Element element37 = element13.classNames((java.util.Set<java.lang.String>) strSet33);
        org.jsoup.select.Elements elements39 = element37.getElementsByClass("\n<body>\n #document\n</body>");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(document17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>" + "'", str18, "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "#document" + "'", str22, "#document");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "#document" + "'", str30, "#document");
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertNotNull(element36);
        org.junit.Assert.assertNotNull(element37);
        org.junit.Assert.assertNotNull(elements39);
    }

    @Test
    public void test2882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2882");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("hi!", "hi!", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        java.lang.String str5 = xmlDeclaration3.toString();
        java.lang.String str6 = xmlDeclaration3.getWholeDeclaration();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<?hi!>" + "'", str5, "<?hi!>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test2883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2883");
        org.jsoup.nodes.Document document2 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document2.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements6 = elements4.val("a");
        org.jsoup.select.Elements elements8 = elements4.toggleClass("");
        org.jsoup.select.Elements elements10 = elements8.html("org.jsoup.select.Selector$SelectorParseException: #document#document=\"#document#document\"");
        org.jsoup.nodes.Document document12 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements14 = document12.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements16 = elements14.prepend("");
        org.jsoup.select.Elements elements18 = elements16.removeAttr("");
        org.jsoup.select.Elements elements20 = elements18.prepend("<?#document#document>");
        org.jsoup.select.Elements elements22 = elements18.eq((int) (short) 0);
        java.lang.Class<?> wildcardClass23 = elements18.getClass();
        org.jsoup.nodes.Document document25 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements27 = document25.getElementsByAttribute("hi!");
        java.lang.String str28 = elements27.val();
        java.lang.Object obj29 = null;
        int int30 = elements27.lastIndexOf(obj29);
        org.jsoup.select.Elements elements32 = elements27.eq((int) '#');
        elements27.clear();
        int int34 = elements27.size();
        java.util.Spliterator<org.jsoup.nodes.Element> elementSpliterator35 = elements27.spliterator();
        java.lang.Class<?> wildcardClass36 = elements27.getClass();
        org.jsoup.parser.Tag tag38 = org.jsoup.parser.Tag.valueOf("org.jsoup.select.Selector$SelectorParseException: ");
        java.lang.String str39 = tag38.getName();
        boolean boolean40 = tag38.isInline();
        boolean boolean41 = tag38.isEmpty();
        org.jsoup.parser.Tag tag43 = org.jsoup.parser.Tag.valueOf("org.jsoup.select.Selector$SelectorParseException: ");
        java.lang.String str44 = tag43.getName();
        boolean boolean45 = tag43.isInline();
        boolean boolean46 = tag43.isEmpty();
        boolean boolean47 = tag43.isEmpty();
        org.jsoup.nodes.Document document50 = org.jsoup.parser.Parser.parse("#root", "");
        org.jsoup.nodes.Element element53 = document50.attr("#root", "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        java.lang.String str54 = document50.tagName();
        java.lang.String str55 = document50.text();
        boolean boolean56 = document50.isBlock();
        boolean boolean57 = tag43.equals((java.lang.Object) document50);
        boolean boolean58 = tag38.isValidParent(tag43);
        java.lang.Class<?> wildcardClass59 = tag43.getClass();
        org.jsoup.nodes.Document document62 = org.jsoup.parser.Parser.parseBodyFragment("\n&lt;!--#root--&gt;", "<!--#document-->");
        org.jsoup.nodes.Element element65 = document62.attr("\n<!--#document--> #data", "<!--#document-->");
        java.lang.Class<?> wildcardClass66 = document62.getClass();
        org.jsoup.nodes.Document document70 = org.jsoup.parser.Parser.parse("#root", "\n<!--#root-->");
        org.jsoup.select.Elements elements71 = org.jsoup.select.Selector.select("#declaration", (org.jsoup.nodes.Element) document70);
        org.jsoup.nodes.Element element72 = document70.body();
        org.jsoup.nodes.Document document74 = new org.jsoup.nodes.Document("");
        boolean boolean75 = document74.hasText();
        java.lang.String str76 = document74.nodeName();
        java.lang.String[] strArray78 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet79 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet79, strArray78);
        org.jsoup.nodes.Element element81 = document74.classNames((java.util.Set<java.lang.String>) strSet79);
        org.jsoup.nodes.Element element83 = document74.append("#document");
        org.jsoup.nodes.Element element85 = document74.prepend("#document");
        org.jsoup.select.Elements elements86 = document74.parents();
        org.jsoup.nodes.Element element87 = element72.appendChild((org.jsoup.nodes.Node) document74);
        org.jsoup.select.Elements elements88 = element87.getAllElements();
        org.jsoup.select.Elements elements90 = elements88.html("<html> \n <head> \n </head> \n <body>\n   #root  \n </body>\n</html>");
        java.lang.Class<?> wildcardClass91 = elements90.getClass();
        java.lang.reflect.AnnotatedElement[] annotatedElementArray92 = new java.lang.reflect.AnnotatedElement[] { wildcardClass23, wildcardClass36, wildcardClass59, wildcardClass66, wildcardClass91 };
        java.lang.reflect.AnnotatedElement[] annotatedElementArray93 = elements10.toArray(annotatedElementArray92);
        org.jsoup.select.Elements elements94 = org.jsoup.select.Selector.select(" hi!", (java.lang.Iterable<org.jsoup.nodes.Element>) elements10);
        java.util.Spliterator<org.jsoup.nodes.Element> elementSpliterator95 = elements10.spliterator();
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertNotNull(elements20);
        org.junit.Assert.assertNotNull(elements22);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(elements27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(elements32);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(elementSpliterator35);
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertNotNull(tag38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "org.jsoup.select.selector$selectorparseexception:" + "'", str39, "org.jsoup.select.selector$selectorparseexception:");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(tag43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "org.jsoup.select.selector$selectorparseexception:" + "'", str44, "org.jsoup.select.selector$selectorparseexception:");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(document50);
        org.junit.Assert.assertNotNull(element53);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "#root" + "'", str54, "#root");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "#root" + "'", str55, "#root");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(wildcardClass59);
        org.junit.Assert.assertNotNull(document62);
        org.junit.Assert.assertNotNull(element65);
        org.junit.Assert.assertNotNull(wildcardClass66);
        org.junit.Assert.assertNotNull(document70);
        org.junit.Assert.assertNotNull(elements71);
        org.junit.Assert.assertNotNull(element72);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "#document" + "'", str76, "#document");
        org.junit.Assert.assertNotNull(strArray78);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertNotNull(element81);
        org.junit.Assert.assertNotNull(element83);
        org.junit.Assert.assertNotNull(element85);
        org.junit.Assert.assertNotNull(elements86);
        org.junit.Assert.assertNotNull(element87);
        org.junit.Assert.assertNotNull(elements88);
        org.junit.Assert.assertNotNull(elements90);
        org.junit.Assert.assertNotNull(wildcardClass91);
        org.junit.Assert.assertNotNull(annotatedElementArray92);
        org.junit.Assert.assertNotNull(annotatedElementArray93);
        org.junit.Assert.assertNotNull(elements94);
        org.junit.Assert.assertNotNull(elementSpliterator95);
    }

    @Test
    public void test2884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2884");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parse("hi!");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("org.jsoup.select.selector$selectorparseexception:");
        org.jsoup.select.Elements elements5 = elements3.eq((int) (byte) 10);
        elements3.clear();
        java.lang.String str7 = elements3.outerHtml();
        java.util.Iterator<org.jsoup.nodes.Element> elementItor8 = elements3.iterator();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(elementItor8);
    }

    @Test
    public void test2885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2885");
        org.jsoup.nodes.DataNode dataNode2 = org.jsoup.nodes.DataNode.createFromEncoded("#document", "#document");
        java.lang.String str3 = dataNode2.toString();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        boolean boolean6 = document5.hasText();
        boolean boolean7 = document5.hasText();
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        boolean boolean10 = document9.hasText();
        java.lang.String str11 = document9.nodeName();
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet14 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet14, strArray13);
        org.jsoup.nodes.Element element16 = document9.classNames((java.util.Set<java.lang.String>) strSet14);
        org.jsoup.nodes.Element element17 = document5.classNames((java.util.Set<java.lang.String>) strSet14);
        java.util.Set<java.lang.String> strSet18 = document5.classNames();
        org.jsoup.nodes.Element element20 = document5.getElementById("#document#document");
        java.lang.String str21 = document5.id();
        java.lang.String str22 = document5.nodeName();
        java.lang.String str24 = document5.attr("");
        boolean boolean25 = dataNode2.equals((java.lang.Object) str24);
        java.lang.String str26 = dataNode2.toString();
        org.junit.Assert.assertNotNull(dataNode2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#document" + "'", str11, "#document");
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertNull(element20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "#document" + "'", str22, "#document");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "#document" + "'", str26, "#document");
    }

    @Test
    public void test2886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2886");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Document document2 = document1.normalise();
        org.jsoup.nodes.Element element3 = document2.head();
        org.jsoup.nodes.Element element6 = document2.attr("org.jsoup.select.Selector$SelectorParseException: ", "[]");
        org.jsoup.nodes.Element element8 = element6.appendElement("#comment");
        org.jsoup.nodes.Element element10 = element6.prependText("#document");
        org.jsoup.nodes.Document document12 = new org.jsoup.nodes.Document("");
        boolean boolean13 = document12.hasText();
        boolean boolean14 = document12.hasText();
        org.jsoup.nodes.Document document16 = new org.jsoup.nodes.Document("");
        boolean boolean17 = document16.hasText();
        java.lang.String str18 = document16.nodeName();
        java.lang.String[] strArray20 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet21 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet21, strArray20);
        org.jsoup.nodes.Element element23 = document16.classNames((java.util.Set<java.lang.String>) strSet21);
        org.jsoup.nodes.Element element24 = document12.classNames((java.util.Set<java.lang.String>) strSet21);
        org.jsoup.select.Elements elements25 = element24.getAllElements();
        org.jsoup.nodes.Element element26 = element6.prependChild((org.jsoup.nodes.Node) element24);
        boolean boolean28 = element6.hasAttr(" data=\"org.jsoup.select.selector$selectorparseexception:\" <!--#document-->=\" hi!\"");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "#document" + "'", str18, "#document");
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(elements25);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test2887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2887");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("#document#document=\"#document#document\"");
        boolean boolean2 = tokenQueue1.isEmpty();
        java.lang.String str3 = tokenQueue1.toString();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[#, d, o, c, u, m, e, n, t, #, d, o, c, u, m, e, n, t, =, \", #, d, o, c, u, m, e, n, t, #, d, o, c, u, m, e, n, t, \"]" + "'", str3, "[#, d, o, c, u, m, e, n, t, #, d, o, c, u, m, e, n, t, =, \", #, d, o, c, u, m, e, n, t, #, d, o, c, u, m, e, n, t, \"]");
    }

    @Test
    public void test2888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2888");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("#root", "");
        java.lang.String str3 = document2.outerHtml();
        org.jsoup.nodes.Element element5 = document2.createElement("#document#documenthi!");
        java.lang.String str6 = document2.text();
        java.lang.String str7 = document2.baseUri();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>" + "'", str3, "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#root" + "'", str6, "#root");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test2889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2889");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements5 = elements3.prepend("");
        org.jsoup.select.Elements elements7 = elements5.removeAttr("");
        org.jsoup.select.Elements elements9 = elements7.prepend("<?#document#document>");
        org.jsoup.select.Elements elements11 = elements7.eq((int) (short) 0);
        org.jsoup.nodes.Element element12 = elements7.first();
        org.jsoup.nodes.Element element13 = elements7.first();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNull(element12);
        org.junit.Assert.assertNull(element13);
    }

    @Test
    public void test2890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2890");
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parse("<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>", "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.lang.String str3 = document2.nodeName();
        org.jsoup.nodes.Element element5 = document2.createElement("#document#documenthi!#root=&quot;hi!&quot;");
        org.jsoup.nodes.Element element7 = element5.text(" hi!=\"#root\"");
        org.jsoup.select.Elements elements10 = element7.getElementsByAttributeValueContaining("[<, h, t, m, l, >, \n, <, h, e, a, d, >, \n, <, /, h, e, a, d, >, \n, <, b, o, d, y, >, \n,  , #, r, o, o, t,  , \n, <, /, b, o, d, y, >, \n, <, /, h, t, m, l, >, #, d, o, c, u, m, e, n, t, #, d, o, c, u, m, e, n, t, d, o, c, u, m, e, n, t]", "hi! #data <html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.lang.String str11 = element7.className();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test2891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2891");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.hasText();
        boolean boolean3 = document1.hasText();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        boolean boolean6 = document5.hasText();
        java.lang.String str7 = document5.nodeName();
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet10 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet10, strArray9);
        org.jsoup.nodes.Element element12 = document5.classNames((java.util.Set<java.lang.String>) strSet10);
        org.jsoup.nodes.Element element13 = document1.classNames((java.util.Set<java.lang.String>) strSet10);
        org.jsoup.nodes.Element element15 = document1.appendText("hi!");
        org.jsoup.parser.Tag tag16 = document1.tag();
        boolean boolean17 = tag16.requiresSpecificParent();
        boolean boolean18 = tag16.canContainBlock();
        org.jsoup.parser.Tag tag20 = org.jsoup.parser.Tag.valueOf("org.jsoup.select.Selector$SelectorParseException: ");
        boolean boolean21 = tag20.isData();
        boolean boolean22 = tag20.isBlock();
        boolean boolean23 = tag16.isValidAncestor(tag20);
        boolean boolean24 = tag16.requiresSpecificParent();
        boolean boolean25 = tag16.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#document" + "'", str7, "#document");
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(tag16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(tag20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test2892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2892");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragmentRelaxed("hi!", "#data");
        org.jsoup.parser.Tag tag3 = document2.tag();
        boolean boolean4 = tag3.isInline();
        org.jsoup.nodes.Document document6 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element9 = document6.attr("hi!", "#root");
        org.jsoup.nodes.Attributes attributes10 = document6.attributes();
        org.jsoup.select.Elements elements13 = document6.getElementsByAttributeValueNot("org.jsoup.select.selector$selectorparseexception:", "hi!");
        java.lang.Object[] objArray14 = elements13.toArray();
        boolean boolean15 = tag3.equals((java.lang.Object) elements13);
        org.jsoup.nodes.Document document17 = new org.jsoup.nodes.Document("");
        boolean boolean18 = document17.hasText();
        java.lang.String str19 = document17.nodeName();
        java.lang.String[] strArray21 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet22 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet22, strArray21);
        org.jsoup.nodes.Element element24 = document17.classNames((java.util.Set<java.lang.String>) strSet22);
        java.lang.String str25 = document17.outerHtml();
        boolean boolean26 = elements13.remove((java.lang.Object) str25);
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "#document" + "'", str19, "#document");
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test2893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2893");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("#root", "");
        org.jsoup.nodes.Element element5 = document2.attr("#root", "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        java.lang.String str6 = document2.tagName();
        java.lang.String str7 = document2.text();
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        boolean boolean10 = document9.hasText();
        boolean boolean11 = document9.hasText();
        org.jsoup.nodes.Document document13 = new org.jsoup.nodes.Document("");
        boolean boolean14 = document13.hasText();
        java.lang.String str15 = document13.nodeName();
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet18 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet18, strArray17);
        org.jsoup.nodes.Element element20 = document13.classNames((java.util.Set<java.lang.String>) strSet18);
        org.jsoup.nodes.Element element21 = document9.classNames((java.util.Set<java.lang.String>) strSet18);
        element21.setBaseUri("\n<!--#root-->");
        org.jsoup.nodes.Document document26 = org.jsoup.parser.Parser.parse("#root", "");
        org.jsoup.nodes.Element element29 = document26.attr("#root", "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        java.lang.String str30 = document26.tagName();
        java.lang.String str31 = document26.toString();
        org.jsoup.nodes.Node node33 = document26.removeAttr("[#, d, o, c, u, m, e, n, t]");
        org.jsoup.nodes.Element element34 = element21.prependChild((org.jsoup.nodes.Node) document26);
        org.jsoup.nodes.Element element35 = element21.empty();
        org.jsoup.nodes.Element element36 = document2.appendChild((org.jsoup.nodes.Node) element35);
        org.jsoup.select.Elements elements37 = element36.parents();
        org.jsoup.nodes.Element element39 = element36.text("");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#root" + "'", str6, "#root");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#root" + "'", str7, "#root");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "#document" + "'", str15, "#document");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(document26);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "#root" + "'", str30, "#root");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>" + "'", str31, "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertNotNull(element34);
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertNotNull(element36);
        org.junit.Assert.assertNotNull(elements37);
        org.junit.Assert.assertNotNull(element39);
    }

    @Test
    public void test2894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2894");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("#document", "#root");
        java.lang.String str3 = comment2.nodeName();
        java.lang.String str4 = comment2.getData();
        java.lang.String str5 = comment2.nodeName();
        java.lang.String str6 = comment2.getData();
        java.lang.String str7 = comment2.nodeName();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#comment" + "'", str3, "#comment");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#document" + "'", str4, "#document");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#comment" + "'", str5, "#comment");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#document" + "'", str6, "#document");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#comment" + "'", str7, "#comment");
    }

    @Test
    public void test2895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2895");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element5 = document1.prepend("#document");
        org.jsoup.nodes.Element element7 = document1.createElement("#data");
        org.jsoup.select.Elements elements9 = element7.getElementsByTag("\n&lt;!--#root--&gt;");
        org.jsoup.select.Elements elements11 = element7.getElementsByAttribute("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.jsoup.select.Elements elements13 = elements11.removeAttr(" class=&quot;hi!&quot;");
        java.util.Iterator<org.jsoup.nodes.Element> elementItor14 = elements13.iterator();
        org.jsoup.nodes.Document document16 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements18 = document16.getElementsByIndexGreaterThan((int) ' ');
        org.jsoup.select.Elements elements21 = document16.getElementsByAttributeValueStarting("\n&lt;!--#root--&gt;", "#text");
        org.jsoup.select.Elements elements23 = elements21.eq(100);
        int int24 = elements13.indexOf((java.lang.Object) elements23);
        boolean boolean25 = elements13.isEmpty();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(elementItor14);
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertNotNull(elements21);
        org.junit.Assert.assertNotNull(elements23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test2896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2896");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element5 = document1.prepend("#document");
        org.jsoup.nodes.Element element6 = element5.empty();
        org.jsoup.select.Elements elements8 = element5.getElementsByTag("org.jsoup.select.Selector$SelectorParseException: ");
        org.jsoup.select.Elements elements10 = elements8.removeClass("#root");
        org.jsoup.select.Elements elements12 = elements8.append("");
        java.lang.String str13 = elements12.text();
        boolean boolean15 = elements12.is("hi!");
        java.lang.String str17 = elements12.attr("<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>\n<html> \n<head> \n</head> \n<body>\n  #root  \n</body>\n</html>");
        org.jsoup.nodes.Document document20 = new org.jsoup.nodes.Document("");
        boolean boolean21 = document20.hasText();
        boolean boolean22 = document20.hasText();
        org.jsoup.nodes.Document document24 = new org.jsoup.nodes.Document("");
        boolean boolean25 = document24.hasText();
        java.lang.String str26 = document24.nodeName();
        java.lang.String[] strArray28 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet29 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet29, strArray28);
        org.jsoup.nodes.Element element31 = document24.classNames((java.util.Set<java.lang.String>) strSet29);
        org.jsoup.nodes.Element element32 = document20.classNames((java.util.Set<java.lang.String>) strSet29);
        java.util.Set<java.lang.String> strSet33 = document20.classNames();
        org.jsoup.nodes.Element element35 = document20.getElementById("#document#document");
        java.lang.String str36 = document20.id();
        org.jsoup.parser.Tag tag37 = document20.tag();
        org.jsoup.parser.Tag tag39 = org.jsoup.parser.Tag.valueOf("#declaration");
        java.lang.String str40 = tag39.toString();
        boolean boolean41 = tag37.isValidParent(tag39);
        org.jsoup.nodes.Element element43 = new org.jsoup.nodes.Element(tag37, "");
        java.lang.String str44 = tag37.getName();
        org.jsoup.nodes.Element element46 = new org.jsoup.nodes.Element(tag37, "hi!");
        org.jsoup.nodes.Element element48 = new org.jsoup.nodes.Element(tag37, "");
        org.jsoup.nodes.Element element49 = element48.parent();
        // The following exception was thrown during execution in test generation
        try {
            elements12.add((int) (short) 100, element49);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "#document" + "'", str26, "#document");
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertNotNull(element32);
        org.junit.Assert.assertNotNull(strSet33);
        org.junit.Assert.assertNull(element35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(tag37);
        org.junit.Assert.assertNotNull(tag39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "#declaration" + "'", str40, "#declaration");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "#root" + "'", str44, "#root");
        org.junit.Assert.assertNull(element49);
    }

    @Test
    public void test2897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2897");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        java.lang.String str4 = elements3.val();
        java.lang.Object obj5 = null;
        int int6 = elements3.lastIndexOf(obj5);
        org.jsoup.select.Elements elements8 = elements3.eq((int) '#');
        boolean boolean10 = elements3.hasAttr("#root");
        boolean boolean12 = elements3.is("#root=\"hi!\"");
        org.jsoup.select.Elements elements13 = new org.jsoup.select.Elements((java.util.Collection<org.jsoup.nodes.Element>) elements3);
        boolean boolean15 = elements3.is("<html>\n<head>\n</head>\n<body>\n <html> \n  <head> \n  </head> \n  <body>\n    #root  #document#documentdocument\n  </body>\n </html>\n</body>\n</html>");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2898");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("[]");
        org.junit.Assert.assertNotNull(document1);
    }

    @Test
    public void test2899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2899");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        java.lang.String str5 = elements3.attr("#root");
        org.jsoup.nodes.Document document7 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element[] elementArray8 = new org.jsoup.nodes.Element[] { document7 };
        java.util.ArrayList<org.jsoup.nodes.Element> elementList9 = new java.util.ArrayList<org.jsoup.nodes.Element>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<org.jsoup.nodes.Element>) elementList9, elementArray8);
        java.util.Spliterator<org.jsoup.nodes.Element> elementSpliterator11 = elementList9.spliterator();
        java.util.Spliterator<org.jsoup.nodes.Element> elementSpliterator12 = elementList9.spliterator();
        boolean boolean13 = elements3.containsAll((java.util.Collection<org.jsoup.nodes.Element>) elementList9);
        org.jsoup.select.Elements elements14 = new org.jsoup.select.Elements((java.util.List<org.jsoup.nodes.Element>) elementList9);
        org.jsoup.select.Elements elements15 = new org.jsoup.select.Elements((java.util.Collection<org.jsoup.nodes.Element>) elements14);
        org.jsoup.nodes.Document document17 = org.jsoup.Jsoup.parse("hi!");
        int int18 = elements14.indexOf((java.lang.Object) document17);
        document17.title("");
        document17.title("\n<!--#data-->");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(elementArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(elementSpliterator11);
        org.junit.Assert.assertNotNull(elementSpliterator12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(document17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test2900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2900");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("<!<#document#document=\"#document#document\">\n</#document#document=\"#document#document\">>");
        org.junit.Assert.assertNotNull(tag1);
    }

    @Test
    public void test2901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2901");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        int int1 = attributes0.size();
        java.lang.String str2 = attributes0.html();
        java.util.List<org.jsoup.nodes.Attribute> attributeList3 = attributes0.asList();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        boolean boolean6 = document5.hasText();
        java.lang.String str7 = document5.nodeName();
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet10 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet10, strArray9);
        org.jsoup.nodes.Element element12 = document5.classNames((java.util.Set<java.lang.String>) strSet10);
        org.jsoup.nodes.Element element14 = document5.append("#document");
        org.jsoup.nodes.Element element16 = document5.prepend("#document");
        org.jsoup.nodes.Attributes attributes17 = element16.attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator18 = attributes17.spliterator();
        org.jsoup.nodes.Attributes attributes19 = new org.jsoup.nodes.Attributes();
        int int20 = attributes19.size();
        java.lang.String str21 = attributes19.html();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor22 = attributes19.iterator();
        boolean boolean23 = attributes17.equals((java.lang.Object) attributes19);
        attributes0.addAll(attributes17);
        boolean boolean26 = attributes17.hasKey("#declaration");
        attributes17.remove("<html> \n <head> \n </head> \n <body>\n   #root  \n </body>\n</html><<?#document#document>>\n</<?#document#document>>");
        java.lang.String str29 = attributes17.html();
        org.jsoup.nodes.Attributes attributes30 = new org.jsoup.nodes.Attributes();
        int int31 = attributes30.size();
        org.jsoup.nodes.Document document33 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements35 = document33.getElementsByAttribute("hi!");
        java.lang.String str36 = elements35.val();
        java.lang.Object obj37 = null;
        int int38 = elements35.lastIndexOf(obj37);
        org.jsoup.select.Elements elements40 = elements35.eq((int) '#');
        boolean boolean41 = attributes30.equals((java.lang.Object) elements40);
        attributes17.addAll(attributes30);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(attributeList3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#document" + "'", str7, "#document");
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(attributes17);
        org.junit.Assert.assertNotNull(attributeSpliterator18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(attributeItor22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + " class=\"hi!\"" + "'", str29, " class=\"hi!\"");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(elements35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertNotNull(elements40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test2902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2902");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("<html>\n<head>\n</head>\n<body>\n # \n</body>\n</html>");
    }

    @Test
    public void test2903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2903");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.hasText();
        java.lang.String str3 = document1.nodeName();
        org.jsoup.select.Elements elements4 = document1.children();
        org.jsoup.select.Elements elements6 = document1.getElementsByTag("#document#documenthi!");
        boolean boolean8 = elements6.hasClass("#document#documenthi!#root=&quot;hi!&quot;");
        int int10 = elements6.indexOf((java.lang.Object) "hi!=\"#root\"");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test2904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2904");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded(" data=\"org.jsoup.select.selector$selectorparseexception:\" <!--#document-->=\" hi!\"", " hi!=\"#root\"");
        java.lang.String str3 = textNode2.nodeName();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node5 = textNode2.childNode(4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 4, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#text" + "'", str3, "#text");
    }

    @Test
    public void test2905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2905");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        java.lang.String str4 = elements3.val();
        java.lang.Object obj5 = null;
        int int6 = elements3.lastIndexOf(obj5);
        org.jsoup.select.Elements elements8 = elements3.eq((int) '#');
        boolean boolean10 = elements3.hasAttr("#root");
        int int12 = elements3.indexOf((java.lang.Object) (byte) 100);
        org.jsoup.select.Elements elements14 = elements3.addClass("");
        org.jsoup.nodes.Document document16 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element19 = document16.attr("hi!", "#root");
        org.jsoup.nodes.Attributes attributes20 = document16.attributes();
        org.jsoup.nodes.Document document21 = document16.normalise();
        java.lang.String str22 = document16.title();
        org.jsoup.select.Elements elements24 = document16.getElementsByIndexEquals((int) (short) 0);
        boolean boolean25 = elements3.add((org.jsoup.nodes.Element) document16);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(attributes20);
        org.junit.Assert.assertNotNull(document21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(elements24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test2906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2906");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element5 = document1.prepend("#document");
        org.jsoup.nodes.Element element6 = element5.empty();
        org.jsoup.select.Elements elements8 = element5.getElementsByTag("org.jsoup.select.Selector$SelectorParseException: ");
        org.jsoup.select.Elements elements10 = elements8.removeClass("#root");
        org.jsoup.select.Elements elements12 = elements8.append("");
        java.lang.String str13 = elements12.text();
        int int14 = elements12.size();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test2907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2907");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("#root", "");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("#document");
        org.jsoup.nodes.TextNode textNode6 = textNode2.text(" class=\"hi!\"");
        java.lang.String str7 = textNode6.getWholeText();
        java.lang.String str8 = textNode6.getWholeText();
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertNotNull(textNode6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + " class=\"hi!\"" + "'", str7, " class=\"hi!\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + " class=\"hi!\"" + "'", str8, " class=\"hi!\"");
    }

    @Test
    public void test2908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2908");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parse("hi!");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("org.jsoup.select.selector$selectorparseexception:");
        org.jsoup.select.Elements elements5 = elements3.eq((int) (byte) 10);
        elements3.clear();
        java.lang.String str7 = elements3.outerHtml();
        java.lang.String str8 = elements3.text();
        java.lang.String str9 = elements3.outerHtml();
        org.jsoup.select.Elements elements11 = elements3.val("#document#documentdocument");
        java.lang.String str12 = elements11.val();
        org.jsoup.select.Elements elements13 = new org.jsoup.select.Elements((java.util.Collection<org.jsoup.nodes.Element>) elements11);
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test2909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2909");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("#root=\"\n&lt;!--#root--&gt;\"");
        org.junit.Assert.assertNotNull(document1);
    }

    @Test
    public void test2910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2910");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements5 = elements3.val("a");
        org.jsoup.select.Elements elements7 = elements3.toggleClass("");
        java.util.stream.Stream<org.jsoup.nodes.Element> elementStream8 = elements3.parallelStream();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(elementStream8);
    }

    @Test
    public void test2911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2911");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragmentRelaxed("hi!", "#data");
        java.lang.String str3 = document2.text();
        org.jsoup.nodes.Element element5 = document2.text("\n<!--#data-->");
        org.jsoup.nodes.Node node7 = document2.removeAttr("org.jsoup.select.selector$selectorparseexception: \n<!--#document-->=\"#document#document=&quot;#document#document&quot;\"");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(node7);
    }

    @Test
    public void test2912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2912");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.hasText();
        boolean boolean3 = document1.hasText();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        boolean boolean6 = document5.hasText();
        java.lang.String str7 = document5.nodeName();
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet10 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet10, strArray9);
        org.jsoup.nodes.Element element12 = document5.classNames((java.util.Set<java.lang.String>) strSet10);
        org.jsoup.nodes.Element element13 = document1.classNames((java.util.Set<java.lang.String>) strSet10);
        java.util.Set<java.lang.String> strSet14 = document1.classNames();
        org.jsoup.nodes.Element element16 = document1.getElementById("#document#document");
        org.jsoup.nodes.Element element18 = document1.createElement("hi!=\"#root\"");
        org.jsoup.select.Elements elements19 = element18.children();
        org.jsoup.nodes.Document document21 = org.jsoup.Jsoup.parse("hi!");
        org.jsoup.select.Elements elements24 = document21.getElementsByAttributeValue("hi!", "hi!");
        org.jsoup.select.Selector.SelectorParseException selectorParseException26 = new org.jsoup.select.Selector.SelectorParseException("");
        boolean boolean27 = elements24.contains((java.lang.Object) "");
        boolean boolean29 = elements24.is("[]");
        org.jsoup.nodes.Document document31 = new org.jsoup.nodes.Document("");
        boolean boolean32 = document31.hasText();
        java.lang.String str33 = document31.nodeName();
        java.lang.String str34 = document31.val();
        java.lang.String str35 = document31.outerHtml();
        java.lang.String[] strArray38 = new java.lang.String[] { "\n<!--#document-->", "#data" };
        java.util.LinkedHashSet<java.lang.String> strSet39 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet39, strArray38);
        org.jsoup.nodes.Element element41 = document31.classNames((java.util.Set<java.lang.String>) strSet39);
        java.util.LinkedHashSet[] linkedHashSetArray43 = new java.util.LinkedHashSet[1];
        @SuppressWarnings("unchecked")
        java.util.LinkedHashSet<java.lang.String>[] strSetArray44 = (java.util.LinkedHashSet<java.lang.String>[]) linkedHashSetArray43;
        strSetArray44[0] = strSet39;
        java.util.LinkedHashSet<java.lang.String>[] strSetArray47 = elements24.toArray(strSetArray44);
        org.jsoup.select.Elements elements49 = elements24.select("org.jsoup.select.Selector$SelectorParseException: \n<!--#document-->");
        org.jsoup.select.Elements elements51 = elements24.val("hi!");
        org.jsoup.select.Elements elements53 = elements24.toggleClass("\n<body class=\"hi!\">\n #document\n</body>");
        org.jsoup.select.Elements elements55 = elements53.eq((int) '#');
        boolean boolean56 = elements19.removeAll((java.util.Collection<org.jsoup.nodes.Element>) elements55);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#document" + "'", str7, "#document");
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNull(element16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertNotNull(document21);
        org.junit.Assert.assertNotNull(elements24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "#document" + "'", str33, "#document");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(element41);
        org.junit.Assert.assertNotNull(linkedHashSetArray43);
        org.junit.Assert.assertNotNull(strSetArray44);
        org.junit.Assert.assertNotNull(strSetArray47);
        org.junit.Assert.assertNotNull(elements49);
        org.junit.Assert.assertNotNull(elements51);
        org.junit.Assert.assertNotNull(elements53);
        org.junit.Assert.assertNotNull(elements55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
    }

    @Test
    public void test2913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2913");
        org.jsoup.nodes.DataNode dataNode2 = org.jsoup.nodes.DataNode.createFromEncoded("<html>\n<head>\n <title>&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n #root \n&lt;/body&gt;\n&lt;/html&gt;</title>\n</head>\n<body>\n</body>\n</html>", "");
        java.lang.String str3 = dataNode2.toString();
        java.lang.String str4 = dataNode2.nodeName();
        org.junit.Assert.assertNotNull(dataNode2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<html>\n<head>\n <title><html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html></title>\n</head>\n<body>\n</body>\n</html>" + "'", str3, "<html>\n<head>\n <title><html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html></title>\n</head>\n<body>\n</body>\n</html>");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#data" + "'", str4, "#data");
    }

    @Test
    public void test2914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2914");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        java.lang.String str5 = elements3.attr("#root");
        org.jsoup.nodes.Document document7 = new org.jsoup.nodes.Document("");
        boolean boolean8 = document7.hasText();
        java.lang.String str9 = document7.nodeName();
        org.jsoup.select.Elements elements10 = document7.children();
        org.jsoup.nodes.Element element12 = document7.prependElement("[#, d, o, c, u, m, e, n, t]");
        int int13 = elements3.lastIndexOf((java.lang.Object) document7);
        org.jsoup.nodes.Element element14 = document7.parent();
        org.jsoup.nodes.Element element16 = document7.append("#root=\"hi!\"");
        java.lang.String str17 = document7.outerHtml();
        org.jsoup.select.Elements elements19 = document7.getElementsByClass("<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>\n<html> \n<head> \n</head> \n<body>\n  #root  \n</body>\n</html>");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#document" + "'", str9, "#document");
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNull(element14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "<[#, d, o, c, u, m, e, n, t]>\n</[#, d, o, c, u, m, e, n, t]>#root=&quot;hi!&quot;" + "'", str17, "<[#, d, o, c, u, m, e, n, t]>\n</[#, d, o, c, u, m, e, n, t]>#root=&quot;hi!&quot;");
        org.junit.Assert.assertNotNull(elements19);
    }

    @Test
    public void test2915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2915");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("\n&lt;!--#data--&gt;", "body");
    }

    @Test
    public void test2916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2916");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("org.jsoup.select.Selector$SelectorParseException: ");
        boolean boolean2 = tag1.isData();
        boolean boolean3 = tag1.requiresSpecificParent();
        boolean boolean4 = tag1.isBlock();
        org.jsoup.parser.Tag tag6 = org.jsoup.parser.Tag.valueOf("org.jsoup.select.Selector$SelectorParseException: ");
        boolean boolean7 = tag6.isData();
        boolean boolean8 = tag6.requiresSpecificParent();
        boolean boolean9 = tag6.isBlock();
        boolean boolean10 = tag1.canContain(tag6);
        boolean boolean11 = tag1.isBlock();
        boolean boolean12 = tag1.isData();
        java.lang.String str13 = tag1.getName();
        boolean boolean14 = tag1.requiresSpecificParent();
        boolean boolean15 = tag1.requiresSpecificParent();
        org.jsoup.nodes.Document document17 = new org.jsoup.nodes.Document("");
        boolean boolean18 = document17.hasText();
        java.lang.String str19 = document17.nodeName();
        java.lang.String[] strArray21 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet22 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet22, strArray21);
        org.jsoup.nodes.Element element24 = document17.classNames((java.util.Set<java.lang.String>) strSet22);
        org.jsoup.nodes.Element element26 = document17.append("#document");
        org.jsoup.nodes.Element element28 = document17.prepend("#document");
        org.jsoup.nodes.Attributes attributes29 = element28.attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator30 = attributes29.spliterator();
        boolean boolean31 = tag1.equals((java.lang.Object) attributes29);
        boolean boolean32 = tag1.isEmpty();
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "org.jsoup.select.selector$selectorparseexception:" + "'", str13, "org.jsoup.select.selector$selectorparseexception:");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "#document" + "'", str19, "#document");
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertNotNull(attributes29);
        org.junit.Assert.assertNotNull(attributeSpliterator30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test2917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2917");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.hasText();
        java.lang.String str3 = document1.nodeName();
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        org.jsoup.nodes.Element element8 = document1.classNames((java.util.Set<java.lang.String>) strSet6);
        org.jsoup.nodes.Element element10 = document1.append("#document");
        org.jsoup.nodes.Element element12 = document1.prepend("#document");
        org.jsoup.nodes.Attributes attributes13 = element12.attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator14 = attributes13.spliterator();
        java.lang.String str16 = attributes13.get("hi!");
        org.jsoup.nodes.Document document19 = org.jsoup.parser.Parser.parse("#root", "");
        org.jsoup.nodes.Element element22 = document19.attr("#root", "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        boolean boolean23 = attributes13.equals((java.lang.Object) "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        org.jsoup.parser.Tag tag25 = org.jsoup.parser.Tag.valueOf("org.jsoup.select.Selector$SelectorParseException: ");
        boolean boolean26 = tag25.isData();
        org.jsoup.nodes.Attributes attributes28 = new org.jsoup.nodes.Attributes();
        int int29 = attributes28.size();
        java.lang.String str30 = attributes28.html();
        org.jsoup.nodes.Element element31 = new org.jsoup.nodes.Element(tag25, "org.jsoup.select.selector$selectorparseexception:", attributes28);
        org.jsoup.nodes.Attribute attribute34 = org.jsoup.nodes.Attribute.createFromEncoded("hi!", "hi!");
        attribute34.setKey("#root");
        java.lang.String str37 = attribute34.html();
        attributes28.put(attribute34);
        attributes13.addAll(attributes28);
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor40 = attributes13.iterator();
        java.lang.String str41 = attributes13.html();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator42 = attributes13.spliterator();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertNotNull(attributeSpliterator14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(document19);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(tag25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(attribute34);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "#root=\"hi!\"" + "'", str37, "#root=\"hi!\"");
        org.junit.Assert.assertNotNull(attributeItor40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + " class=\"hi!\" #root=\"hi!\"" + "'", str41, " class=\"hi!\" #root=\"hi!\"");
        org.junit.Assert.assertNotNull(attributeSpliterator42);
    }

    @Test
    public void test2918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2918");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Document document2 = document1.normalise();
        org.jsoup.nodes.Element element3 = document1.head();
        java.lang.String str4 = element3.id();
        java.lang.String str6 = element3.absUrl("#document#documenthi!");
        org.jsoup.select.Elements elements7 = element3.getAllElements();
        org.jsoup.select.Elements elements9 = elements7.wrap("[#, d, o, c, u, m, e, n, t]");
        org.jsoup.nodes.Document document11 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements13 = document11.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element15 = document11.prepend("#document");
        org.jsoup.nodes.Element element16 = element15.empty();
        org.jsoup.nodes.Document document18 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements20 = document18.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements22 = elements20.prepend("");
        org.jsoup.select.Elements elements24 = elements22.removeAttr("");
        org.jsoup.nodes.Document document26 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements28 = document26.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements30 = elements28.prepend("");
        org.jsoup.select.Elements elements32 = elements30.removeAttr("");
        boolean boolean33 = elements22.containsAll((java.util.Collection<org.jsoup.nodes.Element>) elements30);
        org.jsoup.nodes.Document document35 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements37 = document35.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements39 = elements37.prepend("");
        org.jsoup.select.Elements elements41 = elements39.removeAttr("");
        org.jsoup.nodes.Document document43 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements45 = document43.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements47 = elements45.prepend("");
        org.jsoup.select.Elements elements49 = elements47.removeAttr("");
        boolean boolean50 = elements39.containsAll((java.util.Collection<org.jsoup.nodes.Element>) elements47);
        org.jsoup.select.Elements elements52 = elements47.wrap("#root");
        boolean boolean53 = elements30.containsAll((java.util.Collection<org.jsoup.nodes.Element>) elements52);
        org.jsoup.select.Elements elements54 = new org.jsoup.select.Elements((java.util.Collection<org.jsoup.nodes.Element>) elements30);
        org.jsoup.nodes.Element element55 = elements30.first();
        org.jsoup.nodes.Document document58 = org.jsoup.parser.Parser.parseBodyFragment("\n<!--#root-->", "#root");
        org.jsoup.nodes.Element element60 = document58.removeClass("#root=\"hi!\"");
        boolean boolean61 = elements30.add(element60);
        org.jsoup.nodes.Element element62 = element16.appendChild((org.jsoup.nodes.Node) element60);
        boolean boolean63 = elements9.equals((java.lang.Object) element16);
        org.jsoup.select.Elements elements65 = elements9.val("");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(elements20);
        org.junit.Assert.assertNotNull(elements22);
        org.junit.Assert.assertNotNull(elements24);
        org.junit.Assert.assertNotNull(elements28);
        org.junit.Assert.assertNotNull(elements30);
        org.junit.Assert.assertNotNull(elements32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(elements37);
        org.junit.Assert.assertNotNull(elements39);
        org.junit.Assert.assertNotNull(elements41);
        org.junit.Assert.assertNotNull(elements45);
        org.junit.Assert.assertNotNull(elements47);
        org.junit.Assert.assertNotNull(elements49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(elements52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNull(element55);
        org.junit.Assert.assertNotNull(document58);
        org.junit.Assert.assertNotNull(element60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(element62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(elements65);
    }

    @Test
    public void test2919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2919");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        int int1 = attributes0.size();
        java.lang.String str2 = attributes0.html();
        java.lang.String str3 = attributes0.html();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator4 = attributes0.spliterator();
        boolean boolean6 = attributes0.hasKey("");
        org.jsoup.parser.Tag tag8 = org.jsoup.parser.Tag.valueOf("org.jsoup.select.Selector$SelectorParseException: ");
        boolean boolean9 = tag8.isData();
        org.jsoup.nodes.Attributes attributes11 = new org.jsoup.nodes.Attributes();
        int int12 = attributes11.size();
        java.lang.String str13 = attributes11.html();
        org.jsoup.nodes.Element element14 = new org.jsoup.nodes.Element(tag8, "org.jsoup.select.selector$selectorparseexception:", attributes11);
        org.jsoup.nodes.Attribute attribute17 = org.jsoup.nodes.Attribute.createFromEncoded("hi!", "hi!");
        attribute17.setKey("#root");
        java.lang.String str20 = attribute17.html();
        attributes11.put(attribute17);
        java.lang.String str22 = attribute17.html();
        attribute17.setValue("<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        attributes0.put(attribute17);
        java.lang.String str27 = attributes0.get("[#, d, o, c, u, m, e, n, t, #, d, o, c, u, m, e, n, t, =, \", #, d, o, c, u, m, e, n, t, #, d, o, c, u, m, e, n, t, \"]");
        // The following exception was thrown during execution in test generation
        try {
            attributes0.put("", "hi! #data <html>\n<head>\n</head>\n<body>\n</body>\n</html>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(attributeSpliterator4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(attribute17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "#root=\"hi!\"" + "'", str20, "#root=\"hi!\"");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "#root=\"hi!\"" + "'", str22, "#root=\"hi!\"");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test2920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2920");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("org.jsoup.select.Selector$SelectorParseException: ");
        boolean boolean2 = tag1.isData();
        boolean boolean3 = tag1.requiresSpecificParent();
        boolean boolean4 = tag1.isBlock();
        org.jsoup.parser.Tag tag6 = org.jsoup.parser.Tag.valueOf("org.jsoup.select.Selector$SelectorParseException: ");
        boolean boolean7 = tag6.isData();
        boolean boolean8 = tag6.requiresSpecificParent();
        boolean boolean9 = tag6.isBlock();
        boolean boolean10 = tag1.canContain(tag6);
        org.jsoup.nodes.Document document13 = new org.jsoup.nodes.Document("");
        boolean boolean14 = document13.hasText();
        java.lang.String str15 = document13.nodeName();
        org.jsoup.nodes.Document document17 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element20 = document17.attr("hi!", "#root");
        org.jsoup.nodes.Attributes attributes21 = document17.attributes();
        boolean boolean22 = document13.equals((java.lang.Object) attributes21);
        org.jsoup.nodes.Element element23 = new org.jsoup.nodes.Element(tag1, "#document#document=\"#document#document\"", attributes21);
        java.util.Set<java.lang.String> strSet24 = element23.classNames();
        java.lang.String str26 = element23.absUrl("hi!=\"#root=&quot;hi!&quot;\"");
        java.lang.String str27 = element23.nodeName();
        org.jsoup.nodes.Element element29 = element23.toggleClass("#text");
        org.jsoup.nodes.Document document31 = new org.jsoup.nodes.Document("");
        boolean boolean32 = document31.hasText();
        java.lang.String str33 = document31.nodeName();
        java.lang.String[] strArray35 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet36 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet36, strArray35);
        org.jsoup.nodes.Element element38 = document31.classNames((java.util.Set<java.lang.String>) strSet36);
        org.jsoup.nodes.Element element40 = document31.append("#document");
        org.jsoup.nodes.Element element42 = document31.prepend("#document");
        org.jsoup.select.Elements elements43 = document31.parents();
        org.jsoup.select.Elements elements44 = document31.children();
        org.jsoup.nodes.Element element46 = document31.createElement("org.jsoup.select.Selector$SelectorParseException:");
        org.jsoup.nodes.Element element47 = element29.appendChild((org.jsoup.nodes.Node) element46);
        org.jsoup.nodes.Node node50 = element46.attr("<html> \n <head> \n </head> \n <body>\n   #root  \n </body>\n</html><<?#document#document>>\n</<?#document#document>>", "");
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "#document" + "'", str15, "#document");
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(attributes21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(strSet24);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "org.jsoup.select.selector$selectorparseexception:" + "'", str27, "org.jsoup.select.selector$selectorparseexception:");
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "#document" + "'", str33, "#document");
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(element38);
        org.junit.Assert.assertNotNull(element40);
        org.junit.Assert.assertNotNull(element42);
        org.junit.Assert.assertNotNull(elements43);
        org.junit.Assert.assertNotNull(elements44);
        org.junit.Assert.assertNotNull(element46);
        org.junit.Assert.assertNotNull(element47);
        org.junit.Assert.assertNotNull(node50);
    }

    @Test
    public void test2921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest5.test2921");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        int int1 = attributes0.size();
        org.jsoup.nodes.Document document3 = new org.jsoup.nodes.Document("");
        boolean boolean4 = document3.hasText();
        java.lang.String str5 = document3.nodeName();
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet8 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet8, strArray7);
        org.jsoup.nodes.Element element10 = document3.classNames((java.util.Set<java.lang.String>) strSet8);
        org.jsoup.nodes.Element element12 = document3.append("#document");
        org.jsoup.nodes.Element element14 = document3.prepend("#document");
        org.jsoup.nodes.Attributes attributes15 = element14.attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator16 = attributes15.spliterator();
        org.jsoup.nodes.Attributes attributes17 = new org.jsoup.nodes.Attributes();
        int int18 = attributes17.size();
        java.lang.String str19 = attributes17.html();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor20 = attributes17.iterator();
        boolean boolean21 = attributes15.equals((java.lang.Object) attributes17);
        attributes0.addAll(attributes15);
        int int23 = attributes0.size();
        org.jsoup.nodes.Attributes attributes24 = new org.jsoup.nodes.Attributes();
        int int25 = attributes24.size();
        org.jsoup.nodes.Document document27 = new org.jsoup.nodes.Document("");
        boolean boolean28 = document27.hasText();
        java.lang.String str29 = document27.nodeName();
        java.lang.String[] strArray31 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet32 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet32, strArray31);
        org.jsoup.nodes.Element element34 = document27.classNames((java.util.Set<java.lang.String>) strSet32);
        org.jsoup.nodes.Element element36 = document27.append("#document");
        org.jsoup.nodes.Element element38 = document27.prepend("#document");
        org.jsoup.nodes.Attributes attributes39 = element38.attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator40 = attributes39.spliterator();
        org.jsoup.nodes.Attributes attributes41 = new org.jsoup.nodes.Attributes();
        int int42 = attributes41.size();
        java.lang.String str43 = attributes41.html();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor44 = attributes41.iterator();
        boolean boolean45 = attributes39.equals((java.lang.Object) attributes41);
        attributes24.addAll(attributes39);
        attributes0.addAll(attributes24);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#document" + "'", str5, "#document");
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(attributes15);
        org.junit.Assert.assertNotNull(attributeSpliterator16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(attributeItor20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "#document" + "'", str29, "#document");
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(element34);
        org.junit.Assert.assertNotNull(element36);
        org.junit.Assert.assertNotNull(element38);
        org.junit.Assert.assertNotNull(attributes39);
        org.junit.Assert.assertNotNull(attributeSpliterator40);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertNotNull(attributeItor44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }
}

