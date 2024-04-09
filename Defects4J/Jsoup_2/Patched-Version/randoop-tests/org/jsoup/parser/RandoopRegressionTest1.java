package org.jsoup.parser;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RandoopRegressionTest1 {

    public static boolean debug = false;

    @Test
    public void test501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test501");
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parseBodyFragment("#root=\"\"", "<#root>\n</#root>");
        org.jsoup.nodes.Element element4 = document2.prepend("");
        org.jsoup.nodes.Attributes attributes5 = element4.attributes();
        java.util.List<org.jsoup.nodes.Attribute> attributeList6 = attributes5.asList();
        int int7 = attributes5.size();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertNotNull(attributeList6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test502");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str2 = document1.tagName();
        org.jsoup.parser.Tag tag3 = document1.tag();
        org.jsoup.nodes.Element element5 = new org.jsoup.nodes.Element(tag3, "#root=\"\"");
        java.lang.String str6 = element5.toString();
        org.jsoup.nodes.Element element8 = element5.text("");
        org.jsoup.nodes.Element element10 = element8.appendText("hi!");
        org.jsoup.nodes.Document document12 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str13 = document12.tagName();
        org.jsoup.parser.Tag tag14 = document12.tag();
        org.jsoup.nodes.Document document16 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str17 = document16.tagName();
        org.jsoup.parser.Tag tag18 = document16.tag();
        boolean boolean19 = tag18.isEmpty();
        org.jsoup.nodes.Document document21 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str22 = document21.tagName();
        org.jsoup.parser.Tag tag23 = document21.tag();
        org.jsoup.nodes.Element element25 = new org.jsoup.nodes.Element(tag23, "#root=\"\"");
        org.jsoup.nodes.Document document27 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str28 = document27.tagName();
        org.jsoup.parser.Tag tag29 = document27.tag();
        boolean boolean30 = tag23.canContain(tag29);
        boolean boolean31 = tag18.isValidParent(tag23);
        org.jsoup.nodes.Document document33 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str34 = document33.tagName();
        org.jsoup.parser.Tag tag35 = document33.tag();
        boolean boolean36 = tag35.isEmpty();
        boolean boolean37 = tag23.canContain(tag35);
        boolean boolean38 = tag14.canContain(tag35);
        org.jsoup.nodes.TextNode textNode42 = new org.jsoup.nodes.TextNode("hi!", "");
        java.lang.String str43 = textNode42.text();
        org.jsoup.nodes.Attributes attributes44 = textNode42.attributes();
        attributes44.put("#root=\"\"=\"\"", "\n<!--#root=\"\"-->");
        org.jsoup.nodes.Element element48 = new org.jsoup.nodes.Element(tag35, "#comment", attributes44);
        org.jsoup.nodes.Element element51 = element48.attr("&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;hi!", "org.jsoup.select.Selector$SelectorParseException: hi!<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element52 = element8.prependChild((org.jsoup.nodes.Node) element48);
        org.jsoup.nodes.Document document54 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str55 = document54.tagName();
        java.lang.String str56 = document54.html();
        org.jsoup.nodes.Element element58 = document54.append("hi!");
        org.jsoup.nodes.Element element59 = element58.parent();
        java.util.Set<java.lang.String> strSet60 = element58.classNames();
        org.jsoup.nodes.Element element61 = element48.classNames(strSet60);
        boolean boolean63 = element48.hasClass("<html>\n<head>\n</head>\n<body> #root\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#root" + "'", str2, "#root");
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<#root>\n</#root>" + "'", str6, "<#root>\n</#root>");
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "#root" + "'", str13, "#root");
        org.junit.Assert.assertNotNull(tag14);
        org.junit.Assert.assertNotNull(document16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "#root" + "'", str17, "#root");
        org.junit.Assert.assertNotNull(tag18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(document21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "#root" + "'", str22, "#root");
        org.junit.Assert.assertNotNull(tag23);
        org.junit.Assert.assertNotNull(document27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "#root" + "'", str28, "#root");
        org.junit.Assert.assertNotNull(tag29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(document33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "#root" + "'", str34, "#root");
        org.junit.Assert.assertNotNull(tag35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!" + "'", str43, "hi!");
        org.junit.Assert.assertNotNull(attributes44);
        org.junit.Assert.assertNotNull(element51);
        org.junit.Assert.assertNotNull(element52);
        org.junit.Assert.assertNotNull(document54);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "#root" + "'", str55, "#root");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>" + "'", str56, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.junit.Assert.assertNotNull(element58);
        org.junit.Assert.assertNull(element59);
        org.junit.Assert.assertNotNull(strSet60);
        org.junit.Assert.assertNotNull(element61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test503");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        java.lang.String str3 = textNode2.text();
        org.jsoup.nodes.Attributes attributes4 = textNode2.attributes();
        int int5 = attributes4.size();
        org.jsoup.nodes.Attribute attribute8 = new org.jsoup.nodes.Attribute("<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!", "#root=\"hi!\"");
        org.jsoup.nodes.Document document10 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element12 = document10.prependElement("hi!");
        org.jsoup.nodes.Element element14 = element12.append("");
        boolean boolean15 = attribute8.equals((java.lang.Object) "");
        java.lang.String str16 = attribute8.getKey();
        attributes4.put(attribute8);
        java.lang.String str18 = attribute8.getValue();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!" + "'", str16, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "#root=\"hi!\"" + "'", str18, "#root=\"hi!\"");
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test504");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element3 = document1.prependElement("hi!");
        org.jsoup.nodes.Element element4 = document1.head();
        java.lang.Object obj5 = null;
        boolean boolean6 = document1.equals(obj5);
        document1.title("");
        org.jsoup.nodes.Document document10 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str11 = document10.tagName();
        org.jsoup.nodes.Element element13 = document10.append("hi!");
        java.lang.String str14 = document10.outerHtml();
        org.jsoup.select.Elements elements15 = document10.children();
        org.jsoup.nodes.Document document17 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.select.Elements elements19 = document17.getElementsByTag("#root");
        boolean boolean20 = document10.equals((java.lang.Object) document17);
        org.jsoup.nodes.Element element22 = document17.append("#text");
        org.jsoup.select.Elements elements23 = document17.getAllElements();
        boolean boolean24 = document1.equals((java.lang.Object) document17);
        document1.title(".org.jsoup.select.Selector$SelectorParseException: hi!<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#root" + "'", str11, "#root");
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!" + "'", str14, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!");
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(document17);
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(elements23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test505");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str2 = document1.tagName();
        org.jsoup.nodes.Element element4 = document1.append("hi!");
        java.lang.String str5 = document1.outerHtml();
        org.jsoup.select.Elements elements6 = document1.children();
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("#root");
        boolean boolean10 = document9.hasText();
        org.jsoup.select.Elements elements12 = document9.getElementsByIndexEquals(10);
        org.jsoup.nodes.Document document14 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str15 = document14.tagName();
        org.jsoup.parser.Tag tag16 = document14.tag();
        org.jsoup.nodes.TextNode textNode19 = new org.jsoup.nodes.TextNode("hi!", "");
        org.jsoup.nodes.Node node20 = textNode19.parent();
        org.jsoup.nodes.Element element21 = document14.appendChild((org.jsoup.nodes.Node) textNode19);
        org.jsoup.select.Elements elements23 = element21.getElementsByClass("#root");
        org.jsoup.nodes.Element element24 = document9.prependChild((org.jsoup.nodes.Node) element21);
        org.jsoup.select.Elements elements27 = element21.getElementsByAttributeValueNot("#text", "#document");
        org.jsoup.nodes.Element element29 = element21.appendElement("<?<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!>");
        elements6.add((int) (byte) 1, element21);
        org.jsoup.select.Elements elements33 = element21.getElementsByAttributeValueNot("<html>\n <head>\n </head>\n <body>\n </body>\n</html>hi!\n<head>\n </head>\n <body>\n </body>\n\n", "<?<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!>");
        java.lang.Object[] objArray34 = elements33.toArray();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#root" + "'", str2, "#root");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!" + "'", str5, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(document14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "#root" + "'", str15, "#root");
        org.junit.Assert.assertNotNull(tag16);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(elements23);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(elements27);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertNotNull(elements33);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray34), "[<html>\n <head>\n </head>\n <body>\n </body>\n</html>hi!<<?<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!>>\n</<?<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!>>, \n<html>\n <head>\n </head>\n <body>\n </body>\n</html>, \n <head>\n </head>, \n <body>\n </body>, <<?<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!>>\n</<?<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!>>]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray34), "[<html>\n <head>\n </head>\n <body>\n </body>\n</html>hi!<<?<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!>>\n</<?<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!>>, \n<html>\n <head>\n </head>\n <body>\n </body>\n</html>, \n <head>\n </head>, \n <body>\n </body>, <<?<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!>>\n</<?<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!>>]");
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test506");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str2 = document1.tagName();
        org.jsoup.nodes.Element element4 = document1.append("hi!");
        java.lang.String str5 = document1.outerHtml();
        org.jsoup.select.Elements elements6 = document1.children();
        org.jsoup.nodes.Document document8 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.select.Elements elements10 = document8.getElementsByTag("#root");
        boolean boolean11 = document1.equals((java.lang.Object) document8);
        org.jsoup.nodes.Element element13 = document8.createElement("\n<!--#root=\"\"-->");
        org.jsoup.nodes.Element element15 = document8.createElement("[]");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#root" + "'", str2, "#root");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!" + "'", str5, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element15);
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test507");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element3 = document1.prependElement("hi!");
        org.jsoup.nodes.Document document6 = org.jsoup.parser.Parser.parseBodyFragment("#root", "#root");
        org.jsoup.nodes.Element element8 = document6.addClass("<#root>\n</#root>");
        element3.replaceWith((org.jsoup.nodes.Node) document6);
        org.jsoup.nodes.Element element11 = element3.toggleClass("#root=\"hi!\"");
        org.jsoup.nodes.Element element13 = element11.toggleClass("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.lang.String str14 = element13.className();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + " #root=\"hi!\" <html>\n<head>\n</head>\n<body>\n</body>\n</html>" + "'", str14, " #root=\"hi!\" <html>\n<head>\n</head>\n<body>\n</body>\n</html>");
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test508");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str2 = document1.tagName();
        org.jsoup.nodes.Element element4 = document1.append("hi!");
        org.jsoup.nodes.Element element6 = document1.prependText("hi!");
        org.jsoup.nodes.Element element8 = document1.createElement("#root=\"hi!\"");
        org.jsoup.nodes.Document document10 = new org.jsoup.nodes.Document("#root");
        boolean boolean11 = document10.hasText();
        org.jsoup.select.Elements elements13 = document10.getElementsByIndexEquals(10);
        org.jsoup.nodes.Element element14 = document1.prependChild((org.jsoup.nodes.Node) document10);
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#root" + "'", str2, "#root");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(element14);
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test509");
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parseBodyFragment("#root=\"\"", "<#root>\n</#root>");
        org.jsoup.nodes.Element element4 = document2.prepend("");
        org.jsoup.nodes.Document document7 = org.jsoup.Jsoup.parseBodyFragment("#root=\"\"", "<#root>\n</#root>");
        java.lang.String str8 = document7.toString();
        java.lang.String str9 = document7.nodeName();
        java.lang.String str10 = document7.outerHtml();
        org.jsoup.nodes.Element element11 = document7.body();
        org.jsoup.nodes.Element element13 = document7.append("#root");
        org.jsoup.nodes.Element element15 = element13.appendElement("&lt;?#root=&quot;&amp;lt;html&amp;gt; &amp;lt;head&amp;gt; &amp;lt;/head&amp;gt; &amp;lt;body&amp;gt; &amp;lt;/body&amp;gt; &amp;lt;/html&amp;gt;&quot;&gt;");
        java.util.Set<java.lang.String> strSet16 = element13.classNames();
        org.jsoup.nodes.Element element17 = element4.classNames(strSet16);
        java.lang.String str18 = element4.nodeName();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>" + "'", str8, "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#document" + "'", str9, "#document");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>" + "'", str10, "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>");
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "#document" + "'", str18, "#document");
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test510");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str2 = document1.tagName();
        org.jsoup.nodes.Element element4 = document1.append("hi!");
        java.lang.String str5 = element4.outerHtml();
        org.jsoup.nodes.Element element7 = element4.append("");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#root" + "'", str2, "#root");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!" + "'", str5, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!");
        org.junit.Assert.assertNotNull(element7);
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test511");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str2 = document1.tagName();
        org.jsoup.select.Elements elements4 = document1.getElementsByIndexGreaterThan((-1));
        java.lang.String str5 = document1.toString();
        org.jsoup.nodes.Element element6 = document1.head();
        org.jsoup.nodes.Attributes attributes7 = element6.attributes();
        org.jsoup.nodes.Element element9 = element6.append("#root=\"\"");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#root" + "'", str2, "#root");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>" + "'", str5, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(element9);
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test512");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("<!#root=\"hi!\">", "#root");
        org.jsoup.nodes.Element element4 = document2.prepend("body");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test513");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parse("");
        org.jsoup.parser.Tag tag2 = document1.tag();
        org.jsoup.nodes.Document document4 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element6 = document4.prependElement("hi!");
        org.jsoup.nodes.Element element7 = element6.parent();
        org.jsoup.nodes.Element element8 = element6.empty();
        boolean boolean9 = tag2.equals((java.lang.Object) element8);
        java.lang.String str10 = element8.toString();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(tag2);
        org.junit.Assert.assertNotNull(document4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\n<hi!>\n</hi!>" + "'", str10, "\n<hi!>\n</hi!>");
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test514");
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parseBodyFragment("#root=\"\"", "<#root>\n</#root>");
        java.lang.String str3 = document2.toString();
        java.lang.String str4 = document2.nodeName();
        java.lang.String str5 = document2.outerHtml();
        org.jsoup.nodes.Element element6 = document2.body();
        org.jsoup.nodes.Document document7 = document2.normalise();
        org.jsoup.nodes.Node node8 = document2.parent();
        org.jsoup.nodes.Document document11 = org.jsoup.Jsoup.parseBodyFragment("#root=\"\"", "<#root>\n</#root>");
        java.lang.String str12 = document11.toString();
        java.lang.String str13 = document11.nodeName();
        org.jsoup.nodes.Element element14 = document2.prependChild((org.jsoup.nodes.Node) document11);
        java.lang.String str15 = document11.data();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>" + "'", str3, "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#document" + "'", str4, "#document");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>" + "'", str5, "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>" + "'", str12, "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "#document" + "'", str13, "#document");
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test515");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element3 = document1.prependElement("hi!");
        org.jsoup.nodes.Document document6 = org.jsoup.parser.Parser.parseBodyFragment("#root", "#root");
        org.jsoup.nodes.Element element8 = document6.addClass("<#root>\n</#root>");
        element3.replaceWith((org.jsoup.nodes.Node) document6);
        org.jsoup.nodes.Element element10 = document6.parent();
        org.jsoup.nodes.Document document12 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str13 = document12.tagName();
        org.jsoup.parser.Tag tag14 = document12.tag();
        org.jsoup.nodes.Element element16 = new org.jsoup.nodes.Element(tag14, "#root=\"\"");
        org.jsoup.select.Elements elements18 = element16.getElementsByClass("<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>");
        org.jsoup.select.Elements elements21 = element16.getElementsByAttributeValueStarting("#root", "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!");
        org.jsoup.nodes.Element element22 = elements21.last();
        org.jsoup.nodes.Document document24 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.select.Elements elements26 = document24.getElementsByTag("#root");
        java.lang.String str27 = elements26.text();
        org.jsoup.nodes.Document document29 = new org.jsoup.nodes.Document("#root");
        boolean boolean30 = document29.hasText();
        org.jsoup.select.Elements elements32 = document29.getElementsByIndexEquals(10);
        java.lang.Object[] objArray33 = elements32.toArray();
        boolean boolean34 = elements26.retainAll((java.util.Collection<org.jsoup.nodes.Element>) elements32);
        org.jsoup.nodes.Document document36 = new org.jsoup.nodes.Document("#root");
        boolean boolean37 = document36.hasText();
        org.jsoup.select.Elements elements39 = document36.getElementsByIndexEquals(10);
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor40 = elements39.listIterator();
        org.jsoup.select.Elements elements43 = elements39.attr("<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "hi!");
        boolean boolean44 = elements26.remove((java.lang.Object) elements43);
        org.jsoup.select.Elements elements46 = elements43.append("");
        org.jsoup.nodes.Element element47 = elements43.last();
        boolean boolean48 = elements21.removeAll((java.util.Collection<org.jsoup.nodes.Element>) elements43);
        boolean boolean49 = document6.equals((java.lang.Object) elements43);
        org.jsoup.nodes.Element element51 = document6.createElement("[o, h, i, !]");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "#root" + "'", str13, "#root");
        org.junit.Assert.assertNotNull(tag14);
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertNotNull(elements21);
        org.junit.Assert.assertNull(element22);
        org.junit.Assert.assertNotNull(document24);
        org.junit.Assert.assertNotNull(elements26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(elements32);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray33), "[]");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(elements39);
        org.junit.Assert.assertNotNull(elementItor40);
        org.junit.Assert.assertNotNull(elements43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(elements46);
        org.junit.Assert.assertNull(element47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(element51);
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test516");
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parseBodyFragment("[<, !, <, h, t, m, l, >, \n, <, h, e, a, d, >, \n, <, /, h, e, a, d, >, \n, <, b, o, d, y, >, \n, <, /, b, o, d, y, >, \n, <, /, h, t, m, l, >, h, i, !, >]", "#root");
        org.junit.Assert.assertNotNull(document2);
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test517");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements2 = document1.children();
        java.lang.String str3 = document1.outerHtml();
        org.jsoup.nodes.Element element5 = document1.appendText("<?#root=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;\">");
        org.jsoup.nodes.Element element7 = document1.append("\n<!--#root=\"\"-->");
        org.jsoup.nodes.Node node8 = document1.parent();
        org.junit.Assert.assertNotNull(elements2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test518");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("#root=\"hi!\"", "#root=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;\"", true);
        org.jsoup.nodes.Document document5 = org.jsoup.Jsoup.parseBodyFragment("<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!");
        org.jsoup.nodes.Element element7 = document5.text("org.jsoup.select.Selector$SelectorParseException: hi!<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element9 = element7.html("#root=&quot;&quot;");
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.replaceWith((org.jsoup.nodes.Node) element9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test519");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.select.Elements elements3 = document1.getElementsByTag("#root");
        java.lang.String str4 = elements3.text();
        org.jsoup.select.Elements elements6 = elements3.toggleClass("");
        java.util.stream.Stream<org.jsoup.nodes.Element> elementStream7 = elements6.stream();
        org.jsoup.select.Elements elements8 = new org.jsoup.select.Elements((java.util.List<org.jsoup.nodes.Element>) elements6);
        org.jsoup.select.Elements elements10 = elements8.html("<?<html>\n<head>\n</head>\n<body>\n</body>\n</html>>");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elementStream7);
        org.junit.Assert.assertNotNull(elements10);
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test520");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str2 = document1.tagName();
        org.jsoup.select.Elements elements4 = document1.getElementsByIndexGreaterThan((-1));
        boolean boolean5 = elements4.isEmpty();
        org.jsoup.select.Elements elements7 = elements4.append("\n<!--#root=\"\"-->");
        org.jsoup.nodes.Document document9 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str10 = document9.tagName();
        org.jsoup.parser.Tag tag11 = document9.tag();
        boolean boolean12 = tag11.isEmpty();
        org.jsoup.nodes.Document document14 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str15 = document14.tagName();
        org.jsoup.parser.Tag tag16 = document14.tag();
        org.jsoup.nodes.Element element18 = new org.jsoup.nodes.Element(tag16, "#root=\"\"");
        org.jsoup.nodes.Document document20 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str21 = document20.tagName();
        org.jsoup.parser.Tag tag22 = document20.tag();
        boolean boolean23 = tag16.canContain(tag22);
        boolean boolean24 = tag11.isValidParent(tag16);
        org.jsoup.nodes.Document document26 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str27 = document26.tagName();
        org.jsoup.parser.Tag tag28 = document26.tag();
        boolean boolean29 = tag28.isEmpty();
        boolean boolean30 = tag16.canContain(tag28);
        org.jsoup.nodes.Document document32 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.select.Elements elements34 = document32.getElementsByTag("#root");
        java.lang.String str35 = elements34.text();
        org.jsoup.nodes.Document document37 = new org.jsoup.nodes.Document("#root");
        boolean boolean38 = document37.hasText();
        org.jsoup.select.Elements elements40 = document37.getElementsByIndexEquals(10);
        java.lang.Object[] objArray41 = elements40.toArray();
        boolean boolean42 = elements34.retainAll((java.util.Collection<org.jsoup.nodes.Element>) elements40);
        java.lang.String str43 = elements40.text();
        boolean boolean44 = tag16.equals((java.lang.Object) elements40);
        org.jsoup.select.Elements elements47 = elements40.attr("aorg", "<html>\n <head>\n </head>\n <body>\n </body>\n</html>hi!\n\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n\n <head>\n </head>\n\n <body>\n </body>");
        boolean boolean48 = elements4.removeAll((java.util.Collection<org.jsoup.nodes.Element>) elements40);
        org.jsoup.nodes.Element element49 = null;
        boolean boolean50 = elements4.add(element49);
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#root" + "'", str2, "#root");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(document9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#root" + "'", str10, "#root");
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(document14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "#root" + "'", str15, "#root");
        org.junit.Assert.assertNotNull(tag16);
        org.junit.Assert.assertNotNull(document20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "#root" + "'", str21, "#root");
        org.junit.Assert.assertNotNull(tag22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(document26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "#root" + "'", str27, "#root");
        org.junit.Assert.assertNotNull(tag28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(document32);
        org.junit.Assert.assertNotNull(elements34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(elements40);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray41), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray41), "[]");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(elements47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test521");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("#root", "");
        java.lang.String str3 = attribute2.getKey();
        attribute2.setKey("#root=\"\"");
        java.lang.String str6 = attribute2.toString();
        attribute2.setKey("\n<!--#root=\"\"-->");
        org.jsoup.nodes.Document document11 = org.jsoup.Jsoup.parseBodyFragment("#root=\"\"", "<#root>\n</#root>");
        java.lang.String str12 = document11.nodeName();
        org.jsoup.select.Elements elements14 = document11.getElementsByIndexEquals(10);
        org.jsoup.nodes.Document document17 = org.jsoup.parser.Parser.parse("", "\n<!--#root=\"\"-->");
        boolean boolean18 = document11.equals((java.lang.Object) "\n<!--#root=\"\"-->");
        org.jsoup.nodes.Element element20 = document11.prepend("<html>\n <head>\n </head>\n <body>\n </body>\n</html>hi!\n\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n\n <head>\n </head>\n\n <body>\n </body>");
        boolean boolean21 = attribute2.equals((java.lang.Object) element20);
        org.jsoup.select.Elements elements23 = element20.getElementsByClass("#root");
        org.jsoup.select.Elements elements24 = element20.children();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#root" + "'", str3, "#root");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#root=\"\"=\"\"" + "'", str6, "#root=\"\"=\"\"");
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "#document" + "'", str12, "#document");
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(document17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(elements23);
        org.junit.Assert.assertNotNull(elements24);
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test522");
        org.jsoup.nodes.Document document2 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element4 = document2.prependElement("hi!");
        org.jsoup.nodes.Element element6 = element4.append("");
        org.jsoup.select.Elements elements7 = org.jsoup.select.Selector.select("#root", element6);
        java.lang.String str8 = elements7.text();
        java.util.stream.Stream<org.jsoup.nodes.Element> elementStream9 = elements7.stream();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(elementStream9);
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test523");
        org.jsoup.safety.Whitelist whitelist1 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.jsoup.Jsoup.isValid("#root", whitelist1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test524");
        org.jsoup.safety.Whitelist whitelist2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.jsoup.Jsoup.clean("[o, h, i, !]", "<html>\n<head>\n</head>\n<body> #document\n</body>\n</html>", whitelist2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test525");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element3 = document1.prependElement("hi!");
        org.jsoup.nodes.Element element5 = element3.append("");
        org.jsoup.nodes.Document document7 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str8 = document7.tagName();
        org.jsoup.nodes.Element element10 = document7.append("hi!");
        org.jsoup.nodes.Document document12 = new org.jsoup.nodes.Document("#root");
        org.jsoup.nodes.Document document14 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.select.Elements elements16 = document14.getElementsByTag("#root");
        org.jsoup.nodes.Element[] elementArray17 = new org.jsoup.nodes.Element[] { element3, element10, document12, document14 };
        org.jsoup.select.Elements elements18 = new org.jsoup.select.Elements(elementArray17);
        java.util.stream.Stream<org.jsoup.nodes.Element> elementStream19 = elements18.parallelStream();
        java.lang.Object obj20 = null;
        boolean boolean21 = elements18.contains(obj20);
        org.jsoup.select.Elements elements23 = elements18.toggleClass("org.jsoup.select.Selector$SelectorParseException: hi!");
        org.jsoup.nodes.Element element25 = elements18.get((int) (short) 0);
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#root" + "'", str8, "#root");
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(document14);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertNotNull(elementArray17);
        org.junit.Assert.assertNotNull(elementStream19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(elements23);
        org.junit.Assert.assertNotNull(element25);
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test526");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str2 = document1.tagName();
        org.jsoup.nodes.Element element4 = document1.append("hi!");
        org.jsoup.nodes.Element element6 = document1.html("org.jsoup.select.Selector$SelectorParseException: hi!");
        org.jsoup.nodes.Element element8 = document1.prependText("<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>");
        org.jsoup.nodes.Document document10 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.select.Elements elements12 = document10.getElementsByTag("#root");
        java.lang.String str13 = elements12.text();
        org.jsoup.nodes.Document document15 = new org.jsoup.nodes.Document("#root");
        boolean boolean16 = document15.hasText();
        org.jsoup.select.Elements elements18 = document15.getElementsByIndexEquals(10);
        java.lang.Object[] objArray19 = elements18.toArray();
        boolean boolean20 = elements12.retainAll((java.util.Collection<org.jsoup.nodes.Element>) elements18);
        java.lang.String str21 = elements18.text();
        org.jsoup.nodes.Document document23 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str24 = document23.tagName();
        org.jsoup.select.Elements elements26 = document23.getElementsByIndexGreaterThan((-1));
        java.lang.String str27 = document23.toString();
        org.jsoup.nodes.Element element29 = document23.text("#root=\"hi!\"");
        int int30 = elements18.lastIndexOf((java.lang.Object) "#root=\"hi!\"");
        org.jsoup.select.Elements elements32 = elements18.select("#root");
        org.jsoup.select.Elements elements34 = elements18.removeClass("#root=\"hi!\"");
        java.util.stream.Stream<org.jsoup.nodes.Element> elementStream35 = elements18.parallelStream();
        java.util.Spliterator<org.jsoup.nodes.Element> elementSpliterator36 = elements18.spliterator();
        boolean boolean37 = element8.equals((java.lang.Object) elements18);
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#root" + "'", str2, "#root");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(document23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "#root" + "'", str24, "#root");
        org.junit.Assert.assertNotNull(elements26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>" + "'", str27, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(elements32);
        org.junit.Assert.assertNotNull(elements34);
        org.junit.Assert.assertNotNull(elementStream35);
        org.junit.Assert.assertNotNull(elementSpliterator36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test527");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("#root");
        boolean boolean2 = document1.hasText();
        org.jsoup.select.Elements elements4 = document1.getElementsByIndexEquals(10);
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor5 = elements4.listIterator();
        org.jsoup.select.Elements elements6 = new org.jsoup.select.Elements((java.util.List<org.jsoup.nodes.Element>) elements4);
        org.jsoup.nodes.Document document8 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element10 = document8.prependElement("hi!");
        org.jsoup.nodes.Document document13 = org.jsoup.parser.Parser.parseBodyFragment("#root", "#root");
        org.jsoup.nodes.Element element15 = document13.addClass("<#root>\n</#root>");
        element10.replaceWith((org.jsoup.nodes.Node) document13);
        boolean boolean17 = elements4.add((org.jsoup.nodes.Element) document13);
        org.jsoup.nodes.Document document19 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str20 = document19.tagName();
        org.jsoup.parser.Tag tag21 = document19.tag();
        org.jsoup.nodes.Element element22 = document19.body();
        java.lang.String str23 = document19.text();
        org.jsoup.select.Elements elements24 = document19.children();
        org.jsoup.nodes.Document document26 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.select.Elements elements28 = document26.getElementsByTag("#root");
        java.lang.String str29 = elements28.text();
        org.jsoup.nodes.Document document31 = new org.jsoup.nodes.Document("#root");
        boolean boolean32 = document31.hasText();
        org.jsoup.select.Elements elements34 = document31.getElementsByIndexEquals(10);
        java.lang.Object[] objArray35 = elements34.toArray();
        boolean boolean36 = elements28.retainAll((java.util.Collection<org.jsoup.nodes.Element>) elements34);
        java.lang.String str37 = elements34.text();
        org.jsoup.nodes.Document document39 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str40 = document39.tagName();
        org.jsoup.select.Elements elements42 = document39.getElementsByIndexGreaterThan((-1));
        java.lang.String str43 = document39.toString();
        org.jsoup.nodes.Element element45 = document39.text("#root=\"hi!\"");
        int int46 = elements34.lastIndexOf((java.lang.Object) "#root=\"hi!\"");
        org.jsoup.select.Elements elements48 = elements34.select("#root");
        java.util.Spliterator<org.jsoup.nodes.Element> elementSpliterator49 = elements34.spliterator();
        boolean boolean50 = elements24.addAll((java.util.Collection<org.jsoup.nodes.Element>) elements34);
        org.jsoup.nodes.Document document52 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str53 = document52.tagName();
        org.jsoup.nodes.Element element55 = document52.append("hi!");
        java.lang.String str56 = document52.outerHtml();
        org.jsoup.select.Elements elements57 = document52.children();
        org.jsoup.select.Elements elements59 = elements57.html("#root=\"\"=\"\"");
        boolean boolean60 = elements34.containsAll((java.util.Collection<org.jsoup.nodes.Element>) elements57);
        org.jsoup.select.Elements elements62 = elements57.wrap("!");
        boolean boolean63 = elements4.retainAll((java.util.Collection<org.jsoup.nodes.Element>) elements57);
        java.lang.Object[] objArray64 = elements4.toArray();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(elementItor5);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(document19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "#root" + "'", str20, "#root");
        org.junit.Assert.assertNotNull(tag21);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(elements24);
        org.junit.Assert.assertNotNull(document26);
        org.junit.Assert.assertNotNull(elements28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(elements34);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray35), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray35), "[]");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNotNull(document39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "#root" + "'", str40, "#root");
        org.junit.Assert.assertNotNull(elements42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>" + "'", str43, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.junit.Assert.assertNotNull(element45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertNotNull(elements48);
        org.junit.Assert.assertNotNull(elementSpliterator49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(document52);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "#root" + "'", str53, "#root");
        org.junit.Assert.assertNotNull(element55);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!" + "'", str56, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!");
        org.junit.Assert.assertNotNull(elements57);
        org.junit.Assert.assertNotNull(elements59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(elements62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(objArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray64), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray64), "[]");
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test528");
        org.jsoup.nodes.Document document2 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element4 = document2.prependElement("hi!");
        org.jsoup.nodes.Element element6 = element4.append("");
        org.jsoup.select.Elements elements7 = org.jsoup.select.Selector.select("#root", element6);
        org.jsoup.nodes.Document document9 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element11 = document9.prependElement("hi!");
        org.jsoup.nodes.Element element12 = document9.empty();
        org.jsoup.nodes.Element element14 = element12.toggleClass("");
        int int15 = elements7.lastIndexOf((java.lang.Object) element14);
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(document9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test529");
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parseBodyFragment("#root=\"\"", "<#root>\n</#root>");
        java.lang.String str3 = document2.toString();
        java.lang.String str4 = document2.nodeName();
        document2.title("<#root>\n</#root>=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;\"");
        java.lang.String str7 = document2.className();
        boolean boolean9 = document2.hasClass("#root=&quot;&quot;");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>" + "'", str3, "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#document" + "'", str4, "#document");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test530");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("[., j, s, o, u, p, ., s, e, l, e, c, t, ., S, e, l, e, c, t, o, r, $, S, e, l, e, c, t, o, r, P, a, r, s, e, E, x, c, e, p, t, i, o, n, :,  , h, i, !, <, h, t, m, l, >, \n, <, h, e, a, d, >, \n, <, /, h, e, a, d, >, \n, <, b, o, d, y, >, \n, <, /, b, o, d, y, >, \n, <, /, h, t, m, l, >]");
        java.lang.String str2 = document1.title();
        org.jsoup.nodes.Element element4 = document1.html("#root=\"\"=\"\"");
        org.jsoup.select.Elements elements7 = document1.getElementsByAttributeValue("[!]", "<html>\n<head>\n <title>#document</title>\n</head>\n<body>\n #root\n</body>\n</html>");
        org.jsoup.select.Elements elements10 = document1.getElementsByAttributeValue("#root", " text=\"hi!\" #root=\"\"=\"\"=\"\n&lt;!--#root=&quot;&quot;--&gt;\"");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(elements10);
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test531");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("", "\n<!--#root=\"\"-->");
        org.jsoup.select.Elements elements5 = document2.getElementsByAttributeValueContaining("\n<!--#root=\"\"-->", "#root=\"hi!\"");
        org.jsoup.nodes.Document document8 = new org.jsoup.nodes.Document("#root");
        boolean boolean9 = document8.hasText();
        org.jsoup.select.Elements elements11 = document8.getElementsByIndexEquals(10);
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor12 = elements11.listIterator();
        org.jsoup.select.Elements elements15 = elements11.attr("<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "hi!");
        org.jsoup.select.Elements elements16 = org.jsoup.select.Selector.select("#root", (java.lang.Iterable<org.jsoup.nodes.Element>) elements11);
        org.jsoup.select.Elements elements17 = new org.jsoup.select.Elements((java.util.Collection<org.jsoup.nodes.Element>) elements11);
        boolean boolean18 = elements5.containsAll((java.util.Collection<org.jsoup.nodes.Element>) elements11);
        org.jsoup.select.Elements elements20 = elements11.select("<#root>\n</#root>");
        boolean boolean21 = elements11.hasText();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(elementItor12);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(elements20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test532");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str2 = document1.tagName();
        org.jsoup.parser.Tag tag3 = document1.tag();
        org.jsoup.nodes.Element element5 = new org.jsoup.nodes.Element(tag3, "#root=\"\"");
        java.lang.String str6 = element5.toString();
        org.jsoup.nodes.Element element8 = element5.text("");
        org.jsoup.nodes.Element element10 = element8.appendText("hi!");
        org.jsoup.nodes.Document document12 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str13 = document12.tagName();
        org.jsoup.parser.Tag tag14 = document12.tag();
        org.jsoup.nodes.Document document16 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str17 = document16.tagName();
        org.jsoup.parser.Tag tag18 = document16.tag();
        boolean boolean19 = tag18.isEmpty();
        org.jsoup.nodes.Document document21 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str22 = document21.tagName();
        org.jsoup.parser.Tag tag23 = document21.tag();
        org.jsoup.nodes.Element element25 = new org.jsoup.nodes.Element(tag23, "#root=\"\"");
        org.jsoup.nodes.Document document27 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str28 = document27.tagName();
        org.jsoup.parser.Tag tag29 = document27.tag();
        boolean boolean30 = tag23.canContain(tag29);
        boolean boolean31 = tag18.isValidParent(tag23);
        org.jsoup.nodes.Document document33 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str34 = document33.tagName();
        org.jsoup.parser.Tag tag35 = document33.tag();
        boolean boolean36 = tag35.isEmpty();
        boolean boolean37 = tag23.canContain(tag35);
        boolean boolean38 = tag14.canContain(tag35);
        org.jsoup.nodes.TextNode textNode42 = new org.jsoup.nodes.TextNode("hi!", "");
        java.lang.String str43 = textNode42.text();
        org.jsoup.nodes.Attributes attributes44 = textNode42.attributes();
        attributes44.put("#root=\"\"=\"\"", "\n<!--#root=\"\"-->");
        org.jsoup.nodes.Element element48 = new org.jsoup.nodes.Element(tag35, "#comment", attributes44);
        org.jsoup.nodes.Element element51 = element48.attr("&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;hi!", "org.jsoup.select.Selector$SelectorParseException: hi!<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element52 = element8.prependChild((org.jsoup.nodes.Node) element48);
        org.jsoup.nodes.Document document54 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str55 = document54.tagName();
        java.lang.String str56 = document54.html();
        org.jsoup.nodes.Element element58 = document54.append("hi!");
        org.jsoup.nodes.Element element59 = element58.parent();
        java.util.Set<java.lang.String> strSet60 = element58.classNames();
        org.jsoup.nodes.Element element61 = element48.classNames(strSet60);
        org.jsoup.nodes.Document document64 = org.jsoup.Jsoup.parseBodyFragment("#root=\"\"", "<#root>\n</#root>");
        java.lang.String str65 = document64.toString();
        java.lang.String str66 = document64.nodeName();
        java.lang.String str67 = document64.outerHtml();
        org.jsoup.nodes.Element element68 = document64.body();
        boolean boolean69 = element48.equals((java.lang.Object) element68);
        boolean boolean70 = element68.hasText();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#root" + "'", str2, "#root");
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<#root>\n</#root>" + "'", str6, "<#root>\n</#root>");
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "#root" + "'", str13, "#root");
        org.junit.Assert.assertNotNull(tag14);
        org.junit.Assert.assertNotNull(document16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "#root" + "'", str17, "#root");
        org.junit.Assert.assertNotNull(tag18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(document21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "#root" + "'", str22, "#root");
        org.junit.Assert.assertNotNull(tag23);
        org.junit.Assert.assertNotNull(document27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "#root" + "'", str28, "#root");
        org.junit.Assert.assertNotNull(tag29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(document33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "#root" + "'", str34, "#root");
        org.junit.Assert.assertNotNull(tag35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!" + "'", str43, "hi!");
        org.junit.Assert.assertNotNull(attributes44);
        org.junit.Assert.assertNotNull(element51);
        org.junit.Assert.assertNotNull(element52);
        org.junit.Assert.assertNotNull(document54);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "#root" + "'", str55, "#root");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>" + "'", str56, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.junit.Assert.assertNotNull(element58);
        org.junit.Assert.assertNull(element59);
        org.junit.Assert.assertNotNull(strSet60);
        org.junit.Assert.assertNotNull(element61);
        org.junit.Assert.assertNotNull(document64);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>" + "'", str65, "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "#document" + "'", str66, "#document");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>" + "'", str67, "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>");
        org.junit.Assert.assertNotNull(element68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test533");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("#root");
        boolean boolean2 = document1.hasText();
        org.jsoup.select.Elements elements4 = document1.getElementsByIndexEquals(10);
        org.jsoup.nodes.Document document6 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str7 = document6.tagName();
        org.jsoup.parser.Tag tag8 = document6.tag();
        org.jsoup.nodes.TextNode textNode11 = new org.jsoup.nodes.TextNode("hi!", "");
        org.jsoup.nodes.Node node12 = textNode11.parent();
        org.jsoup.nodes.Element element13 = document6.appendChild((org.jsoup.nodes.Node) textNode11);
        org.jsoup.select.Elements elements15 = element13.getElementsByClass("#root");
        org.jsoup.nodes.Element element16 = document1.prependChild((org.jsoup.nodes.Node) element13);
        org.jsoup.select.Elements elements19 = element13.getElementsByAttributeValueNot("#text", "#document");
        org.jsoup.nodes.Element element21 = element13.appendElement("<?<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!>");
        org.jsoup.nodes.Element element23 = element13.html("hi");
        org.jsoup.nodes.Document document25 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str26 = document25.tagName();
        org.jsoup.parser.Tag tag27 = document25.tag();
        org.jsoup.nodes.Element element29 = new org.jsoup.nodes.Element(tag27, "#root=\"\"");
        java.lang.String str30 = element29.toString();
        org.jsoup.nodes.Element element32 = element29.text("");
        org.jsoup.nodes.Element element34 = element32.appendText("hi!");
        org.jsoup.nodes.Document document36 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str37 = document36.tagName();
        org.jsoup.parser.Tag tag38 = document36.tag();
        org.jsoup.nodes.Document document40 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str41 = document40.tagName();
        org.jsoup.parser.Tag tag42 = document40.tag();
        boolean boolean43 = tag42.isEmpty();
        org.jsoup.nodes.Document document45 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str46 = document45.tagName();
        org.jsoup.parser.Tag tag47 = document45.tag();
        org.jsoup.nodes.Element element49 = new org.jsoup.nodes.Element(tag47, "#root=\"\"");
        org.jsoup.nodes.Document document51 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str52 = document51.tagName();
        org.jsoup.parser.Tag tag53 = document51.tag();
        boolean boolean54 = tag47.canContain(tag53);
        boolean boolean55 = tag42.isValidParent(tag47);
        org.jsoup.nodes.Document document57 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str58 = document57.tagName();
        org.jsoup.parser.Tag tag59 = document57.tag();
        boolean boolean60 = tag59.isEmpty();
        boolean boolean61 = tag47.canContain(tag59);
        boolean boolean62 = tag38.canContain(tag59);
        org.jsoup.nodes.TextNode textNode66 = new org.jsoup.nodes.TextNode("hi!", "");
        java.lang.String str67 = textNode66.text();
        org.jsoup.nodes.Attributes attributes68 = textNode66.attributes();
        attributes68.put("#root=\"\"=\"\"", "\n<!--#root=\"\"-->");
        org.jsoup.nodes.Element element72 = new org.jsoup.nodes.Element(tag59, "#comment", attributes68);
        org.jsoup.nodes.Element element75 = element72.attr("&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;hi!", "org.jsoup.select.Selector$SelectorParseException: hi!<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element76 = element32.prependChild((org.jsoup.nodes.Node) element72);
        org.jsoup.nodes.Document document78 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str79 = document78.tagName();
        java.lang.String str80 = document78.html();
        org.jsoup.nodes.Element element82 = document78.append("hi!");
        org.jsoup.nodes.Element element83 = element82.parent();
        java.util.Set<java.lang.String> strSet84 = element82.classNames();
        org.jsoup.nodes.Element element85 = element72.classNames(strSet84);
        org.jsoup.nodes.Element element86 = element23.classNames(strSet84);
        org.jsoup.select.Elements elements87 = element23.siblingElements();
        org.jsoup.nodes.Element element88 = element23.previousElementSibling();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#root" + "'", str7, "#root");
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(document25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "#root" + "'", str26, "#root");
        org.junit.Assert.assertNotNull(tag27);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "<#root>\n</#root>" + "'", str30, "<#root>\n</#root>");
        org.junit.Assert.assertNotNull(element32);
        org.junit.Assert.assertNotNull(element34);
        org.junit.Assert.assertNotNull(document36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "#root" + "'", str37, "#root");
        org.junit.Assert.assertNotNull(tag38);
        org.junit.Assert.assertNotNull(document40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "#root" + "'", str41, "#root");
        org.junit.Assert.assertNotNull(tag42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(document45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "#root" + "'", str46, "#root");
        org.junit.Assert.assertNotNull(tag47);
        org.junit.Assert.assertNotNull(document51);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "#root" + "'", str52, "#root");
        org.junit.Assert.assertNotNull(tag53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(document57);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "#root" + "'", str58, "#root");
        org.junit.Assert.assertNotNull(tag59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "hi!" + "'", str67, "hi!");
        org.junit.Assert.assertNotNull(attributes68);
        org.junit.Assert.assertNotNull(element75);
        org.junit.Assert.assertNotNull(element76);
        org.junit.Assert.assertNotNull(document78);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "#root" + "'", str79, "#root");
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>" + "'", str80, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.junit.Assert.assertNotNull(element82);
        org.junit.Assert.assertNull(element83);
        org.junit.Assert.assertNotNull(strSet84);
        org.junit.Assert.assertNotNull(element85);
        org.junit.Assert.assertNotNull(element86);
        org.junit.Assert.assertNotNull(elements87);
        org.junit.Assert.assertNull(element88);
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test534");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("#root");
        boolean boolean2 = document1.hasText();
        org.jsoup.select.Elements elements4 = document1.getElementsByIndexEquals(10);
        java.lang.Object[] objArray5 = elements4.toArray();
        org.jsoup.nodes.Document document8 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element10 = document8.prependElement("hi!");
        org.jsoup.nodes.Element element11 = element10.parent();
        org.jsoup.nodes.Element element12 = element10.empty();
        elements4.add(0, element12);
        org.jsoup.nodes.Document document15 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str16 = document15.tagName();
        org.jsoup.parser.Tag tag17 = document15.tag();
        org.jsoup.nodes.TextNode textNode20 = new org.jsoup.nodes.TextNode("hi!", "");
        org.jsoup.nodes.Node node21 = textNode20.parent();
        org.jsoup.nodes.Element element22 = document15.appendChild((org.jsoup.nodes.Node) textNode20);
        org.jsoup.select.Elements elements24 = element22.getElementsByClass("#root");
        org.jsoup.nodes.Element element25 = element12.prependChild((org.jsoup.nodes.Node) element22);
        org.jsoup.select.Elements elements27 = element22.getElementsByAttribute("#root=\"hi!\"");
        org.jsoup.nodes.Document document29 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str30 = document29.tagName();
        org.jsoup.nodes.Element element32 = document29.append("hi!");
        java.lang.String str33 = element32.outerHtml();
        boolean boolean35 = element32.equals((java.lang.Object) 1.0f);
        java.lang.String str36 = element32.nodeName();
        org.jsoup.nodes.Element element38 = element32.wrap("#comment");
        org.jsoup.nodes.Element element39 = element22.appendChild((org.jsoup.nodes.Node) element32);
        java.lang.String str41 = element39.attr("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.select.Elements elements42 = element39.children();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(document15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "#root" + "'", str16, "#root");
        org.junit.Assert.assertNotNull(tag17);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(elements24);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(elements27);
        org.junit.Assert.assertNotNull(document29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "#root" + "'", str30, "#root");
        org.junit.Assert.assertNotNull(element32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!" + "'", str33, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "#document" + "'", str36, "#document");
        org.junit.Assert.assertNull(element38);
        org.junit.Assert.assertNotNull(element39);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(elements42);
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test535");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str2 = document1.tagName();
        java.lang.String str3 = document1.html();
        org.jsoup.nodes.Element element5 = document1.append("hi!");
        org.jsoup.nodes.Element element7 = document1.html("ohi!");
        java.lang.String str8 = document1.html();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#root" + "'", str2, "#root");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>" + "'", str3, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ohi!" + "'", str8, "ohi!");
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test536");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str2 = document1.tagName();
        org.jsoup.parser.Tag tag3 = document1.tag();
        java.lang.String str4 = document1.outerHtml();
        java.lang.String str5 = document1.outerHtml();
        org.jsoup.nodes.Element element6 = document1.body();
        org.jsoup.nodes.Element element8 = document1.wrap("<!--#root=\"\"-->=\"&lt;#root&gt;\n&lt;/#root&gt;=&quot;&amp;lt;html&amp;gt;\n&amp;lt;head&amp;gt;\n&amp;lt;/head&amp;gt;\n&amp;lt;body&amp;gt;\n&amp;lt;/body&amp;gt;\n&amp;lt;/html&amp;gt;&quot;\"");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#root" + "'", str2, "#root");
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>" + "'", str4, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>" + "'", str5, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNull(element8);
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test537");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi");
        org.jsoup.nodes.Element element3 = document1.text("<html>\n<head>\n</head>\n<body> #document\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test538");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("#root", "#root");
        org.jsoup.nodes.Element element4 = document2.addClass("<#root>\n</#root>");
        java.lang.String str5 = document2.outerHtml();
        java.lang.String str6 = document2.outerHtml();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n<head>\n</head>\n<body>\n #root\n</body>\n</html>" + "'", str5, "<html>\n<head>\n</head>\n<body>\n #root\n</body>\n</html>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<html>\n<head>\n</head>\n<body>\n #root\n</body>\n</html>" + "'", str6, "<html>\n<head>\n</head>\n<body>\n #root\n</body>\n</html>");
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test539");
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parseBodyFragment("#root=\"\"", "<#root>\n</#root>");
        java.lang.String str3 = document2.toString();
        java.lang.String str4 = document2.nodeName();
        java.lang.String str5 = document2.outerHtml();
        org.jsoup.nodes.Element element6 = document2.body();
        org.jsoup.nodes.Element element8 = document2.append("#root");
        org.jsoup.nodes.Element element10 = document2.addClass("<html>\n<head>\n</head>\n<body>\n org.jsoup.select.Selector$SelectorParseException: hi!&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;\n</body>\n</html>");
        org.jsoup.select.Elements elements11 = element10.getAllElements();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>" + "'", str3, "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#document" + "'", str4, "#document");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>" + "'", str5, "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(elements11);
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test540");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element5 = document3.prependElement("hi!");
        org.jsoup.nodes.Element element7 = element5.append("");
        org.jsoup.select.Elements elements8 = org.jsoup.select.Selector.select("#root", element7);
        java.lang.String str9 = elements8.text();
        java.lang.String str10 = elements8.outerHtml();
        org.jsoup.select.Elements elements11 = org.jsoup.select.Selector.select("org.jsoup.select.Selector$SelectorParseException: <#root>\n</#root>", (java.lang.Iterable<org.jsoup.nodes.Element>) elements8);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Element> elementList14 = elements8.subList((int) (short) -1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: fromIndex = -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(elements11);
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test541");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element3 = document1.prependElement("hi!");
        org.jsoup.nodes.Element element5 = element3.append("");
        org.jsoup.nodes.Element element7 = element3.prepend("<#root>\n</#root>");
        org.jsoup.select.Elements elements10 = element3.getElementsByAttributeValueStarting("#root=&quot;&quot;", "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>");
        org.jsoup.select.Elements elements12 = elements10.eq((int) '4');
        org.jsoup.nodes.Document document14 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str15 = document14.tagName();
        org.jsoup.nodes.Element element17 = document14.append("hi!");
        java.lang.String str18 = document14.outerHtml();
        org.jsoup.select.Elements elements19 = document14.children();
        java.lang.String str21 = document14.absUrl("<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>");
        org.jsoup.select.Elements elements24 = document14.getElementsByAttributeValueContaining("<#root>\n</#root>", "#document");
        org.jsoup.nodes.Document document26 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str27 = document26.tagName();
        org.jsoup.nodes.Element element29 = document26.append("hi!");
        java.lang.String str30 = document26.outerHtml();
        org.jsoup.select.Elements elements31 = document26.children();
        java.lang.String str33 = document26.absUrl("<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>");
        boolean boolean34 = elements24.add((org.jsoup.nodes.Element) document26);
        int int35 = elements10.indexOf((java.lang.Object) boolean34);
        org.jsoup.parser.TokenQueue tokenQueue37 = new org.jsoup.parser.TokenQueue("hi!");
        java.lang.String str38 = tokenQueue37.consumeCssIdentifier();
        java.lang.String str39 = tokenQueue37.consumeWord();
        java.lang.String str40 = tokenQueue37.consumeWord();
        boolean boolean41 = elements10.remove((java.lang.Object) tokenQueue37);
        org.jsoup.nodes.Document document43 = new org.jsoup.nodes.Document("#root");
        boolean boolean44 = document43.hasText();
        org.jsoup.select.Elements elements46 = document43.getElementsByIndexEquals(10);
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor47 = elements46.listIterator();
        org.jsoup.select.Elements elements50 = elements46.attr("<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "hi!");
        org.jsoup.nodes.Document document52 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element54 = document52.prependElement("hi!");
        org.jsoup.nodes.Element element55 = element54.parent();
        int int56 = elements46.indexOf((java.lang.Object) element55);
        org.jsoup.select.Elements elements58 = elements46.toggleClass("#document");
        boolean boolean59 = elements58.isEmpty();
        org.jsoup.select.Elements elements62 = elements58.attr("hi!", "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!");
        org.jsoup.nodes.Document document64 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str65 = document64.tagName();
        org.jsoup.parser.Tag tag66 = document64.tag();
        org.jsoup.nodes.Element element67 = document64.body();
        java.lang.String str68 = document64.text();
        org.jsoup.select.Elements elements69 = document64.children();
        boolean boolean70 = elements58.add((org.jsoup.nodes.Element) document64);
        org.jsoup.select.Elements elements71 = new org.jsoup.select.Elements((java.util.List<org.jsoup.nodes.Element>) elements58);
        int int72 = elements10.indexOf((java.lang.Object) elements58);
        java.lang.String str73 = elements10.text();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(document14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "#root" + "'", str15, "#root");
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!" + "'", str18, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!");
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(elements24);
        org.junit.Assert.assertNotNull(document26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "#root" + "'", str27, "#root");
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!" + "'", str30, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!");
        org.junit.Assert.assertNotNull(elements31);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi" + "'", str38, "hi");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(elements46);
        org.junit.Assert.assertNotNull(elementItor47);
        org.junit.Assert.assertNotNull(elements50);
        org.junit.Assert.assertNotNull(document52);
        org.junit.Assert.assertNotNull(element54);
        org.junit.Assert.assertNotNull(element55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertNotNull(elements58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(elements62);
        org.junit.Assert.assertNotNull(document64);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "#root" + "'", str65, "#root");
        org.junit.Assert.assertNotNull(tag66);
        org.junit.Assert.assertNotNull(element67);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "" + "'", str68, "");
        org.junit.Assert.assertNotNull(elements69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + (-1) + "'", int72 == (-1));
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "" + "'", str73, "");
    }

    @Test
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test542");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("#root");
        boolean boolean2 = document1.hasText();
        org.jsoup.select.Elements elements4 = document1.getElementsByIndexEquals(10);
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor5 = elements4.listIterator();
        org.jsoup.select.Elements elements8 = elements4.attr("<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "hi!");
        org.jsoup.nodes.Document document10 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element12 = document10.prependElement("hi!");
        org.jsoup.nodes.Element element13 = element12.parent();
        int int14 = elements4.indexOf((java.lang.Object) element13);
        org.jsoup.select.Elements elements16 = elements4.toggleClass("#document");
        org.jsoup.nodes.Attributes attributes17 = new org.jsoup.nodes.Attributes();
        boolean boolean19 = attributes17.equals((java.lang.Object) (byte) 100);
        boolean boolean20 = elements16.equals((java.lang.Object) attributes17);
        org.jsoup.nodes.Attribute attribute23 = new org.jsoup.nodes.Attribute("#root", "");
        java.lang.String str24 = attribute23.getKey();
        java.lang.String str25 = attribute23.html();
        attribute23.setValue("hi!");
        java.lang.String str28 = attribute23.html();
        boolean boolean29 = attributes17.equals((java.lang.Object) attribute23);
        org.jsoup.nodes.Attribute attribute32 = new org.jsoup.nodes.Attribute("#root", "");
        java.lang.String str33 = attribute32.getKey();
        attribute32.setKey("#root=\"\"");
        java.lang.String str36 = attribute32.toString();
        attribute32.setKey("\n<!--#root=\"\"-->");
        org.jsoup.nodes.Document document41 = org.jsoup.Jsoup.parseBodyFragment("#root=\"\"", "<#root>\n</#root>");
        java.lang.String str42 = document41.nodeName();
        org.jsoup.select.Elements elements44 = document41.getElementsByIndexEquals(10);
        org.jsoup.nodes.Document document47 = org.jsoup.parser.Parser.parse("", "\n<!--#root=\"\"-->");
        boolean boolean48 = document41.equals((java.lang.Object) "\n<!--#root=\"\"-->");
        org.jsoup.nodes.Element element50 = document41.prepend("<html>\n <head>\n </head>\n <body>\n </body>\n</html>hi!\n\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n\n <head>\n </head>\n\n <body>\n </body>");
        boolean boolean51 = attribute32.equals((java.lang.Object) element50);
        java.lang.String str52 = attribute32.html();
        attributes17.put(attribute32);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(elementItor5);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "#root" + "'", str24, "#root");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "#root=\"\"" + "'", str25, "#root=\"\"");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "#root=\"hi!\"" + "'", str28, "#root=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "#root" + "'", str33, "#root");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "#root=\"\"=\"\"" + "'", str36, "#root=\"\"=\"\"");
        org.junit.Assert.assertNotNull(document41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "#document" + "'", str42, "#document");
        org.junit.Assert.assertNotNull(elements44);
        org.junit.Assert.assertNotNull(document47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(element50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "<!--#root=\"\"-->=\"\"" + "'", str52, "<!--#root=\"\"-->=\"\"");
    }

    @Test
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test543");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.select.Elements elements3 = document1.getElementsByTag("#root");
        java.lang.String str4 = elements3.text();
        org.jsoup.select.Elements elements6 = elements3.toggleClass("");
        org.jsoup.select.Elements elements7 = new org.jsoup.select.Elements((java.util.List<org.jsoup.nodes.Element>) elements6);
        org.jsoup.nodes.Document document10 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element12 = document10.prependElement("hi!");
        org.jsoup.nodes.Element element14 = element12.append("");
        org.jsoup.select.Elements elements15 = org.jsoup.select.Selector.select("#root", element14);
        org.jsoup.select.Elements elements17 = elements15.prepend("\n<!--#root=\"\"-->");
        boolean boolean18 = elements6.retainAll((java.util.Collection<org.jsoup.nodes.Element>) elements15);
        org.jsoup.select.Elements elements20 = elements6.val("");
        java.util.Spliterator<org.jsoup.nodes.Element> elementSpliterator21 = elements20.spliterator();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(elements20);
        org.junit.Assert.assertNotNull(elementSpliterator21);
    }

    @Test
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test544");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element3 = document1.prependElement("hi!");
        org.jsoup.nodes.Element element5 = element3.append("");
        org.jsoup.nodes.Document document7 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str8 = document7.tagName();
        org.jsoup.nodes.Element element10 = document7.append("hi!");
        org.jsoup.nodes.Document document12 = new org.jsoup.nodes.Document("#root");
        org.jsoup.nodes.Document document14 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.select.Elements elements16 = document14.getElementsByTag("#root");
        org.jsoup.nodes.Element[] elementArray17 = new org.jsoup.nodes.Element[] { element3, element10, document12, document14 };
        org.jsoup.select.Elements elements18 = new org.jsoup.select.Elements(elementArray17);
        java.util.stream.Stream<org.jsoup.nodes.Element> elementStream19 = elements18.parallelStream();
        java.lang.Object obj20 = null;
        boolean boolean21 = elements18.contains(obj20);
        java.util.Spliterator<org.jsoup.nodes.Element> elementSpliterator22 = elements18.spliterator();
        org.jsoup.select.Elements elements24 = elements18.addClass("#root=&quot;&quot;");
        java.util.stream.Stream<org.jsoup.nodes.Element> elementStream25 = elements24.stream();
        org.jsoup.nodes.Document document28 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element30 = document28.prependElement("hi!");
        org.jsoup.nodes.Element element32 = element30.append("");
        org.jsoup.select.Elements elements33 = org.jsoup.select.Selector.select("#root", element32);
        org.jsoup.nodes.Element element34 = elements33.last();
        boolean boolean35 = elements24.containsAll((java.util.Collection<org.jsoup.nodes.Element>) elements33);
        org.jsoup.select.Elements elements37 = elements33.addClass("<#root class=\"#root &lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;hi! org.jsoup.select.Selector$SelectorParseException: &lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt; &lt;html&gt;\n &lt;head&gt;\n &lt;/head&gt;\n &lt;body&gt;\n &lt;/body&gt;\n&lt;/html&gt;hi!\n\n&lt;html&gt;\n &lt;head&gt;\n &lt;/head&gt;\n &lt;body&gt;\n &lt;/body&gt;\n&lt;/html&gt;\n\n &lt;head&gt;\n &lt;/head&gt;\n\n &lt;body&gt;\n &lt;/body&gt; org.jsoup.select.Selector$SelectorParseException: hi! ! #document #root=&quot;&amp;lt;html&amp;gt;\n&amp;lt;head&amp;gt;\n&amp;lt;/head&amp;gt;\n&amp;lt;body&amp;gt;\n&amp;lt;/body&amp;gt;\n&amp;lt;/html&amp;gt;&quot; [., j, s, o, u, p, ., s, e, l, e, c, t, ., S, e, l, e, c, t, o, r, $, S, e, l, e, c, t, o, r, P, a, r, s, e, E, x, c, e, p, t, i, o, n, :,  , h, i, !, &lt;, h, t, m, l, &gt;, \n, &lt;, h, e, a, d, &gt;, \n, &lt;, /, h, e, a, d, &gt;, \n, &lt;, b, o, d, y, &gt;, \n, &lt;, /, b, o, d, y, &gt;, \n, &lt;, /, h, t, m, l, &gt;] #root=&amp;quot;&amp;quot; org.jsoup.select.Selector$SelectorParseException: &lt;#root&gt;\n&lt;/#root&gt; &lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt; &lt;?#root=&quot;&amp;lt;html&amp;gt;\n&amp;lt;head&amp;gt;\n&amp;lt;/head&amp;gt;\n&amp;lt;body&amp;gt;\n&amp;lt;/body&amp;gt;\n&amp;lt;/html&amp;gt;&quot;&gt; #root=&quot;&quot; &lt;!&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;hi!&gt; &lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n #root=&amp;quot;&amp;quot;\n&lt;/body&gt;\n&lt;/html&gt; #text hi\">\n<#root class=\"\">\n</#root>\n</#root>");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#root" + "'", str8, "#root");
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(document14);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertNotNull(elementArray17);
        org.junit.Assert.assertNotNull(elementStream19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(elementSpliterator22);
        org.junit.Assert.assertNotNull(elements24);
        org.junit.Assert.assertNotNull(elementStream25);
        org.junit.Assert.assertNotNull(document28);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertNotNull(element32);
        org.junit.Assert.assertNotNull(elements33);
        org.junit.Assert.assertNull(element34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(elements37);
    }

    @Test
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test545");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("#root", "");
        org.jsoup.select.Elements elements4 = document2.getElementsByClass("<html>\n<head>\n</head>\n<body>\n #root\n</body>\n</html>");
        org.jsoup.nodes.Element element6 = document2.createElement("\n&lt;!--#root=&quot;&quot;--&gt;");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(element6);
    }

    @Test
    public void test546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test546");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str2 = document1.tagName();
        org.jsoup.parser.Tag tag3 = document1.tag();
        boolean boolean4 = tag3.isEmpty();
        org.jsoup.nodes.Document document6 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str7 = document6.tagName();
        org.jsoup.parser.Tag tag8 = document6.tag();
        org.jsoup.nodes.Element element10 = new org.jsoup.nodes.Element(tag8, "#root=\"\"");
        org.jsoup.nodes.Document document12 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str13 = document12.tagName();
        org.jsoup.parser.Tag tag14 = document12.tag();
        boolean boolean15 = tag8.canContain(tag14);
        boolean boolean16 = tag3.isValidParent(tag8);
        org.jsoup.nodes.Element element18 = new org.jsoup.nodes.Element(tag8, "");
        org.jsoup.nodes.Document document21 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str22 = document21.tagName();
        org.jsoup.parser.Tag tag23 = document21.tag();
        org.jsoup.nodes.Document document25 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str26 = document25.tagName();
        org.jsoup.parser.Tag tag27 = document25.tag();
        boolean boolean28 = tag27.isEmpty();
        org.jsoup.nodes.Document document30 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str31 = document30.tagName();
        org.jsoup.parser.Tag tag32 = document30.tag();
        org.jsoup.nodes.Element element34 = new org.jsoup.nodes.Element(tag32, "#root=\"\"");
        org.jsoup.nodes.Document document36 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str37 = document36.tagName();
        org.jsoup.parser.Tag tag38 = document36.tag();
        boolean boolean39 = tag32.canContain(tag38);
        boolean boolean40 = tag27.isValidParent(tag32);
        org.jsoup.nodes.Document document42 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str43 = document42.tagName();
        org.jsoup.parser.Tag tag44 = document42.tag();
        boolean boolean45 = tag44.isEmpty();
        boolean boolean46 = tag32.canContain(tag44);
        boolean boolean47 = tag23.canContain(tag44);
        org.jsoup.nodes.TextNode textNode51 = new org.jsoup.nodes.TextNode("hi!", "");
        java.lang.String str52 = textNode51.text();
        org.jsoup.nodes.Attributes attributes53 = textNode51.attributes();
        attributes53.put("#root=\"\"=\"\"", "\n<!--#root=\"\"-->");
        org.jsoup.nodes.Element element57 = new org.jsoup.nodes.Element(tag44, "#comment", attributes53);
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor58 = attributes53.iterator();
        org.jsoup.nodes.Attribute attribute61 = new org.jsoup.nodes.Attribute("#root", "");
        java.lang.String str62 = attribute61.getKey();
        java.lang.String str63 = attribute61.html();
        attribute61.setValue("hi!");
        attribute61.setKey("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        attributes53.put(attribute61);
        org.jsoup.nodes.Attributes attributes69 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor70 = attributes69.iterator();
        org.jsoup.nodes.Attributes attributes71 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor72 = attributes71.iterator();
        boolean boolean74 = attributes71.hasKey("");
        attributes71.remove("#root=\"\"");
        attributes69.addAll(attributes71);
        attributes71.remove("#root=\"\"");
        attributes53.addAll(attributes71);
        org.jsoup.nodes.Element element81 = new org.jsoup.nodes.Element(tag8, "&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;hi!", attributes71);
        org.jsoup.nodes.Attributes attributes82 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor83 = attributes82.iterator();
        java.lang.String str84 = attributes82.toString();
        java.util.List<org.jsoup.nodes.Attribute> attributeList85 = attributes82.asList();
        java.util.List<org.jsoup.nodes.Attribute> attributeList86 = attributes82.asList();
        org.jsoup.nodes.Document document89 = org.jsoup.Jsoup.parseBodyFragment("#root=\"\"", "<#root>\n</#root>");
        java.lang.String str90 = document89.toString();
        java.lang.String str91 = document89.nodeName();
        java.lang.String str92 = document89.outerHtml();
        org.jsoup.nodes.Element element93 = document89.body();
        org.jsoup.nodes.Document document94 = document89.normalise();
        org.jsoup.nodes.Node node95 = document89.parent();
        boolean boolean96 = attributes82.equals((java.lang.Object) node95);
        attributes71.addAll(attributes82);
        java.util.List<org.jsoup.nodes.Attribute> attributeList98 = attributes71.asList();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#root" + "'", str2, "#root");
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#root" + "'", str7, "#root");
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "#root" + "'", str13, "#root");
        org.junit.Assert.assertNotNull(tag14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(document21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "#root" + "'", str22, "#root");
        org.junit.Assert.assertNotNull(tag23);
        org.junit.Assert.assertNotNull(document25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "#root" + "'", str26, "#root");
        org.junit.Assert.assertNotNull(tag27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(document30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "#root" + "'", str31, "#root");
        org.junit.Assert.assertNotNull(tag32);
        org.junit.Assert.assertNotNull(document36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "#root" + "'", str37, "#root");
        org.junit.Assert.assertNotNull(tag38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(document42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "#root" + "'", str43, "#root");
        org.junit.Assert.assertNotNull(tag44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "hi!" + "'", str52, "hi!");
        org.junit.Assert.assertNotNull(attributes53);
        org.junit.Assert.assertNotNull(attributeItor58);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "#root" + "'", str62, "#root");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "#root=\"\"" + "'", str63, "#root=\"\"");
        org.junit.Assert.assertNotNull(attributeItor70);
        org.junit.Assert.assertNotNull(attributeItor72);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(attributeItor83);
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "" + "'", str84, "");
        org.junit.Assert.assertNotNull(attributeList85);
        org.junit.Assert.assertNotNull(attributeList86);
        org.junit.Assert.assertNotNull(document89);
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>" + "'", str90, "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>");
        org.junit.Assert.assertEquals("'" + str91 + "' != '" + "#document" + "'", str91, "#document");
        org.junit.Assert.assertEquals("'" + str92 + "' != '" + "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>" + "'", str92, "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>");
        org.junit.Assert.assertNotNull(element93);
        org.junit.Assert.assertNotNull(document94);
        org.junit.Assert.assertNull(node95);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
        org.junit.Assert.assertNotNull(attributeList98);
    }

    @Test
    public void test547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test547");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str2 = document1.tagName();
        org.jsoup.nodes.Element element4 = document1.append("hi!");
        org.jsoup.nodes.Element element6 = document1.prependText("hi!");
        org.jsoup.nodes.Element element8 = document1.createElement("#root=\"hi!\"");
        org.jsoup.nodes.Element element10 = document1.wrap("<?#root=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;\">");
        org.jsoup.select.Elements elements11 = document1.getAllElements();
        org.jsoup.nodes.Element element13 = document1.prependText("<html>\n  <head>\n  </head>\n  <body>\n  </body>\n </html>hi!<#root>\n  <html>\n   <head>\n   </head>\n   <body>\n   </body>\n  </html>hi!\n </#root>\n<head>\n  </head>\n  <body>\n  </body>\n\n\n<html>\n   <head>\n   </head>\n   <body>\n   </body>\n  </html>hi!\n<head>\n   </head>\n   <body>\n   </body>\n\n");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#root" + "'", str2, "#root");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNull(element10);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(element13);
    }

    @Test
    public void test548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test548");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("", "!");
        java.lang.String str4 = document2.attr("<html>\n  <head>\n  </head>\n  <body>\n  </body>\n </html>hi!<#root>\n  <html>\n   <head>\n   </head>\n   <body>\n   </body>\n  </html>hi!\n </#root>\n<head>\n  </head>\n  <body>\n  </body>\n\n\n<html>\n   <head>\n   </head>\n   <body>\n   </body>\n  </html>hi!\n<head>\n   </head>\n   <body>\n   </body>\n\n");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test549");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("#root=\"\"", "#root");
        org.jsoup.select.Elements elements5 = document2.getElementsByAttributeValueContaining("<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!", "<html>\n<head>\n</head>\n<body>\n <html> \n  <head> \n  </head> \n  <body>\n    #root=&quot;&quot;  \n  </body>\n </html>\n</body>\n</html>");
        java.lang.String str6 = elements5.html();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test550");
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parseBodyFragment("#root=\"\"", "<#root>\n</#root>");
        java.lang.String str3 = document2.outerHtml();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>" + "'", str3, "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>");
    }

    @Test
    public void test551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test551");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.select.Elements elements3 = document1.getElementsByTag("#root");
        java.lang.String str4 = elements3.text();
        org.jsoup.nodes.Document document6 = new org.jsoup.nodes.Document("#root");
        boolean boolean7 = document6.hasText();
        org.jsoup.select.Elements elements9 = document6.getElementsByIndexEquals(10);
        java.lang.Object[] objArray10 = elements9.toArray();
        boolean boolean11 = elements3.retainAll((java.util.Collection<org.jsoup.nodes.Element>) elements9);
        java.lang.String str12 = elements9.text();
        org.jsoup.nodes.Document document14 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str15 = document14.tagName();
        org.jsoup.select.Elements elements17 = document14.getElementsByIndexGreaterThan((-1));
        java.lang.String str18 = document14.toString();
        org.jsoup.nodes.Element element20 = document14.text("#root=\"hi!\"");
        int int21 = elements9.lastIndexOf((java.lang.Object) "#root=\"hi!\"");
        org.jsoup.nodes.Element element22 = elements9.first();
        java.lang.String str23 = elements9.text();
        org.jsoup.select.Elements elements25 = elements9.eq((int) (byte) 10);
        org.jsoup.select.Elements elements27 = elements25.wrap("&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;hi!");
        boolean boolean28 = elements27.hasText();
        org.jsoup.nodes.Document document30 = new org.jsoup.nodes.Document("#root");
        boolean boolean31 = document30.hasText();
        org.jsoup.select.Elements elements33 = document30.getElementsByIndexEquals(10);
        java.lang.Object[] objArray34 = elements33.toArray();
        org.jsoup.nodes.Document document37 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element39 = document37.prependElement("hi!");
        org.jsoup.nodes.Element element40 = element39.parent();
        org.jsoup.nodes.Element element41 = element39.empty();
        elements33.add(0, element41);
        org.jsoup.select.Elements elements44 = elements33.html("&lt;?#root=&quot;&amp;lt;html&amp;gt; &amp;lt;head&amp;gt; &amp;lt;/head&amp;gt; &amp;lt;body&amp;gt; &amp;lt;/body&amp;gt; &amp;lt;/html&amp;gt;&quot;&gt;");
        org.jsoup.nodes.Document document46 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str47 = document46.tagName();
        org.jsoup.parser.Tag tag48 = document46.tag();
        java.lang.String str49 = document46.outerHtml();
        java.lang.String str50 = document46.outerHtml();
        java.lang.String str51 = document46.title();
        org.jsoup.nodes.Element element52 = document46.empty();
        org.jsoup.nodes.Element element54 = element52.append("#root=\"\"=\"\"");
        org.jsoup.nodes.Document document56 = new org.jsoup.nodes.Document("#root");
        boolean boolean57 = document56.hasText();
        org.jsoup.select.Elements elements59 = document56.getElementsByIndexEquals(10);
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor60 = elements59.listIterator();
        boolean boolean61 = elements59.hasText();
        boolean boolean62 = element54.equals((java.lang.Object) elements59);
        org.jsoup.select.Elements elements64 = elements59.wrap("<html>\n<head>\n</head>\n<body>\n #root\n</body>\n</html>");
        boolean boolean65 = elements33.removeAll((java.util.Collection<org.jsoup.nodes.Element>) elements59);
        boolean boolean66 = elements27.removeAll((java.util.Collection<org.jsoup.nodes.Element>) elements33);
        org.jsoup.select.Elements elements68 = elements27.val("<html>\n<head>\n <title>#document</title>\n</head>\n<body>\n #root\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(document14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "#root" + "'", str15, "#root");
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>" + "'", str18, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNull(element22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(elements25);
        org.junit.Assert.assertNotNull(elements27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(elements33);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray34), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray34), "[]");
        org.junit.Assert.assertNotNull(document37);
        org.junit.Assert.assertNotNull(element39);
        org.junit.Assert.assertNotNull(element40);
        org.junit.Assert.assertNotNull(element41);
        org.junit.Assert.assertNotNull(elements44);
        org.junit.Assert.assertNotNull(document46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "#root" + "'", str47, "#root");
        org.junit.Assert.assertNotNull(tag48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>" + "'", str49, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>" + "'", str50, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertNotNull(element52);
        org.junit.Assert.assertNotNull(element54);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(elements59);
        org.junit.Assert.assertNotNull(elementItor60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(elements64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(elements68);
    }

    @Test
    public void test552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test552");
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parseBodyFragment("#root=\"\"", "<#root>\n</#root>");
        java.lang.String str3 = document2.toString();
        java.lang.String str4 = document2.nodeName();
        java.lang.String str5 = document2.outerHtml();
        org.jsoup.nodes.Node node8 = document2.attr("hi\n<!--#root=\"\"-->org.jsoup.select.Selector$SelectorParseException: hi!<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "<!--#root=\"\"-->");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>" + "'", str3, "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#document" + "'", str4, "#document");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>" + "'", str5, "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>");
        org.junit.Assert.assertNotNull(node8);
    }

    @Test
    public void test553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test553");
        org.jsoup.safety.Whitelist whitelist2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.jsoup.Jsoup.clean("<html>\n<head>\n</head>\n<body> #root\n</body>\n</html>", "#data", whitelist2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test554");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("#root");
        org.jsoup.nodes.Element element2 = document1.empty();
        org.jsoup.parser.Tag tag3 = document1.tag();
        org.jsoup.nodes.Document document5 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str6 = document5.tagName();
        org.jsoup.parser.Tag tag7 = document5.tag();
        java.lang.String str8 = document5.outerHtml();
        java.lang.String str9 = document5.outerHtml();
        java.lang.String str10 = document5.title();
        org.jsoup.nodes.Element element11 = document5.empty();
        org.jsoup.nodes.Element element12 = document1.prependChild((org.jsoup.nodes.Node) element11);
        org.jsoup.select.Elements elements14 = element11.getElementsByIndexEquals(0);
        org.jsoup.select.Elements elements16 = elements14.eq(4);
        org.jsoup.nodes.Document document18 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str19 = document18.id();
        org.jsoup.select.Elements elements20 = document18.children();
        org.jsoup.select.Elements elements22 = elements20.html("#root=\"\"");
        boolean boolean24 = elements22.hasAttr("");
        org.jsoup.select.Elements elements27 = elements22.attr("ohi!", "hi!");
        int int28 = elements14.lastIndexOf((java.lang.Object) elements22);
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor30 = elements14.listIterator((int) (short) 0);
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertNotNull(document5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#root" + "'", str6, "#root");
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>" + "'", str8, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>" + "'", str9, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertNotNull(document18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(elements20);
        org.junit.Assert.assertNotNull(elements22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(elements27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(elementItor30);
    }

    @Test
    public void test555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test555");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str2 = document1.tagName();
        org.jsoup.nodes.Element element4 = document1.append("hi!");
        java.lang.String str5 = element4.outerHtml();
        boolean boolean7 = element4.equals((java.lang.Object) 1.0f);
        java.lang.String str8 = element4.nodeName();
        org.jsoup.nodes.Element element10 = element4.prependText("org.jsoup.select.Selector$SelectorParseException: hi!<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#root" + "'", str2, "#root");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!" + "'", str5, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#document" + "'", str8, "#document");
        org.junit.Assert.assertNotNull(element10);
    }

    @Test
    public void test556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test556");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("#data", "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!");
        java.lang.String str3 = document2.data();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test557");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str2 = document1.tagName();
        java.lang.String str3 = document1.html();
        org.jsoup.nodes.Element element5 = document1.append("#root=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;\"");
        java.lang.String str6 = document1.id();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#root" + "'", str2, "#root");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>" + "'", str3, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test558");
        org.jsoup.safety.Whitelist whitelist1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.jsoup.Jsoup.clean("<html>\n<head>\n</head>\n<body>\n <html> \n  <head> \n  </head> \n  <body>\n    #root=&quot;&quot;  \n  </body>\n </html>\n</body>\n</html>", whitelist1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test559");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("<html>\n <head>\n </head>\n <body>\n </body>\n</html>hi!\n<head>\n </head>\n <body>\n </body>\n\n", "aorg.jsoup.select.Selector$SelectorParseException: hi!<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document2);
    }

    @Test
    public void test560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test560");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("#root", "");
        java.lang.String str3 = document2.className();
        org.jsoup.nodes.Node node6 = document2.attr("&lt;?#root=&quot;&amp;lt;html&amp;gt; &amp;lt;head&amp;gt; &amp;lt;/head&amp;gt; &amp;lt;body&amp;gt; &amp;lt;/body&amp;gt; &amp;lt;/html&amp;gt;&quot;&gt;", "");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(node6);
    }

    @Test
    public void test561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test561");
        org.jsoup.safety.Whitelist whitelist1 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.jsoup.Jsoup.isValid("&lt;?#root=&quot;&amp;lt;html&amp;gt; &amp;lt;head&amp;gt; &amp;lt;/head&amp;gt; &amp;lt;body&amp;gt; &amp;lt;/body&amp;gt; &amp;lt;/html&amp;gt;&quot;&gt;", whitelist1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test562");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("#root");
        boolean boolean2 = document1.hasText();
        org.jsoup.select.Elements elements4 = document1.getElementsByIndexEquals(10);
        org.jsoup.nodes.Document document6 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str7 = document6.tagName();
        org.jsoup.parser.Tag tag8 = document6.tag();
        org.jsoup.nodes.TextNode textNode11 = new org.jsoup.nodes.TextNode("hi!", "");
        org.jsoup.nodes.Node node12 = textNode11.parent();
        org.jsoup.nodes.Element element13 = document6.appendChild((org.jsoup.nodes.Node) textNode11);
        org.jsoup.select.Elements elements15 = element13.getElementsByClass("#root");
        org.jsoup.nodes.Element element16 = document1.prependChild((org.jsoup.nodes.Node) element13);
        org.jsoup.select.Elements elements19 = element13.getElementsByAttributeValueNot("#text", "#document");
        org.jsoup.nodes.Element element21 = element13.appendElement("<?<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!>");
        org.jsoup.select.Elements elements22 = element21.siblingElements();
        org.jsoup.nodes.Document document25 = org.jsoup.parser.Parser.parseBodyFragment("#root", "#root");
        java.lang.String str27 = document25.absUrl("#root=\"\"");
        document25.title("#document");
        document25.setBaseUri("<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!");
        org.jsoup.nodes.Element element32 = element21.appendChild((org.jsoup.nodes.Node) document25);
        org.jsoup.nodes.Element element34 = document25.text("\n<#root class=\"\">\n</#root>");
        org.jsoup.select.Elements elements36 = element34.getElementsByAttribute("<aorg>\n</aorg>");
        org.jsoup.select.Elements elements38 = elements36.prepend("&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;hi!org.jsoup.select.Selector$SelectorParseException: hi!<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#root" + "'", str7, "#root");
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(elements22);
        org.junit.Assert.assertNotNull(document25);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(element32);
        org.junit.Assert.assertNotNull(element34);
        org.junit.Assert.assertNotNull(elements36);
        org.junit.Assert.assertNotNull(elements38);
    }

    @Test
    public void test563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test563");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element3 = document1.prependElement("hi!");
        org.jsoup.nodes.Element element5 = element3.append("");
        org.jsoup.nodes.Element element6 = element5.previousElementSibling();
        java.lang.String str7 = element5.nodeName();
        org.jsoup.nodes.Element element9 = element5.appendElement("#declaration");
        org.jsoup.nodes.Element element11 = element5.prependText("<#root>\n<html>\n <head>\n </head>\n <body>\n  #root=&quot;&quot;\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!");
        java.lang.String str12 = element11.outerHtml();
        org.jsoup.select.Elements elements13 = element11.getAllElements();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNull(element6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\n<hi!>\n&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; #root=&amp;quot;&amp;quot; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;hi!<#declaration>\n</#declaration>\n</hi!>" + "'", str12, "\n<hi!>\n&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; #root=&amp;quot;&amp;quot; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;hi!<#declaration>\n</#declaration>\n</hi!>");
        org.junit.Assert.assertNotNull(elements13);
    }

    @Test
    public void test564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test564");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("#root", "#root");
        org.jsoup.nodes.Element element4 = document2.addClass("<#root>\n</#root>");
        org.jsoup.select.Elements elements5 = element4.children();
        java.lang.String str6 = element4.nodeName();
        org.jsoup.nodes.Element element8 = element4.getElementById("<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element10 = element8.appendElement("<!--#root=\"\"-->=\"&lt;#root&gt;\n&lt;/#root&gt;=&quot;&amp;lt;html&amp;gt;\n&amp;lt;head&amp;gt;\n&amp;lt;/head&amp;gt;\n&amp;lt;body&amp;gt;\n&amp;lt;/body&amp;gt;\n&amp;lt;/html&amp;gt;&quot;\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#document" + "'", str6, "#document");
        org.junit.Assert.assertNull(element8);
    }

    @Test
    public void test565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test565");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("#root", "#root");
        org.jsoup.nodes.Element element4 = document2.addClass("<#root>\n</#root>");
        java.lang.String str5 = element4.baseUri();
        org.jsoup.select.Elements elements7 = element4.getElementsByTag("org.jsoup.select.Selector$SelectorParseException: org.jsoup.select.Selector$SelectorParseException: <html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.lang.String str8 = element4.tagName();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#root" + "'", str5, "#root");
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#root" + "'", str8, "#root");
    }

    @Test
    public void test566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test566");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str2 = document1.tagName();
        java.lang.String str3 = document1.html();
        org.jsoup.nodes.Element element5 = document1.append("hi!");
        org.jsoup.nodes.Element element7 = document1.html("ohi!");
        java.lang.String str8 = document1.nodeName();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#root" + "'", str2, "#root");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>" + "'", str3, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#document" + "'", str8, "#document");
    }

    @Test
    public void test567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test567");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str2 = document1.tagName();
        java.lang.String str3 = document1.html();
        org.jsoup.nodes.Element element5 = document1.append("hi!");
        boolean boolean7 = document1.hasAttr("#declaration");
        java.lang.String str8 = document1.html();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#root" + "'", str2, "#root");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>" + "'", str3, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!" + "'", str8, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!");
    }

    @Test
    public void test568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test568");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str2 = document1.tagName();
        org.jsoup.parser.Tag tag3 = document1.tag();
        org.jsoup.nodes.Element element5 = new org.jsoup.nodes.Element(tag3, "#root=\"\"");
        java.lang.String str6 = element5.toString();
        org.jsoup.nodes.Element element8 = element5.text("");
        org.jsoup.nodes.Element element10 = element8.appendText("hi!");
        org.jsoup.nodes.Document document12 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str13 = document12.tagName();
        org.jsoup.parser.Tag tag14 = document12.tag();
        org.jsoup.nodes.Document document16 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str17 = document16.tagName();
        org.jsoup.parser.Tag tag18 = document16.tag();
        boolean boolean19 = tag18.isEmpty();
        org.jsoup.nodes.Document document21 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str22 = document21.tagName();
        org.jsoup.parser.Tag tag23 = document21.tag();
        org.jsoup.nodes.Element element25 = new org.jsoup.nodes.Element(tag23, "#root=\"\"");
        org.jsoup.nodes.Document document27 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str28 = document27.tagName();
        org.jsoup.parser.Tag tag29 = document27.tag();
        boolean boolean30 = tag23.canContain(tag29);
        boolean boolean31 = tag18.isValidParent(tag23);
        org.jsoup.nodes.Document document33 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str34 = document33.tagName();
        org.jsoup.parser.Tag tag35 = document33.tag();
        boolean boolean36 = tag35.isEmpty();
        boolean boolean37 = tag23.canContain(tag35);
        boolean boolean38 = tag14.canContain(tag35);
        org.jsoup.nodes.TextNode textNode42 = new org.jsoup.nodes.TextNode("hi!", "");
        java.lang.String str43 = textNode42.text();
        org.jsoup.nodes.Attributes attributes44 = textNode42.attributes();
        attributes44.put("#root=\"\"=\"\"", "\n<!--#root=\"\"-->");
        org.jsoup.nodes.Element element48 = new org.jsoup.nodes.Element(tag35, "#comment", attributes44);
        org.jsoup.nodes.Element element51 = element48.attr("&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;hi!", "org.jsoup.select.Selector$SelectorParseException: hi!<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element52 = element8.prependChild((org.jsoup.nodes.Node) element48);
        org.jsoup.nodes.Document document54 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str55 = document54.tagName();
        java.lang.String str56 = document54.html();
        org.jsoup.nodes.Element element58 = document54.append("hi!");
        org.jsoup.nodes.Element element59 = element58.parent();
        java.util.Set<java.lang.String> strSet60 = element58.classNames();
        org.jsoup.nodes.Element element61 = element48.classNames(strSet60);
        org.jsoup.nodes.Document document64 = org.jsoup.Jsoup.parseBodyFragment("#root=\"\"", "<#root>\n</#root>");
        java.lang.String str65 = document64.toString();
        java.lang.String str66 = document64.nodeName();
        java.lang.String str67 = document64.outerHtml();
        org.jsoup.nodes.Element element68 = document64.body();
        boolean boolean69 = element48.equals((java.lang.Object) element68);
        java.lang.String str70 = element48.html();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#root" + "'", str2, "#root");
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<#root>\n</#root>" + "'", str6, "<#root>\n</#root>");
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "#root" + "'", str13, "#root");
        org.junit.Assert.assertNotNull(tag14);
        org.junit.Assert.assertNotNull(document16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "#root" + "'", str17, "#root");
        org.junit.Assert.assertNotNull(tag18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(document21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "#root" + "'", str22, "#root");
        org.junit.Assert.assertNotNull(tag23);
        org.junit.Assert.assertNotNull(document27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "#root" + "'", str28, "#root");
        org.junit.Assert.assertNotNull(tag29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(document33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "#root" + "'", str34, "#root");
        org.junit.Assert.assertNotNull(tag35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!" + "'", str43, "hi!");
        org.junit.Assert.assertNotNull(attributes44);
        org.junit.Assert.assertNotNull(element51);
        org.junit.Assert.assertNotNull(element52);
        org.junit.Assert.assertNotNull(document54);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "#root" + "'", str55, "#root");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>" + "'", str56, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.junit.Assert.assertNotNull(element58);
        org.junit.Assert.assertNull(element59);
        org.junit.Assert.assertNotNull(strSet60);
        org.junit.Assert.assertNotNull(element61);
        org.junit.Assert.assertNotNull(document64);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>" + "'", str65, "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "#document" + "'", str66, "#document");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>" + "'", str67, "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>");
        org.junit.Assert.assertNotNull(element68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
    }

    @Test
    public void test569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test569");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("<?#root=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;\">", "\n<!--<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!-->");
        org.junit.Assert.assertNotNull(document2);
    }

    @Test
    public void test570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test570");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("", "\n<!--#root=\"\"-->");
        org.jsoup.select.Elements elements5 = document2.getElementsByAttributeValueContaining("\n<!--#root=\"\"-->", "#root=\"hi!\"");
        org.jsoup.nodes.Document document8 = new org.jsoup.nodes.Document("#root");
        boolean boolean9 = document8.hasText();
        org.jsoup.select.Elements elements11 = document8.getElementsByIndexEquals(10);
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor12 = elements11.listIterator();
        org.jsoup.select.Elements elements15 = elements11.attr("<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "hi!");
        org.jsoup.select.Elements elements16 = org.jsoup.select.Selector.select("#root", (java.lang.Iterable<org.jsoup.nodes.Element>) elements11);
        org.jsoup.select.Elements elements17 = new org.jsoup.select.Elements((java.util.Collection<org.jsoup.nodes.Element>) elements11);
        boolean boolean18 = elements5.containsAll((java.util.Collection<org.jsoup.nodes.Element>) elements11);
        org.jsoup.select.Elements elements19 = new org.jsoup.select.Elements((java.util.List<org.jsoup.nodes.Element>) elements5);
        org.jsoup.select.Elements elements21 = elements19.eq(100);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = elements19.is("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(elementItor12);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(elements21);
    }

    @Test
    public void test571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test571");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        java.lang.String str3 = textNode2.text();
        org.jsoup.nodes.Attributes attributes4 = textNode2.attributes();
        int int5 = attributes4.size();
        org.jsoup.nodes.Attribute attribute8 = new org.jsoup.nodes.Attribute("<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!", "#root=\"hi!\"");
        org.jsoup.nodes.Document document10 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element12 = document10.prependElement("hi!");
        org.jsoup.nodes.Element element14 = element12.append("");
        boolean boolean15 = attribute8.equals((java.lang.Object) "");
        java.lang.String str16 = attribute8.getKey();
        attributes4.put(attribute8);
        int int18 = attributes4.size();
        java.lang.String str20 = attributes4.get("org");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!" + "'", str16, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test572");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str2 = document1.tagName();
        org.jsoup.nodes.Element element4 = document1.append("hi!");
        org.jsoup.nodes.Element element6 = document1.prependText("hi!");
        org.jsoup.nodes.Element element8 = document1.createElement("#root=\"hi!\"");
        org.jsoup.nodes.Element element10 = document1.append("ohi!");
        document1.setBaseUri("<html>\n<head>\n <title>#document</title>\n</head>\n<body>\n #root\n</body>\n</html>");
        boolean boolean13 = document1.hasText();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#root" + "'", str2, "#root");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test573");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str2 = document1.tagName();
        org.jsoup.parser.Tag tag3 = document1.tag();
        java.lang.String str4 = document1.outerHtml();
        java.lang.String str5 = document1.outerHtml();
        java.lang.String str6 = document1.title();
        org.jsoup.nodes.Element element7 = document1.empty();
        org.jsoup.nodes.Element element9 = document1.html("org.jsoup.select.Selector$SelectorParseException: <#root>\n</#root>");
        java.lang.String str10 = document1.nodeName();
        org.jsoup.parser.Tag tag11 = document1.tag();
        java.lang.String str12 = document1.nodeName();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#root" + "'", str2, "#root");
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>" + "'", str4, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>" + "'", str5, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#document" + "'", str10, "#document");
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "#document" + "'", str12, "#document");
    }

    @Test
    public void test574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test574");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parse("");
        org.jsoup.parser.Tag tag2 = document1.tag();
        java.lang.String str3 = document1.outerHtml();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(tag2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>" + "'", str3, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
    }

    @Test
    public void test575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test575");
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parseBodyFragment("#root=\"\"", "<#root>\n</#root>");
        java.lang.String str3 = document2.nodeName();
        org.jsoup.select.Elements elements5 = document2.getElementsByIndexEquals(10);
        java.lang.String str6 = document2.data();
        java.lang.String str7 = document2.nodeName();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#document" + "'", str7, "#document");
    }

    @Test
    public void test576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test576");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parse("org.jsoup.select.Selector$SelectorParseException: <html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValue("<html>\n<head>\n</head>\n<body>\n org.jsoup.select.Selector$SelectorParseException: hi!&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;\n</body>\n</html>", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
    }

    @Test
    public void test577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test577");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("#data", "org.jsoup.select.Selector$SelectorParseException: <#root>\n</#root>");
        org.jsoup.nodes.Document document5 = org.jsoup.Jsoup.parse("#root=\"\"=\"\"", "#data");
        boolean boolean6 = attribute2.equals((java.lang.Object) "#root=\"\"=\"\"");
        attribute2.setValue("#root=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;\"");
        org.junit.Assert.assertNotNull(document5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test578");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parse("hi");
        org.junit.Assert.assertNotNull(document1);
    }

    @Test
    public void test579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test579");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("#data", "#root");
        org.jsoup.parser.Tag tag3 = document2.tag();
        org.jsoup.nodes.Document document5 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str6 = document5.tagName();
        org.jsoup.parser.Tag tag7 = document5.tag();
        org.jsoup.nodes.Element element9 = new org.jsoup.nodes.Element(tag7, "#root=\"\"");
        java.lang.String str10 = element9.toString();
        org.jsoup.select.Elements elements11 = element9.children();
        boolean boolean12 = tag3.equals((java.lang.Object) element9);
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertNotNull(document5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#root" + "'", str6, "#root");
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<#root>\n</#root>" + "'", str10, "<#root>\n</#root>");
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test580");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("#root", "#root");
        java.lang.String str3 = document2.nodeName();
        org.jsoup.nodes.Element element5 = document2.text("<html>\n <head>\n </head>\n <body>\n </body>\n</html>hi!\n<head>\n </head>\n <body>\n </body>\n\n");
        org.jsoup.nodes.Document document7 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str8 = document7.tagName();
        java.lang.String str9 = document7.html();
        org.jsoup.nodes.Element element11 = document7.append("#root=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;\"");
        java.util.Set<java.lang.String> strSet12 = element11.classNames();
        org.jsoup.nodes.Element element13 = document2.classNames(strSet12);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element15 = document2.child((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#root" + "'", str8, "#root");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>" + "'", str9, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNotNull(element13);
    }

    @Test
    public void test581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test581");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("#root");
        boolean boolean2 = document1.hasText();
        org.jsoup.select.Elements elements4 = document1.getElementsByIndexEquals(10);
        java.lang.Object[] objArray5 = elements4.toArray();
        org.jsoup.nodes.Document document8 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element10 = document8.prependElement("hi!");
        org.jsoup.nodes.Element element11 = element10.parent();
        org.jsoup.nodes.Element element12 = element10.empty();
        elements4.add(0, element12);
        org.jsoup.nodes.Document document15 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str16 = document15.tagName();
        org.jsoup.parser.Tag tag17 = document15.tag();
        org.jsoup.nodes.TextNode textNode20 = new org.jsoup.nodes.TextNode("hi!", "");
        org.jsoup.nodes.Node node21 = textNode20.parent();
        org.jsoup.nodes.Element element22 = document15.appendChild((org.jsoup.nodes.Node) textNode20);
        org.jsoup.select.Elements elements24 = element22.getElementsByClass("#root");
        org.jsoup.nodes.Element element25 = element12.prependChild((org.jsoup.nodes.Node) element22);
        org.jsoup.select.Elements elements27 = element22.getElementsByAttribute("#root=\"hi!\"");
        org.jsoup.nodes.Document document29 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str30 = document29.tagName();
        org.jsoup.nodes.Element element32 = document29.append("hi!");
        java.lang.String str33 = element32.outerHtml();
        boolean boolean35 = element32.equals((java.lang.Object) 1.0f);
        java.lang.String str36 = element32.nodeName();
        org.jsoup.nodes.Element element38 = element32.wrap("#comment");
        org.jsoup.nodes.Element element39 = element22.appendChild((org.jsoup.nodes.Node) element32);
        java.lang.String str41 = element39.attr("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.util.List<org.jsoup.nodes.Node> nodeList42 = element39.siblingNodes();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(document15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "#root" + "'", str16, "#root");
        org.junit.Assert.assertNotNull(tag17);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(elements24);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(elements27);
        org.junit.Assert.assertNotNull(document29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "#root" + "'", str30, "#root");
        org.junit.Assert.assertNotNull(element32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!" + "'", str33, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "#document" + "'", str36, "#document");
        org.junit.Assert.assertNull(element38);
        org.junit.Assert.assertNotNull(element39);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(nodeList42);
    }

    @Test
    public void test582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test582");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("<html>\n <head>\n </head>\n <body>\n </body>\n</html>hi!\n\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n\n <head>\n </head>\n\n <body>\n </body>", "#root=\"\"=\"\"");
        org.jsoup.nodes.Element element4 = document2.prepend("<html>\n <head>\n </head>\n <body>\n </body>\n</html>hi!<<?<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!>>\n</<?<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!>>");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
    }

    @Test
    public void test583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test583");
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parseBodyFragment("#root=\"\"", "<#root>\n</#root>");
        java.lang.String str3 = document2.nodeName();
        org.jsoup.select.Elements elements5 = document2.getElementsByIndexEquals(10);
        java.lang.String str6 = document2.toString();
        org.jsoup.nodes.Element element8 = document2.append("hi!");
        org.jsoup.nodes.Element element9 = document2.head();
        org.jsoup.nodes.Element element11 = element9.prependElement(" text=\"hi!\"");
        org.jsoup.nodes.Node node12 = element9.parent();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>" + "'", str6, "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>");
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(node12);
    }

    @Test
    public void test584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test584");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("", "");
        java.lang.String str3 = document2.nodeName();
        org.jsoup.nodes.Document document6 = org.jsoup.parser.Parser.parse("", "aorg");
        java.util.Set<java.lang.String> strSet7 = document6.classNames();
        org.jsoup.nodes.Element element8 = document2.prependChild((org.jsoup.nodes.Node) document6);
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(element8);
    }

    @Test
    public void test585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test585");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element3 = document1.prependElement("hi!");
        org.jsoup.nodes.Element element5 = element3.append("");
        org.jsoup.nodes.Element element6 = element5.previousElementSibling();
        java.lang.String str7 = element5.nodeName();
        org.jsoup.select.Elements elements10 = element5.getElementsByAttributeValueStarting("<!<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!>", "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>");
        org.jsoup.nodes.Document document12 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str13 = document12.tagName();
        org.jsoup.parser.Tag tag14 = document12.tag();
        org.jsoup.nodes.Element element16 = new org.jsoup.nodes.Element(tag14, "#root=\"\"");
        java.lang.String str17 = element16.toString();
        org.jsoup.nodes.Element element19 = element16.text("");
        org.jsoup.nodes.Element element21 = element16.removeClass("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.select.Elements elements23 = element16.getElementsByIndexGreaterThan(0);
        boolean boolean24 = elements10.addAll((java.util.Collection<org.jsoup.nodes.Element>) elements23);
        org.jsoup.nodes.Document document26 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str27 = document26.tagName();
        java.lang.String str28 = document26.html();
        org.jsoup.nodes.Element element30 = document26.append("hi!");
        boolean boolean32 = document26.hasAttr("#declaration");
        org.jsoup.nodes.Document document35 = org.jsoup.Jsoup.parseBodyFragment("#root=\"\"", "<#root>\n</#root>");
        java.lang.String str36 = document35.toString();
        java.lang.String str37 = document35.nodeName();
        java.lang.String str38 = document35.outerHtml();
        org.jsoup.nodes.Element element39 = document35.body();
        org.jsoup.nodes.Document document40 = document35.normalise();
        org.jsoup.nodes.Element element41 = document26.prependChild((org.jsoup.nodes.Node) document40);
        org.jsoup.select.Elements elements43 = document26.getElementsByIndexEquals((int) 'o');
        org.jsoup.select.Elements elements45 = elements43.eq((int) (byte) 100);
        boolean boolean46 = elements23.containsAll((java.util.Collection<org.jsoup.nodes.Element>) elements45);
        java.util.function.UnaryOperator<org.jsoup.nodes.Element> elementUnaryOperator47 = null;
        // The following exception was thrown during execution in test generation
        try {
            elements23.replaceAll(elementUnaryOperator47);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNull(element6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "#root" + "'", str13, "#root");
        org.junit.Assert.assertNotNull(tag14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "<#root>\n</#root>" + "'", str17, "<#root>\n</#root>");
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(elements23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(document26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "#root" + "'", str27, "#root");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>" + "'", str28, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(document35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>" + "'", str36, "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "#document" + "'", str37, "#document");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>" + "'", str38, "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>");
        org.junit.Assert.assertNotNull(element39);
        org.junit.Assert.assertNotNull(document40);
        org.junit.Assert.assertNotNull(element41);
        org.junit.Assert.assertNotNull(elements43);
        org.junit.Assert.assertNotNull(elements45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
    }

    @Test
    public void test586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test586");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str2 = document1.tagName();
        org.jsoup.nodes.Element element4 = document1.append("hi!");
        java.lang.String str5 = document1.outerHtml();
        org.jsoup.select.Elements elements6 = document1.children();
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("#root");
        boolean boolean10 = document9.hasText();
        org.jsoup.select.Elements elements12 = document9.getElementsByIndexEquals(10);
        org.jsoup.nodes.Document document14 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str15 = document14.tagName();
        org.jsoup.parser.Tag tag16 = document14.tag();
        org.jsoup.nodes.TextNode textNode19 = new org.jsoup.nodes.TextNode("hi!", "");
        org.jsoup.nodes.Node node20 = textNode19.parent();
        org.jsoup.nodes.Element element21 = document14.appendChild((org.jsoup.nodes.Node) textNode19);
        org.jsoup.select.Elements elements23 = element21.getElementsByClass("#root");
        org.jsoup.nodes.Element element24 = document9.prependChild((org.jsoup.nodes.Node) element21);
        org.jsoup.select.Elements elements27 = element21.getElementsByAttributeValueNot("#text", "#document");
        org.jsoup.nodes.Element element29 = element21.appendElement("<?<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!>");
        elements6.add((int) (byte) 1, element21);
        org.jsoup.select.Elements elements32 = elements6.eq((int) (byte) 10);
        boolean boolean34 = elements32.is("<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!=\"#root=&quot;hi!&quot;\"");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#root" + "'", str2, "#root");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!" + "'", str5, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(document14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "#root" + "'", str15, "#root");
        org.junit.Assert.assertNotNull(tag16);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(elements23);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(elements27);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertNotNull(elements32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test587");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element3 = document1.prependElement("hi!");
        org.jsoup.nodes.Element element5 = element3.append("");
        org.jsoup.nodes.Element element7 = element3.prepend("<#root>\n</#root>");
        org.jsoup.select.Elements elements10 = element3.getElementsByAttributeValueStarting("#root=&quot;&quot;", "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>");
        org.jsoup.select.Elements elements12 = elements10.eq((int) '4');
        org.jsoup.nodes.Document document14 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str15 = document14.tagName();
        org.jsoup.nodes.Element element17 = document14.append("hi!");
        java.lang.String str18 = document14.outerHtml();
        org.jsoup.select.Elements elements19 = document14.children();
        java.lang.String str21 = document14.absUrl("<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>");
        org.jsoup.select.Elements elements24 = document14.getElementsByAttributeValueContaining("<#root>\n</#root>", "#document");
        org.jsoup.nodes.Document document26 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str27 = document26.tagName();
        org.jsoup.nodes.Element element29 = document26.append("hi!");
        java.lang.String str30 = document26.outerHtml();
        org.jsoup.select.Elements elements31 = document26.children();
        java.lang.String str33 = document26.absUrl("<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>");
        boolean boolean34 = elements24.add((org.jsoup.nodes.Element) document26);
        int int35 = elements10.indexOf((java.lang.Object) boolean34);
        org.jsoup.parser.TokenQueue tokenQueue37 = new org.jsoup.parser.TokenQueue("hi!");
        java.lang.String str38 = tokenQueue37.consumeCssIdentifier();
        java.lang.String str39 = tokenQueue37.consumeWord();
        java.lang.String str40 = tokenQueue37.consumeWord();
        boolean boolean41 = elements10.remove((java.lang.Object) tokenQueue37);
        org.jsoup.select.Elements elements43 = elements10.eq(0);
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(document14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "#root" + "'", str15, "#root");
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!" + "'", str18, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!");
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(elements24);
        org.junit.Assert.assertNotNull(document26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "#root" + "'", str27, "#root");
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!" + "'", str30, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!");
        org.junit.Assert.assertNotNull(elements31);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi" + "'", str38, "hi");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(elements43);
    }

    @Test
    public void test588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test588");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str2 = document1.tagName();
        org.jsoup.nodes.Element element4 = document1.append("hi!");
        java.lang.String str5 = document1.outerHtml();
        org.jsoup.select.Elements elements6 = document1.children();
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("#root");
        boolean boolean10 = document9.hasText();
        org.jsoup.select.Elements elements12 = document9.getElementsByIndexEquals(10);
        org.jsoup.nodes.Document document14 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str15 = document14.tagName();
        org.jsoup.parser.Tag tag16 = document14.tag();
        org.jsoup.nodes.TextNode textNode19 = new org.jsoup.nodes.TextNode("hi!", "");
        org.jsoup.nodes.Node node20 = textNode19.parent();
        org.jsoup.nodes.Element element21 = document14.appendChild((org.jsoup.nodes.Node) textNode19);
        org.jsoup.select.Elements elements23 = element21.getElementsByClass("#root");
        org.jsoup.nodes.Element element24 = document9.prependChild((org.jsoup.nodes.Node) element21);
        org.jsoup.select.Elements elements27 = element21.getElementsByAttributeValueNot("#text", "#document");
        org.jsoup.nodes.Element element29 = element21.appendElement("<?<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!>");
        elements6.add((int) (byte) 1, element21);
        org.jsoup.nodes.Document document32 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str33 = document32.tagName();
        org.jsoup.nodes.Element element35 = document32.append("hi!");
        java.lang.String str36 = document32.outerHtml();
        org.jsoup.select.Elements elements37 = document32.children();
        org.jsoup.select.Elements elements39 = elements37.html("#root=\"\"=\"\"");
        boolean boolean40 = elements6.contains((java.lang.Object) elements39);
        org.jsoup.select.Elements elements42 = elements6.wrap("org");
        org.jsoup.nodes.Document document44 = new org.jsoup.nodes.Document("#root");
        boolean boolean45 = document44.hasText();
        org.jsoup.select.Elements elements47 = document44.getElementsByIndexEquals(10);
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor48 = elements47.listIterator();
        org.jsoup.select.Elements elements49 = new org.jsoup.select.Elements((java.util.List<org.jsoup.nodes.Element>) elements47);
        org.jsoup.select.Elements elements51 = elements47.select("&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;hi!");
        boolean boolean52 = elements6.retainAll((java.util.Collection<org.jsoup.nodes.Element>) elements51);
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#root" + "'", str2, "#root");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!" + "'", str5, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(document14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "#root" + "'", str15, "#root");
        org.junit.Assert.assertNotNull(tag16);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(elements23);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(elements27);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertNotNull(document32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "#root" + "'", str33, "#root");
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!" + "'", str36, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!");
        org.junit.Assert.assertNotNull(elements37);
        org.junit.Assert.assertNotNull(elements39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(elements42);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(elements47);
        org.junit.Assert.assertNotNull(elementItor48);
        org.junit.Assert.assertNotNull(elements51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
    }

    @Test
    public void test589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test589");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("#declaration", "<html>\n<head>\n</head>\n<body>\n &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;hi!\n</body>\n</html>");
        org.jsoup.select.Elements elements5 = document2.getElementsByAttributeValueContaining("hi\n<!--#root=\"\"-->org.jsoup.select.Selector$SelectorParseException: hi!<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "<!#root=\"hi!\">");
        document2.title("org.jsoup.select.Selector$SelectorParseException: hi!");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(elements5);
    }

    @Test
    public void test590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test590");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("#root");
        boolean boolean2 = document1.hasText();
        org.jsoup.select.Elements elements4 = document1.getElementsByIndexEquals(10);
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor5 = elements4.listIterator();
        org.jsoup.select.Elements elements6 = new org.jsoup.select.Elements((java.util.List<org.jsoup.nodes.Element>) elements4);
        org.jsoup.nodes.Document document8 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element10 = document8.prependElement("hi!");
        org.jsoup.nodes.Document document13 = org.jsoup.parser.Parser.parseBodyFragment("#root", "#root");
        org.jsoup.nodes.Element element15 = document13.addClass("<#root>\n</#root>");
        element10.replaceWith((org.jsoup.nodes.Node) document13);
        boolean boolean17 = elements4.add((org.jsoup.nodes.Element) document13);
        java.util.Spliterator<org.jsoup.nodes.Element> elementSpliterator18 = elements4.spliterator();
        org.jsoup.nodes.Element element19 = elements4.last();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element21 = elements4.remove(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(elementItor5);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(elementSpliterator18);
        org.junit.Assert.assertNotNull(element19);
    }

    @Test
    public void test591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test591");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("#root");
        boolean boolean2 = document1.hasText();
        org.jsoup.select.Elements elements4 = document1.getElementsByIndexEquals(10);
        java.lang.Object[] objArray5 = elements4.toArray();
        org.jsoup.nodes.Document document8 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element10 = document8.prependElement("hi!");
        org.jsoup.nodes.Element element11 = element10.parent();
        org.jsoup.nodes.Element element12 = element10.empty();
        elements4.add(0, element12);
        org.jsoup.nodes.Document document15 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str16 = document15.tagName();
        org.jsoup.parser.Tag tag17 = document15.tag();
        org.jsoup.nodes.TextNode textNode20 = new org.jsoup.nodes.TextNode("hi!", "");
        org.jsoup.nodes.Node node21 = textNode20.parent();
        org.jsoup.nodes.Element element22 = document15.appendChild((org.jsoup.nodes.Node) textNode20);
        org.jsoup.select.Elements elements24 = element22.getElementsByClass("#root");
        org.jsoup.nodes.Element element25 = element12.prependChild((org.jsoup.nodes.Node) element22);
        org.jsoup.select.Elements elements27 = element22.getElementsByAttribute("#root=\"hi!\"");
        org.jsoup.nodes.Document document29 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str30 = document29.tagName();
        org.jsoup.nodes.Element element32 = document29.append("hi!");
        java.lang.String str33 = element32.outerHtml();
        boolean boolean35 = element32.equals((java.lang.Object) 1.0f);
        java.lang.String str36 = element32.nodeName();
        org.jsoup.nodes.Element element38 = element32.wrap("#comment");
        org.jsoup.nodes.Element element39 = element22.appendChild((org.jsoup.nodes.Node) element32);
        org.jsoup.select.Elements elements41 = element39.getElementsByClass("<?<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!>");
        org.jsoup.select.Elements elements43 = element39.select("#document");
        org.jsoup.select.Elements elements46 = element39.getElementsByAttributeValue("<html>\n<head>\n</head>\n<body>\n &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;hi!\n</body>\n</html>", "<html>\n<head>\n</head>\n<body>\n #root\n</body>\n</html>");
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor47 = elements46.listIterator();
        boolean boolean49 = elements46.hasClass("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(document15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "#root" + "'", str16, "#root");
        org.junit.Assert.assertNotNull(tag17);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(elements24);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(elements27);
        org.junit.Assert.assertNotNull(document29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "#root" + "'", str30, "#root");
        org.junit.Assert.assertNotNull(element32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!" + "'", str33, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "#document" + "'", str36, "#document");
        org.junit.Assert.assertNull(element38);
        org.junit.Assert.assertNotNull(element39);
        org.junit.Assert.assertNotNull(elements41);
        org.junit.Assert.assertNotNull(elements43);
        org.junit.Assert.assertNotNull(elements46);
        org.junit.Assert.assertNotNull(elementItor47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test592");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("#root");
        boolean boolean2 = document1.hasText();
        org.jsoup.select.Elements elements4 = document1.getElementsByIndexEquals(10);
        java.lang.Object[] objArray5 = elements4.toArray();
        org.jsoup.nodes.Document document7 = new org.jsoup.nodes.Document("#root");
        boolean boolean8 = document7.hasText();
        org.jsoup.nodes.Element element10 = document7.createElement("hi!");
        boolean boolean11 = elements4.add((org.jsoup.nodes.Element) document7);
        org.jsoup.nodes.Document document13 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str14 = document13.tagName();
        org.jsoup.parser.Tag tag15 = document13.tag();
        java.lang.String str16 = document13.outerHtml();
        java.lang.String str17 = document13.outerHtml();
        java.lang.String str18 = document13.title();
        org.jsoup.nodes.Element element19 = document13.empty();
        org.jsoup.nodes.Element element21 = element19.append("#root=\"\"=\"\"");
        org.jsoup.nodes.Document document23 = new org.jsoup.nodes.Document("#root");
        boolean boolean24 = document23.hasText();
        org.jsoup.select.Elements elements26 = document23.getElementsByIndexEquals(10);
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor27 = elements26.listIterator();
        boolean boolean28 = elements26.hasText();
        boolean boolean29 = element21.equals((java.lang.Object) elements26);
        org.jsoup.select.Elements elements31 = elements26.wrap("<html>\n<head>\n</head>\n<body>\n #root\n</body>\n</html>");
        java.lang.Object[] objArray32 = elements31.toArray();
        boolean boolean33 = elements4.addAll((java.util.Collection<org.jsoup.nodes.Element>) elements31);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#root" + "'", str14, "#root");
        org.junit.Assert.assertNotNull(tag15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>" + "'", str16, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>" + "'", str17, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(elements26);
        org.junit.Assert.assertNotNull(elementItor27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(elements31);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray32), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray32), "[]");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test593");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("#root");
        org.jsoup.nodes.Element element2 = document1.empty();
        org.jsoup.parser.Tag tag3 = document1.tag();
        org.jsoup.nodes.Document document5 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str6 = document5.tagName();
        org.jsoup.parser.Tag tag7 = document5.tag();
        java.lang.String str8 = document5.outerHtml();
        java.lang.String str9 = document5.outerHtml();
        java.lang.String str10 = document5.title();
        org.jsoup.nodes.Element element11 = document5.empty();
        org.jsoup.nodes.Element element12 = document1.prependChild((org.jsoup.nodes.Node) element11);
        org.jsoup.select.Elements elements14 = element11.getElementsByIndexEquals(0);
        org.jsoup.select.Elements elements16 = elements14.eq(4);
        org.jsoup.nodes.Document document18 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str19 = document18.id();
        org.jsoup.select.Elements elements20 = document18.children();
        org.jsoup.select.Elements elements22 = elements20.html("#root=\"\"");
        boolean boolean24 = elements22.hasAttr("");
        org.jsoup.select.Elements elements27 = elements22.attr("ohi!", "hi!");
        int int28 = elements14.lastIndexOf((java.lang.Object) elements22);
        org.jsoup.select.Elements elements30 = elements22.wrap("<#root>\n</#root>");
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertNotNull(document5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#root" + "'", str6, "#root");
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>" + "'", str8, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>" + "'", str9, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertNotNull(document18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(elements20);
        org.junit.Assert.assertNotNull(elements22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(elements27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(elements30);
    }

    @Test
    public void test594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test594");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str2 = document1.tagName();
        org.jsoup.parser.Tag tag3 = document1.tag();
        org.jsoup.nodes.Document document5 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str6 = document5.tagName();
        org.jsoup.parser.Tag tag7 = document5.tag();
        boolean boolean8 = tag7.isEmpty();
        org.jsoup.nodes.Document document10 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str11 = document10.tagName();
        org.jsoup.parser.Tag tag12 = document10.tag();
        org.jsoup.nodes.Element element14 = new org.jsoup.nodes.Element(tag12, "#root=\"\"");
        org.jsoup.nodes.Document document16 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str17 = document16.tagName();
        org.jsoup.parser.Tag tag18 = document16.tag();
        boolean boolean19 = tag12.canContain(tag18);
        boolean boolean20 = tag7.isValidParent(tag12);
        org.jsoup.nodes.Document document22 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str23 = document22.tagName();
        org.jsoup.parser.Tag tag24 = document22.tag();
        boolean boolean25 = tag24.isEmpty();
        boolean boolean26 = tag12.canContain(tag24);
        boolean boolean27 = tag3.canContain(tag24);
        org.jsoup.parser.Tag tag28 = tag3.getImplicitParent();
        boolean boolean29 = tag3.canContainBlock();
        org.jsoup.nodes.Document document33 = org.jsoup.Jsoup.parseBodyFragment("#root=\"\"", "<#root>\n</#root>");
        org.jsoup.nodes.Element element35 = document33.prepend("");
        org.jsoup.nodes.Attributes attributes36 = element35.attributes();
        java.util.List<org.jsoup.nodes.Attribute> attributeList37 = attributes36.asList();
        org.jsoup.nodes.Element element38 = new org.jsoup.nodes.Element(tag3, "\n<hi!>\n</hi!>", attributes36);
        boolean boolean39 = tag3.isData();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#root" + "'", str2, "#root");
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertNotNull(document5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#root" + "'", str6, "#root");
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#root" + "'", str11, "#root");
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertNotNull(document16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "#root" + "'", str17, "#root");
        org.junit.Assert.assertNotNull(tag18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(document22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "#root" + "'", str23, "#root");
        org.junit.Assert.assertNotNull(tag24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(tag28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(document33);
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertNotNull(attributes36);
        org.junit.Assert.assertNotNull(attributeList37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test595");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str2 = document1.tagName();
        org.jsoup.nodes.Element element4 = document1.append("hi!");
        java.lang.String str5 = document1.outerHtml();
        org.jsoup.select.Elements elements6 = document1.children();
        org.jsoup.nodes.Document document8 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.select.Elements elements10 = document8.getElementsByTag("#root");
        boolean boolean11 = document1.equals((java.lang.Object) document8);
        org.jsoup.nodes.Element element13 = document8.appendText("#root");
        org.jsoup.nodes.Element element15 = document8.prepend("org.jsoup.select.Selector$SelectorParseException: hi!");
        org.jsoup.nodes.Document document17 = new org.jsoup.nodes.Document("#root");
        boolean boolean18 = document17.hasText();
        org.jsoup.select.Elements elements20 = document17.getElementsByIndexEquals(10);
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor21 = elements20.listIterator();
        org.jsoup.select.Elements elements24 = elements20.attr("<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "hi!");
        org.jsoup.nodes.Document document26 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element28 = document26.prependElement("hi!");
        org.jsoup.nodes.Element element29 = element28.parent();
        int int30 = elements20.indexOf((java.lang.Object) element29);
        org.jsoup.select.Elements elements32 = elements20.toggleClass("#document");
        boolean boolean33 = elements32.isEmpty();
        org.jsoup.select.Elements elements36 = elements32.attr("hi!", "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!");
        boolean boolean37 = document8.equals((java.lang.Object) elements36);
        java.lang.String str38 = document8.outerHtml();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#root" + "'", str2, "#root");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!" + "'", str5, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(elements20);
        org.junit.Assert.assertNotNull(elementItor21);
        org.junit.Assert.assertNotNull(elements24);
        org.junit.Assert.assertNotNull(document26);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(elements32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(elements36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "org.jsoup.select.Selector$SelectorParseException: hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>#root" + "'", str38, "org.jsoup.select.Selector$SelectorParseException: hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>#root");
    }

    @Test
    public void test596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test596");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("#root");
        boolean boolean2 = document1.hasText();
        org.jsoup.select.Elements elements4 = document1.getElementsByIndexEquals(10);
        java.lang.Object[] objArray5 = elements4.toArray();
        org.jsoup.nodes.Document document8 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element10 = document8.prependElement("hi!");
        org.jsoup.nodes.Element element11 = element10.parent();
        org.jsoup.nodes.Element element12 = element10.empty();
        elements4.add(0, element12);
        org.jsoup.nodes.Document document15 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str16 = document15.tagName();
        org.jsoup.parser.Tag tag17 = document15.tag();
        org.jsoup.nodes.TextNode textNode20 = new org.jsoup.nodes.TextNode("hi!", "");
        org.jsoup.nodes.Node node21 = textNode20.parent();
        org.jsoup.nodes.Element element22 = document15.appendChild((org.jsoup.nodes.Node) textNode20);
        org.jsoup.select.Elements elements24 = element22.getElementsByClass("#root");
        org.jsoup.nodes.Element element25 = element12.prependChild((org.jsoup.nodes.Node) element22);
        org.jsoup.select.Elements elements27 = element22.getElementsByAttribute("#root=\"hi!\"");
        org.jsoup.nodes.Document document29 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str30 = document29.tagName();
        org.jsoup.nodes.Element element32 = document29.append("hi!");
        java.lang.String str33 = element32.outerHtml();
        boolean boolean35 = element32.equals((java.lang.Object) 1.0f);
        java.lang.String str36 = element32.nodeName();
        org.jsoup.nodes.Element element38 = element32.wrap("#comment");
        org.jsoup.nodes.Element element39 = element22.appendChild((org.jsoup.nodes.Node) element32);
        org.jsoup.select.Elements elements41 = element39.getElementsByClass("<?<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!>");
        org.jsoup.nodes.Element element43 = element39.prependElement("\n<#root class=\"\">\n</#root>");
        org.jsoup.nodes.Attributes attributes44 = element43.attributes();
        int int45 = attributes44.size();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(document15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "#root" + "'", str16, "#root");
        org.junit.Assert.assertNotNull(tag17);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(elements24);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(elements27);
        org.junit.Assert.assertNotNull(document29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "#root" + "'", str30, "#root");
        org.junit.Assert.assertNotNull(element32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!" + "'", str33, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "#document" + "'", str36, "#document");
        org.junit.Assert.assertNull(element38);
        org.junit.Assert.assertNotNull(element39);
        org.junit.Assert.assertNotNull(elements41);
        org.junit.Assert.assertNotNull(element43);
        org.junit.Assert.assertNotNull(attributes44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
    }

    @Test
    public void test597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test597");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str2 = document1.tagName();
        org.jsoup.nodes.Element element4 = document1.append("hi!");
        java.lang.String str5 = document1.outerHtml();
        org.jsoup.select.Elements elements6 = document1.children();
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("#root");
        boolean boolean10 = document9.hasText();
        org.jsoup.select.Elements elements12 = document9.getElementsByIndexEquals(10);
        org.jsoup.nodes.Document document14 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str15 = document14.tagName();
        org.jsoup.parser.Tag tag16 = document14.tag();
        org.jsoup.nodes.TextNode textNode19 = new org.jsoup.nodes.TextNode("hi!", "");
        org.jsoup.nodes.Node node20 = textNode19.parent();
        org.jsoup.nodes.Element element21 = document14.appendChild((org.jsoup.nodes.Node) textNode19);
        org.jsoup.select.Elements elements23 = element21.getElementsByClass("#root");
        org.jsoup.nodes.Element element24 = document9.prependChild((org.jsoup.nodes.Node) element21);
        org.jsoup.select.Elements elements27 = element21.getElementsByAttributeValueNot("#text", "#document");
        org.jsoup.nodes.Element element29 = element21.appendElement("<?<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!>");
        elements6.add((int) (byte) 1, element21);
        org.jsoup.nodes.Element element31 = elements6.last();
        org.jsoup.nodes.Element element34 = element31.attr("<html>\n<head>\n</head>\n<body>\n org.jsoup.select.Selector$SelectorParseException: hi!&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;\n</body>\n</html>", "#data");
        org.jsoup.select.Elements elements37 = element31.getElementsByAttributeValueEnding(" #root=\"hi!\" <html>\n<head>\n</head>\n<body>\n</body>\n</html>", "<?<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!>");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#root" + "'", str2, "#root");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!" + "'", str5, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(document14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "#root" + "'", str15, "#root");
        org.junit.Assert.assertNotNull(tag16);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(elements23);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(elements27);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertNotNull(element34);
        org.junit.Assert.assertNotNull(elements37);
    }

    @Test
    public void test598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test598");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element3 = document1.prependElement("hi!");
        org.jsoup.nodes.Element element5 = element3.append("");
        org.jsoup.nodes.Document document7 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str8 = document7.tagName();
        org.jsoup.nodes.Element element10 = document7.append("hi!");
        org.jsoup.nodes.Document document12 = new org.jsoup.nodes.Document("#root");
        org.jsoup.nodes.Document document14 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.select.Elements elements16 = document14.getElementsByTag("#root");
        org.jsoup.nodes.Element[] elementArray17 = new org.jsoup.nodes.Element[] { element3, element10, document12, document14 };
        org.jsoup.select.Elements elements18 = new org.jsoup.select.Elements(elementArray17);
        org.jsoup.select.Elements elements19 = new org.jsoup.select.Elements(elementArray17);
        org.jsoup.select.Elements elements20 = new org.jsoup.select.Elements(elementArray17);
        java.lang.String str21 = elements20.val();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#root" + "'", str8, "#root");
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(document14);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertNotNull(elementArray17);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test599");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str2 = document1.tagName();
        org.jsoup.nodes.Element element4 = document1.append("hi!");
        java.lang.String str5 = document1.outerHtml();
        org.jsoup.select.Elements elements6 = document1.children();
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("#root");
        boolean boolean10 = document9.hasText();
        org.jsoup.select.Elements elements12 = document9.getElementsByIndexEquals(10);
        org.jsoup.nodes.Document document14 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str15 = document14.tagName();
        org.jsoup.parser.Tag tag16 = document14.tag();
        org.jsoup.nodes.TextNode textNode19 = new org.jsoup.nodes.TextNode("hi!", "");
        org.jsoup.nodes.Node node20 = textNode19.parent();
        org.jsoup.nodes.Element element21 = document14.appendChild((org.jsoup.nodes.Node) textNode19);
        org.jsoup.select.Elements elements23 = element21.getElementsByClass("#root");
        org.jsoup.nodes.Element element24 = document9.prependChild((org.jsoup.nodes.Node) element21);
        org.jsoup.select.Elements elements27 = element21.getElementsByAttributeValueNot("#text", "#document");
        org.jsoup.nodes.Element element29 = element21.appendElement("<?<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!>");
        elements6.add((int) (byte) 1, element21);
        org.jsoup.nodes.Element element32 = element21.append("#comment");
        org.jsoup.nodes.Node node33 = element21.parent();
        // The following exception was thrown during execution in test generation
        try {
            node33.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#root" + "'", str2, "#root");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!" + "'", str5, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(document14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "#root" + "'", str15, "#root");
        org.junit.Assert.assertNotNull(tag16);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(elements23);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(elements27);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertNotNull(element32);
        org.junit.Assert.assertNotNull(node33);
    }

    @Test
    public void test600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test600");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.select.Elements elements3 = document1.getElementsByTag("#root");
        org.jsoup.select.Elements elements5 = elements3.append("<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!");
        org.jsoup.select.Elements elements7 = elements3.prepend("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.util.stream.Stream<org.jsoup.nodes.Element> elementStream8 = elements3.parallelStream();
        org.jsoup.nodes.Document document12 = org.jsoup.parser.Parser.parseBodyFragment("#root", "#root");
        java.lang.String str13 = document12.nodeName();
        org.jsoup.nodes.Element element15 = document12.text("<html>\n <head>\n </head>\n <body>\n </body>\n</html>hi!\n<head>\n </head>\n <body>\n </body>\n\n");
        org.jsoup.nodes.Element element17 = document12.prependElement("#declaration=\"&lt;#root&gt;\n&lt;/#root&gt;\"");
        // The following exception was thrown during execution in test generation
        try {
            elements3.add((int) (byte) -1, (org.jsoup.nodes.Element) document12);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(elementStream8);
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "#document" + "'", str13, "#document");
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element17);
    }

    @Test
    public void test601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test601");
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parseBodyFragment("#root=\"\"", "<#root>\n</#root>");
        java.lang.String str3 = document2.nodeName();
        org.jsoup.select.Elements elements5 = document2.getElementsByIndexEquals(10);
        org.jsoup.nodes.Document document8 = org.jsoup.parser.Parser.parse("", "\n<!--#root=\"\"-->");
        boolean boolean9 = document2.equals((java.lang.Object) "\n<!--#root=\"\"-->");
        java.lang.String str10 = document2.toString();
        org.jsoup.nodes.Element element12 = document2.prependText("<html>\n<head>\n</head>\n<body> #document\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>" + "'", str10, "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>");
        org.junit.Assert.assertNotNull(element12);
    }

    @Test
    public void test602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test602");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("#root", "#root");
        java.lang.String str3 = document2.nodeName();
        java.lang.String str4 = document2.title();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test603");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str2 = document1.tagName();
        org.jsoup.nodes.Element element4 = document1.append("hi!");
        java.lang.String str5 = document1.outerHtml();
        org.jsoup.select.Elements elements6 = document1.children();
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("#root");
        boolean boolean10 = document9.hasText();
        org.jsoup.select.Elements elements12 = document9.getElementsByIndexEquals(10);
        org.jsoup.nodes.Document document14 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str15 = document14.tagName();
        org.jsoup.parser.Tag tag16 = document14.tag();
        org.jsoup.nodes.TextNode textNode19 = new org.jsoup.nodes.TextNode("hi!", "");
        org.jsoup.nodes.Node node20 = textNode19.parent();
        org.jsoup.nodes.Element element21 = document14.appendChild((org.jsoup.nodes.Node) textNode19);
        org.jsoup.select.Elements elements23 = element21.getElementsByClass("#root");
        org.jsoup.nodes.Element element24 = document9.prependChild((org.jsoup.nodes.Node) element21);
        org.jsoup.select.Elements elements27 = element21.getElementsByAttributeValueNot("#text", "#document");
        org.jsoup.nodes.Element element29 = element21.appendElement("<?<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!>");
        elements6.add((int) (byte) 1, element21);
        org.jsoup.nodes.Document document32 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str33 = document32.tagName();
        org.jsoup.nodes.Element element35 = document32.append("hi!");
        java.lang.String str36 = document32.outerHtml();
        org.jsoup.select.Elements elements37 = document32.children();
        org.jsoup.select.Elements elements39 = elements37.html("#root=\"\"=\"\"");
        boolean boolean40 = elements6.contains((java.lang.Object) elements39);
        org.jsoup.select.Elements elements42 = elements6.removeClass("<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!");
        int int43 = elements6.size();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#root" + "'", str2, "#root");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!" + "'", str5, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(document14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "#root" + "'", str15, "#root");
        org.junit.Assert.assertNotNull(tag16);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(elements23);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(elements27);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertNotNull(document32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "#root" + "'", str33, "#root");
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!" + "'", str36, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!");
        org.junit.Assert.assertNotNull(elements37);
        org.junit.Assert.assertNotNull(elements39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(elements42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 2 + "'", int43 == 2);
    }

    @Test
    public void test604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test604");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str2 = document1.tagName();
        org.jsoup.parser.Tag tag3 = document1.tag();
        org.jsoup.nodes.Element element5 = new org.jsoup.nodes.Element(tag3, "#root=\"\"");
        java.lang.String str6 = element5.toString();
        org.jsoup.nodes.Element element8 = element5.text("");
        org.jsoup.nodes.Element element10 = element8.appendText("hi!");
        org.jsoup.nodes.Element element12 = element8.html(".jsoup.select.Selector$SelectorParseException: hi!<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.select.Elements elements14 = element8.getElementsByIndexLessThan((int) (byte) 1);
        org.jsoup.nodes.Node node15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element16 = element8.appendChild(node15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#root" + "'", str2, "#root");
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<#root>\n</#root>" + "'", str6, "<#root>\n</#root>");
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(elements14);
    }

    @Test
    public void test605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test605");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element3 = document1.prependElement("hi!");
        org.jsoup.nodes.Element element4 = element3.parent();
        org.jsoup.nodes.Element element5 = element3.empty();
        org.jsoup.nodes.Element element6 = element5.empty();
        boolean boolean8 = element5.equals((java.lang.Object) "#root=\"hi!\"");
        boolean boolean10 = element5.equals((java.lang.Object) false);
        org.jsoup.nodes.Element element12 = element5.prepend("<!hi!>");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(element12);
    }

    @Test
    public void test606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test606");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element3 = document1.prependElement("hi!");
        org.jsoup.nodes.Document document6 = org.jsoup.parser.Parser.parseBodyFragment("#root", "#root");
        org.jsoup.nodes.Element element8 = document6.addClass("<#root>\n</#root>");
        element3.replaceWith((org.jsoup.nodes.Node) document6);
        org.jsoup.nodes.Element element10 = document6.parent();
        org.jsoup.nodes.Document document12 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str13 = document12.tagName();
        org.jsoup.parser.Tag tag14 = document12.tag();
        org.jsoup.nodes.Element element16 = new org.jsoup.nodes.Element(tag14, "#root=\"\"");
        org.jsoup.select.Elements elements18 = element16.getElementsByClass("<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>");
        org.jsoup.select.Elements elements21 = element16.getElementsByAttributeValueStarting("#root", "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!");
        org.jsoup.nodes.Element element22 = elements21.last();
        org.jsoup.nodes.Document document24 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.select.Elements elements26 = document24.getElementsByTag("#root");
        java.lang.String str27 = elements26.text();
        org.jsoup.nodes.Document document29 = new org.jsoup.nodes.Document("#root");
        boolean boolean30 = document29.hasText();
        org.jsoup.select.Elements elements32 = document29.getElementsByIndexEquals(10);
        java.lang.Object[] objArray33 = elements32.toArray();
        boolean boolean34 = elements26.retainAll((java.util.Collection<org.jsoup.nodes.Element>) elements32);
        org.jsoup.nodes.Document document36 = new org.jsoup.nodes.Document("#root");
        boolean boolean37 = document36.hasText();
        org.jsoup.select.Elements elements39 = document36.getElementsByIndexEquals(10);
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor40 = elements39.listIterator();
        org.jsoup.select.Elements elements43 = elements39.attr("<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "hi!");
        boolean boolean44 = elements26.remove((java.lang.Object) elements43);
        org.jsoup.select.Elements elements46 = elements43.append("");
        org.jsoup.nodes.Element element47 = elements43.last();
        boolean boolean48 = elements21.removeAll((java.util.Collection<org.jsoup.nodes.Element>) elements43);
        boolean boolean49 = document6.equals((java.lang.Object) elements43);
        java.lang.String str50 = elements43.html();
        org.jsoup.nodes.Element element51 = elements43.last();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "#root" + "'", str13, "#root");
        org.junit.Assert.assertNotNull(tag14);
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertNotNull(elements21);
        org.junit.Assert.assertNull(element22);
        org.junit.Assert.assertNotNull(document24);
        org.junit.Assert.assertNotNull(elements26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(elements32);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray33), "[]");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(elements39);
        org.junit.Assert.assertNotNull(elementItor40);
        org.junit.Assert.assertNotNull(elements43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(elements46);
        org.junit.Assert.assertNull(element47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertNull(element51);
    }

    @Test
    public void test607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test607");
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parseBodyFragment("#root=\"\"", "<#root>\n</#root>");
        java.lang.String str3 = document2.toString();
        java.lang.String str4 = document2.nodeName();
        document2.title("<#root>\n</#root>=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;\"");
        org.jsoup.nodes.Element element8 = document2.append("<#root class=\"#root &lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;hi! org.jsoup.select.Selector$SelectorParseException: &lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt; &lt;html&gt;\n &lt;head&gt;\n &lt;/head&gt;\n &lt;body&gt;\n &lt;/body&gt;\n&lt;/html&gt;hi!\n\n&lt;html&gt;\n &lt;head&gt;\n &lt;/head&gt;\n &lt;body&gt;\n &lt;/body&gt;\n&lt;/html&gt;\n\n &lt;head&gt;\n &lt;/head&gt;\n\n &lt;body&gt;\n &lt;/body&gt; org.jsoup.select.Selector$SelectorParseException: hi! ! #document #root=&quot;&amp;lt;html&amp;gt;\n&amp;lt;head&amp;gt;\n&amp;lt;/head&amp;gt;\n&amp;lt;body&amp;gt;\n&amp;lt;/body&amp;gt;\n&amp;lt;/html&amp;gt;&quot; [., j, s, o, u, p, ., s, e, l, e, c, t, ., S, e, l, e, c, t, o, r, $, S, e, l, e, c, t, o, r, P, a, r, s, e, E, x, c, e, p, t, i, o, n, :,  , h, i, !, &lt;, h, t, m, l, &gt;, \n, &lt;, h, e, a, d, &gt;, \n, &lt;, /, h, e, a, d, &gt;, \n, &lt;, b, o, d, y, &gt;, \n, &lt;, /, b, o, d, y, &gt;, \n, &lt;, /, h, t, m, l, &gt;] #root=&amp;quot;&amp;quot; org.jsoup.select.Selector$SelectorParseException: &lt;#root&gt;\n&lt;/#root&gt; &lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt; &lt;?#root=&quot;&amp;lt;html&amp;gt;\n&amp;lt;head&amp;gt;\n&amp;lt;/head&amp;gt;\n&amp;lt;body&amp;gt;\n&amp;lt;/body&amp;gt;\n&amp;lt;/html&amp;gt;&quot;&gt; #root=&quot;&quot; &lt;!&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;hi!&gt; &lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n #root=&amp;quot;&amp;quot;\n&lt;/body&gt;\n&lt;/html&gt; #text hi\">\n<#root class=\"\">\n</#root>\n</#root>");
        org.jsoup.nodes.Element element10 = document2.append("ohi!");
        org.jsoup.nodes.Element element12 = document2.child((int) (short) 0);
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>" + "'", str3, "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#document" + "'", str4, "#document");
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
    }

    @Test
    public void test608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test608");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str2 = document1.tagName();
        org.jsoup.nodes.Element element4 = document1.append("hi!");
        java.lang.String str5 = document1.outerHtml();
        org.jsoup.select.Elements elements6 = document1.children();
        java.lang.String str8 = document1.absUrl("<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>");
        org.jsoup.select.Elements elements11 = document1.getElementsByAttributeValueContaining("<#root>\n</#root>", "#document");
        java.util.Set<java.lang.String> strSet12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element13 = document1.classNames(strSet12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#root" + "'", str2, "#root");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!" + "'", str5, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(elements11);
    }

    @Test
    public void test609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test609");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("org.jsoup.select.Selector$SelectorParseException: hi!<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.lang.String str2 = document1.nodeName();
        org.jsoup.nodes.Document document3 = document1.normalise();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#document" + "'", str2, "#document");
        org.junit.Assert.assertNotNull(document3);
    }

    @Test
    public void test610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test610");
        org.jsoup.nodes.Evaluator evaluator0 = null;
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parse("org.jsoup.select.Selector$SelectorParseException: <html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element4 = document2.text("<!#root=\"hi!\">");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements5 = org.jsoup.select.Collector.collect(evaluator0, (org.jsoup.nodes.Element) document2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
    }

    @Test
    public void test611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test611");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("#root");
        boolean boolean2 = document1.hasText();
        org.jsoup.select.Elements elements4 = document1.getElementsByIndexEquals(10);
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor5 = elements4.listIterator();
        boolean boolean6 = elements4.hasText();
        java.lang.String str7 = elements4.text();
        org.jsoup.nodes.Document document10 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element12 = document10.prependElement("hi!");
        org.jsoup.nodes.Element element13 = element12.parent();
        org.jsoup.nodes.Element element14 = element12.empty();
        org.jsoup.select.Elements elements16 = element14.getElementsByClass("hi!");
        org.jsoup.nodes.Element element18 = element14.prepend("<?<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!>");
        boolean boolean19 = element18.hasText();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element20 = elements4.set((int) (byte) 10, element18);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(elementItor5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test612");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str2 = document1.tagName();
        org.jsoup.parser.Tag tag3 = document1.tag();
        java.lang.String str4 = document1.outerHtml();
        java.lang.String str5 = document1.outerHtml();
        org.jsoup.nodes.Element element7 = document1.prepend("hi");
        org.jsoup.nodes.Element element8 = element7.empty();
        java.lang.String str9 = element7.toString();
        org.jsoup.nodes.Element element11 = element7.appendElement("<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>");
        org.jsoup.select.Elements elements13 = element11.getElementsByClass("#root=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;\"");
        org.jsoup.nodes.Document document15 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str16 = document15.tagName();
        org.jsoup.parser.Tag tag17 = document15.tag();
        org.jsoup.nodes.Element element18 = document15.body();
        element18.remove();
        org.jsoup.nodes.Element element21 = element18.prependText("[]");
        java.lang.String str22 = element21.className();
        boolean boolean23 = elements13.add(element21);
        org.jsoup.select.Elements elements25 = elements13.eq(2);
        org.jsoup.nodes.Document document27 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str28 = document27.tagName();
        org.jsoup.nodes.Element element30 = document27.append("hi!");
        org.jsoup.nodes.Element element32 = document27.prependText("hi!");
        org.jsoup.nodes.Element element34 = document27.createElement("#root=\"hi!\"");
        int int35 = elements25.indexOf((java.lang.Object) "#root=\"hi!\"");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#root" + "'", str2, "#root");
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>" + "'", str4, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>" + "'", str5, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(document15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "#root" + "'", str16, "#root");
        org.junit.Assert.assertNotNull(tag17);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(elements25);
        org.junit.Assert.assertNotNull(document27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "#root" + "'", str28, "#root");
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertNotNull(element32);
        org.junit.Assert.assertNotNull(element34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
    }

    @Test
    public void test613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test613");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element3 = document1.prependElement("hi!");
        org.jsoup.nodes.Element element4 = document1.empty();
        org.jsoup.nodes.Element element6 = element4.toggleClass("");
        org.jsoup.nodes.Node node8 = element4.removeAttr("<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>");
        org.jsoup.nodes.Document document10 = org.jsoup.Jsoup.parse("<?<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!>");
        org.jsoup.nodes.Element element11 = element4.prependChild((org.jsoup.nodes.Node) document10);
        org.jsoup.nodes.Element element13 = element4.prepend("\n<hi!>\n</hi!>");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element13);
    }

    @Test
    public void test614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test614");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("#root");
        boolean boolean2 = document1.hasText();
        org.jsoup.select.Elements elements4 = document1.getElementsByIndexEquals(10);
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor5 = elements4.listIterator();
        boolean boolean6 = elements4.hasText();
        org.jsoup.nodes.Document document9 = org.jsoup.Jsoup.parseBodyFragment("#root=\"\"", "<#root>\n</#root>");
        java.lang.String str10 = document9.toString();
        java.lang.String str11 = document9.nodeName();
        java.lang.String str12 = document9.outerHtml();
        org.jsoup.nodes.Element element13 = document9.body();
        org.jsoup.nodes.Document document14 = document9.normalise();
        document14.setBaseUri(" text=\"hi!\"");
        boolean boolean17 = elements4.add((org.jsoup.nodes.Element) document14);
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor18 = elements4.listIterator();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(elementItor5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(document9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>" + "'", str10, "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#document" + "'", str11, "#document");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>" + "'", str12, "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>");
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(document14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(elementItor18);
    }

    @Test
    public void test615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test615");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor1 = attributes0.iterator();
        org.jsoup.nodes.Attributes attributes2 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor3 = attributes2.iterator();
        boolean boolean5 = attributes2.hasKey("");
        attributes2.remove("#root=\"\"");
        attributes0.addAll(attributes2);
        attributes2.put("#root=\"hi!\"", "#root");
        org.jsoup.nodes.Attribute attribute14 = new org.jsoup.nodes.Attribute("#comment", "#root=\"\"=\"\"");
        attributes2.put(attribute14);
        attributes2.put("#root", "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!");
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator19 = attributes2.spliterator();
        org.jsoup.nodes.Attributes attributes20 = new org.jsoup.nodes.Attributes();
        boolean boolean22 = attributes20.equals((java.lang.Object) (byte) 100);
        attributes2.addAll(attributes20);
        org.jsoup.nodes.Attribute attribute26 = new org.jsoup.nodes.Attribute("<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!", "#root=\"hi!\"");
        org.jsoup.nodes.Document document28 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element30 = document28.prependElement("hi!");
        org.jsoup.nodes.Element element32 = element30.append("");
        boolean boolean33 = attribute26.equals((java.lang.Object) "");
        attributes2.put(attribute26);
        org.jsoup.nodes.Attributes attributes35 = new org.jsoup.nodes.Attributes();
        boolean boolean37 = attributes35.equals((java.lang.Object) (byte) 100);
        org.jsoup.nodes.Attribute attribute40 = new org.jsoup.nodes.Attribute("\n<!--#root=\"\"-->", "#root");
        attributes35.put(attribute40);
        org.jsoup.nodes.Attribute attribute44 = new org.jsoup.nodes.Attribute("#root", "");
        java.lang.String str45 = attribute44.getKey();
        attribute44.setKey("#root=\"\"");
        java.lang.String str48 = attribute44.toString();
        org.jsoup.nodes.Document document50 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element52 = document50.prependElement("hi!");
        java.lang.String str53 = element52.tagName();
        org.jsoup.nodes.Element element55 = element52.prependElement("<#root>\n</#root>");
        boolean boolean56 = attribute44.equals((java.lang.Object) "<#root>\n</#root>");
        java.lang.String str57 = attribute44.getKey();
        boolean boolean58 = attribute40.equals((java.lang.Object) str57);
        attributes2.put(attribute40);
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertNotNull(attributeItor3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(attributeSpliterator19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(document28);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertNotNull(element32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "#root" + "'", str45, "#root");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "#root=\"\"=\"\"" + "'", str48, "#root=\"\"=\"\"");
        org.junit.Assert.assertNotNull(document50);
        org.junit.Assert.assertNotNull(element52);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "hi!" + "'", str53, "hi!");
        org.junit.Assert.assertNotNull(element55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "#root=\"\"" + "'", str57, "#root=\"\"");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
    }

    @Test
    public void test616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test616");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element3 = document1.prependElement("hi!");
        org.jsoup.nodes.Document document6 = org.jsoup.parser.Parser.parseBodyFragment("#root", "#root");
        org.jsoup.nodes.Element element8 = document6.addClass("<#root>\n</#root>");
        element3.replaceWith((org.jsoup.nodes.Node) document6);
        org.jsoup.nodes.Element element11 = element3.toggleClass("#root=\"hi!\"");
        java.lang.String str12 = element3.outerHtml();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<hi! class=\" #root=&quot;hi!&quot;\">\n</hi!>" + "'", str12, "<hi! class=\" #root=&quot;hi!&quot;\">\n</hi!>");
    }

    @Test
    public void test617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test617");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("", "\n<!--#root=\"\"-->");
        org.jsoup.select.Elements elements5 = document2.getElementsByAttributeValueContaining("\n<!--#root=\"\"-->", "#root=\"hi!\"");
        org.jsoup.nodes.Document document8 = new org.jsoup.nodes.Document("#root");
        boolean boolean9 = document8.hasText();
        org.jsoup.select.Elements elements11 = document8.getElementsByIndexEquals(10);
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor12 = elements11.listIterator();
        org.jsoup.select.Elements elements15 = elements11.attr("<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "hi!");
        org.jsoup.select.Elements elements16 = org.jsoup.select.Selector.select("#root", (java.lang.Iterable<org.jsoup.nodes.Element>) elements11);
        org.jsoup.select.Elements elements17 = new org.jsoup.select.Elements((java.util.Collection<org.jsoup.nodes.Element>) elements11);
        boolean boolean18 = elements5.containsAll((java.util.Collection<org.jsoup.nodes.Element>) elements11);
        org.jsoup.select.Elements elements20 = elements5.addClass("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Attributes attributes21 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor22 = attributes21.iterator();
        org.jsoup.nodes.Attributes attributes23 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor24 = attributes23.iterator();
        boolean boolean26 = attributes23.hasKey("");
        attributes23.remove("#root=\"\"");
        attributes21.addAll(attributes23);
        attributes23.put("#root=\"hi!\"", "#root");
        org.jsoup.nodes.Attribute attribute35 = new org.jsoup.nodes.Attribute("#comment", "#root=\"\"=\"\"");
        attributes23.put(attribute35);
        attributes23.put("#root", "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!");
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator40 = attributes23.spliterator();
        org.jsoup.nodes.Attributes attributes41 = new org.jsoup.nodes.Attributes();
        boolean boolean43 = attributes41.equals((java.lang.Object) (byte) 100);
        attributes23.addAll(attributes41);
        org.jsoup.nodes.Attribute attribute47 = new org.jsoup.nodes.Attribute("<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!", "#root=\"hi!\"");
        org.jsoup.nodes.Document document49 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element51 = document49.prependElement("hi!");
        org.jsoup.nodes.Element element53 = element51.append("");
        boolean boolean54 = attribute47.equals((java.lang.Object) "");
        attributes23.put(attribute47);
        java.lang.String str56 = attributes23.toString();
        boolean boolean57 = elements5.contains((java.lang.Object) str56);
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(elementItor12);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(elements20);
        org.junit.Assert.assertNotNull(attributeItor22);
        org.junit.Assert.assertNotNull(attributeItor24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(attributeSpliterator40);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(document49);
        org.junit.Assert.assertNotNull(element51);
        org.junit.Assert.assertNotNull(element53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + " #root=\"hi!\"=\"#root\" #comment=\"#root=&quot;&quot;=&quot;&quot;\" #root=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;hi!\" <html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!=\"#root=&quot;hi!&quot;\"" + "'", str56, " #root=\"hi!\"=\"#root\" #comment=\"#root=&quot;&quot;=&quot;&quot;\" #root=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;hi!\" <html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!=\"#root=&quot;hi!&quot;\"");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
    }

    @Test
    public void test618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test618");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("#root", "#root");
        java.lang.String str4 = document2.absUrl("#root=\"\"");
        document2.title("#document");
        org.jsoup.select.Elements elements8 = document2.getElementsByClass("<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>");
        org.jsoup.nodes.Element element10 = document2.addClass("<html>\n<head>\n</head>\n<body>\n org.jsoup.select.Selector$SelectorParseException: hi!\n <html> \n  <head> \n  </head> \n  <body>  \n  </body>\n </html>\n</body>\n</html>");
        java.lang.String str11 = document2.title();
        org.jsoup.nodes.Element element12 = document2.head();
        org.jsoup.select.Elements elements15 = document2.getElementsByAttributeValueStarting("#comment", ".jsoup.select.Selector$SelectorParseException: hi!<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#document" + "'", str11, "#document");
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(elements15);
    }

    @Test
    public void test619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test619");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("#root", "#root");
        java.lang.String str4 = document2.absUrl("#root=\"\"");
        document2.title("#document");
        document2.setBaseUri("#text");
        org.jsoup.nodes.Attributes attributes9 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor10 = attributes9.iterator();
        org.jsoup.nodes.Attributes attributes11 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor12 = attributes11.iterator();
        boolean boolean14 = attributes11.hasKey("");
        attributes11.remove("#root=\"\"");
        attributes9.addAll(attributes11);
        attributes11.put("#root=\"hi!\"", "#root");
        org.jsoup.nodes.Attribute attribute23 = new org.jsoup.nodes.Attribute("#comment", "#root=\"\"=\"\"");
        attributes11.put(attribute23);
        org.jsoup.nodes.Attribute attribute27 = new org.jsoup.nodes.Attribute("#root", "");
        java.lang.String str28 = attribute27.getKey();
        attribute27.setKey("#root=\"\"");
        java.lang.String str31 = attribute27.toString();
        java.lang.String str32 = attribute27.html();
        attributes11.put(attribute27);
        boolean boolean34 = document2.equals((java.lang.Object) attributes11);
        java.util.List<org.jsoup.nodes.Node> nodeList35 = document2.childNodes();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(attributeItor10);
        org.junit.Assert.assertNotNull(attributeItor12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "#root" + "'", str28, "#root");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "#root=\"\"=\"\"" + "'", str31, "#root=\"\"=\"\"");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "#root=\"\"=\"\"" + "'", str32, "#root=\"\"=\"\"");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(nodeList35);
    }

    @Test
    public void test620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test620");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str2 = document1.tagName();
        org.jsoup.parser.Tag tag3 = document1.tag();
        org.jsoup.nodes.Document document5 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str6 = document5.tagName();
        org.jsoup.parser.Tag tag7 = document5.tag();
        boolean boolean8 = tag7.isEmpty();
        org.jsoup.nodes.Document document10 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str11 = document10.tagName();
        org.jsoup.parser.Tag tag12 = document10.tag();
        org.jsoup.nodes.Element element14 = new org.jsoup.nodes.Element(tag12, "#root=\"\"");
        org.jsoup.nodes.Document document16 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str17 = document16.tagName();
        org.jsoup.parser.Tag tag18 = document16.tag();
        boolean boolean19 = tag12.canContain(tag18);
        boolean boolean20 = tag7.isValidParent(tag12);
        org.jsoup.nodes.Document document22 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str23 = document22.tagName();
        org.jsoup.parser.Tag tag24 = document22.tag();
        boolean boolean25 = tag24.isEmpty();
        boolean boolean26 = tag12.canContain(tag24);
        boolean boolean27 = tag3.canContain(tag24);
        org.jsoup.nodes.TextNode textNode31 = new org.jsoup.nodes.TextNode("hi!", "");
        java.lang.String str32 = textNode31.text();
        org.jsoup.nodes.Attributes attributes33 = textNode31.attributes();
        attributes33.put("#root=\"\"=\"\"", "\n<!--#root=\"\"-->");
        org.jsoup.nodes.Element element37 = new org.jsoup.nodes.Element(tag24, "#comment", attributes33);
        org.jsoup.nodes.Element element40 = element37.attr("&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;hi!", "org.jsoup.select.Selector$SelectorParseException: hi!<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element42 = element37.html("<html>\n<head>\n</head>\n<body>\n #root\n</body>\n</html>");
        org.jsoup.nodes.Element element44 = element42.addClass("org.jsoup.select.selector$selectorparseexception: <html>\n<head>\n</head>\n<body>\n org.jsoup.select.selector$selectorparseexception: hi!\n <html> \n  <head> \n  </head> \n  <body>  \n  </body>\n </html>\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#root" + "'", str2, "#root");
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertNotNull(document5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#root" + "'", str6, "#root");
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#root" + "'", str11, "#root");
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertNotNull(document16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "#root" + "'", str17, "#root");
        org.junit.Assert.assertNotNull(tag18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(document22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "#root" + "'", str23, "#root");
        org.junit.Assert.assertNotNull(tag24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertNotNull(attributes33);
        org.junit.Assert.assertNotNull(element40);
        org.junit.Assert.assertNotNull(element42);
        org.junit.Assert.assertNotNull(element44);
    }

    @Test
    public void test621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test621");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.select.Elements elements3 = document1.getElementsByTag("#root");
        java.lang.String str4 = elements3.text();
        org.jsoup.select.Elements elements6 = elements3.toggleClass("");
        java.util.stream.Stream<org.jsoup.nodes.Element> elementStream7 = elements6.stream();
        org.jsoup.select.Elements elements8 = new org.jsoup.select.Elements((java.util.List<org.jsoup.nodes.Element>) elements6);
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor9 = elements8.listIterator();
        org.jsoup.select.Elements elements11 = elements8.html("org.jsoup.select.Selector$SelectorParseException: <html>\n<head>\n</head>\n<body>\n org.jsoup.select.Selector$SelectorParseException: hi!\n <html> \n  <head> \n  </head> \n  <body>  \n  </body>\n </html>\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elementStream7);
        org.junit.Assert.assertNotNull(elementItor9);
        org.junit.Assert.assertNotNull(elements11);
    }

    @Test
    public void test622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test622");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str2 = document1.tagName();
        java.lang.String str3 = document1.html();
        org.jsoup.nodes.Element element5 = document1.append("hi!");
        org.jsoup.nodes.Element element7 = document1.html("ohi!");
        boolean boolean9 = element7.hasClass("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.lang.String str10 = element7.val();
        org.jsoup.select.Elements elements13 = element7.getElementsByAttributeValueEnding("\n<!--<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!-->", "#text");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#root" + "'", str2, "#root");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>" + "'", str3, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(elements13);
    }

    @Test
    public void test623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test623");
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parseBodyFragment("#root=\"\"", "<#root>\n</#root>");
        org.jsoup.nodes.Element element3 = document2.head();
        java.lang.String str4 = element3.className();
        org.jsoup.nodes.Element element6 = element3.appendElement("ohi!");
        java.lang.String str7 = element6.tagName();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = element6.childNodes();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ohi!" + "'", str7, "ohi!");
        org.junit.Assert.assertNotNull(nodeList8);
    }

    @Test
    public void test624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test624");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element3 = document1.prependElement("hi!");
        org.jsoup.nodes.Element element5 = element3.append("");
        org.jsoup.nodes.Element element7 = element3.prepend("<#root>\n</#root>");
        org.jsoup.select.Elements elements10 = element3.getElementsByAttributeValueStarting("#root=&quot;&quot;", "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>");
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor11 = elements10.listIterator();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(elementItor11);
    }

    @Test
    public void test625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test625");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("#root", "#root");
        java.lang.String str4 = document2.absUrl("#root=\"\"");
        document2.title("#document");
        org.jsoup.select.Elements elements8 = document2.getElementsByClass("<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>");
        org.jsoup.nodes.Element element10 = document2.addClass("<html>\n<head>\n</head>\n<body>\n org.jsoup.select.Selector$SelectorParseException: hi!\n <html> \n  <head> \n  </head> \n  <body>  \n  </body>\n </html>\n</body>\n</html>");
        org.jsoup.select.Elements elements12 = document2.getElementsByTag("org.jsoup.select.Selector$SelectorParseException: hi!<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element14 = document2.createElement("[]");
        org.jsoup.nodes.Document document17 = org.jsoup.parser.Parser.parseBodyFragment("#root", "#root");
        org.jsoup.nodes.Element element19 = document17.addClass("<#root>\n</#root>");
        org.jsoup.select.Elements elements20 = element19.children();
        java.lang.String str21 = element19.val();
        java.lang.String str22 = element19.outerHtml();
        org.jsoup.nodes.Element element23 = element14.appendChild((org.jsoup.nodes.Node) element19);
        // The following exception was thrown during execution in test generation
        try {
            element23.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(document17);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(elements20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "<html>\n<head>\n</head>\n<body>\n #root\n</body>\n</html>" + "'", str22, "<html>\n<head>\n</head>\n<body>\n #root\n</body>\n</html>");
        org.junit.Assert.assertNotNull(element23);
    }

    @Test
    public void test626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test626");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("#root", "#root");
        java.lang.String str3 = document2.nodeName();
        org.jsoup.nodes.Element element5 = document2.text("<html>\n <head>\n </head>\n <body>\n </body>\n</html>hi!\n<head>\n </head>\n <body>\n </body>\n\n");
        org.jsoup.nodes.Element element6 = document2.body();
        java.lang.String str7 = document2.className();
        org.jsoup.select.Elements elements8 = document2.children();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(elements8);
    }

    @Test
    public void test627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test627");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("[o, h, i, !]", "#root=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;\"");
        org.jsoup.nodes.Element element3 = document2.body();
        java.lang.String str4 = element3.className();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test628");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str2 = document1.tagName();
        org.jsoup.nodes.Element element4 = document1.append("hi!");
        java.lang.String str5 = document1.outerHtml();
        org.jsoup.select.Elements elements6 = document1.children();
        org.jsoup.nodes.Element element8 = document1.val("<!hi!>");
        java.lang.String str9 = document1.text();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#root" + "'", str2, "#root");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!" + "'", str5, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test629");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str2 = document1.tagName();
        org.jsoup.parser.Tag tag3 = document1.tag();
        org.jsoup.nodes.Document document5 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str6 = document5.tagName();
        org.jsoup.parser.Tag tag7 = document5.tag();
        boolean boolean8 = tag7.isEmpty();
        org.jsoup.nodes.Document document10 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str11 = document10.tagName();
        org.jsoup.parser.Tag tag12 = document10.tag();
        org.jsoup.nodes.Element element14 = new org.jsoup.nodes.Element(tag12, "#root=\"\"");
        org.jsoup.nodes.Document document16 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str17 = document16.tagName();
        org.jsoup.parser.Tag tag18 = document16.tag();
        boolean boolean19 = tag12.canContain(tag18);
        boolean boolean20 = tag7.isValidParent(tag12);
        org.jsoup.nodes.Document document22 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str23 = document22.tagName();
        org.jsoup.parser.Tag tag24 = document22.tag();
        boolean boolean25 = tag24.isEmpty();
        boolean boolean26 = tag12.canContain(tag24);
        boolean boolean27 = tag3.canContain(tag24);
        org.jsoup.nodes.Attributes attributes29 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor30 = attributes29.iterator();
        java.lang.String str31 = attributes29.toString();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator32 = attributes29.spliterator();
        org.jsoup.nodes.Element element33 = new org.jsoup.nodes.Element(tag24, "hi!", attributes29);
        org.jsoup.nodes.Element element35 = element33.appendElement("<aorg>\n</aorg>");
        org.jsoup.nodes.Document document38 = org.jsoup.Jsoup.parseBodyFragment("#root", "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>");
        java.lang.String str39 = document38.baseUri();
        org.jsoup.nodes.Element element40 = element33.prependChild((org.jsoup.nodes.Node) document38);
        org.jsoup.nodes.Element element42 = element40.wrap("\n<!--<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!-->");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#root" + "'", str2, "#root");
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertNotNull(document5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#root" + "'", str6, "#root");
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#root" + "'", str11, "#root");
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertNotNull(document16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "#root" + "'", str17, "#root");
        org.junit.Assert.assertNotNull(tag18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(document22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "#root" + "'", str23, "#root");
        org.junit.Assert.assertNotNull(tag24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(attributeItor30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(attributeSpliterator32);
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertNotNull(document38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>" + "'", str39, "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>");
        org.junit.Assert.assertNotNull(element40);
        org.junit.Assert.assertNull(element42);
    }

    @Test
    public void test630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test630");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("#root");
        boolean boolean2 = document1.hasText();
        org.jsoup.select.Elements elements4 = document1.getElementsByIndexEquals(10);
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor5 = elements4.listIterator();
        org.jsoup.select.Elements elements8 = elements4.attr("<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "hi!");
        org.jsoup.select.Elements elements9 = new org.jsoup.select.Elements((java.util.Collection<org.jsoup.nodes.Element>) elements8);
        org.jsoup.nodes.Document document11 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str12 = document11.tagName();
        org.jsoup.nodes.Element element14 = document11.append("hi!");
        java.lang.String str16 = document11.absUrl("hi!");
        org.jsoup.select.Elements elements17 = document11.getAllElements();
        org.jsoup.select.Elements elements20 = document11.getElementsByAttributeValueEnding("org.jsoup.select.Selector$SelectorParseException: <html>\n<head>\n</head>\n<body>\n org.jsoup.select.Selector$SelectorParseException: hi!\n <html> \n  <head> \n  </head> \n  <body>  \n  </body>\n </html>\n</body>\n</html>", "aorg");
        org.jsoup.select.Elements elements22 = elements20.prepend("");
        boolean boolean23 = elements9.removeAll((java.util.Collection<org.jsoup.nodes.Element>) elements22);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element25 = elements9.remove(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(elementItor5);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "#root" + "'", str12, "#root");
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertNotNull(elements20);
        org.junit.Assert.assertNotNull(elements22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test631");
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parse("ohi", "[!]");
        org.junit.Assert.assertNotNull(document2);
    }

    @Test
    public void test632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test632");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.select.Elements elements3 = document1.getElementsByTag("#root");
        java.lang.String str4 = elements3.text();
        org.jsoup.nodes.Document document6 = new org.jsoup.nodes.Document("#root");
        boolean boolean7 = document6.hasText();
        org.jsoup.select.Elements elements9 = document6.getElementsByIndexEquals(10);
        java.lang.Object[] objArray10 = elements9.toArray();
        boolean boolean11 = elements3.retainAll((java.util.Collection<org.jsoup.nodes.Element>) elements9);
        java.lang.String str12 = elements9.text();
        org.jsoup.nodes.Document document14 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str15 = document14.tagName();
        org.jsoup.select.Elements elements17 = document14.getElementsByIndexGreaterThan((-1));
        java.lang.String str18 = document14.toString();
        org.jsoup.nodes.Element element20 = document14.text("#root=\"hi!\"");
        int int21 = elements9.lastIndexOf((java.lang.Object) "#root=\"hi!\"");
        org.jsoup.nodes.Element element22 = elements9.first();
        java.lang.String str23 = elements9.text();
        org.jsoup.select.Elements elements25 = elements9.eq((int) (byte) 10);
        org.jsoup.select.Elements elements27 = elements25.wrap("&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;hi!");
        org.jsoup.nodes.Document document30 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str31 = document30.tagName();
        org.jsoup.parser.Tag tag32 = document30.tag();
        org.jsoup.nodes.TextNode textNode35 = new org.jsoup.nodes.TextNode("hi!", "");
        org.jsoup.nodes.Node node36 = textNode35.parent();
        org.jsoup.nodes.Element element37 = document30.appendChild((org.jsoup.nodes.Node) textNode35);
        org.jsoup.select.Elements elements39 = element37.getElementsByClass("#root");
        java.lang.String str40 = elements39.html();
        org.jsoup.nodes.Document document42 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.select.Elements elements44 = document42.getElementsByTag("#root");
        java.lang.String str45 = elements44.text();
        org.jsoup.nodes.Document document47 = new org.jsoup.nodes.Document("#root");
        boolean boolean48 = document47.hasText();
        org.jsoup.select.Elements elements50 = document47.getElementsByIndexEquals(10);
        java.lang.Object[] objArray51 = elements50.toArray();
        boolean boolean52 = elements44.retainAll((java.util.Collection<org.jsoup.nodes.Element>) elements50);
        org.jsoup.nodes.Document document54 = new org.jsoup.nodes.Document("#root");
        boolean boolean55 = document54.hasText();
        org.jsoup.select.Elements elements57 = document54.getElementsByIndexEquals(10);
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor58 = elements57.listIterator();
        org.jsoup.select.Elements elements61 = elements57.attr("<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "hi!");
        boolean boolean62 = elements44.remove((java.lang.Object) elements61);
        java.util.stream.Stream<org.jsoup.nodes.Element> elementStream63 = elements44.parallelStream();
        boolean boolean64 = elements39.equals((java.lang.Object) elements44);
        org.jsoup.nodes.Element element65 = elements44.first();
        boolean boolean66 = elements27.addAll((int) (byte) 0, (java.util.Collection<org.jsoup.nodes.Element>) elements44);
        org.jsoup.nodes.Document document68 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.select.Elements elements70 = document68.getElementsByTag("#root");
        org.jsoup.select.Elements elements72 = elements70.append("<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!");
        org.jsoup.nodes.Document document74 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element76 = document74.prependElement("hi!");
        org.jsoup.nodes.Element element78 = element76.append("");
        org.jsoup.nodes.Document document80 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str81 = document80.tagName();
        org.jsoup.nodes.Element element83 = document80.append("hi!");
        org.jsoup.nodes.Document document85 = new org.jsoup.nodes.Document("#root");
        org.jsoup.nodes.Document document87 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.select.Elements elements89 = document87.getElementsByTag("#root");
        org.jsoup.nodes.Element[] elementArray90 = new org.jsoup.nodes.Element[] { element76, element83, document85, document87 };
        org.jsoup.select.Elements elements91 = new org.jsoup.select.Elements(elementArray90);
        java.util.stream.Stream<org.jsoup.nodes.Element> elementStream92 = elements91.parallelStream();
        boolean boolean93 = elements72.remove((java.lang.Object) elementStream92);
        org.jsoup.select.Elements elements95 = elements72.val("&lt;html&gt;\n &lt;head&gt;\n &lt;/head&gt;\n &lt;body&gt;\n &lt;/body&gt;\n&lt;/html&gt;hi!\n\n&lt;html&gt;\n &lt;head&gt;\n &lt;/head&gt;\n &lt;body&gt;\n &lt;/body&gt;\n&lt;/html&gt;\n\n &lt;head&gt;\n &lt;/head&gt;\n\n &lt;body&gt;\n &lt;/body&gt;");
        boolean boolean96 = elements27.equals((java.lang.Object) elements95);
        java.lang.String str97 = elements27.outerHtml();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element99 = elements27.remove((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(document14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "#root" + "'", str15, "#root");
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>" + "'", str18, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNull(element22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(elements25);
        org.junit.Assert.assertNotNull(elements27);
        org.junit.Assert.assertNotNull(document30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "#root" + "'", str31, "#root");
        org.junit.Assert.assertNotNull(tag32);
        org.junit.Assert.assertNull(node36);
        org.junit.Assert.assertNotNull(element37);
        org.junit.Assert.assertNotNull(elements39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNotNull(document42);
        org.junit.Assert.assertNotNull(elements44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(elements50);
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray51), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray51), "[]");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(elements57);
        org.junit.Assert.assertNotNull(elementItor58);
        org.junit.Assert.assertNotNull(elements61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(elementStream63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNull(element65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(document68);
        org.junit.Assert.assertNotNull(elements70);
        org.junit.Assert.assertNotNull(elements72);
        org.junit.Assert.assertNotNull(document74);
        org.junit.Assert.assertNotNull(element76);
        org.junit.Assert.assertNotNull(element78);
        org.junit.Assert.assertNotNull(document80);
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "#root" + "'", str81, "#root");
        org.junit.Assert.assertNotNull(element83);
        org.junit.Assert.assertNotNull(document87);
        org.junit.Assert.assertNotNull(elements89);
        org.junit.Assert.assertNotNull(elementArray90);
        org.junit.Assert.assertNotNull(elementStream92);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertNotNull(elements95);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
        org.junit.Assert.assertEquals("'" + str97 + "' != '" + "" + "'", str97, "");
    }

    @Test
    public void test633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test633");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element3 = document1.prependElement("hi!");
        org.jsoup.nodes.Element element5 = element3.append("");
        org.jsoup.nodes.Element element6 = element5.previousElementSibling();
        java.lang.String str7 = element5.nodeName();
        org.jsoup.select.Elements elements10 = element5.getElementsByAttributeValueStarting("<!<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!>", "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>");
        java.lang.String str11 = element5.nodeName();
        org.jsoup.nodes.Element element12 = element5.firstElementSibling();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNull(element6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(element12);
    }

    @Test
    public void test634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test634");
        org.jsoup.safety.Whitelist whitelist2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.jsoup.Jsoup.clean("!", "\n<!--<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!-->", whitelist2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test635");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("#root", "#root");
        java.lang.String str4 = document2.absUrl("#root=\"\"");
        document2.title("#document");
        document2.setBaseUri("#text");
        org.jsoup.nodes.Attributes attributes9 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor10 = attributes9.iterator();
        org.jsoup.nodes.Attributes attributes11 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor12 = attributes11.iterator();
        boolean boolean14 = attributes11.hasKey("");
        attributes11.remove("#root=\"\"");
        attributes9.addAll(attributes11);
        attributes11.put("#root=\"hi!\"", "#root");
        org.jsoup.nodes.Attribute attribute23 = new org.jsoup.nodes.Attribute("#comment", "#root=\"\"=\"\"");
        attributes11.put(attribute23);
        org.jsoup.nodes.Attribute attribute27 = new org.jsoup.nodes.Attribute("#root", "");
        java.lang.String str28 = attribute27.getKey();
        attribute27.setKey("#root=\"\"");
        java.lang.String str31 = attribute27.toString();
        java.lang.String str32 = attribute27.html();
        attributes11.put(attribute27);
        boolean boolean34 = document2.equals((java.lang.Object) attributes11);
        org.jsoup.nodes.Document document37 = org.jsoup.Jsoup.parse("&lt;?#root=&quot;&amp;lt;html&amp;gt; &amp;lt;head&amp;gt; &amp;lt;/head&amp;gt; &amp;lt;body&amp;gt; &amp;lt;/body&amp;gt; &amp;lt;/html&amp;gt;&quot;&gt;", "<html>\n<head>\n</head>\n<body> #root\n</body>\n</html>");
        org.jsoup.select.Elements elements40 = document37.getElementsByAttributeValueNot("<html>\n <head>\n </head>\n <body>\n </body>\n</html>hi!\n<head>\n </head>\n <body>\n </body>\n\n", "org.jsoup.select.Selector$SelectorParseException: hi!");
        boolean boolean41 = attributes11.equals((java.lang.Object) "<html>\n <head>\n </head>\n <body>\n </body>\n</html>hi!\n<head>\n </head>\n <body>\n </body>\n\n");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(attributeItor10);
        org.junit.Assert.assertNotNull(attributeItor12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "#root" + "'", str28, "#root");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "#root=\"\"=\"\"" + "'", str31, "#root=\"\"=\"\"");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "#root=\"\"=\"\"" + "'", str32, "#root=\"\"=\"\"");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(document37);
        org.junit.Assert.assertNotNull(elements40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test636");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str2 = document1.tagName();
        org.jsoup.parser.Tag tag3 = document1.tag();
        org.jsoup.nodes.Document document5 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str6 = document5.tagName();
        org.jsoup.parser.Tag tag7 = document5.tag();
        boolean boolean8 = tag7.isEmpty();
        org.jsoup.nodes.Document document10 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str11 = document10.tagName();
        org.jsoup.parser.Tag tag12 = document10.tag();
        org.jsoup.nodes.Element element14 = new org.jsoup.nodes.Element(tag12, "#root=\"\"");
        org.jsoup.nodes.Document document16 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str17 = document16.tagName();
        org.jsoup.parser.Tag tag18 = document16.tag();
        boolean boolean19 = tag12.canContain(tag18);
        boolean boolean20 = tag7.isValidParent(tag12);
        org.jsoup.nodes.Document document22 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str23 = document22.tagName();
        org.jsoup.parser.Tag tag24 = document22.tag();
        boolean boolean25 = tag24.isEmpty();
        boolean boolean26 = tag12.canContain(tag24);
        boolean boolean27 = tag3.canContain(tag24);
        org.jsoup.nodes.Attributes attributes29 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor30 = attributes29.iterator();
        java.lang.String str31 = attributes29.toString();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator32 = attributes29.spliterator();
        org.jsoup.nodes.Element element33 = new org.jsoup.nodes.Element(tag24, "hi!", attributes29);
        org.jsoup.nodes.Document document35 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element37 = document35.prependElement("hi!");
        org.jsoup.nodes.Element element38 = element37.parent();
        org.jsoup.nodes.Element element39 = element37.empty();
        org.jsoup.nodes.Element element40 = element39.empty();
        java.lang.String str41 = element40.nodeName();
        org.jsoup.nodes.Document document43 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str44 = document43.tagName();
        org.jsoup.nodes.Element element46 = document43.append("hi!");
        java.lang.String str47 = document43.outerHtml();
        org.jsoup.select.Elements elements48 = document43.children();
        org.jsoup.nodes.Document document50 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.select.Elements elements52 = document50.getElementsByTag("#root");
        boolean boolean53 = document43.equals((java.lang.Object) document50);
        org.jsoup.nodes.Element element55 = document50.append("#text");
        element40.replaceWith((org.jsoup.nodes.Node) document50);
        boolean boolean57 = tag24.equals((java.lang.Object) element40);
        java.lang.String str58 = element40.text();
        org.jsoup.select.Elements elements60 = element40.getElementsByAttribute("<!hi!>");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#root" + "'", str2, "#root");
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertNotNull(document5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#root" + "'", str6, "#root");
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#root" + "'", str11, "#root");
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertNotNull(document16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "#root" + "'", str17, "#root");
        org.junit.Assert.assertNotNull(tag18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(document22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "#root" + "'", str23, "#root");
        org.junit.Assert.assertNotNull(tag24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(attributeItor30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(attributeSpliterator32);
        org.junit.Assert.assertNotNull(document35);
        org.junit.Assert.assertNotNull(element37);
        org.junit.Assert.assertNotNull(element38);
        org.junit.Assert.assertNotNull(element39);
        org.junit.Assert.assertNotNull(element40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertNotNull(document43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "#root" + "'", str44, "#root");
        org.junit.Assert.assertNotNull(element46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!" + "'", str47, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!");
        org.junit.Assert.assertNotNull(elements48);
        org.junit.Assert.assertNotNull(document50);
        org.junit.Assert.assertNotNull(elements52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(element55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertNotNull(elements60);
    }

    @Test
    public void test637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test637");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str2 = document1.tagName();
        org.jsoup.nodes.Element element4 = document1.append("hi!");
        java.lang.String str5 = document1.outerHtml();
        org.jsoup.select.Elements elements6 = document1.children();
        org.jsoup.nodes.Document document8 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.select.Elements elements10 = document8.getElementsByTag("#root");
        boolean boolean11 = document1.equals((java.lang.Object) document8);
        org.jsoup.nodes.Element element13 = document8.createElement("\n<!--#root=\"\"-->");
        org.jsoup.nodes.Document document16 = org.jsoup.Jsoup.parseBodyFragment("#root=\"\"", "<#root>\n</#root>");
        java.lang.String str17 = document16.nodeName();
        org.jsoup.select.Elements elements19 = document16.getElementsByIndexEquals(10);
        java.lang.String str20 = document16.toString();
        org.jsoup.nodes.Element element22 = document16.append("hi!");
        org.jsoup.nodes.Document document24 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element26 = document24.prependElement("hi!");
        org.jsoup.nodes.Element element27 = element26.parent();
        org.jsoup.nodes.Element element28 = element26.empty();
        org.jsoup.nodes.Element element29 = element28.empty();
        java.util.Set<java.lang.String> strSet30 = element29.classNames();
        org.jsoup.nodes.Element element31 = document16.classNames(strSet30);
        org.jsoup.nodes.Element element33 = document16.prependElement("<?<html>\n<head>\n</head>\n<body>\n</body>\n</html>>");
        java.util.Set<java.lang.String> strSet34 = document16.classNames();
        org.jsoup.nodes.Element element35 = element13.classNames(strSet34);
        org.jsoup.parser.Tag tag36 = element13.tag();
        org.jsoup.select.Elements elements39 = element13.getElementsByAttributeValueEnding("[o, r, g, ., j, s, o, u, p, ., s, e, l, e, c, t, ., S, e, l, e, c, t, o, r, $, S, e, l, e, c, t, o, r, P, a, r, s, e, E, x, c, e, p, t, i, o, n, :,  , h, i, !, <, h, t, m, l, >, \n, <, h, e, a, d, >, \n, <, /, h, e, a, d, >, \n, <, b, o, d, y, >, \n, <, /, b, o, d, y, >, \n, <, /, h, t, m, l, >]", "<?<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!>");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#root" + "'", str2, "#root");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!" + "'", str5, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(document16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "#document" + "'", str17, "#document");
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>" + "'", str20, "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>");
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(document24);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertNotNull(strSet30);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertNotNull(strSet34);
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertNotNull(tag36);
        org.junit.Assert.assertNotNull(elements39);
    }

    @Test
    public void test638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test638");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!");
        org.jsoup.nodes.Element element3 = document1.text("org.jsoup.select.Selector$SelectorParseException: hi!<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element5 = element3.html("#root=&quot;&quot;");
        org.jsoup.nodes.Node node6 = element3.parent();
        org.jsoup.nodes.Element element8 = element3.removeClass("#root=\"\"");
        org.jsoup.select.Elements elements10 = element3.getElementsByClass("<html>\n  <head>\n  </head>\n  <body>\n  </body>\n </html>hi!<#root>\n  <html>\n   <head>\n   </head>\n   <body>\n   </body>\n  </html>hi!\n </#root>\n<head>\n  </head>\n  <body>\n  </body>\n\n\n<html>\n   <head>\n   </head>\n   <body>\n   </body>\n  </html>hi!\n<head>\n   </head>\n   <body>\n   </body>\n\n");
        java.lang.String str11 = element3.toString();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#root=&quot;&quot;" + "'", str11, "#root=&quot;&quot;");
    }

    @Test
    public void test639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test639");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str2 = document1.tagName();
        org.jsoup.parser.Tag tag3 = document1.tag();
        java.lang.String str4 = document1.outerHtml();
        java.lang.String str5 = document1.outerHtml();
        java.lang.String str6 = document1.title();
        org.jsoup.nodes.Element element7 = document1.empty();
        org.jsoup.nodes.Element element9 = document1.html("org.jsoup.select.Selector$SelectorParseException: <#root>\n</#root>");
        java.lang.String str10 = document1.outerHtml();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#root" + "'", str2, "#root");
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>" + "'", str4, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>" + "'", str5, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "org.jsoup.select.Selector$SelectorParseException: &lt;#root&gt;" + "'", str10, "org.jsoup.select.Selector$SelectorParseException: &lt;#root&gt;");
    }

    @Test
    public void test640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test640");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str2 = document1.tagName();
        org.jsoup.nodes.Element element4 = document1.append("hi!");
        java.lang.String str5 = document1.outerHtml();
        org.jsoup.select.Elements elements6 = document1.children();
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("#root");
        boolean boolean10 = document9.hasText();
        org.jsoup.select.Elements elements12 = document9.getElementsByIndexEquals(10);
        org.jsoup.nodes.Document document14 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str15 = document14.tagName();
        org.jsoup.parser.Tag tag16 = document14.tag();
        org.jsoup.nodes.TextNode textNode19 = new org.jsoup.nodes.TextNode("hi!", "");
        org.jsoup.nodes.Node node20 = textNode19.parent();
        org.jsoup.nodes.Element element21 = document14.appendChild((org.jsoup.nodes.Node) textNode19);
        org.jsoup.select.Elements elements23 = element21.getElementsByClass("#root");
        org.jsoup.nodes.Element element24 = document9.prependChild((org.jsoup.nodes.Node) element21);
        org.jsoup.select.Elements elements27 = element21.getElementsByAttributeValueNot("#text", "#document");
        org.jsoup.nodes.Element element29 = element21.appendElement("<?<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!>");
        elements6.add((int) (byte) 1, element21);
        org.jsoup.nodes.Element element32 = element21.append("#comment");
        org.jsoup.nodes.Node node33 = element21.parent();
        org.jsoup.select.Elements elements34 = element21.siblingElements();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#root" + "'", str2, "#root");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!" + "'", str5, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(document14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "#root" + "'", str15, "#root");
        org.junit.Assert.assertNotNull(tag16);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(elements23);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(elements27);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertNotNull(element32);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertNotNull(elements34);
    }

    @Test
    public void test641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test641");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("org.jsoup.select.Selector$SelectorParseException: hi!", "<html>\n<head>\n</head>\n<body>\n #root\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document2);
    }

    @Test
    public void test642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test642");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str2 = document1.tagName();
        org.jsoup.nodes.Element element4 = document1.append("hi!");
        org.jsoup.nodes.Element element6 = document1.html("org.jsoup.select.Selector$SelectorParseException: hi!");
        org.jsoup.nodes.Element element8 = document1.prependText("<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>");
        org.jsoup.nodes.Element element10 = document1.createElement("aorg");
        boolean boolean11 = document1.isBlock();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#root" + "'", str2, "#root");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test643");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str2 = document1.tagName();
        org.jsoup.parser.Tag tag3 = document1.tag();
        org.jsoup.nodes.Element element4 = document1.body();
        java.lang.String str5 = document1.text();
        org.jsoup.select.Elements elements6 = document1.children();
        org.jsoup.nodes.Document document8 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.select.Elements elements10 = document8.getElementsByTag("#root");
        java.lang.String str11 = elements10.text();
        org.jsoup.nodes.Document document13 = new org.jsoup.nodes.Document("#root");
        boolean boolean14 = document13.hasText();
        org.jsoup.select.Elements elements16 = document13.getElementsByIndexEquals(10);
        java.lang.Object[] objArray17 = elements16.toArray();
        boolean boolean18 = elements10.retainAll((java.util.Collection<org.jsoup.nodes.Element>) elements16);
        java.lang.String str19 = elements16.text();
        org.jsoup.nodes.Document document21 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str22 = document21.tagName();
        org.jsoup.select.Elements elements24 = document21.getElementsByIndexGreaterThan((-1));
        java.lang.String str25 = document21.toString();
        org.jsoup.nodes.Element element27 = document21.text("#root=\"hi!\"");
        int int28 = elements16.lastIndexOf((java.lang.Object) "#root=\"hi!\"");
        org.jsoup.select.Elements elements30 = elements16.select("#root");
        java.util.Spliterator<org.jsoup.nodes.Element> elementSpliterator31 = elements16.spliterator();
        boolean boolean32 = elements6.addAll((java.util.Collection<org.jsoup.nodes.Element>) elements16);
        org.jsoup.select.Elements elements34 = elements6.wrap("\n<hi!>\n&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; #root=&amp;quot;&amp;quot; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;hi!<#declaration>\n</#declaration>\n</hi!>");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#root" + "'", str2, "#root");
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(document21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "#root" + "'", str22, "#root");
        org.junit.Assert.assertNotNull(elements24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>" + "'", str25, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(elements30);
        org.junit.Assert.assertNotNull(elementSpliterator31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(elements34);
    }

    @Test
    public void test644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test644");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str2 = document1.tagName();
        org.jsoup.parser.Tag tag3 = document1.tag();
        boolean boolean4 = tag3.isEmpty();
        boolean boolean5 = tag3.isBlock();
        org.jsoup.parser.Tag tag6 = tag3.getImplicitParent();
        boolean boolean7 = tag6.isEmpty();
        org.jsoup.nodes.Document document9 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str10 = document9.tagName();
        org.jsoup.parser.Tag tag11 = document9.tag();
        org.jsoup.nodes.Document document13 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str14 = document13.tagName();
        org.jsoup.parser.Tag tag15 = document13.tag();
        boolean boolean16 = tag15.isEmpty();
        org.jsoup.nodes.Document document18 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str19 = document18.tagName();
        org.jsoup.parser.Tag tag20 = document18.tag();
        org.jsoup.nodes.Element element22 = new org.jsoup.nodes.Element(tag20, "#root=\"\"");
        org.jsoup.nodes.Document document24 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str25 = document24.tagName();
        org.jsoup.parser.Tag tag26 = document24.tag();
        boolean boolean27 = tag20.canContain(tag26);
        boolean boolean28 = tag15.isValidParent(tag20);
        org.jsoup.nodes.Document document30 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str31 = document30.tagName();
        org.jsoup.parser.Tag tag32 = document30.tag();
        boolean boolean33 = tag32.isEmpty();
        boolean boolean34 = tag20.canContain(tag32);
        boolean boolean35 = tag11.canContain(tag32);
        org.jsoup.nodes.Attributes attributes37 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor38 = attributes37.iterator();
        java.lang.String str39 = attributes37.toString();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator40 = attributes37.spliterator();
        org.jsoup.nodes.Element element41 = new org.jsoup.nodes.Element(tag32, "hi!", attributes37);
        org.jsoup.nodes.Document document43 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element45 = document43.prependElement("hi!");
        org.jsoup.nodes.Element element46 = element45.parent();
        org.jsoup.nodes.Element element47 = element45.empty();
        org.jsoup.nodes.Element element48 = element47.empty();
        java.lang.String str49 = element48.nodeName();
        org.jsoup.nodes.Document document51 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str52 = document51.tagName();
        org.jsoup.nodes.Element element54 = document51.append("hi!");
        java.lang.String str55 = document51.outerHtml();
        org.jsoup.select.Elements elements56 = document51.children();
        org.jsoup.nodes.Document document58 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.select.Elements elements60 = document58.getElementsByTag("#root");
        boolean boolean61 = document51.equals((java.lang.Object) document58);
        org.jsoup.nodes.Element element63 = document58.append("#text");
        element48.replaceWith((org.jsoup.nodes.Node) document58);
        boolean boolean65 = tag32.equals((java.lang.Object) element48);
        boolean boolean66 = tag6.isValidParent(tag32);
        org.jsoup.nodes.Attributes attributes68 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor69 = attributes68.iterator();
        boolean boolean71 = attributes68.hasKey("");
        attributes68.remove("#root=\"\"");
        java.lang.String str74 = attributes68.html();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor75 = attributes68.iterator();
        java.lang.String str76 = attributes68.toString();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor77 = attributes68.iterator();
        org.jsoup.nodes.Element element78 = new org.jsoup.nodes.Element(tag6, "[!]", attributes68);
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#root" + "'", str2, "#root");
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(document9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#root" + "'", str10, "#root");
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#root" + "'", str14, "#root");
        org.junit.Assert.assertNotNull(tag15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(document18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "#root" + "'", str19, "#root");
        org.junit.Assert.assertNotNull(tag20);
        org.junit.Assert.assertNotNull(document24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "#root" + "'", str25, "#root");
        org.junit.Assert.assertNotNull(tag26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(document30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "#root" + "'", str31, "#root");
        org.junit.Assert.assertNotNull(tag32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(attributeItor38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(attributeSpliterator40);
        org.junit.Assert.assertNotNull(document43);
        org.junit.Assert.assertNotNull(element45);
        org.junit.Assert.assertNotNull(element46);
        org.junit.Assert.assertNotNull(element47);
        org.junit.Assert.assertNotNull(element48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!" + "'", str49, "hi!");
        org.junit.Assert.assertNotNull(document51);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "#root" + "'", str52, "#root");
        org.junit.Assert.assertNotNull(element54);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!" + "'", str55, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!");
        org.junit.Assert.assertNotNull(elements56);
        org.junit.Assert.assertNotNull(document58);
        org.junit.Assert.assertNotNull(elements60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(element63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(attributeItor69);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "" + "'", str74, "");
        org.junit.Assert.assertNotNull(attributeItor75);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "" + "'", str76, "");
        org.junit.Assert.assertNotNull(attributeItor77);
    }

    @Test
    public void test645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test645");
        org.jsoup.safety.Whitelist whitelist2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.jsoup.Jsoup.clean("<!hi!>", "<#root>\n<html>\n <head>\n </head>\n <body>\n  #root=&quot;&quot;\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!", whitelist2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test646");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str2 = document1.id();
        org.jsoup.select.Elements elements3 = document1.children();
        org.jsoup.select.Elements elements5 = elements3.html("#root=\"\"");
        boolean boolean7 = elements5.hasAttr("");
        org.jsoup.select.Elements elements10 = elements5.attr("ohi!", "hi!");
        org.jsoup.nodes.Document document12 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element14 = document12.prependElement("hi!");
        org.jsoup.nodes.Element element16 = element14.append("");
        org.jsoup.nodes.Document document18 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element20 = document18.prependElement("hi!");
        org.jsoup.nodes.Document document22 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element24 = document22.prependElement("hi!");
        org.jsoup.nodes.Element element26 = element24.append("");
        org.jsoup.nodes.Document document28 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element30 = document28.prependElement("hi!");
        org.jsoup.nodes.Element[] elementArray31 = new org.jsoup.nodes.Element[] { element16, element20, element24, document28 };
        java.util.ArrayList<org.jsoup.nodes.Element> elementList32 = new java.util.ArrayList<org.jsoup.nodes.Element>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<org.jsoup.nodes.Element>) elementList32, elementArray31);
        java.util.Spliterator<org.jsoup.nodes.Element> elementSpliterator34 = elementList32.spliterator();
        org.jsoup.nodes.Document document36 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element38 = document36.prependElement("hi!");
        org.jsoup.nodes.Element element40 = element38.append("");
        org.jsoup.nodes.Document document42 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element44 = document42.prependElement("hi!");
        org.jsoup.nodes.Document document46 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element48 = document46.prependElement("hi!");
        org.jsoup.nodes.Element element50 = element48.append("");
        org.jsoup.nodes.Document document52 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element54 = document52.prependElement("hi!");
        org.jsoup.nodes.Element[] elementArray55 = new org.jsoup.nodes.Element[] { element40, element44, element48, document52 };
        java.util.ArrayList<org.jsoup.nodes.Element> elementList56 = new java.util.ArrayList<org.jsoup.nodes.Element>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<org.jsoup.nodes.Element>) elementList56, elementArray55);
        java.util.Spliterator<org.jsoup.nodes.Element> elementSpliterator58 = elementList56.spliterator();
        org.jsoup.nodes.Document document60 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element62 = document60.prependElement("hi!");
        org.jsoup.nodes.Element element64 = element62.append("");
        org.jsoup.nodes.Document document66 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element68 = document66.prependElement("hi!");
        org.jsoup.nodes.Document document70 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element72 = document70.prependElement("hi!");
        org.jsoup.nodes.Element element74 = element72.append("");
        org.jsoup.nodes.Document document76 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element78 = document76.prependElement("hi!");
        org.jsoup.nodes.Element[] elementArray79 = new org.jsoup.nodes.Element[] { element64, element68, element72, document76 };
        java.util.ArrayList<org.jsoup.nodes.Element> elementList80 = new java.util.ArrayList<org.jsoup.nodes.Element>();
        boolean boolean81 = java.util.Collections.addAll((java.util.Collection<org.jsoup.nodes.Element>) elementList80, elementArray79);
        java.util.Spliterator<org.jsoup.nodes.Element> elementSpliterator82 = elementList80.spliterator();
        java.util.AbstractCollection[] abstractCollectionArray84 = new java.util.AbstractCollection[3];
        @SuppressWarnings("unchecked")
        java.util.AbstractCollection<org.jsoup.nodes.Element>[] elementCollectionArray85 = (java.util.AbstractCollection<org.jsoup.nodes.Element>[]) abstractCollectionArray84;
        elementCollectionArray85[0] = elementList32;
        elementCollectionArray85[1] = elementList56;
        elementCollectionArray85[2] = elementList80;
        // The following exception was thrown during execution in test generation
        try {
            java.util.AbstractCollection<org.jsoup.nodes.Element>[] elementCollectionArray92 = elements10.toArray(elementCollectionArray85);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayStoreException; message: null");
        } catch (java.lang.ArrayStoreException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(document18);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(document22);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertNotNull(document28);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertNotNull(elementArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(elementSpliterator34);
        org.junit.Assert.assertNotNull(document36);
        org.junit.Assert.assertNotNull(element38);
        org.junit.Assert.assertNotNull(element40);
        org.junit.Assert.assertNotNull(document42);
        org.junit.Assert.assertNotNull(element44);
        org.junit.Assert.assertNotNull(document46);
        org.junit.Assert.assertNotNull(element48);
        org.junit.Assert.assertNotNull(element50);
        org.junit.Assert.assertNotNull(document52);
        org.junit.Assert.assertNotNull(element54);
        org.junit.Assert.assertNotNull(elementArray55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(elementSpliterator58);
        org.junit.Assert.assertNotNull(document60);
        org.junit.Assert.assertNotNull(element62);
        org.junit.Assert.assertNotNull(element64);
        org.junit.Assert.assertNotNull(document66);
        org.junit.Assert.assertNotNull(element68);
        org.junit.Assert.assertNotNull(document70);
        org.junit.Assert.assertNotNull(element72);
        org.junit.Assert.assertNotNull(element74);
        org.junit.Assert.assertNotNull(document76);
        org.junit.Assert.assertNotNull(element78);
        org.junit.Assert.assertNotNull(elementArray79);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertNotNull(elementSpliterator82);
        org.junit.Assert.assertNotNull(abstractCollectionArray84);
        org.junit.Assert.assertNotNull(elementCollectionArray85);
    }

    @Test
    public void test647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test647");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("#data", "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!");
        org.jsoup.nodes.Element element3 = document2.body();
        org.jsoup.nodes.Element element4 = element3.firstElementSibling();
        java.lang.String str6 = element4.attr("<!#root=\"hi!\">");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test648");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str2 = document1.tagName();
        java.lang.String str3 = document1.html();
        org.jsoup.nodes.Element element5 = document1.append("#root=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;\"");
        java.util.Set<java.lang.String> strSet6 = element5.classNames();
        org.jsoup.nodes.Element element8 = element5.addClass("<#root>\n</#root>");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#root" + "'", str2, "#root");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>" + "'", str3, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNotNull(element8);
    }

    @Test
    public void test649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test649");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!");
        org.jsoup.nodes.Element element3 = document1.text("org.jsoup.select.Selector$SelectorParseException: hi!<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element5 = element3.html("#root=&quot;&quot;");
        org.jsoup.select.Elements elements6 = element5.getAllElements();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements6);
    }

    @Test
    public void test650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test650");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str2 = document1.tagName();
        org.jsoup.parser.Tag tag3 = document1.tag();
        boolean boolean4 = tag3.isEmpty();
        org.jsoup.nodes.Document document6 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str7 = document6.tagName();
        org.jsoup.parser.Tag tag8 = document6.tag();
        org.jsoup.nodes.Element element10 = new org.jsoup.nodes.Element(tag8, "#root=\"\"");
        org.jsoup.nodes.Document document12 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str13 = document12.tagName();
        org.jsoup.parser.Tag tag14 = document12.tag();
        boolean boolean15 = tag8.canContain(tag14);
        boolean boolean16 = tag3.isValidParent(tag8);
        org.jsoup.nodes.Document document18 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str19 = document18.tagName();
        org.jsoup.parser.Tag tag20 = document18.tag();
        boolean boolean21 = tag20.isEmpty();
        boolean boolean22 = tag8.canContain(tag20);
        boolean boolean23 = tag8.isEmpty();
        org.jsoup.nodes.Document document26 = org.jsoup.Jsoup.parseBodyFragment("#root=\"\"", "<#root>\n</#root>");
        java.lang.String str27 = document26.nodeName();
        org.jsoup.select.Elements elements29 = document26.getElementsByIndexEquals(10);
        java.lang.String str30 = document26.toString();
        org.jsoup.nodes.Element element32 = document26.append("hi!");
        org.jsoup.nodes.Document document34 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element36 = document34.prependElement("hi!");
        org.jsoup.nodes.Element element37 = element36.parent();
        org.jsoup.nodes.Element element38 = element36.empty();
        org.jsoup.nodes.Element element39 = element38.empty();
        java.util.Set<java.lang.String> strSet40 = element39.classNames();
        org.jsoup.nodes.Element element41 = document26.classNames(strSet40);
        org.jsoup.nodes.Element element43 = document26.prependElement("<?<html>\n<head>\n</head>\n<body>\n</body>\n</html>>");
        boolean boolean44 = tag8.equals((java.lang.Object) document26);
        org.jsoup.nodes.Document document45 = document26.normalise();
        org.jsoup.nodes.Document document46 = document26.normalise();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#root" + "'", str2, "#root");
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#root" + "'", str7, "#root");
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "#root" + "'", str13, "#root");
        org.junit.Assert.assertNotNull(tag14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(document18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "#root" + "'", str19, "#root");
        org.junit.Assert.assertNotNull(tag20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(document26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "#document" + "'", str27, "#document");
        org.junit.Assert.assertNotNull(elements29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>" + "'", str30, "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>");
        org.junit.Assert.assertNotNull(element32);
        org.junit.Assert.assertNotNull(document34);
        org.junit.Assert.assertNotNull(element36);
        org.junit.Assert.assertNotNull(element37);
        org.junit.Assert.assertNotNull(element38);
        org.junit.Assert.assertNotNull(element39);
        org.junit.Assert.assertNotNull(strSet40);
        org.junit.Assert.assertNotNull(element41);
        org.junit.Assert.assertNotNull(element43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(document45);
        org.junit.Assert.assertNotNull(document46);
    }

    @Test
    public void test651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test651");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str2 = document1.tagName();
        org.jsoup.nodes.Element element4 = document1.append("hi!");
        org.jsoup.nodes.Element element6 = document1.prependText("hi!");
        org.jsoup.nodes.Element element8 = document1.createElement("#root=\"hi!\"");
        org.jsoup.nodes.Element element10 = document1.append("ohi!");
        document1.setBaseUri("<html>\n<head>\n <title>#document</title>\n</head>\n<body>\n #root\n</body>\n</html>");
        org.jsoup.nodes.Node node14 = document1.removeAttr("[., j, s, o, u, p, ., s, e, l, e, c, t, ., S, e, l, e, c, t, o, r, $, S, e, l, e, c, t, o, r, P, a, r, s, e, E, x, c, e, p, t, i, o, n, :,  , h, i, !, <, h, t, m, l, >, \n, <, h, e, a, d, >, \n, <, /, h, e, a, d, >, \n, <, b, o, d, y, >, \n, <, /, b, o, d, y, >, \n, <, /, h, t, m, l, >]");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#root" + "'", str2, "#root");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(node14);
    }

    @Test
    public void test652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test652");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str2 = document1.tagName();
        org.jsoup.parser.Tag tag3 = document1.tag();
        java.lang.String str4 = document1.outerHtml();
        java.lang.String str5 = document1.outerHtml();
        org.jsoup.nodes.Element element7 = document1.prepend("hi");
        org.jsoup.nodes.Element element8 = element7.empty();
        java.lang.String str9 = element7.toString();
        org.jsoup.nodes.Element element11 = element7.appendElement("<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>");
        org.jsoup.select.Elements elements13 = element11.getElementsByClass("#root=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;\"");
        org.jsoup.nodes.Document document15 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str16 = document15.tagName();
        org.jsoup.parser.Tag tag17 = document15.tag();
        org.jsoup.nodes.Element element18 = document15.body();
        element18.remove();
        org.jsoup.nodes.Element element21 = element18.prependText("[]");
        java.lang.String str22 = element21.className();
        boolean boolean23 = elements13.add(element21);
        org.jsoup.select.Elements elements25 = elements13.eq(2);
        org.jsoup.nodes.Document document28 = org.jsoup.nodes.Document.createShell("#comment");
        org.jsoup.nodes.Element element30 = document28.val("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element31 = elements25.set((int) (byte) 10, (org.jsoup.nodes.Element) document28);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#root" + "'", str2, "#root");
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>" + "'", str4, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>" + "'", str5, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(document15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "#root" + "'", str16, "#root");
        org.junit.Assert.assertNotNull(tag17);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(elements25);
        org.junit.Assert.assertNotNull(document28);
        org.junit.Assert.assertNotNull(element30);
    }

    @Test
    public void test653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test653");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str2 = document1.tagName();
        org.jsoup.parser.Tag tag3 = document1.tag();
        java.lang.String str4 = document1.outerHtml();
        java.lang.String str5 = document1.outerHtml();
        org.jsoup.nodes.Element element7 = document1.prepend("hi");
        org.jsoup.nodes.Element element8 = element7.empty();
        org.jsoup.select.Elements elements11 = element7.getElementsByAttributeValueEnding("org", "\n<hi!>\n&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; #root=&amp;quot;&amp;quot; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;hi!<#declaration>\n</#declaration>\n</hi!>");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#root" + "'", str2, "#root");
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>" + "'", str4, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>" + "'", str5, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements11);
    }

    @Test
    public void test654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test654");
        org.jsoup.nodes.Document document2 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element4 = document2.prependElement("hi!");
        org.jsoup.nodes.Element element6 = element4.append("");
        org.jsoup.select.Elements elements7 = org.jsoup.select.Selector.select("#root", element6);
        java.lang.String str8 = elements7.text();
        org.jsoup.select.Elements elements10 = elements7.append("<html>\n <head>\n </head>\n <body>\n </body>\n</html>hi!\n<head>\n </head>\n <body>\n </body>\n\n");
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor12 = elements7.listIterator((int) (byte) 0);
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(elementItor12);
    }

    @Test
    public void test655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test655");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("#root");
        boolean boolean2 = document1.hasText();
        org.jsoup.select.Elements elements4 = document1.getElementsByIndexEquals(10);
        java.lang.Object[] objArray5 = elements4.toArray();
        org.jsoup.nodes.Document document8 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element10 = document8.prependElement("hi!");
        org.jsoup.nodes.Element element11 = element10.parent();
        org.jsoup.nodes.Element element12 = element10.empty();
        elements4.add(0, element12);
        org.jsoup.nodes.Document document15 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str16 = document15.tagName();
        org.jsoup.parser.Tag tag17 = document15.tag();
        org.jsoup.nodes.TextNode textNode20 = new org.jsoup.nodes.TextNode("hi!", "");
        org.jsoup.nodes.Node node21 = textNode20.parent();
        org.jsoup.nodes.Element element22 = document15.appendChild((org.jsoup.nodes.Node) textNode20);
        org.jsoup.select.Elements elements24 = element22.getElementsByClass("#root");
        org.jsoup.nodes.Element element25 = element12.prependChild((org.jsoup.nodes.Node) element22);
        org.jsoup.select.Elements elements27 = element22.getElementsByAttribute("#root=\"hi!\"");
        org.jsoup.nodes.Document document29 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str30 = document29.tagName();
        org.jsoup.nodes.Element element32 = document29.append("hi!");
        java.lang.String str33 = element32.outerHtml();
        boolean boolean35 = element32.equals((java.lang.Object) 1.0f);
        java.lang.String str36 = element32.nodeName();
        org.jsoup.nodes.Element element38 = element32.wrap("#comment");
        org.jsoup.nodes.Element element39 = element22.appendChild((org.jsoup.nodes.Node) element32);
        org.jsoup.select.Elements elements41 = element39.getElementsByClass("<?<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!>");
        org.jsoup.nodes.Element element43 = element39.prependElement("\n<#root class=\"\">\n</#root>");
        org.jsoup.nodes.Node node44 = element39.parent();
        org.jsoup.nodes.Node node45 = null;
        // The following exception was thrown during execution in test generation
        try {
            element39.replaceWith(node45);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(document15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "#root" + "'", str16, "#root");
        org.junit.Assert.assertNotNull(tag17);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(elements24);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(elements27);
        org.junit.Assert.assertNotNull(document29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "#root" + "'", str30, "#root");
        org.junit.Assert.assertNotNull(element32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!" + "'", str33, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "#document" + "'", str36, "#document");
        org.junit.Assert.assertNull(element38);
        org.junit.Assert.assertNotNull(element39);
        org.junit.Assert.assertNotNull(elements41);
        org.junit.Assert.assertNotNull(element43);
        org.junit.Assert.assertNotNull(node44);
    }

    @Test
    public void test656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test656");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("#root");
        boolean boolean2 = document1.hasText();
        org.jsoup.select.Elements elements4 = document1.getElementsByIndexEquals(10);
        java.lang.Object[] objArray5 = elements4.toArray();
        org.jsoup.nodes.Document document8 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element10 = document8.prependElement("hi!");
        org.jsoup.nodes.Element element11 = element10.parent();
        org.jsoup.nodes.Element element12 = element10.empty();
        elements4.add(0, element12);
        org.jsoup.nodes.Document document15 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str16 = document15.tagName();
        org.jsoup.parser.Tag tag17 = document15.tag();
        org.jsoup.nodes.TextNode textNode20 = new org.jsoup.nodes.TextNode("hi!", "");
        org.jsoup.nodes.Node node21 = textNode20.parent();
        org.jsoup.nodes.Element element22 = document15.appendChild((org.jsoup.nodes.Node) textNode20);
        org.jsoup.select.Elements elements24 = element22.getElementsByClass("#root");
        org.jsoup.nodes.Element element25 = element12.prependChild((org.jsoup.nodes.Node) element22);
        org.jsoup.select.Elements elements27 = element22.getElementsByAttribute("#root=\"hi!\"");
        org.jsoup.nodes.Document document29 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str30 = document29.tagName();
        org.jsoup.nodes.Element element32 = document29.append("hi!");
        java.lang.String str33 = element32.outerHtml();
        boolean boolean35 = element32.equals((java.lang.Object) 1.0f);
        java.lang.String str36 = element32.nodeName();
        org.jsoup.nodes.Element element38 = element32.wrap("#comment");
        org.jsoup.nodes.Element element39 = element22.appendChild((org.jsoup.nodes.Node) element32);
        org.jsoup.select.Elements elements41 = element39.getElementsByClass("<?<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!>");
        org.jsoup.select.Elements elements43 = element39.select("#document");
        org.jsoup.select.Elements elements46 = element39.getElementsByAttributeValue("<html>\n<head>\n</head>\n<body>\n &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;hi!\n</body>\n</html>", "<html>\n<head>\n</head>\n<body>\n #root\n</body>\n</html>");
        org.jsoup.nodes.Element element48 = element39.removeClass("[., j, s, o, u, p, ., s, e, l, e, c, t, ., S, e, l, e, c, t, o, r, $, S, e, l, e, c, t, o, r, P, a, r, s, e, E, x, c, e, p, t, i, o, n, :,  , h, i, !, <, h, t, m, l, >, \n, <, h, e, a, d, >, \n, <, /, h, e, a, d, >, \n, <, b, o, d, y, >, \n, <, /, b, o, d, y, >, \n, <, /, h, t, m, l, >]");
        org.jsoup.nodes.Element element49 = element48.nextElementSibling();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(document15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "#root" + "'", str16, "#root");
        org.junit.Assert.assertNotNull(tag17);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(elements24);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(elements27);
        org.junit.Assert.assertNotNull(document29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "#root" + "'", str30, "#root");
        org.junit.Assert.assertNotNull(element32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!" + "'", str33, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "#document" + "'", str36, "#document");
        org.junit.Assert.assertNull(element38);
        org.junit.Assert.assertNotNull(element39);
        org.junit.Assert.assertNotNull(elements41);
        org.junit.Assert.assertNotNull(elements43);
        org.junit.Assert.assertNotNull(elements46);
        org.junit.Assert.assertNotNull(element48);
        org.junit.Assert.assertNull(element49);
    }

    @Test
    public void test657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test657");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parse("<!--#root=\"\"-->");
        java.lang.String str2 = document1.nodeName();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#document" + "'", str2, "#document");
    }

    @Test
    public void test658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test658");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("org.jsoup.select.Selector$SelectorParseException: hi!<html> <head> </head> <body> </body> </html>");
        org.junit.Assert.assertNotNull(document1);
    }

    @Test
    public void test659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test659");
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parseBodyFragment("", ".jsoup.select.Selector$SelectorParseException: hi!<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.parser.Tag tag3 = document2.tag();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(tag3);
    }

    @Test
    public void test660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test660");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element3 = document1.text("org.jsoup.select.Selector$SelectorParseException: <#root>\n</#root>");
        org.jsoup.nodes.Document document4 = document1.normalise();
        org.jsoup.nodes.Element element6 = document1.prepend("[o, r, g, ., j, s, o, u, p, ., s, e, l, e, c, t, ., S, e, l, e, c, t, o, r, $, S, e, l, e, c, t, o, r, P, a, r, s, e, E, x, c, e, p, t, i, o, n, :,  , h, i, !, <, h, t, m, l, >, \n, <, h, e, a, d, >, \n, <, /, h, e, a, d, >, \n, <, b, o, d, y, >, \n, <, /, b, o, d, y, >, \n, <, /, h, t, m, l, >]");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(document4);
        org.junit.Assert.assertNotNull(element6);
    }

    @Test
    public void test661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test661");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("<html>\n<head>\n</head>\n<body>\n &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;hi! &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; \n</body>\n</html>");
        org.junit.Assert.assertNotNull(document1);
    }

    @Test
    public void test662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test662");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str2 = document1.id();
        org.jsoup.select.Elements elements3 = document1.children();
        org.jsoup.select.Elements elements5 = elements3.html("#root=\"\"");
        boolean boolean7 = elements5.hasAttr("");
        org.jsoup.select.Elements elements10 = elements5.attr("ohi!", "hi!");
        org.jsoup.nodes.Attribute attribute13 = new org.jsoup.nodes.Attribute("#root", "");
        java.lang.String str14 = attribute13.getKey();
        java.lang.String str15 = attribute13.html();
        attribute13.setValue("hi!");
        boolean boolean18 = elements10.remove((java.lang.Object) "hi!");
        org.jsoup.nodes.Element element20 = elements10.remove(0);
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#root" + "'", str14, "#root");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "#root=\"\"" + "'", str15, "#root=\"\"");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(element20);
    }

    @Test
    public void test663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test663");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str2 = document1.tagName();
        org.jsoup.parser.Tag tag3 = document1.tag();
        org.jsoup.nodes.Element element5 = new org.jsoup.nodes.Element(tag3, "#root=\"\"");
        org.jsoup.select.Elements elements7 = element5.getElementsByClass("<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>");
        org.jsoup.nodes.Node node8 = element5.parent();
        org.jsoup.select.Elements elements10 = element5.getElementsByAttribute("#root=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;\"");
        org.jsoup.select.Elements elements12 = elements10.removeClass("<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>");
        org.jsoup.nodes.Document document14 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.select.Elements elements16 = document14.getElementsByTag("#root");
        java.lang.String str17 = elements16.text();
        org.jsoup.select.Elements elements19 = elements16.toggleClass("");
        org.jsoup.select.Elements elements20 = new org.jsoup.select.Elements((java.util.List<org.jsoup.nodes.Element>) elements19);
        org.jsoup.nodes.Document document23 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element25 = document23.prependElement("hi!");
        org.jsoup.nodes.Element element27 = element25.append("");
        org.jsoup.select.Elements elements28 = org.jsoup.select.Selector.select("#root", element27);
        org.jsoup.select.Elements elements30 = elements28.prepend("\n<!--#root=\"\"-->");
        boolean boolean31 = elements19.retainAll((java.util.Collection<org.jsoup.nodes.Element>) elements28);
        boolean boolean33 = elements28.equals((java.lang.Object) (short) -1);
        boolean boolean34 = elements12.addAll((java.util.Collection<org.jsoup.nodes.Element>) elements28);
        org.jsoup.nodes.Document document36 = new org.jsoup.nodes.Document("#root");
        boolean boolean37 = document36.hasText();
        org.jsoup.select.Elements elements39 = document36.getElementsByIndexEquals(10);
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor40 = elements39.listIterator();
        org.jsoup.select.Elements elements41 = new org.jsoup.select.Elements((java.util.List<org.jsoup.nodes.Element>) elements39);
        org.jsoup.select.Elements elements43 = elements39.select("&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;hi!");
        org.jsoup.select.Elements elements45 = elements39.prepend("[., j, s, o, u, p, ., s, e, l, e, c, t, ., S, e, l, e, c, t, o, r, $, S, e, l, e, c, t, o, r, P, a, r, s, e, E, x, c, e, p, t, i, o, n, :,  , h, i, !, <, h, t, m, l, >, \n, <, h, e, a, d, >, \n, <, /, h, e, a, d, >, \n, <, b, o, d, y, >, \n, <, /, b, o, d, y, >, \n, <, /, h, t, m, l, >]");
        org.jsoup.nodes.Document document47 = new org.jsoup.nodes.Document("#root");
        boolean boolean48 = document47.hasText();
        org.jsoup.select.Elements elements50 = document47.getElementsByIndexEquals(10);
        java.lang.Object[] objArray51 = elements50.toArray();
        org.jsoup.nodes.Document document54 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element56 = document54.prependElement("hi!");
        org.jsoup.nodes.Element element57 = element56.parent();
        org.jsoup.nodes.Element element58 = element56.empty();
        elements50.add(0, element58);
        org.jsoup.nodes.Document document61 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str62 = document61.tagName();
        org.jsoup.parser.Tag tag63 = document61.tag();
        org.jsoup.nodes.TextNode textNode66 = new org.jsoup.nodes.TextNode("hi!", "");
        org.jsoup.nodes.Node node67 = textNode66.parent();
        org.jsoup.nodes.Element element68 = document61.appendChild((org.jsoup.nodes.Node) textNode66);
        org.jsoup.select.Elements elements70 = element68.getElementsByClass("#root");
        org.jsoup.nodes.Element element71 = element58.prependChild((org.jsoup.nodes.Node) element68);
        boolean boolean72 = elements45.add(element58);
        boolean boolean73 = elements12.addAll((java.util.Collection<org.jsoup.nodes.Element>) elements45);
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#root" + "'", str2, "#root");
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(document14);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertNotNull(document23);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertNotNull(elements28);
        org.junit.Assert.assertNotNull(elements30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(elements39);
        org.junit.Assert.assertNotNull(elementItor40);
        org.junit.Assert.assertNotNull(elements43);
        org.junit.Assert.assertNotNull(elements45);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(elements50);
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray51), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray51), "[]");
        org.junit.Assert.assertNotNull(document54);
        org.junit.Assert.assertNotNull(element56);
        org.junit.Assert.assertNotNull(element57);
        org.junit.Assert.assertNotNull(element58);
        org.junit.Assert.assertNotNull(document61);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "#root" + "'", str62, "#root");
        org.junit.Assert.assertNotNull(tag63);
        org.junit.Assert.assertNull(node67);
        org.junit.Assert.assertNotNull(element68);
        org.junit.Assert.assertNotNull(elements70);
        org.junit.Assert.assertNotNull(element71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
    }

    @Test
    public void test664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test664");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str2 = document1.tagName();
        java.lang.String str3 = document1.html();
        org.jsoup.nodes.Element element5 = document1.append("hi!");
        boolean boolean7 = document1.hasAttr("#declaration");
        org.jsoup.nodes.Document document10 = org.jsoup.Jsoup.parseBodyFragment("#root=\"\"", "<#root>\n</#root>");
        java.lang.String str11 = document10.toString();
        java.lang.String str12 = document10.nodeName();
        java.lang.String str13 = document10.outerHtml();
        org.jsoup.nodes.Element element14 = document10.body();
        org.jsoup.nodes.Document document15 = document10.normalise();
        org.jsoup.nodes.Element element16 = document1.prependChild((org.jsoup.nodes.Node) document15);
        org.jsoup.nodes.Element element17 = document1.parent();
        org.jsoup.nodes.Document document20 = org.jsoup.parser.Parser.parseBodyFragment("#root", "#root");
        java.lang.String str22 = document20.absUrl("#root=\"\"");
        document20.title("#document");
        document20.setBaseUri("#text");
        org.jsoup.nodes.Document document29 = org.jsoup.parser.Parser.parseBodyFragment("#root", "#root");
        java.lang.String str31 = document29.absUrl("#root=\"\"");
        document29.title("#document");
        org.jsoup.nodes.Element[] elementArray34 = new org.jsoup.nodes.Element[] { document1, document20, document29 };
        org.jsoup.select.Elements elements35 = new org.jsoup.select.Elements(elementArray34);
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#root" + "'", str2, "#root");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>" + "'", str3, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>" + "'", str11, "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "#document" + "'", str12, "#document");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>" + "'", str13, "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>");
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(document15);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNull(element17);
        org.junit.Assert.assertNotNull(document20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(document29);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(elementArray34);
    }

    @Test
    public void test665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test665");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element3 = document1.prependElement("hi!");
        org.jsoup.nodes.Element element4 = element3.parent();
        org.jsoup.nodes.Element element5 = element3.empty();
        org.jsoup.nodes.Element element6 = element5.empty();
        java.lang.String str7 = element6.nodeName();
        org.jsoup.nodes.Document document9 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str10 = document9.tagName();
        org.jsoup.nodes.Element element12 = document9.append("hi!");
        java.lang.String str13 = document9.outerHtml();
        org.jsoup.select.Elements elements14 = document9.children();
        org.jsoup.nodes.Document document16 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.select.Elements elements18 = document16.getElementsByTag("#root");
        boolean boolean19 = document9.equals((java.lang.Object) document16);
        org.jsoup.nodes.Element element21 = document16.append("#text");
        element6.replaceWith((org.jsoup.nodes.Node) document16);
        org.jsoup.select.Elements elements24 = element6.getElementsByClass(" text=\"hi!\"");
        org.jsoup.nodes.Element element26 = element6.appendElement("<#root>\n</#root>");
        org.jsoup.nodes.Element element27 = element26.empty();
        java.lang.String str28 = element26.toString();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(document9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#root" + "'", str10, "#root");
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!" + "'", str13, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!");
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(document16);
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(elements24);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "\n<<#root>\n</#root>>\n</<#root>\n</#root>>" + "'", str28, "\n<<#root>\n</#root>>\n</<#root>\n</#root>>");
    }

    @Test
    public void test666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test666");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str2 = document1.tagName();
        org.jsoup.nodes.Element element4 = document1.append("hi!");
        java.lang.String str5 = document1.outerHtml();
        org.jsoup.select.Elements elements6 = document1.children();
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("#root");
        boolean boolean10 = document9.hasText();
        org.jsoup.select.Elements elements12 = document9.getElementsByIndexEquals(10);
        org.jsoup.nodes.Document document14 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str15 = document14.tagName();
        org.jsoup.parser.Tag tag16 = document14.tag();
        org.jsoup.nodes.TextNode textNode19 = new org.jsoup.nodes.TextNode("hi!", "");
        org.jsoup.nodes.Node node20 = textNode19.parent();
        org.jsoup.nodes.Element element21 = document14.appendChild((org.jsoup.nodes.Node) textNode19);
        org.jsoup.select.Elements elements23 = element21.getElementsByClass("#root");
        org.jsoup.nodes.Element element24 = document9.prependChild((org.jsoup.nodes.Node) element21);
        org.jsoup.select.Elements elements27 = element21.getElementsByAttributeValueNot("#text", "#document");
        org.jsoup.nodes.Element element29 = element21.appendElement("<?<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!>");
        elements6.add((int) (byte) 1, element21);
        org.jsoup.nodes.Document document32 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str33 = document32.tagName();
        org.jsoup.nodes.Element element35 = document32.append("hi!");
        java.lang.String str36 = document32.outerHtml();
        org.jsoup.select.Elements elements37 = document32.children();
        org.jsoup.select.Elements elements39 = elements37.html("#root=\"\"=\"\"");
        boolean boolean40 = elements6.contains((java.lang.Object) elements39);
        org.jsoup.select.Elements elements42 = elements6.removeClass("<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!");
        org.jsoup.nodes.Document document44 = new org.jsoup.nodes.Document("#root");
        boolean boolean45 = document44.hasText();
        org.jsoup.nodes.Element element47 = document44.createElement("hi!");
        org.jsoup.select.Elements elements49 = element47.getElementsByIndexEquals((int) (byte) 0);
        org.jsoup.select.Elements elements51 = elements49.removeClass("#root=\"\"");
        boolean boolean52 = elements42.retainAll((java.util.Collection<org.jsoup.nodes.Element>) elements51);
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#root" + "'", str2, "#root");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!" + "'", str5, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(document14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "#root" + "'", str15, "#root");
        org.junit.Assert.assertNotNull(tag16);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(elements23);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(elements27);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertNotNull(document32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "#root" + "'", str33, "#root");
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!" + "'", str36, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!");
        org.junit.Assert.assertNotNull(elements37);
        org.junit.Assert.assertNotNull(elements39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(elements42);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(element47);
        org.junit.Assert.assertNotNull(elements49);
        org.junit.Assert.assertNotNull(elements51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
    }

    @Test
    public void test667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test667");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("<?#root=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;\">", "[]");
        java.lang.String str3 = document2.data();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test668");
        org.jsoup.safety.Whitelist whitelist1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.jsoup.Jsoup.clean("<#root>\n</#root>=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;\"", whitelist1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test669");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("#root", "#root");
        org.jsoup.nodes.Element element4 = document2.addClass("<#root>\n</#root>");
        org.jsoup.nodes.Element element6 = element4.getElementById("<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>");
        org.jsoup.nodes.Element element8 = element4.prependElement("<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>");
        org.jsoup.nodes.Element element10 = element4.prependElement("<!hi!>");
        org.jsoup.nodes.Element element12 = element10.prependText("");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
    }

    @Test
    public void test670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test670");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements2 = document1.children();
        java.lang.String str3 = document1.outerHtml();
        org.jsoup.nodes.Element element5 = document1.appendText("<?#root=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;\">");
        org.jsoup.nodes.Element element7 = document1.append("\n<!--#root=\"\"-->");
        org.jsoup.select.Elements elements9 = document1.getElementsByIndexEquals((int) (short) -1);
        java.lang.String str10 = document1.title();
        org.junit.Assert.assertNotNull(elements2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test671");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str2 = document1.tagName();
        org.jsoup.nodes.Element element4 = document1.append("hi!");
        java.lang.String str5 = document1.outerHtml();
        org.jsoup.select.Elements elements6 = document1.children();
        org.jsoup.nodes.Document document8 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.select.Elements elements10 = document8.getElementsByTag("#root");
        boolean boolean11 = document1.equals((java.lang.Object) document8);
        org.jsoup.nodes.Node node13 = document1.childNode((int) (short) 0);
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#root" + "'", str2, "#root");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!" + "'", str5, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node13);
    }

    @Test
    public void test672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test672");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("#root", "#root");
        java.lang.String str3 = document2.nodeName();
        org.jsoup.nodes.Element element5 = document2.removeClass("\n<!--#root=\"\"-->");
        org.jsoup.nodes.Element element7 = element5.addClass("aorg");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
    }

    @Test
    public void test673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test673");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str2 = document1.tagName();
        org.jsoup.nodes.Element element4 = document1.append("hi!");
        org.jsoup.nodes.Element element6 = document1.prependText("hi!");
        org.jsoup.select.Elements elements9 = document1.getElementsByAttributeValue("#root=\"\"", "#root=\"hi!\"");
        boolean boolean10 = document1.isBlock();
        org.jsoup.nodes.Element element12 = document1.html("org.jsoup.select.Selector$SelectorParseException: <#root>\n</#root>");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#root" + "'", str2, "#root");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(element12);
    }

    @Test
    public void test674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test674");
        org.jsoup.safety.Whitelist whitelist1 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.jsoup.Jsoup.isValid("\n<hi!>\n</hi!>", whitelist1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test675");
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parseBodyFragment("#root=\"\"", "<#root>\n</#root>");
        java.lang.String str3 = document2.nodeName();
        org.jsoup.select.Elements elements5 = document2.getElementsByIndexEquals(10);
        java.lang.String str6 = document2.toString();
        org.jsoup.nodes.Element element8 = document2.append("hi!");
        org.jsoup.nodes.Document document10 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element12 = document10.prependElement("hi!");
        org.jsoup.nodes.Element element13 = element12.parent();
        org.jsoup.nodes.Element element14 = element12.empty();
        org.jsoup.nodes.Element element15 = element14.empty();
        java.util.Set<java.lang.String> strSet16 = element15.classNames();
        org.jsoup.nodes.Element element17 = document2.classNames(strSet16);
        org.jsoup.nodes.Element element19 = document2.prependElement("<?<html>\n<head>\n</head>\n<body>\n</body>\n</html>>");
        java.util.Set<java.lang.String> strSet20 = document2.classNames();
        org.jsoup.parser.Tag tag21 = document2.tag();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>" + "'", str6, "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>");
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(strSet20);
        org.junit.Assert.assertNotNull(tag21);
    }

    @Test
    public void test676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test676");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str2 = document1.tagName();
        java.lang.String str3 = document1.html();
        org.jsoup.nodes.Element element5 = document1.append("hi!");
        java.lang.String str6 = document1.nodeName();
        org.jsoup.nodes.Node node8 = document1.removeAttr("h");
        java.lang.String str9 = node8.baseUri();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#root" + "'", str2, "#root");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>" + "'", str3, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#document" + "'", str6, "#document");
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test677");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str2 = document1.tagName();
        java.lang.String str3 = document1.html();
        org.jsoup.nodes.Element element5 = document1.append("hi!");
        boolean boolean7 = document1.hasAttr("#declaration");
        org.jsoup.nodes.Document document10 = org.jsoup.Jsoup.parseBodyFragment("#root=\"\"", "<#root>\n</#root>");
        java.lang.String str11 = document10.toString();
        java.lang.String str12 = document10.nodeName();
        java.lang.String str13 = document10.outerHtml();
        org.jsoup.nodes.Element element14 = document10.body();
        org.jsoup.nodes.Document document15 = document10.normalise();
        org.jsoup.nodes.Element element16 = document1.prependChild((org.jsoup.nodes.Node) document15);
        java.util.List<org.jsoup.nodes.Node> nodeList17 = document1.childNodes();
        java.lang.String str18 = document1.outerHtml();
        org.jsoup.nodes.Element element20 = document1.createElement(" text=\"hi!\"");
        org.jsoup.nodes.Document document23 = org.jsoup.parser.Parser.parse("", "aorg");
        java.util.Set<java.lang.String> strSet24 = document23.classNames();
        org.jsoup.nodes.Element element25 = document1.classNames(strSet24);
        org.jsoup.nodes.Document document26 = document1.normalise();
        org.jsoup.nodes.Element element29 = document26.attr("<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!=\"#root=&quot;hi!&quot;\"", "<html>\n<head>\n</head>\n<body> ohi!\n</body>\n</html>");
        org.jsoup.select.Elements elements32 = element29.getElementsByAttributeValue("[]", "#document");
        org.jsoup.select.Elements elements34 = elements32.prepend("org.jsoup.select.Selector$SelectorParseException: hi!");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#root" + "'", str2, "#root");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>" + "'", str3, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>" + "'", str11, "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "#document" + "'", str12, "#document");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>" + "'", str13, "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>");
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(document15);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(nodeList17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "<#root>\n<html>\n <head>\n </head>\n <body>\n  #root=&quot;&quot;\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!" + "'", str18, "<#root>\n<html>\n <head>\n </head>\n <body>\n  #root=&quot;&quot;\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!");
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(document23);
        org.junit.Assert.assertNotNull(strSet24);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(document26);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertNotNull(elements32);
        org.junit.Assert.assertNotNull(elements34);
    }

    @Test
    public void test678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test678");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element3 = document1.prependElement("hi!");
        org.jsoup.nodes.Element element5 = element3.append("");
        org.jsoup.nodes.Element element7 = element3.prepend("<#root>\n</#root>");
        org.jsoup.select.Elements elements10 = element3.getElementsByAttributeValueStarting("#root=&quot;&quot;", "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>");
        java.lang.String str11 = elements10.html();
        org.jsoup.select.Elements elements13 = elements10.addClass("<#root>\n<html>\n <head>\n </head>\n <body>\n  #root=&quot;&quot;\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!");
        java.util.Spliterator<org.jsoup.nodes.Element> elementSpliterator14 = elements10.spliterator();
        org.jsoup.nodes.Document document17 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.select.Elements elements19 = document17.getElementsByTag("#root");
        java.lang.String str20 = elements19.text();
        org.jsoup.nodes.Document document22 = new org.jsoup.nodes.Document("#root");
        boolean boolean23 = document22.hasText();
        org.jsoup.select.Elements elements25 = document22.getElementsByIndexEquals(10);
        java.lang.Object[] objArray26 = elements25.toArray();
        boolean boolean27 = elements19.retainAll((java.util.Collection<org.jsoup.nodes.Element>) elements25);
        org.jsoup.nodes.Document document29 = new org.jsoup.nodes.Document("#root");
        boolean boolean30 = document29.hasText();
        org.jsoup.select.Elements elements32 = document29.getElementsByIndexEquals(10);
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor33 = elements32.listIterator();
        org.jsoup.select.Elements elements36 = elements32.attr("<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "hi!");
        boolean boolean37 = elements19.remove((java.lang.Object) elements36);
        org.jsoup.select.Elements elements39 = elements36.append("");
        org.jsoup.select.Elements elements41 = elements36.prepend("#comment");
        org.jsoup.select.Elements elements42 = org.jsoup.select.Selector.select("!", (java.lang.Iterable<org.jsoup.nodes.Element>) elements41);
        boolean boolean43 = elements10.containsAll((java.util.Collection<org.jsoup.nodes.Element>) elements42);
        boolean boolean45 = elements42.is("<html>\n<head>\n</head>\n<body>\n #root\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(elementSpliterator14);
        org.junit.Assert.assertNotNull(document17);
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(elements25);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(elements32);
        org.junit.Assert.assertNotNull(elementItor33);
        org.junit.Assert.assertNotNull(elements36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(elements39);
        org.junit.Assert.assertNotNull(elements41);
        org.junit.Assert.assertNotNull(elements42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test679");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str2 = document1.tagName();
        org.jsoup.select.Elements elements4 = document1.getElementsByIndexGreaterThan((-1));
        boolean boolean5 = elements4.isEmpty();
        org.jsoup.select.Elements elements7 = elements4.append("\n<!--#root=\"\"-->");
        org.jsoup.nodes.Document document9 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str10 = document9.tagName();
        org.jsoup.parser.Tag tag11 = document9.tag();
        boolean boolean12 = tag11.isEmpty();
        org.jsoup.nodes.Document document14 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str15 = document14.tagName();
        org.jsoup.parser.Tag tag16 = document14.tag();
        org.jsoup.nodes.Element element18 = new org.jsoup.nodes.Element(tag16, "#root=\"\"");
        org.jsoup.nodes.Document document20 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str21 = document20.tagName();
        org.jsoup.parser.Tag tag22 = document20.tag();
        boolean boolean23 = tag16.canContain(tag22);
        boolean boolean24 = tag11.isValidParent(tag16);
        org.jsoup.nodes.Document document26 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str27 = document26.tagName();
        org.jsoup.parser.Tag tag28 = document26.tag();
        boolean boolean29 = tag28.isEmpty();
        boolean boolean30 = tag16.canContain(tag28);
        org.jsoup.nodes.Document document32 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.select.Elements elements34 = document32.getElementsByTag("#root");
        java.lang.String str35 = elements34.text();
        org.jsoup.nodes.Document document37 = new org.jsoup.nodes.Document("#root");
        boolean boolean38 = document37.hasText();
        org.jsoup.select.Elements elements40 = document37.getElementsByIndexEquals(10);
        java.lang.Object[] objArray41 = elements40.toArray();
        boolean boolean42 = elements34.retainAll((java.util.Collection<org.jsoup.nodes.Element>) elements40);
        java.lang.String str43 = elements40.text();
        boolean boolean44 = tag16.equals((java.lang.Object) elements40);
        org.jsoup.select.Elements elements47 = elements40.attr("aorg", "<html>\n <head>\n </head>\n <body>\n </body>\n</html>hi!\n\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n\n <head>\n </head>\n\n <body>\n </body>");
        boolean boolean48 = elements4.removeAll((java.util.Collection<org.jsoup.nodes.Element>) elements40);
        org.jsoup.nodes.Document document50 = org.jsoup.nodes.Document.createShell("#comment");
        org.jsoup.nodes.Element element52 = document50.val("");
        boolean boolean53 = elements40.contains((java.lang.Object) element52);
        java.lang.String str54 = elements40.outerHtml();
        java.lang.String str56 = elements40.attr("org.jsoup.select.Selector$SelectorParseException: org.jsoup.select.Selector$SelectorParseException: <html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#root" + "'", str2, "#root");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(document9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#root" + "'", str10, "#root");
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(document14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "#root" + "'", str15, "#root");
        org.junit.Assert.assertNotNull(tag16);
        org.junit.Assert.assertNotNull(document20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "#root" + "'", str21, "#root");
        org.junit.Assert.assertNotNull(tag22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(document26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "#root" + "'", str27, "#root");
        org.junit.Assert.assertNotNull(tag28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(document32);
        org.junit.Assert.assertNotNull(elements34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(elements40);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray41), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray41), "[]");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(elements47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(document50);
        org.junit.Assert.assertNotNull(element52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
    }

    @Test
    public void test680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test680");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("#root", "#root");
        java.lang.String str3 = document2.nodeName();
        org.jsoup.nodes.Element element5 = document2.text("<html>\n <head>\n </head>\n <body>\n </body>\n</html>hi!\n<head>\n </head>\n <body>\n </body>\n\n");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration9 = new org.jsoup.nodes.XmlDeclaration("#root=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;\"", "#declaration", false);
        org.jsoup.nodes.Element element10 = element5.appendChild((org.jsoup.nodes.Node) xmlDeclaration9);
        java.lang.String str11 = element10.html();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<html>\n<head>\n</head>\n<body>\n &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;hi! &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; \n</body>\n</html><?#root=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;\">" + "'", str11, "<html>\n<head>\n</head>\n<body>\n &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;hi! &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; \n</body>\n</html><?#root=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;\">");
    }

    @Test
    public void test681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test681");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("#root", "#root");
        java.lang.String str4 = document2.absUrl("#root=\"\"");
        document2.title("#document");
        org.jsoup.select.Elements elements8 = document2.getElementsByClass("<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>");
        java.lang.String str9 = elements8.val();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test682");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("<html>\n<head>\n</head>\n<body>\n org.jsoup.select.Selector$SelectorParseException: hi!\n <html> \n  <head> \n  </head> \n  <body>  \n  </body>\n </html>\n</body>\n</html>", "#data");
        // The following exception was thrown during execution in test generation
        try {
            document2.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
    }

    @Test
    public void test683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test683");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str2 = document1.tagName();
        java.lang.String str3 = document1.html();
        org.jsoup.nodes.Element element5 = document1.append("hi!");
        boolean boolean7 = document1.hasAttr("#declaration");
        org.jsoup.nodes.Document document10 = org.jsoup.Jsoup.parseBodyFragment("#root=\"\"", "<#root>\n</#root>");
        java.lang.String str11 = document10.toString();
        java.lang.String str12 = document10.nodeName();
        java.lang.String str13 = document10.outerHtml();
        org.jsoup.nodes.Element element14 = document10.body();
        org.jsoup.nodes.Document document15 = document10.normalise();
        org.jsoup.nodes.Element element16 = document1.prependChild((org.jsoup.nodes.Node) document15);
        org.jsoup.nodes.Node node18 = document15.childNode(0);
        org.jsoup.nodes.Element element20 = document15.text("\n&lt;!--#root=&quot;&quot;--&gt;");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#root" + "'", str2, "#root");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>" + "'", str3, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>" + "'", str11, "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "#document" + "'", str12, "#document");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>" + "'", str13, "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>");
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(document15);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(element20);
    }

    @Test
    public void test684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test684");
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parseBodyFragment("#root=\"\"", "<#root>\n</#root>");
        org.jsoup.nodes.Element element4 = document2.prepend("");
        document2.title("&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;hi!");
        document2.title("org");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
    }

    @Test
    public void test685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test685");
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parse("<aorg>\n</aorg>", "<html>\n<head>\n</head>\n<body>\n <html> \n  <head> \n  </head> \n  <body>\n    #root=&quot;&quot;  \n  </body>\n </html>\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document2);
    }

    @Test
    public void test686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test686");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment(" text=\"hi!\"", "&lt;html&gt;\n &lt;head&gt;\n &lt;/head&gt;\n &lt;body&gt;\n &lt;/body&gt;\n&lt;/html&gt;hi!\n\n&lt;html&gt;\n &lt;head&gt;\n &lt;/head&gt;\n &lt;body&gt;\n &lt;/body&gt;\n&lt;/html&gt;\n\n &lt;head&gt;\n &lt;/head&gt;\n\n &lt;body&gt;\n &lt;/body&gt;");
        org.jsoup.nodes.Element element3 = document2.body();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element3);
    }

    @Test
    public void test687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test687");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("<hi! class=\" #root=&quot;hi!&quot;\">\n</hi!>", "&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;hi!=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;\"");
        org.junit.Assert.assertNotNull(document2);
    }

    @Test
    public void test688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test688");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("#root");
        boolean boolean2 = document1.hasText();
        org.jsoup.select.Elements elements4 = document1.getElementsByIndexEquals(10);
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor5 = elements4.listIterator();
        boolean boolean6 = elements4.hasText();
        org.jsoup.nodes.Document document9 = org.jsoup.Jsoup.parseBodyFragment("#root=\"\"", "<#root>\n</#root>");
        java.lang.String str10 = document9.toString();
        java.lang.String str11 = document9.nodeName();
        java.lang.String str12 = document9.outerHtml();
        org.jsoup.nodes.Element element13 = document9.body();
        org.jsoup.nodes.Document document14 = document9.normalise();
        document14.setBaseUri(" text=\"hi!\"");
        boolean boolean17 = elements4.add((org.jsoup.nodes.Element) document14);
        org.jsoup.nodes.Element element18 = document14.head();
        java.lang.String str19 = element18.text();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element21 = element18.child(2);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 2, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(elementItor5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(document9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>" + "'", str10, "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#document" + "'", str11, "#document");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>" + "'", str12, "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>");
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(document14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test689");
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parse("#document", "&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;hi!org.jsoup.select.Selector$SelectorParseException: hi!<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document2);
    }

    @Test
    public void test690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test690");
        org.jsoup.safety.Whitelist whitelist1 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.jsoup.Jsoup.isValid("<?#root=\"hi!\">", whitelist1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test691");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str2 = document1.tagName();
        org.jsoup.parser.Tag tag3 = document1.tag();
        org.jsoup.nodes.Element element5 = new org.jsoup.nodes.Element(tag3, "#root=\"\"");
        org.jsoup.nodes.Document document7 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str8 = document7.tagName();
        org.jsoup.parser.Tag tag9 = document7.tag();
        boolean boolean10 = tag3.canContain(tag9);
        org.jsoup.nodes.Document document12 = new org.jsoup.nodes.Document("#root");
        boolean boolean13 = document12.hasText();
        org.jsoup.select.Elements elements15 = document12.getElementsByIndexEquals(10);
        java.lang.Object[] objArray16 = elements15.toArray();
        org.jsoup.nodes.Document document19 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element21 = document19.prependElement("hi!");
        org.jsoup.nodes.Element element22 = element21.parent();
        org.jsoup.nodes.Element element23 = element21.empty();
        elements15.add(0, element23);
        org.jsoup.nodes.Document document26 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str27 = document26.tagName();
        org.jsoup.parser.Tag tag28 = document26.tag();
        org.jsoup.nodes.TextNode textNode31 = new org.jsoup.nodes.TextNode("hi!", "");
        org.jsoup.nodes.Node node32 = textNode31.parent();
        org.jsoup.nodes.Element element33 = document26.appendChild((org.jsoup.nodes.Node) textNode31);
        org.jsoup.select.Elements elements35 = element33.getElementsByClass("#root");
        org.jsoup.nodes.Element element36 = element23.prependChild((org.jsoup.nodes.Node) element33);
        org.jsoup.select.Elements elements38 = element33.getElementsByAttribute("#root=\"hi!\"");
        org.jsoup.nodes.Document document40 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str41 = document40.tagName();
        org.jsoup.nodes.Element element43 = document40.append("hi!");
        java.lang.String str44 = element43.outerHtml();
        boolean boolean46 = element43.equals((java.lang.Object) 1.0f);
        java.lang.String str47 = element43.nodeName();
        org.jsoup.nodes.Element element49 = element43.wrap("#comment");
        org.jsoup.nodes.Element element50 = element33.appendChild((org.jsoup.nodes.Node) element43);
        java.util.List<org.jsoup.nodes.Node> nodeList51 = element33.siblingNodes();
        boolean boolean52 = tag3.equals((java.lang.Object) nodeList51);
        java.lang.String str53 = tag3.toString();
        boolean boolean54 = tag3.isEmpty();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#root" + "'", str2, "#root");
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#root" + "'", str8, "#root");
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[]");
        org.junit.Assert.assertNotNull(document19);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(document26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "#root" + "'", str27, "#root");
        org.junit.Assert.assertNotNull(tag28);
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertNotNull(elements35);
        org.junit.Assert.assertNotNull(element36);
        org.junit.Assert.assertNotNull(elements38);
        org.junit.Assert.assertNotNull(document40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "#root" + "'", str41, "#root");
        org.junit.Assert.assertNotNull(element43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!" + "'", str44, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "#document" + "'", str47, "#document");
        org.junit.Assert.assertNull(element49);
        org.junit.Assert.assertNotNull(element50);
        org.junit.Assert.assertNotNull(nodeList51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "#root" + "'", str53, "#root");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    }

    @Test
    public void test692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test692");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("#root");
        boolean boolean2 = document1.hasText();
        org.jsoup.select.Elements elements4 = document1.getElementsByIndexEquals(10);
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor5 = elements4.listIterator();
        boolean boolean6 = elements4.hasText();
        org.jsoup.nodes.Document document9 = org.jsoup.Jsoup.parseBodyFragment("#root=\"\"", "<#root>\n</#root>");
        java.lang.String str10 = document9.toString();
        java.lang.String str11 = document9.nodeName();
        java.lang.String str12 = document9.outerHtml();
        org.jsoup.nodes.Element element13 = document9.body();
        org.jsoup.nodes.Document document14 = document9.normalise();
        document14.setBaseUri(" text=\"hi!\"");
        boolean boolean17 = elements4.add((org.jsoup.nodes.Element) document14);
        java.lang.String str18 = document14.nodeName();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(elementItor5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(document9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>" + "'", str10, "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#document" + "'", str11, "#document");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>" + "'", str12, "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>");
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(document14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "#document" + "'", str18, "#document");
    }

    @Test
    public void test693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test693");
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parseBodyFragment("#root=\"\"", "<#root>\n</#root>");
        org.jsoup.nodes.Element element4 = document2.prepend("");
        org.jsoup.nodes.Attributes attributes5 = element4.attributes();
        org.jsoup.nodes.Attribute attribute8 = new org.jsoup.nodes.Attribute("<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!", "org.jsoup.select.Selector$SelectorParseException: <#root>\n</#root>");
        java.lang.String str9 = attribute8.toString();
        java.lang.String str10 = attribute8.toString();
        java.lang.String str11 = attribute8.getKey();
        attributes5.put(attribute8);
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!=\"org.jsoup.select.Selector$SelectorParseException: &lt;#root&gt;\n&lt;/#root&gt;\"" + "'", str9, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!=\"org.jsoup.select.Selector$SelectorParseException: &lt;#root&gt;\n&lt;/#root&gt;\"");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!=\"org.jsoup.select.Selector$SelectorParseException: &lt;#root&gt;\n&lt;/#root&gt;\"" + "'", str10, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!=\"org.jsoup.select.Selector$SelectorParseException: &lt;#root&gt;\n&lt;/#root&gt;\"");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!" + "'", str11, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!");
    }

    @Test
    public void test694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test694");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("", " #root=\"\"=\"\"");
        org.jsoup.nodes.Element element3 = document2.head();
        org.jsoup.nodes.Document document5 = org.jsoup.nodes.Document.createShell("&lt;?#root=&quot;&amp;lt;html&amp;gt; &amp;lt;head&amp;gt; &amp;lt;/head&amp;gt; &amp;lt;body&amp;gt; &amp;lt;/body&amp;gt; &amp;lt;/html&amp;gt;&quot;&gt;");
        java.util.Set<java.lang.String> strSet6 = document5.classNames();
        org.jsoup.nodes.Element element7 = element3.classNames(strSet6);
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(document5);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNotNull(element7);
    }

    @Test
    public void test695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test695");
        org.jsoup.nodes.Document document2 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str3 = document2.tagName();
        org.jsoup.nodes.Element element5 = document2.append("hi!");
        java.lang.String str6 = document2.outerHtml();
        org.jsoup.select.Elements elements7 = document2.children();
        org.jsoup.nodes.Document document10 = new org.jsoup.nodes.Document("#root");
        boolean boolean11 = document10.hasText();
        org.jsoup.select.Elements elements13 = document10.getElementsByIndexEquals(10);
        org.jsoup.nodes.Document document15 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str16 = document15.tagName();
        org.jsoup.parser.Tag tag17 = document15.tag();
        org.jsoup.nodes.TextNode textNode20 = new org.jsoup.nodes.TextNode("hi!", "");
        org.jsoup.nodes.Node node21 = textNode20.parent();
        org.jsoup.nodes.Element element22 = document15.appendChild((org.jsoup.nodes.Node) textNode20);
        org.jsoup.select.Elements elements24 = element22.getElementsByClass("#root");
        org.jsoup.nodes.Element element25 = document10.prependChild((org.jsoup.nodes.Node) element22);
        org.jsoup.select.Elements elements28 = element22.getElementsByAttributeValueNot("#text", "#document");
        org.jsoup.nodes.Element element30 = element22.appendElement("<?<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!>");
        elements7.add((int) (byte) 1, element22);
        org.jsoup.nodes.Document document34 = org.jsoup.Jsoup.parseBodyFragment("org.jsoup.select.Selector$SelectorParseException: hi!<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element35 = elements7.set((int) (byte) 1, (org.jsoup.nodes.Element) document34);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements36 = org.jsoup.select.Selector.select("", element35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#root" + "'", str3, "#root");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!" + "'", str6, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!");
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(document15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "#root" + "'", str16, "#root");
        org.junit.Assert.assertNotNull(tag17);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(elements24);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(elements28);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertNotNull(document34);
        org.junit.Assert.assertNotNull(element35);
    }

    @Test
    public void test696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test696");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str2 = document1.tagName();
        java.lang.String str3 = document1.html();
        org.jsoup.nodes.Element element5 = document1.append("hi!");
        boolean boolean7 = document1.hasAttr("#declaration");
        org.jsoup.nodes.Document document10 = org.jsoup.Jsoup.parseBodyFragment("#root=\"\"", "<#root>\n</#root>");
        java.lang.String str11 = document10.toString();
        java.lang.String str12 = document10.nodeName();
        java.lang.String str13 = document10.outerHtml();
        org.jsoup.nodes.Element element14 = document10.body();
        org.jsoup.nodes.Document document15 = document10.normalise();
        org.jsoup.nodes.Element element16 = document1.prependChild((org.jsoup.nodes.Node) document15);
        java.util.List<org.jsoup.nodes.Node> nodeList17 = document1.childNodes();
        org.jsoup.nodes.Element element19 = document1.appendText(" #root=\"\"=\"\"");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#root" + "'", str2, "#root");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>" + "'", str3, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>" + "'", str11, "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "#document" + "'", str12, "#document");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>" + "'", str13, "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>");
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(document15);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(nodeList17);
        org.junit.Assert.assertNotNull(element19);
    }

    @Test
    public void test697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test697");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element3 = document1.prependElement("hi!");
        org.jsoup.nodes.Element element5 = element3.append("");
        org.jsoup.nodes.Element element6 = element5.previousElementSibling();
        java.lang.String str7 = element5.nodeName();
        org.jsoup.select.Elements elements10 = element5.getElementsByAttributeValueStarting("<!<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!>", "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>");
        org.jsoup.nodes.Document document12 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str13 = document12.tagName();
        org.jsoup.parser.Tag tag14 = document12.tag();
        org.jsoup.nodes.Element element16 = new org.jsoup.nodes.Element(tag14, "#root=\"\"");
        java.lang.String str17 = element16.toString();
        org.jsoup.nodes.Element element19 = element16.text("");
        org.jsoup.nodes.Element element21 = element16.removeClass("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.select.Elements elements23 = element16.getElementsByIndexGreaterThan(0);
        boolean boolean24 = elements10.addAll((java.util.Collection<org.jsoup.nodes.Element>) elements23);
        org.jsoup.nodes.Document document26 = org.jsoup.Jsoup.parseBodyFragment("org.jsoup.select.Selector$SelectorParseException: hi!<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Document document28 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str29 = document28.tagName();
        org.jsoup.nodes.Element element31 = document28.append("hi!");
        org.jsoup.nodes.Document document33 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str34 = document33.tagName();
        org.jsoup.nodes.Element element36 = document33.append("hi!");
        java.lang.String str37 = document33.outerHtml();
        org.jsoup.select.Elements elements38 = document33.children();
        java.lang.String str40 = document33.absUrl("<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>");
        org.jsoup.select.Elements elements43 = document33.getElementsByAttributeValueContaining("<#root>\n</#root>", "#document");
        org.jsoup.nodes.Document document46 = org.jsoup.Jsoup.parseBodyFragment("#root=\"\"", "<#root>\n</#root>");
        java.lang.String str47 = document46.toString();
        org.jsoup.nodes.Document[] documentArray48 = new org.jsoup.nodes.Document[] { document26, document28, document33, document46 };
        org.jsoup.nodes.Document[] documentArray49 = elements23.toArray(documentArray48);
        org.jsoup.select.Elements elements50 = new org.jsoup.select.Elements((org.jsoup.nodes.Element[]) documentArray48);
        int int51 = elements50.size();
        org.jsoup.nodes.Element element53 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element54 = elements50.set(100, element53);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNull(element6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "#root" + "'", str13, "#root");
        org.junit.Assert.assertNotNull(tag14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "<#root>\n</#root>" + "'", str17, "<#root>\n</#root>");
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(elements23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(document26);
        org.junit.Assert.assertNotNull(document28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "#root" + "'", str29, "#root");
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertNotNull(document33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "#root" + "'", str34, "#root");
        org.junit.Assert.assertNotNull(element36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!" + "'", str37, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!");
        org.junit.Assert.assertNotNull(elements38);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNotNull(elements43);
        org.junit.Assert.assertNotNull(document46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>" + "'", str47, "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>");
        org.junit.Assert.assertNotNull(documentArray48);
        org.junit.Assert.assertNotNull(documentArray49);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 4 + "'", int51 == 4);
    }

    @Test
    public void test698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test698");
        org.jsoup.safety.Whitelist whitelist2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.jsoup.Jsoup.clean("", "<hi! class=\" #root=&quot;hi!&quot;\">\n</hi!>", whitelist2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test699");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("org.jsoup.select.Selector$SelectorParseException: hi!<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element3 = document1.text("<?#root=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;\">");
        org.jsoup.select.Elements elements6 = element3.getElementsByAttributeValueContaining("[., j, s, o, u, p, ., s, e, l, e, c, t, ., S, e, l, e, c, t, o, r, $, S, e, l, e, c, t, o, r, P, a, r, s, e, E, x, c, e, p, t, i, o, n, :,  , h, i, !, <, h, t, m, l, >, \n, <, h, e, a, d, >, \n, <, /, h, e, a, d, >, \n, <, b, o, d, y, >, \n, <, /, b, o, d, y, >, \n, <, /, h, t, m, l, >]", "!");
        org.jsoup.nodes.Element element8 = element3.prependText(".jsoup.select.Selector$SelectorParseException: hi!<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
    }

    @Test
    public void test700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test700");
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parse("&lt;?#root=&quot;&amp;lt;html&amp;gt; &amp;lt;head&amp;gt; &amp;lt;/head&amp;gt; &amp;lt;body&amp;gt; &amp;lt;/body&amp;gt; &amp;lt;/html&amp;gt;&quot;&gt;", "<html>\n<head>\n</head>\n<body> #root\n</body>\n</html>");
        org.jsoup.select.Elements elements5 = document2.getElementsByAttributeValueNot("<html>\n <head>\n </head>\n <body>\n </body>\n</html>hi!\n<head>\n </head>\n <body>\n </body>\n\n", "org.jsoup.select.Selector$SelectorParseException: hi!");
        boolean boolean6 = elements5.hasText();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test701");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("#root", "#root");
        org.jsoup.nodes.Element element4 = document2.addClass("<#root>\n</#root>");
        java.lang.String str5 = element4.baseUri();
        org.jsoup.select.Elements elements7 = element4.getElementsByTag("org.jsoup.select.Selector$SelectorParseException: org.jsoup.select.Selector$SelectorParseException: <html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.util.Iterator<org.jsoup.nodes.Element> elementItor8 = elements7.iterator();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#root" + "'", str5, "#root");
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(elementItor8);
    }

    @Test
    public void test702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test702");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("#root");
        boolean boolean2 = document1.hasText();
        org.jsoup.select.Elements elements4 = document1.getElementsByIndexEquals(10);
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor5 = elements4.listIterator();
        org.jsoup.select.Elements elements6 = new org.jsoup.select.Elements((java.util.List<org.jsoup.nodes.Element>) elements4);
        java.lang.Object obj7 = null;
        boolean boolean8 = elements4.remove(obj7);
        org.jsoup.nodes.Document document11 = org.jsoup.Jsoup.parseBodyFragment("#root=\"\"", "<#root>\n</#root>");
        java.lang.String str12 = document11.nodeName();
        org.jsoup.select.Elements elements14 = document11.getElementsByIndexEquals(10);
        boolean boolean15 = elements4.retainAll((java.util.Collection<org.jsoup.nodes.Element>) elements14);
        java.util.Spliterator<org.jsoup.nodes.Element> elementSpliterator16 = elements14.spliterator();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(elementItor5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "#document" + "'", str12, "#document");
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(elementSpliterator16);
    }

    @Test
    public void test703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test703");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str2 = document1.tagName();
        org.jsoup.nodes.Element element4 = document1.append("hi!");
        java.lang.String str5 = document1.outerHtml();
        org.jsoup.select.Elements elements6 = document1.children();
        org.jsoup.nodes.Document document8 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.select.Elements elements10 = document8.getElementsByTag("#root");
        boolean boolean11 = document1.equals((java.lang.Object) document8);
        org.jsoup.nodes.Element element13 = document8.append("#text");
        org.jsoup.select.Elements elements14 = document8.getAllElements();
        org.jsoup.select.Elements elements16 = elements14.wrap("#root=\"\"");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#root" + "'", str2, "#root");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!" + "'", str5, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(elements16);
    }

    @Test
    public void test704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test704");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str2 = document1.tagName();
        org.jsoup.nodes.Element element4 = document1.append("hi!");
        org.jsoup.nodes.Element element6 = document1.html("org.jsoup.select.Selector$SelectorParseException: hi!");
        org.jsoup.nodes.Element element8 = document1.prependText("<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>");
        org.jsoup.nodes.Element element10 = document1.createElement("aorg");
        org.jsoup.nodes.Document document11 = document1.normalise();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#root" + "'", str2, "#root");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(document11);
    }

    @Test
    public void test705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test705");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str2 = document1.tagName();
        org.jsoup.nodes.Element element4 = document1.append("hi!");
        java.lang.String str5 = document1.outerHtml();
        org.jsoup.select.Elements elements6 = document1.children();
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("#root");
        boolean boolean10 = document9.hasText();
        org.jsoup.select.Elements elements12 = document9.getElementsByIndexEquals(10);
        org.jsoup.nodes.Document document14 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str15 = document14.tagName();
        org.jsoup.parser.Tag tag16 = document14.tag();
        org.jsoup.nodes.TextNode textNode19 = new org.jsoup.nodes.TextNode("hi!", "");
        org.jsoup.nodes.Node node20 = textNode19.parent();
        org.jsoup.nodes.Element element21 = document14.appendChild((org.jsoup.nodes.Node) textNode19);
        org.jsoup.select.Elements elements23 = element21.getElementsByClass("#root");
        org.jsoup.nodes.Element element24 = document9.prependChild((org.jsoup.nodes.Node) element21);
        org.jsoup.select.Elements elements27 = element21.getElementsByAttributeValueNot("#text", "#document");
        org.jsoup.nodes.Element element29 = element21.appendElement("<?<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!>");
        elements6.add((int) (byte) 1, element21);
        org.jsoup.select.Elements elements31 = new org.jsoup.select.Elements((java.util.Collection<org.jsoup.nodes.Element>) elements6);
        org.jsoup.nodes.Document document33 = new org.jsoup.nodes.Document("#root");
        boolean boolean34 = document33.hasText();
        org.jsoup.select.Elements elements36 = document33.getElementsByIndexEquals(10);
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor37 = elements36.listIterator();
        org.jsoup.select.Elements elements40 = elements36.attr("<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "hi!");
        org.jsoup.nodes.Document document42 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element44 = document42.prependElement("hi!");
        org.jsoup.nodes.Element element45 = element44.parent();
        int int46 = elements36.indexOf((java.lang.Object) element45);
        org.jsoup.select.Elements elements48 = elements36.toggleClass("#document");
        java.lang.String str49 = elements36.text();
        org.jsoup.nodes.Attributes attributes50 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor51 = attributes50.iterator();
        org.jsoup.nodes.Attributes attributes52 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor53 = attributes52.iterator();
        boolean boolean55 = attributes52.hasKey("");
        attributes52.remove("#root=\"\"");
        attributes50.addAll(attributes52);
        attributes52.put("#root=\"hi!\"", "#root");
        org.jsoup.nodes.Attribute attribute64 = new org.jsoup.nodes.Attribute("#comment", "#root=\"\"=\"\"");
        attributes52.put(attribute64);
        org.jsoup.nodes.Attribute attribute68 = new org.jsoup.nodes.Attribute("#root", "");
        java.lang.String str69 = attribute68.getKey();
        attribute68.setKey("#root=\"\"");
        java.lang.String str72 = attribute68.toString();
        java.lang.String str73 = attribute68.html();
        attributes52.put(attribute68);
        boolean boolean75 = elements36.equals((java.lang.Object) attributes52);
        boolean boolean76 = elements6.removeAll((java.util.Collection<org.jsoup.nodes.Element>) elements36);
        org.jsoup.select.Elements elements78 = elements6.prepend("#data");
        org.jsoup.select.Elements elements80 = elements6.toggleClass(" #root=\"hi!\" <html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.select.Elements elements82 = elements6.addClass("");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#root" + "'", str2, "#root");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!" + "'", str5, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(document14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "#root" + "'", str15, "#root");
        org.junit.Assert.assertNotNull(tag16);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(elements23);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(elements27);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(elements36);
        org.junit.Assert.assertNotNull(elementItor37);
        org.junit.Assert.assertNotNull(elements40);
        org.junit.Assert.assertNotNull(document42);
        org.junit.Assert.assertNotNull(element44);
        org.junit.Assert.assertNotNull(element45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertNotNull(elements48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertNotNull(attributeItor51);
        org.junit.Assert.assertNotNull(attributeItor53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "#root" + "'", str69, "#root");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "#root=\"\"=\"\"" + "'", str72, "#root=\"\"=\"\"");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "#root=\"\"=\"\"" + "'", str73, "#root=\"\"=\"\"");
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(elements78);
        org.junit.Assert.assertNotNull(elements80);
        org.junit.Assert.assertNotNull(elements82);
    }

    @Test
    public void test706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test706");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("#root");
        boolean boolean2 = document1.hasText();
        org.jsoup.select.Elements elements4 = document1.getElementsByIndexEquals(10);
        java.lang.Object[] objArray5 = elements4.toArray();
        org.jsoup.nodes.Document document8 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element10 = document8.prependElement("hi!");
        org.jsoup.nodes.Element element11 = element10.parent();
        org.jsoup.nodes.Element element12 = element10.empty();
        elements4.add(0, element12);
        org.jsoup.nodes.Document document15 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str16 = document15.tagName();
        org.jsoup.parser.Tag tag17 = document15.tag();
        org.jsoup.nodes.TextNode textNode20 = new org.jsoup.nodes.TextNode("hi!", "");
        org.jsoup.nodes.Node node21 = textNode20.parent();
        org.jsoup.nodes.Element element22 = document15.appendChild((org.jsoup.nodes.Node) textNode20);
        org.jsoup.select.Elements elements24 = element22.getElementsByClass("#root");
        org.jsoup.nodes.Element element25 = element12.prependChild((org.jsoup.nodes.Node) element22);
        org.jsoup.select.Elements elements27 = element22.getElementsByAttribute("#root=\"hi!\"");
        org.jsoup.nodes.Document document29 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str30 = document29.tagName();
        org.jsoup.nodes.Element element32 = document29.append("hi!");
        java.lang.String str33 = element32.outerHtml();
        boolean boolean35 = element32.equals((java.lang.Object) 1.0f);
        java.lang.String str36 = element32.nodeName();
        org.jsoup.nodes.Element element38 = element32.wrap("#comment");
        org.jsoup.nodes.Element element39 = element22.appendChild((org.jsoup.nodes.Node) element32);
        org.jsoup.select.Elements elements41 = element39.getElementsByClass("<?<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!>");
        org.jsoup.select.Elements elements43 = elements41.eq((int) 'a');
        java.lang.String str44 = elements43.val();
        java.lang.String str45 = elements43.outerHtml();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(document15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "#root" + "'", str16, "#root");
        org.junit.Assert.assertNotNull(tag17);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(elements24);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(elements27);
        org.junit.Assert.assertNotNull(document29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "#root" + "'", str30, "#root");
        org.junit.Assert.assertNotNull(element32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!" + "'", str33, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "#document" + "'", str36, "#document");
        org.junit.Assert.assertNull(element38);
        org.junit.Assert.assertNotNull(element39);
        org.junit.Assert.assertNotNull(elements41);
        org.junit.Assert.assertNotNull(elements43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
    }

    @Test
    public void test707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test707");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("#root");
        boolean boolean2 = document1.hasText();
        org.jsoup.select.Elements elements4 = document1.getElementsByIndexEquals(10);
        java.util.Spliterator<org.jsoup.nodes.Element> elementSpliterator5 = elements4.spliterator();
        org.jsoup.select.Elements elements7 = elements4.prepend("<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!");
        org.jsoup.nodes.Document document10 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.select.Elements elements12 = document10.getElementsByTag("#root");
        java.lang.String str13 = elements12.text();
        org.jsoup.select.Elements elements15 = elements12.toggleClass("");
        boolean boolean16 = elements7.addAll(0, (java.util.Collection<org.jsoup.nodes.Element>) elements15);
        org.jsoup.nodes.Document document18 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str19 = document18.tagName();
        org.jsoup.nodes.Element element21 = document18.append("hi!");
        org.jsoup.nodes.Element element23 = document18.html("org.jsoup.select.Selector$SelectorParseException: hi!");
        org.jsoup.nodes.Element element25 = document18.prependText("<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>");
        org.jsoup.nodes.Element element27 = document18.createElement("aorg");
        org.jsoup.select.Elements elements29 = document18.getElementsByAttribute("#root");
        boolean boolean30 = elements15.retainAll((java.util.Collection<org.jsoup.nodes.Element>) elements29);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element32 = elements29.remove((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(elementSpliterator5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(document18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "#root" + "'", str19, "#root");
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertNotNull(elements29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test708");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("#root");
        boolean boolean2 = document1.hasText();
        org.jsoup.select.Elements elements4 = document1.getElementsByIndexEquals(10);
        java.lang.Object[] objArray5 = elements4.toArray();
        org.jsoup.select.Elements elements7 = elements4.select("#root");
        org.jsoup.nodes.Document document9 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.select.Elements elements11 = document9.getElementsByTag("#root");
        boolean boolean12 = elements7.remove((java.lang.Object) document9);
        org.jsoup.nodes.Document document15 = org.jsoup.Jsoup.parseBodyFragment("#root=\"\"", "<#root>\n</#root>");
        java.lang.String str16 = document15.toString();
        java.lang.String str17 = document15.nodeName();
        java.lang.String str18 = document15.outerHtml();
        org.jsoup.nodes.Element element19 = document15.body();
        org.jsoup.nodes.Document document20 = document15.normalise();
        org.jsoup.nodes.Node node21 = document15.parent();
        boolean boolean22 = elements7.equals((java.lang.Object) document15);
        java.lang.String str23 = document15.val();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(document9);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(document15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>" + "'", str16, "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "#document" + "'", str17, "#document");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>" + "'", str18, "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>");
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(document20);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test709");
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parseBodyFragment("#root=\"\"", "<#root>\n</#root>");
        java.lang.String str3 = document2.nodeName();
        org.jsoup.select.Elements elements5 = document2.getElementsByIndexEquals(10);
        org.jsoup.nodes.Document document8 = org.jsoup.parser.Parser.parse("", "\n<!--#root=\"\"-->");
        boolean boolean9 = document2.equals((java.lang.Object) "\n<!--#root=\"\"-->");
        java.lang.String str10 = document2.toString();
        java.lang.String str11 = document2.nodeName();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>" + "'", str10, "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#document" + "'", str11, "#document");
    }

    @Test
    public void test710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test710");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element3 = document1.prependElement("hi!");
        org.jsoup.nodes.Document document6 = org.jsoup.parser.Parser.parseBodyFragment("#root", "#root");
        org.jsoup.nodes.Element element8 = document6.addClass("<#root>\n</#root>");
        element3.replaceWith((org.jsoup.nodes.Node) document6);
        org.jsoup.nodes.Element element10 = document6.parent();
        org.jsoup.nodes.Document document12 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str13 = document12.tagName();
        org.jsoup.parser.Tag tag14 = document12.tag();
        org.jsoup.nodes.Element element16 = new org.jsoup.nodes.Element(tag14, "#root=\"\"");
        org.jsoup.select.Elements elements18 = element16.getElementsByClass("<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>");
        org.jsoup.select.Elements elements21 = element16.getElementsByAttributeValueStarting("#root", "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!");
        org.jsoup.nodes.Element element22 = elements21.last();
        org.jsoup.nodes.Document document24 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.select.Elements elements26 = document24.getElementsByTag("#root");
        java.lang.String str27 = elements26.text();
        org.jsoup.nodes.Document document29 = new org.jsoup.nodes.Document("#root");
        boolean boolean30 = document29.hasText();
        org.jsoup.select.Elements elements32 = document29.getElementsByIndexEquals(10);
        java.lang.Object[] objArray33 = elements32.toArray();
        boolean boolean34 = elements26.retainAll((java.util.Collection<org.jsoup.nodes.Element>) elements32);
        org.jsoup.nodes.Document document36 = new org.jsoup.nodes.Document("#root");
        boolean boolean37 = document36.hasText();
        org.jsoup.select.Elements elements39 = document36.getElementsByIndexEquals(10);
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor40 = elements39.listIterator();
        org.jsoup.select.Elements elements43 = elements39.attr("<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "hi!");
        boolean boolean44 = elements26.remove((java.lang.Object) elements43);
        org.jsoup.select.Elements elements46 = elements43.append("");
        org.jsoup.nodes.Element element47 = elements43.last();
        boolean boolean48 = elements21.removeAll((java.util.Collection<org.jsoup.nodes.Element>) elements43);
        boolean boolean49 = document6.equals((java.lang.Object) elements43);
        document6.title("#text");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "#root" + "'", str13, "#root");
        org.junit.Assert.assertNotNull(tag14);
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertNotNull(elements21);
        org.junit.Assert.assertNull(element22);
        org.junit.Assert.assertNotNull(document24);
        org.junit.Assert.assertNotNull(elements26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(elements32);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray33), "[]");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(elements39);
        org.junit.Assert.assertNotNull(elementItor40);
        org.junit.Assert.assertNotNull(elements43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(elements46);
        org.junit.Assert.assertNull(element47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test711");
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parse("h", "org.jsoup.select.selector$selectorparseexception: <html>\n<head>\n</head>\n<body>\n org.jsoup.select.selector$selectorparseexception: hi!\n <html> \n  <head> \n  </head> \n  <body>  \n  </body>\n </html>\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document2);
    }

    @Test
    public void test712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test712");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!");
        org.jsoup.nodes.Element element3 = document1.text("org.jsoup.select.Selector$SelectorParseException: hi!<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element5 = element3.html("#root=&quot;&quot;");
        org.jsoup.select.Elements elements7 = element5.getElementsByClass("org.jsoup.select.Selector$SelectorParseException: org.jsoup.select.Selector$SelectorParseException: <html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.util.Iterator<org.jsoup.nodes.Element> elementItor8 = elements7.iterator();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(elementItor8);
    }

    @Test
    public void test713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test713");
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parseBodyFragment("#root", "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>");
        java.lang.String str3 = document2.data();
        java.lang.Object obj4 = null;
        boolean boolean5 = document2.equals(obj4);
        document2.title("org.jsoup.select.Selector$SelectorParseException: hi!<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element9 = document2.wrap("<html>\n <head>\n </head>\n <body>\n </body>\n</html>hi!\n\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n\n <head>\n </head>\n\n <body>\n </body>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test714");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str2 = document1.tagName();
        java.lang.String str3 = document1.html();
        org.jsoup.nodes.Element element5 = document1.append("hi!");
        java.lang.String str6 = document1.nodeName();
        org.jsoup.select.Elements elements9 = document1.getElementsByAttributeValueContaining("&lt;html&gt;\n &lt;head&gt;\n &lt;/head&gt;\n &lt;body&gt;\n &lt;/body&gt;\n&lt;/html&gt;hi!\n&lt;head&gt;\n &lt;/head&gt;\n &lt;body&gt;\n &lt;/body&gt;\n\n", "<html>\n<head>\n</head>\n<body>\n #root=\"\"\n</body>\n</html>");
        org.jsoup.select.Elements elements12 = document1.getElementsByAttributeValue("<#root class=\"\">\n</#root>", "ohi!");
        boolean boolean13 = elements12.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element15 = elements12.remove(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#root" + "'", str2, "#root");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>" + "'", str3, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#document" + "'", str6, "#document");
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test715");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("#root", "#root");
        java.lang.String str4 = document2.absUrl("#root=\"\"");
        document2.title("#document");
        org.jsoup.select.Elements elements8 = document2.getElementsByClass("<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>");
        org.jsoup.nodes.Element element10 = document2.addClass("<html>\n<head>\n</head>\n<body>\n org.jsoup.select.Selector$SelectorParseException: hi!\n <html> \n  <head> \n  </head> \n  <body>  \n  </body>\n </html>\n</body>\n</html>");
        org.jsoup.select.Elements elements12 = document2.getElementsByTag("org.jsoup.select.Selector$SelectorParseException: hi!<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Document document14 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str15 = document14.tagName();
        org.jsoup.parser.Tag tag16 = document14.tag();
        java.lang.String str17 = document14.outerHtml();
        java.lang.String str18 = document14.outerHtml();
        java.lang.String str19 = document14.title();
        document14.title("!");
        boolean boolean22 = document14.isBlock();
        org.jsoup.nodes.Element element24 = document14.html("<#root class=\"\">\n</#root>");
        boolean boolean25 = document2.equals((java.lang.Object) document14);
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(document14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "#root" + "'", str15, "#root");
        org.junit.Assert.assertNotNull(tag16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>" + "'", str17, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>" + "'", str18, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test716");
        org.jsoup.safety.Whitelist whitelist1 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.jsoup.Jsoup.isValid("aorg.jsoup.select.Selector$SelectorParseException: hi!<html>\n<head>\n</head>\n<body>\n</body>\n</html>", whitelist1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test717");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str2 = document1.id();
        org.jsoup.select.Elements elements3 = document1.children();
        org.jsoup.select.Elements elements5 = elements3.html("#root=\"\"");
        org.jsoup.select.Elements elements7 = elements3.removeClass("<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!");
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("#root");
        boolean boolean10 = document9.hasText();
        org.jsoup.select.Elements elements12 = document9.getElementsByIndexEquals(10);
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor13 = elements12.listIterator();
        boolean boolean14 = elements12.hasText();
        java.lang.String str15 = elements12.text();
        int int16 = elements12.size();
        org.jsoup.select.Elements elements18 = elements12.select("<#root>\n<html>\n <head>\n </head>\n <body>\n  #root=&quot;&quot;\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!");
        boolean boolean19 = elements7.remove((java.lang.Object) elements12);
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(elementItor13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test718");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("#root");
        boolean boolean2 = document1.hasText();
        org.jsoup.select.Elements elements4 = document1.getElementsByIndexEquals(10);
        java.lang.Object[] objArray5 = elements4.toArray();
        org.jsoup.nodes.Document document8 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element10 = document8.prependElement("hi!");
        org.jsoup.nodes.Element element11 = element10.parent();
        org.jsoup.nodes.Element element12 = element10.empty();
        elements4.add(0, element12);
        org.jsoup.nodes.Document document15 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str16 = document15.tagName();
        org.jsoup.parser.Tag tag17 = document15.tag();
        org.jsoup.nodes.TextNode textNode20 = new org.jsoup.nodes.TextNode("hi!", "");
        org.jsoup.nodes.Node node21 = textNode20.parent();
        org.jsoup.nodes.Element element22 = document15.appendChild((org.jsoup.nodes.Node) textNode20);
        org.jsoup.select.Elements elements24 = element22.getElementsByClass("#root");
        org.jsoup.nodes.Element element25 = element12.prependChild((org.jsoup.nodes.Node) element22);
        org.jsoup.select.Elements elements27 = element22.getElementsByAttribute("#root=\"hi!\"");
        org.jsoup.nodes.Document document29 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str30 = document29.tagName();
        org.jsoup.nodes.Element element32 = document29.append("hi!");
        java.lang.String str33 = element32.outerHtml();
        boolean boolean35 = element32.equals((java.lang.Object) 1.0f);
        java.lang.String str36 = element32.nodeName();
        org.jsoup.nodes.Element element38 = element32.wrap("#comment");
        org.jsoup.nodes.Element element39 = element22.appendChild((org.jsoup.nodes.Node) element32);
        org.jsoup.select.Elements elements41 = element39.getElementsByClass("<?<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!>");
        org.jsoup.nodes.Element element43 = element39.toggleClass("#comment");
        org.jsoup.select.Elements elements44 = element39.getAllElements();
        org.jsoup.nodes.Element element46 = element39.prepend("org.jsoup.select.Selector$SelectorParseException: <#root>\n</#root>");
        org.jsoup.nodes.Attributes attributes47 = element46.attributes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements50 = element46.getElementsByAttributeValue("", "<html>\n<head>\n</head>\n<body> ohi!\n</body>\n</html>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(document15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "#root" + "'", str16, "#root");
        org.junit.Assert.assertNotNull(tag17);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(elements24);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(elements27);
        org.junit.Assert.assertNotNull(document29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "#root" + "'", str30, "#root");
        org.junit.Assert.assertNotNull(element32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!" + "'", str33, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "#document" + "'", str36, "#document");
        org.junit.Assert.assertNull(element38);
        org.junit.Assert.assertNotNull(element39);
        org.junit.Assert.assertNotNull(elements41);
        org.junit.Assert.assertNotNull(element43);
        org.junit.Assert.assertNotNull(elements44);
        org.junit.Assert.assertNotNull(element46);
        org.junit.Assert.assertNotNull(attributes47);
    }

    @Test
    public void test719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test719");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("#root");
        boolean boolean2 = document1.hasText();
        org.jsoup.select.Elements elements4 = document1.getElementsByIndexEquals(10);
        java.util.Spliterator<org.jsoup.nodes.Element> elementSpliterator5 = elements4.spliterator();
        org.jsoup.nodes.Document document7 = new org.jsoup.nodes.Document("#root");
        boolean boolean8 = elements4.add((org.jsoup.nodes.Element) document7);
        boolean boolean9 = elements4.isEmpty();
        org.jsoup.nodes.Document document11 = new org.jsoup.nodes.Document("#root");
        boolean boolean12 = document11.hasText();
        org.jsoup.select.Elements elements14 = document11.getElementsByIndexEquals(10);
        java.lang.Object[] objArray15 = elements14.toArray();
        org.jsoup.nodes.Document document18 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element20 = document18.prependElement("hi!");
        org.jsoup.nodes.Element element21 = element20.parent();
        org.jsoup.nodes.Element element22 = element20.empty();
        elements14.add(0, element22);
        int int24 = elements14.size();
        boolean boolean25 = elements4.containsAll((java.util.Collection<org.jsoup.nodes.Element>) elements14);
        org.jsoup.nodes.Document document27 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str28 = document27.id();
        org.jsoup.select.Elements elements29 = document27.children();
        org.jsoup.select.Elements elements31 = elements29.html("#root=\"\"");
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor32 = elements29.listIterator();
        boolean boolean33 = elements4.addAll((java.util.Collection<org.jsoup.nodes.Element>) elements29);
        org.jsoup.select.Elements elements34 = new org.jsoup.select.Elements((java.util.List<org.jsoup.nodes.Element>) elements29);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(elementSpliterator5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[]");
        org.junit.Assert.assertNotNull(document18);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(document27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(elements29);
        org.junit.Assert.assertNotNull(elements31);
        org.junit.Assert.assertNotNull(elementItor32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
    }

    @Test
    public void test720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test720");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("#root", "#root");
        org.jsoup.nodes.Element element4 = document2.addClass("<#root>\n</#root>");
        org.jsoup.select.Elements elements5 = element4.children();
        java.lang.String str6 = element4.nodeName();
        org.jsoup.nodes.Element element8 = element4.getElementById("<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>");
        org.jsoup.nodes.Element element10 = element4.getElementById(" declaration=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;hi!\"");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#document" + "'", str6, "#document");
        org.junit.Assert.assertNull(element8);
        org.junit.Assert.assertNull(element10);
    }

    @Test
    public void test721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test721");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str2 = document1.tagName();
        java.lang.String str3 = document1.html();
        org.jsoup.nodes.Element element5 = document1.append("hi!");
        org.jsoup.nodes.Element element7 = document1.html("#text");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#root" + "'", str2, "#root");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>" + "'", str3, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
    }

    @Test
    public void test722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test722");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.select.Elements elements3 = document1.getElementsByTag("#root");
        org.jsoup.select.Elements elements5 = elements3.append("<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!");
        org.jsoup.nodes.Element element6 = elements5.first();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(element6);
    }

    @Test
    public void test723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test723");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("#root");
        boolean boolean2 = document1.hasText();
        org.jsoup.select.Elements elements4 = document1.getElementsByIndexEquals(10);
        java.util.Spliterator<org.jsoup.nodes.Element> elementSpliterator5 = elements4.spliterator();
        org.jsoup.nodes.Document document7 = new org.jsoup.nodes.Document("#root");
        boolean boolean8 = elements4.add((org.jsoup.nodes.Element) document7);
        boolean boolean9 = elements4.isEmpty();
        org.jsoup.nodes.Document document11 = new org.jsoup.nodes.Document("#root");
        boolean boolean12 = document11.hasText();
        org.jsoup.select.Elements elements14 = document11.getElementsByIndexEquals(10);
        java.lang.Object[] objArray15 = elements14.toArray();
        org.jsoup.nodes.Document document18 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element20 = document18.prependElement("hi!");
        org.jsoup.nodes.Element element21 = element20.parent();
        org.jsoup.nodes.Element element22 = element20.empty();
        elements14.add(0, element22);
        int int24 = elements14.size();
        boolean boolean25 = elements4.containsAll((java.util.Collection<org.jsoup.nodes.Element>) elements14);
        org.jsoup.nodes.Document document27 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str28 = document27.id();
        org.jsoup.select.Elements elements29 = document27.children();
        org.jsoup.select.Elements elements31 = elements29.html("#root=\"\"");
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor32 = elements29.listIterator();
        boolean boolean33 = elements4.addAll((java.util.Collection<org.jsoup.nodes.Element>) elements29);
        org.jsoup.nodes.Document document35 = new org.jsoup.nodes.Document("#root");
        java.lang.String str36 = document35.toString();
        boolean boolean37 = elements29.contains((java.lang.Object) document35);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Element> elementList40 = elements29.subList((int) '#', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: toIndex = 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(elementSpliterator5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[]");
        org.junit.Assert.assertNotNull(document18);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(document27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(elements29);
        org.junit.Assert.assertNotNull(elements31);
        org.junit.Assert.assertNotNull(elementItor32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test724");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str2 = document1.tagName();
        java.lang.String str3 = document1.html();
        org.jsoup.nodes.Element element5 = document1.append("hi!");
        boolean boolean7 = document1.hasAttr("#declaration");
        org.jsoup.nodes.Document document10 = org.jsoup.Jsoup.parseBodyFragment("#root=\"\"", "<#root>\n</#root>");
        java.lang.String str11 = document10.toString();
        java.lang.String str12 = document10.nodeName();
        java.lang.String str13 = document10.outerHtml();
        org.jsoup.nodes.Element element14 = document10.body();
        org.jsoup.nodes.Document document15 = document10.normalise();
        org.jsoup.nodes.Element element16 = document1.prependChild((org.jsoup.nodes.Node) document15);
        java.util.List<org.jsoup.nodes.Node> nodeList17 = document1.childNodes();
        java.lang.String str18 = document1.outerHtml();
        java.lang.String str19 = document1.html();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#root" + "'", str2, "#root");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>" + "'", str3, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>" + "'", str11, "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "#document" + "'", str12, "#document");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>" + "'", str13, "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>");
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(document15);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(nodeList17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "<#root>\n<html>\n <head>\n </head>\n <body>\n  #root=&quot;&quot;\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!" + "'", str18, "<#root>\n<html>\n <head>\n </head>\n <body>\n  #root=&quot;&quot;\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "<#root>\n<html>\n <head>\n </head>\n <body>\n  #root=&quot;&quot;\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!" + "'", str19, "<#root>\n<html>\n <head>\n </head>\n <body>\n  #root=&quot;&quot;\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!");
    }

    @Test
    public void test725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test725");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str2 = document1.tagName();
        org.jsoup.parser.Tag tag3 = document1.tag();
        java.lang.String str4 = document1.outerHtml();
        java.lang.String str5 = document1.outerHtml();
        java.lang.String str6 = document1.title();
        org.jsoup.nodes.Element element7 = document1.empty();
        org.jsoup.nodes.Element element9 = document1.html("org.jsoup.select.Selector$SelectorParseException: <#root>\n</#root>");
        java.lang.String str10 = document1.nodeName();
        org.jsoup.select.Elements elements13 = document1.getElementsByAttributeValueEnding("#declaration", "<html>\n  <head>\n  </head>\n  <body>\n  </body>\n </html>hi!<#root>\n  <html>\n   <head>\n   </head>\n   <body>\n   </body>\n  </html>hi!\n </#root>\n<head>\n  </head>\n  <body>\n  </body>\n\n\n<html>\n   <head>\n   </head>\n   <body>\n   </body>\n  </html>hi!\n<head>\n   </head>\n   <body>\n   </body>\n\n");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#root" + "'", str2, "#root");
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>" + "'", str4, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>" + "'", str5, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#document" + "'", str10, "#document");
        org.junit.Assert.assertNotNull(elements13);
    }

    @Test
    public void test726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test726");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str2 = document1.tagName();
        org.jsoup.nodes.Element element4 = document1.append("hi!");
        org.jsoup.nodes.Element element6 = document1.html("org.jsoup.select.Selector$SelectorParseException: hi!");
        org.jsoup.nodes.Element element8 = document1.prependText("<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>");
        org.jsoup.nodes.Element element10 = document1.createElement("aorg");
        org.jsoup.select.Elements elements12 = element10.getElementsByIndexLessThan((int) (byte) 10);
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#root" + "'", str2, "#root");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(elements12);
    }

    @Test
    public void test727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test727");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str2 = document1.tagName();
        java.lang.String str3 = document1.html();
        org.jsoup.nodes.Element element5 = document1.append("#root=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;\"");
        org.jsoup.nodes.Element element7 = document1.appendText("<html>\n<head>\n</head>\n<body> ohi!\n</body>\n</html>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements10 = element7.getElementsByAttributeValueNot("", "<html>\n <head>\n </head>\n <body>\n </body>\n</html>hi!\n\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n\n <head>\n </head>\n\n <body>\n </body>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#root" + "'", str2, "#root");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>" + "'", str3, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
    }

    @Test
    public void test728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test728");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("#root", "#root");
        org.jsoup.nodes.Element element4 = document2.addClass("<#root>\n</#root>");
        org.jsoup.select.Elements elements6 = element4.getElementsByAttribute("\n<!--#root=\"\"-->");
        java.lang.String str7 = element4.outerHtml();
        org.jsoup.nodes.Element element10 = element4.attr("<aorg>\n</aorg>", ".jsoup.select.Selector$SelectorParseException: hi!<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements13 = element10.getElementsByAttributeValue("<html>\n<head>\n</head>\n<body> ohi!\n</body>\n</html>", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<html>\n<head>\n</head>\n<body>\n #root\n</body>\n</html>" + "'", str7, "<html>\n<head>\n</head>\n<body>\n #root\n</body>\n</html>");
        org.junit.Assert.assertNotNull(element10);
    }

    @Test
    public void test729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test729");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str2 = document1.tagName();
        org.jsoup.nodes.Element element4 = document1.append("hi!");
        java.lang.String str5 = document1.outerHtml();
        org.jsoup.select.Elements elements6 = document1.children();
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("#root");
        boolean boolean10 = document9.hasText();
        org.jsoup.select.Elements elements12 = document9.getElementsByIndexEquals(10);
        org.jsoup.nodes.Document document14 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str15 = document14.tagName();
        org.jsoup.parser.Tag tag16 = document14.tag();
        org.jsoup.nodes.TextNode textNode19 = new org.jsoup.nodes.TextNode("hi!", "");
        org.jsoup.nodes.Node node20 = textNode19.parent();
        org.jsoup.nodes.Element element21 = document14.appendChild((org.jsoup.nodes.Node) textNode19);
        org.jsoup.select.Elements elements23 = element21.getElementsByClass("#root");
        org.jsoup.nodes.Element element24 = document9.prependChild((org.jsoup.nodes.Node) element21);
        org.jsoup.select.Elements elements27 = element21.getElementsByAttributeValueNot("#text", "#document");
        org.jsoup.nodes.Element element29 = element21.appendElement("<?<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!>");
        elements6.add((int) (byte) 1, element21);
        org.jsoup.select.Elements elements32 = elements6.append("");
        java.lang.Object obj33 = null;
        int int34 = elements32.lastIndexOf(obj33);
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#root" + "'", str2, "#root");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!" + "'", str5, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(document14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "#root" + "'", str15, "#root");
        org.junit.Assert.assertNotNull(tag16);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(elements23);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(elements27);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertNotNull(elements32);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
    }

    @Test
    public void test730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test730");
        org.jsoup.nodes.Document document2 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str3 = document2.tagName();
        java.lang.String str4 = document2.html();
        org.jsoup.nodes.Element element6 = document2.append("hi!");
        java.lang.String str7 = document2.nodeName();
        org.jsoup.select.Elements elements10 = document2.getElementsByAttributeValueContaining("&lt;html&gt;\n &lt;head&gt;\n &lt;/head&gt;\n &lt;body&gt;\n &lt;/body&gt;\n&lt;/html&gt;hi!\n&lt;head&gt;\n &lt;/head&gt;\n &lt;body&gt;\n &lt;/body&gt;\n\n", "<html>\n<head>\n</head>\n<body>\n #root=\"\"\n</body>\n</html>");
        org.jsoup.select.Elements elements13 = document2.getElementsByAttributeValue("<#root class=\"\">\n</#root>", "ohi!");
        org.jsoup.nodes.Element element15 = document2.toggleClass("[<, !, <, h, t, m, l, >, \n, <, h, e, a, d, >, \n, <, /, h, e, a, d, >, \n, <, b, o, d, y, >, \n, <, /, b, o, d, y, >, \n, <, /, h, t, m, l, >, h, i, !, >]");
        element15.setBaseUri("<html>\n <head>\n </head>\n <body>\n </body>\n</html>hi!\n<head>\n </head>\n <body>\n </body>\n\n");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements18 = org.jsoup.select.Selector.select("", element15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#root" + "'", str3, "#root");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>" + "'", str4, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#document" + "'", str7, "#document");
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(element15);
    }

    @Test
    public void test731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test731");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element3 = document1.prependElement("hi!");
        org.jsoup.nodes.Element element4 = element3.parent();
        org.jsoup.nodes.Element element5 = element3.empty();
        org.jsoup.nodes.Element element6 = element5.empty();
        java.lang.String str7 = element6.nodeName();
        org.jsoup.nodes.Document document9 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str10 = document9.tagName();
        org.jsoup.nodes.Element element12 = document9.append("hi!");
        java.lang.String str13 = document9.outerHtml();
        org.jsoup.select.Elements elements14 = document9.children();
        org.jsoup.nodes.Document document16 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.select.Elements elements18 = document16.getElementsByTag("#root");
        boolean boolean19 = document9.equals((java.lang.Object) document16);
        org.jsoup.nodes.Element element21 = document16.append("#text");
        element6.replaceWith((org.jsoup.nodes.Node) document16);
        org.jsoup.select.Elements elements24 = element6.getElementsByClass(" text=\"hi!\"");
        org.jsoup.nodes.Element element26 = element6.appendElement("<#root>\n</#root>");
        org.jsoup.parser.Tag tag27 = element6.tag();
        org.jsoup.nodes.Attributes attributes29 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element30 = new org.jsoup.nodes.Element(tag27, "\n<!--<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!-->", attributes29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(document9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#root" + "'", str10, "#root");
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!" + "'", str13, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!");
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(document16);
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(elements24);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertNotNull(tag27);
    }

    @Test
    public void test732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test732");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor1 = attributes0.iterator();
        org.jsoup.nodes.Attributes attributes2 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor3 = attributes2.iterator();
        boolean boolean5 = attributes2.hasKey("");
        attributes2.remove("#root=\"\"");
        attributes0.addAll(attributes2);
        attributes2.put("#root=\"hi!\"", "#root");
        org.jsoup.nodes.Attribute attribute14 = new org.jsoup.nodes.Attribute("#comment", "#root=\"\"=\"\"");
        attributes2.put(attribute14);
        attributes2.put("#root", "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!");
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator19 = attributes2.spliterator();
        org.jsoup.nodes.Attributes attributes20 = new org.jsoup.nodes.Attributes();
        boolean boolean22 = attributes20.equals((java.lang.Object) (byte) 100);
        attributes2.addAll(attributes20);
        org.jsoup.nodes.Attribute attribute26 = new org.jsoup.nodes.Attribute("<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!", "#root=\"hi!\"");
        org.jsoup.nodes.Document document28 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element30 = document28.prependElement("hi!");
        org.jsoup.nodes.Element element32 = element30.append("");
        boolean boolean33 = attribute26.equals((java.lang.Object) "");
        attributes2.put(attribute26);
        java.lang.String str35 = attribute26.toString();
        java.lang.String str36 = attribute26.toString();
        java.lang.String str37 = attribute26.getValue();
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertNotNull(attributeItor3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(attributeSpliterator19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(document28);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertNotNull(element32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!=\"#root=&quot;hi!&quot;\"" + "'", str35, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!=\"#root=&quot;hi!&quot;\"");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!=\"#root=&quot;hi!&quot;\"" + "'", str36, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!=\"#root=&quot;hi!&quot;\"");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "#root=\"hi!\"" + "'", str37, "#root=\"hi!\"");
    }

    @Test
    public void test733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test733");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("", "\n<!--#root=\"\"-->");
        org.jsoup.select.Elements elements5 = document2.getElementsByAttributeValueContaining("\n<!--#root=\"\"-->", "#root=\"hi!\"");
        org.jsoup.nodes.Document document8 = new org.jsoup.nodes.Document("#root");
        boolean boolean9 = document8.hasText();
        org.jsoup.select.Elements elements11 = document8.getElementsByIndexEquals(10);
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor12 = elements11.listIterator();
        org.jsoup.select.Elements elements15 = elements11.attr("<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "hi!");
        org.jsoup.select.Elements elements16 = org.jsoup.select.Selector.select("#root", (java.lang.Iterable<org.jsoup.nodes.Element>) elements11);
        org.jsoup.select.Elements elements17 = new org.jsoup.select.Elements((java.util.Collection<org.jsoup.nodes.Element>) elements11);
        boolean boolean18 = elements5.containsAll((java.util.Collection<org.jsoup.nodes.Element>) elements11);
        org.jsoup.select.Elements elements20 = elements5.addClass("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        int int21 = elements20.size();
        java.lang.String str22 = elements20.html();
        boolean boolean24 = elements20.is("<#root>\n<html>\n <head>\n </head>\n <body>\n  #root=&quot;&quot;\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!");
        org.jsoup.nodes.Document document27 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.select.Elements elements29 = document27.getElementsByTag("#root");
        java.lang.String str30 = elements29.text();
        org.jsoup.nodes.Document document32 = new org.jsoup.nodes.Document("#root");
        boolean boolean33 = document32.hasText();
        org.jsoup.select.Elements elements35 = document32.getElementsByIndexEquals(10);
        java.lang.Object[] objArray36 = elements35.toArray();
        boolean boolean37 = elements29.retainAll((java.util.Collection<org.jsoup.nodes.Element>) elements35);
        org.jsoup.select.Elements elements39 = elements29.wrap("\n<!--#root=\"\"-->");
        org.jsoup.select.Elements elements41 = elements29.eq((int) '.');
        java.lang.String str42 = elements41.text();
        org.jsoup.nodes.Document document44 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str45 = document44.tagName();
        org.jsoup.parser.Tag tag46 = document44.tag();
        org.jsoup.nodes.Element element48 = new org.jsoup.nodes.Element(tag46, "#root=\"\"");
        boolean boolean49 = element48.isBlock();
        org.jsoup.nodes.Document document51 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str52 = document51.tagName();
        org.jsoup.parser.Tag tag53 = document51.tag();
        org.jsoup.nodes.Element element55 = new org.jsoup.nodes.Element(tag53, "#root=\"\"");
        java.lang.String str56 = element55.toString();
        org.jsoup.nodes.Element element58 = element55.text("");
        org.jsoup.nodes.Element element60 = element55.removeClass("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        boolean boolean62 = element55.hasClass("<?<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!>");
        org.jsoup.nodes.Element element63 = element48.prependChild((org.jsoup.nodes.Node) element55);
        boolean boolean64 = elements41.contains((java.lang.Object) element55);
        elements20.add((int) (byte) 0, element55);
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(elementItor12);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(elements20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(document27);
        org.junit.Assert.assertNotNull(elements29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(elements35);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray36), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray36), "[]");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(elements39);
        org.junit.Assert.assertNotNull(elements41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertNotNull(document44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "#root" + "'", str45, "#root");
        org.junit.Assert.assertNotNull(tag46);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(document51);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "#root" + "'", str52, "#root");
        org.junit.Assert.assertNotNull(tag53);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "<#root>\n</#root>" + "'", str56, "<#root>\n</#root>");
        org.junit.Assert.assertNotNull(element58);
        org.junit.Assert.assertNotNull(element60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(element63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
    }

    @Test
    public void test734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test734");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!", "<!--#root=\"\"-->");
        org.jsoup.nodes.Element element3 = document2.head();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element3);
    }

    @Test
    public void test735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test735");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element3 = document1.prependElement("hi!");
        org.jsoup.nodes.Element element5 = element3.append("");
        org.jsoup.nodes.Document document7 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str8 = document7.tagName();
        org.jsoup.nodes.Element element10 = document7.append("hi!");
        org.jsoup.nodes.Document document12 = new org.jsoup.nodes.Document("#root");
        org.jsoup.nodes.Document document14 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.select.Elements elements16 = document14.getElementsByTag("#root");
        org.jsoup.nodes.Element[] elementArray17 = new org.jsoup.nodes.Element[] { element3, element10, document12, document14 };
        org.jsoup.select.Elements elements18 = new org.jsoup.select.Elements(elementArray17);
        java.util.stream.Stream<org.jsoup.nodes.Element> elementStream19 = elements18.parallelStream();
        java.lang.Object obj20 = null;
        boolean boolean21 = elements18.contains(obj20);
        java.util.Spliterator<org.jsoup.nodes.Element> elementSpliterator22 = elements18.spliterator();
        org.jsoup.select.Elements elements24 = elements18.addClass("#root=&quot;&quot;");
        org.jsoup.select.Elements elements26 = elements24.addClass(" #root=\"\"=\"\"");
        org.jsoup.nodes.Document document28 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str29 = document28.tagName();
        org.jsoup.parser.Tag tag30 = document28.tag();
        org.jsoup.nodes.Element element32 = new org.jsoup.nodes.Element(tag30, "#root=\"\"");
        org.jsoup.nodes.Document document34 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str35 = document34.tagName();
        org.jsoup.parser.Tag tag36 = document34.tag();
        boolean boolean37 = tag30.canContain(tag36);
        boolean boolean38 = tag30.isInline();
        org.jsoup.parser.Tag tag39 = tag30.getImplicitParent();
        org.jsoup.nodes.Attributes attributes41 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor42 = attributes41.iterator();
        boolean boolean44 = attributes41.hasKey("");
        attributes41.remove("#root=\"\"");
        java.lang.String str47 = attributes41.html();
        java.lang.String str48 = attributes41.toString();
        org.jsoup.nodes.Attribute attribute51 = new org.jsoup.nodes.Attribute("#root", "");
        java.lang.String str52 = attribute51.getKey();
        attribute51.setKey("#root=\"\"");
        attributes41.put(attribute51);
        org.jsoup.nodes.Element element56 = new org.jsoup.nodes.Element(tag39, "<#root>\n<html>\n <head>\n </head>\n <body>\n  #root=&quot;&quot;\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!", attributes41);
        org.jsoup.select.Elements elements58 = element56.getElementsByIndexGreaterThan((int) (short) -1);
        boolean boolean59 = elements24.remove((java.lang.Object) element56);
        org.jsoup.select.Elements elements61 = elements24.html("<?#root=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;\">");
        boolean boolean63 = elements61.hasClass("<html>\n<head>\n</head>\n<body> #document\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#root" + "'", str8, "#root");
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(document14);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertNotNull(elementArray17);
        org.junit.Assert.assertNotNull(elementStream19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(elementSpliterator22);
        org.junit.Assert.assertNotNull(elements24);
        org.junit.Assert.assertNotNull(elements26);
        org.junit.Assert.assertNotNull(document28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "#root" + "'", str29, "#root");
        org.junit.Assert.assertNotNull(tag30);
        org.junit.Assert.assertNotNull(document34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "#root" + "'", str35, "#root");
        org.junit.Assert.assertNotNull(tag36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(tag39);
        org.junit.Assert.assertNotNull(attributeItor42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "#root" + "'", str52, "#root");
        org.junit.Assert.assertNotNull(elements58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(elements61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
    }

    @Test
    public void test736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test736");
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parseBodyFragment("#root=\"\"", "<#root>\n</#root>");
        org.jsoup.nodes.Element element4 = document2.prepend("");
        org.jsoup.nodes.Attributes attributes5 = element4.attributes();
        org.jsoup.nodes.Element element7 = element4.text("\n<hi!>\n</hi!>");
        java.lang.String str8 = element7.toString();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<html>\n<head>\n</head>\n<body>\n  &lt;hi!&gt; &lt;/hi!&gt;\n</body>\n</html>" + "'", str8, "<html>\n<head>\n</head>\n<body>\n  &lt;hi!&gt; &lt;/hi!&gt;\n</body>\n</html>");
    }

    @Test
    public void test737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test737");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str2 = document1.tagName();
        java.lang.String str3 = document1.html();
        org.jsoup.nodes.Element element5 = document1.append("hi!");
        org.jsoup.nodes.Element element6 = element5.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attributes attributes7 = element6.attributes();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#root" + "'", str2, "#root");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>" + "'", str3, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNull(element6);
    }

    @Test
    public void test738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test738");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>");
        org.jsoup.nodes.Element element3 = document1.wrap("&lt;?#root=&quot;&amp;lt;html&amp;gt; &amp;lt;head&amp;gt; &amp;lt;/head&amp;gt; &amp;lt;body&amp;gt; &amp;lt;/body&amp;gt; &amp;lt;/html&amp;gt;&quot;&gt;");
        java.lang.String str4 = document1.outerHtml();
        org.jsoup.select.Elements elements7 = document1.getElementsByAttributeValueEnding("!", "hi!");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<html>\n<head>\n</head>\n<body>\n <html> \n  <head> \n  </head> \n  <body>\n    #root=&quot;&quot;  \n  </body>\n </html>\n</body>\n</html>" + "'", str4, "<html>\n<head>\n</head>\n<body>\n <html> \n  <head> \n  </head> \n  <body>\n    #root=&quot;&quot;  \n  </body>\n </html>\n</body>\n</html>");
        org.junit.Assert.assertNotNull(elements7);
    }

    @Test
    public void test739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test739");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("org.jsoup.select.Selector$SelectorParseException: org.jsoup.select.Selector$SelectorParseException: <html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document1);
    }

    @Test
    public void test740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test740");
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parse("&lt;?#root=&quot;&amp;lt;html&amp;gt; &amp;lt;head&amp;gt; &amp;lt;/head&amp;gt; &amp;lt;body&amp;gt; &amp;lt;/body&amp;gt; &amp;lt;/html&amp;gt;&quot;&gt;", "<html>\n<head>\n</head>\n<body> #root\n</body>\n</html>");
        org.jsoup.nodes.Element element4 = document2.appendElement("#root=&quot;&quot;");
        org.jsoup.select.Elements elements7 = element4.getElementsByAttributeValueStarting("<html>\n<head>\n</head>\n<body> #root=&quot;&quot;\n</body>\n</html>", " text=\"hi!\"");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements7);
    }

    @Test
    public void test741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test741");
        org.jsoup.nodes.Document document2 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element4 = document2.prependElement("hi!");
        org.jsoup.nodes.Element element6 = element4.append("");
        org.jsoup.select.Elements elements7 = org.jsoup.select.Selector.select("#root", element6);
        java.lang.String str8 = element6.id();
        org.jsoup.nodes.Element element10 = element6.val("[o, h, i, !]");
        java.lang.String str11 = element6.toString();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\n<hi! value=\"[o, h, i, !]\">\n</hi!>" + "'", str11, "\n<hi! value=\"[o, h, i, !]\">\n</hi!>");
    }

    @Test
    public void test742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test742");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str2 = document1.tagName();
        org.jsoup.parser.Tag tag3 = document1.tag();
        boolean boolean4 = tag3.isEmpty();
        org.jsoup.nodes.Document document6 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str7 = document6.tagName();
        org.jsoup.parser.Tag tag8 = document6.tag();
        org.jsoup.nodes.Element element10 = new org.jsoup.nodes.Element(tag8, "#root=\"\"");
        org.jsoup.nodes.Document document12 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str13 = document12.tagName();
        org.jsoup.parser.Tag tag14 = document12.tag();
        boolean boolean15 = tag8.canContain(tag14);
        boolean boolean16 = tag3.isValidParent(tag8);
        org.jsoup.nodes.Document document18 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str19 = document18.tagName();
        org.jsoup.parser.Tag tag20 = document18.tag();
        boolean boolean21 = tag20.isEmpty();
        boolean boolean22 = tag8.canContain(tag20);
        boolean boolean23 = tag8.isEmpty();
        org.jsoup.nodes.Document document26 = org.jsoup.Jsoup.parseBodyFragment("#root=\"\"", "<#root>\n</#root>");
        java.lang.String str27 = document26.nodeName();
        org.jsoup.select.Elements elements29 = document26.getElementsByIndexEquals(10);
        java.lang.String str30 = document26.toString();
        org.jsoup.nodes.Element element32 = document26.append("hi!");
        org.jsoup.nodes.Document document34 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element36 = document34.prependElement("hi!");
        org.jsoup.nodes.Element element37 = element36.parent();
        org.jsoup.nodes.Element element38 = element36.empty();
        org.jsoup.nodes.Element element39 = element38.empty();
        java.util.Set<java.lang.String> strSet40 = element39.classNames();
        org.jsoup.nodes.Element element41 = document26.classNames(strSet40);
        org.jsoup.nodes.Element element43 = document26.prependElement("<?<html>\n<head>\n</head>\n<body>\n</body>\n</html>>");
        boolean boolean44 = tag8.equals((java.lang.Object) document26);
        org.jsoup.nodes.Document document45 = document26.normalise();
        org.jsoup.nodes.Element element46 = document26.head();
        element46.setBaseUri("&lt;?#root=&quot;&amp;lt;html&amp;gt; &amp;lt;head&amp;gt; &amp;lt;/head&amp;gt; &amp;lt;body&amp;gt; &amp;lt;/body&amp;gt; &amp;lt;/html&amp;gt;&quot;&gt;");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#root" + "'", str2, "#root");
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#root" + "'", str7, "#root");
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "#root" + "'", str13, "#root");
        org.junit.Assert.assertNotNull(tag14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(document18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "#root" + "'", str19, "#root");
        org.junit.Assert.assertNotNull(tag20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(document26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "#document" + "'", str27, "#document");
        org.junit.Assert.assertNotNull(elements29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>" + "'", str30, "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>");
        org.junit.Assert.assertNotNull(element32);
        org.junit.Assert.assertNotNull(document34);
        org.junit.Assert.assertNotNull(element36);
        org.junit.Assert.assertNotNull(element37);
        org.junit.Assert.assertNotNull(element38);
        org.junit.Assert.assertNotNull(element39);
        org.junit.Assert.assertNotNull(strSet40);
        org.junit.Assert.assertNotNull(element41);
        org.junit.Assert.assertNotNull(element43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(document45);
        org.junit.Assert.assertNotNull(element46);
    }

    @Test
    public void test743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test743");
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parse("", "<html>\n<head>\n</head>\n<body>\n org.jsoup.select.Selector$SelectorParseException: hi!&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document2);
    }

    @Test
    public void test744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test744");
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parseBodyFragment("#root=\"\"", "<#root>\n</#root>");
        java.lang.String str3 = document2.nodeName();
        org.jsoup.nodes.Element element4 = document2.empty();
        org.jsoup.nodes.Element element6 = element4.prepend("<#root>\n</#root>=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;\"");
        java.lang.String str7 = element6.val();
        org.jsoup.select.Elements elements10 = element6.getElementsByAttributeValueStarting("#declaration", "<html>\n<head>\n</head>\n<body> ohi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(elements10);
    }

    @Test
    public void test745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test745");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str2 = document1.tagName();
        org.jsoup.nodes.Element element4 = document1.append("hi!");
        java.lang.String str5 = document1.outerHtml();
        org.jsoup.select.Elements elements6 = document1.children();
        org.jsoup.nodes.Element element7 = document1.empty();
        org.jsoup.select.Elements elements10 = document1.getElementsByAttributeValueNot("<html>\n <head>\n </head>\n <body>\n </body>\n</html>hi!\n\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n\n <head>\n </head>\n\n <body>\n </body>", "<html>\n<head>\n</head>\n<body>\n #root\n</body>\n</html>");
        java.lang.String str12 = elements10.attr("h");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#root" + "'", str2, "#root");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!" + "'", str5, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test746");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("#root", "#root");
        org.jsoup.nodes.Element element4 = document2.addClass("<#root>\n</#root>");
        org.jsoup.select.Elements elements5 = element4.children();
        org.jsoup.select.Elements elements7 = elements5.prepend(" text=\"hi!\"");
        org.jsoup.select.Elements elements9 = elements5.removeClass("");
        org.jsoup.select.Elements elements11 = elements5.removeClass("<html>\n<head>\n</head>\n<body>\n <html> \n  <head> \n  </head> \n  <body>\n    #root=&quot;&quot;  \n  </body>\n </html>\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(elements11);
    }

    @Test
    public void test747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test747");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("#root");
        boolean boolean2 = document1.hasText();
        org.jsoup.select.Elements elements4 = document1.getElementsByIndexEquals(10);
        org.jsoup.select.Elements elements7 = document1.getElementsByAttributeValueEnding("<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!", "hi!");
        org.jsoup.nodes.Document document10 = org.jsoup.parser.Parser.parseBodyFragment("#root", "#root");
        org.jsoup.nodes.Element element12 = document10.addClass("<#root>\n</#root>");
        org.jsoup.select.Elements elements13 = element12.children();
        org.jsoup.select.Elements elements16 = element12.getElementsByAttributeValueNot("#root", "<html>\n <head>\n </head>\n <body>\n </body>\n</html>hi!\n\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n\n <head>\n </head>\n\n <body>\n </body>");
        org.jsoup.nodes.Document document18 = org.jsoup.nodes.Document.createShell("hi!");
        boolean boolean19 = elements16.equals((java.lang.Object) "hi!");
        boolean boolean20 = elements7.equals((java.lang.Object) boolean19);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ListIterator<org.jsoup.nodes.Element> elementItor22 = elements7.listIterator((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertNotNull(document18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test748");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor1 = attributes0.iterator();
        org.jsoup.nodes.Attributes attributes2 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor3 = attributes2.iterator();
        boolean boolean5 = attributes2.hasKey("");
        attributes2.remove("#root=\"\"");
        attributes0.addAll(attributes2);
        attributes2.put("#root=\"hi!\"", "#root");
        org.jsoup.nodes.Attribute attribute14 = new org.jsoup.nodes.Attribute("#comment", "#root=\"\"=\"\"");
        attributes2.put(attribute14);
        attributes2.put("#root", "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!");
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator19 = attributes2.spliterator();
        org.jsoup.nodes.Attributes attributes20 = new org.jsoup.nodes.Attributes();
        boolean boolean22 = attributes20.equals((java.lang.Object) (byte) 100);
        attributes2.addAll(attributes20);
        org.jsoup.nodes.Attribute attribute26 = new org.jsoup.nodes.Attribute("<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!", "#root=\"hi!\"");
        org.jsoup.nodes.Document document28 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element30 = document28.prependElement("hi!");
        org.jsoup.nodes.Element element32 = element30.append("");
        boolean boolean33 = attribute26.equals((java.lang.Object) "");
        attributes2.put(attribute26);
        java.lang.String str35 = attributes2.toString();
        java.lang.String str37 = attributes2.get("org.jsoup.select.Selector$SelectorParseException: <#root>\n</#root>");
        org.jsoup.nodes.Document document39 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str40 = document39.tagName();
        org.jsoup.parser.Tag tag41 = document39.tag();
        org.jsoup.nodes.Document document43 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str44 = document43.tagName();
        org.jsoup.parser.Tag tag45 = document43.tag();
        boolean boolean46 = tag45.isEmpty();
        org.jsoup.nodes.Document document48 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str49 = document48.tagName();
        org.jsoup.parser.Tag tag50 = document48.tag();
        org.jsoup.nodes.Element element52 = new org.jsoup.nodes.Element(tag50, "#root=\"\"");
        org.jsoup.nodes.Document document54 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str55 = document54.tagName();
        org.jsoup.parser.Tag tag56 = document54.tag();
        boolean boolean57 = tag50.canContain(tag56);
        boolean boolean58 = tag45.isValidParent(tag50);
        org.jsoup.nodes.Document document60 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str61 = document60.tagName();
        org.jsoup.parser.Tag tag62 = document60.tag();
        boolean boolean63 = tag62.isEmpty();
        boolean boolean64 = tag50.canContain(tag62);
        boolean boolean65 = tag41.canContain(tag62);
        org.jsoup.nodes.TextNode textNode69 = new org.jsoup.nodes.TextNode("hi!", "");
        java.lang.String str70 = textNode69.text();
        org.jsoup.nodes.Attributes attributes71 = textNode69.attributes();
        attributes71.put("#root=\"\"=\"\"", "\n<!--#root=\"\"-->");
        org.jsoup.nodes.Element element75 = new org.jsoup.nodes.Element(tag62, "#comment", attributes71);
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor76 = attributes71.iterator();
        org.jsoup.nodes.Attribute attribute79 = new org.jsoup.nodes.Attribute("#root", "");
        java.lang.String str80 = attribute79.getKey();
        java.lang.String str81 = attribute79.html();
        attribute79.setValue("hi!");
        attribute79.setKey("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        attributes71.put(attribute79);
        boolean boolean87 = attributes2.equals((java.lang.Object) attributes71);
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertNotNull(attributeItor3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(attributeSpliterator19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(document28);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertNotNull(element32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + " #root=\"hi!\"=\"#root\" #comment=\"#root=&quot;&quot;=&quot;&quot;\" #root=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;hi!\" <html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!=\"#root=&quot;hi!&quot;\"" + "'", str35, " #root=\"hi!\"=\"#root\" #comment=\"#root=&quot;&quot;=&quot;&quot;\" #root=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;hi!\" <html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!=\"#root=&quot;hi!&quot;\"");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNotNull(document39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "#root" + "'", str40, "#root");
        org.junit.Assert.assertNotNull(tag41);
        org.junit.Assert.assertNotNull(document43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "#root" + "'", str44, "#root");
        org.junit.Assert.assertNotNull(tag45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(document48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "#root" + "'", str49, "#root");
        org.junit.Assert.assertNotNull(tag50);
        org.junit.Assert.assertNotNull(document54);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "#root" + "'", str55, "#root");
        org.junit.Assert.assertNotNull(tag56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(document60);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "#root" + "'", str61, "#root");
        org.junit.Assert.assertNotNull(tag62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "hi!" + "'", str70, "hi!");
        org.junit.Assert.assertNotNull(attributes71);
        org.junit.Assert.assertNotNull(attributeItor76);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "#root" + "'", str80, "#root");
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "#root=\"\"" + "'", str81, "#root=\"\"");
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
    }

    @Test
    public void test749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test749");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.select.Elements elements3 = document1.getElementsByTag("#root");
        org.jsoup.select.Elements elements5 = elements3.append("<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!");
        org.jsoup.select.Elements elements7 = elements3.prepend("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.util.stream.Stream<org.jsoup.nodes.Element> elementStream8 = elements3.parallelStream();
        org.jsoup.nodes.Document document10 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element12 = document10.prependElement("hi!");
        org.jsoup.nodes.Element element14 = element12.append("");
        org.jsoup.nodes.Element element15 = element14.previousElementSibling();
        java.lang.String str16 = element14.nodeName();
        org.jsoup.select.Elements elements19 = element14.getElementsByAttributeValueStarting("<!<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!>", "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>");
        org.jsoup.nodes.Document document21 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str22 = document21.tagName();
        org.jsoup.parser.Tag tag23 = document21.tag();
        org.jsoup.nodes.Element element25 = new org.jsoup.nodes.Element(tag23, "#root=\"\"");
        java.lang.String str26 = element25.toString();
        org.jsoup.nodes.Element element28 = element25.text("");
        org.jsoup.nodes.Element element30 = element25.removeClass("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.select.Elements elements32 = element25.getElementsByIndexGreaterThan(0);
        boolean boolean33 = elements19.addAll((java.util.Collection<org.jsoup.nodes.Element>) elements32);
        boolean boolean34 = elements3.remove((java.lang.Object) elements32);
        org.jsoup.nodes.Document document37 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.select.Elements elements39 = document37.getElementsByTag("#root");
        java.lang.String str40 = elements39.text();
        org.jsoup.nodes.Document document42 = new org.jsoup.nodes.Document("#root");
        boolean boolean43 = document42.hasText();
        org.jsoup.select.Elements elements45 = document42.getElementsByIndexEquals(10);
        java.lang.Object[] objArray46 = elements45.toArray();
        boolean boolean47 = elements39.retainAll((java.util.Collection<org.jsoup.nodes.Element>) elements45);
        org.jsoup.nodes.Document document49 = new org.jsoup.nodes.Document("#root");
        boolean boolean50 = document49.hasText();
        org.jsoup.select.Elements elements52 = document49.getElementsByIndexEquals(10);
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor53 = elements52.listIterator();
        org.jsoup.select.Elements elements56 = elements52.attr("<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "hi!");
        boolean boolean57 = elements39.remove((java.lang.Object) elements56);
        org.jsoup.select.Elements elements59 = elements56.append("");
        org.jsoup.select.Elements elements61 = elements56.prepend("#comment");
        org.jsoup.select.Elements elements62 = org.jsoup.select.Selector.select("!", (java.lang.Iterable<org.jsoup.nodes.Element>) elements61);
        boolean boolean63 = elements62.isEmpty();
        boolean boolean64 = elements32.addAll((java.util.Collection<org.jsoup.nodes.Element>) elements62);
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(elementStream8);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNull(element15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertNotNull(document21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "#root" + "'", str22, "#root");
        org.junit.Assert.assertNotNull(tag23);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "<#root>\n</#root>" + "'", str26, "<#root>\n</#root>");
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertNotNull(elements32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(document37);
        org.junit.Assert.assertNotNull(elements39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(elements45);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray46), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray46), "[]");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(elements52);
        org.junit.Assert.assertNotNull(elementItor53);
        org.junit.Assert.assertNotNull(elements56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(elements59);
        org.junit.Assert.assertNotNull(elements61);
        org.junit.Assert.assertNotNull(elements62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
    }

    @Test
    public void test750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test750");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("#root=\"\"=\"\"", "&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node4 = document2.childNode((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
    }

    @Test
    public void test751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test751");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str2 = document1.tagName();
        org.jsoup.parser.Tag tag3 = document1.tag();
        java.lang.String str4 = document1.outerHtml();
        java.lang.String str5 = document1.outerHtml();
        java.lang.String str6 = document1.title();
        org.jsoup.nodes.Element element7 = document1.empty();
        org.jsoup.nodes.Element element9 = document1.html("org.jsoup.select.Selector$SelectorParseException: <#root>\n</#root>");
        java.lang.String str10 = document1.nodeName();
        org.jsoup.parser.Tag tag11 = document1.tag();
        org.jsoup.nodes.Element element13 = document1.toggleClass("<!--#root=\"\"-->=\"&lt;#root&gt;\n&lt;/#root&gt;=&quot;&amp;lt;html&amp;gt;\n&amp;lt;head&amp;gt;\n&amp;lt;/head&amp;gt;\n&amp;lt;body&amp;gt;\n&amp;lt;/body&amp;gt;\n&amp;lt;/html&amp;gt;&quot;\"");
        org.jsoup.nodes.Element element15 = document1.addClass(".org.jsoup.select.Selector$SelectorParseException: hi!&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#root" + "'", str2, "#root");
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>" + "'", str4, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>" + "'", str5, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#document" + "'", str10, "#document");
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element15);
    }

    @Test
    public void test752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test752");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element3 = document1.prependElement("hi!");
        org.jsoup.nodes.Element element4 = element3.parent();
        org.jsoup.nodes.Element element5 = element3.empty();
        org.jsoup.nodes.Element element6 = element5.empty();
        java.lang.String str7 = element6.nodeName();
        org.jsoup.nodes.Document document9 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str10 = document9.tagName();
        org.jsoup.nodes.Element element12 = document9.append("hi!");
        java.lang.String str13 = document9.outerHtml();
        org.jsoup.select.Elements elements14 = document9.children();
        org.jsoup.nodes.Document document16 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.select.Elements elements18 = document16.getElementsByTag("#root");
        boolean boolean19 = document9.equals((java.lang.Object) document16);
        org.jsoup.nodes.Element element21 = document16.append("#text");
        element6.replaceWith((org.jsoup.nodes.Node) document16);
        org.jsoup.select.Elements elements24 = element6.getElementsByClass(" text=\"hi!\"");
        org.jsoup.nodes.Element element26 = element6.appendElement("<#root>\n</#root>");
        java.lang.String str27 = element6.tagName();
        org.jsoup.nodes.Element element28 = element6.parent();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(document9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#root" + "'", str10, "#root");
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!" + "'", str13, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!");
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(document16);
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(elements24);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertNull(element28);
    }

    @Test
    public void test753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test753");
        org.jsoup.safety.Whitelist whitelist1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.jsoup.Jsoup.clean("[]", whitelist1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test754");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("", "\n<!--#root=\"\"-->");
        org.jsoup.select.Elements elements5 = document2.getElementsByAttributeValueContaining("\n<!--#root=\"\"-->", "#root=\"hi!\"");
        org.jsoup.nodes.Document document8 = new org.jsoup.nodes.Document("#root");
        boolean boolean9 = document8.hasText();
        org.jsoup.select.Elements elements11 = document8.getElementsByIndexEquals(10);
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor12 = elements11.listIterator();
        org.jsoup.select.Elements elements15 = elements11.attr("<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "hi!");
        org.jsoup.select.Elements elements16 = org.jsoup.select.Selector.select("#root", (java.lang.Iterable<org.jsoup.nodes.Element>) elements11);
        org.jsoup.select.Elements elements17 = new org.jsoup.select.Elements((java.util.Collection<org.jsoup.nodes.Element>) elements11);
        boolean boolean18 = elements5.containsAll((java.util.Collection<org.jsoup.nodes.Element>) elements11);
        org.jsoup.select.Elements elements20 = elements5.addClass("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        int int21 = elements20.size();
        java.lang.String str22 = elements20.text();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(elementItor12);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(elements20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test755");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str2 = document1.tagName();
        java.lang.String str3 = document1.html();
        org.jsoup.nodes.Element element5 = document1.append("hi!");
        boolean boolean7 = document1.hasAttr("#declaration");
        org.jsoup.nodes.Document document10 = org.jsoup.Jsoup.parseBodyFragment("#root=\"\"", "<#root>\n</#root>");
        java.lang.String str11 = document10.toString();
        java.lang.String str12 = document10.nodeName();
        java.lang.String str13 = document10.outerHtml();
        org.jsoup.nodes.Element element14 = document10.body();
        org.jsoup.nodes.Document document15 = document10.normalise();
        org.jsoup.nodes.Element element16 = document1.prependChild((org.jsoup.nodes.Node) document15);
        org.jsoup.nodes.Element element18 = document1.prependElement("\n<!--org.jsoup.select.Selector$SelectorParseException: hi!-->");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#root" + "'", str2, "#root");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>" + "'", str3, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>" + "'", str11, "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "#document" + "'", str12, "#document");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>" + "'", str13, "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>");
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(document15);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element18);
    }

    @Test
    public void test756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test756");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("&lt;?&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;hi!&gt;");
        org.junit.Assert.assertNotNull(document1);
    }

    @Test
    public void test757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test757");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("#root", "#root");
        org.jsoup.nodes.Element element4 = document2.addClass("<#root>\n</#root>");
        org.jsoup.nodes.Element element6 = document2.append("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element9 = element6.attr("&lt;html&gt;\n &lt;head&gt;\n &lt;/head&gt;\n &lt;body&gt;\n &lt;/body&gt;\n&lt;/html&gt;hi!\n\n&lt;html&gt;\n &lt;head&gt;\n &lt;/head&gt;\n &lt;body&gt;\n &lt;/body&gt;\n&lt;/html&gt;\n\n &lt;head&gt;\n &lt;/head&gt;\n\n &lt;body&gt;\n &lt;/body&gt;", "#comment");
        java.lang.String str10 = element6.outerHtml();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<html>\n<head>\n</head>\n<body>\n #root\n</body>\n</html>\n<html> \n<head> \n</head> \n<body>  \n</body>\n</html>" + "'", str10, "<html>\n<head>\n</head>\n<body>\n #root\n</body>\n</html>\n<html> \n<head> \n</head> \n<body>  \n</body>\n</html>");
    }

    @Test
    public void test758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test758");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("#root", "#root");
        org.jsoup.nodes.Element element4 = document2.addClass("<#root>\n</#root>");
        org.jsoup.select.Elements elements5 = element4.children();
        org.jsoup.select.Elements elements7 = elements5.prepend(" text=\"hi!\"");
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor8 = elements7.listIterator();
        org.jsoup.select.Elements elements11 = elements7.attr("\n<hi!>\n&lt;#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; #root=&amp;quot;&amp;quot; &lt;/body&gt; &lt;/html&gt; &lt;/#root&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;hi!<#declaration>\n</#declaration>\n</hi!>", "[<, !, <, h, t, m, l, >, \n, <, h, e, a, d, >, \n, <, /, h, e, a, d, >, \n, <, b, o, d, y, >, \n, <, /, b, o, d, y, >, \n, <, /, h, t, m, l, >, h, i, !, >]");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(elementItor8);
        org.junit.Assert.assertNotNull(elements11);
    }

    @Test
    public void test759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test759");
        org.jsoup.safety.Whitelist whitelist1 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.jsoup.Jsoup.isValid("org.jsoup.select.Selector$SelectorParseException: <html>\n<head>\n</head>\n<body>\n</body>\n</html>", whitelist1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test760");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str2 = document1.tagName();
        org.jsoup.nodes.Element element4 = document1.append("hi!");
        java.lang.String str5 = document1.outerHtml();
        org.jsoup.select.Elements elements6 = document1.children();
        org.jsoup.nodes.Document document8 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.select.Elements elements10 = document8.getElementsByTag("#root");
        boolean boolean11 = document1.equals((java.lang.Object) document8);
        org.jsoup.nodes.Element element13 = document8.appendText("#root");
        org.jsoup.nodes.Element element15 = document8.prepend("org.jsoup.select.Selector$SelectorParseException: hi!");
        org.jsoup.nodes.Document document17 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str18 = document17.tagName();
        java.lang.String str19 = document17.html();
        org.jsoup.nodes.Element element21 = document17.append("hi!");
        org.jsoup.nodes.Element element22 = document8.prependChild((org.jsoup.nodes.Node) element21);
        java.util.Set<java.lang.String> strSet23 = element22.classNames();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#root" + "'", str2, "#root");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!" + "'", str5, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(document17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "#root" + "'", str18, "#root");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>" + "'", str19, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(strSet23);
    }

    @Test
    public void test761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test761");
        org.jsoup.safety.Whitelist whitelist1 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.jsoup.Jsoup.isValid("&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;hi!", whitelist1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test762");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str2 = document1.tagName();
        java.lang.String str3 = document1.html();
        org.jsoup.nodes.Element element5 = document1.append("hi!");
        boolean boolean7 = document1.hasAttr("#declaration");
        org.jsoup.nodes.Document document10 = org.jsoup.Jsoup.parseBodyFragment("#root=\"\"", "<#root>\n</#root>");
        java.lang.String str11 = document10.toString();
        java.lang.String str12 = document10.nodeName();
        java.lang.String str13 = document10.outerHtml();
        org.jsoup.nodes.Element element14 = document10.body();
        org.jsoup.nodes.Document document15 = document10.normalise();
        org.jsoup.nodes.Element element16 = document1.prependChild((org.jsoup.nodes.Node) document15);
        java.util.List<org.jsoup.nodes.Node> nodeList17 = document1.childNodes();
        java.lang.String str18 = document1.outerHtml();
        org.jsoup.nodes.Element element20 = document1.createElement(" text=\"hi!\"");
        org.jsoup.nodes.Document document23 = org.jsoup.parser.Parser.parse("", "aorg");
        java.util.Set<java.lang.String> strSet24 = document23.classNames();
        org.jsoup.nodes.Element element25 = document1.classNames(strSet24);
        org.jsoup.nodes.Document document26 = document1.normalise();
        java.lang.String str27 = document26.title();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#root" + "'", str2, "#root");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>" + "'", str3, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>" + "'", str11, "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "#document" + "'", str12, "#document");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>" + "'", str13, "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>");
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(document15);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(nodeList17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "<#root>\n<html>\n <head>\n </head>\n <body>\n  #root=&quot;&quot;\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!" + "'", str18, "<#root>\n<html>\n <head>\n </head>\n <body>\n  #root=&quot;&quot;\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!");
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(document23);
        org.junit.Assert.assertNotNull(strSet24);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(document26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test763");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str2 = document1.tagName();
        org.jsoup.select.Elements elements4 = document1.getElementsByIndexGreaterThan((-1));
        boolean boolean5 = elements4.isEmpty();
        org.jsoup.select.Elements elements7 = elements4.append("\n<!--#root=\"\"-->");
        org.jsoup.nodes.Document document9 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str10 = document9.tagName();
        org.jsoup.parser.Tag tag11 = document9.tag();
        boolean boolean12 = tag11.isEmpty();
        org.jsoup.nodes.Document document14 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str15 = document14.tagName();
        org.jsoup.parser.Tag tag16 = document14.tag();
        org.jsoup.nodes.Element element18 = new org.jsoup.nodes.Element(tag16, "#root=\"\"");
        org.jsoup.nodes.Document document20 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str21 = document20.tagName();
        org.jsoup.parser.Tag tag22 = document20.tag();
        boolean boolean23 = tag16.canContain(tag22);
        boolean boolean24 = tag11.isValidParent(tag16);
        org.jsoup.nodes.Document document26 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str27 = document26.tagName();
        org.jsoup.parser.Tag tag28 = document26.tag();
        boolean boolean29 = tag28.isEmpty();
        boolean boolean30 = tag16.canContain(tag28);
        org.jsoup.nodes.Document document32 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.select.Elements elements34 = document32.getElementsByTag("#root");
        java.lang.String str35 = elements34.text();
        org.jsoup.nodes.Document document37 = new org.jsoup.nodes.Document("#root");
        boolean boolean38 = document37.hasText();
        org.jsoup.select.Elements elements40 = document37.getElementsByIndexEquals(10);
        java.lang.Object[] objArray41 = elements40.toArray();
        boolean boolean42 = elements34.retainAll((java.util.Collection<org.jsoup.nodes.Element>) elements40);
        java.lang.String str43 = elements40.text();
        boolean boolean44 = tag16.equals((java.lang.Object) elements40);
        org.jsoup.select.Elements elements47 = elements40.attr("aorg", "<html>\n <head>\n </head>\n <body>\n </body>\n</html>hi!\n\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n\n <head>\n </head>\n\n <body>\n </body>");
        boolean boolean48 = elements4.removeAll((java.util.Collection<org.jsoup.nodes.Element>) elements40);
        org.jsoup.nodes.Document document50 = org.jsoup.nodes.Document.createShell("#comment");
        org.jsoup.nodes.Element element52 = document50.val("");
        boolean boolean53 = elements40.contains((java.lang.Object) element52);
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor54 = elements40.listIterator();
        java.lang.String str55 = elements40.val();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#root" + "'", str2, "#root");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(document9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#root" + "'", str10, "#root");
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(document14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "#root" + "'", str15, "#root");
        org.junit.Assert.assertNotNull(tag16);
        org.junit.Assert.assertNotNull(document20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "#root" + "'", str21, "#root");
        org.junit.Assert.assertNotNull(tag22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(document26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "#root" + "'", str27, "#root");
        org.junit.Assert.assertNotNull(tag28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(document32);
        org.junit.Assert.assertNotNull(elements34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(elements40);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray41), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray41), "[]");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(elements47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(document50);
        org.junit.Assert.assertNotNull(element52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(elementItor54);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
    }

    @Test
    public void test764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test764");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element3 = document1.prependElement("hi!");
        org.jsoup.nodes.Element element5 = element3.append("");
        org.jsoup.nodes.Document document7 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str8 = document7.tagName();
        org.jsoup.nodes.Element element10 = document7.append("hi!");
        org.jsoup.nodes.Document document12 = new org.jsoup.nodes.Document("#root");
        org.jsoup.nodes.Document document14 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.select.Elements elements16 = document14.getElementsByTag("#root");
        org.jsoup.nodes.Element[] elementArray17 = new org.jsoup.nodes.Element[] { element3, element10, document12, document14 };
        org.jsoup.select.Elements elements18 = new org.jsoup.select.Elements(elementArray17);
        java.util.stream.Stream<org.jsoup.nodes.Element> elementStream19 = elements18.parallelStream();
        java.lang.Object obj20 = null;
        boolean boolean21 = elements18.contains(obj20);
        java.util.Spliterator<org.jsoup.nodes.Element> elementSpliterator22 = elements18.spliterator();
        org.jsoup.select.Elements elements24 = elements18.addClass("#root=&quot;&quot;");
        java.util.stream.Stream<org.jsoup.nodes.Element> elementStream25 = elements24.stream();
        org.jsoup.select.Elements elements27 = elements24.html("hi!");
        org.jsoup.select.Elements elements29 = elements24.append("");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#root" + "'", str8, "#root");
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(document14);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertNotNull(elementArray17);
        org.junit.Assert.assertNotNull(elementStream19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(elementSpliterator22);
        org.junit.Assert.assertNotNull(elements24);
        org.junit.Assert.assertNotNull(elementStream25);
        org.junit.Assert.assertNotNull(elements27);
        org.junit.Assert.assertNotNull(elements29);
    }

    @Test
    public void test765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test765");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        java.lang.String str3 = textNode2.text();
        org.jsoup.nodes.Attributes attributes4 = textNode2.attributes();
        int int5 = attributes4.size();
        org.jsoup.nodes.Attribute attribute8 = new org.jsoup.nodes.Attribute("<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!", "#root=\"hi!\"");
        org.jsoup.nodes.Document document10 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element12 = document10.prependElement("hi!");
        org.jsoup.nodes.Element element14 = element12.append("");
        boolean boolean15 = attribute8.equals((java.lang.Object) "");
        java.lang.String str16 = attribute8.getKey();
        attributes4.put(attribute8);
        org.jsoup.nodes.Attribute attribute20 = new org.jsoup.nodes.Attribute("#root", "");
        attribute20.setValue("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.lang.String str23 = attribute20.html();
        java.lang.String str24 = attribute20.getValue();
        org.jsoup.nodes.Attribute attribute27 = org.jsoup.nodes.Attribute.createFromEncoded("<#root>\n</#root>", "<#root>\n</#root>");
        java.lang.String str28 = attribute27.getKey();
        boolean boolean29 = attribute20.equals((java.lang.Object) str28);
        attributes4.put(attribute20);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!" + "'", str16, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "#root=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;\"" + "'", str23, "#root=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;\"");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>" + "'", str24, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.junit.Assert.assertNotNull(attribute27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "<#root>\n</#root>" + "'", str28, "<#root>\n</#root>");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test766");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("#root", "#root");
        org.jsoup.nodes.Element element4 = document2.addClass("<#root>\n</#root>");
        org.jsoup.select.Elements elements5 = element4.children();
        java.util.stream.Stream<org.jsoup.nodes.Element> elementStream6 = elements5.parallelStream();
        java.util.Collection<org.jsoup.nodes.Element> elementCollection7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = elements5.containsAll(elementCollection7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elementStream6);
    }

    @Test
    public void test767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test767");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("<html>\n <head>\n </head>\n <body>\n </body>\n</html>hi!\n\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n\n <head>\n </head>\n\n <body>\n </body>");
        org.junit.Assert.assertNotNull(document1);
    }

    @Test
    public void test768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test768");
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parseBodyFragment("<html>\n <head>\n </head>\n <body>\n </body>\n</html>hi!\n\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n\n <head>\n </head>\n\n <body>\n </body>", "#declaration");
        org.jsoup.nodes.Document document4 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str5 = document4.tagName();
        org.jsoup.parser.Tag tag6 = document4.tag();
        java.lang.String str7 = document4.outerHtml();
        java.lang.String str8 = document4.outerHtml();
        org.jsoup.nodes.Element element10 = document4.prepend("hi");
        org.jsoup.nodes.Element element11 = element10.empty();
        java.lang.String str12 = element11.tagName();
        java.lang.String str13 = element11.className();
        org.jsoup.nodes.Element element14 = document2.appendChild((org.jsoup.nodes.Node) element11);
        org.jsoup.nodes.Element element15 = element11.lastElementSibling();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(document4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#root" + "'", str5, "#root");
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>" + "'", str7, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>" + "'", str8, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "#root" + "'", str12, "#root");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(element15);
    }

    @Test
    public void test769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test769");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element3 = document1.prependElement("hi!");
        org.jsoup.nodes.Element element5 = element3.append("");
        org.jsoup.nodes.Element element6 = element5.previousElementSibling();
        org.jsoup.nodes.Element element8 = element5.html("#root=\"\"");
        org.jsoup.select.Elements elements11 = element5.getElementsByAttributeValueNot("hi", "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!=\"#root=&quot;hi!&quot;\"");
        java.util.function.UnaryOperator<org.jsoup.nodes.Element> elementUnaryOperator12 = null;
        // The following exception was thrown during execution in test generation
        try {
            elements11.replaceAll(elementUnaryOperator12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements11);
    }

    @Test
    public void test770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test770");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str2 = document1.tagName();
        org.jsoup.nodes.Element element4 = document1.append("hi!");
        org.jsoup.nodes.Element element6 = document1.prependText("hi!");
        org.jsoup.select.Elements elements9 = element6.getElementsByAttributeValueStarting("<html>\n <head>\n </head>\n <body>\n </body>\n</html>hi!\n\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n\n <head>\n </head>\n\n <body>\n </body>", "<html>\n <head>\n </head>\n <body>\n </body>\n</html>hi!\n\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n\n <head>\n </head>\n\n <body>\n </body>");
        org.jsoup.select.Selector.SelectorParseException selectorParseException11 = new org.jsoup.select.Selector.SelectorParseException("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.select.Selector.SelectorParseException selectorParseException13 = new org.jsoup.select.Selector.SelectorParseException("<#root>\n</#root>");
        java.lang.Throwable[] throwableArray14 = selectorParseException13.getSuppressed();
        selectorParseException11.addSuppressed((java.lang.Throwable) selectorParseException13);
        org.jsoup.select.Selector.SelectorParseException selectorParseException17 = new org.jsoup.select.Selector.SelectorParseException("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.lang.Throwable[] throwableArray18 = selectorParseException17.getSuppressed();
        selectorParseException11.addSuppressed((java.lang.Throwable) selectorParseException17);
        org.jsoup.select.Selector.SelectorParseException selectorParseException21 = new org.jsoup.select.Selector.SelectorParseException("<#root>\n</#root>");
        java.lang.Throwable[] throwableArray22 = selectorParseException21.getSuppressed();
        selectorParseException17.addSuppressed((java.lang.Throwable) selectorParseException21);
        java.lang.IllegalStateException[] illegalStateExceptionArray24 = new java.lang.IllegalStateException[] { selectorParseException21 };
        java.lang.IllegalStateException[] illegalStateExceptionArray25 = elements9.toArray(illegalStateExceptionArray24);
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#root" + "'", str2, "#root");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertNotNull(illegalStateExceptionArray24);
        org.junit.Assert.assertNotNull(illegalStateExceptionArray25);
    }

    @Test
    public void test771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test771");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("#comment");
        org.jsoup.nodes.Element element3 = document1.append("");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
    }

    @Test
    public void test772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test772");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("org.jsoup.select.Selector$SelectorParseException: hi!<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element3 = document1.text("<?#root=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;\">");
        org.jsoup.nodes.Element element5 = element3.removeClass("<?<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!>");
        org.jsoup.select.Elements elements8 = element5.getElementsByAttributeValueStarting("[]", "<html>\n <head>\n </head>\n <body>\n </body>\n</html>hi!<<?<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!>>\n</<?<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!>>");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements8);
    }

    @Test
    public void test773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test773");
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parse("org.jsoup.select.Selector$SelectorParseException: <html>\n<head>\n</head>\n<body>\n</body>\n</html>", "");
        java.lang.String str3 = document2.className();
        org.jsoup.select.Elements elements5 = document2.getElementsByIndexGreaterThan((int) (short) 1);
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(elements5);
    }

    @Test
    public void test774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test774");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str2 = document1.tagName();
        org.jsoup.parser.Tag tag3 = document1.tag();
        java.lang.String str4 = document1.outerHtml();
        java.lang.String str5 = document1.outerHtml();
        java.lang.String str6 = document1.title();
        org.jsoup.nodes.Element element7 = document1.empty();
        org.jsoup.nodes.Element element9 = document1.html("org.jsoup.select.Selector$SelectorParseException: <#root>\n</#root>");
        java.lang.String str10 = document1.nodeName();
        org.jsoup.nodes.Element element12 = document1.prepend("[o, r, g, ., j, s, o, u, p, ., s, e, l, e, c, t, ., S, e, l, e, c, t, o, r, $, S, e, l, e, c, t, o, r, P, a, r, s, e, E, x, c, e, p, t, i, o, n, :,  , h, i, !, <, h, t, m, l, >, \n, <, h, e, a, d, >, \n, <, /, h, e, a, d, >, \n, <, b, o, d, y, >, \n, <, /, b, o, d, y, >, \n, <, /, h, t, m, l, >]");
        boolean boolean14 = element12.equals((java.lang.Object) "<text=\"hi!\">\n</text=\"hi!\">");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#root" + "'", str2, "#root");
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>" + "'", str4, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>" + "'", str5, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#document" + "'", str10, "#document");
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test775");
        org.jsoup.nodes.Document document2 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element4 = document2.prependElement("hi!");
        org.jsoup.nodes.Element element6 = element4.append("");
        org.jsoup.select.Elements elements7 = org.jsoup.select.Selector.select("#root", element6);
        java.lang.String str8 = elements7.text();
        int int9 = elements7.size();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test776");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("#root");
        boolean boolean2 = document1.hasText();
        org.jsoup.select.Elements elements4 = document1.getElementsByIndexEquals(10);
        org.jsoup.nodes.Document document6 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str7 = document6.tagName();
        org.jsoup.parser.Tag tag8 = document6.tag();
        org.jsoup.nodes.TextNode textNode11 = new org.jsoup.nodes.TextNode("hi!", "");
        org.jsoup.nodes.Node node12 = textNode11.parent();
        org.jsoup.nodes.Element element13 = document6.appendChild((org.jsoup.nodes.Node) textNode11);
        org.jsoup.select.Elements elements15 = element13.getElementsByClass("#root");
        org.jsoup.nodes.Element element16 = document1.prependChild((org.jsoup.nodes.Node) element13);
        org.jsoup.select.Elements elements19 = element13.getElementsByAttributeValueNot("#text", "#document");
        org.jsoup.nodes.Element element21 = element13.appendElement("<?<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!>");
        org.jsoup.select.Elements elements22 = element21.siblingElements();
        org.jsoup.nodes.Document document25 = org.jsoup.parser.Parser.parseBodyFragment("#root", "#root");
        java.lang.String str27 = document25.absUrl("#root=\"\"");
        document25.title("#document");
        document25.setBaseUri("<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!");
        org.jsoup.nodes.Element element32 = element21.appendChild((org.jsoup.nodes.Node) document25);
        org.jsoup.nodes.Element element34 = document25.wrap("<html>\n<head>\n</head>\n<body> #root\n</body>\n</html>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node36 = element34.childNode((int) '!');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 33, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#root" + "'", str7, "#root");
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(elements22);
        org.junit.Assert.assertNotNull(document25);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(element32);
        org.junit.Assert.assertNotNull(element34);
    }

    @Test
    public void test777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test777");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("", "\n<!--#root=\"\"-->");
        org.jsoup.select.Elements elements5 = document2.getElementsByAttributeValueContaining("\n<!--#root=\"\"-->", "#root=\"hi!\"");
        org.jsoup.nodes.Document document8 = new org.jsoup.nodes.Document("#root");
        boolean boolean9 = document8.hasText();
        org.jsoup.select.Elements elements11 = document8.getElementsByIndexEquals(10);
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor12 = elements11.listIterator();
        org.jsoup.select.Elements elements15 = elements11.attr("<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "hi!");
        org.jsoup.select.Elements elements16 = org.jsoup.select.Selector.select("#root", (java.lang.Iterable<org.jsoup.nodes.Element>) elements11);
        org.jsoup.select.Elements elements17 = new org.jsoup.select.Elements((java.util.Collection<org.jsoup.nodes.Element>) elements11);
        boolean boolean18 = elements5.containsAll((java.util.Collection<org.jsoup.nodes.Element>) elements11);
        org.jsoup.nodes.Element element19 = elements11.first();
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor20 = elements11.listIterator();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(elementItor12);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(element19);
        org.junit.Assert.assertNotNull(elementItor20);
    }

    @Test
    public void test778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test778");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("#root", "#root");
        java.lang.String str3 = document2.nodeName();
        java.lang.String str4 = document2.data();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test779");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element3 = document1.prependElement("hi!");
        org.jsoup.nodes.Element element5 = element3.append("");
        org.jsoup.nodes.Element element6 = element5.previousElementSibling();
        java.lang.String str7 = element5.nodeName();
        org.jsoup.select.Elements elements10 = element5.getElementsByAttributeValueStarting("<!<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!>", "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>");
        org.jsoup.nodes.Document document12 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str13 = document12.tagName();
        org.jsoup.parser.Tag tag14 = document12.tag();
        org.jsoup.nodes.Element element16 = new org.jsoup.nodes.Element(tag14, "#root=\"\"");
        java.lang.String str17 = element16.toString();
        org.jsoup.nodes.Element element19 = element16.text("");
        org.jsoup.nodes.Element element21 = element16.removeClass("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.select.Elements elements23 = element16.getElementsByIndexGreaterThan(0);
        boolean boolean24 = elements10.addAll((java.util.Collection<org.jsoup.nodes.Element>) elements23);
        org.jsoup.nodes.Document document26 = org.jsoup.Jsoup.parseBodyFragment("org.jsoup.select.Selector$SelectorParseException: hi!<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Document document28 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str29 = document28.tagName();
        org.jsoup.nodes.Element element31 = document28.append("hi!");
        org.jsoup.nodes.Document document33 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str34 = document33.tagName();
        org.jsoup.nodes.Element element36 = document33.append("hi!");
        java.lang.String str37 = document33.outerHtml();
        org.jsoup.select.Elements elements38 = document33.children();
        java.lang.String str40 = document33.absUrl("<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>");
        org.jsoup.select.Elements elements43 = document33.getElementsByAttributeValueContaining("<#root>\n</#root>", "#document");
        org.jsoup.nodes.Document document46 = org.jsoup.Jsoup.parseBodyFragment("#root=\"\"", "<#root>\n</#root>");
        java.lang.String str47 = document46.toString();
        org.jsoup.nodes.Document[] documentArray48 = new org.jsoup.nodes.Document[] { document26, document28, document33, document46 };
        org.jsoup.nodes.Document[] documentArray49 = elements23.toArray(documentArray48);
        org.jsoup.select.Elements elements50 = new org.jsoup.select.Elements((org.jsoup.nodes.Element[]) documentArray48);
        org.jsoup.select.Elements elements51 = new org.jsoup.select.Elements((org.jsoup.nodes.Element[]) documentArray48);
        org.jsoup.select.Elements elements52 = new org.jsoup.select.Elements((org.jsoup.nodes.Element[]) documentArray48);
        org.jsoup.select.Elements elements53 = new org.jsoup.select.Elements((org.jsoup.nodes.Element[]) documentArray48);
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNull(element6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "#root" + "'", str13, "#root");
        org.junit.Assert.assertNotNull(tag14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "<#root>\n</#root>" + "'", str17, "<#root>\n</#root>");
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(elements23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(document26);
        org.junit.Assert.assertNotNull(document28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "#root" + "'", str29, "#root");
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertNotNull(document33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "#root" + "'", str34, "#root");
        org.junit.Assert.assertNotNull(element36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!" + "'", str37, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!");
        org.junit.Assert.assertNotNull(elements38);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNotNull(elements43);
        org.junit.Assert.assertNotNull(document46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>" + "'", str47, "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>");
        org.junit.Assert.assertNotNull(documentArray48);
        org.junit.Assert.assertNotNull(documentArray49);
    }

    @Test
    public void test780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test780");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("<html>\n<head>\n</head>\n<body>\n org.jsoup.select.Selector$SelectorParseException: hi!&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;\n</body>\n</html>", "&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;hi!org.jsoup.select.Selector$SelectorParseException: hi!<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element3 = document2.head();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element5 = element3.getElementById("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element3);
    }

    @Test
    public void test781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test781");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("#root");
        boolean boolean2 = document1.hasText();
        org.jsoup.select.Elements elements4 = document1.getElementsByIndexEquals(10);
        org.jsoup.nodes.Document document6 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str7 = document6.tagName();
        org.jsoup.parser.Tag tag8 = document6.tag();
        org.jsoup.nodes.TextNode textNode11 = new org.jsoup.nodes.TextNode("hi!", "");
        org.jsoup.nodes.Node node12 = textNode11.parent();
        org.jsoup.nodes.Element element13 = document6.appendChild((org.jsoup.nodes.Node) textNode11);
        org.jsoup.select.Elements elements15 = element13.getElementsByClass("#root");
        org.jsoup.nodes.Element element16 = document1.prependChild((org.jsoup.nodes.Node) element13);
        org.jsoup.select.Elements elements19 = element13.getElementsByAttributeValueNot("#text", "#document");
        org.jsoup.nodes.Element element21 = element13.appendElement("<?<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!>");
        org.jsoup.select.Elements elements22 = element21.siblingElements();
        org.jsoup.nodes.Document document25 = org.jsoup.parser.Parser.parseBodyFragment("#root", "#root");
        java.lang.String str27 = document25.absUrl("#root=\"\"");
        document25.title("#document");
        document25.setBaseUri("<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!");
        org.jsoup.nodes.Element element32 = element21.appendChild((org.jsoup.nodes.Node) document25);
        java.util.List<org.jsoup.nodes.Node> nodeList33 = element21.siblingNodes();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#root" + "'", str7, "#root");
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(elements22);
        org.junit.Assert.assertNotNull(document25);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(element32);
        org.junit.Assert.assertNotNull(nodeList33);
    }

    @Test
    public void test782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test782");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str2 = document1.tagName();
        org.jsoup.nodes.Element element4 = document1.append("hi!");
        java.lang.String str6 = document1.absUrl("hi!");
        org.jsoup.select.Elements elements7 = document1.getAllElements();
        org.jsoup.select.Elements elements10 = document1.getElementsByAttributeValueEnding("org.jsoup.select.Selector$SelectorParseException: <html>\n<head>\n</head>\n<body>\n org.jsoup.select.Selector$SelectorParseException: hi!\n <html> \n  <head> \n  </head> \n  <body>  \n  </body>\n </html>\n</body>\n</html>", "aorg");
        java.lang.String str11 = document1.nodeName();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#root" + "'", str2, "#root");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#document" + "'", str11, "#document");
    }

    @Test
    public void test783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test783");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("#data", "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!");
        org.jsoup.nodes.Element element3 = document2.body();
        org.jsoup.select.Elements elements6 = document2.getElementsByAttributeValueContaining("org", "#root");
        java.lang.String str7 = document2.nodeName();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#document" + "'", str7, "#document");
    }

    @Test
    public void test784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test784");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("#root", "#root");
        org.jsoup.nodes.Element element4 = document2.appendElement("#data");
        org.jsoup.nodes.Node node5 = element4.parent();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(node5);
    }

    @Test
    public void test785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test785");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str2 = document1.tagName();
        org.jsoup.parser.Tag tag3 = document1.tag();
        org.jsoup.nodes.Element element5 = new org.jsoup.nodes.Element(tag3, "#root=\"\"");
        org.jsoup.select.Elements elements7 = element5.getElementsByClass("<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>");
        org.jsoup.select.Elements elements10 = element5.getElementsByAttributeValueStarting("#root", "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!");
        java.lang.String str11 = element5.baseUri();
        org.jsoup.nodes.Element element13 = element5.wrap("#root=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;\"");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = element13.attr("org.jsoup.select.Selector$SelectorParseException: hi!<html> <head> </head> <body> </body> </html>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#root" + "'", str2, "#root");
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#root=\"\"" + "'", str11, "#root=\"\"");
        org.junit.Assert.assertNull(element13);
    }

    @Test
    public void test786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test786");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str2 = document1.tagName();
        org.jsoup.nodes.Element element4 = document1.append("hi!");
        org.jsoup.nodes.Element element6 = document1.html("org.jsoup.select.Selector$SelectorParseException: hi!");
        org.jsoup.nodes.Element element8 = document1.prependText("<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>");
        org.jsoup.nodes.Element element10 = document1.createElement("aorg");
        org.jsoup.select.Elements elements12 = document1.getElementsByAttribute("#root");
        int int13 = elements12.size();
        org.jsoup.nodes.Document document15 = new org.jsoup.nodes.Document("#root");
        boolean boolean16 = document15.hasText();
        org.jsoup.select.Elements elements18 = document15.getElementsByIndexEquals(10);
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor19 = elements18.listIterator();
        org.jsoup.select.Elements elements22 = elements18.attr("<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "hi!");
        boolean boolean23 = elements12.containsAll((java.util.Collection<org.jsoup.nodes.Element>) elements22);
        org.jsoup.nodes.Document document25 = new org.jsoup.nodes.Document("#root");
        boolean boolean26 = document25.hasText();
        org.jsoup.select.Elements elements28 = document25.getElementsByIndexEquals(10);
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor29 = elements28.listIterator();
        org.jsoup.select.Elements elements32 = elements28.attr("<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "hi!");
        boolean boolean33 = elements22.addAll((java.util.Collection<org.jsoup.nodes.Element>) elements32);
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#root" + "'", str2, "#root");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertNotNull(elementItor19);
        org.junit.Assert.assertNotNull(elements22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(elements28);
        org.junit.Assert.assertNotNull(elementItor29);
        org.junit.Assert.assertNotNull(elements32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test787");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("<?#root=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;\">", "[]");
        org.jsoup.nodes.Element element4 = document2.getElementById("\n<#root class=\"\">\n</#root>");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNull(element4);
    }

    @Test
    public void test788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test788");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>");
        java.lang.String str2 = document1.toString();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "<html>\n<head>\n</head>\n<body>\n <html> \n  <head> \n  </head> \n  <body>\n    #root=&quot;&quot;  \n  </body>\n </html>\n</body>\n</html>" + "'", str2, "<html>\n<head>\n</head>\n<body>\n <html> \n  <head> \n  </head> \n  <body>\n    #root=&quot;&quot;  \n  </body>\n </html>\n</body>\n</html>");
    }

    @Test
    public void test789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test789");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("#root", "#root");
        org.jsoup.nodes.Element element4 = document2.appendElement("#data");
        org.jsoup.nodes.Element element6 = element4.prepend("<html>\n<head>\n</head>\n<body> #root=&quot;&quot;\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
    }

    @Test
    public void test790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test790");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str2 = document1.id();
        org.jsoup.nodes.Element element4 = document1.getElementById("#comment");
        org.jsoup.nodes.Element element5 = document1.head();
        org.jsoup.nodes.Element element7 = element5.prependElement("\n<hi!>\n</hi!>");
        org.jsoup.nodes.Element element9 = element5.append("");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(element4);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
    }

    @Test
    public void test791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test791");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element5 = document3.prependElement("hi!");
        org.jsoup.nodes.Element element7 = element5.append("");
        org.jsoup.select.Elements elements8 = org.jsoup.select.Selector.select("#root", element7);
        org.jsoup.nodes.Element element10 = element7.prepend("&lt;?#root=&quot;&amp;lt;html&amp;gt; &amp;lt;head&amp;gt; &amp;lt;/head&amp;gt; &amp;lt;body&amp;gt; &amp;lt;/body&amp;gt; &amp;lt;/html&amp;gt;&quot;&gt;");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements11 = org.jsoup.select.Selector.select("ohi!", element10);
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query ohi!");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(element10);
    }

    @Test
    public void test792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test792");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parse("hi!");
        org.jsoup.nodes.Element element2 = document1.head();
        org.jsoup.nodes.Document document3 = document1.normalise();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements5 = document3.select("<html>\n<head>\n</head>\n<body>\n  &lt;hi!&gt; &lt;/hi!&gt;\n</body>\n</html>");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query <html>?<head>?</head>?<body>?  &lt;hi!&gt; &lt;/hi!&gt;?</body>?</html>");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(document3);
    }

    @Test
    public void test793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test793");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str2 = document1.id();
        org.jsoup.select.Elements elements3 = document1.children();
        org.jsoup.select.Elements elements5 = elements3.html("#root=\"\"");
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor6 = elements3.listIterator();
        java.lang.String str7 = elements3.text();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elementItor6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#root=\"\"" + "'", str7, "#root=\"\"");
    }

    @Test
    public void test794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test794");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str2 = document1.tagName();
        org.jsoup.nodes.Element element4 = document1.append("hi!");
        java.lang.String str5 = document1.outerHtml();
        org.jsoup.select.Elements elements6 = document1.children();
        java.lang.String str8 = document1.absUrl("<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>");
        org.jsoup.select.Elements elements11 = document1.getElementsByAttributeValueContaining("<#root>\n</#root>", "#document");
        org.jsoup.nodes.Document document13 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str14 = document13.tagName();
        org.jsoup.nodes.Element element16 = document13.append("hi!");
        java.lang.String str17 = document13.outerHtml();
        org.jsoup.select.Elements elements18 = document13.children();
        java.lang.String str20 = document13.absUrl("<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>");
        boolean boolean21 = elements11.add((org.jsoup.nodes.Element) document13);
        org.jsoup.select.Elements elements23 = elements11.removeClass("\n<!--#root=\"\"-->");
        org.jsoup.nodes.Document document26 = org.jsoup.parser.Parser.parseBodyFragment("#data", "#root");
        org.jsoup.parser.Tag tag27 = document26.tag();
        int int28 = elements23.indexOf((java.lang.Object) tag27);
        java.lang.Object[] objArray29 = elements23.toArray();
        boolean boolean30 = elements23.isEmpty();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#root" + "'", str2, "#root");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!" + "'", str5, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#root" + "'", str14, "#root");
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!" + "'", str17, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!");
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(elements23);
        org.junit.Assert.assertNotNull(document26);
        org.junit.Assert.assertNotNull(tag27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!]");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test795");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str2 = document1.tagName();
        org.jsoup.parser.Tag tag3 = document1.tag();
        boolean boolean4 = tag3.isEmpty();
        boolean boolean5 = tag3.isBlock();
        org.jsoup.parser.Tag tag6 = tag3.getImplicitParent();
        boolean boolean7 = tag3.isEmpty();
        org.jsoup.parser.Tag tag8 = tag3.getImplicitParent();
        org.jsoup.nodes.Document document11 = org.jsoup.Jsoup.parseBodyFragment(" text=\"hi!\"", "<#root>\n<html>\n <head>\n </head>\n <body>\n  #root=&quot;&quot;\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!");
        boolean boolean12 = tag3.equals((java.lang.Object) "<#root>\n<html>\n <head>\n </head>\n <body>\n  #root=&quot;&quot;\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#root" + "'", str2, "#root");
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test796");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str2 = document1.tagName();
        org.jsoup.parser.Tag tag3 = document1.tag();
        org.jsoup.nodes.Document document5 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str6 = document5.tagName();
        org.jsoup.parser.Tag tag7 = document5.tag();
        boolean boolean8 = tag7.isEmpty();
        org.jsoup.nodes.Document document10 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str11 = document10.tagName();
        org.jsoup.parser.Tag tag12 = document10.tag();
        org.jsoup.nodes.Element element14 = new org.jsoup.nodes.Element(tag12, "#root=\"\"");
        org.jsoup.nodes.Document document16 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str17 = document16.tagName();
        org.jsoup.parser.Tag tag18 = document16.tag();
        boolean boolean19 = tag12.canContain(tag18);
        boolean boolean20 = tag7.isValidParent(tag12);
        org.jsoup.nodes.Document document22 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str23 = document22.tagName();
        org.jsoup.parser.Tag tag24 = document22.tag();
        boolean boolean25 = tag24.isEmpty();
        boolean boolean26 = tag12.canContain(tag24);
        boolean boolean27 = tag3.canContain(tag24);
        org.jsoup.parser.Tag tag28 = tag3.getImplicitParent();
        boolean boolean29 = tag3.canContainBlock();
        org.jsoup.nodes.Document document33 = org.jsoup.Jsoup.parseBodyFragment("#root=\"\"", "<#root>\n</#root>");
        org.jsoup.nodes.Element element35 = document33.prepend("");
        org.jsoup.nodes.Attributes attributes36 = element35.attributes();
        java.util.List<org.jsoup.nodes.Attribute> attributeList37 = attributes36.asList();
        org.jsoup.nodes.Element element38 = new org.jsoup.nodes.Element(tag3, "\n<hi!>\n</hi!>", attributes36);
        java.lang.String str39 = element38.nodeName();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#root" + "'", str2, "#root");
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertNotNull(document5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#root" + "'", str6, "#root");
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#root" + "'", str11, "#root");
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertNotNull(document16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "#root" + "'", str17, "#root");
        org.junit.Assert.assertNotNull(tag18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(document22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "#root" + "'", str23, "#root");
        org.junit.Assert.assertNotNull(tag24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(tag28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(document33);
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertNotNull(attributes36);
        org.junit.Assert.assertNotNull(attributeList37);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "#root" + "'", str39, "#root");
    }

    @Test
    public void test797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test797");
        org.jsoup.nodes.Document document2 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str3 = document2.tagName();
        org.jsoup.select.Elements elements5 = document2.getElementsByIndexGreaterThan((-1));
        boolean boolean6 = elements5.isEmpty();
        org.jsoup.nodes.Document document8 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.select.Elements elements10 = document8.getElementsByTag("#root");
        java.lang.String str11 = elements10.text();
        org.jsoup.nodes.Document document13 = new org.jsoup.nodes.Document("#root");
        boolean boolean14 = document13.hasText();
        org.jsoup.select.Elements elements16 = document13.getElementsByIndexEquals(10);
        java.lang.Object[] objArray17 = elements16.toArray();
        boolean boolean18 = elements10.retainAll((java.util.Collection<org.jsoup.nodes.Element>) elements16);
        java.lang.String str19 = elements16.text();
        org.jsoup.nodes.Document document21 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str22 = document21.tagName();
        org.jsoup.select.Elements elements24 = document21.getElementsByIndexGreaterThan((-1));
        java.lang.String str25 = document21.toString();
        org.jsoup.nodes.Element element27 = document21.text("#root=\"hi!\"");
        int int28 = elements16.lastIndexOf((java.lang.Object) "#root=\"hi!\"");
        org.jsoup.select.Elements elements30 = elements16.select("#root");
        org.jsoup.select.Elements elements32 = elements16.removeClass("#root=\"hi!\"");
        boolean boolean33 = elements5.retainAll((java.util.Collection<org.jsoup.nodes.Element>) elements32);
        org.jsoup.select.Elements elements34 = org.jsoup.select.Selector.select(" text=\"hi!\"", (java.lang.Iterable<org.jsoup.nodes.Element>) elements32);
        org.jsoup.select.Elements elements37 = elements34.attr("#document", "org.jsoup.select.Selector$SelectorParseException: <html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.lang.String str39 = elements34.attr("<?<html>\n<head>\n</head>\n<body>\n</body>\n</html>>");
        org.jsoup.nodes.Document document42 = org.jsoup.parser.Parser.parse("", "");
        boolean boolean43 = elements34.contains((java.lang.Object) "");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#root" + "'", str3, "#root");
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(document21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "#root" + "'", str22, "#root");
        org.junit.Assert.assertNotNull(elements24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>" + "'", str25, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(elements30);
        org.junit.Assert.assertNotNull(elements32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(elements34);
        org.junit.Assert.assertNotNull(elements37);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(document42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test798");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("#root");
        boolean boolean2 = document1.hasText();
        org.jsoup.select.Elements elements4 = document1.getElementsByIndexEquals(10);
        org.jsoup.select.Elements elements7 = document1.getElementsByAttributeValueEnding("<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!", "hi!");
        org.jsoup.nodes.Element element9 = document1.val("<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>");
        org.jsoup.select.Elements elements12 = element9.getElementsByAttributeValueStarting("&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;hi!", "#root=\"hi!\"");
        org.jsoup.nodes.Document document14 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str15 = document14.tagName();
        java.lang.String str16 = document14.html();
        org.jsoup.nodes.Element element18 = document14.append("#root=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;\"");
        java.util.Set<java.lang.String> strSet19 = element18.classNames();
        org.jsoup.nodes.Element element20 = element9.classNames(strSet19);
        org.jsoup.select.Elements elements22 = element20.getElementsByTag("&lt;?#root=&quot;&amp;lt;html&amp;gt; &amp;lt;head&amp;gt; &amp;lt;/head&amp;gt; &amp;lt;body&amp;gt; &amp;lt;/body&amp;gt; &amp;lt;/html&amp;gt;&quot;&gt;");
        org.jsoup.select.Elements elements24 = elements22.append("[., j, s, o, u, p, ., s, e, l, e, c, t, ., S, e, l, e, c, t, o, r, $, S, e, l, e, c, t, o, r, P, a, r, s, e, E, x, c, e, p, t, i, o, n, :,  , h, i, !, &lt;, h, t, m, l, &gt;, \n, &lt;, h, e, a, d, &gt;, \n, &lt;, /, h, e, a, d, &gt;, \n, &lt;, b, o, d, y, &gt;, \n, &lt;, /, b, o, d, y, &gt;, \n, &lt;, /, h, t, m, l, &gt;]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(document14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "#root" + "'", str15, "#root");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>" + "'", str16, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(strSet19);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(elements22);
        org.junit.Assert.assertNotNull(elements24);
    }

    @Test
    public void test799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test799");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("#root=\"\"", "#root");
        org.jsoup.select.Elements elements5 = document2.getElementsByAttributeValueContaining("<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!", "<html>\n<head>\n</head>\n<body>\n <html> \n  <head> \n  </head> \n  <body>\n    #root=&quot;&quot;  \n  </body>\n </html>\n</body>\n</html>");
        java.util.Collection<org.jsoup.nodes.Element> elementCollection6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = elements5.containsAll(elementCollection6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(elements5);
    }

    @Test
    public void test800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test800");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str2 = document1.tagName();
        org.jsoup.parser.Tag tag3 = document1.tag();
        boolean boolean4 = tag3.isEmpty();
        org.jsoup.nodes.Document document6 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str7 = document6.tagName();
        org.jsoup.parser.Tag tag8 = document6.tag();
        org.jsoup.nodes.Element element10 = new org.jsoup.nodes.Element(tag8, "#root=\"\"");
        org.jsoup.nodes.Document document12 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str13 = document12.tagName();
        org.jsoup.parser.Tag tag14 = document12.tag();
        boolean boolean15 = tag8.canContain(tag14);
        boolean boolean16 = tag3.isValidParent(tag8);
        org.jsoup.nodes.Document document18 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element20 = document18.prependElement("hi!");
        org.jsoup.nodes.Element element21 = element20.parent();
        boolean boolean22 = tag8.equals((java.lang.Object) element21);
        org.jsoup.nodes.Attributes attributes24 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor25 = attributes24.iterator();
        java.lang.String str26 = attributes24.toString();
        org.jsoup.nodes.Element element27 = new org.jsoup.nodes.Element(tag8, "", attributes24);
        java.util.Set<java.lang.String> strSet28 = element27.classNames();
        org.jsoup.nodes.Document document30 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element32 = document30.prependElement("hi!");
        org.jsoup.nodes.Element element34 = element32.append("");
        org.jsoup.nodes.Document document36 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str37 = document36.tagName();
        org.jsoup.nodes.Element element39 = document36.append("hi!");
        org.jsoup.nodes.Document document41 = new org.jsoup.nodes.Document("#root");
        org.jsoup.nodes.Document document43 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.select.Elements elements45 = document43.getElementsByTag("#root");
        org.jsoup.nodes.Element[] elementArray46 = new org.jsoup.nodes.Element[] { element32, element39, document41, document43 };
        org.jsoup.select.Elements elements47 = new org.jsoup.select.Elements(elementArray46);
        java.util.stream.Stream<org.jsoup.nodes.Element> elementStream48 = elements47.parallelStream();
        java.lang.Object obj49 = null;
        boolean boolean50 = elements47.contains(obj49);
        boolean boolean51 = element27.equals((java.lang.Object) elements47);
        org.jsoup.nodes.Element element53 = element27.prepend("<?#root=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;\">");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int54 = element53.siblingIndex();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#root" + "'", str2, "#root");
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#root" + "'", str7, "#root");
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "#root" + "'", str13, "#root");
        org.junit.Assert.assertNotNull(tag14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(document18);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(attributeItor25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(strSet28);
        org.junit.Assert.assertNotNull(document30);
        org.junit.Assert.assertNotNull(element32);
        org.junit.Assert.assertNotNull(element34);
        org.junit.Assert.assertNotNull(document36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "#root" + "'", str37, "#root");
        org.junit.Assert.assertNotNull(element39);
        org.junit.Assert.assertNotNull(document43);
        org.junit.Assert.assertNotNull(elements45);
        org.junit.Assert.assertNotNull(elementArray46);
        org.junit.Assert.assertNotNull(elementStream48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(element53);
    }

    @Test
    public void test801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test801");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str2 = document1.tagName();
        java.lang.String str3 = document1.html();
        org.jsoup.nodes.Element element5 = document1.append("hi!");
        boolean boolean7 = document1.hasAttr("#declaration");
        org.jsoup.nodes.Document document10 = org.jsoup.Jsoup.parseBodyFragment("#root=\"\"", "<#root>\n</#root>");
        java.lang.String str11 = document10.toString();
        java.lang.String str12 = document10.nodeName();
        java.lang.String str13 = document10.outerHtml();
        org.jsoup.nodes.Element element14 = document10.body();
        org.jsoup.nodes.Document document15 = document10.normalise();
        org.jsoup.nodes.Element element16 = document1.prependChild((org.jsoup.nodes.Node) document15);
        org.jsoup.select.Elements elements18 = document1.getElementsByIndexEquals((int) 'o');
        org.jsoup.nodes.Document document20 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str21 = document20.tagName();
        org.jsoup.nodes.Element element23 = document20.append("hi!");
        org.jsoup.select.Elements elements25 = document20.getElementsByIndexGreaterThan((int) (short) 10);
        boolean boolean26 = elements18.retainAll((java.util.Collection<org.jsoup.nodes.Element>) elements25);
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#root" + "'", str2, "#root");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>" + "'", str3, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>" + "'", str11, "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "#document" + "'", str12, "#document");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>" + "'", str13, "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>");
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(document15);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertNotNull(document20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "#root" + "'", str21, "#root");
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(elements25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test802");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("#root");
        boolean boolean2 = document1.hasText();
        org.jsoup.select.Elements elements4 = document1.getElementsByIndexEquals(10);
        java.util.Spliterator<org.jsoup.nodes.Element> elementSpliterator5 = elements4.spliterator();
        org.jsoup.nodes.Document document7 = new org.jsoup.nodes.Document("#root");
        boolean boolean8 = elements4.add((org.jsoup.nodes.Element) document7);
        boolean boolean9 = elements4.isEmpty();
        org.jsoup.nodes.Document document11 = new org.jsoup.nodes.Document("#root");
        boolean boolean12 = document11.hasText();
        org.jsoup.select.Elements elements14 = document11.getElementsByIndexEquals(10);
        java.lang.Object[] objArray15 = elements14.toArray();
        org.jsoup.nodes.Document document18 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element20 = document18.prependElement("hi!");
        org.jsoup.nodes.Element element21 = element20.parent();
        org.jsoup.nodes.Element element22 = element20.empty();
        elements14.add(0, element22);
        int int24 = elements14.size();
        boolean boolean25 = elements4.containsAll((java.util.Collection<org.jsoup.nodes.Element>) elements14);
        elements4.clear();
        org.jsoup.nodes.Document document28 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str29 = document28.tagName();
        org.jsoup.nodes.Element element31 = document28.append("hi!");
        java.lang.String str32 = document28.outerHtml();
        org.jsoup.select.Elements elements33 = document28.children();
        org.jsoup.nodes.Document document35 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.select.Elements elements37 = document35.getElementsByTag("#root");
        boolean boolean38 = document28.equals((java.lang.Object) document35);
        org.jsoup.nodes.Element element40 = document35.appendText("#root");
        org.jsoup.nodes.Element element42 = document35.prepend("org.jsoup.select.Selector$SelectorParseException: hi!");
        org.jsoup.nodes.Document document44 = new org.jsoup.nodes.Document("#root");
        boolean boolean45 = document44.hasText();
        org.jsoup.select.Elements elements47 = document44.getElementsByIndexEquals(10);
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor48 = elements47.listIterator();
        org.jsoup.select.Elements elements51 = elements47.attr("<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "hi!");
        org.jsoup.nodes.Document document53 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element55 = document53.prependElement("hi!");
        org.jsoup.nodes.Element element56 = element55.parent();
        int int57 = elements47.indexOf((java.lang.Object) element56);
        org.jsoup.select.Elements elements59 = elements47.toggleClass("#document");
        boolean boolean60 = elements59.isEmpty();
        org.jsoup.select.Elements elements63 = elements59.attr("hi!", "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!");
        boolean boolean64 = document35.equals((java.lang.Object) elements63);
        boolean boolean65 = elements4.retainAll((java.util.Collection<org.jsoup.nodes.Element>) elements63);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(elementSpliterator5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[]");
        org.junit.Assert.assertNotNull(document18);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(document28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "#root" + "'", str29, "#root");
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!" + "'", str32, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!");
        org.junit.Assert.assertNotNull(elements33);
        org.junit.Assert.assertNotNull(document35);
        org.junit.Assert.assertNotNull(elements37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(element40);
        org.junit.Assert.assertNotNull(element42);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(elements47);
        org.junit.Assert.assertNotNull(elementItor48);
        org.junit.Assert.assertNotNull(elements51);
        org.junit.Assert.assertNotNull(document53);
        org.junit.Assert.assertNotNull(element55);
        org.junit.Assert.assertNotNull(element56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertNotNull(elements59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(elements63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
    }

    @Test
    public void test803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test803");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("#root");
        boolean boolean2 = document1.hasText();
        org.jsoup.select.Elements elements4 = document1.getElementsByIndexEquals(10);
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor5 = elements4.listIterator();
        org.jsoup.select.Elements elements6 = new org.jsoup.select.Elements((java.util.List<org.jsoup.nodes.Element>) elements4);
        java.lang.String str7 = elements4.outerHtml();
        org.jsoup.nodes.Document document10 = org.jsoup.parser.Parser.parse("[o, h, i, !]", "#root=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;\"");
        org.jsoup.nodes.Element element11 = document10.body();
        boolean boolean12 = elements4.equals((java.lang.Object) document10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(elementItor5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test804");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("", "aorg");
        org.jsoup.nodes.Element element4 = document2.append(" declaration=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;hi!\"");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
    }

    @Test
    public void test805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test805");
        org.jsoup.safety.Whitelist whitelist1 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.jsoup.Jsoup.isValid("<html>\n  <head>\n  </head>\n  <body>\n  </body>\n </html>hi!<#root>\n  <html>\n   <head>\n   </head>\n   <body>\n   </body>\n  </html>hi!\n </#root>\n<head>\n  </head>\n  <body>\n  </body>\n\n\n<html>\n   <head>\n   </head>\n   <body>\n   </body>\n  </html>hi!\n<head>\n   </head>\n   <body>\n   </body>\n\n", whitelist1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test806");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element3 = document1.prependElement("hi!");
        org.jsoup.nodes.Element element5 = element3.append("");
        org.jsoup.nodes.Element element7 = element3.prepend("<#root>\n</#root>");
        org.jsoup.select.Elements elements10 = element3.getElementsByAttributeValueStarting("#root=&quot;&quot;", "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>");
        org.jsoup.select.Elements elements12 = elements10.eq((int) '4');
        org.jsoup.nodes.Document document14 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str15 = document14.tagName();
        org.jsoup.nodes.Element element17 = document14.append("hi!");
        java.lang.String str18 = document14.outerHtml();
        org.jsoup.select.Elements elements19 = document14.children();
        java.lang.String str21 = document14.absUrl("<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>");
        org.jsoup.select.Elements elements24 = document14.getElementsByAttributeValueContaining("<#root>\n</#root>", "#document");
        org.jsoup.nodes.Document document26 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str27 = document26.tagName();
        org.jsoup.nodes.Element element29 = document26.append("hi!");
        java.lang.String str30 = document26.outerHtml();
        org.jsoup.select.Elements elements31 = document26.children();
        java.lang.String str33 = document26.absUrl("<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>");
        boolean boolean34 = elements24.add((org.jsoup.nodes.Element) document26);
        int int35 = elements10.indexOf((java.lang.Object) boolean34);
        org.jsoup.parser.TokenQueue tokenQueue37 = new org.jsoup.parser.TokenQueue("hi!");
        java.lang.String str38 = tokenQueue37.consumeCssIdentifier();
        java.lang.String str39 = tokenQueue37.consumeWord();
        java.lang.String str40 = tokenQueue37.consumeWord();
        boolean boolean41 = elements10.remove((java.lang.Object) tokenQueue37);
        org.jsoup.nodes.Document document43 = new org.jsoup.nodes.Document("#root");
        boolean boolean44 = document43.hasText();
        org.jsoup.select.Elements elements46 = document43.getElementsByIndexEquals(10);
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor47 = elements46.listIterator();
        org.jsoup.select.Elements elements50 = elements46.attr("<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "hi!");
        org.jsoup.nodes.Document document52 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element54 = document52.prependElement("hi!");
        org.jsoup.nodes.Element element55 = element54.parent();
        int int56 = elements46.indexOf((java.lang.Object) element55);
        org.jsoup.select.Elements elements58 = elements46.toggleClass("#document");
        boolean boolean59 = elements58.isEmpty();
        org.jsoup.select.Elements elements62 = elements58.attr("hi!", "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!");
        org.jsoup.nodes.Document document64 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str65 = document64.tagName();
        org.jsoup.parser.Tag tag66 = document64.tag();
        org.jsoup.nodes.Element element67 = document64.body();
        java.lang.String str68 = document64.text();
        org.jsoup.select.Elements elements69 = document64.children();
        boolean boolean70 = elements58.add((org.jsoup.nodes.Element) document64);
        org.jsoup.select.Elements elements71 = new org.jsoup.select.Elements((java.util.List<org.jsoup.nodes.Element>) elements58);
        int int72 = elements10.indexOf((java.lang.Object) elements58);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element74 = elements10.get((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(document14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "#root" + "'", str15, "#root");
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!" + "'", str18, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!");
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(elements24);
        org.junit.Assert.assertNotNull(document26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "#root" + "'", str27, "#root");
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!" + "'", str30, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!");
        org.junit.Assert.assertNotNull(elements31);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi" + "'", str38, "hi");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(elements46);
        org.junit.Assert.assertNotNull(elementItor47);
        org.junit.Assert.assertNotNull(elements50);
        org.junit.Assert.assertNotNull(document52);
        org.junit.Assert.assertNotNull(element54);
        org.junit.Assert.assertNotNull(element55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertNotNull(elements58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(elements62);
        org.junit.Assert.assertNotNull(document64);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "#root" + "'", str65, "#root");
        org.junit.Assert.assertNotNull(tag66);
        org.junit.Assert.assertNotNull(element67);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "" + "'", str68, "");
        org.junit.Assert.assertNotNull(elements69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + (-1) + "'", int72 == (-1));
    }

    @Test
    public void test807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test807");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str2 = document1.tagName();
        org.jsoup.nodes.Element element4 = document1.append("hi!");
        java.lang.String str5 = document1.outerHtml();
        org.jsoup.select.Elements elements6 = document1.children();
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("#root");
        boolean boolean10 = document9.hasText();
        org.jsoup.select.Elements elements12 = document9.getElementsByIndexEquals(10);
        org.jsoup.nodes.Document document14 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str15 = document14.tagName();
        org.jsoup.parser.Tag tag16 = document14.tag();
        org.jsoup.nodes.TextNode textNode19 = new org.jsoup.nodes.TextNode("hi!", "");
        org.jsoup.nodes.Node node20 = textNode19.parent();
        org.jsoup.nodes.Element element21 = document14.appendChild((org.jsoup.nodes.Node) textNode19);
        org.jsoup.select.Elements elements23 = element21.getElementsByClass("#root");
        org.jsoup.nodes.Element element24 = document9.prependChild((org.jsoup.nodes.Node) element21);
        org.jsoup.select.Elements elements27 = element21.getElementsByAttributeValueNot("#text", "#document");
        org.jsoup.nodes.Element element29 = element21.appendElement("<?<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!>");
        elements6.add((int) (byte) 1, element21);
        org.jsoup.nodes.Element element32 = element21.append("#comment");
        org.jsoup.nodes.Node node33 = element21.parent();
        java.util.List<org.jsoup.nodes.Node> nodeList34 = element21.siblingNodes();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#root" + "'", str2, "#root");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!" + "'", str5, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(document14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "#root" + "'", str15, "#root");
        org.junit.Assert.assertNotNull(tag16);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(elements23);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(elements27);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertNotNull(element32);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertNotNull(nodeList34);
    }

    @Test
    public void test808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test808");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("", "");
        java.lang.String str3 = document2.nodeName();
        org.jsoup.nodes.Node node6 = document2.attr("&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n #root=&quot;&quot;\n&lt;/body&gt;\n&lt;/html&gt;", "<html>\n<head>\n</head>\n<body> #document\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(node6);
    }

    @Test
    public void test809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test809");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("<aorg>\n</aorg>", "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.lang.String str4 = document2.absUrl("org.jsoup.select.Selector$SelectorParseException: hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>#root");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test810");
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parseBodyFragment("#root=\"\"", "<#root>\n</#root>");
        java.lang.String str3 = document2.nodeName();
        org.jsoup.select.Elements elements5 = document2.getElementsByIndexEquals(10);
        java.lang.String str6 = document2.toString();
        org.jsoup.nodes.Element element8 = document2.append("hi!");
        org.jsoup.nodes.Document document10 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element12 = document10.prependElement("hi!");
        org.jsoup.nodes.Element element13 = element12.parent();
        org.jsoup.nodes.Element element14 = element12.empty();
        org.jsoup.nodes.Element element15 = element14.empty();
        java.util.Set<java.lang.String> strSet16 = element15.classNames();
        org.jsoup.nodes.Element element17 = document2.classNames(strSet16);
        org.jsoup.nodes.Element element19 = document2.prependElement("<?<html>\n<head>\n</head>\n<body>\n</body>\n</html>>");
        java.util.Set<java.lang.String> strSet20 = document2.classNames();
        document2.title("#text");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element24 = document2.createElement("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>" + "'", str6, "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>");
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(strSet20);
    }

    @Test
    public void test811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test811");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str2 = document1.tagName();
        org.jsoup.nodes.Element element4 = document1.append("hi!");
        java.lang.String str6 = document1.absUrl("hi!");
        org.jsoup.select.Elements elements7 = document1.getAllElements();
        java.lang.String str8 = document1.toString();
        java.lang.String str9 = document1.data();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#root" + "'", str2, "#root");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!" + "'", str8, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test812");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>");
        org.jsoup.nodes.Element element2 = document1.body();
        org.jsoup.nodes.Element element4 = element2.text("<html>\n<head>\n</head>\n<body>\n <html> \n  <head> \n  </head> \n  <body>\n    #root=&quot;&quot;  \n  </body>\n </html>\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(element4);
    }

    @Test
    public void test813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test813");
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parseBodyFragment("#root=\"\"", "<#root>\n</#root>");
        java.lang.String str3 = document2.nodeName();
        org.jsoup.select.Elements elements5 = document2.getElementsByIndexEquals(10);
        java.lang.String str6 = document2.toString();
        org.jsoup.nodes.Element element8 = document2.append("hi!");
        org.jsoup.nodes.Document document10 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element12 = document10.prependElement("hi!");
        org.jsoup.nodes.Element element13 = element12.parent();
        org.jsoup.nodes.Element element14 = element12.empty();
        org.jsoup.nodes.Element element15 = element14.empty();
        java.util.Set<java.lang.String> strSet16 = element15.classNames();
        org.jsoup.nodes.Element element17 = document2.classNames(strSet16);
        org.jsoup.nodes.Element element18 = document2.head();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>" + "'", str6, "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>");
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(element18);
    }

    @Test
    public void test814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test814");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str2 = document1.tagName();
        org.jsoup.select.Elements elements4 = document1.getElementsByIndexGreaterThan((-1));
        java.lang.String str5 = document1.toString();
        org.jsoup.nodes.Element element7 = document1.text("#root=\"hi!\"");
        org.jsoup.nodes.Element element9 = document1.prepend("#document");
        java.lang.String str10 = document1.nodeName();
        org.jsoup.nodes.Element element12 = document1.prependText(" #root=\"hi!\"=\"#root\" #comment=\"#root=&quot;&quot;=&quot;&quot;\" #root=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;hi!\" <html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!=\"#root=&quot;hi!&quot;\"");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#root" + "'", str2, "#root");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>" + "'", str5, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#document" + "'", str10, "#document");
        org.junit.Assert.assertNotNull(element12);
    }

    @Test
    public void test815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test815");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("#root");
        boolean boolean2 = document1.hasText();
        org.jsoup.select.Elements elements4 = document1.getElementsByIndexEquals(10);
        org.jsoup.nodes.Document document6 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str7 = document6.tagName();
        org.jsoup.parser.Tag tag8 = document6.tag();
        org.jsoup.nodes.TextNode textNode11 = new org.jsoup.nodes.TextNode("hi!", "");
        org.jsoup.nodes.Node node12 = textNode11.parent();
        org.jsoup.nodes.Element element13 = document6.appendChild((org.jsoup.nodes.Node) textNode11);
        org.jsoup.select.Elements elements15 = element13.getElementsByClass("#root");
        org.jsoup.nodes.Element element16 = document1.prependChild((org.jsoup.nodes.Node) element13);
        org.jsoup.select.Elements elements19 = element13.getElementsByAttributeValueNot("#text", "#document");
        org.jsoup.nodes.Element element21 = element13.appendElement("<?<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!>");
        org.jsoup.select.Elements elements22 = element21.siblingElements();
        org.jsoup.nodes.Document document25 = org.jsoup.parser.Parser.parseBodyFragment("#root", "#root");
        java.lang.String str27 = document25.absUrl("#root=\"\"");
        document25.title("#document");
        document25.setBaseUri("<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!");
        org.jsoup.nodes.Element element32 = element21.appendChild((org.jsoup.nodes.Node) document25);
        org.jsoup.nodes.Element element34 = document25.text("\n<#root class=\"\">\n</#root>");
        org.jsoup.nodes.Element element36 = document25.appendText("<#root>\n<html>\n <head>\n </head>\n <body>\n  #root=&quot;&quot;\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!");
        org.jsoup.nodes.Element element37 = document25.head();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#root" + "'", str7, "#root");
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(elements22);
        org.junit.Assert.assertNotNull(document25);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(element32);
        org.junit.Assert.assertNotNull(element34);
        org.junit.Assert.assertNotNull(element36);
        org.junit.Assert.assertNotNull(element37);
    }

    @Test
    public void test816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test816");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element3 = document1.prependElement("hi!");
        org.jsoup.nodes.Element element5 = element3.append("");
        org.jsoup.nodes.Element element7 = element3.prepend("<#root>\n</#root>");
        org.jsoup.select.Elements elements10 = element3.getElementsByAttributeValueStarting("#root=&quot;&quot;", "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>");
        org.jsoup.nodes.Element element11 = element3.parent();
        java.lang.String str13 = element11.absUrl("<?<html>\n<head>\n</head>\n<body>\n</body>\n</html>>");
        org.jsoup.nodes.Element element15 = element11.removeClass(" #root=\"hi!\"=\"#root\" #comment=\"#root=&quot;&quot;=&quot;&quot;\" #root=\"\"=\"\"");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(element15);
    }

    @Test
    public void test817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test817");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str2 = document1.tagName();
        java.lang.String str3 = document1.html();
        org.jsoup.nodes.Element element5 = document1.append("hi!");
        boolean boolean7 = document1.hasAttr("#declaration");
        org.jsoup.nodes.Document document10 = org.jsoup.Jsoup.parseBodyFragment("#root=\"\"", "<#root>\n</#root>");
        java.lang.String str11 = document10.toString();
        java.lang.String str12 = document10.nodeName();
        java.lang.String str13 = document10.outerHtml();
        org.jsoup.nodes.Element element14 = document10.body();
        org.jsoup.nodes.Document document15 = document10.normalise();
        org.jsoup.nodes.Element element16 = document1.prependChild((org.jsoup.nodes.Node) document15);
        org.jsoup.select.Elements elements18 = document15.getElementsByIndexGreaterThan((int) 'h');
        java.lang.String str19 = document15.val();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#root" + "'", str2, "#root");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>" + "'", str3, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>" + "'", str11, "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "#document" + "'", str12, "#document");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>" + "'", str13, "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>");
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(document15);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test818");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element3 = document1.prependElement("hi!");
        org.jsoup.nodes.Element element4 = element3.parent();
        org.jsoup.select.Elements elements7 = element4.getElementsByAttributeValueEnding("org.jsoup.select.Selector$SelectorParseException: <html>\n<head>\n</head>\n<body>\n</body>\n</html>", "#root=\"\"");
        boolean boolean9 = elements7.hasAttr("ohi");
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor11 = elements7.listIterator(0);
        org.jsoup.nodes.Document document13 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str14 = document13.tagName();
        org.jsoup.parser.Tag tag15 = document13.tag();
        java.lang.String str16 = document13.outerHtml();
        java.lang.String str17 = document13.outerHtml();
        java.lang.String str18 = document13.title();
        org.jsoup.nodes.Element element19 = document13.empty();
        org.jsoup.nodes.Element element21 = element19.append("#root=\"\"=\"\"");
        org.jsoup.nodes.Document document23 = new org.jsoup.nodes.Document("#root");
        boolean boolean24 = document23.hasText();
        org.jsoup.select.Elements elements26 = document23.getElementsByIndexEquals(10);
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor27 = elements26.listIterator();
        boolean boolean28 = elements26.hasText();
        boolean boolean29 = element21.equals((java.lang.Object) elements26);
        boolean boolean30 = elements7.remove((java.lang.Object) elements26);
        java.lang.String str31 = elements26.outerHtml();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(elementItor11);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#root" + "'", str14, "#root");
        org.junit.Assert.assertNotNull(tag15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>" + "'", str16, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>" + "'", str17, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(elements26);
        org.junit.Assert.assertNotNull(elementItor27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
    }

    @Test
    public void test819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test819");
        org.jsoup.nodes.Evaluator evaluator0 = null;
        org.jsoup.nodes.Document document3 = new org.jsoup.nodes.Document("#root");
        boolean boolean4 = document3.hasText();
        org.jsoup.select.Elements elements6 = document3.getElementsByIndexEquals(10);
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor7 = elements6.listIterator();
        org.jsoup.select.Elements elements10 = elements6.attr("<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "hi!");
        org.jsoup.nodes.Document document12 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element14 = document12.prependElement("hi!");
        org.jsoup.nodes.Element element15 = element14.parent();
        int int16 = elements6.indexOf((java.lang.Object) element15);
        org.jsoup.select.Elements elements17 = org.jsoup.select.Selector.select("<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!", (java.lang.Iterable<org.jsoup.nodes.Element>) elements6);
        org.jsoup.nodes.Document document20 = org.jsoup.Jsoup.parseBodyFragment("#root=\"\"", "<#root>\n</#root>");
        java.lang.String str21 = document20.toString();
        java.lang.String str22 = document20.nodeName();
        java.lang.String str23 = document20.outerHtml();
        boolean boolean24 = elements17.add((org.jsoup.nodes.Element) document20);
        java.lang.String str25 = document20.outerHtml();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements26 = org.jsoup.select.Collector.collect(evaluator0, (org.jsoup.nodes.Element) document20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elementItor7);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertNotNull(document20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>" + "'", str21, "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "#document" + "'", str22, "#document");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>" + "'", str23, "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>" + "'", str25, "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>");
    }

    @Test
    public void test820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test820");
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parseBodyFragment("#root=\"\"", "<#root>\n</#root>");
        java.lang.String str3 = document2.toString();
        java.lang.String str4 = document2.nodeName();
        document2.title("<#root>\n</#root>=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;\"");
        org.jsoup.nodes.Element element8 = document2.prepend("<html>\n<head>\n</head>\n<body>\n org.jsoup.select.Selector$SelectorParseException: hi!\n <html> \n  <head> \n  </head> \n  <body>  \n  </body>\n </html>\n</body>\n</html>");
        org.jsoup.nodes.Element element10 = document2.appendText("#root=\"hi!\"");
        org.jsoup.nodes.Element element11 = document2.body();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>" + "'", str3, "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#document" + "'", str4, "#document");
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element11);
    }

    @Test
    public void test821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test821");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("#root");
        boolean boolean2 = document1.hasText();
        org.jsoup.select.Elements elements4 = document1.getElementsByIndexEquals(10);
        org.jsoup.nodes.Document document6 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str7 = document6.tagName();
        org.jsoup.parser.Tag tag8 = document6.tag();
        org.jsoup.nodes.TextNode textNode11 = new org.jsoup.nodes.TextNode("hi!", "");
        org.jsoup.nodes.Node node12 = textNode11.parent();
        org.jsoup.nodes.Element element13 = document6.appendChild((org.jsoup.nodes.Node) textNode11);
        org.jsoup.select.Elements elements15 = element13.getElementsByClass("#root");
        org.jsoup.nodes.Element element16 = document1.prependChild((org.jsoup.nodes.Node) element13);
        org.jsoup.select.Elements elements19 = element13.getElementsByAttributeValueNot("#text", "#document");
        org.jsoup.nodes.Element element21 = element13.appendElement("<?<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!>");
        org.jsoup.select.Elements elements22 = element21.siblingElements();
        org.jsoup.nodes.Document document25 = org.jsoup.parser.Parser.parseBodyFragment("#root", "#root");
        java.lang.String str27 = document25.absUrl("#root=\"\"");
        document25.title("#document");
        document25.setBaseUri("<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!");
        org.jsoup.nodes.Element element32 = element21.appendChild((org.jsoup.nodes.Node) document25);
        org.jsoup.select.Elements elements34 = document25.getElementsByIndexLessThan((int) 'a');
        elements34.clear();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#root" + "'", str7, "#root");
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(elements22);
        org.junit.Assert.assertNotNull(document25);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(element32);
        org.junit.Assert.assertNotNull(elements34);
    }

    @Test
    public void test822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test822");
        org.jsoup.safety.Whitelist whitelist2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.jsoup.Jsoup.clean("org.jsoup.select.Selector$SelectorParseException: hi!<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "org", whitelist2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test823");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str2 = document1.tagName();
        org.jsoup.nodes.Element element4 = document1.append("hi!");
        java.lang.String str5 = document1.outerHtml();
        org.jsoup.select.Elements elements6 = document1.children();
        org.jsoup.nodes.Document document8 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.select.Elements elements10 = document8.getElementsByTag("#root");
        boolean boolean11 = document1.equals((java.lang.Object) document8);
        org.jsoup.nodes.Element element13 = document8.append("#text");
        org.jsoup.nodes.Element element14 = element13.parent();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#root" + "'", str2, "#root");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!" + "'", str5, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNull(element14);
    }

    @Test
    public void test824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test824");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("");
        org.jsoup.nodes.Element element3 = document1.removeClass("ohi!");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
    }

    @Test
    public void test825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test825");
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parse("org.jsoup.select.selector$selectorparseexception: <html>\n<head>\n</head>\n<body>\n org.jsoup.select.selector$selectorparseexception: hi!\n <html> \n  <head> \n  </head> \n  <body>  \n  </body>\n </html>\n</body>\n</html>", "<html>\n<head>\n</head>\n<body>\n org.jsoup.select.Selector$SelectorParseException: hi!&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document2);
    }

    @Test
    public void test826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test826");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!");
        org.jsoup.nodes.Element element3 = document1.text("org.jsoup.select.Selector$SelectorParseException: hi!<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.lang.String str4 = document1.nodeName();
        org.jsoup.select.Elements elements7 = document1.getElementsByAttributeValueNot("<!hi!>", "org.jsoup.select.selector$selectorparseexception: <#root>\n</#root>");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#document" + "'", str4, "#document");
        org.junit.Assert.assertNotNull(elements7);
    }

    @Test
    public void test827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test827");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("", "!");
        java.lang.String str3 = document2.tagName();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#root" + "'", str3, "#root");
    }

    @Test
    public void test828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test828");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str2 = document1.tagName();
        java.lang.String str3 = document1.html();
        org.jsoup.nodes.Element element5 = document1.append("hi!");
        org.jsoup.nodes.Element element6 = element5.parent();
        java.util.Set<java.lang.String> strSet7 = element5.classNames();
        org.jsoup.nodes.Element element9 = element5.prependElement("[., j, s, o, u, p, ., s, e, l, e, c, t, ., S, e, l, e, c, t, o, r, $, S, e, l, e, c, t, o, r, P, a, r, s, e, E, x, c, e, p, t, i, o, n, :,  , h, i, !, <, h, t, m, l, >, \n, <, h, e, a, d, >, \n, <, /, h, e, a, d, >, \n, <, b, o, d, y, >, \n, <, /, b, o, d, y, >, \n, <, /, h, t, m, l, >]");
        org.jsoup.nodes.Element element11 = element9.appendElement("#root=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;\"");
        java.lang.String str12 = element9.val();
        org.jsoup.select.Elements elements15 = element9.getElementsByAttributeValue("<html>\n<head>\n</head>\n<body>\n &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;hi! &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; \n</body>\n</html>", "\n&lt;!--#root=&quot;&quot;--&gt;");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#root" + "'", str2, "#root");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>" + "'", str3, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNull(element6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(elements15);
    }

    @Test
    public void test829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test829");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("#root");
        boolean boolean2 = document1.hasText();
        org.jsoup.select.Elements elements4 = document1.getElementsByIndexEquals(10);
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor5 = elements4.listIterator();
        org.jsoup.select.Elements elements8 = elements4.attr("<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "hi!");
        org.jsoup.nodes.Document document10 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element12 = document10.prependElement("hi!");
        org.jsoup.nodes.Element element13 = element12.parent();
        int int14 = elements4.indexOf((java.lang.Object) element13);
        org.jsoup.select.Elements elements16 = elements4.toggleClass("#document");
        boolean boolean17 = elements16.isEmpty();
        java.util.Iterator<org.jsoup.nodes.Element> elementItor18 = elements16.iterator();
        org.jsoup.nodes.Document document20 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element22 = document20.prependElement("hi!");
        org.jsoup.nodes.Element element24 = element22.append("");
        org.jsoup.nodes.Element element25 = element24.previousElementSibling();
        java.lang.String str26 = element24.nodeName();
        org.jsoup.select.Elements elements29 = element24.getElementsByAttributeValueStarting("<!<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!>", "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>");
        org.jsoup.nodes.Document document31 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str32 = document31.tagName();
        org.jsoup.parser.Tag tag33 = document31.tag();
        org.jsoup.nodes.Element element35 = new org.jsoup.nodes.Element(tag33, "#root=\"\"");
        java.lang.String str36 = element35.toString();
        org.jsoup.nodes.Element element38 = element35.text("");
        org.jsoup.nodes.Element element40 = element35.removeClass("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.select.Elements elements42 = element35.getElementsByIndexGreaterThan(0);
        boolean boolean43 = elements29.addAll((java.util.Collection<org.jsoup.nodes.Element>) elements42);
        org.jsoup.nodes.Document document45 = org.jsoup.Jsoup.parseBodyFragment("org.jsoup.select.Selector$SelectorParseException: hi!<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Document document47 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str48 = document47.tagName();
        org.jsoup.nodes.Element element50 = document47.append("hi!");
        org.jsoup.nodes.Document document52 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str53 = document52.tagName();
        org.jsoup.nodes.Element element55 = document52.append("hi!");
        java.lang.String str56 = document52.outerHtml();
        org.jsoup.select.Elements elements57 = document52.children();
        java.lang.String str59 = document52.absUrl("<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>");
        org.jsoup.select.Elements elements62 = document52.getElementsByAttributeValueContaining("<#root>\n</#root>", "#document");
        org.jsoup.nodes.Document document65 = org.jsoup.Jsoup.parseBodyFragment("#root=\"\"", "<#root>\n</#root>");
        java.lang.String str66 = document65.toString();
        org.jsoup.nodes.Document[] documentArray67 = new org.jsoup.nodes.Document[] { document45, document47, document52, document65 };
        org.jsoup.nodes.Document[] documentArray68 = elements42.toArray(documentArray67);
        org.jsoup.select.Elements elements69 = new org.jsoup.select.Elements((org.jsoup.nodes.Element[]) documentArray67);
        org.jsoup.nodes.Document[] documentArray70 = elements16.toArray(documentArray67);
        org.jsoup.select.Elements elements71 = new org.jsoup.select.Elements((org.jsoup.nodes.Element[]) documentArray70);
        org.jsoup.select.Elements elements72 = new org.jsoup.select.Elements((org.jsoup.nodes.Element[]) documentArray70);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(elementItor5);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(elementItor18);
        org.junit.Assert.assertNotNull(document20);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNull(element25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertNotNull(elements29);
        org.junit.Assert.assertNotNull(document31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "#root" + "'", str32, "#root");
        org.junit.Assert.assertNotNull(tag33);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "<#root>\n</#root>" + "'", str36, "<#root>\n</#root>");
        org.junit.Assert.assertNotNull(element38);
        org.junit.Assert.assertNotNull(element40);
        org.junit.Assert.assertNotNull(elements42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(document45);
        org.junit.Assert.assertNotNull(document47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "#root" + "'", str48, "#root");
        org.junit.Assert.assertNotNull(element50);
        org.junit.Assert.assertNotNull(document52);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "#root" + "'", str53, "#root");
        org.junit.Assert.assertNotNull(element55);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!" + "'", str56, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!");
        org.junit.Assert.assertNotNull(elements57);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertNotNull(elements62);
        org.junit.Assert.assertNotNull(document65);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>" + "'", str66, "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>");
        org.junit.Assert.assertNotNull(documentArray67);
        org.junit.Assert.assertNotNull(documentArray68);
        org.junit.Assert.assertNotNull(documentArray70);
    }

    @Test
    public void test830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test830");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str2 = document1.tagName();
        java.lang.String str3 = document1.html();
        org.jsoup.nodes.Element element5 = document1.append("hi!");
        boolean boolean7 = document1.hasAttr("#declaration");
        org.jsoup.nodes.Document document10 = org.jsoup.Jsoup.parseBodyFragment("#root=\"\"", "<#root>\n</#root>");
        java.lang.String str11 = document10.toString();
        java.lang.String str12 = document10.nodeName();
        java.lang.String str13 = document10.outerHtml();
        org.jsoup.nodes.Element element14 = document10.body();
        org.jsoup.nodes.Document document15 = document10.normalise();
        org.jsoup.nodes.Element element16 = document1.prependChild((org.jsoup.nodes.Node) document15);
        org.jsoup.nodes.Document document18 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element20 = document18.prependElement("hi!");
        org.jsoup.nodes.Element element22 = element20.append("");
        org.jsoup.nodes.Document document24 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str25 = document24.tagName();
        org.jsoup.nodes.Element element27 = document24.append("hi!");
        org.jsoup.nodes.Document document29 = new org.jsoup.nodes.Document("#root");
        org.jsoup.nodes.Document document31 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.select.Elements elements33 = document31.getElementsByTag("#root");
        org.jsoup.nodes.Element[] elementArray34 = new org.jsoup.nodes.Element[] { element20, element27, document29, document31 };
        org.jsoup.select.Elements elements35 = new org.jsoup.select.Elements(elementArray34);
        java.util.stream.Stream<org.jsoup.nodes.Element> elementStream36 = elements35.parallelStream();
        java.lang.Object obj37 = null;
        boolean boolean38 = elements35.contains(obj37);
        java.util.Spliterator<org.jsoup.nodes.Element> elementSpliterator39 = elements35.spliterator();
        org.jsoup.select.Elements elements41 = elements35.addClass("#root=&quot;&quot;");
        boolean boolean42 = document1.equals((java.lang.Object) elements41);
        boolean boolean43 = document1.hasText();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#root" + "'", str2, "#root");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>" + "'", str3, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>" + "'", str11, "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "#document" + "'", str12, "#document");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>" + "'", str13, "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>");
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(document15);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(document18);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(document24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "#root" + "'", str25, "#root");
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertNotNull(document31);
        org.junit.Assert.assertNotNull(elements33);
        org.junit.Assert.assertNotNull(elementArray34);
        org.junit.Assert.assertNotNull(elementStream36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(elementSpliterator39);
        org.junit.Assert.assertNotNull(elements41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
    }

    @Test
    public void test831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test831");
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parse("<html>\n<head>\n</head>\n<body>\n #root\n</body>\n</html>", "");
        org.junit.Assert.assertNotNull(document2);
    }

    @Test
    public void test832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test832");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str2 = document1.tagName();
        org.jsoup.parser.Tag tag3 = document1.tag();
        org.jsoup.nodes.Document document5 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str6 = document5.tagName();
        org.jsoup.parser.Tag tag7 = document5.tag();
        boolean boolean8 = tag7.isEmpty();
        org.jsoup.nodes.Document document10 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str11 = document10.tagName();
        org.jsoup.parser.Tag tag12 = document10.tag();
        org.jsoup.nodes.Element element14 = new org.jsoup.nodes.Element(tag12, "#root=\"\"");
        org.jsoup.nodes.Document document16 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str17 = document16.tagName();
        org.jsoup.parser.Tag tag18 = document16.tag();
        boolean boolean19 = tag12.canContain(tag18);
        boolean boolean20 = tag7.isValidParent(tag12);
        org.jsoup.nodes.Document document22 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str23 = document22.tagName();
        org.jsoup.parser.Tag tag24 = document22.tag();
        boolean boolean25 = tag24.isEmpty();
        boolean boolean26 = tag12.canContain(tag24);
        boolean boolean27 = tag3.canContain(tag24);
        org.jsoup.nodes.Attributes attributes29 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor30 = attributes29.iterator();
        java.lang.String str31 = attributes29.toString();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator32 = attributes29.spliterator();
        org.jsoup.nodes.Element element33 = new org.jsoup.nodes.Element(tag24, "hi!", attributes29);
        org.jsoup.nodes.Element element35 = element33.appendElement("<aorg>\n</aorg>");
        org.jsoup.nodes.Document document38 = org.jsoup.Jsoup.parseBodyFragment("#root", "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>");
        java.lang.String str39 = document38.baseUri();
        org.jsoup.nodes.Element element40 = element33.prependChild((org.jsoup.nodes.Node) document38);
        org.jsoup.nodes.Document document42 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element44 = document42.prependElement("hi!");
        org.jsoup.nodes.Element element46 = element44.append("");
        org.jsoup.nodes.Element element47 = element46.previousElementSibling();
        java.lang.String str48 = element46.nodeName();
        org.jsoup.select.Elements elements51 = element46.getElementsByAttributeValueStarting("<!<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!>", "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>");
        org.jsoup.nodes.Document document53 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str54 = document53.tagName();
        org.jsoup.parser.Tag tag55 = document53.tag();
        org.jsoup.nodes.Element element57 = new org.jsoup.nodes.Element(tag55, "#root=\"\"");
        java.lang.String str58 = element57.toString();
        org.jsoup.nodes.Element element60 = element57.text("");
        org.jsoup.nodes.Element element62 = element57.removeClass("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.select.Elements elements64 = element57.getElementsByIndexGreaterThan(0);
        boolean boolean65 = elements51.addAll((java.util.Collection<org.jsoup.nodes.Element>) elements64);
        boolean boolean66 = element40.equals((java.lang.Object) elements51);
        org.jsoup.select.Elements elements69 = element40.getElementsByAttributeValue("<!--#root=\"\"-->=\"\"", " #root=\"hi!\"=\"#root\" #comment=\"#root=&quot;&quot;=&quot;&quot;\" #root=\"\"=\"\"");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#root" + "'", str2, "#root");
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertNotNull(document5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#root" + "'", str6, "#root");
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#root" + "'", str11, "#root");
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertNotNull(document16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "#root" + "'", str17, "#root");
        org.junit.Assert.assertNotNull(tag18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(document22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "#root" + "'", str23, "#root");
        org.junit.Assert.assertNotNull(tag24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(attributeItor30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(attributeSpliterator32);
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertNotNull(document38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>" + "'", str39, "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>");
        org.junit.Assert.assertNotNull(element40);
        org.junit.Assert.assertNotNull(document42);
        org.junit.Assert.assertNotNull(element44);
        org.junit.Assert.assertNotNull(element46);
        org.junit.Assert.assertNull(element47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "hi!" + "'", str48, "hi!");
        org.junit.Assert.assertNotNull(elements51);
        org.junit.Assert.assertNotNull(document53);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "#root" + "'", str54, "#root");
        org.junit.Assert.assertNotNull(tag55);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "<#root>\n</#root>" + "'", str58, "<#root>\n</#root>");
        org.junit.Assert.assertNotNull(element60);
        org.junit.Assert.assertNotNull(element62);
        org.junit.Assert.assertNotNull(elements64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(elements69);
    }

    @Test
    public void test833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test833");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor1 = attributes0.iterator();
        org.jsoup.nodes.Attributes attributes2 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor3 = attributes2.iterator();
        boolean boolean5 = attributes2.hasKey("");
        attributes2.remove("#root=\"\"");
        attributes0.addAll(attributes2);
        attributes2.put("#root=\"hi!\"", "#root");
        org.jsoup.nodes.Attribute attribute14 = new org.jsoup.nodes.Attribute("#comment", "#root=\"\"=\"\"");
        attributes2.put(attribute14);
        attributes2.put("#root", "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!");
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator19 = attributes2.spliterator();
        org.jsoup.nodes.Attributes attributes20 = new org.jsoup.nodes.Attributes();
        boolean boolean22 = attributes20.equals((java.lang.Object) (byte) 100);
        attributes2.addAll(attributes20);
        org.jsoup.nodes.Attribute attribute26 = new org.jsoup.nodes.Attribute("<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!", "#root=\"hi!\"");
        org.jsoup.nodes.Document document28 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element30 = document28.prependElement("hi!");
        org.jsoup.nodes.Element element32 = element30.append("");
        boolean boolean33 = attribute26.equals((java.lang.Object) "");
        attributes2.put(attribute26);
        java.lang.String str35 = attributes2.toString();
        java.lang.String str36 = attributes2.toString();
        boolean boolean38 = attributes2.hasKey("&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;hi!");
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertNotNull(attributeItor3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(attributeSpliterator19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(document28);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertNotNull(element32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + " #root=\"hi!\"=\"#root\" #comment=\"#root=&quot;&quot;=&quot;&quot;\" #root=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;hi!\" <html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!=\"#root=&quot;hi!&quot;\"" + "'", str35, " #root=\"hi!\"=\"#root\" #comment=\"#root=&quot;&quot;=&quot;&quot;\" #root=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;hi!\" <html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!=\"#root=&quot;hi!&quot;\"");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + " #root=\"hi!\"=\"#root\" #comment=\"#root=&quot;&quot;=&quot;&quot;\" #root=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;hi!\" <html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!=\"#root=&quot;hi!&quot;\"" + "'", str36, " #root=\"hi!\"=\"#root\" #comment=\"#root=&quot;&quot;=&quot;&quot;\" #root=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;hi!\" <html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!=\"#root=&quot;hi!&quot;\"");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test834");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str2 = document1.tagName();
        org.jsoup.parser.Tag tag3 = document1.tag();
        org.jsoup.nodes.Document document5 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str6 = document5.tagName();
        org.jsoup.parser.Tag tag7 = document5.tag();
        boolean boolean8 = tag7.isEmpty();
        org.jsoup.nodes.Document document10 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str11 = document10.tagName();
        org.jsoup.parser.Tag tag12 = document10.tag();
        org.jsoup.nodes.Element element14 = new org.jsoup.nodes.Element(tag12, "#root=\"\"");
        org.jsoup.nodes.Document document16 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str17 = document16.tagName();
        org.jsoup.parser.Tag tag18 = document16.tag();
        boolean boolean19 = tag12.canContain(tag18);
        boolean boolean20 = tag7.isValidParent(tag12);
        org.jsoup.nodes.Document document22 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str23 = document22.tagName();
        org.jsoup.parser.Tag tag24 = document22.tag();
        boolean boolean25 = tag24.isEmpty();
        boolean boolean26 = tag12.canContain(tag24);
        boolean boolean27 = tag3.canContain(tag24);
        org.jsoup.nodes.Attributes attributes29 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor30 = attributes29.iterator();
        java.lang.String str31 = attributes29.toString();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator32 = attributes29.spliterator();
        org.jsoup.nodes.Element element33 = new org.jsoup.nodes.Element(tag24, "hi!", attributes29);
        org.jsoup.nodes.Element element35 = element33.appendElement("<aorg>\n</aorg>");
        org.jsoup.nodes.Document document37 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str38 = document37.tagName();
        org.jsoup.parser.Tag tag39 = document37.tag();
        java.lang.String str40 = document37.outerHtml();
        java.lang.String str41 = document37.outerHtml();
        java.lang.String str42 = document37.title();
        org.jsoup.nodes.Element element43 = document37.empty();
        org.jsoup.nodes.Element element45 = document37.html("org.jsoup.select.Selector$SelectorParseException: <#root>\n</#root>");
        java.lang.String str46 = document37.nodeName();
        org.jsoup.parser.Tag tag47 = document37.tag();
        org.jsoup.nodes.Element element49 = document37.toggleClass("<!--#root=\"\"-->=\"&lt;#root&gt;\n&lt;/#root&gt;=&quot;&amp;lt;html&amp;gt;\n&amp;lt;head&amp;gt;\n&amp;lt;/head&amp;gt;\n&amp;lt;body&amp;gt;\n&amp;lt;/body&amp;gt;\n&amp;lt;/html&amp;gt;&quot;\"");
        org.jsoup.nodes.Element element50 = element33.appendChild((org.jsoup.nodes.Node) document37);
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#root" + "'", str2, "#root");
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertNotNull(document5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#root" + "'", str6, "#root");
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#root" + "'", str11, "#root");
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertNotNull(document16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "#root" + "'", str17, "#root");
        org.junit.Assert.assertNotNull(tag18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(document22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "#root" + "'", str23, "#root");
        org.junit.Assert.assertNotNull(tag24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(attributeItor30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(attributeSpliterator32);
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertNotNull(document37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "#root" + "'", str38, "#root");
        org.junit.Assert.assertNotNull(tag39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>" + "'", str40, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>" + "'", str41, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertNotNull(element43);
        org.junit.Assert.assertNotNull(element45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "#document" + "'", str46, "#document");
        org.junit.Assert.assertNotNull(tag47);
        org.junit.Assert.assertNotNull(element49);
        org.junit.Assert.assertNotNull(element50);
    }

    @Test
    public void test835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test835");
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parseBodyFragment("#root=\"\"", "<#root>\n</#root>");
        java.lang.String str3 = document2.nodeName();
        org.jsoup.select.Elements elements5 = document2.getElementsByIndexEquals(10);
        java.lang.String str6 = document2.toString();
        org.jsoup.nodes.Element element8 = document2.append("hi!");
        org.jsoup.nodes.Document document10 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element12 = document10.prependElement("hi!");
        org.jsoup.nodes.Element element13 = element12.parent();
        org.jsoup.nodes.Element element14 = element12.empty();
        org.jsoup.nodes.Element element15 = element14.empty();
        java.util.Set<java.lang.String> strSet16 = element15.classNames();
        org.jsoup.nodes.Element element17 = document2.classNames(strSet16);
        org.jsoup.nodes.Element element19 = document2.prependElement("<?<html>\n<head>\n</head>\n<body>\n</body>\n</html>>");
        java.util.List<org.jsoup.nodes.Node> nodeList20 = document2.childNodes();
        org.jsoup.nodes.Node node22 = document2.removeAttr(" text=\"hi!\"");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>" + "'", str6, "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>");
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(nodeList20);
        org.junit.Assert.assertNotNull(node22);
    }

    @Test
    public void test836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test836");
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parseBodyFragment("#root=\"\"", "<#root>\n</#root>");
        java.lang.String str3 = document2.nodeName();
        org.jsoup.select.Elements elements5 = document2.getElementsByIndexEquals(10);
        org.jsoup.nodes.Element element7 = document2.append("<!<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!>");
        org.jsoup.nodes.Element element9 = document2.prependElement("#declaration=\"&lt;#root&gt;\n&lt;/#root&gt;\"");
        java.lang.String str10 = element9.outerHtml();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\n<#declaration=\"&lt;#root&gt;\n&lt;/#root&gt;\">\n</#declaration=\"&lt;#root&gt;\n&lt;/#root&gt;\">" + "'", str10, "\n<#declaration=\"&lt;#root&gt;\n&lt;/#root&gt;\">\n</#declaration=\"&lt;#root&gt;\n&lt;/#root&gt;\">");
    }

    @Test
    public void test837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test837");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str2 = document1.tagName();
        org.jsoup.parser.Tag tag3 = document1.tag();
        org.jsoup.nodes.Element element5 = new org.jsoup.nodes.Element(tag3, "#root=\"\"");
        org.jsoup.select.Elements elements7 = element5.getElementsByClass("<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>");
        org.jsoup.nodes.Node node8 = element5.parent();
        org.jsoup.select.Elements elements10 = element5.getElementsByAttribute("#root=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;\"");
        org.jsoup.select.Elements elements12 = elements10.removeClass("<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>");
        org.jsoup.nodes.Document document14 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.select.Elements elements16 = document14.getElementsByTag("#root");
        java.lang.String str17 = elements16.text();
        org.jsoup.select.Elements elements19 = elements16.toggleClass("");
        org.jsoup.select.Elements elements20 = new org.jsoup.select.Elements((java.util.List<org.jsoup.nodes.Element>) elements19);
        org.jsoup.nodes.Document document23 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element25 = document23.prependElement("hi!");
        org.jsoup.nodes.Element element27 = element25.append("");
        org.jsoup.select.Elements elements28 = org.jsoup.select.Selector.select("#root", element27);
        org.jsoup.select.Elements elements30 = elements28.prepend("\n<!--#root=\"\"-->");
        boolean boolean31 = elements19.retainAll((java.util.Collection<org.jsoup.nodes.Element>) elements28);
        boolean boolean33 = elements28.equals((java.lang.Object) (short) -1);
        boolean boolean34 = elements12.addAll((java.util.Collection<org.jsoup.nodes.Element>) elements28);
        org.jsoup.nodes.Document document36 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str37 = document36.tagName();
        org.jsoup.parser.Tag tag38 = document36.tag();
        org.jsoup.nodes.Element element40 = new org.jsoup.nodes.Element(tag38, "#root=\"\"");
        boolean boolean41 = element40.isBlock();
        java.util.Set<java.lang.String> strSet42 = element40.classNames();
        org.jsoup.nodes.Document document44 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str45 = document44.tagName();
        org.jsoup.nodes.Element element47 = document44.append("hi!");
        java.lang.String str48 = document44.outerHtml();
        org.jsoup.select.Elements elements49 = document44.children();
        org.jsoup.nodes.Document document51 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.select.Elements elements53 = document51.getElementsByTag("#root");
        boolean boolean54 = document44.equals((java.lang.Object) document51);
        org.jsoup.nodes.Element element56 = document51.appendText("#root");
        org.jsoup.nodes.Element element58 = document51.prepend("org.jsoup.select.Selector$SelectorParseException: hi!");
        org.jsoup.nodes.Document document60 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str61 = document60.tagName();
        java.lang.String str62 = document60.html();
        org.jsoup.nodes.Element element64 = document60.append("hi!");
        org.jsoup.nodes.Element element65 = document51.prependChild((org.jsoup.nodes.Node) element64);
        java.util.Set<java.lang.String> strSet66 = element65.classNames();
        org.jsoup.nodes.Document document68 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str69 = document68.tagName();
        org.jsoup.parser.Tag tag70 = document68.tag();
        org.jsoup.nodes.Element element72 = new org.jsoup.nodes.Element(tag70, "#root=\"\"");
        boolean boolean73 = element72.isBlock();
        java.util.Set<java.lang.String> strSet74 = element72.classNames();
        java.util.Set[] setArray76 = new java.util.Set[3];
        @SuppressWarnings("unchecked")
        java.util.Set<java.lang.String>[] strSetArray77 = (java.util.Set<java.lang.String>[]) setArray76;
        strSetArray77[0] = strSet42;
        strSetArray77[1] = strSet66;
        strSetArray77[2] = strSet74;
        java.util.Set<java.lang.String>[] strSetArray84 = elements12.toArray(strSetArray77);
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#root" + "'", str2, "#root");
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(document14);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertNotNull(document23);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertNotNull(elements28);
        org.junit.Assert.assertNotNull(elements30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(document36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "#root" + "'", str37, "#root");
        org.junit.Assert.assertNotNull(tag38);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(strSet42);
        org.junit.Assert.assertNotNull(document44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "#root" + "'", str45, "#root");
        org.junit.Assert.assertNotNull(element47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!" + "'", str48, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!");
        org.junit.Assert.assertNotNull(elements49);
        org.junit.Assert.assertNotNull(document51);
        org.junit.Assert.assertNotNull(elements53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(element56);
        org.junit.Assert.assertNotNull(element58);
        org.junit.Assert.assertNotNull(document60);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "#root" + "'", str61, "#root");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>" + "'", str62, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.junit.Assert.assertNotNull(element64);
        org.junit.Assert.assertNotNull(element65);
        org.junit.Assert.assertNotNull(strSet66);
        org.junit.Assert.assertNotNull(document68);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "#root" + "'", str69, "#root");
        org.junit.Assert.assertNotNull(tag70);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(strSet74);
        org.junit.Assert.assertNotNull(setArray76);
        org.junit.Assert.assertNotNull(strSetArray77);
        org.junit.Assert.assertNotNull(strSetArray84);
    }

    @Test
    public void test838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test838");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str2 = document1.tagName();
        org.jsoup.nodes.Element element4 = document1.append("hi!");
        java.lang.String str5 = document1.outerHtml();
        org.jsoup.select.Elements elements6 = document1.children();
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("#root");
        boolean boolean10 = document9.hasText();
        org.jsoup.select.Elements elements12 = document9.getElementsByIndexEquals(10);
        org.jsoup.nodes.Document document14 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str15 = document14.tagName();
        org.jsoup.parser.Tag tag16 = document14.tag();
        org.jsoup.nodes.TextNode textNode19 = new org.jsoup.nodes.TextNode("hi!", "");
        org.jsoup.nodes.Node node20 = textNode19.parent();
        org.jsoup.nodes.Element element21 = document14.appendChild((org.jsoup.nodes.Node) textNode19);
        org.jsoup.select.Elements elements23 = element21.getElementsByClass("#root");
        org.jsoup.nodes.Element element24 = document9.prependChild((org.jsoup.nodes.Node) element21);
        org.jsoup.select.Elements elements27 = element21.getElementsByAttributeValueNot("#text", "#document");
        org.jsoup.nodes.Element element29 = element21.appendElement("<?<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!>");
        elements6.add((int) (byte) 1, element21);
        org.jsoup.select.Elements elements33 = element21.getElementsByAttributeValueNot("<html>\n <head>\n </head>\n <body>\n </body>\n</html>hi!\n<head>\n </head>\n <body>\n </body>\n\n", "<?<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!>");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean35 = elements33.is("\n<<#root>\n</#root>>\n</<#root>\n</#root>>");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query <<#root>?</#root>>?</<#root>?</#root>>");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#root" + "'", str2, "#root");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!" + "'", str5, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(document14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "#root" + "'", str15, "#root");
        org.junit.Assert.assertNotNull(tag16);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(elements23);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(elements27);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertNotNull(elements33);
    }

    @Test
    public void test839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test839");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("#root");
        boolean boolean2 = document1.hasText();
        org.jsoup.select.Elements elements4 = document1.getElementsByIndexEquals(10);
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor5 = elements4.listIterator();
        org.jsoup.select.Elements elements8 = elements4.attr("<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "hi!");
        org.jsoup.nodes.Document document10 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element12 = document10.prependElement("hi!");
        org.jsoup.nodes.Element element13 = element12.parent();
        int int14 = elements4.indexOf((java.lang.Object) element13);
        org.jsoup.select.Elements elements16 = elements4.toggleClass("#document");
        boolean boolean17 = elements16.isEmpty();
        org.jsoup.select.Elements elements20 = elements16.attr("hi!", "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!");
        org.jsoup.nodes.Document document22 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str23 = document22.tagName();
        org.jsoup.parser.Tag tag24 = document22.tag();
        org.jsoup.nodes.Element element25 = document22.body();
        java.lang.String str26 = document22.text();
        org.jsoup.select.Elements elements27 = document22.children();
        boolean boolean28 = elements16.add((org.jsoup.nodes.Element) document22);
        java.lang.String str29 = elements16.outerHtml();
        java.lang.String str30 = elements16.html();
        org.jsoup.select.Elements elements32 = elements16.prepend(" text=\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(elementItor5);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(elements20);
        org.junit.Assert.assertNotNull(document22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "#root" + "'", str23, "#root");
        org.junit.Assert.assertNotNull(tag24);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(elements27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>" + "'", str29, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>" + "'", str30, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.junit.Assert.assertNotNull(elements32);
    }

    @Test
    public void test840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test840");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str2 = document1.tagName();
        org.jsoup.nodes.Element element4 = document1.append("hi!");
        org.jsoup.nodes.Element element6 = document1.prependText("hi!");
        org.jsoup.nodes.Element element8 = document1.createElement("#root=\"hi!\"");
        org.jsoup.nodes.Element element10 = document1.append("ohi!");
        org.jsoup.select.Elements elements11 = element10.getAllElements();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#root" + "'", str2, "#root");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(elements11);
    }

    @Test
    public void test841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test841");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element3 = document1.prependElement("hi!");
        org.jsoup.nodes.Element element4 = element3.parent();
        org.jsoup.nodes.Element element5 = element3.empty();
        org.jsoup.select.Elements elements7 = element5.getElementsByClass("hi!");
        org.jsoup.nodes.Element element9 = element5.prepend("<?<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!>");
        boolean boolean10 = element9.hasText();
        boolean boolean11 = element9.hasText();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test842");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element3 = document1.prependElement("hi!");
        org.jsoup.nodes.Element element5 = element3.append("");
        org.jsoup.nodes.Document document7 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str8 = document7.tagName();
        org.jsoup.nodes.Element element10 = document7.append("hi!");
        org.jsoup.nodes.Document document12 = new org.jsoup.nodes.Document("#root");
        org.jsoup.nodes.Document document14 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.select.Elements elements16 = document14.getElementsByTag("#root");
        org.jsoup.nodes.Element[] elementArray17 = new org.jsoup.nodes.Element[] { element3, element10, document12, document14 };
        org.jsoup.select.Elements elements18 = new org.jsoup.select.Elements(elementArray17);
        org.jsoup.select.Elements elements19 = new org.jsoup.select.Elements(elementArray17);
        org.jsoup.nodes.Document document21 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str22 = document21.tagName();
        org.jsoup.parser.Tag tag23 = document21.tag();
        org.jsoup.nodes.TextNode textNode26 = new org.jsoup.nodes.TextNode("hi!", "");
        org.jsoup.nodes.Node node27 = textNode26.parent();
        org.jsoup.nodes.Element element28 = document21.appendChild((org.jsoup.nodes.Node) textNode26);
        org.jsoup.select.Elements elements30 = element28.getElementsByClass("#root");
        java.lang.String str31 = elements30.html();
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor32 = elements30.listIterator();
        boolean boolean33 = elements19.addAll((java.util.Collection<org.jsoup.nodes.Element>) elements30);
        boolean boolean35 = elements19.hasAttr("<!#root=\"hi!\">");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#root" + "'", str8, "#root");
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(document14);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertNotNull(elementArray17);
        org.junit.Assert.assertNotNull(document21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "#root" + "'", str22, "#root");
        org.junit.Assert.assertNotNull(tag23);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertNotNull(elements30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(elementItor32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test843");
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parseBodyFragment("org.jsoup.select.selector$selectorparseexception: hi!=\"#comment\"", " text=\"hi!\" #root=\"\"=\"\"=\"\n&lt;!--#root=&quot;&quot;--&gt;\"");
        org.junit.Assert.assertNotNull(document2);
    }

    @Test
    public void test844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test844");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("#root");
        boolean boolean2 = document1.hasText();
        org.jsoup.select.Elements elements4 = document1.getElementsByIndexEquals(10);
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor5 = elements4.listIterator();
        org.jsoup.select.Elements elements6 = new org.jsoup.select.Elements((java.util.List<org.jsoup.nodes.Element>) elements4);
        org.jsoup.nodes.Document document8 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element10 = document8.prependElement("hi!");
        org.jsoup.nodes.Document document13 = org.jsoup.parser.Parser.parseBodyFragment("#root", "#root");
        org.jsoup.nodes.Element element15 = document13.addClass("<#root>\n</#root>");
        element10.replaceWith((org.jsoup.nodes.Node) document13);
        boolean boolean17 = elements4.add((org.jsoup.nodes.Element) document13);
        java.util.Spliterator<org.jsoup.nodes.Element> elementSpliterator18 = elements4.spliterator();
        java.util.Spliterator<org.jsoup.nodes.Element> elementSpliterator19 = elements4.spliterator();
        boolean boolean21 = elements4.hasClass(" #root=\"hi!\"=\"#root\" #comment=\"#root=&quot;&quot;=&quot;&quot;\" #root=\"\"=\"\"");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(elementItor5);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(elementSpliterator18);
        org.junit.Assert.assertNotNull(elementSpliterator19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test845");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("#root");
        boolean boolean2 = document1.hasText();
        org.jsoup.select.Elements elements4 = document1.getElementsByIndexEquals(10);
        java.lang.Object[] objArray5 = elements4.toArray();
        org.jsoup.nodes.Document document8 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element10 = document8.prependElement("hi!");
        org.jsoup.nodes.Element element11 = element10.parent();
        org.jsoup.nodes.Element element12 = element10.empty();
        elements4.add(0, element12);
        org.jsoup.nodes.Document document15 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str16 = document15.tagName();
        org.jsoup.parser.Tag tag17 = document15.tag();
        org.jsoup.nodes.TextNode textNode20 = new org.jsoup.nodes.TextNode("hi!", "");
        org.jsoup.nodes.Node node21 = textNode20.parent();
        org.jsoup.nodes.Element element22 = document15.appendChild((org.jsoup.nodes.Node) textNode20);
        org.jsoup.select.Elements elements24 = element22.getElementsByClass("#root");
        org.jsoup.nodes.Element element25 = element12.prependChild((org.jsoup.nodes.Node) element22);
        org.jsoup.select.Elements elements27 = element22.getElementsByAttribute("#root=\"hi!\"");
        org.jsoup.nodes.Document document29 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str30 = document29.tagName();
        org.jsoup.nodes.Element element32 = document29.append("hi!");
        java.lang.String str33 = element32.outerHtml();
        boolean boolean35 = element32.equals((java.lang.Object) 1.0f);
        java.lang.String str36 = element32.nodeName();
        org.jsoup.nodes.Element element38 = element32.wrap("#comment");
        org.jsoup.nodes.Element element39 = element22.appendChild((org.jsoup.nodes.Node) element32);
        org.jsoup.select.Elements elements41 = element39.getElementsByClass("<?<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!>");
        org.jsoup.select.Elements elements43 = elements41.eq((int) 'a');
        java.lang.String str44 = elements43.val();
        // The following exception was thrown during execution in test generation
        try {
            java.util.ListIterator<org.jsoup.nodes.Element> elementItor46 = elements43.listIterator((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(document15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "#root" + "'", str16, "#root");
        org.junit.Assert.assertNotNull(tag17);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(elements24);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(elements27);
        org.junit.Assert.assertNotNull(document29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "#root" + "'", str30, "#root");
        org.junit.Assert.assertNotNull(element32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!" + "'", str33, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "#document" + "'", str36, "#document");
        org.junit.Assert.assertNull(element38);
        org.junit.Assert.assertNotNull(element39);
        org.junit.Assert.assertNotNull(elements41);
        org.junit.Assert.assertNotNull(elements43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
    }

    @Test
    public void test846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test846");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("#root", "#root");
        org.jsoup.select.Elements elements5 = document2.getElementsByAttributeValueStarting("<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "#root=\"\"=\"\"");
        org.jsoup.nodes.Document document8 = new org.jsoup.nodes.Document("#root");
        boolean boolean9 = document8.hasText();
        org.jsoup.select.Elements elements11 = document8.getElementsByIndexEquals(10);
        java.lang.Object[] objArray12 = elements11.toArray();
        org.jsoup.nodes.Document document15 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element17 = document15.prependElement("hi!");
        org.jsoup.nodes.Element element18 = element17.parent();
        org.jsoup.nodes.Element element19 = element17.empty();
        elements11.add(0, element19);
        org.jsoup.select.Elements elements23 = element19.getElementsByAttributeValueEnding("#comment", "hi");
        java.util.stream.Stream<org.jsoup.nodes.Element> elementStream24 = elements23.parallelStream();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean25 = elements5.addAll((int) '.', (java.util.Collection<org.jsoup.nodes.Element>) elements23);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 46, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertNotNull(document15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(elements23);
        org.junit.Assert.assertNotNull(elementStream24);
    }

    @Test
    public void test847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test847");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element3 = document1.prependElement("hi!");
        org.jsoup.nodes.Element element4 = element3.parent();
        org.jsoup.select.Elements elements7 = element4.getElementsByAttributeValueEnding("org.jsoup.select.Selector$SelectorParseException: <html>\n<head>\n</head>\n<body>\n</body>\n</html>", "#root=\"\"");
        boolean boolean9 = elements7.hasAttr("ohi");
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor11 = elements7.listIterator(0);
        org.jsoup.nodes.Document document13 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str14 = document13.tagName();
        org.jsoup.parser.Tag tag15 = document13.tag();
        java.lang.String str16 = document13.outerHtml();
        java.lang.String str17 = document13.outerHtml();
        java.lang.String str18 = document13.title();
        org.jsoup.nodes.Element element19 = document13.empty();
        org.jsoup.nodes.Element element21 = element19.append("#root=\"\"=\"\"");
        org.jsoup.nodes.Document document23 = new org.jsoup.nodes.Document("#root");
        boolean boolean24 = document23.hasText();
        org.jsoup.select.Elements elements26 = document23.getElementsByIndexEquals(10);
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor27 = elements26.listIterator();
        boolean boolean28 = elements26.hasText();
        boolean boolean29 = element21.equals((java.lang.Object) elements26);
        boolean boolean30 = elements7.remove((java.lang.Object) elements26);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element32 = elements7.remove((int) '&');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 38, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(elementItor11);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#root" + "'", str14, "#root");
        org.junit.Assert.assertNotNull(tag15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>" + "'", str16, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>" + "'", str17, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(elements26);
        org.junit.Assert.assertNotNull(elementItor27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test848");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element3 = document1.prependElement("hi!");
        org.jsoup.nodes.Element element5 = element3.append("");
        org.jsoup.nodes.Element element6 = element5.previousElementSibling();
        java.lang.String str7 = element5.nodeName();
        org.jsoup.nodes.Element element10 = element5.attr("#root=\"\"=\"\"", "#comment");
        boolean boolean12 = element5.hasClass("org.jsoup.select.Selector$SelectorParseException: hi!");
        java.lang.String str13 = element5.nodeName();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNull(element6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test849");
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parseBodyFragment("<html>\n<head>\n</head>\n<body> #document\n</body>\n</html>", "<html>\n<head>\n</head>\n<body>\n</body>\n</html>\n\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>\n\n<head>\n</head>\n\n<body>\n</body>");
        org.junit.Assert.assertNotNull(document2);
    }

    @Test
    public void test850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test850");
        org.jsoup.safety.Whitelist whitelist1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.jsoup.Jsoup.clean(" text=\"hi!\" #root=&quot;&quot;=\"\"", whitelist1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test851");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parse("#root=\"\"=\"\"");
        java.lang.String str2 = document1.data();
        org.jsoup.nodes.Element element4 = document1.prependElement("[., j, s, o, u, p, ., s, e, l, e, c, t, ., S, e, l, e, c, t, o, r, $, S, e, l, e, c, t, o, r, P, a, r, s, e, E, x, c, e, p, t, i, o, n, :,  , h, i, !, <, h, t, m, l, >, \n, <, h, e, a, d, >, \n, <, /, h, e, a, d, >, \n, <, b, o, d, y, >, \n, <, /, b, o, d, y, >, \n, <, /, h, t, m, l, >]");
        boolean boolean5 = document1.hasText();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test852");
        org.jsoup.nodes.Document document2 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str3 = document2.tagName();
        org.jsoup.select.Elements elements5 = document2.getElementsByIndexGreaterThan((-1));
        boolean boolean6 = elements5.isEmpty();
        org.jsoup.nodes.Document document8 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.select.Elements elements10 = document8.getElementsByTag("#root");
        java.lang.String str11 = elements10.text();
        org.jsoup.nodes.Document document13 = new org.jsoup.nodes.Document("#root");
        boolean boolean14 = document13.hasText();
        org.jsoup.select.Elements elements16 = document13.getElementsByIndexEquals(10);
        java.lang.Object[] objArray17 = elements16.toArray();
        boolean boolean18 = elements10.retainAll((java.util.Collection<org.jsoup.nodes.Element>) elements16);
        java.lang.String str19 = elements16.text();
        org.jsoup.nodes.Document document21 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str22 = document21.tagName();
        org.jsoup.select.Elements elements24 = document21.getElementsByIndexGreaterThan((-1));
        java.lang.String str25 = document21.toString();
        org.jsoup.nodes.Element element27 = document21.text("#root=\"hi!\"");
        int int28 = elements16.lastIndexOf((java.lang.Object) "#root=\"hi!\"");
        org.jsoup.select.Elements elements30 = elements16.select("#root");
        org.jsoup.select.Elements elements32 = elements16.removeClass("#root=\"hi!\"");
        boolean boolean33 = elements5.retainAll((java.util.Collection<org.jsoup.nodes.Element>) elements32);
        org.jsoup.select.Elements elements34 = org.jsoup.select.Selector.select(" text=\"hi!\"", (java.lang.Iterable<org.jsoup.nodes.Element>) elements32);
        org.jsoup.select.Elements elements37 = elements34.attr("#document", "org.jsoup.select.Selector$SelectorParseException: <html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Document document39 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element41 = document39.prependElement("hi!");
        org.jsoup.nodes.Element element43 = element41.append("");
        org.jsoup.nodes.Document document45 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str46 = document45.tagName();
        org.jsoup.nodes.Element element48 = document45.append("hi!");
        org.jsoup.nodes.Document document50 = new org.jsoup.nodes.Document("#root");
        org.jsoup.nodes.Document document52 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.select.Elements elements54 = document52.getElementsByTag("#root");
        org.jsoup.nodes.Element[] elementArray55 = new org.jsoup.nodes.Element[] { element41, element48, document50, document52 };
        org.jsoup.select.Elements elements56 = new org.jsoup.select.Elements(elementArray55);
        java.util.stream.Stream<org.jsoup.nodes.Element> elementStream57 = elements56.parallelStream();
        java.lang.Object obj58 = null;
        boolean boolean59 = elements56.contains(obj58);
        org.jsoup.select.Elements elements61 = elements56.toggleClass("org.jsoup.select.Selector$SelectorParseException: hi!");
        boolean boolean62 = elements37.contains((java.lang.Object) "org.jsoup.select.Selector$SelectorParseException: hi!");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#root" + "'", str3, "#root");
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(document21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "#root" + "'", str22, "#root");
        org.junit.Assert.assertNotNull(elements24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>" + "'", str25, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(elements30);
        org.junit.Assert.assertNotNull(elements32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(elements34);
        org.junit.Assert.assertNotNull(elements37);
        org.junit.Assert.assertNotNull(document39);
        org.junit.Assert.assertNotNull(element41);
        org.junit.Assert.assertNotNull(element43);
        org.junit.Assert.assertNotNull(document45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "#root" + "'", str46, "#root");
        org.junit.Assert.assertNotNull(element48);
        org.junit.Assert.assertNotNull(document52);
        org.junit.Assert.assertNotNull(elements54);
        org.junit.Assert.assertNotNull(elementArray55);
        org.junit.Assert.assertNotNull(elementStream57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(elements61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
    }

    @Test
    public void test853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test853");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("#root", "#root");
        java.lang.String str4 = document2.absUrl("#root=\"\"");
        document2.title("#document");
        org.jsoup.select.Elements elements8 = document2.getElementsByClass("<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>");
        org.jsoup.nodes.Element element10 = document2.addClass("<html>\n<head>\n</head>\n<body>\n org.jsoup.select.Selector$SelectorParseException: hi!\n <html> \n  <head> \n  </head> \n  <body>  \n  </body>\n </html>\n</body>\n</html>");
        java.lang.String str11 = document2.title();
        org.jsoup.nodes.Element element13 = document2.createElement("\n<!--#root=\"\"-->");
        document2.title("org.jsoup.select.Selector$SelectorParseException: <html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#document" + "'", str11, "#document");
        org.junit.Assert.assertNotNull(element13);
    }

    @Test
    public void test854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test854");
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parseBodyFragment("<#root class=\"#root &lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;hi! org.jsoup.select.Selector$SelectorParseException: &lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt; &lt;html&gt;\n &lt;head&gt;\n &lt;/head&gt;\n &lt;body&gt;\n &lt;/body&gt;\n&lt;/html&gt;hi!\n\n&lt;html&gt;\n &lt;head&gt;\n &lt;/head&gt;\n &lt;body&gt;\n &lt;/body&gt;\n&lt;/html&gt;\n\n &lt;head&gt;\n &lt;/head&gt;\n\n &lt;body&gt;\n &lt;/body&gt; org.jsoup.select.Selector$SelectorParseException: hi! ! #document #root=&quot;&amp;lt;html&amp;gt;\n&amp;lt;head&amp;gt;\n&amp;lt;/head&amp;gt;\n&amp;lt;body&amp;gt;\n&amp;lt;/body&amp;gt;\n&amp;lt;/html&amp;gt;&quot; [., j, s, o, u, p, ., s, e, l, e, c, t, ., S, e, l, e, c, t, o, r, $, S, e, l, e, c, t, o, r, P, a, r, s, e, E, x, c, e, p, t, i, o, n, :,  , h, i, !, &lt;, h, t, m, l, &gt;, \n, &lt;, h, e, a, d, &gt;, \n, &lt;, /, h, e, a, d, &gt;, \n, &lt;, b, o, d, y, &gt;, \n, &lt;, /, b, o, d, y, &gt;, \n, &lt;, /, h, t, m, l, &gt;] #root=&amp;quot;&amp;quot; org.jsoup.select.Selector$SelectorParseException: &lt;#root&gt;\n&lt;/#root&gt; &lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt; &lt;?#root=&quot;&amp;lt;html&amp;gt;\n&amp;lt;head&amp;gt;\n&amp;lt;/head&amp;gt;\n&amp;lt;body&amp;gt;\n&amp;lt;/body&amp;gt;\n&amp;lt;/html&amp;gt;&quot;&gt; #root=&quot;&quot; &lt;!&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;hi!&gt; &lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n #root=&amp;quot;&amp;quot;\n&lt;/body&gt;\n&lt;/html&gt; #text hi\">\n<#root class=\"\">\n</#root>\n</#root>", "org.jsoup.select.Selector$SelectorParseException: <html>\n<head>\n</head>\n<body>\n org.jsoup.select.Selector$SelectorParseException: hi!\n <html> \n  <head> \n  </head> \n  <body>  \n  </body>\n </html>\n</body>\n</html>");
        org.jsoup.nodes.Element element4 = document2.text("<html>\n <head>\n </head>\n <body>\n </body>\n</html>hi!<<?<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!>>\n</<?<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!>>");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
    }

    @Test
    public void test855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test855");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str2 = document1.tagName();
        org.jsoup.nodes.Element element4 = document1.append("hi!");
        java.lang.String str5 = document1.outerHtml();
        org.jsoup.select.Elements elements6 = document1.children();
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("#root");
        boolean boolean10 = document9.hasText();
        org.jsoup.select.Elements elements12 = document9.getElementsByIndexEquals(10);
        org.jsoup.nodes.Document document14 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str15 = document14.tagName();
        org.jsoup.parser.Tag tag16 = document14.tag();
        org.jsoup.nodes.TextNode textNode19 = new org.jsoup.nodes.TextNode("hi!", "");
        org.jsoup.nodes.Node node20 = textNode19.parent();
        org.jsoup.nodes.Element element21 = document14.appendChild((org.jsoup.nodes.Node) textNode19);
        org.jsoup.select.Elements elements23 = element21.getElementsByClass("#root");
        org.jsoup.nodes.Element element24 = document9.prependChild((org.jsoup.nodes.Node) element21);
        org.jsoup.select.Elements elements27 = element21.getElementsByAttributeValueNot("#text", "#document");
        org.jsoup.nodes.Element element29 = element21.appendElement("<?<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!>");
        elements6.add((int) (byte) 1, element21);
        org.jsoup.select.Elements elements32 = elements6.wrap("&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n #root=&quot;&quot;\n&lt;/body&gt;\n&lt;/html&gt;");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#root" + "'", str2, "#root");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!" + "'", str5, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(document14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "#root" + "'", str15, "#root");
        org.junit.Assert.assertNotNull(tag16);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(elements23);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(elements27);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertNotNull(elements32);
    }

    @Test
    public void test856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test856");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str2 = document1.tagName();
        org.jsoup.parser.Tag tag3 = document1.tag();
        org.jsoup.nodes.Element element5 = new org.jsoup.nodes.Element(tag3, "#root=\"\"");
        java.lang.String str6 = element5.toString();
        org.jsoup.nodes.Element element8 = element5.text("");
        org.jsoup.nodes.Element element10 = element8.appendText("hi!");
        org.jsoup.nodes.Document document12 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str13 = document12.tagName();
        org.jsoup.parser.Tag tag14 = document12.tag();
        org.jsoup.nodes.Document document16 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str17 = document16.tagName();
        org.jsoup.parser.Tag tag18 = document16.tag();
        boolean boolean19 = tag18.isEmpty();
        org.jsoup.nodes.Document document21 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str22 = document21.tagName();
        org.jsoup.parser.Tag tag23 = document21.tag();
        org.jsoup.nodes.Element element25 = new org.jsoup.nodes.Element(tag23, "#root=\"\"");
        org.jsoup.nodes.Document document27 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str28 = document27.tagName();
        org.jsoup.parser.Tag tag29 = document27.tag();
        boolean boolean30 = tag23.canContain(tag29);
        boolean boolean31 = tag18.isValidParent(tag23);
        org.jsoup.nodes.Document document33 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str34 = document33.tagName();
        org.jsoup.parser.Tag tag35 = document33.tag();
        boolean boolean36 = tag35.isEmpty();
        boolean boolean37 = tag23.canContain(tag35);
        boolean boolean38 = tag14.canContain(tag35);
        org.jsoup.nodes.TextNode textNode42 = new org.jsoup.nodes.TextNode("hi!", "");
        java.lang.String str43 = textNode42.text();
        org.jsoup.nodes.Attributes attributes44 = textNode42.attributes();
        attributes44.put("#root=\"\"=\"\"", "\n<!--#root=\"\"-->");
        org.jsoup.nodes.Element element48 = new org.jsoup.nodes.Element(tag35, "#comment", attributes44);
        org.jsoup.nodes.Element element51 = element48.attr("&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;hi!", "org.jsoup.select.Selector$SelectorParseException: hi!<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element52 = element8.prependChild((org.jsoup.nodes.Node) element48);
        org.jsoup.nodes.Element element54 = element52.prepend("<?#root=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;\">");
        java.lang.String str55 = element52.val();
        java.lang.String str56 = element52.tagName();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#root" + "'", str2, "#root");
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<#root>\n</#root>" + "'", str6, "<#root>\n</#root>");
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "#root" + "'", str13, "#root");
        org.junit.Assert.assertNotNull(tag14);
        org.junit.Assert.assertNotNull(document16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "#root" + "'", str17, "#root");
        org.junit.Assert.assertNotNull(tag18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(document21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "#root" + "'", str22, "#root");
        org.junit.Assert.assertNotNull(tag23);
        org.junit.Assert.assertNotNull(document27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "#root" + "'", str28, "#root");
        org.junit.Assert.assertNotNull(tag29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(document33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "#root" + "'", str34, "#root");
        org.junit.Assert.assertNotNull(tag35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!" + "'", str43, "hi!");
        org.junit.Assert.assertNotNull(attributes44);
        org.junit.Assert.assertNotNull(element51);
        org.junit.Assert.assertNotNull(element52);
        org.junit.Assert.assertNotNull(element54);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "#root" + "'", str56, "#root");
    }

    @Test
    public void test857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test857");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str2 = document1.tagName();
        org.jsoup.nodes.Element element4 = document1.append("hi!");
        java.lang.String str5 = document1.outerHtml();
        org.jsoup.select.Elements elements6 = document1.children();
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("#root");
        boolean boolean10 = document9.hasText();
        org.jsoup.select.Elements elements12 = document9.getElementsByIndexEquals(10);
        org.jsoup.nodes.Document document14 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str15 = document14.tagName();
        org.jsoup.parser.Tag tag16 = document14.tag();
        org.jsoup.nodes.TextNode textNode19 = new org.jsoup.nodes.TextNode("hi!", "");
        org.jsoup.nodes.Node node20 = textNode19.parent();
        org.jsoup.nodes.Element element21 = document14.appendChild((org.jsoup.nodes.Node) textNode19);
        org.jsoup.select.Elements elements23 = element21.getElementsByClass("#root");
        org.jsoup.nodes.Element element24 = document9.prependChild((org.jsoup.nodes.Node) element21);
        org.jsoup.select.Elements elements27 = element21.getElementsByAttributeValueNot("#text", "#document");
        org.jsoup.nodes.Element element29 = element21.appendElement("<?<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!>");
        elements6.add((int) (byte) 1, element21);
        org.jsoup.nodes.Element element31 = elements6.last();
        org.jsoup.nodes.Element element34 = element31.attr("<html>\n<head>\n</head>\n<body>\n org.jsoup.select.Selector$SelectorParseException: hi!&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;\n</body>\n</html>", "#data");
        java.lang.Class<?> wildcardClass35 = element31.getClass();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#root" + "'", str2, "#root");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!" + "'", str5, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(document14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "#root" + "'", str15, "#root");
        org.junit.Assert.assertNotNull(tag16);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(elements23);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(elements27);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertNotNull(element34);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test858");
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parse("<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!", "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!=\"org.jsoup.select.Selector$SelectorParseException: &lt;#root&gt;\n&lt;/#root&gt;\"");
        org.junit.Assert.assertNotNull(document2);
    }

    @Test
    public void test859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test859");
        org.jsoup.safety.Whitelist whitelist1 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.jsoup.Jsoup.isValid("<#root>\n</#root>=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;\"", whitelist1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test860");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element3 = document1.prependElement("hi!");
        org.jsoup.nodes.Element element5 = element3.append("");
        org.jsoup.nodes.Document document7 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str8 = document7.tagName();
        org.jsoup.nodes.Element element10 = document7.append("hi!");
        org.jsoup.nodes.Document document12 = new org.jsoup.nodes.Document("#root");
        org.jsoup.nodes.Document document14 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.select.Elements elements16 = document14.getElementsByTag("#root");
        org.jsoup.nodes.Element[] elementArray17 = new org.jsoup.nodes.Element[] { element3, element10, document12, document14 };
        org.jsoup.select.Elements elements18 = new org.jsoup.select.Elements(elementArray17);
        java.util.stream.Stream<org.jsoup.nodes.Element> elementStream19 = elements18.parallelStream();
        java.lang.Object obj20 = null;
        boolean boolean21 = elements18.contains(obj20);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element23 = elements18.remove((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#root" + "'", str8, "#root");
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(document14);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertNotNull(elementArray17);
        org.junit.Assert.assertNotNull(elementStream19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test861");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("#root", "#root");
        org.jsoup.nodes.Element element4 = document2.addClass("<#root>\n</#root>");
        java.lang.String str5 = document2.outerHtml();
        java.lang.String str6 = document2.className();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n<head>\n</head>\n<body>\n #root\n</body>\n</html>" + "'", str5, "<html>\n<head>\n</head>\n<body>\n #root\n</body>\n</html>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " <#root>\n</#root>" + "'", str6, " <#root>\n</#root>");
    }

    @Test
    public void test862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test862");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str2 = document1.id();
        org.jsoup.select.Elements elements3 = document1.children();
        org.jsoup.select.Elements elements5 = elements3.html("#root=\"\"");
        boolean boolean7 = elements5.hasAttr("");
        elements5.clear();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test863");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str2 = document1.tagName();
        org.jsoup.parser.Tag tag3 = document1.tag();
        java.lang.String str4 = document1.outerHtml();
        java.lang.String str5 = document1.outerHtml();
        java.lang.String str6 = document1.title();
        org.jsoup.nodes.Element element7 = document1.empty();
        org.jsoup.nodes.Element element9 = document1.html("org.jsoup.select.Selector$SelectorParseException: <#root>\n</#root>");
        org.jsoup.nodes.Element element11 = element9.addClass("#text");
        boolean boolean13 = element11.hasClass("org.jsoup.select.Selector$SelectorParseException: &lt;#root&gt;");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#root" + "'", str2, "#root");
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>" + "'", str4, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>" + "'", str5, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test864");
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parseBodyFragment("<?<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!>", "<!--#root=\"\"-->=\"\"");
        org.junit.Assert.assertNotNull(document2);
    }

    @Test
    public void test865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test865");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str2 = document1.tagName();
        org.jsoup.nodes.Element element4 = document1.append("hi!");
        org.jsoup.nodes.Element element6 = document1.html("org.jsoup.select.Selector$SelectorParseException: hi!");
        org.jsoup.nodes.Element element8 = document1.prependText("<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>");
        org.jsoup.nodes.Element element10 = document1.createElement("aorg");
        org.jsoup.select.Elements elements12 = document1.getElementsByAttribute("#root");
        int int13 = elements12.size();
        org.jsoup.nodes.Document document15 = new org.jsoup.nodes.Document("#root");
        boolean boolean16 = document15.hasText();
        org.jsoup.select.Elements elements18 = document15.getElementsByIndexEquals(10);
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor19 = elements18.listIterator();
        org.jsoup.select.Elements elements22 = elements18.attr("<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "hi!");
        boolean boolean23 = elements12.containsAll((java.util.Collection<org.jsoup.nodes.Element>) elements22);
        org.jsoup.parser.TokenQueue tokenQueue25 = new org.jsoup.parser.TokenQueue("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        tokenQueue25.addFirst("org.jsoup.select.Selector$SelectorParseException: hi!");
        boolean boolean28 = tokenQueue25.isEmpty();
        int int29 = elements12.lastIndexOf((java.lang.Object) tokenQueue25);
        java.lang.String str31 = tokenQueue25.consumeTo("");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#root" + "'", str2, "#root");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertNotNull(elementItor19);
        org.junit.Assert.assertNotNull(elements22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
    }

    @Test
    public void test866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test866");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str2 = document1.tagName();
        org.jsoup.parser.Tag tag3 = document1.tag();
        org.jsoup.nodes.Element element5 = new org.jsoup.nodes.Element(tag3, "#root=\"\"");
        java.lang.String str6 = element5.toString();
        java.lang.String str7 = element5.outerHtml();
        org.jsoup.nodes.Element element9 = element5.prepend("<html>\n<head>\n</head>\n<body> #root\n</body>\n</html>");
        java.lang.String str10 = element5.nodeName();
        java.lang.String str11 = element5.tagName();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#root" + "'", str2, "#root");
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<#root>\n</#root>" + "'", str6, "<#root>\n</#root>");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<#root>\n</#root>" + "'", str7, "<#root>\n</#root>");
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#root" + "'", str10, "#root");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#root" + "'", str11, "#root");
    }

    @Test
    public void test867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test867");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("", "\n<!--#root=\"\"-->");
        org.jsoup.nodes.Document document4 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str5 = document4.tagName();
        org.jsoup.parser.Tag tag6 = document4.tag();
        boolean boolean7 = tag6.isEmpty();
        boolean boolean8 = tag6.isBlock();
        boolean boolean9 = tag6.isEmpty();
        boolean boolean10 = document2.equals((java.lang.Object) boolean9);
        java.util.Set<java.lang.String> strSet11 = document2.classNames();
        org.jsoup.nodes.Element element13 = document2.createElement("[o, h, i, !]");
        org.jsoup.select.Elements elements16 = document2.getElementsByAttributeValueContaining("<!--#root=\"\"-->", "<?<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!>");
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor18 = elements16.listIterator(0);
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(document4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#root" + "'", str5, "#root");
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertNotNull(elementItor18);
    }

    @Test
    public void test868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test868");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element3 = document1.prependElement("hi!");
        org.jsoup.nodes.Element element5 = element3.append("");
        org.jsoup.nodes.Element element6 = element5.previousElementSibling();
        java.lang.String str7 = element5.nodeName();
        org.jsoup.select.Elements elements10 = element5.getElementsByAttributeValueStarting("<!<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!>", "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>");
        org.jsoup.nodes.Document document12 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str13 = document12.tagName();
        org.jsoup.parser.Tag tag14 = document12.tag();
        org.jsoup.nodes.Element element16 = new org.jsoup.nodes.Element(tag14, "#root=\"\"");
        java.lang.String str17 = element16.toString();
        org.jsoup.nodes.Element element19 = element16.text("");
        org.jsoup.nodes.Element element21 = element16.removeClass("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.select.Elements elements23 = element16.getElementsByIndexGreaterThan(0);
        boolean boolean24 = elements10.addAll((java.util.Collection<org.jsoup.nodes.Element>) elements23);
        org.jsoup.nodes.Document document26 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str27 = document26.tagName();
        java.lang.String str28 = document26.html();
        org.jsoup.nodes.Element element30 = document26.append("hi!");
        boolean boolean32 = document26.hasAttr("#declaration");
        org.jsoup.nodes.Document document35 = org.jsoup.Jsoup.parseBodyFragment("#root=\"\"", "<#root>\n</#root>");
        java.lang.String str36 = document35.toString();
        java.lang.String str37 = document35.nodeName();
        java.lang.String str38 = document35.outerHtml();
        org.jsoup.nodes.Element element39 = document35.body();
        org.jsoup.nodes.Document document40 = document35.normalise();
        org.jsoup.nodes.Element element41 = document26.prependChild((org.jsoup.nodes.Node) document40);
        org.jsoup.select.Elements elements43 = document26.getElementsByIndexEquals((int) 'o');
        org.jsoup.select.Elements elements45 = elements43.eq((int) (byte) 100);
        boolean boolean46 = elements23.containsAll((java.util.Collection<org.jsoup.nodes.Element>) elements45);
        boolean boolean47 = elements45.isEmpty();
        org.jsoup.nodes.Document document49 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element51 = document49.prependElement("hi!");
        org.jsoup.nodes.Element element53 = element51.append("");
        org.jsoup.nodes.Document document55 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str56 = document55.tagName();
        org.jsoup.nodes.Element element58 = document55.append("hi!");
        org.jsoup.nodes.Document document60 = new org.jsoup.nodes.Document("#root");
        org.jsoup.nodes.Document document62 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.select.Elements elements64 = document62.getElementsByTag("#root");
        org.jsoup.nodes.Element[] elementArray65 = new org.jsoup.nodes.Element[] { element51, element58, document60, document62 };
        org.jsoup.select.Elements elements66 = new org.jsoup.select.Elements(elementArray65);
        java.util.stream.Stream<org.jsoup.nodes.Element> elementStream67 = elements66.parallelStream();
        java.lang.Object obj68 = null;
        boolean boolean69 = elements66.contains(obj68);
        org.jsoup.select.Elements elements71 = elements66.toggleClass("org.jsoup.select.Selector$SelectorParseException: hi!");
        boolean boolean72 = elements45.addAll((java.util.Collection<org.jsoup.nodes.Element>) elements66);
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNull(element6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "#root" + "'", str13, "#root");
        org.junit.Assert.assertNotNull(tag14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "<#root>\n</#root>" + "'", str17, "<#root>\n</#root>");
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(elements23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(document26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "#root" + "'", str27, "#root");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>" + "'", str28, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(document35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>" + "'", str36, "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "#document" + "'", str37, "#document");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>" + "'", str38, "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>");
        org.junit.Assert.assertNotNull(element39);
        org.junit.Assert.assertNotNull(document40);
        org.junit.Assert.assertNotNull(element41);
        org.junit.Assert.assertNotNull(elements43);
        org.junit.Assert.assertNotNull(elements45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(document49);
        org.junit.Assert.assertNotNull(element51);
        org.junit.Assert.assertNotNull(element53);
        org.junit.Assert.assertNotNull(document55);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "#root" + "'", str56, "#root");
        org.junit.Assert.assertNotNull(element58);
        org.junit.Assert.assertNotNull(document62);
        org.junit.Assert.assertNotNull(elements64);
        org.junit.Assert.assertNotNull(elementArray65);
        org.junit.Assert.assertNotNull(elementStream67);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(elements71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
    }

    @Test
    public void test869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test869");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("#root", "");
        org.jsoup.select.Elements elements4 = document2.getElementsByClass("<html>\n<head>\n</head>\n<body>\n #root\n</body>\n</html>");
        org.jsoup.nodes.Element element6 = document2.html("[<, !, <, h, t, m, l, >, \n, <, h, e, a, d, >, \n, <, /, h, e, a, d, >, \n, <, b, o, d, y, >, \n, <, /, b, o, d, y, >, \n, <, /, h, t, m, l, >, h, i, !, >]");
        java.lang.String str7 = document2.baseUri();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test870");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str2 = document1.id();
        org.jsoup.select.Elements elements3 = document1.children();
        org.jsoup.select.Elements elements5 = elements3.html("#root=\"\"");
        org.jsoup.select.Elements elements7 = elements3.toggleClass("#root=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;\"");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elements7);
    }

    @Test
    public void test871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test871");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str2 = document1.tagName();
        org.jsoup.nodes.Element element4 = document1.append("hi!");
        java.lang.String str5 = document1.outerHtml();
        org.jsoup.select.Elements elements6 = document1.children();
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("#root");
        boolean boolean10 = document9.hasText();
        org.jsoup.select.Elements elements12 = document9.getElementsByIndexEquals(10);
        org.jsoup.nodes.Document document14 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str15 = document14.tagName();
        org.jsoup.parser.Tag tag16 = document14.tag();
        org.jsoup.nodes.TextNode textNode19 = new org.jsoup.nodes.TextNode("hi!", "");
        org.jsoup.nodes.Node node20 = textNode19.parent();
        org.jsoup.nodes.Element element21 = document14.appendChild((org.jsoup.nodes.Node) textNode19);
        org.jsoup.select.Elements elements23 = element21.getElementsByClass("#root");
        org.jsoup.nodes.Element element24 = document9.prependChild((org.jsoup.nodes.Node) element21);
        org.jsoup.select.Elements elements27 = element21.getElementsByAttributeValueNot("#text", "#document");
        org.jsoup.nodes.Element element29 = element21.appendElement("<?<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!>");
        elements6.add((int) (byte) 1, element21);
        org.jsoup.select.Elements elements33 = element21.getElementsByAttributeValueNot("<html>\n <head>\n </head>\n <body>\n </body>\n</html>hi!\n<head>\n </head>\n <body>\n </body>\n\n", "<?<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!>");
        org.jsoup.nodes.Element element35 = element21.val("<#root>\n</#root>");
        org.jsoup.nodes.Element element37 = element21.appendElement("aorg.jsoup.select.Selector$SelectorParseException: hi!<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#root" + "'", str2, "#root");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!" + "'", str5, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(document14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "#root" + "'", str15, "#root");
        org.junit.Assert.assertNotNull(tag16);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(elements23);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(elements27);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertNotNull(elements33);
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertNotNull(element37);
    }
}

