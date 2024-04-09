package org.jsoup.nodes;

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
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node3 = document2.parentNode;
        java.lang.String str4 = document2.title();
        org.jsoup.nodes.Element element6 = document2.text("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element7 = document2.firstElementSibling();
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test002");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node3 = document2.parentNode;
        java.lang.String str4 = document2.title();
        org.jsoup.nodes.Attributes attributes5 = document2.attributes();
        org.jsoup.nodes.Document document8 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node9 = document8.parentNode;
        org.jsoup.select.Elements elements11 = document8.getElementsByIndexLessThan((int) 'a');
        org.jsoup.nodes.Element element12 = document2.prependChild((org.jsoup.nodes.Node) document8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element13 = document2.firstElementSibling();
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test003");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node3 = document2.parentNode;
        org.jsoup.select.Elements elements5 = document2.getElementsByIndexLessThan((int) 'a');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element6 = document2.lastElementSibling();
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test004");
        org.jsoup.nodes.Evaluator.IndexLessThan indexLessThan1 = new org.jsoup.nodes.Evaluator.IndexLessThan((int) (byte) -1);
        org.jsoup.nodes.Document document4 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node5 = document4.parentNode;
        org.jsoup.select.Elements elements7 = document4.getElementsByIndexLessThan((int) 'a');
        boolean boolean8 = indexLessThan1.matches((org.jsoup.nodes.Element) document4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element9 = document4.previousElementSibling();
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test005");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str3 = document2.outerHtml();
        org.jsoup.select.Elements elements4 = document2.getAllElements();
        org.jsoup.nodes.Document document7 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node8 = document7.parentNode;
        java.lang.String str9 = document7.title();
        org.jsoup.nodes.Document document12 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str13 = document12.outerHtml();
        org.jsoup.nodes.Document document16 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node17 = document16.parentNode;
        java.lang.String str18 = document16.title();
        org.jsoup.nodes.Element element20 = document16.text("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element21 = document12.appendChild((org.jsoup.nodes.Node) document16);
        org.jsoup.nodes.Node node22 = document16.parentNode;
        document7.setParentNode(node22);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        document2.addChild((org.jsoup.nodes.Node) document7);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test006");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node3 = document2.parentNode;
        java.lang.String str4 = document2.title();
        org.jsoup.nodes.Attributes attributes5 = document2.attributes();
        org.jsoup.nodes.Document document8 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node9 = document8.parentNode;
        org.jsoup.select.Elements elements11 = document8.getElementsByIndexLessThan((int) 'a');
        org.jsoup.nodes.Element element12 = document2.prependChild((org.jsoup.nodes.Node) document8);
        org.jsoup.select.Elements elements14 = document2.select("hi");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements15 = document2.siblingElements();
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test007");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node3 = document2.parentNode;
        java.lang.String str4 = document2.title();
        org.jsoup.nodes.Attributes attributes5 = document2.attributes();
        org.jsoup.nodes.Document document8 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node9 = document8.parentNode;
        org.jsoup.select.Elements elements11 = document8.getElementsByIndexLessThan((int) 'a');
        org.jsoup.nodes.Element element12 = document2.prependChild((org.jsoup.nodes.Node) document8);
        java.util.List<org.jsoup.nodes.Node> nodeList13 = document2.childNodes;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element14 = document2.nextElementSibling();
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test008");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str3 = document2.outerHtml();
        org.jsoup.nodes.Document document6 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node7 = document6.parentNode;
        java.lang.String str8 = document6.title();
        org.jsoup.nodes.Element element10 = document6.text("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element11 = document2.appendChild((org.jsoup.nodes.Node) document6);
        boolean boolean13 = document2.hasAttr("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList14 = document2.siblingNodes();
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test009");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements16 = document4.siblingElements();
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test010");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node3 = document2.parentNode;
        org.jsoup.select.Elements elements5 = document2.getElementsByIndexLessThan((int) 'a');
        java.lang.String str6 = document2.text();
        org.jsoup.nodes.Element element8 = document2.text("");
        org.jsoup.nodes.Document document11 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str12 = document11.outerHtml();
        org.jsoup.select.Elements elements13 = document11.getAllElements();
        boolean boolean14 = element8.equals((java.lang.Object) elements13);
        java.lang.String str15 = elements13.html();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements17 = elements13.wrap("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html><#root>\n<html>\n <head>\n </head>\n <body>\n  &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;\n </body>\n</html>\n</#root>");
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test011");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str3 = document2.outerHtml();
        org.jsoup.select.Elements elements4 = document2.getAllElements();
        boolean boolean5 = document2.hasText();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element6 = document2.lastElementSibling();
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test012");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node3 = document2.parentNode;
        java.lang.String str4 = document2.title();
        org.jsoup.nodes.Document document7 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str8 = document7.outerHtml();
        org.jsoup.nodes.Document document11 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node12 = document11.parentNode;
        java.lang.String str13 = document11.title();
        org.jsoup.nodes.Element element15 = document11.text("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element16 = document7.appendChild((org.jsoup.nodes.Node) document11);
        org.jsoup.nodes.Node node17 = document11.parentNode;
        document2.setParentNode(node17);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node19 = node17.nextSibling();
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test013");
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parseBodyFragment("hi", "hi");
        java.lang.String str3 = document2.baseUri();
        java.lang.String str4 = document2.html();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element5 = document2.nextElementSibling();
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test014");
        org.jsoup.nodes.Evaluator.AttributeWithValueEnding attributeWithValueEnding2 = new org.jsoup.nodes.Evaluator.AttributeWithValueEnding("\n<!---->", "hi!");
        org.jsoup.nodes.Document document5 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str6 = document5.outerHtml();
        document5.setBaseUri("hi");
        boolean boolean9 = attributeWithValueEnding2.matches((org.jsoup.nodes.Element) document5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element10 = document5.nextElementSibling();
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test015");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!", "<html>\n<head>\n</head>\n<body>\n hi\n</body>\n</html>");
        org.jsoup.nodes.Document document5 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str6 = document5.outerHtml();
        org.jsoup.nodes.Document document9 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node10 = document9.parentNode;
        java.lang.String str11 = document9.title();
        org.jsoup.nodes.Element element13 = document9.text("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element14 = document5.appendChild((org.jsoup.nodes.Node) document9);
        org.jsoup.nodes.Element element16 = document5.removeClass("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html><#root>\n<html>\n <head>\n </head>\n <body>\n  &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;\n </body>\n</html>\n</#root>");
        java.lang.String str17 = document5.text();
        org.jsoup.nodes.Element element19 = document5.addClass("#document");
        boolean boolean20 = attribute2.equals((java.lang.Object) document5);
        org.jsoup.nodes.Document document23 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str24 = document23.nodeName();
        org.jsoup.select.Elements elements26 = document23.getElementsByAttribute("\n<!---->");
        boolean boolean27 = attribute2.equals((java.lang.Object) document23);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element28 = document23.firstElementSibling();
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test016");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node3 = document2.parentNode;
        org.jsoup.select.Elements elements4 = document2.getAllElements();
        org.jsoup.nodes.Element element6 = document2.createElement("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.select.Elements elements7 = element6.getAllElements();
        java.lang.String str8 = element6.html();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element9 = element6.previousElementSibling();
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test017");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell(" hi=\"\"");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node2 = document1.nextSibling();
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test018");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("\n<!---->", "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>\n<head>\n</head>\n<body> hi!\n</body>\n\nhi!");
        java.lang.String str3 = document2.val();
        org.jsoup.nodes.Document document6 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str7 = document6.outerHtml();
        org.jsoup.select.Elements elements8 = document6.getAllElements();
        java.lang.String str9 = document6.data();
        java.lang.String str10 = document6.baseUri();
        org.jsoup.nodes.Element element12 = document6.text("<#root>\n<html>\n <head>\n </head>\n <body> hi!\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        boolean boolean13 = document2.equals((java.lang.Object) document6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element14 = document2.firstElementSibling();
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test019");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str3 = document2.outerHtml();
        org.jsoup.select.Elements elements4 = document2.getAllElements();
        java.lang.String str5 = document2.data();
        org.jsoup.nodes.Element element7 = document2.text("");
        org.jsoup.nodes.Node node8 = document2.parentNode;
        org.jsoup.select.Elements elements10 = document2.getElementsByIndexGreaterThan((int) '4');
        org.jsoup.nodes.Element element12 = document2.text("hi=\"\"");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int13 = document2.siblingIndex();
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test020");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str3 = document2.nodeName();
        org.jsoup.select.Elements elements6 = document2.getElementsByAttributeValueContaining("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html><#root>\n<html>\n <head>\n </head>\n <body>\n  &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;\n </body>\n</html>\n</#root>", " !");
        org.jsoup.select.Elements elements9 = document2.getElementsByAttributeValueNot("hi=\"\"", "#root");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element10 = document2.lastElementSibling();
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test021");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str3 = document2.outerHtml();
        org.jsoup.select.Elements elements4 = document2.getAllElements();
        boolean boolean5 = document2.hasText();
        boolean boolean6 = document2.preserveWhitespace();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element7 = document2.previousElementSibling();
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test022");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str3 = document2.outerHtml();
        org.jsoup.select.Elements elements4 = document2.getAllElements();
        java.lang.String str5 = document2.data();
        org.jsoup.nodes.Element element7 = document2.text("");
        org.jsoup.nodes.Node node8 = document2.parentNode;
        org.jsoup.select.Elements elements10 = document2.getElementsByIndexGreaterThan((int) '4');
        org.jsoup.nodes.Element element12 = document2.text("hi=\"\"");
        org.jsoup.select.Elements elements13 = document2.children();
        org.jsoup.nodes.Element element16 = document2.attr("hi!", "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>\n<head>\n</head>\n<body> hi!\n</body>\n\nhi!");
        org.jsoup.nodes.Document document19 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str20 = document19.outerHtml();
        org.jsoup.select.Elements elements21 = document19.getAllElements();
        java.lang.String str22 = document19.data();
        org.jsoup.nodes.Element element24 = document19.text("");
        org.jsoup.nodes.Node node25 = document19.parentNode;
        org.jsoup.select.Elements elements27 = document19.getElementsByIndexGreaterThan((int) '4');
        org.jsoup.nodes.Element element29 = document19.text("hi=\"\"");
        boolean boolean30 = document19.hasText();
        org.jsoup.nodes.Element element32 = document19.text("hi=\"\"");
        document2.parentNode = document19;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements34 = document19.siblingElements();
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test023");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("#text", "");
        org.jsoup.nodes.Element element4 = document2.append("<html>\n<head>\n</head>\n<body>\n head\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList5 = element4.siblingNodes();
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test024");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str3 = document2.outerHtml();
        org.jsoup.nodes.Document document6 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node7 = document6.parentNode;
        java.lang.String str8 = document6.title();
        org.jsoup.nodes.Element element10 = document6.text("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element11 = document2.appendChild((org.jsoup.nodes.Node) document6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements12 = document2.siblingElements();
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test025");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements3 = document2.siblingElements();
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test026");
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
        org.jsoup.nodes.Element element17 = document2.addClass("<html>\n<head>\n</head>\n<body>\n hi\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element18 = element17.firstElementSibling();
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test027");
        org.jsoup.nodes.Evaluator.IndexLessThan indexLessThan1 = new org.jsoup.nodes.Evaluator.IndexLessThan((int) (byte) -1);
        org.jsoup.nodes.Document document4 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node5 = document4.parentNode;
        org.jsoup.select.Elements elements7 = document4.getElementsByIndexLessThan((int) 'a');
        boolean boolean8 = indexLessThan1.matches((org.jsoup.nodes.Element) document4);
        org.jsoup.nodes.Evaluator.Attribute attribute10 = new org.jsoup.nodes.Evaluator.Attribute("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.nodes.Document document13 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node14 = document13.parentNode;
        java.lang.String str15 = document13.title();
        org.jsoup.nodes.Attributes attributes16 = document13.attributes();
        org.jsoup.nodes.Document document19 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node20 = document19.parentNode;
        org.jsoup.select.Elements elements22 = document19.getElementsByIndexLessThan((int) 'a');
        org.jsoup.nodes.Element element23 = document13.prependChild((org.jsoup.nodes.Node) document19);
        org.jsoup.select.Elements elements25 = document13.select("hi");
        org.jsoup.select.Elements elements26 = document13.children();
        boolean boolean27 = attribute10.matches((org.jsoup.nodes.Element) document13);
        boolean boolean28 = indexLessThan1.matches((org.jsoup.nodes.Element) document13);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int29 = document13.siblingIndex();
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test028");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node3 = document2.parentNode;
        java.lang.String str4 = document2.title();
        org.jsoup.nodes.Attributes attributes5 = document2.attributes();
        org.jsoup.nodes.Node node8 = document2.attr("hi!", "hi!");
        org.jsoup.select.Elements elements9 = document2.getAllElements();
        org.jsoup.nodes.Element element11 = document2.appendElement("<html>\n<head>\n</head>\n<body>\n hi\n</body>\n</html>");
        java.lang.String str12 = document2.val();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int13 = document2.siblingIndex();
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test029");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node3 = document2.parentNode;
        org.jsoup.select.Elements elements5 = document2.getElementsByIndexLessThan((int) 'a');
        java.util.stream.Stream<org.jsoup.nodes.Element> elementStream6 = elements5.stream();
        org.jsoup.select.Elements elements8 = elements5.addClass("hi");
        org.jsoup.select.Elements elements9 = new org.jsoup.select.Elements((java.util.Collection<org.jsoup.nodes.Element>) elements8);
        org.jsoup.select.Elements elements12 = elements8.attr("head", "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.select.Elements elements14 = elements12.val("#text");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements16 = elements12.wrap("<#root>\n<html>\n <head>\n </head>\n <body> hi!\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test030");
        org.jsoup.nodes.Evaluator.IndexLessThan indexLessThan1 = new org.jsoup.nodes.Evaluator.IndexLessThan((int) (byte) -1);
        org.jsoup.nodes.Document document4 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node5 = document4.parentNode;
        org.jsoup.select.Elements elements7 = document4.getElementsByIndexLessThan((int) 'a');
        boolean boolean8 = indexLessThan1.matches((org.jsoup.nodes.Element) document4);
        org.jsoup.nodes.Document document11 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node12 = document11.parentNode;
        java.lang.String str13 = document11.title();
        org.jsoup.nodes.Attributes attributes14 = document11.attributes();
        org.jsoup.nodes.Node node17 = document11.attr("hi!", "hi!");
        org.jsoup.select.Elements elements18 = document11.getAllElements();
        boolean boolean19 = indexLessThan1.matches((org.jsoup.nodes.Element) document11);
        java.lang.String str20 = document11.id();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int21 = document11.siblingIndex();
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test031");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node3 = document2.parentNode;
        org.jsoup.select.Elements elements4 = document2.getAllElements();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element5 = document2.firstElementSibling();
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test032");
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
        org.jsoup.nodes.Element element17 = document2.addClass("<html>\n<head>\n</head>\n<body>\n hi\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element18 = document2.previousElementSibling();
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test033");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node3 = document2.parentNode;
        org.jsoup.select.Elements elements4 = document2.getAllElements();
        org.jsoup.nodes.Element element6 = document2.createElement("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.select.Elements elements7 = element6.getAllElements();
        java.lang.String str8 = element6.html();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int9 = element6.siblingIndex();
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test034");
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parseBodyFragment("[!]", "[ , !]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int3 = document2.siblingIndex();
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test035");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell(" hi=\"\"");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int2 = document1.siblingIndex();
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test036");
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
        java.util.List<org.jsoup.nodes.Node> nodeList17 = element16.childNodes;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int18 = element16.siblingIndex();
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test037");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str3 = document2.outerHtml();
        org.jsoup.select.Elements elements4 = document2.getAllElements();
        java.lang.String str5 = document2.data();
        org.jsoup.nodes.Element element7 = document2.text("");
        org.jsoup.nodes.Node node8 = document2.parentNode;
        org.jsoup.select.Elements elements10 = document2.getElementsByIndexGreaterThan((int) '4');
        org.jsoup.nodes.Element element12 = document2.text("hi=\"\"");
        boolean boolean13 = document2.hasText();
        org.jsoup.nodes.Element element15 = document2.text("hi=\"\"");
        java.lang.String str16 = document2.val();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node17 = document2.nextSibling();
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test038");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node3 = document2.parentNode;
        org.jsoup.select.Elements elements5 = document2.getElementsByIndexLessThan((int) 'a');
        java.lang.String str6 = document2.text();
        org.jsoup.nodes.Element element8 = document2.text("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int9 = document2.siblingIndex();
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test039");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node3 = document2.parentNode;
        org.jsoup.select.Elements elements5 = document2.getElementsByIndexLessThan((int) 'a');
        java.lang.String str6 = document2.text();
        org.jsoup.nodes.Element element8 = document2.text("");
        java.lang.String str9 = document2.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int10 = document2.siblingIndex();
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test040");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str3 = document2.outerHtml();
        org.jsoup.nodes.Document document6 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node7 = document6.parentNode;
        java.lang.String str8 = document6.title();
        org.jsoup.nodes.Element element10 = document6.text("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element11 = document2.appendChild((org.jsoup.nodes.Node) document6);
        org.jsoup.parser.Tag tag12 = element11.tag();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList13 = element11.siblingNodes();
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test041");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str3 = document2.outerHtml();
        document2.setBaseUri("hi");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements6 = document2.siblingElements();
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test042");
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parseBodyFragment("[ , !]", "hi=\"\"");
        java.lang.String str3 = document2.html();
        java.lang.String str4 = document2.html();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node5 = document2.previousSibling();
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test043");
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parse("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>\n<head>\n</head>\n<body> hi!\n</body>\n\nhi!", "<html>\n<head>\n</head>\n<body>\n [ , !]\n</body>\n</html>");
        org.jsoup.select.Elements elements5 = document2.getElementsByAttributeValueStarting("<!---->=\"\"", " hi=\"\"");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element6 = document2.nextElementSibling();
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test044");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("#text", "");
        org.jsoup.nodes.Element element3 = document2.head();
        org.jsoup.nodes.Element element5 = document2.appendText("<#root>\n  <html>\n   <head>\n   </head>\n   <body> hi!\n   </body>\n  </html>\n </#root>\n <html>\n  <head>\n  </head>\n  <body> hi!\n  </body>\n </html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element6 = document2.nextElementSibling();
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test045");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("\n<!---->");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element2 = document1.previousElementSibling();
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test046");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str3 = document2.outerHtml();
        org.jsoup.nodes.Document document6 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node7 = document6.parentNode;
        java.lang.String str8 = document6.title();
        org.jsoup.nodes.Element element10 = document6.text("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element11 = document2.appendChild((org.jsoup.nodes.Node) document6);
        org.jsoup.nodes.Element element13 = document2.removeClass("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html><#root>\n<html>\n <head>\n </head>\n <body>\n  &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;\n </body>\n</html>\n</#root>");
        java.lang.String str14 = document2.text();
        org.jsoup.select.Elements elements17 = document2.getElementsByAttributeValueStarting("[ , !]", " hi=\"\"");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int18 = document2.siblingIndex();
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test047");
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parseBodyFragment("hi", "hi");
        java.lang.String str3 = document2.baseUri();
        org.jsoup.nodes.Element element5 = document2.createElement("\n<!---->");
        org.jsoup.nodes.Evaluator.AttributeWithValueEnding attributeWithValueEnding8 = new org.jsoup.nodes.Evaluator.AttributeWithValueEnding("\n<!---->", "hi!");
        org.jsoup.nodes.Document document11 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str12 = document11.outerHtml();
        document11.setBaseUri("hi");
        boolean boolean15 = attributeWithValueEnding8.matches((org.jsoup.nodes.Element) document11);
        attributeWithValueEnding8.value = "hi! <html> <head> </head> <body> hi! </body> </html>";
        org.jsoup.nodes.Document document20 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str21 = document20.outerHtml();
        org.jsoup.nodes.Document document24 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node25 = document24.parentNode;
        java.lang.String str26 = document24.title();
        org.jsoup.nodes.Element element28 = document24.text("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element29 = document20.appendChild((org.jsoup.nodes.Node) document24);
        java.lang.String str30 = element29.outerHtml();
        boolean boolean31 = attributeWithValueEnding8.matches(element29);
        org.jsoup.nodes.Element element33 = element29.prependElement("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        element5.addChild((org.jsoup.nodes.Node) element29);
        org.jsoup.nodes.Element element35 = element5.empty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element36 = element35.firstElementSibling();
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test048");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.select.Elements elements3 = document2.getAllElements();
        org.jsoup.select.Elements elements5 = document2.getElementsByTag("<#root>\n<html>\n <head>\n </head>\n <body> hi!\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element6 = document2.lastElementSibling();
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test049");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node3 = document2.parentNode;
        org.jsoup.select.Elements elements5 = document2.getElementsByIndexLessThan((int) 'a');
        org.jsoup.select.Elements elements7 = elements5.append("hi=\"\"");
        int int8 = elements5.size();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements10 = elements5.wrap("<html> <head> </head> <body> hi! </body> </html> <html> <head> </head> <body> hi! </body> </html>  <html> <head> </head> <body> hi! </body> </html>");
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test050");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("<#root>\n<html>\n <head>\n </head>\n <body> hi!\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>", "<html>\n<head>\n</head>\n<body>\n hi\n</body>\n</html>=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n hi\n&lt;/body&gt;\n&lt;/html&gt;\"");
        org.jsoup.parser.Tag tag3 = document2.tag();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element4 = document2.previousElementSibling();
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test051");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node3 = document2.parentNode;
        org.jsoup.select.Elements elements4 = document2.getAllElements();
        document2.baseUri = "<html class=\" hi\">\n<head class=\" hi\">\n</head>\n<body class=\" hi\"> hi!\n</body>\n</html>\n<head class=\" hi\">\n</head>\n<body class=\" hi\"> hi!\n</body>\n\nhi!";
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node7 = document2.nextSibling();
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test052");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str3 = document2.outerHtml();
        org.jsoup.nodes.Document document6 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node7 = document6.parentNode;
        java.lang.String str8 = document6.title();
        org.jsoup.nodes.Element element10 = document6.text("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element11 = document2.appendChild((org.jsoup.nodes.Node) document6);
        org.jsoup.nodes.Node node12 = document6.parentNode;
        java.lang.String str13 = document6.data();
        org.jsoup.nodes.Element element15 = document6.html("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element17 = document6.text("[ , !]=\"\"");
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test053");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str3 = document2.outerHtml();
        org.jsoup.nodes.Document document6 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node7 = document6.parentNode;
        java.lang.String str8 = document6.title();
        org.jsoup.nodes.Element element10 = document6.text("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element11 = document2.appendChild((org.jsoup.nodes.Node) document6);
        java.lang.String str12 = element11.outerHtml();
        org.jsoup.select.Elements elements14 = element11.getElementsByIndexEquals((int) (byte) 0);
        boolean boolean15 = element11.isBlock();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node16 = element11.previousSibling();
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test054");
        org.jsoup.nodes.Evaluator.IndexLessThan indexLessThan1 = new org.jsoup.nodes.Evaluator.IndexLessThan((int) (byte) -1);
        org.jsoup.nodes.Document document4 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node5 = document4.parentNode;
        org.jsoup.select.Elements elements7 = document4.getElementsByIndexLessThan((int) 'a');
        boolean boolean8 = indexLessThan1.matches((org.jsoup.nodes.Element) document4);
        org.jsoup.nodes.Element element10 = document4.prepend("<html>\n<head>\n</head>\n<body>\n [ , !]\n</body>\n</html>");
        org.jsoup.nodes.Element element12 = document4.addClass("<html class=\" hi\">\n<head class=\" hi\">\n</head>\n<body class=\" hi\"> hi!\n</body>\n</html>\n<head class=\" hi\">\n</head>\n<body class=\" hi\"> hi!\n</body>\n\nhi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node13 = element12.previousSibling();
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test055");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str3 = document2.outerHtml();
        org.jsoup.select.Elements elements4 = document2.getAllElements();
        java.lang.String str5 = document2.data();
        org.jsoup.nodes.Element element7 = document2.text("");
        org.jsoup.nodes.Node node8 = document2.parentNode;
        org.jsoup.select.Elements elements10 = document2.getElementsByIndexGreaterThan((int) '4');
        org.jsoup.nodes.Element element12 = document2.text("hi=\"\"");
        org.jsoup.nodes.Element element13 = element12.parent();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements14 = element12.siblingElements();
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test056");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str3 = document2.outerHtml();
        org.jsoup.select.Elements elements4 = document2.getAllElements();
        java.lang.String str5 = document2.data();
        org.jsoup.nodes.Element element7 = document2.getElementById("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.select.Elements elements9 = document2.getElementsByTag("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html><#root>\n<html>\n <head>\n </head>\n <body>\n  &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;\n </body>\n</html>\n</#root>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList10 = document2.siblingNodes();
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test057");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str3 = document2.outerHtml();
        org.jsoup.select.Elements elements4 = document2.getAllElements();
        java.lang.String str5 = document2.data();
        org.jsoup.nodes.Element element7 = document2.text("");
        org.jsoup.nodes.Node node8 = document2.parentNode;
        org.jsoup.select.Elements elements10 = document2.getElementsByIndexGreaterThan((int) '4');
        org.jsoup.nodes.Element element12 = document2.text("hi=\"\"");
        boolean boolean13 = document2.hasText();
        org.jsoup.nodes.Element element15 = document2.createElement("<html>\n<head>\n</head>\n<body>\n [ , !]\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList16 = document2.siblingNodes();
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test058");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str3 = document2.outerHtml();
        org.jsoup.nodes.Document document6 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node7 = document6.parentNode;
        java.lang.String str8 = document6.title();
        org.jsoup.nodes.Element element10 = document6.text("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element11 = document2.appendChild((org.jsoup.nodes.Node) document6);
        org.jsoup.nodes.Element element12 = document6.nextElementSibling();
        org.jsoup.select.Elements elements13 = document6.siblingElements();
        java.util.stream.Stream<org.jsoup.nodes.Element> elementStream14 = elements13.stream();
        org.jsoup.select.Elements elements16 = elements13.val("hi");
        org.jsoup.nodes.Document document19 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node20 = document19.parentNode;
        org.jsoup.select.Elements elements21 = document19.getAllElements();
        org.jsoup.nodes.Element element23 = document19.createElement("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.select.Elements elements24 = element23.getAllElements();
        java.util.List<org.jsoup.nodes.Node> nodeList25 = element23.childNodes;
        int int26 = elements13.lastIndexOf((java.lang.Object) element23);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node27 = element23.previousSibling();
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test059");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node3 = document2.parentNode;
        org.jsoup.select.Elements elements5 = document2.getElementsByIndexLessThan((int) 'a');
        java.lang.String str6 = document2.text();
        org.jsoup.nodes.Element element8 = document2.text("");
        org.jsoup.nodes.Document document11 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str12 = document11.outerHtml();
        org.jsoup.select.Elements elements13 = document11.getAllElements();
        boolean boolean14 = element8.equals((java.lang.Object) elements13);
        org.jsoup.select.Elements elements15 = new org.jsoup.select.Elements((java.util.List<org.jsoup.nodes.Element>) elements13);
        java.util.stream.Stream<org.jsoup.nodes.Element> elementStream16 = elements15.parallelStream();
        org.jsoup.nodes.Document document19 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str20 = document19.outerHtml();
        org.jsoup.select.Elements elements21 = document19.getAllElements();
        org.jsoup.select.Elements elements23 = elements21.append("#document");
        boolean boolean24 = elements21.hasText();
        boolean boolean25 = elements15.removeAll((java.util.Collection<org.jsoup.nodes.Element>) elements21);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements27 = elements15.wrap("\n<body>\n <!----> hi!\n</body>");
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test060");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node3 = document2.parentNode;
        org.jsoup.select.Elements elements5 = document2.getElementsByIndexLessThan((int) 'a');
        java.util.stream.Stream<org.jsoup.nodes.Element> elementStream6 = elements5.stream();
        boolean boolean8 = elements5.hasClass("");
        org.jsoup.nodes.Element element10 = elements5.remove(0);
        org.jsoup.select.Elements elements13 = element10.getElementsByAttributeValueContaining("[ , !]=\"\"", "hi");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList14 = element10.siblingNodes();
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test061");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node3 = document2.parentNode;
        org.jsoup.select.Elements elements5 = document2.getElementsByIndexLessThan((int) 'a');
        java.lang.String str6 = document2.text();
        org.jsoup.nodes.Element element8 = document2.text("");
        org.jsoup.nodes.Document document11 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node12 = document11.parentNode;
        org.jsoup.select.Elements elements13 = document11.getAllElements();
        org.jsoup.nodes.Element element15 = document11.createElement("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.select.Elements elements16 = element15.getAllElements();
        org.jsoup.nodes.Element element17 = document2.appendChild((org.jsoup.nodes.Node) element15);
        org.jsoup.select.Elements elements20 = document2.getElementsByAttributeValueNot("hi", "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html><#root>\n<html>\n <head>\n </head>\n <body>\n  &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;\n </body>\n</html>\n</#root>");
        java.lang.String str21 = document2.tagName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int22 = document2.siblingIndex();
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test062");
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parseBodyFragment("hi", "hi");
        java.lang.String str3 = document2.baseUri();
        java.lang.String str4 = document2.html();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node5 = document2.previousSibling();
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test063");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean2 = tag1.canContainBlock();
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
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor28 = attributes16.iterator();
        org.jsoup.nodes.Document document31 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str32 = document31.outerHtml();
        org.jsoup.nodes.Document document35 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node36 = document35.parentNode;
        java.lang.String str37 = document35.title();
        org.jsoup.nodes.Element element39 = document35.text("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element40 = document31.appendChild((org.jsoup.nodes.Node) document35);
        org.jsoup.nodes.Attributes attributes41 = document35.attributes();
        boolean boolean43 = attributes41.hasKey("hi!");
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor44 = attributes41.iterator();
        org.jsoup.nodes.Document document47 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node48 = document47.parentNode;
        java.lang.String str49 = document47.title();
        org.jsoup.nodes.Attributes attributes50 = document47.attributes();
        java.lang.String str51 = attributes50.html();
        attributes41.addAll(attributes50);
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor53 = attributes50.iterator();
        attributes16.addAll(attributes50);
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator55 = attributes50.spliterator();
        org.jsoup.nodes.Element element56 = new org.jsoup.nodes.Element(tag1, "[!]", attributes50);
        org.jsoup.nodes.TextNode textNode59 = org.jsoup.nodes.TextNode.createFromEncoded("\n<!---->", "\n<!---->");
        boolean boolean60 = textNode59.isBlank();
        org.jsoup.nodes.TextNode textNode62 = textNode59.text("hi");
        org.jsoup.nodes.Element element63 = element56.appendChild((org.jsoup.nodes.Node) textNode62);
        org.jsoup.nodes.Element element65 = element63.val("<!---->=\"\"");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements66 = element65.siblingElements();
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test064");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str3 = document2.outerHtml();
        org.jsoup.select.Elements elements4 = document2.getAllElements();
        java.lang.String str5 = document2.data();
        org.jsoup.nodes.Element element7 = document2.text("");
        java.util.List<org.jsoup.nodes.Node> nodeList8 = element7.childNodes;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element9 = element7.nextElementSibling();
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test065");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str3 = document2.outerHtml();
        java.util.Set<java.lang.String> strSet4 = document2.classNames();
        java.lang.String str5 = document2.nodeName();
        org.jsoup.nodes.Document document8 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node9 = document8.parentNode;
        org.jsoup.select.Elements elements11 = document8.getElementsByIndexLessThan((int) 'a');
        java.lang.String str12 = document8.text();
        java.lang.String str13 = document8.nodeName();
        org.jsoup.nodes.Element element14 = document2.prependChild((org.jsoup.nodes.Node) document8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements15 = document2.siblingElements();
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test066");
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
        org.jsoup.nodes.Element element19 = document4.prependElement("<html>\n <head>\n </head>\n <body>\n </body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node20 = document4.previousSibling();
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test067");
        org.jsoup.nodes.Evaluator.AttributeWithValueStarting attributeWithValueStarting2 = new org.jsoup.nodes.Evaluator.AttributeWithValueStarting("hi", " hi=\"\"");
        org.jsoup.nodes.Document document5 = org.jsoup.Jsoup.parseBodyFragment("[ , !]", "hi=\"\"");
        java.lang.String str6 = document5.html();
        java.lang.String str7 = document5.html();
        boolean boolean8 = attributeWithValueStarting2.matches((org.jsoup.nodes.Element) document5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node9 = document5.previousSibling();
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test068");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node3 = document2.parentNode;
        org.jsoup.select.Elements elements5 = document2.getElementsByIndexLessThan((int) 'a');
        java.util.stream.Stream<org.jsoup.nodes.Element> elementStream6 = elements5.stream();
        org.jsoup.select.Elements elements8 = elements5.addClass("hi");
        org.jsoup.select.Elements elements9 = new org.jsoup.select.Elements((java.util.Collection<org.jsoup.nodes.Element>) elements8);
        org.jsoup.select.Elements elements12 = elements8.attr("head", "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.select.Elements elements14 = elements12.val("#text");
        org.jsoup.nodes.Document document17 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node18 = document17.parentNode;
        java.lang.String str19 = document17.title();
        org.jsoup.nodes.Attributes attributes20 = document17.attributes();
        org.jsoup.nodes.Document document23 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node24 = document23.parentNode;
        org.jsoup.select.Elements elements26 = document23.getElementsByIndexLessThan((int) 'a');
        org.jsoup.nodes.Element element27 = document17.prependChild((org.jsoup.nodes.Node) document23);
        org.jsoup.select.Elements elements29 = document23.getElementsByClass("!");
        org.jsoup.nodes.Element element31 = document23.append("hi!");
        int int32 = elements12.lastIndexOf((java.lang.Object) document23);
        org.jsoup.select.Elements elements34 = elements12.prepend("\n&lt;!----&gt;");
        org.jsoup.nodes.Element element35 = elements12.first();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node36 = element35.nextSibling();
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test069");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("!\n<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element2 = document1.firstElementSibling();
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test070");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node3 = document2.parentNode;
        org.jsoup.select.Elements elements5 = document2.getElementsByIndexLessThan((int) 'a');
        java.lang.String str6 = document2.text();
        org.jsoup.nodes.Element element8 = document2.text("");
        org.jsoup.nodes.Document document11 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str12 = document11.outerHtml();
        org.jsoup.select.Elements elements13 = document11.getAllElements();
        boolean boolean14 = element8.equals((java.lang.Object) elements13);
        boolean boolean16 = element8.hasClass("<html>\n<head>\n</head>\n<body>\n hi\n</body>\n</html>");
        java.lang.String str17 = element8.toString();
        org.jsoup.nodes.Element element19 = element8.appendText("<!---->=\"\"");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int20 = element19.siblingIndex();
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test071");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("#declaration", "\n&lt;!----&gt;");
        boolean boolean4 = document2.hasClass("<html>\n<head>\n <title> !</title>\n</head>\n<body> hi!\n</body>\n</html><#root>\n<html>\n <head>\n </head>\n <body>\n  &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;\n </body>\n</html>\n</#root>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element5 = document2.nextElementSibling();
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test072");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str3 = document2.outerHtml();
        org.jsoup.nodes.Document document6 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node7 = document6.parentNode;
        java.lang.String str8 = document6.title();
        org.jsoup.nodes.Element element10 = document6.text("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element11 = document2.appendChild((org.jsoup.nodes.Node) document6);
        java.lang.String str12 = element11.outerHtml();
        org.jsoup.select.Elements elements14 = element11.getElementsByIndexEquals((int) (byte) 0);
        boolean boolean15 = element11.isBlock();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList16 = element11.siblingNodes();
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test073");
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
        java.util.Spliterator<org.jsoup.nodes.Element> elementSpliterator23 = elements4.spliterator();
        org.jsoup.nodes.Document document26 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node27 = document26.parentNode;
        org.jsoup.select.Elements elements29 = document26.getElementsByIndexLessThan((int) 'a');
        org.jsoup.select.Elements elements31 = elements29.val("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        java.util.stream.Stream<org.jsoup.nodes.Element> elementStream32 = elements29.stream();
        org.jsoup.select.Elements elements34 = elements29.toggleClass("#document");
        java.util.Iterator<org.jsoup.nodes.Element> elementItor35 = elements34.iterator();
        org.jsoup.select.Elements elements37 = elements34.removeAttr("#comment");
        boolean boolean38 = elements4.removeAll((java.util.Collection<org.jsoup.nodes.Element>) elements34);
        org.jsoup.nodes.Element element40 = elements34.get(0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element41 = element40.lastElementSibling();
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test074");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node3 = document2.parentNode;
        org.jsoup.select.Elements elements4 = document2.getAllElements();
        org.jsoup.nodes.Element element6 = document2.createElement("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.select.Elements elements7 = element6.getAllElements();
        org.jsoup.parser.Tag tag8 = element6.tag();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element9 = element6.nextElementSibling();
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test075");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean2 = tag1.isEmpty();
        boolean boolean3 = tag1.preserveWhitespace();
        org.jsoup.nodes.Element element5 = new org.jsoup.nodes.Element(tag1, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        boolean boolean6 = tag1.isEmpty();
        org.jsoup.nodes.Document document9 = org.jsoup.Jsoup.parseBodyFragment("hi", "hi");
        java.lang.String str10 = document9.baseUri();
        org.jsoup.nodes.Element element12 = document9.createElement("\n<!---->");
        org.jsoup.nodes.Evaluator.AttributeWithValueEnding attributeWithValueEnding15 = new org.jsoup.nodes.Evaluator.AttributeWithValueEnding("\n<!---->", "hi!");
        org.jsoup.nodes.Document document18 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str19 = document18.outerHtml();
        document18.setBaseUri("hi");
        boolean boolean22 = attributeWithValueEnding15.matches((org.jsoup.nodes.Element) document18);
        attributeWithValueEnding15.value = "hi! <html> <head> </head> <body> hi! </body> </html>";
        org.jsoup.nodes.Document document27 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str28 = document27.outerHtml();
        org.jsoup.nodes.Document document31 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node32 = document31.parentNode;
        java.lang.String str33 = document31.title();
        org.jsoup.nodes.Element element35 = document31.text("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element36 = document27.appendChild((org.jsoup.nodes.Node) document31);
        java.lang.String str37 = element36.outerHtml();
        boolean boolean38 = attributeWithValueEnding15.matches(element36);
        org.jsoup.nodes.Element element40 = element36.prependElement("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        element12.addChild((org.jsoup.nodes.Node) element36);
        org.jsoup.nodes.Element element42 = element12.empty();
        boolean boolean43 = tag1.equals((java.lang.Object) element12);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node44 = element12.nextSibling();
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test076");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node3 = document2.parentNode;
        org.jsoup.select.Elements elements4 = document2.getAllElements();
        org.jsoup.nodes.Element element6 = document2.createElement("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.select.Elements elements7 = element6.getAllElements();
        org.jsoup.nodes.Element element9 = element6.addClass("<html> \n<head> \n</head> \n<body>\n  hi!  &lt;#root&gt; \n <html> \n  <head> \n  </head> \n  <body>\n    &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;   \n  </body>\n </html> org.jsoup.select.Selector$SelectorParseException: \n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node10 = element9.nextSibling();
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test077");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("#data");
        org.jsoup.nodes.Node node2 = document1.parent();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element3 = document1.firstElementSibling();
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test078");
        org.jsoup.nodes.Evaluator.AttributeWithValueEnding attributeWithValueEnding2 = new org.jsoup.nodes.Evaluator.AttributeWithValueEnding("\n<!---->", "hi!");
        org.jsoup.nodes.Document document5 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str6 = document5.outerHtml();
        document5.setBaseUri("hi");
        boolean boolean9 = attributeWithValueEnding2.matches((org.jsoup.nodes.Element) document5);
        org.jsoup.nodes.Document document12 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node13 = document12.parentNode;
        java.lang.String str14 = document12.title();
        org.jsoup.nodes.Attributes attributes15 = document12.attributes();
        org.jsoup.nodes.Document document18 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node19 = document18.parentNode;
        org.jsoup.select.Elements elements21 = document18.getElementsByIndexLessThan((int) 'a');
        org.jsoup.nodes.Element element22 = document12.prependChild((org.jsoup.nodes.Node) document18);
        java.lang.String str23 = document18.baseUri();
        org.jsoup.nodes.Document document26 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str27 = document26.outerHtml();
        org.jsoup.nodes.Document document30 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node31 = document30.parentNode;
        java.lang.String str32 = document30.title();
        org.jsoup.nodes.Element element34 = document30.text("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element35 = document26.appendChild((org.jsoup.nodes.Node) document30);
        org.jsoup.nodes.Attributes attributes36 = document30.attributes();
        document18.addChild((org.jsoup.nodes.Node) document30);
        org.jsoup.nodes.Document document39 = org.jsoup.Jsoup.parseBodyFragment("head");
        org.jsoup.nodes.Element element40 = document30.prependChild((org.jsoup.nodes.Node) document39);
        boolean boolean41 = attributeWithValueEnding2.matches((org.jsoup.nodes.Element) document30);
        org.jsoup.nodes.Evaluator.AttributeWithValueStarting attributeWithValueStarting44 = new org.jsoup.nodes.Evaluator.AttributeWithValueStarting("hi", "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        attributeWithValueStarting44.value = "hi!";
        java.lang.String str47 = attributeWithValueStarting44.value;
        org.jsoup.nodes.Document document50 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node51 = document50.parentNode;
        org.jsoup.select.Elements elements53 = document50.getElementsByIndexLessThan((int) 'a');
        java.lang.String str54 = document50.text();
        org.jsoup.nodes.Element element56 = document50.text("");
        org.jsoup.nodes.Document document59 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str60 = document59.outerHtml();
        org.jsoup.select.Elements elements61 = document59.getAllElements();
        boolean boolean62 = element56.equals((java.lang.Object) elements61);
        boolean boolean63 = attributeWithValueStarting44.matches(element56);
        org.jsoup.nodes.Element element66 = element56.attr("hi!", "");
        org.jsoup.select.Elements elements67 = org.jsoup.select.Collector.collect((org.jsoup.nodes.Evaluator) attributeWithValueEnding2, element56);
        java.util.List<org.jsoup.nodes.Node> nodeList68 = element56.childNodes;
        org.jsoup.nodes.Element element70 = element56.append("");
        org.jsoup.nodes.Element element73 = element56.attr("!=\"\"", "[ , !]=\"\"");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node74 = element73.nextSibling();
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test079");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str3 = document2.outerHtml();
        org.jsoup.nodes.Document document6 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node7 = document6.parentNode;
        java.lang.String str8 = document6.title();
        org.jsoup.nodes.Element element10 = document6.text("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element11 = document2.appendChild((org.jsoup.nodes.Node) document6);
        org.jsoup.nodes.Document document12 = document2.normalise();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node13 = document2.nextSibling();
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test080");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("#data");
        org.jsoup.nodes.Node node2 = document1.parent();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node3 = document1.nextSibling();
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test081");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node21 = element20.previousSibling();
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test082");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("#text", "");
        org.jsoup.nodes.Element element3 = document2.head();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element4 = document2.previousElementSibling();
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test083");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("\n<!---->", "\n<!---->");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("");
        java.lang.String str5 = textNode4.nodeName();
        org.jsoup.nodes.Document document8 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node9 = document8.parentNode;
        org.jsoup.select.Elements elements11 = document8.getElementsByIndexLessThan((int) 'a');
        java.lang.String str12 = document8.text();
        org.jsoup.nodes.Element element14 = document8.text("");
        org.jsoup.nodes.Document document17 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node18 = document17.parentNode;
        org.jsoup.select.Elements elements19 = document17.getAllElements();
        org.jsoup.nodes.Element element21 = document17.createElement("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.select.Elements elements22 = element21.getAllElements();
        org.jsoup.nodes.Element element23 = document8.appendChild((org.jsoup.nodes.Node) element21);
        org.jsoup.select.Elements elements26 = document8.getElementsByAttributeValueNot("hi", "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html><#root>\n<html>\n <head>\n </head>\n <body>\n  &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;\n </body>\n</html>\n</#root>");
        java.lang.String str27 = document8.tagName();
        org.jsoup.nodes.Document document30 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str31 = document30.outerHtml();
        org.jsoup.nodes.Document document34 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node35 = document34.parentNode;
        java.lang.String str36 = document34.title();
        org.jsoup.nodes.Element element38 = document34.text("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element39 = document30.appendChild((org.jsoup.nodes.Node) document34);
        java.util.Set<java.lang.String> strSet40 = document34.classNames();
        org.jsoup.nodes.Element element41 = document8.classNames(strSet40);
        textNode4.addChild((org.jsoup.nodes.Node) element41);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node43 = textNode4.nextSibling();
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test084");
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parseBodyFragment("#data", " !");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element3 = document2.previousElementSibling();
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test085");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node3 = document2.parentNode;
        org.jsoup.select.Elements elements4 = document2.getAllElements();
        org.jsoup.nodes.Element element6 = document2.createElement("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.select.Elements elements7 = element6.getAllElements();
        java.lang.String str8 = element6.html();
        boolean boolean9 = element6.preserveWhitespace();
        org.jsoup.nodes.Document document12 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str13 = document12.outerHtml();
        org.jsoup.select.Elements elements14 = document12.getAllElements();
        java.lang.String str15 = document12.data();
        org.jsoup.nodes.Element element17 = document12.text("");
        org.jsoup.nodes.Node node18 = document12.parentNode;
        org.jsoup.select.Elements elements20 = document12.getElementsByIndexGreaterThan((int) '4');
        org.jsoup.nodes.Element element22 = document12.text("hi=\"\"");
        boolean boolean23 = document12.hasText();
        boolean boolean24 = element6.equals((java.lang.Object) boolean23);
        org.jsoup.nodes.Document document27 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str28 = document27.outerHtml();
        org.jsoup.select.Elements elements29 = document27.getAllElements();
        java.lang.String str30 = document27.data();
        org.jsoup.nodes.Element element32 = document27.text("");
        boolean boolean34 = document27.hasClass("hi!");
        boolean boolean35 = element6.equals((java.lang.Object) document27);
        org.jsoup.nodes.Element element36 = element6.empty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList37 = element36.siblingNodes();
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test086");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.select.Elements elements3 = document2.getAllElements();
        org.jsoup.select.Elements elements5 = document2.getElementsByIndexLessThan((int) (short) 10);
        document2.title("<html>\n<head>\n</head>\n<body>\n hi\n</body>\n</html>");
        org.jsoup.nodes.Element element8 = document2.head();
        org.jsoup.nodes.Evaluator.AttributeWithValueStarting attributeWithValueStarting11 = new org.jsoup.nodes.Evaluator.AttributeWithValueStarting("hi", "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        attributeWithValueStarting11.value = "hi!";
        java.lang.String str14 = attributeWithValueStarting11.value;
        org.jsoup.nodes.Document document17 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node18 = document17.parentNode;
        org.jsoup.select.Elements elements20 = document17.getElementsByIndexLessThan((int) 'a');
        java.lang.String str21 = document17.text();
        org.jsoup.nodes.Element element23 = document17.text("");
        org.jsoup.nodes.Document document26 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str27 = document26.outerHtml();
        org.jsoup.select.Elements elements28 = document26.getAllElements();
        boolean boolean29 = element23.equals((java.lang.Object) elements28);
        boolean boolean30 = attributeWithValueStarting11.matches(element23);
        org.jsoup.nodes.Element element33 = element23.attr("hi!", "");
        org.jsoup.nodes.Attributes attributes34 = element23.attributes;
        java.lang.String str35 = element23.baseUri;
        document2.addChild((org.jsoup.nodes.Node) element23);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element37 = document2.previousElementSibling();
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test087");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element3 = document1.text("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>\n<head>\n</head>\n<body> hi!\n</body>\n\nhi!");
        java.lang.String str4 = element3.tagName();
        java.lang.String str5 = element3.text();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element6 = element3.previousElementSibling();
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test088");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi! hi!  hi!");
        java.lang.String str2 = document1.tagName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node3 = document1.nextSibling();
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test089");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str3 = document2.outerHtml();
        org.jsoup.select.Elements elements4 = document2.getAllElements();
        java.lang.String str5 = document2.data();
        org.jsoup.nodes.Element element7 = document2.text("");
        org.jsoup.nodes.Node node8 = document2.parentNode;
        org.jsoup.select.Elements elements10 = document2.getElementsByIndexGreaterThan((int) '4');
        org.jsoup.nodes.Element element12 = document2.text("hi=\"\"");
        boolean boolean13 = document2.hasText();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element14 = document2.nextElementSibling();
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test090");
        org.jsoup.nodes.Evaluator.Id id1 = new org.jsoup.nodes.Evaluator.Id("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>\n<head>\n</head>\n<body> hi!\n</body>\n\nhi!");
        org.jsoup.nodes.Document document3 = org.jsoup.nodes.Document.createShell("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element5 = document3.text("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>\n<head>\n</head>\n<body> hi!\n</body>\n\nhi!");
        boolean boolean6 = id1.matches(element5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node7 = element5.previousSibling();
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test091");
        org.jsoup.nodes.Evaluator.AttributeWithValueStarting attributeWithValueStarting2 = new org.jsoup.nodes.Evaluator.AttributeWithValueStarting("hi", "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        attributeWithValueStarting2.value = "hi!";
        java.lang.String str5 = attributeWithValueStarting2.value;
        attributeWithValueStarting2.key = "hi";
        org.jsoup.nodes.Document document10 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str11 = document10.outerHtml();
        org.jsoup.nodes.Document document14 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node15 = document14.parentNode;
        java.lang.String str16 = document14.title();
        org.jsoup.nodes.Element element18 = document14.text("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element19 = document10.appendChild((org.jsoup.nodes.Node) document14);
        org.jsoup.nodes.Document document20 = document10.normalise();
        org.jsoup.nodes.Element element21 = document10.empty();
        boolean boolean22 = attributeWithValueStarting2.matches(element21);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element23 = element21.firstElementSibling();
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test092");
        org.jsoup.nodes.Evaluator.IndexGreaterThan indexGreaterThan1 = new org.jsoup.nodes.Evaluator.IndexGreaterThan((int) (byte) 10);
        org.jsoup.nodes.Document document3 = new org.jsoup.nodes.Document(" hi=\"\"");
        boolean boolean4 = indexGreaterThan1.matches((org.jsoup.nodes.Element) document3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element5 = document3.firstElementSibling();
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test093");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str3 = document2.outerHtml();
        org.jsoup.nodes.Document document6 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node7 = document6.parentNode;
        java.lang.String str8 = document6.title();
        org.jsoup.nodes.Element element10 = document6.text("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element11 = document2.appendChild((org.jsoup.nodes.Node) document6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<org.jsoup.nodes.Node> nodeList12 = element11.siblingNodes();
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test094");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean2 = tag1.preserveWhitespace();
        java.lang.String str3 = tag1.toString();
        org.jsoup.nodes.Document document7 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node8 = document7.parentNode;
        java.lang.String str9 = document7.title();
        org.jsoup.nodes.Attributes attributes10 = document7.attributes();
        java.lang.String str11 = attributes10.html();
        org.jsoup.nodes.Element element12 = new org.jsoup.nodes.Element(tag1, "!", attributes10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element13 = element12.nextElementSibling();
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test095");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("hi! hi!  hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element3 = document1.wrap("<html class=\" hi\">\n<head class=\" hi\">\n</head>\n<body class=\" hi\"> hi!\n</body>\n</html>\n<head class=\" hi\">\n</head>\n<body class=\" hi\"> hi!\n</body>\n\nhi!=\"#comment\"");
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test096");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node3 = document2.parentNode;
        org.jsoup.select.Elements elements5 = document2.getElementsByIndexLessThan((int) 'a');
        java.lang.String str6 = document2.text();
        org.jsoup.nodes.Element element8 = document2.text("");
        org.jsoup.nodes.Document document11 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node12 = document11.parentNode;
        org.jsoup.select.Elements elements13 = document11.getAllElements();
        org.jsoup.nodes.Element element15 = document11.createElement("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.select.Elements elements16 = element15.getAllElements();
        org.jsoup.nodes.Element element17 = document2.appendChild((org.jsoup.nodes.Node) element15);
        org.jsoup.select.Elements elements20 = document2.getElementsByAttributeValueNot("hi", "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html><#root>\n<html>\n <head>\n </head>\n <body>\n  &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;\n </body>\n</html>\n</#root>");
        org.jsoup.nodes.Element element22 = document2.appendElement("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Integer int23 = document2.siblingIndex();
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test097");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("<html class=\" hi\">\n<head class=\" hi\">\n</head>\n<body class=\" hi\"> hi!\n</body>\n</html>\n<head class=\" hi\">\n</head>\n<body class=\" hi\"> hi!\n</body>\n\nhi!", "#comment");
        java.lang.String str3 = attribute2.getKey();
        java.lang.String str4 = attribute2.toString();
        org.jsoup.nodes.Document document6 = org.jsoup.nodes.Document.createShell("");
        document6.baseUri = "";
        boolean boolean9 = attribute2.equals((java.lang.Object) document6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element11 = document6.wrap("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html><#root>\n<html>\n <head>\n </head>\n <body>\n  &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;\n </body>\n</html>\n</#root>");
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test098");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node3 = document2.parentNode;
        org.jsoup.select.Elements elements4 = document2.getAllElements();
        org.jsoup.nodes.Element element6 = document2.createElement("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.select.Elements elements7 = element6.getAllElements();
        java.lang.String str8 = element6.html();
        boolean boolean9 = element6.preserveWhitespace();
        org.jsoup.nodes.Document document12 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str13 = document12.outerHtml();
        org.jsoup.select.Elements elements14 = document12.getAllElements();
        java.lang.String str15 = document12.data();
        org.jsoup.nodes.Element element17 = document12.text("");
        org.jsoup.nodes.Node node18 = document12.parentNode;
        org.jsoup.select.Elements elements20 = document12.getElementsByIndexGreaterThan((int) '4');
        org.jsoup.nodes.Element element22 = document12.text("hi=\"\"");
        boolean boolean23 = document12.hasText();
        boolean boolean24 = element6.equals((java.lang.Object) boolean23);
        org.jsoup.nodes.Document document27 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str28 = document27.outerHtml();
        org.jsoup.select.Elements elements29 = document27.getAllElements();
        java.lang.String str30 = document27.data();
        org.jsoup.nodes.Element element32 = document27.text("");
        boolean boolean34 = document27.hasClass("hi!");
        boolean boolean35 = element6.equals((java.lang.Object) document27);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element36 = element6.nextElementSibling();
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test099");
        org.jsoup.nodes.Evaluator.IndexGreaterThan indexGreaterThan1 = new org.jsoup.nodes.Evaluator.IndexGreaterThan((int) ' ');
        org.jsoup.nodes.Evaluator.IndexLessThan indexLessThan3 = new org.jsoup.nodes.Evaluator.IndexLessThan((int) (byte) -1);
        org.jsoup.nodes.Document document6 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node7 = document6.parentNode;
        org.jsoup.select.Elements elements9 = document6.getElementsByIndexLessThan((int) 'a');
        boolean boolean10 = indexLessThan3.matches((org.jsoup.nodes.Element) document6);
        org.jsoup.nodes.Element element12 = document6.prepend("<html>\n<head>\n</head>\n<body>\n [ , !]\n</body>\n</html>");
        boolean boolean13 = indexGreaterThan1.matches((org.jsoup.nodes.Element) document6);
        org.jsoup.nodes.Document document16 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node17 = document16.parentNode;
        java.lang.String str18 = document16.title();
        org.jsoup.nodes.Attributes attributes19 = document16.attributes();
        org.jsoup.nodes.Document document22 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node23 = document22.parentNode;
        org.jsoup.select.Elements elements25 = document22.getElementsByIndexLessThan((int) 'a');
        org.jsoup.nodes.Element element26 = document16.prependChild((org.jsoup.nodes.Node) document22);
        java.lang.String str27 = document22.baseUri();
        org.jsoup.nodes.Document document30 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str31 = document30.outerHtml();
        org.jsoup.nodes.Document document34 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node35 = document34.parentNode;
        java.lang.String str36 = document34.title();
        org.jsoup.nodes.Element element38 = document34.text("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element39 = document30.appendChild((org.jsoup.nodes.Node) document34);
        org.jsoup.nodes.Attributes attributes40 = document34.attributes();
        document22.addChild((org.jsoup.nodes.Node) document34);
        org.jsoup.nodes.Element element43 = document34.wrap("<html class=\" hi\">\n<head class=\" hi\">\n</head>\n<body class=\" hi\"> hi!\n</body>\n</html>\n<head class=\" hi\">\n</head>\n<body class=\" hi\"> hi!\n</body>\n\nhi!");
        org.jsoup.select.Elements elements44 = element43.getAllElements();
        org.jsoup.nodes.Element element46 = element43.prepend("<!---->=\"\"");
        java.util.List<org.jsoup.nodes.Node> nodeList47 = element43.childNodes;
        org.jsoup.nodes.Document document50 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str51 = document50.outerHtml();
        org.jsoup.select.Elements elements52 = document50.getAllElements();
        java.lang.String str53 = document50.data();
        org.jsoup.nodes.Element element55 = document50.text("");
        org.jsoup.select.Elements elements57 = element55.getElementsByIndexLessThan((int) (byte) -1);
        org.jsoup.nodes.Element element58 = element43.prependChild((org.jsoup.nodes.Node) element55);
        org.jsoup.nodes.Element element60 = element55.toggleClass("");
        java.lang.String str61 = element55.data();
        org.jsoup.select.Elements elements62 = org.jsoup.select.Collector.collect((org.jsoup.nodes.Evaluator) indexGreaterThan1, element55);
        org.jsoup.nodes.Document document65 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node66 = document65.parentNode;
        org.jsoup.select.Elements elements68 = document65.getElementsByIndexLessThan((int) 'a');
        java.lang.String str69 = document65.text();
        org.jsoup.select.Elements elements72 = document65.getElementsByAttributeValueNot("hi=\"\"", "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        java.lang.String str73 = document65.text();
        org.jsoup.select.Elements elements74 = org.jsoup.select.Collector.collect((org.jsoup.nodes.Evaluator) indexGreaterThan1, (org.jsoup.nodes.Element) document65);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element75 = document65.lastElementSibling();
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test100");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node3 = document2.parentNode;
        org.jsoup.select.Elements elements4 = document2.getAllElements();
        org.jsoup.nodes.Element element6 = document2.createElement("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.select.Elements elements7 = element6.getAllElements();
        java.lang.String str8 = element6.html();
        org.jsoup.select.Elements elements11 = element6.getElementsByAttributeValueStarting(" hi=\"\"", "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element13 = element6.toggleClass("hi hi  hi");
        org.jsoup.nodes.Element element15 = element13.getElementById("<html> \n<head> \n</head> \n<body>\n  [ , !]  \n</body>\n</html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements16 = element13.siblingElements();
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test101");
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
        org.jsoup.nodes.Element element27 = element25.appendText("<html>\n<head>\n</head>\n<body>\n</body>\n</html><<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>>\n</<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>><hi!>\n</hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements28 = element27.siblingElements();
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test102");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node3 = document2.parentNode;
        java.lang.String str4 = document2.title();
        org.jsoup.nodes.Attributes attributes5 = document2.attributes();
        org.jsoup.nodes.Node node8 = document2.attr("hi!", "hi!");
        org.jsoup.nodes.Document document11 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node12 = document11.parentNode;
        org.jsoup.select.Elements elements14 = document11.getElementsByIndexLessThan((int) 'a');
        java.util.stream.Stream<org.jsoup.nodes.Element> elementStream15 = elements14.stream();
        org.jsoup.select.Elements elements17 = elements14.addClass("hi");
        org.jsoup.select.Elements elements18 = new org.jsoup.select.Elements((java.util.Collection<org.jsoup.nodes.Element>) elements17);
        org.jsoup.select.Elements elements21 = elements17.attr("head", "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.select.Elements elements23 = elements21.val("#text");
        org.jsoup.nodes.Document document26 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node27 = document26.parentNode;
        java.lang.String str28 = document26.title();
        org.jsoup.nodes.Attributes attributes29 = document26.attributes();
        org.jsoup.nodes.Document document32 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node33 = document32.parentNode;
        org.jsoup.select.Elements elements35 = document32.getElementsByIndexLessThan((int) 'a');
        org.jsoup.nodes.Element element36 = document26.prependChild((org.jsoup.nodes.Node) document32);
        org.jsoup.select.Elements elements38 = document32.getElementsByClass("!");
        org.jsoup.nodes.Element element40 = document32.append("hi!");
        int int41 = elements21.lastIndexOf((java.lang.Object) document32);
        org.jsoup.select.Elements elements43 = elements21.prepend("\n&lt;!----&gt;");
        org.jsoup.nodes.Element element44 = elements21.first();
        java.lang.Integer int45 = org.jsoup.nodes.Node.indexInList((org.jsoup.nodes.Element) document2, (java.util.List<org.jsoup.nodes.Element>) elements21);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.select.Elements elements46 = document2.siblingElements();
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test103");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.select.Elements elements3 = document2.getAllElements();
        org.jsoup.select.Elements elements5 = document2.getElementsByIndexLessThan((int) (short) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element6 = document2.lastElementSibling();
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test104");
        org.jsoup.nodes.Evaluator.IndexEquals indexEquals1 = new org.jsoup.nodes.Evaluator.IndexEquals((int) '!');
        org.jsoup.nodes.Document document4 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node5 = document4.parentNode;
        java.lang.String str6 = document4.title();
        org.jsoup.nodes.Attributes attributes7 = document4.attributes();
        org.jsoup.nodes.Document document10 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node11 = document10.parentNode;
        org.jsoup.select.Elements elements13 = document10.getElementsByIndexLessThan((int) 'a');
        org.jsoup.nodes.Element element14 = document4.prependChild((org.jsoup.nodes.Node) document10);
        java.util.List<org.jsoup.nodes.Node> nodeList15 = document4.childNodes;
        org.jsoup.select.Elements elements17 = document4.getElementsByTag("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element19 = document4.addClass("<html>\n<head>\n</head>\n<body>\n hi\n</body>\n</html>");
        boolean boolean20 = indexEquals1.matches((org.jsoup.nodes.Element) document4);
        org.jsoup.nodes.Evaluator.Tag tag22 = new org.jsoup.nodes.Evaluator.Tag("#document");
        org.jsoup.nodes.Evaluator.IndexLessThan indexLessThan24 = new org.jsoup.nodes.Evaluator.IndexLessThan((int) (byte) -1);
        org.jsoup.nodes.Document document27 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node28 = document27.parentNode;
        org.jsoup.select.Elements elements30 = document27.getElementsByIndexLessThan((int) 'a');
        boolean boolean31 = indexLessThan24.matches((org.jsoup.nodes.Element) document27);
        org.jsoup.nodes.Document document34 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node35 = document34.parentNode;
        org.jsoup.select.Elements elements36 = document34.getAllElements();
        org.jsoup.select.Elements elements37 = org.jsoup.select.Collector.collect((org.jsoup.nodes.Evaluator) indexLessThan24, (org.jsoup.nodes.Element) document34);
        boolean boolean38 = tag22.matches((org.jsoup.nodes.Element) document34);
        document34.baseUri = "hi=\"\"";
        org.jsoup.nodes.Element element42 = document34.appendText("");
        org.jsoup.nodes.Element element44 = element42.prependText(" !");
        org.jsoup.nodes.Element element46 = element44.addClass("\n<!---->");
        org.jsoup.nodes.Element element48 = element46.appendText("<html>\n<head>\n</head>\n<body>\n</body>\n</html><<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>>\n</<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>><hi!>\n</hi!>");
        boolean boolean49 = indexEquals1.matches(element46);
        org.jsoup.nodes.Document document52 = org.jsoup.parser.Parser.parse("#declaration", "\n&lt;!----&gt;");
        org.jsoup.nodes.Document document55 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str56 = document55.outerHtml();
        org.jsoup.nodes.Document document59 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node60 = document59.parentNode;
        java.lang.String str61 = document59.title();
        org.jsoup.nodes.Element element63 = document59.text("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element64 = document55.appendChild((org.jsoup.nodes.Node) document59);
        org.jsoup.nodes.Element element65 = document59.head();
        org.jsoup.nodes.Evaluator.Tag tag67 = new org.jsoup.nodes.Evaluator.Tag("#document");
        org.jsoup.nodes.Document document70 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str71 = document70.outerHtml();
        org.jsoup.nodes.Document document74 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node75 = document74.parentNode;
        java.lang.String str76 = document74.title();
        org.jsoup.nodes.Element element78 = document74.text("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element79 = document70.appendChild((org.jsoup.nodes.Node) document74);
        org.jsoup.nodes.Element element80 = document74.head();
        java.lang.String str81 = element80.id();
        boolean boolean82 = tag67.matches(element80);
        java.lang.String str83 = element80.baseUri();
        element65.parentNode = element80;
        org.jsoup.select.Elements elements85 = element65.getAllElements();
        document52.parentNode = element65;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean87 = indexEquals1.matches((org.jsoup.nodes.Element) document52);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test105");
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parseBodyFragment("hi", "hi");
        java.lang.String str3 = document2.baseUri();
        org.jsoup.nodes.Element element5 = document2.createElement("\n<!---->");
        org.jsoup.nodes.Evaluator.AttributeWithValueEnding attributeWithValueEnding8 = new org.jsoup.nodes.Evaluator.AttributeWithValueEnding("\n<!---->", "hi!");
        org.jsoup.nodes.Document document11 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str12 = document11.outerHtml();
        document11.setBaseUri("hi");
        boolean boolean15 = attributeWithValueEnding8.matches((org.jsoup.nodes.Element) document11);
        attributeWithValueEnding8.value = "hi! <html> <head> </head> <body> hi! </body> </html>";
        org.jsoup.nodes.Document document20 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str21 = document20.outerHtml();
        org.jsoup.nodes.Document document24 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node25 = document24.parentNode;
        java.lang.String str26 = document24.title();
        org.jsoup.nodes.Element element28 = document24.text("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element29 = document20.appendChild((org.jsoup.nodes.Node) document24);
        java.lang.String str30 = element29.outerHtml();
        boolean boolean31 = attributeWithValueEnding8.matches(element29);
        org.jsoup.nodes.Element element33 = element29.prependElement("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        element5.addChild((org.jsoup.nodes.Node) element29);
        org.jsoup.nodes.Element element35 = element5.empty();
        org.jsoup.select.Elements elements37 = element5.getElementsByAttribute("a#document");
        org.jsoup.nodes.Element element39 = element5.toggleClass("<html>\n    <head>\n    </head>\n    <body>\n     &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;\n    </body>\n   </html>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node40 = element5.previousSibling();
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test106");
        org.jsoup.nodes.Evaluator.IndexGreaterThan indexGreaterThan1 = new org.jsoup.nodes.Evaluator.IndexGreaterThan(4);
        org.jsoup.nodes.Document document4 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node5 = document4.parentNode;
        java.lang.String str6 = document4.title();
        org.jsoup.nodes.Attributes attributes7 = document4.attributes();
        org.jsoup.nodes.Node node10 = document4.attr("hi!", "hi!");
        org.jsoup.select.Elements elements11 = document4.getAllElements();
        org.jsoup.nodes.Element element13 = document4.appendElement("<html>\n<head>\n</head>\n<body>\n hi\n</body>\n</html>");
        org.jsoup.nodes.Document document16 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str17 = document16.outerHtml();
        org.jsoup.nodes.Document document20 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node21 = document20.parentNode;
        java.lang.String str22 = document20.title();
        org.jsoup.nodes.Element element24 = document20.text("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element25 = document16.appendChild((org.jsoup.nodes.Node) document20);
        org.jsoup.nodes.Node node26 = document20.parentNode;
        boolean boolean28 = node26.hasAttr("hi");
        document4.setParentNode(node26);
        document4.title("#text");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean32 = indexGreaterThan1.matches((org.jsoup.nodes.Element) document4);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test107");
        org.jsoup.nodes.Evaluator.Tag tag1 = new org.jsoup.nodes.Evaluator.Tag("hi!");
        org.jsoup.nodes.Document document4 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str5 = document4.outerHtml();
        org.jsoup.nodes.Document document8 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node9 = document8.parentNode;
        java.lang.String str10 = document8.title();
        org.jsoup.nodes.Element element12 = document8.text("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element13 = document4.appendChild((org.jsoup.nodes.Node) document8);
        boolean boolean14 = tag1.matches((org.jsoup.nodes.Element) document4);
        document4.title("[]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element17 = document4.nextElementSibling();
    }
}

