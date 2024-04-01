package org.jsoup.parser;

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
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("#document");
        java.lang.String str2 = tokenQueue1.consumeAttributeKey();
        java.lang.String str4 = tokenQueue1.consumeTo("#root=\"hi!\"");
        java.lang.String str5 = tokenQueue1.toString();
        java.lang.String str7 = tokenQueue1.chompTo("");
        boolean boolean8 = tokenQueue1.matchesWord();
        boolean boolean10 = tokenQueue1.matchChomp("<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        boolean boolean11 = tokenQueue1.matchesWord();
        java.lang.String str12 = tokenQueue1.remainder();
        tokenQueue1.addFirst((java.lang.Character) '4');
        java.lang.String str15 = tokenQueue1.consumeCssIdentifier();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#document" + "'", str4, "#document");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "4" + "'", str15, "4");
    }

    @Test
    public void test2502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2502");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("#document#document", "\n<!--#document-->", false);
        java.lang.String str4 = xmlDeclaration3.toString();
        java.lang.String str5 = xmlDeclaration3.nodeName();
        java.lang.String str6 = xmlDeclaration3.nodeName();
        java.lang.String str7 = xmlDeclaration3.getWholeDeclaration();
        java.lang.String str8 = xmlDeclaration3.nodeName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<?#document#document>" + "'", str4, "<?#document#document>");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#declaration" + "'", str5, "#declaration");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#declaration" + "'", str6, "#declaration");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#document#document" + "'", str7, "#document#document");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#declaration" + "'", str8, "#declaration");
    }

    @Test
    public void test2503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2503");
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
        org.jsoup.select.Elements elements25 = new org.jsoup.select.Elements((java.util.List<org.jsoup.nodes.Element>) elements24);
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
    }

    @Test
    public void test2504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2504");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("");
        tokenQueue1.addFirst((java.lang.Character) ' ');
        tokenQueue1.addFirst((java.lang.Character) '#');
        java.lang.String str7 = tokenQueue1.consumeTo("\n<!--#data-->");
        tokenQueue1.addFirst("<!#declaration>");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "# " + "'", str7, "# ");
    }

    @Test
    public void test2505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2505");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded(" hi!", " \n<!--#root-->");
        org.jsoup.nodes.Document document5 = org.jsoup.parser.Parser.parseBodyFragment("#document", "");
        org.jsoup.nodes.Element element7 = document5.addClass("hi!");
        java.lang.String str8 = document5.title();
        boolean boolean9 = attribute2.equals((java.lang.Object) str8);
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertNotNull(document5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2506");
        org.jsoup.nodes.Document document2 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document2.getElementsByAttribute("hi!");
        java.lang.String str6 = elements4.attr("#root");
        org.jsoup.nodes.Document document8 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element[] elementArray9 = new org.jsoup.nodes.Element[] { document8 };
        java.util.ArrayList<org.jsoup.nodes.Element> elementList10 = new java.util.ArrayList<org.jsoup.nodes.Element>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<org.jsoup.nodes.Element>) elementList10, elementArray9);
        java.util.Spliterator<org.jsoup.nodes.Element> elementSpliterator12 = elementList10.spliterator();
        java.util.Spliterator<org.jsoup.nodes.Element> elementSpliterator13 = elementList10.spliterator();
        boolean boolean14 = elements4.containsAll((java.util.Collection<org.jsoup.nodes.Element>) elementList10);
        org.jsoup.select.Elements elements15 = new org.jsoup.select.Elements((java.util.List<org.jsoup.nodes.Element>) elementList10);
        org.jsoup.select.Elements elements16 = new org.jsoup.select.Elements((java.util.Collection<org.jsoup.nodes.Element>) elements15);
        java.lang.String str17 = elements16.html();
        org.jsoup.nodes.Document document19 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements21 = document19.getElementsByAttribute("hi!");
        java.lang.String str23 = elements21.attr("#root");
        org.jsoup.select.Elements elements24 = elements21.parents();
        boolean boolean25 = elements16.containsAll((java.util.Collection<org.jsoup.nodes.Element>) elements21);
        org.jsoup.select.Elements elements27 = elements16.eq(0);
        org.jsoup.select.Elements elements29 = elements27.removeClass("hi!");
        org.jsoup.select.Elements elements31 = elements29.val("#root=&quot;hi!&quot;");
        org.jsoup.select.Elements elements32 = org.jsoup.select.Selector.select("o", (java.lang.Iterable<org.jsoup.nodes.Element>) elements29);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(elementArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(elementSpliterator12);
        org.junit.Assert.assertNotNull(elementSpliterator13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(elements21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(elements24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(elements27);
        org.junit.Assert.assertNotNull(elements29);
        org.junit.Assert.assertNotNull(elements31);
        org.junit.Assert.assertNotNull(elements32);
    }

    @Test
    public void test2507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2507");
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parseBodyFragment("<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>", "");
        org.jsoup.select.Elements elements4 = document2.getElementsByIndexGreaterThan(2);
        org.jsoup.select.Elements elements7 = elements4.attr(" hi!=\"#root\"", "<#document#document=\"#document#document\">\n</#document#document=\"#document#document\">");
        org.jsoup.nodes.Document document10 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements12 = document10.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements14 = elements12.prepend("");
        org.jsoup.select.Elements elements16 = elements14.removeAttr("");
        org.jsoup.nodes.Document document18 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements20 = document18.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements22 = elements20.prepend("");
        org.jsoup.select.Elements elements24 = elements22.removeAttr("");
        boolean boolean25 = elements14.containsAll((java.util.Collection<org.jsoup.nodes.Element>) elements22);
        org.jsoup.select.Elements elements27 = elements22.wrap("#root");
        org.jsoup.select.Elements elements28 = new org.jsoup.select.Elements((java.util.Collection<org.jsoup.nodes.Element>) elements27);
        org.jsoup.nodes.Document document31 = org.jsoup.parser.Parser.parse("#root", "");
        java.lang.String str32 = document31.outerHtml();
        org.jsoup.nodes.Element element34 = document31.append("<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        org.jsoup.select.Elements elements37 = document31.getElementsByAttributeValueStarting("#root=\"hi!\"", "org.jsoup.select.Selector$SelectorParseException: ");
        org.jsoup.nodes.Element element39 = document31.prepend("#root=\"hi!\"");
        int int40 = elements28.lastIndexOf((java.lang.Object) "#root=\"hi!\"");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean41 = elements4.addAll(100, (java.util.Collection<org.jsoup.nodes.Element>) elements28);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertNotNull(elements20);
        org.junit.Assert.assertNotNull(elements22);
        org.junit.Assert.assertNotNull(elements24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(elements27);
        org.junit.Assert.assertNotNull(document31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>" + "'", str32, "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        org.junit.Assert.assertNotNull(element34);
        org.junit.Assert.assertNotNull(elements37);
        org.junit.Assert.assertNotNull(element39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
    }

    @Test
    public void test2508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2508");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("#root", "");
        org.jsoup.nodes.Element element5 = document2.attr("#root", "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        java.lang.String str6 = document2.tagName();
        org.jsoup.nodes.Element element7 = document2.empty();
        java.lang.String str9 = document2.absUrl("#data");
        org.jsoup.nodes.Element element11 = document2.wrap("\n<!--#data-->");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements12 = element11.parents();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#root" + "'", str6, "#root");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(element11);
    }

    @Test
    public void test2509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2509");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Element> elementList16 = elements10.subList((int) (short) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(10) > toIndex(0)");
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
    }

    @Test
    public void test2510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2510");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("#document", "");
        org.jsoup.nodes.Element element4 = document2.addClass("hi!");
        org.jsoup.nodes.Element element5 = document2.body();
        org.jsoup.nodes.Element element7 = document2.createElement("<org.jsoup.select.selector$selectorparseexception: hi!=\"#root\">\n</org.jsoup.select.selector$selectorparseexception:>");
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements11 = document9.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements13 = elements11.prepend("");
        org.jsoup.nodes.Document document15 = new org.jsoup.nodes.Document("");
        boolean boolean16 = document15.hasText();
        boolean boolean17 = document15.hasText();
        org.jsoup.nodes.Document document19 = new org.jsoup.nodes.Document("");
        boolean boolean20 = document19.hasText();
        java.lang.String str21 = document19.nodeName();
        java.lang.String[] strArray23 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet24 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet24, strArray23);
        org.jsoup.nodes.Element element26 = document19.classNames((java.util.Set<java.lang.String>) strSet24);
        org.jsoup.nodes.Element element27 = document15.classNames((java.util.Set<java.lang.String>) strSet24);
        int int28 = elements11.indexOf((java.lang.Object) element27);
        org.jsoup.nodes.Document document30 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements32 = document30.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements34 = elements32.prepend("");
        org.jsoup.select.Elements elements36 = elements34.removeAttr("");
        org.jsoup.nodes.Document document38 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements40 = document38.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements42 = elements40.prepend("");
        org.jsoup.select.Elements elements44 = elements42.removeAttr("");
        boolean boolean45 = elements34.containsAll((java.util.Collection<org.jsoup.nodes.Element>) elements42);
        org.jsoup.nodes.Document document47 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements49 = document47.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements51 = elements49.prepend("");
        org.jsoup.select.Elements elements53 = elements51.removeAttr("");
        org.jsoup.nodes.Document document55 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements57 = document55.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements59 = elements57.prepend("");
        org.jsoup.select.Elements elements61 = elements59.removeAttr("");
        boolean boolean62 = elements51.containsAll((java.util.Collection<org.jsoup.nodes.Element>) elements59);
        org.jsoup.select.Elements elements64 = elements59.wrap("#root");
        boolean boolean65 = elements42.containsAll((java.util.Collection<org.jsoup.nodes.Element>) elements64);
        org.jsoup.select.Elements elements66 = new org.jsoup.select.Elements((java.util.Collection<org.jsoup.nodes.Element>) elements42);
        boolean boolean67 = elements11.containsAll((java.util.Collection<org.jsoup.nodes.Element>) elements42);
        org.jsoup.select.Elements elements69 = elements11.removeClass("");
        boolean boolean70 = element7.equals((java.lang.Object) elements69);
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "#document" + "'", str21, "#document");
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(elements32);
        org.junit.Assert.assertNotNull(elements34);
        org.junit.Assert.assertNotNull(elements36);
        org.junit.Assert.assertNotNull(elements40);
        org.junit.Assert.assertNotNull(elements42);
        org.junit.Assert.assertNotNull(elements44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(elements49);
        org.junit.Assert.assertNotNull(elements51);
        org.junit.Assert.assertNotNull(elements53);
        org.junit.Assert.assertNotNull(elements57);
        org.junit.Assert.assertNotNull(elements59);
        org.junit.Assert.assertNotNull(elements61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(elements64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(elements69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
    }

    @Test
    public void test2511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2511");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("body", "org.jsoup.select.Selector$SelectorParseException:");
        org.jsoup.nodes.Document document4 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements6 = document4.getElementsByAttribute("hi!");
        java.lang.String str7 = elements6.val();
        java.lang.Object obj8 = null;
        int int9 = elements6.lastIndexOf(obj8);
        org.jsoup.select.Elements elements11 = elements6.eq((int) '#');
        boolean boolean13 = elements6.hasAttr("#root");
        int int15 = elements6.indexOf((java.lang.Object) (byte) 100);
        java.lang.String str17 = elements6.attr("org.jsoup.select.Selector$SelectorParseException: ");
        boolean boolean18 = attribute2.equals((java.lang.Object) elements6);
        org.jsoup.select.Elements elements20 = elements6.toggleClass("#root=\"hi!\"");
        org.jsoup.select.Elements elements22 = elements20.wrap("<?#document#document>");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(elements20);
        org.junit.Assert.assertNotNull(elements22);
    }

    @Test
    public void test2512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2512");
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parseBodyFragment("\n<!--#root-->", "#document#documentdocument=\"&lt;?hi!&gt;\"");
        org.jsoup.select.Elements elements4 = document2.getElementsByIndexEquals(3);
        java.lang.String str6 = elements4.attr("[<, ?, >, #, d, o, c, u, m, e, n, t, #, d, o, c, u, m, e, n, t, d, o, c, u, m, e, n, t]");
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        boolean boolean10 = document9.hasText();
        java.lang.String str11 = document9.nodeName();
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet14 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet14, strArray13);
        org.jsoup.nodes.Element element16 = document9.classNames((java.util.Set<java.lang.String>) strSet14);
        org.jsoup.nodes.Element element18 = document9.append("#document");
        org.jsoup.nodes.Element element20 = document9.prepend("#document");
        org.jsoup.nodes.Attributes attributes21 = element20.attributes();
        org.jsoup.nodes.Element element23 = element20.append("hi!");
        boolean boolean25 = element20.hasClass("");
        org.jsoup.nodes.Element element27 = element20.val("[]");
        org.jsoup.select.Elements elements30 = element27.getElementsByAttributeValueStarting("\n<!--#document--> #data", "<html> \n<head> \n</head> \n<body>\n  #root  \n</body>\n</html>");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean31 = elements4.addAll((int) '#', (java.util.Collection<org.jsoup.nodes.Element>) elements30);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 35, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#document" + "'", str11, "#document");
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(attributes21);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertNotNull(elements30);
    }

    @Test
    public void test2513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2513");
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
        java.lang.String str34 = elements32.attr("<html>\n<head>\n</head>\n<body>\n #document#document \n</body>\n</html>");
        org.jsoup.nodes.Attribute attribute37 = org.jsoup.nodes.Attribute.createFromEncoded("<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "");
        boolean boolean38 = elements32.equals((java.lang.Object) attribute37);
        java.lang.String str39 = attribute37.getValue();
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
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(attribute37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
    }

    @Test
    public void test2514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2514");
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
        org.jsoup.select.Elements elements23 = element20.getElementsByAttributeValueContaining("#document#document", "\n<!--#declaration-->");
        org.jsoup.select.Elements elements25 = elements23.prepend("<html>\n<head>\n</head>\n<body>\n <html> \n  <head> \n  </head> \n  <body>\n    #root  #document#documentdocument\n  </body>\n </html>\n</body>\n</html>");
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
        org.junit.Assert.assertNotNull(elements23);
        org.junit.Assert.assertNotNull(elements25);
    }

    @Test
    public void test2515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2515");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("#root", "");
        java.lang.String str3 = document2.outerHtml();
        org.jsoup.nodes.Element element5 = document2.append("<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        org.jsoup.select.Elements elements7 = document2.getElementsByIndexEquals(1);
        java.lang.String str8 = document2.title();
        org.jsoup.nodes.Element element10 = document2.prepend(" class=\"hi!\"");
        org.jsoup.nodes.Element element12 = element10.appendElement("<html> \n <head> \n </head> \n <body>\n   #root  \n </body>\n</html><<?#document#document>>\n</<?#document#document>>");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>" + "'", str3, "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
    }

    @Test
    public void test2516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2516");
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
        java.util.Iterator<org.jsoup.nodes.Element> elementItor36 = elements28.iterator();
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
        org.junit.Assert.assertNotNull(elementItor36);
    }

    @Test
    public void test2517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2517");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parse("hi!");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValue("hi!", "hi!");
        document1.title("[]");
        org.jsoup.nodes.Element element8 = document1.prependText("#document#document");
        org.jsoup.nodes.Node node11 = element8.attr("body=\"# \"", "");
        boolean boolean12 = element8.hasText();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test2518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2518");
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
        attributes0.put(" #comment=\"\"", "\n<body>\n #root \n</body>");
        int int27 = attributes0.size();
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
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2 + "'", int27 == 2);
    }

    @Test
    public void test2519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2519");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element4 = document1.attr("hi!", "#root");
        org.jsoup.nodes.Attributes attributes5 = document1.attributes();
        org.jsoup.select.Elements elements6 = document1.children();
        java.util.Set<java.lang.String> strSet7 = document1.classNames();
        org.jsoup.select.Elements elements9 = document1.getElementsByIndexEquals((int) (byte) 0);
        org.jsoup.nodes.Document document11 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements13 = document11.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element15 = document11.prepend("#document");
        org.jsoup.nodes.Element element16 = element15.empty();
        org.jsoup.select.Elements elements18 = element15.getElementsByTag("org.jsoup.select.Selector$SelectorParseException: ");
        org.jsoup.select.Elements elements20 = elements18.removeClass("#root");
        org.jsoup.nodes.Document document23 = org.jsoup.parser.Parser.parseBodyFragmentRelaxed("", "");
        int int24 = elements18.lastIndexOf((java.lang.Object) "");
        boolean boolean25 = document1.equals((java.lang.Object) "");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertNotNull(elements20);
        org.junit.Assert.assertNotNull(document23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test2520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2520");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("#data");
        org.jsoup.nodes.Element element3 = document1.html("\n<!--#data-->");
        java.util.List<org.jsoup.nodes.Node> nodeList4 = element3.childNodes();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(nodeList4);
    }

    @Test
    public void test2521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2521");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parse("\n<!--#root-->");
        org.jsoup.nodes.Element element3 = document1.appendText("org.jsoup.select.selector$selectorparseexception: org.jsoup.select.selector$selectorparseexception:=\"#root\"");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
    }

    @Test
    public void test2522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2522");
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
        boolean boolean12 = tag6.preserveWhitespace();
        org.jsoup.nodes.Document document15 = new org.jsoup.nodes.Document("");
        boolean boolean16 = document15.hasText();
        boolean boolean17 = document15.hasText();
        org.jsoup.nodes.Document document19 = new org.jsoup.nodes.Document("");
        boolean boolean20 = document19.hasText();
        java.lang.String str21 = document19.nodeName();
        java.lang.String[] strArray23 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet24 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet24, strArray23);
        org.jsoup.nodes.Element element26 = document19.classNames((java.util.Set<java.lang.String>) strSet24);
        org.jsoup.nodes.Element element27 = document15.classNames((java.util.Set<java.lang.String>) strSet24);
        org.jsoup.nodes.Element element29 = document15.appendText("hi!");
        org.jsoup.parser.Tag tag30 = document15.tag();
        boolean boolean31 = tag30.requiresSpecificParent();
        org.jsoup.nodes.Document document34 = new org.jsoup.nodes.Document("");
        boolean boolean35 = document34.hasText();
        java.lang.String str36 = document34.nodeName();
        java.lang.String[] strArray38 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet39 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet39, strArray38);
        org.jsoup.nodes.Element element41 = document34.classNames((java.util.Set<java.lang.String>) strSet39);
        org.jsoup.nodes.Element element43 = document34.append("#document");
        org.jsoup.nodes.Element element45 = document34.prepend("#document");
        org.jsoup.nodes.Attributes attributes46 = element45.attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator47 = attributes46.spliterator();
        org.jsoup.nodes.Attributes attributes48 = new org.jsoup.nodes.Attributes();
        int int49 = attributes48.size();
        java.lang.String str50 = attributes48.html();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor51 = attributes48.iterator();
        boolean boolean52 = attributes46.equals((java.lang.Object) attributes48);
        java.lang.String str53 = attributes46.toString();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator54 = attributes46.spliterator();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor55 = attributes46.iterator();
        org.jsoup.parser.Tag tag57 = org.jsoup.parser.Tag.valueOf("org.jsoup.select.Selector$SelectorParseException: ");
        boolean boolean58 = tag57.isData();
        org.jsoup.nodes.Attributes attributes60 = new org.jsoup.nodes.Attributes();
        int int61 = attributes60.size();
        java.lang.String str62 = attributes60.html();
        org.jsoup.nodes.Element element63 = new org.jsoup.nodes.Element(tag57, "org.jsoup.select.selector$selectorparseexception:", attributes60);
        org.jsoup.nodes.Attribute attribute66 = org.jsoup.nodes.Attribute.createFromEncoded("hi!", "hi!");
        attribute66.setKey("#root");
        java.lang.String str69 = attribute66.html();
        attributes60.put(attribute66);
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor71 = attributes60.iterator();
        attributes46.addAll(attributes60);
        attributes46.remove("document");
        org.jsoup.nodes.Element element75 = new org.jsoup.nodes.Element(tag30, "document", attributes46);
        attributes46.remove("<html>\n<head>\n</head>\n<body>\n ocument \n</body>\n</html>");
        org.jsoup.nodes.Element element78 = new org.jsoup.nodes.Element(tag6, "#root=\"#root=\"hi!\"\"", attributes46);
        org.jsoup.select.Elements elements79 = element78.children();
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "#document" + "'", str21, "#document");
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertNotNull(tag30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "#document" + "'", str36, "#document");
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(element41);
        org.junit.Assert.assertNotNull(element43);
        org.junit.Assert.assertNotNull(element45);
        org.junit.Assert.assertNotNull(attributes46);
        org.junit.Assert.assertNotNull(attributeSpliterator47);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertNotNull(attributeItor51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + " class=\"hi!\"" + "'", str53, " class=\"hi!\"");
        org.junit.Assert.assertNotNull(attributeSpliterator54);
        org.junit.Assert.assertNotNull(attributeItor55);
        org.junit.Assert.assertNotNull(tag57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertNotNull(attribute66);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "#root=\"hi!\"" + "'", str69, "#root=\"hi!\"");
        org.junit.Assert.assertNotNull(attributeItor71);
        org.junit.Assert.assertNotNull(elements79);
    }

    @Test
    public void test2523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2523");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parse(file0, "<!--#root-->\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2524");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.hasText();
        java.lang.String str3 = document1.nodeName();
        org.jsoup.select.Elements elements4 = document1.children();
        org.jsoup.select.Elements elements6 = document1.getElementsByTag("#document#documenthi!");
        org.jsoup.select.Elements elements8 = elements6.removeClass("#document#documentdocument");
        org.jsoup.select.Elements elements10 = elements6.html("#text");
        java.lang.String str11 = elements10.val();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test2525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2525");
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
        java.lang.Object[] objArray24 = elements23.toArray();
        org.jsoup.select.Elements elements26 = elements23.removeAttr("body=\"# \"");
        int int27 = elements23.size();
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
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[]");
        org.junit.Assert.assertNotNull(elements26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test2526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2526");
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
        java.lang.String str33 = element26.className();
        org.jsoup.select.Elements elements35 = element26.getElementsByIndexLessThan(1);
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
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi! #document body" + "'", str33, "hi! #document body");
        org.junit.Assert.assertNotNull(elements35);
    }

    @Test
    public void test2527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2527");
        org.jsoup.nodes.DataNode dataNode2 = new org.jsoup.nodes.DataNode("<?#document#documentdocument>", "<!--#document--><#root hi!=\"#root\">\n</#root>");
    }

    @Test
    public void test2528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2528");
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
        org.jsoup.nodes.Element element36 = document27.append("#document");
        org.jsoup.nodes.Element element38 = document27.prepend("#document");
        org.jsoup.select.Elements elements39 = document27.parents();
        org.jsoup.select.Elements elements40 = document27.children();
        org.jsoup.nodes.Element element42 = document27.createElement("org.jsoup.select.Selector$SelectorParseException:");
        boolean boolean43 = elements25.equals((java.lang.Object) document27);
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
        org.junit.Assert.assertNotNull(element38);
        org.junit.Assert.assertNotNull(elements39);
        org.junit.Assert.assertNotNull(elements40);
        org.junit.Assert.assertNotNull(element42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test2529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2529");
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
        org.jsoup.parser.Tag tag20 = tag1.getImplicitParent();
        boolean boolean21 = tag1.requiresSpecificParent();
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
        org.junit.Assert.assertNotNull(tag20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test2530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2530");
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
        org.jsoup.nodes.Element element28 = element26.toggleClass("#comment");
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
        org.junit.Assert.assertNotNull(element28);
    }

    @Test
    public void test2531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2531");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parse("hi!");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("org.jsoup.select.selector$selectorparseexception:");
        org.jsoup.select.Elements elements5 = elements3.eq((int) (byte) 10);
        org.jsoup.nodes.Attributes attributes6 = new org.jsoup.nodes.Attributes();
        int int7 = attributes6.size();
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements11 = document9.getElementsByAttribute("hi!");
        java.lang.String str12 = elements11.val();
        java.lang.Object obj13 = null;
        int int14 = elements11.lastIndexOf(obj13);
        org.jsoup.select.Elements elements16 = elements11.eq((int) '#');
        boolean boolean17 = attributes6.equals((java.lang.Object) elements16);
        boolean boolean18 = elements16.hasText();
        java.lang.String str19 = elements16.val();
        org.jsoup.select.Elements elements21 = elements16.append("#document#document");
        boolean boolean22 = elements5.containsAll((java.util.Collection<org.jsoup.nodes.Element>) elements21);
        org.jsoup.nodes.Element element23 = elements5.last();
        java.lang.String str24 = elements5.text();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(elements21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNull(element23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test2532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2532");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("#document");
        boolean boolean3 = tokenQueue1.matches("\n<!--#root-->");
        boolean boolean5 = tokenQueue1.matchChomp("#data");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!=\"#root=&quot;hi!&quot;\"" };
        java.lang.String str8 = tokenQueue1.consumeToAny(strArray7);
        java.lang.String str9 = tokenQueue1.remainder();
        java.lang.String str10 = tokenQueue1.remainder();
        java.lang.String str11 = tokenQueue1.consumeAttributeKey();
        boolean boolean12 = tokenQueue1.isEmpty();
        java.lang.String str13 = tokenQueue1.consumeAttributeKey();
        boolean boolean14 = tokenQueue1.isEmpty();
        java.lang.String str16 = tokenQueue1.chompTo("<[#, d, o, c, u, m, e, n, t]>\n</[#, d, o, c, u, m, e, n, t]>#root=&quot;hi!&quot;");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#document" + "'", str8, "#document");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test2533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2533");
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
        org.jsoup.select.Elements elements21 = document15.getElementsByIndexLessThan(4);
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
    }

    @Test
    public void test2534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2534");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!=\"#root=&quot;hi!&quot;\"");
        org.jsoup.nodes.Element element3 = document1.createElement("document");
        org.jsoup.select.Elements elements5 = document1.getElementsByIndexGreaterThan((int) (byte) 1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(elements5);
    }

    @Test
    public void test2535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2535");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.hasText();
        java.lang.String str3 = document1.nodeName();
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        org.jsoup.nodes.Element element8 = document1.classNames((java.util.Set<java.lang.String>) strSet6);
        java.lang.String str9 = document1.tagName();
        org.jsoup.nodes.Element element11 = document1.appendElement("#declaration");
        org.jsoup.nodes.Document document14 = org.jsoup.parser.Parser.parseBodyFragmentRelaxed("#data", "org.jsoup.select.selector$selectorparseexception: org.jsoup.select.selector$selectorparseexception:=\"#root\"");
        org.jsoup.nodes.Attributes attributes15 = document14.attributes();
        java.lang.String str16 = document14.tagName();
        org.jsoup.nodes.Element element17 = element11.prependChild((org.jsoup.nodes.Node) document14);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#root" + "'", str9, "#root");
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(document14);
        org.junit.Assert.assertNotNull(attributes15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "#root" + "'", str16, "#root");
        org.junit.Assert.assertNotNull(element17);
    }

    @Test
    public void test2536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2536");
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
        boolean boolean24 = document1.hasClass("<html> \n <head> \n </head> \n <body>\n   #root  \n </body>\n</html>");
        java.lang.String str25 = document1.toString();
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
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "#document" + "'", str25, "#document");
    }

    @Test
    public void test2537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2537");
        org.jsoup.safety.Whitelist whitelist1 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.jsoup.Jsoup.isValid("<html>\n<head>\n</head>\n<body>\n</body>\n</html>", whitelist1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2538");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parse("hi!");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("org.jsoup.select.selector$selectorparseexception:");
        org.jsoup.select.Elements elements5 = elements3.eq((int) (byte) 10);
        org.jsoup.nodes.Attributes attributes6 = new org.jsoup.nodes.Attributes();
        int int7 = attributes6.size();
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements11 = document9.getElementsByAttribute("hi!");
        java.lang.String str12 = elements11.val();
        java.lang.Object obj13 = null;
        int int14 = elements11.lastIndexOf(obj13);
        org.jsoup.select.Elements elements16 = elements11.eq((int) '#');
        boolean boolean17 = attributes6.equals((java.lang.Object) elements16);
        boolean boolean18 = elements16.hasText();
        java.lang.String str19 = elements16.val();
        org.jsoup.select.Elements elements21 = elements16.append("#document#document");
        boolean boolean22 = elements5.containsAll((java.util.Collection<org.jsoup.nodes.Element>) elements21);
        boolean boolean23 = elements21.isEmpty();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(elements21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2539");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parse("\n<!--#document-->");
        java.lang.String str2 = document1.className();
        java.lang.String str3 = document1.title();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element8 = document5.attr("hi!", "#root");
        java.lang.String str9 = document5.id();
        org.jsoup.nodes.Element element11 = document5.append("hi!=\"#root=&quot;hi!&quot;\"");
        boolean boolean13 = document5.hasClass("");
        java.lang.String str14 = document5.val();
        org.jsoup.select.Elements elements16 = document5.getElementsByIndexLessThan((int) (short) 1);
        java.util.Set<java.lang.String> strSet17 = document5.classNames();
        org.jsoup.nodes.Element element18 = document1.classNames(strSet17);
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertNotNull(element18);
    }

    @Test
    public void test2540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2540");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("<?hi!>");
        boolean boolean2 = tokenQueue1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2541");
        org.jsoup.safety.Whitelist whitelist2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.jsoup.Jsoup.clean("", "#document#document=\"#document#document\"", whitelist2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2542");
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
        org.jsoup.nodes.Attributes attributes13 = new org.jsoup.nodes.Attributes();
        int int14 = attributes13.size();
        java.lang.String str15 = attributes13.html();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor16 = attributes13.iterator();
        attributes13.put("#comment", "");
        boolean boolean21 = attributes13.hasKey("org.jsoup.select.selector$selectorparseexception: org.jsoup.select.selector$selectorparseexception:=\"#root\"");
        org.jsoup.nodes.Element element22 = new org.jsoup.nodes.Element(tag6, "<?#document#documentdocument>", attributes13);
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
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(attributeItor16);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test2543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2543");
        org.jsoup.safety.Whitelist whitelist1 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.jsoup.Jsoup.isValid(" &lt;!--#root--&gt;=\" class=&amp;quot;hi!&amp;quot;\"", whitelist1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2544");
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
        java.lang.String str19 = document2.nodeName();
        java.lang.String str21 = document2.attr("[]");
        org.jsoup.nodes.Element element23 = document2.prependText("#document");
        boolean boolean25 = element23.hasAttr("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements26 = org.jsoup.select.Selector.select("hi! #document body", element23);
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query hi! #document body");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
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
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "#document" + "'", str19, "#document");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test2545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2545");
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parse("<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>", "org.jsoup.select.selector$selectorparseexception: org.jsoup.select.selector$selectorparseexception:=\"#root\"");
        java.lang.String str3 = document2.tagName();
        java.lang.String str4 = document2.toString();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#root" + "'", str3, "#root");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<html> \n<head> \n</head> \n<body>\n  #root  \n</body>\n</html>" + "'", str4, "<html> \n<head> \n</head> \n<body>\n  #root  \n</body>\n</html>");
    }

    @Test
    public void test2546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2546");
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
        document1.setBaseUri("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element19 = document1.child((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
    }

    @Test
    public void test2547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2547");
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
        org.jsoup.nodes.TextNode textNode34 = org.jsoup.nodes.TextNode.createFromEncoded("#data", "#root");
        boolean boolean35 = tag1.equals((java.lang.Object) "#data");
        boolean boolean36 = tag1.isBlock();
        org.jsoup.parser.Tag tag38 = org.jsoup.parser.Tag.valueOf("org.jsoup.select.Selector$SelectorParseException: ");
        boolean boolean39 = tag38.isData();
        boolean boolean40 = tag38.requiresSpecificParent();
        boolean boolean41 = tag38.isBlock();
        org.jsoup.parser.Tag tag43 = org.jsoup.parser.Tag.valueOf("org.jsoup.select.Selector$SelectorParseException: ");
        boolean boolean44 = tag43.isData();
        boolean boolean45 = tag43.requiresSpecificParent();
        boolean boolean46 = tag43.isBlock();
        boolean boolean47 = tag38.canContain(tag43);
        boolean boolean48 = tag38.isBlock();
        boolean boolean49 = tag38.isData();
        java.lang.String str50 = tag38.getName();
        boolean boolean51 = tag38.requiresSpecificParent();
        org.jsoup.parser.Tag tag53 = org.jsoup.parser.Tag.valueOf("#root");
        boolean boolean54 = tag53.isInline();
        boolean boolean55 = tag38.canContain(tag53);
        org.jsoup.parser.Tag tag56 = tag53.getImplicitParent();
        boolean boolean57 = tag1.isValidParent(tag53);
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
        org.junit.Assert.assertNotNull(textNode34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(tag38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(tag43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "org.jsoup.select.selector$selectorparseexception:" + "'", str50, "org.jsoup.select.selector$selectorparseexception:");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(tag53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(tag56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
    }

    @Test
    public void test2548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2548");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document(" class=\"hi!\"");
        java.lang.String str2 = document1.id();
        java.lang.String str3 = document1.html();
        java.lang.String str4 = document1.className();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test2549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2549");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragmentRelaxed("body", "org.jsoup.select.Selector$SelectorParseException: ");
        org.jsoup.nodes.Element element4 = document2.val("<!--#root-->=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n #root \n&lt;/body&gt;\n&lt;/html&gt;\"");
        // The following exception was thrown during execution in test generation
        try {
            document2.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
    }

    @Test
    public void test2550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2550");
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
        org.jsoup.select.Elements elements24 = element23.getAllElements();
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
        org.junit.Assert.assertNotNull(elements24);
    }

    @Test
    public void test2551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2551");
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
        org.jsoup.select.Elements elements22 = elements19.attr("#comment", " #comment=\"\"");
        elements19.clear();
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
        org.junit.Assert.assertNotNull(elements22);
    }

    @Test
    public void test2552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2552");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragmentRelaxed("\n&lt;!--#root--&gt;", "o");
        org.junit.Assert.assertNotNull(document2);
    }

    @Test
    public void test2553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2553");
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parseBodyFragment("#root=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n #root \n&lt;/body&gt;\n&lt;/html&gt;\"", "");
        org.junit.Assert.assertNotNull(document2);
    }

    @Test
    public void test2554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2554");
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
        org.jsoup.select.Elements elements35 = elements33.removeClass("");
        org.jsoup.select.Elements elements37 = elements33.addClass("#declaration");
        org.jsoup.select.Elements elements38 = new org.jsoup.select.Elements((java.util.Collection<org.jsoup.nodes.Element>) elements37);
        org.jsoup.nodes.Document document40 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Document document41 = document40.normalise();
        org.jsoup.nodes.Element element42 = document41.head();
        org.jsoup.nodes.Element element45 = document41.attr("org.jsoup.select.Selector$SelectorParseException: ", "[]");
        java.lang.String str46 = document41.outerHtml();
        org.jsoup.nodes.Element element47 = document41.body();
        org.jsoup.nodes.Element element48 = document41.head();
        org.jsoup.select.Elements elements50 = element48.getElementsByAttribute("#comment");
        int int51 = elements50.size();
        boolean boolean52 = elements38.removeAll((java.util.Collection<org.jsoup.nodes.Element>) elements50);
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
        org.junit.Assert.assertNotNull(elements35);
        org.junit.Assert.assertNotNull(elements37);
        org.junit.Assert.assertNotNull(document40);
        org.junit.Assert.assertNotNull(document41);
        org.junit.Assert.assertNotNull(element42);
        org.junit.Assert.assertNotNull(element45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>" + "'", str46, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.junit.Assert.assertNotNull(element47);
        org.junit.Assert.assertNotNull(element48);
        org.junit.Assert.assertNotNull(elements50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
    }

    @Test
    public void test2555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2555");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("<html>\n<head>\n</head>\n<body>\n []\n</body>\n</html>", "org.jsoup.select.selector$selectorparseexception: org.jsoup.select.selector$selectorparseexception:=\"#root\"");
        java.lang.String str3 = textNode2.toString();
        java.lang.String str4 = textNode2.text();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n []\n&lt;/body&gt;\n&lt;/html&gt;" + "'", str3, "&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n []\n&lt;/body&gt;\n&lt;/html&gt;");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n []\n&lt;/body&gt;\n&lt;/html&gt;" + "'", str4, "&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n []\n&lt;/body&gt;\n&lt;/html&gt;");
    }

    @Test
    public void test2556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2556");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.hasText();
        java.lang.String str3 = document1.nodeName();
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        org.jsoup.nodes.Element element8 = document1.classNames((java.util.Set<java.lang.String>) strSet6);
        org.jsoup.nodes.Element element10 = document1.append("#document");
        org.jsoup.nodes.Element element12 = document1.prepend("#document");
        java.util.List<org.jsoup.nodes.Node> nodeList13 = element12.childNodes();
        java.lang.String str14 = element12.nodeName();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#document" + "'", str14, "#document");
    }

    @Test
    public void test2557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2557");
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parse("\n<body class=\"hi!\">\n #document\n</body>", "<#root class=\"hi!\">\nhi!\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document2);
    }

    @Test
    public void test2558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2558");
        org.jsoup.nodes.Document document2 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document2.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements6 = elements4.prepend("");
        org.jsoup.select.Elements elements8 = elements6.removeAttr("");
        org.jsoup.nodes.Document document10 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements12 = document10.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements14 = elements12.prepend("");
        org.jsoup.select.Elements elements16 = elements14.removeAttr("");
        boolean boolean17 = elements6.containsAll((java.util.Collection<org.jsoup.nodes.Element>) elements14);
        org.jsoup.select.Elements elements19 = elements14.wrap("#root");
        org.jsoup.select.Elements elements20 = new org.jsoup.select.Elements((java.util.Collection<org.jsoup.nodes.Element>) elements19);
        org.jsoup.nodes.Document document22 = org.jsoup.nodes.Document.createShell("hi!");
        boolean boolean23 = elements20.add((org.jsoup.nodes.Element) document22);
        boolean boolean25 = elements20.hasClass("<html>\n<head>\n</head>\n<body>\n</body>\n</html>\n<head>\n</head>\n<body>\n</body>\n");
        org.jsoup.select.Elements elements26 = org.jsoup.select.Selector.select("o", (java.lang.Iterable<org.jsoup.nodes.Element>) elements20);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertNotNull(document22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(elements26);
    }

    @Test
    public void test2559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2559");
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parseBodyFragment("org.jsoup.select.Selector$SelectorParseException: \n<!--#document-->", "#document#documentdocument");
        org.jsoup.nodes.Document document4 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements6 = document4.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element8 = document4.prepend("#document");
        org.jsoup.nodes.Element element9 = element8.empty();
        boolean boolean11 = element9.hasClass("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Document document13 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Document document14 = document13.normalise();
        org.jsoup.nodes.Element element15 = document14.head();
        org.jsoup.nodes.Element element18 = document14.attr("org.jsoup.select.Selector$SelectorParseException: ", "[]");
        org.jsoup.nodes.Element element20 = element18.appendElement("#comment");
        org.jsoup.nodes.Element element21 = element18.parent();
        boolean boolean22 = element9.equals((java.lang.Object) element18);
        org.jsoup.nodes.Element element23 = document2.prependChild((org.jsoup.nodes.Node) element18);
        org.jsoup.nodes.Node node26 = element23.attr("#document#documenthi!", "[<, h, t, m, l, >, \n, <, h, e, a, d, >, \n, <, /, h, e, a, d, >, \n, <, b, o, d, y, >, \n,  , #, r, o, o, t,  , \n, <, /, b, o, d, y, >, \n, <, /, h, t, m, l, >, #, d, o, c, u, m, e, n, t, #, d, o, c, u, m, e, n, t, d, o, c, u, m, e, n, t]");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertNotNull(document14);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNull(element21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(node26);
    }

    @Test
    public void test2560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2560");
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
    }

    @Test
    public void test2561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2561");
        org.jsoup.safety.Whitelist whitelist1 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.jsoup.Jsoup.isValid("o", whitelist1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2562");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("<html> \n <head> \n </head> \n <body>\n   #root  \n </body>\n</html>", "document");
        org.jsoup.nodes.Element element4 = document2.removeClass(" class=\"hi!\"");
        java.lang.String str5 = document2.baseUri();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "document" + "'", str5, "document");
    }

    @Test
    public void test2563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2563");
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
        java.lang.String str17 = element10.toString();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test2564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2564");
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
        java.lang.String str23 = attributes15.get("<?#document#documentdocument>");
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
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test2565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2565");
        org.jsoup.nodes.DataNode dataNode2 = org.jsoup.nodes.DataNode.createFromEncoded("", "<org.jsoup.select.selector$selectorparseexception: hi!=\"#root\">\n</org.jsoup.select.selector$selectorparseexception:>");
        java.lang.String str3 = dataNode2.getWholeData();
        org.junit.Assert.assertNotNull(dataNode2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test2566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2566");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("#document");
        java.lang.String str2 = tokenQueue1.consumeAttributeKey();
        java.lang.String str4 = tokenQueue1.consumeTo("#root=\"hi!\"");
        java.lang.String str5 = tokenQueue1.toString();
        java.lang.String str7 = tokenQueue1.chompTo("");
        boolean boolean8 = tokenQueue1.matchesWord();
        boolean boolean9 = tokenQueue1.isEmpty();
        java.lang.String str11 = tokenQueue1.chompTo("#document");
        java.lang.String str12 = tokenQueue1.consumeWord();
        org.jsoup.nodes.Attributes attributes13 = new org.jsoup.nodes.Attributes();
        int int14 = attributes13.size();
        java.lang.String str15 = attributes13.html();
        java.lang.String str16 = attributes13.html();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator17 = attributes13.spliterator();
        attributes13.put("\n&lt;!--#root--&gt;", " class=&quot;hi!&quot;");
        org.jsoup.nodes.TextNode textNode23 = org.jsoup.nodes.TextNode.createFromEncoded("body", "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.lang.String str24 = textNode23.nodeName();
        boolean boolean25 = attributes13.equals((java.lang.Object) textNode23);
        org.jsoup.nodes.Element[] elementArray26 = new org.jsoup.nodes.Element[] {};
        org.jsoup.select.Elements elements27 = new org.jsoup.select.Elements(elementArray26);
        org.jsoup.select.Elements elements28 = new org.jsoup.select.Elements(elementArray26);
        org.jsoup.select.Elements elements29 = new org.jsoup.select.Elements(elementArray26);
        org.jsoup.nodes.Document document31 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element34 = document31.attr("hi!", "#root");
        org.jsoup.select.Elements elements36 = element34.getElementsByTag("\n<!--#root-->");
        boolean boolean38 = elements36.hasAttr("\n<!--#root-->");
        org.jsoup.nodes.Document document40 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements42 = document40.getElementsByAttribute("hi!");
        java.lang.String str44 = elements42.attr("#root");
        java.lang.String str45 = elements42.text();
        org.jsoup.select.Elements elements47 = elements42.eq((int) (short) 10);
        boolean boolean48 = elements36.removeAll((java.util.Collection<org.jsoup.nodes.Element>) elements42);
        org.jsoup.parser.TokenQueue tokenQueue50 = new org.jsoup.parser.TokenQueue("#document");
        java.lang.String str51 = tokenQueue50.consumeAttributeKey();
        java.lang.String str53 = tokenQueue50.consumeTo("#root=\"hi!\"");
        boolean boolean54 = tokenQueue50.matchesWhitespace();
        org.jsoup.parser.TokenQueue tokenQueue56 = new org.jsoup.parser.TokenQueue("");
        boolean boolean58 = tokenQueue56.matchChomp("org.jsoup.select.selector$selectorparseexception:");
        java.lang.String str59 = tokenQueue56.consumeWord();
        org.jsoup.parser.TokenQueue tokenQueue61 = new org.jsoup.parser.TokenQueue("");
        boolean boolean62 = tokenQueue61.isEmpty();
        java.lang.String[] strArray66 = new java.lang.String[] { " class=\"hi!\"", "#data", "[]" };
        java.lang.String str67 = tokenQueue61.consumeToAny(strArray66);
        java.lang.String str68 = tokenQueue56.consumeToAny(strArray66);
        boolean boolean69 = tokenQueue50.matchesAny(strArray66);
        java.io.Serializable[] serializableArray70 = elements36.toArray((java.io.Serializable[]) strArray66);
        java.lang.String[] strArray71 = elements29.toArray(strArray66);
        boolean boolean72 = attributes13.equals((java.lang.Object) strArray66);
        java.lang.String str73 = tokenQueue1.consumeToAny(strArray66);
        org.jsoup.parser.TokenQueue tokenQueue75 = new org.jsoup.parser.TokenQueue("");
        boolean boolean76 = tokenQueue75.isEmpty();
        java.lang.String[] strArray80 = new java.lang.String[] { " class=\"hi!\"", "#data", "[]" };
        java.lang.String str81 = tokenQueue75.consumeToAny(strArray80);
        java.lang.String str82 = tokenQueue1.consumeToAny(strArray80);
        boolean boolean84 = tokenQueue1.matchChomp("<html>\n<head>\n</head>\n<body>\n</body>\n</html>\n<head>\n</head>\n<body>\n</body>\n");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#document" + "'", str4, "#document");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(attributeSpliterator17);
        org.junit.Assert.assertNotNull(textNode23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "#text" + "'", str24, "#text");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(elementArray26);
        org.junit.Assert.assertNotNull(element34);
        org.junit.Assert.assertNotNull(elements36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(elements42);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertNotNull(elements47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "#document" + "'", str53, "#document");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(strArray66);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "" + "'", str68, "");
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(serializableArray70);
        org.junit.Assert.assertNotNull(strArray71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "" + "'", str73, "");
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertNotNull(strArray80);
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "" + "'", str81, "");
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "" + "'", str82, "");
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
    }

    @Test
    public void test2567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2567");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element4 = document1.attr("hi!", "#root");
        org.jsoup.nodes.Attributes attributes5 = document1.attributes();
        org.jsoup.nodes.Document document6 = document1.normalise();
        java.lang.String str7 = document1.title();
        org.jsoup.select.Elements elements9 = document1.getElementsByIndexEquals((int) (short) 0);
        org.jsoup.select.Elements elements10 = new org.jsoup.select.Elements((java.util.List<org.jsoup.nodes.Element>) elements9);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(elements9);
    }

    @Test
    public void test2568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2568");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parse("# ");
        org.junit.Assert.assertNotNull(document1);
    }

    @Test
    public void test2569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2569");
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
        org.jsoup.select.Elements elements29 = element24.getElementsByIndexLessThan((int) (short) 0);
        java.lang.String str30 = elements29.val();
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
        org.junit.Assert.assertNotNull(elements29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
    }

    @Test
    public void test2570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2570");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.hasText();
        java.lang.String str3 = document1.nodeName();
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        org.jsoup.nodes.Element element8 = document1.classNames((java.util.Set<java.lang.String>) strSet6);
        java.lang.String str9 = document1.outerHtml();
        java.lang.String str11 = document1.attr("\n<!--#root-->");
        java.lang.String str12 = document1.text();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test2571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2571");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("#document#document", "#data");
        org.jsoup.nodes.Element element4 = document2.toggleClass("#document#document");
        org.jsoup.select.Elements elements6 = document2.getElementsByIndexLessThan((int) (short) 10);
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
    }

    @Test
    public void test2572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2572");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("#document#documentdocument", "#document#document=\"#document#document\"", false);
        java.lang.String str4 = xmlDeclaration3.toString();
        java.lang.String str5 = xmlDeclaration3.nodeName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<?#document#documentdocument>" + "'", str4, "<?#document#documentdocument>");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#declaration" + "'", str5, "#declaration");
    }

    @Test
    public void test2573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2573");
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
        org.jsoup.nodes.Document document20 = org.jsoup.Jsoup.parse("#root=\"hi!\"", "body");
        org.jsoup.nodes.Element element22 = document20.prependElement(" \n<!--#root-->");
        boolean boolean23 = elements16.add((org.jsoup.nodes.Element) document20);
        org.jsoup.nodes.Document document26 = org.jsoup.parser.Parser.parse("#root=\"#root=&quot;hi!&quot;\"", "<html>\n<head>\n</head>\n<body>\n #document\n</body>\n</html>");
        org.jsoup.nodes.Element element27 = document20.prependChild((org.jsoup.nodes.Node) document26);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertNotNull(elementStream17);
        org.junit.Assert.assertNotNull(document20);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(document26);
        org.junit.Assert.assertNotNull(element27);
    }

    @Test
    public void test2574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2574");
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
        org.jsoup.nodes.Element element52 = new org.jsoup.nodes.Element(tag5, "#data=\"hi!\"");
        org.jsoup.nodes.Element element53 = element52.parent();
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
        org.junit.Assert.assertNull(element53);
    }

    @Test
    public void test2575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2575");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element4 = elements3.first();
        org.jsoup.select.Elements elements6 = elements3.toggleClass("#document");
        org.jsoup.nodes.Attribute attribute9 = org.jsoup.nodes.Attribute.createFromEncoded("hi!", "hi!");
        attribute9.setKey("#root");
        java.lang.String str12 = attribute9.html();
        attribute9.setKey("#data");
        int int15 = elements3.lastIndexOf((java.lang.Object) "#data");
        org.jsoup.nodes.Element element16 = elements3.first();
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
        org.jsoup.nodes.Document document38 = org.jsoup.parser.Parser.parse("#root", "");
        org.jsoup.nodes.Element element41 = document38.attr("#root", "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        java.lang.String str42 = element41.id();
        java.util.Set<java.lang.String> strSet43 = element41.classNames();
        boolean boolean44 = tag35.equals((java.lang.Object) element41);
        org.jsoup.nodes.Element element46 = element41.appendElement("<?hi!>");
        org.jsoup.nodes.Element element47 = element46.firstElementSibling();
        org.jsoup.nodes.Element element49 = element46.toggleClass("document");
        java.lang.String str50 = element46.data();
        org.jsoup.select.Elements elements53 = element46.getElementsByAttributeValueEnding("#document#document", "<?>");
        org.jsoup.nodes.Document document55 = new org.jsoup.nodes.Document("");
        boolean boolean56 = document55.hasText();
        java.lang.String str57 = document55.nodeName();
        java.lang.String str58 = document55.outerHtml();
        org.jsoup.parser.Tag tag59 = document55.tag();
        java.util.Set<java.lang.String> strSet60 = document55.classNames();
        org.jsoup.nodes.Element element61 = element46.classNames(strSet60);
        boolean boolean62 = elements3.contains((java.lang.Object) element46);
        java.util.function.UnaryOperator<org.jsoup.nodes.Element> elementUnaryOperator63 = null;
        // The following exception was thrown during execution in test generation
        try {
            elements3.replaceAll(elementUnaryOperator63);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(attribute9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "#root=\"hi!\"" + "'", str12, "#root=\"hi!\"");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNull(element16);
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
        org.junit.Assert.assertNotNull(document38);
        org.junit.Assert.assertNotNull(element41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertNotNull(strSet43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(element46);
        org.junit.Assert.assertNotNull(element47);
        org.junit.Assert.assertNotNull(element49);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertNotNull(elements53);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "#document" + "'", str57, "#document");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertNotNull(tag59);
        org.junit.Assert.assertNotNull(strSet60);
        org.junit.Assert.assertNotNull(element61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
    }

    @Test
    public void test2576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2576");
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
        org.jsoup.select.Elements elements19 = elements15.toggleClass("a");
        org.jsoup.nodes.Comment comment22 = new org.jsoup.nodes.Comment("org.jsoup.select.selector$selectorparseexception: org.jsoup.select.selector$selectorparseexception:=\"#root\"", "[#, d, o, c, u, m, e, n, t]");
        java.lang.String str23 = comment22.nodeName();
        int int24 = elements15.lastIndexOf((java.lang.Object) str23);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(elementArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(elementSpliterator11);
        org.junit.Assert.assertNotNull(elementSpliterator12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "#comment" + "'", str23, "#comment");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test2577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2577");
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
        boolean boolean34 = tag1.preserveWhitespace();
        boolean boolean35 = tag1.preserveWhitespace();
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
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test2578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2578");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements5 = elements3.val("a");
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
        org.jsoup.nodes.Element element21 = element18.append("hi!");
        org.jsoup.nodes.Element element23 = element21.appendText("#root=\"hi!\"");
        java.lang.String str24 = element21.toString();
        org.jsoup.nodes.Document document26 = new org.jsoup.nodes.Document("");
        boolean boolean27 = document26.hasText();
        java.lang.String str28 = document26.nodeName();
        java.lang.String str29 = document26.outerHtml();
        org.jsoup.parser.Tag tag30 = document26.tag();
        java.util.Set<java.lang.String> strSet31 = document26.classNames();
        org.jsoup.nodes.Element element32 = element21.classNames(strSet31);
        int int33 = elements3.lastIndexOf((java.lang.Object) element21);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#document" + "'", str9, "#document");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(attributes19);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "#document#documenthi!#root=&quot;hi!&quot;" + "'", str24, "#document#documenthi!#root=&quot;hi!&quot;");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "#document" + "'", str28, "#document");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(tag30);
        org.junit.Assert.assertNotNull(strSet31);
        org.junit.Assert.assertNotNull(element32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
    }

    @Test
    public void test2579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2579");
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
    public void test2580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2580");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("#document#document", "");
        attribute2.setValue("org.jsoup.select.selector$selectorparseexception: org.jsoup.select.selector$selectorparseexception:");
        java.lang.String str5 = attribute2.getKey();
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#document#document" + "'", str5, "#document#document");
    }

    @Test
    public void test2581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2581");
        org.jsoup.nodes.DataNode dataNode2 = org.jsoup.nodes.DataNode.createFromEncoded("#document#documenthi!", "#comment");
        java.lang.String str3 = dataNode2.nodeName();
        org.junit.Assert.assertNotNull(dataNode2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#data" + "'", str3, "#data");
    }

    @Test
    public void test2582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2582");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("org.jsoup.select.Selector$SelectorParseException: org.jsoup.select.selector$selectorparseexception:", "#document#document=\"#document#document\"");
        org.jsoup.parser.Tag tag3 = document2.tag();
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
        org.jsoup.parser.Tag tag22 = document5.tag();
        org.jsoup.parser.Tag tag24 = org.jsoup.parser.Tag.valueOf("#declaration");
        java.lang.String str25 = tag24.toString();
        boolean boolean26 = tag22.isValidParent(tag24);
        org.jsoup.nodes.Element element28 = new org.jsoup.nodes.Element(tag22, "");
        java.lang.String str29 = tag22.getName();
        boolean boolean30 = tag22.isInline();
        boolean boolean31 = tag3.isValidAncestor(tag22);
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(tag3);
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
        org.junit.Assert.assertNotNull(tag22);
        org.junit.Assert.assertNotNull(tag24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "#declaration" + "'", str25, "#declaration");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "#root" + "'", str29, "#root");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test2583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2583");
        org.jsoup.nodes.Element[] elementArray0 = new org.jsoup.nodes.Element[] {};
        org.jsoup.select.Elements elements1 = new org.jsoup.select.Elements(elementArray0);
        org.jsoup.select.Elements elements2 = new org.jsoup.select.Elements(elementArray0);
        org.jsoup.select.Elements elements3 = new org.jsoup.select.Elements(elementArray0);
        org.jsoup.select.Elements elements5 = elements3.toggleClass("#document#documentdocument");
        org.jsoup.select.Elements elements6 = new org.jsoup.select.Elements((java.util.Collection<org.jsoup.nodes.Element>) elements5);
        org.jsoup.select.Elements elements8 = elements6.removeAttr("org.jsoup.select.selector$selectorparseexception: org.jsoup.select.selector$selectorparseexception:=\"#root\"");
        org.jsoup.select.Elements elements11 = elements6.attr("<html>\n<head>\n</head>\n<body>\n hi! \n</body>\n</html>", "#root=\"#root=&quot;hi!&quot;\"");
        org.jsoup.select.Elements elements12 = new org.jsoup.select.Elements((java.util.List<org.jsoup.nodes.Element>) elements11);
        org.junit.Assert.assertNotNull(elementArray0);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(elements11);
    }

    @Test
    public void test2584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2584");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("#root", "");
        org.jsoup.nodes.Element element5 = document2.attr("#root", "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        java.lang.String str6 = document2.tagName();
        org.jsoup.nodes.Element element7 = document2.parent();
        org.jsoup.nodes.Element element9 = document2.text("#root");
        org.jsoup.nodes.Element element11 = document2.addClass("# ");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#root" + "'", str6, "#root");
        org.junit.Assert.assertNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
    }

    @Test
    public void test2585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2585");
        org.jsoup.select.Selector.SelectorParseException selectorParseException1 = new org.jsoup.select.Selector.SelectorParseException("<html>\n<head>\n</head>\n<body>\n ocument \n</body>\n</html>");
    }

    @Test
    public void test2586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2586");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("org.jsoup.select.Selector$SelectorParseException: org.jsoup.select.selector$selectorparseexception:", "#root");
        java.lang.String str3 = attribute2.toString();
        org.jsoup.nodes.Document document6 = org.jsoup.parser.Parser.parse("#root", "");
        org.jsoup.nodes.Element element9 = document6.attr("#root", "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        java.lang.String str10 = document6.tagName();
        org.jsoup.nodes.Element element11 = document6.empty();
        org.jsoup.select.Elements elements12 = element11.children();
        boolean boolean13 = attribute2.equals((java.lang.Object) elements12);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ListIterator<org.jsoup.nodes.Element> elementItor15 = elements12.listIterator((int) 'o');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 111");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "org.jsoup.select.selector$selectorparseexception: org.jsoup.select.selector$selectorparseexception:=\"#root\"" + "'", str3, "org.jsoup.select.selector$selectorparseexception: org.jsoup.select.selector$selectorparseexception:=\"#root\"");
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#root" + "'", str10, "#root");
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2587");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragmentRelaxed("#root", "<!--#document-->=\"#document#document\"");
        org.junit.Assert.assertNotNull(document2);
    }

    @Test
    public void test2588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2588");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("#root", "");
        org.jsoup.nodes.Element element5 = document2.attr("#root", "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        java.lang.String str6 = document2.tagName();
        org.jsoup.nodes.Element element7 = document2.empty();
        org.jsoup.select.Elements elements8 = element7.children();
        java.lang.Object[] objArray9 = elements8.toArray();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#root" + "'", str6, "#root");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
    }

    @Test
    public void test2589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2589");
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
        java.lang.String str32 = tokenQueue26.consumeAttributeKey();
        java.lang.String str33 = tokenQueue26.consumeAttributeKey();
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
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
    }

    @Test
    public void test2590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2590");
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
        org.jsoup.select.Elements elements39 = elements13.parents();
        org.jsoup.nodes.Document document42 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements44 = document42.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements46 = elements44.prepend("");
        org.jsoup.select.Elements elements48 = elements46.removeAttr("");
        org.jsoup.nodes.Document document50 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements52 = document50.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements54 = elements52.prepend("");
        org.jsoup.select.Elements elements56 = elements54.removeAttr("");
        boolean boolean57 = elements46.containsAll((java.util.Collection<org.jsoup.nodes.Element>) elements54);
        java.lang.Object[] objArray58 = elements46.toArray();
        org.jsoup.nodes.Document document60 = new org.jsoup.nodes.Document("");
        boolean boolean61 = document60.hasText();
        java.lang.String str62 = document60.nodeName();
        java.lang.String str63 = document60.val();
        boolean boolean64 = elements46.add((org.jsoup.nodes.Element) document60);
        org.jsoup.nodes.Element element66 = document60.appendText("#document#documenthi!");
        org.jsoup.select.Elements elements68 = element66.getElementsByClass("#data");
        org.jsoup.nodes.Element element70 = element66.prependElement("#document#documentdocument");
        java.lang.String str71 = element66.toString();
        // The following exception was thrown during execution in test generation
        try {
            elements39.add((int) (short) 10, element66);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
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
        org.junit.Assert.assertNotNull(elements39);
        org.junit.Assert.assertNotNull(elements44);
        org.junit.Assert.assertNotNull(elements46);
        org.junit.Assert.assertNotNull(elements48);
        org.junit.Assert.assertNotNull(elements52);
        org.junit.Assert.assertNotNull(elements54);
        org.junit.Assert.assertNotNull(elements56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(objArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray58), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray58), "[]");
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "#document" + "'", str62, "#document");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(element66);
        org.junit.Assert.assertNotNull(elements68);
        org.junit.Assert.assertNotNull(element70);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "<#document#documentdocument>\n</#document#documentdocument>#document#documenthi!" + "'", str71, "<#document#documentdocument>\n</#document#documentdocument>#document#documenthi!");
    }

    @Test
    public void test2591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2591");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragmentRelaxed("body", "");
        org.jsoup.select.Elements elements4 = document2.getElementsByIndexEquals((-1));
        org.jsoup.nodes.Attribute attribute7 = new org.jsoup.nodes.Attribute("body", "org.jsoup.select.Selector$SelectorParseException:");
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements11 = document9.getElementsByAttribute("hi!");
        java.lang.String str12 = elements11.val();
        java.lang.Object obj13 = null;
        int int14 = elements11.lastIndexOf(obj13);
        org.jsoup.select.Elements elements16 = elements11.eq((int) '#');
        boolean boolean18 = elements11.hasAttr("#root");
        int int20 = elements11.indexOf((java.lang.Object) (byte) 100);
        java.lang.String str22 = elements11.attr("org.jsoup.select.Selector$SelectorParseException: ");
        boolean boolean23 = attribute7.equals((java.lang.Object) elements11);
        boolean boolean24 = elements4.removeAll((java.util.Collection<org.jsoup.nodes.Element>) elements11);
        org.jsoup.nodes.DataNode dataNode27 = new org.jsoup.nodes.DataNode("<?#document#document>", "<?>");
        org.jsoup.nodes.DataNode dataNode30 = new org.jsoup.nodes.DataNode("<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "hi!=\"#root=&quot;hi!&quot;\"");
        java.lang.String str31 = dataNode30.toString();
        java.lang.String str32 = dataNode30.nodeName();
        java.lang.String str33 = dataNode30.nodeName();
        org.jsoup.nodes.DataNode dataNode36 = new org.jsoup.nodes.DataNode("#root=\"hi!\"", "\n<!--#root-->");
        java.lang.String str37 = dataNode36.getWholeData();
        java.lang.String str38 = dataNode36.nodeName();
        org.jsoup.nodes.DataNode dataNode41 = org.jsoup.nodes.DataNode.createFromEncoded("org.jsoup.select.selector$selectorparseexception:", "hi!");
        java.lang.String str42 = dataNode41.getWholeData();
        java.lang.String str43 = dataNode41.nodeName();
        org.jsoup.nodes.DataNode dataNode46 = org.jsoup.nodes.DataNode.createFromEncoded("[]", "#document#documentdocument");
        java.lang.String str47 = dataNode46.toString();
        java.lang.String str48 = dataNode46.getWholeData();
        org.jsoup.nodes.DataNode[] dataNodeArray49 = new org.jsoup.nodes.DataNode[] { dataNode27, dataNode30, dataNode36, dataNode41, dataNode46 };
        org.jsoup.nodes.DataNode[] dataNodeArray50 = elements11.toArray(dataNodeArray49);
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>" + "'", str31, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "#data" + "'", str32, "#data");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "#data" + "'", str33, "#data");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "#root=\"hi!\"" + "'", str37, "#root=\"hi!\"");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "#data" + "'", str38, "#data");
        org.junit.Assert.assertNotNull(dataNode41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "org.jsoup.select.selector$selectorparseexception:" + "'", str42, "org.jsoup.select.selector$selectorparseexception:");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "#data" + "'", str43, "#data");
        org.junit.Assert.assertNotNull(dataNode46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "[]" + "'", str47, "[]");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "[]" + "'", str48, "[]");
        org.junit.Assert.assertNotNull(dataNodeArray49);
        org.junit.Assert.assertNotNull(dataNodeArray50);
    }

    @Test
    public void test2592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2592");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded(" class=\"hi!\"", "org.jsoup.select.Selector$SelectorParseException: ");
        java.lang.String str3 = textNode2.toString();
        java.lang.String str4 = textNode2.baseUri();
        java.lang.String str5 = textNode2.text();
        java.lang.String str6 = textNode2.getWholeText();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " class=&quot;hi!&quot;" + "'", str3, " class=&quot;hi!&quot;");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "org.jsoup.select.Selector$SelectorParseException:" + "'", str4, "org.jsoup.select.Selector$SelectorParseException:");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " class=&quot;hi!&quot;" + "'", str5, " class=&quot;hi!&quot;");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " class=\"hi!\"" + "'", str6, " class=\"hi!\"");
    }

    @Test
    public void test2593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2593");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements29 = elements15.select(" <?hi!>=\"#data\"");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query <?hi!>=\"#data\"");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
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
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test2594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2594");
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
        java.lang.String str25 = elements6.outerHtml();
        java.util.Iterator<org.jsoup.nodes.Element> elementItor26 = elements6.iterator();
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
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(elementItor26);
    }

    @Test
    public void test2595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2595");
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
        org.jsoup.select.Selector.SelectorParseException selectorParseException22 = new org.jsoup.select.Selector.SelectorParseException("\n<!--#document-->");
        org.jsoup.select.Selector.SelectorParseException selectorParseException24 = new org.jsoup.select.Selector.SelectorParseException("org.jsoup.select.selector$selectorparseexception:");
        java.lang.Throwable[] throwableArray25 = selectorParseException24.getSuppressed();
        selectorParseException22.addSuppressed((java.lang.Throwable) selectorParseException24);
        selectorParseException1.addSuppressed((java.lang.Throwable) selectorParseException24);
        org.jsoup.select.Selector.SelectorParseException selectorParseException29 = new org.jsoup.select.Selector.SelectorParseException("org.jsoup.select.selector$selectorparseexception:");
        org.jsoup.select.Selector.SelectorParseException selectorParseException31 = new org.jsoup.select.Selector.SelectorParseException("org.jsoup.select.selector$selectorparseexception:");
        java.lang.Throwable[] throwableArray32 = selectorParseException31.getSuppressed();
        org.jsoup.select.Selector.SelectorParseException selectorParseException34 = new org.jsoup.select.Selector.SelectorParseException("\n<!--#document-->");
        selectorParseException31.addSuppressed((java.lang.Throwable) selectorParseException34);
        selectorParseException29.addSuppressed((java.lang.Throwable) selectorParseException34);
        org.jsoup.select.Selector.SelectorParseException selectorParseException38 = new org.jsoup.select.Selector.SelectorParseException("org.jsoup.select.selector$selectorparseexception:");
        selectorParseException34.addSuppressed((java.lang.Throwable) selectorParseException38);
        org.jsoup.select.Selector.SelectorParseException selectorParseException41 = new org.jsoup.select.Selector.SelectorParseException("org.jsoup.select.selector$selectorparseexception:");
        selectorParseException38.addSuppressed((java.lang.Throwable) selectorParseException41);
        org.jsoup.select.Selector.SelectorParseException selectorParseException44 = new org.jsoup.select.Selector.SelectorParseException("<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        org.jsoup.select.Selector.SelectorParseException selectorParseException46 = new org.jsoup.select.Selector.SelectorParseException("org.jsoup.select.selector$selectorparseexception:");
        java.lang.Throwable[] throwableArray47 = selectorParseException46.getSuppressed();
        org.jsoup.select.Selector.SelectorParseException selectorParseException49 = new org.jsoup.select.Selector.SelectorParseException("\n<!--#document-->");
        selectorParseException46.addSuppressed((java.lang.Throwable) selectorParseException49);
        org.jsoup.select.Selector.SelectorParseException selectorParseException52 = new org.jsoup.select.Selector.SelectorParseException("org.jsoup.select.selector$selectorparseexception:");
        java.lang.Throwable[] throwableArray53 = selectorParseException52.getSuppressed();
        org.jsoup.select.Selector.SelectorParseException selectorParseException55 = new org.jsoup.select.Selector.SelectorParseException("\n<!--#document-->");
        selectorParseException52.addSuppressed((java.lang.Throwable) selectorParseException55);
        selectorParseException46.addSuppressed((java.lang.Throwable) selectorParseException52);
        java.lang.Throwable[] throwableArray58 = selectorParseException46.getSuppressed();
        selectorParseException44.addSuppressed((java.lang.Throwable) selectorParseException46);
        selectorParseException41.addSuppressed((java.lang.Throwable) selectorParseException46);
        org.jsoup.select.Selector.SelectorParseException selectorParseException62 = new org.jsoup.select.Selector.SelectorParseException("\n&lt;!--#root--&gt;");
        selectorParseException46.addSuppressed((java.lang.Throwable) selectorParseException62);
        selectorParseException1.addSuppressed((java.lang.Throwable) selectorParseException46);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertNotNull(throwableArray25);
        org.junit.Assert.assertNotNull(throwableArray32);
        org.junit.Assert.assertNotNull(throwableArray47);
        org.junit.Assert.assertNotNull(throwableArray53);
        org.junit.Assert.assertNotNull(throwableArray58);
    }

    @Test
    public void test2596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2596");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("#root", "");
        org.jsoup.nodes.Element element5 = document2.attr("#root", "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        org.jsoup.select.Elements elements8 = element5.getElementsByAttributeValueContaining("org.jsoup.select.selector$selectorparseexception:", "#document#documenthi!#root=&quot;hi!&quot;");
        org.jsoup.select.Elements elements10 = elements8.eq(100);
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(elements10);
    }

    @Test
    public void test2597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2597");
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
        org.jsoup.nodes.Document document24 = org.jsoup.Jsoup.parseBodyFragment("<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>", "");
        org.jsoup.select.Elements elements26 = document24.getElementsByIndexGreaterThan(2);
        boolean boolean27 = elements21.removeAll((java.util.Collection<org.jsoup.nodes.Element>) elements26);
        int int28 = elements26.size();
        // The following exception was thrown during execution in test generation
        try {
            java.util.ListIterator<org.jsoup.nodes.Element> elementItor30 = elements26.listIterator((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 97");
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
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(elements21);
        org.junit.Assert.assertNotNull(document24);
        org.junit.Assert.assertNotNull(elements26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test2598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2598");
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
        org.jsoup.nodes.Element element20 = elements19.first();
        org.jsoup.nodes.Document document22 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements24 = document22.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements26 = elements24.prepend("");
        org.jsoup.select.Elements elements28 = elements26.removeAttr("");
        org.jsoup.nodes.Document document30 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements32 = document30.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements34 = elements32.prepend("");
        org.jsoup.select.Elements elements36 = elements34.removeAttr("");
        boolean boolean37 = elements26.containsAll((java.util.Collection<org.jsoup.nodes.Element>) elements34);
        org.jsoup.nodes.Document document39 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements41 = document39.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements43 = elements41.prepend("");
        org.jsoup.select.Elements elements45 = elements43.removeAttr("");
        org.jsoup.nodes.Document document47 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements49 = document47.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements51 = elements49.prepend("");
        org.jsoup.select.Elements elements53 = elements51.removeAttr("");
        boolean boolean54 = elements43.containsAll((java.util.Collection<org.jsoup.nodes.Element>) elements51);
        org.jsoup.select.Elements elements56 = elements51.wrap("#root");
        boolean boolean57 = elements34.containsAll((java.util.Collection<org.jsoup.nodes.Element>) elements56);
        org.jsoup.select.Elements elements59 = elements34.val("#root=\"hi!\"");
        boolean boolean60 = elements19.addAll((java.util.Collection<org.jsoup.nodes.Element>) elements34);
        boolean boolean62 = elements34.is("<[#, d, o, c, u, m, e, n, t]>\n</[#, d, o, c, u, m, e, n, t]>#root=&quot;hi!&quot;");
        boolean boolean64 = elements34.hasClass("hi!=\"#root=&quot;hi!&quot;\"");
        org.jsoup.nodes.Document document66 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements68 = document66.getElementsByAttribute("hi!");
        java.lang.String str69 = elements68.val();
        java.lang.Object obj70 = null;
        int int71 = elements68.lastIndexOf(obj70);
        org.jsoup.select.Elements elements73 = elements68.eq((int) '#');
        boolean boolean74 = elements34.containsAll((java.util.Collection<org.jsoup.nodes.Element>) elements68);
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
        org.junit.Assert.assertNull(element20);
        org.junit.Assert.assertNotNull(elements24);
        org.junit.Assert.assertNotNull(elements26);
        org.junit.Assert.assertNotNull(elements28);
        org.junit.Assert.assertNotNull(elements32);
        org.junit.Assert.assertNotNull(elements34);
        org.junit.Assert.assertNotNull(elements36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(elements41);
        org.junit.Assert.assertNotNull(elements43);
        org.junit.Assert.assertNotNull(elements45);
        org.junit.Assert.assertNotNull(elements49);
        org.junit.Assert.assertNotNull(elements51);
        org.junit.Assert.assertNotNull(elements53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(elements56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(elements59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(elements68);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + (-1) + "'", int71 == (-1));
        org.junit.Assert.assertNotNull(elements73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
    }

    @Test
    public void test2599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2599");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parse("hi!");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValue("hi!", "hi!");
        org.jsoup.nodes.Attributes attributes5 = document1.attributes();
        org.jsoup.nodes.Element element6 = document1.head();
        org.jsoup.select.Elements elements8 = document1.getElementsByAttribute("<?#document#document>");
        java.lang.String str9 = elements8.outerHtml();
        org.jsoup.select.Elements elements11 = elements8.prepend("#data");
        org.jsoup.nodes.Document document15 = org.jsoup.parser.Parser.parse("#root", "");
        java.lang.String str16 = document15.outerHtml();
        org.jsoup.nodes.Element element18 = document15.append("<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        org.jsoup.select.Elements elements20 = document15.getElementsByIndexEquals(1);
        org.jsoup.nodes.Element element21 = document15.body();
        org.jsoup.select.Elements elements23 = document15.getElementsByIndexGreaterThan((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element24 = elements8.set((int) '#', (org.jsoup.nodes.Element) document15);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 35, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(document15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>" + "'", str16, "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(elements20);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(elements23);
    }

    @Test
    public void test2600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2600");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements5 = elements3.prepend("");
        org.jsoup.select.Elements elements7 = elements5.removeAttr("");
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements11 = document9.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements13 = elements11.prepend("");
        org.jsoup.select.Elements elements15 = elements13.removeAttr("");
        boolean boolean16 = elements5.containsAll((java.util.Collection<org.jsoup.nodes.Element>) elements13);
        org.jsoup.select.Elements elements18 = elements5.prepend("hi!");
        org.jsoup.select.Elements elements20 = elements5.select("org.jsoup.select.Selector$SelectorParseException: ");
        org.jsoup.select.Elements elements22 = elements20.eq((int) (byte) 0);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertNotNull(elements20);
        org.junit.Assert.assertNotNull(elements22);
    }

    @Test
    public void test2601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2601");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("#root", "");
        org.jsoup.nodes.Element element5 = document2.attr("#root", "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        java.lang.String str6 = element5.id();
        org.jsoup.select.Elements elements8 = element5.getElementsByIndexEquals((int) (short) 1);
        org.jsoup.select.Elements elements9 = new org.jsoup.select.Elements((java.util.List<org.jsoup.nodes.Element>) elements8);
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(elements8);
    }

    @Test
    public void test2602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2602");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements5 = elements3.prepend("");
        elements5.clear();
        int int8 = elements5.indexOf((java.lang.Object) "org.jsoup.select.Selector$SelectorParseException: ");
        org.jsoup.select.Elements elements10 = elements5.append("#document");
        java.util.Iterator<org.jsoup.nodes.Element> elementItor11 = elements5.iterator();
        org.jsoup.nodes.Document document13 = org.jsoup.Jsoup.parseBodyFragment(" class=\"hi!\"");
        boolean boolean14 = elements5.add((org.jsoup.nodes.Element) document13);
        org.jsoup.nodes.Element element15 = elements5.first();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(elementItor11);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(element15);
    }

    @Test
    public void test2603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2603");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.hasText();
        org.jsoup.nodes.Element element4 = document1.addClass("\n<!--#document-->");
        boolean boolean6 = element4.hasAttr("<#root hi!=\"#root\">\n</#root>");
        org.jsoup.select.Elements elements9 = element4.getElementsByAttributeValueStarting("#comment", "org.jsoup.select.Selector$SelectorParseException: org.jsoup.select.selector$selectorparseexception:");
        org.jsoup.nodes.Element element11 = element4.prependText(" ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(element11);
    }

    @Test
    public void test2604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2604");
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
        org.jsoup.select.Elements elements22 = document7.getElementsByAttribute("#data");
        org.jsoup.select.Elements elements23 = new org.jsoup.select.Elements((java.util.Collection<org.jsoup.nodes.Element>) elements22);
        org.jsoup.select.Elements elements25 = elements23.toggleClass("hi!=\"#root\"");
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
        org.junit.Assert.assertNotNull(elements25);
    }

    @Test
    public void test2605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2605");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        boolean boolean5 = document1.hasClass("");
        java.lang.String str6 = document1.nodeName();
        java.lang.String str7 = document1.toString();
        org.jsoup.nodes.Document document8 = document1.normalise();
        org.jsoup.nodes.Element element9 = document8.body();
        java.lang.String str10 = element9.toString();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#document" + "'", str6, "#document");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\n<body>\n</body>" + "'", str10, "\n<body>\n</body>");
    }

    @Test
    public void test2606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2606");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n []\n&lt;/body&gt;\n&lt;/html&gt;", "");
        org.junit.Assert.assertNotNull(document2);
    }

    @Test
    public void test2607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2607");
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
    public void test2608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2608");
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
    public void test2609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2609");
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
    public void test2610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2610");
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
    public void test2611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2611");
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
    public void test2612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2612");
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
    public void test2613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2613");
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
    public void test2614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2614");
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
    public void test2615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2615");
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
    public void test2616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2616");
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
    public void test2617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2617");
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
    public void test2618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2618");
        org.jsoup.nodes.DataNode dataNode2 = new org.jsoup.nodes.DataNode(" class=&quot;hi!&quot;", "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Node node4 = dataNode2.removeAttr("a");
        java.lang.String str5 = dataNode2.nodeName();
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#data" + "'", str5, "#data");
    }

    @Test
    public void test2619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2619");
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
    public void test2620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2620");
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
    public void test2621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2621");
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
        org.jsoup.select.Elements elements37 = elements28.html("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
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
        org.junit.Assert.assertNotNull(elements37);
    }

    @Test
    public void test2622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2622");
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
    public void test2623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2623");
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
    public void test2624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2624");
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
    public void test2625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2625");
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
    public void test2626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2626");
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
    public void test2627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2627");
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
    public void test2628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2628");
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
    public void test2629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2629");
        org.jsoup.nodes.DataNode dataNode2 = org.jsoup.nodes.DataNode.createFromEncoded(" class=\"hi!\" #root=\"hi!\"", "<!--#root-->\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.junit.Assert.assertNotNull(dataNode2);
    }

    @Test
    public void test2630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2630");
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parseBodyFragment("#data", "[#, d, o, c, u, m, e, n, t]");
        org.jsoup.nodes.Element element3 = document2.head();
        org.jsoup.nodes.Element element5 = element3.toggleClass("#data=\"\"");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
    }

    @Test
    public void test2631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2631");
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
    public void test2632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2632");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element4 = document1.attr("hi!", "#root");
        java.lang.String str5 = document1.id();
        org.jsoup.nodes.Element element7 = document1.append("hi!=\"#root=&quot;hi!&quot;\"");
        boolean boolean9 = document1.hasClass("");
        org.jsoup.nodes.Element element11 = document1.createElement("#document#documentdocument");
        org.jsoup.nodes.Element element13 = document1.append("<?#document#document>");
        org.jsoup.select.Elements elements16 = element13.getElementsByAttributeValue("#root=\"hi!\"", "#document=\"#comment\"");
        boolean boolean18 = element13.hasClass("");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test2633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2633");
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
    public void test2634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2634");
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
    public void test2635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2635");
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
    public void test2636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2636");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("<#root class=\"hi!\">\nhi!\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "[]");
        org.jsoup.nodes.Attributes attributes3 = document2.attributes();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(attributes3);
    }

    @Test
    public void test2637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2637");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parse("<html>\n<head>\n</head>\n<body>\n</body>\n</html>=\"\"");
        org.jsoup.nodes.Element element3 = document1.createElement(" #comment=\"\"");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
    }

    @Test
    public void test2638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2638");
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
    public void test2639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2639");
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
    public void test2640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2640");
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
    public void test2641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2641");
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
    public void test2642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2642");
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
    public void test2643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2643");
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
    public void test2644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2644");
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
    public void test2645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2645");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("#document");
        java.lang.String str2 = tokenQueue1.remainder();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#document" + "'", str2, "#document");
    }

    @Test
    public void test2646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2646");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements5 = elements3.val("a");
        org.jsoup.select.Elements elements7 = elements3.toggleClass("");
        org.jsoup.select.Elements elements9 = elements7.html("org.jsoup.select.Selector$SelectorParseException: #document#document=\"#document#document\"");
        org.jsoup.nodes.Document document11 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements13 = document11.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements15 = elements13.prepend("");
        org.jsoup.select.Elements elements17 = elements15.removeAttr("");
        org.jsoup.select.Elements elements19 = elements17.prepend("<?#document#document>");
        org.jsoup.select.Elements elements21 = elements17.eq((int) (short) 0);
        java.lang.Class<?> wildcardClass22 = elements17.getClass();
        org.jsoup.nodes.Document document24 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements26 = document24.getElementsByAttribute("hi!");
        java.lang.String str27 = elements26.val();
        java.lang.Object obj28 = null;
        int int29 = elements26.lastIndexOf(obj28);
        org.jsoup.select.Elements elements31 = elements26.eq((int) '#');
        elements26.clear();
        int int33 = elements26.size();
        java.util.Spliterator<org.jsoup.nodes.Element> elementSpliterator34 = elements26.spliterator();
        java.lang.Class<?> wildcardClass35 = elements26.getClass();
        org.jsoup.parser.Tag tag37 = org.jsoup.parser.Tag.valueOf("org.jsoup.select.Selector$SelectorParseException: ");
        java.lang.String str38 = tag37.getName();
        boolean boolean39 = tag37.isInline();
        boolean boolean40 = tag37.isEmpty();
        org.jsoup.parser.Tag tag42 = org.jsoup.parser.Tag.valueOf("org.jsoup.select.Selector$SelectorParseException: ");
        java.lang.String str43 = tag42.getName();
        boolean boolean44 = tag42.isInline();
        boolean boolean45 = tag42.isEmpty();
        boolean boolean46 = tag42.isEmpty();
        org.jsoup.nodes.Document document49 = org.jsoup.parser.Parser.parse("#root", "");
        org.jsoup.nodes.Element element52 = document49.attr("#root", "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        java.lang.String str53 = document49.tagName();
        java.lang.String str54 = document49.text();
        boolean boolean55 = document49.isBlock();
        boolean boolean56 = tag42.equals((java.lang.Object) document49);
        boolean boolean57 = tag37.isValidParent(tag42);
        java.lang.Class<?> wildcardClass58 = tag42.getClass();
        org.jsoup.nodes.Document document61 = org.jsoup.parser.Parser.parseBodyFragment("\n&lt;!--#root--&gt;", "<!--#document-->");
        org.jsoup.nodes.Element element64 = document61.attr("\n<!--#document--> #data", "<!--#document-->");
        java.lang.Class<?> wildcardClass65 = document61.getClass();
        org.jsoup.nodes.Document document69 = org.jsoup.parser.Parser.parse("#root", "\n<!--#root-->");
        org.jsoup.select.Elements elements70 = org.jsoup.select.Selector.select("#declaration", (org.jsoup.nodes.Element) document69);
        org.jsoup.nodes.Element element71 = document69.body();
        org.jsoup.nodes.Document document73 = new org.jsoup.nodes.Document("");
        boolean boolean74 = document73.hasText();
        java.lang.String str75 = document73.nodeName();
        java.lang.String[] strArray77 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet78 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet78, strArray77);
        org.jsoup.nodes.Element element80 = document73.classNames((java.util.Set<java.lang.String>) strSet78);
        org.jsoup.nodes.Element element82 = document73.append("#document");
        org.jsoup.nodes.Element element84 = document73.prepend("#document");
        org.jsoup.select.Elements elements85 = document73.parents();
        org.jsoup.nodes.Element element86 = element71.appendChild((org.jsoup.nodes.Node) document73);
        org.jsoup.select.Elements elements87 = element86.getAllElements();
        org.jsoup.select.Elements elements89 = elements87.html("<html> \n <head> \n </head> \n <body>\n   #root  \n </body>\n</html>");
        java.lang.Class<?> wildcardClass90 = elements89.getClass();
        java.lang.reflect.AnnotatedElement[] annotatedElementArray91 = new java.lang.reflect.AnnotatedElement[] { wildcardClass22, wildcardClass35, wildcardClass58, wildcardClass65, wildcardClass90 };
        java.lang.reflect.AnnotatedElement[] annotatedElementArray92 = elements9.toArray(annotatedElementArray91);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertNotNull(elements21);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertNotNull(elements26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(elements31);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(elementSpliterator34);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertNotNull(tag37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "org.jsoup.select.selector$selectorparseexception:" + "'", str38, "org.jsoup.select.selector$selectorparseexception:");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(tag42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "org.jsoup.select.selector$selectorparseexception:" + "'", str43, "org.jsoup.select.selector$selectorparseexception:");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(document49);
        org.junit.Assert.assertNotNull(element52);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "#root" + "'", str53, "#root");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "#root" + "'", str54, "#root");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(wildcardClass58);
        org.junit.Assert.assertNotNull(document61);
        org.junit.Assert.assertNotNull(element64);
        org.junit.Assert.assertNotNull(wildcardClass65);
        org.junit.Assert.assertNotNull(document69);
        org.junit.Assert.assertNotNull(elements70);
        org.junit.Assert.assertNotNull(element71);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "#document" + "'", str75, "#document");
        org.junit.Assert.assertNotNull(strArray77);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertNotNull(element80);
        org.junit.Assert.assertNotNull(element82);
        org.junit.Assert.assertNotNull(element84);
        org.junit.Assert.assertNotNull(elements85);
        org.junit.Assert.assertNotNull(element86);
        org.junit.Assert.assertNotNull(elements87);
        org.junit.Assert.assertNotNull(elements89);
        org.junit.Assert.assertNotNull(wildcardClass90);
        org.junit.Assert.assertNotNull(annotatedElementArray91);
        org.junit.Assert.assertNotNull(annotatedElementArray92);
    }

    @Test
    public void test2647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2647");
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
    public void test2648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2648");
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
    public void test2649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2649");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("org.jsoup.select.Selector$SelectorParseException: ");
        java.lang.String str2 = tag1.getName();
        java.lang.String str3 = tag1.toString();
        java.lang.String str4 = tag1.getName();
        boolean boolean5 = tag1.isInline();
        boolean boolean6 = tag1.isEmpty();
        org.jsoup.nodes.Attribute attribute9 = org.jsoup.nodes.Attribute.createFromEncoded("hi!", "hi!");
        attribute9.setValue("#root=\"hi!\"");
        java.lang.String str12 = attribute9.getKey();
        java.lang.String str13 = attribute9.getKey();
        attribute9.setKey("<#root hi!=\"#root\">\n</#root>");
        org.jsoup.nodes.Document document18 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements20 = document18.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements22 = elements20.prepend("");
        elements22.clear();
        int int25 = elements22.indexOf((java.lang.Object) "org.jsoup.select.Selector$SelectorParseException: ");
        org.jsoup.select.Elements elements27 = elements22.removeClass("#data");
        org.jsoup.select.Elements elements28 = org.jsoup.select.Selector.select("#data", (java.lang.Iterable<org.jsoup.nodes.Element>) elements27);
        org.jsoup.parser.Tag tag30 = org.jsoup.parser.Tag.valueOf("org.jsoup.select.Selector$SelectorParseException: ");
        boolean boolean31 = tag30.isData();
        boolean boolean32 = tag30.requiresSpecificParent();
        boolean boolean33 = tag30.isBlock();
        org.jsoup.parser.Tag tag35 = org.jsoup.parser.Tag.valueOf("org.jsoup.select.Selector$SelectorParseException: ");
        boolean boolean36 = tag35.isData();
        boolean boolean37 = tag35.requiresSpecificParent();
        boolean boolean38 = tag35.isBlock();
        boolean boolean39 = tag30.canContain(tag35);
        boolean boolean40 = elements27.equals((java.lang.Object) tag35);
        boolean boolean41 = attribute9.equals((java.lang.Object) tag35);
        boolean boolean42 = tag1.isValidParent(tag35);
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.jsoup.select.selector$selectorparseexception:" + "'", str2, "org.jsoup.select.selector$selectorparseexception:");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "org.jsoup.select.selector$selectorparseexception:" + "'", str3, "org.jsoup.select.selector$selectorparseexception:");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "org.jsoup.select.selector$selectorparseexception:" + "'", str4, "org.jsoup.select.selector$selectorparseexception:");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(attribute9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(elements20);
        org.junit.Assert.assertNotNull(elements22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(elements27);
        org.junit.Assert.assertNotNull(elements28);
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
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test2650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2650");
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
    public void test2651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2651");
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
    public void test2652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2652");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("#document#documenthi!", " class=\"hi!\"");
        org.jsoup.select.Elements elements4 = document2.getElementsByIndexLessThan((int) (byte) -1);
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(elements4);
    }

    @Test
    public void test2653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2653");
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
    public void test2654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2654");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("a", "#data");
        java.lang.String str3 = comment2.toString();
        java.lang.String str4 = comment2.toString();
        java.lang.String str5 = comment2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n<!--a-->" + "'", str3, "\n<!--a-->");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\n<!--a-->" + "'", str4, "\n<!--a-->");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\n<!--a-->" + "'", str5, "\n<!--a-->");
    }

    @Test
    public void test2655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2655");
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
    public void test2656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2656");
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
    public void test2657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2657");
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
    public void test2658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2658");
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
    public void test2659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2659");
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
    public void test2660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2660");
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
    public void test2661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2661");
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
    public void test2662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2662");
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
    public void test2663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2663");
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
    public void test2664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2664");
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
    public void test2665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2665");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("#document#document", " <?hi!>=\"#data\"");
        org.junit.Assert.assertNotNull(document2);
    }

    @Test
    public void test2666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2666");
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
    public void test2667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2667");
        org.jsoup.select.Selector.SelectorParseException selectorParseException1 = new org.jsoup.select.Selector.SelectorParseException("#document#documenthi!");
    }

    @Test
    public void test2668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2668");
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
    public void test2669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2669");
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
    public void test2670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2670");
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
    public void test2671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2671");
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
    public void test2672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2672");
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
    public void test2673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2673");
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
    public void test2674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2674");
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
    public void test2675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2675");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment(" class=&quot;hi!&quot;", "org.jsoup.select.Selector$SelectorParseException:");
        org.junit.Assert.assertNotNull(document2);
    }

    @Test
    public void test2676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2676");
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
    public void test2677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2677");
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
    public void test2678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2678");
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
    public void test2679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2679");
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
        org.jsoup.select.Elements elements25 = element22.getElementsByAttributeValueContaining("<[#, d, o, c, u, m, e, n, t]>\n</[#, d, o, c, u, m, e, n, t]>#root=&quot;hi!&quot;", "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>\n<html> \n<head> \n</head> \n<body>\n  #root  \n</body>\n</html>");
        org.jsoup.nodes.Element element26 = element22.lastElementSibling();
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
        org.junit.Assert.assertNotNull(elements25);
        org.junit.Assert.assertNotNull(element26);
    }

    @Test
    public void test2680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2680");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment(" class=\"hi!\" #root=\"hi!\"", "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.lang.String str3 = comment2.toString();
        java.lang.String str4 = comment2.nodeName();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n<!-- class=\"hi!\" #root=\"hi!\"-->" + "'", str3, "\n<!-- class=\"hi!\" #root=\"hi!\"-->");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#comment" + "'", str4, "#comment");
    }

    @Test
    public void test2681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2681");
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
    public void test2682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2682");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("head", "org.jsoup.select.selector$selectorparseexception: \n<!--#document-->=\"#document#document=&quot;#document#document&quot;\"");
    }

    @Test
    public void test2683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2683");
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
    public void test2684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2684");
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
    public void test2685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2685");
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
    public void test2686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2686");
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
    public void test2687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2687");
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parse("<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>", "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.lang.String str3 = document2.nodeName();
        org.jsoup.nodes.Element element4 = document2.empty();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(element4);
    }

    @Test
    public void test2688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2688");
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
    public void test2689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2689");
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
    public void test2690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2690");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n #root \n&lt;/body&gt;\n&lt;/html&gt;\n&lt;html&gt; \n&lt;head&gt; \n&lt;/head&gt; \n&lt;body&gt;\n  #root  \n&lt;/body&gt;\n&lt;/html&gt;");
        org.junit.Assert.assertNotNull(document1);
    }

    @Test
    public void test2691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2691");
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
    public void test2692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2692");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("#document");
        java.lang.String str2 = tokenQueue1.consumeAttributeKey();
        java.lang.String str3 = tokenQueue1.consumeCssIdentifier();
        tokenQueue1.addFirst((java.lang.Character) 'o');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test2693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2693");
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
    public void test2694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2694");
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
    public void test2695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2695");
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
    public void test2696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2696");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "<html>\n<head>\n</head>\n<body>\n #document\n</body>\n</html>");
        java.lang.String str3 = textNode2.getWholeText();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test2697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2697");
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
    public void test2698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2698");
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
    public void test2699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2699");
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
    public void test2700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2700");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("#document#document", "\n<!--#document-->", false);
        java.lang.String str4 = xmlDeclaration3.nodeName();
        java.lang.String str5 = xmlDeclaration3.nodeName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#declaration" + "'", str4, "#declaration");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#declaration" + "'", str5, "#declaration");
    }

    @Test
    public void test2701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2701");
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
    }

    @Test
    public void test2702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2702");
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
    public void test2703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2703");
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
    }

    @Test
    public void test2704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2704");
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
    public void test2705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2705");
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
    public void test2706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2706");
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
    public void test2707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2707");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("#root");
        org.jsoup.nodes.Element element3 = document1.html("org.jsoup.select.Selector$SelectorParseException: ");
        org.jsoup.select.Elements elements4 = document1.getAllElements();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(elements4);
    }

    @Test
    public void test2708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2708");
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
    public void test2709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2709");
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
    public void test2710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2710");
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
    public void test2711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2711");
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
    public void test2712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2712");
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
    public void test2713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2713");
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
    public void test2714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2714");
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
    public void test2715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2715");
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
    public void test2716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2716");
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
    public void test2717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2717");
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
    public void test2718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2718");
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
    public void test2719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2719");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("");
        tokenQueue1.addFirst((java.lang.Character) ' ');
        tokenQueue1.addFirst((java.lang.Character) '#');
        boolean boolean7 = tokenQueue1.matches("#text");
        boolean boolean9 = tokenQueue1.matchChomp("<!--#root-->=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n #root \n&lt;/body&gt;\n&lt;/html&gt;\"");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2720");
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
    public void test2721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2721");
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
    public void test2722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2722");
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
    public void test2723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2723");
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
    public void test2724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2724");
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
    public void test2725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2725");
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
    public void test2726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2726");
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
    public void test2727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2727");
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
    public void test2728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2728");
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
    public void test2729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2729");
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
    public void test2730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2730");
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
    public void test2731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2731");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse(" text=\"#data\"", "<org.jsoup.select.selector$selectorparseexception: hi!=\"#root\">\n</org.jsoup.select.selector$selectorparseexception:>");
        document2.setBaseUri("\n<!--a-->");
        org.junit.Assert.assertNotNull(document2);
    }

    @Test
    public void test2732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2732");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("#root=&quot;hi!&quot;", "\n<!--#document-->");
        org.jsoup.nodes.Element element4 = document2.addClass("#data=\"\"");
        java.lang.String str5 = document2.nodeName();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#document" + "'", str5, "#document");
    }

    @Test
    public void test2733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2733");
        org.jsoup.select.Selector.SelectorParseException selectorParseException1 = new org.jsoup.select.Selector.SelectorParseException("&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;");
    }

    @Test
    public void test2734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2734");
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
    public void test2735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2735");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("# ");
        java.lang.String str2 = document1.outerHtml();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "<html>\n<head>\n</head>\n<body>\n # \n</body>\n</html>" + "'", str2, "<html>\n<head>\n</head>\n<body>\n # \n</body>\n</html>");
    }

    @Test
    public void test2736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2736");
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
    public void test2737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2737");
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
    public void test2738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2738");
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
    public void test2739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2739");
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parse("\n<!--<html>\n<head>\n</head>\n<body>\n</body>\n</html>-->", "\n<!--#root-->");
        org.junit.Assert.assertNotNull(document2);
    }

    @Test
    public void test2740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2740");
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
    public void test2741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2741");
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
    public void test2742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2742");
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
    public void test2743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2743");
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
    public void test2744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2744");
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
    public void test2745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2745");
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
    public void test2746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2746");
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
    public void test2747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2747");
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
    public void test2748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2748");
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
    public void test2749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2749");
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
    public void test2750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2750");
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
    public void test2751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2751");
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
    public void test2752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2752");
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
    }

    @Test
    public void test2753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2753");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parse("<html>\n<head>\n</head>\n<body>\n #document#document \n</body>\n</html>");
        document1.title("<html>\n<head>\n</head>\n<body>\n</body>\n</html>=\"\"=\"hi!\"");
        org.junit.Assert.assertNotNull(document1);
    }

    @Test
    public void test2754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2754");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("org.jsoup.select.selector$selectorparseexception:");
        org.jsoup.nodes.Element element2 = document1.body();
        org.jsoup.select.Elements elements3 = element2.children();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(elements3);
    }

    @Test
    public void test2755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2755");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("#document#document=\"#document#document\"");
        java.lang.String str2 = tokenQueue1.toString();
        java.lang.String str3 = tokenQueue1.consumeWord();
        boolean boolean4 = tokenQueue1.matchesWord();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[#, d, o, c, u, m, e, n, t, #, d, o, c, u, m, e, n, t, =, \", #, d, o, c, u, m, e, n, t, #, d, o, c, u, m, e, n, t, \"]" + "'", str2, "[#, d, o, c, u, m, e, n, t, #, d, o, c, u, m, e, n, t, =, \", #, d, o, c, u, m, e, n, t, #, d, o, c, u, m, e, n, t, \"]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test2756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2756");
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
    public void test2757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2757");
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
    public void test2758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2758");
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
    }

    @Test
    public void test2759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2759");
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
    public void test2760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2760");
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
    public void test2761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2761");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("#root=\"\n&lt;!--#root--&gt;\"");
        org.junit.Assert.assertNotNull(document1);
    }

    @Test
    public void test2762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2762");
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
    public void test2763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2763");
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
    public void test2764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2764");
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
    public void test2765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2765");
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
    public void test2766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2766");
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
    public void test2767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2767");
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
    public void test2768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2768");
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
    public void test2769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2769");
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
}

