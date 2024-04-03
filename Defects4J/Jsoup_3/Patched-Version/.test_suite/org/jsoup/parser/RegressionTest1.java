package org.jsoup.parser;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

    public static boolean debug = false;

    @Test
    public void test0501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0501");
        org.jsoup.safety.Whitelist whitelist2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.jsoup.Jsoup.clean("", "hi!", whitelist2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0502");
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
        java.lang.String str17 = document1.title();
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0503");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!", "hi!");
        attribute2.setValue("#root=\"hi!\"");
        java.lang.String str5 = attribute2.html();
        java.lang.String str6 = attribute2.toString();
        attribute2.setValue("");
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!=\"#root=&quot;hi!&quot;\"" + "'", str5, "hi!=\"#root=&quot;hi!&quot;\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!=\"#root=&quot;hi!&quot;\"" + "'", str6, "hi!=\"#root=&quot;hi!&quot;\"");
    }

    @Test
    public void test0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0504");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element4 = document1.attr("hi!", "#root");
        org.jsoup.select.Elements elements6 = element4.getElementsByTag("\n<!--#root-->");
        boolean boolean8 = elements6.hasAttr("\n<!--#root-->");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Element> elementList11 = elements6.subList((int) (byte) 100, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(100) > toIndex(-1)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0505");
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
        org.jsoup.select.Elements elements17 = element15.getElementsByIndexLessThan((int) (short) 0);
        java.util.stream.Stream<org.jsoup.nodes.Element> elementStream18 = elements17.parallelStream();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertNotNull(elementStream18);
    }

    @Test
    public void test0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0506");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded(" class=\"hi!\"", "org.jsoup.select.Selector$SelectorParseException: ");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("#data");
        java.lang.String str5 = textNode4.text();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#data" + "'", str5, "#data");
    }

    @Test
    public void test0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0507");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("#root", "");
        java.lang.String str3 = document2.outerHtml();
        org.jsoup.nodes.Element element5 = document2.append("<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        org.jsoup.select.Elements elements8 = document2.getElementsByAttributeValueStarting("#root=\"hi!\"", "org.jsoup.select.Selector$SelectorParseException: ");
        org.jsoup.nodes.Element element10 = document2.prepend("#root=\"hi!\"");
        java.lang.String str11 = element10.id();
        org.jsoup.select.Elements elements14 = element10.getElementsByAttributeValueContaining("body", "#root=\"#root=&quot;hi!&quot;\"");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>" + "'", str3, "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(elements14);
    }

    @Test
    public void test0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0508");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element15 = element13.child(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
    }

    @Test
    public void test0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0509");
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
        org.jsoup.select.Elements elements17 = elements15.prepend("<html> \n <head> \n </head> \n <body>\n   #root  \n </body>\n</html>");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(elementArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(elementSpliterator11);
        org.junit.Assert.assertNotNull(elementSpliterator12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(elements17);
    }

    @Test
    public void test0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0510");
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
        org.jsoup.parser.Tag tag20 = org.jsoup.parser.Tag.valueOf("#declaration");
        java.lang.String str21 = tag20.toString();
        boolean boolean22 = tag18.isValidParent(tag20);
        org.jsoup.nodes.Document document26 = org.jsoup.parser.Parser.parse("#root", "\n<!--#root-->");
        org.jsoup.select.Elements elements27 = org.jsoup.select.Selector.select("#declaration", (org.jsoup.nodes.Element) document26);
        org.jsoup.nodes.Element element28 = document26.body();
        org.jsoup.nodes.Document document30 = new org.jsoup.nodes.Document("");
        boolean boolean31 = document30.hasText();
        java.lang.String str32 = document30.nodeName();
        java.lang.String[] strArray34 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet35 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet35, strArray34);
        org.jsoup.nodes.Element element37 = document30.classNames((java.util.Set<java.lang.String>) strSet35);
        org.jsoup.nodes.Element element39 = document30.append("#document");
        org.jsoup.nodes.Element element41 = document30.prepend("#document");
        org.jsoup.select.Elements elements42 = document30.parents();
        org.jsoup.nodes.Element element43 = element28.appendChild((org.jsoup.nodes.Node) document30);
        org.jsoup.select.Elements elements44 = element43.getAllElements();
        boolean boolean45 = tag20.equals((java.lang.Object) element43);
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
        org.junit.Assert.assertNotNull(tag20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "#declaration" + "'", str21, "#declaration");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(document26);
        org.junit.Assert.assertNotNull(elements27);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "#document" + "'", str32, "#document");
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(element37);
        org.junit.Assert.assertNotNull(element39);
        org.junit.Assert.assertNotNull(element41);
        org.junit.Assert.assertNotNull(elements42);
        org.junit.Assert.assertNotNull(element43);
        org.junit.Assert.assertNotNull(elements44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0511");
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
    }

    @Test
    public void test0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0512");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!", "hi!");
        attribute2.setValue("#root=\"hi!\"");
        java.lang.String str5 = attribute2.getKey();
        java.lang.String str6 = attribute2.getKey();
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0513");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements5 = elements3.prepend("");
        org.jsoup.select.Elements elements7 = elements5.removeAttr("");
        org.jsoup.select.Elements elements9 = elements7.removeAttr("hi!");
        org.jsoup.nodes.Document document11 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements13 = document11.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements15 = elements13.prepend("");
        org.jsoup.select.Elements elements17 = elements15.removeAttr("");
        org.jsoup.nodes.Document document19 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements21 = document19.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements23 = elements21.prepend("");
        org.jsoup.select.Elements elements25 = elements23.removeAttr("");
        boolean boolean26 = elements15.containsAll((java.util.Collection<org.jsoup.nodes.Element>) elements23);
        org.jsoup.nodes.Document document28 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements30 = document28.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements32 = elements30.prepend("");
        org.jsoup.select.Elements elements34 = elements32.removeAttr("");
        org.jsoup.nodes.Document document36 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements38 = document36.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements40 = elements38.prepend("");
        org.jsoup.select.Elements elements42 = elements40.removeAttr("");
        boolean boolean43 = elements32.containsAll((java.util.Collection<org.jsoup.nodes.Element>) elements40);
        org.jsoup.select.Elements elements45 = elements40.wrap("#root");
        boolean boolean46 = elements23.containsAll((java.util.Collection<org.jsoup.nodes.Element>) elements45);
        boolean boolean47 = elements9.retainAll((java.util.Collection<org.jsoup.nodes.Element>) elements45);
        org.jsoup.select.Elements elements48 = elements9.parents();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertNotNull(elements21);
        org.junit.Assert.assertNotNull(elements23);
        org.junit.Assert.assertNotNull(elements25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(elements30);
        org.junit.Assert.assertNotNull(elements32);
        org.junit.Assert.assertNotNull(elements34);
        org.junit.Assert.assertNotNull(elements38);
        org.junit.Assert.assertNotNull(elements40);
        org.junit.Assert.assertNotNull(elements42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(elements45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(elements48);
    }

    @Test
    public void test0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0514");
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
        boolean boolean35 = element13.hasClass("body");
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
    }

    @Test
    public void test0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0515");
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
        java.lang.String str16 = element12.html();
        java.lang.String str17 = element12.html();
        element12.setBaseUri("\n&lt;!--#root--&gt;");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "#document#documenthi!" + "'", str16, "#document#documenthi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "#document#documenthi!" + "'", str17, "#document#documenthi!");
    }

    @Test
    public void test0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0516");
        org.jsoup.safety.Whitelist whitelist1 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.jsoup.Jsoup.isValid("#document#documenthi!#root=&quot;hi!&quot;", whitelist1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0517");
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
        elements13.clear();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(elementSpliterator17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0518");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("#root", "");
        boolean boolean3 = textNode2.isBlank();
        java.lang.String str4 = textNode2.text();
        java.lang.String str5 = textNode2.toString();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#root" + "'", str4, "#root");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#root" + "'", str5, "#root");
    }

    @Test
    public void test0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0519");
        org.jsoup.nodes.DataNode dataNode2 = new org.jsoup.nodes.DataNode("<?#document#document>", "<?>");
    }

    @Test
    public void test0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0520");
        org.jsoup.select.Selector.SelectorParseException selectorParseException1 = new org.jsoup.select.Selector.SelectorParseException("org.jsoup.select.selector$selectorparseexception:");
        org.jsoup.select.Selector.SelectorParseException selectorParseException3 = new org.jsoup.select.Selector.SelectorParseException("org.jsoup.select.selector$selectorparseexception:");
        java.lang.Throwable[] throwableArray4 = selectorParseException3.getSuppressed();
        org.jsoup.select.Selector.SelectorParseException selectorParseException6 = new org.jsoup.select.Selector.SelectorParseException("\n<!--#document-->");
        selectorParseException3.addSuppressed((java.lang.Throwable) selectorParseException6);
        selectorParseException1.addSuppressed((java.lang.Throwable) selectorParseException6);
        java.lang.Throwable[] throwableArray9 = selectorParseException1.getSuppressed();
        java.lang.String str10 = selectorParseException1.toString();
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "org.jsoup.select.Selector$SelectorParseException: org.jsoup.select.selector$selectorparseexception:" + "'", str10, "org.jsoup.select.Selector$SelectorParseException: org.jsoup.select.selector$selectorparseexception:");
    }

    @Test
    public void test0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0521");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        java.lang.String str4 = document1.nodeName();
        java.lang.String str5 = document1.outerHtml();
        boolean boolean7 = document1.hasAttr("#document#document");
        org.jsoup.select.Elements elements10 = document1.getElementsByAttributeValueEnding("#document", "#comment");
        java.lang.String str11 = document1.toString();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#document" + "'", str4, "#document");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0522");
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
        org.jsoup.select.Elements elements19 = element17.getElementsByIndexLessThan((-1));
        org.jsoup.select.Elements elements22 = element17.getElementsByAttributeValueStarting("hi!", "#comment");
        java.util.Spliterator<org.jsoup.nodes.Element> elementSpliterator23 = elements22.spliterator();
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
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertNotNull(elements22);
        org.junit.Assert.assertNotNull(elementSpliterator23);
    }

    @Test
    public void test0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0523");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        java.lang.String str4 = elements3.val();
        int int5 = elements3.size();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0524");
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
        boolean boolean19 = tag1.isEmpty();
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
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0525");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.hasText();
        java.lang.String str3 = document1.nodeName();
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        org.jsoup.nodes.Element element8 = document1.classNames((java.util.Set<java.lang.String>) strSet6);
        org.jsoup.nodes.Element element10 = document1.append("#document");
        org.jsoup.nodes.Element element12 = element10.html("");
        org.jsoup.nodes.Element element15 = element12.attr("org.jsoup.select.Selector$SelectorParseException: ", "#root");
        java.lang.String str16 = element12.toString();
        java.lang.String str17 = element12.html();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0526");
        org.jsoup.select.Selector.SelectorParseException selectorParseException1 = new org.jsoup.select.Selector.SelectorParseException("<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        org.jsoup.select.Selector.SelectorParseException selectorParseException3 = new org.jsoup.select.Selector.SelectorParseException("org.jsoup.select.selector$selectorparseexception:");
        java.lang.Throwable[] throwableArray4 = selectorParseException3.getSuppressed();
        org.jsoup.select.Selector.SelectorParseException selectorParseException6 = new org.jsoup.select.Selector.SelectorParseException("\n<!--#document-->");
        selectorParseException3.addSuppressed((java.lang.Throwable) selectorParseException6);
        org.jsoup.select.Selector.SelectorParseException selectorParseException9 = new org.jsoup.select.Selector.SelectorParseException("org.jsoup.select.selector$selectorparseexception:");
        java.lang.Throwable[] throwableArray10 = selectorParseException9.getSuppressed();
        org.jsoup.select.Selector.SelectorParseException selectorParseException12 = new org.jsoup.select.Selector.SelectorParseException("\n<!--#document-->");
        selectorParseException9.addSuppressed((java.lang.Throwable) selectorParseException12);
        selectorParseException3.addSuppressed((java.lang.Throwable) selectorParseException9);
        java.lang.Throwable[] throwableArray15 = selectorParseException3.getSuppressed();
        selectorParseException1.addSuppressed((java.lang.Throwable) selectorParseException3);
        org.jsoup.select.Selector.SelectorParseException selectorParseException18 = new org.jsoup.select.Selector.SelectorParseException("org.jsoup.select.selector$selectorparseexception:");
        java.lang.Throwable[] throwableArray19 = selectorParseException18.getSuppressed();
        selectorParseException1.addSuppressed((java.lang.Throwable) selectorParseException18);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(throwableArray19);
    }

    @Test
    public void test0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0527");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("org.jsoup.select.Selector$SelectorParseException: ");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Document document4 = document3.normalise();
        org.jsoup.nodes.Element element5 = document3.head();
        org.jsoup.nodes.Element element7 = element5.append("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element9 = element5.wrap("#text");
        boolean boolean10 = tag1.equals((java.lang.Object) element9);
        boolean boolean11 = tag1.preserveWhitespace();
        org.jsoup.parser.Tag tag13 = org.jsoup.parser.Tag.valueOf("org.jsoup.select.Selector$SelectorParseException: ");
        boolean boolean14 = tag13.isData();
        boolean boolean15 = tag13.requiresSpecificParent();
        boolean boolean16 = tag13.isBlock();
        org.jsoup.parser.Tag tag18 = org.jsoup.parser.Tag.valueOf("org.jsoup.select.Selector$SelectorParseException: ");
        boolean boolean19 = tag18.isData();
        boolean boolean20 = tag18.requiresSpecificParent();
        boolean boolean21 = tag18.isBlock();
        boolean boolean22 = tag13.canContain(tag18);
        boolean boolean23 = tag13.isBlock();
        boolean boolean24 = tag13.isData();
        java.lang.String str25 = tag13.getName();
        boolean boolean26 = tag13.requiresSpecificParent();
        org.jsoup.parser.Tag tag28 = org.jsoup.parser.Tag.valueOf("#root");
        boolean boolean29 = tag28.isInline();
        boolean boolean30 = tag13.canContain(tag28);
        org.jsoup.parser.Tag tag31 = tag28.getImplicitParent();
        org.jsoup.parser.Tag tag32 = tag28.getImplicitParent();
        boolean boolean33 = tag1.canContain(tag28);
        java.lang.String str34 = tag28.getName();
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(document4);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNull(element9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(tag13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(tag18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "org.jsoup.select.selector$selectorparseexception:" + "'", str25, "org.jsoup.select.selector$selectorparseexception:");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(tag28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(tag31);
        org.junit.Assert.assertNotNull(tag32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "#root" + "'", str34, "#root");
    }

    @Test
    public void test0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0528");
        org.jsoup.nodes.Element[] elementArray0 = new org.jsoup.nodes.Element[] {};
        org.jsoup.select.Elements elements1 = new org.jsoup.select.Elements(elementArray0);
        org.jsoup.select.Elements elements2 = new org.jsoup.select.Elements(elementArray0);
        org.jsoup.select.Elements elements4 = elements2.select("<[#, d, o, c, u, m, e, n, t]>\n</[#, d, o, c, u, m, e, n, t]>#root=&quot;hi!&quot;");
        org.junit.Assert.assertNotNull(elementArray0);
        org.junit.Assert.assertNotNull(elements4);
    }

    @Test
    public void test0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0529");
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
        org.jsoup.select.Elements elements18 = elements10.eq((int) (byte) 100);
        org.jsoup.select.Elements elements20 = elements18.wrap("org.jsoup.select.Selector$SelectorParseException: \n<!--#document-->");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertNotNull(elements20);
    }

    @Test
    public void test0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0530");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Document document2 = document1.normalise();
        org.jsoup.nodes.Element element3 = document1.head();
        java.lang.String str4 = element3.id();
        java.lang.String str6 = element3.absUrl("#document#documenthi!");
        org.jsoup.select.Elements elements7 = element3.getAllElements();
        org.jsoup.select.Elements elements9 = elements7.wrap("[#, d, o, c, u, m, e, n, t]");
        org.jsoup.nodes.Document document11 = new org.jsoup.nodes.Document("");
        boolean boolean12 = document11.hasText();
        java.lang.String str13 = document11.nodeName();
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet16 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet16, strArray15);
        org.jsoup.nodes.Element element18 = document11.classNames((java.util.Set<java.lang.String>) strSet16);
        org.jsoup.nodes.Element element20 = document11.append("#document");
        org.jsoup.nodes.Element element22 = element20.html("");
        org.jsoup.select.Elements elements25 = element20.getElementsByAttributeValueNot("#root", "org.jsoup.select.Selector$SelectorParseException: ");
        org.jsoup.select.Elements elements27 = element20.getElementsByClass("<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        org.jsoup.nodes.Attributes attributes28 = new org.jsoup.nodes.Attributes();
        int int29 = attributes28.size();
        org.jsoup.nodes.Document document31 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements33 = document31.getElementsByAttribute("hi!");
        java.lang.String str34 = elements33.val();
        java.lang.Object obj35 = null;
        int int36 = elements33.lastIndexOf(obj35);
        org.jsoup.select.Elements elements38 = elements33.eq((int) '#');
        boolean boolean39 = attributes28.equals((java.lang.Object) elements38);
        boolean boolean41 = elements38.hasClass("<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        org.jsoup.nodes.Element element42 = elements38.last();
        org.jsoup.select.Elements elements44 = elements38.removeClass("#root=\"hi!\"");
        org.jsoup.select.Elements elements46 = elements44.val("");
        boolean boolean47 = elements27.retainAll((java.util.Collection<org.jsoup.nodes.Element>) elements46);
        boolean boolean48 = elements9.containsAll((java.util.Collection<org.jsoup.nodes.Element>) elements27);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element50 = elements9.remove(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "#document" + "'", str13, "#document");
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(elements25);
        org.junit.Assert.assertNotNull(elements27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(elements33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNotNull(elements38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNull(element42);
        org.junit.Assert.assertNotNull(elements44);
        org.junit.Assert.assertNotNull(elements46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
    }

    @Test
    public void test0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0531");
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
        boolean boolean22 = element21.isBlock();
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0532");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("#root", "");
        org.jsoup.nodes.Element element5 = document2.attr("#root", "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        java.lang.String str6 = document2.tagName();
        org.jsoup.nodes.Element element7 = document2.parent();
        // The following exception was thrown during execution in test generation
        try {
            document2.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#root" + "'", str6, "#root");
        org.junit.Assert.assertNull(element7);
    }

    @Test
    public void test0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0533");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("#document", "#root");
        org.jsoup.nodes.Node node3 = comment2.parent();
        java.lang.String str4 = comment2.getData();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#document" + "'", str4, "#document");
    }

    @Test
    public void test0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0534");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element5 = document1.prepend("#document");
        org.jsoup.select.Elements elements7 = element5.getElementsByAttribute("hi!");
        java.lang.String str8 = elements7.val();
        org.jsoup.select.Elements elements10 = elements7.toggleClass("#document#document");
        org.jsoup.nodes.Document document13 = new org.jsoup.nodes.Document("");
        boolean boolean14 = document13.hasText();
        java.lang.String str15 = document13.nodeName();
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet18 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet18, strArray17);
        org.jsoup.nodes.Element element20 = document13.classNames((java.util.Set<java.lang.String>) strSet18);
        org.jsoup.nodes.Element element22 = document13.append("#document");
        org.jsoup.nodes.Element element24 = element22.html("<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element25 = elements10.set((int) (short) 1, element24);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "#document" + "'", str15, "#document");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(element24);
    }

    @Test
    public void test0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0535");
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
            org.jsoup.nodes.Element element35 = elements33.get((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
    public void test0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0536");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("#root");
        boolean boolean2 = tag1.isInline();
        boolean boolean3 = tag1.isInline();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        boolean boolean6 = document5.hasText();
        java.lang.String str7 = document5.nodeName();
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet10 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet10, strArray9);
        org.jsoup.nodes.Element element12 = document5.classNames((java.util.Set<java.lang.String>) strSet10);
        org.jsoup.nodes.Element element14 = element12.addClass("#document");
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
        org.jsoup.nodes.Element element30 = element12.classNames(strSet29);
        boolean boolean31 = tag1.equals((java.lang.Object) element12);
        // The following exception was thrown during execution in test generation
        try {
            element12.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#document" + "'", str7, "#document");
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "#document" + "'", str22, "#document");
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertNotNull(strSet29);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0537");
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
        boolean boolean22 = document7.equals((java.lang.Object) "#data");
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0538");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element4 = document1.attr("hi!", "#root");
        org.jsoup.nodes.Attributes attributes5 = document1.attributes();
        org.jsoup.select.Elements elements6 = document1.children();
        org.jsoup.select.Elements elements8 = document1.getElementsByIndexGreaterThan((int) 'd');
        org.jsoup.select.Elements elements10 = elements8.addClass(" class=&quot;hi!&quot;");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(elements10);
    }

    @Test
    public void test0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0539");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "");
        // The following exception was thrown during execution in test generation
        try {
            attribute2.setKey("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(attribute2);
    }

    @Test
    public void test0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0540");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragmentRelaxed("hi!", "#data");
        org.jsoup.parser.Tag tag3 = document2.tag();
        java.lang.String str4 = tag3.getName();
        boolean boolean5 = tag3.isInline();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#root" + "'", str4, "#root");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0541");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("#document");
        java.lang.String str2 = tokenQueue1.consumeAttributeKey();
        java.lang.String str4 = tokenQueue1.consumeTo("#root=\"hi!\"");
        java.lang.String str5 = tokenQueue1.toString();
        java.lang.String str7 = tokenQueue1.chompTo("");
        boolean boolean8 = tokenQueue1.consumeWhitespace();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#document" + "'", str4, "#document");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0542");
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
        org.jsoup.nodes.Document document17 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements19 = document17.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element21 = document17.prepend("#document");
        org.jsoup.nodes.Element element22 = element21.empty();
        org.jsoup.select.Elements elements24 = element21.getElementsByTag("org.jsoup.select.Selector$SelectorParseException: ");
        org.jsoup.select.Elements elements26 = elements24.removeClass("#root");
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
        org.jsoup.nodes.Element element42 = element39.append("hi!");
        org.jsoup.select.Elements elements44 = element42.getElementsByIndexLessThan((int) (short) 0);
        boolean boolean45 = elements24.equals((java.lang.Object) elements44);
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor47 = elements44.listIterator(0);
        boolean boolean48 = element15.equals((java.lang.Object) elements44);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements51 = element15.getElementsByAttributeValueStarting("<?#document#document>", "");
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
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(elements24);
        org.junit.Assert.assertNotNull(elements26);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "#document" + "'", str30, "#document");
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertNotNull(element37);
        org.junit.Assert.assertNotNull(element39);
        org.junit.Assert.assertNotNull(attributes40);
        org.junit.Assert.assertNotNull(element42);
        org.junit.Assert.assertNotNull(elements44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(elementItor47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0543");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element5 = document1.prepend("#document");
        org.jsoup.nodes.Element element6 = element5.empty();
        org.jsoup.select.Elements elements8 = element5.getElementsByTag("org.jsoup.select.Selector$SelectorParseException: ");
        org.jsoup.select.Elements elements10 = elements8.removeClass("#root");
        org.jsoup.select.Elements elements12 = elements8.append("");
        boolean boolean14 = elements8.hasAttr("#document#document");
        org.jsoup.select.Elements elements16 = elements8.toggleClass("#document#document");
        org.jsoup.nodes.Attributes attributes18 = new org.jsoup.nodes.Attributes();
        int int19 = attributes18.size();
        org.jsoup.nodes.Document document21 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements23 = document21.getElementsByAttribute("hi!");
        java.lang.String str24 = elements23.val();
        java.lang.Object obj25 = null;
        int int26 = elements23.lastIndexOf(obj25);
        org.jsoup.select.Elements elements28 = elements23.eq((int) '#');
        boolean boolean29 = attributes18.equals((java.lang.Object) elements28);
        boolean boolean31 = elements28.hasClass("<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        org.jsoup.nodes.Element element32 = elements28.last();
        org.jsoup.select.Elements elements34 = elements28.removeClass("#root=\"hi!\"");
        org.jsoup.select.Elements elements36 = elements34.val("");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean37 = elements8.addAll((int) (byte) 100, (java.util.Collection<org.jsoup.nodes.Element>) elements34);
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(elements23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(elements28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(element32);
        org.junit.Assert.assertNotNull(elements34);
        org.junit.Assert.assertNotNull(elements36);
    }

    @Test
    public void test0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0544");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("#root", "");
        org.jsoup.nodes.Element element5 = document2.attr("#root", "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        java.lang.String str6 = element5.id();
        java.util.Set<java.lang.String> strSet7 = element5.classNames();
        org.jsoup.select.Elements elements8 = element5.children();
        java.lang.String str9 = element5.toString();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>" + "'", str9, "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
    }

    @Test
    public void test0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0545");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("#root", "");
        org.jsoup.nodes.Element element5 = document2.attr("#root", "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        java.lang.String str6 = document2.tagName();
        org.jsoup.nodes.Element element7 = document2.empty();
        org.jsoup.select.Elements elements8 = element7.children();
        org.jsoup.nodes.Document document10 = new org.jsoup.nodes.Document("");
        boolean boolean11 = document10.hasText();
        java.lang.String str12 = document10.nodeName();
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet15 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet15, strArray14);
        org.jsoup.nodes.Element element17 = document10.classNames((java.util.Set<java.lang.String>) strSet15);
        org.jsoup.nodes.Element element19 = element17.addClass("#document");
        org.jsoup.select.Elements elements22 = element19.getElementsByAttributeValueNot("#root", "org.jsoup.select.Selector$SelectorParseException: ");
        java.lang.String str23 = elements22.html();
        org.jsoup.nodes.Attributes attributes24 = new org.jsoup.nodes.Attributes();
        int int25 = attributes24.size();
        java.lang.String str26 = attributes24.html();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor27 = attributes24.iterator();
        boolean boolean28 = elements22.contains((java.lang.Object) attributes24);
        org.jsoup.nodes.Attributes attributes29 = new org.jsoup.nodes.Attributes();
        int int30 = attributes29.size();
        java.lang.String str31 = attributes29.html();
        java.lang.String str32 = attributes29.html();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator33 = attributes29.spliterator();
        java.lang.String str34 = attributes29.html();
        attributes24.addAll(attributes29);
        attributes29.put("\n<!--#data-->", "org.jsoup.select.selector$selectorparseexception: org.jsoup.select.selector$selectorparseexception:=\"#root\"");
        boolean boolean39 = elements8.remove((java.lang.Object) "org.jsoup.select.selector$selectorparseexception: org.jsoup.select.selector$selectorparseexception:=\"#root\"");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#root" + "'", str6, "#root");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "#document" + "'", str12, "#document");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(elements22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(attributeItor27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(attributeSpliterator33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0546");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("#document#documentdocument");
        org.jsoup.parser.Tag tag2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = tag1.isValidAncestor(tag2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag1);
    }

    @Test
    public void test0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0547");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("#root", "hi!");
        java.lang.String str3 = attribute2.getValue();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0548");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("org.jsoup.select.Selector$SelectorParseException: ");
        boolean boolean2 = tag1.isData();
        org.jsoup.nodes.Attributes attributes4 = new org.jsoup.nodes.Attributes();
        int int5 = attributes4.size();
        java.lang.String str6 = attributes4.html();
        org.jsoup.nodes.Element element7 = new org.jsoup.nodes.Element(tag1, "org.jsoup.select.selector$selectorparseexception:", attributes4);
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator8 = attributes4.spliterator();
        boolean boolean10 = attributes4.hasKey("#root");
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator11 = attributes4.spliterator();
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributeSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(attributeSpliterator11);
    }

    @Test
    public void test0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0549");
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
        boolean boolean58 = elements13.addAll((java.util.Collection<org.jsoup.nodes.Element>) elements57);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Element> elementList61 = elements57.subList((int) 'd', 3);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: toIndex = 3");
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
        org.junit.Assert.assertNotNull(elements42);
        org.junit.Assert.assertNotNull(elements44);
        org.junit.Assert.assertNotNull(elements46);
        org.junit.Assert.assertNotNull(elements50);
        org.junit.Assert.assertNotNull(elements52);
        org.junit.Assert.assertNotNull(elements54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(elements57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
    }

    @Test
    public void test0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0550");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("#comment");
        org.junit.Assert.assertNotNull(tag1);
    }

    @Test
    public void test0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0551");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("#document", "#root");
        java.lang.String str3 = comment2.nodeName();
        java.lang.String str4 = comment2.getData();
        java.lang.String str5 = comment2.nodeName();
        java.lang.String str7 = comment2.attr("\n<!--#document-->");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#comment" + "'", str3, "#comment");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#document" + "'", str4, "#document");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#comment" + "'", str5, "#comment");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0552");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("", "org.jsoup.select.selector$selectorparseexception:");
        boolean boolean4 = document2.hasAttr("#root");
        org.jsoup.nodes.Element element6 = document2.appendText("#root");
        java.lang.String str7 = document2.className();
        java.lang.String str8 = document2.tagName();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#root" + "'", str8, "#root");
    }

    @Test
    public void test0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0553");
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
        org.jsoup.parser.Tag tag32 = org.jsoup.parser.Tag.valueOf("#root");
        boolean boolean33 = tag32.isInline();
        boolean boolean34 = tag1.isValidAncestor(tag32);
        org.jsoup.parser.Tag tag35 = tag1.getImplicitParent();
        boolean boolean36 = tag1.requiresSpecificParent();
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
        org.junit.Assert.assertNotNull(tag32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(tag35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0554");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("#document");
        org.junit.Assert.assertNotNull(document1);
    }

    @Test
    public void test0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0555");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        java.lang.String str4 = elements3.outerHtml();
        java.lang.String str5 = elements3.val();
        org.jsoup.select.Elements elements6 = new org.jsoup.select.Elements((java.util.List<org.jsoup.nodes.Element>) elements3);
        org.jsoup.select.Elements elements7 = new org.jsoup.select.Elements((java.util.Collection<org.jsoup.nodes.Element>) elements3);
        org.jsoup.select.Elements elements9 = elements7.addClass("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Document document11 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements13 = document11.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element15 = document11.prepend("#document");
        org.jsoup.nodes.Element element16 = element15.empty();
        boolean boolean18 = element16.hasClass("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        boolean boolean19 = elements9.remove((java.lang.Object) boolean18);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0556");
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
        org.jsoup.select.Elements elements21 = document17.getElementsByAttributeValueContaining("<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "org.jsoup.select.selector$selectorparseexception:");
        elements21.clear();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(elementArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(elementSpliterator11);
        org.junit.Assert.assertNotNull(elementSpliterator12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(document17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(elements21);
    }

    @Test
    public void test0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0557");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("body", "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.lang.String str3 = textNode2.nodeName();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#text" + "'", str3, "#text");
    }

    @Test
    public void test0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0558");
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
        org.jsoup.select.Elements elements38 = elements13.removeClass("");
        org.jsoup.select.Elements elements41 = elements38.attr("#data", " class=\"hi!\"");
        org.jsoup.select.Elements elements43 = elements41.html("org.jsoup.select.Selector$SelectorParseException: ");
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
        org.junit.Assert.assertNotNull(elements41);
        org.junit.Assert.assertNotNull(elements43);
    }

    @Test
    public void test0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0559");
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
        org.jsoup.nodes.Element element26 = document19.prependText("#comment");
        // The following exception was thrown during execution in test generation
        try {
            element26.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(element26);
    }

    @Test
    public void test0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0560");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("#data", "body");
        org.jsoup.nodes.Node node3 = textNode2.parent();
        // The following exception was thrown during execution in test generation
        try {
            node3.setBaseUri("[#, d, o, c, u, m, e, n, t, #, d, o, c, u, m, e, n, t, =, \", #, d, o, c, u, m, e, n, t, #, d, o, c, u, m, e, n, t, \"]");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
    }

    @Test
    public void test0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0561");
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
        org.jsoup.select.Elements elements23 = element6.getElementsByIndexEquals((int) (byte) 10);
        org.jsoup.nodes.Element element25 = element6.html("org.jsoup.select.selector$selectorparseexception: org.jsoup.select.selector$selectorparseexception:");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements26 = org.jsoup.select.Selector.select("hi!", element6);
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query hi!");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
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
        org.junit.Assert.assertNotNull(elements23);
        org.junit.Assert.assertNotNull(element25);
    }

    @Test
    public void test0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0562");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parse("hi!");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValue("hi!", "hi!");
        boolean boolean5 = document1.hasText();
        org.jsoup.nodes.Element element6 = document1.empty();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(element6);
    }

    @Test
    public void test0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0563");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("#data", "#root");
        boolean boolean3 = textNode2.isBlank();
        java.lang.String str4 = textNode2.toString();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#data" + "'", str4, "#data");
    }

    @Test
    public void test0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0564");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        java.lang.String str5 = elements3.attr("#root");
        java.lang.String str6 = elements3.text();
        org.jsoup.select.Elements elements8 = elements3.prepend("org.jsoup.select.selector$selectorparseexception:");
        org.jsoup.nodes.Document document11 = org.jsoup.parser.Parser.parseBodyFragment("#document", "");
        org.jsoup.nodes.Element element13 = document11.addClass("hi!");
        java.lang.String str14 = document11.title();
        boolean boolean15 = elements3.add((org.jsoup.nodes.Element) document11);
        java.lang.String str16 = document11.className();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + " hi!" + "'", str16, " hi!");
    }

    @Test
    public void test0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0565");
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
        org.jsoup.select.Elements elements23 = element20.getElementsByIndexGreaterThan((int) (short) 0);
        org.jsoup.nodes.Element element24 = elements23.last();
        // The following exception was thrown during execution in test generation
        try {
            java.util.ListIterator<org.jsoup.nodes.Element> elementItor26 = elements23.listIterator(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(element24);
    }

    @Test
    public void test0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0566");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.hasText();
        org.jsoup.nodes.Element element4 = document1.addClass("\n<!--#document-->");
        java.util.Set<java.lang.String> strSet5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element6 = document1.classNames(strSet5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(element4);
    }

    @Test
    public void test0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0567");
        org.jsoup.nodes.Element[] elementArray0 = new org.jsoup.nodes.Element[] {};
        org.jsoup.select.Elements elements1 = new org.jsoup.select.Elements(elementArray0);
        org.jsoup.select.Elements elements2 = new org.jsoup.select.Elements(elementArray0);
        org.jsoup.select.Elements elements3 = new org.jsoup.select.Elements(elementArray0);
        org.jsoup.select.Elements elements5 = elements3.toggleClass("#document#documentdocument");
        org.jsoup.select.Elements elements6 = new org.jsoup.select.Elements((java.util.Collection<org.jsoup.nodes.Element>) elements5);
        org.junit.Assert.assertNotNull(elementArray0);
        org.junit.Assert.assertNotNull(elements5);
    }

    @Test
    public void test0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0568");
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
        java.lang.String str23 = attributes15.toString();
        // The following exception was thrown during execution in test generation
        try {
            attributes15.remove("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
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
    public void test0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0569");
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
        java.lang.String str16 = element12.html();
        org.jsoup.select.Elements elements19 = element12.getElementsByAttributeValue("#root=\"#root=&quot;hi!&quot;\"", " class=&quot;hi!&quot;");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "#document#documenthi!" + "'", str16, "#document#documenthi!");
        org.junit.Assert.assertNotNull(elements19);
    }

    @Test
    public void test0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0570");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("#root", "\n<!--#data-->");
    }

    @Test
    public void test0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0571");
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
    }

    @Test
    public void test0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0572");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("#document");
        java.lang.String str2 = tokenQueue1.consumeAttributeKey();
        java.lang.String str3 = tokenQueue1.consumeCssIdentifier();
        boolean boolean4 = tokenQueue1.consumeWhitespace();
        java.lang.String str5 = tokenQueue1.consumeAttributeKey();
        java.lang.String str6 = tokenQueue1.consumeAttributeKey();
        boolean boolean8 = tokenQueue1.matches("[#, d, o, c, u, m, e, n, t]");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0573");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element4 = document1.attr("hi!", "#root");
        org.jsoup.nodes.Attributes attributes5 = document1.attributes();
        org.jsoup.nodes.Document document6 = document1.normalise();
        java.lang.String str7 = document1.title();
        org.jsoup.select.Elements elements9 = document1.getElementsByIndexEquals((int) (short) 0);
        org.jsoup.nodes.Element element12 = document1.attr("#data", "hi!");
        org.jsoup.nodes.Element element14 = document1.getElementById("<html>\n<head>\n</head>\n<body>\n</body>\n</html>=\"\"");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNull(element14);
    }

    @Test
    public void test0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0574");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("#root", "");
        java.lang.String str3 = document2.outerHtml();
        org.jsoup.nodes.Element element5 = document2.append("<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        boolean boolean7 = element5.hasClass("#document");
        org.jsoup.select.Elements elements9 = element5.getElementsByIndexLessThan(10);
        boolean boolean11 = element5.hasClass("");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>" + "'", str3, "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0575");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("#document#document", "\n<!--#document-->", false);
        java.lang.String str4 = xmlDeclaration3.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = xmlDeclaration3.childNodes();
        java.lang.String str6 = xmlDeclaration3.toString();
        java.lang.String str7 = xmlDeclaration3.toString();
        java.lang.String str8 = xmlDeclaration3.nodeName();
        java.lang.String str9 = xmlDeclaration3.nodeName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<?#document#document>" + "'", str4, "<?#document#document>");
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<?#document#document>" + "'", str6, "<?#document#document>");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<?#document#document>" + "'", str7, "<?#document#document>");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#declaration" + "'", str8, "#declaration");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#declaration" + "'", str9, "#declaration");
    }

    @Test
    public void test0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0576");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("#declaration");
        java.lang.String str2 = tag1.toString();
        boolean boolean3 = tag1.requiresSpecificParent();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements7 = document5.getElementsByAttribute("hi!");
        java.lang.String str9 = elements7.attr("#root");
        org.jsoup.nodes.Document document11 = new org.jsoup.nodes.Document("");
        boolean boolean12 = document11.hasText();
        java.lang.String str13 = document11.nodeName();
        org.jsoup.select.Elements elements14 = document11.children();
        org.jsoup.nodes.Element element16 = document11.prependElement("[#, d, o, c, u, m, e, n, t]");
        int int17 = elements7.lastIndexOf((java.lang.Object) document11);
        org.jsoup.nodes.Element element18 = document11.parent();
        org.jsoup.nodes.Element element20 = document11.append("#root=\"hi!\"");
        boolean boolean21 = tag1.equals((java.lang.Object) document11);
        boolean boolean22 = tag1.canContainBlock();
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#declaration" + "'", str2, "#declaration");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "#document" + "'", str13, "#document");
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNull(element18);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0577");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements5 = elements3.prepend("");
        org.jsoup.select.Elements elements7 = elements5.removeAttr("");
        org.jsoup.select.Elements elements9 = elements7.removeAttr("hi!");
        java.lang.String str10 = elements7.outerHtml();
        java.lang.String str12 = elements7.attr("#root");
        java.lang.Object obj13 = null;
        boolean boolean14 = elements7.remove(obj13);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0578");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements5 = elements3.val("a");
        org.jsoup.nodes.Element element6 = elements3.last();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNull(element6);
    }

    @Test
    public void test0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0579");
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
        org.jsoup.parser.Tag tag32 = org.jsoup.parser.Tag.valueOf("#root");
        boolean boolean33 = tag32.isInline();
        boolean boolean34 = tag1.isValidAncestor(tag32);
        org.jsoup.parser.Tag tag35 = tag1.getImplicitParent();
        org.jsoup.nodes.Attribute attribute38 = org.jsoup.nodes.Attribute.createFromEncoded("hi!", "hi!");
        attribute38.setValue("#root=\"hi!\"");
        java.lang.String str41 = attribute38.html();
        java.lang.String str42 = attribute38.toString();
        boolean boolean43 = tag35.equals((java.lang.Object) str42);
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
        org.junit.Assert.assertNotNull(tag32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(tag35);
        org.junit.Assert.assertNotNull(attribute38);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!=\"#root=&quot;hi!&quot;\"" + "'", str41, "hi!=\"#root=&quot;hi!&quot;\"");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!=\"#root=&quot;hi!&quot;\"" + "'", str42, "hi!=\"#root=&quot;hi!&quot;\"");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0580");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("org.jsoup.select.Selector$SelectorParseException: ");
        boolean boolean2 = tag1.isData();
        boolean boolean3 = tag1.requiresSpecificParent();
        boolean boolean4 = tag1.isBlock();
        org.jsoup.parser.Tag tag6 = org.jsoup.parser.Tag.valueOf("org.jsoup.select.Selector$SelectorParseException: ");
        boolean boolean7 = tag6.isData();
        boolean boolean8 = tag6.requiresSpecificParent();
        boolean boolean9 = tag6.isBlock();
        boolean boolean10 = tag1.canContain(tag6);
        org.jsoup.parser.Tag tag11 = tag1.getImplicitParent();
        boolean boolean12 = tag1.canContainBlock();
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0581");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("#document");
        java.lang.String str2 = tokenQueue1.consumeAttributeKey();
        java.lang.String str3 = tokenQueue1.remainder();
        java.lang.String str4 = tokenQueue1.remainder();
        boolean boolean5 = tokenQueue1.consumeWhitespace();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0582");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("#root", "");
        org.jsoup.nodes.Element element5 = document2.attr("#root", "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        java.lang.String str6 = document2.tagName();
        java.lang.String str7 = document2.text();
        boolean boolean8 = document2.isBlock();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = document2.childNodes();
        org.jsoup.nodes.Element element11 = document2.getElementById("hi!");
        org.jsoup.nodes.Element element13 = document2.createElement(" hi!");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#root" + "'", str6, "#root");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#root" + "'", str7, "#root");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNull(element11);
        org.junit.Assert.assertNotNull(element13);
    }

    @Test
    public void test0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0583");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("org.jsoup.select.Selector$SelectorParseException: ");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Document document4 = document3.normalise();
        org.jsoup.nodes.Element element5 = document3.head();
        org.jsoup.nodes.Element element7 = element5.append("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element9 = element5.wrap("#text");
        boolean boolean10 = tag1.equals((java.lang.Object) element9);
        boolean boolean11 = tag1.isEmpty();
        boolean boolean12 = tag1.preserveWhitespace();
        java.lang.String str13 = tag1.toString();
        org.jsoup.parser.Tag tag15 = org.jsoup.parser.Tag.valueOf("#declaration");
        java.lang.String str16 = tag15.toString();
        boolean boolean17 = tag15.requiresSpecificParent();
        org.jsoup.nodes.Document document19 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements21 = document19.getElementsByAttribute("hi!");
        java.lang.String str23 = elements21.attr("#root");
        org.jsoup.nodes.Document document25 = new org.jsoup.nodes.Document("");
        boolean boolean26 = document25.hasText();
        java.lang.String str27 = document25.nodeName();
        org.jsoup.select.Elements elements28 = document25.children();
        org.jsoup.nodes.Element element30 = document25.prependElement("[#, d, o, c, u, m, e, n, t]");
        int int31 = elements21.lastIndexOf((java.lang.Object) document25);
        org.jsoup.nodes.Element element32 = document25.parent();
        org.jsoup.nodes.Element element34 = document25.append("#root=\"hi!\"");
        boolean boolean35 = tag15.equals((java.lang.Object) document25);
        boolean boolean36 = tag1.canContain(tag15);
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(document4);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNull(element9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "org.jsoup.select.selector$selectorparseexception:" + "'", str13, "org.jsoup.select.selector$selectorparseexception:");
        org.junit.Assert.assertNotNull(tag15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "#declaration" + "'", str16, "#declaration");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(elements21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "#document" + "'", str27, "#document");
        org.junit.Assert.assertNotNull(elements28);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNull(element32);
        org.junit.Assert.assertNotNull(element34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
    }

    @Test
    public void test0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0584");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("#root", "");
        org.jsoup.nodes.Element element5 = document2.attr("#root", "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        java.lang.String str6 = document2.tagName();
        java.lang.String str7 = document2.toString();
        org.jsoup.nodes.Node node9 = document2.removeAttr("[#, d, o, c, u, m, e, n, t]");
        boolean boolean11 = document2.hasClass("#text");
        // The following exception was thrown during execution in test generation
        try {
            document2.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#root" + "'", str6, "#root");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>" + "'", str7, "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0585");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("#root", "");
        java.lang.String str3 = document2.outerHtml();
        org.jsoup.nodes.Element element5 = document2.append("<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        org.jsoup.select.Elements elements7 = document2.getElementsByIndexEquals(1);
        boolean boolean9 = elements7.contains((java.lang.Object) "#comment");
        java.util.Spliterator<org.jsoup.nodes.Element> elementSpliterator10 = elements7.spliterator();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>" + "'", str3, "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(elementSpliterator10);
    }

    @Test
    public void test0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0586");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element5 = document1.prepend("#document");
        org.jsoup.select.Elements elements7 = element5.getElementsByAttribute("hi!");
        int int8 = elements7.size();
        org.jsoup.select.Elements elements10 = elements7.toggleClass("#document#document=\"#document#document\"");
        java.lang.String str11 = elements7.html();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0587");
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
        org.jsoup.nodes.Node node21 = element13.nextSibling();
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
        org.junit.Assert.assertNull(node21);
    }

    @Test
    public void test0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0588");
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
        org.jsoup.nodes.Element element16 = document12.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element18 = element16.appendElement(" ");
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
        org.junit.Assert.assertNull(element16);
    }

    @Test
    public void test0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0589");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("#document");
        boolean boolean3 = tokenQueue1.matches("\n<!--#root-->");
        boolean boolean5 = tokenQueue1.matchChomp("#data");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!=\"#root=&quot;hi!&quot;\"" };
        java.lang.String str8 = tokenQueue1.consumeToAny(strArray7);
        java.lang.Character char9 = tokenQueue1.peek();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#document" + "'", str8, "#document");
        org.junit.Assert.assertNull(char9);
    }

    @Test
    public void test0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0590");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("#document", "#root");
        java.lang.String str3 = comment2.getData();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
    }

    @Test
    public void test0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0591");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("#document#documenthi!", " class=\"hi!\"");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element4 = document2.prependElement("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
    }

    @Test
    public void test0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0592");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element5 = document1.prepend("#document");
        org.jsoup.select.Elements elements7 = element5.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element8 = elements7.last();
        org.jsoup.nodes.Document document11 = org.jsoup.parser.Parser.parse("#root", "");
        java.lang.String str12 = document11.outerHtml();
        org.jsoup.nodes.Element element14 = document11.append("<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        boolean boolean16 = element14.hasClass("#document");
        org.jsoup.select.Elements elements18 = element14.getElementsByIndexLessThan(10);
        org.jsoup.nodes.Element element19 = element14.empty();
        boolean boolean20 = elements7.remove((java.lang.Object) element19);
        boolean boolean22 = element19.hasAttr("");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNull(element8);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>" + "'", str12, "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0593");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        int int1 = attributes0.size();
        java.lang.String str2 = attributes0.html();
        java.lang.String str3 = attributes0.html();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator4 = attributes0.spliterator();
        boolean boolean6 = attributes0.hasKey("");
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator7 = attributes0.spliterator();
        org.jsoup.nodes.Document document9 = org.jsoup.Jsoup.parse("hi!");
        org.jsoup.select.Elements elements12 = document9.getElementsByAttributeValue("hi!", "hi!");
        org.jsoup.select.Selector.SelectorParseException selectorParseException14 = new org.jsoup.select.Selector.SelectorParseException("");
        boolean boolean15 = elements12.contains((java.lang.Object) "");
        boolean boolean17 = elements12.is("[]");
        boolean boolean18 = attributes0.equals((java.lang.Object) elements12);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(attributeSpliterator4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(attributeSpliterator7);
        org.junit.Assert.assertNotNull(document9);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0594");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        java.lang.String str4 = document1.nodeName();
        java.lang.String str5 = document1.outerHtml();
        boolean boolean7 = document1.hasAttr("#document#document");
        org.jsoup.select.Elements elements10 = document1.getElementsByAttributeValueEnding("#document", "#comment");
        org.jsoup.nodes.Element element11 = elements10.last();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#document" + "'", str4, "#document");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNull(element11);
    }

    @Test
    public void test0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0595");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("#document#document", "\n<!--#document-->", false);
        java.lang.String str4 = xmlDeclaration3.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = xmlDeclaration3.childNodes();
        java.lang.String str6 = xmlDeclaration3.getWholeDeclaration();
        java.lang.String str7 = xmlDeclaration3.nodeName();
        java.lang.String str8 = xmlDeclaration3.nodeName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<?#document#document>" + "'", str4, "<?#document#document>");
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#document#document" + "'", str6, "#document#document");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#declaration" + "'", str7, "#declaration");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#declaration" + "'", str8, "#declaration");
    }

    @Test
    public void test0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0596");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int15 = element14.elementSiblingIndex();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#document" + "'", str9, "#document");
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNull(element14);
    }

    @Test
    public void test0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0597");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse(" class=\"hi!\"", "<!--#document-->");
        org.junit.Assert.assertNotNull(document2);
    }

    @Test
    public void test0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0598");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("#root", "");
        java.lang.String str3 = document2.outerHtml();
        org.jsoup.nodes.Element element5 = document2.createElement("#document#documenthi!");
        org.jsoup.nodes.Element element8 = document2.attr("<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "org.jsoup.select.Selector$SelectorParseException: \n<!--#document-->");
        org.jsoup.select.Elements elements11 = element8.getElementsByAttributeValue("<html> \n <head> \n </head> \n <body>\n   #root  \n </body>\n</html>", " hi!");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>" + "'", str3, "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements11);
    }

    @Test
    public void test0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0599");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("org.jsoup.select.Selector$SelectorParseException: ");
        boolean boolean2 = tag1.isData();
        boolean boolean3 = tag1.requiresSpecificParent();
        boolean boolean4 = tag1.isBlock();
        org.jsoup.parser.Tag tag6 = org.jsoup.parser.Tag.valueOf("org.jsoup.select.Selector$SelectorParseException: ");
        boolean boolean7 = tag6.isData();
        boolean boolean8 = tag6.requiresSpecificParent();
        boolean boolean9 = tag6.isBlock();
        boolean boolean10 = tag1.canContain(tag6);
        org.jsoup.parser.Tag tag11 = tag1.getImplicitParent();
        boolean boolean12 = tag11.isInline();
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0600");
        org.jsoup.select.Selector.SelectorParseException selectorParseException1 = new org.jsoup.select.Selector.SelectorParseException("org.jsoup.select.selector$selectorparseexception:");
        org.jsoup.select.Selector.SelectorParseException selectorParseException3 = new org.jsoup.select.Selector.SelectorParseException("org.jsoup.select.selector$selectorparseexception:");
        java.lang.Throwable[] throwableArray4 = selectorParseException3.getSuppressed();
        org.jsoup.select.Selector.SelectorParseException selectorParseException6 = new org.jsoup.select.Selector.SelectorParseException("\n<!--#document-->");
        selectorParseException3.addSuppressed((java.lang.Throwable) selectorParseException6);
        selectorParseException1.addSuppressed((java.lang.Throwable) selectorParseException6);
        org.jsoup.select.Selector.SelectorParseException selectorParseException10 = new org.jsoup.select.Selector.SelectorParseException("<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        selectorParseException1.addSuppressed((java.lang.Throwable) selectorParseException10);
        org.junit.Assert.assertNotNull(throwableArray4);
    }

    @Test
    public void test0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0601");
        org.jsoup.nodes.DataNode dataNode2 = org.jsoup.nodes.DataNode.createFromEncoded("org.jsoup.select.selector$selectorparseexception:", "hi!");
        java.lang.String str3 = dataNode2.getWholeData();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = dataNode2.childNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = dataNode2.childNodes();
        java.lang.String str6 = dataNode2.getWholeData();
        org.jsoup.nodes.Attributes attributes7 = dataNode2.attributes();
        org.jsoup.nodes.Attribute attribute10 = org.jsoup.nodes.Attribute.createFromEncoded("hi!", "hi!");
        attribute10.setKey("#root");
        attribute10.setValue("");
        attribute10.setKey("#document#documenthi!#root=&quot;hi!&quot;");
        attributes7.put(attribute10);
        org.junit.Assert.assertNotNull(dataNode2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "org.jsoup.select.selector$selectorparseexception:" + "'", str3, "org.jsoup.select.selector$selectorparseexception:");
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "org.jsoup.select.selector$selectorparseexception:" + "'", str6, "org.jsoup.select.selector$selectorparseexception:");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(attribute10);
    }

    @Test
    public void test0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0602");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("#root", "");
        java.lang.String str3 = document2.outerHtml();
        org.jsoup.nodes.Element element5 = document2.append("<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        org.jsoup.select.Elements elements7 = document2.getElementsByIndexEquals(1);
        java.lang.String str8 = document2.nodeName();
        org.jsoup.nodes.Element element9 = document2.body();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>" + "'", str3, "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#document" + "'", str8, "#document");
        org.junit.Assert.assertNotNull(element9);
    }

    @Test
    public void test0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0603");
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
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>" + "'", str13, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0604");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("org.jsoup.select.Selector$SelectorParseException: ", "body", false);
    }

    @Test
    public void test0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0605");
        org.jsoup.nodes.Document document3 = org.jsoup.parser.Parser.parseBodyFragment("#document", "");
        org.jsoup.nodes.Element element5 = document3.addClass("hi!");
        java.lang.String str6 = document3.title();
        org.jsoup.select.Elements elements7 = org.jsoup.select.Selector.select("#document#document", (org.jsoup.nodes.Element) document3);
        org.jsoup.nodes.Element element8 = null;
        boolean boolean9 = elements7.add(element8);
        java.util.stream.Stream<org.jsoup.nodes.Element> elementStream10 = elements7.stream();
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(elementStream10);
    }

    @Test
    public void test0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0606");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("#document");
        boolean boolean3 = tokenQueue1.matches("\n<!--#root-->");
        boolean boolean5 = tokenQueue1.matchChomp("#data");
        boolean boolean7 = tokenQueue1.matchChomp("#document#document");
        // The following exception was thrown during execution in test generation
        try {
            tokenQueue1.consume("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Queue did not match expected sequence");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0607");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element5 = document1.prepend("#document");
        org.jsoup.select.Elements elements7 = element5.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element8 = elements7.last();
        org.jsoup.nodes.Document document11 = org.jsoup.parser.Parser.parse("#root", "");
        java.lang.String str12 = document11.outerHtml();
        org.jsoup.nodes.Element element14 = document11.append("<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        boolean boolean16 = element14.hasClass("#document");
        org.jsoup.select.Elements elements18 = element14.getElementsByIndexLessThan(10);
        org.jsoup.nodes.Element element19 = element14.empty();
        boolean boolean20 = elements7.remove((java.lang.Object) element19);
        java.util.stream.Stream<org.jsoup.nodes.Element> elementStream21 = elements7.parallelStream();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNull(element8);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>" + "'", str12, "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(elementStream21);
    }

    @Test
    public void test0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0608");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("#root", "");
        org.jsoup.nodes.Element element5 = document2.attr("#root", "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        java.lang.String str6 = document2.tagName();
        org.jsoup.nodes.Element element7 = document2.empty();
        org.jsoup.select.Elements elements8 = element7.children();
        org.jsoup.nodes.Element element10 = element7.append("#root=\"hi!\"");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#root" + "'", str6, "#root");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(element10);
    }

    @Test
    public void test0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0609");
        org.jsoup.nodes.DataNode dataNode2 = new org.jsoup.nodes.DataNode(" class=&quot;hi!&quot;", "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.lang.String str3 = dataNode2.getWholeData();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " class=&quot;hi!&quot;" + "'", str3, " class=&quot;hi!&quot;");
    }

    @Test
    public void test0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0610");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parse("#declaration");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements3 = document1.getElementsByTag("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
    }

    @Test
    public void test0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0611");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("#document");
        boolean boolean3 = tokenQueue1.matches("\n<!--#root-->");
        boolean boolean5 = tokenQueue1.matchChomp("#data");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!=\"#root=&quot;hi!&quot;\"" };
        java.lang.String str8 = tokenQueue1.consumeToAny(strArray7);
        java.lang.String str9 = tokenQueue1.remainder();
        java.lang.String str10 = tokenQueue1.remainder();
        java.lang.String str11 = tokenQueue1.toString();
        java.lang.String[] strArray12 = null;
        java.lang.String str13 = tokenQueue1.consumeToAny(strArray12);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Character char14 = tokenQueue1.consume();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#document" + "'", str8, "#document");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0612");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("#root", "");
        org.jsoup.nodes.Element element5 = document2.attr("#root", "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        java.lang.String str6 = document2.tagName();
        org.jsoup.nodes.Element element7 = document2.empty();
        org.jsoup.select.Elements elements8 = element7.children();
        org.jsoup.nodes.Document document10 = new org.jsoup.nodes.Document("");
        boolean boolean11 = document10.hasText();
        java.lang.String str12 = document10.nodeName();
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet15 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet15, strArray14);
        org.jsoup.nodes.Element element17 = document10.classNames((java.util.Set<java.lang.String>) strSet15);
        org.jsoup.nodes.Element element19 = document10.append("");
        org.jsoup.nodes.Element element21 = element19.addClass("#document#document");
        boolean boolean22 = elements8.add(element21);
        org.jsoup.select.Elements elements23 = element21.parents();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#root" + "'", str6, "#root");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "#document" + "'", str12, "#document");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(elements23);
    }

    @Test
    public void test0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0613");
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
        org.jsoup.nodes.Node node33 = element26.attr("<[#, d, o, c, u, m, e, n, t]>\n</[#, d, o, c, u, m, e, n, t]>#root=&quot;hi!&quot;", "#document=\"#comment\"");
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
        org.junit.Assert.assertNotNull(node33);
    }

    @Test
    public void test0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0614");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parse("hi!");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("org.jsoup.select.selector$selectorparseexception:");
        document1.setBaseUri("#document#documenthi!#root=&quot;hi!&quot;");
        java.lang.String str7 = document1.attr("<html>\n<head>\n</head>\n<body>\n</body>\n</html>=\"\"");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0615");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("org.jsoup.select.Selector$SelectorParseException: ");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Document document4 = document3.normalise();
        org.jsoup.nodes.Element element5 = document3.head();
        org.jsoup.nodes.Element element7 = element5.append("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element9 = element5.wrap("#text");
        boolean boolean10 = tag1.equals((java.lang.Object) element9);
        boolean boolean11 = tag1.preserveWhitespace();
        org.jsoup.parser.Tag tag13 = org.jsoup.parser.Tag.valueOf("org.jsoup.select.Selector$SelectorParseException: ");
        boolean boolean14 = tag13.isData();
        boolean boolean15 = tag13.requiresSpecificParent();
        boolean boolean16 = tag13.isBlock();
        org.jsoup.parser.Tag tag18 = org.jsoup.parser.Tag.valueOf("org.jsoup.select.Selector$SelectorParseException: ");
        boolean boolean19 = tag18.isData();
        boolean boolean20 = tag18.requiresSpecificParent();
        boolean boolean21 = tag18.isBlock();
        boolean boolean22 = tag13.canContain(tag18);
        boolean boolean23 = tag13.isBlock();
        boolean boolean24 = tag13.isData();
        java.lang.String str25 = tag13.getName();
        boolean boolean26 = tag13.requiresSpecificParent();
        org.jsoup.parser.Tag tag28 = org.jsoup.parser.Tag.valueOf("#root");
        boolean boolean29 = tag28.isInline();
        boolean boolean30 = tag13.canContain(tag28);
        org.jsoup.parser.Tag tag31 = tag28.getImplicitParent();
        org.jsoup.parser.Tag tag32 = tag28.getImplicitParent();
        boolean boolean33 = tag1.canContain(tag28);
        boolean boolean34 = tag28.isData();
        boolean boolean35 = tag28.isInline();
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(document4);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNull(element9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(tag13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(tag18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "org.jsoup.select.selector$selectorparseexception:" + "'", str25, "org.jsoup.select.selector$selectorparseexception:");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(tag28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(tag31);
        org.junit.Assert.assertNotNull(tag32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
    }

    @Test
    public void test0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0616");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.hasText();
        java.lang.String str3 = document1.nodeName();
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        org.jsoup.nodes.Element element8 = document1.classNames((java.util.Set<java.lang.String>) strSet6);
        org.jsoup.nodes.Element element10 = document1.append("#document");
        org.jsoup.nodes.Element element12 = element10.html("");
        java.lang.String str13 = element12.outerHtml();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0617");
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
            org.jsoup.nodes.Element element34 = elements32.remove(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
    public void test0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0618");
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
        java.lang.String str19 = element18.data();
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
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0619");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("#declaration", "", true);
    }

    @Test
    public void test0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0620");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("#document#documentdocument", "<?hi!>");
        org.junit.Assert.assertNotNull(attribute2);
    }

    @Test
    public void test0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0621");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("#root", "");
        org.jsoup.nodes.Element element5 = document2.attr("#root", "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        java.lang.String str6 = document2.tagName();
        java.lang.String str7 = document2.toString();
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        boolean boolean10 = document9.hasText();
        java.lang.String str11 = document9.nodeName();
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet14 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet14, strArray13);
        org.jsoup.nodes.Element element16 = document9.classNames((java.util.Set<java.lang.String>) strSet14);
        org.jsoup.nodes.Element element18 = document9.append("#document");
        org.jsoup.nodes.Element element20 = element18.html("<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        org.jsoup.nodes.Element element21 = document2.appendChild((org.jsoup.nodes.Node) element20);
        boolean boolean23 = element20.hasClass("\n<!--#document--> #data");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#root" + "'", str6, "#root");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>" + "'", str7, "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#document" + "'", str11, "#document");
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0622");
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
        org.jsoup.nodes.Document document19 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements21 = document19.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements23 = elements21.prepend("");
        org.jsoup.nodes.Document document25 = new org.jsoup.nodes.Document("");
        boolean boolean26 = document25.hasText();
        boolean boolean27 = document25.hasText();
        org.jsoup.nodes.Document document29 = new org.jsoup.nodes.Document("");
        boolean boolean30 = document29.hasText();
        java.lang.String str31 = document29.nodeName();
        java.lang.String[] strArray33 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet34 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet34, strArray33);
        org.jsoup.nodes.Element element36 = document29.classNames((java.util.Set<java.lang.String>) strSet34);
        org.jsoup.nodes.Element element37 = document25.classNames((java.util.Set<java.lang.String>) strSet34);
        int int38 = elements21.indexOf((java.lang.Object) element37);
        org.jsoup.nodes.Document document40 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements42 = document40.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements44 = elements42.prepend("");
        org.jsoup.select.Elements elements46 = elements44.removeAttr("");
        org.jsoup.nodes.Document document48 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements50 = document48.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements52 = elements50.prepend("");
        org.jsoup.select.Elements elements54 = elements52.removeAttr("");
        boolean boolean55 = elements44.containsAll((java.util.Collection<org.jsoup.nodes.Element>) elements52);
        org.jsoup.nodes.Document document57 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements59 = document57.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements61 = elements59.prepend("");
        org.jsoup.select.Elements elements63 = elements61.removeAttr("");
        org.jsoup.nodes.Document document65 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements67 = document65.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements69 = elements67.prepend("");
        org.jsoup.select.Elements elements71 = elements69.removeAttr("");
        boolean boolean72 = elements61.containsAll((java.util.Collection<org.jsoup.nodes.Element>) elements69);
        org.jsoup.select.Elements elements74 = elements69.wrap("#root");
        boolean boolean75 = elements52.containsAll((java.util.Collection<org.jsoup.nodes.Element>) elements74);
        org.jsoup.select.Elements elements76 = new org.jsoup.select.Elements((java.util.Collection<org.jsoup.nodes.Element>) elements52);
        boolean boolean77 = elements21.containsAll((java.util.Collection<org.jsoup.nodes.Element>) elements52);
        org.jsoup.select.Elements elements79 = elements52.prepend("org.jsoup.select.selector$selectorparseexception:");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean80 = elements3.addAll((int) '#', (java.util.Collection<org.jsoup.nodes.Element>) elements79);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 35, Size: 0");
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
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertNotNull(elements21);
        org.junit.Assert.assertNotNull(elements23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "#document" + "'", str31, "#document");
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(element36);
        org.junit.Assert.assertNotNull(element37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertNotNull(elements42);
        org.junit.Assert.assertNotNull(elements44);
        org.junit.Assert.assertNotNull(elements46);
        org.junit.Assert.assertNotNull(elements50);
        org.junit.Assert.assertNotNull(elements52);
        org.junit.Assert.assertNotNull(elements54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(elements59);
        org.junit.Assert.assertNotNull(elements61);
        org.junit.Assert.assertNotNull(elements63);
        org.junit.Assert.assertNotNull(elements67);
        org.junit.Assert.assertNotNull(elements69);
        org.junit.Assert.assertNotNull(elements71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertNotNull(elements74);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertNotNull(elements79);
    }

    @Test
    public void test0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0623");
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
        java.lang.String str24 = element21.id();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node26 = element21.childNode((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 52, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
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
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0624");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element4 = document1.attr("hi!", "#root");
        org.jsoup.nodes.Attributes attributes5 = document1.attributes();
        org.jsoup.select.Elements elements8 = document1.getElementsByAttributeValueNot("org.jsoup.select.selector$selectorparseexception:", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements10 = elements8.select("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertNotNull(elements8);
    }

    @Test
    public void test0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0625");
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
        java.lang.String str25 = elements20.outerHtml();
        java.lang.Object[] objArray26 = elements20.toArray();
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
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[]");
    }

    @Test
    public void test0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0626");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element5 = document1.prepend("#document");
        org.jsoup.nodes.Element element7 = document1.createElement("#data");
        org.jsoup.nodes.Element element9 = element7.html("<?hi!>");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
    }

    @Test
    public void test0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0627");
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
        org.jsoup.select.Elements elements17 = element12.getElementsByAttributeValueStarting("[#, d, o, c, u, m, e, n, t]", "\n<!--#root-->");
        org.jsoup.select.Elements elements19 = elements17.select("<html> \n <head> \n </head> \n <body>\n   #root  \n </body>\n</html>");
        boolean boolean20 = elements17.hasText();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNull(element14);
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0628");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("<html>\n<head>\n</head>\n<body>\n</body>\n</html>=\"\"", "");
        org.junit.Assert.assertNotNull(textNode2);
    }

    @Test
    public void test0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0629");
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
    public void test0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0630");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("#root", "");
        java.lang.String str3 = document2.outerHtml();
        org.jsoup.nodes.Element element5 = document2.append("<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        org.jsoup.select.Elements elements8 = document2.getElementsByAttributeValueStarting("#root=\"hi!\"", "org.jsoup.select.Selector$SelectorParseException: ");
        org.jsoup.nodes.Element element10 = document2.prepend("#root=\"hi!\"");
        java.lang.String str11 = element10.id();
        org.jsoup.select.Elements elements13 = element10.getElementsByIndexEquals((int) (byte) 100);
        java.lang.String str14 = element10.html();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>" + "'", str3, "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#root=&quot;hi!&quot;\n<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>\n<html> \n<head> \n</head> \n<body>\n  #root  \n</body>\n</html>" + "'", str14, "#root=&quot;hi!&quot;\n<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>\n<html> \n<head> \n</head> \n<body>\n  #root  \n</body>\n</html>");
    }

    @Test
    public void test0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0631");
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
        org.jsoup.nodes.Element element20 = element18.prependElement(" #comment=\"\"");
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
    }

    @Test
    public void test0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0632");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        java.lang.String str4 = document1.nodeName();
        java.lang.String str5 = document1.outerHtml();
        boolean boolean7 = document1.hasAttr("#document#document");
        org.jsoup.select.Elements elements10 = document1.getElementsByAttributeValueEnding("#document", "#comment");
        org.jsoup.nodes.Element element12 = document1.prependElement("org.jsoup.select.selector$selectorparseexception:");
        org.jsoup.nodes.Element element13 = element12.nextElementSibling();
        boolean boolean14 = element12.isBlock();
        org.jsoup.select.Elements elements16 = element12.getElementsByIndexEquals((int) 'd');
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#document" + "'", str4, "#document");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNull(element13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(elements16);
    }

    @Test
    public void test0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0633");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("#document", "");
        org.jsoup.nodes.Element element4 = document2.addClass("hi!");
        org.jsoup.nodes.Element element5 = document2.body();
        java.lang.String str6 = element5.nodeName();
        java.lang.String str7 = element5.text();
        java.lang.String str8 = element5.baseUri();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "body" + "'", str6, "body");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#document" + "'", str7, "#document");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0634");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        int int1 = attributes0.size();
        org.jsoup.nodes.Document document3 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements5 = document3.getElementsByAttribute("hi!");
        java.lang.String str6 = elements5.val();
        java.lang.Object obj7 = null;
        int int8 = elements5.lastIndexOf(obj7);
        org.jsoup.select.Elements elements10 = elements5.eq((int) '#');
        boolean boolean11 = attributes0.equals((java.lang.Object) elements10);
        java.lang.String str12 = attributes0.toString();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0635");
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
        java.lang.String str14 = tag1.toString();
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
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "org.jsoup.select.selector$selectorparseexception:" + "'", str14, "org.jsoup.select.selector$selectorparseexception:");
    }

    @Test
    public void test0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0636");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element5 = document1.prepend("#document");
        org.jsoup.nodes.Element element6 = element5.empty();
        org.jsoup.select.Elements elements8 = element5.getElementsByTag("org.jsoup.select.Selector$SelectorParseException: ");
        org.jsoup.select.Elements elements10 = elements8.html("#document");
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor11 = elements10.listIterator();
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor12 = elements10.listIterator();
        org.jsoup.select.Elements elements14 = elements10.html("<?hi!>");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(elementItor11);
        org.junit.Assert.assertNotNull(elementItor12);
        org.junit.Assert.assertNotNull(elements14);
    }

    @Test
    public void test0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0637");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("#document#documenthi!#root=&quot;hi!&quot;", " #comment=\"\"");
        org.junit.Assert.assertNotNull(document2);
    }

    @Test
    public void test0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0638");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("org.jsoup.select.Selector$SelectorParseException: ");
        org.jsoup.nodes.Attributes attributes3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element4 = new org.jsoup.nodes.Element(tag1, " hi!", attributes3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag1);
    }

    @Test
    public void test0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0639");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("#root", "");
        org.jsoup.nodes.Element element5 = document2.attr("#root", "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        java.lang.String str6 = document2.tagName();
        org.jsoup.nodes.Element element7 = document2.empty();
        java.lang.String str9 = document2.absUrl("#data");
        org.jsoup.select.Elements elements11 = document2.getElementsByIndexGreaterThan((int) (byte) 0);
        boolean boolean12 = elements11.isEmpty();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#root" + "'", str6, "#root");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0640");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("#root", "");
        java.lang.String str3 = document2.outerHtml();
        org.jsoup.nodes.Element element5 = document2.append("<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        boolean boolean7 = element5.hasClass("#document");
        org.jsoup.select.Elements elements9 = element5.getElementsByIndexLessThan(10);
        boolean boolean10 = elements9.hasText();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>" + "'", str3, "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0641");
        org.jsoup.nodes.Document document3 = org.jsoup.parser.Parser.parse("", "org.jsoup.select.selector$selectorparseexception:");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements4 = org.jsoup.select.Selector.select("", (org.jsoup.nodes.Element) document3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document3);
    }

    @Test
    public void test0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0642");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("#root");
        org.jsoup.nodes.Attributes attributes2 = document1.attributes();
        org.jsoup.nodes.Document document4 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        boolean boolean6 = document4.hasClass("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Attributes attributes7 = document4.attributes();
        // The following exception was thrown during execution in test generation
        try {
            document1.replaceWith((org.jsoup.nodes.Node) document4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributes2);
        org.junit.Assert.assertNotNull(document4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(attributes7);
    }

    @Test
    public void test0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0643");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parse("hi!");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValue("hi!", "hi!");
        org.jsoup.nodes.Attributes attributes5 = document1.attributes();
        org.jsoup.nodes.Element element6 = document1.head();
        org.jsoup.select.Elements elements7 = element6.getAllElements();
        org.jsoup.nodes.Element element8 = element6.empty();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(element8);
    }

    @Test
    public void test0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0644");
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
        org.jsoup.nodes.Element element23 = element21.prepend("\n<!--#document-->");
        org.jsoup.nodes.Document document25 = new org.jsoup.nodes.Document("");
        boolean boolean26 = document25.hasText();
        java.lang.String str27 = document25.nodeName();
        java.lang.String[] strArray29 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet30 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet30, strArray29);
        org.jsoup.nodes.Element element32 = document25.classNames((java.util.Set<java.lang.String>) strSet30);
        org.jsoup.nodes.Element element34 = element32.addClass("#document");
        java.lang.String str35 = element34.html();
        org.jsoup.nodes.Element element37 = element34.prepend("#data");
        // The following exception was thrown during execution in test generation
        try {
            element21.replaceWith((org.jsoup.nodes.Node) element34);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(elements20);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "#document" + "'", str27, "#document");
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(element32);
        org.junit.Assert.assertNotNull(element34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(element37);
    }

    @Test
    public void test0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0645");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        java.lang.String str4 = document1.nodeName();
        org.jsoup.nodes.Element element6 = document1.appendElement("#document#document");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements8 = element6.select("<html> \n <head> \n </head> \n <body>\n   #root  \n </body>\n</html>");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query <html> ? <head> ? </head> ? <body>?   #root  ? </body>?</html>");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#document" + "'", str4, "#document");
        org.junit.Assert.assertNotNull(element6);
    }

    @Test
    public void test0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0646");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("#document#documenthi!#root=&quot;hi!&quot;", "");
        org.junit.Assert.assertNotNull(document2);
    }

    @Test
    public void test0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0647");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("#root", "");
        org.jsoup.nodes.Element element5 = document2.attr("#root", "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        java.lang.String str6 = element5.id();
        org.jsoup.nodes.Element element8 = element5.prependElement("#declaration");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element8);
    }

    @Test
    public void test0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0648");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.hasText();
        java.lang.String str3 = document1.nodeName();
        java.lang.String str4 = document1.val();
        org.jsoup.nodes.Element element5 = document1.body();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(element5);
    }

    @Test
    public void test0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0649");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("#document#document", "\n<!--#document-->", false);
        java.lang.String str4 = xmlDeclaration3.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = xmlDeclaration3.childNodes();
        java.lang.String str6 = xmlDeclaration3.toString();
        java.lang.String str7 = xmlDeclaration3.toString();
        java.lang.String str8 = xmlDeclaration3.nodeName();
        java.lang.String str9 = xmlDeclaration3.getWholeDeclaration();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<?#document#document>" + "'", str4, "<?#document#document>");
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<?#document#document>" + "'", str6, "<?#document#document>");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<?#document#document>" + "'", str7, "<?#document#document>");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#declaration" + "'", str8, "#declaration");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#document#document" + "'", str9, "#document#document");
    }

    @Test
    public void test0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0650");
        java.net.URL uRL0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parse(uRL0, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0651");
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
        java.lang.String str20 = document1.attr("[]");
        org.jsoup.nodes.Element element22 = document1.prependText("#document");
        boolean boolean24 = element22.hasAttr("");
        org.jsoup.select.Elements elements26 = element22.getElementsByIndexGreaterThan((int) (short) 100);
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(elements26);
    }

    @Test
    public void test0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0652");
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
        org.jsoup.parser.Tag tag32 = org.jsoup.parser.Tag.valueOf("#root");
        boolean boolean33 = tag32.isInline();
        boolean boolean34 = tag1.isValidAncestor(tag32);
        boolean boolean35 = tag32.requiresSpecificParent();
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
        org.junit.Assert.assertNotNull(tag32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0653");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Document document2 = document1.normalise();
        org.jsoup.nodes.Element element3 = document2.head();
        org.jsoup.nodes.Element element6 = document2.attr("org.jsoup.select.Selector$SelectorParseException: ", "[]");
        org.jsoup.select.Elements elements8 = document2.getElementsByIndexEquals((int) (byte) -1);
        org.jsoup.nodes.Element element9 = document2.head();
        org.jsoup.nodes.TextNode textNode12 = new org.jsoup.nodes.TextNode("#root", "");
        org.jsoup.nodes.TextNode textNode14 = textNode12.text("#document");
        org.jsoup.nodes.TextNode textNode16 = textNode12.text(" class=\"hi!\"");
        java.lang.String str17 = textNode16.getWholeText();
        java.lang.String str18 = textNode16.nodeName();
        org.jsoup.nodes.Element element19 = element9.appendChild((org.jsoup.nodes.Node) textNode16);
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(textNode14);
        org.junit.Assert.assertNotNull(textNode16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + " class=\"hi!\"" + "'", str17, " class=\"hi!\"");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "#text" + "'", str18, "#text");
        org.junit.Assert.assertNotNull(element19);
    }

    @Test
    public void test0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0654");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("#document");
        java.lang.String str2 = tokenQueue1.consumeAttributeKey();
        java.lang.String str4 = tokenQueue1.consumeTo("#root=\"hi!\"");
        java.lang.String str5 = tokenQueue1.toString();
        java.lang.String str7 = tokenQueue1.chompTo("");
        boolean boolean8 = tokenQueue1.matchesWord();
        boolean boolean10 = tokenQueue1.matchChomp("<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        java.lang.String str11 = tokenQueue1.consumeWord();
        boolean boolean12 = tokenQueue1.consumeWhitespace();
        // The following exception was thrown during execution in test generation
        try {
            tokenQueue1.consume(" class=\"hi!\"");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Queue did not match expected sequence");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#document" + "'", str4, "#document");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0655");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("org.jsoup.select.selector$selectorparseexception: org.jsoup.select.selector$selectorparseexception:=\"#root\"", "\n<!--#data-->");
        org.junit.Assert.assertNotNull(document2);
    }

    @Test
    public void test0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0656");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("", "<html> \n <head> \n </head> \n <body>\n   #root  \n </body>\n</html>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0657");
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
        java.util.Collection<org.jsoup.nodes.Element> elementCollection27 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean28 = elements26.retainAll(elementCollection27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
        org.junit.Assert.assertNotNull(elements20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(elements23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(elements26);
    }

    @Test
    public void test0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0658");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.hasText();
        java.lang.String str3 = document1.nodeName();
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        org.jsoup.nodes.Element element8 = document1.classNames((java.util.Set<java.lang.String>) strSet6);
        org.jsoup.nodes.Element element10 = element8.addClass("#document");
        org.jsoup.select.Elements elements13 = element10.getElementsByAttributeValueNot("#root", "org.jsoup.select.Selector$SelectorParseException: ");
        org.jsoup.select.Elements elements15 = element10.getElementsByIndexEquals((int) ' ');
        java.util.function.UnaryOperator<org.jsoup.nodes.Element> elementUnaryOperator16 = null;
        // The following exception was thrown during execution in test generation
        try {
            elements15.replaceAll(elementUnaryOperator16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(elements15);
    }

    @Test
    public void test0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0659");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("org.jsoup.select.Selector$SelectorParseException: ");
        boolean boolean2 = tag1.isData();
        boolean boolean3 = tag1.requiresSpecificParent();
        boolean boolean4 = tag1.isBlock();
        org.jsoup.parser.Tag tag6 = org.jsoup.parser.Tag.valueOf("org.jsoup.select.Selector$SelectorParseException: ");
        boolean boolean7 = tag6.isData();
        boolean boolean8 = tag6.requiresSpecificParent();
        boolean boolean9 = tag6.isBlock();
        boolean boolean10 = tag1.canContain(tag6);
        java.lang.String str11 = tag6.getName();
        org.jsoup.nodes.Document document13 = new org.jsoup.nodes.Document("");
        boolean boolean14 = document13.hasText();
        boolean boolean15 = document13.hasText();
        org.jsoup.nodes.Document document17 = new org.jsoup.nodes.Document("");
        boolean boolean18 = document17.hasText();
        java.lang.String str19 = document17.nodeName();
        java.lang.String[] strArray21 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet22 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet22, strArray21);
        org.jsoup.nodes.Element element24 = document17.classNames((java.util.Set<java.lang.String>) strSet22);
        org.jsoup.nodes.Element element25 = document13.classNames((java.util.Set<java.lang.String>) strSet22);
        java.util.Set<java.lang.String> strSet26 = document13.classNames();
        org.jsoup.nodes.Element element28 = document13.getElementById("#document#document");
        java.lang.String str29 = document13.id();
        org.jsoup.parser.Tag tag30 = document13.tag();
        org.jsoup.parser.Tag tag32 = org.jsoup.parser.Tag.valueOf("#declaration");
        java.lang.String str33 = tag32.toString();
        boolean boolean34 = tag30.isValidParent(tag32);
        boolean boolean35 = tag6.isValidAncestor(tag30);
        boolean boolean36 = tag6.isEmpty();
        boolean boolean37 = tag6.preserveWhitespace();
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "org.jsoup.select.selector$selectorparseexception:" + "'", str11, "org.jsoup.select.selector$selectorparseexception:");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "#document" + "'", str19, "#document");
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(strSet26);
        org.junit.Assert.assertNull(element28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(tag30);
        org.junit.Assert.assertNotNull(tag32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "#declaration" + "'", str33, "#declaration");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0660");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        int int1 = attributes0.size();
        boolean boolean3 = attributes0.hasKey("");
        java.lang.String str4 = attributes0.toString();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor5 = attributes0.iterator();
        attributes0.put("\n<!--#declaration-->", "[]");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(attributeItor5);
    }

    @Test
    public void test0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0661");
        org.jsoup.nodes.Evaluator evaluator0 = null;
        org.jsoup.nodes.Document document2 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Document document3 = document2.normalise();
        org.jsoup.nodes.Element element5 = document2.prependElement("org.jsoup.select.selector$selectorparseexception:");
        org.jsoup.nodes.Element element7 = element5.wrap("#root");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements8 = org.jsoup.select.Collector.collect(evaluator0, element5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNull(element7);
    }

    @Test
    public void test0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0662");
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
        org.jsoup.parser.Tag tag20 = org.jsoup.parser.Tag.valueOf("#declaration");
        java.lang.String str21 = tag20.toString();
        boolean boolean22 = tag18.isValidParent(tag20);
        org.jsoup.nodes.Element element24 = new org.jsoup.nodes.Element(tag18, "");
        boolean boolean25 = tag18.isBlock();
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
        org.junit.Assert.assertNotNull(tag20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "#declaration" + "'", str21, "#declaration");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0663");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Document document2 = document1.normalise();
        org.jsoup.nodes.Element element3 = document2.head();
        org.jsoup.nodes.Element element6 = document2.attr("org.jsoup.select.Selector$SelectorParseException: ", "[]");
        java.lang.String str7 = document2.outerHtml();
        org.jsoup.nodes.Element element8 = document2.body();
        org.jsoup.nodes.Element element9 = document2.head();
        boolean boolean11 = element9.hasAttr("\n<!--#document-->");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>" + "'", str7, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0664");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragmentRelaxed("org.jsoup.select.selector$selectorparseexception: org.jsoup.select.selector$selectorparseexception:=\"#root\"", "a");
        org.junit.Assert.assertNotNull(document2);
    }

    @Test
    public void test0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0665");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements5 = elements3.prepend("");
        org.jsoup.select.Elements elements7 = elements5.removeAttr("");
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element[] elementArray10 = new org.jsoup.nodes.Element[] { document9 };
        java.util.ArrayList<org.jsoup.nodes.Element> elementList11 = new java.util.ArrayList<org.jsoup.nodes.Element>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<org.jsoup.nodes.Element>) elementList11, elementArray10);
        java.util.Spliterator<org.jsoup.nodes.Element> elementSpliterator13 = elementList11.spliterator();
        java.util.Spliterator<org.jsoup.nodes.Element> elementSpliterator14 = elementList11.spliterator();
        int int15 = elements5.lastIndexOf((java.lang.Object) elementList11);
        org.jsoup.nodes.Comment comment18 = new org.jsoup.nodes.Comment("#root", "");
        comment18.setBaseUri("#document#documenthi!");
        java.lang.String str21 = comment18.getData();
        java.lang.String str22 = comment18.nodeName();
        org.jsoup.nodes.Comment comment25 = new org.jsoup.nodes.Comment("#document", "#root");
        org.jsoup.nodes.Comment comment28 = new org.jsoup.nodes.Comment("#document", "#root");
        java.lang.String str29 = comment28.toString();
        org.jsoup.nodes.Comment comment32 = new org.jsoup.nodes.Comment("#root", "#root");
        java.lang.String str33 = comment32.getData();
        org.jsoup.nodes.Comment comment36 = new org.jsoup.nodes.Comment("#root", "");
        java.util.List<org.jsoup.nodes.Node> nodeList37 = comment36.childNodes();
        org.jsoup.nodes.Comment[] commentArray38 = new org.jsoup.nodes.Comment[] { comment18, comment25, comment28, comment32, comment36 };
        org.jsoup.nodes.Comment[] commentArray39 = elements5.toArray(commentArray38);
        java.lang.String str41 = elements5.attr("hi!");
        java.lang.Object obj42 = null;
        boolean boolean43 = elements5.contains(obj42);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(elementArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(elementSpliterator13);
        org.junit.Assert.assertNotNull(elementSpliterator14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "#root" + "'", str21, "#root");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "#comment" + "'", str22, "#comment");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "\n<!--#document-->" + "'", str29, "\n<!--#document-->");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "#root" + "'", str33, "#root");
        org.junit.Assert.assertNotNull(nodeList37);
        org.junit.Assert.assertNotNull(commentArray38);
        org.junit.Assert.assertNotNull(commentArray39);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0666");
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
        org.jsoup.nodes.Element element22 = element13.previousElementSibling();
        org.jsoup.nodes.Node node23 = element13.previousSibling();
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
        org.junit.Assert.assertNull(element22);
        org.junit.Assert.assertNull(node23);
    }

    @Test
    public void test0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0667");
        org.jsoup.nodes.Element[] elementArray0 = new org.jsoup.nodes.Element[] {};
        org.jsoup.select.Elements elements1 = new org.jsoup.select.Elements(elementArray0);
        org.jsoup.select.Elements elements2 = new org.jsoup.select.Elements(elementArray0);
        org.jsoup.select.Elements elements4 = elements2.removeAttr("<?hi!>");
        org.junit.Assert.assertNotNull(elementArray0);
        org.junit.Assert.assertNotNull(elements4);
    }

    @Test
    public void test0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0668");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parse("hi!");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValue("hi!", "hi!");
        boolean boolean5 = document1.hasText();
        boolean boolean6 = document1.hasText();
        org.jsoup.parser.Tag tag7 = document1.tag();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(tag7);
    }

    @Test
    public void test0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0669");
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
        org.jsoup.select.Elements elements21 = document17.getElementsByAttributeValueContaining("<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "org.jsoup.select.selector$selectorparseexception:");
        java.lang.String str22 = document17.nodeName();
        org.jsoup.nodes.Node node25 = document17.attr("<?#document#document>", "org.jsoup.select.Selector$SelectorParseException: org.jsoup.select.selector$selectorparseexception:");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(elementArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(elementSpliterator11);
        org.junit.Assert.assertNotNull(elementSpliterator12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(document17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(elements21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "#document" + "'", str22, "#document");
        org.junit.Assert.assertNotNull(node25);
    }

    @Test
    public void test0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0670");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements36 = document19.select("<?#document#document>");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query <?#document#document>");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
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
        org.junit.Assert.assertNotNull(document28);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(strSet33);
        org.junit.Assert.assertNotNull(element34);
    }

    @Test
    public void test0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0671");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("org.jsoup.select.Selector$SelectorParseException: ");
        boolean boolean2 = tag1.isData();
        org.jsoup.nodes.Attributes attributes4 = new org.jsoup.nodes.Attributes();
        int int5 = attributes4.size();
        java.lang.String str6 = attributes4.html();
        org.jsoup.nodes.Element element7 = new org.jsoup.nodes.Element(tag1, "org.jsoup.select.selector$selectorparseexception:", attributes4);
        attributes4.remove("\n<!--org.jsoup.select.selector$selectorparseexception: org.jsoup.select.selector$selectorparseexception:=\"#root\"-->");
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0672");
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
        boolean boolean19 = elements15.hasAttr("#document#documentdocument");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(elementArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(elementSpliterator11);
        org.junit.Assert.assertNotNull(elementSpliterator12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0673");
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
        java.lang.String str26 = element21.outerHtml();
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
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "<html> \n <head> \n </head> \n <body>\n   #root  \n </body>\n</html><<?#document#document>>\n</<?#document#document>>" + "'", str26, "<html> \n <head> \n </head> \n <body>\n   #root  \n </body>\n</html><<?#document#document>>\n</<?#document#document>>");
    }

    @Test
    public void test0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0674");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element5 = document1.prepend("#document");
        org.jsoup.nodes.Element element7 = document1.createElement("#data");
        org.jsoup.select.Elements elements9 = element7.getElementsByTag("\n&lt;!--#root--&gt;");
        org.jsoup.select.Elements elements11 = element7.getElementsByAttribute("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        java.lang.String str12 = element7.id();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0675");
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
        org.jsoup.select.Elements elements18 = elements10.eq((int) (byte) 100);
        org.jsoup.nodes.Element element19 = elements18.last();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertNull(element19);
    }

    @Test
    public void test0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0676");
        org.jsoup.nodes.Evaluator evaluator0 = null;
        org.jsoup.nodes.Document document3 = org.jsoup.Jsoup.parseBodyFragment("<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>", "");
        org.jsoup.select.Elements elements5 = document3.getElementsByIndexGreaterThan(2);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements6 = org.jsoup.select.Collector.collect(evaluator0, (org.jsoup.nodes.Element) document3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(elements5);
    }

    @Test
    public void test0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0677");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        java.lang.String str4 = document1.nodeName();
        java.lang.String str5 = document1.className();
        org.jsoup.nodes.Element element7 = document1.getElementById("org.jsoup.select.Selector$SelectorParseException: ");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements9 = element7.getElementsByIndexGreaterThan((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#document" + "'", str4, "#document");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(element7);
    }

    @Test
    public void test0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0678");
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
        org.jsoup.select.Elements elements17 = element12.getElementsByAttributeValueStarting("[#, d, o, c, u, m, e, n, t]", "\n<!--#root-->");
        org.jsoup.select.Elements elements19 = elements17.select("<html> \n <head> \n </head> \n <body>\n   #root  \n </body>\n</html>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element21 = elements19.remove((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 97, Size: 0");
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
        org.junit.Assert.assertNull(element14);
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertNotNull(elements19);
    }

    @Test
    public void test0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0679");
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
        org.jsoup.nodes.Document document21 = org.jsoup.parser.Parser.parse("#root", "");
        org.jsoup.nodes.Element element24 = document21.attr("#root", "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        java.lang.String str25 = element24.id();
        java.util.Set<java.lang.String> strSet26 = element24.classNames();
        boolean boolean27 = tag18.equals((java.lang.Object) element24);
        org.jsoup.nodes.Element element29 = element24.appendElement("<?hi!>");
        org.jsoup.nodes.Element element30 = element29.firstElementSibling();
        org.jsoup.select.Elements elements31 = element29.children();
        org.jsoup.nodes.Document document34 = new org.jsoup.nodes.Document("");
        boolean boolean35 = document34.hasText();
        java.lang.String str36 = document34.nodeName();
        java.lang.String[] strArray38 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet39 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet39, strArray38);
        org.jsoup.nodes.Element element41 = document34.classNames((java.util.Set<java.lang.String>) strSet39);
        org.jsoup.nodes.Element element43 = element41.addClass("#document");
        java.lang.String str44 = element43.html();
        org.jsoup.nodes.Element element46 = element43.appendElement("#document");
        org.jsoup.nodes.Document document48 = new org.jsoup.nodes.Document("");
        boolean boolean49 = document48.hasText();
        java.lang.String str50 = document48.nodeName();
        java.lang.String[] strArray52 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet53 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet53, strArray52);
        org.jsoup.nodes.Element element55 = document48.classNames((java.util.Set<java.lang.String>) strSet53);
        org.jsoup.nodes.Element element57 = document48.append("#document");
        org.jsoup.nodes.Element element59 = document48.prepend("#document");
        org.jsoup.nodes.Element element61 = element59.wrap("#document");
        java.lang.String str62 = element59.baseUri();
        org.jsoup.nodes.Element element63 = element43.prependChild((org.jsoup.nodes.Node) element59);
        org.jsoup.nodes.Element element65 = element63.addClass("#document#document");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element66 = elements31.set(3, element65);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 3, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
        org.junit.Assert.assertNotNull(tag18);
        org.junit.Assert.assertNotNull(document21);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(strSet26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertNotNull(elements31);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "#document" + "'", str36, "#document");
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(element41);
        org.junit.Assert.assertNotNull(element43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertNotNull(element46);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "#document" + "'", str50, "#document");
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(element55);
        org.junit.Assert.assertNotNull(element57);
        org.junit.Assert.assertNotNull(element59);
        org.junit.Assert.assertNull(element61);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertNotNull(element63);
        org.junit.Assert.assertNotNull(element65);
    }

    @Test
    public void test0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0680");
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
        org.jsoup.nodes.Element element27 = elements15.last();
        org.jsoup.nodes.Element element29 = element27.appendElement("[#, d, o, c, u, m, e, n, t]");
        org.jsoup.nodes.Element element30 = element29.previousElementSibling();
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
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertNull(element30);
    }

    @Test
    public void test0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0681");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("org.jsoup.select.Selector$SelectorParseException: ");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Document document4 = document3.normalise();
        org.jsoup.nodes.Element element5 = document3.head();
        org.jsoup.nodes.Element element7 = element5.append("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element9 = element5.wrap("#text");
        boolean boolean10 = tag1.equals((java.lang.Object) element9);
        boolean boolean11 = tag1.preserveWhitespace();
        org.jsoup.parser.Tag tag13 = org.jsoup.parser.Tag.valueOf("org.jsoup.select.Selector$SelectorParseException: ");
        boolean boolean14 = tag13.isData();
        boolean boolean15 = tag13.requiresSpecificParent();
        boolean boolean16 = tag13.isBlock();
        org.jsoup.parser.Tag tag18 = org.jsoup.parser.Tag.valueOf("org.jsoup.select.Selector$SelectorParseException: ");
        boolean boolean19 = tag18.isData();
        boolean boolean20 = tag18.requiresSpecificParent();
        boolean boolean21 = tag18.isBlock();
        boolean boolean22 = tag13.canContain(tag18);
        boolean boolean23 = tag13.isBlock();
        boolean boolean24 = tag13.isData();
        java.lang.String str25 = tag13.getName();
        boolean boolean26 = tag13.requiresSpecificParent();
        org.jsoup.parser.Tag tag28 = org.jsoup.parser.Tag.valueOf("#root");
        boolean boolean29 = tag28.isInline();
        boolean boolean30 = tag13.canContain(tag28);
        org.jsoup.parser.Tag tag31 = tag28.getImplicitParent();
        org.jsoup.parser.Tag tag32 = tag28.getImplicitParent();
        boolean boolean33 = tag1.canContain(tag28);
        org.jsoup.parser.Tag tag35 = org.jsoup.parser.Tag.valueOf("org.jsoup.select.Selector$SelectorParseException: ");
        boolean boolean36 = tag35.isData();
        boolean boolean37 = tag35.requiresSpecificParent();
        boolean boolean38 = tag35.isBlock();
        org.jsoup.parser.Tag tag40 = org.jsoup.parser.Tag.valueOf("org.jsoup.select.Selector$SelectorParseException: ");
        boolean boolean41 = tag40.isData();
        boolean boolean42 = tag40.requiresSpecificParent();
        boolean boolean43 = tag40.isBlock();
        boolean boolean44 = tag35.canContain(tag40);
        boolean boolean45 = tag35.isBlock();
        boolean boolean46 = tag35.isData();
        boolean boolean47 = tag35.isBlock();
        org.jsoup.parser.Tag tag48 = tag35.getImplicitParent();
        boolean boolean49 = tag28.isValidParent(tag48);
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(document4);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNull(element9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(tag13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(tag18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "org.jsoup.select.selector$selectorparseexception:" + "'", str25, "org.jsoup.select.selector$selectorparseexception:");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(tag28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(tag31);
        org.junit.Assert.assertNotNull(tag32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(tag35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(tag40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(tag48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0682");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element22 = element18.child((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
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
        org.junit.Assert.assertNull(element16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(element20);
    }

    @Test
    public void test0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0683");
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
        java.lang.Object[] objArray20 = elements12.toArray();
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
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[]");
    }

    @Test
    public void test0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0684");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements5 = elements3.prepend("");
        org.jsoup.select.Elements elements7 = elements5.removeAttr("");
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element[] elementArray10 = new org.jsoup.nodes.Element[] { document9 };
        java.util.ArrayList<org.jsoup.nodes.Element> elementList11 = new java.util.ArrayList<org.jsoup.nodes.Element>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<org.jsoup.nodes.Element>) elementList11, elementArray10);
        java.util.Spliterator<org.jsoup.nodes.Element> elementSpliterator13 = elementList11.spliterator();
        java.util.Spliterator<org.jsoup.nodes.Element> elementSpliterator14 = elementList11.spliterator();
        int int15 = elements5.lastIndexOf((java.lang.Object) elementList11);
        org.jsoup.nodes.Comment comment18 = new org.jsoup.nodes.Comment("#root", "");
        comment18.setBaseUri("#document#documenthi!");
        java.lang.String str21 = comment18.getData();
        java.lang.String str22 = comment18.nodeName();
        org.jsoup.nodes.Comment comment25 = new org.jsoup.nodes.Comment("#document", "#root");
        org.jsoup.nodes.Comment comment28 = new org.jsoup.nodes.Comment("#document", "#root");
        java.lang.String str29 = comment28.toString();
        org.jsoup.nodes.Comment comment32 = new org.jsoup.nodes.Comment("#root", "#root");
        java.lang.String str33 = comment32.getData();
        org.jsoup.nodes.Comment comment36 = new org.jsoup.nodes.Comment("#root", "");
        java.util.List<org.jsoup.nodes.Node> nodeList37 = comment36.childNodes();
        org.jsoup.nodes.Comment[] commentArray38 = new org.jsoup.nodes.Comment[] { comment18, comment25, comment28, comment32, comment36 };
        org.jsoup.nodes.Comment[] commentArray39 = elements5.toArray(commentArray38);
        java.lang.String str41 = elements5.attr("hi!");
        org.jsoup.nodes.Document document44 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements46 = document44.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements48 = elements46.prepend("");
        org.jsoup.select.Elements elements50 = elements48.removeAttr("");
        org.jsoup.nodes.Document document52 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements54 = document52.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements56 = elements54.prepend("");
        org.jsoup.select.Elements elements58 = elements56.removeAttr("");
        boolean boolean59 = elements48.containsAll((java.util.Collection<org.jsoup.nodes.Element>) elements56);
        org.jsoup.select.Elements elements61 = elements56.wrap("#root");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean62 = elements5.addAll((int) 'd', (java.util.Collection<org.jsoup.nodes.Element>) elements61);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(elementArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(elementSpliterator13);
        org.junit.Assert.assertNotNull(elementSpliterator14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "#root" + "'", str21, "#root");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "#comment" + "'", str22, "#comment");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "\n<!--#document-->" + "'", str29, "\n<!--#document-->");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "#root" + "'", str33, "#root");
        org.junit.Assert.assertNotNull(nodeList37);
        org.junit.Assert.assertNotNull(commentArray38);
        org.junit.Assert.assertNotNull(commentArray39);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(elements46);
        org.junit.Assert.assertNotNull(elements48);
        org.junit.Assert.assertNotNull(elements50);
        org.junit.Assert.assertNotNull(elements54);
        org.junit.Assert.assertNotNull(elements56);
        org.junit.Assert.assertNotNull(elements58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(elements61);
    }

    @Test
    public void test0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0685");
        org.jsoup.safety.Whitelist whitelist1 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.jsoup.Jsoup.isValid("<html> \n <head> \n </head> \n <body>\n   #root  \n </body>\n</html><<?#document#document>>\n</<?#document#document>>", whitelist1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0686");
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
        org.jsoup.select.Elements elements18 = element12.getElementsByAttributeValueContaining("org.jsoup.select.Selector$SelectorParseException: org.jsoup.select.selector$selectorparseexception:", "#document#documenthi!#root=&quot;hi!&quot;");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element20 = element12.getElementById("");
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
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(elements18);
    }

    @Test
    public void test0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0687");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parse("hi!");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("org.jsoup.select.selector$selectorparseexception:");
        org.jsoup.select.Elements elements5 = elements3.eq((int) (byte) 10);
        org.jsoup.select.Elements elements7 = elements3.html("hi!");
        java.util.function.UnaryOperator<org.jsoup.nodes.Element> elementUnaryOperator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            elements7.replaceAll(elementUnaryOperator8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elements7);
    }

    @Test
    public void test0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0688");
        org.jsoup.nodes.DataNode dataNode2 = org.jsoup.nodes.DataNode.createFromEncoded("[]", "#document#documentdocument");
        java.lang.String str3 = dataNode2.toString();
        org.junit.Assert.assertNotNull(dataNode2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[]" + "'", str3, "[]");
    }

    @Test
    public void test0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0689");
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parse("hi!=\"#root=&quot;hi!&quot;\"", "");
        org.jsoup.nodes.Element element4 = document2.createElement("a");
        org.jsoup.select.Elements elements5 = element4.getAllElements();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements7 = elements5.removeAttr("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements5);
    }

    @Test
    public void test0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0690");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        java.lang.String str4 = elements3.outerHtml();
        java.lang.String str5 = elements3.val();
        org.jsoup.select.Elements elements6 = new org.jsoup.select.Elements((java.util.List<org.jsoup.nodes.Element>) elements3);
        java.lang.String str8 = elements3.attr("org.jsoup.select.Selector$SelectorParseException: ");
        org.jsoup.select.Elements elements10 = elements3.append("");
        java.lang.Class<?> wildcardClass11 = elements3.getClass();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0691");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        java.lang.String str4 = elements3.val();
        java.lang.Object obj5 = null;
        int int6 = elements3.lastIndexOf(obj5);
        org.jsoup.select.Elements elements8 = elements3.eq((int) '#');
        boolean boolean10 = elements3.hasAttr("#root");
        boolean boolean12 = elements3.is("#root=\"hi!\"");
        org.jsoup.nodes.Element element13 = elements3.last();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(element13);
    }

    @Test
    public void test0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0692");
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
        org.jsoup.nodes.Element element25 = elements24.first();
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
        org.junit.Assert.assertNull(element25);
    }

    @Test
    public void test0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0693");
        org.jsoup.safety.Whitelist whitelist2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.jsoup.Jsoup.clean("<?#document#document>", "document", whitelist2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0694");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Document document2 = document1.normalise();
        org.jsoup.nodes.Element element4 = document1.prependElement("org.jsoup.select.selector$selectorparseexception:");
        java.lang.String str5 = element4.data();
        java.lang.String str6 = element4.data();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0695");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("org.jsoup.select.Selector$SelectorParseException: ");
        java.lang.String str2 = tag1.getName();
        boolean boolean3 = tag1.isInline();
        boolean boolean4 = tag1.isEmpty();
        org.jsoup.parser.Tag tag6 = org.jsoup.parser.Tag.valueOf("org.jsoup.select.Selector$SelectorParseException: ");
        java.lang.String str7 = tag6.getName();
        boolean boolean8 = tag6.isInline();
        boolean boolean9 = tag6.isEmpty();
        boolean boolean10 = tag6.isEmpty();
        org.jsoup.nodes.Document document13 = org.jsoup.parser.Parser.parse("#root", "");
        org.jsoup.nodes.Element element16 = document13.attr("#root", "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        java.lang.String str17 = document13.tagName();
        java.lang.String str18 = document13.text();
        boolean boolean19 = document13.isBlock();
        boolean boolean20 = tag6.equals((java.lang.Object) document13);
        boolean boolean21 = tag1.isValidParent(tag6);
        java.lang.Class<?> wildcardClass22 = tag6.getClass();
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.jsoup.select.selector$selectorparseexception:" + "'", str2, "org.jsoup.select.selector$selectorparseexception:");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "org.jsoup.select.selector$selectorparseexception:" + "'", str7, "org.jsoup.select.selector$selectorparseexception:");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "#root" + "'", str17, "#root");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "#root" + "'", str18, "#root");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0696");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        int int1 = attributes0.size();
        org.jsoup.nodes.Document document3 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements5 = document3.getElementsByAttribute("hi!");
        java.lang.String str6 = elements5.val();
        java.lang.Object obj7 = null;
        int int8 = elements5.lastIndexOf(obj7);
        org.jsoup.select.Elements elements10 = elements5.eq((int) '#');
        boolean boolean11 = attributes0.equals((java.lang.Object) elements10);
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor12 = attributes0.iterator();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor13 = attributes0.iterator();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(attributeItor12);
        org.junit.Assert.assertNotNull(attributeItor13);
    }

    @Test
    public void test0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0697");
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
        org.jsoup.select.Elements elements21 = document15.getElementsByTag("org.jsoup.select.Selector$SelectorParseException: ");
        boolean boolean22 = elements21.isEmpty();
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
        org.junit.Assert.assertNotNull(elements21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0698");
        org.jsoup.nodes.Evaluator evaluator0 = null;
        org.jsoup.nodes.Document document2 = new org.jsoup.nodes.Document("");
        boolean boolean3 = document2.hasText();
        boolean boolean4 = document2.hasText();
        org.jsoup.nodes.Document document6 = new org.jsoup.nodes.Document("");
        boolean boolean7 = document6.hasText();
        java.lang.String str8 = document6.nodeName();
        java.lang.String[] strArray10 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet11 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet11, strArray10);
        org.jsoup.nodes.Element element13 = document6.classNames((java.util.Set<java.lang.String>) strSet11);
        org.jsoup.nodes.Element element14 = document2.classNames((java.util.Set<java.lang.String>) strSet11);
        java.util.Set<java.lang.String> strSet15 = document2.classNames();
        org.jsoup.nodes.Element element17 = document2.getElementById("#document#document");
        java.lang.String str18 = document2.id();
        org.jsoup.parser.Tag tag19 = document2.tag();
        org.jsoup.parser.Tag tag21 = org.jsoup.parser.Tag.valueOf("#declaration");
        java.lang.String str22 = tag21.toString();
        boolean boolean23 = tag19.isValidParent(tag21);
        org.jsoup.nodes.Element element25 = new org.jsoup.nodes.Element(tag19, "");
        java.lang.String str26 = element25.text();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements27 = org.jsoup.select.Collector.collect(evaluator0, element25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#document" + "'", str8, "#document");
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertNull(element17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(tag19);
        org.junit.Assert.assertNotNull(tag21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "#declaration" + "'", str22, "#declaration");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0699");
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
        java.lang.String str16 = element10.val();
        boolean boolean17 = element10.hasText();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0700");
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
        java.lang.String str15 = element13.text();
        org.jsoup.nodes.Element element16 = element13.firstElementSibling();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = element16.hasClass("org.jsoup.select.selector$selectorparseexception: org.jsoup.select.selector$selectorparseexception:=\"#root\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(element16);
    }

    @Test
    public void test0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0701");
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
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor31 = elements28.listIterator(0);
        org.jsoup.select.Elements elements33 = elements28.append("");
        org.jsoup.select.Elements elements35 = elements28.html(" class=\"hi!\"");
        boolean boolean37 = elements35.hasAttr("org.jsoup.select.selector$selectorparseexception: org.jsoup.select.selector$selectorparseexception:");
        java.util.stream.Stream<org.jsoup.nodes.Element> elementStream38 = elements35.stream();
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
        org.junit.Assert.assertNotNull(elementItor31);
        org.junit.Assert.assertNotNull(elements33);
        org.junit.Assert.assertNotNull(elements35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(elementStream38);
    }

    @Test
    public void test0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0702");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element4 = document1.attr("hi!", "#root");
        org.jsoup.nodes.Attributes attributes5 = document1.attributes();
        org.jsoup.nodes.Element element6 = document1.body();
        org.jsoup.nodes.Element element8 = document1.createElement("#document#documentdocument");
        org.jsoup.nodes.Document document10 = new org.jsoup.nodes.Document("hi!=\"#root=&quot;hi!&quot;\"");
        // The following exception was thrown during execution in test generation
        try {
            element8.replaceWith((org.jsoup.nodes.Node) document10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertNull(element6);
        org.junit.Assert.assertNotNull(element8);
    }

    @Test
    public void test0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0703");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("#root", "");
        java.lang.String str3 = document2.outerHtml();
        org.jsoup.nodes.Element element5 = document2.append("<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        org.jsoup.select.Elements elements7 = document2.getElementsByIndexEquals(1);
        org.jsoup.nodes.Element element8 = document2.body();
        java.lang.String str9 = document2.toString();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>" + "'", str3, "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>\n<html> \n<head> \n</head> \n<body>\n  #root  \n</body>\n</html>" + "'", str9, "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>\n<html> \n<head> \n</head> \n<body>\n  #root  \n</body>\n</html>");
    }

    @Test
    public void test0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0704");
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
        java.lang.String str18 = elements15.val();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(elementArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(elementSpliterator11);
        org.junit.Assert.assertNotNull(elementSpliterator12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0705");
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
        org.jsoup.nodes.Element element16 = document1.head();
        org.jsoup.nodes.Document document18 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Document document19 = document18.normalise();
        org.jsoup.nodes.Element element20 = document19.head();
        org.jsoup.nodes.Element element23 = document19.attr("org.jsoup.select.Selector$SelectorParseException: ", "[]");
        org.jsoup.nodes.Element element25 = element23.appendElement("#comment");
        org.jsoup.nodes.Element element27 = element23.prependText("#document");
        org.jsoup.nodes.Element element29 = element23.toggleClass("<html> \n <head> \n </head> \n <body>\n   #root  \n </body>\n</html>");
        org.jsoup.nodes.Element element30 = document1.prependChild((org.jsoup.nodes.Node) element29);
        org.jsoup.nodes.Document document32 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements34 = document32.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements36 = elements34.prepend("");
        org.jsoup.select.Elements elements38 = elements36.removeAttr("");
        org.jsoup.nodes.Document document40 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements42 = document40.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements44 = elements42.prepend("");
        org.jsoup.select.Elements elements46 = elements44.removeAttr("");
        boolean boolean47 = elements36.containsAll((java.util.Collection<org.jsoup.nodes.Element>) elements44);
        java.lang.Object[] objArray48 = elements36.toArray();
        org.jsoup.nodes.Document document50 = new org.jsoup.nodes.Document("");
        boolean boolean51 = document50.hasText();
        java.lang.String str52 = document50.nodeName();
        java.lang.String str53 = document50.val();
        boolean boolean54 = elements36.add((org.jsoup.nodes.Element) document50);
        org.jsoup.nodes.Element element56 = document50.appendText("#document#documenthi!");
        org.jsoup.select.Elements elements58 = element56.getElementsByClass("#data");
        org.jsoup.nodes.Element element60 = element56.prependElement("#document#documentdocument");
        // The following exception was thrown during execution in test generation
        try {
            document1.replaceWith((org.jsoup.nodes.Node) element56);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertNull(element16);
        org.junit.Assert.assertNotNull(document18);
        org.junit.Assert.assertNotNull(document19);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertNotNull(elements34);
        org.junit.Assert.assertNotNull(elements36);
        org.junit.Assert.assertNotNull(elements38);
        org.junit.Assert.assertNotNull(elements42);
        org.junit.Assert.assertNotNull(elements44);
        org.junit.Assert.assertNotNull(elements46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray48), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray48), "[]");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "#document" + "'", str52, "#document");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(element56);
        org.junit.Assert.assertNotNull(elements58);
        org.junit.Assert.assertNotNull(element60);
    }

    @Test
    public void test0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0706");
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
        org.jsoup.select.Elements elements19 = elements17.wrap("hi!=\"#root=&quot;hi!&quot;\"");
        boolean boolean21 = elements19.hasClass("org.jsoup.select.selector$selectorparseexception: org.jsoup.select.selector$selectorparseexception:");
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
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0707");
        org.jsoup.nodes.Evaluator evaluator0 = null;
        org.jsoup.nodes.Document document2 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Document document3 = document2.normalise();
        org.jsoup.nodes.Element element4 = document3.head();
        org.jsoup.nodes.Element element7 = document3.attr("org.jsoup.select.Selector$SelectorParseException: ", "[]");
        org.jsoup.nodes.Element element9 = element7.appendElement("#comment");
        org.jsoup.nodes.Element element10 = element7.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements11 = org.jsoup.select.Collector.collect(evaluator0, element7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNull(element10);
    }

    @Test
    public void test0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0708");
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
        org.jsoup.nodes.Element element26 = document19.prependText("#comment");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements29 = document19.getElementsByAttributeValueContaining("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(element26);
    }

    @Test
    public void test0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0709");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.hasText();
        java.lang.String str3 = document1.nodeName();
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        org.jsoup.nodes.Element element8 = document1.classNames((java.util.Set<java.lang.String>) strSet6);
        java.lang.String str9 = document1.tagName();
        org.jsoup.nodes.Element element11 = document1.wrap("#root");
        java.lang.String str12 = document1.nodeName();
        java.lang.String str13 = document1.nodeName();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#root" + "'", str9, "#root");
        org.junit.Assert.assertNull(element11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "#document" + "'", str12, "#document");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "#document" + "'", str13, "#document");
    }

    @Test
    public void test0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0710");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;", "<?hi!>");
        org.junit.Assert.assertNotNull(document2);
    }

    @Test
    public void test0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0711");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        java.lang.String str4 = elements3.val();
        java.lang.Object obj5 = null;
        int int6 = elements3.lastIndexOf(obj5);
        org.jsoup.select.Elements elements8 = elements3.eq((int) '#');
        elements3.clear();
        int int10 = elements3.size();
        java.lang.String str12 = elements3.attr("org.jsoup.select.Selector$SelectorParseException:");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0712");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "\n<!--#root-->");
        java.lang.String str3 = textNode2.getWholeText();
        org.jsoup.nodes.TextNode textNode5 = textNode2.text("hi!");
        org.jsoup.nodes.TextNode textNode7 = textNode2.text("#root=\"hi!\"");
        java.lang.String str8 = textNode7.nodeName();
        java.lang.String str9 = textNode7.text();
        org.jsoup.nodes.TextNode textNode11 = textNode7.text("\n<!--a-->");
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(textNode5);
        org.junit.Assert.assertNotNull(textNode7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#text" + "'", str8, "#text");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#root=&quot;hi!&quot;" + "'", str9, "#root=&quot;hi!&quot;");
        org.junit.Assert.assertNotNull(textNode11);
    }

    @Test
    public void test0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0713");
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
        org.jsoup.select.Elements elements25 = elements5.prepend("");
        org.jsoup.nodes.Document document27 = new org.jsoup.nodes.Document("");
        boolean boolean28 = document27.hasText();
        java.lang.String str29 = document27.nodeName();
        java.lang.String[] strArray31 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet32 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet32, strArray31);
        org.jsoup.nodes.Element element34 = document27.classNames((java.util.Set<java.lang.String>) strSet32);
        org.jsoup.nodes.Element element36 = element34.addClass("#document");
        java.lang.String str37 = element36.html();
        element36.setBaseUri("hi!");
        int int40 = elements5.indexOf((java.lang.Object) "hi!");
        java.lang.String str42 = elements5.attr("#document#documentdocument");
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
        org.junit.Assert.assertNotNull(elements25);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "#document" + "'", str29, "#document");
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(element34);
        org.junit.Assert.assertNotNull(element36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
    }

    @Test
    public void test0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0714");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element4 = document1.attr("hi!", "#root");
        org.jsoup.select.Elements elements6 = element4.getElementsByTag("\n<!--#root-->");
        boolean boolean8 = elements6.hasAttr("\n<!--#root-->");
        org.jsoup.select.Elements elements10 = elements6.eq(2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(elements10);
    }

    @Test
    public void test0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0715");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("\n<!--#document-->", "");
        org.junit.Assert.assertNotNull(attribute2);
    }

    @Test
    public void test0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0716");
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
        org.jsoup.nodes.Attribute attribute42 = org.jsoup.nodes.Attribute.createFromEncoded("hi!", "hi!");
        attribute42.setKey("#root");
        java.lang.String str45 = attribute42.getKey();
        java.lang.String str46 = attribute42.html();
        attributes28.put(attribute42);
        attribute42.setKey("\n<!--a-->");
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
        org.junit.Assert.assertNotNull(attribute42);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "#root" + "'", str45, "#root");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "#root=\"hi!\"" + "'", str46, "#root=\"hi!\"");
    }

    @Test
    public void test0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0717");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        java.lang.String str4 = elements3.outerHtml();
        java.lang.String str5 = elements3.val();
        org.jsoup.select.Elements elements6 = new org.jsoup.select.Elements((java.util.List<org.jsoup.nodes.Element>) elements3);
        java.lang.String str8 = elements3.attr("org.jsoup.select.Selector$SelectorParseException: ");
        java.lang.String str10 = elements3.attr("<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0718");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded(" class=\"hi!\"", "org.jsoup.select.Selector$SelectorParseException: ");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("#data");
        java.lang.String str5 = textNode4.nodeName();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#text" + "'", str5, "#text");
    }

    @Test
    public void test0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0719");
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
        java.lang.String str53 = element50.tagName();
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
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "#root" + "'", str53, "#root");
    }

    @Test
    public void test0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0720");
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
        boolean boolean40 = tag37.canContainBlock();
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
    public void test0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0721");
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
        org.jsoup.nodes.Element element33 = document18.getElementById("#document#document");
        java.lang.String str34 = document18.id();
        org.jsoup.parser.Tag tag35 = document18.tag();
        org.jsoup.parser.Tag tag37 = org.jsoup.parser.Tag.valueOf("#declaration");
        java.lang.String str38 = tag37.toString();
        boolean boolean39 = tag35.isValidParent(tag37);
        org.jsoup.nodes.Element element41 = new org.jsoup.nodes.Element(tag35, "");
        boolean boolean42 = tag16.isValidAncestor(tag35);
        boolean boolean43 = tag16.isData();
        boolean boolean44 = tag16.isInline();
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
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "#document" + "'", str24, "#document");
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertNotNull(strSet31);
        org.junit.Assert.assertNull(element33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(tag35);
        org.junit.Assert.assertNotNull(tag37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "#declaration" + "'", str38, "#declaration");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
    }

    @Test
    public void test0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0722");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        java.lang.String str4 = elements3.val();
        java.lang.Object obj5 = null;
        int int6 = elements3.lastIndexOf(obj5);
        org.jsoup.select.Elements elements8 = elements3.eq((int) '#');
        elements3.clear();
        int int10 = elements3.size();
        java.util.Spliterator<org.jsoup.nodes.Element> elementSpliterator11 = elements3.spliterator();
        org.jsoup.select.Elements elements13 = elements3.removeClass("org.jsoup.select.selector$selectorparseexception: org.jsoup.select.selector$selectorparseexception:=\"#root\"");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(elementSpliterator11);
        org.junit.Assert.assertNotNull(elements13);
    }

    @Test
    public void test0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0723");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!", "\n&lt;!--#root--&gt;");
        org.junit.Assert.assertNotNull(attribute2);
    }

    @Test
    public void test0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0724");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("#root", "");
        java.lang.String str3 = document2.outerHtml();
        org.jsoup.nodes.Element element5 = document2.append("<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        org.jsoup.select.Elements elements7 = document2.getElementsByIndexEquals(1);
        org.jsoup.select.Elements elements9 = elements7.prepend("org.jsoup.select.selector$selectorparseexception:");
        org.jsoup.select.Elements elements11 = elements9.addClass("<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements13 = elements11.select("#root=\"hi!\"");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query #root=\"hi!\"");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>" + "'", str3, "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(elements11);
    }

    @Test
    public void test0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0725");
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
        boolean boolean36 = tag16.isEmpty();
        boolean boolean37 = tag16.isData();
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
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0726");
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
        java.lang.String str13 = elements10.val();
        org.jsoup.select.Elements elements15 = elements10.append("#document#document");
        boolean boolean16 = elements10.isEmpty();
        org.jsoup.select.Elements elements17 = new org.jsoup.select.Elements((java.util.List<org.jsoup.nodes.Element>) elements10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0727");
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
        boolean boolean18 = element17.isBlock();
        org.jsoup.nodes.Element element20 = element17.getElementById("#root=\"hi!\"");
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
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(element20);
    }

    @Test
    public void test0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0728");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element5 = document1.prepend("#document");
        org.jsoup.nodes.Element element6 = element5.empty();
        org.jsoup.select.Elements elements8 = element5.getElementsByTag("org.jsoup.select.Selector$SelectorParseException: ");
        org.jsoup.select.Elements elements10 = elements8.removeClass("#root");
        org.jsoup.select.Elements elements12 = elements8.append("");
        boolean boolean14 = elements8.hasAttr("#document#document");
        java.util.stream.Stream<org.jsoup.nodes.Element> elementStream15 = elements8.parallelStream();
        java.util.Collection<org.jsoup.nodes.Element> elementCollection16 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = elements8.retainAll(elementCollection16);
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
        org.junit.Assert.assertNotNull(elementStream15);
    }

    @Test
    public void test0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0729");
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
        java.lang.String str23 = elements22.text();
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
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0730");
        org.jsoup.safety.Whitelist whitelist1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.jsoup.Jsoup.clean("org.jsoup.select.selector$selectorparseexception: org.jsoup.select.selector$selectorparseexception:", whitelist1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0731");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parse("hi!");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValue("hi!", "hi!");
        org.jsoup.select.Selector.SelectorParseException selectorParseException6 = new org.jsoup.select.Selector.SelectorParseException("");
        boolean boolean7 = elements4.contains((java.lang.Object) "");
        boolean boolean9 = elements4.is("[]");
        org.jsoup.nodes.Document document11 = new org.jsoup.nodes.Document("");
        boolean boolean12 = document11.hasText();
        java.lang.String str13 = document11.nodeName();
        java.lang.String str14 = document11.val();
        java.lang.String str15 = document11.outerHtml();
        java.lang.String[] strArray18 = new java.lang.String[] { "\n<!--#document-->", "#data" };
        java.util.LinkedHashSet<java.lang.String> strSet19 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet19, strArray18);
        org.jsoup.nodes.Element element21 = document11.classNames((java.util.Set<java.lang.String>) strSet19);
        java.util.LinkedHashSet[] linkedHashSetArray23 = new java.util.LinkedHashSet[1];
        @SuppressWarnings("unchecked")
        java.util.LinkedHashSet<java.lang.String>[] strSetArray24 = (java.util.LinkedHashSet<java.lang.String>[]) linkedHashSetArray23;
        strSetArray24[0] = strSet19;
        java.util.LinkedHashSet<java.lang.String>[] strSetArray27 = elements4.toArray(strSetArray24);
        org.jsoup.select.Elements elements29 = elements4.select("org.jsoup.select.Selector$SelectorParseException: \n<!--#document-->");
        org.jsoup.select.Elements elements31 = elements4.val("hi!");
        org.jsoup.nodes.Element element32 = elements31.last();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "#document" + "'", str13, "#document");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(linkedHashSetArray23);
        org.junit.Assert.assertNotNull(strSetArray24);
        org.junit.Assert.assertNotNull(strSetArray27);
        org.junit.Assert.assertNotNull(elements29);
        org.junit.Assert.assertNotNull(elements31);
        org.junit.Assert.assertNull(element32);
    }

    @Test
    public void test0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0732");
        org.jsoup.safety.Whitelist whitelist1 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.jsoup.Jsoup.isValid("\n<!--org.jsoup.select.selector$selectorparseexception: org.jsoup.select.selector$selectorparseexception:=\"#root\"-->", whitelist1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0733");
        org.jsoup.nodes.DataNode dataNode2 = org.jsoup.nodes.DataNode.createFromEncoded("# ", "#root=&quot;hi!&quot;\n<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>\n<html> \n<head> \n</head> \n<body>\n  #root  \n</body>\n</html>");
        org.junit.Assert.assertNotNull(dataNode2);
    }

    @Test
    public void test0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0734");
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
        org.jsoup.nodes.Document document21 = org.jsoup.parser.Parser.parse("#root", "");
        org.jsoup.nodes.Element element24 = document21.attr("#root", "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        java.lang.String str25 = element24.id();
        java.util.Set<java.lang.String> strSet26 = element24.classNames();
        boolean boolean27 = tag18.equals((java.lang.Object) element24);
        org.jsoup.nodes.Element element29 = element24.appendElement("<?hi!>");
        java.lang.String str30 = element24.className();
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
        org.junit.Assert.assertNotNull(document21);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(strSet26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
    }

    @Test
    public void test0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0735");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("<[#, d, o, c, u, m, e, n, t]>\n</[#, d, o, c, u, m, e, n, t]>#root=&quot;hi!&quot;", "#document#documenthi!#root=&quot;hi!&quot;");
    }

    @Test
    public void test0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0736");
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parseBodyFragment("<[#, d, o, c, u, m, e, n, t]>\n</[#, d, o, c, u, m, e, n, t]>#root=&quot;hi!&quot;", "org.jsoup.select.selector$selectorparseexception: org.jsoup.select.selector$selectorparseexception:=\"#root\"");
        org.junit.Assert.assertNotNull(document2);
    }

    @Test
    public void test0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0737");
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
        org.jsoup.select.Elements elements24 = elements22.val("hi!");
        org.jsoup.select.Elements elements26 = elements22.select("hi!=\"#root=&quot;hi!&quot;\"");
        java.lang.Object[] objArray27 = elements22.toArray();
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
        org.junit.Assert.assertNotNull(elements24);
        org.junit.Assert.assertNotNull(elements26);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[]");
    }

    @Test
    public void test0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0738");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Document document2 = document1.normalise();
        org.jsoup.nodes.Element element3 = document2.head();
        org.jsoup.nodes.Element element6 = document2.attr("org.jsoup.select.Selector$SelectorParseException: ", "[]");
        java.lang.String str7 = document2.toString();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>" + "'", str7, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
    }

    @Test
    public void test0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0739");
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
        org.jsoup.nodes.Element element29 = element8.wrap("org.jsoup.select.selector$selectorparseexception:");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node30 = element29.nextSibling();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
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
        org.junit.Assert.assertNull(element29);
    }

    @Test
    public void test0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0740");
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
        java.lang.String str14 = tag1.getName();
        org.jsoup.parser.Tag tag16 = org.jsoup.parser.Tag.valueOf("org.jsoup.select.Selector$SelectorParseException: ");
        java.lang.String str17 = tag16.getName();
        boolean boolean18 = tag16.canContainBlock();
        boolean boolean19 = tag1.isValidParent(tag16);
        boolean boolean20 = tag16.canContainBlock();
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
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "org.jsoup.select.selector$selectorparseexception:" + "'", str14, "org.jsoup.select.selector$selectorparseexception:");
        org.junit.Assert.assertNotNull(tag16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "org.jsoup.select.selector$selectorparseexception:" + "'", str17, "org.jsoup.select.selector$selectorparseexception:");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0741");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("\n<!--#root-->");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element3 = document1.child(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
    }

    @Test
    public void test0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0742");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parse("hi!");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValue("hi!", "hi!");
        org.jsoup.nodes.Attributes attributes5 = document1.attributes();
        org.jsoup.nodes.Element element6 = document1.head();
        org.jsoup.select.Elements elements7 = element6.getAllElements();
        org.jsoup.select.Elements elements8 = element6.getAllElements();
        java.lang.String str9 = element6.nodeName();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "head" + "'", str9, "head");
    }

    @Test
    public void test0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0743");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!", "hi!");
        attribute2.setValue("#root=\"hi!\"");
        java.lang.String str5 = attribute2.html();
        java.lang.String str6 = attribute2.toString();
        java.lang.String str7 = attribute2.toString();
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!=\"#root=&quot;hi!&quot;\"" + "'", str5, "hi!=\"#root=&quot;hi!&quot;\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!=\"#root=&quot;hi!&quot;\"" + "'", str6, "hi!=\"#root=&quot;hi!&quot;\"");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!=\"#root=&quot;hi!&quot;\"" + "'", str7, "hi!=\"#root=&quot;hi!&quot;\"");
    }

    @Test
    public void test0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0744");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("#document");
        boolean boolean3 = tokenQueue1.matches("\n<!--#root-->");
        boolean boolean5 = tokenQueue1.matchChomp("#data");
        java.lang.String str7 = tokenQueue1.consumeTo("a");
        boolean boolean8 = tokenQueue1.matchesWord();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#document" + "'", str7, "#document");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0745");
        org.jsoup.safety.Whitelist whitelist1 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.jsoup.Jsoup.isValid("#root=\"#root=&quot;hi!&quot;\"", whitelist1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0746");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.hasText();
        java.lang.String str3 = document1.nodeName();
        org.jsoup.select.Elements elements4 = document1.children();
        java.util.Set<java.lang.String> strSet5 = document1.classNames();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node7 = document1.childNode(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(strSet5);
    }

    @Test
    public void test0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0747");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str2 = document1.outerHtml();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>" + "'", str2, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
    }

    @Test
    public void test0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0748");
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
        org.jsoup.select.Elements elements38 = elements13.removeClass("");
        org.jsoup.select.Elements elements41 = elements38.attr("#data", " class=\"hi!\"");
        org.jsoup.nodes.Element element42 = elements41.last();
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
        org.junit.Assert.assertNotNull(elements41);
        org.junit.Assert.assertNull(element42);
    }

    @Test
    public void test0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0749");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.hasText();
        java.lang.String str3 = document1.nodeName();
        org.jsoup.select.Elements elements4 = document1.children();
        org.jsoup.select.Elements elements6 = document1.getElementsByTag("#document#documenthi!");
        org.jsoup.select.Elements elements8 = elements6.removeClass("#document#documentdocument");
        org.jsoup.select.Elements elements9 = new org.jsoup.select.Elements((java.util.List<org.jsoup.nodes.Element>) elements6);
        int int10 = elements9.size();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0750");
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
        boolean boolean24 = element20.hasClass("hi!");
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
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0751");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        java.lang.String str4 = document1.nodeName();
        org.jsoup.nodes.Element element6 = document1.appendElement("#document#document");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration10 = new org.jsoup.nodes.XmlDeclaration("<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>", "org.jsoup.select.Selector$SelectorParseException: ", true);
        boolean boolean11 = document1.equals((java.lang.Object) "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#document" + "'", str4, "#document");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0752");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("#document#document=\"#document#document\"");
        org.junit.Assert.assertNotNull(document1);
    }

    @Test
    public void test0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0753");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Document document2 = document1.normalise();
        org.jsoup.nodes.Element element3 = document2.head();
        org.jsoup.nodes.Element element6 = document2.attr("org.jsoup.select.Selector$SelectorParseException: ", "[]");
        org.jsoup.nodes.Element element8 = element6.appendElement("#comment");
        org.jsoup.nodes.Element element10 = element6.prependText("#document");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements13 = element6.getElementsByAttributeValueStarting("", "org.jsoup.select.Selector$SelectorParseException: org.jsoup.select.selector$selectorparseexception:");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
    }

    @Test
    public void test0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0754");
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
        org.jsoup.select.Elements elements17 = element10.getElementsByClass("<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        org.jsoup.nodes.Element element19 = element10.prependText("[]");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node21 = element10.childNode((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 97, Size: 1");
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
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertNotNull(element19);
    }

    @Test
    public void test0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0755");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("#document");
        java.lang.String str2 = tokenQueue1.consumeAttributeKey();
        java.lang.String str4 = tokenQueue1.consumeTo("#root=\"hi!\"");
        java.lang.String str5 = tokenQueue1.toString();
        java.lang.String str6 = tokenQueue1.consumeAttributeKey();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#document" + "'", str4, "#document");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0756");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("#root");
        boolean boolean2 = tag1.isInline();
        boolean boolean3 = tag1.isInline();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        boolean boolean6 = document5.hasText();
        java.lang.String str7 = document5.nodeName();
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet10 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet10, strArray9);
        org.jsoup.nodes.Element element12 = document5.classNames((java.util.Set<java.lang.String>) strSet10);
        org.jsoup.nodes.Element element14 = element12.addClass("#document");
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
        org.jsoup.nodes.Element element30 = element12.classNames(strSet29);
        boolean boolean31 = tag1.equals((java.lang.Object) element12);
        org.jsoup.parser.Tag tag32 = tag1.getImplicitParent();
        boolean boolean33 = tag1.isData();
        boolean boolean34 = tag1.isBlock();
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#document" + "'", str7, "#document");
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "#document" + "'", str22, "#document");
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertNotNull(strSet29);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(tag32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0757");
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
        org.jsoup.nodes.Attribute attribute17 = org.jsoup.nodes.Attribute.createFromEncoded("hi!", "hi!");
        attribute17.setValue("#root=\"hi!\"");
        java.lang.String str20 = attribute17.html();
        org.jsoup.nodes.Document document24 = org.jsoup.parser.Parser.parseBodyFragment("#document", "");
        org.jsoup.nodes.Element element26 = document24.addClass("hi!");
        java.lang.String str27 = document24.title();
        org.jsoup.select.Elements elements28 = org.jsoup.select.Selector.select("#document#document", (org.jsoup.nodes.Element) document24);
        java.lang.String str29 = document24.text();
        boolean boolean30 = attribute17.equals((java.lang.Object) str29);
        attributes13.put(attribute17);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertNotNull(attributeSpliterator14);
        org.junit.Assert.assertNotNull(attribute17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!=\"#root=&quot;hi!&quot;\"" + "'", str20, "hi!=\"#root=&quot;hi!&quot;\"");
        org.junit.Assert.assertNotNull(document24);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(elements28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "#document" + "'", str29, "#document");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0758");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>\n<html> \n<head> \n</head> \n<body>\n  #root  \n</body>\n</html>", "#root=&quot;hi!&quot;\n<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>\n<html> \n<head> \n</head> \n<body>\n  #root  \n</body>\n</html>");
    }

    @Test
    public void test0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0759");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parse("hi!");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("org.jsoup.select.selector$selectorparseexception:");
        java.lang.String str4 = document1.nodeName();
        org.jsoup.nodes.Element element6 = document1.appendText("\n&lt;!--#root--&gt;");
        org.jsoup.nodes.Element element7 = element6.empty();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#document" + "'", str4, "#document");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element7);
    }

    @Test
    public void test0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0760");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("#document");
        java.lang.String str2 = tokenQueue1.consumeAttributeKey();
        java.lang.String str3 = tokenQueue1.remainder();
        java.lang.String str4 = tokenQueue1.remainder();
        boolean boolean5 = tokenQueue1.matchesWord();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0761");
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
        org.jsoup.select.Elements elements38 = elements13.removeClass("");
        org.jsoup.select.Elements elements41 = elements38.attr("#data", " class=\"hi!\"");
        org.jsoup.select.Elements elements44 = elements41.attr("<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "[#, d, o, c, u, m, e, n, t]");
        boolean boolean46 = elements44.hasAttr("\n<!--org.jsoup.select.selector$selectorparseexception: org.jsoup.select.selector$selectorparseexception:=\"#root\"-->");
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
        org.junit.Assert.assertNotNull(elements41);
        org.junit.Assert.assertNotNull(elements44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0762");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parse("hi!");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("org.jsoup.select.selector$selectorparseexception:");
        java.lang.Object obj4 = null;
        boolean boolean5 = document1.equals(obj4);
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0763");
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
        org.jsoup.select.Elements elements19 = element17.getElementsByIndexLessThan((-1));
        org.jsoup.select.Elements elements22 = element17.getElementsByAttributeValueStarting("hi!", "#comment");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration26 = new org.jsoup.nodes.XmlDeclaration("#document#document", "\n<!--#document-->", false);
        java.lang.String str27 = xmlDeclaration26.toString();
        org.jsoup.nodes.Element element28 = element17.appendChild((org.jsoup.nodes.Node) xmlDeclaration26);
        java.lang.String str29 = xmlDeclaration26.toString();
        java.lang.String str30 = xmlDeclaration26.nodeName();
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
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertNotNull(elements22);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "<?#document#document>" + "'", str27, "<?#document#document>");
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "<?#document#document>" + "'", str29, "<?#document#document>");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "#declaration" + "'", str30, "#declaration");
    }

    @Test
    public void test0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0764");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.hasText();
        java.lang.String str3 = document1.nodeName();
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        org.jsoup.nodes.Element element8 = document1.classNames((java.util.Set<java.lang.String>) strSet6);
        org.jsoup.nodes.Element element10 = document1.append("#document");
        org.jsoup.nodes.Element element12 = element10.html("");
        org.jsoup.nodes.Element element15 = element12.attr("org.jsoup.select.Selector$SelectorParseException: ", "#root");
        org.jsoup.nodes.Element element17 = element15.prepend("org.jsoup.select.selector$selectorparseexception:");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element19 = element15.child((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 97, Size: 0");
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
        org.junit.Assert.assertNotNull(element17);
    }

    @Test
    public void test0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0765");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parse("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element3 = document1.prepend("#document#documenthi!#root=&quot;hi!&quot;");
        org.jsoup.nodes.Element element5 = document1.appendElement("<!--#document-->");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
    }

    @Test
    public void test0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0766");
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
        org.jsoup.parser.TokenQueue tokenQueue28 = new org.jsoup.parser.TokenQueue("#document");
        java.lang.String str29 = tokenQueue28.consumeAttributeKey();
        java.lang.String str31 = tokenQueue28.consumeTo("#root=\"hi!\"");
        java.lang.String str32 = tokenQueue28.toString();
        java.lang.String str34 = tokenQueue28.chompTo("");
        boolean boolean35 = tokenQueue28.matchesWord();
        boolean boolean36 = tokenQueue28.isEmpty();
        org.jsoup.parser.TokenQueue tokenQueue38 = new org.jsoup.parser.TokenQueue("#document");
        boolean boolean40 = tokenQueue38.matches("\n<!--#root-->");
        boolean boolean42 = tokenQueue38.matchChomp("#data");
        java.lang.String[] strArray44 = new java.lang.String[] { "hi!=\"#root=&quot;hi!&quot;\"" };
        java.lang.String str45 = tokenQueue38.consumeToAny(strArray44);
        boolean boolean46 = tokenQueue38.consumeWhitespace();
        java.lang.String[] strArray51 = new java.lang.String[] { "org.jsoup.select.Selector$SelectorParseException: \n<!--#document-->", "#root=\"hi!\"", "\n&lt;!--#root--&gt;", "\n<!--#root-->" };
        java.lang.String str52 = tokenQueue38.consumeToAny(strArray51);
        boolean boolean53 = tokenQueue28.matchesAny(strArray51);
        // The following exception was thrown during execution in test generation
        try {
            java.io.Serializable[] serializableArray54 = elements26.toArray((java.io.Serializable[]) strArray51);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayStoreException; message: null");
        } catch (java.lang.ArrayStoreException e) {
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
        org.junit.Assert.assertNotNull(elements20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(elements23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(elements26);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "#document" + "'", str31, "#document");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "[]" + "'", str32, "[]");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "#document" + "'", str45, "#document");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
    }

    @Test
    public void test0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0767");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element5 = document1.prepend("#document");
        org.jsoup.nodes.Element element6 = element5.empty();
        org.jsoup.select.Elements elements8 = element5.getElementsByTag("org.jsoup.select.Selector$SelectorParseException: ");
        java.lang.Object obj9 = null;
        boolean boolean10 = elements8.remove(obj9);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0768");
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
        java.lang.Class<?> wildcardClass54 = element51.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass54);
    }

    @Test
    public void test0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0769");
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
        org.jsoup.nodes.Element element20 = element18.appendElement("body");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements22 = element20.select("\n<!--#document-->");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query <!--#document-->");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
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
        org.junit.Assert.assertNull(element16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(element20);
    }

    @Test
    public void test0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0770");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        java.lang.String str4 = elements3.val();
        java.lang.Object obj5 = null;
        int int6 = elements3.lastIndexOf(obj5);
        org.jsoup.select.Elements elements8 = elements3.eq((int) '#');
        java.lang.String str9 = elements3.outerHtml();
        org.jsoup.nodes.Document document11 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements13 = document11.getElementsByAttribute("hi!");
        java.lang.String str14 = elements13.outerHtml();
        java.lang.String str15 = elements13.val();
        org.jsoup.select.Elements elements16 = new org.jsoup.select.Elements((java.util.List<org.jsoup.nodes.Element>) elements13);
        java.lang.String str18 = elements13.attr("org.jsoup.select.Selector$SelectorParseException: ");
        org.jsoup.select.Elements elements20 = elements13.append("");
        boolean boolean21 = elements3.removeAll((java.util.Collection<org.jsoup.nodes.Element>) elements13);
        org.jsoup.nodes.Document document24 = org.jsoup.parser.Parser.parse("#root", "");
        java.lang.String str25 = document24.outerHtml();
        org.jsoup.nodes.Element element27 = document24.append("<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        org.jsoup.select.Elements elements29 = document24.getElementsByIndexEquals(1);
        org.jsoup.select.Elements elements31 = elements29.prepend("org.jsoup.select.selector$selectorparseexception:");
        org.jsoup.select.Elements elements33 = elements31.addClass("<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        boolean boolean34 = elements13.addAll((java.util.Collection<org.jsoup.nodes.Element>) elements31);
        org.jsoup.nodes.Document document36 = new org.jsoup.nodes.Document("");
        boolean boolean37 = document36.hasText();
        java.lang.String str38 = document36.nodeName();
        java.lang.String[] strArray40 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet41 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet41, strArray40);
        org.jsoup.nodes.Element element43 = document36.classNames((java.util.Set<java.lang.String>) strSet41);
        org.jsoup.nodes.Element element45 = document36.append("#document");
        org.jsoup.nodes.Element element47 = document36.prepend("#document");
        org.jsoup.nodes.Attributes attributes48 = element47.attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator49 = attributes48.spliterator();
        java.lang.String str51 = attributes48.get("hi!");
        org.jsoup.nodes.Document document54 = org.jsoup.parser.Parser.parse("#root", "");
        org.jsoup.nodes.Element element57 = document54.attr("#root", "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        boolean boolean58 = attributes48.equals((java.lang.Object) "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        org.jsoup.parser.Tag tag60 = org.jsoup.parser.Tag.valueOf("org.jsoup.select.Selector$SelectorParseException: ");
        boolean boolean61 = tag60.isData();
        org.jsoup.nodes.Attributes attributes63 = new org.jsoup.nodes.Attributes();
        int int64 = attributes63.size();
        java.lang.String str65 = attributes63.html();
        org.jsoup.nodes.Element element66 = new org.jsoup.nodes.Element(tag60, "org.jsoup.select.selector$selectorparseexception:", attributes63);
        org.jsoup.nodes.Attribute attribute69 = org.jsoup.nodes.Attribute.createFromEncoded("hi!", "hi!");
        attribute69.setKey("#root");
        java.lang.String str72 = attribute69.html();
        attributes63.put(attribute69);
        attributes48.addAll(attributes63);
        int int75 = elements31.lastIndexOf((java.lang.Object) attributes63);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(elements20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(document24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>" + "'", str25, "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertNotNull(elements29);
        org.junit.Assert.assertNotNull(elements31);
        org.junit.Assert.assertNotNull(elements33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "#document" + "'", str38, "#document");
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(element43);
        org.junit.Assert.assertNotNull(element45);
        org.junit.Assert.assertNotNull(element47);
        org.junit.Assert.assertNotNull(attributes48);
        org.junit.Assert.assertNotNull(attributeSpliterator49);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertNotNull(document54);
        org.junit.Assert.assertNotNull(element57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(tag60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertNotNull(attribute69);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "#root=\"hi!\"" + "'", str72, "#root=\"hi!\"");
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + (-1) + "'", int75 == (-1));
    }

    @Test
    public void test0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0771");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("#document#documentdocument", "#document#document=\"#document#document\"", false);
        org.jsoup.nodes.Attributes attributes4 = xmlDeclaration3.attributes();
        org.junit.Assert.assertNotNull(attributes4);
    }

    @Test
    public void test0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0772");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Document document2 = document1.normalise();
        org.jsoup.nodes.Element element3 = document1.head();
        java.lang.String str4 = element3.id();
        java.lang.String str6 = element3.absUrl("#document#documenthi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element8 = element3.getElementById("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0773");
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parseBodyFragment("<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>", "");
        org.jsoup.nodes.Document document4 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements6 = document4.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element8 = document4.prepend("#document");
        org.jsoup.nodes.Element element10 = document4.createElement("#data");
        org.jsoup.nodes.Document document12 = new org.jsoup.nodes.Document("");
        boolean boolean13 = document12.hasText();
        org.jsoup.nodes.Element element15 = document12.addClass("\n<!--#document-->");
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
        org.jsoup.nodes.Document document31 = new org.jsoup.nodes.Document("");
        boolean boolean32 = document31.hasText();
        java.lang.String str33 = document31.nodeName();
        java.lang.String[] strArray35 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet36 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet36, strArray35);
        org.jsoup.nodes.Element element38 = document31.classNames((java.util.Set<java.lang.String>) strSet36);
        org.jsoup.nodes.Element element40 = document31.append("#document");
        org.jsoup.nodes.Element element42 = element40.html("");
        org.jsoup.nodes.Document document44 = new org.jsoup.nodes.Document("");
        boolean boolean45 = document44.hasText();
        java.lang.String str46 = document44.nodeName();
        java.lang.String[] strArray48 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet49 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet49, strArray48);
        org.jsoup.nodes.Element element51 = document44.classNames((java.util.Set<java.lang.String>) strSet49);
        org.jsoup.nodes.Element element53 = document44.append("");
        org.jsoup.nodes.Element element55 = element53.addClass("#document#document");
        org.jsoup.nodes.Element[] elementArray56 = new org.jsoup.nodes.Element[] { document2, element10, element15, element29, element42, element53 };
        org.jsoup.select.Elements elements57 = new org.jsoup.select.Elements(elementArray56);
        org.jsoup.select.Elements elements58 = new org.jsoup.select.Elements(elementArray56);
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor59 = elements58.listIterator();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "#document" + "'", str23, "#document");
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "#document" + "'", str33, "#document");
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(element38);
        org.junit.Assert.assertNotNull(element40);
        org.junit.Assert.assertNotNull(element42);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "#document" + "'", str46, "#document");
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(element51);
        org.junit.Assert.assertNotNull(element53);
        org.junit.Assert.assertNotNull(element55);
        org.junit.Assert.assertNotNull(elementArray56);
        org.junit.Assert.assertNotNull(elementItor59);
    }

    @Test
    public void test0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0774");
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
    public void test0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0775");
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
        org.jsoup.nodes.Attribute attribute42 = org.jsoup.nodes.Attribute.createFromEncoded("hi!", "hi!");
        attribute42.setKey("#root");
        java.lang.String str45 = attribute42.getKey();
        java.lang.String str46 = attribute42.html();
        attributes28.put(attribute42);
        java.lang.String str48 = attribute42.html();
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
        org.junit.Assert.assertNotNull(attribute42);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "#root" + "'", str45, "#root");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "#root=\"hi!\"" + "'", str46, "#root=\"hi!\"");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "#root=\"hi!\"" + "'", str48, "#root=\"hi!\"");
    }

    @Test
    public void test0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0776");
        java.net.URL uRL0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parse(uRL0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0777");
        org.jsoup.safety.Whitelist whitelist2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.jsoup.Jsoup.clean("<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>\n<html> \n<head> \n</head> \n<body>\n  #root  \n</body>\n</html>", "", whitelist2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0778");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements5 = elements3.prepend("");
        org.jsoup.select.Elements elements7 = elements5.removeAttr("");
        org.jsoup.select.Elements elements9 = elements5.addClass("#document#documenthi!");
        org.jsoup.nodes.Document document11 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements13 = document11.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements15 = elements13.prepend("");
        org.jsoup.select.Elements elements17 = elements15.removeAttr("");
        org.jsoup.nodes.Document document19 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements21 = document19.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements23 = elements21.prepend("");
        org.jsoup.select.Elements elements25 = elements23.removeAttr("");
        boolean boolean26 = elements15.containsAll((java.util.Collection<org.jsoup.nodes.Element>) elements23);
        java.lang.Object[] objArray27 = elements15.toArray();
        org.jsoup.nodes.Document document29 = new org.jsoup.nodes.Document("");
        boolean boolean30 = document29.hasText();
        java.lang.String str31 = document29.nodeName();
        java.lang.String str32 = document29.val();
        boolean boolean33 = elements15.add((org.jsoup.nodes.Element) document29);
        org.jsoup.nodes.Element element36 = document29.attr("[#, d, o, c, u, m, e, n, t]", "#text");
        boolean boolean37 = elements9.equals((java.lang.Object) document29);
        org.jsoup.select.Elements elements39 = document29.getElementsByTag("body");
        org.jsoup.nodes.Document document41 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements43 = document41.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements45 = elements43.prepend("");
        org.jsoup.select.Elements elements47 = elements45.removeAttr("");
        org.jsoup.nodes.Document document49 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements51 = document49.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements53 = elements51.prepend("");
        org.jsoup.select.Elements elements55 = elements53.removeAttr("");
        boolean boolean56 = elements45.containsAll((java.util.Collection<org.jsoup.nodes.Element>) elements53);
        java.lang.Object[] objArray57 = elements45.toArray();
        org.jsoup.nodes.Document document59 = new org.jsoup.nodes.Document("");
        boolean boolean60 = document59.hasText();
        java.lang.String str61 = document59.nodeName();
        java.lang.String str62 = document59.val();
        boolean boolean63 = elements45.add((org.jsoup.nodes.Element) document59);
        org.jsoup.nodes.Element element64 = document59.empty();
        org.jsoup.nodes.Element element66 = document59.prependText("#comment");
        boolean boolean67 = document29.equals((java.lang.Object) "#comment");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertNotNull(elements21);
        org.junit.Assert.assertNotNull(elements23);
        org.junit.Assert.assertNotNull(elements25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[]");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "#document" + "'", str31, "#document");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(element36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(elements39);
        org.junit.Assert.assertNotNull(elements43);
        org.junit.Assert.assertNotNull(elements45);
        org.junit.Assert.assertNotNull(elements47);
        org.junit.Assert.assertNotNull(elements51);
        org.junit.Assert.assertNotNull(elements53);
        org.junit.Assert.assertNotNull(elements55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(objArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray57), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray57), "[]");
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "#document" + "'", str61, "#document");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(element64);
        org.junit.Assert.assertNotNull(element66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
    }

    @Test
    public void test0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0779");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        int int1 = attributes0.size();
        boolean boolean3 = attributes0.hasKey("");
        java.lang.String str4 = attributes0.toString();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor5 = attributes0.iterator();
        org.jsoup.nodes.Attribute attribute6 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes0.put(attribute6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(attributeItor5);
    }

    @Test
    public void test0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0780");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parse("hi!");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValue("hi!", "hi!");
        org.jsoup.nodes.Attributes attributes5 = document1.attributes();
        org.jsoup.nodes.Element element6 = document1.head();
        java.lang.String str7 = document1.outerHtml();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>" + "'", str7, "<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
    }

    @Test
    public void test0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0781");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("hi!", "hi!", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        java.lang.String str5 = xmlDeclaration3.getWholeDeclaration();
        java.lang.String str6 = xmlDeclaration3.toString();
        java.lang.String str7 = xmlDeclaration3.nodeName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<?hi!>" + "'", str6, "<?hi!>");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#declaration" + "'", str7, "#declaration");
    }

    @Test
    public void test0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0782");
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
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0783");
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
        java.lang.String str24 = element23.toString();
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
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "<org.jsoup.select.selector$selectorparseexception: hi!=\"#root\">\n</org.jsoup.select.selector$selectorparseexception:>" + "'", str24, "<org.jsoup.select.selector$selectorparseexception: hi!=\"#root\">\n</org.jsoup.select.selector$selectorparseexception:>");
    }

    @Test
    public void test0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0784");
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
        org.jsoup.nodes.Element element22 = element5.toggleClass("<!--#document-->");
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
    public void test0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0785");
        org.jsoup.select.Selector.SelectorParseException selectorParseException1 = new org.jsoup.select.Selector.SelectorParseException("org.jsoup.select.selector$selectorparseexception:");
        java.lang.Throwable[] throwableArray2 = selectorParseException1.getSuppressed();
        org.jsoup.select.Selector.SelectorParseException selectorParseException4 = new org.jsoup.select.Selector.SelectorParseException("\n<!--#document-->");
        selectorParseException1.addSuppressed((java.lang.Throwable) selectorParseException4);
        org.jsoup.select.Selector.SelectorParseException selectorParseException7 = new org.jsoup.select.Selector.SelectorParseException("org.jsoup.select.selector$selectorparseexception:");
        org.jsoup.select.Selector.SelectorParseException selectorParseException9 = new org.jsoup.select.Selector.SelectorParseException("org.jsoup.select.selector$selectorparseexception:");
        java.lang.Throwable[] throwableArray10 = selectorParseException9.getSuppressed();
        org.jsoup.select.Selector.SelectorParseException selectorParseException12 = new org.jsoup.select.Selector.SelectorParseException("\n<!--#document-->");
        selectorParseException9.addSuppressed((java.lang.Throwable) selectorParseException12);
        selectorParseException7.addSuppressed((java.lang.Throwable) selectorParseException12);
        org.jsoup.select.Selector.SelectorParseException selectorParseException16 = new org.jsoup.select.Selector.SelectorParseException("org.jsoup.select.selector$selectorparseexception:");
        java.lang.Throwable[] throwableArray17 = selectorParseException16.getSuppressed();
        org.jsoup.select.Selector.SelectorParseException selectorParseException19 = new org.jsoup.select.Selector.SelectorParseException("\n<!--#document-->");
        selectorParseException16.addSuppressed((java.lang.Throwable) selectorParseException19);
        selectorParseException12.addSuppressed((java.lang.Throwable) selectorParseException16);
        selectorParseException4.addSuppressed((java.lang.Throwable) selectorParseException12);
        java.lang.String str23 = selectorParseException4.toString();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "org.jsoup.select.Selector$SelectorParseException: \n<!--#document-->" + "'", str23, "org.jsoup.select.Selector$SelectorParseException: \n<!--#document-->");
    }

    @Test
    public void test0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0786");
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
        org.jsoup.select.Elements elements19 = element17.getElementsByIndexLessThan((-1));
        java.lang.String str20 = element17.html();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element22 = element17.wrap("");
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
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "#document#documenthi!#root=&quot;hi!&quot;" + "'", str20, "#document#documenthi!#root=&quot;hi!&quot;");
    }

    @Test
    public void test0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0787");
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
        org.jsoup.nodes.Element element16 = document1.createElement("org.jsoup.select.Selector$SelectorParseException:");
        java.lang.String str17 = document1.nodeName();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "#document" + "'", str17, "#document");
    }

    @Test
    public void test0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0788");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parse("hi!");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValue("hi!", "hi!");
        org.jsoup.select.Selector.SelectorParseException selectorParseException6 = new org.jsoup.select.Selector.SelectorParseException("");
        boolean boolean7 = elements4.contains((java.lang.Object) "");
        boolean boolean9 = elements4.is("[]");
        org.jsoup.nodes.Document document11 = new org.jsoup.nodes.Document("");
        boolean boolean12 = document11.hasText();
        java.lang.String str13 = document11.nodeName();
        java.lang.String str14 = document11.val();
        java.lang.String str15 = document11.outerHtml();
        java.lang.String[] strArray18 = new java.lang.String[] { "\n<!--#document-->", "#data" };
        java.util.LinkedHashSet<java.lang.String> strSet19 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet19, strArray18);
        org.jsoup.nodes.Element element21 = document11.classNames((java.util.Set<java.lang.String>) strSet19);
        java.util.LinkedHashSet[] linkedHashSetArray23 = new java.util.LinkedHashSet[1];
        @SuppressWarnings("unchecked")
        java.util.LinkedHashSet<java.lang.String>[] strSetArray24 = (java.util.LinkedHashSet<java.lang.String>[]) linkedHashSetArray23;
        strSetArray24[0] = strSet19;
        java.util.LinkedHashSet<java.lang.String>[] strSetArray27 = elements4.toArray(strSetArray24);
        org.jsoup.nodes.Document document29 = org.jsoup.Jsoup.parse("hi!");
        org.jsoup.select.Elements elements32 = document29.getElementsByAttributeValue("hi!", "hi!");
        boolean boolean33 = document29.hasText();
        org.jsoup.select.Elements elements35 = document29.getElementsByIndexLessThan((int) (byte) 10);
        boolean boolean36 = elements35.isEmpty();
        boolean boolean37 = elements4.addAll((java.util.Collection<org.jsoup.nodes.Element>) elements35);
        java.lang.Object[] objArray38 = elements35.toArray();
        boolean boolean40 = elements35.hasClass("org.jsoup.select.selector$selectorparseexception:");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "#document" + "'", str13, "#document");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(linkedHashSetArray23);
        org.junit.Assert.assertNotNull(strSetArray24);
        org.junit.Assert.assertNotNull(strSetArray27);
        org.junit.Assert.assertNotNull(document29);
        org.junit.Assert.assertNotNull(elements32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(elements35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray38), "[<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>, \n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>, \n<head>\n</head>, \n<body>\n hi! \n</body>]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray38), "[<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>, \n<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>, \n<head>\n</head>, \n<body>\n hi! \n</body>]");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0789");
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
        java.util.List<org.jsoup.nodes.Node> nodeList28 = document19.childNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element30 = document19.child((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
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
        org.junit.Assert.assertNotNull(nodeList28);
    }

    @Test
    public void test0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0790");
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parseBodyFragment("", "[<, h, t, m, l, >, \n, <, h, e, a, d, >, \n, <, /, h, e, a, d, >, \n, <, b, o, d, y, >, \n,  , #, r, o, o, t,  , \n, <, /, b, o, d, y, >, \n, <, /, h, t, m, l, >, #, d, o, c, u, m, e, n, t, #, d, o, c, u, m, e, n, t, d, o, c, u, m, e, n, t]");
        org.junit.Assert.assertNotNull(document2);
    }

    @Test
    public void test0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0791");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("#text", "#root");
        org.jsoup.nodes.Element element4 = document2.text("\n&lt;!--#root--&gt;");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
    }

    @Test
    public void test0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0792");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("# ", "\n<!--a-->");
        org.junit.Assert.assertNotNull(document2);
    }

    @Test
    public void test0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0793");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("#document#document=\"#document#document\"");
        java.lang.String str2 = tokenQueue1.toString();
        tokenQueue1.addFirst((java.lang.Character) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[#, d, o, c, u, m, e, n, t, #, d, o, c, u, m, e, n, t, =, \", #, d, o, c, u, m, e, n, t, #, d, o, c, u, m, e, n, t, \"]" + "'", str2, "[#, d, o, c, u, m, e, n, t, #, d, o, c, u, m, e, n, t, =, \", #, d, o, c, u, m, e, n, t, #, d, o, c, u, m, e, n, t, \"]");
    }

    @Test
    public void test0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0794");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element5 = document1.prepend("#document");
        org.jsoup.nodes.Element element6 = element5.empty();
        org.jsoup.select.Elements elements8 = element5.getElementsByTag("org.jsoup.select.Selector$SelectorParseException: ");
        boolean boolean9 = element5.hasText();
        org.jsoup.nodes.Document document11 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements13 = document11.getElementsByAttribute("hi!");
        java.lang.String str15 = elements13.attr("#root");
        java.lang.String str16 = elements13.text();
        org.jsoup.select.Elements elements18 = elements13.prepend("org.jsoup.select.selector$selectorparseexception:");
        org.jsoup.nodes.Document document21 = org.jsoup.parser.Parser.parseBodyFragment("#document", "");
        org.jsoup.nodes.Element element23 = document21.addClass("hi!");
        java.lang.String str24 = document21.title();
        boolean boolean25 = elements13.add((org.jsoup.nodes.Element) document21);
        boolean boolean26 = elements13.isEmpty();
        boolean boolean27 = element5.equals((java.lang.Object) elements13);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertNotNull(document21);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0795");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        int int1 = attributes0.size();
        boolean boolean3 = attributes0.hasKey("");
        java.lang.String str4 = attributes0.toString();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor5 = attributes0.iterator();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator6 = attributes0.spliterator();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(attributeItor5);
        org.junit.Assert.assertNotNull(attributeSpliterator6);
    }

    @Test
    public void test0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0796");
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
        elements31.clear();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element50 = elements31.get(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
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
    }

    @Test
    public void test0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0797");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("#root");
        org.jsoup.nodes.Attributes attributes2 = document1.attributes();
        boolean boolean4 = attributes2.hasKey(" class=\"hi!\"");
        org.junit.Assert.assertNotNull(attributes2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0798");
        org.jsoup.nodes.DataNode dataNode2 = org.jsoup.nodes.DataNode.createFromEncoded("org.jsoup.select.selector$selectorparseexception:", "hi!");
        java.lang.String str3 = dataNode2.getWholeData();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = dataNode2.childNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = dataNode2.childNodes();
        java.lang.String str6 = dataNode2.getWholeData();
        org.jsoup.nodes.Attributes attributes7 = dataNode2.attributes();
        java.lang.String str8 = dataNode2.nodeName();
        org.junit.Assert.assertNotNull(dataNode2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "org.jsoup.select.selector$selectorparseexception:" + "'", str3, "org.jsoup.select.selector$selectorparseexception:");
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "org.jsoup.select.selector$selectorparseexception:" + "'", str6, "org.jsoup.select.selector$selectorparseexception:");
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#data" + "'", str8, "#data");
    }

    @Test
    public void test0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0799");
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
        // The following exception was thrown during execution in test generation
        try {
            attributes13.remove("");
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
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertNotNull(attributeSpliterator14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0800");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("#root", "");
        org.jsoup.nodes.Element element5 = document2.attr("#root", "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        java.lang.String str6 = document2.tagName();
        org.jsoup.nodes.Element element7 = document2.parent();
        org.jsoup.nodes.Element element9 = document2.text("#root");
        org.jsoup.nodes.Element element11 = element9.html(" ");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#root" + "'", str6, "#root");
        org.junit.Assert.assertNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
    }

    @Test
    public void test0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0801");
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
        org.jsoup.select.Elements elements27 = elements12.html("org.jsoup.select.Selector$SelectorParseException: ");
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
        org.junit.Assert.assertNotNull(elements27);
    }

    @Test
    public void test0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0802");
        org.jsoup.nodes.Evaluator evaluator0 = null;
        org.jsoup.nodes.Document document3 = org.jsoup.Jsoup.parseBodyFragment("#document#documenthi!#root=&quot;hi!&quot;", " #comment=\"\"");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements4 = org.jsoup.select.Collector.collect(evaluator0, (org.jsoup.nodes.Element) document3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document3);
    }

    @Test
    public void test0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0803");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("#document");
        boolean boolean3 = tokenQueue1.matches("\n<!--#root-->");
        tokenQueue1.addFirst((java.lang.Character) ' ');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0804");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements5 = elements3.prepend("");
        elements5.clear();
        int int8 = elements5.indexOf((java.lang.Object) "org.jsoup.select.Selector$SelectorParseException: ");
        org.jsoup.select.Elements elements10 = elements5.append("#document");
        java.util.Iterator<org.jsoup.nodes.Element> elementItor11 = elements5.iterator();
        org.jsoup.nodes.Element element12 = elements5.last();
        org.jsoup.select.Elements elements14 = elements5.removeClass("\n<!--#document--> #data");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(elementItor11);
        org.junit.Assert.assertNull(element12);
        org.junit.Assert.assertNotNull(elements14);
    }

    @Test
    public void test0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0805");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("body", "<?hi!>");
    }

    @Test
    public void test0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0806");
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
        org.jsoup.nodes.TextNode textNode22 = new org.jsoup.nodes.TextNode("org.jsoup.select.Selector$SelectorParseException: ", "");
        java.lang.String str24 = textNode22.absUrl("#data");
        org.jsoup.nodes.TextNode textNode26 = textNode22.text("#data");
        org.jsoup.nodes.Attributes attributes27 = textNode22.attributes();
        org.jsoup.nodes.Element element28 = new org.jsoup.nodes.Element(tag18, "#document", attributes27);
        org.jsoup.nodes.Attribute attribute31 = new org.jsoup.nodes.Attribute("#root", "hi!");
        attributes27.put(attribute31);
        attribute31.setKey("<html>\n<head>\n</head>\n<body>\n</body>\n</html>=\"\"");
        attribute31.setValue("");
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
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(textNode26);
        org.junit.Assert.assertNotNull(attributes27);
    }

    @Test
    public void test0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0807");
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
        org.jsoup.nodes.TextNode textNode22 = new org.jsoup.nodes.TextNode("org.jsoup.select.Selector$SelectorParseException: ", "");
        java.lang.String str24 = textNode22.absUrl("#data");
        org.jsoup.nodes.TextNode textNode26 = textNode22.text("#data");
        org.jsoup.nodes.Attributes attributes27 = textNode22.attributes();
        org.jsoup.nodes.Element element28 = new org.jsoup.nodes.Element(tag18, "#document", attributes27);
        org.jsoup.parser.Tag tag30 = org.jsoup.parser.Tag.valueOf("org.jsoup.select.Selector$SelectorParseException: ");
        org.jsoup.nodes.Document document32 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Document document33 = document32.normalise();
        org.jsoup.nodes.Element element34 = document32.head();
        org.jsoup.nodes.Element element36 = element34.append("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element38 = element34.wrap("#text");
        boolean boolean39 = tag30.equals((java.lang.Object) element38);
        boolean boolean40 = tag30.isEmpty();
        boolean boolean41 = tag18.equals((java.lang.Object) boolean40);
        org.jsoup.nodes.Element element43 = new org.jsoup.nodes.Element(tag18, "<?hi!>");
        boolean boolean45 = element43.hasClass("[]");
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
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(textNode26);
        org.junit.Assert.assertNotNull(attributes27);
        org.junit.Assert.assertNotNull(tag30);
        org.junit.Assert.assertNotNull(document32);
        org.junit.Assert.assertNotNull(document33);
        org.junit.Assert.assertNotNull(element34);
        org.junit.Assert.assertNotNull(element36);
        org.junit.Assert.assertNull(element38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0808");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("<!#declaration>");
        org.junit.Assert.assertNotNull(document1);
    }

    @Test
    public void test0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0809");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.hasText();
        java.lang.String str3 = document1.nodeName();
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        org.jsoup.nodes.Element element8 = document1.classNames((java.util.Set<java.lang.String>) strSet6);
        org.jsoup.nodes.Element element10 = element8.addClass("#document");
        java.lang.String str11 = element10.html();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = element10.childNodes();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(nodeList12);
    }

    @Test
    public void test0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0810");
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
        java.lang.String str16 = element13.nodeName();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#document" + "'", str7, "#document");
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "#document" + "'", str16, "#document");
    }

    @Test
    public void test0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0811");
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
        org.jsoup.select.Elements elements19 = elements17.wrap("hi!=\"#root=&quot;hi!&quot;\"");
        org.jsoup.select.Elements elements22 = elements19.attr("[#, d, o, c, u, m, e, n, t, #, d, o, c, u, m, e, n, t, d, o, c, u, m, e, n, t]", "#root");
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
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertNotNull(elements22);
    }

    @Test
    public void test0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0812");
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
        java.lang.String str18 = element13.text();
        org.jsoup.select.Elements elements21 = element13.getElementsByAttributeValueStarting("<html> \n <head> \n </head> \n <body>\n   #root  \n </body>\n</html>", "\n&lt;!--#root--&gt;");
        java.lang.String str22 = element13.tagName();
        org.jsoup.parser.Tag tag24 = org.jsoup.parser.Tag.valueOf("org.jsoup.select.Selector$SelectorParseException: ");
        boolean boolean25 = tag24.isData();
        boolean boolean26 = tag24.requiresSpecificParent();
        boolean boolean27 = tag24.isBlock();
        boolean boolean28 = tag24.preserveWhitespace();
        boolean boolean29 = tag24.isInline();
        boolean boolean30 = element13.equals((java.lang.Object) boolean29);
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(elements21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "#document" + "'", str22, "#document");
        org.junit.Assert.assertNotNull(tag24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0813");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("");
        java.lang.Character char2 = tokenQueue1.peek();
        boolean boolean3 = tokenQueue1.consumeWhitespace();
        org.junit.Assert.assertNull(char2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0814");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("#declaration");
        java.lang.String str2 = tag1.toString();
        org.jsoup.nodes.Attributes attributes4 = new org.jsoup.nodes.Attributes();
        int int5 = attributes4.size();
        java.lang.String str6 = attributes4.html();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor7 = attributes4.iterator();
        java.lang.String str8 = attributes4.html();
        org.jsoup.nodes.Element element9 = new org.jsoup.nodes.Element(tag1, "\n<!--org.jsoup.select.selector$selectorparseexception: org.jsoup.select.selector$selectorparseexception:=\"#root\"-->", attributes4);
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#declaration" + "'", str2, "#declaration");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributeItor7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0815");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded(" class=\"hi!\"", "org.jsoup.select.Selector$SelectorParseException: ");
        java.lang.String str3 = textNode2.toString();
        java.lang.String str4 = textNode2.baseUri();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " class=&quot;hi!&quot;" + "'", str3, " class=&quot;hi!&quot;");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "org.jsoup.select.Selector$SelectorParseException:" + "'", str4, "org.jsoup.select.Selector$SelectorParseException:");
    }

    @Test
    public void test0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0816");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("#root", "");
        java.lang.String str3 = document2.outerHtml();
        org.jsoup.nodes.Element element5 = document2.removeClass("<?#document#document>");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>" + "'", str3, "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        org.junit.Assert.assertNotNull(element5);
    }

    @Test
    public void test0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0817");
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
        java.lang.String str24 = element21.id();
        org.jsoup.select.Elements elements27 = element21.getElementsByAttributeValueContaining("<!--#document-->", "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.util.stream.Stream<org.jsoup.nodes.Element> elementStream28 = elements27.stream();
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
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(elements27);
        org.junit.Assert.assertNotNull(elementStream28);
    }

    @Test
    public void test0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0818");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragmentRelaxed("body", "org.jsoup.select.Selector$SelectorParseException: ");
        java.lang.String str3 = document2.id();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0819");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("#root", "\n<!--#root-->");
        org.jsoup.nodes.Element element4 = document2.createElement("<html> \n <head> \n </head> \n <body>\n   #root  \n </body>\n</html>");
        org.jsoup.nodes.Element element5 = document2.body();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element5);
    }

    @Test
    public void test0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0820");
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
        java.util.Iterator<org.jsoup.nodes.Element> elementItor34 = elements33.iterator();
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
        org.junit.Assert.assertNotNull(elementItor34);
    }

    @Test
    public void test0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0821");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!", "hi!");
        attribute2.setValue("#root=\"hi!\"");
        attribute2.setValue("#root");
        java.lang.String str7 = attribute2.toString();
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!=\"#root\"" + "'", str7, "hi!=\"#root\"");
    }

    @Test
    public void test0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0822");
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
        org.jsoup.select.Elements elements23 = new org.jsoup.select.Elements((java.util.List<org.jsoup.nodes.Element>) elements22);
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
    }

    @Test
    public void test0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0823");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        java.lang.String str5 = elements3.attr("#root");
        java.lang.String str6 = elements3.text();
        org.jsoup.select.Elements elements8 = elements3.prepend("org.jsoup.select.selector$selectorparseexception:");
        org.jsoup.select.Elements elements10 = elements3.addClass(" class=\"hi!\"");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(elements10);
    }

    @Test
    public void test0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0824");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        java.lang.String str4 = document1.nodeName();
        org.jsoup.nodes.Element element6 = document1.appendElement("#document#document");
        java.lang.String str7 = element6.html();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#document" + "'", str4, "#document");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0825");
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
        java.lang.String str16 = element10.val();
        element10.setBaseUri("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        boolean boolean19 = element10.isBlock();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0826");
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
        org.jsoup.nodes.Element element40 = element39.empty();
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
        org.junit.Assert.assertNotNull(element40);
    }

    @Test
    public void test0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0827");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        java.lang.String str4 = elements3.outerHtml();
        java.lang.String str5 = elements3.val();
        org.jsoup.select.Elements elements6 = new org.jsoup.select.Elements((java.util.List<org.jsoup.nodes.Element>) elements3);
        java.lang.String str8 = elements3.attr("org.jsoup.select.Selector$SelectorParseException: ");
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor9 = elements3.listIterator();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element11 = elements3.remove((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(elementItor9);
    }

    @Test
    public void test0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0828");
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
        java.lang.String str27 = element25.baseUri();
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
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0829");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("org.jsoup.select.Selector$SelectorParseException: ");
        boolean boolean2 = tag1.isData();
        org.jsoup.parser.Tag tag4 = org.jsoup.parser.Tag.valueOf("#root");
        boolean boolean5 = tag4.isInline();
        boolean boolean6 = tag1.isValidParent(tag4);
        boolean boolean7 = tag4.isData();
        boolean boolean8 = tag4.isBlock();
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0830");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("#document");
        boolean boolean3 = tokenQueue1.matches("\n<!--#root-->");
        boolean boolean5 = tokenQueue1.matchChomp("#data");
        boolean boolean7 = tokenQueue1.matchChomp("#document#document");
        boolean boolean8 = tokenQueue1.matchesWord();
        boolean boolean9 = tokenQueue1.matchesWord();
        java.lang.String str11 = tokenQueue1.consumeTo("");
        boolean boolean12 = tokenQueue1.matchesWhitespace();
        tokenQueue1.addFirst((java.lang.Character) 'd');
        tokenQueue1.addFirst(" class=&quot;hi!&quot;");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0831");
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
        java.lang.String str25 = elements15.text();
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
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0832");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("#root", "");
        java.lang.String str3 = document2.outerHtml();
        org.jsoup.nodes.Element element5 = document2.createElement("#document#documenthi!");
        org.jsoup.nodes.Element element8 = document2.attr("<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "org.jsoup.select.Selector$SelectorParseException: \n<!--#document-->");
        org.jsoup.nodes.Element element9 = document2.body();
        org.jsoup.parser.Tag tag11 = org.jsoup.parser.Tag.valueOf("org.jsoup.select.Selector$SelectorParseException: ");
        boolean boolean12 = tag11.isData();
        boolean boolean13 = tag11.requiresSpecificParent();
        boolean boolean14 = tag11.isBlock();
        org.jsoup.parser.Tag tag16 = org.jsoup.parser.Tag.valueOf("org.jsoup.select.Selector$SelectorParseException: ");
        boolean boolean17 = tag16.isData();
        boolean boolean18 = tag16.requiresSpecificParent();
        boolean boolean19 = tag16.isBlock();
        boolean boolean20 = tag11.canContain(tag16);
        org.jsoup.nodes.Document document23 = new org.jsoup.nodes.Document("");
        boolean boolean24 = document23.hasText();
        java.lang.String str25 = document23.nodeName();
        org.jsoup.nodes.Document document27 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element30 = document27.attr("hi!", "#root");
        org.jsoup.nodes.Attributes attributes31 = document27.attributes();
        boolean boolean32 = document23.equals((java.lang.Object) attributes31);
        org.jsoup.nodes.Element element33 = new org.jsoup.nodes.Element(tag11, "#document#document=\"#document#document\"", attributes31);
        java.util.Set<java.lang.String> strSet34 = element33.classNames();
        org.jsoup.nodes.Element element35 = document2.classNames(strSet34);
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>" + "'", str3, "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(tag16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "#document" + "'", str25, "#document");
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertNotNull(attributes31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(strSet34);
        org.junit.Assert.assertNotNull(element35);
    }

    @Test
    public void test0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0833");
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
        org.jsoup.nodes.Node node22 = element20.childNode((int) (byte) 0);
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
        org.junit.Assert.assertNotNull(node22);
    }

    @Test
    public void test0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0834");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document(" class=\"hi!\"");
        java.lang.String str2 = document1.id();
        java.lang.String str3 = document1.title();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0835");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("#root", "");
        comment2.setBaseUri("#document#documenthi!");
        java.lang.String str5 = comment2.getData();
        java.lang.String str7 = comment2.attr("[]");
        java.lang.String str8 = comment2.getData();
        java.lang.String str9 = comment2.getData();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#root" + "'", str5, "#root");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#root" + "'", str8, "#root");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#root" + "'", str9, "#root");
    }

    @Test
    public void test0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0836");
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
        boolean boolean12 = tag6.isData();
        org.jsoup.nodes.Attributes attributes13 = new org.jsoup.nodes.Attributes();
        java.lang.String str14 = attributes13.html();
        java.lang.String str15 = attributes13.html();
        boolean boolean16 = tag6.equals((java.lang.Object) attributes13);
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
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0837");
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
        org.jsoup.parser.Tag tag20 = org.jsoup.parser.Tag.valueOf("#declaration");
        java.lang.String str21 = tag20.toString();
        boolean boolean22 = tag18.isValidParent(tag20);
        org.jsoup.nodes.Element element24 = new org.jsoup.nodes.Element(tag18, "");
        java.lang.String str25 = element24.text();
        org.jsoup.nodes.Element element27 = element24.appendText("");
        org.jsoup.nodes.Element element28 = element24.parent();
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
        org.junit.Assert.assertNotNull(tag20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "#declaration" + "'", str21, "#declaration");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertNull(element28);
    }

    @Test
    public void test0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0838");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("#root", "");
        java.lang.String str3 = document2.html();
        java.lang.String str4 = document2.text();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>" + "'", str3, "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#root" + "'", str4, "#root");
    }

    @Test
    public void test0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0839");
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
        boolean boolean15 = elements10.hasAttr("#declaration");
        org.jsoup.select.Elements elements17 = elements10.append("");
        boolean boolean19 = elements10.hasClass("<html>\n<head>\n</head>\n<body> \n <!--#root-->\n</body>\n</html>");
        elements10.clear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0840");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragmentRelaxed("hi!", "#data");
        org.jsoup.parser.Tag tag3 = document2.tag();
        boolean boolean4 = tag3.isInline();
        org.jsoup.nodes.Document document6 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element9 = document6.attr("hi!", "#root");
        org.jsoup.nodes.Attributes attributes10 = document6.attributes();
        org.jsoup.select.Elements elements13 = document6.getElementsByAttributeValueNot("org.jsoup.select.selector$selectorparseexception:", "hi!");
        java.lang.Object[] objArray14 = elements13.toArray();
        boolean boolean15 = tag3.equals((java.lang.Object) elements13);
        org.jsoup.select.Elements elements17 = elements13.html(" hi!");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[hi!]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(elements17);
    }

    @Test
    public void test0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0841");
        org.jsoup.safety.Whitelist whitelist1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.jsoup.Jsoup.clean("#document#documenthi!#root=&quot;hi!&quot;", whitelist1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0842");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "\n<!--#root-->");
        java.lang.String str3 = textNode2.getWholeText();
        org.jsoup.nodes.TextNode textNode5 = textNode2.text("hi!");
        java.lang.String str6 = textNode2.getWholeText();
        java.lang.String str7 = textNode2.toString();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(textNode5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0843");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("#document#document=\"#document#document\"", "body");
        java.lang.String str3 = document2.baseUri();
        java.lang.String str4 = document2.nodeName();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "body" + "'", str3, "body");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#document" + "'", str4, "#document");
    }

    @Test
    public void test0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0844");
        org.jsoup.nodes.Document document2 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document2.getElementsByAttribute("hi!");
        java.lang.String str5 = elements4.outerHtml();
        org.jsoup.nodes.Document document7 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements9 = document7.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements11 = elements9.prepend("");
        org.jsoup.select.Elements elements13 = elements11.removeAttr("");
        org.jsoup.nodes.Document document15 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements17 = document15.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements19 = elements17.prepend("");
        org.jsoup.select.Elements elements21 = elements19.removeAttr("");
        boolean boolean22 = elements11.containsAll((java.util.Collection<org.jsoup.nodes.Element>) elements19);
        org.jsoup.nodes.Document document24 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements26 = document24.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements28 = elements26.prepend("");
        org.jsoup.select.Elements elements30 = elements28.removeAttr("");
        org.jsoup.nodes.Document document32 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements34 = document32.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements36 = elements34.prepend("");
        org.jsoup.select.Elements elements38 = elements36.removeAttr("");
        boolean boolean39 = elements28.containsAll((java.util.Collection<org.jsoup.nodes.Element>) elements36);
        org.jsoup.select.Elements elements41 = elements36.wrap("#root");
        boolean boolean42 = elements19.containsAll((java.util.Collection<org.jsoup.nodes.Element>) elements41);
        boolean boolean43 = elements4.addAll((java.util.Collection<org.jsoup.nodes.Element>) elements19);
        org.jsoup.select.Elements elements44 = org.jsoup.select.Selector.select("<#root hi!=\"#root\">\n</#root>", (java.lang.Iterable<org.jsoup.nodes.Element>) elements19);
        org.jsoup.select.Elements elements46 = elements44.removeClass("<html>\n<head>\n</head>\n<body>\n</body>\n</html>=\"\"");
        boolean boolean48 = elements44.is("[]");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertNotNull(elements21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(elements26);
        org.junit.Assert.assertNotNull(elements28);
        org.junit.Assert.assertNotNull(elements30);
        org.junit.Assert.assertNotNull(elements34);
        org.junit.Assert.assertNotNull(elements36);
        org.junit.Assert.assertNotNull(elements38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(elements41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(elements44);
        org.junit.Assert.assertNotNull(elements46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0845");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("#document#document=\"#document#document\"", "body");
        java.lang.String str3 = document2.baseUri();
        org.jsoup.nodes.Element element5 = document2.text("# ");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "body" + "'", str3, "body");
        org.junit.Assert.assertNotNull(element5);
    }

    @Test
    public void test0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0846");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("#root", "");
        java.lang.String str3 = comment2.baseUri();
        java.lang.String str4 = comment2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\n<!--#root-->" + "'", str4, "\n<!--#root-->");
    }

    @Test
    public void test0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0847");
        org.jsoup.nodes.DataNode dataNode2 = org.jsoup.nodes.DataNode.createFromEncoded(" hi!", "\n<!--#root-->");
        java.lang.String str3 = dataNode2.nodeName();
        org.junit.Assert.assertNotNull(dataNode2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#data" + "'", str3, "#data");
    }

    @Test
    public void test0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0848");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("org.jsoup.select.Selector$SelectorParseException: ");
        boolean boolean2 = tag1.isData();
        org.jsoup.nodes.Attributes attributes4 = new org.jsoup.nodes.Attributes();
        int int5 = attributes4.size();
        java.lang.String str6 = attributes4.html();
        org.jsoup.nodes.Element element7 = new org.jsoup.nodes.Element(tag1, "org.jsoup.select.selector$selectorparseexception:", attributes4);
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator8 = attributes4.spliterator();
        org.jsoup.nodes.Document document10 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements12 = document10.getElementsByAttribute("hi!");
        java.lang.String str13 = elements12.val();
        java.lang.Object obj14 = null;
        int int15 = elements12.lastIndexOf(obj14);
        org.jsoup.select.Elements elements17 = elements12.eq((int) '#');
        elements12.clear();
        int int19 = elements12.size();
        org.jsoup.nodes.TextNode textNode22 = new org.jsoup.nodes.TextNode("#root", "");
        boolean boolean23 = elements12.equals((java.lang.Object) "#root");
        java.lang.Object[] objArray24 = elements12.toArray();
        boolean boolean25 = attributes4.equals((java.lang.Object) objArray24);
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributeSpliterator8);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0849");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("a");
    }

    @Test
    public void test0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0850");
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
        java.util.List<org.jsoup.nodes.Node> nodeList28 = document19.childNodes();
        org.jsoup.nodes.Element element30 = document19.getElementById("a");
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
        org.junit.Assert.assertNotNull(nodeList28);
        org.junit.Assert.assertNull(element30);
    }

    @Test
    public void test0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0851");
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
        java.lang.String str21 = element18.nodeName();
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
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "#document" + "'", str21, "#document");
    }

    @Test
    public void test0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0852");
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parseBodyFragment("#document#document", "#comment");
        document2.setBaseUri("[#, d, o, c, u, m, e, n, t]");
        java.lang.String str5 = document2.nodeName();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#document" + "'", str5, "#document");
    }

    @Test
    public void test0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0853");
        org.jsoup.nodes.Document document2 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document2.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements6 = elements4.prepend("");
        org.jsoup.select.Elements elements8 = elements6.removeAttr("");
        org.jsoup.nodes.Document document10 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements12 = document10.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements14 = elements12.prepend("");
        org.jsoup.select.Elements elements16 = elements14.removeAttr("");
        boolean boolean17 = elements6.containsAll((java.util.Collection<org.jsoup.nodes.Element>) elements14);
        org.jsoup.nodes.Document document19 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements21 = document19.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements23 = elements21.prepend("");
        org.jsoup.select.Elements elements25 = elements23.removeAttr("");
        org.jsoup.nodes.Document document27 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements29 = document27.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements31 = elements29.prepend("");
        org.jsoup.select.Elements elements33 = elements31.removeAttr("");
        boolean boolean34 = elements23.containsAll((java.util.Collection<org.jsoup.nodes.Element>) elements31);
        org.jsoup.select.Elements elements36 = elements31.wrap("#root");
        boolean boolean37 = elements14.containsAll((java.util.Collection<org.jsoup.nodes.Element>) elements36);
        org.jsoup.select.Elements elements39 = elements14.removeClass("");
        org.jsoup.select.Elements elements41 = elements39.select("#data");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements42 = org.jsoup.select.Selector.select("", (java.lang.Iterable<org.jsoup.nodes.Element>) elements39);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(elements21);
        org.junit.Assert.assertNotNull(elements23);
        org.junit.Assert.assertNotNull(elements25);
        org.junit.Assert.assertNotNull(elements29);
        org.junit.Assert.assertNotNull(elements31);
        org.junit.Assert.assertNotNull(elements33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(elements36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(elements39);
        org.junit.Assert.assertNotNull(elements41);
    }

    @Test
    public void test0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0854");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("#root", "");
        org.jsoup.nodes.Element element5 = document2.attr("#root", "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        java.lang.String str6 = document2.tagName();
        java.lang.String str7 = document2.text();
        boolean boolean8 = document2.isBlock();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = document2.childNodes();
        org.jsoup.nodes.Element element11 = document2.prependText("org.jsoup.select.Selector$SelectorParseException:");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#root" + "'", str6, "#root");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#root" + "'", str7, "#root");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(element11);
    }

    @Test
    public void test0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0855");
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
        org.jsoup.parser.Tag tag32 = org.jsoup.parser.Tag.valueOf("#root");
        boolean boolean33 = tag32.isInline();
        boolean boolean34 = tag1.isValidAncestor(tag32);
        boolean boolean35 = tag1.isEmpty();
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
        org.junit.Assert.assertNotNull(tag32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0856");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parse("hi!");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValue("hi!", "hi!");
        org.jsoup.nodes.Attributes attributes5 = document1.attributes();
        org.jsoup.nodes.Element element6 = document1.head();
        org.jsoup.select.Elements elements7 = element6.getAllElements();
        org.jsoup.select.Elements elements8 = element6.getAllElements();
        org.jsoup.select.Elements elements10 = elements8.val(" class=\"hi!\"");
        org.jsoup.nodes.Element element11 = elements8.last();
        org.jsoup.nodes.Element element12 = element11.previousElementSibling();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNull(element12);
    }

    @Test
    public void test0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0857");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
    }

    @Test
    public void test0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0858");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.hasText();
        org.jsoup.nodes.Element element4 = document1.wrap("#comment");
        java.lang.String str5 = document1.title();
        java.lang.String str6 = document1.className();
        org.jsoup.nodes.Element element8 = document1.append("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element8);
    }

    @Test
    public void test0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0859");
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
        org.jsoup.nodes.Element element29 = element25.prependElement("#document#documentdocument");
        java.lang.String str30 = element25.text();
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
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "#document#documenthi!" + "'", str30, "#document#documenthi!");
    }

    @Test
    public void test0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0860");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("#root", "");
        java.lang.String str3 = document2.outerHtml();
        org.jsoup.nodes.Element element5 = document2.createElement("#document#documenthi!");
        org.jsoup.nodes.Element element8 = document2.attr("<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "org.jsoup.select.Selector$SelectorParseException: \n<!--#document-->");
        org.jsoup.nodes.Element element9 = document2.body();
        java.lang.String str10 = document2.title();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>" + "'", str3, "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0861");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element4 = document1.attr("hi!", "#root");
        org.jsoup.nodes.Attributes attributes5 = document1.attributes();
        java.lang.String str6 = attributes5.html();
        // The following exception was thrown during execution in test generation
        try {
            attributes5.remove("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " hi!=\"#root\"" + "'", str6, " hi!=\"#root\"");
    }

    @Test
    public void test0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0862");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueEnding("#comment", "\n<!--#declaration-->");
        org.junit.Assert.assertNotNull(elements4);
    }

    @Test
    public void test0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0863");
        org.jsoup.nodes.Document document2 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document2.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements6 = elements4.prepend("");
        elements6.clear();
        int int9 = elements6.indexOf((java.lang.Object) "org.jsoup.select.Selector$SelectorParseException: ");
        org.jsoup.select.Elements elements11 = elements6.removeClass("#data");
        org.jsoup.select.Elements elements12 = org.jsoup.select.Selector.select("#data", (java.lang.Iterable<org.jsoup.nodes.Element>) elements11);
        java.lang.String str13 = elements12.val();
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
        element28.setBaseUri("\n<!--#root-->");
        org.jsoup.nodes.Document document33 = org.jsoup.parser.Parser.parse("#root", "");
        org.jsoup.nodes.Element element36 = document33.attr("#root", "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        java.lang.String str37 = document33.tagName();
        java.lang.String str38 = document33.toString();
        org.jsoup.nodes.Node node40 = document33.removeAttr("[#, d, o, c, u, m, e, n, t]");
        org.jsoup.nodes.Element element41 = element28.prependChild((org.jsoup.nodes.Node) document33);
        org.jsoup.select.Elements elements42 = element41.getAllElements();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element43 = elements12.set((int) (byte) 0, element41);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "#document" + "'", str22, "#document");
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertNotNull(document33);
        org.junit.Assert.assertNotNull(element36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "#root" + "'", str37, "#root");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>" + "'", str38, "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertNotNull(element41);
        org.junit.Assert.assertNotNull(elements42);
    }

    @Test
    public void test0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0864");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("#root", "");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("#document");
        java.lang.String str5 = textNode2.toString();
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#document" + "'", str5, "#document");
    }

    @Test
    public void test0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0865");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        java.lang.String str5 = elements3.attr("#root");
        java.lang.String str6 = elements3.text();
        org.jsoup.select.Elements elements8 = elements3.prepend("org.jsoup.select.selector$selectorparseexception:");
        org.jsoup.nodes.Document document11 = org.jsoup.parser.Parser.parseBodyFragment("#document", "");
        org.jsoup.nodes.Element element13 = document11.addClass("hi!");
        java.lang.String str14 = document11.title();
        boolean boolean15 = elements3.add((org.jsoup.nodes.Element) document11);
        org.jsoup.nodes.Document document17 = org.jsoup.Jsoup.parse("hi!");
        org.jsoup.select.Elements elements20 = document17.getElementsByAttributeValue("hi!", "hi!");
        boolean boolean21 = document17.hasText();
        org.jsoup.select.Elements elements23 = document17.getElementsByIndexLessThan((int) (byte) 10);
        boolean boolean24 = elements23.isEmpty();
        java.lang.Object obj25 = null;
        boolean boolean26 = elements23.contains(obj25);
        boolean boolean27 = document11.equals((java.lang.Object) boolean26);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(document17);
        org.junit.Assert.assertNotNull(elements20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(elements23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0866");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("hi!", "hi!", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        java.lang.String str5 = xmlDeclaration3.toString();
        java.lang.String str6 = xmlDeclaration3.baseUri();
        java.lang.String str7 = xmlDeclaration3.nodeName();
        java.lang.String str8 = xmlDeclaration3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<?hi!>" + "'", str5, "<?hi!>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#declaration" + "'", str7, "#declaration");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<?hi!>" + "'", str8, "<?hi!>");
    }

    @Test
    public void test0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0867");
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
        java.lang.String str25 = document19.html();
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
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0868");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document(" class=\"hi!\"");
        document1.setBaseUri("<#root class=\"hi!\">\nhi!\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
    }

    @Test
    public void test0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0869");
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
            org.jsoup.nodes.Element element20 = element18.prependText("org.jsoup.select.Selector$SelectorParseException: org.jsoup.select.selector$selectorparseexception:");
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
    public void test0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0870");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("#root", "");
        org.jsoup.nodes.Element element5 = document2.attr("#root", "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        org.jsoup.nodes.Element element7 = document2.child((int) (byte) 0);
        org.jsoup.nodes.Node node8 = element7.nextSibling();
        java.lang.String str9 = element7.outerHtml();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\n<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>" + "'", str9, "\n<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
    }

    @Test
    public void test0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0871");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded(" class=\"hi!\"", "org.jsoup.select.Selector$SelectorParseException: ");
        java.lang.String str3 = textNode2.toString();
        java.lang.String str4 = textNode2.nodeName();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        boolean boolean7 = textNode6.isBlank();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " class=&quot;hi!&quot;" + "'", str3, " class=&quot;hi!&quot;");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#text" + "'", str4, "#text");
        org.junit.Assert.assertNotNull(textNode6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0872");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("a", "#data");
        java.lang.String str3 = comment2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n<!--a-->" + "'", str3, "\n<!--a-->");
    }

    @Test
    public void test0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0873");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parse("hi!");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValue("hi!", "hi!");
        org.jsoup.select.Selector.SelectorParseException selectorParseException6 = new org.jsoup.select.Selector.SelectorParseException("");
        boolean boolean7 = elements4.contains((java.lang.Object) "");
        org.jsoup.select.Elements elements9 = elements4.addClass("# ");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(elements9);
    }

    @Test
    public void test0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0874");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements5 = elements3.prepend("");
        org.jsoup.select.Elements elements7 = elements5.removeAttr("");
        org.jsoup.select.Elements elements9 = elements7.removeAttr("hi!");
        java.lang.String str10 = elements7.outerHtml();
        // The following exception was thrown during execution in test generation
        try {
            java.util.ListIterator<org.jsoup.nodes.Element> elementItor12 = elements7.listIterator(2);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0875");
        org.jsoup.safety.Whitelist whitelist2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.jsoup.Jsoup.clean("#document#documenthi!", "", whitelist2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0876");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element4 = document1.attr("hi!", "#root");
        org.jsoup.select.Elements elements5 = element4.parents();
        org.jsoup.nodes.Element element6 = element4.parent();
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNull(element6);
    }

    @Test
    public void test0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0877");
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
        boolean boolean21 = tag16.requiresSpecificParent();
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
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0878");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element4 = document1.attr("hi!", "#root");
        org.jsoup.nodes.Attributes attributes5 = document1.attributes();
        org.jsoup.nodes.Document document6 = document1.normalise();
        java.lang.String str7 = document1.title();
        org.jsoup.select.Elements elements9 = document1.getElementsByIndexEquals((int) (short) 0);
        org.jsoup.nodes.Element element11 = document1.text("\n<!--#root-->");
        boolean boolean12 = element11.isBlock();
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0879");
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
        org.jsoup.select.Elements elements19 = element17.getElementsByIndexLessThan((-1));
        org.jsoup.select.Elements elements22 = element17.getElementsByAttributeValueStarting("hi!", "#comment");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration26 = new org.jsoup.nodes.XmlDeclaration("#document#document", "\n<!--#document-->", false);
        java.lang.String str27 = xmlDeclaration26.toString();
        org.jsoup.nodes.Element element28 = element17.appendChild((org.jsoup.nodes.Node) xmlDeclaration26);
        java.lang.String str29 = xmlDeclaration26.nodeName();
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
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertNotNull(elements22);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "<?#document#document>" + "'", str27, "<?#document#document>");
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "#declaration" + "'", str29, "#declaration");
    }

    @Test
    public void test0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0880");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.ListIterator<org.jsoup.nodes.Element> elementItor31 = elements8.listIterator((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
    }

    @Test
    public void test0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0881");
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parse("hi!=\"#root\"", "head");
        org.junit.Assert.assertNotNull(document2);
    }

    @Test
    public void test0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0882");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("#document#document=\"#document#document\"", "body");
        java.lang.String str3 = document2.baseUri();
        org.jsoup.select.Elements elements5 = document2.getElementsByIndexGreaterThan(0);
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "body" + "'", str3, "body");
        org.junit.Assert.assertNotNull(elements5);
    }

    @Test
    public void test0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0883");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parse("hi!");
        java.lang.String str2 = document1.outerHtml();
        org.jsoup.nodes.Element element4 = document1.appendElement("\n<!--#data-->");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>" + "'", str2, "<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
        org.junit.Assert.assertNotNull(element4);
    }

    @Test
    public void test0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0884");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("#root", "");
        org.jsoup.nodes.Element element5 = document2.attr("#root", "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        java.lang.String str6 = element5.id();
        org.jsoup.select.Elements elements8 = element5.getElementsByIndexEquals((int) (short) 1);
        java.lang.String str9 = element5.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element11 = element5.child(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>" + "'", str9, "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
    }

    @Test
    public void test0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0885");
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
        org.jsoup.select.Elements elements17 = element10.getElementsByClass("<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor18 = elements17.listIterator();
        boolean boolean19 = elements17.hasText();
        java.lang.Object[] objArray20 = elements17.toArray();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertNotNull(elementItor18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[]");
    }

    @Test
    public void test0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0886");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("#document#document", "\n<!--#document-->", false);
        java.lang.String str4 = xmlDeclaration3.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = xmlDeclaration3.childNodes();
        java.lang.String str6 = xmlDeclaration3.nodeName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#declaration" + "'", str4, "#declaration");
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#declaration" + "'", str6, "#declaration");
    }

    @Test
    public void test0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0887");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element5 = document1.prepend("#document");
        org.jsoup.select.Elements elements7 = element5.getElementsByAttribute("hi!");
        java.lang.String str8 = elements7.val();
        org.jsoup.nodes.Document document12 = org.jsoup.Jsoup.parse("hi!=\"#root=&quot;hi!&quot;\"", "");
        org.jsoup.nodes.Element element14 = document12.createElement("a");
        org.jsoup.nodes.Element element15 = document12.empty();
        // The following exception was thrown during execution in test generation
        try {
            elements7.add((int) (byte) -1, element15);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(element15);
    }

    @Test
    public void test0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0888");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!", "hi!");
        attribute2.setKey("#root");
        java.lang.String str5 = attribute2.getKey();
        java.lang.String str6 = attribute2.html();
        java.lang.String str7 = attribute2.getValue();
        java.lang.String str8 = attribute2.getKey();
        org.jsoup.parser.Tag tag10 = org.jsoup.parser.Tag.valueOf("org.jsoup.select.Selector$SelectorParseException: ");
        boolean boolean11 = tag10.isData();
        org.jsoup.nodes.Attributes attributes13 = new org.jsoup.nodes.Attributes();
        int int14 = attributes13.size();
        java.lang.String str15 = attributes13.html();
        org.jsoup.nodes.Element element16 = new org.jsoup.nodes.Element(tag10, "org.jsoup.select.selector$selectorparseexception:", attributes13);
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator17 = attributes13.spliterator();
        attributes13.put("#comment", "#document#document=\"#document#document\"");
        int int21 = attributes13.size();
        boolean boolean22 = attribute2.equals((java.lang.Object) int21);
        java.lang.String str23 = attribute2.toString();
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#root" + "'", str5, "#root");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#root=\"hi!\"" + "'", str6, "#root=\"hi!\"");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#root" + "'", str8, "#root");
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(attributeSpliterator17);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "#root=\"hi!\"" + "'", str23, "#root=\"hi!\"");
    }

    @Test
    public void test0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0889");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("#root", "#root=\"hi!\"");
        java.lang.String str3 = attribute2.getKey();
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#root" + "'", str3, "#root");
    }

    @Test
    public void test0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0890");
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
        org.jsoup.nodes.Element element32 = element26.appendText("#root=\"#root=&quot;hi!&quot;\"");
        org.jsoup.nodes.Element element34 = element32.toggleClass("org.jsoup.select.selector$selectorparseexception: org.jsoup.select.selector$selectorparseexception:=\"#root\"");
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
        org.junit.Assert.assertNotNull(element32);
        org.junit.Assert.assertNotNull(element34);
    }

    @Test
    public void test0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0891");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parse("hi!");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("org.jsoup.select.selector$selectorparseexception:");
        java.lang.String str4 = elements3.text();
        org.jsoup.select.Elements elements6 = elements3.html("");
        boolean boolean8 = elements3.hasAttr("<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>\n<html> \n<head> \n</head> \n<body>\n  #root  \n</body>\n</html>");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0892");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element5 = document1.prepend("#document");
        org.jsoup.nodes.Element element6 = element5.empty();
        org.jsoup.select.Elements elements8 = element5.getElementsByTag("org.jsoup.select.Selector$SelectorParseException: ");
        org.jsoup.select.Elements elements10 = elements8.removeClass("#root");
        java.util.stream.Stream<org.jsoup.nodes.Element> elementStream11 = elements10.stream();
        boolean boolean12 = elements10.isEmpty();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(elementStream11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0893");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("org.jsoup.select.selector$selectorparseexception: org.jsoup.select.selector$selectorparseexception:=\"#root\"", "#root=\"#root=&quot;hi!&quot;\"");
        org.junit.Assert.assertNotNull(attribute2);
    }

    @Test
    public void test0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0894");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.hasText();
        java.lang.String str3 = document1.nodeName();
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        org.jsoup.nodes.Element element8 = document1.classNames((java.util.Set<java.lang.String>) strSet6);
        org.jsoup.nodes.Element element10 = element8.addClass("#document");
        org.jsoup.select.Elements elements13 = element10.getElementsByAttributeValueNot("#root", "org.jsoup.select.Selector$SelectorParseException: ");
        org.jsoup.select.Elements elements15 = element10.getElementsByIndexEquals((int) ' ');
        org.jsoup.nodes.Document document18 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element21 = document18.attr("hi!", "#root");
        org.jsoup.nodes.Attributes attributes22 = document18.attributes();
        org.jsoup.select.Elements elements23 = document18.children();
        java.util.Set<java.lang.String> strSet24 = document18.classNames();
        org.jsoup.select.Elements elements26 = document18.getElementsByTag("hi!=\"#root=&quot;hi!&quot;\"");
        // The following exception was thrown during execution in test generation
        try {
            elements15.add((int) 'a', (org.jsoup.nodes.Element) document18);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 97, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(attributes22);
        org.junit.Assert.assertNotNull(elements23);
        org.junit.Assert.assertNotNull(strSet24);
        org.junit.Assert.assertNotNull(elements26);
    }

    @Test
    public void test0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0895");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element5 = document1.prepend("#document");
        org.jsoup.nodes.Element element6 = element5.empty();
        org.jsoup.select.Elements elements8 = element5.getElementsByTag("org.jsoup.select.Selector$SelectorParseException: ");
        org.jsoup.select.Elements elements10 = elements8.html("#document");
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor11 = elements10.listIterator();
        org.jsoup.select.Elements elements14 = elements10.attr("<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "#document");
        java.lang.Class<?> wildcardClass15 = elements10.getClass();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(elementItor11);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0896");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element5 = document1.prepend("#document");
        org.jsoup.select.Elements elements7 = element5.getElementsByAttribute("hi!");
        java.lang.String str8 = elements7.val();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Element> elementList11 = elements7.subList((int) '4', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(52) > toIndex(-1)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0897");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        java.lang.String str4 = elements3.outerHtml();
        java.lang.String str5 = elements3.val();
        org.jsoup.select.Elements elements6 = new org.jsoup.select.Elements((java.util.List<org.jsoup.nodes.Element>) elements3);
        org.jsoup.select.Elements elements7 = new org.jsoup.select.Elements((java.util.Collection<org.jsoup.nodes.Element>) elements3);
        org.jsoup.select.Elements elements9 = elements7.addClass("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element10 = null;
        boolean boolean11 = elements7.add(element10);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0898");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("#root", "");
        org.jsoup.nodes.Element element5 = document2.attr("#root", "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        java.lang.String str6 = document2.tagName();
        org.jsoup.nodes.Element element7 = document2.empty();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements10 = element7.getElementsByAttributeValueEnding("", "org.jsoup.select.selector$selectorparseexception: org.jsoup.select.selector$selectorparseexception:=\"#root\"");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#root" + "'", str6, "#root");
        org.junit.Assert.assertNotNull(element7);
    }

    @Test
    public void test0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0899");
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
        java.util.List<org.jsoup.nodes.Attribute> attributeList20 = attributes15.asList();
        java.util.List<org.jsoup.nodes.Attribute> attributeList21 = attributes15.asList();
        attributes15.put("<!--#document--><#root hi!=\"#root\">\n</#root>", "#root=\"hi!\"");
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
        org.junit.Assert.assertNotNull(attributeList20);
        org.junit.Assert.assertNotNull(attributeList21);
    }

    @Test
    public void test0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0900");
        org.jsoup.safety.Whitelist whitelist2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.jsoup.Jsoup.clean("<html>\n<head>\n</head>\n<body>\n</body>\n</html>=\"\"", "#document#document=\"#document#document\"", whitelist2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0901");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.hasText();
        java.lang.String str3 = document1.nodeName();
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        org.jsoup.nodes.Element element8 = document1.classNames((java.util.Set<java.lang.String>) strSet6);
        org.jsoup.nodes.Element element10 = document1.append("#document");
        org.jsoup.nodes.Element element12 = element10.html("<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        org.jsoup.select.Elements elements15 = element12.getElementsByAttributeValueEnding("\n&lt;!--#root--&gt;", "org.jsoup.select.selector$selectorparseexception: org.jsoup.select.selector$selectorparseexception:=\"#root\"");
        org.jsoup.nodes.Element element17 = element12.addClass("#data");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element19 = element17.wrap("");
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
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(element17);
    }

    @Test
    public void test0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0902");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByIndexGreaterThan((int) ' ');
        org.jsoup.select.Elements elements6 = document1.getElementsByAttributeValueStarting("\n&lt;!--#root--&gt;", "#text");
        org.jsoup.select.Elements elements8 = elements6.eq(100);
        org.jsoup.select.Elements elements10 = elements6.removeClass("#document#documenthi!=\"hi!\"");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(elements10);
    }

    @Test
    public void test0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0903");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "\n<!--#root-->");
        java.lang.String str3 = textNode2.getWholeText();
        org.jsoup.nodes.TextNode textNode5 = textNode2.text("hi!");
        org.jsoup.nodes.TextNode textNode7 = textNode2.text("#root=\"hi!\"");
        org.jsoup.nodes.TextNode textNode9 = textNode2.text("\n<!--#root-->");
        java.lang.String str10 = textNode9.toString();
        java.lang.String str11 = textNode9.text();
        boolean boolean12 = textNode9.isBlank();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(textNode5);
        org.junit.Assert.assertNotNull(textNode7);
        org.junit.Assert.assertNotNull(textNode9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\n&lt;!--#root--&gt;" + "'", str10, "\n&lt;!--#root--&gt;");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\n&lt;!--#root--&gt;" + "'", str11, "\n&lt;!--#root--&gt;");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0904");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("#document");
        java.lang.String str2 = tokenQueue1.consumeAttributeKey();
        java.lang.String str3 = tokenQueue1.remainder();
        boolean boolean4 = tokenQueue1.isEmpty();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0905");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        int int1 = attributes0.size();
        java.lang.String str2 = attributes0.html();
        java.lang.String str3 = attributes0.html();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator4 = attributes0.spliterator();
        attributes0.put("\n&lt;!--#root--&gt;", " class=&quot;hi!&quot;");
        org.jsoup.nodes.TextNode textNode10 = org.jsoup.nodes.TextNode.createFromEncoded("body", "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.lang.String str11 = textNode10.nodeName();
        boolean boolean12 = attributes0.equals((java.lang.Object) textNode10);
        java.lang.String str13 = textNode10.toString();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(attributeSpliterator4);
        org.junit.Assert.assertNotNull(textNode10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#text" + "'", str11, "#text");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "body" + "'", str13, "body");
    }

    @Test
    public void test0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0906");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("#root", "");
        java.lang.String str3 = document2.outerHtml();
        org.jsoup.nodes.Element element5 = document2.append("<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        org.jsoup.select.Elements elements8 = document2.getElementsByAttributeValueStarting("#root=\"hi!\"", "org.jsoup.select.Selector$SelectorParseException: ");
        org.jsoup.nodes.Element element10 = document2.prepend("#root=\"hi!\"");
        java.lang.String str11 = element10.id();
        org.jsoup.select.Elements elements13 = element10.getElementsByIndexGreaterThan((int) (byte) 100);
        java.util.stream.Stream<org.jsoup.nodes.Element> elementStream14 = elements13.parallelStream();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>" + "'", str3, "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(elementStream14);
    }

    @Test
    public void test0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0907");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "#document#documenthi!=\"hi!\"");
        org.junit.Assert.assertNotNull(textNode2);
    }

    @Test
    public void test0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0908");
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
        boolean boolean15 = elements10.hasAttr("#declaration");
        java.lang.String str16 = elements10.outerHtml();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0909");
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
        org.jsoup.nodes.Document document23 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element26 = document23.attr("hi!", "#root");
        org.jsoup.nodes.Attributes attributes27 = document23.attributes();
        org.jsoup.select.Elements elements28 = document23.children();
        java.util.Set<java.lang.String> strSet29 = document23.classNames();
        org.jsoup.nodes.Element element30 = document15.classNames(strSet29);
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
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertNotNull(attributes27);
        org.junit.Assert.assertNotNull(elements28);
        org.junit.Assert.assertNotNull(strSet29);
        org.junit.Assert.assertNotNull(element30);
    }

    @Test
    public void test0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0910");
        org.jsoup.safety.Whitelist whitelist2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.jsoup.Jsoup.clean(" #comment=\"\"", "body", whitelist2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0911");
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
        org.jsoup.nodes.Document document65 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements67 = document65.getElementsByAttribute("hi!");
        java.lang.String str68 = elements67.val();
        java.lang.Object obj69 = null;
        int int70 = elements67.lastIndexOf(obj69);
        org.jsoup.select.Elements elements72 = elements67.eq((int) '#');
        boolean boolean74 = elements67.hasAttr("#root");
        int int76 = elements67.indexOf((java.lang.Object) (byte) 100);
        int int77 = elements67.size();
        boolean boolean78 = elements9.addAll((java.util.Collection<org.jsoup.nodes.Element>) elements67);
        org.jsoup.nodes.Document document80 = new org.jsoup.nodes.Document("");
        boolean boolean81 = document80.hasText();
        java.lang.String str82 = document80.nodeName();
        java.lang.String[] strArray84 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet85 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean86 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet85, strArray84);
        org.jsoup.nodes.Element element87 = document80.classNames((java.util.Set<java.lang.String>) strSet85);
        org.jsoup.nodes.Element element89 = element87.addClass("#document");
        java.lang.String str90 = element89.html();
        org.jsoup.nodes.Element element92 = element89.appendElement("#document");
        java.lang.String str93 = element92.html();
        java.lang.String str94 = element92.text();
        org.jsoup.select.Elements elements96 = element92.getElementsByAttribute("org.jsoup.select.Selector$SelectorParseException: ");
        org.jsoup.select.Elements elements98 = element92.getElementsByIndexEquals((int) (byte) 1);
        boolean boolean99 = elements9.retainAll((java.util.Collection<org.jsoup.nodes.Element>) elements98);
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
        org.junit.Assert.assertNotNull(elements67);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "" + "'", str68, "");
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + (-1) + "'", int70 == (-1));
        org.junit.Assert.assertNotNull(elements72);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + (-1) + "'", int76 == (-1));
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 0 + "'", int77 == 0);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "#document" + "'", str82, "#document");
        org.junit.Assert.assertNotNull(strArray84);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
        org.junit.Assert.assertNotNull(element87);
        org.junit.Assert.assertNotNull(element89);
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "" + "'", str90, "");
        org.junit.Assert.assertNotNull(element92);
        org.junit.Assert.assertEquals("'" + str93 + "' != '" + "" + "'", str93, "");
        org.junit.Assert.assertEquals("'" + str94 + "' != '" + "" + "'", str94, "");
        org.junit.Assert.assertNotNull(elements96);
        org.junit.Assert.assertNotNull(elements98);
        org.junit.Assert.assertTrue("'" + boolean99 + "' != '" + true + "'", boolean99 == true);
    }

    @Test
    public void test0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0912");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element4 = document1.attr("hi!", "#root");
        java.lang.String str5 = document1.id();
        boolean boolean7 = document1.hasAttr("#root");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = document1.absUrl("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0913");
        org.jsoup.nodes.DataNode dataNode2 = new org.jsoup.nodes.DataNode(" class=&quot;hi!&quot;", "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Node node4 = dataNode2.removeAttr("a");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node6 = dataNode2.childNode((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
    }

    @Test
    public void test0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0914");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parse("hi!");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValue("hi!", "hi!");
        org.jsoup.select.Selector.SelectorParseException selectorParseException6 = new org.jsoup.select.Selector.SelectorParseException("");
        boolean boolean7 = elements4.contains((java.lang.Object) "");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element9 = elements4.remove((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 52, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0915");
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
        org.jsoup.nodes.TextNode textNode55 = new org.jsoup.nodes.TextNode("#root", "");
        org.jsoup.nodes.TextNode textNode57 = textNode55.text("#document");
        org.jsoup.nodes.TextNode textNode59 = textNode55.text(" class=\"hi!\"");
        java.lang.String str60 = textNode59.getWholeText();
        java.lang.String str61 = textNode59.nodeName();
        boolean boolean62 = textNode59.isBlank();
        boolean boolean63 = element18.equals((java.lang.Object) boolean62);
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
        org.junit.Assert.assertNotNull(textNode57);
        org.junit.Assert.assertNotNull(textNode59);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + " class=\"hi!\"" + "'", str60, " class=\"hi!\"");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "#text" + "'", str61, "#text");
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
    }

    @Test
    public void test0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0916");
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
        org.jsoup.select.Elements elements39 = element36.getElementsByAttributeValueContaining("<html>\n<head>\n</head>\n<body> \n <!--#root-->\n</body>\n</html>", "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
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
        org.junit.Assert.assertNotNull(elements39);
    }

    @Test
    public void test0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0917");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Document document2 = document1.normalise();
        org.jsoup.nodes.Element element4 = document1.prependElement("org.jsoup.select.selector$selectorparseexception:");
        java.lang.String str5 = element4.nodeName();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "org.jsoup.select.selector$selectorparseexception:" + "'", str5, "org.jsoup.select.selector$selectorparseexception:");
    }

    @Test
    public void test0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0918");
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
        org.jsoup.parser.Tag tag32 = org.jsoup.parser.Tag.valueOf("#root");
        boolean boolean33 = tag32.isInline();
        boolean boolean34 = tag1.isValidAncestor(tag32);
        boolean boolean35 = tag1.canContainBlock();
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
        org.junit.Assert.assertNotNull(tag32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
    }

    @Test
    public void test0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0919");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.hasText();
        java.lang.String str3 = document1.nodeName();
        org.jsoup.select.Elements elements4 = document1.children();
        org.jsoup.select.Elements elements6 = document1.getElementsByTag("#document#documenthi!");
        org.jsoup.select.Elements elements8 = elements6.removeClass("#document#documentdocument");
        org.jsoup.select.Elements elements10 = elements6.html("#text");
        org.jsoup.nodes.Document document12 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements14 = document12.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element16 = document12.prepend("#document");
        org.jsoup.nodes.Element element17 = element16.empty();
        org.jsoup.select.Elements elements19 = element16.getElementsByTag("org.jsoup.select.Selector$SelectorParseException: ");
        org.jsoup.select.Elements elements21 = elements19.removeClass("#root");
        org.jsoup.select.Elements elements23 = elements19.append("");
        boolean boolean25 = elements19.hasAttr("#document#document");
        org.jsoup.nodes.Document document27 = new org.jsoup.nodes.Document("");
        boolean boolean28 = document27.hasText();
        java.lang.String str29 = document27.nodeName();
        java.lang.String[] strArray31 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet32 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet32, strArray31);
        org.jsoup.nodes.Element element34 = document27.classNames((java.util.Set<java.lang.String>) strSet32);
        org.jsoup.nodes.Element element36 = document27.append("#document");
        org.jsoup.nodes.Element element38 = element36.html("");
        org.jsoup.select.Elements elements41 = element36.getElementsByAttributeValueNot("#root", "org.jsoup.select.Selector$SelectorParseException: ");
        org.jsoup.select.Elements elements43 = element36.getElementsByClass("<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        int int44 = elements19.lastIndexOf((java.lang.Object) elements43);
        boolean boolean45 = elements6.removeAll((java.util.Collection<org.jsoup.nodes.Element>) elements43);
        org.jsoup.nodes.Document document48 = new org.jsoup.nodes.Document("");
        boolean boolean49 = document48.hasText();
        boolean boolean50 = document48.hasText();
        org.jsoup.nodes.Document document52 = new org.jsoup.nodes.Document("");
        boolean boolean53 = document52.hasText();
        java.lang.String str54 = document52.nodeName();
        java.lang.String[] strArray56 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet57 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet57, strArray56);
        org.jsoup.nodes.Element element59 = document52.classNames((java.util.Set<java.lang.String>) strSet57);
        org.jsoup.nodes.Element element60 = document48.classNames((java.util.Set<java.lang.String>) strSet57);
        org.jsoup.nodes.Element element62 = document48.appendText("hi!");
        org.jsoup.parser.Tag tag63 = document48.tag();
        boolean boolean64 = tag63.requiresSpecificParent();
        org.jsoup.parser.Tag tag65 = tag63.getImplicitParent();
        org.jsoup.nodes.Element element67 = new org.jsoup.nodes.Element(tag63, "<?#document#document>");
        // The following exception was thrown during execution in test generation
        try {
            elements6.add((int) (short) 1, element67);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertNotNull(elements21);
        org.junit.Assert.assertNotNull(elements23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "#document" + "'", str29, "#document");
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(element34);
        org.junit.Assert.assertNotNull(element36);
        org.junit.Assert.assertNotNull(element38);
        org.junit.Assert.assertNotNull(elements41);
        org.junit.Assert.assertNotNull(elements43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "#document" + "'", str54, "#document");
        org.junit.Assert.assertNotNull(strArray56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(element59);
        org.junit.Assert.assertNotNull(element60);
        org.junit.Assert.assertNotNull(element62);
        org.junit.Assert.assertNotNull(tag63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(tag65);
    }

    @Test
    public void test0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0920");
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
        java.util.List<org.jsoup.nodes.Attribute> attributeList21 = attributes13.asList();
        org.jsoup.nodes.Attribute attribute24 = org.jsoup.nodes.Attribute.createFromEncoded("hi!", "hi!");
        attribute24.setKey("#root");
        java.lang.String str27 = attribute24.html();
        attribute24.setKey("#data");
        org.jsoup.nodes.Document document31 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements33 = document31.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements35 = elements33.prepend("");
        org.jsoup.select.Elements elements37 = elements35.removeAttr("");
        org.jsoup.nodes.Document document39 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements41 = document39.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements43 = elements41.prepend("");
        org.jsoup.select.Elements elements45 = elements43.removeAttr("");
        boolean boolean46 = elements35.containsAll((java.util.Collection<org.jsoup.nodes.Element>) elements43);
        java.lang.Object[] objArray47 = elements35.toArray();
        org.jsoup.nodes.Document document49 = new org.jsoup.nodes.Document("");
        boolean boolean50 = document49.hasText();
        java.lang.String str51 = document49.nodeName();
        java.lang.String str52 = document49.val();
        boolean boolean53 = elements35.add((org.jsoup.nodes.Element) document49);
        boolean boolean54 = attribute24.equals((java.lang.Object) boolean53);
        attribute24.setValue("<html>\n<head>\n</head>\n<body>\n</body>\n</html>=\"\"");
        attributes13.put(attribute24);
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
        org.junit.Assert.assertNotNull(attributeList21);
        org.junit.Assert.assertNotNull(attribute24);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "#root=\"hi!\"" + "'", str27, "#root=\"hi!\"");
        org.junit.Assert.assertNotNull(elements33);
        org.junit.Assert.assertNotNull(elements35);
        org.junit.Assert.assertNotNull(elements37);
        org.junit.Assert.assertNotNull(elements41);
        org.junit.Assert.assertNotNull(elements43);
        org.junit.Assert.assertNotNull(elements45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray47), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray47), "[]");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "#document" + "'", str51, "#document");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    }

    @Test
    public void test0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0921");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("#root", "");
        org.jsoup.nodes.Element element5 = document2.attr("#root", "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        java.lang.String str6 = document2.tagName();
        java.lang.String str7 = document2.text();
        org.jsoup.nodes.Element element9 = document2.text("#document#documentdocument");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = document2.childNodes();
        org.jsoup.nodes.Element element11 = document2.head();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#root" + "'", str6, "#root");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#root" + "'", str7, "#root");
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(element11);
    }

    @Test
    public void test0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0922");
        org.jsoup.nodes.DataNode dataNode2 = org.jsoup.nodes.DataNode.createFromEncoded("org.jsoup.select.selector$selectorparseexception:", "hi!");
        java.lang.String str3 = dataNode2.getWholeData();
        java.lang.String str4 = dataNode2.getWholeData();
        java.lang.String str5 = dataNode2.getWholeData();
        org.junit.Assert.assertNotNull(dataNode2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "org.jsoup.select.selector$selectorparseexception:" + "'", str3, "org.jsoup.select.selector$selectorparseexception:");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "org.jsoup.select.selector$selectorparseexception:" + "'", str4, "org.jsoup.select.selector$selectorparseexception:");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "org.jsoup.select.selector$selectorparseexception:" + "'", str5, "org.jsoup.select.selector$selectorparseexception:");
    }

    @Test
    public void test0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0923");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parse("hi!");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("org.jsoup.select.selector$selectorparseexception:");
        org.jsoup.select.Elements elements5 = elements3.eq((int) (byte) 10);
        elements3.clear();
        org.jsoup.nodes.Element element7 = elements3.first();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNull(element7);
    }

    @Test
    public void test0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0924");
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
        org.jsoup.select.Elements elements19 = elements17.wrap("hi!=\"#root=&quot;hi!&quot;\"");
        java.util.stream.Stream<org.jsoup.nodes.Element> elementStream20 = elements19.stream();
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
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertNotNull(elementStream20);
    }

    @Test
    public void test0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0925");
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
        java.lang.Object obj17 = null;
        int int18 = elements3.indexOf(obj17);
        java.lang.String str19 = elements3.val();
        org.jsoup.nodes.TextNode textNode22 = new org.jsoup.nodes.TextNode("#root", "");
        boolean boolean23 = textNode22.isBlank();
        java.lang.String str24 = textNode22.text();
        java.lang.String str25 = textNode22.toString();
        boolean boolean26 = textNode22.isBlank();
        int int27 = elements3.indexOf((java.lang.Object) textNode22);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "#root" + "'", str24, "#root");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "#root" + "'", str25, "#root");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
    }

    @Test
    public void test0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0926");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("#root", "");
        boolean boolean3 = textNode2.isBlank();
        java.lang.String str4 = textNode2.text();
        java.lang.String str5 = textNode2.getWholeText();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#root" + "'", str4, "#root");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#root" + "'", str5, "#root");
    }

    @Test
    public void test0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0927");
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
        java.lang.String str24 = attributes13.html();
        attributes13.put(" class=&quot;hi!&quot;", "org.jsoup.select.Selector$SelectorParseException: \n<!--#document-->");
        org.jsoup.parser.Tag tag29 = org.jsoup.parser.Tag.valueOf("org.jsoup.select.Selector$SelectorParseException: ");
        boolean boolean30 = tag29.isData();
        org.jsoup.nodes.Attributes attributes32 = new org.jsoup.nodes.Attributes();
        int int33 = attributes32.size();
        java.lang.String str34 = attributes32.html();
        org.jsoup.nodes.Element element35 = new org.jsoup.nodes.Element(tag29, "org.jsoup.select.selector$selectorparseexception:", attributes32);
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator36 = attributes32.spliterator();
        boolean boolean38 = attributes32.hasKey("#root");
        org.jsoup.nodes.TextNode textNode41 = new org.jsoup.nodes.TextNode("org.jsoup.select.Selector$SelectorParseException: ", "");
        java.lang.String str43 = textNode41.absUrl("#data");
        org.jsoup.nodes.TextNode textNode45 = textNode41.text("#data");
        org.jsoup.nodes.Attributes attributes46 = textNode41.attributes();
        attributes32.addAll(attributes46);
        attributes13.addAll(attributes32);
        java.util.List<org.jsoup.nodes.Attribute> attributeList49 = attributes32.asList();
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
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + " class=\"hi!\"" + "'", str24, " class=\"hi!\"");
        org.junit.Assert.assertNotNull(tag29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(attributeSpliterator36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertNotNull(textNode45);
        org.junit.Assert.assertNotNull(attributes46);
        org.junit.Assert.assertNotNull(attributeList49);
    }

    @Test
    public void test0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0928");
        org.jsoup.nodes.Evaluator evaluator0 = null;
        org.jsoup.nodes.Document document3 = org.jsoup.parser.Parser.parse("#root", "");
        org.jsoup.nodes.Element element6 = document3.attr("#root", "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        java.lang.String str7 = document3.tagName();
        java.lang.String str8 = document3.toString();
        org.jsoup.nodes.Element element10 = document3.text("#document=\"#comment\"");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements11 = org.jsoup.select.Collector.collect(evaluator0, (org.jsoup.nodes.Element) document3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#root" + "'", str7, "#root");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>" + "'", str8, "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        org.junit.Assert.assertNotNull(element10);
    }

    @Test
    public void test0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0929");
        org.jsoup.safety.Whitelist whitelist1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.jsoup.Jsoup.clean("# ", whitelist1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0930");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Document document2 = document1.normalise();
        org.jsoup.nodes.Element element4 = document1.prependElement("org.jsoup.select.selector$selectorparseexception:");
        org.jsoup.nodes.Element element6 = element4.wrap("#root");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = element6.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNull(element6);
    }

    @Test
    public void test0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0931");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        int int1 = attributes0.size();
        java.lang.String str2 = attributes0.html();
        java.lang.String str3 = attributes0.html();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator4 = attributes0.spliterator();
        boolean boolean6 = attributes0.hasKey("");
        java.util.List<org.jsoup.nodes.Attribute> attributeList7 = attributes0.asList();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(attributeSpliterator4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(attributeList7);
    }

    @Test
    public void test0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0932");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element4 = document1.attr("hi!", "#root");
        org.jsoup.select.Elements elements5 = element4.parents();
        org.jsoup.select.Elements elements6 = element4.children();
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elements6);
    }

    @Test
    public void test0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0933");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.hasText();
        java.lang.String str3 = document1.nodeName();
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        org.jsoup.nodes.Element element8 = document1.classNames((java.util.Set<java.lang.String>) strSet6);
        org.jsoup.nodes.Element element10 = element8.addClass("#document");
        java.lang.String str11 = element10.html();
        org.jsoup.select.Elements elements13 = element10.getElementsByAttribute("#document");
        org.jsoup.nodes.Document document15 = new org.jsoup.nodes.Document("");
        boolean boolean16 = document15.hasText();
        java.lang.String str17 = document15.nodeName();
        java.lang.String str18 = document15.outerHtml();
        org.jsoup.parser.Tag tag19 = document15.tag();
        int int20 = elements13.lastIndexOf((java.lang.Object) document15);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "#document" + "'", str17, "#document");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(tag19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0934");
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
        org.jsoup.select.Elements elements14 = elements10.removeAttr("org.jsoup.select.Selector$SelectorParseException: \n<!--#document-->");
        org.jsoup.select.Elements elements16 = elements10.prepend("\n<!--#document-->");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(elements16);
    }

    @Test
    public void test0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0935");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("\n<!--#document-->", "#root=\"hi!\"");
        org.junit.Assert.assertNotNull(attribute2);
    }

    @Test
    public void test0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0936");
        org.jsoup.nodes.DataNode dataNode2 = new org.jsoup.nodes.DataNode("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>", "#document");
        java.lang.String str3 = dataNode2.getWholeData();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>" + "'", str3, "<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>");
    }

    @Test
    public void test0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0937");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        java.lang.String str4 = document1.nodeName();
        java.lang.String str5 = document1.outerHtml();
        boolean boolean7 = document1.hasAttr("#document#document");
        org.jsoup.select.Elements elements10 = document1.getElementsByAttributeValueEnding("#document", "#comment");
        org.jsoup.nodes.Element element12 = document1.prependElement("org.jsoup.select.selector$selectorparseexception:");
        org.jsoup.nodes.Element element13 = element12.nextElementSibling();
        boolean boolean14 = element12.isBlock();
        org.jsoup.select.Elements elements15 = element12.siblingElements();
        org.jsoup.nodes.Element element16 = element12.lastElementSibling();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#document" + "'", str4, "#document");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNull(element13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNull(element16);
    }

    @Test
    public void test0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0938");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        java.lang.String str5 = elements3.attr("#root");
        java.lang.String str6 = elements3.text();
        org.jsoup.nodes.Document document8 = new org.jsoup.nodes.Document("");
        boolean boolean9 = document8.hasText();
        java.lang.String str10 = document8.nodeName();
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet13 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet13, strArray12);
        org.jsoup.nodes.Element element15 = document8.classNames((java.util.Set<java.lang.String>) strSet13);
        org.jsoup.nodes.Element element17 = element15.addClass("#document");
        org.jsoup.select.Elements elements20 = element17.getElementsByAttributeValueNot("#root", "org.jsoup.select.Selector$SelectorParseException: ");
        java.lang.String str21 = elements20.html();
        org.jsoup.nodes.Attributes attributes22 = new org.jsoup.nodes.Attributes();
        int int23 = attributes22.size();
        java.lang.String str24 = attributes22.html();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor25 = attributes22.iterator();
        boolean boolean26 = elements20.contains((java.lang.Object) attributes22);
        org.jsoup.nodes.Attributes attributes27 = new org.jsoup.nodes.Attributes();
        int int28 = attributes27.size();
        java.lang.String str29 = attributes27.html();
        java.lang.String str30 = attributes27.html();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator31 = attributes27.spliterator();
        java.lang.String str32 = attributes27.html();
        attributes22.addAll(attributes27);
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator34 = attributes27.spliterator();
        int int35 = elements3.lastIndexOf((java.lang.Object) attributes27);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#document" + "'", str10, "#document");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(elements20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(attributeItor25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(attributeSpliterator31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(attributeSpliterator34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
    }

    @Test
    public void test0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0939");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("a");
        org.jsoup.nodes.Element element3 = document1.html(" #root=\"hi!\"");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
    }

    @Test
    public void test0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0940");
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
        boolean boolean29 = attributes0.hasKey("\n<!--org.jsoup.select.selector$selectorparseexception: org.jsoup.select.selector$selectorparseexception:=\"#root\"-->");
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
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0941");
        org.jsoup.safety.Whitelist whitelist2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.jsoup.Jsoup.clean("\n<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>", "", whitelist2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0942");
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
        org.jsoup.select.Elements elements15 = elements3.addClass("org.jsoup.select.Selector$SelectorParseException: ");
        org.jsoup.nodes.Document document17 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements19 = document17.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element21 = document17.prepend("#document");
        boolean boolean22 = elements3.equals((java.lang.Object) element21);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ListIterator<org.jsoup.nodes.Element> elementItor24 = elements3.listIterator(2);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 2");
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
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0943");
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
        java.lang.String str20 = document1.attr("[]");
        document1.setBaseUri("[#, d, o, c, u, m, e, n, t]");
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0944");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("#document");
        boolean boolean3 = tokenQueue1.matches("\n<!--#root-->");
        boolean boolean5 = tokenQueue1.matchChomp("#data");
        java.lang.String str6 = tokenQueue1.toString();
        java.lang.String str7 = tokenQueue1.remainder();
        java.lang.String str9 = tokenQueue1.consumeTo("");
        boolean boolean11 = tokenQueue1.matchChomp("#root=&quot;hi!&quot;");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[#, d, o, c, u, m, e, n, t]" + "'", str6, "[#, d, o, c, u, m, e, n, t]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#document" + "'", str7, "#document");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0945");
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
        org.jsoup.nodes.Document document18 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element21 = document18.attr("hi!", "#root");
        java.lang.String str22 = document18.id();
        boolean boolean23 = element16.equals((java.lang.Object) document18);
        org.jsoup.select.Elements elements24 = document18.parents();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#document" + "'", str9, "#document");
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNull(element14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(elements24);
    }

    @Test
    public void test0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0946");
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
        boolean boolean15 = elements10.hasAttr("#declaration");
        org.jsoup.select.Elements elements17 = elements10.append("");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Element> elementList20 = elements10.subList((int) (short) 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(0) > toIndex(-1)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(elements17);
    }

    @Test
    public void test0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0947");
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
        boolean boolean18 = element17.isBlock();
        org.jsoup.parser.Tag tag19 = element17.tag();
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
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(tag19);
    }

    @Test
    public void test0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0948");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("org.jsoup.select.Selector$SelectorParseException: ");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Document document4 = document3.normalise();
        org.jsoup.nodes.Element element5 = document3.head();
        org.jsoup.nodes.Element element7 = element5.append("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element9 = element5.wrap("#text");
        boolean boolean10 = tag1.equals((java.lang.Object) element9);
        boolean boolean11 = tag1.isEmpty();
        boolean boolean12 = tag1.preserveWhitespace();
        org.jsoup.nodes.Element element14 = new org.jsoup.nodes.Element(tag1, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
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
    public void test0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0949");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parse("hi!");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValue("hi!", "hi!");
        document1.title("[]");
        org.jsoup.nodes.Element element8 = document1.prependText("#document#document");
        boolean boolean10 = document1.hasClass("body");
        boolean boolean11 = document1.isBlock();
        org.jsoup.nodes.Element element13 = document1.prependText("hi!");
        java.lang.Class<?> wildcardClass14 = element13.getClass();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0950");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("#root");
        org.jsoup.parser.Tag tag2 = tag1.getImplicitParent();
        java.lang.String str3 = tag2.toString();
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertNotNull(tag2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "body" + "'", str3, "body");
    }

    @Test
    public void test0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0951");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.hasText();
        java.lang.String str3 = document1.nodeName();
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        org.jsoup.nodes.Element element8 = document1.classNames((java.util.Set<java.lang.String>) strSet6);
        org.jsoup.nodes.Element element10 = document1.append("#document");
        org.jsoup.nodes.Element element12 = element10.html("");
        org.jsoup.nodes.Element element15 = element12.attr("org.jsoup.select.Selector$SelectorParseException: ", "#root");
        org.jsoup.nodes.Element element17 = element15.prepend("org.jsoup.select.selector$selectorparseexception:");
        java.lang.String str18 = element15.text();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "org.jsoup.select.selector$selectorparseexception:" + "'", str18, "org.jsoup.select.selector$selectorparseexception:");
    }

    @Test
    public void test0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0952");
        org.jsoup.nodes.DataNode dataNode2 = org.jsoup.nodes.DataNode.createFromEncoded("#document#documentdocument", "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.lang.String str3 = dataNode2.getWholeData();
        org.junit.Assert.assertNotNull(dataNode2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document#documentdocument" + "'", str3, "#document#documentdocument");
    }

    @Test
    public void test0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0953");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("#document#documenthi!", " #root=\"hi!\"");
        org.junit.Assert.assertNotNull(document2);
    }

    @Test
    public void test0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0954");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("#root");
        org.jsoup.nodes.Element element3 = document1.html("org.jsoup.select.Selector$SelectorParseException: ");
        org.jsoup.nodes.Node node5 = element3.removeAttr("#document#documentdocument");
        org.jsoup.nodes.Document document7 = new org.jsoup.nodes.Document("");
        boolean boolean8 = document7.hasText();
        java.lang.String str9 = document7.nodeName();
        org.jsoup.select.Elements elements10 = document7.children();
        java.util.Set<java.lang.String> strSet11 = document7.classNames();
        org.jsoup.nodes.Element element12 = element3.classNames(strSet11);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#document" + "'", str9, "#document");
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNotNull(element12);
    }

    @Test
    public void test0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0955");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parse("hi!");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValue("hi!", "hi!");
        org.jsoup.select.Selector.SelectorParseException selectorParseException6 = new org.jsoup.select.Selector.SelectorParseException("");
        boolean boolean7 = elements4.contains((java.lang.Object) "");
        boolean boolean9 = elements4.is("[]");
        elements4.clear();
        java.util.stream.Stream<org.jsoup.nodes.Element> elementStream11 = elements4.parallelStream();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(elementStream11);
    }

    @Test
    public void test0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0956");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("#document#document", "\n<!--#document-->", false);
        java.lang.String str4 = xmlDeclaration3.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = xmlDeclaration3.childNodes();
        java.lang.String str6 = xmlDeclaration3.toString();
        java.lang.String str7 = xmlDeclaration3.toString();
        java.lang.String str8 = xmlDeclaration3.getWholeDeclaration();
        java.lang.String str9 = xmlDeclaration3.toString();
        java.lang.String str10 = xmlDeclaration3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<?#document#document>" + "'", str4, "<?#document#document>");
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<?#document#document>" + "'", str6, "<?#document#document>");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<?#document#document>" + "'", str7, "<?#document#document>");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#document#document" + "'", str8, "#document#document");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<?#document#document>" + "'", str9, "<?#document#document>");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<?#document#document>" + "'", str10, "<?#document#document>");
    }

    @Test
    public void test0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0957");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element5 = document1.prepend("#document");
        org.jsoup.nodes.Element element6 = element5.empty();
        org.jsoup.select.Elements elements8 = element5.getElementsByTag("org.jsoup.select.Selector$SelectorParseException: ");
        org.jsoup.select.Elements elements10 = elements8.html("#document");
        java.lang.String str11 = elements8.text();
        org.jsoup.select.Elements elements13 = elements8.append(" class=\"hi!\"");
        java.lang.Class<?> wildcardClass14 = elements13.getClass();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0958");
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
        org.jsoup.nodes.Element element16 = element12.appendElement("[#, d, o, c, u, m, e, n, t, #, d, o, c, u, m, e, n, t, d, o, c, u, m, e, n, t]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNull(element14);
        org.junit.Assert.assertNotNull(element16);
    }

    @Test
    public void test0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0959");
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
        java.lang.String str20 = elements19.html();
        java.lang.String str21 = elements19.text();
        java.lang.String str22 = elements19.html();
        org.jsoup.nodes.Document document24 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements26 = document24.getElementsByAttribute("hi!");
        java.lang.String str28 = elements26.attr("#root");
        org.jsoup.nodes.Document document30 = new org.jsoup.nodes.Document("");
        boolean boolean31 = document30.hasText();
        java.lang.String str32 = document30.nodeName();
        org.jsoup.select.Elements elements33 = document30.children();
        org.jsoup.nodes.Element element35 = document30.prependElement("[#, d, o, c, u, m, e, n, t]");
        int int36 = elements26.lastIndexOf((java.lang.Object) document30);
        org.jsoup.nodes.Element element37 = document30.parent();
        org.jsoup.nodes.Element element39 = document30.append("#root=\"hi!\"");
        java.lang.String str40 = element39.toString();
        org.jsoup.nodes.Document document42 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Document document43 = document42.normalise();
        org.jsoup.nodes.Element element44 = document42.head();
        org.jsoup.nodes.Element element46 = element44.append("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        boolean boolean48 = element46.equals((java.lang.Object) "#root=\"hi!\"");
        org.jsoup.nodes.Document document50 = new org.jsoup.nodes.Document("");
        boolean boolean51 = document50.hasText();
        java.lang.String str52 = document50.nodeName();
        java.lang.String str53 = document50.val();
        java.lang.String str54 = document50.outerHtml();
        java.lang.String[] strArray57 = new java.lang.String[] { "\n<!--#document-->", "#data" };
        java.util.LinkedHashSet<java.lang.String> strSet58 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet58, strArray57);
        org.jsoup.nodes.Element element60 = document50.classNames((java.util.Set<java.lang.String>) strSet58);
        org.jsoup.nodes.Element element61 = element46.classNames((java.util.Set<java.lang.String>) strSet58);
        org.jsoup.nodes.Element element62 = element39.classNames((java.util.Set<java.lang.String>) strSet58);
        java.lang.String str63 = element62.nodeName();
        org.jsoup.nodes.Element element65 = element62.getElementById("#document#document");
        org.jsoup.nodes.Element element67 = element62.val("[#, d, o, c, u, m, e, n, t, #, d, o, c, u, m, e, n, t, =, \", #, d, o, c, u, m, e, n, t, #, d, o, c, u, m, e, n, t, \"]");
        boolean boolean68 = elements19.add(element62);
        java.lang.String str69 = elements19.text();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(elements26);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "#document" + "'", str32, "#document");
        org.junit.Assert.assertNotNull(elements33);
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNull(element37);
        org.junit.Assert.assertNotNull(element39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "<[#, d, o, c, u, m, e, n, t]>\n</[#, d, o, c, u, m, e, n, t]>#root=&quot;hi!&quot;" + "'", str40, "<[#, d, o, c, u, m, e, n, t]>\n</[#, d, o, c, u, m, e, n, t]>#root=&quot;hi!&quot;");
        org.junit.Assert.assertNotNull(document42);
        org.junit.Assert.assertNotNull(document43);
        org.junit.Assert.assertNotNull(element44);
        org.junit.Assert.assertNotNull(element46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "#document" + "'", str52, "#document");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertNotNull(strArray57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(element60);
        org.junit.Assert.assertNotNull(element61);
        org.junit.Assert.assertNotNull(element62);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "#document" + "'", str63, "#document");
        org.junit.Assert.assertNull(element65);
        org.junit.Assert.assertNotNull(element67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "#root=\"hi!\"" + "'", str69, "#root=\"hi!\"");
    }

    @Test
    public void test0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0960");
        org.jsoup.safety.Whitelist whitelist2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.jsoup.Jsoup.clean("#root", "", whitelist2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0961");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.hasText();
        java.lang.String str3 = document1.nodeName();
        java.lang.String str4 = document1.val();
        java.lang.String str5 = document1.outerHtml();
        java.lang.String[] strArray8 = new java.lang.String[] { "\n<!--#document-->", "#data" };
        java.util.LinkedHashSet<java.lang.String> strSet9 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet9, strArray8);
        org.jsoup.nodes.Element element11 = document1.classNames((java.util.Set<java.lang.String>) strSet9);
        org.jsoup.select.Elements elements13 = element11.getElementsByTag("#root");
        java.lang.String str14 = element11.html();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0962");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("");
        boolean boolean3 = tokenQueue1.matchChomp("org.jsoup.select.selector$selectorparseexception:");
        java.lang.String str4 = tokenQueue1.consumeWord();
        java.lang.String str5 = tokenQueue1.remainder();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0963");
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parseBodyFragment("org.jsoup.select.selector$selectorparseexception: org.jsoup.select.selector$selectorparseexception:=\"#root\"", "<#root class=\"hi!\">\nhi!\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document2);
    }

    @Test
    public void test0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0964");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("#document");
        boolean boolean3 = tokenQueue1.matches("\n<!--#root-->");
        boolean boolean5 = tokenQueue1.matchChomp("#data");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!=\"#root=&quot;hi!&quot;\"" };
        java.lang.String str8 = tokenQueue1.consumeToAny(strArray7);
        boolean boolean9 = tokenQueue1.consumeWhitespace();
        boolean boolean11 = tokenQueue1.matches("#data");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#document" + "'", str8, "#document");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0965");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        java.lang.String str4 = elements3.outerHtml();
        java.lang.String str5 = elements3.val();
        org.jsoup.select.Elements elements6 = new org.jsoup.select.Elements((java.util.List<org.jsoup.nodes.Element>) elements3);
        org.jsoup.select.Elements elements8 = elements6.select(" ");
        java.lang.String str10 = elements6.attr("<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>\n<html> \n<head> \n</head> \n<body>\n  #root  \n</body>\n</html>");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0966");
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
        int int41 = attributes27.size();
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
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
    }

    @Test
    public void test0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0967");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("#comment");
        java.lang.String str2 = document1.outerHtml();
        org.jsoup.nodes.Document document3 = document1.normalise();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>" + "'", str2, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document3);
    }

    @Test
    public void test0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0968");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("#root", "");
        org.jsoup.nodes.Element element5 = document2.attr("#root", "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        java.lang.String str6 = document2.tagName();
        java.lang.String str7 = document2.toString();
        org.jsoup.nodes.Element element9 = document2.text("#document=\"#comment\"");
        boolean boolean11 = document2.hasClass("");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#root" + "'", str6, "#root");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>" + "'", str7, "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0969");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute(" hi!=\"#root\"", "#root=&quot;hi!&quot;\n<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>\n<html> \n<head> \n</head> \n<body>\n  #root  \n</body>\n</html>");
    }

    @Test
    public void test0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0970");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragmentRelaxed("hi!", "#data");
        java.lang.String str3 = document2.text();
        org.jsoup.nodes.Element element5 = document2.text("\n<!--#data-->");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(element5);
    }

    @Test
    public void test0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0971");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.hasText();
        java.lang.String str3 = document1.nodeName();
        org.jsoup.select.Elements elements4 = document1.children();
        org.jsoup.select.Elements elements6 = document1.getElementsByTag("#document#documenthi!");
        org.jsoup.select.Elements elements8 = elements6.removeClass("#document#documentdocument");
        org.jsoup.select.Elements elements10 = elements6.html("#text");
        org.jsoup.nodes.Document document12 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements14 = document12.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element16 = document12.prepend("#document");
        org.jsoup.nodes.Element element17 = element16.empty();
        org.jsoup.select.Elements elements19 = element16.getElementsByTag("org.jsoup.select.Selector$SelectorParseException: ");
        org.jsoup.select.Elements elements21 = elements19.removeClass("#root");
        org.jsoup.select.Elements elements23 = elements19.append("");
        boolean boolean25 = elements19.hasAttr("#document#document");
        org.jsoup.nodes.Document document27 = new org.jsoup.nodes.Document("");
        boolean boolean28 = document27.hasText();
        java.lang.String str29 = document27.nodeName();
        java.lang.String[] strArray31 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet32 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet32, strArray31);
        org.jsoup.nodes.Element element34 = document27.classNames((java.util.Set<java.lang.String>) strSet32);
        org.jsoup.nodes.Element element36 = document27.append("#document");
        org.jsoup.nodes.Element element38 = element36.html("");
        org.jsoup.select.Elements elements41 = element36.getElementsByAttributeValueNot("#root", "org.jsoup.select.Selector$SelectorParseException: ");
        org.jsoup.select.Elements elements43 = element36.getElementsByClass("<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        int int44 = elements19.lastIndexOf((java.lang.Object) elements43);
        boolean boolean45 = elements6.removeAll((java.util.Collection<org.jsoup.nodes.Element>) elements43);
        org.jsoup.select.Elements elements47 = elements6.val("<html> \n <head> \n </head> \n <body>\n   #root  \n </body>\n</html><<?#document#document>>\n</<?#document#document>>");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertNotNull(elements21);
        org.junit.Assert.assertNotNull(elements23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "#document" + "'", str29, "#document");
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(element34);
        org.junit.Assert.assertNotNull(element36);
        org.junit.Assert.assertNotNull(element38);
        org.junit.Assert.assertNotNull(elements41);
        org.junit.Assert.assertNotNull(elements43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(elements47);
    }

    @Test
    public void test0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0972");
        org.jsoup.nodes.DataNode dataNode2 = new org.jsoup.nodes.DataNode("", "<?>");
    }

    @Test
    public void test0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0973");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("org.jsoup.select.Selector$SelectorParseException: ");
        boolean boolean2 = tag1.isData();
        org.jsoup.nodes.Attributes attributes4 = new org.jsoup.nodes.Attributes();
        int int5 = attributes4.size();
        java.lang.String str6 = attributes4.html();
        org.jsoup.nodes.Element element7 = new org.jsoup.nodes.Element(tag1, "org.jsoup.select.selector$selectorparseexception:", attributes4);
        boolean boolean8 = tag1.requiresSpecificParent();
        boolean boolean9 = tag1.isEmpty();
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0974");
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
        org.jsoup.nodes.Document document33 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements35 = document33.getElementsByAttribute("hi!");
        java.lang.String str37 = elements35.attr("#root");
        org.jsoup.nodes.Document document39 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element[] elementArray40 = new org.jsoup.nodes.Element[] { document39 };
        java.util.ArrayList<org.jsoup.nodes.Element> elementList41 = new java.util.ArrayList<org.jsoup.nodes.Element>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<org.jsoup.nodes.Element>) elementList41, elementArray40);
        java.util.Spliterator<org.jsoup.nodes.Element> elementSpliterator43 = elementList41.spliterator();
        java.util.Spliterator<org.jsoup.nodes.Element> elementSpliterator44 = elementList41.spliterator();
        boolean boolean45 = elements35.containsAll((java.util.Collection<org.jsoup.nodes.Element>) elementList41);
        org.jsoup.select.Elements elements46 = new org.jsoup.select.Elements((java.util.List<org.jsoup.nodes.Element>) elementList41);
        org.jsoup.select.Elements elements47 = new org.jsoup.select.Elements((java.util.Collection<org.jsoup.nodes.Element>) elements46);
        org.jsoup.nodes.Document document49 = org.jsoup.Jsoup.parse("hi!");
        int int50 = elements46.indexOf((java.lang.Object) document49);
        org.jsoup.select.Elements elements53 = document49.getElementsByAttributeValueContaining("<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "org.jsoup.select.selector$selectorparseexception:");
        java.lang.String str54 = document49.nodeName();
        org.jsoup.nodes.Attributes attributes55 = document49.attributes();
        org.jsoup.nodes.Element element56 = new org.jsoup.nodes.Element(tag1, "#document#document", attributes55);
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
        org.junit.Assert.assertNotNull(elements35);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNotNull(elementArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(elementSpliterator43);
        org.junit.Assert.assertNotNull(elementSpliterator44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(document49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertNotNull(elements53);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "#document" + "'", str54, "#document");
        org.junit.Assert.assertNotNull(attributes55);
    }

    @Test
    public void test0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0975");
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
        org.jsoup.parser.Tag tag32 = org.jsoup.parser.Tag.valueOf("#root");
        boolean boolean33 = tag32.isInline();
        boolean boolean34 = tag1.isValidAncestor(tag32);
        org.jsoup.parser.Tag tag36 = org.jsoup.parser.Tag.valueOf("org.jsoup.select.Selector$SelectorParseException: ");
        boolean boolean37 = tag36.isData();
        boolean boolean38 = tag36.requiresSpecificParent();
        boolean boolean39 = tag36.isBlock();
        org.jsoup.parser.Tag tag41 = org.jsoup.parser.Tag.valueOf("org.jsoup.select.Selector$SelectorParseException: ");
        boolean boolean42 = tag41.isData();
        boolean boolean43 = tag41.requiresSpecificParent();
        boolean boolean44 = tag41.isBlock();
        boolean boolean45 = tag36.canContain(tag41);
        boolean boolean46 = tag36.isBlock();
        boolean boolean47 = tag36.isData();
        boolean boolean48 = tag36.isBlock();
        java.lang.String str49 = tag36.getName();
        org.jsoup.nodes.Attributes attributes50 = new org.jsoup.nodes.Attributes();
        int int51 = attributes50.size();
        org.jsoup.nodes.Document document53 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements55 = document53.getElementsByAttribute("hi!");
        java.lang.String str56 = elements55.val();
        java.lang.Object obj57 = null;
        int int58 = elements55.lastIndexOf(obj57);
        org.jsoup.select.Elements elements60 = elements55.eq((int) '#');
        boolean boolean61 = attributes50.equals((java.lang.Object) elements60);
        boolean boolean63 = elements60.hasClass("<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        org.jsoup.nodes.Element element64 = elements60.last();
        boolean boolean65 = tag36.equals((java.lang.Object) elements60);
        boolean boolean66 = tag36.preserveWhitespace();
        org.jsoup.nodes.Document document68 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements70 = document68.getElementsByAttribute("hi!");
        java.lang.String str71 = elements70.outerHtml();
        java.lang.String str72 = elements70.val();
        org.jsoup.select.Elements elements73 = new org.jsoup.select.Elements((java.util.List<org.jsoup.nodes.Element>) elements70);
        java.lang.String str75 = elements70.attr("org.jsoup.select.Selector$SelectorParseException: ");
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor76 = elements70.listIterator();
        boolean boolean77 = tag36.equals((java.lang.Object) elements70);
        boolean boolean78 = tag1.isValidParent(tag36);
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
        org.junit.Assert.assertNotNull(tag32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(tag36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(tag41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "org.jsoup.select.selector$selectorparseexception:" + "'", str49, "org.jsoup.select.selector$selectorparseexception:");
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(elements55);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
        org.junit.Assert.assertNotNull(elements60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNull(element64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(elements70);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "" + "'", str72, "");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "" + "'", str75, "");
        org.junit.Assert.assertNotNull(elementItor76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
    }

    @Test
    public void test0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0976");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        int int1 = attributes0.size();
        boolean boolean3 = attributes0.hasKey("");
        java.lang.String str4 = attributes0.toString();
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
        org.jsoup.nodes.Attributes attributes20 = new org.jsoup.nodes.Attributes();
        int int21 = attributes20.size();
        java.lang.String str22 = attributes20.html();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor23 = attributes20.iterator();
        boolean boolean24 = attributes18.equals((java.lang.Object) attributes20);
        org.jsoup.nodes.Attribute attribute27 = org.jsoup.nodes.Attribute.createFromEncoded("hi!", "hi!");
        attribute27.setKey("#root");
        java.lang.String str30 = attribute27.html();
        attribute27.setKey("#data");
        org.jsoup.nodes.Document document34 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements36 = document34.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements38 = elements36.prepend("");
        org.jsoup.select.Elements elements40 = elements38.removeAttr("");
        org.jsoup.nodes.Document document42 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements44 = document42.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements46 = elements44.prepend("");
        org.jsoup.select.Elements elements48 = elements46.removeAttr("");
        boolean boolean49 = elements38.containsAll((java.util.Collection<org.jsoup.nodes.Element>) elements46);
        java.lang.Object[] objArray50 = elements38.toArray();
        org.jsoup.nodes.Document document52 = new org.jsoup.nodes.Document("");
        boolean boolean53 = document52.hasText();
        java.lang.String str54 = document52.nodeName();
        java.lang.String str55 = document52.val();
        boolean boolean56 = elements38.add((org.jsoup.nodes.Element) document52);
        boolean boolean57 = attribute27.equals((java.lang.Object) boolean56);
        boolean boolean58 = attributes18.equals((java.lang.Object) boolean57);
        attributes0.addAll(attributes18);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str61 = attributes0.get("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#document" + "'", str8, "#document");
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(attributes18);
        org.junit.Assert.assertNotNull(attributeSpliterator19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(attributeItor23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(attribute27);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "#root=\"hi!\"" + "'", str30, "#root=\"hi!\"");
        org.junit.Assert.assertNotNull(elements36);
        org.junit.Assert.assertNotNull(elements38);
        org.junit.Assert.assertNotNull(elements40);
        org.junit.Assert.assertNotNull(elements44);
        org.junit.Assert.assertNotNull(elements46);
        org.junit.Assert.assertNotNull(elements48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray50), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray50), "[]");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "#document" + "'", str54, "#document");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
    }

    @Test
    public void test0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0977");
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
        org.jsoup.nodes.Document document37 = new org.jsoup.nodes.Document("");
        boolean boolean38 = document37.hasText();
        java.lang.String str39 = document37.nodeName();
        java.lang.String[] strArray41 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet42 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet42, strArray41);
        org.jsoup.nodes.Element element44 = document37.classNames((java.util.Set<java.lang.String>) strSet42);
        org.jsoup.nodes.Element element46 = element44.addClass("#document");
        org.jsoup.select.Elements elements49 = element46.getElementsByAttributeValueNot("#root", "org.jsoup.select.Selector$SelectorParseException: ");
        java.lang.String str50 = elements49.html();
        org.jsoup.nodes.Attributes attributes52 = new org.jsoup.nodes.Attributes();
        int int53 = attributes52.size();
        org.jsoup.nodes.Document document55 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements57 = document55.getElementsByAttribute("hi!");
        java.lang.String str58 = elements57.val();
        java.lang.Object obj59 = null;
        int int60 = elements57.lastIndexOf(obj59);
        org.jsoup.select.Elements elements62 = elements57.eq((int) '#');
        boolean boolean63 = attributes52.equals((java.lang.Object) elements62);
        boolean boolean65 = elements62.hasClass("<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        boolean boolean66 = elements49.addAll(1, (java.util.Collection<org.jsoup.nodes.Element>) elements62);
        boolean boolean67 = elements35.removeAll((java.util.Collection<org.jsoup.nodes.Element>) elements49);
        org.jsoup.nodes.Document document69 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element[] elementArray70 = new org.jsoup.nodes.Element[] { document69 };
        java.util.ArrayList<org.jsoup.nodes.Element> elementList71 = new java.util.ArrayList<org.jsoup.nodes.Element>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<org.jsoup.nodes.Element>) elementList71, elementArray70);
        java.util.Spliterator<org.jsoup.nodes.Element> elementSpliterator73 = elementList71.spliterator();
        java.util.Spliterator<org.jsoup.nodes.Element> elementSpliterator74 = elementList71.spliterator();
        boolean boolean75 = elements49.contains((java.lang.Object) elementList71);
        boolean boolean76 = attributes13.equals((java.lang.Object) elementList71);
        java.lang.String str77 = attributes13.html();
        java.lang.String str78 = attributes13.html();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator79 = attributes13.spliterator();
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
        org.junit.Assert.assertNotNull(elements20);
        org.junit.Assert.assertNotNull(elements22);
        org.junit.Assert.assertNotNull(elements24);
        org.junit.Assert.assertNotNull(elements28);
        org.junit.Assert.assertNotNull(elements30);
        org.junit.Assert.assertNotNull(elements32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(elements35);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "#document" + "'", str39, "#document");
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(element44);
        org.junit.Assert.assertNotNull(element46);
        org.junit.Assert.assertNotNull(elements49);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertNotNull(elements57);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-1) + "'", int60 == (-1));
        org.junit.Assert.assertNotNull(elements62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(elementArray70);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertNotNull(elementSpliterator73);
        org.junit.Assert.assertNotNull(elementSpliterator74);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + " class=\"hi!\"" + "'", str77, " class=\"hi!\"");
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + " class=\"hi!\"" + "'", str78, " class=\"hi!\"");
        org.junit.Assert.assertNotNull(attributeSpliterator79);
    }

    @Test
    public void test0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0978");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements5 = elements3.prepend("");
        elements5.clear();
        int int8 = elements5.indexOf((java.lang.Object) "org.jsoup.select.Selector$SelectorParseException: ");
        org.jsoup.nodes.Document document10 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements12 = document10.getElementsByIndexGreaterThan((int) ' ');
        boolean boolean13 = elements5.removeAll((java.util.Collection<org.jsoup.nodes.Element>) elements12);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element15 = elements12.get((int) 'd');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0979");
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
        java.util.stream.Stream<org.jsoup.nodes.Element> elementStream17 = elements16.stream();
        org.jsoup.select.Elements elements19 = elements16.html(" #root=\"hi!\"");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(element14);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertNotNull(elementStream17);
        org.junit.Assert.assertNotNull(elements19);
    }

    @Test
    public void test0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0980");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element5 = document1.prepend("#document");
        org.jsoup.nodes.Element element6 = element5.empty();
        org.jsoup.select.Elements elements8 = element5.getElementsByTag("org.jsoup.select.Selector$SelectorParseException: ");
        org.jsoup.select.Elements elements10 = elements8.html("#document");
        java.lang.String str11 = elements8.text();
        org.jsoup.select.Elements elements13 = elements8.append(" class=\"hi!\"");
        org.jsoup.nodes.Document document15 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements17 = document15.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element19 = document15.prepend("#document");
        org.jsoup.select.Elements elements21 = element19.getElementsByAttribute("hi!");
        java.lang.String str22 = elements21.val();
        org.jsoup.select.Elements elements24 = elements21.toggleClass("#document#document");
        org.jsoup.select.Elements elements26 = elements21.eq((int) (byte) 10);
        int int27 = elements13.lastIndexOf((java.lang.Object) elements26);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(elements21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(elements24);
        org.junit.Assert.assertNotNull(elements26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
    }

    @Test
    public void test0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0981");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("#root", "");
        java.lang.String str3 = document2.outerHtml();
        org.jsoup.nodes.Element element5 = document2.append("<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        org.jsoup.select.Elements elements7 = document2.getElementsByIndexEquals(1);
        org.jsoup.select.Elements elements9 = elements7.prepend("head");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>" + "'", str3, "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(elements9);
    }

    @Test
    public void test0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0982");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!", "hi!");
        attribute2.setValue("#root=\"hi!\"");
        java.lang.String str5 = attribute2.html();
        org.jsoup.nodes.Document document8 = org.jsoup.parser.Parser.parseBodyFragmentRelaxed("#comment", "");
        boolean boolean9 = attribute2.equals((java.lang.Object) document8);
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!=\"#root=&quot;hi!&quot;\"" + "'", str5, "hi!=\"#root=&quot;hi!&quot;\"");
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0983");
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parse("", "");
        java.lang.String str3 = document2.nodeName();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
    }

    @Test
    public void test0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0984");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("\n<!--#root-->", "#root");
        org.jsoup.nodes.Element element4 = document2.removeClass("#root=\"hi!\"");
        org.jsoup.nodes.Element element7 = document2.attr("<html>\n<head>\n</head>\n<body> \n <!--#root-->\n</body>\n</html>", "[#, d, o, c, u, m, e, n, t]");
        org.jsoup.select.Elements elements9 = element7.getElementsByTag("org.jsoup.select.Selector$SelectorParseException:");
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor10 = elements9.listIterator();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(elementItor10);
    }

    @Test
    public void test0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0985");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements5 = elements3.prepend("");
        org.jsoup.select.Elements elements7 = elements5.removeAttr("");
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements11 = document9.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements13 = elements11.prepend("");
        org.jsoup.select.Elements elements15 = elements13.removeAttr("");
        boolean boolean16 = elements5.containsAll((java.util.Collection<org.jsoup.nodes.Element>) elements13);
        java.util.Iterator<org.jsoup.nodes.Element> elementItor17 = elements5.iterator();
        boolean boolean18 = elements5.hasText();
        java.util.function.UnaryOperator<org.jsoup.nodes.Element> elementUnaryOperator19 = null;
        // The following exception was thrown during execution in test generation
        try {
            elements5.replaceAll(elementUnaryOperator19);
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
        org.junit.Assert.assertNotNull(elementItor17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0986");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element5 = document1.prepend("#document");
        org.jsoup.nodes.Element element6 = element5.empty();
        org.jsoup.select.Elements elements8 = element6.getElementsByIndexLessThan(10);
        org.jsoup.select.Elements elements10 = elements8.append("hi!=\"#root\"");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(elements10);
    }

    @Test
    public void test0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0987");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("org.jsoup.select.Selector$SelectorParseException: ");
        java.lang.String str2 = tag1.getName();
        boolean boolean3 = tag1.isInline();
        boolean boolean4 = tag1.isEmpty();
        boolean boolean5 = tag1.isEmpty();
        boolean boolean6 = tag1.isBlock();
        java.lang.String str7 = tag1.toString();
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.jsoup.select.selector$selectorparseexception:" + "'", str2, "org.jsoup.select.selector$selectorparseexception:");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "org.jsoup.select.selector$selectorparseexception:" + "'", str7, "org.jsoup.select.selector$selectorparseexception:");
    }

    @Test
    public void test0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0988");
        org.jsoup.parser.Tag tag0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element2 = new org.jsoup.nodes.Element(tag0, "org.jsoup.select.Selector$SelectorParseException: ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0989");
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
        org.jsoup.nodes.TextNode textNode22 = new org.jsoup.nodes.TextNode("#document#documenthi!", "#comment");
        java.lang.String str23 = textNode22.text();
        boolean boolean24 = textNode22.isBlank();
        // The following exception was thrown during execution in test generation
        try {
            document15.replaceWith((org.jsoup.nodes.Node) textNode22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
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
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "#document#documenthi!" + "'", str23, "#document#documenthi!");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0990");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element5 = document1.prepend("#document");
        org.jsoup.nodes.Element element7 = document1.createElement("#data");
        java.lang.String str8 = document1.outerHtml();
        java.lang.String str9 = document1.nodeName();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#document" + "'", str8, "#document");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#document" + "'", str9, "#document");
    }

    @Test
    public void test0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0991");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("#root");
        org.jsoup.nodes.Element element3 = document1.html("org.jsoup.select.Selector$SelectorParseException: ");
        java.lang.String str4 = element3.toString();
        org.jsoup.select.Elements elements6 = element3.getElementsByAttribute("a");
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "org.jsoup.select.Selector$SelectorParseException:" + "'", str4, "org.jsoup.select.Selector$SelectorParseException:");
        org.junit.Assert.assertNotNull(elements6);
    }

    @Test
    public void test0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0992");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("#document");
        boolean boolean3 = tokenQueue1.matches("\n<!--#root-->");
        boolean boolean5 = tokenQueue1.matchChomp("#data");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!=\"#root=&quot;hi!&quot;\"" };
        java.lang.String str8 = tokenQueue1.consumeToAny(strArray7);
        java.lang.String str9 = tokenQueue1.remainder();
        java.lang.String str10 = tokenQueue1.consumeAttributeKey();
        tokenQueue1.addFirst((java.lang.Character) '4');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#document" + "'", str8, "#document");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0993");
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
        org.jsoup.select.Elements elements34 = new org.jsoup.select.Elements((java.util.Collection<org.jsoup.nodes.Element>) elements8);
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
    }

    @Test
    public void test0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0994");
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
    }

    @Test
    public void test0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0995");
        org.jsoup.safety.Whitelist whitelist1 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.jsoup.Jsoup.isValid("[#, d, o, c, u, m, e, n, t, #, d, o, c, u, m, e, n, t, d, o, c, u, m, e, n, t]", whitelist1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0996");
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
        org.jsoup.nodes.Element element26 = document19.prependText("#comment");
        java.lang.String str27 = element26.text();
        org.jsoup.nodes.Node node29 = element26.removeAttr("org.jsoup.select.Selector$SelectorParseException:");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element31 = element26.child((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "#comment" + "'", str27, "#comment");
        org.junit.Assert.assertNotNull(node29);
    }

    @Test
    public void test0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0997");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("\n<!--#root-->");
        org.jsoup.nodes.Element element3 = document1.text("org.jsoup.select.Selector$SelectorParseException:");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
    }

    @Test
    public void test0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0998");
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parse("", "");
        java.lang.String str3 = document2.nodeName();
        java.lang.String str4 = document2.text();
        org.jsoup.nodes.Element element5 = document2.head();
        java.lang.String str6 = document2.nodeName();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#document" + "'", str6, "#document");
    }

    @Test
    public void test0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0999");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        int int1 = attributes0.size();
        java.lang.String str2 = attributes0.html();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor3 = attributes0.iterator();
        attributes0.put("#comment", "");
        attributes0.remove(" class=\"hi!\"");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(attributeItor3);
    }

    @Test
    public void test1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test1000");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "[#, d, o, c, u, m, e, n, t, #, d, o, c, u, m, e, n, t, =, \", #, d, o, c, u, m, e, n, t, #, d, o, c, u, m, e, n, t, \"]", true);
        java.lang.String str4 = xmlDeclaration3.baseUri();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[#, d, o, c, u, m, e, n, t, #, d, o, c, u, m, e, n, t, =, \", #, d, o, c, u, m, e, n, t, #, d, o, c, u, m, e, n, t, \"]" + "'", str4, "[#, d, o, c, u, m, e, n, t, #, d, o, c, u, m, e, n, t, =, \", #, d, o, c, u, m, e, n, t, #, d, o, c, u, m, e, n, t, \"]");
    }
}

