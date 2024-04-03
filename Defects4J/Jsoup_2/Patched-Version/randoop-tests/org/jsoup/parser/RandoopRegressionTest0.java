package org.jsoup.parser;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RandoopRegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test001");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element3 = document1.prependElement("hi!");
        org.jsoup.nodes.Element element5 = element3.append("");
        org.jsoup.nodes.Document document7 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element9 = document7.prependElement("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element10 = element3.prependChild((org.jsoup.nodes.Node) element9);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.lang.NotImplementedException; message: Cannot (yet) move nodes in tree");
        } catch (org.apache.commons.lang.NotImplementedException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNotNull(element9);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test002");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element3 = document1.prependElement("hi!");
        org.jsoup.nodes.Element element5 = element3.append("");
        org.jsoup.nodes.Document document7 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element9 = document7.prependElement("hi!");
        org.jsoup.nodes.Document document11 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element13 = document11.prependElement("hi!");
        org.jsoup.nodes.Element element15 = element13.append("");
        org.jsoup.nodes.Document document17 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element19 = document17.prependElement("hi!");
        org.jsoup.nodes.Element[] elementArray20 = new org.jsoup.nodes.Element[] { element5, element9, element13, document17 };
        java.util.ArrayList<org.jsoup.nodes.Element> elementList21 = new java.util.ArrayList<org.jsoup.nodes.Element>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<org.jsoup.nodes.Element>) elementList21, elementArray20);
        java.util.Spliterator<org.jsoup.nodes.Element> elementSpliterator23 = elementList21.spliterator();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(document17);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(elementArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(elementSpliterator23);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test003");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str2 = document1.tagName();
        org.jsoup.nodes.Element element4 = document1.append("hi!");
        // The following exception was thrown during execution in test generation
        try {
            document1.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#root" + "'", str2, "#root");
        org.junit.Assert.assertNotNull(element4);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test004");
        org.jsoup.safety.Whitelist whitelist1 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.jsoup.Jsoup.isValid("", whitelist1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test005");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str2 = document1.tagName();
        org.jsoup.nodes.Element element4 = document1.append("hi!");
        java.lang.String str5 = document1.outerHtml();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node7 = document1.removeAttr("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#root" + "'", str2, "#root");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!" + "'", str5, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!");
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test006");
        org.jsoup.safety.Whitelist whitelist2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.jsoup.Jsoup.clean("<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "hi!", whitelist2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test007");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.select.Elements elements3 = document1.getElementsByTag("#root");
        org.jsoup.select.Elements elements5 = elements3.append("<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element7 = elements3.remove((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 52, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements5);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test008");
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parseBodyFragment("#root=\"\"", "<#root>\n</#root>");
        java.lang.String str3 = document2.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element5 = document2.wrap("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>" + "'", str3, "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>");
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test009");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str2 = document1.tagName();
        org.jsoup.nodes.Element element4 = document1.append("hi!");
        java.lang.String str5 = document1.outerHtml();
        java.lang.String str6 = document1.val();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#root" + "'", str2, "#root");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!" + "'", str5, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test010");
        org.jsoup.safety.Whitelist whitelist1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.jsoup.Jsoup.clean("", whitelist1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test011");
        org.jsoup.safety.Whitelist whitelist2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.jsoup.Jsoup.clean("#declaration", "", whitelist2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test012");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str2 = document1.tagName();
        org.jsoup.nodes.Element element4 = document1.append("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements6 = document1.getElementsByClass("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#root" + "'", str2, "#root");
        org.junit.Assert.assertNotNull(element4);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test013");
        org.jsoup.safety.Whitelist whitelist1 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.jsoup.Jsoup.isValid("#root=\"hi!\"", whitelist1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test014");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("#root", "#root");
        java.lang.String str3 = document2.nodeName();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element5 = document2.wrap("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test015");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str2 = document1.id();
        org.jsoup.select.Elements elements3 = document1.children();
        org.jsoup.select.Elements elements5 = elements3.html("#root=\"\"");
        org.jsoup.select.Elements elements7 = elements3.removeClass("<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements10 = elements3.attr("", "#root=\"\"=\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elements7);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test016");
        org.jsoup.safety.Whitelist whitelist2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.jsoup.Jsoup.clean("#root=\"\"", "hi!", whitelist2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test017");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.select.Elements elements3 = document1.getElementsByTag("#root");
        org.jsoup.select.Elements elements5 = elements3.append("<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements8 = elements5.attr("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements5);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test018");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("#root", "#root");
        org.jsoup.nodes.Element element4 = document2.addClass("<#root>\n</#root>");
        org.jsoup.select.Elements elements6 = element4.getElementsByAttribute("\n<!--#root=\"\"-->");
        java.lang.String str7 = elements6.text();
        // The following exception was thrown during execution in test generation
        try {
            java.util.ListIterator<org.jsoup.nodes.Element> elementItor9 = elements6.listIterator((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test019");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("#root", "#root");
        org.jsoup.nodes.Element element4 = document2.addClass("<#root>\n</#root>");
        org.jsoup.select.Elements elements5 = element4.children();
        java.util.Spliterator<org.jsoup.nodes.Element> elementSpliterator6 = elements5.spliterator();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elementSpliterator6);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test020");
        org.jsoup.safety.Whitelist whitelist1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.jsoup.Jsoup.clean("hi!", whitelist1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test021");
        org.jsoup.nodes.Document document2 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element4 = document2.prependElement("hi!");
        org.jsoup.nodes.Element element6 = element4.append("");
        org.jsoup.select.Elements elements7 = org.jsoup.select.Selector.select("#root", element6);
        java.lang.String str8 = elements7.text();
        java.util.function.UnaryOperator<org.jsoup.nodes.Element> elementUnaryOperator9 = null;
        // The following exception was thrown during execution in test generation
        try {
            elements7.replaceAll(elementUnaryOperator9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test022");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str2 = document1.tagName();
        org.jsoup.select.Elements elements4 = document1.getElementsByIndexGreaterThan((-1));
        boolean boolean5 = elements4.isEmpty();
        org.jsoup.select.Elements elements7 = elements4.append("\n<!--#root=\"\"-->");
        java.util.function.UnaryOperator<org.jsoup.nodes.Element> elementUnaryOperator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            elements7.replaceAll(elementUnaryOperator8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#root" + "'", str2, "#root");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(elements7);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test023");
        org.jsoup.nodes.Evaluator evaluator0 = null;
        org.jsoup.nodes.Document document2 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str3 = document2.tagName();
        org.jsoup.select.Elements elements5 = document2.getElementsByIndexGreaterThan((-1));
        java.lang.String str6 = document2.toString();
        org.jsoup.nodes.Element element8 = document2.text("#root=\"hi!\"");
        org.jsoup.nodes.Element element10 = document2.prepend("#document");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements11 = org.jsoup.select.Collector.collect(evaluator0, (org.jsoup.nodes.Element) document2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#root" + "'", str3, "#root");
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>" + "'", str6, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test024");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element3 = document1.prependElement("hi!");
        org.jsoup.nodes.Element element5 = element3.append("");
        org.jsoup.nodes.Element element7 = element3.prepend("<#root>\n</#root>");
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("#root");
        boolean boolean10 = document9.hasText();
        org.jsoup.select.Elements elements12 = document9.getElementsByIndexEquals(10);
        java.lang.Object[] objArray13 = elements12.toArray();
        org.jsoup.nodes.Document document16 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element18 = document16.prependElement("hi!");
        org.jsoup.nodes.Element element19 = element18.parent();
        org.jsoup.nodes.Element element20 = element18.empty();
        elements12.add(0, element20);
        org.jsoup.nodes.Document document23 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str24 = document23.tagName();
        org.jsoup.parser.Tag tag25 = document23.tag();
        org.jsoup.nodes.TextNode textNode28 = new org.jsoup.nodes.TextNode("hi!", "");
        org.jsoup.nodes.Node node29 = textNode28.parent();
        org.jsoup.nodes.Element element30 = document23.appendChild((org.jsoup.nodes.Node) textNode28);
        org.jsoup.select.Elements elements32 = element30.getElementsByClass("#root");
        org.jsoup.nodes.Element element33 = element20.prependChild((org.jsoup.nodes.Node) element30);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element34 = element3.appendChild((org.jsoup.nodes.Node) element30);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.lang.NotImplementedException; message: Cannot (yet) move nodes in tree");
        } catch (org.apache.commons.lang.NotImplementedException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
        org.junit.Assert.assertNotNull(document16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(document23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "#root" + "'", str24, "#root");
        org.junit.Assert.assertNotNull(tag25);
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertNotNull(elements32);
        org.junit.Assert.assertNotNull(element33);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test025");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("", "\n<!--#root=\"\"-->");
        org.jsoup.select.Elements elements5 = document2.getElementsByAttributeValueContaining("\n<!--#root=\"\"-->", "#root=\"hi!\"");
        int int6 = elements5.size();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test026");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str2 = document1.tagName();
        org.jsoup.nodes.Element element4 = document1.append("hi!");
        java.lang.String str5 = document1.outerHtml();
        org.jsoup.select.Elements elements6 = document1.children();
        org.jsoup.nodes.Document document8 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.select.Elements elements10 = document8.getElementsByTag("#root");
        boolean boolean11 = document1.equals((java.lang.Object) document8);
        org.jsoup.nodes.Element element13 = document8.append("#text");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element15 = document8.child(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#root" + "'", str2, "#root");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!" + "'", str5, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(element13);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test027");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("#root", "#root");
        org.jsoup.nodes.Element element4 = document2.addClass("<#root>\n</#root>");
        org.jsoup.nodes.Element element6 = document2.append("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Node node7 = document2.parent();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNull(node7);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test028");
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parseBodyFragment("#root", "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>");
        org.jsoup.nodes.Element element4 = document2.toggleClass("org.jsoup.select.Selector$SelectorParseException: <html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element6 = element4.val("org.jsoup.select.Selector$SelectorParseException: hi!");
        java.lang.String str7 = element6.data();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements10 = element6.getElementsByAttributeValueStarting("<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test029");
        org.jsoup.safety.Whitelist whitelist2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.jsoup.Jsoup.clean("#root", "aorg", whitelist2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test030");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str2 = document1.tagName();
        org.jsoup.nodes.Element element4 = document1.append("hi!");
        org.jsoup.nodes.Element element6 = document1.prependText("hi!");
        org.jsoup.select.Elements elements8 = element6.getElementsByIndexGreaterThan((int) (short) 100);
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#root" + "'", str2, "#root");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements8);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test031");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str2 = document1.tagName();
        org.jsoup.nodes.Element element4 = document1.append("hi!");
        java.lang.String str5 = document1.outerHtml();
        org.jsoup.select.Elements elements6 = document1.children();
        java.lang.String str8 = elements6.attr("hi!");
        java.util.Collection<org.jsoup.nodes.Element> elementCollection9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = elements6.removeAll(elementCollection9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#root" + "'", str2, "#root");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!" + "'", str5, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test032");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.select.Elements elements3 = document1.getElementsByTag("#root");
        java.lang.String str4 = elements3.text();
        org.jsoup.select.Elements elements7 = elements3.attr("#root", "#root");
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("#root");
        boolean boolean10 = document9.hasText();
        org.jsoup.select.Elements elements12 = document9.getElementsByIndexEquals(10);
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor13 = elements12.listIterator();
        org.jsoup.select.Elements elements16 = elements12.attr("<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "hi!");
        org.jsoup.nodes.Document document18 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element20 = document18.prependElement("hi!");
        org.jsoup.nodes.Element element21 = element20.parent();
        int int22 = elements12.indexOf((java.lang.Object) element21);
        boolean boolean23 = elements7.retainAll((java.util.Collection<org.jsoup.nodes.Element>) elements12);
        org.jsoup.nodes.Document document27 = org.jsoup.Jsoup.parseBodyFragment("#root=\"\"", "<#root>\n</#root>");
        java.lang.String str28 = document27.nodeName();
        org.jsoup.select.Elements elements30 = document27.getElementsByIndexEquals(10);
        java.lang.String str31 = document27.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element32 = elements7.set((int) (short) 100, (org.jsoup.nodes.Element) document27);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(elementItor13);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertNotNull(document18);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(document27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "#document" + "'", str28, "#document");
        org.junit.Assert.assertNotNull(elements30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>" + "'", str31, "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>");
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test033");
        org.jsoup.nodes.Document document2 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str3 = document2.tagName();
        org.jsoup.nodes.Element element5 = document2.append("hi!");
        org.jsoup.nodes.Element element7 = document2.html("org.jsoup.select.Selector$SelectorParseException: hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements8 = org.jsoup.select.Selector.select("#root=\"\"", element7);
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query #root=\"\"");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#root" + "'", str3, "#root");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test034");
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
        org.jsoup.nodes.Node node40 = element32.nextSibling();
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
        org.junit.Assert.assertNull(node40);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test035");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str2 = document1.tagName();
        org.jsoup.nodes.Element element4 = document1.append("hi!");
        java.lang.String str5 = element4.text();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#root" + "'", str2, "#root");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test036");
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
        org.jsoup.select.Elements elements22 = elements20.html("#document");
        java.util.stream.Stream<org.jsoup.nodes.Element> elementStream23 = elements20.parallelStream();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(elementItor12);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(elements20);
        org.junit.Assert.assertNotNull(elements22);
        org.junit.Assert.assertNotNull(elementStream23);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test037");
        org.jsoup.safety.Whitelist whitelist2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.jsoup.Jsoup.clean("\n<!--#root=\"\"-->", "", whitelist2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test038");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str2 = document1.tagName();
        org.jsoup.parser.Tag tag3 = document1.tag();
        boolean boolean4 = tag3.isEmpty();
        boolean boolean5 = tag3.isBlock();
        boolean boolean6 = tag3.isEmpty();
        org.jsoup.nodes.Document document9 = org.jsoup.Jsoup.parseBodyFragment("#root=\"\"", "<#root>\n</#root>");
        java.lang.String str10 = document9.toString();
        java.lang.String str11 = document9.nodeName();
        java.lang.String str12 = document9.outerHtml();
        org.jsoup.nodes.Element element13 = document9.body();
        boolean boolean14 = element13.hasText();
        boolean boolean15 = tag3.equals((java.lang.Object) element13);
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#root" + "'", str2, "#root");
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(document9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>" + "'", str10, "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#document" + "'", str11, "#document");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>" + "'", str12, "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>");
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test039");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str2 = document1.tagName();
        org.jsoup.nodes.Element element4 = document1.append("hi!");
        java.lang.String str5 = document1.outerHtml();
        org.jsoup.select.Elements elements6 = document1.children();
        java.util.Collection<org.jsoup.nodes.Element> elementCollection7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = elements6.containsAll(elementCollection7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#root" + "'", str2, "#root");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!" + "'", str5, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!");
        org.junit.Assert.assertNotNull(elements6);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test040");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("org.jsoup.select.Selector$SelectorParseException: <html>\n<head>\n</head>\n<body>\n</body>\n</html>", "#text");
        org.junit.Assert.assertNotNull(document2);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test041");
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parseBodyFragment("<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "");
        org.junit.Assert.assertNotNull(document2);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test042");
        org.jsoup.nodes.Document document3 = org.jsoup.parser.Parser.parseBodyFragment("#root", "#root");
        java.lang.String str5 = document3.absUrl("#root=\"\"");
        document3.title("#document");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements8 = org.jsoup.select.Selector.select("", (org.jsoup.nodes.Element) document3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test043");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str2 = document1.tagName();
        java.lang.String str3 = document1.html();
        org.jsoup.nodes.Element element5 = document1.append("hi!");
        org.jsoup.select.Elements elements7 = element5.getElementsByIndexLessThan((int) (short) -1);
        org.jsoup.nodes.Document document9 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element11 = document9.prependElement("hi!");
        java.lang.String str12 = element11.tagName();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element13 = element5.prependChild((org.jsoup.nodes.Node) element11);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.lang.NotImplementedException; message: Cannot (yet) move nodes in tree");
        } catch (org.apache.commons.lang.NotImplementedException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#root" + "'", str2, "#root");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>" + "'", str3, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(document9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test044");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element3 = document1.prependElement("hi!");
        org.jsoup.nodes.Element element4 = element3.parent();
        org.jsoup.nodes.Element element5 = element3.empty();
        org.jsoup.nodes.Document document7 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element9 = document7.prependElement("hi!");
        org.jsoup.nodes.Element element10 = element9.parent();
        org.jsoup.nodes.Element element11 = element5.appendChild((org.jsoup.nodes.Node) element10);
        org.jsoup.nodes.Element element13 = element10.prepend("&lt;html&gt;\n &lt;head&gt;\n &lt;/head&gt;\n &lt;body&gt;\n &lt;/body&gt;\n&lt;/html&gt;hi!\n\n&lt;html&gt;\n &lt;head&gt;\n &lt;/head&gt;\n &lt;body&gt;\n &lt;/body&gt;\n&lt;/html&gt;\n\n &lt;head&gt;\n &lt;/head&gt;\n\n &lt;body&gt;\n &lt;/body&gt;");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element13);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test045");
        org.jsoup.safety.Whitelist whitelist2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.jsoup.Jsoup.clean("#root", "#root=\"\"=\"\"", whitelist2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test046");
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
        boolean boolean19 = elements18.isEmpty();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#root" + "'", str8, "#root");
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(document14);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertNotNull(elementArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test047");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str2 = document1.tagName();
        org.jsoup.nodes.Element element4 = document1.append("hi!");
        java.lang.String str5 = document1.outerHtml();
        java.lang.String str6 = document1.html();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#root" + "'", str2, "#root");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!" + "'", str5, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!" + "'", str6, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!");
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test048");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str2 = document1.tagName();
        org.jsoup.nodes.Element element4 = document1.append("hi!");
        java.lang.String str6 = document1.absUrl("hi!");
        org.jsoup.select.Elements elements7 = document1.getAllElements();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements9 = document1.select("<html>\n <head>\n </head>\n <body>\n </body>\n</html>hi!\n\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n\n <head>\n </head>\n\n <body>\n </body>");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query <html>? <head>? </head>? <body>? </body>?</html>hi!??<html>? <head>? </head>? <body>? </body>?</html>?? <head>? </head>?? <body>? </body>");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#root" + "'", str2, "#root");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(elements7);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test049");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!", "#root=\"hi!\"");
        org.jsoup.nodes.Document document4 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str5 = document4.tagName();
        org.jsoup.nodes.Element element7 = document4.append("hi!");
        java.lang.String str8 = document4.outerHtml();
        org.jsoup.select.Elements elements9 = document4.children();
        org.jsoup.nodes.Document document11 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.select.Elements elements13 = document11.getElementsByTag("#root");
        boolean boolean14 = document4.equals((java.lang.Object) document11);
        org.jsoup.nodes.Element element16 = document11.appendText("#root");
        boolean boolean17 = attribute2.equals((java.lang.Object) element16);
        org.junit.Assert.assertNotNull(document4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#root" + "'", str5, "#root");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!" + "'", str8, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!");
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test050");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str2 = document1.tagName();
        org.jsoup.nodes.Element element4 = document1.append("hi!");
        org.jsoup.nodes.Element element6 = document1.prependText("hi!");
        org.jsoup.select.Elements elements8 = element6.getElementsByTag("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#root" + "'", str2, "#root");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements8);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test051");
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parseBodyFragment("#root=\"\"", "<#root>\n</#root>");
        java.lang.String str3 = document2.nodeName();
        org.jsoup.select.Elements elements5 = document2.getElementsByIndexEquals(10);
        org.jsoup.nodes.Document document8 = org.jsoup.parser.Parser.parse("", "\n<!--#root=\"\"-->");
        boolean boolean9 = document2.equals((java.lang.Object) "\n<!--#root=\"\"-->");
        org.jsoup.nodes.Element element11 = document2.prepend("<html>\n <head>\n </head>\n <body>\n </body>\n</html>hi!\n\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n\n <head>\n </head>\n\n <body>\n </body>");
        org.jsoup.nodes.Document document13 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str14 = document13.tagName();
        org.jsoup.nodes.Element element16 = document13.append("hi!");
        java.lang.String str17 = document13.outerHtml();
        org.jsoup.select.Elements elements18 = document13.children();
        org.jsoup.nodes.Document document21 = new org.jsoup.nodes.Document("#root");
        boolean boolean22 = document21.hasText();
        org.jsoup.select.Elements elements24 = document21.getElementsByIndexEquals(10);
        org.jsoup.nodes.Document document26 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str27 = document26.tagName();
        org.jsoup.parser.Tag tag28 = document26.tag();
        org.jsoup.nodes.TextNode textNode31 = new org.jsoup.nodes.TextNode("hi!", "");
        org.jsoup.nodes.Node node32 = textNode31.parent();
        org.jsoup.nodes.Element element33 = document26.appendChild((org.jsoup.nodes.Node) textNode31);
        org.jsoup.select.Elements elements35 = element33.getElementsByClass("#root");
        org.jsoup.nodes.Element element36 = document21.prependChild((org.jsoup.nodes.Node) element33);
        org.jsoup.select.Elements elements39 = element33.getElementsByAttributeValueNot("#text", "#document");
        org.jsoup.nodes.Element element41 = element33.appendElement("<?<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!>");
        elements18.add((int) (byte) 1, element33);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element43 = document2.appendChild((org.jsoup.nodes.Node) element33);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.lang.NotImplementedException; message: Cannot (yet) move nodes in tree");
        } catch (org.apache.commons.lang.NotImplementedException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#root" + "'", str14, "#root");
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!" + "'", str17, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!");
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(elements24);
        org.junit.Assert.assertNotNull(document26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "#root" + "'", str27, "#root");
        org.junit.Assert.assertNotNull(tag28);
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertNotNull(elements35);
        org.junit.Assert.assertNotNull(element36);
        org.junit.Assert.assertNotNull(elements39);
        org.junit.Assert.assertNotNull(element41);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test052");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Document document3 = new org.jsoup.nodes.Document("#root");
        boolean boolean4 = document3.hasText();
        org.jsoup.select.Elements elements6 = document3.getElementsByIndexEquals(10);
        org.jsoup.nodes.Document document8 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str9 = document8.tagName();
        org.jsoup.parser.Tag tag10 = document8.tag();
        org.jsoup.nodes.TextNode textNode13 = new org.jsoup.nodes.TextNode("hi!", "");
        org.jsoup.nodes.Node node14 = textNode13.parent();
        org.jsoup.nodes.Element element15 = document8.appendChild((org.jsoup.nodes.Node) textNode13);
        org.jsoup.select.Elements elements17 = element15.getElementsByClass("#root");
        org.jsoup.nodes.Element element18 = document3.prependChild((org.jsoup.nodes.Node) element15);
        org.jsoup.select.Elements elements21 = element15.getElementsByAttributeValueNot("#text", "#document");
        org.jsoup.nodes.Element element23 = element15.appendElement("<?<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!>");
        org.jsoup.select.Elements elements24 = element23.siblingElements();
        org.jsoup.nodes.Document document27 = org.jsoup.parser.Parser.parseBodyFragment("#root", "#root");
        java.lang.String str29 = document27.absUrl("#root=\"\"");
        document27.title("#document");
        document27.setBaseUri("<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!");
        org.jsoup.nodes.Element element34 = element23.appendChild((org.jsoup.nodes.Node) document27);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element35 = document1.appendChild((org.jsoup.nodes.Node) element34);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.lang.NotImplementedException; message: Cannot (yet) move nodes in tree");
        } catch (org.apache.commons.lang.NotImplementedException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#root" + "'", str9, "#root");
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(elements21);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(elements24);
        org.junit.Assert.assertNotNull(document27);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(element34);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test053");
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parse("", "aorg");
        org.junit.Assert.assertNotNull(document2);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test054");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element3 = document1.prependElement("hi!");
        org.jsoup.nodes.Element element5 = element3.append("");
        org.jsoup.nodes.Element element7 = element3.toggleClass("#declaration");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements10 = element3.getElementsByAttributeValueContaining("", "ohi");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test055");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str2 = document1.tagName();
        org.jsoup.select.Elements elements4 = document1.getElementsByIndexGreaterThan((-1));
        java.lang.String str5 = document1.toString();
        org.jsoup.nodes.Element element7 = document1.text("#root=\"hi!\"");
        org.jsoup.nodes.Element element9 = document1.prepend("#document");
        org.jsoup.nodes.Element element11 = element9.html("<!<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!>");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#root" + "'", str2, "#root");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>" + "'", str5, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test056");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("#root");
        boolean boolean2 = document1.hasText();
        org.jsoup.select.Elements elements4 = document1.getElementsByIndexEquals(10);
        java.util.Spliterator<org.jsoup.nodes.Element> elementSpliterator5 = elements4.spliterator();
        org.jsoup.nodes.Document document9 = org.jsoup.parser.Parser.parseBodyFragment("#root", "#root");
        java.lang.String str11 = document9.absUrl("#root=\"\"");
        document9.title("#document");
        document9.setBaseUri("<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element16 = elements4.set(1, (org.jsoup.nodes.Element) document9);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(elementSpliterator5);
        org.junit.Assert.assertNotNull(document9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test057");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str2 = document1.tagName();
        org.jsoup.parser.Tag tag3 = document1.tag();
        java.lang.String str4 = document1.outerHtml();
        java.lang.String str5 = document1.outerHtml();
        java.lang.String str6 = document1.title();
        org.jsoup.nodes.Element element7 = document1.empty();
        org.jsoup.nodes.Element element9 = document1.html("org.jsoup.select.Selector$SelectorParseException: <#root>\n</#root>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements12 = document1.getElementsByAttributeValueEnding("", "[]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#root" + "'", str2, "#root");
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>" + "'", str4, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>" + "'", str5, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test058");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str2 = document1.tagName();
        org.jsoup.select.Elements elements4 = document1.getElementsByIndexGreaterThan((-1));
        java.lang.String str5 = document1.toString();
        org.jsoup.nodes.Element element7 = document1.text("#root=\"hi!\"");
        org.jsoup.nodes.Element element9 = document1.prepend("#document");
        org.jsoup.nodes.Element element10 = element9.empty();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#root" + "'", str2, "#root");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>" + "'", str5, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element10);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test059");
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
        // The following exception was thrown during execution in test generation
        try {
            element3.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "#root" + "'", str12, "#root");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>" + "'", str13, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNull(element16);
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertNotNull(element18);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test060");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element44 = element37.child((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 35, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
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
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test061");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str2 = document1.tagName();
        org.jsoup.nodes.Element element4 = document1.append("hi!");
        java.lang.String str5 = document1.outerHtml();
        org.jsoup.select.Elements elements6 = document1.children();
        org.jsoup.nodes.Document document9 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str10 = document9.tagName();
        org.jsoup.parser.Tag tag11 = document9.tag();
        org.jsoup.nodes.Element element13 = new org.jsoup.nodes.Element(tag11, "#root=\"\"");
        java.lang.String str14 = element13.toString();
        org.jsoup.nodes.Element element16 = element13.text("");
        org.jsoup.nodes.Element element18 = element13.removeClass("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.select.Elements elements20 = element13.getElementsByIndexGreaterThan(0);
        java.util.stream.Stream<org.jsoup.nodes.Element> elementStream21 = elements20.parallelStream();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = elements6.addAll((-1), (java.util.Collection<org.jsoup.nodes.Element>) elements20);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#root" + "'", str2, "#root");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!" + "'", str5, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(document9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#root" + "'", str10, "#root");
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<#root>\n</#root>" + "'", str14, "<#root>\n</#root>");
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(elements20);
        org.junit.Assert.assertNotNull(elementStream21);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test062");
        org.jsoup.nodes.Evaluator evaluator0 = null;
        org.jsoup.nodes.Document document2 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element4 = document2.prependElement("hi!");
        org.jsoup.nodes.Element element6 = element4.append("");
        org.jsoup.nodes.Element element7 = element6.previousElementSibling();
        org.jsoup.nodes.Element element9 = element6.toggleClass("<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>");
        org.jsoup.nodes.Node node10 = element6.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements11 = org.jsoup.select.Collector.collect(evaluator0, element6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test063");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str2 = document1.tagName();
        org.jsoup.nodes.Element element4 = document1.append("hi!");
        org.jsoup.nodes.Element element6 = document1.html("org.jsoup.select.Selector$SelectorParseException: hi!");
        boolean boolean7 = element6.isBlock();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#root" + "'", str2, "#root");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test064");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("aorg", "&lt;?#root=&quot;&amp;lt;html&amp;gt; &amp;lt;head&amp;gt; &amp;lt;/head&amp;gt; &amp;lt;body&amp;gt; &amp;lt;/body&amp;gt; &amp;lt;/html&amp;gt;&quot;&gt;");
        org.junit.Assert.assertNotNull(document2);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test065");
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parseBodyFragment("#root=\"\"", "<#root>\n</#root>");
        java.lang.String str3 = document2.nodeName();
        org.jsoup.select.Elements elements5 = document2.getElementsByIndexEquals(10);
        java.lang.String str6 = document2.toString();
        org.jsoup.nodes.Element element8 = document2.append("hi!");
        org.jsoup.nodes.Element element9 = document2.head();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements11 = document2.select("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>" + "'", str6, "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>");
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element9);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test066");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("#root", "#root");
        java.lang.String str4 = document2.absUrl("#root=\"\"");
        document2.title("#document");
        document2.setBaseUri("<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!");
        org.jsoup.nodes.Node node11 = document2.attr("hi", "<#root class=\"\">\n</#root>");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(node11);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test067");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("#root=\"hi!\"", "");
        org.junit.Assert.assertNotNull(document2);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test068");
        org.jsoup.safety.Whitelist whitelist2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.jsoup.Jsoup.clean("", "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!", whitelist2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test069");
        org.jsoup.safety.Whitelist whitelist2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.jsoup.Jsoup.clean(" text=\"hi!\"", "#document", whitelist2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test070");
        org.jsoup.nodes.Document document2 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element4 = document2.prependElement("hi!");
        org.jsoup.nodes.Element element6 = element4.append("");
        org.jsoup.select.Elements elements7 = org.jsoup.select.Selector.select("#root", element6);
        org.jsoup.nodes.Element element8 = elements7.last();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element10 = elements7.get(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNull(element8);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test071");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str2 = document1.tagName();
        org.jsoup.select.Elements elements4 = document1.getElementsByIndexGreaterThan((-1));
        boolean boolean5 = elements4.isEmpty();
        org.jsoup.select.Elements elements7 = elements4.append("\n<!--#root=\"\"-->");
        java.util.Iterator<org.jsoup.nodes.Element> elementItor8 = elements7.iterator();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#root" + "'", str2, "#root");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(elementItor8);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test072");
        org.jsoup.nodes.Document document2 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str3 = document2.id();
        org.jsoup.select.Elements elements4 = document2.children();
        org.jsoup.select.Elements elements6 = elements4.html("#root=\"\"");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements7 = org.jsoup.select.Selector.select("", (java.lang.Iterable<org.jsoup.nodes.Element>) elements4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(elements6);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test073");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Element> elementList18 = elements14.subList((int) 'o', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: toIndex = 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(elementItor5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "#document" + "'", str12, "#document");
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test074");
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
        java.util.Collection<org.jsoup.nodes.Element> elementCollection21 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = elements20.containsAll(elementCollection21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test075");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!", "#root=\"hi!\"");
        org.jsoup.nodes.Document document4 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element6 = document4.prependElement("hi!");
        org.jsoup.nodes.Element element8 = element6.append("");
        boolean boolean9 = attribute2.equals((java.lang.Object) "");
        attribute2.setValue(" #root=\"\"=\"\"");
        org.junit.Assert.assertNotNull(document4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test076");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str2 = document1.tagName();
        org.jsoup.nodes.Element element4 = document1.append("hi!");
        org.jsoup.nodes.Element element6 = document1.prependText("hi!");
        document1.setBaseUri("<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element10 = document1.child((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 52, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#root" + "'", str2, "#root");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test077");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element3 = document1.prependElement("hi!");
        org.jsoup.nodes.Element element4 = element3.parent();
        org.jsoup.nodes.Element element5 = element3.empty();
        org.jsoup.select.Elements elements7 = element5.getElementsByClass("hi!");
        org.jsoup.nodes.Document document10 = org.jsoup.Jsoup.parseBodyFragment("#root=\"\"", "<#root>\n</#root>");
        java.lang.String str11 = document10.nodeName();
        org.jsoup.select.Elements elements13 = document10.getElementsByIndexEquals(10);
        java.lang.String str14 = document10.toString();
        org.jsoup.nodes.Element element16 = document10.append("hi!");
        org.jsoup.nodes.Document document18 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element20 = document18.prependElement("hi!");
        org.jsoup.nodes.Element element21 = element20.parent();
        org.jsoup.nodes.Element element22 = element20.empty();
        org.jsoup.nodes.Element element23 = element22.empty();
        java.util.Set<java.lang.String> strSet24 = element23.classNames();
        org.jsoup.nodes.Element element25 = document10.classNames(strSet24);
        org.jsoup.nodes.Element element27 = document10.prependElement("<?<html>\n<head>\n</head>\n<body>\n</body>\n</html>>");
        org.jsoup.nodes.Element element28 = element5.prependChild((org.jsoup.nodes.Node) document10);
        document10.title("#root=\"\"=\"\"");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#document" + "'", str11, "#document");
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>" + "'", str14, "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>");
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(document18);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(strSet24);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertNotNull(element28);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test078");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parse(" text=\"hi!\"");
        org.junit.Assert.assertNotNull(document1);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test079");
        org.jsoup.nodes.Document document3 = org.jsoup.Jsoup.parseBodyFragment("#root=\"\"", "<#root>\n</#root>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements4 = org.jsoup.select.Selector.select("<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>", (org.jsoup.nodes.Element) document3);
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query <html>?<head>?</head>?<body>? #root=&quot;&quot;?</body>?</html>");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document3);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test080");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("#root", "#root");
        java.lang.String str3 = document2.nodeName();
        org.jsoup.nodes.Element element5 = document2.text("<html>\n <head>\n </head>\n <body>\n </body>\n</html>hi!\n<head>\n </head>\n <body>\n </body>\n\n");
        document2.title("org.jsoup.select.Selector$SelectorParseException: <html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(element5);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test081");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element3 = document1.prependElement("hi!");
        org.jsoup.nodes.Element element5 = element3.append("");
        org.jsoup.nodes.Element element7 = element3.prepend("<#root>\n</#root>");
        org.jsoup.select.Elements elements10 = element3.getElementsByAttributeValueStarting("#root=&quot;&quot;", "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>");
        org.jsoup.nodes.Node node13 = element3.attr("[., j, s, o, u, p, ., s, e, l, e, c, t, ., S, e, l, e, c, t, o, r, $, S, e, l, e, c, t, o, r, P, a, r, s, e, E, x, c, e, p, t, i, o, n, :,  , h, i, !, <, h, t, m, l, >, \n, <, h, e, a, d, >, \n, <, /, h, e, a, d, >, \n, <, b, o, d, y, >, \n, <, /, b, o, d, y, >, \n, <, /, h, t, m, l, >]", "<?<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!>");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(node13);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test082");
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
        boolean boolean22 = elements20.hasText();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Element> elementList25 = elements20.subList(0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: toIndex = 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
        org.junit.Assert.assertNotNull(elements20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test083");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("#data", "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!");
        org.jsoup.nodes.Element element3 = document2.body();
        java.lang.String str4 = element3.html();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#data" + "'", str4, "#data");
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test084");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element25 = element13.child((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 52, Size: 0");
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
        org.junit.Assert.assertNotNull(element23);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test085");
        org.jsoup.safety.Whitelist whitelist1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.jsoup.Jsoup.clean("org.jsoup.select.Selector$SelectorParseException: <html>\n<head>\n</head>\n<body>\n</body>\n</html>", whitelist1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test086");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str2 = document1.tagName();
        org.jsoup.parser.Tag tag3 = document1.tag();
        java.lang.String str4 = document1.outerHtml();
        java.lang.String str5 = document1.outerHtml();
        org.jsoup.nodes.Element element7 = document1.prepend("hi");
        org.jsoup.nodes.Element element8 = element7.empty();
        java.lang.String str9 = element7.toString();
        java.lang.String str10 = element7.nodeName();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#root" + "'", str2, "#root");
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>" + "'", str4, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>" + "'", str5, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#document" + "'", str10, "#document");
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test087");
        org.jsoup.nodes.Evaluator evaluator0 = null;
        org.jsoup.nodes.Document document3 = org.jsoup.Jsoup.parseBodyFragment("#root=\"\"", "<#root>\n</#root>");
        java.lang.String str4 = document3.nodeName();
        org.jsoup.select.Elements elements6 = document3.getElementsByIndexEquals(10);
        org.jsoup.nodes.Document document9 = org.jsoup.parser.Parser.parse("", "\n<!--#root=\"\"-->");
        boolean boolean10 = document3.equals((java.lang.Object) "\n<!--#root=\"\"-->");
        org.jsoup.nodes.Element element12 = document3.prepend("<html>\n <head>\n </head>\n <body>\n </body>\n</html>hi!\n\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n\n <head>\n </head>\n\n <body>\n </body>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements13 = org.jsoup.select.Collector.collect(evaluator0, element12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#document" + "'", str4, "#document");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(document9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(element12);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test088");
        org.jsoup.nodes.Document document3 = org.jsoup.parser.Parser.parse("#root", "");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements4 = org.jsoup.select.Selector.select("<html>\n<head>\n</head>\n<body>\n</body>\n</html>", (org.jsoup.nodes.Element) document3);
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query <html>?<head>?</head>?<body>?</body>?</html>");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document3);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test089");
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
        org.jsoup.nodes.Document document36 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element38 = document36.prependElement("hi!");
        org.jsoup.nodes.Element element40 = element38.append("");
        org.jsoup.select.Elements elements41 = org.jsoup.select.Selector.select("#root", element40);
        org.jsoup.nodes.Element element42 = elements41.last();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration46 = new org.jsoup.nodes.XmlDeclaration("<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!", "", false);
        java.lang.String str47 = xmlDeclaration46.nodeName();
        boolean boolean48 = elements41.remove((java.lang.Object) str47);
        java.util.List<org.jsoup.nodes.Element> elementList51 = elements41.subList((int) (byte) 0, (int) (byte) 0);
        boolean boolean52 = elements19.addAll((java.util.Collection<org.jsoup.nodes.Element>) elementList51);
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
        org.junit.Assert.assertNotNull(document36);
        org.junit.Assert.assertNotNull(element38);
        org.junit.Assert.assertNotNull(element40);
        org.junit.Assert.assertNotNull(elements41);
        org.junit.Assert.assertNull(element42);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "#declaration" + "'", str47, "#declaration");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(elementList51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test090");
        org.jsoup.safety.Whitelist whitelist1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.jsoup.Jsoup.clean("#root=\"\"=\"\"", whitelist1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test091");
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parseBodyFragment("", "#root");
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
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test092");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element3 = document1.prependElement("hi!");
        org.jsoup.nodes.Document document6 = org.jsoup.parser.Parser.parseBodyFragment("#root", "#root");
        org.jsoup.nodes.Element element8 = document6.addClass("<#root>\n</#root>");
        element3.replaceWith((org.jsoup.nodes.Node) document6);
        org.jsoup.nodes.Element element11 = element3.toggleClass("#root=\"hi!\"");
        org.jsoup.nodes.Element element13 = element11.toggleClass("hi");
        org.jsoup.select.Elements elements15 = element13.getElementsByIndexEquals(100);
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(elements15);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test093");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element3 = document1.prependElement("hi!");
        org.jsoup.nodes.Element element5 = element3.append("");
        org.jsoup.nodes.Element element7 = element3.prepend("<#root>\n</#root>");
        boolean boolean8 = element7.hasText();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test094");
        org.jsoup.safety.Whitelist whitelist2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.jsoup.Jsoup.clean("hi", "#root=\"\"", whitelist2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test095");
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
        org.jsoup.parser.TokenQueue tokenQueue17 = new org.jsoup.parser.TokenQueue("hi!");
        java.lang.String str18 = tokenQueue17.consumeCssIdentifier();
        java.lang.String str20 = tokenQueue17.consumeTo("");
        java.lang.String str22 = tokenQueue17.chompTo("#root=\"\"");
        java.lang.String str23 = tokenQueue17.remainder();
        boolean boolean24 = tokenQueue17.isEmpty();
        java.lang.String str25 = tokenQueue17.consumeAttributeKey();
        boolean boolean26 = elements4.contains((java.lang.Object) str25);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(elementItor5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "#document" + "'", str12, "#document");
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi" + "'", str18, "hi");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "!" + "'", str22, "!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test096");
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parseBodyFragment("#root=\"\"", "<#root>\n</#root>");
        java.lang.String str3 = document2.nodeName();
        org.jsoup.select.Elements elements5 = document2.getElementsByIndexEquals(10);
        org.jsoup.nodes.Element element7 = document2.append("<!<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!>");
        java.lang.String str8 = element7.data();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test097");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.select.Elements elements3 = document1.getElementsByTag("#root");
        java.lang.String str4 = elements3.text();
        org.jsoup.select.Elements elements7 = elements3.attr("#root", "#root");
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("#root");
        boolean boolean10 = document9.hasText();
        org.jsoup.select.Elements elements12 = document9.getElementsByIndexEquals(10);
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor13 = elements12.listIterator();
        org.jsoup.select.Elements elements16 = elements12.attr("<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "hi!");
        org.jsoup.nodes.Document document18 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element20 = document18.prependElement("hi!");
        org.jsoup.nodes.Element element21 = element20.parent();
        int int22 = elements12.indexOf((java.lang.Object) element21);
        boolean boolean23 = elements7.retainAll((java.util.Collection<org.jsoup.nodes.Element>) elements12);
        boolean boolean24 = elements7.hasText();
        org.jsoup.select.Elements elements25 = new org.jsoup.select.Elements((java.util.List<org.jsoup.nodes.Element>) elements7);
        org.jsoup.nodes.Document document27 = new org.jsoup.nodes.Document("#root");
        boolean boolean28 = document27.hasText();
        org.jsoup.select.Elements elements30 = document27.getElementsByIndexEquals(10);
        org.jsoup.nodes.Document document32 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str33 = document32.tagName();
        org.jsoup.parser.Tag tag34 = document32.tag();
        org.jsoup.nodes.TextNode textNode37 = new org.jsoup.nodes.TextNode("hi!", "");
        org.jsoup.nodes.Node node38 = textNode37.parent();
        org.jsoup.nodes.Element element39 = document32.appendChild((org.jsoup.nodes.Node) textNode37);
        org.jsoup.select.Elements elements41 = element39.getElementsByClass("#root");
        org.jsoup.nodes.Element element42 = document27.prependChild((org.jsoup.nodes.Node) element39);
        org.jsoup.select.Elements elements45 = element39.getElementsByAttributeValueNot("#text", "#document");
        org.jsoup.nodes.Element element47 = element39.appendElement("<?<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!>");
        org.jsoup.nodes.Element element49 = element39.html("hi");
        boolean boolean50 = elements7.remove((java.lang.Object) element49);
        boolean boolean52 = elements7.hasAttr("aorg");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(elementItor13);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertNotNull(document18);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(elements30);
        org.junit.Assert.assertNotNull(document32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "#root" + "'", str33, "#root");
        org.junit.Assert.assertNotNull(tag34);
        org.junit.Assert.assertNull(node38);
        org.junit.Assert.assertNotNull(element39);
        org.junit.Assert.assertNotNull(elements41);
        org.junit.Assert.assertNotNull(element42);
        org.junit.Assert.assertNotNull(elements45);
        org.junit.Assert.assertNotNull(element47);
        org.junit.Assert.assertNotNull(element49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test098");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str2 = document1.tagName();
        java.lang.String str3 = document1.html();
        org.jsoup.nodes.Element element5 = document1.append("hi!");
        org.jsoup.nodes.Element element7 = document1.html("ohi!");
        // The following exception was thrown during execution in test generation
        try {
            document1.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
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
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test099");
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
        org.jsoup.select.Elements elements23 = elements9.select("#root");
        org.jsoup.nodes.Document document25 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element27 = document25.prependElement("hi!");
        org.jsoup.nodes.Document document30 = org.jsoup.parser.Parser.parseBodyFragment("#root", "#root");
        org.jsoup.nodes.Element element32 = document30.addClass("<#root>\n</#root>");
        element27.replaceWith((org.jsoup.nodes.Node) document30);
        org.jsoup.nodes.Element element35 = element27.toggleClass("#root=\"hi!\"");
        org.jsoup.nodes.Element element37 = element35.toggleClass("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        boolean boolean38 = elements23.add(element37);
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
        org.junit.Assert.assertNotNull(elements23);
        org.junit.Assert.assertNotNull(document25);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertNotNull(document30);
        org.junit.Assert.assertNotNull(element32);
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertNotNull(element37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test100");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("#root", "#root");
        org.jsoup.nodes.Element element4 = document2.addClass("<#root>\n</#root>");
        org.jsoup.select.Elements elements5 = element4.children();
        org.jsoup.select.Elements elements8 = element4.getElementsByAttributeValueNot("#root", "<html>\n <head>\n </head>\n <body>\n </body>\n</html>hi!\n\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n\n <head>\n </head>\n\n <body>\n </body>");
        org.jsoup.nodes.Document document10 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element12 = document10.prependElement("hi!");
        java.lang.String str13 = element12.nodeName();
        boolean boolean14 = elements8.add(element12);
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test101");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str2 = document1.tagName();
        org.jsoup.select.Elements elements4 = document1.getElementsByIndexGreaterThan((-1));
        java.lang.String str5 = document1.toString();
        org.jsoup.nodes.Element element7 = document1.text("#root=\"hi!\"");
        org.jsoup.nodes.Element element9 = document1.prepend("#document");
        org.jsoup.nodes.Element element11 = document1.getElementById("hi");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#root" + "'", str2, "#root");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>" + "'", str5, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNull(element11);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test102");
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
        org.jsoup.nodes.Document document53 = new org.jsoup.nodes.Document("#root");
        boolean boolean54 = document53.hasText();
        org.jsoup.select.Elements elements56 = document53.getElementsByIndexEquals(10);
        java.lang.Object[] objArray57 = elements56.toArray();
        org.jsoup.select.Elements elements59 = elements56.select("#root");
        org.jsoup.nodes.Document document61 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.select.Elements elements63 = document61.getElementsByTag("#root");
        boolean boolean64 = elements59.remove((java.lang.Object) document61);
        org.jsoup.select.Elements elements66 = elements59.val("<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!");
        org.jsoup.select.Elements elements68 = elements59.append("org.jsoup.select.Selector$SelectorParseException: hi!<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean69 = elements47.retainAll((java.util.Collection<org.jsoup.nodes.Element>) elements68);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
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
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(elements56);
        org.junit.Assert.assertNotNull(objArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray57), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray57), "[]");
        org.junit.Assert.assertNotNull(elements59);
        org.junit.Assert.assertNotNull(document61);
        org.junit.Assert.assertNotNull(elements63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(elements66);
        org.junit.Assert.assertNotNull(elements68);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test103");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("#data", "#root");
        document2.title("#comment");
        org.junit.Assert.assertNotNull(document2);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test104");
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parse("#declaration", "<?<html>\n<head>\n</head>\n<body>\n</body>\n</html>>");
        org.junit.Assert.assertNotNull(document2);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test105");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str2 = document1.tagName();
        org.jsoup.nodes.Element element4 = document1.append("hi!");
        org.jsoup.nodes.Element element6 = document1.html("org.jsoup.select.Selector$SelectorParseException: hi!");
        org.jsoup.nodes.Element element8 = document1.prependText("<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>");
        org.jsoup.nodes.Element element10 = document1.createElement("aorg");
        java.lang.String str11 = element10.toString();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#root" + "'", str2, "#root");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<aorg>\n</aorg>" + "'", str11, "<aorg>\n</aorg>");
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test106");
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
        org.jsoup.nodes.Element element41 = element39.child((int) (byte) 1);
        org.jsoup.nodes.Element element43 = element41.toggleClass("<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!");
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
        org.junit.Assert.assertNotNull(element41);
        org.junit.Assert.assertNotNull(element43);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test107");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element3 = document1.prependElement("hi!");
        org.jsoup.nodes.Element element4 = element3.parent();
        org.jsoup.nodes.Element element5 = element3.empty();
        org.jsoup.select.Elements elements7 = element5.getElementsByClass("hi!");
        org.jsoup.nodes.Element element9 = element5.prepend("<?<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!>");
        java.lang.String str10 = element9.nodeName();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test108");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str2 = document1.tagName();
        org.jsoup.nodes.Element element4 = document1.append("hi!");
        java.lang.String str5 = document1.outerHtml();
        org.jsoup.select.Elements elements6 = document1.children();
        org.jsoup.nodes.Document document8 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.select.Elements elements10 = document8.getElementsByTag("#root");
        boolean boolean11 = document1.equals((java.lang.Object) document8);
        org.jsoup.nodes.Element element13 = document8.appendText("#root");
        java.lang.String str14 = element13.baseUri();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#root" + "'", str2, "#root");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!" + "'", str5, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test109");
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
        org.jsoup.select.Elements elements20 = elements6.html("#declaration");
        java.util.stream.Stream<org.jsoup.nodes.Element> elementStream21 = elements6.parallelStream();
        org.jsoup.select.Elements elements23 = elements6.append("&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;hi!");
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
        org.junit.Assert.assertNotNull(elementStream21);
        org.junit.Assert.assertNotNull(elements23);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test110");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str2 = document1.tagName();
        org.jsoup.nodes.Element element4 = document1.append("hi!");
        org.jsoup.nodes.Element element6 = document1.prependText("hi!");
        org.jsoup.nodes.Element element8 = document1.createElement("#root=\"hi!\"");
        org.jsoup.nodes.Element element10 = document1.wrap("<?#root=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;\">");
        org.jsoup.parser.Tag tag12 = org.jsoup.parser.Tag.valueOf("ohi!");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = element10.equals((java.lang.Object) "ohi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#root" + "'", str2, "#root");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNull(element10);
        org.junit.Assert.assertNotNull(tag12);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test111");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str2 = document1.tagName();
        org.jsoup.nodes.Element element4 = document1.append("hi!");
        java.lang.String str6 = document1.absUrl("hi!");
        org.jsoup.select.Elements elements7 = document1.getAllElements();
        org.jsoup.select.Elements elements9 = elements7.removeClass("<html>\n <head>\n </head>\n <body>\n </body>\n</html>hi!\n<head>\n </head>\n <body>\n </body>\n\n");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#root" + "'", str2, "#root");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(elements9);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test112");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element3 = document1.prependElement("hi!");
        org.jsoup.nodes.Element element5 = element3.append("");
        org.jsoup.nodes.Element element7 = element3.prepend("<#root>\n</#root>");
        org.jsoup.select.Elements elements10 = element3.getElementsByAttributeValueStarting("#root=&quot;&quot;", "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>");
        org.jsoup.select.Elements elements12 = elements10.eq((int) '4');
        java.util.Spliterator<org.jsoup.nodes.Element> elementSpliterator13 = elements12.spliterator();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(elementSpliterator13);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test113");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parse("ohi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueContaining("org.jsoup.select.Selector$SelectorParseException: org.jsoup.select.Selector$SelectorParseException: <html>\n<head>\n</head>\n<body>\n</body>\n</html>", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test114");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str2 = document1.tagName();
        org.jsoup.nodes.Element element4 = document1.append("hi!");
        java.lang.String str5 = document1.outerHtml();
        org.jsoup.select.Elements elements6 = document1.children();
        org.jsoup.nodes.Document document8 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.select.Elements elements10 = document8.getElementsByTag("#root");
        boolean boolean11 = document1.equals((java.lang.Object) document8);
        org.jsoup.nodes.Element element13 = document8.createElement("\n<!--#root=\"\"-->");
        org.jsoup.nodes.Document document14 = document8.normalise();
        java.lang.String str15 = document14.data();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#root" + "'", str2, "#root");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!" + "'", str5, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(document14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test115");
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
        org.jsoup.select.Elements elements34 = document32.getElementsByTag("#root");
        org.jsoup.select.Elements elements36 = elements34.append("<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!");
        org.jsoup.nodes.Document document38 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element40 = document38.prependElement("hi!");
        org.jsoup.nodes.Element element42 = element40.append("");
        org.jsoup.nodes.Document document44 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str45 = document44.tagName();
        org.jsoup.nodes.Element element47 = document44.append("hi!");
        org.jsoup.nodes.Document document49 = new org.jsoup.nodes.Document("#root");
        org.jsoup.nodes.Document document51 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.select.Elements elements53 = document51.getElementsByTag("#root");
        org.jsoup.nodes.Element[] elementArray54 = new org.jsoup.nodes.Element[] { element40, element47, document49, document51 };
        org.jsoup.select.Elements elements55 = new org.jsoup.select.Elements(elementArray54);
        java.util.stream.Stream<org.jsoup.nodes.Element> elementStream56 = elements55.parallelStream();
        boolean boolean57 = elements36.remove((java.lang.Object) elementStream56);
        int int58 = elements6.indexOf((java.lang.Object) elements36);
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
        org.junit.Assert.assertNotNull(elements34);
        org.junit.Assert.assertNotNull(elements36);
        org.junit.Assert.assertNotNull(document38);
        org.junit.Assert.assertNotNull(element40);
        org.junit.Assert.assertNotNull(element42);
        org.junit.Assert.assertNotNull(document44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "#root" + "'", str45, "#root");
        org.junit.Assert.assertNotNull(element47);
        org.junit.Assert.assertNotNull(document51);
        org.junit.Assert.assertNotNull(elements53);
        org.junit.Assert.assertNotNull(elementArray54);
        org.junit.Assert.assertNotNull(elementStream56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test116");
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parseBodyFragment("#root=\"\"", "<#root>\n</#root>");
        java.lang.String str3 = document2.nodeName();
        org.jsoup.nodes.Element element4 = document2.empty();
        boolean boolean6 = document2.hasClass("");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test117");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str2 = document1.tagName();
        java.lang.String str3 = document1.html();
        org.jsoup.nodes.Element element5 = document1.append("hi!");
        // The following exception was thrown during execution in test generation
        try {
            element5.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#root" + "'", str2, "#root");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>" + "'", str3, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.junit.Assert.assertNotNull(element5);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test118");
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parseBodyFragment("#root=\"\"", "<#root>\n</#root>");
        java.lang.String str3 = document2.nodeName();
        org.jsoup.select.Elements elements5 = document2.getElementsByIndexEquals(10);
        org.jsoup.nodes.Document document8 = org.jsoup.parser.Parser.parse("", "\n<!--#root=\"\"-->");
        boolean boolean9 = document2.equals((java.lang.Object) "\n<!--#root=\"\"-->");
        boolean boolean10 = document2.hasText();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test119");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str2 = document1.tagName();
        org.jsoup.nodes.Element element4 = document1.append("hi!");
        java.lang.String str6 = document1.absUrl("hi!");
        org.jsoup.nodes.Element element8 = document1.prepend("[]");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#root" + "'", str2, "#root");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element8);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test120");
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
        org.jsoup.nodes.Element element34 = document25.append("");
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
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test121");
        org.jsoup.safety.Whitelist whitelist2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.jsoup.Jsoup.clean("[., j, s, o, u, p, ., s, e, l, e, c, t, ., S, e, l, e, c, t, o, r, $, S, e, l, e, c, t, o, r, P, a, r, s, e, E, x, c, e, p, t, i, o, n, :,  , h, i, !, <, h, t, m, l, >, \n, <, h, e, a, d, >, \n, <, /, h, e, a, d, >, \n, <, b, o, d, y, >, \n, <, /, b, o, d, y, >, \n, <, /, h, t, m, l, >]", "\n&lt;!--#root=&quot;&quot;--&gt;", whitelist2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test122");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements19 = elements4.wrap("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
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
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test123");
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parse("<?<html>\n<head>\n</head>\n<body>\n</body>\n</html>>", " text=\"hi!\"");
        org.junit.Assert.assertNotNull(document2);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test124");
        org.jsoup.nodes.Document document2 = new org.jsoup.nodes.Document("#root");
        boolean boolean3 = document2.hasText();
        org.jsoup.select.Elements elements5 = document2.getElementsByIndexEquals(10);
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor6 = elements5.listIterator();
        org.jsoup.select.Elements elements9 = elements5.attr("<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "hi!");
        org.jsoup.nodes.Document document11 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element13 = document11.prependElement("hi!");
        org.jsoup.nodes.Element element14 = element13.parent();
        int int15 = elements5.indexOf((java.lang.Object) element14);
        org.jsoup.select.Elements elements16 = org.jsoup.select.Selector.select("<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!", (java.lang.Iterable<org.jsoup.nodes.Element>) elements5);
        org.jsoup.nodes.Document document19 = org.jsoup.Jsoup.parseBodyFragment("#root=\"\"", "<#root>\n</#root>");
        java.lang.String str20 = document19.toString();
        java.lang.String str21 = document19.nodeName();
        java.lang.String str22 = document19.outerHtml();
        boolean boolean23 = elements16.add((org.jsoup.nodes.Element) document19);
        java.lang.String str24 = document19.outerHtml();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elementItor6);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertNotNull(document19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>" + "'", str20, "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "#document" + "'", str21, "#document");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>" + "'", str22, "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>" + "'", str24, "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>");
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test125");
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parse("#root=\"\"=\"\"", "#data");
        org.jsoup.nodes.Element element4 = document2.createElement("#root=\"hi!\"");
        org.jsoup.select.Elements elements7 = document2.getElementsByAttributeValueNot("ohi!", "#comment");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements7);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test126");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("#root", "");
        org.jsoup.select.Elements elements4 = document2.getElementsByClass("<html>\n<head>\n</head>\n<body>\n #root\n</body>\n</html>");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = document2.childNodes();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(nodeList5);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test127");
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parseBodyFragment("ohi", "#comment");
        org.junit.Assert.assertNotNull(document2);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test128");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("org.jsoup.select.Selector$SelectorParseException: hi!<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.lang.String str2 = document1.toString();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "<html>\n<head>\n</head>\n<body>\n org.jsoup.select.Selector$SelectorParseException: hi!\n <html> \n  <head> \n  </head> \n  <body>  \n  </body>\n </html>\n</body>\n</html>" + "'", str2, "<html>\n<head>\n</head>\n<body>\n org.jsoup.select.Selector$SelectorParseException: hi!\n <html> \n  <head> \n  </head> \n  <body>  \n  </body>\n </html>\n</body>\n</html>");
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test129");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parse("[]");
        org.junit.Assert.assertNotNull(document1);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test130");
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parseBodyFragment("[]", "[., j, s, o, u, p, ., s, e, l, e, c, t, ., S, e, l, e, c, t, o, r, $, S, e, l, e, c, t, o, r, P, a, r, s, e, E, x, c, e, p, t, i, o, n, :,  , h, i, !, <, h, t, m, l, >, \n, <, h, e, a, d, >, \n, <, /, h, e, a, d, >, \n, <, b, o, d, y, >, \n, <, /, b, o, d, y, >, \n, <, /, h, t, m, l, >]");
        boolean boolean3 = document2.hasText();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test131");
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
        org.jsoup.select.Elements elements23 = elements9.select("#root");
        org.jsoup.select.Elements elements25 = elements9.removeClass("#root=\"hi!\"");
        java.util.stream.Stream<org.jsoup.nodes.Element> elementStream26 = elements9.parallelStream();
        org.jsoup.select.Elements elements28 = elements9.removeClass("org.jsoup.select.Selector$SelectorParseException: <html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Document document31 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str32 = document31.tagName();
        java.lang.String str33 = document31.html();
        org.jsoup.nodes.Element element35 = document31.append("hi!");
        // The following exception was thrown during execution in test generation
        try {
            elements9.add((int) (byte) 10, element35);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
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
        org.junit.Assert.assertNotNull(elements23);
        org.junit.Assert.assertNotNull(elements25);
        org.junit.Assert.assertNotNull(elementStream26);
        org.junit.Assert.assertNotNull(elements28);
        org.junit.Assert.assertNotNull(document31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "#root" + "'", str32, "#root");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>" + "'", str33, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.junit.Assert.assertNotNull(element35);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test132");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>");
        org.jsoup.nodes.Element element2 = document1.body();
        org.jsoup.nodes.Attributes attributes3 = document1.attributes();
        // The following exception was thrown during execution in test generation
        try {
            document1.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(attributes3);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test133");
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parse("&lt;html&gt;\n &lt;head&gt;\n &lt;/head&gt;\n &lt;body&gt;\n &lt;/body&gt;\n&lt;/html&gt;hi!\n\n&lt;html&gt;\n &lt;head&gt;\n &lt;/head&gt;\n &lt;body&gt;\n &lt;/body&gt;\n&lt;/html&gt;\n\n &lt;head&gt;\n &lt;/head&gt;\n\n &lt;body&gt;\n &lt;/body&gt;", "org.jsoup.select.Selector$SelectorParseException: <#root>\n</#root>");
        org.junit.Assert.assertNotNull(document2);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test134");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str2 = document1.tagName();
        org.jsoup.select.Elements elements4 = document1.getElementsByIndexGreaterThan((-1));
        boolean boolean5 = elements4.isEmpty();
        org.jsoup.select.Elements elements7 = elements4.append("\n<!--#root=\"\"-->");
        java.lang.String str9 = elements4.attr("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        boolean boolean10 = elements4.isEmpty();
        org.jsoup.select.Elements elements12 = elements4.append("org.jsoup.select.Selector$SelectorParseException: org.jsoup.select.Selector$SelectorParseException: <html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#root" + "'", str2, "#root");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(elements12);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test135");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element3 = document1.prependElement("hi!");
        org.jsoup.nodes.Element element5 = element3.append("");
        org.jsoup.nodes.Element element6 = element5.previousElementSibling();
        org.jsoup.nodes.Element element8 = element5.toggleClass("<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>");
        org.jsoup.select.Elements elements11 = element5.getElementsByAttributeValueEnding("org.jsoup.select.Selector$SelectorParseException: hi!", "#root=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;\"");
        org.jsoup.nodes.Element element12 = elements11.first();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNull(element12);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test136");
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
        org.jsoup.select.Elements elements25 = elements22.append("<html>\n <head>\n </head>\n <body>\n </body>\n</html>hi!\n<head>\n </head>\n <body>\n </body>\n\n");
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
        org.junit.Assert.assertNotNull(elements25);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test137");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>");
        org.jsoup.nodes.Element element2 = document1.body();
        org.jsoup.nodes.Attributes attributes3 = document1.attributes();
        java.lang.String str4 = document1.nodeName();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#document" + "'", str4, "#document");
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test138");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("<html>\n<head>\n</head>\n<body>\n org.jsoup.select.Selector$SelectorParseException: hi!\n <html> \n  <head> \n  </head> \n  <body>  \n  </body>\n </html>\n</body>\n</html>", "");
        org.junit.Assert.assertNotNull(document2);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test139");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("#root", "#root");
        org.jsoup.nodes.Element element4 = document2.addClass("<#root>\n</#root>");
        org.jsoup.nodes.Element element6 = document2.append("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.lang.String str7 = element6.nodeName();
        // The following exception was thrown during execution in test generation
        try {
            element6.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#document" + "'", str7, "#document");
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test140");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("#root", "#root");
        org.jsoup.nodes.Element element4 = document2.addClass("<#root>\n</#root>");
        org.jsoup.select.Elements elements6 = element4.getElementsByAttribute("\n<!--#root=\"\"-->");
        org.jsoup.nodes.Document document8 = new org.jsoup.nodes.Document("#root");
        boolean boolean9 = document8.hasText();
        org.jsoup.nodes.Element element11 = document8.createElement("hi!");
        org.jsoup.select.Elements elements13 = element11.getElementsByIndexEquals((int) (byte) 0);
        org.jsoup.select.Elements elements15 = elements13.removeClass("#root=\"\"");
        org.jsoup.nodes.Attributes attributes16 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor17 = attributes16.iterator();
        boolean boolean19 = attributes16.hasKey("");
        boolean boolean20 = elements13.remove((java.lang.Object) boolean19);
        boolean boolean22 = elements13.hasClass("<html>\n <head>\n </head>\n <body>\n </body>\n</html>hi!\n\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n\n <head>\n </head>\n\n <body>\n </body>");
        boolean boolean23 = elements6.containsAll((java.util.Collection<org.jsoup.nodes.Element>) elements13);
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(attributeItor17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test141");
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
        java.lang.String str17 = elements4.text();
        org.jsoup.nodes.Document document20 = org.jsoup.parser.Parser.parseBodyFragment("#root", "#root");
        org.jsoup.nodes.Element element22 = document20.addClass("<#root>\n</#root>");
        org.jsoup.nodes.Element element24 = document20.append("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element27 = element24.attr("&lt;html&gt;\n &lt;head&gt;\n &lt;/head&gt;\n &lt;body&gt;\n &lt;/body&gt;\n&lt;/html&gt;hi!\n\n&lt;html&gt;\n &lt;head&gt;\n &lt;/head&gt;\n &lt;body&gt;\n &lt;/body&gt;\n&lt;/html&gt;\n\n &lt;head&gt;\n &lt;/head&gt;\n\n &lt;body&gt;\n &lt;/body&gt;", "#comment");
        int int28 = elements4.indexOf((java.lang.Object) "#comment");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(elementItor5);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(document20);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test142");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element3 = document1.prependElement("hi!");
        org.jsoup.nodes.Element element5 = element3.append("");
        org.jsoup.nodes.Element element7 = element3.prepend("<#root>\n</#root>");
        org.jsoup.select.Elements elements10 = element3.getElementsByAttributeValueStarting("#root=&quot;&quot;", "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>");
        java.lang.String str11 = elements10.html();
        org.jsoup.select.Elements elements13 = elements10.select("\n<!--#root=\"\"-->");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(elements13);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test143");
        org.jsoup.nodes.Document document2 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element4 = document2.prependElement("hi!");
        org.jsoup.nodes.Element element6 = element4.append("");
        org.jsoup.select.Elements elements7 = org.jsoup.select.Selector.select("#root", element6);
        java.lang.String str8 = elements7.text();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements10 = elements7.wrap("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test144");
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
        boolean boolean23 = elements18.hasClass("\n<!--#root=\"\"-->");
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
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test145");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str2 = document1.tagName();
        org.jsoup.select.Elements elements4 = document1.getElementsByIndexGreaterThan((-1));
        boolean boolean5 = elements4.isEmpty();
        org.jsoup.nodes.Document document7 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.select.Elements elements9 = document7.getElementsByTag("#root");
        java.lang.String str10 = elements9.text();
        org.jsoup.nodes.Document document12 = new org.jsoup.nodes.Document("#root");
        boolean boolean13 = document12.hasText();
        org.jsoup.select.Elements elements15 = document12.getElementsByIndexEquals(10);
        java.lang.Object[] objArray16 = elements15.toArray();
        boolean boolean17 = elements9.retainAll((java.util.Collection<org.jsoup.nodes.Element>) elements15);
        java.lang.String str18 = elements15.text();
        org.jsoup.nodes.Document document20 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str21 = document20.tagName();
        org.jsoup.select.Elements elements23 = document20.getElementsByIndexGreaterThan((-1));
        java.lang.String str24 = document20.toString();
        org.jsoup.nodes.Element element26 = document20.text("#root=\"hi!\"");
        int int27 = elements15.lastIndexOf((java.lang.Object) "#root=\"hi!\"");
        org.jsoup.select.Elements elements29 = elements15.select("#root");
        org.jsoup.select.Elements elements31 = elements15.removeClass("#root=\"hi!\"");
        boolean boolean32 = elements4.retainAll((java.util.Collection<org.jsoup.nodes.Element>) elements31);
        org.jsoup.nodes.Document document34 = new org.jsoup.nodes.Document("#root");
        boolean boolean35 = document34.hasText();
        org.jsoup.select.Elements elements37 = document34.getElementsByIndexEquals(10);
        java.lang.Object[] objArray38 = elements37.toArray();
        org.jsoup.nodes.Document document40 = new org.jsoup.nodes.Document("#root");
        boolean boolean41 = document40.hasText();
        org.jsoup.nodes.Element element43 = document40.createElement("hi!");
        boolean boolean44 = elements37.add((org.jsoup.nodes.Element) document40);
        boolean boolean45 = elements31.add((org.jsoup.nodes.Element) document40);
        org.jsoup.nodes.Document document47 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str48 = document47.tagName();
        org.jsoup.nodes.Element element50 = document47.append("hi!");
        org.jsoup.nodes.Element element52 = document47.html("org.jsoup.select.Selector$SelectorParseException: hi!");
        org.jsoup.nodes.Element element54 = document47.prependText("<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>");
        org.jsoup.nodes.Element element56 = document47.createElement("aorg");
        boolean boolean57 = elements31.contains((java.lang.Object) "aorg");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#root" + "'", str2, "#root");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(document20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "#root" + "'", str21, "#root");
        org.junit.Assert.assertNotNull(elements23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>" + "'", str24, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(elements29);
        org.junit.Assert.assertNotNull(elements31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(elements37);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray38), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray38), "[]");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(element43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(document47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "#root" + "'", str48, "#root");
        org.junit.Assert.assertNotNull(element50);
        org.junit.Assert.assertNotNull(element52);
        org.junit.Assert.assertNotNull(element54);
        org.junit.Assert.assertNotNull(element56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test146");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("#data", "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!");
        org.jsoup.nodes.Element element3 = document2.body();
        org.jsoup.nodes.Element element4 = element3.firstElementSibling();
        org.jsoup.nodes.Element element6 = element3.html("&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;hi!");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test147");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str2 = document1.tagName();
        org.jsoup.nodes.Element element4 = document1.append("hi!");
        org.jsoup.nodes.Element element6 = document1.prependText("hi!");
        org.jsoup.select.Elements elements9 = document1.getElementsByAttributeValue("#root=\"\"", "#root=\"hi!\"");
        boolean boolean10 = document1.isBlock();
        org.jsoup.select.Elements elements12 = document1.getElementsByIndexEquals((-1));
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#root" + "'", str2, "#root");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(elements12);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test148");
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parseBodyFragment("#root", "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>");
        org.jsoup.nodes.Element element4 = document2.toggleClass("org.jsoup.select.Selector$SelectorParseException: <html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element6 = document2.child(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test149");
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parseBodyFragment("#root=\"\"", "<#root>\n</#root>");
        java.lang.String str3 = document2.toString();
        java.lang.String str4 = document2.nodeName();
        document2.title("<#root>\n</#root>=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;\"");
        org.jsoup.nodes.Element element7 = document2.empty();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>" + "'", str3, "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#document" + "'", str4, "#document");
        org.junit.Assert.assertNotNull(element7);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test150");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element3 = document1.prependElement("hi!");
        org.jsoup.nodes.Element element4 = element3.parent();
        org.jsoup.parser.Tag tag5 = element3.tag();
        org.jsoup.nodes.Element element7 = element3.wrap("ohi!");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNull(element7);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test151");
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parseBodyFragment("#root=\"\"", "<#root>\n</#root>");
        org.jsoup.nodes.Element element3 = document2.head();
        java.lang.String str4 = document2.toString();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>" + "'", str4, "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>");
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test152");
        org.jsoup.safety.Whitelist whitelist1 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.jsoup.Jsoup.isValid("&lt;html&gt;\n &lt;head&gt;\n &lt;/head&gt;\n &lt;body&gt;\n &lt;/body&gt;\n&lt;/html&gt;hi!\n\n&lt;html&gt;\n &lt;head&gt;\n &lt;/head&gt;\n &lt;body&gt;\n &lt;/body&gt;\n&lt;/html&gt;\n\n &lt;head&gt;\n &lt;/head&gt;\n\n &lt;body&gt;\n &lt;/body&gt;", whitelist1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test153");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str2 = document1.tagName();
        org.jsoup.parser.Tag tag3 = document1.tag();
        org.jsoup.nodes.TextNode textNode6 = new org.jsoup.nodes.TextNode("hi!", "");
        org.jsoup.nodes.Node node7 = textNode6.parent();
        org.jsoup.nodes.Element element8 = document1.appendChild((org.jsoup.nodes.Node) textNode6);
        org.jsoup.select.Elements elements10 = element8.getElementsByClass("#root");
        java.lang.String str11 = elements10.html();
        org.jsoup.nodes.Document document14 = org.jsoup.parser.Parser.parseBodyFragment("#root", "#root");
        java.lang.String str16 = document14.absUrl("#root=\"\"");
        document14.title("#document");
        document14.setBaseUri("<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!");
        java.lang.String str21 = document14.title();
        boolean boolean22 = elements10.equals((java.lang.Object) str21);
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#root" + "'", str2, "#root");
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(document14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "#document" + "'", str21, "#document");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test154");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parse("#root=\"\"");
        org.junit.Assert.assertNotNull(document1);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test155");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("", "<html>\n<head>\n</head>\n<body>\n #root\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document2);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test156");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("#root");
        boolean boolean2 = document1.hasText();
        org.jsoup.select.Elements elements4 = document1.getElementsByIndexEquals(10);
        java.lang.Object[] objArray5 = elements4.toArray();
        org.jsoup.nodes.Document document8 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element10 = document8.prependElement("hi!");
        org.jsoup.nodes.Element element11 = element10.parent();
        org.jsoup.nodes.Element element12 = element10.empty();
        elements4.add(0, element12);
        org.jsoup.select.Elements elements15 = elements4.html("&lt;?#root=&quot;&amp;lt;html&amp;gt; &amp;lt;head&amp;gt; &amp;lt;/head&amp;gt; &amp;lt;body&amp;gt; &amp;lt;/body&amp;gt; &amp;lt;/html&amp;gt;&quot;&gt;");
        java.util.List<org.jsoup.nodes.Element> elementList18 = elements15.subList(0, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(elementList18);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test157");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str2 = document1.tagName();
        java.lang.String str3 = document1.html();
        org.jsoup.nodes.Element element5 = document1.append("hi!");
        org.jsoup.select.Elements elements7 = element5.getElementsByIndexLessThan((int) (short) -1);
        java.lang.String str9 = elements7.attr("");
        org.jsoup.nodes.Document document11 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element13 = document11.prependElement("hi!");
        org.jsoup.nodes.Document document16 = org.jsoup.parser.Parser.parseBodyFragment("#root", "#root");
        org.jsoup.nodes.Element element18 = document16.addClass("<#root>\n</#root>");
        element13.replaceWith((org.jsoup.nodes.Node) document16);
        org.jsoup.nodes.Element element20 = document16.parent();
        boolean boolean21 = elements7.add((org.jsoup.nodes.Element) document16);
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#root" + "'", str2, "#root");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>" + "'", str3, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(document16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test158");
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
        boolean boolean24 = tag23.isEmpty();
        org.jsoup.nodes.TextNode textNode28 = new org.jsoup.nodes.TextNode("hi!", "");
        java.lang.String str29 = textNode28.text();
        org.jsoup.nodes.Attributes attributes30 = textNode28.attributes();
        org.jsoup.nodes.Element element31 = new org.jsoup.nodes.Element(tag23, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!", attributes30);
        java.lang.String str32 = attributes30.toString();
        java.util.List<org.jsoup.nodes.Attribute> attributeList33 = attributes30.asList();
        boolean boolean34 = elements19.remove((java.lang.Object) attributeList33);
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
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertNotNull(attributes30);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + " text=\"hi!\"" + "'", str32, " text=\"hi!\"");
        org.junit.Assert.assertNotNull(attributeList33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test159");
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
        java.util.List<org.jsoup.nodes.Node> nodeList40 = element22.siblingNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element42 = element22.child((int) 'h');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 104, Size: 2");
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
        org.junit.Assert.assertNotNull(nodeList40);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test160");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str2 = document1.tagName();
        org.jsoup.nodes.Element element4 = document1.append("hi!");
        java.lang.String str5 = element4.outerHtml();
        boolean boolean7 = element4.equals((java.lang.Object) 1.0f);
        java.lang.String str8 = element4.nodeName();
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
        org.jsoup.nodes.Element element32 = element22.html("hi");
        // The following exception was thrown during execution in test generation
        try {
            element4.replaceWith((org.jsoup.nodes.Node) element22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#root" + "'", str2, "#root");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!" + "'", str5, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#document" + "'", str8, "#document");
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
        org.junit.Assert.assertNotNull(element32);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test161");
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parseBodyFragment("#root=\"\"", "<#root>\n</#root>");
        java.lang.String str3 = document2.nodeName();
        org.jsoup.select.Elements elements5 = document2.getElementsByIndexEquals(10);
        java.lang.String str6 = document2.toString();
        org.jsoup.nodes.Element element8 = document2.append("hi!");
        org.jsoup.nodes.Element element10 = document2.createElement("org.jsoup.select.Selector$SelectorParseException: <#root>\n</#root>");
        boolean boolean11 = element10.isBlock();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>" + "'", str6, "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>");
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test162");
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
        java.lang.Object[] objArray18 = elements4.toArray();
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
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>]");
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test163");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("#root=\"\"", "org.jsoup.select.Selector$SelectorParseException: <html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document2);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test164");
        org.jsoup.safety.Whitelist whitelist1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.jsoup.Jsoup.clean("[., j, s, o, u, p, ., s, e, l, e, c, t, ., S, e, l, e, c, t, o, r, $, S, e, l, e, c, t, o, r, P, a, r, s, e, E, x, c, e, p, t, i, o, n, :,  , h, i, !, <, h, t, m, l, >, \n, <, h, e, a, d, >, \n, <, /, h, e, a, d, >, \n, <, b, o, d, y, >, \n, <, /, b, o, d, y, >, \n, <, /, h, t, m, l, >]", whitelist1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test165");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("#root", "#root");
        java.lang.String str4 = document2.absUrl("#root=\"\"");
        document2.title("#document");
        document2.setBaseUri("<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!");
        java.lang.String str9 = document2.title();
        org.jsoup.nodes.Element element10 = document2.empty();
        org.jsoup.nodes.Element element12 = element10.append("");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#document" + "'", str9, "#document");
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test166");
        org.jsoup.nodes.Document document2 = new org.jsoup.nodes.Document("#root");
        boolean boolean3 = document2.hasText();
        org.jsoup.select.Elements elements5 = document2.getElementsByIndexEquals(10);
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor6 = elements5.listIterator();
        org.jsoup.select.Elements elements9 = elements5.attr("<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "hi!");
        org.jsoup.nodes.Document document11 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element13 = document11.prependElement("hi!");
        org.jsoup.nodes.Element element14 = element13.parent();
        int int15 = elements5.indexOf((java.lang.Object) element14);
        org.jsoup.select.Elements elements16 = org.jsoup.select.Selector.select("<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!", (java.lang.Iterable<org.jsoup.nodes.Element>) elements5);
        org.jsoup.nodes.Document document19 = org.jsoup.Jsoup.parseBodyFragment("#root=\"\"", "<#root>\n</#root>");
        java.lang.String str20 = document19.toString();
        java.lang.String str21 = document19.nodeName();
        java.lang.String str22 = document19.outerHtml();
        boolean boolean23 = elements16.add((org.jsoup.nodes.Element) document19);
        org.jsoup.select.Elements elements25 = elements16.wrap("[o, r, g, ., j, s, o, u, p, ., s, e, l, e, c, t, ., S, e, l, e, c, t, o, r, $, S, e, l, e, c, t, o, r, P, a, r, s, e, E, x, c, e, p, t, i, o, n, :,  , h, i, !, <, h, t, m, l, >, \n, <, h, e, a, d, >, \n, <, /, h, e, a, d, >, \n, <, b, o, d, y, >, \n, <, /, b, o, d, y, >, \n, <, /, h, t, m, l, >]");
        java.lang.Class<?> wildcardClass26 = elements16.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elementItor6);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertNotNull(document19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>" + "'", str20, "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "#document" + "'", str21, "#document");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>" + "'", str22, "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(elements25);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test167");
        org.jsoup.safety.Whitelist whitelist2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.jsoup.Jsoup.clean("<html>\n<head>\n</head>\n<body>\n &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;hi!\n</body>\n</html>", " text=\"hi!\"", whitelist2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test168");
        org.jsoup.nodes.Document document3 = org.jsoup.parser.Parser.parseBodyFragment("#root", "#root");
        org.jsoup.nodes.Element element5 = document3.addClass("<#root>\n</#root>");
        org.jsoup.select.Elements elements6 = element5.children();
        java.lang.String str7 = element5.nodeName();
        org.jsoup.nodes.Element element9 = element5.getElementById("<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements10 = org.jsoup.select.Selector.select("#root=\"hi!\"", element5);
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query #root=\"hi!\"");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#document" + "'", str7, "#document");
        org.junit.Assert.assertNull(element9);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test169");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element3 = document1.prependElement("hi!");
        org.jsoup.nodes.Element element5 = element3.append("");
        org.jsoup.nodes.Element element6 = element5.previousElementSibling();
        org.jsoup.nodes.Element element8 = element5.toggleClass("<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>");
        org.jsoup.select.Elements elements11 = element5.getElementsByAttributeValueEnding("org.jsoup.select.Selector$SelectorParseException: hi!", "#root=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;\"");
        boolean boolean12 = element5.isBlock();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test170");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str2 = document1.tagName();
        java.lang.String str3 = document1.html();
        org.jsoup.nodes.Element element5 = document1.append("hi!");
        java.util.Set<java.lang.String> strSet6 = element5.classNames();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#root" + "'", str2, "#root");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>" + "'", str3, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(strSet6);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test171");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("#root", "");
        java.lang.String str3 = document2.className();
        org.jsoup.nodes.Node node6 = document2.attr("&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;hi!", "#comment");
        java.lang.String str7 = document2.outerHtml();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<html>\n<head>\n</head>\n<body> #root\n</body>\n</html>" + "'", str7, "<html>\n<head>\n</head>\n<body> #root\n</body>\n</html>");
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test172");
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parseBodyFragment("#root", "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>");
        org.jsoup.nodes.Element element4 = document2.toggleClass("org.jsoup.select.Selector$SelectorParseException: <html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element6 = element4.val("org.jsoup.select.Selector$SelectorParseException: hi!");
        org.jsoup.select.Elements elements7 = element6.getAllElements();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements7);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test173");
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
        attribute8.setKey("!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!" + "'", str16, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!");
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test174");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str2 = document1.tagName();
        java.lang.String str3 = document1.html();
        org.jsoup.nodes.Element element5 = document1.append("hi!");
        org.jsoup.nodes.Element element7 = document1.html("ohi!");
        org.jsoup.parser.TokenQueue tokenQueue9 = new org.jsoup.parser.TokenQueue("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        tokenQueue9.addFirst("org.jsoup.select.Selector$SelectorParseException: hi!");
        boolean boolean12 = tokenQueue9.isEmpty();
        boolean boolean13 = tokenQueue9.matchesWord();
        boolean boolean15 = tokenQueue9.matchChomp("#comment");
        boolean boolean16 = element7.equals((java.lang.Object) boolean15);
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#root" + "'", str2, "#root");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>" + "'", str3, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test175");
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parseBodyFragment("hi!", "#root=\"hi!\"");
        org.jsoup.nodes.Element element4 = document2.addClass("<!hi!>");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test176");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!");
        org.jsoup.nodes.Element element3 = document1.text("org.jsoup.select.Selector$SelectorParseException: hi!<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Document document5 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element7 = document5.prependElement("hi!");
        org.jsoup.nodes.Document document10 = org.jsoup.parser.Parser.parseBodyFragment("#root", "#root");
        org.jsoup.nodes.Element element12 = document10.addClass("<#root>\n</#root>");
        element7.replaceWith((org.jsoup.nodes.Node) document10);
        org.jsoup.nodes.Element element14 = element3.prependChild((org.jsoup.nodes.Node) element7);
        java.lang.String str15 = element7.val();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(document5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test177");
        org.jsoup.nodes.Document document2 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.select.Elements elements4 = document2.getElementsByTag("#root");
        org.jsoup.select.Elements elements6 = elements4.append("<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!");
        org.jsoup.nodes.Document document8 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element10 = document8.prependElement("hi!");
        org.jsoup.nodes.Element element12 = element10.append("");
        org.jsoup.nodes.Document document14 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str15 = document14.tagName();
        org.jsoup.nodes.Element element17 = document14.append("hi!");
        org.jsoup.nodes.Document document19 = new org.jsoup.nodes.Document("#root");
        org.jsoup.nodes.Document document21 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.select.Elements elements23 = document21.getElementsByTag("#root");
        org.jsoup.nodes.Element[] elementArray24 = new org.jsoup.nodes.Element[] { element10, element17, document19, document21 };
        org.jsoup.select.Elements elements25 = new org.jsoup.select.Elements(elementArray24);
        java.util.stream.Stream<org.jsoup.nodes.Element> elementStream26 = elements25.parallelStream();
        boolean boolean27 = elements6.remove((java.lang.Object) elementStream26);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements28 = org.jsoup.select.Selector.select("#root=&quot;&quot;", (java.lang.Iterable<org.jsoup.nodes.Element>) elements6);
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query #root=&quot;&quot;");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(document14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "#root" + "'", str15, "#root");
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(document21);
        org.junit.Assert.assertNotNull(elements23);
        org.junit.Assert.assertNotNull(elementArray24);
        org.junit.Assert.assertNotNull(elementStream26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test178");
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parseBodyFragment("#root=\"\"", "<#root>\n</#root>");
        java.lang.String str3 = document2.nodeName();
        org.jsoup.select.Elements elements5 = document2.getElementsByIndexEquals(10);
        java.lang.String str6 = document2.toString();
        org.jsoup.nodes.Element element8 = document2.append("hi!");
        org.jsoup.nodes.Element element9 = document2.head();
        org.jsoup.nodes.Element element11 = element9.prependElement(" text=\"hi!\"");
        java.lang.String str12 = element11.data();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>" + "'", str6, "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>");
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test179");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("#root", "#root");
        org.jsoup.nodes.Element element4 = document2.addClass("<#root>\n</#root>");
        org.jsoup.nodes.Element element6 = document2.append("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.lang.String str7 = document2.title();
        org.jsoup.nodes.Document document10 = org.jsoup.Jsoup.parseBodyFragment("#root=\"\"", "<#root>\n</#root>");
        java.lang.String str11 = document10.nodeName();
        org.jsoup.select.Elements elements13 = document10.getElementsByIndexEquals(10);
        java.lang.String str14 = document10.toString();
        org.jsoup.nodes.Element element16 = document10.append("hi!");
        org.jsoup.nodes.Document document18 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element20 = document18.prependElement("hi!");
        org.jsoup.nodes.Element element21 = element20.parent();
        org.jsoup.nodes.Element element22 = element20.empty();
        org.jsoup.nodes.Element element23 = element22.empty();
        java.util.Set<java.lang.String> strSet24 = element23.classNames();
        org.jsoup.nodes.Element element25 = document10.classNames(strSet24);
        org.jsoup.nodes.Element element27 = document10.prependElement("<?<html>\n<head>\n</head>\n<body>\n</body>\n</html>>");
        java.util.Set<java.lang.String> strSet28 = document10.classNames();
        org.jsoup.nodes.Element element29 = document2.classNames(strSet28);
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#document" + "'", str11, "#document");
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>" + "'", str14, "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>");
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(document18);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(strSet24);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertNotNull(strSet28);
        org.junit.Assert.assertNotNull(element29);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test180");
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parseBodyFragment("#root", "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>");
        java.lang.String str3 = document2.data();
        java.lang.Object obj4 = null;
        boolean boolean5 = document2.equals(obj4);
        org.jsoup.select.Elements elements7 = document2.getElementsByIndexLessThan((int) (short) 1);
        org.jsoup.nodes.Attribute attribute10 = new org.jsoup.nodes.Attribute("#root", "");
        java.lang.String str11 = attribute10.getKey();
        java.lang.String str12 = attribute10.getKey();
        boolean boolean13 = elements7.remove((java.lang.Object) attribute10);
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#root" + "'", str11, "#root");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "#root" + "'", str12, "#root");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test181");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str2 = document1.tagName();
        org.jsoup.select.Elements elements4 = document1.getElementsByIndexGreaterThan((-1));
        boolean boolean5 = elements4.isEmpty();
        org.jsoup.select.Elements elements7 = elements4.append("\n<!--#root=\"\"-->");
        java.lang.String str9 = elements4.attr("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        int int10 = elements4.size();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#root" + "'", str2, "#root");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test182");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("", "\n<!--#root=\"\"-->");
        org.jsoup.select.Elements elements5 = document2.getElementsByAttributeValueContaining("\n<!--#root=\"\"-->", "#root=\"hi!\"");
        org.jsoup.nodes.Document document6 = document2.normalise();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(document6);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test183");
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parseBodyFragment("#root=\"\"", "<#root>\n</#root>");
        java.lang.String str3 = document2.nodeName();
        org.jsoup.nodes.Element element4 = document2.empty();
        org.jsoup.nodes.Element element6 = element4.prepend("<#root>\n</#root>=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;\"");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements8 = element4.getElementsByTag("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test184");
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
        org.jsoup.nodes.Document document34 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str35 = document34.tagName();
        org.jsoup.nodes.Element element37 = document34.append("hi!");
        java.lang.String str38 = document34.outerHtml();
        org.jsoup.select.Elements elements39 = document34.children();
        org.jsoup.select.Elements elements41 = elements39.html("#root=\"\"=\"\"");
        boolean boolean42 = elements16.containsAll((java.util.Collection<org.jsoup.nodes.Element>) elements39);
        java.util.Iterator<org.jsoup.nodes.Element> elementItor43 = elements39.iterator();
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
        org.junit.Assert.assertNotNull(document34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "#root" + "'", str35, "#root");
        org.junit.Assert.assertNotNull(element37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!" + "'", str38, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!");
        org.junit.Assert.assertNotNull(elements39);
        org.junit.Assert.assertNotNull(elements41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(elementItor43);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test185");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!");
        org.jsoup.nodes.Element element3 = document1.text("org.jsoup.select.Selector$SelectorParseException: hi!<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element5 = element3.html("#root=&quot;&quot;");
        org.jsoup.nodes.Node node6 = element3.parent();
        org.jsoup.nodes.Element element8 = element3.removeClass("#root=\"\"");
        java.lang.String str9 = element8.nodeName();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#document" + "'", str9, "#document");
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test186");
        org.jsoup.safety.Whitelist whitelist1 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.jsoup.Jsoup.isValid("#data", whitelist1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test187");
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
        java.lang.String str33 = element32.className();
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
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test188");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("#root");
        boolean boolean2 = document1.hasText();
        org.jsoup.select.Elements elements4 = document1.getElementsByIndexEquals(10);
        java.lang.Object[] objArray5 = elements4.toArray();
        org.jsoup.nodes.Document document8 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element10 = document8.prependElement("hi!");
        org.jsoup.nodes.Element element11 = element10.parent();
        org.jsoup.nodes.Element element12 = element10.empty();
        elements4.add(0, element12);
        org.jsoup.select.Elements elements15 = elements4.html("&lt;?#root=&quot;&amp;lt;html&amp;gt; &amp;lt;head&amp;gt; &amp;lt;/head&amp;gt; &amp;lt;body&amp;gt; &amp;lt;/body&amp;gt; &amp;lt;/html&amp;gt;&quot;&gt;");
        org.jsoup.nodes.Element element16 = elements15.last();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(element16);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test189");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str2 = document1.tagName();
        org.jsoup.parser.Tag tag3 = document1.tag();
        java.lang.String str4 = document1.outerHtml();
        java.lang.String str5 = document1.outerHtml();
        java.lang.String str6 = document1.title();
        org.jsoup.nodes.Element element7 = document1.empty();
        org.jsoup.nodes.Element element9 = document1.html("org.jsoup.select.Selector$SelectorParseException: <#root>\n</#root>");
        java.lang.String str10 = document1.nodeName();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements13 = document1.getElementsByAttributeValue("<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#root" + "'", str2, "#root");
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>" + "'", str4, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>" + "'", str5, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#document" + "'", str10, "#document");
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test190");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str2 = document1.tagName();
        org.jsoup.parser.Tag tag3 = document1.tag();
        java.lang.String str4 = document1.outerHtml();
        java.lang.String str5 = document1.outerHtml();
        java.lang.String str6 = document1.title();
        java.lang.String str7 = document1.baseUri();
        org.jsoup.nodes.Element element8 = document1.body();
        org.jsoup.nodes.Element element10 = document1.html("<!<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!>");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#root" + "'", str2, "#root");
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>" + "'", str4, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>" + "'", str5, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test191");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("#root", "#root");
        java.lang.String str4 = document2.absUrl("#root=\"\"");
        document2.title("#document");
        document2.setBaseUri("<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!");
        org.jsoup.nodes.Node node9 = document2.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = document2.childNode((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(node9);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test192");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("#declaration");
        org.jsoup.nodes.Element element2 = document1.body();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element2);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test193");
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parseBodyFragment("#root", "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>");
        org.jsoup.nodes.Element element4 = document2.getElementById("<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNull(element4);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test194");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("#data", "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!");
        org.jsoup.nodes.Element element3 = document2.body();
        org.jsoup.nodes.Element element4 = element3.firstElementSibling();
        org.jsoup.select.Elements elements7 = element4.getElementsByAttributeValueNot("#root", "org.jsoup.select.Selector$SelectorParseException: hi!<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements7);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test195");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str2 = document1.tagName();
        org.jsoup.nodes.Element element4 = document1.append("hi!");
        java.lang.String str5 = document1.outerHtml();
        org.jsoup.select.Elements elements6 = document1.children();
        org.jsoup.select.Elements elements7 = document1.children();
        org.jsoup.select.Elements elements9 = elements7.html("<!<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!>");
        java.lang.String str10 = elements9.val();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#root" + "'", str2, "#root");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!" + "'", str5, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test196");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element3 = document1.prependElement("hi!");
        org.jsoup.nodes.Element element5 = element3.append("");
        org.jsoup.nodes.Element element7 = element3.prepend("<#root>\n</#root>");
        org.jsoup.select.Elements elements10 = element3.getElementsByAttributeValueStarting("#root=&quot;&quot;", "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>");
        java.lang.String str11 = elements10.html();
        org.jsoup.select.Elements elements13 = elements10.addClass("<#root>\n<html>\n <head>\n </head>\n <body>\n  #root=&quot;&quot;\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!");
        org.jsoup.nodes.Document document16 = org.jsoup.Jsoup.parseBodyFragment("#root=\"\"", "<#root>\n</#root>");
        java.lang.String str17 = document16.toString();
        java.lang.String str18 = document16.nodeName();
        java.lang.String str19 = document16.outerHtml();
        org.jsoup.nodes.Element element20 = document16.body();
        org.jsoup.nodes.Element element22 = document16.append("#root");
        org.jsoup.select.Elements elements25 = document16.getElementsByAttributeValueEnding("<#root>\n</#root>", "<html>\n <head>\n </head>\n <body>\n </body>\n</html>hi!\n\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n\n <head>\n </head>\n\n <body>\n </body>");
        boolean boolean26 = elements13.containsAll((java.util.Collection<org.jsoup.nodes.Element>) elements25);
        boolean boolean27 = elements25.hasText();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(document16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>" + "'", str17, "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "#document" + "'", str18, "#document");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>" + "'", str19, "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>");
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(elements25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test197");
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
        org.jsoup.select.Elements elements20 = elements6.html("#declaration");
        java.util.stream.Stream<org.jsoup.nodes.Element> elementStream21 = elements20.stream();
        org.jsoup.select.Elements elements22 = new org.jsoup.select.Elements((java.util.Collection<org.jsoup.nodes.Element>) elements20);
        org.jsoup.nodes.Document document24 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.select.Elements elements26 = document24.getElementsByTag("#root");
        java.lang.String str27 = elements26.text();
        org.jsoup.nodes.Document document29 = new org.jsoup.nodes.Document("#root");
        boolean boolean30 = document29.hasText();
        org.jsoup.select.Elements elements32 = document29.getElementsByIndexEquals(10);
        java.lang.Object[] objArray33 = elements32.toArray();
        boolean boolean34 = elements26.retainAll((java.util.Collection<org.jsoup.nodes.Element>) elements32);
        java.lang.String str35 = elements32.text();
        org.jsoup.nodes.Document document37 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str38 = document37.tagName();
        org.jsoup.select.Elements elements40 = document37.getElementsByIndexGreaterThan((-1));
        java.lang.String str41 = document37.toString();
        org.jsoup.nodes.Element element43 = document37.text("#root=\"hi!\"");
        int int44 = elements32.lastIndexOf((java.lang.Object) "#root=\"hi!\"");
        org.jsoup.nodes.Element element45 = elements32.first();
        java.lang.String str46 = elements32.text();
        boolean boolean47 = elements20.containsAll((java.util.Collection<org.jsoup.nodes.Element>) elements32);
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
        org.junit.Assert.assertNotNull(elementStream21);
        org.junit.Assert.assertNotNull(document24);
        org.junit.Assert.assertNotNull(elements26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(elements32);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray33), "[]");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(document37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "#root" + "'", str38, "#root");
        org.junit.Assert.assertNotNull(elements40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>" + "'", str41, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.junit.Assert.assertNotNull(element43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertNull(element45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test198");
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
        org.jsoup.nodes.Document document21 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element23 = document21.prependElement("hi!");
        org.jsoup.nodes.Element element24 = element23.parent();
        org.jsoup.select.Elements elements27 = element24.getElementsByAttributeValueEnding("org.jsoup.select.Selector$SelectorParseException: <html>\n<head>\n</head>\n<body>\n</body>\n</html>", "#root=\"\"");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean28 = elements18.retainAll((java.util.Collection<org.jsoup.nodes.Element>) elements27);
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
        org.junit.Assert.assertNotNull(document21);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(elements27);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test199");
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
        org.jsoup.nodes.Document document51 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element53 = document51.prependElement("hi!");
        org.jsoup.nodes.Element element55 = element53.append("");
        org.jsoup.nodes.Element element57 = element53.toggleClass("#declaration");
        org.jsoup.nodes.Element element58 = element57.lastElementSibling();
        // The following exception was thrown during execution in test generation
        try {
            elements4.add(100, element57);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(document51);
        org.junit.Assert.assertNotNull(element53);
        org.junit.Assert.assertNotNull(element55);
        org.junit.Assert.assertNotNull(element57);
        org.junit.Assert.assertNotNull(element58);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test200");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("<?<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!>");
        org.junit.Assert.assertNotNull(document1);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test201");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element3 = document1.prependElement("hi!");
        org.jsoup.nodes.Document document6 = org.jsoup.parser.Parser.parseBodyFragment("#root", "#root");
        org.jsoup.nodes.Element element8 = document6.addClass("<#root>\n</#root>");
        element3.replaceWith((org.jsoup.nodes.Node) document6);
        org.jsoup.nodes.Element element11 = element3.toggleClass("#root=\"hi!\"");
        org.jsoup.nodes.Element element13 = element11.toggleClass("hi");
        java.lang.String str14 = element13.data();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test202");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str2 = document1.tagName();
        java.lang.String str3 = document1.html();
        org.jsoup.nodes.Element element5 = document1.append("hi!");
        org.jsoup.nodes.Element element6 = element5.parent();
        java.util.Set<java.lang.String> strSet7 = element5.classNames();
        java.util.Set<java.lang.String> strSet8 = element5.classNames();
        // The following exception was thrown during execution in test generation
        try {
            element5.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#root" + "'", str2, "#root");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>" + "'", str3, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNull(element6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(strSet8);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test203");
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parseBodyFragment("org", "hi!");
        org.junit.Assert.assertNotNull(document2);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test204");
        org.jsoup.nodes.Document document2 = new org.jsoup.nodes.Document("#root");
        boolean boolean3 = document2.hasText();
        org.jsoup.select.Elements elements5 = document2.getElementsByIndexEquals(10);
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor6 = elements5.listIterator();
        org.jsoup.select.Elements elements9 = elements5.attr("<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "hi!");
        org.jsoup.nodes.Document document11 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element13 = document11.prependElement("hi!");
        org.jsoup.nodes.Element element14 = element13.parent();
        int int15 = elements5.indexOf((java.lang.Object) element14);
        org.jsoup.select.Elements elements16 = org.jsoup.select.Selector.select("<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!", (java.lang.Iterable<org.jsoup.nodes.Element>) elements5);
        org.jsoup.nodes.Document document19 = org.jsoup.Jsoup.parseBodyFragment("#root=\"\"", "<#root>\n</#root>");
        java.lang.String str20 = document19.toString();
        java.lang.String str21 = document19.nodeName();
        java.lang.String str22 = document19.outerHtml();
        boolean boolean23 = elements16.add((org.jsoup.nodes.Element) document19);
        org.jsoup.select.Elements elements25 = elements16.toggleClass("[]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elementItor6);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertNotNull(document19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>" + "'", str20, "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "#document" + "'", str21, "#document");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>" + "'", str22, "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(elements25);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test205");
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
        org.jsoup.nodes.Element element34 = element21.toggleClass("<!<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!>");
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
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test206");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str2 = document1.tagName();
        org.jsoup.nodes.Element element4 = document1.append("hi!");
        org.jsoup.nodes.Element element6 = document1.prependText("hi!");
        org.jsoup.select.Elements elements9 = document1.getElementsByAttributeValue("#root=\"\"", "#root=\"hi!\"");
        org.jsoup.select.Elements elements11 = elements9.toggleClass("<!#root=\"hi!\">");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#root" + "'", str2, "#root");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(elements11);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test207");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.select.Elements elements3 = document1.getElementsByTag("#root");
        org.jsoup.select.Elements elements5 = elements3.toggleClass("#root=\"hi!\"");
        org.jsoup.nodes.Document document8 = new org.jsoup.nodes.Document("#root");
        boolean boolean9 = document8.hasText();
        org.jsoup.select.Elements elements11 = document8.getElementsByIndexEquals(10);
        java.lang.Object[] objArray12 = elements11.toArray();
        org.jsoup.nodes.Document document15 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element17 = document15.prependElement("hi!");
        org.jsoup.nodes.Element element18 = element17.parent();
        org.jsoup.nodes.Element element19 = element17.empty();
        elements11.add(0, element19);
        org.jsoup.nodes.Document document22 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str23 = document22.tagName();
        org.jsoup.parser.Tag tag24 = document22.tag();
        org.jsoup.nodes.TextNode textNode27 = new org.jsoup.nodes.TextNode("hi!", "");
        org.jsoup.nodes.Node node28 = textNode27.parent();
        org.jsoup.nodes.Element element29 = document22.appendChild((org.jsoup.nodes.Node) textNode27);
        org.jsoup.select.Elements elements31 = element29.getElementsByClass("#root");
        org.jsoup.nodes.Element element32 = element19.prependChild((org.jsoup.nodes.Node) element29);
        org.jsoup.select.Elements elements34 = element29.getElementsByAttribute("#root=\"hi!\"");
        org.jsoup.nodes.Document document36 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str37 = document36.tagName();
        org.jsoup.nodes.Element element39 = document36.append("hi!");
        java.lang.String str40 = element39.outerHtml();
        boolean boolean42 = element39.equals((java.lang.Object) 1.0f);
        java.lang.String str43 = element39.nodeName();
        org.jsoup.nodes.Element element45 = element39.wrap("#comment");
        org.jsoup.nodes.Element element46 = element29.appendChild((org.jsoup.nodes.Node) element39);
        org.jsoup.select.Elements elements48 = element46.getElementsByClass("<?<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!>");
        org.jsoup.select.Elements elements50 = element46.select("#document");
        org.jsoup.select.Elements elements53 = element46.getElementsByAttributeValue("<html>\n<head>\n</head>\n<body>\n &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;hi!\n</body>\n</html>", "<html>\n<head>\n</head>\n<body>\n #root\n</body>\n</html>");
        org.jsoup.nodes.Element element55 = element46.removeClass("[., j, s, o, u, p, ., s, e, l, e, c, t, ., S, e, l, e, c, t, o, r, $, S, e, l, e, c, t, o, r, P, a, r, s, e, E, x, c, e, p, t, i, o, n, :,  , h, i, !, <, h, t, m, l, >, \n, <, h, e, a, d, >, \n, <, /, h, e, a, d, >, \n, <, b, o, d, y, >, \n, <, /, b, o, d, y, >, \n, <, /, h, t, m, l, >]");
        // The following exception was thrown during execution in test generation
        try {
            elements5.add((int) (short) -1, element46);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(elements3);
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
        org.junit.Assert.assertNotNull(document22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "#root" + "'", str23, "#root");
        org.junit.Assert.assertNotNull(tag24);
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertNotNull(elements31);
        org.junit.Assert.assertNotNull(element32);
        org.junit.Assert.assertNotNull(elements34);
        org.junit.Assert.assertNotNull(document36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "#root" + "'", str37, "#root");
        org.junit.Assert.assertNotNull(element39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!" + "'", str40, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "#document" + "'", str43, "#document");
        org.junit.Assert.assertNull(element45);
        org.junit.Assert.assertNotNull(element46);
        org.junit.Assert.assertNotNull(elements48);
        org.junit.Assert.assertNotNull(elements50);
        org.junit.Assert.assertNotNull(elements53);
        org.junit.Assert.assertNotNull(element55);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test208");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element3 = document1.prependElement("hi!");
        org.jsoup.nodes.Element element4 = element3.parent();
        org.jsoup.nodes.Element element5 = element3.empty();
        org.jsoup.select.Elements elements7 = element5.getElementsByClass("hi!");
        org.jsoup.nodes.Document document10 = org.jsoup.Jsoup.parseBodyFragment("#root=\"\"", "<#root>\n</#root>");
        java.lang.String str11 = document10.nodeName();
        org.jsoup.select.Elements elements13 = document10.getElementsByIndexEquals(10);
        java.lang.String str14 = document10.toString();
        org.jsoup.nodes.Element element16 = document10.append("hi!");
        org.jsoup.nodes.Document document18 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element20 = document18.prependElement("hi!");
        org.jsoup.nodes.Element element21 = element20.parent();
        org.jsoup.nodes.Element element22 = element20.empty();
        org.jsoup.nodes.Element element23 = element22.empty();
        java.util.Set<java.lang.String> strSet24 = element23.classNames();
        org.jsoup.nodes.Element element25 = document10.classNames(strSet24);
        org.jsoup.nodes.Element element27 = document10.prependElement("<?<html>\n<head>\n</head>\n<body>\n</body>\n</html>>");
        org.jsoup.nodes.Element element28 = element5.prependChild((org.jsoup.nodes.Node) document10);
        org.jsoup.select.Elements elements29 = element28.children();
        int int30 = elements29.size();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#document" + "'", str11, "#document");
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>" + "'", str14, "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>");
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(document18);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(strSet24);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertNotNull(elements29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test209");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str2 = document1.tagName();
        org.jsoup.nodes.Element element4 = document1.append("hi!");
        org.jsoup.select.Elements elements6 = document1.getElementsByIndexGreaterThan((int) (short) 10);
        org.jsoup.select.Elements elements8 = document1.getElementsByIndexLessThan(0);
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#root" + "'", str2, "#root");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements8);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test210");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element3 = document1.prependElement("hi!");
        org.jsoup.nodes.Element element5 = element3.append("");
        org.jsoup.nodes.Element element6 = element5.previousElementSibling();
        java.lang.String str7 = element5.nodeName();
        org.jsoup.nodes.Element element8 = element5.previousElementSibling();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNull(element6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(element8);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test211");
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
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator30 = attributes28.spliterator();
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
        org.junit.Assert.assertNotNull(tag23);
        org.junit.Assert.assertNotNull(document26);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertNotNull(attributes28);
        org.junit.Assert.assertNotNull(attributeSpliterator30);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test212");
        org.jsoup.safety.Whitelist whitelist1 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.jsoup.Jsoup.isValid("[]", whitelist1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test213");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("#root", "#root");
        java.lang.String str3 = document2.nodeName();
        org.jsoup.nodes.Element element5 = document2.text("<html>\n <head>\n </head>\n <body>\n </body>\n</html>hi!\n<head>\n </head>\n <body>\n </body>\n\n");
        org.jsoup.nodes.Element element7 = element5.val(" #root=\"\"=\"\"");
        java.lang.String str8 = element5.tagName();
        org.jsoup.nodes.Element element10 = element5.removeClass("<?<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!>");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#root" + "'", str8, "#root");
        org.junit.Assert.assertNotNull(element10);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test214");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str2 = document1.tagName();
        org.jsoup.select.Elements elements4 = document1.getElementsByIndexGreaterThan((-1));
        boolean boolean5 = elements4.isEmpty();
        org.jsoup.select.Elements elements7 = elements4.append("\n<!--#root=\"\"-->");
        org.jsoup.select.Elements elements9 = elements7.removeAttr("#declaration");
        java.lang.String str11 = elements9.attr("<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>");
        java.util.stream.Stream<org.jsoup.nodes.Element> elementStream12 = elements9.stream();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#root" + "'", str2, "#root");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(elementStream12);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test215");
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
        org.jsoup.nodes.TextNode textNode49 = new org.jsoup.nodes.TextNode("hi!", "");
        org.jsoup.nodes.Node node50 = textNode49.parent();
        java.lang.String str51 = textNode49.toString();
        org.jsoup.nodes.TextNode textNode53 = textNode49.text("<html>\n <head>\n </head>\n <body>\n </body>\n</html>hi!\n\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n\n <head>\n </head>\n\n <body>\n </body>");
        java.lang.String str54 = textNode53.toString();
        java.lang.String str55 = textNode53.nodeName();
        java.lang.String str56 = textNode53.getWholeText();
        boolean boolean57 = elements46.equals((java.lang.Object) str56);
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
        org.junit.Assert.assertNull(node50);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "hi!" + "'", str51, "hi!");
        org.junit.Assert.assertNotNull(textNode53);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "&lt;html&gt;\n &lt;head&gt;\n &lt;/head&gt;\n &lt;body&gt;\n &lt;/body&gt;\n&lt;/html&gt;hi!\n\n&lt;html&gt;\n &lt;head&gt;\n &lt;/head&gt;\n &lt;body&gt;\n &lt;/body&gt;\n&lt;/html&gt;\n\n &lt;head&gt;\n &lt;/head&gt;\n\n &lt;body&gt;\n &lt;/body&gt;" + "'", str54, "&lt;html&gt;\n &lt;head&gt;\n &lt;/head&gt;\n &lt;body&gt;\n &lt;/body&gt;\n&lt;/html&gt;hi!\n\n&lt;html&gt;\n &lt;head&gt;\n &lt;/head&gt;\n &lt;body&gt;\n &lt;/body&gt;\n&lt;/html&gt;\n\n &lt;head&gt;\n &lt;/head&gt;\n\n &lt;body&gt;\n &lt;/body&gt;");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "#text" + "'", str55, "#text");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "<html>\n <head>\n </head>\n <body>\n </body>\n</html>hi!\n\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n\n <head>\n </head>\n\n <body>\n </body>" + "'", str56, "<html>\n <head>\n </head>\n <body>\n </body>\n</html>hi!\n\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n\n <head>\n </head>\n\n <body>\n </body>");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test216");
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
        org.jsoup.select.Elements elements22 = elements20.html("#document");
        org.jsoup.select.Elements elements25 = elements20.attr("hi", "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>");
        org.jsoup.nodes.Document document27 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str28 = document27.tagName();
        org.jsoup.nodes.Element element30 = document27.append("hi!");
        java.lang.String str31 = document27.outerHtml();
        org.jsoup.select.Elements elements32 = document27.children();
        org.jsoup.nodes.Document document34 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.select.Elements elements36 = document34.getElementsByTag("#root");
        boolean boolean37 = document27.equals((java.lang.Object) document34);
        org.jsoup.nodes.Element element39 = document34.appendText("#root");
        org.jsoup.nodes.Element element41 = document34.prepend("org.jsoup.select.Selector$SelectorParseException: hi!");
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
        boolean boolean63 = document34.equals((java.lang.Object) elements62);
        int int64 = elements20.indexOf((java.lang.Object) elements62);
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(elementItor12);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(elements20);
        org.junit.Assert.assertNotNull(elements22);
        org.junit.Assert.assertNotNull(elements25);
        org.junit.Assert.assertNotNull(document27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "#root" + "'", str28, "#root");
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!" + "'", str31, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!");
        org.junit.Assert.assertNotNull(elements32);
        org.junit.Assert.assertNotNull(document34);
        org.junit.Assert.assertNotNull(elements36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(element39);
        org.junit.Assert.assertNotNull(element41);
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
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + (-1) + "'", int64 == (-1));
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test217");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>");
        org.jsoup.nodes.Element element2 = document1.body();
        org.jsoup.select.Elements elements5 = element2.getElementsByAttributeValueStarting("<!hi!>", "<html>\n<head>\n</head>\n<body>\n org.jsoup.select.Selector$SelectorParseException: hi!&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(elements5);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test218");
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parseBodyFragment("hi!", "<?<html>\n<head>\n</head>\n<body>\n</body>\n</html>>");
        org.junit.Assert.assertNotNull(document2);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test219");
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
        org.jsoup.select.Elements elements34 = element32.select("#document");
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
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test220");
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
        org.jsoup.select.Elements elements45 = elements41.prepend("");
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
        org.junit.Assert.assertNotNull(elements45);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test221");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str2 = document1.id();
        org.jsoup.select.Elements elements3 = document1.children();
        org.jsoup.select.Elements elements5 = elements3.html("#root=\"\"");
        java.util.Spliterator<org.jsoup.nodes.Element> elementSpliterator6 = elements5.spliterator();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Element> elementList9 = elements5.subList((int) '.', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: toIndex = 97");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elementSpliterator6);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test222");
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
        java.lang.String str35 = element31.text();
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
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test223");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str2 = document1.id();
        org.jsoup.select.Elements elements3 = document1.children();
        org.jsoup.select.Elements elements5 = elements3.html("#root=\"\"");
        org.jsoup.select.Elements elements8 = elements3.attr("#root=\"\"", "[o, h, i, !]");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elements8);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test224");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element3 = document1.prependElement("hi!");
        org.jsoup.nodes.Element element4 = element3.parent();
        org.jsoup.nodes.Element element5 = element3.empty();
        org.jsoup.select.Elements elements7 = element5.getElementsByClass("hi!");
        org.jsoup.nodes.Element element9 = element5.prepend("<?<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!>");
        boolean boolean10 = element9.hasText();
        org.jsoup.nodes.Element element12 = element9.text("&lt;html&gt;\n &lt;head&gt;\n &lt;/head&gt;\n &lt;body&gt;\n &lt;/body&gt;\n&lt;/html&gt;hi!\n\n&lt;html&gt;\n &lt;head&gt;\n &lt;/head&gt;\n &lt;body&gt;\n &lt;/body&gt;\n&lt;/html&gt;\n\n &lt;head&gt;\n &lt;/head&gt;\n\n &lt;body&gt;\n &lt;/body&gt;");
        java.lang.String str14 = element9.absUrl("#root=\"\"");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test225");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element3 = document1.prependElement("hi!");
        org.jsoup.nodes.Document document6 = org.jsoup.parser.Parser.parseBodyFragment("#root", "#root");
        org.jsoup.nodes.Element element8 = document6.addClass("<#root>\n</#root>");
        element3.replaceWith((org.jsoup.nodes.Node) document6);
        org.jsoup.nodes.Element element11 = element3.toggleClass("#root=\"hi!\"");
        org.jsoup.nodes.Element element13 = element11.toggleClass("hi");
        java.lang.String str14 = element13.nodeName();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test226");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("org.jsoup.select.Selector$SelectorParseException: hi!<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.lang.String str2 = document1.nodeName();
        org.jsoup.select.Elements elements4 = document1.getElementsByClass("\n<#root class=\"\">\n</#root>");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#document" + "'", str2, "#document");
        org.junit.Assert.assertNotNull(elements4);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test227");
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
        org.jsoup.nodes.Document document17 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str18 = document17.tagName();
        org.jsoup.nodes.Element element20 = document17.append("hi!");
        java.lang.String str21 = document17.outerHtml();
        org.jsoup.select.Elements elements22 = document17.children();
        org.jsoup.nodes.Element element23 = document17.empty();
        int int24 = elements14.indexOf((java.lang.Object) document17);
        java.lang.String str25 = document17.outerHtml();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(elementItor5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "#document" + "'", str12, "#document");
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(document17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "#root" + "'", str18, "#root");
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!" + "'", str21, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!");
        org.junit.Assert.assertNotNull(elements22);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test228");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("#document");
        boolean boolean2 = document1.isBlock();
        java.lang.String str4 = document1.attr("[]");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test229");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("#comment", "org.jsoup.select.Selector$SelectorParseException: hi!<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document2);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test230");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str2 = document1.tagName();
        org.jsoup.nodes.Element element4 = document1.append("hi!");
        java.lang.String str5 = document1.outerHtml();
        org.jsoup.select.Elements elements6 = document1.children();
        org.jsoup.nodes.Element element8 = document1.prependElement("ohi!");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#root" + "'", str2, "#root");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!" + "'", str5, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test231");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node35 = element32.attr("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
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
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test232");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element3 = document1.prependElement("hi!");
        org.jsoup.nodes.Element element5 = element3.append("");
        org.jsoup.nodes.Element element6 = element5.previousElementSibling();
        java.lang.String str7 = element5.nodeName();
        org.jsoup.select.Elements elements10 = element5.getElementsByAttributeValueStarting("<!<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!>", "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>");
        org.jsoup.nodes.Element element12 = element5.appendElement("aorg");
        java.lang.String str13 = element12.val();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNull(element6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test233");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("#root", "#root");
        org.jsoup.nodes.Element element4 = document2.addClass("<#root>\n</#root>");
        org.jsoup.nodes.Element element6 = document2.append("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Document document8 = new org.jsoup.nodes.Document("#root");
        boolean boolean9 = document8.hasText();
        org.jsoup.select.Elements elements11 = document8.getElementsByIndexEquals(10);
        java.lang.Object[] objArray12 = elements11.toArray();
        org.jsoup.nodes.Document document15 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element17 = document15.prependElement("hi!");
        org.jsoup.nodes.Element element18 = element17.parent();
        org.jsoup.nodes.Element element19 = element17.empty();
        elements11.add(0, element19);
        org.jsoup.select.Elements elements21 = element19.siblingElements();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element22 = element6.appendChild((org.jsoup.nodes.Node) element19);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.lang.NotImplementedException; message: Cannot (yet) move nodes in tree");
        } catch (org.apache.commons.lang.NotImplementedException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertNotNull(document15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(elements21);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test234");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str2 = document1.tagName();
        org.jsoup.parser.Tag tag3 = document1.tag();
        org.jsoup.nodes.TextNode textNode6 = new org.jsoup.nodes.TextNode("hi!", "");
        org.jsoup.nodes.Node node7 = textNode6.parent();
        org.jsoup.nodes.Element element8 = document1.appendChild((org.jsoup.nodes.Node) textNode6);
        org.jsoup.select.Elements elements10 = element8.getElementsByClass("#root");
        org.jsoup.select.Elements elements12 = elements10.val("");
        boolean boolean14 = elements12.is("<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>");
        org.jsoup.nodes.Document document17 = org.jsoup.Jsoup.parseBodyFragment("#root", "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>");
        org.jsoup.nodes.Element element19 = document17.toggleClass("org.jsoup.select.Selector$SelectorParseException: <html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element21 = element19.val("org.jsoup.select.Selector$SelectorParseException: hi!");
        int int22 = elements12.indexOf((java.lang.Object) "org.jsoup.select.Selector$SelectorParseException: hi!");
        org.jsoup.nodes.Document document24 = new org.jsoup.nodes.Document("#root");
        boolean boolean25 = document24.hasText();
        org.jsoup.select.Elements elements27 = document24.getElementsByIndexEquals(10);
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor28 = elements27.listIterator();
        org.jsoup.select.Elements elements31 = elements27.attr("<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "hi!");
        org.jsoup.nodes.Document document33 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element35 = document33.prependElement("hi!");
        org.jsoup.nodes.Element element36 = element35.parent();
        int int37 = elements27.indexOf((java.lang.Object) element36);
        org.jsoup.select.Elements elements39 = elements27.toggleClass("#document");
        boolean boolean40 = elements12.removeAll((java.util.Collection<org.jsoup.nodes.Element>) elements27);
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#root" + "'", str2, "#root");
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(document17);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(elements27);
        org.junit.Assert.assertNotNull(elementItor28);
        org.junit.Assert.assertNotNull(elements31);
        org.junit.Assert.assertNotNull(document33);
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertNotNull(element36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNotNull(elements39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test235");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element3 = document1.prependElement("hi!");
        org.jsoup.nodes.Element element5 = element3.append("");
        org.jsoup.nodes.Element element7 = element3.prepend("<#root>\n</#root>");
        org.jsoup.select.Elements elements10 = element3.getElementsByAttributeValueStarting("#root=&quot;&quot;", "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>");
        java.lang.String str11 = elements10.html();
        org.jsoup.select.Elements elements13 = elements10.val("<html>\n <head>\n </head>\n <body>\n </body>\n</html>hi!\n\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n\n <head>\n </head>\n\n <body>\n </body>");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(elements13);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test236");
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
        org.jsoup.nodes.Element element23 = document2.body();
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
        org.junit.Assert.assertNotNull(element23);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test237");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str2 = document1.id();
        org.jsoup.select.Elements elements3 = document1.children();
        org.jsoup.select.Elements elements5 = elements3.html("#root=\"\"");
        java.util.Spliterator<org.jsoup.nodes.Element> elementSpliterator6 = elements5.spliterator();
        org.jsoup.nodes.Document document9 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element11 = document9.prependElement("hi!");
        org.jsoup.nodes.Element element13 = element11.append("");
        org.jsoup.nodes.Element element15 = element11.prepend("<#root>\n</#root>");
        org.jsoup.select.Elements elements18 = element11.getElementsByAttributeValueStarting("#root=&quot;&quot;", "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>");
        org.jsoup.select.Elements elements20 = elements18.eq((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = elements5.addAll((int) 'h', (java.util.Collection<org.jsoup.nodes.Element>) elements20);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 104, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elementSpliterator6);
        org.junit.Assert.assertNotNull(document9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertNotNull(elements20);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test238");
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parseBodyFragment("#root=\"\"", "<#root>\n</#root>");
        java.lang.String str3 = document2.nodeName();
        org.jsoup.nodes.Element element4 = document2.empty();
        boolean boolean6 = element4.hasAttr("[o, h, i, !]");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test239");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>");
        boolean boolean3 = document1.hasAttr("<html>\n<head>\n</head>\n<body>\n &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;hi!\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test240");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor1 = attributes0.iterator();
        java.lang.String str2 = attributes0.toString();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator3 = attributes0.spliterator();
        boolean boolean5 = attributes0.hasKey("ohi!");
        boolean boolean7 = attributes0.hasKey("org.jsoup.select.Selector$SelectorParseException: <html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Document document9 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str10 = document9.tagName();
        org.jsoup.parser.Tag tag11 = document9.tag();
        org.jsoup.nodes.Element element12 = document9.body();
        java.lang.String str13 = document9.text();
        org.jsoup.select.Elements elements14 = document9.children();
        org.jsoup.nodes.Document document16 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.select.Elements elements18 = document16.getElementsByTag("#root");
        java.lang.String str19 = elements18.text();
        org.jsoup.nodes.Document document21 = new org.jsoup.nodes.Document("#root");
        boolean boolean22 = document21.hasText();
        org.jsoup.select.Elements elements24 = document21.getElementsByIndexEquals(10);
        java.lang.Object[] objArray25 = elements24.toArray();
        boolean boolean26 = elements18.retainAll((java.util.Collection<org.jsoup.nodes.Element>) elements24);
        java.lang.String str27 = elements24.text();
        org.jsoup.nodes.Document document29 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str30 = document29.tagName();
        org.jsoup.select.Elements elements32 = document29.getElementsByIndexGreaterThan((-1));
        java.lang.String str33 = document29.toString();
        org.jsoup.nodes.Element element35 = document29.text("#root=\"hi!\"");
        int int36 = elements24.lastIndexOf((java.lang.Object) "#root=\"hi!\"");
        org.jsoup.select.Elements elements38 = elements24.select("#root");
        java.util.Spliterator<org.jsoup.nodes.Element> elementSpliterator39 = elements24.spliterator();
        boolean boolean40 = elements14.addAll((java.util.Collection<org.jsoup.nodes.Element>) elements24);
        org.jsoup.nodes.Document document42 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str43 = document42.tagName();
        org.jsoup.nodes.Element element45 = document42.append("hi!");
        java.lang.String str46 = document42.outerHtml();
        org.jsoup.select.Elements elements47 = document42.children();
        org.jsoup.select.Elements elements49 = elements47.html("#root=\"\"=\"\"");
        boolean boolean50 = elements24.containsAll((java.util.Collection<org.jsoup.nodes.Element>) elements47);
        boolean boolean51 = attributes0.equals((java.lang.Object) elements24);
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(attributeSpliterator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(document9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#root" + "'", str10, "#root");
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(document16);
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(elements24);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(document29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "#root" + "'", str30, "#root");
        org.junit.Assert.assertNotNull(elements32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>" + "'", str33, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNotNull(elements38);
        org.junit.Assert.assertNotNull(elementSpliterator39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(document42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "#root" + "'", str43, "#root");
        org.junit.Assert.assertNotNull(element45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!" + "'", str46, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!");
        org.junit.Assert.assertNotNull(elements47);
        org.junit.Assert.assertNotNull(elements49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test241");
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parseBodyFragment("", ".jsoup.select.Selector$SelectorParseException: hi!<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.lang.String str3 = document2.nodeName();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test242");
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parseBodyFragment("", "\n<#root class=\"\">\n</#root>");
        org.junit.Assert.assertNotNull(document2);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test243");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("#root", "#root");
        org.jsoup.nodes.Element element4 = document2.addClass("<#root>\n</#root>");
        org.jsoup.select.Elements elements5 = element4.children();
        java.lang.String str6 = element4.nodeName();
        org.jsoup.select.Elements elements7 = element4.getAllElements();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#document" + "'", str6, "#document");
        org.junit.Assert.assertNotNull(elements7);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test244");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element3 = document1.prependElement("hi!");
        org.jsoup.nodes.Element element5 = element3.append("");
        org.jsoup.nodes.Element element6 = element5.previousElementSibling();
        org.jsoup.nodes.Element element8 = element5.toggleClass("<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>");
        org.jsoup.select.Elements elements9 = element8.getAllElements();
        int int10 = elements9.size();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test245");
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parseBodyFragment("#root", "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>");
        org.jsoup.nodes.Element element4 = document2.toggleClass("org.jsoup.select.Selector$SelectorParseException: <html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element6 = element4.val("org.jsoup.select.Selector$SelectorParseException: hi!");
        java.lang.String str7 = element6.data();
        org.jsoup.nodes.Node node9 = element6.removeAttr("#text");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(node9);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test246");
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parseBodyFragment("&lt;?#root=&quot;&amp;lt;html&amp;gt; &amp;lt;head&amp;gt; &amp;lt;/head&amp;gt; &amp;lt;body&amp;gt; &amp;lt;/body&amp;gt; &amp;lt;/html&amp;gt;&quot;&gt;", "<html>\n <head>\n </head>\n <body>\n </body>\n</html>hi!\n<head>\n </head>\n <body>\n </body>\n\n");
        java.lang.String str3 = document2.id();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test247");
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
        org.jsoup.nodes.Document document23 = new org.jsoup.nodes.Document("#root");
        boolean boolean24 = document23.hasText();
        org.jsoup.select.Elements elements26 = document23.getElementsByIndexEquals(10);
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor27 = elements26.listIterator();
        org.jsoup.select.Elements elements28 = new org.jsoup.select.Elements((java.util.List<org.jsoup.nodes.Element>) elements26);
        java.lang.Object obj29 = null;
        boolean boolean30 = elements26.remove(obj29);
        java.lang.String str31 = elements26.text();
        org.jsoup.select.Elements elements33 = elements26.val("#root=\"\"=\"\"");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean34 = elements18.retainAll((java.util.Collection<org.jsoup.nodes.Element>) elements26);
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
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(elements26);
        org.junit.Assert.assertNotNull(elementItor27);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(elements33);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test248");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str2 = document1.tagName();
        org.jsoup.nodes.Element element4 = document1.append("hi!");
        java.lang.String str5 = document1.outerHtml();
        org.jsoup.select.Elements elements6 = document1.children();
        java.lang.String str8 = document1.absUrl("<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>");
        org.jsoup.select.Elements elements11 = document1.getElementsByAttributeValueContaining("<#root>\n</#root>", "#document");
        org.jsoup.nodes.Document document13 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element15 = document13.prependElement("hi!");
        org.jsoup.nodes.Element element17 = element15.append("");
        org.jsoup.nodes.Document document19 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str20 = document19.tagName();
        org.jsoup.nodes.Element element22 = document19.append("hi!");
        org.jsoup.nodes.Document document24 = new org.jsoup.nodes.Document("#root");
        org.jsoup.nodes.Document document26 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.select.Elements elements28 = document26.getElementsByTag("#root");
        org.jsoup.nodes.Element[] elementArray29 = new org.jsoup.nodes.Element[] { element15, element22, document24, document26 };
        org.jsoup.select.Elements elements30 = new org.jsoup.select.Elements(elementArray29);
        org.jsoup.select.Elements elements31 = new org.jsoup.select.Elements(elementArray29);
        org.jsoup.select.Elements elements32 = new org.jsoup.select.Elements(elementArray29);
        boolean boolean33 = elements11.contains((java.lang.Object) elementArray29);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element35 = elements11.get((int) 'h');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 104, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#root" + "'", str2, "#root");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!" + "'", str5, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(document19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "#root" + "'", str20, "#root");
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(document26);
        org.junit.Assert.assertNotNull(elements28);
        org.junit.Assert.assertNotNull(elementArray29);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test249");
        org.jsoup.nodes.Document document2 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element4 = document2.prependElement("hi!");
        org.jsoup.nodes.Element element6 = element4.append("");
        org.jsoup.select.Elements elements7 = org.jsoup.select.Selector.select("#root", element6);
        org.jsoup.select.Elements elements9 = elements7.prepend("\n<!--#root=\"\"-->");
        org.jsoup.nodes.Document document11 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str12 = document11.tagName();
        org.jsoup.parser.Tag tag13 = document11.tag();
        org.jsoup.nodes.Element element15 = new org.jsoup.nodes.Element(tag13, "#root=\"\"");
        boolean boolean16 = element15.isBlock();
        org.jsoup.nodes.Document document18 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str19 = document18.tagName();
        org.jsoup.parser.Tag tag20 = document18.tag();
        org.jsoup.nodes.Element element22 = new org.jsoup.nodes.Element(tag20, "#root=\"\"");
        java.lang.String str23 = element22.toString();
        org.jsoup.nodes.Element element25 = element22.text("");
        org.jsoup.nodes.Element element27 = element22.removeClass("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        boolean boolean29 = element22.hasClass("<?<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!>");
        org.jsoup.nodes.Element element30 = element15.prependChild((org.jsoup.nodes.Node) element22);
        org.jsoup.select.Elements elements31 = element22.children();
        java.lang.String str32 = element22.toString();
        org.jsoup.nodes.Element element34 = element22.addClass("");
        org.jsoup.select.Elements elements36 = element22.getElementsByIndexGreaterThan(4);
        boolean boolean37 = elements9.containsAll((java.util.Collection<org.jsoup.nodes.Element>) elements36);
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "#root" + "'", str12, "#root");
        org.junit.Assert.assertNotNull(tag13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(document18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "#root" + "'", str19, "#root");
        org.junit.Assert.assertNotNull(tag20);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "<#root>\n</#root>" + "'", str23, "<#root>\n</#root>");
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertNotNull(elements31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "\n<#root class=\"\">\n</#root>" + "'", str32, "\n<#root class=\"\">\n</#root>");
        org.junit.Assert.assertNotNull(element34);
        org.junit.Assert.assertNotNull(elements36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test250");
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
        // The following exception was thrown during execution in test generation
        try {
            document1.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
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
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test251");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("#root", "#root");
        org.jsoup.nodes.Element element4 = document2.addClass("<#root>\n</#root>");
        java.lang.String str5 = element4.baseUri();
        org.jsoup.nodes.Element element7 = element4.prepend("<#root class=\"\">\n</#root>");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#root" + "'", str5, "#root");
        org.junit.Assert.assertNotNull(element7);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test252");
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
        org.jsoup.nodes.Element element28 = document26.prependElement("hi!");
        org.jsoup.select.Elements elements30 = document26.getElementsByClass("org.jsoup.select.Selector$SelectorParseException: hi!");
        boolean boolean31 = elements23.add((org.jsoup.nodes.Element) document26);
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
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertNotNull(elements30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test253");
        org.jsoup.nodes.Document document2 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str3 = document2.tagName();
        java.lang.String str4 = document2.html();
        org.jsoup.nodes.Element element6 = document2.append("hi!");
        boolean boolean8 = document2.hasAttr("#declaration");
        org.jsoup.nodes.Document document11 = org.jsoup.Jsoup.parseBodyFragment("#root=\"\"", "<#root>\n</#root>");
        java.lang.String str12 = document11.toString();
        java.lang.String str13 = document11.nodeName();
        java.lang.String str14 = document11.outerHtml();
        org.jsoup.nodes.Element element15 = document11.body();
        org.jsoup.nodes.Document document16 = document11.normalise();
        org.jsoup.nodes.Element element17 = document2.prependChild((org.jsoup.nodes.Node) document16);
        java.util.List<org.jsoup.nodes.Node> nodeList18 = document2.childNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements19 = org.jsoup.select.Selector.select("org.jsoup.select.Selector$SelectorParseException: <html>\n<head>\n</head>\n<body>\n</body>\n</html>", (org.jsoup.nodes.Element) document2);
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query org.jsoup.select.Selector$SelectorParseException: <html>?<head>?</head>?<body>?</body>?</html>");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#root" + "'", str3, "#root");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>" + "'", str4, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>" + "'", str12, "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "#document" + "'", str13, "#document");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>" + "'", str14, "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>");
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(document16);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(nodeList18);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test254");
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
        attributes2.put("#root=\"\"", "");
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor39 = attributes2.iterator();
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
        org.junit.Assert.assertNotNull(attributeItor39);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test255");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("#root=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;\"", "ohi!");
        org.jsoup.nodes.Document document4 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str5 = document4.tagName();
        org.jsoup.nodes.Element element7 = document4.append("hi!");
        java.lang.String str8 = document4.outerHtml();
        org.jsoup.select.Elements elements9 = document4.children();
        java.lang.String str11 = elements9.attr("hi!");
        boolean boolean12 = attribute2.equals((java.lang.Object) str11);
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertNotNull(document4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#root" + "'", str5, "#root");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!" + "'", str8, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!");
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test256");
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parseBodyFragment("#root=\"\"", "<#root>\n</#root>");
        java.lang.String str3 = document2.nodeName();
        org.jsoup.select.Elements elements5 = document2.getElementsByIndexEquals(10);
        org.jsoup.nodes.Document document8 = org.jsoup.parser.Parser.parse("", "\n<!--#root=\"\"-->");
        boolean boolean9 = document2.equals((java.lang.Object) "\n<!--#root=\"\"-->");
        org.jsoup.nodes.Element element11 = document2.wrap("hi");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(element11);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test257");
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
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor21 = elements20.listIterator();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(elementItor12);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(elements20);
        org.junit.Assert.assertNotNull(elementItor21);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test258");
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
        boolean boolean43 = tokenQueue37.matchChomp("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
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
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test259");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str2 = document1.tagName();
        java.lang.String str3 = document1.html();
        org.jsoup.nodes.Element element5 = document1.append("hi!");
        org.jsoup.nodes.Element element6 = element5.parent();
        java.util.Set<java.lang.String> strSet7 = element5.classNames();
        org.jsoup.nodes.Element element9 = element5.prependElement("[., j, s, o, u, p, ., s, e, l, e, c, t, ., S, e, l, e, c, t, o, r, $, S, e, l, e, c, t, o, r, P, a, r, s, e, E, x, c, e, p, t, i, o, n, :,  , h, i, !, <, h, t, m, l, >, \n, <, h, e, a, d, >, \n, <, /, h, e, a, d, >, \n, <, b, o, d, y, >, \n, <, /, b, o, d, y, >, \n, <, /, h, t, m, l, >]");
        org.jsoup.nodes.Element element11 = element9.appendElement("#root=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;\"");
        org.jsoup.select.Elements elements13 = element11.getElementsByIndexGreaterThan(0);
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#root" + "'", str2, "#root");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>" + "'", str3, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNull(element6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(elements13);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test260");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("<html>\n<head>\n</head>\n<body>\n org.jsoup.select.Selector$SelectorParseException: hi!\n <html> \n  <head> \n  </head> \n  <body>  \n  </body>\n </html>\n</body>\n</html>", "#data");
        org.jsoup.nodes.Element element4 = document2.removeClass("#comment");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test261");
        org.jsoup.safety.Whitelist whitelist1 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.jsoup.Jsoup.isValid("<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>", whitelist1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test262");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str2 = document1.tagName();
        org.jsoup.nodes.Element element4 = document1.append("hi!");
        java.lang.String str5 = document1.outerHtml();
        org.jsoup.select.Elements elements6 = document1.children();
        org.jsoup.select.Elements elements7 = document1.children();
        org.jsoup.select.Elements elements9 = elements7.html("<!<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!>");
        boolean boolean10 = elements7.isEmpty();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#root" + "'", str2, "#root");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!" + "'", str5, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test263");
        org.jsoup.nodes.Document document3 = org.jsoup.parser.Parser.parse("", "\n<!--#root=\"\"-->");
        org.jsoup.select.Elements elements6 = document3.getElementsByAttributeValueContaining("\n<!--#root=\"\"-->", "#root=\"hi!\"");
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("#root");
        boolean boolean10 = document9.hasText();
        org.jsoup.select.Elements elements12 = document9.getElementsByIndexEquals(10);
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor13 = elements12.listIterator();
        org.jsoup.select.Elements elements16 = elements12.attr("<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "hi!");
        org.jsoup.select.Elements elements17 = org.jsoup.select.Selector.select("#root", (java.lang.Iterable<org.jsoup.nodes.Element>) elements12);
        org.jsoup.select.Elements elements18 = new org.jsoup.select.Elements((java.util.Collection<org.jsoup.nodes.Element>) elements12);
        boolean boolean19 = elements6.containsAll((java.util.Collection<org.jsoup.nodes.Element>) elements12);
        org.jsoup.select.Elements elements21 = elements12.val(".jsoup.select.Selector$SelectorParseException: hi!<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements22 = org.jsoup.select.Selector.select("", (java.lang.Iterable<org.jsoup.nodes.Element>) elements12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(elementItor13);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(elements21);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test264");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("#root", "#root");
        java.lang.String str4 = document2.absUrl("#root=\"\"");
        document2.title("#document");
        document2.setBaseUri("<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!");
        java.lang.String str9 = document2.outerHtml();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<html>\n<head>\n <title>#document</title>\n</head>\n<body>\n #root\n</body>\n</html>" + "'", str9, "<html>\n<head>\n <title>#document</title>\n</head>\n<body>\n #root\n</body>\n</html>");
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test265");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("#root", "#root");
        org.jsoup.nodes.Element element4 = document2.addClass("<#root>\n</#root>");
        org.jsoup.nodes.Element element6 = document2.append("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element9 = element6.attr("&lt;html&gt;\n &lt;head&gt;\n &lt;/head&gt;\n &lt;body&gt;\n &lt;/body&gt;\n&lt;/html&gt;hi!\n\n&lt;html&gt;\n &lt;head&gt;\n &lt;/head&gt;\n &lt;body&gt;\n &lt;/body&gt;\n&lt;/html&gt;\n\n &lt;head&gt;\n &lt;/head&gt;\n\n &lt;body&gt;\n &lt;/body&gt;", "#comment");
        java.lang.String str10 = element9.text();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#root" + "'", str10, "#root");
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test266");
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
        org.jsoup.nodes.Document document21 = org.jsoup.Jsoup.parseBodyFragment("<!<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!>");
        // The following exception was thrown during execution in test generation
        try {
            elements16.add(2, (org.jsoup.nodes.Element) document21);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 2, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(document21);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test267");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("", "\n<#root class=\"\">\n</#root>");
        org.junit.Assert.assertNotNull(document2);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test268");
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
        boolean boolean20 = elements4.hasText();
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
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test269");
        org.jsoup.safety.Whitelist whitelist1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.jsoup.Jsoup.clean("org.jsoup.select.Selector$SelectorParseException: hi!<html>\n<head>\n</head>\n<body>\n</body>\n</html>", whitelist1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test270");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str2 = document1.tagName();
        org.jsoup.nodes.Element element4 = document1.append("hi!");
        org.jsoup.select.Elements elements6 = document1.getElementsByIndexGreaterThan((int) (short) 10);
        org.jsoup.nodes.Element element8 = document1.text("<?#root=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;\">");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#root" + "'", str2, "#root");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test271");
        org.jsoup.nodes.Evaluator evaluator0 = null;
        org.jsoup.nodes.Document document2 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element4 = document2.prependElement("hi!");
        org.jsoup.nodes.Element element6 = element4.append("");
        org.jsoup.nodes.Element element7 = element6.previousElementSibling();
        java.lang.String str8 = element6.nodeName();
        org.jsoup.nodes.Element element10 = element6.appendElement("#declaration");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements11 = org.jsoup.select.Collector.collect(evaluator0, element6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNull(element7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(element10);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test272");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str2 = document1.tagName();
        org.jsoup.parser.Tag tag3 = document1.tag();
        java.lang.String str4 = document1.outerHtml();
        java.lang.String str5 = document1.outerHtml();
        org.jsoup.nodes.Element element7 = document1.prepend("hi");
        org.jsoup.nodes.Element element8 = element7.empty();
        java.lang.String str9 = element8.toString();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#root" + "'", str2, "#root");
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>" + "'", str4, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>" + "'", str5, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test273");
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
        int int44 = elements43.size();
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
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test274");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("#root=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;\"");
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
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test275");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("#root", "#root");
        org.jsoup.nodes.Element element4 = document2.addClass("<#root>\n</#root>");
        org.jsoup.nodes.Element element6 = document2.append("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.lang.String str7 = document2.title();
        org.jsoup.nodes.Element element8 = document2.empty();
        org.jsoup.nodes.Element element10 = document2.createElement("<?<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!>");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test276");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parse("<#root>\n<html>\n <head>\n </head>\n <body>\n  #root=&quot;&quot;\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node3 = document1.childNode((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test277");
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
        org.jsoup.nodes.Element element21 = element13.prepend("hi");
        java.lang.String str22 = element21.className();
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
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test278");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str2 = document1.tagName();
        org.jsoup.select.Elements elements4 = document1.getElementsByIndexGreaterThan((-1));
        boolean boolean5 = elements4.isEmpty();
        org.jsoup.select.Elements elements7 = elements4.append("\n<!--#root=\"\"-->");
        org.jsoup.select.Elements elements9 = elements7.removeAttr("#declaration");
        org.jsoup.nodes.Document document11 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str12 = document11.tagName();
        org.jsoup.parser.Tag tag13 = document11.tag();
        org.jsoup.nodes.Element element15 = new org.jsoup.nodes.Element(tag13, "#root=\"\"");
        java.lang.String str16 = element15.toString();
        org.jsoup.nodes.Element element18 = element15.text("");
        org.jsoup.nodes.Element element20 = element15.removeClass("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.select.Elements elements22 = element15.getElementsByIndexGreaterThan(0);
        boolean boolean23 = elements7.add(element15);
        // The following exception was thrown during execution in test generation
        try {
            element15.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#root" + "'", str2, "#root");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "#root" + "'", str12, "#root");
        org.junit.Assert.assertNotNull(tag13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<#root>\n</#root>" + "'", str16, "<#root>\n</#root>");
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(elements22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test279");
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parseBodyFragment("#root=\"\"", "<#root>\n</#root>");
        org.jsoup.nodes.Element element3 = document2.head();
        org.jsoup.select.Elements elements4 = element3.siblingElements();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(elements4);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test280");
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
        java.lang.String str18 = document2.title();
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test281");
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
        org.junit.Assert.assertNotNull(document35);
        org.junit.Assert.assertNotNull(strSet36);
        org.junit.Assert.assertNotNull(element37);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test282");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parse("");
        org.jsoup.parser.Tag tag2 = document1.tag();
        org.jsoup.select.Elements elements4 = document1.getElementsByIndexGreaterThan(10);
        org.jsoup.nodes.Attribute attribute7 = new org.jsoup.nodes.Attribute("#root", "");
        java.lang.String str8 = attribute7.getKey();
        attribute7.setKey("#root=\"\"");
        java.lang.String str11 = attribute7.toString();
        attribute7.setKey("\n<!--#root=\"\"-->");
        org.jsoup.nodes.Document document16 = org.jsoup.Jsoup.parseBodyFragment("#root=\"\"", "<#root>\n</#root>");
        java.lang.String str17 = document16.nodeName();
        org.jsoup.select.Elements elements19 = document16.getElementsByIndexEquals(10);
        org.jsoup.nodes.Document document22 = org.jsoup.parser.Parser.parse("", "\n<!--#root=\"\"-->");
        boolean boolean23 = document16.equals((java.lang.Object) "\n<!--#root=\"\"-->");
        org.jsoup.nodes.Element element25 = document16.prepend("<html>\n <head>\n </head>\n <body>\n </body>\n</html>hi!\n\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n\n <head>\n </head>\n\n <body>\n </body>");
        boolean boolean26 = attribute7.equals((java.lang.Object) element25);
        org.jsoup.select.Elements elements28 = element25.getElementsByClass("#root");
        // The following exception was thrown during execution in test generation
        try {
            document1.replaceWith((org.jsoup.nodes.Node) element25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(tag2);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#root" + "'", str8, "#root");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#root=\"\"=\"\"" + "'", str11, "#root=\"\"=\"\"");
        org.junit.Assert.assertNotNull(document16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "#document" + "'", str17, "#document");
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertNotNull(document22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(elements28);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test283");
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parseBodyFragment("#root=\"\"", "<#root>\n</#root>");
        java.lang.String str3 = document2.toString();
        java.lang.String str4 = document2.nodeName();
        java.lang.String str5 = document2.outerHtml();
        org.jsoup.nodes.Element element6 = document2.body();
        org.jsoup.nodes.Document document7 = document2.normalise();
        document7.setBaseUri(" text=\"hi!\"");
        org.jsoup.nodes.Element element10 = document7.head();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>" + "'", str3, "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#document" + "'", str4, "#document");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>" + "'", str5, "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNotNull(element10);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test284");
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
        org.jsoup.nodes.Element element19 = document2.addClass("<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>");
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
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test285");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element3 = document1.prependElement("hi!");
        org.jsoup.nodes.Document document6 = org.jsoup.parser.Parser.parseBodyFragment("#root", "#root");
        org.jsoup.nodes.Element element8 = document6.addClass("<#root>\n</#root>");
        element3.replaceWith((org.jsoup.nodes.Node) document6);
        org.jsoup.nodes.Element element11 = element3.val("\n<!--#root=\"\"-->");
        java.lang.String str12 = element11.val();
        org.jsoup.nodes.Element element13 = element11.parent();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\n<!--#root=\"\"-->" + "'", str12, "\n<!--#root=\"\"-->");
        org.junit.Assert.assertNull(element13);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test286");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element3 = document1.prependElement("hi!");
        java.lang.String str4 = element3.tagName();
        org.jsoup.nodes.Element element6 = element3.prependElement("<#root>\n</#root>");
        org.jsoup.nodes.Element element7 = element6.firstElementSibling();
        java.lang.String str8 = element6.val();
        org.jsoup.nodes.Element element10 = element6.html("<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNull(element7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(element10);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test287");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("#root", "#root");
        org.jsoup.nodes.Element element4 = document2.addClass("<#root>\n</#root>");
        java.lang.String str5 = element4.text();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#root" + "'", str5, "#root");
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test288");
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
        org.jsoup.select.Elements elements45 = elements43.prepend("");
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
        org.junit.Assert.assertNotNull(elements45);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test289");
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
        org.jsoup.select.Elements elements20 = element19.getAllElements();
        java.util.function.UnaryOperator<org.jsoup.nodes.Element> elementUnaryOperator21 = null;
        // The following exception was thrown during execution in test generation
        try {
            elements20.replaceAll(elementUnaryOperator21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
        org.junit.Assert.assertNotNull(elements20);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test290");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.select.Elements elements3 = document1.getElementsByTag("#root");
        boolean boolean5 = elements3.hasAttr("#root");
        org.jsoup.nodes.Document document7 = new org.jsoup.nodes.Document("#root");
        boolean boolean8 = document7.hasText();
        org.jsoup.select.Elements elements10 = document7.getElementsByIndexEquals(10);
        org.jsoup.select.Elements elements13 = document7.getElementsByAttributeValueEnding("<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!", "hi!");
        boolean boolean14 = elements3.containsAll((java.util.Collection<org.jsoup.nodes.Element>) elements13);
        org.jsoup.nodes.Document document17 = org.jsoup.Jsoup.parseBodyFragment("#root", "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>");
        java.lang.String str18 = document17.data();
        java.lang.Object obj19 = null;
        boolean boolean20 = document17.equals(obj19);
        org.jsoup.select.Elements elements22 = document17.getElementsByIndexLessThan((int) (short) 1);
        boolean boolean23 = elements3.remove((java.lang.Object) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Element> elementList26 = elements3.subList((int) '<', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: toIndex = 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(document17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(elements22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test291");
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parseBodyFragment("#root", "");
        org.junit.Assert.assertNotNull(document2);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test292");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str2 = document1.tagName();
        java.lang.String str3 = document1.html();
        org.jsoup.nodes.Element element5 = document1.append("hi!");
        org.jsoup.select.Elements elements7 = element5.getElementsByIndexLessThan((int) (short) -1);
        org.jsoup.select.Elements elements9 = elements7.removeClass("<html>\n<head>\n</head>\n<body>\n org.jsoup.select.Selector$SelectorParseException: hi!&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#root" + "'", str2, "#root");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>" + "'", str3, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(elements9);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test293");
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parseBodyFragment("#root=\"\"", "<#root>\n</#root>");
        java.lang.String str3 = document2.toString();
        java.lang.String str4 = document2.nodeName();
        document2.title("<#root>\n</#root>=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;\"");
        org.jsoup.nodes.Element element8 = document2.prepend("<html>\n<head>\n</head>\n<body>\n org.jsoup.select.Selector$SelectorParseException: hi!\n <html> \n  <head> \n  </head> \n  <body>  \n  </body>\n </html>\n</body>\n</html>");
        org.jsoup.nodes.Element element10 = element8.prepend(" #root=\"\"=\"\"");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>" + "'", str3, "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#document" + "'", str4, "#document");
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test294");
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
        org.jsoup.nodes.Element element40 = element22.firstElementSibling();
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
        org.junit.Assert.assertNull(element40);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test295");
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parse("<#root>\n<html>\n <head>\n </head>\n <body>\n  #root=&quot;&quot;\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!", "");
        org.junit.Assert.assertNotNull(document2);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test296");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements21 = elements4.select("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query <html>?<head>?</head>?<body>?</body>?</html>");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
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
        org.junit.Assert.assertNotNull(elementSpliterator19);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test297");
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parseBodyFragment("#root=\"\"", "<#root>\n</#root>");
        java.lang.String str3 = document2.nodeName();
        org.jsoup.nodes.Element element4 = document2.empty();
        org.jsoup.nodes.Element element6 = element4.prepend("<#root>\n</#root>=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;\"");
        org.jsoup.nodes.Element element8 = element6.val("<!hi!>");
        org.jsoup.nodes.Element element10 = element8.val("<!--#root=\"\"-->");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test298");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str2 = document1.tagName();
        org.jsoup.nodes.Element element4 = document1.append("hi!");
        java.lang.String str5 = document1.outerHtml();
        org.jsoup.select.Elements elements6 = document1.children();
        org.jsoup.nodes.Document document8 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.select.Elements elements10 = document8.getElementsByTag("#root");
        boolean boolean11 = document1.equals((java.lang.Object) document8);
        org.jsoup.nodes.Element element13 = document8.append("#text");
        java.lang.String str14 = element13.tagName();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#root" + "'", str2, "#root");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!" + "'", str5, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#root" + "'", str14, "#root");
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test299");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element3 = document1.prependElement("hi!");
        org.jsoup.nodes.Document document6 = org.jsoup.parser.Parser.parseBodyFragment("#root", "#root");
        org.jsoup.nodes.Element element8 = document6.addClass("<#root>\n</#root>");
        element3.replaceWith((org.jsoup.nodes.Node) document6);
        org.jsoup.nodes.Element element11 = element3.toggleClass("#root=\"hi!\"");
        org.jsoup.nodes.Element element13 = element11.toggleClass("hi");
        org.jsoup.select.Elements elements15 = element13.getElementsByIndexGreaterThan((int) (byte) 0);
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(elements15);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test300");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element3 = document1.prependElement("hi!");
        org.jsoup.nodes.Element element5 = element3.append("");
        org.jsoup.nodes.Element element6 = element5.previousElementSibling();
        org.jsoup.nodes.Element element8 = element5.toggleClass("<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>");
        boolean boolean9 = element5.hasText();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test301");
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parseBodyFragment("#root", "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>");
        org.jsoup.nodes.Element element4 = document2.toggleClass("org.jsoup.select.Selector$SelectorParseException: <html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element6 = element4.val("org.jsoup.select.Selector$SelectorParseException: hi!");
        java.util.Set<java.lang.String> strSet7 = element6.classNames();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(strSet7);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test302");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str2 = document1.tagName();
        org.jsoup.nodes.Element element4 = document1.append("hi!");
        org.jsoup.nodes.Element element6 = document1.html("org.jsoup.select.Selector$SelectorParseException: hi!");
        org.jsoup.nodes.Element element8 = document1.prependText("<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>");
        org.jsoup.nodes.Element element10 = document1.createElement("aorg");
        org.jsoup.nodes.Node node11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element12 = document1.prependChild(node11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#root" + "'", str2, "#root");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test303");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str2 = document1.tagName();
        org.jsoup.nodes.Element element4 = document1.append("hi!");
        java.lang.String str5 = element4.outerHtml();
        boolean boolean7 = element4.equals((java.lang.Object) 1.0f);
        java.lang.String str8 = element4.nodeName();
        org.jsoup.nodes.Element element10 = element4.wrap("#comment");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<java.lang.String> strSet11 = element10.classNames();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#root" + "'", str2, "#root");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!" + "'", str5, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#document" + "'", str8, "#document");
        org.junit.Assert.assertNull(element10);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test304");
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
        org.jsoup.select.Elements elements37 = elements10.prepend("#text");
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
        org.junit.Assert.assertNotNull(elements37);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test305");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("", " #root=\"\"=\"\"");
        org.jsoup.nodes.Element element3 = document2.head();
        org.jsoup.nodes.Node node4 = document2.parent();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNull(node4);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test306");
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
        org.jsoup.select.Elements elements45 = new org.jsoup.select.Elements((java.util.List<org.jsoup.nodes.Element>) elements43);
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
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test307");
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
        org.jsoup.nodes.Document document37 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str38 = document37.tagName();
        org.jsoup.select.Elements elements40 = document37.getElementsByIndexGreaterThan((-1));
        org.jsoup.nodes.Element element42 = document37.text("org.jsoup.select.Selector$SelectorParseException: hi!<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        boolean boolean43 = elements33.add((org.jsoup.nodes.Element) document37);
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
        org.junit.Assert.assertNotNull(document37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "#root" + "'", str38, "#root");
        org.junit.Assert.assertNotNull(elements40);
        org.junit.Assert.assertNotNull(element42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test308");
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parse("<html>\n<head>\n</head>\n<body>\n &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;hi!\n</body>\n</html>", " text=\"hi!\"");
        org.junit.Assert.assertNotNull(document2);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test309");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element3 = document1.prependElement("hi!");
        org.jsoup.nodes.Element element5 = element3.append("");
        org.jsoup.nodes.Element element6 = element5.previousElementSibling();
        org.jsoup.nodes.Element element8 = element5.html("#root=\"\"");
        org.jsoup.nodes.Node node9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element10 = element8.prependChild(node9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNull(element6);
        org.junit.Assert.assertNotNull(element8);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test310");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("#root", "#root");
        org.jsoup.nodes.Element element4 = document2.addClass("<#root>\n</#root>");
        org.jsoup.select.Elements elements5 = element4.children();
        org.jsoup.select.Elements elements7 = elements5.prepend(" text=\"hi!\"");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Element> elementList10 = elements7.subList((int) '#', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(35) > toIndex(0)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elements7);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test311");
        org.jsoup.safety.Whitelist whitelist1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.jsoup.Jsoup.clean("<#root class=\"\">\n</#root>", whitelist1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test312");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element3 = document1.prependElement("hi!");
        org.jsoup.nodes.Element element5 = element3.append("");
        org.jsoup.nodes.Element element7 = element3.prepend("<#root>\n</#root>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node9 = element3.childNode((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test313");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element3 = document1.prependElement("hi!");
        org.jsoup.nodes.Document document6 = org.jsoup.parser.Parser.parseBodyFragment("#root", "#root");
        org.jsoup.nodes.Element element8 = document6.addClass("<#root>\n</#root>");
        element3.replaceWith((org.jsoup.nodes.Node) document6);
        org.jsoup.nodes.Element element11 = element3.val("\n<!--#root=\"\"-->");
        element11.setBaseUri("ohi!");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element11);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test314");
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
        org.jsoup.select.Elements elements21 = new org.jsoup.select.Elements((java.util.Collection<org.jsoup.nodes.Element>) elements6);
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
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test315");
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
        boolean boolean27 = elements24.hasAttr("<#root>\n</#root>=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;\"");
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
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test316");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("#root", "#root");
        java.lang.String str3 = document2.nodeName();
        org.jsoup.nodes.Element element5 = document2.text("<html>\n <head>\n </head>\n <body>\n </body>\n</html>hi!\n<head>\n </head>\n <body>\n </body>\n\n");
        org.jsoup.nodes.Element element6 = document2.body();
        java.lang.String str7 = document2.className();
        document2.title("ohi");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test317");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("", "");
        java.lang.String str3 = document2.nodeName();
        java.lang.String str4 = document2.className();
        document2.setBaseUri(".jsoup.select.Selector$SelectorParseException: hi!<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test318");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parse("<#root>\n</#root>");
        boolean boolean3 = document1.hasClass("#text");
        org.jsoup.select.Elements elements5 = document1.getElementsByIndexLessThan((int) (short) 0);
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(elements5);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test319");
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parse("#root=\"hi!\"", "#declaration");
        org.jsoup.select.Elements elements3 = document2.getAllElements();
        org.jsoup.nodes.Element element5 = document2.prepend("[., j, s, o, u, p, ., s, e, l, e, c, t, ., S, e, l, e, c, t, o, r, $, S, e, l, e, c, t, o, r, P, a, r, s, e, E, x, c, e, p, t, i, o, n, :,  , h, i, !, <, h, t, m, l, >, \n, <, h, e, a, d, >, \n, <, /, h, e, a, d, >, \n, <, b, o, d, y, >, \n, <, /, b, o, d, y, >, \n, <, /, h, t, m, l, >]");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test320");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element3 = document1.prependElement("hi!");
        org.jsoup.nodes.Element element5 = element3.append("");
        org.jsoup.nodes.Element element6 = element5.previousElementSibling();
        org.jsoup.nodes.Element element8 = element5.toggleClass("<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>");
        boolean boolean9 = element8.isBlock();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test321");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parse("<#root class=\"\">\n</#root>");
        org.junit.Assert.assertNotNull(document1);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test322");
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
        java.lang.String str55 = element54.html();
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
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "<?#root=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;\"><#root text=\"hi!\" #root=\"\"=\"\"=\"\n&lt;!--#root=&quot;&quot;--&gt;\" &lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;hi!=\"org.jsoup.select.Selector$SelectorParseException: hi!&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;\">\n</#root>hi!" + "'", str55, "<?#root=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;\"><#root text=\"hi!\" #root=\"\"=\"\"=\"\n&lt;!--#root=&quot;&quot;--&gt;\" &lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;hi!=\"org.jsoup.select.Selector$SelectorParseException: hi!&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;\">\n</#root>hi!");
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test323");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor1 = attributes0.iterator();
        boolean boolean3 = attributes0.hasKey("");
        attributes0.remove("#root=\"\"");
        java.lang.String str6 = attributes0.html();
        java.lang.String str7 = attributes0.toString();
        org.jsoup.nodes.Attribute attribute10 = new org.jsoup.nodes.Attribute("#root", "");
        java.lang.String str11 = attribute10.getKey();
        attribute10.setKey("#root=\"\"");
        attributes0.put(attribute10);
        java.lang.String str15 = attributes0.toString();
        org.jsoup.nodes.Document document17 = new org.jsoup.nodes.Document("#root");
        boolean boolean18 = document17.hasText();
        org.jsoup.select.Elements elements20 = document17.getElementsByIndexEquals(10);
        java.lang.Object[] objArray21 = elements20.toArray();
        org.jsoup.nodes.Document document24 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element26 = document24.prependElement("hi!");
        org.jsoup.nodes.Element element27 = element26.parent();
        org.jsoup.nodes.Element element28 = element26.empty();
        elements20.add(0, element28);
        org.jsoup.nodes.Document document31 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str32 = document31.tagName();
        org.jsoup.parser.Tag tag33 = document31.tag();
        org.jsoup.nodes.TextNode textNode36 = new org.jsoup.nodes.TextNode("hi!", "");
        org.jsoup.nodes.Node node37 = textNode36.parent();
        org.jsoup.nodes.Element element38 = document31.appendChild((org.jsoup.nodes.Node) textNode36);
        org.jsoup.select.Elements elements40 = element38.getElementsByClass("#root");
        org.jsoup.nodes.Element element41 = element28.prependChild((org.jsoup.nodes.Node) element38);
        org.jsoup.select.Elements elements43 = element38.getElementsByAttribute("#root=\"hi!\"");
        org.jsoup.nodes.Document document45 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str46 = document45.tagName();
        org.jsoup.nodes.Element element48 = document45.append("hi!");
        java.lang.String str49 = element48.outerHtml();
        boolean boolean51 = element48.equals((java.lang.Object) 1.0f);
        java.lang.String str52 = element48.nodeName();
        org.jsoup.nodes.Element element54 = element48.wrap("#comment");
        org.jsoup.nodes.Element element55 = element38.appendChild((org.jsoup.nodes.Node) element48);
        org.jsoup.select.Elements elements57 = element55.getElementsByClass("<?<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!>");
        org.jsoup.nodes.Element element59 = element55.toggleClass("#comment");
        org.jsoup.select.Elements elements60 = element55.getAllElements();
        boolean boolean61 = attributes0.equals((java.lang.Object) elements60);
        java.lang.String str62 = elements60.html();
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#root" + "'", str11, "#root");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + " #root=\"\"=\"\"" + "'", str15, " #root=\"\"=\"\"");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(elements20);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[]");
        org.junit.Assert.assertNotNull(document24);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertNotNull(document31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "#root" + "'", str32, "#root");
        org.junit.Assert.assertNotNull(tag33);
        org.junit.Assert.assertNull(node37);
        org.junit.Assert.assertNotNull(element38);
        org.junit.Assert.assertNotNull(elements40);
        org.junit.Assert.assertNotNull(element41);
        org.junit.Assert.assertNotNull(elements43);
        org.junit.Assert.assertNotNull(document45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "#root" + "'", str46, "#root");
        org.junit.Assert.assertNotNull(element48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!" + "'", str49, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "#document" + "'", str52, "#document");
        org.junit.Assert.assertNull(element54);
        org.junit.Assert.assertNotNull(element55);
        org.junit.Assert.assertNotNull(elements57);
        org.junit.Assert.assertNotNull(element59);
        org.junit.Assert.assertNotNull(elements60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "<html>\n  <head>\n  </head>\n  <body>\n  </body>\n </html>hi!<#root>\n  <html>\n   <head>\n   </head>\n   <body>\n   </body>\n  </html>hi!\n </#root>\n<head>\n  </head>\n  <body>\n  </body>\n\n\n<html>\n   <head>\n   </head>\n   <body>\n   </body>\n  </html>hi!\n<head>\n   </head>\n   <body>\n   </body>\n\n" + "'", str62, "<html>\n  <head>\n  </head>\n  <body>\n  </body>\n </html>hi!<#root>\n  <html>\n   <head>\n   </head>\n   <body>\n   </body>\n  </html>hi!\n </#root>\n<head>\n  </head>\n  <body>\n  </body>\n\n\n<html>\n   <head>\n   </head>\n   <body>\n   </body>\n  </html>hi!\n<head>\n   </head>\n   <body>\n   </body>\n\n");
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test324");
        org.jsoup.nodes.Document document2 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element4 = document2.prependElement("hi!");
        org.jsoup.nodes.Element element6 = element4.append("");
        org.jsoup.select.Elements elements7 = org.jsoup.select.Selector.select("#root", element6);
        java.lang.String str8 = element6.id();
        org.jsoup.select.Elements elements11 = element6.getElementsByAttributeValueNot("<html>\n <head>\n </head>\n <body>\n </body>\n</html>hi!\n<head>\n </head>\n <body>\n </body>\n\n", "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(elements11);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test325");
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
        java.util.List<org.jsoup.nodes.Node> nodeList40 = element22.siblingNodes();
        java.lang.String str41 = element22.tagName();
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
        org.junit.Assert.assertNotNull(nodeList40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "#root" + "'", str41, "#root");
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test326");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("org.jsoup.select.Selector$SelectorParseException: hi!<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element3 = document1.text("<?#root=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;\">");
        org.jsoup.select.Elements elements6 = element3.getElementsByAttributeValueNot("org.jsoup.select.Selector$SelectorParseException: <#root>\n</#root>", "\n&lt;!--#root=&quot;&quot;--&gt;");
        java.lang.String str8 = element3.attr("");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test327");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element18 = element17.lastElementSibling();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
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
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test328");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("#root", "#root");
        java.lang.String str4 = document2.absUrl("#root=\"\"");
        document2.title("#document");
        org.jsoup.parser.Tag tag7 = document2.tag();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(tag7);
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test329");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("#root", "#root");
        org.jsoup.nodes.Element element4 = document2.addClass("<#root>\n</#root>");
        org.jsoup.nodes.Element element6 = element4.getElementById("<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>");
        org.jsoup.nodes.Element element8 = element4.prependElement("<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>");
        org.jsoup.nodes.Element element10 = element4.prependElement("<!hi!>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element12 = element10.child(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test330");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element3 = document1.prependElement("hi!");
        org.jsoup.nodes.Element element5 = element3.append("");
        org.jsoup.nodes.Element element7 = element3.prepend("<#root>\n</#root>");
        org.jsoup.select.Elements elements10 = element3.getElementsByAttributeValueStarting("#root=&quot;&quot;", "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>");
        java.lang.String str11 = elements10.html();
        org.jsoup.select.Elements elements13 = elements10.addClass("<#root>\n<html>\n <head>\n </head>\n <body>\n  #root=&quot;&quot;\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!");
        java.util.Spliterator<org.jsoup.nodes.Element> elementSpliterator14 = elements10.spliterator();
        org.jsoup.select.Elements elements16 = elements10.wrap("#declaration");
        org.jsoup.nodes.Element element17 = elements10.first();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(elementSpliterator14);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertNull(element17);
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test331");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str2 = document1.tagName();
        org.jsoup.nodes.Element element4 = document1.append("hi!");
        java.lang.String str5 = document1.outerHtml();
        org.jsoup.select.Elements elements6 = document1.children();
        org.jsoup.nodes.Element element8 = document1.val("<!hi!>");
        org.jsoup.nodes.Element element10 = document1.val("h");
        org.jsoup.nodes.Element element11 = document1.head();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#root" + "'", str2, "#root");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!" + "'", str5, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element11);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test332");
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
        // The following exception was thrown during execution in test generation
        try {
            element20.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
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
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test333");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parse("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueStarting("hi\n<!--#root=\"\"-->org.jsoup.select.Selector$SelectorParseException: hi!<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test334");
        org.jsoup.nodes.Document document2 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element4 = document2.prependElement("hi!");
        org.jsoup.nodes.Element element6 = element4.append("");
        org.jsoup.select.Elements elements7 = org.jsoup.select.Selector.select("#root", element6);
        org.jsoup.nodes.Element element8 = elements7.last();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element10 = elements7.get((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNull(element8);
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test335");
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
        java.lang.String str33 = document25.nodeName();
        org.jsoup.nodes.Element element35 = document25.prependText("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
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
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "#document" + "'", str33, "#document");
        org.junit.Assert.assertNotNull(element35);
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test336");
        org.jsoup.nodes.Document document2 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element4 = document2.prependElement("hi!");
        org.jsoup.nodes.Element element6 = element4.append("");
        org.jsoup.select.Elements elements7 = org.jsoup.select.Selector.select("#root", element6);
        java.lang.String str8 = elements7.text();
        java.lang.String str9 = elements7.outerHtml();
        java.lang.String str10 = elements7.text();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test337");
        org.jsoup.safety.Whitelist whitelist1 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.jsoup.Jsoup.isValid("org.jsoup.select.Selector$SelectorParseException: hi!<html>\n<head>\n</head>\n<body>\n</body>\n</html>", whitelist1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test338");
        org.jsoup.nodes.Document document2 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element4 = document2.prependElement("hi!");
        org.jsoup.nodes.Element element5 = element4.parent();
        org.jsoup.nodes.Element element6 = element4.empty();
        org.jsoup.nodes.Element element7 = element6.empty();
        java.lang.String str8 = element7.nodeName();
        org.jsoup.nodes.Document document10 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str11 = document10.tagName();
        org.jsoup.nodes.Element element13 = document10.append("hi!");
        java.lang.String str14 = document10.outerHtml();
        org.jsoup.select.Elements elements15 = document10.children();
        org.jsoup.nodes.Document document17 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.select.Elements elements19 = document17.getElementsByTag("#root");
        boolean boolean20 = document10.equals((java.lang.Object) document17);
        org.jsoup.nodes.Element element22 = document17.append("#text");
        element7.replaceWith((org.jsoup.nodes.Node) document17);
        org.jsoup.select.Elements elements25 = element7.getElementsByClass(" text=\"hi!\"");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements26 = org.jsoup.select.Selector.select("", element7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#root" + "'", str11, "#root");
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!" + "'", str14, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!");
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(document17);
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(elements25);
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test339");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.select.Elements elements3 = document1.getElementsByTag("#root");
        java.lang.String str4 = elements3.text();
        org.jsoup.nodes.Document document6 = new org.jsoup.nodes.Document("#root");
        boolean boolean7 = document6.hasText();
        org.jsoup.select.Elements elements9 = document6.getElementsByIndexEquals(10);
        java.lang.Object[] objArray10 = elements9.toArray();
        boolean boolean11 = elements3.retainAll((java.util.Collection<org.jsoup.nodes.Element>) elements9);
        org.jsoup.select.Elements elements13 = elements3.wrap("\n<!--#root=\"\"-->");
        org.jsoup.select.Elements elements15 = elements3.eq((int) '.');
        org.jsoup.nodes.Document document17 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str18 = document17.tagName();
        org.jsoup.nodes.Element element20 = document17.append("hi!");
        java.lang.String str21 = document17.outerHtml();
        org.jsoup.select.Elements elements22 = document17.children();
        boolean boolean23 = elements3.containsAll((java.util.Collection<org.jsoup.nodes.Element>) elements22);
        org.jsoup.select.Elements elements25 = elements3.addClass("#root=\"\"");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(document17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "#root" + "'", str18, "#root");
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!" + "'", str21, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!");
        org.junit.Assert.assertNotNull(elements22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(elements25);
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test340");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("#root", "#root");
        java.lang.String str3 = document2.nodeName();
        org.jsoup.nodes.Element element5 = document2.text("<html>\n <head>\n </head>\n <body>\n </body>\n</html>hi!\n<head>\n </head>\n <body>\n </body>\n\n");
        org.jsoup.nodes.Element element7 = element5.val(" #root=\"\"=\"\"");
        java.lang.String str8 = element5.tagName();
        java.lang.String str9 = element5.data();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#root" + "'", str8, "#root");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test341");
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
        tokenQueue25.addFirst((java.lang.Character) '#');
        boolean boolean32 = tokenQueue25.consumeWhitespace();
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
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test342");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element3 = document1.prependElement("hi!");
        org.jsoup.nodes.Element element4 = document1.empty();
        org.jsoup.nodes.Element element6 = element4.toggleClass("");
        org.jsoup.nodes.Document document8 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element10 = document8.prependElement("hi!");
        org.jsoup.nodes.Element element11 = element10.parent();
        org.jsoup.nodes.Element element12 = element10.empty();
        org.jsoup.nodes.Element element13 = element12.empty();
        java.lang.String str14 = element13.nodeName();
        org.jsoup.nodes.Document document16 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str17 = document16.tagName();
        org.jsoup.nodes.Element element19 = document16.append("hi!");
        java.lang.String str20 = document16.outerHtml();
        org.jsoup.select.Elements elements21 = document16.children();
        org.jsoup.nodes.Document document23 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.select.Elements elements25 = document23.getElementsByTag("#root");
        boolean boolean26 = document16.equals((java.lang.Object) document23);
        org.jsoup.nodes.Element element28 = document23.append("#text");
        element13.replaceWith((org.jsoup.nodes.Node) document23);
        org.jsoup.select.Elements elements31 = element13.getElementsByClass(" text=\"hi!\"");
        org.jsoup.nodes.Element element33 = element13.appendElement("<#root>\n</#root>");
        java.lang.String str35 = element13.absUrl("\n&lt;!--#root=&quot;&quot;--&gt;");
        org.jsoup.nodes.Element element36 = element4.prependChild((org.jsoup.nodes.Node) element13);
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(document16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "#root" + "'", str17, "#root");
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!" + "'", str20, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!");
        org.junit.Assert.assertNotNull(elements21);
        org.junit.Assert.assertNotNull(document23);
        org.junit.Assert.assertNotNull(elements25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertNotNull(elements31);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(element36);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test343");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element3 = document1.prependElement("hi!");
        org.jsoup.nodes.Element element5 = element3.append("");
        org.jsoup.nodes.Element element7 = element3.prepend("<#root>\n</#root>");
        org.jsoup.select.Elements elements10 = element3.getElementsByAttributeValueStarting("#root=&quot;&quot;", "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>");
        org.jsoup.nodes.Document document12 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str13 = document12.tagName();
        org.jsoup.parser.Tag tag14 = document12.tag();
        boolean boolean15 = tag14.isEmpty();
        org.jsoup.nodes.Document document17 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str18 = document17.tagName();
        org.jsoup.parser.Tag tag19 = document17.tag();
        org.jsoup.nodes.Element element21 = new org.jsoup.nodes.Element(tag19, "#root=\"\"");
        org.jsoup.nodes.Document document23 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str24 = document23.tagName();
        org.jsoup.parser.Tag tag25 = document23.tag();
        boolean boolean26 = tag19.canContain(tag25);
        boolean boolean27 = tag14.isValidParent(tag19);
        org.jsoup.nodes.Document document29 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element31 = document29.prependElement("hi!");
        org.jsoup.nodes.Element element32 = element31.parent();
        boolean boolean33 = tag19.equals((java.lang.Object) element32);
        org.jsoup.nodes.Attributes attributes35 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor36 = attributes35.iterator();
        java.lang.String str37 = attributes35.toString();
        org.jsoup.nodes.Element element38 = new org.jsoup.nodes.Element(tag19, "", attributes35);
        org.jsoup.nodes.Document document40 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str41 = document40.tagName();
        org.jsoup.parser.Tag tag42 = document40.tag();
        boolean boolean43 = tag42.isEmpty();
        org.jsoup.nodes.TextNode textNode47 = new org.jsoup.nodes.TextNode("hi!", "");
        java.lang.String str48 = textNode47.text();
        org.jsoup.nodes.Attributes attributes49 = textNode47.attributes();
        org.jsoup.nodes.Element element50 = new org.jsoup.nodes.Element(tag42, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!", attributes49);
        attributes35.addAll(attributes49);
        java.util.List<org.jsoup.nodes.Attribute> attributeList52 = attributes49.asList();
        org.jsoup.nodes.DataNode dataNode55 = org.jsoup.nodes.DataNode.createFromEncoded("", "<html>\n<head>\n</head>\n<body>\n org.jsoup.select.Selector$SelectorParseException: hi!&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;\n</body>\n</html>");
        boolean boolean56 = attributes49.equals((java.lang.Object) "");
        boolean boolean57 = element3.equals((java.lang.Object) boolean56);
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "#root" + "'", str13, "#root");
        org.junit.Assert.assertNotNull(tag14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(document17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "#root" + "'", str18, "#root");
        org.junit.Assert.assertNotNull(tag19);
        org.junit.Assert.assertNotNull(document23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "#root" + "'", str24, "#root");
        org.junit.Assert.assertNotNull(tag25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(document29);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertNotNull(element32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(attributeItor36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNotNull(document40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "#root" + "'", str41, "#root");
        org.junit.Assert.assertNotNull(tag42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "hi!" + "'", str48, "hi!");
        org.junit.Assert.assertNotNull(attributes49);
        org.junit.Assert.assertNotNull(attributeList52);
        org.junit.Assert.assertNotNull(dataNode55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test344");
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parseBodyFragment("<#root>\n</#root>", "!");
        org.junit.Assert.assertNotNull(document2);
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test345");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element3 = document1.prependElement("hi!");
        org.jsoup.nodes.Element element5 = element3.append("");
        java.lang.String str6 = element3.nodeName();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test346");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("#root", "#root");
        java.lang.String str3 = document2.nodeName();
        org.jsoup.nodes.Element element5 = document2.text("<html>\n <head>\n </head>\n <body>\n </body>\n</html>hi!\n<head>\n </head>\n <body>\n </body>\n\n");
        org.jsoup.nodes.Document document7 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str8 = document7.tagName();
        java.lang.String str9 = document7.html();
        org.jsoup.nodes.Element element11 = document7.append("#root=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;\"");
        java.util.Set<java.lang.String> strSet12 = element11.classNames();
        org.jsoup.nodes.Element element13 = document2.classNames(strSet12);
        java.lang.String str14 = element13.html();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#root" + "'", str8, "#root");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>" + "'", str9, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<html>\n<head>\n</head>\n<body>\n &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;hi! &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; \n</body>\n</html>" + "'", str14, "<html>\n<head>\n</head>\n<body>\n &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;hi! &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; \n</body>\n</html>");
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test347");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parse("<aorg>\n</aorg>");
        org.junit.Assert.assertNotNull(document1);
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test348");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("#root");
        boolean boolean2 = document1.hasText();
        org.jsoup.select.Elements elements4 = document1.getElementsByIndexEquals(10);
        java.lang.Object[] objArray5 = elements4.toArray();
        org.jsoup.nodes.Attributes attributes6 = new org.jsoup.nodes.Attributes();
        boolean boolean8 = attributes6.equals((java.lang.Object) (byte) 100);
        boolean boolean9 = elements4.contains((java.lang.Object) (byte) 100);
        java.lang.String str10 = elements4.val();
        org.jsoup.nodes.Document document12 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element14 = document12.prependElement("hi!");
        org.jsoup.nodes.Element element16 = element14.append("");
        org.jsoup.nodes.Document document18 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str19 = document18.tagName();
        org.jsoup.nodes.Element element21 = document18.append("hi!");
        org.jsoup.nodes.Document document23 = new org.jsoup.nodes.Document("#root");
        org.jsoup.nodes.Document document25 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.select.Elements elements27 = document25.getElementsByTag("#root");
        org.jsoup.nodes.Element[] elementArray28 = new org.jsoup.nodes.Element[] { element14, element21, document23, document25 };
        org.jsoup.select.Elements elements29 = new org.jsoup.select.Elements(elementArray28);
        java.util.stream.Stream<org.jsoup.nodes.Element> elementStream30 = elements29.parallelStream();
        java.lang.Object obj31 = null;
        boolean boolean32 = elements29.contains(obj31);
        java.util.Spliterator<org.jsoup.nodes.Element> elementSpliterator33 = elements29.spliterator();
        org.jsoup.select.Elements elements35 = elements29.addClass("#root=&quot;&quot;");
        java.util.stream.Stream<org.jsoup.nodes.Element> elementStream36 = elements35.stream();
        org.jsoup.nodes.Document document39 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element41 = document39.prependElement("hi!");
        org.jsoup.nodes.Element element43 = element41.append("");
        org.jsoup.select.Elements elements44 = org.jsoup.select.Selector.select("#root", element43);
        org.jsoup.nodes.Element element45 = elements44.last();
        boolean boolean46 = elements35.containsAll((java.util.Collection<org.jsoup.nodes.Element>) elements44);
        boolean boolean47 = elements4.containsAll((java.util.Collection<org.jsoup.nodes.Element>) elements44);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(document18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "#root" + "'", str19, "#root");
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(document25);
        org.junit.Assert.assertNotNull(elements27);
        org.junit.Assert.assertNotNull(elementArray28);
        org.junit.Assert.assertNotNull(elementStream30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(elementSpliterator33);
        org.junit.Assert.assertNotNull(elements35);
        org.junit.Assert.assertNotNull(elementStream36);
        org.junit.Assert.assertNotNull(document39);
        org.junit.Assert.assertNotNull(element41);
        org.junit.Assert.assertNotNull(element43);
        org.junit.Assert.assertNotNull(elements44);
        org.junit.Assert.assertNull(element45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test349");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("", "\n<!--#root=\"\"-->");
        org.jsoup.nodes.Document document4 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str5 = document4.tagName();
        org.jsoup.parser.Tag tag6 = document4.tag();
        boolean boolean7 = tag6.isEmpty();
        boolean boolean8 = tag6.isBlock();
        boolean boolean9 = tag6.isEmpty();
        boolean boolean10 = document2.equals((java.lang.Object) boolean9);
        java.lang.String str11 = document2.title();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(document4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#root" + "'", str5, "#root");
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test350");
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
        org.jsoup.nodes.Element element24 = element19.lastElementSibling();
        org.jsoup.select.Elements elements27 = element19.getElementsByAttributeValueContaining("aorg", "\n<!--<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!-->");
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
        org.junit.Assert.assertNull(element24);
        org.junit.Assert.assertNotNull(elements27);
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test351");
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
        boolean boolean54 = tag3.isData();
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
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test352");
        org.jsoup.nodes.Document document2 = new org.jsoup.nodes.Document("#root");
        boolean boolean3 = document2.hasText();
        org.jsoup.select.Elements elements5 = document2.getElementsByIndexEquals(10);
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor6 = elements5.listIterator();
        org.jsoup.select.Elements elements9 = elements5.attr("<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "hi!");
        org.jsoup.nodes.Document document11 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element13 = document11.prependElement("hi!");
        org.jsoup.nodes.Element element14 = element13.parent();
        int int15 = elements5.indexOf((java.lang.Object) element14);
        org.jsoup.select.Elements elements16 = org.jsoup.select.Selector.select("<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!", (java.lang.Iterable<org.jsoup.nodes.Element>) elements5);
        org.jsoup.nodes.Document document19 = org.jsoup.Jsoup.parseBodyFragment("#root=\"\"", "<#root>\n</#root>");
        java.lang.String str20 = document19.toString();
        java.lang.String str21 = document19.nodeName();
        java.lang.String str22 = document19.outerHtml();
        boolean boolean23 = elements16.add((org.jsoup.nodes.Element) document19);
        org.jsoup.nodes.Element element25 = document19.addClass("org.jsoup.select.Selector$SelectorParseException: <#root>\n</#root>");
        org.jsoup.nodes.Document document26 = document19.normalise();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elementItor6);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertNotNull(document19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>" + "'", str20, "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "#document" + "'", str21, "#document");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>" + "'", str22, "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(document26);
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test353");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("#root", "#root");
        java.lang.String str4 = document2.absUrl("#root=\"\"");
        document2.title("#document");
        document2.setBaseUri("<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!");
        java.lang.String str9 = document2.title();
        org.jsoup.nodes.Element element10 = document2.empty();
        org.jsoup.nodes.Element element13 = document2.attr("org", "hi\n<!--#root=\"\"-->org.jsoup.select.Selector$SelectorParseException: hi!<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        boolean boolean14 = document2.isBlock();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#document" + "'", str9, "#document");
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test354");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str2 = document1.tagName();
        org.jsoup.nodes.Element element4 = document1.append("hi!");
        java.lang.String str5 = document1.outerHtml();
        org.jsoup.select.Elements elements6 = document1.children();
        org.jsoup.nodes.Document document8 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.select.Elements elements10 = document8.getElementsByTag("#root");
        boolean boolean11 = document1.equals((java.lang.Object) document8);
        org.jsoup.nodes.Element element13 = document8.createElement("\n<!--#root=\"\"-->");
        org.jsoup.nodes.Element element15 = document8.text("org.jsoup.select.Selector$SelectorParseException: hi!<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.lang.String str16 = document8.data();
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test355");
        org.jsoup.nodes.Document document2 = new org.jsoup.nodes.Document("#root");
        boolean boolean3 = document2.hasText();
        org.jsoup.select.Elements elements5 = document2.getElementsByIndexEquals(10);
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor6 = elements5.listIterator();
        org.jsoup.select.Elements elements9 = elements5.attr("<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "hi!");
        org.jsoup.nodes.Document document11 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element13 = document11.prependElement("hi!");
        org.jsoup.nodes.Element element14 = element13.parent();
        int int15 = elements5.indexOf((java.lang.Object) element14);
        org.jsoup.select.Elements elements16 = org.jsoup.select.Selector.select("<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!", (java.lang.Iterable<org.jsoup.nodes.Element>) elements5);
        org.jsoup.nodes.Document document19 = org.jsoup.Jsoup.parseBodyFragment("#root=\"\"", "<#root>\n</#root>");
        java.lang.String str20 = document19.toString();
        java.lang.String str21 = document19.nodeName();
        java.lang.String str22 = document19.outerHtml();
        boolean boolean23 = elements16.add((org.jsoup.nodes.Element) document19);
        org.jsoup.select.Elements elements25 = elements16.wrap("[o, r, g, ., j, s, o, u, p, ., s, e, l, e, c, t, ., S, e, l, e, c, t, o, r, $, S, e, l, e, c, t, o, r, P, a, r, s, e, E, x, c, e, p, t, i, o, n, :,  , h, i, !, <, h, t, m, l, >, \n, <, h, e, a, d, >, \n, <, /, h, e, a, d, >, \n, <, b, o, d, y, >, \n, <, /, b, o, d, y, >, \n, <, /, h, t, m, l, >]");
        boolean boolean27 = elements16.hasClass("#data");
        org.jsoup.select.Elements elements29 = elements16.html("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elementItor6);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertNotNull(document19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>" + "'", str20, "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "#document" + "'", str21, "#document");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>" + "'", str22, "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(elements25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(elements29);
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test356");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parse("\n<!--<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!-->");
        org.junit.Assert.assertNotNull(document1);
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test357");
        org.jsoup.safety.Whitelist whitelist1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.jsoup.Jsoup.clean("<html>\n<head>\n</head>\n<body>\n #root\n</body>\n</html>", whitelist1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test358");
        org.jsoup.safety.Whitelist whitelist1 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.jsoup.Jsoup.isValid("<?<html>\n<head>\n</head>\n<body>\n</body>\n</html>>", whitelist1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test359");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("#root", "");
        org.jsoup.nodes.Element element4 = document2.appendElement("#root=\"\"");
        org.jsoup.select.Elements elements5 = element4.getAllElements();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements5);
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test360");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str2 = document1.tagName();
        org.jsoup.nodes.Element element4 = document1.append("hi!");
        java.lang.String str5 = document1.outerHtml();
        org.jsoup.nodes.Element element7 = document1.prependText("#root=&quot;&quot;");
        java.lang.String str8 = element7.baseUri();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#root" + "'", str2, "#root");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!" + "'", str5, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test361");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("<html>\n<head>\n</head>\n<body>\n &lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;hi! &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; \n</body>\n</html>", "ohi!");
        org.junit.Assert.assertNotNull(document2);
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test362");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element3 = document1.prependElement("hi!");
        org.jsoup.nodes.Element element5 = element3.append("");
        org.jsoup.nodes.Element element6 = element5.previousElementSibling();
        java.lang.String str7 = element5.nodeName();
        org.jsoup.nodes.Element element10 = element5.attr("#root=\"\"=\"\"", "#comment");
        org.jsoup.nodes.Attributes attributes11 = element10.attributes();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNull(element6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(attributes11);
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test363");
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parse("org", "");
        org.junit.Assert.assertNotNull(document2);
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test364");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str2 = document1.tagName();
        org.jsoup.nodes.Element element4 = document1.append("hi!");
        java.lang.String str5 = element4.outerHtml();
        org.jsoup.nodes.Element element7 = element4.text("");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#root" + "'", str2, "#root");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!" + "'", str5, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!");
        org.junit.Assert.assertNotNull(element7);
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test365");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!", "#root=\"hi!\"");
        org.jsoup.nodes.Document document4 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element6 = document4.prependElement("hi!");
        org.jsoup.nodes.Element element8 = element6.append("");
        boolean boolean9 = attribute2.equals((java.lang.Object) "");
        org.jsoup.nodes.Document document11 = org.jsoup.nodes.Document.createShell("<html>\n <head>\n </head>\n <body>\n </body>\n</html>hi!\n\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n\n <head>\n </head>\n\n <body>\n </body>");
        boolean boolean12 = attribute2.equals((java.lang.Object) "<html>\n <head>\n </head>\n <body>\n </body>\n</html>hi!\n\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n\n <head>\n </head>\n\n <body>\n </body>");
        org.junit.Assert.assertNotNull(document4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test366");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element3 = document1.prependElement("hi!");
        org.jsoup.nodes.Element element4 = element3.parent();
        org.jsoup.nodes.Element element5 = element3.empty();
        org.jsoup.select.Elements elements7 = element5.getElementsByClass("hi!");
        org.jsoup.nodes.Element element9 = element5.prepend("<?<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!>");
        boolean boolean10 = element9.hasText();
        org.jsoup.select.Elements elements12 = element9.getElementsByIndexLessThan((int) ' ');
        org.jsoup.nodes.Element element14 = element9.val("&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;hi!");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(element14);
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test367");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element3 = document1.prependElement("hi!");
        org.jsoup.nodes.Document document6 = org.jsoup.parser.Parser.parseBodyFragment("#root", "#root");
        org.jsoup.nodes.Element element8 = document6.addClass("<#root>\n</#root>");
        element3.replaceWith((org.jsoup.nodes.Node) document6);
        org.jsoup.nodes.Element element11 = element3.toggleClass("#root=\"hi!\"");
        org.jsoup.select.Elements elements13 = element11.getElementsByClass("#declaration");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(elements13);
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test368");
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
        org.jsoup.nodes.Element element46 = document26.text("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.lang.String str48 = document26.attr("#root=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;\"");
        boolean boolean49 = document26.hasText();
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
        org.junit.Assert.assertNotNull(element46);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test369");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("#root", "#root");
        java.lang.String str4 = document2.absUrl("#root=\"\"");
        document2.title("#document");
        org.jsoup.select.Elements elements8 = document2.getElementsByClass("<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>");
        org.jsoup.nodes.Element element10 = document2.addClass("<html>\n<head>\n</head>\n<body>\n org.jsoup.select.Selector$SelectorParseException: hi!\n <html> \n  <head> \n  </head> \n  <body>  \n  </body>\n </html>\n</body>\n</html>");
        org.jsoup.select.Elements elements12 = document2.getElementsByTag("org.jsoup.select.Selector$SelectorParseException: hi!<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Document document14 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str15 = document14.tagName();
        org.jsoup.parser.Tag tag16 = document14.tag();
        org.jsoup.nodes.Element element18 = new org.jsoup.nodes.Element(tag16, "#root=\"\"");
        boolean boolean19 = element18.isBlock();
        org.jsoup.nodes.Document document21 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str22 = document21.tagName();
        org.jsoup.parser.Tag tag23 = document21.tag();
        org.jsoup.nodes.Element element25 = new org.jsoup.nodes.Element(tag23, "#root=\"\"");
        java.lang.String str26 = element25.toString();
        org.jsoup.nodes.Element element28 = element25.text("");
        org.jsoup.nodes.Element element30 = element25.removeClass("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        boolean boolean32 = element25.hasClass("<?<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!>");
        org.jsoup.nodes.Element element33 = element18.prependChild((org.jsoup.nodes.Node) element25);
        org.jsoup.select.Elements elements34 = element25.children();
        org.jsoup.select.Elements elements36 = elements34.addClass("<#root>\n<html>\n <head>\n </head>\n <body>\n  #root=&quot;&quot;\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!");
        boolean boolean37 = elements12.addAll((java.util.Collection<org.jsoup.nodes.Element>) elements36);
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(document14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "#root" + "'", str15, "#root");
        org.junit.Assert.assertNotNull(tag16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(document21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "#root" + "'", str22, "#root");
        org.junit.Assert.assertNotNull(tag23);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "<#root>\n</#root>" + "'", str26, "<#root>\n</#root>");
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertNotNull(elements34);
        org.junit.Assert.assertNotNull(elements36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test370");
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parseBodyFragment("<?<html>\n<head>\n</head>\n<body>\n</body>\n</html>>", "#root=&quot;&quot;");
        org.junit.Assert.assertNotNull(document2);
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test371");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("#root=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;\"");
        document1.title("<html>\n<head>\n</head>\n<body>\n #root\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document1);
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test372");
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
        element20.setBaseUri("\n<!--<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!-->");
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
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test373");
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parse("org.jsoup.select.Selector$SelectorParseException: <html>\n<head>\n</head>\n<body>\n</body>\n</html>", "");
        java.lang.String str3 = document2.data();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test374");
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
        org.jsoup.select.Elements elements43 = elements10.val("");
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
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test375");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("#root", "");
        org.jsoup.select.Elements elements4 = document2.getElementsByClass("<html>\n<head>\n</head>\n<body>\n #root\n</body>\n</html>");
        org.jsoup.nodes.Element element6 = document2.html("[<, !, <, h, t, m, l, >, \n, <, h, e, a, d, >, \n, <, /, h, e, a, d, >, \n, <, b, o, d, y, >, \n, <, /, b, o, d, y, >, \n, <, /, h, t, m, l, >, h, i, !, >]");
        java.lang.String str8 = element6.absUrl("<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test376");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parse("\n<#root class=\"\">\n</#root>");
        org.junit.Assert.assertNotNull(document1);
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test377");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("#declaration");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element3 = document1.createElement("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test378");
        org.jsoup.nodes.Document document2 = new org.jsoup.nodes.Document("#root");
        boolean boolean3 = document2.hasText();
        org.jsoup.select.Elements elements5 = document2.getElementsByIndexEquals(10);
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor6 = elements5.listIterator();
        org.jsoup.select.Elements elements9 = elements5.attr("<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "hi!");
        org.jsoup.nodes.Document document11 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element13 = document11.prependElement("hi!");
        org.jsoup.nodes.Element element14 = element13.parent();
        int int15 = elements5.indexOf((java.lang.Object) element14);
        org.jsoup.select.Elements elements16 = org.jsoup.select.Selector.select("<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!", (java.lang.Iterable<org.jsoup.nodes.Element>) elements5);
        org.jsoup.nodes.Document document19 = org.jsoup.Jsoup.parseBodyFragment("#root=\"\"", "<#root>\n</#root>");
        java.lang.String str20 = document19.toString();
        java.lang.String str21 = document19.nodeName();
        java.lang.String str22 = document19.outerHtml();
        boolean boolean23 = elements16.add((org.jsoup.nodes.Element) document19);
        org.jsoup.select.Elements elements25 = elements16.wrap("[o, r, g, ., j, s, o, u, p, ., s, e, l, e, c, t, ., S, e, l, e, c, t, o, r, $, S, e, l, e, c, t, o, r, P, a, r, s, e, E, x, c, e, p, t, i, o, n, :,  , h, i, !, <, h, t, m, l, >, \n, <, h, e, a, d, >, \n, <, /, h, e, a, d, >, \n, <, b, o, d, y, >, \n, <, /, b, o, d, y, >, \n, <, /, h, t, m, l, >]");
        int int26 = elements16.size();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elementItor6);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertNotNull(document19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>" + "'", str20, "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "#document" + "'", str21, "#document");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>" + "'", str22, "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(elements25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test379");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("#document", "\n<!--#root=\"\"-->");
        java.lang.String str3 = document2.nodeName();
        java.lang.String str4 = document2.outerHtml();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<html>\n<head>\n</head>\n<body> #document\n</body>\n</html>" + "'", str4, "<html>\n<head>\n</head>\n<body> #document\n</body>\n</html>");
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test380");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str2 = document1.tagName();
        org.jsoup.parser.Tag tag3 = document1.tag();
        org.jsoup.nodes.Element element5 = new org.jsoup.nodes.Element(tag3, "#root=\"\"");
        java.lang.String str6 = element5.toString();
        java.lang.String str7 = element5.outerHtml();
        org.jsoup.nodes.Element element9 = element5.prepend("<html>\n<head>\n</head>\n<body> #root\n</body>\n</html>");
        java.lang.String str10 = element5.nodeName();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#root" + "'", str2, "#root");
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<#root>\n</#root>" + "'", str6, "<#root>\n</#root>");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<#root>\n</#root>" + "'", str7, "<#root>\n</#root>");
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#root" + "'", str10, "#root");
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test381");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("", "\n<!--#root=\"\"-->");
        org.jsoup.select.Elements elements5 = document2.getElementsByAttributeValueContaining("\n<!--#root=\"\"-->", "#root=\"hi!\"");
        org.jsoup.nodes.Element element6 = document2.head();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(element6);
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test382");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str2 = document1.tagName();
        org.jsoup.parser.Tag tag3 = document1.tag();
        org.jsoup.nodes.Element element5 = new org.jsoup.nodes.Element(tag3, "#root=\"\"");
        boolean boolean6 = element5.isBlock();
        org.jsoup.nodes.Document document8 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str9 = document8.tagName();
        org.jsoup.parser.Tag tag10 = document8.tag();
        org.jsoup.nodes.Element element12 = new org.jsoup.nodes.Element(tag10, "#root=\"\"");
        java.lang.String str13 = element12.toString();
        org.jsoup.nodes.Element element15 = element12.text("");
        org.jsoup.nodes.Element element17 = element12.removeClass("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        boolean boolean19 = element12.hasClass("<?<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!>");
        org.jsoup.nodes.Element element20 = element5.prependChild((org.jsoup.nodes.Node) element12);
        org.jsoup.select.Elements elements21 = element12.children();
        java.util.stream.Stream<org.jsoup.nodes.Element> elementStream22 = elements21.parallelStream();
        org.jsoup.nodes.Document document25 = org.jsoup.Jsoup.parseBodyFragment("#root=\"\"", "<#root>\n</#root>");
        java.lang.String str26 = document25.nodeName();
        org.jsoup.select.Elements elements28 = document25.getElementsByIndexEquals(10);
        java.lang.String str29 = document25.toString();
        org.jsoup.nodes.Element element31 = document25.append("hi!");
        org.jsoup.nodes.Element element33 = document25.createElement("org.jsoup.select.Selector$SelectorParseException: <#root>\n</#root>");
        org.jsoup.nodes.Element element35 = document25.html(" #root=\"\"=\"\"");
        int int36 = elements21.lastIndexOf((java.lang.Object) document25);
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#root" + "'", str2, "#root");
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#root" + "'", str9, "#root");
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<#root>\n</#root>" + "'", str13, "<#root>\n</#root>");
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(elements21);
        org.junit.Assert.assertNotNull(elementStream22);
        org.junit.Assert.assertNotNull(document25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "#document" + "'", str26, "#document");
        org.junit.Assert.assertNotNull(elements28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>" + "'", str29, "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>");
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test383");
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
        org.jsoup.nodes.Document document73 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str74 = document73.tagName();
        org.jsoup.nodes.Element element76 = document73.append("hi!");
        java.lang.String str77 = document73.outerHtml();
        org.jsoup.select.Elements elements78 = document73.children();
        org.jsoup.nodes.Document document80 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.select.Elements elements82 = document80.getElementsByTag("#root");
        boolean boolean83 = document73.equals((java.lang.Object) document80);
        org.jsoup.nodes.Element element85 = document80.appendText("#root");
        org.jsoup.nodes.Element element87 = document80.prepend("org.jsoup.select.Selector$SelectorParseException: hi!");
        org.jsoup.nodes.Document document89 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str90 = document89.tagName();
        java.lang.String str91 = document89.html();
        org.jsoup.nodes.Element element93 = document89.append("hi!");
        org.jsoup.nodes.Element element94 = document80.prependChild((org.jsoup.nodes.Node) element93);
        org.jsoup.nodes.Element element96 = element94.child(0);
        // The following exception was thrown during execution in test generation
        try {
            elements16.add((int) '#', element94);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 35, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(document73);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "#root" + "'", str74, "#root");
        org.junit.Assert.assertNotNull(element76);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!" + "'", str77, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!");
        org.junit.Assert.assertNotNull(elements78);
        org.junit.Assert.assertNotNull(document80);
        org.junit.Assert.assertNotNull(elements82);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNotNull(element85);
        org.junit.Assert.assertNotNull(element87);
        org.junit.Assert.assertNotNull(document89);
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "#root" + "'", str90, "#root");
        org.junit.Assert.assertEquals("'" + str91 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>" + "'", str91, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.junit.Assert.assertNotNull(element93);
        org.junit.Assert.assertNotNull(element94);
        org.junit.Assert.assertNotNull(element96);
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test384");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("#data", "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!");
        org.jsoup.nodes.Element element3 = document2.body();
        org.jsoup.nodes.Attributes attributes4 = element3.attributes();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(attributes4);
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test385");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("<#root class=\"\">\n</#root>");
        org.junit.Assert.assertNotNull(document1);
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test386");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str2 = document1.tagName();
        org.jsoup.nodes.Element element4 = document1.append("hi!");
        org.jsoup.select.Elements elements6 = document1.getElementsByIndexGreaterThan((int) (short) 10);
        java.lang.String str7 = document1.nodeName();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#root" + "'", str2, "#root");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#document" + "'", str7, "#document");
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test387");
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parseBodyFragment("#root=\"\"", "<#root>\n</#root>");
        java.lang.String str3 = document2.nodeName();
        org.jsoup.select.Elements elements5 = document2.getElementsByIndexEquals(10);
        java.lang.String str6 = document2.data();
        java.lang.String str7 = document2.outerHtml();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>" + "'", str7, "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>");
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test388");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str2 = document1.tagName();
        org.jsoup.nodes.Element element4 = document1.append("hi!");
        java.lang.String str5 = document1.outerHtml();
        org.jsoup.select.Elements elements6 = document1.children();
        org.jsoup.nodes.Document document8 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.select.Elements elements10 = document8.getElementsByTag("#root");
        boolean boolean11 = document1.equals((java.lang.Object) document8);
        org.jsoup.nodes.Element element13 = document8.createElement("\n<!--#root=\"\"-->");
        boolean boolean15 = document8.hasClass("h");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#root" + "'", str2, "#root");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!" + "'", str5, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test389");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str2 = document1.id();
        org.jsoup.select.Elements elements3 = document1.children();
        org.jsoup.select.Elements elements5 = elements3.html("#root=\"\"");
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor6 = elements3.listIterator();
        java.util.Spliterator<org.jsoup.nodes.Element> elementSpliterator7 = elements3.spliterator();
        org.jsoup.nodes.Document document10 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.select.Elements elements12 = document10.getElementsByTag("#root");
        java.lang.String str13 = elements12.text();
        org.jsoup.select.Elements elements16 = elements12.attr("#root", "#root");
        org.jsoup.nodes.Document document18 = new org.jsoup.nodes.Document("#root");
        boolean boolean19 = document18.hasText();
        org.jsoup.select.Elements elements21 = document18.getElementsByIndexEquals(10);
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor22 = elements21.listIterator();
        org.jsoup.select.Elements elements25 = elements21.attr("<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "hi!");
        org.jsoup.nodes.Document document27 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element29 = document27.prependElement("hi!");
        org.jsoup.nodes.Element element30 = element29.parent();
        int int31 = elements21.indexOf((java.lang.Object) element30);
        boolean boolean32 = elements16.retainAll((java.util.Collection<org.jsoup.nodes.Element>) elements21);
        boolean boolean33 = elements16.hasText();
        org.jsoup.select.Elements elements34 = new org.jsoup.select.Elements((java.util.List<org.jsoup.nodes.Element>) elements16);
        boolean boolean36 = elements34.hasAttr("<html>\n <head>\n </head>\n <body>\n </body>\n</html>hi!\n\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n\n <head>\n </head>\n\n <body>\n </body>");
        boolean boolean37 = elements3.addAll(0, (java.util.Collection<org.jsoup.nodes.Element>) elements34);
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elementItor6);
        org.junit.Assert.assertNotNull(elementSpliterator7);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(elements21);
        org.junit.Assert.assertNotNull(elementItor22);
        org.junit.Assert.assertNotNull(elements25);
        org.junit.Assert.assertNotNull(document27);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test390");
        org.jsoup.safety.Whitelist whitelist1 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.jsoup.Jsoup.isValid("<#root>\n</#root>", whitelist1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test391");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element3 = document1.prependElement("hi!");
        org.jsoup.nodes.Element element4 = document1.empty();
        org.jsoup.nodes.Element element6 = element4.toggleClass("");
        org.jsoup.nodes.Element element7 = element4.empty();
        org.jsoup.nodes.Element element9 = element7.prepend("[o, h, i, !]");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements12 = element7.getElementsByAttributeValueStarting("", "\n<!--<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!-->");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test392");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str2 = document1.id();
        org.jsoup.select.Elements elements3 = document1.children();
        org.jsoup.select.Elements elements5 = elements3.html("#root=\"\"");
        org.jsoup.select.Elements elements7 = elements3.removeClass("<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!");
        org.jsoup.select.Elements elements9 = elements3.removeClass("<aorg>\n</aorg>");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(elements9);
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test393");
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
        org.jsoup.select.Elements elements20 = elements6.html("#declaration");
        java.util.stream.Stream<org.jsoup.nodes.Element> elementStream21 = elements6.parallelStream();
        org.jsoup.select.Elements elements23 = elements6.removeClass("org.jsoup.select.Selector$SelectorParseException: hi!<html> <head> </head> <body> </body> </html>");
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
        org.junit.Assert.assertNotNull(elementStream21);
        org.junit.Assert.assertNotNull(elements23);
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test394");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element3 = document1.prependElement("hi!");
        org.jsoup.nodes.Document document6 = org.jsoup.parser.Parser.parseBodyFragment("#root", "#root");
        org.jsoup.nodes.Element element8 = document6.addClass("<#root>\n</#root>");
        element3.replaceWith((org.jsoup.nodes.Node) document6);
        org.jsoup.nodes.Element element10 = document6.parent();
        org.jsoup.parser.Tag tag12 = org.jsoup.parser.Tag.valueOf(" text=\"hi!\"");
        java.lang.Object obj13 = null;
        boolean boolean14 = tag12.equals(obj13);
        org.jsoup.nodes.Element element16 = new org.jsoup.nodes.Element(tag12, "<?<html>\n<head>\n</head>\n<body>\n</body>\n</html>>");
        boolean boolean17 = element10.equals((java.lang.Object) element16);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements20 = element16.getElementsByAttributeValueStarting("#text", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test395");
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parse("ohi!", "org.jsoup.select.Selector$SelectorParseException: org.jsoup.select.Selector$SelectorParseException: <html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document2);
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test396");
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
        org.jsoup.nodes.Node node34 = element32.removeAttr("\n<hi!>\n</hi!>");
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
        org.junit.Assert.assertNotNull(node34);
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test397");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str2 = document1.tagName();
        org.jsoup.select.Elements elements4 = document1.getElementsByIndexGreaterThan((-1));
        boolean boolean5 = elements4.isEmpty();
        org.jsoup.nodes.Document document7 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.select.Elements elements9 = document7.getElementsByTag("#root");
        java.lang.String str10 = elements9.text();
        org.jsoup.nodes.Document document12 = new org.jsoup.nodes.Document("#root");
        boolean boolean13 = document12.hasText();
        org.jsoup.select.Elements elements15 = document12.getElementsByIndexEquals(10);
        java.lang.Object[] objArray16 = elements15.toArray();
        boolean boolean17 = elements9.retainAll((java.util.Collection<org.jsoup.nodes.Element>) elements15);
        java.lang.String str18 = elements15.text();
        org.jsoup.nodes.Document document20 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str21 = document20.tagName();
        org.jsoup.select.Elements elements23 = document20.getElementsByIndexGreaterThan((-1));
        java.lang.String str24 = document20.toString();
        org.jsoup.nodes.Element element26 = document20.text("#root=\"hi!\"");
        int int27 = elements15.lastIndexOf((java.lang.Object) "#root=\"hi!\"");
        org.jsoup.select.Elements elements29 = elements15.select("#root");
        org.jsoup.select.Elements elements31 = elements15.removeClass("#root=\"hi!\"");
        boolean boolean32 = elements4.retainAll((java.util.Collection<org.jsoup.nodes.Element>) elements31);
        org.jsoup.select.Elements elements34 = elements4.wrap("<#root>\n</#root>");
        boolean boolean36 = elements34.hasAttr("#document");
        org.jsoup.nodes.Document document38 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str39 = document38.tagName();
        org.jsoup.nodes.Element element41 = document38.append("hi!");
        java.lang.String str42 = document38.outerHtml();
        org.jsoup.select.Elements elements43 = document38.children();
        org.jsoup.nodes.Document document45 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.select.Elements elements47 = document45.getElementsByTag("#root");
        boolean boolean48 = document38.equals((java.lang.Object) document45);
        org.jsoup.nodes.Element element50 = document45.createElement("\n<!--#root=\"\"-->");
        org.jsoup.nodes.Document document51 = document45.normalise();
        org.jsoup.nodes.Node node53 = document45.removeAttr("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        boolean boolean54 = elements34.add((org.jsoup.nodes.Element) document45);
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#root" + "'", str2, "#root");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(document20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "#root" + "'", str21, "#root");
        org.junit.Assert.assertNotNull(elements23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>" + "'", str24, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(elements29);
        org.junit.Assert.assertNotNull(elements31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(elements34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(document38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "#root" + "'", str39, "#root");
        org.junit.Assert.assertNotNull(element41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!" + "'", str42, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!");
        org.junit.Assert.assertNotNull(elements43);
        org.junit.Assert.assertNotNull(document45);
        org.junit.Assert.assertNotNull(elements47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(element50);
        org.junit.Assert.assertNotNull(document51);
        org.junit.Assert.assertNotNull(node53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test398");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str2 = document1.tagName();
        org.jsoup.parser.Tag tag3 = document1.tag();
        org.jsoup.nodes.TextNode textNode6 = new org.jsoup.nodes.TextNode("hi!", "");
        org.jsoup.nodes.Node node7 = textNode6.parent();
        org.jsoup.nodes.Element element8 = document1.appendChild((org.jsoup.nodes.Node) textNode6);
        org.jsoup.nodes.Element element10 = element8.prepend("ohi");
        java.lang.String str11 = element10.tagName();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#root" + "'", str2, "#root");
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#root" + "'", str11, "#root");
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test399");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Element> elementList23 = elements20.subList((int) 'a', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: toIndex = 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
        org.junit.Assert.assertNotNull(elements20);
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test400");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("#root", "#root");
        org.jsoup.nodes.Element element4 = document2.addClass("<#root>\n</#root>");
        org.jsoup.select.Elements elements5 = element4.children();
        java.lang.String str6 = element4.val();
        java.lang.String str7 = element4.nodeName();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#document" + "'", str7, "#document");
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test401");
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parseBodyFragment("#root=\"\"", "<#root>\n</#root>");
        java.lang.String str3 = document2.nodeName();
        org.jsoup.nodes.Element element4 = document2.empty();
        org.jsoup.nodes.Element element6 = element4.prepend("<#root>\n</#root>=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;\"");
        java.lang.String str7 = element6.val();
        org.jsoup.select.Elements elements9 = element6.getElementsByIndexLessThan(0);
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(elements9);
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test402");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("#data");
        java.lang.String str2 = document1.nodeName();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#document" + "'", str2, "#document");
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test403");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element3 = document1.prependElement("hi!");
        org.jsoup.nodes.Document document6 = org.jsoup.parser.Parser.parseBodyFragment("#root", "#root");
        org.jsoup.nodes.Element element8 = document6.addClass("<#root>\n</#root>");
        element3.replaceWith((org.jsoup.nodes.Node) document6);
        org.jsoup.nodes.Element element11 = element3.val("\n<!--#root=\"\"-->");
        org.jsoup.select.Elements elements13 = element3.getElementsByClass("<#root>\n<html>\n <head>\n </head>\n <body>\n  #root=&quot;&quot;\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(elements13);
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test404");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("#root", "#root");
        java.lang.String str4 = document2.absUrl("#root=\"\"");
        document2.title("#document");
        org.jsoup.nodes.Element element7 = document2.parent();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(element7);
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test405");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str2 = document1.tagName();
        org.jsoup.nodes.Element element4 = document1.append("hi!");
        org.jsoup.nodes.Element element6 = document1.prependText("hi!");
        org.jsoup.select.Elements elements9 = document1.getElementsByAttributeValue("#root=\"\"", "#root=\"hi!\"");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = document1.childNodes();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#root" + "'", str2, "#root");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(nodeList10);
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test406");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("\n<hi!>\n</hi!>", "\n<hi!>\n</hi!>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements4 = document2.select("org.jsoup.select.Selector$SelectorParseException: hi!<html> <head> </head> <body> </body> </html>");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query org.jsoup.select.Selector$SelectorParseException: hi!<html> <head> </head> <body> </body> </html>");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test407");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str2 = document1.tagName();
        java.lang.String str3 = document1.html();
        org.jsoup.nodes.Element element5 = document1.append("hi!");
        org.jsoup.nodes.Element element7 = document1.html("ohi!");
        org.jsoup.nodes.Document document8 = document1.normalise();
        java.lang.String str9 = document1.outerHtml();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#root" + "'", str2, "#root");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>" + "'", str3, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<html>\n<head>\n</head>\n<body> ohi!\n</body>\n</html>" + "'", str9, "<html>\n<head>\n</head>\n<body> ohi!\n</body>\n</html>");
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test408");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!", "&lt;html&gt;\n &lt;head&gt;\n &lt;/head&gt;\n &lt;body&gt;\n &lt;/body&gt;\n&lt;/html&gt;hi!\n\n&lt;html&gt;\n &lt;head&gt;\n &lt;/head&gt;\n &lt;body&gt;\n &lt;/body&gt;\n&lt;/html&gt;\n\n &lt;head&gt;\n &lt;/head&gt;\n\n &lt;body&gt;\n &lt;/body&gt;");
        org.jsoup.nodes.Document document4 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str5 = document4.tagName();
        org.jsoup.select.Elements elements7 = document4.getElementsByIndexGreaterThan((-1));
        boolean boolean8 = elements7.isEmpty();
        org.jsoup.select.Elements elements10 = elements7.append("\n<!--#root=\"\"-->");
        org.jsoup.nodes.Element element11 = elements7.last();
        boolean boolean12 = attribute2.equals((java.lang.Object) elements7);
        org.junit.Assert.assertNotNull(document4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#root" + "'", str5, "#root");
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test409");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str2 = document1.tagName();
        org.jsoup.parser.Tag tag3 = document1.tag();
        java.lang.String str4 = document1.outerHtml();
        java.lang.String str5 = document1.outerHtml();
        org.jsoup.nodes.Element element7 = document1.prepend("hi");
        org.jsoup.nodes.Element element8 = element7.empty();
        java.lang.String str9 = element7.toString();
        org.jsoup.nodes.Element element11 = element7.appendElement("<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>");
        org.jsoup.nodes.Document document13 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element15 = document13.prependElement("hi!");
        org.jsoup.nodes.Element element16 = element15.parent();
        org.jsoup.nodes.Element element17 = element15.empty();
        org.jsoup.select.Elements elements19 = element17.getElementsByClass("hi!");
        java.util.Iterator<org.jsoup.nodes.Element> elementItor20 = elements19.iterator();
        boolean boolean21 = element11.equals((java.lang.Object) elements19);
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#root" + "'", str2, "#root");
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>" + "'", str4, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>" + "'", str5, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertNotNull(elementItor20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test410");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str2 = document1.tagName();
        org.jsoup.parser.Tag tag3 = document1.tag();
        java.lang.String str4 = document1.outerHtml();
        java.lang.String str5 = document1.outerHtml();
        org.jsoup.nodes.Element element7 = document1.prepend("hi");
        java.lang.String str8 = document1.baseUri();
        document1.setBaseUri("");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#root" + "'", str2, "#root");
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>" + "'", str4, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>" + "'", str5, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test411");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.select.Elements elements3 = document1.getElementsByTag("#root");
        org.jsoup.select.Elements elements5 = elements3.append("<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!");
        org.jsoup.select.Elements elements7 = elements3.prepend("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.util.stream.Stream<org.jsoup.nodes.Element> elementStream8 = elements3.parallelStream();
        org.jsoup.select.Elements elements10 = elements3.toggleClass("org.jsoup.select.Selector$SelectorParseException: <#root>\n</#root>");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(elementStream8);
        org.junit.Assert.assertNotNull(elements10);
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test412");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("#root", "#root");
        java.lang.String str3 = document2.nodeName();
        org.jsoup.nodes.Element element5 = document2.text("<html>\n <head>\n </head>\n <body>\n </body>\n</html>hi!\n<head>\n </head>\n <body>\n </body>\n\n");
        org.jsoup.nodes.Document document7 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element9 = document7.prependElement("hi!");
        org.jsoup.nodes.Element element10 = element9.parent();
        org.jsoup.nodes.Element element11 = element9.empty();
        org.jsoup.nodes.Element element12 = element11.empty();
        java.lang.String str13 = element12.nodeName();
        java.lang.String str14 = element12.val();
        java.lang.String str15 = element12.text();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element16 = element5.appendChild((org.jsoup.nodes.Node) element12);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.lang.NotImplementedException; message: Cannot (yet) move nodes in tree");
        } catch (org.apache.commons.lang.NotImplementedException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test413");
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
        org.jsoup.nodes.Document document33 = org.jsoup.Jsoup.parseBodyFragment("org.jsoup.select.Selector$SelectorParseException: hi!<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element34 = elements6.set((int) (byte) 1, (org.jsoup.nodes.Element) document33);
        java.lang.String str35 = elements6.text();
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
        org.junit.Assert.assertNotNull(document33);
        org.junit.Assert.assertNotNull(element34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "org.jsoup.select.Selector$SelectorParseException: hi!" + "'", str35, "org.jsoup.select.Selector$SelectorParseException: hi!");
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test414");
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
        org.jsoup.select.Elements elements17 = element15.getElementsByIndexLessThan((int) (short) 0);
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
        org.junit.Assert.assertNotNull(elements17);
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test415");
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
        java.lang.String str36 = element34.absUrl("org.jsoup.select.Selector$SelectorParseException: org.jsoup.select.Selector$SelectorParseException: <html>\n<head>\n</head>\n<body>\n</body>\n</html>");
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
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test416");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("#root", "#root");
        org.jsoup.nodes.Element element4 = document2.addClass("<#root>\n</#root>");
        org.jsoup.nodes.Element element6 = document2.append("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.lang.String str7 = document2.title();
        org.jsoup.nodes.Element element8 = document2.empty();
        org.jsoup.nodes.Element element10 = document2.addClass("");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test417");
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parseBodyFragment("#root=\"\"", "<#root>\n</#root>");
        java.lang.String str3 = document2.toString();
        java.lang.String str4 = document2.nodeName();
        java.lang.String str5 = document2.outerHtml();
        org.jsoup.nodes.Element element6 = document2.body();
        org.jsoup.nodes.Document document7 = document2.normalise();
        document7.setBaseUri(" text=\"hi!\"");
        java.lang.String str10 = document7.nodeName();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>" + "'", str3, "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#document" + "'", str4, "#document");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>" + "'", str5, "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#document" + "'", str10, "#document");
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test418");
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
        boolean boolean22 = document13.hasText();
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test419");
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parseBodyFragment("", ".jsoup.select.Selector$SelectorParseException: hi!<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element4 = document2.appendElement("org.jsoup.select.selector$selectorparseexception: hi!=\"#comment\"");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test420");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("org.jsoup.select.Selector$SelectorParseException: hi!<html> <head> </head> <body> </body> </html>", "org.jsoup.select.Selector$SelectorParseException: hi!<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document2);
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test421");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str2 = document1.tagName();
        org.jsoup.nodes.Element element4 = document1.append("hi!");
        org.jsoup.nodes.Element element6 = document1.prependText("hi!");
        org.jsoup.select.Elements elements9 = element6.getElementsByAttributeValueStarting("<html>\n <head>\n </head>\n <body>\n </body>\n</html>hi!\n\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n\n <head>\n </head>\n\n <body>\n </body>", "<html>\n <head>\n </head>\n <body>\n </body>\n</html>hi!\n\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n\n <head>\n </head>\n\n <body>\n </body>");
        java.lang.String str10 = element6.data();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#root" + "'", str2, "#root");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test422");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element3 = document1.prependElement("hi!");
        org.jsoup.nodes.Element element4 = document1.empty();
        org.jsoup.nodes.Element element6 = element4.toggleClass("");
        org.jsoup.nodes.Element element7 = element4.empty();
        org.jsoup.nodes.Element element9 = element7.prepend("[o, h, i, !]");
        org.jsoup.nodes.Element element11 = element9.addClass("<html>\n<head>\n</head>\n<body>\n #root\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test423");
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parse("<#root>\n</#root>", "<!hi!>");
        org.junit.Assert.assertNotNull(document2);
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test424");
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parseBodyFragment("[]", "[., j, s, o, u, p, ., s, e, l, e, c, t, ., S, e, l, e, c, t, o, r, $, S, e, l, e, c, t, o, r, P, a, r, s, e, E, x, c, e, p, t, i, o, n, :,  , h, i, !, <, h, t, m, l, >, \n, <, h, e, a, d, >, \n, <, /, h, e, a, d, >, \n, <, b, o, d, y, >, \n, <, /, b, o, d, y, >, \n, <, /, h, t, m, l, >]");
        org.jsoup.nodes.Element element3 = document2.body();
        java.lang.String str5 = element3.absUrl("org.jsoup.select.Selector$SelectorParseException: hi!<html> <head> </head> <body> </body> </html>");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test425");
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
        boolean boolean41 = element32.hasClass("");
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
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test426");
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
        org.jsoup.nodes.Attribute attribute18 = new org.jsoup.nodes.Attribute("#root", "");
        java.lang.String str19 = attribute18.getKey();
        attribute18.setKey("#root=\"\"");
        java.lang.String str22 = attribute18.toString();
        java.lang.String str23 = attribute18.html();
        attributes2.put(attribute18);
        attribute18.setKey("hi!");
        org.jsoup.nodes.Document document29 = org.jsoup.Jsoup.parseBodyFragment("#root=\"\"", "<#root>\n</#root>");
        org.jsoup.nodes.Element element30 = document29.head();
        java.lang.String str31 = element30.className();
        org.jsoup.select.Elements elements33 = element30.getElementsByClass(".jsoup.select.Selector$SelectorParseException: hi!<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element35 = element30.removeClass("#declaration");
        boolean boolean36 = attribute18.equals((java.lang.Object) "#declaration");
        org.junit.Assert.assertNotNull(attributeItor1);
        org.junit.Assert.assertNotNull(attributeItor3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "#root" + "'", str19, "#root");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "#root=\"\"=\"\"" + "'", str22, "#root=\"\"=\"\"");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "#root=\"\"=\"\"" + "'", str23, "#root=\"\"=\"\"");
        org.junit.Assert.assertNotNull(document29);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(elements33);
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test427");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("#root", "#root");
        org.jsoup.nodes.Element element4 = document2.addClass("<#root>\n</#root>");
        org.jsoup.select.Elements elements6 = element4.getElementsByAttribute("\n<!--#root=\"\"-->");
        org.jsoup.select.Elements elements8 = elements6.val("!");
        org.jsoup.nodes.Attributes attributes9 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor10 = attributes9.iterator();
        boolean boolean12 = attributes9.hasKey("");
        attributes9.remove("#root=\"\"");
        java.lang.String str15 = attributes9.html();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor16 = attributes9.iterator();
        java.lang.String str17 = attributes9.toString();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor18 = attributes9.iterator();
        boolean boolean19 = elements6.remove((java.lang.Object) attributeItor18);
        org.jsoup.nodes.Document document21 = org.jsoup.Jsoup.parse("hi!");
        org.jsoup.nodes.Element element22 = document21.head();
        org.jsoup.select.Elements elements24 = document21.getElementsByClass("hi!");
        boolean boolean25 = elements6.addAll((java.util.Collection<org.jsoup.nodes.Element>) elements24);
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(attributeItor10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(attributeItor16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(attributeItor18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(document21);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(elements24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test428");
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parseBodyFragment("#root=\"\"", "<#root>\n</#root>");
        java.lang.String str3 = document2.toString();
        java.lang.String str4 = document2.nodeName();
        java.lang.String str5 = document2.title();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>" + "'", str3, "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#document" + "'", str4, "#document");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test429");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element3 = document1.prependElement("hi!");
        org.jsoup.nodes.Element element5 = element3.append("");
        org.jsoup.nodes.Element element6 = element5.previousElementSibling();
        org.jsoup.nodes.Element element8 = element5.html("#root=\"\"");
        org.jsoup.select.Elements elements11 = element5.getElementsByAttributeValueNot("hi", "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!=\"#root=&quot;hi!&quot;\"");
        org.jsoup.nodes.Element element13 = element5.removeClass("org.jsoup.select.Selector$SelectorParseException: hi!<html> <head> </head> <body> </body> </html>");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(element13);
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test430");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element3 = document1.prependElement("hi!");
        java.lang.String str4 = element3.tagName();
        org.jsoup.nodes.Element element6 = element3.prependElement("<#root>\n</#root>");
        org.jsoup.select.Elements elements8 = element3.getElementsByIndexEquals(100);
        org.jsoup.nodes.Element element10 = element3.html("");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(element10);
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test431");
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parseBodyFragment("#root=\"\"", "<#root>\n</#root>");
        org.jsoup.nodes.Element element4 = document2.removeClass("");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test432");
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parseBodyFragment(" text=\"hi!\"", "<#root>\n<html>\n <head>\n </head>\n <body>\n  #root=&quot;&quot;\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!");
        org.jsoup.nodes.Element element4 = document2.text("<html>\n<head>\n</head>\n<body>\n #root\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test433");
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parseBodyFragment("#root=\"\"", "<#root>\n</#root>");
        java.lang.String str3 = document2.nodeName();
        org.jsoup.select.Elements elements5 = document2.getElementsByIndexEquals(10);
        java.lang.String str6 = document2.toString();
        org.jsoup.nodes.Element element8 = document2.append("hi!");
        org.jsoup.nodes.Element element9 = document2.head();
        java.lang.String str11 = document2.attr("org.jsoup.select.Selector$SelectorParseException: <#root>\n</#root>");
        org.jsoup.nodes.Element element13 = document2.addClass("#document");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>" + "'", str6, "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>");
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(element13);
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test434");
        org.jsoup.nodes.Document document2 = new org.jsoup.nodes.Document("#root");
        boolean boolean3 = document2.hasText();
        org.jsoup.select.Elements elements5 = document2.getElementsByIndexEquals(10);
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor6 = elements5.listIterator();
        boolean boolean7 = elements5.hasText();
        java.lang.String str8 = elements5.text();
        org.jsoup.select.Elements elements10 = elements5.val("org");
        org.jsoup.select.Elements elements11 = org.jsoup.select.Selector.select("ohi!", (java.lang.Iterable<org.jsoup.nodes.Element>) elements5);
        org.jsoup.nodes.Document document14 = new org.jsoup.nodes.Document("#root");
        boolean boolean15 = document14.hasText();
        org.jsoup.select.Elements elements17 = document14.getElementsByIndexEquals(10);
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor18 = elements17.listIterator();
        org.jsoup.select.Elements elements19 = new org.jsoup.select.Elements((java.util.List<org.jsoup.nodes.Element>) elements17);
        org.jsoup.nodes.Document document21 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element23 = document21.prependElement("hi!");
        org.jsoup.nodes.Document document26 = org.jsoup.parser.Parser.parseBodyFragment("#root", "#root");
        org.jsoup.nodes.Element element28 = document26.addClass("<#root>\n</#root>");
        element23.replaceWith((org.jsoup.nodes.Node) document26);
        boolean boolean30 = elements17.add((org.jsoup.nodes.Element) document26);
        java.util.Spliterator<org.jsoup.nodes.Element> elementSpliterator31 = elements17.spliterator();
        org.jsoup.nodes.Element element32 = elements17.last();
        org.jsoup.select.Elements elements34 = elements17.val(".org.jsoup.select.Selector$SelectorParseException: hi!<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.lang.Object[] objArray35 = elements34.toArray();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean36 = elements11.addAll((int) (byte) 1, (java.util.Collection<org.jsoup.nodes.Element>) elements34);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elementItor6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertNotNull(elementItor18);
        org.junit.Assert.assertNotNull(document21);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(document26);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(elementSpliterator31);
        org.junit.Assert.assertNotNull(element32);
        org.junit.Assert.assertNotNull(elements34);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray35), "[<html>\n <head>\n </head>\n <body>\n  #root\n </body>\n</html>]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray35), "[<html>\n <head>\n </head>\n <body>\n  #root\n </body>\n</html>]");
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test435");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("#root", "#root");
        org.jsoup.nodes.Element element4 = document2.addClass("<#root>\n</#root>");
        org.jsoup.nodes.Element element6 = document2.append("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Document document8 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str9 = document8.tagName();
        org.jsoup.parser.Tag tag10 = document8.tag();
        boolean boolean11 = tag10.isEmpty();
        org.jsoup.nodes.Document document13 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str14 = document13.tagName();
        org.jsoup.parser.Tag tag15 = document13.tag();
        org.jsoup.nodes.Element element17 = new org.jsoup.nodes.Element(tag15, "#root=\"\"");
        org.jsoup.nodes.Document document19 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str20 = document19.tagName();
        org.jsoup.parser.Tag tag21 = document19.tag();
        boolean boolean22 = tag15.canContain(tag21);
        boolean boolean23 = tag10.isValidParent(tag15);
        org.jsoup.nodes.Document document25 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element27 = document25.prependElement("hi!");
        org.jsoup.nodes.Element element28 = element27.parent();
        boolean boolean29 = tag15.equals((java.lang.Object) element28);
        org.jsoup.nodes.Attributes attributes31 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor32 = attributes31.iterator();
        java.lang.String str33 = attributes31.toString();
        org.jsoup.nodes.Element element34 = new org.jsoup.nodes.Element(tag15, "", attributes31);
        java.util.Set<java.lang.String> strSet35 = element34.classNames();
        org.jsoup.nodes.Element element36 = element6.classNames(strSet35);
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#root" + "'", str9, "#root");
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#root" + "'", str14, "#root");
        org.junit.Assert.assertNotNull(tag15);
        org.junit.Assert.assertNotNull(document19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "#root" + "'", str20, "#root");
        org.junit.Assert.assertNotNull(tag21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(document25);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(attributeItor32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(strSet35);
        org.junit.Assert.assertNotNull(element36);
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test436");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str2 = document1.tagName();
        org.jsoup.select.Elements elements4 = document1.getElementsByIndexGreaterThan((-1));
        boolean boolean5 = elements4.isEmpty();
        org.jsoup.select.Elements elements7 = elements4.append("\n<!--#root=\"\"-->");
        org.jsoup.nodes.Element element8 = elements7.last();
        org.jsoup.select.Elements elements11 = element8.getElementsByAttributeValueContaining("org.jsoup.select.Selector$SelectorParseException: <#root>\n</#root>", "#root=\"hi!\"");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element13 = elements11.get((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#root" + "'", str2, "#root");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements11);
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test437");
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
        java.lang.String str28 = element26.data();
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
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test438");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>");
        org.jsoup.nodes.Element element2 = document1.body();
        java.lang.String str3 = element2.nodeName();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "body" + "'", str3, "body");
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test439");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("#root=\"\"", "#root");
        java.lang.String str3 = document2.outerHtml();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<html>\n<head>\n</head>\n<body> #root=&quot;&quot;\n</body>\n</html>" + "'", str3, "<html>\n<head>\n</head>\n<body> #root=&quot;&quot;\n</body>\n</html>");
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test440");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("#data", "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!");
        org.jsoup.nodes.Element element3 = document2.body();
        org.jsoup.nodes.Element element5 = document2.text("<!<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!>");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test441");
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
        org.jsoup.nodes.Node node18 = document13.nextSibling();
        org.jsoup.nodes.Node node19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element20 = document13.appendChild(node19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertNotNull(node18);
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test442");
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parseBodyFragment("<html>\n <head>\n </head>\n <body>\n </body>\n</html>hi!\n\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n\n <head>\n </head>\n\n <body>\n </body>", "#declaration");
        java.lang.String str3 = document2.text();
        org.jsoup.nodes.Element element4 = document2.body();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(element4);
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test443");
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
        org.jsoup.nodes.Element element45 = element39.wrap("&lt;html&gt;\n &lt;head&gt;\n &lt;/head&gt;\n &lt;body&gt;\n &lt;/body&gt;\n&lt;/html&gt;hi!\n\n&lt;html&gt;\n &lt;head&gt;\n &lt;/head&gt;\n &lt;body&gt;\n &lt;/body&gt;\n&lt;/html&gt;\n\n &lt;head&gt;\n &lt;/head&gt;\n\n &lt;body&gt;\n &lt;/body&gt;");
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
        org.junit.Assert.assertNull(element45);
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test444");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str2 = document1.tagName();
        org.jsoup.parser.Tag tag3 = document1.tag();
        java.lang.String str4 = document1.outerHtml();
        java.lang.String str5 = document1.outerHtml();
        org.jsoup.nodes.Element element7 = document1.prepend("h");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#root" + "'", str2, "#root");
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>" + "'", str4, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>" + "'", str5, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.junit.Assert.assertNotNull(element7);
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test445");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str2 = document1.tagName();
        org.jsoup.nodes.Element element4 = document1.append("hi!");
        java.lang.String str5 = document1.outerHtml();
        org.jsoup.select.Elements elements6 = document1.children();
        org.jsoup.nodes.Element element8 = document1.val("<!hi!>");
        org.jsoup.nodes.Element element10 = document1.val("h");
        java.lang.String str11 = document1.toString();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#root" + "'", str2, "#root");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!" + "'", str5, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!" + "'", str11, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!");
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test446");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("#root", "#root");
        org.jsoup.nodes.Element element4 = document2.addClass("<#root>\n</#root>");
        org.jsoup.select.Elements elements6 = element4.getElementsByAttribute("\n<!--#root=\"\"-->");
        java.lang.String str7 = element4.outerHtml();
        org.jsoup.nodes.Element element10 = element4.attr("<aorg>\n</aorg>", ".jsoup.select.Selector$SelectorParseException: hi!<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.lang.String str11 = element4.html();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<html>\n<head>\n</head>\n<body>\n #root\n</body>\n</html>" + "'", str7, "<html>\n<head>\n</head>\n<body>\n #root\n</body>\n</html>");
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<html>\n<head>\n</head>\n<body>\n #root\n</body>\n</html>" + "'", str11, "<html>\n<head>\n</head>\n<body>\n #root\n</body>\n</html>");
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test447");
        org.jsoup.safety.Whitelist whitelist1 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.jsoup.Jsoup.isValid("org", whitelist1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test448");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element3 = document1.prependElement("hi!");
        org.jsoup.nodes.Element element4 = element3.parent();
        org.jsoup.nodes.Element element5 = element3.empty();
        org.jsoup.select.Elements elements7 = element5.getElementsByClass("hi!");
        org.jsoup.select.Elements elements9 = elements7.prepend("aorg");
        org.jsoup.nodes.Document document13 = org.jsoup.Jsoup.parseBodyFragment("#root=\"\"", "<#root>\n</#root>");
        java.lang.String str14 = document13.nodeName();
        org.jsoup.select.Elements elements16 = document13.getElementsByIndexEquals(10);
        org.jsoup.nodes.Document document19 = org.jsoup.parser.Parser.parse("", "\n<!--#root=\"\"-->");
        boolean boolean20 = document13.equals((java.lang.Object) "\n<!--#root=\"\"-->");
        org.jsoup.nodes.Element element22 = document13.prepend("<html>\n <head>\n </head>\n <body>\n </body>\n</html>hi!\n\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n\n <head>\n </head>\n\n <body>\n </body>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element23 = elements9.set((int) (short) 0, element22);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#document" + "'", str14, "#document");
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertNotNull(document19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(element22);
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test449");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>");
        org.jsoup.nodes.Element element2 = document1.body();
        java.lang.Class<?> wildcardClass3 = document1.getClass();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test450");
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parseBodyFragment("#root=\"\"", "<#root>\n</#root>");
        org.jsoup.nodes.Element element3 = document2.head();
        java.lang.String str4 = element3.className();
        org.jsoup.nodes.Element element6 = element3.appendElement("ohi!");
        element3.setBaseUri("<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>");
        org.jsoup.select.Elements elements10 = element3.getElementsByTag("#root=&quot;hi!&quot;=&quot;#root&quot; #comment=&quot;#root=&amp;quot;&amp;quot;=&amp;quot;&amp;quot;&quot; #root=&quot;&quot;=&quot;&quot;");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements10);
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test451");
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
        java.lang.String str35 = element34.outerHtml();
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
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "<html>\n <head>\n </head>\n <body>\n </body>\n</html>hi!<<?<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!>>\n</<?<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!>>" + "'", str35, "<html>\n <head>\n </head>\n <body>\n </body>\n</html>hi!<<?<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!>>\n</<?<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!>>");
    }

    @Test
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test452");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("#root", "#root");
        org.jsoup.nodes.Element element4 = document2.addClass("<#root>\n</#root>");
        org.jsoup.nodes.Element element6 = document2.append("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        document2.title("#root=\"\"");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element10 = document2.child(4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 4, Size: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test453");
        org.jsoup.safety.Whitelist whitelist1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.jsoup.Jsoup.clean("<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!=\"#root=&quot;hi!&quot;\"", whitelist1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test454");
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
        java.lang.String str28 = element26.html();
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
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test455");
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
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor31 = elements7.listIterator();
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
        org.junit.Assert.assertNotNull(elementItor31);
    }

    @Test
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test456");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!");
        org.jsoup.nodes.Element element3 = document1.text("org.jsoup.select.Selector$SelectorParseException: hi!<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Document document5 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element7 = document5.prependElement("hi!");
        org.jsoup.nodes.Document document10 = org.jsoup.parser.Parser.parseBodyFragment("#root", "#root");
        org.jsoup.nodes.Element element12 = document10.addClass("<#root>\n</#root>");
        element7.replaceWith((org.jsoup.nodes.Node) document10);
        org.jsoup.nodes.Element element14 = element3.prependChild((org.jsoup.nodes.Node) element7);
        org.jsoup.nodes.Document document17 = org.jsoup.Jsoup.parseBodyFragment("#root=\"\"", "<#root>\n</#root>");
        java.lang.String str18 = document17.toString();
        java.lang.String str19 = document17.nodeName();
        java.lang.String str20 = document17.outerHtml();
        org.jsoup.nodes.Element element21 = document17.body();
        org.jsoup.nodes.Element element23 = document17.append("#root");
        org.jsoup.nodes.Element element25 = document17.addClass("<html>\n<head>\n</head>\n<body>\n org.jsoup.select.Selector$SelectorParseException: hi!&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;\n</body>\n</html>");
        org.jsoup.nodes.Element element26 = element3.appendChild((org.jsoup.nodes.Node) element25);
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(document5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(document17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>" + "'", str18, "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "#document" + "'", str19, "#document");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>" + "'", str20, "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>");
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(element26);
    }

    @Test
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test457");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("#root", "#root");
        org.jsoup.nodes.Element element4 = document2.addClass("<#root>\n</#root>");
        org.jsoup.select.Elements elements5 = element4.children();
        org.jsoup.select.Elements elements8 = element4.getElementsByAttributeValueNot("#root", "<html>\n <head>\n </head>\n <body>\n </body>\n</html>hi!\n\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n\n <head>\n </head>\n\n <body>\n </body>");
        org.jsoup.nodes.Element element10 = elements8.remove(0);
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(element10);
    }

    @Test
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test458");
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
        org.jsoup.select.Elements elements50 = new org.jsoup.select.Elements((org.jsoup.nodes.Element[]) documentArray49);
        // The following exception was thrown during execution in test generation
        try {
            elements50.clear();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
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
    }

    @Test
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test459");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str2 = document1.tagName();
        org.jsoup.select.Elements elements4 = document1.getElementsByIndexGreaterThan((-1));
        java.lang.String str5 = document1.toString();
        org.jsoup.nodes.Element element7 = document1.text("#root=\"hi!\"");
        org.jsoup.nodes.Element element9 = document1.prepend("#document");
        java.lang.String str10 = document1.nodeName();
        org.jsoup.select.Elements elements13 = document1.getElementsByAttributeValueEnding("&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;hi!org.jsoup.select.Selector$SelectorParseException: hi!<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "<!--#root=\"\"-->");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#root" + "'", str2, "#root");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>" + "'", str5, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#document" + "'", str10, "#document");
        org.junit.Assert.assertNotNull(elements13);
    }

    @Test
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test460");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str2 = document1.tagName();
        org.jsoup.nodes.Element element4 = document1.append("hi!");
        org.jsoup.nodes.Element element6 = document1.prependText("hi!");
        org.jsoup.nodes.Element element8 = document1.createElement("#root=\"hi!\"");
        org.jsoup.nodes.Element element10 = document1.wrap("<?#root=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;\">");
        org.jsoup.select.Elements elements11 = document1.getAllElements();
        java.lang.String str12 = document1.title();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements15 = document1.getElementsByAttributeValueNot("\n<hi!>\n</hi!>", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#root" + "'", str2, "#root");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNull(element10);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test461");
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
        org.jsoup.nodes.Element element45 = element39.removeClass("[!]");
        element39.remove();
        java.lang.String str47 = element39.nodeName();
        org.jsoup.nodes.Element element49 = element39.append("!");
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
        org.junit.Assert.assertNotNull(element45);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "#document" + "'", str47, "#document");
        org.junit.Assert.assertNotNull(element49);
    }

    @Test
    public void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test462");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("#root");
        boolean boolean2 = document1.hasText();
        org.jsoup.select.Elements elements4 = document1.getElementsByIndexEquals(10);
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor5 = elements4.listIterator();
        org.jsoup.select.Elements elements6 = new org.jsoup.select.Elements((java.util.List<org.jsoup.nodes.Element>) elements4);
        org.jsoup.select.Elements elements8 = elements4.select("&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;hi!");
        org.jsoup.select.Elements elements10 = elements4.prepend("[., j, s, o, u, p, ., s, e, l, e, c, t, ., S, e, l, e, c, t, o, r, $, S, e, l, e, c, t, o, r, P, a, r, s, e, E, x, c, e, p, t, i, o, n, :,  , h, i, !, <, h, t, m, l, >, \n, <, h, e, a, d, >, \n, <, /, h, e, a, d, >, \n, <, b, o, d, y, >, \n, <, /, b, o, d, y, >, \n, <, /, h, t, m, l, >]");
        java.util.Spliterator<org.jsoup.nodes.Element> elementSpliterator11 = elements10.spliterator();
        org.jsoup.nodes.Document document15 = org.jsoup.parser.Parser.parse("", "\n<!--#root=\"\"-->");
        org.jsoup.select.Elements elements18 = document15.getElementsByAttributeValueContaining("\n<!--#root=\"\"-->", "#root=\"hi!\"");
        org.jsoup.nodes.Document document21 = new org.jsoup.nodes.Document("#root");
        boolean boolean22 = document21.hasText();
        org.jsoup.select.Elements elements24 = document21.getElementsByIndexEquals(10);
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor25 = elements24.listIterator();
        org.jsoup.select.Elements elements28 = elements24.attr("<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "hi!");
        org.jsoup.select.Elements elements29 = org.jsoup.select.Selector.select("#root", (java.lang.Iterable<org.jsoup.nodes.Element>) elements24);
        org.jsoup.select.Elements elements30 = new org.jsoup.select.Elements((java.util.Collection<org.jsoup.nodes.Element>) elements24);
        boolean boolean31 = elements18.containsAll((java.util.Collection<org.jsoup.nodes.Element>) elements24);
        org.jsoup.select.Elements elements32 = new org.jsoup.select.Elements((java.util.List<org.jsoup.nodes.Element>) elements18);
        org.jsoup.select.Elements elements34 = elements32.eq(100);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean35 = elements10.addAll((int) (byte) 100, (java.util.Collection<org.jsoup.nodes.Element>) elements32);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(elementItor5);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(elementSpliterator11);
        org.junit.Assert.assertNotNull(document15);
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(elements24);
        org.junit.Assert.assertNotNull(elementItor25);
        org.junit.Assert.assertNotNull(elements28);
        org.junit.Assert.assertNotNull(elements29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(elements34);
    }

    @Test
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test463");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("<html>\n<head>\n</head>\n<body>\n #root=\"\"\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document1);
    }

    @Test
    public void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test464");
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
        java.util.stream.Stream<org.jsoup.nodes.Element> elementStream32 = elements6.parallelStream();
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
        org.junit.Assert.assertNotNull(elementStream32);
    }

    @Test
    public void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test465");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element3 = document1.prependElement("hi!");
        org.jsoup.nodes.Element element5 = element3.append("");
        org.jsoup.nodes.Element element6 = element5.previousElementSibling();
        java.lang.String str7 = element5.nodeName();
        org.jsoup.nodes.Element element10 = element5.attr("#root=\"\"=\"\"", "#comment");
        org.jsoup.select.Elements elements12 = element10.getElementsByIndexEquals(1);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element14 = elements12.remove((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNull(element6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(elements12);
    }

    @Test
    public void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test466");
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parseBodyFragment("#root=\"\"", "<#root>\n</#root>");
        java.lang.String str3 = document2.nodeName();
        org.jsoup.select.Elements elements5 = document2.getElementsByIndexEquals(10);
        java.lang.String str6 = document2.toString();
        org.jsoup.nodes.Element element8 = document2.append("hi!");
        org.jsoup.nodes.Element element10 = document2.createElement("org.jsoup.select.Selector$SelectorParseException: <#root>\n</#root>");
        org.jsoup.nodes.Element element13 = element10.attr(" #root=\"hi!\"=\"#root\" #comment=\"#root=&quot;&quot;=&quot;&quot;\" #root=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;hi!\" <html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!=\"#root=&quot;hi!&quot;\"", "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>" + "'", str6, "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>");
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element13);
    }

    @Test
    public void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test467");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element3 = document1.prependElement("hi!");
        org.jsoup.nodes.Element element5 = element3.append("");
        org.jsoup.nodes.Element element7 = element3.toggleClass("#declaration");
        org.jsoup.nodes.Element element8 = element7.lastElementSibling();
        boolean boolean9 = element7.isBlock();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test468");
        org.jsoup.nodes.Document document2 = new org.jsoup.nodes.Document("#root");
        boolean boolean3 = document2.hasText();
        org.jsoup.select.Elements elements5 = document2.getElementsByIndexEquals(10);
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor6 = elements5.listIterator();
        org.jsoup.select.Elements elements9 = elements5.attr("<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "hi!");
        org.jsoup.nodes.Document document11 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element13 = document11.prependElement("hi!");
        org.jsoup.nodes.Element element14 = element13.parent();
        int int15 = elements5.indexOf((java.lang.Object) element14);
        org.jsoup.select.Elements elements16 = org.jsoup.select.Selector.select("<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!", (java.lang.Iterable<org.jsoup.nodes.Element>) elements5);
        org.jsoup.nodes.Document document19 = org.jsoup.Jsoup.parseBodyFragment("#root=\"\"", "<#root>\n</#root>");
        java.lang.String str20 = document19.toString();
        java.lang.String str21 = document19.nodeName();
        java.lang.String str22 = document19.outerHtml();
        boolean boolean23 = elements16.add((org.jsoup.nodes.Element) document19);
        org.jsoup.nodes.Element element25 = document19.appendText("<html>\n<head>\n <title>#document</title>\n</head>\n<body>\n #root\n</body>\n</html>");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elementItor6);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertNotNull(document19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>" + "'", str20, "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "#document" + "'", str21, "#document");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>" + "'", str22, "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(element25);
    }

    @Test
    public void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test469");
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parseBodyFragment("#root=\"\"", "<#root>\n</#root>");
        org.jsoup.nodes.Element element3 = document2.head();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("#root");
        boolean boolean6 = document5.hasText();
        org.jsoup.select.Elements elements8 = document5.getElementsByIndexEquals(10);
        org.jsoup.nodes.Document document10 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str11 = document10.tagName();
        org.jsoup.parser.Tag tag12 = document10.tag();
        org.jsoup.nodes.TextNode textNode15 = new org.jsoup.nodes.TextNode("hi!", "");
        org.jsoup.nodes.Node node16 = textNode15.parent();
        org.jsoup.nodes.Element element17 = document10.appendChild((org.jsoup.nodes.Node) textNode15);
        org.jsoup.select.Elements elements19 = element17.getElementsByClass("#root");
        org.jsoup.nodes.Element element20 = document5.prependChild((org.jsoup.nodes.Node) element17);
        org.jsoup.nodes.Element element21 = document2.prependChild((org.jsoup.nodes.Node) element20);
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#root" + "'", str11, "#root");
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(element21);
    }

    @Test
    public void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test470");
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
        org.jsoup.select.Elements elements45 = elements42.eq((int) (byte) 100);
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
        org.junit.Assert.assertNotNull(elements45);
    }

    @Test
    public void test471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test471");
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parseBodyFragment("[<, !, <, h, t, m, l, >, \n, <, h, e, a, d, >, \n, <, /, h, e, a, d, >, \n, <, b, o, d, y, >, \n, <, /, b, o, d, y, >, \n, <, /, h, t, m, l, >, h, i, !, >]", "&lt;html&gt;\n &lt;head&gt;\n &lt;/head&gt;\n &lt;body&gt;\n &lt;/body&gt;\n&lt;/html&gt;hi!\n&lt;head&gt;\n &lt;/head&gt;\n &lt;body&gt;\n &lt;/body&gt;\n\n");
        org.jsoup.select.Elements elements4 = document2.getElementsByIndexEquals((int) (byte) 1);
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(elements4);
    }

    @Test
    public void test472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test472");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("[., j, s, o, u, p, ., s, e, l, e, c, t, ., S, e, l, e, c, t, o, r, $, S, e, l, e, c, t, o, r, P, a, r, s, e, E, x, c, e, p, t, i, o, n, :,  , h, i, !, <, h, t, m, l, >, \n, <, h, e, a, d, >, \n, <, /, h, e, a, d, >, \n, <, b, o, d, y, >, \n, <, /, b, o, d, y, >, \n, <, /, h, t, m, l, >]", "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document2);
    }

    @Test
    public void test473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test473");
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
        org.jsoup.select.Elements elements52 = elements43.val("<#root class=\"#root &lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;hi! org.jsoup.select.Selector$SelectorParseException: &lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt; &lt;html&gt;\n &lt;head&gt;\n &lt;/head&gt;\n &lt;body&gt;\n &lt;/body&gt;\n&lt;/html&gt;hi!\n\n&lt;html&gt;\n &lt;head&gt;\n &lt;/head&gt;\n &lt;body&gt;\n &lt;/body&gt;\n&lt;/html&gt;\n\n &lt;head&gt;\n &lt;/head&gt;\n\n &lt;body&gt;\n &lt;/body&gt; org.jsoup.select.Selector$SelectorParseException: hi! ! #document #root=&quot;&amp;lt;html&amp;gt;\n&amp;lt;head&amp;gt;\n&amp;lt;/head&amp;gt;\n&amp;lt;body&amp;gt;\n&amp;lt;/body&amp;gt;\n&amp;lt;/html&amp;gt;&quot; [., j, s, o, u, p, ., s, e, l, e, c, t, ., S, e, l, e, c, t, o, r, $, S, e, l, e, c, t, o, r, P, a, r, s, e, E, x, c, e, p, t, i, o, n, :,  , h, i, !, &lt;, h, t, m, l, &gt;, \n, &lt;, h, e, a, d, &gt;, \n, &lt;, /, h, e, a, d, &gt;, \n, &lt;, b, o, d, y, &gt;, \n, &lt;, /, b, o, d, y, &gt;, \n, &lt;, /, h, t, m, l, &gt;] #root=&amp;quot;&amp;quot; org.jsoup.select.Selector$SelectorParseException: &lt;#root&gt;\n&lt;/#root&gt; &lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt; &lt;?#root=&quot;&amp;lt;html&amp;gt;\n&amp;lt;head&amp;gt;\n&amp;lt;/head&amp;gt;\n&amp;lt;body&amp;gt;\n&amp;lt;/body&amp;gt;\n&amp;lt;/html&amp;gt;&quot;&gt; #root=&quot;&quot; &lt;!&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;hi!&gt; &lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n #root=&amp;quot;&amp;quot;\n&lt;/body&gt;\n&lt;/html&gt; #text hi\">\n<#root class=\"\">\n</#root>\n</#root>");
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
        org.junit.Assert.assertNotNull(elements52);
    }

    @Test
    public void test474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test474");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("#root", "#root");
        java.lang.String str3 = document2.nodeName();
        org.jsoup.nodes.Element element5 = document2.text("<html>\n <head>\n </head>\n <body>\n </body>\n</html>hi!\n<head>\n </head>\n <body>\n </body>\n\n");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration9 = new org.jsoup.nodes.XmlDeclaration("#root=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;\"", "#declaration", false);
        org.jsoup.nodes.Element element10 = element5.appendChild((org.jsoup.nodes.Node) xmlDeclaration9);
        boolean boolean12 = element10.hasAttr("[., j, s, o, u, p, ., s, e, l, e, c, t, ., S, e, l, e, c, t, o, r, $, S, e, l, e, c, t, o, r, P, a, r, s, e, E, x, c, e, p, t, i, o, n, :,  , h, i, !, <, h, t, m, l, >, \n, <, h, e, a, d, >, \n, <, /, h, e, a, d, >, \n, <, b, o, d, y, >, \n, <, /, b, o, d, y, >, \n, <, /, h, t, m, l, >]");
        org.jsoup.nodes.Element element14 = element10.append("org.jsoup.select.Selector$SelectorParseException: org.jsoup.select.Selector$SelectorParseException: <html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(element14);
    }

    @Test
    public void test475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test475");
        org.jsoup.nodes.Evaluator evaluator0 = null;
        org.jsoup.nodes.Document document3 = org.jsoup.Jsoup.parse("&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;hi!", "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>");
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
    public void test476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test476");
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parseBodyFragment(" #root=\"hi!\"=\"#root\" #comment=\"#root=&quot;&quot;=&quot;&quot;\" #root=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;hi!\" <html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!=\"#root=&quot;hi!&quot;\"", "<html>\n<head>\n</head>\n<body>\n #root\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document2);
    }

    @Test
    public void test477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test477");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str2 = document1.tagName();
        org.jsoup.parser.Tag tag3 = document1.tag();
        java.lang.String str4 = document1.outerHtml();
        java.lang.String str5 = document1.outerHtml();
        java.lang.String str6 = document1.title();
        org.jsoup.nodes.Element element7 = document1.empty();
        org.jsoup.nodes.Element element9 = element7.append("#root=\"\"=\"\"");
        org.jsoup.nodes.Document document11 = new org.jsoup.nodes.Document("#root");
        boolean boolean12 = document11.hasText();
        org.jsoup.select.Elements elements14 = document11.getElementsByIndexEquals(10);
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor15 = elements14.listIterator();
        boolean boolean16 = elements14.hasText();
        boolean boolean17 = element9.equals((java.lang.Object) elements14);
        org.jsoup.select.Elements elements19 = elements14.wrap("<html>\n<head>\n</head>\n<body>\n #root\n</body>\n</html>");
        java.lang.Object[] objArray20 = elements19.toArray();
        java.util.Spliterator<org.jsoup.nodes.Element> elementSpliterator21 = elements19.spliterator();
        java.util.Spliterator<org.jsoup.nodes.Element> elementSpliterator22 = elements19.spliterator();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#root" + "'", str2, "#root");
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>" + "'", str4, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>" + "'", str5, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(elementItor15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[]");
        org.junit.Assert.assertNotNull(elementSpliterator21);
        org.junit.Assert.assertNotNull(elementSpliterator22);
    }

    @Test
    public void test478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test478");
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parseBodyFragment("<html>\n<head>\n</head>\n<body>\n <html> \n  <head> \n  </head> \n  <body>\n    #root=&quot;&quot;  \n  </body>\n </html>\n</body>\n</html>", "ohi!");
        java.lang.String str3 = document2.nodeName();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
    }

    @Test
    public void test479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test479");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("#root", "#root");
        org.jsoup.nodes.Element element4 = document2.addClass("<#root>\n</#root>");
        org.jsoup.select.Elements elements5 = element4.children();
        org.jsoup.select.Elements elements8 = element4.getElementsByAttributeValueNot("#root", "<html>\n <head>\n </head>\n <body>\n </body>\n</html>hi!\n\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n\n <head>\n </head>\n\n <body>\n </body>");
        org.jsoup.nodes.Document document10 = org.jsoup.nodes.Document.createShell("hi!");
        boolean boolean11 = elements8.equals((java.lang.Object) "hi!");
        org.jsoup.select.Elements elements13 = elements8.removeAttr("&lt;html&gt;\n &lt;head&gt;\n &lt;/head&gt;\n &lt;body&gt;\n &lt;/body&gt;\n&lt;/html&gt;hi!\n\n&lt;html&gt;\n &lt;head&gt;\n &lt;/head&gt;\n &lt;body&gt;\n &lt;/body&gt;\n&lt;/html&gt;\n\n &lt;head&gt;\n &lt;/head&gt;\n\n &lt;body&gt;\n &lt;/body&gt;");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(elements13);
    }

    @Test
    public void test480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test480");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str2 = document1.tagName();
        org.jsoup.nodes.Element element4 = document1.append("hi!");
        org.jsoup.nodes.Document document5 = document1.normalise();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#root" + "'", str2, "#root");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(document5);
    }

    @Test
    public void test481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test481");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str2 = document1.tagName();
        org.jsoup.parser.Tag tag3 = document1.tag();
        org.jsoup.nodes.Element element5 = new org.jsoup.nodes.Element(tag3, "#root=\"\"");
        java.lang.String str6 = element5.toString();
        org.jsoup.nodes.Element element8 = element5.text("");
        org.jsoup.nodes.Element element10 = element8.appendText("hi!");
        org.jsoup.nodes.Element element12 = element8.html(".jsoup.select.Selector$SelectorParseException: hi!<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element14 = element12.append("<html>\n<head>\n</head>\n<body>\n org.jsoup.select.Selector$SelectorParseException: hi!&lt;html&gt; &lt;head&gt; &lt;/head&gt; &lt;body&gt; &lt;/body&gt; &lt;/html&gt;\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#root" + "'", str2, "#root");
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<#root>\n</#root>" + "'", str6, "<#root>\n</#root>");
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element14);
    }

    @Test
    public void test482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test482");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!");
        org.jsoup.nodes.Element element3 = document1.val("[o, h, i, !]");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
    }

    @Test
    public void test483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test483");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str2 = document1.tagName();
        org.jsoup.parser.Tag tag3 = document1.tag();
        org.jsoup.nodes.Element element5 = new org.jsoup.nodes.Element(tag3, "#root=\"\"");
        org.jsoup.nodes.Document document7 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str8 = document7.tagName();
        org.jsoup.parser.Tag tag9 = document7.tag();
        boolean boolean10 = tag3.canContain(tag9);
        boolean boolean11 = tag3.isInline();
        org.jsoup.parser.Tag tag12 = tag3.getImplicitParent();
        org.jsoup.nodes.Attributes attributes14 = new org.jsoup.nodes.Attributes();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor15 = attributes14.iterator();
        boolean boolean17 = attributes14.hasKey("");
        attributes14.remove("#root=\"\"");
        java.lang.String str20 = attributes14.html();
        java.lang.String str21 = attributes14.toString();
        org.jsoup.nodes.Attribute attribute24 = new org.jsoup.nodes.Attribute("#root", "");
        java.lang.String str25 = attribute24.getKey();
        attribute24.setKey("#root=\"\"");
        attributes14.put(attribute24);
        org.jsoup.nodes.Element element29 = new org.jsoup.nodes.Element(tag12, "<#root>\n<html>\n <head>\n </head>\n <body>\n  #root=&quot;&quot;\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!", attributes14);
        org.jsoup.select.Elements elements31 = element29.getElementsByIndexGreaterThan((int) (short) -1);
        java.util.Spliterator<org.jsoup.nodes.Element> elementSpliterator32 = elements31.spliterator();
        org.jsoup.select.Elements elements34 = elements31.html("<!hi!>");
        java.lang.String str35 = elements34.text();
        org.jsoup.select.Elements elements37 = elements34.eq((int) (short) 1);
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#root" + "'", str2, "#root");
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#root" + "'", str8, "#root");
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertNotNull(attributeItor15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "#root" + "'", str25, "#root");
        org.junit.Assert.assertNotNull(elements31);
        org.junit.Assert.assertNotNull(elementSpliterator32);
        org.junit.Assert.assertNotNull(elements34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(elements37);
    }

    @Test
    public void test484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test484");
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parseBodyFragment("#root", "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements5 = document2.getElementsByAttributeValue("ohi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
    }

    @Test
    public void test485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test485");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str2 = document1.tagName();
        org.jsoup.parser.Tag tag3 = document1.tag();
        org.jsoup.nodes.Element element5 = new org.jsoup.nodes.Element(tag3, "#root=\"\"");
        java.lang.String str6 = element5.toString();
        org.jsoup.nodes.Element element8 = element5.text("");
        org.jsoup.nodes.Element element10 = element8.appendText("hi!");
        org.jsoup.nodes.Element element12 = element8.html(".jsoup.select.Selector$SelectorParseException: hi!<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.select.Elements elements14 = element8.getElementsByIndexLessThan((int) (byte) 1);
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
        org.jsoup.nodes.Element element35 = document33.prependElement("hi!");
        org.jsoup.nodes.Element element36 = element35.parent();
        boolean boolean37 = tag23.equals((java.lang.Object) element36);
        element36.setBaseUri("#root=\"hi!\"");
        org.jsoup.select.Elements elements41 = element36.getElementsByAttribute("#declaration");
        java.lang.Object[] objArray42 = elements41.toArray();
        boolean boolean43 = elements14.retainAll((java.util.Collection<org.jsoup.nodes.Element>) elements41);
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#root" + "'", str2, "#root");
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<#root>\n</#root>" + "'", str6, "<#root>\n</#root>");
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(elements14);
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
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertNotNull(element36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(elements41);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray42), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray42), "[]");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
    }

    @Test
    public void test486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test486");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element3 = document1.prependElement("hi!");
        org.jsoup.nodes.Element element5 = element3.append("");
        org.jsoup.nodes.Element element6 = element5.previousElementSibling();
        org.jsoup.nodes.Element element8 = element5.toggleClass("<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>");
        org.jsoup.select.Elements elements9 = element8.getAllElements();
        org.jsoup.nodes.Document document11 = new org.jsoup.nodes.Document("#root");
        boolean boolean12 = document11.hasText();
        org.jsoup.nodes.Element element14 = document11.createElement("hi!");
        org.jsoup.select.Elements elements16 = element14.getElementsByIndexEquals((int) (byte) 0);
        org.jsoup.select.Elements elements18 = elements16.removeClass("#root=\"\"");
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor19 = elements18.listIterator();
        boolean boolean20 = elements9.contains((java.lang.Object) elements18);
        java.util.Spliterator<org.jsoup.nodes.Element> elementSpliterator21 = elements18.spliterator();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertNotNull(elementItor19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(elementSpliterator21);
    }

    @Test
    public void test487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test487");
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
        java.util.List<org.jsoup.nodes.Node> nodeList40 = element22.siblingNodes();
        org.jsoup.nodes.Element element42 = element22.prependText(" text=\"hi!\"");
        java.lang.String str44 = element42.attr("<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!");
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
        org.junit.Assert.assertNotNull(nodeList40);
        org.junit.Assert.assertNotNull(element42);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
    }

    @Test
    public void test488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test488");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("org.jsoup.select.selector$selectorparseexception: hi!=\"#comment\"");
        org.junit.Assert.assertNotNull(document1);
    }

    @Test
    public void test489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test489");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str2 = document1.tagName();
        org.jsoup.nodes.Element element4 = document1.append("hi!");
        java.lang.String str5 = document1.outerHtml();
        org.jsoup.select.Elements elements6 = document1.children();
        org.jsoup.nodes.Document document8 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.select.Elements elements10 = document8.getElementsByTag("#root");
        boolean boolean11 = document1.equals((java.lang.Object) document8);
        org.jsoup.nodes.Element element13 = document8.append("#text");
        boolean boolean15 = element13.hasClass("ohi!");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#root" + "'", str2, "#root");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!" + "'", str5, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test490");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element3 = document1.prependElement("hi!");
        org.jsoup.nodes.Element element4 = element3.parent();
        org.jsoup.nodes.Element element5 = element3.empty();
        org.jsoup.select.Elements elements7 = element5.getElementsByClass("hi!");
        org.jsoup.nodes.Document document10 = org.jsoup.Jsoup.parseBodyFragment("#root=\"\"", "<#root>\n</#root>");
        java.lang.String str11 = document10.nodeName();
        org.jsoup.select.Elements elements13 = document10.getElementsByIndexEquals(10);
        java.lang.String str14 = document10.toString();
        org.jsoup.nodes.Element element16 = document10.append("hi!");
        org.jsoup.nodes.Document document18 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element20 = document18.prependElement("hi!");
        org.jsoup.nodes.Element element21 = element20.parent();
        org.jsoup.nodes.Element element22 = element20.empty();
        org.jsoup.nodes.Element element23 = element22.empty();
        java.util.Set<java.lang.String> strSet24 = element23.classNames();
        org.jsoup.nodes.Element element25 = document10.classNames(strSet24);
        org.jsoup.nodes.Element element27 = document10.prependElement("<?<html>\n<head>\n</head>\n<body>\n</body>\n</html>>");
        org.jsoup.nodes.Element element28 = element5.prependChild((org.jsoup.nodes.Node) document10);
        org.jsoup.select.Elements elements29 = element28.children();
        org.jsoup.select.Elements elements31 = element28.getElementsByIndexEquals((int) (byte) 0);
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#document" + "'", str11, "#document");
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>" + "'", str14, "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>");
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(document18);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(strSet24);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertNotNull(elements29);
        org.junit.Assert.assertNotNull(elements31);
    }

    @Test
    public void test491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test491");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("#root");
        boolean boolean2 = document1.hasText();
        org.jsoup.select.Elements elements4 = document1.getElementsByIndexEquals(10);
        java.lang.Object[] objArray5 = elements4.toArray();
        org.jsoup.nodes.Document document8 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element10 = document8.prependElement("hi!");
        org.jsoup.nodes.Element element11 = element10.parent();
        org.jsoup.nodes.Element element12 = element10.empty();
        elements4.add(0, element12);
        org.jsoup.select.Elements elements15 = elements4.html("&lt;?#root=&quot;&amp;lt;html&amp;gt; &amp;lt;head&amp;gt; &amp;lt;/head&amp;gt; &amp;lt;body&amp;gt; &amp;lt;/body&amp;gt; &amp;lt;/html&amp;gt;&quot;&gt;");
        org.jsoup.select.Elements elements17 = elements15.addClass("\n&lt;!--#root=&quot;&quot;--&gt;");
        org.jsoup.parser.TokenQueue tokenQueue19 = new org.jsoup.parser.TokenQueue("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        tokenQueue19.addFirst("org.jsoup.select.Selector$SelectorParseException: hi!");
        tokenQueue19.addFirst("\n<!--#root=\"\"-->");
        tokenQueue19.addFirst("hi");
        boolean boolean26 = tokenQueue19.isEmpty();
        java.lang.String str28 = tokenQueue19.chompTo("");
        boolean boolean29 = elements15.contains((java.lang.Object) "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test492");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements2 = document1.children();
        java.lang.String str3 = document1.outerHtml();
        org.jsoup.nodes.Element element5 = document1.appendText("<?#root=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;\">");
        org.jsoup.nodes.Element element7 = document1.append("\n<!--#root=\"\"-->");
        org.jsoup.select.Elements elements9 = document1.getElementsByIndexEquals((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements12 = document1.getElementsByAttributeValueContaining("", "<html>\n <head>\n </head>\n <body>\n </body>\n</html>hi!<<?<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!>>\n</<?<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!>>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(elements9);
    }

    @Test
    public void test493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test493");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("#root", "#root");
        java.lang.String str4 = document2.absUrl("#root=\"\"");
        document2.title("#document");
        org.jsoup.select.Elements elements8 = document2.getElementsByClass("<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>");
        org.jsoup.nodes.Element element10 = document2.addClass("<html>\n<head>\n</head>\n<body>\n org.jsoup.select.Selector$SelectorParseException: hi!\n <html> \n  <head> \n  </head> \n  <body>  \n  </body>\n </html>\n</body>\n</html>");
        java.lang.String str11 = document2.title();
        org.jsoup.nodes.Element element13 = document2.createElement("\n<!--#root=\"\"-->");
        org.jsoup.nodes.Element element16 = element13.attr("aorg.jsoup.select.Selector$SelectorParseException: hi!<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "\n<!--org.jsoup.select.Selector$SelectorParseException: hi!-->");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#document" + "'", str11, "#document");
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element16);
    }

    @Test
    public void test494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test494");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.select.Elements elements3 = document1.getElementsByTag("#root");
        java.lang.String str4 = elements3.text();
        org.jsoup.select.Elements elements6 = elements3.toggleClass("");
        java.util.stream.Stream<org.jsoup.nodes.Element> elementStream7 = elements6.stream();
        org.jsoup.select.Elements elements8 = new org.jsoup.select.Elements((java.util.List<org.jsoup.nodes.Element>) elements6);
        org.jsoup.select.Elements elements10 = elements8.wrap("<?#root=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;\">");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elementStream7);
        org.junit.Assert.assertNotNull(elements10);
    }

    @Test
    public void test495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test495");
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parseBodyFragment("#root=\"\"", "<#root>\n</#root>");
        java.lang.String str3 = document2.nodeName();
        org.jsoup.select.Elements elements5 = document2.getElementsByIndexEquals(10);
        java.lang.String str6 = document2.toString();
        org.jsoup.nodes.Element element8 = document2.append("hi!");
        org.jsoup.nodes.Element element10 = document2.createElement("org.jsoup.select.Selector$SelectorParseException: <#root>\n</#root>");
        org.jsoup.nodes.Element element12 = document2.html(" #root=\"\"=\"\"");
        org.jsoup.select.Elements elements14 = element12.getElementsByIndexGreaterThan((int) '4');
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>" + "'", str6, "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>");
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(elements14);
    }

    @Test
    public void test496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test496");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str2 = document1.tagName();
        org.jsoup.nodes.Element element4 = document1.append("hi!");
        java.lang.String str5 = document1.outerHtml();
        org.jsoup.select.Elements elements6 = document1.children();
        org.jsoup.nodes.Element element8 = document1.wrap("#declaration");
        org.jsoup.nodes.Node node9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element10 = document1.prependChild(node9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#root" + "'", str2, "#root");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!" + "'", str5, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNull(element8);
    }

    @Test
    public void test497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test497");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("#root");
        boolean boolean2 = document1.hasText();
        org.jsoup.select.Elements elements4 = document1.getElementsByIndexEquals(10);
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor5 = elements4.listIterator();
        org.jsoup.select.Elements elements6 = new org.jsoup.select.Elements((java.util.List<org.jsoup.nodes.Element>) elements4);
        java.lang.Object obj7 = null;
        boolean boolean8 = elements4.remove(obj7);
        java.util.Spliterator<org.jsoup.nodes.Element> elementSpliterator9 = elements4.spliterator();
        boolean boolean11 = elements4.hasClass("#root=\"\"=\"\"");
        org.jsoup.nodes.Document document14 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str15 = document14.id();
        org.jsoup.select.Elements elements16 = document14.children();
        org.jsoup.select.Elements elements18 = elements16.html("#root=\"\"");
        boolean boolean20 = elements18.hasAttr("");
        boolean boolean21 = elements4.addAll((int) (short) 0, (java.util.Collection<org.jsoup.nodes.Element>) elements18);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(elementItor5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(elementSpliterator9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(document14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test498");
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parse("&lt;?#root=&quot;&amp;lt;html&amp;gt; &amp;lt;head&amp;gt; &amp;lt;/head&amp;gt; &amp;lt;body&amp;gt; &amp;lt;/body&amp;gt; &amp;lt;/html&amp;gt;&quot;&gt;", "<html>\n<head>\n</head>\n<body> #root\n</body>\n</html>");
        org.jsoup.nodes.Element element4 = document2.appendElement("#root=&quot;&quot;");
        org.jsoup.nodes.Document document7 = org.jsoup.parser.Parser.parseBodyFragment("#root", "#root");
        java.lang.String str8 = document7.nodeName();
        org.jsoup.nodes.Element element10 = document7.text("<html>\n <head>\n </head>\n <body>\n </body>\n</html>hi!\n<head>\n </head>\n <body>\n </body>\n\n");
        org.jsoup.nodes.Document document12 = org.jsoup.nodes.Document.createShell("hi!");
        java.lang.String str13 = document12.tagName();
        java.lang.String str14 = document12.html();
        org.jsoup.nodes.Element element16 = document12.append("#root=\"&lt;html&gt;\n&lt;head&gt;\n&lt;/head&gt;\n&lt;body&gt;\n&lt;/body&gt;\n&lt;/html&gt;\"");
        java.util.Set<java.lang.String> strSet17 = element16.classNames();
        org.jsoup.nodes.Element element18 = document7.classNames(strSet17);
        org.jsoup.nodes.Element element19 = document2.classNames(strSet17);
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#document" + "'", str8, "#document");
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "#root" + "'", str13, "#root");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>" + "'", str14, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(element19);
    }

    @Test
    public void test499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test499");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Element element3 = document1.prependElement("hi!");
        org.jsoup.nodes.Element element5 = element3.append("");
        org.jsoup.nodes.Element element6 = element5.previousElementSibling();
        java.lang.String str7 = element5.nodeName();
        org.jsoup.nodes.Element element10 = element5.attr("#root=\"\"=\"\"", "#comment");
        java.util.List<org.jsoup.nodes.Node> nodeList11 = element10.siblingNodes();
        org.jsoup.nodes.Node node12 = element10.parent();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNull(element6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertNotNull(node12);
    }

    @Test
    public void test500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test500");
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parseBodyFragment("#root", "<html>\n<head>\n</head>\n<body>\n #root=&quot;&quot;\n</body>\n</html>");
        java.lang.String str3 = document2.data();
        java.lang.Object obj4 = null;
        boolean boolean5 = document2.equals(obj4);
        org.jsoup.nodes.Element element6 = document2.body();
        org.jsoup.nodes.Document document9 = org.jsoup.parser.Parser.parseBodyFragment("#data", "<html>\n<head>\n</head>\n<body>\n</body>\n</html>hi!");
        // The following exception was thrown during execution in test generation
        try {
            document2.replaceWith((org.jsoup.nodes.Node) document9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(document9);
    }
}

