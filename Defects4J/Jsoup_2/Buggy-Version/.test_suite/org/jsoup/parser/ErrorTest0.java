package org.jsoup.parser;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test01");
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parseBodyFragment("#root=\"\"", "<#root>\n</#root>");
        java.lang.String str3 = document2.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node4 = document2.previousSibling();
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parseBodyFragment("#root=\"\"", "<#root>\n</#root>");
        java.lang.String str3 = document2.nodeName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element4 = document2.previousElementSibling();
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("#root", "#root");
        java.lang.String str3 = document2.nodeName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node4 = document2.nextSibling();
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("#root", "#root");
        org.jsoup.nodes.Element element4 = document2.addClass("<#root>\n</#root>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements5 = element4.siblingElements();
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str2 = document1.tagName();
        org.jsoup.nodes.Element element4 = document1.append("hi!");
        org.jsoup.nodes.Element element6 = document1.html("org.jsoup.select.Selector$SelectorParseException: hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node7 = document1.nextSibling();
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str2 = document1.tagName();
        org.jsoup.parser.Tag tag3 = document1.tag();
        org.jsoup.nodes.Element element5 = new org.jsoup.nodes.Element(tag3, "#root=\"\"");
        boolean boolean6 = element5.isBlock();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element8 = element5.wrap("<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!");
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str2 = document1.tagName();
        org.jsoup.nodes.Element element4 = document1.append("hi!");
        java.lang.String str5 = document1.outerHtml();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node6 = document1.previousSibling();
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("#root", "#root");
        java.lang.String str4 = document2.absUrl("#root=\"\"");
        document2.title("#document");
        document2.setBaseUri("<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node9 = document2.previousSibling();
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str2 = document1.tagName();
        org.jsoup.nodes.Element element4 = document1.append("hi!");
        org.jsoup.nodes.Element element6 = document1.prependText("hi!");
        document1.setBaseUri("<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int9 = document1.siblingIndex();
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str2 = document1.tagName();
        org.jsoup.nodes.Element element4 = document1.append("hi!");
        java.lang.String str5 = document1.outerHtml();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element6 = document1.lastElementSibling();
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str2 = document1.tagName();
        org.jsoup.nodes.Element element4 = document1.append("hi!");
        java.lang.String str5 = document1.outerHtml();
        java.lang.String str6 = document1.val();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int7 = document1.siblingIndex();
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str2 = document1.tagName();
        org.jsoup.nodes.Element element4 = document1.append("hi!");
        java.lang.String str5 = document1.outerHtml();
        org.jsoup.select.Elements elements6 = document1.children();
        org.jsoup.nodes.Document document8 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.select.Elements elements10 = document8.getElementsByTag("#root");
        boolean boolean11 = document1.equals((java.lang.Object) document8);
        org.jsoup.nodes.Element element13 = document8.appendText("#root");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element14 = document8.previousElementSibling();
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str2 = document1.tagName();
        org.jsoup.nodes.Element element4 = document1.append("hi!");
        java.lang.String str5 = document1.outerHtml();
        java.lang.String str6 = document1.val();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element7 = document1.firstElementSibling();
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parseBodyFragment("#root", "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.siblingNodes();
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("#document", "\n<!--#root=\"\"-->");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element3 = document2.nextElementSibling();
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("#root", "#root");
        org.jsoup.nodes.Element element4 = document2.addClass("<#root>\n</#root>");
        org.jsoup.select.Elements elements6 = element4.getElementsByAttribute("\n<!--#root=\"\"-->");
        java.lang.String str7 = element4.outerHtml();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element8 = element4.lastElementSibling();
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parseBodyFragment("#root=\"\"", "<#root>\n</#root>");
        java.lang.String str3 = document2.nodeName();
        org.jsoup.select.Elements elements5 = document2.getElementsByIndexEquals(10);
        org.jsoup.nodes.Document document8 = org.jsoup.parser.Parser.parse("", "\n<!--#root=\"\"-->");
        boolean boolean9 = document2.equals((java.lang.Object) "\n<!--#root=\"\"-->");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int10 = document2.siblingIndex();
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element18 = element17.nextElementSibling();
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str2 = document1.tagName();
        org.jsoup.parser.Tag tag3 = document1.tag();
        java.lang.String str4 = document1.outerHtml();
        java.lang.String str5 = document1.outerHtml();
        org.jsoup.nodes.Element element7 = document1.prepend("hi");
        org.jsoup.nodes.Element element8 = element7.empty();
        java.lang.String str9 = element8.tagName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node10 = element8.nextSibling();
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("", "");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements3 = document2.siblingElements();
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
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
        org.jsoup.parser.Tag tag23 = tag20.getImplicitParent();
        org.jsoup.nodes.Document document26 = org.jsoup.Jsoup.parseBodyFragment("<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>");
        org.jsoup.nodes.Element element27 = document26.body();
        org.jsoup.nodes.Attributes attributes28 = document26.attributes();
        org.jsoup.nodes.Element element29 = new org.jsoup.nodes.Element(tag23, "org.jsoup.select.Selector$SelectorParseException: <html>\n<head>\n</head>\n<body>\n</body>\n</html>", attributes28);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element30 = element29.previousElementSibling();
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("#root", "#root");
        org.jsoup.select.Elements elements5 = document2.getElementsByAttributeValueStarting("<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "#root=\"\"=\"\"");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node6 = document2.previousSibling();
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parseBodyFragment("#root=\"\"", "<#root>\n</#root>");
        java.lang.String str3 = document2.nodeName();
        org.jsoup.nodes.Element element4 = document2.empty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element5 = document2.previousElementSibling();
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test24");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str2 = document1.tagName();
        org.jsoup.parser.Tag tag3 = document1.tag();
        java.lang.String str4 = document1.outerHtml();
        java.lang.String str5 = document1.outerHtml();
        org.jsoup.nodes.Element element7 = document1.prepend("hi");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList8 = element7.siblingNodes();
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test25");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("#root", "");
        java.lang.String str3 = document2.className();
        org.jsoup.nodes.Node node6 = document2.attr("&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;hi!", "#comment");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element7 = document2.previousElementSibling();
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test26");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parse("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element2 = document1.nextElementSibling();
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test27");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str2 = document1.tagName();
        org.jsoup.nodes.Element element4 = document1.append("hi!");
        org.jsoup.nodes.Element element6 = document1.prependText("hi!");
        org.jsoup.select.Elements elements9 = document1.getElementsByAttributeValue("#root=\"\"", "#root=\"hi!\"");
        boolean boolean10 = document1.isBlock();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element11 = document1.nextElementSibling();
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test28");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element26 = document1.previousElementSibling();
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test29");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("#document");
        boolean boolean2 = document1.isBlock();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node3 = document1.previousSibling();
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test30");
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parseBodyFragment("#root=\"\"", "<#root>\n</#root>");
        java.lang.String str3 = document2.toString();
        java.lang.String str4 = document2.nodeName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements5 = document2.siblingElements();
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test31");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str2 = document1.tagName();
        org.jsoup.nodes.Element element4 = document1.append("hi!");
        org.jsoup.nodes.Element element6 = document1.html("org.jsoup.select.Selector$SelectorParseException: hi!");
        org.jsoup.nodes.Element element8 = document1.prependText("<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        document1.title("\n<#root class=\"\">\n</#root>");
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test32");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("", "\n<!--#root=\"\"-->");
        org.jsoup.select.Elements elements5 = document2.getElementsByAttributeValueContaining("\n<!--#root=\"\"-->", "#root=\"hi!\"");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node6 = document2.nextSibling();
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test33");
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parseBodyFragment("#root=\"\"", "<#root>\n</#root>");
        java.lang.String str3 = document2.nodeName();
        org.jsoup.select.Elements elements5 = document2.getElementsByIndexEquals(10);
        org.jsoup.nodes.Document document8 = org.jsoup.parser.Parser.parse("", "\n<!--#root=\"\"-->");
        boolean boolean9 = document2.equals((java.lang.Object) "\n<!--#root=\"\"-->");
        boolean boolean10 = document2.hasText();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element11 = document2.lastElementSibling();
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test34");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("#root");
        boolean boolean2 = document1.hasText();
        org.jsoup.select.Elements elements4 = document1.getElementsByIndexEquals(10);
        org.jsoup.select.Elements elements7 = document1.getElementsByAttributeValueEnding("<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!", "hi!");
        org.jsoup.nodes.Element element9 = document1.val("<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element11 = element9.wrap("<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>");
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test35");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("#root", "#root");
        java.lang.String str3 = document2.nodeName();
        org.jsoup.nodes.Element element5 = document2.text("<html>\n <head>\n </head>\n <body>\n </body>\n</html>hi!\n<head>\n </head>\n <body>\n </body>\n\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element6 = element5.nextElementSibling();
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test36");
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parseBodyFragment("#root=\"\"", "<#root>\n</#root>");
        java.lang.String str3 = document2.toString();
        java.lang.String str4 = document2.nodeName();
        java.lang.String str5 = document2.outerHtml();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList6 = document2.siblingNodes();
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test37");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str2 = document1.tagName();
        org.jsoup.parser.Tag tag3 = document1.tag();
        java.lang.String str4 = document1.outerHtml();
        java.lang.String str5 = document1.outerHtml();
        java.lang.String str6 = document1.title();
        org.jsoup.nodes.Element element7 = document1.empty();
        org.jsoup.nodes.Element element9 = element7.append("#root=\"\"=\"\"");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements10 = element9.siblingElements();
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test38");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("#root", "#root");
        org.jsoup.nodes.Element element4 = document2.addClass("<#root>\n</#root>");
        org.jsoup.nodes.Element element6 = document2.append("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.lang.String str7 = element6.nodeName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node8 = element6.nextSibling();
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test39");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str2 = document1.tagName();
        java.lang.String str3 = document1.html();
        org.jsoup.nodes.Element element5 = document1.append("#root=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;\"");
        java.util.Set<java.lang.String> strSet6 = element5.classNames();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node7 = element5.nextSibling();
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test40");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element24 = element20.firstElementSibling();
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test41");
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
        document25.remove();
        org.jsoup.nodes.Document document35 = org.jsoup.nodes.Document.createShell("&lt;?#root=&quot;&amp;lt;html&amp;gt; &amp;lt;head&amp;gt; &amp;lt;/head&amp;gt; &amp;lt;body&amp;gt; &amp;lt;/body&amp;gt; &amp;lt;/html&amp;gt;&quot;&gt;");
        java.util.Set<java.lang.String> strSet36 = document35.classNames();
        org.jsoup.nodes.Element element37 = document25.classNames(strSet36);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node38 = document25.nextSibling();
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test42");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("#declaration");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element2 = document1.firstElementSibling();
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test43");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("#root", "#root");
        org.jsoup.nodes.Element element4 = document2.addClass("<#root>\n</#root>");
        org.jsoup.nodes.Element element6 = document2.append("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.lang.String str7 = document2.title();
        org.jsoup.nodes.Element element8 = document2.empty();
        org.jsoup.nodes.Element element10 = document2.createElement("<?<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int11 = element10.siblingIndex();
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test44");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("#root", "#root");
        org.jsoup.nodes.Element element4 = document2.addClass("<#root>\n</#root>");
        org.jsoup.nodes.Element element6 = document2.append("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.lang.String str7 = document2.title();
        org.jsoup.nodes.Element element8 = document2.empty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element9 = element8.nextElementSibling();
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test45");
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parseBodyFragment("#root=\"\"", "<#root>\n</#root>");
        java.lang.String str3 = document2.nodeName();
        org.jsoup.select.Elements elements5 = document2.getElementsByIndexEquals(10);
        java.lang.String str6 = document2.toString();
        org.jsoup.nodes.Element element8 = document2.append("hi!");
        org.jsoup.nodes.Element element10 = document2.createElement("org.jsoup.select.Selector$SelectorParseException: <#root>\n</#root>");
        org.jsoup.nodes.Element element13 = element10.attr(" #root=\"hi!\"=\"#root\" #comment=\"#root=&quot;&quot;=&quot;&quot;\" #root=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;hi!\" <html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!=\"#root=&quot;hi!&quot;\"", "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element14 = element13.lastElementSibling();
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test46");
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parseBodyFragment("#root=\"\"", "<#root>\n</#root>");
        java.lang.String str3 = document2.nodeName();
        org.jsoup.select.Elements elements5 = document2.getElementsByIndexEquals(10);
        org.jsoup.nodes.Element element7 = document2.append("<!<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!>");
        java.lang.String str8 = element7.data();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element9 = element7.previousElementSibling();
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test47");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str2 = document1.tagName();
        org.jsoup.nodes.Element element4 = document1.append("hi!");
        java.lang.String str5 = document1.outerHtml();
        org.jsoup.nodes.Element element7 = document1.prependText("#root=&quot;&quot;");
        java.lang.String str8 = element7.baseUri();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element9 = element7.firstElementSibling();
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test48");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("#root", "#root");
        java.lang.String str3 = document2.nodeName();
        org.jsoup.nodes.Element element5 = document2.text("<html>\n <head>\n </head>\n <body>\n </body>\n</html>hi!\n<head>\n </head>\n <body>\n </body>\n\n");
        org.jsoup.nodes.Document document7 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str8 = document7.tagName();
        java.lang.String str9 = document7.html();
        org.jsoup.nodes.Element element11 = document7.append("#root=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;\"");
        java.util.Set<java.lang.String> strSet12 = element11.classNames();
        org.jsoup.nodes.Element element13 = document2.classNames(strSet12);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element14 = element13.lastElementSibling();
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test49");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element3 = document1.prependElement("hi!");
        org.jsoup.nodes.Document document6 = org.jsoup.parser.Parser.parseBodyFragment("#root", "#root");
        org.jsoup.nodes.Element element8 = document6.addClass("<#root>\n</#root>");
        element3.replaceWith((org.jsoup.nodes.Node) document6);
        org.jsoup.nodes.Document document11 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str12 = document11.tagName();
        java.lang.String str13 = document11.html();
        org.jsoup.nodes.Element element15 = document11.append("hi!");
        org.jsoup.nodes.Element element16 = element15.parent();
        java.util.Set<java.lang.String> strSet17 = element15.classNames();
        org.jsoup.nodes.Element element18 = element3.classNames(strSet17);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element19 = element18.firstElementSibling();
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test50");
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parse("ohi!", "org.jsoup.select.Selector$SelectorParseException: org.jsoup.select.Selector$SelectorParseException: <html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int3 = document2.siblingIndex();
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test51");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("#root", "");
        org.jsoup.select.Elements elements4 = document2.getElementsByClass("<html>\n<head>\n</head>\n<body>\n #root\n</body>\n</html>");
        org.jsoup.nodes.Element element6 = document2.html("[<, !, <, h, t, m, l, >, \n, <, h, e, a, d, >, \n, <, /, h, e, a, d, >, \n, <, b, o, d, y, >, \n, <, /, b, o, d, y, >, \n, <, /, h, t, m, l, >, h, i, !, >]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node7 = element6.previousSibling();
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test52");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element15 = element14.nextElementSibling();
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test53");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("#root", "#root");
        java.lang.String str4 = document2.absUrl("#root=\"\"");
        document2.title("#document");
        org.jsoup.select.Elements elements8 = document2.getElementsByClass("<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element9 = document2.previousElementSibling();
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test54");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment(" text=\"hi!\"", "&lt;html&gt;\n &lt;head&gt;\n &lt;/head&gt;\n &lt;body&gt;\n &lt;/body&gt;\n&lt;/html&gt;hi!\n\n&lt;html&gt;\n &lt;head&gt;\n &lt;/head&gt;\n &lt;body&gt;\n &lt;/body&gt;\n&lt;/html&gt;\n\n &lt;head&gt;\n &lt;/head&gt;\n\n &lt;body&gt;\n &lt;/body&gt;");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element3 = document2.nextElementSibling();
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test55");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("#root", "#root");
        java.lang.String str4 = document2.absUrl("#root=\"\"");
        document2.title("#document");
        org.jsoup.select.Elements elements8 = document2.getElementsByClass("<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>");
        org.jsoup.nodes.Element element10 = document2.addClass("<html>\n<head>\n</head>\n<body>\n org.jsoup.select.Selector$SelectorParseException: hi!\n <html> \n  <head> \n  </head> \n  <body>  \n  </body>\n </html>\n</body>\n</html>");
        org.jsoup.select.Elements elements12 = document2.getElementsByTag("org.jsoup.select.Selector$SelectorParseException: hi!<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element14 = document2.createElement("[]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList15 = element14.siblingNodes();
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test56");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int25 = element6.siblingIndex();
    }

    @Test
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test57");
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
        org.jsoup.nodes.Element element18 = new org.jsoup.nodes.Element(tag8, "<?<html>\n<head>\n</head>\n<body>\n</body>\n</html>>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element20 = element18.wrap("<html>\n <head>\n </head>\n <body>\n </body>\n</html>hi!\n<head>\n </head>\n <body>\n </body>\n\n");
    }

    @Test
    public void test58() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test58");
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parseBodyFragment("#root=\"\"", "<#root>\n</#root>");
        java.lang.String str3 = document2.toString();
        java.lang.String str4 = document2.nodeName();
        document2.title("<#root>\n</#root>=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;\"");
        java.lang.String str7 = document2.className();
        boolean boolean9 = document2.hasClass("#root=&quot;&quot;");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node10 = document2.previousSibling();
    }

    @Test
    public void test59() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test59");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element20 = element19.previousElementSibling();
    }

    @Test
    public void test60() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test60");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("", "aorg");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element3 = document2.lastElementSibling();
    }

    @Test
    public void test61() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test61");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("<html>\n <head>\n </head>\n <body>\n </body>\n</html>hi!\n\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n\n <head>\n </head>\n\n <body>\n </body>", "#root=\"\"=\"\"");
        org.jsoup.nodes.Element element4 = document2.prepend("<html>\n <head>\n </head>\n <body>\n </body>\n</html>hi!<<?<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!>>\n</<?<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!>>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements5 = element4.siblingElements();
    }

    @Test
    public void test62() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test62");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("[., j, s, o, u, p, ., s, e, l, e, c, t, ., S, e, l, e, c, t, o, r, $, S, e, l, e, c, t, o, r, P, a, r, s, e, E, x, c, e, p, t, i, o, n, :,  , h, i, !, <, h, t, m, l, >, \n, <, h, e, a, d, >, \n, <, /, h, e, a, d, >, \n, <, b, o, d, y, >, \n, <, /, b, o, d, y, >, \n, <, /, h, t, m, l, >]");
        java.lang.String str2 = document1.title();
        org.jsoup.nodes.Element element4 = document1.html("#root=\"\"=\"\"");
        org.jsoup.select.Elements elements7 = document1.getElementsByAttributeValue("[!]", "<html>\n<head>\n <title>#document</title>\n</head>\n<body>\n #root\n</body>\n</html>");
        org.jsoup.select.Elements elements10 = document1.getElementsByAttributeValue("#root", " text=\"hi!\" #root=\"\"=\"\"=\"\n&lt;!--#root=&quot;&quot;--&gt;\"");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element12 = document1.text("org.jsoup.select.selector$selectorparseexception: <#root>\n</#root>");
    }

    @Test
    public void test63() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test63");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element3 = document1.prependElement("hi!");
        org.jsoup.nodes.Element element4 = document1.empty();
        org.jsoup.nodes.Element element6 = element4.toggleClass("");
        org.jsoup.nodes.Element element7 = element4.empty();
        org.jsoup.nodes.Element element9 = element7.prepend("[o, h, i, !]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int10 = element7.siblingIndex();
    }

    @Test
    public void test64() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test64");
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parse("#root=\"\"=\"\"", "#data");
        org.jsoup.nodes.Element element4 = document2.createElement("#root=\"hi!\"");
        org.jsoup.select.Elements elements7 = document2.getElementsByAttributeValueNot("ohi!", "#comment");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element8 = document2.lastElementSibling();
    }

    @Test
    public void test65() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test65");
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parseBodyFragment("<#root>\n</#root>", "!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element3 = document2.lastElementSibling();
    }

    @Test
    public void test66() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test66");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("#root", "#root");
        java.lang.String str3 = document2.nodeName();
        org.jsoup.nodes.Element element5 = document2.text("<html>\n <head>\n </head>\n <body>\n </body>\n</html>hi!\n<head>\n </head>\n <body>\n </body>\n\n");
        org.jsoup.nodes.Element element6 = document2.body();
        java.lang.String str7 = document2.className();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements8 = document2.siblingElements();
    }

    @Test
    public void test67() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test67");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("#root", "#root");
        java.lang.String str4 = document2.absUrl("#root=\"\"");
        document2.title("#document");
        document2.setBaseUri("<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!");
        java.lang.String str9 = document2.title();
        org.jsoup.nodes.Element element10 = document2.empty();
        org.jsoup.nodes.Element element13 = document2.attr("org", "hi\n<!--#root=\"\"-->org.jsoup.select.Selector$SelectorParseException: hi!<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element14 = document2.nextElementSibling();
    }

    @Test
    public void test68() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test68");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("org.jsoup.select.Selector$SelectorParseException: hi!<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element3 = document1.text("<?#root=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;\">");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node4 = element3.previousSibling();
    }

    @Test
    public void test69() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test69");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str2 = document1.tagName();
        java.lang.String str3 = document1.html();
        org.jsoup.nodes.Element element5 = document1.append("hi!");
        org.jsoup.select.Elements elements7 = element5.getElementsByIndexLessThan((int) (short) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element8 = element5.lastElementSibling();
    }

    @Test
    public void test70() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test70");
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parse("&lt;?#root=&quot;&amp;lt;html&amp;gt; &amp;lt;head&amp;gt; &amp;lt;/head&amp;gt; &amp;lt;body&amp;gt; &amp;lt;/body&amp;gt; &amp;lt;/html&amp;gt;&quot;&gt;", "<html>\n<head>\n</head>\n<body> #root\n</body>\n</html>");
        org.jsoup.nodes.Element element4 = document2.appendElement("#root=&quot;&quot;");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements5 = document2.siblingElements();
    }

    @Test
    public void test71() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test71");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("#root", "");
        org.jsoup.select.Elements elements4 = document2.getElementsByClass("<html>\n<head>\n</head>\n<body>\n #root\n</body>\n</html>");
        org.jsoup.nodes.Element element6 = document2.html("[<, !, <, h, t, m, l, >, \n, <, h, e, a, d, >, \n, <, /, h, e, a, d, >, \n, <, b, o, d, y, >, \n, <, /, b, o, d, y, >, \n, <, /, h, t, m, l, >, h, i, !, >]");
        java.lang.String str8 = element6.absUrl("<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node9 = element6.nextSibling();
    }
}

