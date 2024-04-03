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
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1502");
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
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1503");
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
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1504");
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
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1505");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("\n<!-- #document-->", "<html>\n<head>\n</head>\n<body>\n</body>\n</html><<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>>\n</<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>><hi!>\n</hi!>");
        org.junit.Assert.assertNotNull(document2);
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1506");
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
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1507");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("#declaration", "<html>\n<head>\n</head>\n<body>\n &lt;#root&gt; \n <html> \n  <head> \n  </head> \n  <body>\n    hi!    \n   <html> \n    <head> \n    </head> \n    <body>\n      hi!  \n    </body>\n   </html>\n  </body>\n </html>\n</body>\n</html><&lt;!----&gt;>\n</&lt;!----&gt;>");
        org.jsoup.nodes.Element element5 = document2.attr("\n<<html>\n<head>\n</head>\n<body>\n</body>\n</html>>\n</<html>\n<head>\n</head>\n<body>\n</body>\n</html>>", "<html> <head> </head> <body> hi! </body> </html> <html> <head> </head> <body> hi! </body> </html>  <html> <head> </head> <body> hi! </body> </html>");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element5);
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1508");
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
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1509");
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
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1510");
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
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1511");
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
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1512");
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
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1513");
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
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1514");
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
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1515");
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
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1516");
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
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1517");
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
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1518");
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
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1519");
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
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1520");
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
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1521");
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
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1522");
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
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1523");
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
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1524");
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
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1525");
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
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1526");
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
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1527");
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

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1528");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("#text", "");
        org.jsoup.nodes.Element element3 = document2.head();
        org.jsoup.nodes.Element element5 = document2.prependText("a");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1529");
        org.jsoup.nodes.Evaluator.AttributeWithValueStarting attributeWithValueStarting2 = new org.jsoup.nodes.Evaluator.AttributeWithValueStarting("hi", " hi=\"\"");
        org.jsoup.nodes.Document document5 = org.jsoup.Jsoup.parseBodyFragment("[ , !]", "hi=\"\"");
        java.lang.String str6 = document5.html();
        java.lang.String str7 = document5.html();
        boolean boolean8 = attributeWithValueStarting2.matches((org.jsoup.nodes.Element) document5);
        org.jsoup.select.Elements elements10 = document5.getElementsByTag("<html>\n  <head>\n  </head>\n  <body>\n   &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;\n  </body>\n </html>");
        org.jsoup.select.Elements elements12 = document5.getElementsByIndexGreaterThan((int) (byte) 10);
        org.junit.Assert.assertNotNull(document5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<html>\n<head>\n</head>\n<body>\n [ , !]\n</body>\n</html>" + "'", str6, "<html>\n<head>\n</head>\n<body>\n [ , !]\n</body>\n</html>");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<html>\n<head>\n</head>\n<body>\n [ , !]\n</body>\n</html>" + "'", str7, "<html>\n<head>\n</head>\n<body>\n [ , !]\n</body>\n</html>");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(elements12);
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1530");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node3 = document2.parentNode;
        org.jsoup.select.Elements elements5 = document2.getElementsByIndexLessThan((int) 'a');
        org.jsoup.select.Elements elements7 = elements5.val("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        java.util.stream.Stream<org.jsoup.nodes.Element> elementStream8 = elements5.stream();
        org.jsoup.select.Elements elements10 = elements5.toggleClass("#document");
        org.jsoup.nodes.Document document13 = org.jsoup.Jsoup.parseBodyFragment("hi", "hi");
        org.jsoup.nodes.Document document16 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node17 = document16.parentNode;
        org.jsoup.select.Elements elements19 = document16.getElementsByIndexLessThan((int) 'a');
        java.util.stream.Stream<org.jsoup.nodes.Element> elementStream20 = elements19.stream();
        org.jsoup.select.Elements elements22 = elements19.addClass("hi");
        org.jsoup.select.Elements elements23 = new org.jsoup.select.Elements((java.util.Collection<org.jsoup.nodes.Element>) elements22);
        java.lang.Integer int24 = org.jsoup.nodes.Node.indexInList((org.jsoup.nodes.Element) document13, (java.util.List<org.jsoup.nodes.Element>) elements23);
        boolean boolean25 = elements5.removeAll((java.util.Collection<org.jsoup.nodes.Element>) elements23);
        org.jsoup.nodes.Attribute attribute28 = org.jsoup.nodes.Attribute.createFromEncoded("hi", "");
        java.lang.String str29 = attribute28.html();
        attribute28.setKey("#document");
        attribute28.setValue("\n&lt;!----&gt;");
        attribute28.setKey("<html>\n <head>\n </head>\n <body>\n  &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;\n </body>\n</html>&lt;html class=&quot; hi&quot;&gt; &lt;head class=&quot; hi&quot;&gt; &lt;/head&gt; &lt;body class=&quot; hi&quot;&gt; hi! &lt;/body&gt; &lt;/html&gt; &lt;head class=&quot; hi&quot;&gt; &lt;/head&gt; &lt;body class=&quot; hi&quot;&gt; hi! &lt;/body&gt; hi!");
        int int36 = elements5.lastIndexOf((java.lang.Object) attribute28);
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(elementStream8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertNotNull(document16);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertNotNull(elementStream20);
        org.junit.Assert.assertNotNull(elements22);
        org.junit.Assert.assertNull(int24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(attribute28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi=\"\"" + "'", str29, "hi=\"\"");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1531");
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
        org.jsoup.nodes.Element element32 = document22.appendText("<html class=\" hi\">\n<head class=\" hi\">\n</head>\n<body class=\" hi\"> hi!\n</body>\n</html>\n<head class=\" hi\">\n</head>\n<body class=\" hi\"> hi!\n</body>\n\nhi!");
        org.jsoup.select.Elements elements35 = element32.getElementsByAttributeValueNot("<html>\n<head>\n</head>\n<body>\n</body>\n</html><<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>>\n</<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>>", "<!---->");
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
        org.junit.Assert.assertNotNull(elements35);
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1532");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str3 = document2.outerHtml();
        org.jsoup.nodes.Document document6 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node7 = document6.parentNode;
        java.lang.String str8 = document6.title();
        org.jsoup.nodes.Element element10 = document6.text("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element11 = document2.appendChild((org.jsoup.nodes.Node) document6);
        org.jsoup.nodes.Attributes attributes12 = document6.attributes();
        boolean boolean14 = attributes12.hasKey("hi!");
        int int15 = attributes12.size();
        int int16 = attributes12.size();
        java.util.List<org.jsoup.nodes.Attribute> attributeList17 = attributes12.asList();
        java.lang.String str18 = attributes12.html();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator19 = attributes12.spliterator();
        org.jsoup.nodes.Document document22 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str23 = document22.outerHtml();
        org.jsoup.nodes.Document document26 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node27 = document26.parentNode;
        java.lang.String str28 = document26.title();
        org.jsoup.nodes.Element element30 = document26.text("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element31 = document22.appendChild((org.jsoup.nodes.Node) document26);
        org.jsoup.nodes.Attributes attributes32 = document26.attributes();
        boolean boolean34 = attributes32.hasKey("hi!");
        int int35 = attributes32.size();
        int int36 = attributes32.size();
        java.util.List<org.jsoup.nodes.Attribute> attributeList37 = attributes32.asList();
        java.lang.String str38 = attributes32.html();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator39 = attributes32.spliterator();
        attributes12.addAll(attributes32);
        attributes32.remove("#text");
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor43 = attributes32.iterator();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str3, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(attributes12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(attributeList17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(attributeSpliterator19);
        org.junit.Assert.assertNotNull(document22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str23, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document26);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertNotNull(attributes32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(attributeList37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNotNull(attributeSpliterator39);
        org.junit.Assert.assertNotNull(attributeItor43);
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1533");
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
        java.lang.String str18 = elements15.text();
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1534");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str3 = document2.outerHtml();
        org.jsoup.nodes.Document document6 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node7 = document6.parentNode;
        java.lang.String str8 = document6.title();
        org.jsoup.nodes.Element element10 = document6.text("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element11 = document2.appendChild((org.jsoup.nodes.Node) document6);
        boolean boolean13 = document2.hasAttr("hi!");
        org.jsoup.nodes.Element element14 = document2.parent();
        boolean boolean16 = document2.hasAttr("#comment");
        org.jsoup.nodes.Attributes attributes17 = document2.attributes();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str3, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(element14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(attributes17);
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1535");
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
        org.jsoup.nodes.Element element72 = element56.appendElement("<head>\n  </head>");
        org.junit.Assert.assertNotNull(document5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str6, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(attributes15);
        org.junit.Assert.assertNotNull(document18);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNotNull(elements21);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNotNull(document26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str27, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document30);
        org.junit.Assert.assertNull(node31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(element34);
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertNotNull(attributes36);
        org.junit.Assert.assertNotNull(document39);
        org.junit.Assert.assertNotNull(element40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "hi!" + "'", str47, "hi!");
        org.junit.Assert.assertNotNull(document50);
        org.junit.Assert.assertNull(node51);
        org.junit.Assert.assertNotNull(elements53);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "hi!" + "'", str54, "hi!");
        org.junit.Assert.assertNotNull(element56);
        org.junit.Assert.assertNotNull(document59);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str60, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(elements61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(element66);
        org.junit.Assert.assertNotNull(elements67);
        org.junit.Assert.assertNotNull(nodeList68);
        org.junit.Assert.assertNotNull(element70);
        org.junit.Assert.assertNotNull(element72);
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1536");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node3 = document2.parentNode;
        org.jsoup.select.Elements elements5 = document2.getElementsByIndexLessThan((int) 'a');
        org.jsoup.select.Elements elements7 = elements5.append("hi=\"\"");
        int int8 = elements5.size();
        java.lang.String str9 = elements5.text();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Element> elementList12 = elements5.subList((int) '<', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: toIndex = 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi=\"\" hi!hi=\"\"hi=\"\"hi=\"\" hi=\"\" hi!hi=\"\"hi=\"\" hi=\"\" hi!hi=\"\"" + "'", str9, "hi=\"\" hi!hi=\"\"hi=\"\"hi=\"\" hi=\"\" hi!hi=\"\"hi=\"\" hi=\"\" hi!hi=\"\"");
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1537");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node3 = document2.parentNode;
        org.jsoup.select.Elements elements5 = document2.getElementsByIndexLessThan((int) 'a');
        org.jsoup.select.Elements elements7 = elements5.val("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        java.util.stream.Stream<org.jsoup.nodes.Element> elementStream8 = elements5.stream();
        org.jsoup.select.Elements elements10 = elements5.prepend("hi");
        org.jsoup.nodes.Document document13 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node14 = document13.parentNode;
        org.jsoup.select.Elements elements16 = document13.getElementsByIndexLessThan((int) 'a');
        java.lang.String str17 = document13.text();
        org.jsoup.nodes.Element element19 = document13.text("");
        org.jsoup.nodes.Document document22 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node23 = document22.parentNode;
        org.jsoup.select.Elements elements24 = document22.getAllElements();
        org.jsoup.nodes.Element element26 = document22.createElement("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.select.Elements elements27 = element26.getAllElements();
        org.jsoup.nodes.Element element28 = document13.appendChild((org.jsoup.nodes.Node) element26);
        org.jsoup.select.Elements elements31 = document13.getElementsByAttributeValueNot("hi", "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html><#root>\n<html>\n <head>\n </head>\n <body>\n  &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;\n </body>\n</html>\n</#root>");
        boolean boolean32 = elements10.contains((java.lang.Object) elements31);
        org.jsoup.nodes.Document document36 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node37 = document36.parentNode;
        org.jsoup.select.Elements elements39 = document36.getElementsByIndexLessThan((int) 'a');
        java.util.stream.Stream<org.jsoup.nodes.Element> elementStream40 = elements39.stream();
        org.jsoup.select.Elements elements42 = elements39.addClass("hi");
        org.jsoup.select.Elements elements43 = new org.jsoup.select.Elements((java.util.Collection<org.jsoup.nodes.Element>) elements42);
        org.jsoup.select.Elements elements46 = elements42.attr("head", "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.select.Elements elements48 = elements46.val("#text");
        org.jsoup.nodes.Document document51 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node52 = document51.parentNode;
        java.lang.String str53 = document51.title();
        org.jsoup.nodes.Attributes attributes54 = document51.attributes();
        org.jsoup.nodes.Document document57 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node58 = document57.parentNode;
        org.jsoup.select.Elements elements60 = document57.getElementsByIndexLessThan((int) 'a');
        org.jsoup.nodes.Element element61 = document51.prependChild((org.jsoup.nodes.Node) document57);
        org.jsoup.select.Elements elements63 = document57.getElementsByClass("!");
        org.jsoup.nodes.Element element65 = document57.append("hi!");
        int int66 = elements46.lastIndexOf((java.lang.Object) document57);
        org.jsoup.select.Elements elements68 = elements46.prepend("\n&lt;!----&gt;");
        org.jsoup.nodes.Element element69 = elements46.first();
        boolean boolean70 = elements10.addAll((int) (short) 0, (java.util.Collection<org.jsoup.nodes.Element>) elements46);
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(elementStream8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(document22);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertNotNull(elements24);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertNotNull(elements27);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertNotNull(elements31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(document36);
        org.junit.Assert.assertNull(node37);
        org.junit.Assert.assertNotNull(elements39);
        org.junit.Assert.assertNotNull(elementStream40);
        org.junit.Assert.assertNotNull(elements42);
        org.junit.Assert.assertNotNull(elements46);
        org.junit.Assert.assertNotNull(elements48);
        org.junit.Assert.assertNotNull(document51);
        org.junit.Assert.assertNull(node52);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertNotNull(attributes54);
        org.junit.Assert.assertNotNull(document57);
        org.junit.Assert.assertNull(node58);
        org.junit.Assert.assertNotNull(elements60);
        org.junit.Assert.assertNotNull(element61);
        org.junit.Assert.assertNotNull(elements63);
        org.junit.Assert.assertNotNull(element65);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + (-1) + "'", int66 == (-1));
        org.junit.Assert.assertNotNull(elements68);
        org.junit.Assert.assertNotNull(element69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1538");
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
        org.jsoup.nodes.Document document20 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str21 = document20.outerHtml();
        org.jsoup.nodes.Document document24 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node25 = document24.parentNode;
        java.lang.String str26 = document24.title();
        org.jsoup.nodes.Element element28 = document24.text("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element29 = document20.appendChild((org.jsoup.nodes.Node) document24);
        org.jsoup.nodes.Element element30 = document24.nextElementSibling();
        org.jsoup.select.Elements elements31 = document24.siblingElements();
        elements12.add(0, (org.jsoup.nodes.Element) document24);
        org.jsoup.nodes.Element element34 = document24.getElementById("\n&lt;!----&gt;");
        org.junit.Assert.assertNotNull(elementArray1);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str7, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(document20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str21, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document24);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertNull(element30);
        org.junit.Assert.assertNotNull(elements31);
        org.junit.Assert.assertNull(element34);
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1539");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("<#root>\n<html>\n <head>\n </head>\n <body> hi!\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>", "<html>\n<head>\n</head>\n<body>\n hi\n</body>\n</html>=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n hi\n&lt;/body&gt;\n&lt;/html&gt;\"");
        org.jsoup.nodes.Element element4 = document2.appendElement("\n&lt;!----&gt;");
        org.jsoup.nodes.Document document7 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node8 = document7.parentNode;
        java.lang.String str9 = document7.title();
        org.jsoup.nodes.Attributes attributes10 = document7.attributes();
        org.jsoup.nodes.Document document13 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node14 = document13.parentNode;
        org.jsoup.select.Elements elements16 = document13.getElementsByIndexLessThan((int) 'a');
        org.jsoup.nodes.Element element17 = document7.prependChild((org.jsoup.nodes.Node) document13);
        org.jsoup.select.Elements elements19 = document13.getElementsByClass("!");
        org.jsoup.nodes.Element element21 = document13.append("hi!");
        org.jsoup.nodes.Document document24 = org.jsoup.Jsoup.parse("", "<html>\n<head>\n</head>\n<body>\n hi\n</body>\n</html>");
        java.lang.String[] strArray32 = new java.lang.String[] { "<html>\n<head>\n</head>\n<body>\n hi\n</body>\n</html>=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n hi\n&lt;/body&gt;\n&lt;/html&gt;\"", "[ , #, d, o, c, u, m, e, n, t]", "<html class=\" hi\" head=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt; hi!\n&lt;/body&gt;\n&lt;/html&gt;\" value=\"#text\">\n<head class=\" hi\" head=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt; hi!\n&lt;/body&gt;\n&lt;/html&gt;\" value=\"#text\">\n</head>\n<body class=\" hi\" head=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt; hi!\n&lt;/body&gt;\n&lt;/html&gt;\" value=\"#text\"> hi!\n</body>\n</html>\n\n<html class=\" hi\" head=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt; hi!\n&lt;/body&gt;\n&lt;/html&gt;\" value=\"#text\">\n<head class=\" hi\" head=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt; hi!\n&lt;/body&gt;\n&lt;/html&gt;\" value=\"#text\">\n</head>\n<body class=\" hi\" head=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt; hi!\n&lt;/body&gt;\n&lt;/html&gt;\" value=\"#text\"> hi!\n</body>\n</html>\n\n<head class=\" hi\" head=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt; hi!\n&lt;/body&gt;\n&lt;/html&gt;\" value=\"#text\">\n</head>\n\n<body class=\" hi\" head=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt; hi!\n&lt;/body&gt;\n&lt;/html&gt;\" value=\"#text\"> hi!\n</body>", "#data", "#declaration", "#declaration", "\n&lt;!----&gt;" };
        java.util.LinkedHashSet<java.lang.String> strSet33 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet33, strArray32);
        org.jsoup.nodes.Element element35 = document24.classNames((java.util.Set<java.lang.String>) strSet33);
        org.jsoup.nodes.Element element36 = element21.classNames((java.util.Set<java.lang.String>) strSet33);
        org.jsoup.nodes.Element element37 = document2.classNames((java.util.Set<java.lang.String>) strSet33);
        org.jsoup.nodes.Element element39 = document2.text("<html>\n<head>\n #document\n</head>\n<body> hi!#document\n</body>#document\n</html>#document\n<head>\n #document\n</head>\n<body> hi!#document\n</body>#document\n#document\nhi!#document");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(document24);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertNotNull(element36);
        org.junit.Assert.assertNotNull(element37);
        org.junit.Assert.assertNotNull(element39);
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1540");
        org.jsoup.nodes.Evaluator.Tag tag1 = new org.jsoup.nodes.Evaluator.Tag("#document");
        org.jsoup.nodes.Document document4 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str5 = document4.outerHtml();
        org.jsoup.nodes.Document document8 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node9 = document8.parentNode;
        java.lang.String str10 = document8.title();
        org.jsoup.nodes.Element element12 = document8.text("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element13 = document4.appendChild((org.jsoup.nodes.Node) document8);
        org.jsoup.nodes.Element element14 = document8.head();
        java.lang.String str15 = element14.id();
        boolean boolean16 = tag1.matches(element14);
        org.jsoup.nodes.DataNode dataNode19 = org.jsoup.nodes.DataNode.createFromEncoded("<html class=\" hi\">\n<head class=\" hi\">\n</head>\n<body class=\" hi\"> hi!\n</body>\n</html>\n<head class=\" hi\">\n</head>\n<body class=\" hi\"> hi!\n</body>\n\nhi!", "");
        java.lang.String str20 = dataNode19.getWholeData();
        org.jsoup.nodes.Node node22 = dataNode19.removeAttr("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        java.lang.String str23 = dataNode19.nodeName();
        java.lang.String str24 = dataNode19.nodeName();
        boolean boolean25 = element14.equals((java.lang.Object) dataNode19);
        org.jsoup.nodes.Element element27 = element14.removeClass("[ , !]=\"\"");
        org.junit.Assert.assertNotNull(document4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str5, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(dataNode19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "<html class=\" hi\">\n<head class=\" hi\">\n</head>\n<body class=\" hi\"> hi!\n</body>\n</html>\n<head class=\" hi\">\n</head>\n<body class=\" hi\"> hi!\n</body>\n\nhi!" + "'", str20, "<html class=\" hi\">\n<head class=\" hi\">\n</head>\n<body class=\" hi\"> hi!\n</body>\n</html>\n<head class=\" hi\">\n</head>\n<body class=\" hi\"> hi!\n</body>\n\nhi!");
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "#data" + "'", str23, "#data");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "#data" + "'", str24, "#data");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(element27);
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1541");
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
        boolean boolean19 = document13.hasClass("hi!");
        java.lang.String str20 = document13.toString();
        org.jsoup.nodes.Document document22 = org.jsoup.nodes.Document.createShell(" hi=\"\"");
        java.lang.String str23 = document22.baseUri();
        java.lang.String str24 = document22.tagName();
        org.jsoup.nodes.Document document27 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str28 = document27.outerHtml();
        org.jsoup.nodes.Document document31 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node32 = document31.parentNode;
        java.lang.String str33 = document31.title();
        org.jsoup.nodes.Element element35 = document31.text("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element36 = document27.appendChild((org.jsoup.nodes.Node) document31);
        org.jsoup.nodes.Element element37 = document31.head();
        java.lang.String str38 = element37.id();
        org.jsoup.select.Elements elements41 = element37.getElementsByAttributeValueNot("\n<!---->", "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.nodes.Document document44 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str45 = document44.outerHtml();
        org.jsoup.select.Elements elements46 = document44.getAllElements();
        java.lang.String str47 = document44.data();
        org.jsoup.nodes.Element element49 = document44.text("");
        element37.addChild((org.jsoup.nodes.Node) document44);
        java.util.Set<java.lang.String> strSet51 = element37.classNames();
        org.jsoup.nodes.Element element52 = document22.classNames(strSet51);
        org.jsoup.nodes.Element element53 = document13.classNames(strSet51);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str20, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi=\"\"" + "'", str23, "hi=\"\"");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "#root" + "'", str24, "#root");
        org.junit.Assert.assertNotNull(document27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str28, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document31);
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertNotNull(element36);
        org.junit.Assert.assertNotNull(element37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNotNull(elements41);
        org.junit.Assert.assertNotNull(document44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str45, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(elements46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertNotNull(element49);
        org.junit.Assert.assertNotNull(strSet51);
        org.junit.Assert.assertNotNull(element52);
        org.junit.Assert.assertNotNull(element53);
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1542");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n hi\n&lt;/body&gt;\n&lt;/html&gt;", "[ , !]=\"\"");
        org.junit.Assert.assertNotNull(document2);
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1543");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell(" !");
        org.jsoup.nodes.Element element3 = document1.appendText("[!]");
        org.jsoup.nodes.Element element4 = element3.empty();
        java.lang.String str5 = element4.toString();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1544");
        org.jsoup.nodes.Evaluator.AllElements allElements0 = new org.jsoup.nodes.Evaluator.AllElements();
        org.jsoup.nodes.Document document3 = org.jsoup.Jsoup.parseBodyFragment("hi", "hi");
        boolean boolean4 = allElements0.matches((org.jsoup.nodes.Element) document3);
        java.lang.String str5 = document3.val();
        java.lang.String str6 = document3.baseUri;
        org.jsoup.nodes.Document document7 = document3.normalise();
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi" + "'", str6, "hi");
        org.junit.Assert.assertNotNull(document7);
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1545");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str3 = document2.outerHtml();
        org.jsoup.nodes.Document document6 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node7 = document6.parentNode;
        java.lang.String str8 = document6.title();
        org.jsoup.nodes.Element element10 = document6.text("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element11 = document2.appendChild((org.jsoup.nodes.Node) document6);
        org.jsoup.nodes.Element element12 = document6.nextElementSibling();
        org.jsoup.nodes.Attributes attributes13 = document6.attributes;
        java.lang.String str14 = attributes13.html();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str3, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNull(element12);
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1546");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str3 = document2.outerHtml();
        org.jsoup.nodes.Document document6 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node7 = document6.parentNode;
        java.lang.String str8 = document6.title();
        org.jsoup.nodes.Element element10 = document6.text("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element11 = document2.appendChild((org.jsoup.nodes.Node) document6);
        org.jsoup.nodes.Element element12 = document6.head();
        org.jsoup.nodes.Evaluator.IndexLessThan indexLessThan14 = new org.jsoup.nodes.Evaluator.IndexLessThan((int) (byte) -1);
        org.jsoup.nodes.Document document17 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node18 = document17.parentNode;
        org.jsoup.select.Elements elements20 = document17.getElementsByIndexLessThan((int) 'a');
        boolean boolean21 = indexLessThan14.matches((org.jsoup.nodes.Element) document17);
        boolean boolean22 = element12.equals((java.lang.Object) boolean21);
        boolean boolean24 = element12.hasClass("hi=\"\"hi!");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str3, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(document17);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertNotNull(elements20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1547");
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
        org.jsoup.select.Elements elements31 = document13.getElementsByAttributeValueEnding("<#root>\n<html>\n <head>\n </head>\n <body> hi!\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>", "hi! <html> <head> </head> <body> hi! </body> </html>");
        org.jsoup.select.Elements elements33 = elements31.eq((int) '!');
        org.junit.Assert.assertNotNull(document4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(attributes16);
        org.junit.Assert.assertNotNull(document19);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertNotNull(elements22);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(elements25);
        org.junit.Assert.assertNotNull(elements26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(elements31);
        org.junit.Assert.assertNotNull(elements33);
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1548");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node3 = document2.parentNode;
        org.jsoup.select.Elements elements4 = document2.getAllElements();
        document2.baseUri = "<html class=\" hi\">\n<head class=\" hi\">\n</head>\n<body class=\" hi\"> hi!\n</body>\n</html>\n<head class=\" hi\">\n</head>\n<body class=\" hi\"> hi!\n</body>\n\nhi!";
        org.jsoup.nodes.Element element8 = document2.text("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements10 = document2.getElementsByClass("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(element8);
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1549");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("hi! <html> <head> </head> <body> hi! </body> </html>", "<html>\n<head>\n</head>\n<body>\n hi\n</body>\n</html>");
        org.jsoup.nodes.Document document5 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node6 = document5.parentNode;
        org.jsoup.select.Elements elements8 = document5.getElementsByIndexLessThan((int) 'a');
        java.util.stream.Stream<org.jsoup.nodes.Element> elementStream9 = elements8.stream();
        boolean boolean11 = elements8.hasClass("");
        java.lang.Integer int12 = org.jsoup.nodes.Node.indexInList((org.jsoup.nodes.Element) document2, (java.util.List<org.jsoup.nodes.Element>) elements8);
        org.jsoup.select.Elements elements14 = elements8.eq((int) (short) 0);
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(document5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(elementStream9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(int12);
        org.junit.Assert.assertNotNull(elements14);
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1550");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node3 = document2.parentNode;
        java.lang.String str4 = document2.title();
        org.jsoup.nodes.Attributes attributes5 = document2.attributes();
        org.jsoup.nodes.Node node8 = document2.attr("hi!", "hi!");
        org.jsoup.select.Elements elements9 = document2.getAllElements();
        org.jsoup.nodes.Element element11 = document2.appendElement("<html>\n<head>\n</head>\n<body>\n hi\n</body>\n</html>");
        java.lang.String str12 = document2.val();
        org.jsoup.nodes.Element element14 = document2.createElement("<#root>\n  <html>\n   <head>\n   </head>\n   <body> hi!\n   </body>\n  </html>\n </#root>\n <html>\n  <head>\n  </head>\n  <body> hi!\n  </body>\n </html>");
        java.util.List<org.jsoup.nodes.Node> nodeList15 = document2.childNodes;
        document2.title("i");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(nodeList15);
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1551");
        org.jsoup.nodes.Evaluator.AllElements allElements0 = new org.jsoup.nodes.Evaluator.AllElements();
        org.jsoup.nodes.Element element1 = null;
        boolean boolean2 = allElements0.matches(element1);
        org.jsoup.nodes.Document document5 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str6 = document5.outerHtml();
        org.jsoup.nodes.Document document9 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node10 = document9.parentNode;
        java.lang.String str11 = document9.title();
        org.jsoup.nodes.Element element13 = document9.text("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element14 = document5.appendChild((org.jsoup.nodes.Node) document9);
        org.jsoup.nodes.Element element15 = document9.nextElementSibling();
        org.jsoup.nodes.Attributes attributes16 = document9.attributes;
        org.jsoup.nodes.Document document19 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node20 = document19.parentNode;
        org.jsoup.select.Elements elements22 = document19.getElementsByIndexLessThan((int) 'a');
        java.lang.String str23 = document19.text();
        org.jsoup.nodes.Element element25 = document19.text("");
        org.jsoup.nodes.Document document28 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str29 = document28.outerHtml();
        org.jsoup.select.Elements elements30 = document28.getAllElements();
        boolean boolean31 = element25.equals((java.lang.Object) elements30);
        org.jsoup.select.Elements elements33 = element25.getElementsByIndexEquals((int) '#');
        document9.parentNode = element25;
        boolean boolean35 = allElements0.matches(element25);
        org.jsoup.nodes.Document document38 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node39 = document38.parentNode;
        org.jsoup.select.Elements elements41 = document38.getElementsByIndexLessThan((int) 'a');
        java.lang.String str42 = document38.text();
        org.jsoup.nodes.Element element44 = document38.text("");
        org.jsoup.nodes.Document document47 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node48 = document47.parentNode;
        org.jsoup.select.Elements elements49 = document47.getAllElements();
        org.jsoup.nodes.Element element51 = document47.createElement("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.select.Elements elements52 = element51.getAllElements();
        org.jsoup.nodes.Element element53 = document38.appendChild((org.jsoup.nodes.Node) element51);
        org.jsoup.nodes.Element element55 = document38.toggleClass("<html>\n<head>\n</head>\n<body>\n head\n</body>\n</html>");
        boolean boolean56 = allElements0.matches((org.jsoup.nodes.Element) document38);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(document5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str6, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNull(element15);
        org.junit.Assert.assertNotNull(attributes16);
        org.junit.Assert.assertNotNull(document19);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertNotNull(elements22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(document28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str29, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(elements30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(elements33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(document38);
        org.junit.Assert.assertNull(node39);
        org.junit.Assert.assertNotNull(elements41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
        org.junit.Assert.assertNotNull(element44);
        org.junit.Assert.assertNotNull(document47);
        org.junit.Assert.assertNull(node48);
        org.junit.Assert.assertNotNull(elements49);
        org.junit.Assert.assertNotNull(element51);
        org.junit.Assert.assertNotNull(elements52);
        org.junit.Assert.assertNotNull(element53);
        org.junit.Assert.assertNotNull(element55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
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
        org.jsoup.nodes.Document document46 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node47 = document46.parentNode;
        org.jsoup.select.Elements elements49 = document46.getElementsByIndexLessThan((int) 'a');
        java.util.stream.Stream<org.jsoup.nodes.Element> elementStream50 = elements49.stream();
        org.jsoup.select.Elements elements52 = elements49.addClass("hi");
        java.lang.String str53 = elements52.html();
        java.lang.String str54 = elements52.val();
        org.jsoup.select.Elements elements56 = elements52.val("hi");
        org.jsoup.nodes.Document document59 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str60 = document59.outerHtml();
        org.jsoup.nodes.Document document63 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node64 = document63.parentNode;
        java.lang.String str65 = document63.title();
        org.jsoup.nodes.Element element67 = document63.text("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element68 = document59.appendChild((org.jsoup.nodes.Node) document63);
        org.jsoup.nodes.Document document71 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node72 = document71.parentNode;
        java.lang.String str73 = document71.title();
        org.jsoup.nodes.Attributes attributes74 = document71.attributes();
        org.jsoup.nodes.Document document77 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node78 = document77.parentNode;
        org.jsoup.select.Elements elements80 = document77.getElementsByIndexLessThan((int) 'a');
        org.jsoup.nodes.Element element81 = document71.prependChild((org.jsoup.nodes.Node) document77);
        org.jsoup.select.Elements elements83 = document71.select("hi");
        org.jsoup.nodes.Element element84 = document63.appendChild((org.jsoup.nodes.Node) document71);
        org.jsoup.nodes.Element element86 = document71.addClass("#declaration");
        boolean boolean87 = elements52.add(element86);
        org.jsoup.select.Elements elements90 = element86.getElementsByAttributeValue("<html> \n<head> \n</head> \n<body>\n  hi!  \n</body>\n</html>", " hi=&quot;&quot;");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element91 = elements41.set((int) (short) 100, element86);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
        org.junit.Assert.assertNotNull(elements41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(document46);
        org.junit.Assert.assertNull(node47);
        org.junit.Assert.assertNotNull(elements49);
        org.junit.Assert.assertNotNull(elementStream50);
        org.junit.Assert.assertNotNull(elements52);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "<html class=\" hi\">\n<head class=\" hi\">\n</head>\n<body class=\" hi\"> hi!\n</body>\n</html>\n<head class=\" hi\">\n</head>\n<body class=\" hi\"> hi!\n</body>\n\nhi!" + "'", str53, "<html class=\" hi\">\n<head class=\" hi\">\n</head>\n<body class=\" hi\"> hi!\n</body>\n</html>\n<head class=\" hi\">\n</head>\n<body class=\" hi\"> hi!\n</body>\n\nhi!");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertNotNull(elements56);
        org.junit.Assert.assertNotNull(document59);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str60, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document63);
        org.junit.Assert.assertNull(node64);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertNotNull(element67);
        org.junit.Assert.assertNotNull(element68);
        org.junit.Assert.assertNotNull(document71);
        org.junit.Assert.assertNull(node72);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "" + "'", str73, "");
        org.junit.Assert.assertNotNull(attributes74);
        org.junit.Assert.assertNotNull(document77);
        org.junit.Assert.assertNull(node78);
        org.junit.Assert.assertNotNull(elements80);
        org.junit.Assert.assertNotNull(element81);
        org.junit.Assert.assertNotNull(elements83);
        org.junit.Assert.assertNotNull(element84);
        org.junit.Assert.assertNotNull(element86);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
        org.junit.Assert.assertNotNull(elements90);
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1553");
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
        java.lang.String str24 = attributes12.toString();
        boolean boolean26 = attributes12.hasKey("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>\n<head>\n</head>\n<body> hi!\n</body>\n\nhi!");
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator27 = attributes12.spliterator();
        java.lang.String str28 = attributes12.html();
        java.util.List<org.jsoup.nodes.Attribute> attributeList29 = attributes12.asList();
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
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(attributeSpliterator27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(attributeList29);
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1554");
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parseBodyFragment("[ , !]", "hi=\"\"");
        java.lang.String str3 = document2.html();
        java.lang.String str4 = document2.html();
        org.jsoup.nodes.Document document7 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str8 = document7.outerHtml();
        org.jsoup.nodes.Document document11 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node12 = document11.parentNode;
        java.lang.String str13 = document11.title();
        org.jsoup.nodes.Element element15 = document11.text("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element16 = document7.appendChild((org.jsoup.nodes.Node) document11);
        org.jsoup.nodes.Attributes attributes17 = document11.attributes();
        boolean boolean19 = attributes17.hasKey("hi!");
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor20 = attributes17.iterator();
        org.jsoup.nodes.Document document23 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node24 = document23.parentNode;
        java.lang.String str25 = document23.title();
        org.jsoup.nodes.Attributes attributes26 = document23.attributes();
        java.lang.String str27 = attributes26.html();
        attributes17.addAll(attributes26);
        java.lang.String str29 = attributes17.toString();
        boolean boolean31 = attributes17.hasKey("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>\n<head>\n</head>\n<body> hi!\n</body>\n\nhi!");
        org.jsoup.nodes.Document document34 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node35 = document34.parentNode;
        java.lang.String str36 = document34.title();
        org.jsoup.nodes.Attributes attributes37 = document34.attributes();
        org.jsoup.nodes.Document document40 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node41 = document40.parentNode;
        org.jsoup.select.Elements elements43 = document40.getElementsByIndexLessThan((int) 'a');
        org.jsoup.nodes.Element element44 = document34.prependChild((org.jsoup.nodes.Node) document40);
        java.util.List<org.jsoup.nodes.Node> nodeList45 = document34.childNodes;
        org.jsoup.select.Elements elements47 = document34.getElementsByTag("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.nodes.Document document50 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str51 = document50.outerHtml();
        org.jsoup.nodes.Document document54 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node55 = document54.parentNode;
        java.lang.String str56 = document54.title();
        org.jsoup.nodes.Element element58 = document54.text("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element59 = document50.appendChild((org.jsoup.nodes.Node) document54);
        org.jsoup.nodes.Attributes attributes60 = document54.attributes();
        java.lang.String str61 = document54.title();
        int int62 = elements47.lastIndexOf((java.lang.Object) document54);
        org.jsoup.nodes.Element element64 = document54.appendText("<html class=\" hi\">\n<head class=\" hi\">\n</head>\n<body class=\" hi\"> hi!\n</body>\n</html>\n<head class=\" hi\">\n</head>\n<body class=\" hi\"> hi!\n</body>\n\nhi!");
        org.jsoup.select.Elements elements66 = element64.getElementsByClass("\n<!---->");
        boolean boolean67 = attributes17.equals((java.lang.Object) element64);
        org.jsoup.nodes.Element element69 = element64.addClass("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html><#root>\n<html>\n <head>\n </head>\n <body>\n  &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;\n </body>\n</html>\n</#root>");
        boolean boolean70 = document2.equals((java.lang.Object) element69);
        java.lang.String str71 = element69.val();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<html>\n<head>\n</head>\n<body>\n [ , !]\n</body>\n</html>" + "'", str3, "<html>\n<head>\n</head>\n<body>\n [ , !]\n</body>\n</html>");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<html>\n<head>\n</head>\n<body>\n [ , !]\n</body>\n</html>" + "'", str4, "<html>\n<head>\n</head>\n<body>\n [ , !]\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str8, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(attributes17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(attributeItor20);
        org.junit.Assert.assertNotNull(document23);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(attributes26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(document34);
        org.junit.Assert.assertNull(node35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(attributes37);
        org.junit.Assert.assertNotNull(document40);
        org.junit.Assert.assertNull(node41);
        org.junit.Assert.assertNotNull(elements43);
        org.junit.Assert.assertNotNull(element44);
        org.junit.Assert.assertNotNull(nodeList45);
        org.junit.Assert.assertNotNull(elements47);
        org.junit.Assert.assertNotNull(document50);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str51, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document54);
        org.junit.Assert.assertNull(node55);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertNotNull(element58);
        org.junit.Assert.assertNotNull(element59);
        org.junit.Assert.assertNotNull(attributes60);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-1) + "'", int62 == (-1));
        org.junit.Assert.assertNotNull(element64);
        org.junit.Assert.assertNotNull(elements66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(element69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1555");
        org.jsoup.nodes.Evaluator.IndexLessThan indexLessThan1 = new org.jsoup.nodes.Evaluator.IndexLessThan((int) (byte) -1);
        int int2 = indexLessThan1.index;
        org.jsoup.nodes.Document document5 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node6 = document5.parentNode;
        org.jsoup.select.Elements elements7 = document5.getAllElements();
        org.jsoup.nodes.Element element9 = document5.createElement("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.select.Elements elements10 = element9.getAllElements();
        java.lang.String str11 = element9.html();
        boolean boolean12 = element9.preserveWhitespace();
        org.jsoup.nodes.Document document15 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str16 = document15.outerHtml();
        org.jsoup.select.Elements elements17 = document15.getAllElements();
        java.lang.String str18 = document15.data();
        org.jsoup.nodes.Element element20 = document15.text("");
        org.jsoup.nodes.Node node21 = document15.parentNode;
        org.jsoup.select.Elements elements23 = document15.getElementsByIndexGreaterThan((int) '4');
        org.jsoup.nodes.Element element25 = document15.text("hi=\"\"");
        boolean boolean26 = document15.hasText();
        boolean boolean27 = element9.equals((java.lang.Object) boolean26);
        org.jsoup.nodes.Document document30 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str31 = document30.outerHtml();
        org.jsoup.select.Elements elements32 = document30.getAllElements();
        java.lang.String str33 = document30.data();
        org.jsoup.nodes.Element element35 = document30.text("");
        boolean boolean37 = document30.hasClass("hi!");
        boolean boolean38 = element9.equals((java.lang.Object) document30);
        boolean boolean39 = indexLessThan1.matches(element9);
        org.jsoup.select.Elements elements40 = element9.getAllElements();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(document5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(document15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str16, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNotNull(elements23);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(document30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str31, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(elements32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(elements40);
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1556");
        org.jsoup.nodes.Evaluator.AttributeWithValueContaining attributeWithValueContaining2 = new org.jsoup.nodes.Evaluator.AttributeWithValueContaining("<!---->=\"\"", "head");
        java.lang.String str3 = attributeWithValueContaining2.value;
        org.jsoup.nodes.Document document6 = org.jsoup.Jsoup.parseBodyFragment("#comment", "<html> \n<head> \n</head> \n<body>\n  hi!  \n</body>\n</html>");
        org.jsoup.select.Elements elements7 = org.jsoup.select.Collector.collect((org.jsoup.nodes.Evaluator) attributeWithValueContaining2, (org.jsoup.nodes.Element) document6);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "head" + "'", str3, "head");
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNotNull(elements7);
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1557");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element3 = document1.appendText("<html> \n<head> \n</head> \n<body>\n  [ , !]  \n</body>\n</html>\n<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.select.Elements elements6 = document1.getElementsByAttributeValueEnding("<html class=\" hi\">\n<head class=\" hi\">\n</head>\n<body class=\" hi\"> hi!\n</body>\n</html>\n<head class=\" hi\">\n</head>\n<body class=\" hi\"> hi!\n</body>\n\nhi!", "<html>\n<head>\n</head>\n<body>\n</body>\n</html><<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>>\n</<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>>");
        org.jsoup.select.Elements elements9 = document1.getElementsByAttributeValueContaining(" #document", "<html>\n<head>\n</head>\n<body> #text\n</body>\n</html>\n<html> \n<head> \n</head> \n<body>\n  head  \n</body>\n</html>");
        org.jsoup.nodes.Node node10 = document1.parentNode;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = document1.childNode((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1558");
        org.jsoup.nodes.Evaluator.AttributeWithValueStarting attributeWithValueStarting2 = new org.jsoup.nodes.Evaluator.AttributeWithValueStarting("hi", "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        attributeWithValueStarting2.value = "hi!";
        java.lang.String str5 = attributeWithValueStarting2.value;
        org.jsoup.nodes.Document document8 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node9 = document8.parentNode;
        org.jsoup.select.Elements elements11 = document8.getElementsByIndexLessThan((int) 'a');
        java.lang.String str12 = document8.text();
        org.jsoup.nodes.Element element14 = document8.text("");
        org.jsoup.nodes.Document document17 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str18 = document17.outerHtml();
        org.jsoup.select.Elements elements19 = document17.getAllElements();
        boolean boolean20 = element14.equals((java.lang.Object) elements19);
        boolean boolean21 = attributeWithValueStarting2.matches(element14);
        java.lang.String str22 = element14.text();
        org.jsoup.parser.Tag tag23 = element14.tag();
        org.jsoup.nodes.Document document27 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str28 = document27.outerHtml();
        org.jsoup.nodes.Document document31 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node32 = document31.parentNode;
        java.lang.String str33 = document31.title();
        org.jsoup.nodes.Element element35 = document31.text("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element36 = document27.appendChild((org.jsoup.nodes.Node) document31);
        org.jsoup.nodes.Attributes attributes37 = document31.attributes();
        boolean boolean39 = attributes37.hasKey("hi!");
        int int40 = attributes37.size();
        int int41 = attributes37.size();
        java.util.List<org.jsoup.nodes.Attribute> attributeList42 = attributes37.asList();
        java.lang.String str43 = attributes37.html();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator44 = attributes37.spliterator();
        org.jsoup.nodes.Document document47 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str48 = document47.outerHtml();
        org.jsoup.nodes.Document document51 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node52 = document51.parentNode;
        java.lang.String str53 = document51.title();
        org.jsoup.nodes.Element element55 = document51.text("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element56 = document47.appendChild((org.jsoup.nodes.Node) document51);
        org.jsoup.nodes.Attributes attributes57 = document51.attributes();
        boolean boolean59 = attributes57.hasKey("hi!");
        int int60 = attributes57.size();
        int int61 = attributes57.size();
        java.util.List<org.jsoup.nodes.Attribute> attributeList62 = attributes57.asList();
        java.lang.String str63 = attributes57.html();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator64 = attributes57.spliterator();
        attributes37.addAll(attributes57);
        org.jsoup.nodes.Element element66 = new org.jsoup.nodes.Element(tag23, "", attributes37);
        element66.baseUri = "&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt; &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;  &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;";
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(document17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str18, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(tag23);
        org.junit.Assert.assertNotNull(document27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str28, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document31);
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertNotNull(element36);
        org.junit.Assert.assertNotNull(attributes37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(attributeList42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertNotNull(attributeSpliterator44);
        org.junit.Assert.assertNotNull(document47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str48, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document51);
        org.junit.Assert.assertNull(node52);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertNotNull(element55);
        org.junit.Assert.assertNotNull(element56);
        org.junit.Assert.assertNotNull(attributes57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertNotNull(attributeList62);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertNotNull(attributeSpliterator64);
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1559");
        org.jsoup.nodes.Evaluator.AllElements allElements0 = new org.jsoup.nodes.Evaluator.AllElements();
        org.jsoup.nodes.Document document3 = org.jsoup.Jsoup.parseBodyFragment("hi", "hi");
        boolean boolean4 = allElements0.matches((org.jsoup.nodes.Element) document3);
        org.jsoup.select.Elements elements6 = document3.getElementsByClass("<html> <head> </head> <body> hi! </body> </html> <head> </head> <body> hi! </body> hi!");
        java.lang.String str7 = document3.toString();
        java.lang.String str8 = document3.outerHtml();
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<html>\n<head>\n</head>\n<body>\n hi\n</body>\n</html>" + "'", str7, "<html>\n<head>\n</head>\n<body>\n hi\n</body>\n</html>");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<html>\n<head>\n</head>\n<body>\n hi\n</body>\n</html>" + "'", str8, "<html>\n<head>\n</head>\n<body>\n hi\n</body>\n</html>");
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
        java.util.List<org.jsoup.nodes.Node> nodeList13 = document2.childNodes;
        org.jsoup.select.Elements elements15 = document2.getElementsByTag("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.select.Elements elements17 = elements15.removeAttr("hi");
        boolean boolean19 = elements15.is("[ , !]");
        org.jsoup.nodes.DataNode dataNode22 = org.jsoup.nodes.DataNode.createFromEncoded("<html class=\" hi\">\n<head class=\" hi\">\n</head>\n<body class=\" hi\"> hi!\n</body>\n</html>\n<head class=\" hi\">\n</head>\n<body class=\" hi\"> hi!\n</body>\n\nhi!", "");
        java.lang.String str23 = dataNode22.getWholeData();
        boolean boolean24 = elements15.contains((java.lang.Object) str23);
        org.jsoup.nodes.Document document27 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str28 = document27.outerHtml();
        org.jsoup.nodes.Document document31 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node32 = document31.parentNode;
        java.lang.String str33 = document31.title();
        org.jsoup.nodes.Element element35 = document31.text("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element36 = document27.appendChild((org.jsoup.nodes.Node) document31);
        org.jsoup.nodes.Element element37 = document31.nextElementSibling();
        org.jsoup.select.Elements elements38 = document31.siblingElements();
        java.util.stream.Stream<org.jsoup.nodes.Element> elementStream39 = elements38.stream();
        boolean boolean40 = elements38.isEmpty();
        boolean boolean41 = elements38.hasText();
        boolean boolean42 = elements15.removeAll((java.util.Collection<org.jsoup.nodes.Element>) elements38);
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
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(dataNode22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "<html class=\" hi\">\n<head class=\" hi\">\n</head>\n<body class=\" hi\"> hi!\n</body>\n</html>\n<head class=\" hi\">\n</head>\n<body class=\" hi\"> hi!\n</body>\n\nhi!" + "'", str23, "<html class=\" hi\">\n<head class=\" hi\">\n</head>\n<body class=\" hi\"> hi!\n</body>\n</html>\n<head class=\" hi\">\n</head>\n<body class=\" hi\"> hi!\n</body>\n\nhi!");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(document27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str28, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document31);
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertNotNull(element36);
        org.junit.Assert.assertNull(element37);
        org.junit.Assert.assertNotNull(elements38);
        org.junit.Assert.assertNotNull(elementStream39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1561");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str3 = document2.outerHtml();
        org.jsoup.nodes.Document document6 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node7 = document6.parentNode;
        java.lang.String str8 = document6.title();
        org.jsoup.nodes.Element element10 = document6.text("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element11 = document2.appendChild((org.jsoup.nodes.Node) document6);
        org.jsoup.nodes.Element element12 = document6.head();
        java.lang.String str13 = element12.id();
        org.jsoup.select.Elements elements16 = element12.getElementsByAttributeValueNot("\n<!---->", "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.nodes.Document document19 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str20 = document19.outerHtml();
        org.jsoup.select.Elements elements21 = document19.getAllElements();
        java.lang.String str22 = document19.data();
        org.jsoup.nodes.Element element24 = document19.text("");
        element12.addChild((org.jsoup.nodes.Node) document19);
        java.util.Set<java.lang.String> strSet26 = element12.classNames();
        org.jsoup.select.Elements elements29 = element12.getElementsByAttributeValueContaining(" !", "<!---->=\"\"=\"\"");
        org.jsoup.nodes.Node node30 = element12.nextSibling();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str3, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertNotNull(document19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str20, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(elements21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(strSet26);
        org.junit.Assert.assertNotNull(elements29);
        org.junit.Assert.assertNotNull(node30);
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1562");
        org.jsoup.nodes.Evaluator.AttributeWithValueNot attributeWithValueNot2 = new org.jsoup.nodes.Evaluator.AttributeWithValueNot("<html class=\" hi\">\n<head class=\" hi\">\n</head>\n<body class=\" hi\"> hi!\n</body>\n</html>\n<head class=\" hi\">\n</head>\n<body class=\" hi\"> hi!\n</body>\n\nhi!", "<html>\n<head>\n</head>\n<body>\n [ , !]\n</body>\n</html>");
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
        org.jsoup.nodes.Element element32 = document23.wrap("<html class=\" hi\">\n<head class=\" hi\">\n</head>\n<body class=\" hi\"> hi!\n</body>\n</html>\n<head class=\" hi\">\n</head>\n<body class=\" hi\"> hi!\n</body>\n\nhi!");
        org.jsoup.select.Elements elements33 = element32.getAllElements();
        org.jsoup.nodes.Element element35 = element32.prepend("<!---->=\"\"");
        java.util.List<org.jsoup.nodes.Node> nodeList36 = element32.childNodes;
        org.jsoup.nodes.Document document39 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str40 = document39.outerHtml();
        org.jsoup.select.Elements elements41 = document39.getAllElements();
        java.lang.String str42 = document39.data();
        org.jsoup.nodes.Element element44 = document39.text("");
        org.jsoup.select.Elements elements46 = element44.getElementsByIndexLessThan((int) (byte) -1);
        org.jsoup.nodes.Element element47 = element32.prependChild((org.jsoup.nodes.Node) element44);
        java.util.List<org.jsoup.nodes.Node> nodeList48 = element32.childNodes;
        org.jsoup.select.Elements elements49 = org.jsoup.select.Collector.collect((org.jsoup.nodes.Evaluator) attributeWithValueNot2, element32);
        org.jsoup.nodes.Document document52 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str53 = document52.outerHtml();
        org.jsoup.nodes.Document document56 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node57 = document56.parentNode;
        java.lang.String str58 = document56.title();
        org.jsoup.nodes.Element element60 = document56.text("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element61 = document52.appendChild((org.jsoup.nodes.Node) document56);
        org.jsoup.nodes.Element element63 = document52.removeClass("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html><#root>\n<html>\n <head>\n </head>\n <body>\n  &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;\n </body>\n</html>\n</#root>");
        java.lang.String str64 = document52.text();
        org.jsoup.nodes.Element element66 = document52.addClass("#document");
        org.jsoup.nodes.Element element68 = document52.createElement("hi!");
        org.jsoup.select.Elements elements71 = document52.getElementsByAttributeValueContaining("#comment", "#comment");
        java.util.stream.Stream<org.jsoup.nodes.Element> elementStream72 = elements71.parallelStream();
        boolean boolean73 = elements49.retainAll((java.util.Collection<org.jsoup.nodes.Element>) elements71);
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
        org.junit.Assert.assertNotNull(element32);
        org.junit.Assert.assertNotNull(elements33);
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertNotNull(nodeList36);
        org.junit.Assert.assertNotNull(document39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str40, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(elements41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertNotNull(element44);
        org.junit.Assert.assertNotNull(elements46);
        org.junit.Assert.assertNotNull(element47);
        org.junit.Assert.assertNotNull(nodeList48);
        org.junit.Assert.assertNotNull(elements49);
        org.junit.Assert.assertNotNull(document52);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str53, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document56);
        org.junit.Assert.assertNull(node57);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertNotNull(element60);
        org.junit.Assert.assertNotNull(element61);
        org.junit.Assert.assertNotNull(element63);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "hi! <html> <head> </head> <body> hi! </body> </html>" + "'", str64, "hi! <html> <head> </head> <body> hi! </body> </html>");
        org.junit.Assert.assertNotNull(element66);
        org.junit.Assert.assertNotNull(element68);
        org.junit.Assert.assertNotNull(elements71);
        org.junit.Assert.assertNotNull(elementStream72);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1563");
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
        org.jsoup.nodes.Document document52 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str53 = document52.outerHtml();
        org.jsoup.nodes.Document document56 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node57 = document56.parentNode;
        java.lang.String str58 = document56.title();
        org.jsoup.nodes.Element element60 = document56.text("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element61 = document52.appendChild((org.jsoup.nodes.Node) document56);
        org.jsoup.nodes.Element element62 = document56.head();
        java.lang.String str63 = element62.id();
        java.lang.String str64 = element62.nodeName();
        org.jsoup.nodes.Element element65 = element62.lastElementSibling();
        org.jsoup.nodes.Element element66 = element65.previousElementSibling();
        org.jsoup.nodes.Element element69 = element66.attr("\n<!--<html class=\" hi\">\n<head class=\" hi\">\n</head>\n<body class=\" hi\"> hi!\n</body>\n</html>\n<head class=\" hi\">\n</head>\n<body class=\" hi\"> hi!\n</body>\n\nhi!-->", "");
        boolean boolean70 = attributeWithValueNot2.matches(element66);
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
        org.junit.Assert.assertNotNull(document52);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str53, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document56);
        org.junit.Assert.assertNull(node57);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertNotNull(element60);
        org.junit.Assert.assertNotNull(element61);
        org.junit.Assert.assertNotNull(element62);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "head" + "'", str64, "head");
        org.junit.Assert.assertNotNull(element65);
        org.junit.Assert.assertNotNull(element66);
        org.junit.Assert.assertNotNull(element69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1564");
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
        java.lang.String str16 = document11.title();
        org.junit.Assert.assertNotNull(document4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1565");
        org.jsoup.nodes.Evaluator.IndexEquals indexEquals1 = new org.jsoup.nodes.Evaluator.IndexEquals(4);
        org.jsoup.nodes.Document document4 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str5 = document4.outerHtml();
        org.jsoup.select.Elements elements6 = document4.getAllElements();
        java.lang.String str7 = document4.data();
        java.lang.String str8 = document4.baseUri();
        org.jsoup.nodes.Element element10 = document4.text("<#root>\n<html>\n <head>\n </head>\n <body> hi!\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        boolean boolean11 = indexEquals1.matches(element10);
        org.jsoup.nodes.Document document14 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.select.Elements elements15 = document14.getAllElements();
        org.jsoup.select.Elements elements17 = document14.getElementsByIndexLessThan((int) (short) 10);
        document14.title("<html>\n<head>\n</head>\n<body>\n hi\n</body>\n</html>");
        org.jsoup.nodes.Element element20 = document14.head();
        org.jsoup.nodes.Evaluator.AttributeWithValueStarting attributeWithValueStarting23 = new org.jsoup.nodes.Evaluator.AttributeWithValueStarting("hi", "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        attributeWithValueStarting23.value = "hi!";
        java.lang.String str26 = attributeWithValueStarting23.value;
        org.jsoup.nodes.Document document29 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node30 = document29.parentNode;
        org.jsoup.select.Elements elements32 = document29.getElementsByIndexLessThan((int) 'a');
        java.lang.String str33 = document29.text();
        org.jsoup.nodes.Element element35 = document29.text("");
        org.jsoup.nodes.Document document38 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str39 = document38.outerHtml();
        org.jsoup.select.Elements elements40 = document38.getAllElements();
        boolean boolean41 = element35.equals((java.lang.Object) elements40);
        boolean boolean42 = attributeWithValueStarting23.matches(element35);
        org.jsoup.nodes.Element element45 = element35.attr("hi!", "");
        org.jsoup.nodes.Attributes attributes46 = element35.attributes;
        java.lang.String str47 = element35.baseUri;
        document14.addChild((org.jsoup.nodes.Node) element35);
        org.jsoup.nodes.Document document51 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str52 = document51.outerHtml();
        org.jsoup.nodes.Document document55 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node56 = document55.parentNode;
        java.lang.String str57 = document55.title();
        org.jsoup.nodes.Element element59 = document55.text("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element60 = document51.appendChild((org.jsoup.nodes.Node) document55);
        org.jsoup.nodes.Document document63 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node64 = document63.parentNode;
        java.lang.String str65 = document63.title();
        org.jsoup.nodes.Attributes attributes66 = document63.attributes();
        org.jsoup.nodes.Document document69 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node70 = document69.parentNode;
        org.jsoup.select.Elements elements72 = document69.getElementsByIndexLessThan((int) 'a');
        org.jsoup.nodes.Element element73 = document63.prependChild((org.jsoup.nodes.Node) document69);
        org.jsoup.select.Elements elements75 = document63.select("hi");
        org.jsoup.nodes.Element element76 = document55.appendChild((org.jsoup.nodes.Node) document63);
        org.jsoup.nodes.Element element77 = document63.body();
        document14.parentNode = document63;
        org.jsoup.select.Elements elements79 = org.jsoup.select.Collector.collect((org.jsoup.nodes.Evaluator) indexEquals1, (org.jsoup.nodes.Element) document63);
        boolean boolean80 = elements79.isEmpty();
        org.junit.Assert.assertNotNull(document4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str5, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(document14);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertNotNull(document29);
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertNotNull(elements32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertNotNull(document38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str39, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(elements40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(element45);
        org.junit.Assert.assertNotNull(attributes46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "hi!" + "'", str47, "hi!");
        org.junit.Assert.assertNotNull(document51);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str52, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document55);
        org.junit.Assert.assertNull(node56);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertNotNull(element59);
        org.junit.Assert.assertNotNull(element60);
        org.junit.Assert.assertNotNull(document63);
        org.junit.Assert.assertNull(node64);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertNotNull(attributes66);
        org.junit.Assert.assertNotNull(document69);
        org.junit.Assert.assertNull(node70);
        org.junit.Assert.assertNotNull(elements72);
        org.junit.Assert.assertNotNull(element73);
        org.junit.Assert.assertNotNull(elements75);
        org.junit.Assert.assertNotNull(element76);
        org.junit.Assert.assertNotNull(element77);
        org.junit.Assert.assertNotNull(elements79);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1566");
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
        java.lang.String str25 = document23.className();
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
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1567");
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
        org.jsoup.select.Elements elements20 = document11.getAllElements();
        org.jsoup.select.Elements elements23 = document11.getElementsByAttributeValueStarting("!\n<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>", "<html value=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt; hi!\n&lt;/body&gt;\n&lt;/html&gt;\" class=\" #document\">\n<head value=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt; hi!\n&lt;/body&gt;\n&lt;/html&gt;\" class=\" #document\">\n</head>\n<body value=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt; hi!\n&lt;/body&gt;\n&lt;/html&gt;\" class=\" #document\"> hi!\n</body>\n</html>\n\n<html value=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt; hi!\n&lt;/body&gt;\n&lt;/html&gt;\" class=\" #document\">\n<head value=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt; hi!\n&lt;/body&gt;\n&lt;/html&gt;\" class=\" #document\">\n</head>\n<body value=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt; hi!\n&lt;/body&gt;\n&lt;/html&gt;\" class=\" #document\"> hi!\n</body>\n</html>\n\n<head value=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt; hi!\n&lt;/body&gt;\n&lt;/html&gt;\" class=\" #document\">\n</head>\n\n<body value=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt; hi!\n&lt;/body&gt;\n&lt;/html&gt;\" class=\" #document\"> hi!\n</body>=\"h\"");
        org.junit.Assert.assertNotNull(document4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(attributes14);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(elements20);
        org.junit.Assert.assertNotNull(elements23);
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1568");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node3 = document2.parentNode;
        org.jsoup.select.Elements elements5 = document2.getElementsByIndexLessThan((int) 'a');
        java.util.stream.Stream<org.jsoup.nodes.Element> elementStream6 = elements5.stream();
        org.jsoup.select.Elements elements8 = elements5.addClass("hi");
        org.jsoup.nodes.Document document11 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node12 = document11.parentNode;
        org.jsoup.select.Elements elements14 = document11.getElementsByIndexLessThan((int) 'a');
        org.jsoup.select.Elements elements16 = elements14.val("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        java.lang.String str18 = elements14.attr(" hi=\"\"");
        boolean boolean19 = elements8.removeAll((java.util.Collection<org.jsoup.nodes.Element>) elements14);
        elements8.clear();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elementStream6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1569");
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
        org.jsoup.select.Elements elements36 = element6.getAllElements();
        java.lang.String str37 = element6.tagName();
        org.jsoup.nodes.Document document40 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node41 = document40.parentNode;
        org.jsoup.select.Elements elements43 = document40.getElementsByIndexLessThan((int) 'a');
        java.util.stream.Stream<org.jsoup.nodes.Element> elementStream44 = elements43.stream();
        boolean boolean46 = elements43.hasClass("");
        org.jsoup.nodes.Element element48 = elements43.remove(0);
        org.jsoup.select.Elements elements50 = element48.getElementsByIndexLessThan((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            element6.replaceWith((org.jsoup.nodes.Node) element48);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str13, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertNotNull(elements20);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(document27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str28, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(elements29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(element32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(elements36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str37, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document40);
        org.junit.Assert.assertNull(node41);
        org.junit.Assert.assertNotNull(elements43);
        org.junit.Assert.assertNotNull(elementStream44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(element48);
        org.junit.Assert.assertNotNull(elements50);
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1570");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("<html class=\" hi\" head=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt; hi!\n&lt;/body&gt;\n&lt;/html&gt;\" value=\"#text\">\n<head class=\" hi\" head=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt; hi!\n&lt;/body&gt;\n&lt;/html&gt;\" value=\"#text\">\n</head>\n<body class=\" hi\" head=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt; hi!\n&lt;/body&gt;\n&lt;/html&gt;\" value=\"#text\"> hi!\n</body>\n</html>\n\n<html class=\" hi\" head=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt; hi!\n&lt;/body&gt;\n&lt;/html&gt;\" value=\"#text\">\n<head class=\" hi\" head=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt; hi!\n&lt;/body&gt;\n&lt;/html&gt;\" value=\"#text\">\n</head>\n<body class=\" hi\" head=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt; hi!\n&lt;/body&gt;\n&lt;/html&gt;\" value=\"#text\"> hi!\n</body>\n</html>\n\n<head class=\" hi\" head=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt; hi!\n&lt;/body&gt;\n&lt;/html&gt;\" value=\"#text\">\n</head>\n\n<body class=\" hi\" head=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt; hi!\n&lt;/body&gt;\n&lt;/html&gt;\" value=\"#text\"> hi!\n</body>", "<html>\n<head>\n</head>\n<body>\n &lt;#root&gt; \n <html> \n  <head> \n  </head> \n  <body>\n    hi!    \n   <html> \n    <head> \n    </head> \n    <body>\n      hi!  \n    </body>\n   </html>\n  </body>\n </html>\n</body>\n</html><&lt;!----&gt;>\n</&lt;!----&gt;>");
        org.jsoup.nodes.Evaluator.Tag tag4 = new org.jsoup.nodes.Evaluator.Tag("#document");
        org.jsoup.nodes.Document document7 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str8 = document7.outerHtml();
        org.jsoup.nodes.Document document11 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node12 = document11.parentNode;
        java.lang.String str13 = document11.title();
        org.jsoup.nodes.Element element15 = document11.text("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element16 = document7.appendChild((org.jsoup.nodes.Node) document11);
        org.jsoup.nodes.Element element17 = document11.head();
        java.lang.String str18 = element17.id();
        boolean boolean19 = tag4.matches(element17);
        org.jsoup.nodes.Evaluator.Tag tag21 = new org.jsoup.nodes.Evaluator.Tag("#document");
        org.jsoup.nodes.Evaluator.IndexLessThan indexLessThan23 = new org.jsoup.nodes.Evaluator.IndexLessThan((int) (byte) -1);
        org.jsoup.nodes.Document document26 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node27 = document26.parentNode;
        org.jsoup.select.Elements elements29 = document26.getElementsByIndexLessThan((int) 'a');
        boolean boolean30 = indexLessThan23.matches((org.jsoup.nodes.Element) document26);
        org.jsoup.nodes.Document document33 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node34 = document33.parentNode;
        org.jsoup.select.Elements elements35 = document33.getAllElements();
        org.jsoup.select.Elements elements36 = org.jsoup.select.Collector.collect((org.jsoup.nodes.Evaluator) indexLessThan23, (org.jsoup.nodes.Element) document33);
        boolean boolean37 = tag21.matches((org.jsoup.nodes.Element) document33);
        document33.baseUri = "hi=\"\"";
        org.jsoup.nodes.Element element41 = document33.appendText("");
        org.jsoup.nodes.Element element43 = element41.prependText(" !");
        org.jsoup.nodes.Element element45 = element43.addClass("\n<!---->");
        element43.baseUri = "<html> \n<head> \n</head> \n<body>\n  [ , !]  \n</body>\n</html>\n<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>";
        org.jsoup.select.Elements elements48 = org.jsoup.select.Collector.collect((org.jsoup.nodes.Evaluator) tag4, element43);
        boolean boolean49 = attribute2.equals((java.lang.Object) element43);
        org.jsoup.parser.Tag tag51 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean52 = tag51.preserveWhitespace();
        java.lang.String str53 = tag51.toString();
        org.jsoup.nodes.Document document57 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node58 = document57.parentNode;
        java.lang.String str59 = document57.title();
        org.jsoup.nodes.Attributes attributes60 = document57.attributes();
        java.lang.String str61 = attributes60.html();
        org.jsoup.nodes.Element element62 = new org.jsoup.nodes.Element(tag51, "!", attributes60);
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor63 = attributes60.iterator();
        java.lang.String str65 = attributes60.get("<html> \n<head> \n</head> \n<body>\n  [ , !]  \n</body>\n</html>\n<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        java.lang.String str66 = attributes60.toString();
        boolean boolean67 = attribute2.equals((java.lang.Object) attributes60);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str8, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(document26);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertNotNull(elements29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(document33);
        org.junit.Assert.assertNull(node34);
        org.junit.Assert.assertNotNull(elements35);
        org.junit.Assert.assertNotNull(elements36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(element41);
        org.junit.Assert.assertNotNull(element43);
        org.junit.Assert.assertNotNull(element45);
        org.junit.Assert.assertNotNull(elements48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(tag51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "hi!" + "'", str53, "hi!");
        org.junit.Assert.assertNotNull(document57);
        org.junit.Assert.assertNull(node58);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertNotNull(attributes60);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertNotNull(attributeItor63);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1571");
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
        org.jsoup.nodes.Element element45 = element42.val("i");
        org.jsoup.select.Elements elements48 = element45.getElementsByAttributeValueNot("<html>\n<head>\n</head>\n<body>\n [ , !]\n</body>\n</html>", "<html value=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt; hi!\n&lt;/body&gt;\n&lt;/html&gt;\" class=\" #document\">\n<head value=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt; hi!\n&lt;/body&gt;\n&lt;/html&gt;\" class=\" #document\">\n</head>\n<body value=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt; hi!\n&lt;/body&gt;\n&lt;/html&gt;\" class=\" #document\"> hi!\n</body>\n</html>\n\n<html value=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt; hi!\n&lt;/body&gt;\n&lt;/html&gt;\" class=\" #document\">\n<head value=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt; hi!\n&lt;/body&gt;\n&lt;/html&gt;\" class=\" #document\">\n</head>\n<body value=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt; hi!\n&lt;/body&gt;\n&lt;/html&gt;\" class=\" #document\"> hi!\n</body>\n</html>\n\n<head value=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt; hi!\n&lt;/body&gt;\n&lt;/html&gt;\" class=\" #document\">\n</head>\n\n<body value=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt; hi!\n&lt;/body&gt;\n&lt;/html&gt;\" class=\" #document\"> hi!\n</body>");
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
        org.junit.Assert.assertNotNull(element45);
        org.junit.Assert.assertNotNull(elements48);
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1572");
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
        org.jsoup.select.Elements elements18 = new org.jsoup.select.Elements((java.util.Collection<org.jsoup.nodes.Element>) elements17);
        org.jsoup.select.Elements elements20 = elements18.select("hi");
        org.jsoup.select.Elements elements22 = elements18.toggleClass("<html>\n<head>\n</head>\n<body>\n hi\n</body>\n</html>=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n hi\n&lt;/body&gt;\n&lt;/html&gt;\"");
        org.jsoup.select.Elements elements24 = elements22.toggleClass("<html class=\" hi\">\n<head class=\" hi\">\n</head>\n<body class=\" hi\"> hi!\n</body>\n</html>\n<head class=\" hi\">\n</head>\n<body class=\" hi\"> hi!\n</body>\n\nhi!=\"#comment\"");
        org.jsoup.select.Elements elements26 = elements22.addClass("<!---->=\"\"");
        org.jsoup.nodes.Element element27 = elements26.first();
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
        org.junit.Assert.assertNotNull(elements20);
        org.junit.Assert.assertNotNull(elements22);
        org.junit.Assert.assertNotNull(elements24);
        org.junit.Assert.assertNotNull(elements26);
        org.junit.Assert.assertNull(element27);
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1573");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>\n<head>\n</head>\n<body> hi!\n</body>\n\nhi!=\"#declaration\"");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element3 = document1.child(33);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 33, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1574");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("<html> <head> </head> <body> hi! </body> </html> hi! hi!");
        org.junit.Assert.assertNotNull(document1);
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1575");
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
        java.util.List<org.jsoup.nodes.Node> nodeList45 = element41.childNodes;
        java.util.List<org.jsoup.nodes.Node> nodeList46 = element41.siblingNodes();
        org.jsoup.nodes.Element element48 = element41.prepend("org.jsoup.select.Selector$SelectorParseException: !");
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
        org.junit.Assert.assertNotNull(nodeList45);
        org.junit.Assert.assertNotNull(nodeList46);
        org.junit.Assert.assertNotNull(element48);
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1576");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("#text", "");
        org.jsoup.nodes.Element element4 = document2.append("<html>\n<head>\n</head>\n<body>\n head\n</body>\n</html>");
        java.lang.String str5 = element4.toString();
        int int6 = element4.nodeDepth();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n<head>\n</head>\n<body> #text\n</body>\n</html>\n<html> \n<head> \n</head> \n<body>\n  head  \n</body>\n</html>" + "'", str5, "<html>\n<head>\n</head>\n<body> #text\n</body>\n</html>\n<html> \n<head> \n</head> \n<body>\n  head  \n</body>\n</html>");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1577");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str3 = document2.outerHtml();
        org.jsoup.nodes.Document document6 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node7 = document6.parentNode;
        java.lang.String str8 = document6.title();
        org.jsoup.nodes.Element element10 = document6.text("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element11 = document2.appendChild((org.jsoup.nodes.Node) document6);
        org.jsoup.nodes.Attributes attributes12 = document6.attributes();
        org.jsoup.nodes.Element element14 = document6.removeClass("<html> \n<head> \n</head> \n<body>\n  [ , !]  \n</body>\n</html>");
        org.jsoup.select.Elements elements15 = document6.getAllElements();
        org.jsoup.nodes.Node node17 = document6.removeAttr("org.jsoup.select.Selector$SelectorParseException: [ , #, d, o, c, u, m, e, n, t]");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str3, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(attributes12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(node17);
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1578");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str3 = document2.outerHtml();
        org.jsoup.nodes.Document document6 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node7 = document6.parentNode;
        java.lang.String str8 = document6.title();
        org.jsoup.nodes.Element element10 = document6.text("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element11 = document2.appendChild((org.jsoup.nodes.Node) document6);
        org.jsoup.nodes.Node node12 = document6.parentNode;
        java.lang.String str13 = document6.data();
        org.jsoup.nodes.Element element15 = document6.createElement("<html>\n<head>\n</head>\n<body>\n hi\n</body>\n</html>");
        org.jsoup.nodes.Element element17 = element15.prependElement("&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt; hi!\n&lt;/body&gt;\n&lt;/html&gt;");
        org.jsoup.nodes.Document document20 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node21 = document20.parentNode;
        org.jsoup.select.Elements elements23 = document20.getElementsByIndexLessThan((int) 'a');
        java.lang.String str24 = document20.text();
        org.jsoup.nodes.Element element26 = document20.text("");
        org.jsoup.nodes.Document document29 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str30 = document29.outerHtml();
        org.jsoup.select.Elements elements31 = document29.getAllElements();
        boolean boolean32 = element26.equals((java.lang.Object) elements31);
        java.lang.String str33 = elements31.html();
        org.jsoup.select.Selector.SelectorParseException selectorParseException35 = new org.jsoup.select.Selector.SelectorParseException("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html><#root>\n<html>\n <head>\n </head>\n <body>\n  &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;\n </body>\n</html>\n</#root>");
        org.jsoup.select.Selector.SelectorParseException selectorParseException37 = new org.jsoup.select.Selector.SelectorParseException("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html><#root>\n<html>\n <head>\n </head>\n <body>\n  &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;\n </body>\n</html>\n</#root>");
        selectorParseException35.addSuppressed((java.lang.Throwable) selectorParseException37);
        java.lang.Throwable[] throwableArray39 = selectorParseException35.getSuppressed();
        boolean boolean40 = elements31.remove((java.lang.Object) throwableArray39);
        org.jsoup.select.Elements elements42 = elements31.html("hi! hi!  hi!");
        org.jsoup.nodes.TextNode textNode45 = org.jsoup.nodes.TextNode.createFromEncoded("\n<!---->", "\n<!---->");
        org.jsoup.nodes.TextNode textNode47 = textNode45.text("");
        java.lang.String str48 = textNode45.nodeName();
        java.lang.String str49 = textNode45.text();
        boolean boolean50 = elements42.contains((java.lang.Object) str49);
        org.jsoup.nodes.Element element52 = elements42.get((int) (short) 0);
        org.jsoup.select.Elements elements54 = elements42.html("<html>\n    <head>\n    </head>\n    <body>\n     &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;\n    </body>\n   </html>");
        java.lang.Integer int55 = org.jsoup.nodes.Node.indexInList(element17, (java.util.List<org.jsoup.nodes.Element>) elements54);
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str3, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(document20);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNotNull(elements23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertNotNull(document29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str30, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(elements31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>\n<head>\n</head>\n<body> hi!\n</body>\n\nhi!" + "'", str33, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>\n<head>\n</head>\n<body> hi!\n</body>\n\nhi!");
        org.junit.Assert.assertNotNull(throwableArray39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(elements42);
        org.junit.Assert.assertNotNull(textNode45);
        org.junit.Assert.assertNotNull(textNode47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "#text" + "'", str48, "#text");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(element52);
        org.junit.Assert.assertNotNull(elements54);
        org.junit.Assert.assertNull(int55);
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1579");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("#document", "<html> <head> </head> <body> hi! </body> </html> hi! hi!");
        org.junit.Assert.assertNotNull(document2);
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1580");
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
        attributes12.remove(" hi=\"\"");
        org.jsoup.nodes.Document document28 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str29 = document28.outerHtml();
        org.jsoup.nodes.Document document32 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node33 = document32.parentNode;
        java.lang.String str34 = document32.title();
        org.jsoup.nodes.Element element36 = document32.text("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element37 = document28.appendChild((org.jsoup.nodes.Node) document32);
        org.jsoup.nodes.Attributes attributes38 = document32.attributes();
        boolean boolean40 = attributes38.hasKey("hi!");
        int int41 = attributes38.size();
        int int42 = attributes38.size();
        attributes12.addAll(attributes38);
        java.lang.String str45 = attributes38.get("hi!");
        attributes38.put("<html>\n    <head>\n    </head>\n    <body>\n     &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;\n    </body>\n   </html>", "\n&lt;!----&gt;");
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
        org.junit.Assert.assertNotNull(document28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str29, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document32);
        org.junit.Assert.assertNull(node33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(element36);
        org.junit.Assert.assertNotNull(element37);
        org.junit.Assert.assertNotNull(attributes38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1581");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str3 = document2.outerHtml();
        org.jsoup.select.Elements elements4 = document2.getAllElements();
        java.lang.String str5 = document2.data();
        org.jsoup.nodes.Element element7 = document2.text("");
        org.jsoup.nodes.Node node8 = document2.parentNode;
        org.jsoup.select.Elements elements10 = document2.getElementsByIndexGreaterThan((int) '4');
        java.lang.String str11 = document2.baseUri();
        java.lang.String str12 = document2.nodeName();
        java.lang.String str13 = document2.nodeName();
        org.jsoup.nodes.Element element15 = document2.append("<body>\n <!----> hi!\n</body>");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str3, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "#document" + "'", str12, "#document");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "#document" + "'", str13, "#document");
        org.junit.Assert.assertNotNull(element15);
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1582");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node3 = document2.parentNode;
        org.jsoup.select.Elements elements5 = document2.getElementsByIndexLessThan((int) 'a');
        java.util.stream.Stream<org.jsoup.nodes.Element> elementStream6 = elements5.stream();
        org.jsoup.select.Elements elements8 = elements5.addClass("hi");
        org.jsoup.select.Elements elements9 = new org.jsoup.select.Elements((java.util.Collection<org.jsoup.nodes.Element>) elements8);
        org.jsoup.select.Elements elements12 = elements8.attr("head", "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.select.Elements elements14 = elements12.val("#text");
        elements12.clear();
        org.jsoup.select.Elements elements18 = elements12.attr("<!---->=\"\"=\"\"", "<html value=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt; hi!\n&lt;/body&gt;\n&lt;/html&gt;\" class=\" #document\">\n<head value=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt; hi!\n&lt;/body&gt;\n&lt;/html&gt;\" class=\" #document\">\n</head>\n<body value=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt; hi!\n&lt;/body&gt;\n&lt;/html&gt;\" class=\" #document\"> hi!\n</body>\n</html>\n\n<html value=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt; hi!\n&lt;/body&gt;\n&lt;/html&gt;\" class=\" #document\">\n<head value=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt; hi!\n&lt;/body&gt;\n&lt;/html&gt;\" class=\" #document\">\n</head>\n<body value=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt; hi!\n&lt;/body&gt;\n&lt;/html&gt;\" class=\" #document\"> hi!\n</body>\n</html>\n\n<head value=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt; hi!\n&lt;/body&gt;\n&lt;/html&gt;\" class=\" #document\">\n</head>\n\n<body value=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt; hi!\n&lt;/body&gt;\n&lt;/html&gt;\" class=\" #document\"> hi!\n</body>");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elementStream6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(elements18);
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1583");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str3 = document2.outerHtml();
        org.jsoup.select.Elements elements4 = document2.getAllElements();
        java.lang.String str5 = document2.data();
        org.jsoup.nodes.Element element7 = document2.text("");
        org.jsoup.nodes.Element element9 = element7.val("<html>\n<head>\n</head>\n<body>\n hi\n</body>\n</html>=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n hi\n&lt;/body&gt;\n&lt;/html&gt;\"");
        org.jsoup.select.Elements elements11 = element9.getElementsByIndexLessThan((int) '!');
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str3, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(elements11);
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1584");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str3 = document2.outerHtml();
        org.jsoup.nodes.Document document6 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node7 = document6.parentNode;
        java.lang.String str8 = document6.title();
        org.jsoup.nodes.Element element10 = document6.text("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element11 = document2.appendChild((org.jsoup.nodes.Node) document6);
        org.jsoup.parser.Tag tag12 = element11.tag();
        org.jsoup.nodes.Element element14 = element11.append("<html> <head> </head> <body> hi! </body> </html> hi! hi!");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str3, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertNotNull(element14);
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1585");
        org.jsoup.nodes.Evaluator.AttributeWithValueNot attributeWithValueNot2 = new org.jsoup.nodes.Evaluator.AttributeWithValueNot("<html class=\" hi\">\n<head class=\" hi\">\n</head>\n<body class=\" hi\"> hi!\n</body>\n</html>\n<head class=\" hi\">\n</head>\n<body class=\" hi\"> hi!\n</body>\n\nhi!", "<html>\n<head>\n</head>\n<body>\n [ , !]\n</body>\n</html>");
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
        org.jsoup.nodes.Element element32 = document23.wrap("<html class=\" hi\">\n<head class=\" hi\">\n</head>\n<body class=\" hi\"> hi!\n</body>\n</html>\n<head class=\" hi\">\n</head>\n<body class=\" hi\"> hi!\n</body>\n\nhi!");
        org.jsoup.select.Elements elements33 = element32.getAllElements();
        org.jsoup.nodes.Element element35 = element32.prepend("<!---->=\"\"");
        java.util.List<org.jsoup.nodes.Node> nodeList36 = element32.childNodes;
        org.jsoup.nodes.Document document39 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str40 = document39.outerHtml();
        org.jsoup.select.Elements elements41 = document39.getAllElements();
        java.lang.String str42 = document39.data();
        org.jsoup.nodes.Element element44 = document39.text("");
        org.jsoup.select.Elements elements46 = element44.getElementsByIndexLessThan((int) (byte) -1);
        org.jsoup.nodes.Element element47 = element32.prependChild((org.jsoup.nodes.Node) element44);
        java.util.List<org.jsoup.nodes.Node> nodeList48 = element32.childNodes;
        org.jsoup.select.Elements elements49 = org.jsoup.select.Collector.collect((org.jsoup.nodes.Evaluator) attributeWithValueNot2, element32);
        org.jsoup.select.Elements elements51 = elements49.addClass("");
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
        org.junit.Assert.assertNotNull(element32);
        org.junit.Assert.assertNotNull(elements33);
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertNotNull(nodeList36);
        org.junit.Assert.assertNotNull(document39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str40, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(elements41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertNotNull(element44);
        org.junit.Assert.assertNotNull(elements46);
        org.junit.Assert.assertNotNull(element47);
        org.junit.Assert.assertNotNull(nodeList48);
        org.junit.Assert.assertNotNull(elements49);
        org.junit.Assert.assertNotNull(elements51);
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1586");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("hi!", "!", false);
        org.jsoup.nodes.Document document6 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node7 = document6.parentNode;
        boolean boolean8 = document6.isBlock();
        xmlDeclaration3.addChild((org.jsoup.nodes.Node) document6);
        boolean boolean11 = xmlDeclaration3.hasAttr(" head=\"[ , #, d, o, c, u, m, e, n, t]\"");
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1587");
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parse("hi=\"\" hi!hi=\"\"hi=\"\"hi=\"\" hi=\"\" hi!hi=\"\"hi=\"\" hi=\"\" hi!hi=\"\"", "#document");
        org.junit.Assert.assertNotNull(document2);
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1588");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("<html class=\" hi\" head=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt; hi!\n&lt;/body&gt;\n&lt;/html&gt;\" value=\"#text\">\n<head class=\" hi\" head=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt; hi!\n&lt;/body&gt;\n&lt;/html&gt;\" value=\"#text\">\n</head>\n<body class=\" hi\" head=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt; hi!\n&lt;/body&gt;\n&lt;/html&gt;\" value=\"#text\"> hi!\n</body>\n</html>\n\n<html class=\" hi\" head=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt; hi!\n&lt;/body&gt;\n&lt;/html&gt;\" value=\"#text\">\n<head class=\" hi\" head=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt; hi!\n&lt;/body&gt;\n&lt;/html&gt;\" value=\"#text\">\n</head>\n<body class=\" hi\" head=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt; hi!\n&lt;/body&gt;\n&lt;/html&gt;\" value=\"#text\"> hi!\n</body>\n</html>\n\n<head class=\" hi\" head=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt; hi!\n&lt;/body&gt;\n&lt;/html&gt;\" value=\"#text\">\n</head>\n\n<body class=\" hi\" head=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt; hi!\n&lt;/body&gt;\n&lt;/html&gt;\" value=\"#text\"> hi!\n</body>", "<?head>");
        org.junit.Assert.assertNotNull(document2);
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1589");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.select.Elements elements3 = document2.getAllElements();
        org.jsoup.select.Elements elements5 = document2.getElementsByIndexLessThan((int) (short) 10);
        java.util.Spliterator<org.jsoup.nodes.Element> elementSpliterator6 = elements5.spliterator();
        java.lang.String str8 = elements5.attr("<html>\n<head>\n</head>\n<body>\n [ , !]\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elementSpliterator6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1590");
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
        boolean boolean25 = attributes12.hasKey("org.jsoup.select.Selector$SelectorParseException: <html>\n <head>\n </head>\n <body>\n </body>\n</html>");
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
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1591");
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parseBodyFragment("hi=\"\"hi!", "<html class=\" hi\" head=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt; hi!\n&lt;/body&gt;\n&lt;/html&gt;\" value=\"#text\">\n<head class=\" hi\" head=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt; hi!\n&lt;/body&gt;\n&lt;/html&gt;\" value=\"#text\">\n</head>\n<body class=\" hi\" head=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt; hi!\n&lt;/body&gt;\n&lt;/html&gt;\" value=\"#text\"> hi!\n</body>\n</html>\n\n<html class=\" hi\" head=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt; hi!\n&lt;/body&gt;\n&lt;/html&gt;\" value=\"#text\">\n<head class=\" hi\" head=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt; hi!\n&lt;/body&gt;\n&lt;/html&gt;\" value=\"#text\">\n</head>\n<body class=\" hi\" head=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt; hi!\n&lt;/body&gt;\n&lt;/html&gt;\" value=\"#text\"> hi!\n</body>\n</html>\n\n<head class=\" hi\" head=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt; hi!\n&lt;/body&gt;\n&lt;/html&gt;\" value=\"#text\">\n</head>\n\n<body class=\" hi\" head=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt; hi!\n&lt;/body&gt;\n&lt;/html&gt;\" value=\"#text\"> hi!\n</body>");
        org.junit.Assert.assertNotNull(document2);
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1592");
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
        java.lang.String str21 = elements19.attr("");
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
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1593");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node3 = document2.parentNode;
        org.jsoup.select.Elements elements5 = document2.getElementsByIndexLessThan((int) 'a');
        org.jsoup.select.Elements elements7 = elements5.val("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        java.util.stream.Stream<org.jsoup.nodes.Element> elementStream8 = elements5.stream();
        org.jsoup.select.Elements elements10 = elements5.toggleClass("#document");
        org.jsoup.select.Elements elements12 = elements5.addClass("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        java.util.stream.Stream<org.jsoup.nodes.Element> elementStream13 = elements12.parallelStream();
        java.lang.Object[] objArray14 = elements12.toArray();
        org.jsoup.nodes.Document document16 = org.jsoup.nodes.Document.createShell("");
        document16.baseUri = "";
        org.jsoup.select.Elements elements20 = document16.getElementsByIndexEquals((int) (byte) -1);
        java.lang.Object[] objArray21 = elements20.toArray();
        org.jsoup.select.Elements elements22 = new org.jsoup.select.Elements((java.util.List<org.jsoup.nodes.Element>) elements20);
        boolean boolean23 = elements12.contains((java.lang.Object) elements20);
        org.jsoup.select.Elements elements25 = elements20.prepend("<html>\n <head>\n </head>\n <body> hi!\n </body>\n</html>");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(elementStream8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(elementStream13);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[<html value=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt; hi!\n&lt;/body&gt;\n&lt;/html&gt;\" class=\" #document &lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt; hi!\n&lt;/body&gt;\n&lt;/html&gt;\">\n<head value=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt; hi!\n&lt;/body&gt;\n&lt;/html&gt;\" class=\" #document &lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt; hi!\n&lt;/body&gt;\n&lt;/html&gt;\">\n</head>\n<body value=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt; hi!\n&lt;/body&gt;\n&lt;/html&gt;\" class=\" #document &lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt; hi!\n&lt;/body&gt;\n&lt;/html&gt;\"> hi!\n</body>\n</html>, \n<html value=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt; hi!\n&lt;/body&gt;\n&lt;/html&gt;\" class=\" #document &lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt; hi!\n&lt;/body&gt;\n&lt;/html&gt;\">\n<head value=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt; hi!\n&lt;/body&gt;\n&lt;/html&gt;\" class=\" #document &lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt; hi!\n&lt;/body&gt;\n&lt;/html&gt;\">\n</head>\n<body value=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt; hi!\n&lt;/body&gt;\n&lt;/html&gt;\" class=\" #document &lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt; hi!\n&lt;/body&gt;\n&lt;/html&gt;\"> hi!\n</body>\n</html>, \n<head value=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt; hi!\n&lt;/body&gt;\n&lt;/html&gt;\" class=\" #document &lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt; hi!\n&lt;/body&gt;\n&lt;/html&gt;\">\n</head>, \n<body value=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt; hi!\n&lt;/body&gt;\n&lt;/html&gt;\" class=\" #document &lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt; hi!\n&lt;/body&gt;\n&lt;/html&gt;\"> hi!\n</body>]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[<html value=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt; hi!\n&lt;/body&gt;\n&lt;/html&gt;\" class=\" #document &lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt; hi!\n&lt;/body&gt;\n&lt;/html&gt;\">\n<head value=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt; hi!\n&lt;/body&gt;\n&lt;/html&gt;\" class=\" #document &lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt; hi!\n&lt;/body&gt;\n&lt;/html&gt;\">\n</head>\n<body value=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt; hi!\n&lt;/body&gt;\n&lt;/html&gt;\" class=\" #document &lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt; hi!\n&lt;/body&gt;\n&lt;/html&gt;\"> hi!\n</body>\n</html>, \n<html value=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt; hi!\n&lt;/body&gt;\n&lt;/html&gt;\" class=\" #document &lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt; hi!\n&lt;/body&gt;\n&lt;/html&gt;\">\n<head value=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt; hi!\n&lt;/body&gt;\n&lt;/html&gt;\" class=\" #document &lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt; hi!\n&lt;/body&gt;\n&lt;/html&gt;\">\n</head>\n<body value=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt; hi!\n&lt;/body&gt;\n&lt;/html&gt;\" class=\" #document &lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt; hi!\n&lt;/body&gt;\n&lt;/html&gt;\"> hi!\n</body>\n</html>, \n<head value=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt; hi!\n&lt;/body&gt;\n&lt;/html&gt;\" class=\" #document &lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt; hi!\n&lt;/body&gt;\n&lt;/html&gt;\">\n</head>, \n<body value=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt; hi!\n&lt;/body&gt;\n&lt;/html&gt;\" class=\" #document &lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt; hi!\n&lt;/body&gt;\n&lt;/html&gt;\"> hi!\n</body>]");
        org.junit.Assert.assertNotNull(document16);
        org.junit.Assert.assertNotNull(elements20);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(elements25);
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1594");
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parseBodyFragment("hi", "hi");
        java.lang.String str3 = document2.baseUri();
        java.lang.String str4 = document2.html();
        org.jsoup.nodes.Document document5 = document2.normalise();
        org.jsoup.nodes.Element element7 = document2.prependText("<html>\n<head>\n</head>\n<body>\n hi\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi" + "'", str3, "hi");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<html>\n<head>\n</head>\n<body>\n hi\n</body>\n</html>" + "'", str4, "<html>\n<head>\n</head>\n<body>\n hi\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document5);
        org.junit.Assert.assertNotNull(element7);
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1595");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueContaining("head", "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        boolean boolean5 = elements4.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element7 = elements4.remove((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 52, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1596");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("");
        document1.baseUri = "";
        org.jsoup.select.Elements elements5 = document1.getElementsByIndexEquals((int) (byte) -1);
        org.jsoup.nodes.Element element7 = document1.append("#document");
        org.jsoup.select.Elements elements8 = document1.getAllElements();
        org.jsoup.nodes.Document document11 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str12 = document11.outerHtml();
        org.jsoup.nodes.Document document15 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node16 = document15.parentNode;
        java.lang.String str17 = document15.title();
        org.jsoup.nodes.Element element19 = document15.text("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element20 = document11.appendChild((org.jsoup.nodes.Node) document15);
        org.jsoup.nodes.Element element21 = document15.head();
        java.lang.String str22 = element21.id();
        org.jsoup.select.Elements elements25 = element21.getElementsByAttributeValueNot("\n<!---->", "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        boolean boolean26 = elements8.removeAll((java.util.Collection<org.jsoup.nodes.Element>) elements25);
        org.jsoup.parser.Tag tag28 = org.jsoup.parser.Tag.valueOf("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        java.lang.String str29 = tag28.toString();
        org.jsoup.nodes.Element element31 = new org.jsoup.nodes.Element(tag28, "hi=\"\"");
        org.jsoup.nodes.Document document34 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str35 = document34.outerHtml();
        org.jsoup.nodes.Document document38 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node39 = document38.parentNode;
        java.lang.String str40 = document38.title();
        org.jsoup.nodes.Element element42 = document38.text("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element43 = document34.appendChild((org.jsoup.nodes.Node) document38);
        org.jsoup.nodes.Document document46 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node47 = document46.parentNode;
        java.lang.String str48 = document46.title();
        org.jsoup.nodes.Attributes attributes49 = document46.attributes();
        org.jsoup.nodes.Document document52 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node53 = document52.parentNode;
        org.jsoup.select.Elements elements55 = document52.getElementsByIndexLessThan((int) 'a');
        org.jsoup.nodes.Element element56 = document46.prependChild((org.jsoup.nodes.Node) document52);
        org.jsoup.select.Elements elements58 = document46.select("hi");
        org.jsoup.nodes.Element element59 = document38.appendChild((org.jsoup.nodes.Node) document46);
        org.jsoup.nodes.Element element61 = document46.addClass("#declaration");
        org.jsoup.nodes.Node node62 = document46.previousSibling();
        element31.addChild((org.jsoup.nodes.Node) document46);
        org.jsoup.nodes.Document document64 = document46.normalise();
        int int65 = elements8.indexOf((java.lang.Object) document64);
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str12, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document15);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(elements25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(tag28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str29, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str35, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document38);
        org.junit.Assert.assertNull(node39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNotNull(element42);
        org.junit.Assert.assertNotNull(element43);
        org.junit.Assert.assertNotNull(document46);
        org.junit.Assert.assertNull(node47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertNotNull(attributes49);
        org.junit.Assert.assertNotNull(document52);
        org.junit.Assert.assertNull(node53);
        org.junit.Assert.assertNotNull(elements55);
        org.junit.Assert.assertNotNull(element56);
        org.junit.Assert.assertNotNull(elements58);
        org.junit.Assert.assertNotNull(element59);
        org.junit.Assert.assertNotNull(element61);
        org.junit.Assert.assertNotNull(node62);
        org.junit.Assert.assertNotNull(document64);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + (-1) + "'", int65 == (-1));
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1597");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node3 = document2.parentNode;
        org.jsoup.select.Elements elements4 = document2.getAllElements();
        java.util.Iterator<org.jsoup.nodes.Element> elementItor5 = elements4.iterator();
        boolean boolean7 = elements4.hasClass("head");
        java.util.Iterator<org.jsoup.nodes.Element> elementItor8 = elements4.iterator();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(elementItor5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(elementItor8);
    }

    @Test
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1598");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueStarting("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>", "head");
        java.lang.String str5 = document1.outerHtml();
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1599");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("<html>\n<head>\n</head>\n<body> #text\n</body>\n</html>\n<html> \n<head> \n</head> \n<body>\n  head  \n</body>\n</html>");
        org.junit.Assert.assertNotNull(document1);
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1600");
        org.jsoup.nodes.Evaluator.AttributeWithValueStarting attributeWithValueStarting2 = new org.jsoup.nodes.Evaluator.AttributeWithValueStarting("hi", " hi=\"\"");
        org.jsoup.nodes.Document document5 = org.jsoup.Jsoup.parseBodyFragment("[ , !]", "hi=\"\"");
        java.lang.String str6 = document5.html();
        java.lang.String str7 = document5.html();
        boolean boolean8 = attributeWithValueStarting2.matches((org.jsoup.nodes.Element) document5);
        java.lang.String str10 = document5.attr("<html>\n <head>\n </head>\n <body>\n </body>\n</html>");
        org.jsoup.select.Elements elements11 = document5.children();
        org.junit.Assert.assertNotNull(document5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<html>\n<head>\n</head>\n<body>\n [ , !]\n</body>\n</html>" + "'", str6, "<html>\n<head>\n</head>\n<body>\n [ , !]\n</body>\n</html>");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<html>\n<head>\n</head>\n<body>\n [ , !]\n</body>\n</html>" + "'", str7, "<html>\n<head>\n</head>\n<body>\n [ , !]\n</body>\n</html>");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(elements11);
    }

    @Test
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1601");
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parseBodyFragment("hi", "hi");
        java.lang.String str3 = document2.baseUri();
        java.lang.String str4 = document2.html();
        org.jsoup.nodes.Document document5 = document2.normalise();
        org.jsoup.nodes.Document document7 = org.jsoup.nodes.Document.createShell("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        java.lang.String str8 = document7.baseUri();
        document5.addChild((org.jsoup.nodes.Node) document7);
        int int10 = document7.nodeDepth();
        org.jsoup.select.Elements elements11 = document7.siblingElements();
        java.lang.String str12 = elements11.outerHtml();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi" + "'", str3, "hi");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<html>\n<head>\n</head>\n<body>\n hi\n</body>\n</html>" + "'", str4, "<html>\n<head>\n</head>\n<body>\n hi\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document5);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str8, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\n<html>\n<head>\n</head>\n<body>\n hi\n</body>\n</html>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>" + "'", str12, "\n<html>\n<head>\n</head>\n<body>\n hi\n</body>\n</html>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>");
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1602");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean2 = tag1.isEmpty();
        boolean boolean3 = tag1.preserveWhitespace();
        org.jsoup.nodes.Element element5 = new org.jsoup.nodes.Element(tag1, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        boolean boolean6 = tag1.isEmpty();
        boolean boolean7 = tag1.preserveWhitespace();
        org.jsoup.nodes.Document document10 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node11 = document10.parentNode;
        java.lang.String str12 = document10.title();
        org.jsoup.nodes.Attributes attributes13 = document10.attributes();
        org.jsoup.nodes.Document document16 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node17 = document16.parentNode;
        org.jsoup.select.Elements elements19 = document16.getElementsByIndexLessThan((int) 'a');
        org.jsoup.nodes.Element element20 = document10.prependChild((org.jsoup.nodes.Node) document16);
        java.lang.String str21 = document16.baseUri();
        org.jsoup.nodes.Document document24 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str25 = document24.outerHtml();
        org.jsoup.nodes.Document document28 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node29 = document28.parentNode;
        java.lang.String str30 = document28.title();
        org.jsoup.nodes.Element element32 = document28.text("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element33 = document24.appendChild((org.jsoup.nodes.Node) document28);
        org.jsoup.nodes.Attributes attributes34 = document28.attributes();
        document16.addChild((org.jsoup.nodes.Node) document28);
        org.jsoup.nodes.Document document37 = org.jsoup.Jsoup.parseBodyFragment("head");
        org.jsoup.nodes.Element element38 = document28.prependChild((org.jsoup.nodes.Node) document37);
        java.lang.String str39 = document28.val();
        org.jsoup.nodes.Element element41 = document28.text("<html>\n<head>\n</head>\n<body>\n hi\n</body>\n</html>=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n hi\n&lt;/body&gt;\n&lt;/html&gt;\"");
        org.jsoup.nodes.Element element43 = element41.wrap("<html>\n<head>\n</head>\n<body>\n [ , !]\n</body>\n</html>");
        boolean boolean44 = tag1.equals((java.lang.Object) "<html>\n<head>\n</head>\n<body>\n [ , !]\n</body>\n</html>");
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertNotNull(document16);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNotNull(document24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str25, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document28);
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(element32);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertNotNull(attributes34);
        org.junit.Assert.assertNotNull(document37);
        org.junit.Assert.assertNotNull(element38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(element41);
        org.junit.Assert.assertNotNull(element43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1603");
        org.jsoup.nodes.Evaluator.AttributeWithValueNot attributeWithValueNot2 = new org.jsoup.nodes.Evaluator.AttributeWithValueNot("\n<!---->", "#root");
        org.jsoup.nodes.Document document5 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str6 = document5.outerHtml();
        org.jsoup.select.Elements elements7 = document5.getAllElements();
        java.lang.String str8 = document5.data();
        java.lang.String str9 = document5.baseUri();
        org.jsoup.nodes.Element element11 = document5.text("<#root>\n<html>\n <head>\n </head>\n <body> hi!\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element13 = element11.val("#declaration");
        boolean boolean14 = attributeWithValueNot2.matches(element13);
        java.lang.String str15 = attributeWithValueNot2.value;
        org.jsoup.nodes.Document document17 = new org.jsoup.nodes.Document("");
        int int18 = document17.nodeDepth();
        boolean boolean19 = attributeWithValueNot2.matches((org.jsoup.nodes.Element) document17);
        attributeWithValueNot2.key = "&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;";
        java.lang.String str22 = attributeWithValueNot2.key;
        attributeWithValueNot2.key = "\n<html>\n<head>\n</head>\n<body>\n hi\n</body>\n</html>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>";
        org.junit.Assert.assertNotNull(document5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str6, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "#root" + "'", str15, "#root");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;" + "'", str22, "&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;");
    }

    @Test
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1604");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("\n<!---->", "\n<!---->");
        java.lang.String str3 = textNode2.text();
        boolean boolean4 = textNode2.isBlank();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("org.jsoup.select.Selector$SelectorParseException: <html> <head> </head> <body> hi! </body> </html><#root> <html> <head> </head> <body> &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt; </body> </html> </#root>");
        org.jsoup.nodes.Document document8 = org.jsoup.Jsoup.parse("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html><#root>\n<html>\n <head>\n </head>\n <body>\n  &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;\n </body>\n</html>\n</#root>");
        java.lang.String str9 = document8.tagName();
        org.jsoup.nodes.Document document12 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node13 = document12.parentNode;
        java.lang.String str14 = document12.title();
        org.jsoup.nodes.Attributes attributes15 = document12.attributes();
        org.jsoup.nodes.Document document18 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node19 = document18.parentNode;
        org.jsoup.select.Elements elements21 = document18.getElementsByIndexLessThan((int) 'a');
        org.jsoup.nodes.Element element22 = document12.prependChild((org.jsoup.nodes.Node) document18);
        java.lang.String str24 = document12.attr("hi=\"\"");
        org.jsoup.nodes.Document document27 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str28 = document27.outerHtml();
        org.jsoup.nodes.Document document31 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node32 = document31.parentNode;
        java.lang.String str33 = document31.title();
        org.jsoup.nodes.Element element35 = document31.text("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element36 = document27.appendChild((org.jsoup.nodes.Node) document31);
        org.jsoup.nodes.Node node37 = document31.parentNode;
        node37.baseUri = "hi!";
        org.jsoup.nodes.Element element40 = document12.prependChild(node37);
        // The following exception was thrown during execution in test generation
        try {
            textNode2.replaceChild((org.jsoup.nodes.Node) document8, node37);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated expression is false");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n&lt;!----&gt;" + "'", str3, "\n&lt;!----&gt;");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(textNode6);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#root" + "'", str9, "#root");
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(attributes15);
        org.junit.Assert.assertNotNull(document18);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNotNull(elements21);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(document27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str28, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document31);
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertNotNull(element36);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertNotNull(element40);
    }

    @Test
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1605");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node3 = document2.parentNode;
        org.jsoup.select.Elements elements5 = document2.getElementsByIndexLessThan((int) 'a');
        org.jsoup.select.Elements elements7 = elements5.val("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        java.util.stream.Stream<org.jsoup.nodes.Element> elementStream8 = elements5.stream();
        org.jsoup.nodes.Document document11 = org.jsoup.parser.Parser.parseBodyFragment("<#root>\n<html>\n <head>\n </head>\n <body> hi!\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>", "<html>\n<head>\n</head>\n<body>\n hi\n</body>\n</html>=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n hi\n&lt;/body&gt;\n&lt;/html&gt;\"");
        org.jsoup.nodes.Element element13 = document11.appendElement("\n&lt;!----&gt;");
        org.jsoup.nodes.Document document16 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node17 = document16.parentNode;
        java.lang.String str18 = document16.title();
        org.jsoup.nodes.Attributes attributes19 = document16.attributes();
        org.jsoup.nodes.Document document22 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node23 = document22.parentNode;
        org.jsoup.select.Elements elements25 = document22.getElementsByIndexLessThan((int) 'a');
        org.jsoup.nodes.Element element26 = document16.prependChild((org.jsoup.nodes.Node) document22);
        org.jsoup.select.Elements elements28 = document22.getElementsByClass("!");
        org.jsoup.nodes.Element element30 = document22.append("hi!");
        org.jsoup.nodes.Document document33 = org.jsoup.Jsoup.parse("", "<html>\n<head>\n</head>\n<body>\n hi\n</body>\n</html>");
        java.lang.String[] strArray41 = new java.lang.String[] { "<html>\n<head>\n</head>\n<body>\n hi\n</body>\n</html>=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n hi\n&lt;/body&gt;\n&lt;/html&gt;\"", "[ , #, d, o, c, u, m, e, n, t]", "<html class=\" hi\" head=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt; hi!\n&lt;/body&gt;\n&lt;/html&gt;\" value=\"#text\">\n<head class=\" hi\" head=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt; hi!\n&lt;/body&gt;\n&lt;/html&gt;\" value=\"#text\">\n</head>\n<body class=\" hi\" head=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt; hi!\n&lt;/body&gt;\n&lt;/html&gt;\" value=\"#text\"> hi!\n</body>\n</html>\n\n<html class=\" hi\" head=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt; hi!\n&lt;/body&gt;\n&lt;/html&gt;\" value=\"#text\">\n<head class=\" hi\" head=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt; hi!\n&lt;/body&gt;\n&lt;/html&gt;\" value=\"#text\">\n</head>\n<body class=\" hi\" head=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt; hi!\n&lt;/body&gt;\n&lt;/html&gt;\" value=\"#text\"> hi!\n</body>\n</html>\n\n<head class=\" hi\" head=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt; hi!\n&lt;/body&gt;\n&lt;/html&gt;\" value=\"#text\">\n</head>\n\n<body class=\" hi\" head=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt; hi!\n&lt;/body&gt;\n&lt;/html&gt;\" value=\"#text\"> hi!\n</body>", "#data", "#declaration", "#declaration", "\n&lt;!----&gt;" };
        java.util.LinkedHashSet<java.lang.String> strSet42 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet42, strArray41);
        org.jsoup.nodes.Element element44 = document33.classNames((java.util.Set<java.lang.String>) strSet42);
        org.jsoup.nodes.Element element45 = element30.classNames((java.util.Set<java.lang.String>) strSet42);
        org.jsoup.nodes.Element element46 = document11.classNames((java.util.Set<java.lang.String>) strSet42);
        int int47 = elements5.indexOf((java.lang.Object) element46);
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(elementStream8);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(document16);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(attributes19);
        org.junit.Assert.assertNotNull(document22);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertNotNull(elements25);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertNotNull(elements28);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertNotNull(document33);
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(element44);
        org.junit.Assert.assertNotNull(element45);
        org.junit.Assert.assertNotNull(element46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
    }

    @Test
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1606");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("\n<!---->", "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>\n<head>\n</head>\n<body> hi!\n</body>\n\nhi!");
        java.lang.String str3 = document2.val();
        org.jsoup.nodes.Document document6 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str7 = document6.outerHtml();
        org.jsoup.select.Elements elements8 = document6.getAllElements();
        java.lang.String str9 = document6.data();
        java.lang.String str10 = document6.baseUri();
        org.jsoup.nodes.Element element12 = document6.text("<#root>\n<html>\n <head>\n </head>\n <body> hi!\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        boolean boolean13 = document2.equals((java.lang.Object) document6);
        document2.title("<html>\n<head>\n</head>\n<body>\n hi\n</body>\n</html>");
        org.jsoup.nodes.Element element17 = document2.appendText("<html>\n    <head>\n    </head>\n    <body>\n     &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;\n    </body>\n   </html>");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str7, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(element17);
    }

    @Test
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1607");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node3 = document2.parentNode;
        org.jsoup.select.Elements elements5 = document2.getElementsByIndexLessThan((int) 'a');
        java.util.stream.Stream<org.jsoup.nodes.Element> elementStream6 = elements5.stream();
        org.jsoup.select.Elements elements8 = elements5.toggleClass("[ , !]");
        org.jsoup.select.Elements elements10 = elements8.append("<!---->");
        org.jsoup.select.Elements elements12 = elements8.wrap("&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt; hi!\n&lt;/body&gt;\n&lt;/html&gt;");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elementStream6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(elements12);
    }

    @Test
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1608");
        org.jsoup.nodes.Evaluator.AttributeWithValueNot attributeWithValueNot2 = new org.jsoup.nodes.Evaluator.AttributeWithValueNot("<html class=\" hi\" head=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt; hi!\n&lt;/body&gt;\n&lt;/html&gt;\" value=\"#text\">\n<head class=\" hi\" head=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt; hi!\n&lt;/body&gt;\n&lt;/html&gt;\" value=\"#text\">\n</head>\n<body class=\" hi\" head=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt; hi!\n&lt;/body&gt;\n&lt;/html&gt;\" value=\"#text\"> hi!\n</body>\n</html>\n\n<html class=\" hi\" head=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt; hi!\n&lt;/body&gt;\n&lt;/html&gt;\" value=\"#text\">\n<head class=\" hi\" head=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt; hi!\n&lt;/body&gt;\n&lt;/html&gt;\" value=\"#text\">\n</head>\n<body class=\" hi\" head=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt; hi!\n&lt;/body&gt;\n&lt;/html&gt;\" value=\"#text\"> hi!\n</body>\n</html>\n\n<head class=\" hi\" head=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt; hi!\n&lt;/body&gt;\n&lt;/html&gt;\" value=\"#text\">\n</head>\n\n<body class=\" hi\" head=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt; hi!\n&lt;/body&gt;\n&lt;/html&gt;\" value=\"#text\"> hi!\n</body>", "<#root>\n<html>\n <head>\n </head>\n <body> hi!\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.nodes.Document document5 = org.jsoup.parser.Parser.parseBodyFragment("<html>\n<head>\n</head>\n<body>\n hi\n</body>\n</html>", "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>\n<head>\n</head>\n<body> hi!\n</body>\n\nhi!");
        boolean boolean6 = attributeWithValueNot2.matches((org.jsoup.nodes.Element) document5);
        org.jsoup.nodes.Element element8 = document5.appendText("<html>\n<head>\n</head>\n<body>\n &lt;#root&gt; \n <html> \n  <head> \n  </head> \n  <body>\n    hi!    \n   <html> \n    <head> \n    </head> \n    <body>\n      hi!  \n    </body>\n   </html>\n  </body>\n </html>\n</body>\n</html>");
        org.jsoup.nodes.Element element10 = element8.wrap("#comment");
        org.junit.Assert.assertNotNull(document5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNull(element10);
    }

    @Test
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1609");
        org.jsoup.safety.Whitelist whitelist2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.jsoup.Jsoup.clean("", " !", whitelist2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1610");
        org.jsoup.nodes.Evaluator.AttributeWithValueStarting attributeWithValueStarting2 = new org.jsoup.nodes.Evaluator.AttributeWithValueStarting("hi", "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        attributeWithValueStarting2.value = "hi!";
        java.lang.String str5 = attributeWithValueStarting2.value;
        org.jsoup.nodes.Document document8 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node9 = document8.parentNode;
        org.jsoup.select.Elements elements11 = document8.getElementsByIndexLessThan((int) 'a');
        java.lang.String str12 = document8.text();
        org.jsoup.nodes.Element element14 = document8.text("");
        org.jsoup.nodes.Document document17 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str18 = document17.outerHtml();
        org.jsoup.select.Elements elements19 = document17.getAllElements();
        boolean boolean20 = element14.equals((java.lang.Object) elements19);
        boolean boolean21 = attributeWithValueStarting2.matches(element14);
        org.jsoup.nodes.Document document24 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str25 = document24.outerHtml();
        org.jsoup.nodes.Document document28 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node29 = document28.parentNode;
        java.lang.String str30 = document28.title();
        org.jsoup.nodes.Element element32 = document28.text("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element33 = document24.appendChild((org.jsoup.nodes.Node) document28);
        org.jsoup.nodes.Element element34 = document28.head();
        boolean boolean35 = attributeWithValueStarting2.matches(element34);
        org.jsoup.nodes.Evaluator.AttributeWithValueEnding attributeWithValueEnding38 = new org.jsoup.nodes.Evaluator.AttributeWithValueEnding("\n<!---->", "hi!");
        org.jsoup.nodes.Document document41 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str42 = document41.outerHtml();
        document41.setBaseUri("hi");
        boolean boolean45 = attributeWithValueEnding38.matches((org.jsoup.nodes.Element) document41);
        org.jsoup.nodes.Element element47 = document41.prependText("<#root>\n<html>\n <head>\n </head>\n <body> hi!\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.select.Elements elements49 = element47.getElementsByIndexGreaterThan((int) (short) 100);
        boolean boolean50 = attributeWithValueStarting2.matches(element47);
        attributeWithValueStarting2.value = "<html>\n<head>\n <title>&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n hi\n&lt;/body&gt;\n&lt;/html&gt;</title>\n</head>\n<body> hi!\n</body>\n</html>";
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(document17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str18, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(document24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str25, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document28);
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(element32);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertNotNull(element34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(document41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str42, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(element47);
        org.junit.Assert.assertNotNull(elements49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    }

    @Test
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1611");
        org.jsoup.nodes.Evaluator.AttributeWithValueContaining attributeWithValueContaining2 = new org.jsoup.nodes.Evaluator.AttributeWithValueContaining("hi! hi!  hi!", "org.jsoup.select.Selector$SelectorParseException: <html> <head> </head> <body> hi! </body> </html><#root> <html> <head> </head> <body> &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt; </body> </html> </#root>");
        org.jsoup.nodes.Evaluator.Attribute attribute4 = new org.jsoup.nodes.Evaluator.Attribute("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.nodes.Document document7 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node8 = document7.parentNode;
        java.lang.String str9 = document7.title();
        org.jsoup.nodes.Attributes attributes10 = document7.attributes();
        org.jsoup.nodes.Document document13 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node14 = document13.parentNode;
        org.jsoup.select.Elements elements16 = document13.getElementsByIndexLessThan((int) 'a');
        org.jsoup.nodes.Element element17 = document7.prependChild((org.jsoup.nodes.Node) document13);
        org.jsoup.select.Elements elements19 = document7.select("hi");
        org.jsoup.select.Elements elements20 = document7.children();
        boolean boolean21 = attribute4.matches((org.jsoup.nodes.Element) document7);
        org.jsoup.nodes.Document document23 = org.jsoup.nodes.Document.createShell("");
        document23.baseUri = "";
        org.jsoup.select.Elements elements27 = document23.getElementsByIndexEquals((int) (byte) -1);
        org.jsoup.nodes.Document document28 = document23.normalise();
        org.jsoup.nodes.Element element30 = document28.appendText("\n<!---->");
        boolean boolean31 = attribute4.matches((org.jsoup.nodes.Element) document28);
        org.jsoup.nodes.Node node32 = document28.parent();
        boolean boolean33 = attributeWithValueContaining2.matches((org.jsoup.nodes.Element) document28);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertNotNull(elements20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(document23);
        org.junit.Assert.assertNotNull(elements27);
        org.junit.Assert.assertNotNull(document28);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1612");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node3 = document2.parentNode;
        java.lang.String str4 = document2.title();
        org.jsoup.nodes.Attributes attributes5 = document2.attributes();
        org.jsoup.nodes.Document document8 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node9 = document8.parentNode;
        org.jsoup.select.Elements elements11 = document8.getElementsByIndexLessThan((int) 'a');
        org.jsoup.nodes.Element element12 = document2.prependChild((org.jsoup.nodes.Node) document8);
        org.jsoup.select.Elements elements13 = document8.children();
        org.jsoup.nodes.Document document16 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node17 = document16.parentNode;
        org.jsoup.select.Elements elements19 = document16.getElementsByIndexLessThan((int) 'a');
        java.util.stream.Stream<org.jsoup.nodes.Element> elementStream20 = elements19.stream();
        org.jsoup.select.Elements elements22 = elements19.addClass("hi");
        org.jsoup.select.Elements elements23 = new org.jsoup.select.Elements((java.util.Collection<org.jsoup.nodes.Element>) elements22);
        org.jsoup.select.Elements elements26 = elements22.attr("head", "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.select.Elements elements28 = elements26.val("#text");
        org.jsoup.nodes.Document document31 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node32 = document31.parentNode;
        java.lang.String str33 = document31.title();
        org.jsoup.nodes.Attributes attributes34 = document31.attributes();
        org.jsoup.nodes.Document document37 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node38 = document37.parentNode;
        org.jsoup.select.Elements elements40 = document37.getElementsByIndexLessThan((int) 'a');
        org.jsoup.nodes.Element element41 = document31.prependChild((org.jsoup.nodes.Node) document37);
        org.jsoup.select.Elements elements43 = document37.getElementsByClass("!");
        org.jsoup.nodes.Element element45 = document37.append("hi!");
        int int46 = elements26.lastIndexOf((java.lang.Object) document37);
        org.jsoup.select.Elements elements48 = elements26.prepend("\n&lt;!----&gt;");
        org.jsoup.nodes.Element element49 = elements26.first();
        boolean boolean50 = elements13.remove((java.lang.Object) elements26);
        org.jsoup.nodes.Element element51 = elements26.last();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(document16);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertNotNull(elementStream20);
        org.junit.Assert.assertNotNull(elements22);
        org.junit.Assert.assertNotNull(elements26);
        org.junit.Assert.assertNotNull(elements28);
        org.junit.Assert.assertNotNull(document31);
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(attributes34);
        org.junit.Assert.assertNotNull(document37);
        org.junit.Assert.assertNull(node38);
        org.junit.Assert.assertNotNull(elements40);
        org.junit.Assert.assertNotNull(element41);
        org.junit.Assert.assertNotNull(elements43);
        org.junit.Assert.assertNotNull(element45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertNotNull(elements48);
        org.junit.Assert.assertNotNull(element49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(element51);
    }

    @Test
    public void test1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1613");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node3 = document2.parentNode;
        java.lang.String str4 = document2.title();
        org.jsoup.nodes.Attributes attributes5 = document2.attributes();
        org.jsoup.nodes.Attribute attribute8 = org.jsoup.nodes.Attribute.createFromEncoded("hi", "");
        java.lang.String str9 = attribute8.html();
        attributes5.put(attribute8);
        java.lang.String str11 = attribute8.getKey();
        attribute8.setKey("#data");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertNotNull(attribute8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi=\"\"" + "'", str9, "hi=\"\"");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi" + "'", str11, "hi");
    }

    @Test
    public void test1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1614");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("[4, !]");
        org.junit.Assert.assertNotNull(document1);
    }

    @Test
    public void test1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1615");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node3 = document2.parentNode;
        java.lang.String str4 = document2.title();
        org.jsoup.nodes.Attributes attributes5 = document2.attributes();
        org.jsoup.nodes.Document document8 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node9 = document8.parentNode;
        org.jsoup.select.Elements elements11 = document8.getElementsByIndexLessThan((int) 'a');
        org.jsoup.nodes.Element element12 = document2.prependChild((org.jsoup.nodes.Node) document8);
        org.jsoup.select.Elements elements13 = document8.children();
        org.jsoup.nodes.Evaluator.AttributeWithValueEnding attributeWithValueEnding16 = new org.jsoup.nodes.Evaluator.AttributeWithValueEnding("\n  <head>\n  </head>", "[]");
        org.jsoup.nodes.Document document19 = org.jsoup.Jsoup.parseBodyFragment("[ , !]", "hi=\"\"");
        org.jsoup.nodes.Element element21 = document19.removeClass("[ , #, d, o, c, u, m, e, n, t]");
        boolean boolean22 = attributeWithValueEnding16.matches(element21);
        org.jsoup.select.Elements elements25 = element21.getElementsByAttributeValueStarting(" ", " !");
        int int26 = elements13.indexOf((java.lang.Object) elements25);
        org.jsoup.nodes.Document document29 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        java.lang.String str30 = document29.outerHtml();
        org.jsoup.nodes.Document document33 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node34 = document33.parentNode;
        java.lang.String str35 = document33.title();
        org.jsoup.nodes.Element element37 = document33.text("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.jsoup.nodes.Element element38 = document29.appendChild((org.jsoup.nodes.Node) document33);
        org.jsoup.nodes.Element element39 = document33.nextElementSibling();
        org.jsoup.select.Elements elements40 = document33.siblingElements();
        java.util.stream.Stream<org.jsoup.nodes.Element> elementStream41 = elements40.stream();
        org.jsoup.nodes.Document document44 = org.jsoup.parser.Parser.parse("hi!", "hi!");
        org.jsoup.nodes.Node node45 = document44.parentNode;
        org.jsoup.select.Elements elements47 = document44.getElementsByIndexLessThan((int) 'a');
        java.util.stream.Stream<org.jsoup.nodes.Element> elementStream48 = elements47.stream();
        org.jsoup.select.Elements elements50 = elements47.addClass("hi");
        java.lang.String str51 = elements50.html();
        boolean boolean52 = elements40.removeAll((java.util.Collection<org.jsoup.nodes.Element>) elements50);
        org.jsoup.select.Elements elements54 = elements40.removeAttr("<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html><#root>\n<html>\n <head>\n </head>\n <body>\n  &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; hi! &lt;/body&gt; &lt;/html&gt;\n </body>\n</html>\n</#root>");
        org.jsoup.select.Elements elements56 = elements40.append("#text head");
        boolean boolean57 = elements25.retainAll((java.util.Collection<org.jsoup.nodes.Element>) elements56);
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(document19);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(elements25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(document29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>" + "'", str30, "<html>\n<head>\n</head>\n<body> hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document33);
        org.junit.Assert.assertNull(node34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(element37);
        org.junit.Assert.assertNotNull(element38);
        org.junit.Assert.assertNull(element39);
        org.junit.Assert.assertNotNull(elements40);
        org.junit.Assert.assertNotNull(elementStream41);
        org.junit.Assert.assertNotNull(document44);
        org.junit.Assert.assertNull(node45);
        org.junit.Assert.assertNotNull(elements47);
        org.junit.Assert.assertNotNull(elementStream48);
        org.junit.Assert.assertNotNull(elements50);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "<html class=\" hi\">\n<head class=\" hi\">\n</head>\n<body class=\" hi\"> hi!\n</body>\n</html>\n<head class=\" hi\">\n</head>\n<body class=\" hi\"> hi!\n</body>\n\nhi!" + "'", str51, "<html class=\" hi\">\n<head class=\" hi\">\n</head>\n<body class=\" hi\"> hi!\n</body>\n</html>\n<head class=\" hi\">\n</head>\n<body class=\" hi\"> hi!\n</body>\n\nhi!");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(elements54);
        org.junit.Assert.assertNotNull(elements56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
    }
}

