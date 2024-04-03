package org.jsoup.parser;

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
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements3 = document1.getElementsByTag("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int4 = document1.siblingIndex();
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test002");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Document document3 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements5 = document3.getElementsByTag("hi!");
        org.jsoup.select.Elements elements6 = elements5.parents();
        org.jsoup.nodes.Document document8 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements10 = document8.getElementsByTag("hi!");
        boolean boolean11 = elements6.addAll((java.util.Collection<org.jsoup.nodes.Element>) elements10);
        boolean boolean12 = document1.equals((java.lang.Object) elements6);
        java.lang.String str13 = document1.toString();
        org.jsoup.nodes.Element element15 = document1.addClass("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList16 = element15.siblingNodes();
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test003");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("", "");
        org.jsoup.nodes.Attributes attributes3 = document2.attributes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList4 = document2.siblingNodes();
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test004");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("", "");
        org.jsoup.nodes.Attributes attributes3 = document2.attributes();
        org.jsoup.nodes.Element element5 = document2.prependText("hi!");
        org.jsoup.nodes.Element element7 = element5.append("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node8 = element7.nextSibling();
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test005");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Document document3 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements5 = document3.getElementsByTag("hi!");
        org.jsoup.select.Elements elements6 = elements5.parents();
        org.jsoup.nodes.Document document8 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements10 = document8.getElementsByTag("hi!");
        boolean boolean11 = elements6.addAll((java.util.Collection<org.jsoup.nodes.Element>) elements10);
        boolean boolean12 = document1.equals((java.lang.Object) elements6);
        java.lang.String str13 = document1.toString();
        org.jsoup.nodes.Element element15 = document1.addClass("");
        org.jsoup.nodes.Element element17 = document1.createElement("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node18 = document1.previousSibling();
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test006");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Document document3 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements5 = document3.getElementsByTag("hi!");
        org.jsoup.select.Elements elements6 = elements5.parents();
        org.jsoup.nodes.Document document8 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements10 = document8.getElementsByTag("hi!");
        boolean boolean11 = elements6.addAll((java.util.Collection<org.jsoup.nodes.Element>) elements10);
        boolean boolean12 = document1.equals((java.lang.Object) elements6);
        java.lang.String str13 = document1.toString();
        org.jsoup.nodes.Element element15 = document1.addClass("");
        org.jsoup.select.Elements elements16 = element15.getAllElements();
        org.jsoup.nodes.Element element17 = element15.parent();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node18 = element15.nextSibling();
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test007");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("", "");
        org.jsoup.nodes.Attributes attributes3 = document2.attributes();
        java.lang.String str4 = document2.html();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element5 = document2.lastElementSibling();
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test008");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueContaining(" class=\"\"", "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element6 = document1.text("#root");
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test009");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("", "");
        org.jsoup.nodes.Attributes attributes3 = document2.attributes();
        org.jsoup.nodes.Element element5 = document2.prependText("hi!");
        org.jsoup.nodes.Element element7 = element5.append("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element8 = element5.previousElementSibling();
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test010");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("", "");
        org.jsoup.nodes.Attributes attributes3 = document2.attributes();
        org.jsoup.nodes.Element element5 = document2.prependText("hi!");
        org.jsoup.nodes.Element element7 = element5.append("hi!");
        org.jsoup.nodes.Element element9 = element5.removeClass("");
        boolean boolean10 = element5.hasText();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element11 = element5.lastElementSibling();
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test011");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        boolean boolean3 = document1.equals((java.lang.Object) (-1));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element5 = document1.wrap("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test012");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("", "");
        org.jsoup.nodes.Attributes attributes3 = document2.attributes();
        java.lang.String str4 = document2.html();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element5 = document2.previousElementSibling();
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test013");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("<html> \n<head> \n</head> \n<body>  \n</body>\n</html>", "");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element3 = document2.lastElementSibling();
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test014");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Document document3 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements5 = document3.getElementsByTag("hi!");
        org.jsoup.select.Elements elements6 = elements5.parents();
        org.jsoup.nodes.Document document8 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements10 = document8.getElementsByTag("hi!");
        boolean boolean11 = elements6.addAll((java.util.Collection<org.jsoup.nodes.Element>) elements10);
        boolean boolean12 = document1.equals((java.lang.Object) elements6);
        java.lang.String str13 = document1.toString();
        org.jsoup.nodes.Element element15 = document1.addClass("");
        org.jsoup.nodes.Element element17 = document1.createElement("hi!");
        boolean boolean18 = element17.isBlock();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element19 = element17.lastElementSibling();
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test015");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("", "");
        org.jsoup.nodes.Attributes attributes3 = document2.attributes();
        org.jsoup.nodes.Element element5 = document2.prependText("hi!");
        org.jsoup.nodes.Element element7 = element5.val("#document");
        org.jsoup.select.Elements elements9 = element7.getElementsByTag("#document");
        org.jsoup.nodes.Element element11 = element7.append("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!");
        org.jsoup.nodes.Element element13 = element11.addClass("org.jsoup.select.Selector$SelectorParseException: ");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements14 = element13.siblingElements();
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test016");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Document document3 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements5 = document3.getElementsByTag("hi!");
        org.jsoup.select.Elements elements6 = elements5.parents();
        org.jsoup.nodes.Document document8 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements10 = document8.getElementsByTag("hi!");
        boolean boolean11 = elements6.addAll((java.util.Collection<org.jsoup.nodes.Element>) elements10);
        boolean boolean12 = document1.equals((java.lang.Object) elements6);
        java.lang.String str13 = document1.toString();
        org.jsoup.nodes.Element element15 = document1.addClass("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        document1.title("#data");
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test017");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("", "");
        org.jsoup.nodes.Attributes attributes3 = document2.attributes();
        org.jsoup.nodes.Element element5 = document2.prependText("hi!");
        org.jsoup.nodes.Element element7 = element5.append("hi!");
        org.jsoup.nodes.Element element9 = element7.addClass("");
        java.lang.String str10 = element9.outerHtml();
        org.jsoup.nodes.Element element12 = element9.prepend("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.select.Elements elements15 = element9.getElementsByAttributeValueStarting("<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "org.jsoup.select.Selector$SelectorParseException: ");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList16 = element9.siblingNodes();
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test018");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("", "");
        org.jsoup.nodes.Attributes attributes3 = document2.attributes();
        org.jsoup.nodes.Element element5 = document2.prependText("hi!");
        org.jsoup.nodes.Element element7 = element5.append("hi!");
        org.jsoup.nodes.Document document10 = org.jsoup.parser.Parser.parse("", "");
        org.jsoup.nodes.Attributes attributes11 = document10.attributes();
        org.jsoup.nodes.Element element13 = document10.prependText("hi!");
        org.jsoup.nodes.Element element15 = element13.append("hi!");
        java.lang.String str16 = element15.nodeName();
        org.jsoup.nodes.Element element17 = element5.appendChild((org.jsoup.nodes.Node) element15);
        java.lang.String str18 = element17.data();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node19 = element17.previousSibling();
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test019");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("", "");
        org.jsoup.nodes.Attributes attributes3 = document2.attributes();
        org.jsoup.nodes.Element element5 = document2.prependText("hi!");
        org.jsoup.nodes.Element element7 = element5.append("hi!");
        org.jsoup.nodes.Document document10 = org.jsoup.parser.Parser.parse("", "");
        org.jsoup.nodes.Attributes attributes11 = document10.attributes();
        org.jsoup.nodes.Element element13 = document10.prependText("hi!");
        org.jsoup.nodes.Element element15 = element13.append("hi!");
        java.lang.String str16 = element15.nodeName();
        org.jsoup.nodes.Element element17 = element5.appendChild((org.jsoup.nodes.Node) element15);
        org.jsoup.select.Elements elements18 = element17.getAllElements();
        java.lang.String[] strArray21 = new java.lang.String[] { "#comment", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet22 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet22, strArray21);
        org.jsoup.nodes.Element element24 = element17.classNames((java.util.Set<java.lang.String>) strSet22);
        org.jsoup.nodes.Element element26 = element24.prepend("[]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element27 = element24.lastElementSibling();
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test020");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements3 = document1.getElementsByTag("hi!");
        java.lang.String str4 = document1.tagName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        document1.title("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test021");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Document document3 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements5 = document3.getElementsByTag("hi!");
        org.jsoup.select.Elements elements6 = elements5.parents();
        org.jsoup.nodes.Document document8 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements10 = document8.getElementsByTag("hi!");
        boolean boolean11 = elements6.addAll((java.util.Collection<org.jsoup.nodes.Element>) elements10);
        boolean boolean12 = document1.equals((java.lang.Object) elements6);
        java.lang.String str13 = document1.toString();
        org.jsoup.nodes.Element element15 = document1.addClass("");
        org.jsoup.nodes.Element element17 = document1.prepend("");
        java.lang.String str18 = element17.toString();
        org.jsoup.nodes.Element element21 = element17.attr("hi! hi!hi! hi!    hi! hi!   ", "#root");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node22 = element21.previousSibling();
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test022");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        boolean boolean3 = document1.hasAttr("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        document1.title(".");
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test023");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse(" class=\"\"", "org.jsoup.select.Selector$SelectorParseException: ");
        boolean boolean3 = document2.hasText();
        java.lang.String str4 = document2.title();
        document2.setBaseUri("#root=\"\"");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node7 = document2.previousSibling();
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test024");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("", "");
        org.jsoup.nodes.Attributes attributes3 = document2.attributes();
        org.jsoup.nodes.Element element5 = document2.prependText("hi!");
        org.jsoup.nodes.Element element7 = element5.val("#document");
        org.jsoup.select.Elements elements9 = element7.getElementsByTag("#document");
        org.jsoup.nodes.Element element11 = element7.append("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!");
        org.jsoup.nodes.Element element13 = element11.addClass("org.jsoup.select.Selector$SelectorParseException: ");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element14 = element11.firstElementSibling();
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test025");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("", "");
        org.jsoup.nodes.Attributes attributes3 = document2.attributes();
        org.jsoup.nodes.Element element5 = document2.prependText("hi!");
        org.jsoup.nodes.Element element7 = element5.append("hi!");
        org.jsoup.nodes.Document document10 = org.jsoup.parser.Parser.parse("", "");
        org.jsoup.nodes.Attributes attributes11 = document10.attributes();
        org.jsoup.nodes.Element element13 = document10.prependText("hi!");
        org.jsoup.nodes.Element element15 = element13.append("hi!");
        java.lang.String str16 = element15.nodeName();
        org.jsoup.nodes.Element element17 = element5.appendChild((org.jsoup.nodes.Node) element15);
        element17.setBaseUri("");
        org.jsoup.select.Elements elements22 = element17.getElementsByAttributeValue("#document", "<html> \n<head> \n</head> \n<body>  \n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element23 = element17.firstElementSibling();
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test026");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("#comment", "org.jsoup.select.Selector$SelectorParseException: ");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("<!class=\"\">");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node5 = textNode2.previousSibling();
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test027");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("", "");
        org.jsoup.nodes.Attributes attributes3 = document2.attributes();
        org.jsoup.nodes.Element element5 = document2.prependText("hi!");
        org.jsoup.nodes.Element element7 = element5.val("#document");
        org.jsoup.select.Elements elements9 = element7.getElementsByTag("#document");
        org.jsoup.nodes.Element element11 = element7.append("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element12 = element7.nextElementSibling();
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test028");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Document document3 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements5 = document3.getElementsByTag("hi!");
        org.jsoup.select.Elements elements6 = elements5.parents();
        org.jsoup.nodes.Document document8 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements10 = document8.getElementsByTag("hi!");
        boolean boolean11 = elements6.addAll((java.util.Collection<org.jsoup.nodes.Element>) elements10);
        boolean boolean12 = document1.equals((java.lang.Object) elements6);
        java.lang.String str13 = document1.toString();
        org.jsoup.nodes.Element element15 = document1.addClass("");
        org.jsoup.nodes.Element element16 = element15.empty();
        org.jsoup.nodes.Element element18 = element16.prepend("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node19 = element18.previousSibling();
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test029");
        org.jsoup.select.Elements elements0 = new org.jsoup.select.Elements();
        java.lang.Object[] objArray1 = elements0.toArray();
        org.jsoup.nodes.Document document3 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements5 = document3.getElementsByTag("hi!");
        org.jsoup.select.Elements elements6 = elements5.parents();
        boolean boolean7 = elements0.addAll((java.util.Collection<org.jsoup.nodes.Element>) elements5);
        org.jsoup.select.Elements elements9 = elements5.eq((int) (byte) 0);
        org.jsoup.nodes.Document document11 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements14 = document11.getElementsByAttributeValueContaining(" class=\"\"", "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        boolean boolean15 = elements9.remove((java.lang.Object) document11);
        org.jsoup.nodes.Element element17 = document11.append(" class=\"\"");
        java.lang.String str18 = element17.nodeName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element19 = element17.lastElementSibling();
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test030");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueContaining(" class=\"\"", "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element7 = document1.attr("#root", " class=\"\"");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element8 = element7.lastElementSibling();
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test031");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Document document3 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements5 = document3.getElementsByTag("hi!");
        org.jsoup.select.Elements elements6 = elements5.parents();
        org.jsoup.nodes.Document document8 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements10 = document8.getElementsByTag("hi!");
        boolean boolean11 = elements6.addAll((java.util.Collection<org.jsoup.nodes.Element>) elements10);
        boolean boolean12 = document1.equals((java.lang.Object) elements6);
        java.lang.String str13 = document1.toString();
        org.jsoup.nodes.Node node16 = document1.attr("hi!", "");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList17 = document1.siblingNodes();
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test032");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Document document3 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements5 = document3.getElementsByTag("hi!");
        org.jsoup.select.Elements elements6 = elements5.parents();
        org.jsoup.nodes.Document document8 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements10 = document8.getElementsByTag("hi!");
        boolean boolean11 = elements6.addAll((java.util.Collection<org.jsoup.nodes.Element>) elements10);
        boolean boolean12 = document1.equals((java.lang.Object) elements6);
        java.lang.String str13 = document1.toString();
        org.jsoup.nodes.Element element15 = document1.addClass("");
        org.jsoup.nodes.Element element17 = document1.prepend("");
        org.jsoup.nodes.Element element19 = document1.prependText("");
        org.jsoup.parser.Tag tag20 = document1.tag();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        document1.title("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!<#root>\nhi!\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>hi!\n</#root>");
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test033");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Document document3 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements5 = document3.getElementsByTag("hi!");
        org.jsoup.select.Elements elements6 = elements5.parents();
        org.jsoup.nodes.Document document8 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements10 = document8.getElementsByTag("hi!");
        boolean boolean11 = elements6.addAll((java.util.Collection<org.jsoup.nodes.Element>) elements10);
        boolean boolean12 = document1.equals((java.lang.Object) elements6);
        java.lang.String str13 = document1.toString();
        org.jsoup.nodes.Element element15 = document1.addClass("");
        org.jsoup.nodes.Element element17 = document1.prepend("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        document1.title("");
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test034");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("#comment", "org.jsoup.select.Selector$SelectorParseException: ");
        java.lang.String str3 = textNode2.text();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node4 = textNode2.nextSibling();
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test035");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element3 = document1.text("#text=\"\"");
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test036");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        org.jsoup.parser.Tag tag2 = document1.tag();
        org.jsoup.nodes.Document document4 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Document document6 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements8 = document6.getElementsByTag("hi!");
        org.jsoup.select.Elements elements9 = elements8.parents();
        org.jsoup.nodes.Document document11 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements13 = document11.getElementsByTag("hi!");
        boolean boolean14 = elements9.addAll((java.util.Collection<org.jsoup.nodes.Element>) elements13);
        boolean boolean15 = document4.equals((java.lang.Object) elements9);
        java.lang.String str16 = document4.toString();
        org.jsoup.nodes.Element element18 = document4.addClass("");
        org.jsoup.nodes.Element element20 = document4.prepend("");
        java.lang.String str21 = element20.toString();
        org.jsoup.nodes.Element element24 = element20.attr("hi! hi!hi! hi!    hi! hi!   ", "#root");
        org.jsoup.nodes.Element element25 = document1.appendChild((org.jsoup.nodes.Node) element24);
        org.jsoup.nodes.Element element27 = element25.prepend(".jsoup.select.Selector$SelectorParseException: ");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node28 = element25.previousSibling();
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test037");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements3 = document1.getElementsByTag("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element5 = document1.text(" class=\"\"");
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test038");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Document document3 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements5 = document3.getElementsByTag("hi!");
        org.jsoup.select.Elements elements6 = elements5.parents();
        org.jsoup.nodes.Document document8 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements10 = document8.getElementsByTag("hi!");
        boolean boolean11 = elements6.addAll((java.util.Collection<org.jsoup.nodes.Element>) elements10);
        boolean boolean12 = document1.equals((java.lang.Object) elements6);
        java.lang.String str13 = document1.toString();
        org.jsoup.nodes.Element element15 = document1.addClass("");
        org.jsoup.nodes.Attributes attributes16 = element15.attributes();
        java.lang.String str17 = attributes16.toString();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator18 = attributes16.spliterator();
        org.jsoup.nodes.Document document20 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Document document22 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements24 = document22.getElementsByTag("hi!");
        org.jsoup.select.Elements elements25 = elements24.parents();
        org.jsoup.nodes.Document document27 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements29 = document27.getElementsByTag("hi!");
        boolean boolean30 = elements25.addAll((java.util.Collection<org.jsoup.nodes.Element>) elements29);
        boolean boolean31 = document20.equals((java.lang.Object) elements25);
        java.lang.String str32 = document20.toString();
        org.jsoup.nodes.Element element34 = document20.addClass("");
        boolean boolean35 = attributes16.equals((java.lang.Object) document20);
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor36 = attributes16.iterator();
        org.jsoup.nodes.Document document38 = new org.jsoup.nodes.Document("hi!");
        boolean boolean40 = document38.hasAttr("");
        org.jsoup.nodes.Document document42 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Document document44 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements46 = document44.getElementsByTag("hi!");
        org.jsoup.select.Elements elements47 = elements46.parents();
        org.jsoup.nodes.Document document49 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements51 = document49.getElementsByTag("hi!");
        boolean boolean52 = elements47.addAll((java.util.Collection<org.jsoup.nodes.Element>) elements51);
        boolean boolean53 = document42.equals((java.lang.Object) elements47);
        java.lang.String str54 = document42.toString();
        org.jsoup.nodes.Element element56 = document42.addClass("");
        org.jsoup.nodes.Element element58 = document42.prepend("");
        org.jsoup.nodes.Element element59 = document38.prependChild((org.jsoup.nodes.Node) document42);
        java.lang.String str60 = element59.id();
        boolean boolean61 = attributes16.equals((java.lang.Object) element59);
        org.jsoup.select.Elements elements62 = element59.parents();
        java.lang.String str63 = element59.val();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element64 = element59.previousElementSibling();
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test039");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Document document3 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements5 = document3.getElementsByTag("hi!");
        org.jsoup.select.Elements elements6 = elements5.parents();
        org.jsoup.nodes.Document document8 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements10 = document8.getElementsByTag("hi!");
        boolean boolean11 = elements6.addAll((java.util.Collection<org.jsoup.nodes.Element>) elements10);
        boolean boolean12 = document1.equals((java.lang.Object) elements6);
        java.lang.String str13 = document1.toString();
        org.jsoup.nodes.Element element15 = document1.addClass("");
        org.jsoup.nodes.Attributes attributes16 = element15.attributes();
        java.lang.String str17 = attributes16.toString();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator18 = attributes16.spliterator();
        org.jsoup.nodes.Document document20 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Document document22 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements24 = document22.getElementsByTag("hi!");
        org.jsoup.select.Elements elements25 = elements24.parents();
        org.jsoup.nodes.Document document27 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements29 = document27.getElementsByTag("hi!");
        boolean boolean30 = elements25.addAll((java.util.Collection<org.jsoup.nodes.Element>) elements29);
        boolean boolean31 = document20.equals((java.lang.Object) elements25);
        java.lang.String str32 = document20.toString();
        org.jsoup.nodes.Element element34 = document20.addClass("");
        boolean boolean35 = attributes16.equals((java.lang.Object) document20);
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor36 = attributes16.iterator();
        org.jsoup.nodes.Document document38 = new org.jsoup.nodes.Document("hi!");
        boolean boolean40 = document38.hasAttr("");
        org.jsoup.nodes.Document document42 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Document document44 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements46 = document44.getElementsByTag("hi!");
        org.jsoup.select.Elements elements47 = elements46.parents();
        org.jsoup.nodes.Document document49 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements51 = document49.getElementsByTag("hi!");
        boolean boolean52 = elements47.addAll((java.util.Collection<org.jsoup.nodes.Element>) elements51);
        boolean boolean53 = document42.equals((java.lang.Object) elements47);
        java.lang.String str54 = document42.toString();
        org.jsoup.nodes.Element element56 = document42.addClass("");
        org.jsoup.nodes.Element element58 = document42.prepend("");
        org.jsoup.nodes.Element element59 = document38.prependChild((org.jsoup.nodes.Node) document42);
        java.lang.String str60 = element59.id();
        boolean boolean61 = attributes16.equals((java.lang.Object) element59);
        org.jsoup.nodes.Element element63 = element59.append(".");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int64 = element59.siblingIndex();
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test040");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Document document3 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements5 = document3.getElementsByTag("hi!");
        org.jsoup.select.Elements elements6 = elements5.parents();
        org.jsoup.nodes.Document document8 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements10 = document8.getElementsByTag("hi!");
        boolean boolean11 = elements6.addAll((java.util.Collection<org.jsoup.nodes.Element>) elements10);
        boolean boolean12 = document1.equals((java.lang.Object) elements6);
        java.lang.String str13 = document1.toString();
        org.jsoup.nodes.Element element15 = document1.addClass("");
        org.jsoup.nodes.Element element17 = document1.createElement("hi!");
        boolean boolean18 = element17.isBlock();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node19 = element17.nextSibling();
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test041");
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parseBodyFragment("hi!", "hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!");
        org.jsoup.select.Elements elements4 = document2.getElementsByIndexGreaterThan((int) (byte) 100);
        org.jsoup.nodes.Element element5 = document2.body();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element6 = document2.previousElementSibling();
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test042");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Document document3 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements5 = document3.getElementsByTag("hi!");
        org.jsoup.select.Elements elements6 = elements5.parents();
        org.jsoup.nodes.Document document8 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements10 = document8.getElementsByTag("hi!");
        boolean boolean11 = elements6.addAll((java.util.Collection<org.jsoup.nodes.Element>) elements10);
        boolean boolean12 = document1.equals((java.lang.Object) elements6);
        java.lang.String str13 = document1.toString();
        org.jsoup.nodes.Element element15 = document1.addClass("");
        org.jsoup.nodes.Element element16 = element15.empty();
        java.lang.String str18 = element15.absUrl("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!");
        java.lang.String str19 = element15.outerHtml();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element20 = element15.lastElementSibling();
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test043");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Document document3 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements5 = document3.getElementsByTag("hi!");
        org.jsoup.select.Elements elements6 = elements5.parents();
        org.jsoup.nodes.Document document8 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements10 = document8.getElementsByTag("hi!");
        boolean boolean11 = elements6.addAll((java.util.Collection<org.jsoup.nodes.Element>) elements10);
        boolean boolean12 = document1.equals((java.lang.Object) elements6);
        java.lang.String str13 = document1.toString();
        org.jsoup.nodes.Element element15 = document1.addClass("");
        java.lang.String str16 = element15.nodeName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node17 = element15.previousSibling();
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test044");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Document document3 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements5 = document3.getElementsByTag("hi!");
        org.jsoup.select.Elements elements6 = elements5.parents();
        org.jsoup.nodes.Document document8 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements10 = document8.getElementsByTag("hi!");
        boolean boolean11 = elements6.addAll((java.util.Collection<org.jsoup.nodes.Element>) elements10);
        boolean boolean12 = document1.equals((java.lang.Object) elements6);
        java.lang.String str13 = document1.toString();
        org.jsoup.nodes.Element element15 = document1.addClass("");
        org.jsoup.nodes.Element element17 = document1.prepend("");
        org.jsoup.nodes.Element element19 = document1.prependText("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element20 = document1.firstElementSibling();
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test045");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("", "");
        org.jsoup.nodes.Attributes attributes3 = document2.attributes();
        org.jsoup.nodes.Element element5 = document2.prependText("hi!");
        org.jsoup.nodes.Element element7 = element5.append("hi!");
        org.jsoup.nodes.Element element9 = element5.removeClass("");
        org.jsoup.nodes.Document document11 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Document document13 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements15 = document13.getElementsByTag("hi!");
        org.jsoup.select.Elements elements16 = elements15.parents();
        org.jsoup.nodes.Document document18 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements20 = document18.getElementsByTag("hi!");
        boolean boolean21 = elements16.addAll((java.util.Collection<org.jsoup.nodes.Element>) elements20);
        boolean boolean22 = document11.equals((java.lang.Object) elements16);
        java.lang.String str23 = document11.toString();
        org.jsoup.nodes.Element element25 = document11.addClass("");
        org.jsoup.nodes.Element element27 = document11.createElement("hi!");
        boolean boolean28 = element9.equals((java.lang.Object) document11);
        java.lang.String str29 = document11.title();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element30 = document11.nextElementSibling();
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test046");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("#text", "#text");
        org.jsoup.nodes.Document document5 = org.jsoup.Jsoup.parseBodyFragment("hi!", "hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!");
        java.lang.String[] strArray10 = new java.lang.String[] { "#root", "hi! hi!hi! hi!    hi! hi!   ", "org.jsoup.select.Selector$SelectorParseException: ", "" };
        java.util.LinkedHashSet<java.lang.String> strSet11 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet11, strArray10);
        org.jsoup.nodes.Element element13 = document5.classNames((java.util.Set<java.lang.String>) strSet11);
        java.lang.String str15 = document5.absUrl("#text");
        org.jsoup.nodes.Element element16 = document2.appendChild((org.jsoup.nodes.Node) document5);
        java.lang.String str17 = document2.html();
        org.jsoup.nodes.Document document20 = org.jsoup.Jsoup.parseBodyFragment("hi!", "hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!");
        boolean boolean21 = document2.equals((java.lang.Object) "hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements22 = document2.siblingElements();
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test047");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("jsoup.select.Selector$SelectorParseException: ", "<html> \n<head> \n</head> \n<body>  \n</body>\n</html>");
        boolean boolean3 = document2.isBlock();
        org.jsoup.nodes.Element element5 = document2.removeClass("<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements6 = element5.siblingElements();
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test048");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        boolean boolean3 = document1.hasAttr("");
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Document document7 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements9 = document7.getElementsByTag("hi!");
        org.jsoup.select.Elements elements10 = elements9.parents();
        org.jsoup.nodes.Document document12 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements14 = document12.getElementsByTag("hi!");
        boolean boolean15 = elements10.addAll((java.util.Collection<org.jsoup.nodes.Element>) elements14);
        boolean boolean16 = document5.equals((java.lang.Object) elements10);
        java.lang.String str17 = document5.toString();
        org.jsoup.nodes.Element element19 = document5.addClass("");
        org.jsoup.nodes.Element element21 = document5.prepend("");
        org.jsoup.nodes.Element element22 = document1.prependChild((org.jsoup.nodes.Node) document5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element24 = document1.text("<<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>>\n</<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>>");
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test049");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueContaining(" class=\"\"", "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.select.Elements elements6 = document1.getElementsByIndexLessThan((-1));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element7 = document1.lastElementSibling();
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test050");
        org.jsoup.select.Elements elements0 = new org.jsoup.select.Elements();
        java.lang.Object[] objArray1 = elements0.toArray();
        org.jsoup.nodes.Document document3 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements5 = document3.getElementsByTag("hi!");
        org.jsoup.select.Elements elements6 = elements5.parents();
        boolean boolean7 = elements0.addAll((java.util.Collection<org.jsoup.nodes.Element>) elements5);
        org.jsoup.select.Elements elements9 = elements5.eq((int) (byte) 0);
        org.jsoup.nodes.Document document11 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements14 = document11.getElementsByAttributeValueContaining(" class=\"\"", "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        boolean boolean15 = elements9.remove((java.lang.Object) document11);
        java.lang.String str16 = document11.html();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        document11.title("");
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test051");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("jsoup.select.Selector$SelectorParseException: ", "<html> \n<head> \n</head> \n<body>  \n</body>\n</html>");
        boolean boolean3 = document2.isBlock();
        org.jsoup.nodes.Element element5 = document2.toggleClass("hi! hi!hi! hi!    hi! hi!   ");
        java.lang.String str6 = document2.nodeName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element7 = document2.firstElementSibling();
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test052");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Document document3 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements5 = document3.getElementsByTag("hi!");
        org.jsoup.select.Elements elements6 = elements5.parents();
        org.jsoup.nodes.Document document8 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements10 = document8.getElementsByTag("hi!");
        boolean boolean11 = elements6.addAll((java.util.Collection<org.jsoup.nodes.Element>) elements10);
        boolean boolean12 = document1.equals((java.lang.Object) elements6);
        java.lang.String str13 = document1.toString();
        org.jsoup.nodes.Element element15 = document1.addClass("");
        org.jsoup.nodes.Element element17 = document1.prepend("");
        org.jsoup.nodes.Element element19 = document1.prependText("");
        boolean boolean21 = document1.hasClass("");
        org.jsoup.nodes.Element element23 = document1.appendText("[]");
        org.jsoup.select.Elements elements26 = document1.getElementsByAttributeValueContaining("  .jsoup.select.Selector$SelectorParseException: ", "<!class=\"\">");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element28 = document1.text("hi!=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;\"");
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test053");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Document document3 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements5 = document3.getElementsByTag("hi!");
        org.jsoup.select.Elements elements6 = elements5.parents();
        org.jsoup.nodes.Document document8 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements10 = document8.getElementsByTag("hi!");
        boolean boolean11 = elements6.addAll((java.util.Collection<org.jsoup.nodes.Element>) elements10);
        boolean boolean12 = document1.equals((java.lang.Object) elements6);
        java.lang.String str13 = document1.toString();
        org.jsoup.nodes.Element element15 = document1.addClass("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        document1.title("hi!=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;\"");
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test054");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("#document", "#document");
        java.lang.String str3 = document2.toString();
        org.jsoup.nodes.Element element4 = document2.parent();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements5 = document2.siblingElements();
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test055");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("#comment", "org.jsoup.select.Selector$SelectorParseException: ");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("<!class=\"\">");
        java.lang.String str5 = textNode2.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList6 = textNode2.siblingNodes();
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test056");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Document document3 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements5 = document3.getElementsByTag("hi!");
        org.jsoup.select.Elements elements6 = elements5.parents();
        org.jsoup.nodes.Document document8 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements10 = document8.getElementsByTag("hi!");
        boolean boolean11 = elements6.addAll((java.util.Collection<org.jsoup.nodes.Element>) elements10);
        boolean boolean12 = document1.equals((java.lang.Object) elements6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        document1.title("  .jsoup.select.Selector$SelectorParseException: ");
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test057");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Document document3 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements7 = document5.getElementsByTag("hi!");
        org.jsoup.select.Elements elements8 = elements7.parents();
        org.jsoup.nodes.Document document10 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements12 = document10.getElementsByTag("hi!");
        boolean boolean13 = elements8.addAll((java.util.Collection<org.jsoup.nodes.Element>) elements12);
        boolean boolean14 = document3.equals((java.lang.Object) elements8);
        java.lang.String str15 = document3.toString();
        org.jsoup.nodes.Element element17 = document3.addClass("");
        org.jsoup.nodes.Attributes attributes18 = element17.attributes();
        java.lang.String str19 = attributes18.toString();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator20 = attributes18.spliterator();
        org.jsoup.nodes.Document document22 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Document document24 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements26 = document24.getElementsByTag("hi!");
        org.jsoup.select.Elements elements27 = elements26.parents();
        org.jsoup.nodes.Document document29 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements31 = document29.getElementsByTag("hi!");
        boolean boolean32 = elements27.addAll((java.util.Collection<org.jsoup.nodes.Element>) elements31);
        boolean boolean33 = document22.equals((java.lang.Object) elements27);
        java.lang.String str34 = document22.toString();
        org.jsoup.nodes.Element element36 = document22.addClass("");
        boolean boolean37 = attributes18.equals((java.lang.Object) document22);
        org.jsoup.nodes.Document document39 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Document document41 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements43 = document41.getElementsByTag("hi!");
        org.jsoup.select.Elements elements44 = elements43.parents();
        org.jsoup.nodes.Document document46 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements48 = document46.getElementsByTag("hi!");
        boolean boolean49 = elements44.addAll((java.util.Collection<org.jsoup.nodes.Element>) elements48);
        boolean boolean50 = document39.equals((java.lang.Object) elements44);
        java.lang.String str51 = document39.toString();
        org.jsoup.nodes.Element element53 = document39.addClass("");
        org.jsoup.nodes.Attributes attributes54 = element53.attributes();
        attributes54.remove("hi!");
        org.jsoup.nodes.Document document58 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Document document60 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements62 = document60.getElementsByTag("hi!");
        org.jsoup.select.Elements elements63 = elements62.parents();
        org.jsoup.nodes.Document document65 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements67 = document65.getElementsByTag("hi!");
        boolean boolean68 = elements63.addAll((java.util.Collection<org.jsoup.nodes.Element>) elements67);
        boolean boolean69 = document58.equals((java.lang.Object) elements63);
        java.lang.String str70 = document58.toString();
        org.jsoup.nodes.Element element72 = document58.addClass("");
        org.jsoup.nodes.Attributes attributes73 = element72.attributes();
        java.lang.String str74 = attributes73.toString();
        int int75 = attributes73.size();
        org.jsoup.nodes.Attribute attribute78 = org.jsoup.nodes.Attribute.createFromEncoded("hi!", "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        attributes73.put(attribute78);
        attributes54.put(attribute78);
        attributes18.addAll(attributes54);
        boolean boolean82 = document1.equals((java.lang.Object) attributes18);
        java.lang.String str83 = document1.outerHtml();
        boolean boolean85 = document1.hasAttr("#declaration");
        org.jsoup.nodes.Element element87 = document1.text(" class=\"\"");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element88 = document1.nextElementSibling();
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test058");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Document document3 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements7 = document5.getElementsByTag("hi!");
        org.jsoup.select.Elements elements8 = elements7.parents();
        org.jsoup.nodes.Document document10 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements12 = document10.getElementsByTag("hi!");
        boolean boolean13 = elements8.addAll((java.util.Collection<org.jsoup.nodes.Element>) elements12);
        boolean boolean14 = document3.equals((java.lang.Object) elements8);
        java.lang.String str15 = document3.toString();
        org.jsoup.nodes.Element element17 = document3.addClass("");
        org.jsoup.nodes.Attributes attributes18 = element17.attributes();
        java.lang.String str19 = attributes18.toString();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator20 = attributes18.spliterator();
        org.jsoup.nodes.Document document22 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Document document24 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements26 = document24.getElementsByTag("hi!");
        org.jsoup.select.Elements elements27 = elements26.parents();
        org.jsoup.nodes.Document document29 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements31 = document29.getElementsByTag("hi!");
        boolean boolean32 = elements27.addAll((java.util.Collection<org.jsoup.nodes.Element>) elements31);
        boolean boolean33 = document22.equals((java.lang.Object) elements27);
        java.lang.String str34 = document22.toString();
        org.jsoup.nodes.Element element36 = document22.addClass("");
        boolean boolean37 = attributes18.equals((java.lang.Object) document22);
        org.jsoup.nodes.Document document39 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Document document41 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements43 = document41.getElementsByTag("hi!");
        org.jsoup.select.Elements elements44 = elements43.parents();
        org.jsoup.nodes.Document document46 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements48 = document46.getElementsByTag("hi!");
        boolean boolean49 = elements44.addAll((java.util.Collection<org.jsoup.nodes.Element>) elements48);
        boolean boolean50 = document39.equals((java.lang.Object) elements44);
        java.lang.String str51 = document39.toString();
        org.jsoup.nodes.Element element53 = document39.addClass("");
        org.jsoup.nodes.Attributes attributes54 = element53.attributes();
        attributes54.remove("hi!");
        org.jsoup.nodes.Document document58 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Document document60 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements62 = document60.getElementsByTag("hi!");
        org.jsoup.select.Elements elements63 = elements62.parents();
        org.jsoup.nodes.Document document65 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements67 = document65.getElementsByTag("hi!");
        boolean boolean68 = elements63.addAll((java.util.Collection<org.jsoup.nodes.Element>) elements67);
        boolean boolean69 = document58.equals((java.lang.Object) elements63);
        java.lang.String str70 = document58.toString();
        org.jsoup.nodes.Element element72 = document58.addClass("");
        org.jsoup.nodes.Attributes attributes73 = element72.attributes();
        java.lang.String str74 = attributes73.toString();
        int int75 = attributes73.size();
        org.jsoup.nodes.Attribute attribute78 = org.jsoup.nodes.Attribute.createFromEncoded("hi!", "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        attributes73.put(attribute78);
        attributes54.put(attribute78);
        attributes18.addAll(attributes54);
        boolean boolean82 = document1.equals((java.lang.Object) attributes18);
        java.lang.String str83 = document1.outerHtml();
        boolean boolean85 = document1.hasAttr("#declaration");
        org.jsoup.nodes.Element element87 = document1.text(" class=\"\"");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements88 = document1.siblingElements();
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test059");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueContaining(" class=\"\"", "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element5 = elements4.last();
        org.jsoup.nodes.Document document7 = new org.jsoup.nodes.Document("hi!");
        boolean boolean8 = elements4.add((org.jsoup.nodes.Element) document7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element10 = document7.text("aorg");
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test060");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Document document3 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements5 = document3.getElementsByTag("hi!");
        org.jsoup.select.Elements elements6 = elements5.parents();
        org.jsoup.nodes.Document document8 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements10 = document8.getElementsByTag("hi!");
        boolean boolean11 = elements6.addAll((java.util.Collection<org.jsoup.nodes.Element>) elements10);
        boolean boolean12 = document1.equals((java.lang.Object) elements6);
        java.lang.String str13 = document1.toString();
        org.jsoup.nodes.Element element15 = document1.addClass("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements16 = document1.siblingElements();
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test061");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("jsoup.select.Selector$SelectorParseException: ", "<html> \n<head> \n</head> \n<body>  \n</body>\n</html>");
        boolean boolean3 = document2.isBlock();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element4 = document2.previousElementSibling();
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test062");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("", "");
        org.jsoup.nodes.Attributes attributes3 = document2.attributes();
        org.jsoup.nodes.Element element5 = document2.prependText("hi!");
        org.jsoup.nodes.Element element7 = element5.val("#document");
        org.jsoup.select.Elements elements9 = element7.getElementsByTag("#document");
        org.jsoup.nodes.Element element11 = element7.append("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!");
        org.jsoup.nodes.Element element13 = element11.removeClass("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!<#root>\nhi!\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>hi!\n</#root>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node14 = element13.previousSibling();
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test063");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("", "");
        org.jsoup.nodes.Attributes attributes3 = document2.attributes();
        org.jsoup.nodes.Element element5 = document2.prependText("hi!");
        org.jsoup.nodes.Element element7 = element5.append("hi!");
        org.jsoup.nodes.Element element9 = element7.addClass("");
        org.jsoup.nodes.Element element11 = element7.addClass(" class=\"\"");
        org.jsoup.nodes.Element element14 = element11.attr("org", "org");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element15 = element14.nextElementSibling();
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test064");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Document document3 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements5 = document3.getElementsByTag("hi!");
        org.jsoup.select.Elements elements6 = elements5.parents();
        org.jsoup.nodes.Document document8 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements10 = document8.getElementsByTag("hi!");
        boolean boolean11 = elements6.addAll((java.util.Collection<org.jsoup.nodes.Element>) elements10);
        boolean boolean12 = document1.equals((java.lang.Object) elements6);
        java.lang.String str13 = document1.toString();
        org.jsoup.nodes.Element element15 = document1.addClass("");
        org.jsoup.nodes.Element element17 = document1.createElement("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        document1.title("hi");
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test065");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        boolean boolean3 = document1.hasAttr("");
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Document document7 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements9 = document7.getElementsByTag("hi!");
        org.jsoup.select.Elements elements10 = elements9.parents();
        org.jsoup.nodes.Document document12 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements14 = document12.getElementsByTag("hi!");
        boolean boolean15 = elements10.addAll((java.util.Collection<org.jsoup.nodes.Element>) elements14);
        boolean boolean16 = document5.equals((java.lang.Object) elements10);
        java.lang.String str17 = document5.toString();
        org.jsoup.nodes.Element element19 = document5.addClass("");
        org.jsoup.nodes.Element element21 = document5.prepend("");
        org.jsoup.nodes.Element element22 = document1.prependChild((org.jsoup.nodes.Node) document5);
        java.lang.String str23 = document5.outerHtml();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        document5.title("#declaration");
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test066");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Document document3 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements5 = document3.getElementsByTag("hi!");
        org.jsoup.select.Elements elements6 = elements5.parents();
        org.jsoup.nodes.Document document8 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements10 = document8.getElementsByTag("hi!");
        boolean boolean11 = elements6.addAll((java.util.Collection<org.jsoup.nodes.Element>) elements10);
        boolean boolean12 = document1.equals((java.lang.Object) elements6);
        java.lang.String str13 = document1.toString();
        org.jsoup.nodes.Element element15 = document1.addClass("");
        org.jsoup.nodes.Attributes attributes16 = element15.attributes();
        java.lang.String str17 = attributes16.toString();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator18 = attributes16.spliterator();
        org.jsoup.nodes.Document document20 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Document document22 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements24 = document22.getElementsByTag("hi!");
        org.jsoup.select.Elements elements25 = elements24.parents();
        org.jsoup.nodes.Document document27 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements29 = document27.getElementsByTag("hi!");
        boolean boolean30 = elements25.addAll((java.util.Collection<org.jsoup.nodes.Element>) elements29);
        boolean boolean31 = document20.equals((java.lang.Object) elements25);
        java.lang.String str32 = document20.toString();
        org.jsoup.nodes.Element element34 = document20.addClass("");
        boolean boolean35 = attributes16.equals((java.lang.Object) document20);
        org.jsoup.nodes.Element element37 = document20.removeClass("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element39 = document20.removeClass("<<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>>\n</<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList40 = document20.siblingNodes();
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test067");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Document document3 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements5 = document3.getElementsByTag("hi!");
        org.jsoup.select.Elements elements6 = elements5.parents();
        org.jsoup.nodes.Document document8 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements10 = document8.getElementsByTag("hi!");
        boolean boolean11 = elements6.addAll((java.util.Collection<org.jsoup.nodes.Element>) elements10);
        boolean boolean12 = document1.equals((java.lang.Object) elements6);
        java.lang.String str13 = document1.toString();
        org.jsoup.nodes.Element element15 = document1.addClass("");
        org.jsoup.nodes.Element element16 = element15.empty();
        org.jsoup.nodes.Element element18 = element16.prepend("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element20 = element18.append("#data");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements21 = element20.siblingElements();
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test068");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueContaining(" class=\"\"", "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Document document5 = document1.normalise();
        org.jsoup.nodes.Document document8 = org.jsoup.Jsoup.parse("", "");
        java.util.Set<java.lang.String> strSet9 = document8.classNames();
        org.jsoup.nodes.Element element10 = document5.classNames(strSet9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements11 = document5.siblingElements();
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test069");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element3 = document1.text("");
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test070");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        org.jsoup.parser.Tag tag2 = document1.tag();
        java.lang.String str3 = document1.html();
        document1.setBaseUri("hi!=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;\"");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList6 = document1.siblingNodes();
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test071");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("", "");
        org.jsoup.nodes.Attributes attributes3 = document2.attributes();
        org.jsoup.nodes.Element element5 = document2.prependText("hi!");
        org.jsoup.nodes.Element element7 = element5.append("hi!");
        org.jsoup.nodes.Element element9 = element7.addClass("");
        java.lang.String str10 = element9.outerHtml();
        org.jsoup.nodes.Element element12 = element9.prepend("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements13 = element9.siblingElements();
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test072");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Document document3 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements5 = document3.getElementsByTag("hi!");
        org.jsoup.select.Elements elements6 = elements5.parents();
        org.jsoup.nodes.Document document8 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements10 = document8.getElementsByTag("hi!");
        boolean boolean11 = elements6.addAll((java.util.Collection<org.jsoup.nodes.Element>) elements10);
        boolean boolean12 = document1.equals((java.lang.Object) elements6);
        java.lang.String str13 = document1.toString();
        org.jsoup.nodes.Node node16 = document1.attr("hi!", "");
        org.jsoup.nodes.Element element18 = document1.removeClass("org.jsoup.select.Selector$SelectorParseException: ");
        java.lang.String str19 = document1.val();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node20 = document1.nextSibling();
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test073");
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parseBodyFragment("hi!", "hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!");
        org.jsoup.select.Elements elements4 = document2.getElementsByIndexGreaterThan((int) (byte) 100);
        org.jsoup.nodes.Attributes attributes5 = document2.attributes();
        org.jsoup.select.Elements elements8 = document2.getElementsByAttributeValue("[., j, s, o, u, p, ., s, e, l, e, c, t, ., S, e, l, e, c, t, o, r, $, S, e, l, e, c, t, o, r, P, a, r, s, e, E, x, c, e, p, t, i, o, n, :,  ]", "<html> \n<head> \n</head> \n<body>  \n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element9 = document2.firstElementSibling();
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test074");
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parseBodyFragment("hi!", "hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!");
        java.lang.String[] strArray7 = new java.lang.String[] { "#root", "hi! hi!hi! hi!    hi! hi!   ", "org.jsoup.select.Selector$SelectorParseException: ", "" };
        java.util.LinkedHashSet<java.lang.String> strSet8 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet8, strArray7);
        org.jsoup.nodes.Element element10 = document2.classNames((java.util.Set<java.lang.String>) strSet8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element11 = document2.lastElementSibling();
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test075");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Document document3 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements5 = document3.getElementsByTag("hi!");
        org.jsoup.select.Elements elements6 = elements5.parents();
        org.jsoup.nodes.Document document8 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements10 = document8.getElementsByTag("hi!");
        boolean boolean11 = elements6.addAll((java.util.Collection<org.jsoup.nodes.Element>) elements10);
        boolean boolean12 = document1.equals((java.lang.Object) elements6);
        java.lang.String str13 = document1.toString();
        org.jsoup.nodes.Element element15 = document1.addClass("");
        org.jsoup.nodes.Element element17 = document1.createElement("hi!");
        java.lang.String str18 = document1.nodeName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element19 = document1.previousElementSibling();
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test076");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("<html>\n<head>\n</head>\n<body>\n #document\n</body>\n</html>");
        java.lang.String str2 = document1.className();
        org.jsoup.nodes.Element element4 = document1.toggleClass("<#root class=\"\" class=\"\"=\"\" hi!=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;\">\n</#root>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList5 = document1.siblingNodes();
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test077");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("aorg", "\n<body>\n hi!\n</body>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element3 = document2.nextElementSibling();
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test078");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Document document3 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements5 = document3.getElementsByTag("hi!");
        org.jsoup.select.Elements elements6 = elements5.parents();
        org.jsoup.nodes.Document document8 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements10 = document8.getElementsByTag("hi!");
        boolean boolean11 = elements6.addAll((java.util.Collection<org.jsoup.nodes.Element>) elements10);
        boolean boolean12 = document1.equals((java.lang.Object) elements6);
        java.lang.String str13 = document1.toString();
        org.jsoup.nodes.Element element15 = document1.addClass("");
        org.jsoup.nodes.Element element17 = document1.createElement("hi!");
        java.lang.String str18 = document1.baseUri();
        org.jsoup.nodes.Element element19 = document1.empty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList20 = element19.siblingNodes();
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test079");
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parse("#root", "<html> \n<head> \n</head> \n<body>  \n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.siblingNodes();
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test080");
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parse("", "");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element3 = document2.firstElementSibling();
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test081");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("org.jsoup.select.Selector$SelectorParseException: ", " class=\"\"");
        org.jsoup.parser.Tag tag3 = document2.tag();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements4 = document2.siblingElements();
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test082");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        org.jsoup.parser.Tag tag2 = document1.tag();
        org.jsoup.nodes.Document document5 = org.jsoup.parser.Parser.parse("", "");
        org.jsoup.nodes.Attributes attributes6 = document5.attributes();
        org.jsoup.nodes.Element element9 = document5.attr("#root=\"\"", "hi");
        org.jsoup.nodes.Document document12 = org.jsoup.parser.Parser.parse(" class=\"\"", "org.jsoup.select.Selector$SelectorParseException: ");
        boolean boolean13 = document12.hasText();
        java.lang.String str14 = document12.title();
        document12.setBaseUri("#root=\"\"");
        org.jsoup.nodes.Document document19 = org.jsoup.parser.Parser.parse("", "");
        org.jsoup.nodes.Attributes attributes20 = document19.attributes();
        org.jsoup.nodes.Element element22 = document19.prependText("hi!");
        org.jsoup.nodes.Element element24 = element22.append("hi!");
        org.jsoup.nodes.Document document27 = org.jsoup.parser.Parser.parse("", "");
        org.jsoup.nodes.Attributes attributes28 = document27.attributes();
        org.jsoup.nodes.Element element30 = document27.prependText("hi!");
        org.jsoup.nodes.Element element32 = element30.append("hi!");
        java.lang.String str33 = element32.nodeName();
        org.jsoup.nodes.Element element34 = element22.appendChild((org.jsoup.nodes.Node) element32);
        org.jsoup.select.Elements elements35 = element34.getAllElements();
        java.lang.String[] strArray38 = new java.lang.String[] { "#comment", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet39 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet39, strArray38);
        org.jsoup.nodes.Element element41 = element34.classNames((java.util.Set<java.lang.String>) strSet39);
        org.jsoup.nodes.Element element42 = document12.classNames((java.util.Set<java.lang.String>) strSet39);
        org.jsoup.nodes.Element element43 = element9.classNames((java.util.Set<java.lang.String>) strSet39);
        org.jsoup.nodes.Element element44 = document1.classNames((java.util.Set<java.lang.String>) strSet39);
        org.jsoup.nodes.Element element46 = document1.append(" class=\"\" hi!=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;\"");
        org.jsoup.nodes.Element element48 = element46.prepend("<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int49 = element46.siblingIndex();
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test083");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        boolean boolean3 = document1.hasAttr("");
        java.lang.String str4 = document1.nodeName();
        java.lang.String str5 = document1.outerHtml();
        org.jsoup.nodes.Element element7 = document1.html("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!");
        org.jsoup.select.Elements elements9 = document1.getElementsByTag("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!<#root>\nhi!\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>hi!\n</#root>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int10 = document1.siblingIndex();
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test084");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Document document3 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements5 = document3.getElementsByTag("hi!");
        org.jsoup.select.Elements elements6 = elements5.parents();
        org.jsoup.nodes.Document document8 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements10 = document8.getElementsByTag("hi!");
        boolean boolean11 = elements6.addAll((java.util.Collection<org.jsoup.nodes.Element>) elements10);
        boolean boolean12 = document1.equals((java.lang.Object) elements6);
        java.lang.String str13 = document1.toString();
        org.jsoup.nodes.Element element15 = document1.addClass("");
        org.jsoup.nodes.Attributes attributes16 = element15.attributes();
        java.lang.String str17 = attributes16.toString();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator18 = attributes16.spliterator();
        org.jsoup.nodes.Document document20 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Document document22 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements24 = document22.getElementsByTag("hi!");
        org.jsoup.select.Elements elements25 = elements24.parents();
        org.jsoup.nodes.Document document27 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements29 = document27.getElementsByTag("hi!");
        boolean boolean30 = elements25.addAll((java.util.Collection<org.jsoup.nodes.Element>) elements29);
        boolean boolean31 = document20.equals((java.lang.Object) elements25);
        java.lang.String str32 = document20.toString();
        org.jsoup.nodes.Element element34 = document20.addClass("");
        boolean boolean35 = attributes16.equals((java.lang.Object) document20);
        org.jsoup.nodes.Element element37 = document20.removeClass("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element39 = document20.removeClass("<<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>>\n</<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>>");
        boolean boolean40 = element39.hasText();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements41 = element39.siblingElements();
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test085");
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parseBodyFragment("hi!", "hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!");
        java.lang.String[] strArray7 = new java.lang.String[] { "#root", "hi! hi!hi! hi!    hi! hi!   ", "org.jsoup.select.Selector$SelectorParseException: ", "" };
        java.util.LinkedHashSet<java.lang.String> strSet8 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet8, strArray7);
        org.jsoup.nodes.Element element10 = document2.classNames((java.util.Set<java.lang.String>) strSet8);
        java.lang.String str12 = document2.absUrl("#text");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element13 = document2.firstElementSibling();
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test086");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        boolean boolean3 = document1.hasAttr("");
        java.lang.String str4 = document1.nodeName();
        java.lang.String str5 = document1.outerHtml();
        java.lang.String str6 = document1.outerHtml();
        org.jsoup.select.Elements elements7 = document1.children();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element9 = document1.text("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!\n<head>\n</head>\n<body>\n</body>\n");
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test087");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Document document3 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements5 = document3.getElementsByTag("hi!");
        org.jsoup.select.Elements elements6 = elements5.parents();
        org.jsoup.nodes.Document document8 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements10 = document8.getElementsByTag("hi!");
        boolean boolean11 = elements6.addAll((java.util.Collection<org.jsoup.nodes.Element>) elements10);
        boolean boolean12 = document1.equals((java.lang.Object) elements6);
        java.lang.String str13 = document1.toString();
        org.jsoup.nodes.Element element15 = document1.addClass("");
        org.jsoup.nodes.Attributes attributes16 = element15.attributes();
        java.lang.String str17 = attributes16.toString();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator18 = attributes16.spliterator();
        org.jsoup.nodes.Document document20 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Document document22 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements24 = document22.getElementsByTag("hi!");
        org.jsoup.select.Elements elements25 = elements24.parents();
        org.jsoup.nodes.Document document27 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements29 = document27.getElementsByTag("hi!");
        boolean boolean30 = elements25.addAll((java.util.Collection<org.jsoup.nodes.Element>) elements29);
        boolean boolean31 = document20.equals((java.lang.Object) elements25);
        java.lang.String str32 = document20.toString();
        org.jsoup.nodes.Element element34 = document20.addClass("");
        boolean boolean35 = attributes16.equals((java.lang.Object) document20);
        org.jsoup.nodes.Element element37 = document20.removeClass("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element39 = document20.addClass("hi");
        boolean boolean41 = element39.hasClass("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!<#root>\nhi!\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>hi!\n</#root>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element42 = element39.previousElementSibling();
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test088");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse(" class=\"\"", "org.jsoup.select.Selector$SelectorParseException: ");
        boolean boolean3 = document2.hasText();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Document document7 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements9 = document7.getElementsByTag("hi!");
        org.jsoup.select.Elements elements10 = elements9.parents();
        org.jsoup.nodes.Document document12 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements14 = document12.getElementsByTag("hi!");
        boolean boolean15 = elements10.addAll((java.util.Collection<org.jsoup.nodes.Element>) elements14);
        boolean boolean16 = document5.equals((java.lang.Object) elements10);
        java.lang.String str17 = document5.toString();
        org.jsoup.nodes.Document document20 = org.jsoup.parser.Parser.parse("", "");
        org.jsoup.nodes.Element[] elementArray21 = new org.jsoup.nodes.Element[] { document5, document20 };
        org.jsoup.select.Elements elements22 = new org.jsoup.select.Elements(elementArray21);
        org.jsoup.select.Elements elements24 = elements22.removeClass("");
        org.jsoup.nodes.Element element26 = elements24.get((int) (byte) 0);
        org.jsoup.select.Elements elements28 = elements24.removeAttr(".");
        org.jsoup.nodes.Element element29 = elements28.last();
        org.jsoup.nodes.Element element30 = document2.appendChild((org.jsoup.nodes.Node) element29);
        org.jsoup.nodes.Element element32 = document2.text("#document");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element33 = element32.firstElementSibling();
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test089");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Document document3 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements5 = document3.getElementsByTag("hi!");
        org.jsoup.select.Elements elements6 = elements5.parents();
        org.jsoup.nodes.Document document8 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements10 = document8.getElementsByTag("hi!");
        boolean boolean11 = elements6.addAll((java.util.Collection<org.jsoup.nodes.Element>) elements10);
        boolean boolean12 = document1.equals((java.lang.Object) elements6);
        java.lang.String str13 = document1.toString();
        org.jsoup.nodes.Document document16 = org.jsoup.parser.Parser.parse("", "");
        org.jsoup.nodes.Element[] elementArray17 = new org.jsoup.nodes.Element[] { document1, document16 };
        org.jsoup.select.Elements elements18 = new org.jsoup.select.Elements(elementArray17);
        org.jsoup.select.Elements elements20 = elements18.removeClass("");
        org.jsoup.nodes.Element element22 = elements20.get((int) (byte) 0);
        org.jsoup.select.Elements elements24 = elements20.removeAttr(".");
        org.jsoup.select.Elements elements26 = elements20.removeClass("class=\"\"");
        org.jsoup.nodes.Document document28 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Document document30 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements32 = document30.getElementsByTag("hi!");
        org.jsoup.select.Elements elements33 = elements32.parents();
        org.jsoup.nodes.Document document35 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements37 = document35.getElementsByTag("hi!");
        boolean boolean38 = elements33.addAll((java.util.Collection<org.jsoup.nodes.Element>) elements37);
        boolean boolean39 = document28.equals((java.lang.Object) elements33);
        java.lang.String str40 = document28.toString();
        org.jsoup.nodes.Element element42 = document28.addClass("");
        org.jsoup.nodes.Attributes attributes43 = element42.attributes();
        java.lang.String str44 = attributes43.toString();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator45 = attributes43.spliterator();
        org.jsoup.nodes.Document document47 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Document document49 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements51 = document49.getElementsByTag("hi!");
        org.jsoup.select.Elements elements52 = elements51.parents();
        org.jsoup.nodes.Document document54 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements56 = document54.getElementsByTag("hi!");
        boolean boolean57 = elements52.addAll((java.util.Collection<org.jsoup.nodes.Element>) elements56);
        boolean boolean58 = document47.equals((java.lang.Object) elements52);
        java.lang.String str59 = document47.toString();
        org.jsoup.nodes.Element element61 = document47.addClass("");
        boolean boolean62 = attributes43.equals((java.lang.Object) document47);
        org.jsoup.nodes.Element element64 = document47.removeClass("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        boolean boolean65 = elements26.equals((java.lang.Object) document47);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node66 = document47.previousSibling();
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test090");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("<html> \n<head> \n</head> \n<body>  \n</body>\n</html>", "");
        org.jsoup.nodes.Document document4 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Document document6 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements8 = document6.getElementsByTag("hi!");
        org.jsoup.select.Elements elements9 = elements8.parents();
        org.jsoup.nodes.Document document11 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements13 = document11.getElementsByTag("hi!");
        boolean boolean14 = elements9.addAll((java.util.Collection<org.jsoup.nodes.Element>) elements13);
        boolean boolean15 = document4.equals((java.lang.Object) elements9);
        java.lang.String str16 = document4.toString();
        org.jsoup.nodes.Element element18 = document4.addClass("");
        org.jsoup.nodes.Element element20 = document4.prepend("");
        java.lang.String str21 = element20.toString();
        org.jsoup.nodes.Element element24 = element20.attr("hi! hi!hi! hi!    hi! hi!   ", "#root");
        java.lang.String str26 = element20.attr("\n<!--#root-->");
        org.jsoup.nodes.Element element27 = document2.appendChild((org.jsoup.nodes.Node) element20);
        org.jsoup.nodes.Node node30 = document2.attr("#comment", "");
        org.jsoup.nodes.Element element31 = document2.head();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int32 = document2.siblingIndex();
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test091");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("org.jsoup.select.Selector$SelectorParseException: ", " class=\"\"");
        org.jsoup.parser.Tag tag3 = document2.tag();
        java.lang.String str4 = tag3.getName();
        org.jsoup.parser.Tag tag5 = tag3.getImplicitParent();
        org.jsoup.nodes.Document document8 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Document document10 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements12 = document10.getElementsByTag("hi!");
        org.jsoup.select.Elements elements13 = elements12.parents();
        org.jsoup.nodes.Document document15 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements17 = document15.getElementsByTag("hi!");
        boolean boolean18 = elements13.addAll((java.util.Collection<org.jsoup.nodes.Element>) elements17);
        boolean boolean19 = document8.equals((java.lang.Object) elements13);
        java.lang.String str20 = document8.toString();
        org.jsoup.nodes.Element element22 = document8.addClass("");
        org.jsoup.nodes.Attributes attributes23 = element22.attributes();
        java.lang.String str24 = attributes23.toString();
        int int25 = attributes23.size();
        java.lang.String str26 = attributes23.toString();
        org.jsoup.nodes.Element element27 = new org.jsoup.nodes.Element(tag3, "[]", attributes23);
        org.jsoup.nodes.Document document30 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Document document32 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements34 = document32.getElementsByTag("hi!");
        org.jsoup.select.Elements elements35 = elements34.parents();
        org.jsoup.nodes.Document document37 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements39 = document37.getElementsByTag("hi!");
        boolean boolean40 = elements35.addAll((java.util.Collection<org.jsoup.nodes.Element>) elements39);
        boolean boolean41 = document30.equals((java.lang.Object) elements35);
        java.lang.String str42 = document30.toString();
        org.jsoup.nodes.Element element44 = document30.addClass("");
        org.jsoup.nodes.Attributes attributes45 = element44.attributes();
        java.lang.String str46 = attributes45.toString();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator47 = attributes45.spliterator();
        org.jsoup.nodes.Document document49 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Document document51 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements53 = document51.getElementsByTag("hi!");
        org.jsoup.select.Elements elements54 = elements53.parents();
        org.jsoup.nodes.Document document56 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements58 = document56.getElementsByTag("hi!");
        boolean boolean59 = elements54.addAll((java.util.Collection<org.jsoup.nodes.Element>) elements58);
        boolean boolean60 = document49.equals((java.lang.Object) elements54);
        java.lang.String str61 = document49.toString();
        org.jsoup.nodes.Element element63 = document49.addClass("");
        boolean boolean64 = attributes45.equals((java.lang.Object) document49);
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor65 = attributes45.iterator();
        org.jsoup.nodes.Element element66 = new org.jsoup.nodes.Element(tag3, " class=\"\"", attributes45);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node67 = element66.previousSibling();
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test092");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Document document3 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements5 = document3.getElementsByTag("hi!");
        org.jsoup.select.Elements elements6 = elements5.parents();
        org.jsoup.nodes.Document document8 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements10 = document8.getElementsByTag("hi!");
        boolean boolean11 = elements6.addAll((java.util.Collection<org.jsoup.nodes.Element>) elements10);
        boolean boolean12 = document1.equals((java.lang.Object) elements6);
        java.lang.String str13 = document1.toString();
        org.jsoup.nodes.Element element15 = document1.addClass("");
        org.jsoup.nodes.Element element17 = document1.prepend("");
        java.lang.String str18 = element17.toString();
        org.jsoup.nodes.Element element21 = element17.attr("hi! hi!hi! hi!    hi! hi!   ", "#root");
        org.jsoup.nodes.Document document23 = new org.jsoup.nodes.Document("#text");
        boolean boolean24 = element21.equals((java.lang.Object) document23);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element25 = document23.firstElementSibling();
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test093");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Document document3 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements5 = document3.getElementsByTag("hi!");
        org.jsoup.select.Elements elements6 = elements5.parents();
        org.jsoup.nodes.Document document8 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements10 = document8.getElementsByTag("hi!");
        boolean boolean11 = elements6.addAll((java.util.Collection<org.jsoup.nodes.Element>) elements10);
        boolean boolean12 = document1.equals((java.lang.Object) elements6);
        java.lang.String str13 = document1.toString();
        org.jsoup.nodes.Node node16 = document1.attr("hi!", "");
        org.jsoup.nodes.Element element18 = document1.createElement("#data");
        org.jsoup.nodes.Document document21 = org.jsoup.parser.Parser.parse("", "");
        org.jsoup.nodes.Attributes attributes22 = document21.attributes();
        org.jsoup.nodes.Element element24 = document21.prependText("hi!");
        org.jsoup.nodes.Element element26 = element24.append("hi!");
        org.jsoup.nodes.Element element28 = element26.addClass("");
        org.jsoup.nodes.Element element30 = element26.addClass(" class=\"\"");
        java.lang.String str31 = element30.outerHtml();
        org.jsoup.nodes.Element element32 = element18.appendChild((org.jsoup.nodes.Node) element30);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element33 = element18.previousElementSibling();
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test094");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Document document3 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements5 = document3.getElementsByTag("hi!");
        org.jsoup.select.Elements elements6 = elements5.parents();
        org.jsoup.nodes.Document document8 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements10 = document8.getElementsByTag("hi!");
        boolean boolean11 = elements6.addAll((java.util.Collection<org.jsoup.nodes.Element>) elements10);
        boolean boolean12 = document1.equals((java.lang.Object) elements6);
        java.lang.String str13 = document1.toString();
        org.jsoup.nodes.Element element15 = document1.addClass("");
        org.jsoup.nodes.Element element17 = document1.prepend("");
        org.jsoup.select.Elements elements19 = element17.getElementsByIndexLessThan((int) (short) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList20 = element17.siblingNodes();
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test095");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        boolean boolean3 = document1.hasAttr("");
        java.lang.String str4 = document1.nodeName();
        java.lang.String str5 = document1.outerHtml();
        java.lang.String str6 = document1.outerHtml();
        org.jsoup.nodes.Element element8 = document1.html(" class=\"\"");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element10 = document1.text("");
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test096");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("<html> \n<head> \n</head> \n<body>  \n</body>\n</html>", "");
        org.jsoup.nodes.Document document4 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Document document6 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements8 = document6.getElementsByTag("hi!");
        org.jsoup.select.Elements elements9 = elements8.parents();
        org.jsoup.nodes.Document document11 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements13 = document11.getElementsByTag("hi!");
        boolean boolean14 = elements9.addAll((java.util.Collection<org.jsoup.nodes.Element>) elements13);
        boolean boolean15 = document4.equals((java.lang.Object) elements9);
        java.lang.String str16 = document4.toString();
        org.jsoup.nodes.Element element18 = document4.addClass("");
        org.jsoup.nodes.Element element20 = document4.prepend("");
        java.lang.String str21 = element20.toString();
        org.jsoup.nodes.Element element24 = element20.attr("hi! hi!hi! hi!    hi! hi!   ", "#root");
        java.lang.String str26 = element20.attr("\n<!--#root-->");
        org.jsoup.nodes.Element element27 = document2.appendChild((org.jsoup.nodes.Node) element20);
        boolean boolean29 = document2.hasAttr("[#, j, s, o, u, p, ., s, e, l, e, c, t, ., S, e, l, e, c, t, o, r, $, S, e, l, e, c, t, o, r, P, a, r, s, e, E, x, c, e, p, t, i, o, n, :,  ]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements30 = document2.siblingElements();
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test097");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.lang.String str3 = textNode2.nodeName();
        java.lang.String str4 = textNode2.text();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("<html>\n<head>\n</head>\n<body>\n org.jsoup.select.Selector$SelectorParseException: \n</body>\n</html>");
        org.jsoup.nodes.TextNode textNode8 = textNode6.text("<#root class=\"\" class=\"\"=\"\" hi!=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;\">\n</#root>");
        java.lang.String str9 = textNode6.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node10 = textNode6.previousSibling();
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test098");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("", "");
        org.jsoup.nodes.Attributes attributes3 = document2.attributes();
        org.jsoup.nodes.Element element5 = document2.prependText("hi!");
        org.jsoup.nodes.Element element7 = element5.append("hi!");
        org.jsoup.nodes.Element element9 = element5.removeClass("");
        org.jsoup.nodes.Document document11 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Document document13 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements15 = document13.getElementsByTag("hi!");
        org.jsoup.select.Elements elements16 = elements15.parents();
        org.jsoup.nodes.Document document18 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements20 = document18.getElementsByTag("hi!");
        boolean boolean21 = elements16.addAll((java.util.Collection<org.jsoup.nodes.Element>) elements20);
        boolean boolean22 = document11.equals((java.lang.Object) elements16);
        java.lang.String str23 = document11.toString();
        org.jsoup.nodes.Element element25 = document11.addClass("");
        org.jsoup.nodes.Element element27 = document11.createElement("hi!");
        boolean boolean28 = element9.equals((java.lang.Object) document11);
        java.lang.String str29 = document11.outerHtml();
        java.lang.String str30 = document11.val();
        org.jsoup.nodes.Element element33 = document11.attr("<html>\n<head>\n</head>\n<body>\n #document \n</body>\n</html>", "<!--#root-->=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;\"");
        org.jsoup.nodes.Element element36 = document11.attr("[c, l, a, s, s, =, \", \", j, s, o, u, p, ., s, e, l, e, c, t, ., S, e, l, e, c, t, o, r, $, S, e, l, e, c, t, o, r, P, a, r, s, e, E, x, c, e, p, t, i, o, n, :,  ]", "<html>\n<head>\n</head>\n<body>\n org.jsoup.select.Selector$SelectorParseException: \n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements37 = element36.siblingElements();
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test099");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("", "");
        org.jsoup.nodes.Attributes attributes3 = document2.attributes();
        java.lang.String str4 = document2.html();
        org.jsoup.nodes.Document document5 = document2.normalise();
        boolean boolean7 = document2.hasAttr("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int8 = document2.siblingIndex();
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test100");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("", "");
        org.jsoup.nodes.Attributes attributes3 = document2.attributes();
        org.jsoup.nodes.Element element5 = document2.prependText("hi!");
        org.jsoup.nodes.Element element7 = element5.append("hi!");
        org.jsoup.nodes.Document document10 = org.jsoup.parser.Parser.parse("", "");
        org.jsoup.nodes.Attributes attributes11 = document10.attributes();
        org.jsoup.nodes.Element element13 = document10.prependText("hi!");
        org.jsoup.nodes.Element element15 = element13.append("hi!");
        java.lang.String str16 = element15.nodeName();
        org.jsoup.nodes.Element element17 = element5.appendChild((org.jsoup.nodes.Node) element15);
        org.jsoup.select.Elements elements18 = element17.getAllElements();
        java.lang.String[] strArray21 = new java.lang.String[] { "#comment", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet22 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet22, strArray21);
        org.jsoup.nodes.Element element24 = element17.classNames((java.util.Set<java.lang.String>) strSet22);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element25 = element24.lastElementSibling();
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test101");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("", "");
        org.jsoup.nodes.Attributes attributes3 = document2.attributes();
        org.jsoup.nodes.Element element5 = document2.prependText("hi!");
        org.jsoup.nodes.Element element7 = element5.val("#document");
        org.jsoup.select.Elements elements9 = element7.getElementsByTag("#document");
        org.jsoup.nodes.Element element11 = element7.append("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!");
        org.jsoup.nodes.Element element13 = element11.addClass("org.jsoup.select.Selector$SelectorParseException: ");
        org.jsoup.nodes.Element element15 = element11.val("body");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element16 = element15.lastElementSibling();
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test102");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("\n<body>\n hi!\n</body>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element2 = document1.nextElementSibling();
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test103");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("jsoup.select.Selector$SelectorParseException: ", "<html> \n<head> \n</head> \n<body>  \n</body>\n</html>");
        boolean boolean3 = document2.isBlock();
        org.jsoup.nodes.Element element5 = document2.toggleClass("hi! hi!hi! hi!    hi! hi!   ");
        java.lang.String str6 = document2.nodeName();
        org.jsoup.nodes.Element element8 = document2.wrap("org");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element9 = document2.previousElementSibling();
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test104");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("class=\"\"", "#text", true);
        java.lang.String str4 = xmlDeclaration3.toString();
        java.lang.String str5 = xmlDeclaration3.toString();
        java.lang.String str6 = xmlDeclaration3.getWholeDeclaration();
        java.lang.String str7 = xmlDeclaration3.getWholeDeclaration();
        java.lang.String str8 = xmlDeclaration3.nodeName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node9 = xmlDeclaration3.previousSibling();
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test105");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Document document3 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements5 = document3.getElementsByTag("hi!");
        org.jsoup.select.Elements elements6 = elements5.parents();
        org.jsoup.nodes.Document document8 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements10 = document8.getElementsByTag("hi!");
        boolean boolean11 = elements6.addAll((java.util.Collection<org.jsoup.nodes.Element>) elements10);
        boolean boolean12 = document1.equals((java.lang.Object) elements6);
        java.lang.String str13 = document1.toString();
        org.jsoup.nodes.Element element15 = document1.addClass("");
        org.jsoup.nodes.Element element16 = element15.empty();
        org.jsoup.nodes.Element element18 = element16.prepend("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element20 = element18.append("#data");
        org.jsoup.nodes.Element element22 = element18.html("");
        element18.setBaseUri("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element26 = element18.text("<html> \n<head> \n</head> \n<body>  \n</body>\n</html>=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;\"");
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test106");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        org.jsoup.parser.Tag tag2 = document1.tag();
        org.jsoup.nodes.Document document5 = org.jsoup.parser.Parser.parse("", "");
        org.jsoup.nodes.Attributes attributes6 = document5.attributes();
        org.jsoup.nodes.Element element9 = document5.attr("#root=\"\"", "hi");
        org.jsoup.nodes.Document document12 = org.jsoup.parser.Parser.parse(" class=\"\"", "org.jsoup.select.Selector$SelectorParseException: ");
        boolean boolean13 = document12.hasText();
        java.lang.String str14 = document12.title();
        document12.setBaseUri("#root=\"\"");
        org.jsoup.nodes.Document document19 = org.jsoup.parser.Parser.parse("", "");
        org.jsoup.nodes.Attributes attributes20 = document19.attributes();
        org.jsoup.nodes.Element element22 = document19.prependText("hi!");
        org.jsoup.nodes.Element element24 = element22.append("hi!");
        org.jsoup.nodes.Document document27 = org.jsoup.parser.Parser.parse("", "");
        org.jsoup.nodes.Attributes attributes28 = document27.attributes();
        org.jsoup.nodes.Element element30 = document27.prependText("hi!");
        org.jsoup.nodes.Element element32 = element30.append("hi!");
        java.lang.String str33 = element32.nodeName();
        org.jsoup.nodes.Element element34 = element22.appendChild((org.jsoup.nodes.Node) element32);
        org.jsoup.select.Elements elements35 = element34.getAllElements();
        java.lang.String[] strArray38 = new java.lang.String[] { "#comment", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet39 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet39, strArray38);
        org.jsoup.nodes.Element element41 = element34.classNames((java.util.Set<java.lang.String>) strSet39);
        org.jsoup.nodes.Element element42 = document12.classNames((java.util.Set<java.lang.String>) strSet39);
        org.jsoup.nodes.Element element43 = element9.classNames((java.util.Set<java.lang.String>) strSet39);
        org.jsoup.nodes.Element element44 = document1.classNames((java.util.Set<java.lang.String>) strSet39);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element45 = document1.firstElementSibling();
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test107");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        boolean boolean3 = document1.hasAttr("");
        java.lang.String str4 = document1.nodeName();
        org.jsoup.select.Elements elements5 = document1.parents();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element6 = document1.nextElementSibling();
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test108");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        java.lang.String str2 = document1.outerHtml();
        org.jsoup.nodes.Element element5 = document1.attr("org.jsoup.select.Selector$SelectorParseException: ", "hi! hi!hi! hi!    hi! hi!   ");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element7 = document1.text("<!class=\"\">");
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test109");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        boolean boolean3 = document1.equals((java.lang.Object) (-1));
        org.jsoup.select.Elements elements6 = document1.getElementsByAttributeValue("hi! hi!hi! hi!    hi! hi!   ", "<!class=\"\">");
        java.lang.Integer int7 = document1.elementSiblingIndex();
        org.jsoup.nodes.Element element9 = document1.text("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element10 = document1.firstElementSibling();
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test110");
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parseBodyFragment("hi!", "hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!");
        java.lang.String[] strArray7 = new java.lang.String[] { "#root", "hi! hi!hi! hi!    hi! hi!   ", "org.jsoup.select.Selector$SelectorParseException: ", "" };
        java.util.LinkedHashSet<java.lang.String> strSet8 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet8, strArray7);
        org.jsoup.nodes.Element element10 = document2.classNames((java.util.Set<java.lang.String>) strSet8);
        java.lang.String str12 = document2.absUrl("#text");
        org.jsoup.nodes.Element element14 = document2.prependElement("hi!\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node15 = document2.previousSibling();
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test111");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        boolean boolean3 = document1.hasAttr("");
        org.jsoup.nodes.Element element6 = document1.attr("hi! hi!hi! hi!    hi! hi!   ", "class=\"\"");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node7 = document1.previousSibling();
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test112");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        org.jsoup.parser.Tag tag2 = document1.tag();
        org.jsoup.nodes.Document document4 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Document document6 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements8 = document6.getElementsByTag("hi!");
        org.jsoup.select.Elements elements9 = elements8.parents();
        org.jsoup.nodes.Document document11 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements13 = document11.getElementsByTag("hi!");
        boolean boolean14 = elements9.addAll((java.util.Collection<org.jsoup.nodes.Element>) elements13);
        boolean boolean15 = document4.equals((java.lang.Object) elements9);
        java.lang.String str16 = document4.toString();
        org.jsoup.nodes.Element element18 = document4.addClass("");
        org.jsoup.nodes.Element element20 = document4.prepend("");
        java.lang.String str21 = element20.toString();
        org.jsoup.nodes.Element element24 = element20.attr("hi! hi!hi! hi!    hi! hi!   ", "#root");
        org.jsoup.nodes.Element element25 = document1.appendChild((org.jsoup.nodes.Node) element24);
        org.jsoup.select.Elements elements28 = element25.getElementsByAttributeValueEnding("jsoup.select.Selector$SelectorParseException: ", "<html>\n<head>\n</head>\n<body>\n #document\n</body>\n</html>");
        org.jsoup.select.Elements elements31 = element25.getElementsByAttributeValueContaining("<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>", "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList32 = element25.siblingNodes();
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test113");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("", "");
        org.jsoup.nodes.Attributes attributes3 = document2.attributes();
        org.jsoup.nodes.Element element5 = document2.prependText("hi!");
        org.jsoup.nodes.Element element7 = element5.append("hi!");
        org.jsoup.nodes.Element element9 = element7.addClass("");
        org.jsoup.select.Elements elements12 = element9.getElementsByAttributeValue("hi! hi!hi! hi!    hi! hi!   ", "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.select.Elements elements13 = element9.children();
        org.jsoup.nodes.Element element15 = element9.removeClass("class=\"\"");
        org.jsoup.select.Elements elements16 = element15.children();
        org.jsoup.parser.Tag tag17 = element15.tag();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node18 = element15.previousSibling();
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test114");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("", "");
        org.jsoup.nodes.Attributes attributes3 = document2.attributes();
        org.jsoup.nodes.Element element5 = document2.prependText("hi!");
        org.jsoup.nodes.Element element7 = element5.append("hi!");
        org.jsoup.nodes.Element element9 = element7.addClass("");
        org.jsoup.select.Elements elements12 = element9.getElementsByAttributeValue("hi! hi!hi! hi!    hi! hi!   ", "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Document document15 = org.jsoup.parser.Parser.parse("", "");
        org.jsoup.nodes.Attributes attributes16 = document15.attributes();
        org.jsoup.nodes.Element element18 = document15.prependText("hi!");
        org.jsoup.nodes.Element element20 = element18.append("hi!");
        org.jsoup.nodes.Document document23 = org.jsoup.parser.Parser.parse("", "");
        org.jsoup.nodes.Attributes attributes24 = document23.attributes();
        org.jsoup.nodes.Element element26 = document23.prependText("hi!");
        org.jsoup.nodes.Element element28 = element26.append("hi!");
        java.lang.String str29 = element28.nodeName();
        org.jsoup.nodes.Element element30 = element18.appendChild((org.jsoup.nodes.Node) element28);
        java.lang.String str31 = element30.data();
        boolean boolean32 = elements12.add(element30);
        org.jsoup.select.Elements elements35 = element30.getElementsByAttributeValueEnding("[]", "#text");
        org.jsoup.nodes.Document document37 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Document document39 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements41 = document39.getElementsByTag("hi!");
        org.jsoup.select.Elements elements42 = elements41.parents();
        org.jsoup.nodes.Document document44 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements46 = document44.getElementsByTag("hi!");
        boolean boolean47 = elements42.addAll((java.util.Collection<org.jsoup.nodes.Element>) elements46);
        boolean boolean48 = document37.equals((java.lang.Object) elements42);
        java.lang.String str49 = document37.toString();
        org.jsoup.nodes.Element element51 = document37.addClass("");
        org.jsoup.nodes.Attributes attributes52 = element51.attributes();
        org.jsoup.nodes.Element element53 = element30.prependChild((org.jsoup.nodes.Node) element51);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements54 = element53.siblingElements();
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test115");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("org.jsoup.select.Selector$SelectorParseException: ", " class=\"\"");
        org.jsoup.parser.Tag tag3 = document2.tag();
        java.lang.String str4 = tag3.getName();
        org.jsoup.nodes.Document document7 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements11 = document9.getElementsByTag("hi!");
        org.jsoup.select.Elements elements12 = elements11.parents();
        org.jsoup.nodes.Document document14 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements16 = document14.getElementsByTag("hi!");
        boolean boolean17 = elements12.addAll((java.util.Collection<org.jsoup.nodes.Element>) elements16);
        boolean boolean18 = document7.equals((java.lang.Object) elements12);
        java.lang.String str19 = document7.toString();
        org.jsoup.nodes.Element element21 = document7.addClass("");
        org.jsoup.nodes.Attributes attributes22 = element21.attributes();
        org.jsoup.nodes.Element element23 = new org.jsoup.nodes.Element(tag3, "class=\"\"", attributes22);
        java.lang.String str24 = element23.text();
        java.lang.String str25 = element23.outerHtml();
        java.lang.String str26 = element23.nodeName();
        org.jsoup.select.Elements elements29 = element23.getElementsByAttributeValueEnding(" class=\"\" class=\"\"=\"\" hi!=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;\"", "<html>\n<head>\n</head>\n<body>\n #text\n</body>\n</html><#root class=\"#root hi! hi!hi! hi!    hi! hi!    org.jsoup.select.Selector$SelectorParseException:  \">\n<html>\n <head>\n </head>\n <body>\n  hi!\n </body>\n</html>\n</#root>");
        org.jsoup.nodes.Element element31 = element23.prependElement(" .jsoup.select.Selector$SelectorParseException: ");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element32 = element23.lastElementSibling();
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test116");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("", "");
        org.jsoup.nodes.Attributes attributes3 = document2.attributes();
        org.jsoup.nodes.Element element5 = document2.prependText("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element6 = element5.nextElementSibling();
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test117");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse(" class=\"\"", "org.jsoup.select.Selector$SelectorParseException: ");
        boolean boolean3 = document2.hasText();
        java.lang.String str4 = document2.title();
        document2.setBaseUri("#root=\"\"");
        org.jsoup.nodes.Element element8 = document2.createElement("<html>\n<head>\n</head>\n<body>\n hi!\n</body>\n</html>");
        org.jsoup.select.Elements elements10 = element8.getElementsByAttribute("#text");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements11 = element8.siblingElements();
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test118");
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parse("#document", "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int3 = document2.siblingIndex();
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test119");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.nodes.Document document3 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements5 = document3.getElementsByTag("hi!");
        org.jsoup.select.Elements elements6 = elements5.parents();
        org.jsoup.nodes.Document document8 = new org.jsoup.nodes.Document("hi!");
        org.jsoup.select.Elements elements10 = document8.getElementsByTag("hi!");
        boolean boolean11 = elements6.addAll((java.util.Collection<org.jsoup.nodes.Element>) elements10);
        boolean boolean12 = document1.equals((java.lang.Object) elements6);
        java.lang.String str13 = document1.toString();
        org.jsoup.nodes.Element element15 = document1.addClass("");
        org.jsoup.nodes.Element element17 = document1.createElement("hi!");
        java.lang.String str18 = element17.baseUri();
        org.jsoup.nodes.Element element20 = element17.addClass("");
        org.jsoup.nodes.Element element21 = element20.parent();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node22 = element20.nextSibling();
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test120");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("\n<!--#root-->", "");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("<#root class=\"\">\n</#root>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int5 = textNode4.siblingIndex();
    }
}

