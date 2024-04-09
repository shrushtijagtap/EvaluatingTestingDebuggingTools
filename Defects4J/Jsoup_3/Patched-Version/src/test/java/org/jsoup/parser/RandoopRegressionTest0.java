package org.jsoup.parser;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RandoopRegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test0001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0001");
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
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0002");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0003");
        org.jsoup.select.Collector collector0 = new org.jsoup.select.Collector();
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0004");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements5 = elements3.prepend("");
        org.jsoup.select.Elements elements7 = elements5.removeAttr("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element9 = elements7.remove(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elements7);
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0005");
        org.jsoup.parser.Tag tag0 = null;
        org.jsoup.nodes.Attributes attributes2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element3 = new org.jsoup.nodes.Element(tag0, "", attributes2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0006");
        java.net.URL uRL0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parse(uRL0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0007");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.hasText();
        java.lang.String str3 = document1.nodeName();
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        org.jsoup.nodes.Element element8 = document1.classNames((java.util.Set<java.lang.String>) strSet6);
        org.jsoup.nodes.Element element10 = document1.append("#document");
        org.jsoup.nodes.Element element12 = element10.html("");
        org.jsoup.nodes.Node node13 = null;
        // The following exception was thrown during execution in test generation
        try {
            element10.replaceWith(node13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
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
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0008");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements5 = elements3.prepend("");
        java.util.Collection<org.jsoup.nodes.Element> elementCollection6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = elements5.retainAll(elementCollection6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements5);
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0009");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element19 = elements3.set((int) (short) 10, (org.jsoup.nodes.Element) document6);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "#document" + "'", str12, "#document");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(element18);
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0010");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        java.lang.String str4 = elements3.val();
        java.lang.Object obj5 = null;
        int int6 = elements3.lastIndexOf(obj5);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Element> elementList9 = elements3.subList(0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: toIndex = 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0011");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements5 = elements3.prepend("");
        org.jsoup.select.Elements elements7 = elements5.removeAttr("");
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements11 = document9.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements13 = elements11.prepend("");
        org.jsoup.select.Elements elements15 = elements13.removeAttr("");
        boolean boolean16 = elements5.containsAll((java.util.Collection<org.jsoup.nodes.Element>) elements13);
        java.util.function.UnaryOperator<org.jsoup.nodes.Element> elementUnaryOperator17 = null;
        // The following exception was thrown during execution in test generation
        try {
            elements5.replaceAll(elementUnaryOperator17);
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
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0012");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.hasText();
        java.lang.String str3 = document1.nodeName();
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        org.jsoup.nodes.Element element8 = document1.classNames((java.util.Set<java.lang.String>) strSet6);
        org.jsoup.nodes.Element element10 = document1.append("#document");
        // The following exception was thrown during execution in test generation
        try {
            document1.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0013");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements15 = elements3.select("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(elementArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(elementSpliterator11);
        org.junit.Assert.assertNotNull(elementSpliterator12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0014");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = element14.val();
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
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNull(element14);
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0015");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        java.lang.String str2 = document1.val();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element4 = document1.getElementById("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0016");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element5 = document1.prepend("#document");
        org.jsoup.select.Elements elements7 = element5.getElementsByAttribute("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.util.ListIterator<org.jsoup.nodes.Element> elementItor9 = elements7.listIterator((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements7);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0017");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.hasText();
        java.lang.String str3 = document1.nodeName();
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        org.jsoup.nodes.Element element8 = document1.classNames((java.util.Set<java.lang.String>) strSet6);
        java.lang.Class<?> wildcardClass9 = element8.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0018");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements5 = elements3.prepend("");
        org.jsoup.select.Elements elements7 = elements5.removeAttr("");
        org.jsoup.nodes.Document document10 = new org.jsoup.nodes.Document("");
        boolean boolean11 = document10.hasText();
        java.lang.String str12 = document10.nodeName();
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet15 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet15, strArray14);
        org.jsoup.nodes.Element element17 = document10.classNames((java.util.Set<java.lang.String>) strSet15);
        org.jsoup.nodes.Element element19 = document10.append("#document");
        org.jsoup.nodes.Element element21 = document10.prepend("#document");
        org.jsoup.nodes.Element element23 = element21.wrap("#document");
        java.lang.String str24 = element21.baseUri();
        // The following exception was thrown during execution in test generation
        try {
            elements7.add((int) (short) -1, element21);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "#document" + "'", str12, "#document");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNull(element23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0019");
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
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = element14.hasClass("");
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
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNull(element14);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0020");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements5 = elements3.prepend("");
        org.jsoup.nodes.Document document7 = new org.jsoup.nodes.Document("");
        boolean boolean8 = document7.hasText();
        boolean boolean9 = document7.hasText();
        org.jsoup.nodes.Document document11 = new org.jsoup.nodes.Document("");
        boolean boolean12 = document11.hasText();
        java.lang.String str13 = document11.nodeName();
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet16 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet16, strArray15);
        org.jsoup.nodes.Element element18 = document11.classNames((java.util.Set<java.lang.String>) strSet16);
        org.jsoup.nodes.Element element19 = document7.classNames((java.util.Set<java.lang.String>) strSet16);
        int int20 = elements3.indexOf((java.lang.Object) element19);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element22 = element19.child((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "#document" + "'", str13, "#document");
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0021");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Element> elementList39 = elements13.subList((int) ' ', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: toIndex = 35");
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
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0022");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        java.lang.String str4 = elements3.val();
        java.lang.Object obj5 = null;
        int int6 = elements3.lastIndexOf(obj5);
        org.jsoup.select.Elements elements8 = elements3.eq((int) '#');
        java.lang.String str9 = elements3.outerHtml();
        org.jsoup.nodes.Document document12 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element15 = document12.attr("hi!", "#root");
        // The following exception was thrown during execution in test generation
        try {
            elements3.add((int) '#', element15);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 35, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(element15);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0023");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("org.jsoup.select.Selector$SelectorParseException: ");
        org.jsoup.nodes.Attributes attributes3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element4 = new org.jsoup.nodes.Element(tag1, "#document#document", attributes3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag1);
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0024");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Document document6 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements8 = document6.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element10 = document6.prepend("#document");
        org.jsoup.nodes.Element element11 = element10.empty();
        org.jsoup.select.Elements elements13 = element10.getElementsByTag("org.jsoup.select.Selector$SelectorParseException: ");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = elements3.addAll((int) (short) 100, (java.util.Collection<org.jsoup.nodes.Element>) elements13);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(elements13);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0025");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        java.lang.String str4 = elements3.outerHtml();
        java.lang.String str5 = elements3.val();
        org.jsoup.nodes.Document document8 = new org.jsoup.nodes.Document("");
        boolean boolean9 = document8.hasText();
        java.lang.String str10 = document8.nodeName();
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet13 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet13, strArray12);
        org.jsoup.nodes.Element element15 = document8.classNames((java.util.Set<java.lang.String>) strSet13);
        org.jsoup.nodes.Element element17 = document8.append("#document");
        org.jsoup.nodes.Element element19 = document8.prepend("#document");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element20 = elements3.set(0, (org.jsoup.nodes.Element) document8);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#document" + "'", str10, "#document");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(element19);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0026");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element5 = document1.prepend("#document");
        org.jsoup.nodes.Element element6 = element5.empty();
        org.jsoup.select.Elements elements8 = element5.getElementsByTag("org.jsoup.select.Selector$SelectorParseException: ");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements11 = element5.getElementsByAttributeValueStarting("", "org.jsoup.select.selector$selectorparseexception:");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements8);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0027");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("#root", "");
        org.jsoup.nodes.Element element5 = document2.attr("#root", "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        java.lang.String str6 = document2.tagName();
        org.jsoup.nodes.Element element7 = document2.empty();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements10 = document2.getElementsByAttributeValue("#document", "");
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
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0028");
        org.jsoup.safety.Whitelist whitelist2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.jsoup.Jsoup.clean("", "#document#document", whitelist2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0029");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = attributes13.get("");
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
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0030");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attributes attributes17 = element16.attributes();
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
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNull(element16);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0031");
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
        org.jsoup.nodes.Element element22 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element23 = elements5.set((int) (byte) 100, element22);
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
        org.junit.Assert.assertNotNull(elements20);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0032");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0033");
        org.jsoup.nodes.Document document2 = new org.jsoup.nodes.Document("");
        boolean boolean3 = document2.hasText();
        java.lang.String str4 = document2.nodeName();
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet7 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet7, strArray6);
        org.jsoup.nodes.Element element9 = document2.classNames((java.util.Set<java.lang.String>) strSet7);
        org.jsoup.nodes.Element element11 = document2.append("#document");
        org.jsoup.nodes.Element element13 = document2.prepend("#document");
        org.jsoup.nodes.Attributes attributes14 = element13.attributes();
        org.jsoup.nodes.Element element16 = element13.append("hi!");
        org.jsoup.nodes.Element element18 = element16.appendText("#root=\"hi!\"");
        org.jsoup.select.Elements elements19 = org.jsoup.select.Selector.select("#document#document", element18);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#document" + "'", str4, "#document");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(attributes14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(elements19);
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0034");
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
        java.util.Collection<org.jsoup.nodes.Element> elementCollection19 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = elements18.addAll(elementCollection19);
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
        org.junit.Assert.assertNotNull(elements18);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0035");
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
        org.jsoup.nodes.Document document52 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element[] elementArray53 = new org.jsoup.nodes.Element[] { document52 };
        java.util.ArrayList<org.jsoup.nodes.Element> elementList54 = new java.util.ArrayList<org.jsoup.nodes.Element>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<org.jsoup.nodes.Element>) elementList54, elementArray53);
        java.util.Spliterator<org.jsoup.nodes.Element> elementSpliterator56 = elementList54.spliterator();
        java.util.Spliterator<org.jsoup.nodes.Element> elementSpliterator57 = elementList54.spliterator();
        boolean boolean58 = elements32.contains((java.lang.Object) elementList54);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements60 = elements32.wrap("");
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
        org.junit.Assert.assertNotNull(elementArray53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(elementSpliterator56);
        org.junit.Assert.assertNotNull(elementSpliterator57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0036");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("#document", "");
        org.jsoup.nodes.Element element4 = document2.addClass("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = element4.absUrl("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0037");
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
        org.jsoup.nodes.Element element16 = document2.appendText("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements17 = org.jsoup.select.Selector.select("<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>", (org.jsoup.nodes.Element) document2);
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query <html>?<head>?</head>?<body>? #root ?</body>?</html>");
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
        org.junit.Assert.assertNotNull(element16);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0038");
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
        java.lang.String str17 = elements15.html();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(elementArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(elementSpliterator11);
        org.junit.Assert.assertNotNull(elementSpliterator12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0039");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("#root", "");
        java.lang.String str3 = document2.outerHtml();
        org.jsoup.nodes.Element element5 = document2.append("<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        org.jsoup.select.Elements elements8 = document2.getElementsByAttributeValueStarting("#root=\"hi!\"", "org.jsoup.select.Selector$SelectorParseException: ");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements11 = document2.getElementsByAttributeValueEnding("#document", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>" + "'", str3, "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements8);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0040");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        java.lang.String str4 = document1.nodeName();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element6 = document1.createElement("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#document" + "'", str4, "#document");
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0041");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueNot(" class=\"hi!\"", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0042");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.ListIterator<org.jsoup.nodes.Element> elementItor52 = elements32.listIterator(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100");
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
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0043");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element4 = document1.attr("hi!", "#root");
        org.jsoup.nodes.Attributes attributes5 = document1.attributes();
        org.jsoup.nodes.Element element6 = document1.body();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = element6.data();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertNull(element6);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0044");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("#root", "");
        org.jsoup.nodes.Element element5 = document2.attr("#root", "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        java.lang.String str6 = element5.id();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements9 = element5.getElementsByAttributeValueContaining("#document", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0045");
        org.jsoup.nodes.Evaluator evaluator0 = null;
        org.jsoup.nodes.Document document2 = new org.jsoup.nodes.Document("");
        boolean boolean3 = document2.hasText();
        java.lang.String str4 = document2.nodeName();
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet7 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet7, strArray6);
        org.jsoup.nodes.Element element9 = document2.classNames((java.util.Set<java.lang.String>) strSet7);
        org.jsoup.nodes.Element element11 = element9.addClass("#document");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements12 = org.jsoup.select.Collector.collect(evaluator0, element11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#document" + "'", str4, "#document");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0046");
        org.jsoup.nodes.DataNode dataNode2 = org.jsoup.nodes.DataNode.createFromEncoded("\n<!--#root-->", "#document");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = dataNode2.absUrl("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dataNode2);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0047");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element16 = element12.child((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0048");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0049");
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
        org.jsoup.nodes.Comment comment19 = new org.jsoup.nodes.Comment("#root", "");
        java.lang.String str20 = comment19.nodeName();
        // The following exception was thrown during execution in test generation
        try {
            document1.replaceWith((org.jsoup.nodes.Node) comment19);
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
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNull(element16);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "#comment" + "'", str20, "#comment");
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0050");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("#root", "");
        java.lang.String str3 = document2.outerHtml();
        org.jsoup.nodes.Element element5 = document2.append("<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements7 = element5.getElementsByAttribute("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>" + "'", str3, "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        org.junit.Assert.assertNotNull(element5);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0051");
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
        // The following exception was thrown during execution in test generation
        try {
            element10.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
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
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0052");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("#root", "");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("#document");
        org.jsoup.nodes.TextNode textNode6 = textNode2.text(" class=\"hi!\"");
        boolean boolean8 = textNode6.hasAttr("org.jsoup.select.Selector$SelectorParseException: ");
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertNotNull(textNode6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0053");
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
        // The following exception was thrown during execution in test generation
        try {
            document1.remove();
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
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0054");
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
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor37 = elements35.listIterator();
        java.util.Collection<org.jsoup.nodes.Element> elementCollection38 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean39 = elements35.containsAll(elementCollection38);
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
        org.junit.Assert.assertNotNull(elements20);
        org.junit.Assert.assertNotNull(elements22);
        org.junit.Assert.assertNotNull(elements24);
        org.junit.Assert.assertNotNull(elements28);
        org.junit.Assert.assertNotNull(elements30);
        org.junit.Assert.assertNotNull(elements32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(elements35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(elementItor37);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0055");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!", "hi!");
        attribute2.setKey("#root");
        java.lang.String str5 = attribute2.getKey();
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#root" + "'", str5, "#root");
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0056");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements21 = org.jsoup.select.Selector.select("", (java.lang.Iterable<org.jsoup.nodes.Element>) elements20);
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
        org.junit.Assert.assertNotNull(elements19);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0057");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.hasText();
        java.lang.String str3 = document1.nodeName();
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        org.jsoup.nodes.Element element8 = document1.classNames((java.util.Set<java.lang.String>) strSet6);
        org.jsoup.nodes.Element element10 = document1.append("#document");
        org.jsoup.nodes.Element element12 = document1.prepend("#document");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = document1.childNode((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0058");
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
        org.jsoup.nodes.Element element17 = element10.toggleClass("#data");
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
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0059");
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
        boolean boolean19 = elements18.isEmpty();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0060");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parse(file0, "#data");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0061");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("org.jsoup.select.Selector$SelectorParseException: ", "#document#documenthi!");
        org.junit.Assert.assertNotNull(attribute2);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0062");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        java.lang.String str4 = elements3.val();
        java.lang.Object obj5 = null;
        int int6 = elements3.lastIndexOf(obj5);
        org.jsoup.select.Elements elements8 = elements3.eq((int) '#');
        boolean boolean10 = elements3.hasAttr("#root");
        int int12 = elements3.indexOf((java.lang.Object) (byte) 100);
        int int13 = elements3.size();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element15 = elements3.get((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0063");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("#root", "");
        comment2.setBaseUri("#document#documenthi!");
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0064");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "\n<!--#root-->");
        java.lang.String str3 = textNode2.getWholeText();
        org.jsoup.nodes.TextNode textNode5 = textNode2.text("hi!");
        org.jsoup.nodes.TextNode textNode7 = textNode2.text("#root=\"hi!\"");
        boolean boolean8 = textNode7.isBlank();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(textNode5);
        org.junit.Assert.assertNotNull(textNode7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0065");
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
        java.util.function.UnaryOperator<org.jsoup.nodes.Element> elementUnaryOperator30 = null;
        // The following exception was thrown during execution in test generation
        try {
            elements8.replaceAll(elementUnaryOperator30);
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
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0066");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("org.jsoup.select.Selector$SelectorParseException: ");
        boolean boolean2 = tag1.isData();
        boolean boolean3 = tag1.requiresSpecificParent();
        boolean boolean4 = tag1.isBlock();
        boolean boolean5 = tag1.isEmpty();
        org.jsoup.nodes.Document document7 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements9 = document7.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements11 = elements9.prepend("");
        elements11.clear();
        int int14 = elements11.indexOf((java.lang.Object) "org.jsoup.select.Selector$SelectorParseException: ");
        org.jsoup.select.Elements elements16 = elements11.append("#document");
        java.util.Iterator<org.jsoup.nodes.Element> elementItor17 = elements11.iterator();
        boolean boolean18 = tag1.equals((java.lang.Object) elements11);
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertNotNull(elementItor17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0067");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        java.lang.String str4 = elements3.outerHtml();
        java.lang.String str5 = elements3.val();
        org.jsoup.select.Elements elements6 = new org.jsoup.select.Elements((java.util.List<org.jsoup.nodes.Element>) elements3);
        java.lang.String str8 = elements3.attr("org.jsoup.select.Selector$SelectorParseException: ");
        int int10 = elements3.lastIndexOf((java.lang.Object) 100.0d);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0068");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("#root", "");
        org.jsoup.nodes.Element element5 = document2.attr("#root", "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        java.lang.String str6 = element5.id();
        org.jsoup.select.Elements elements8 = element5.getElementsByIndexEquals((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements10 = elements8.select("#document#documenthi!");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query #document#documenthi!");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(elements8);
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0069");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("#root", "");
        java.lang.String str3 = document2.outerHtml();
        org.jsoup.nodes.Element element5 = document2.createElement("#document#documenthi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element7 = document2.appendElement("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>" + "'", str3, "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        org.junit.Assert.assertNotNull(element5);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0070");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("", "org.jsoup.select.selector$selectorparseexception:");
        java.lang.String str3 = document2.outerHtml();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>" + "'", str3, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0071");
        org.jsoup.nodes.DataNode dataNode2 = org.jsoup.nodes.DataNode.createFromEncoded("org.jsoup.select.selector$selectorparseexception:", "hi!");
        java.lang.String str3 = dataNode2.getWholeData();
        org.junit.Assert.assertNotNull(dataNode2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "org.jsoup.select.selector$selectorparseexception:" + "'", str3, "org.jsoup.select.selector$selectorparseexception:");
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0072");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.hasText();
        java.lang.String str3 = document1.nodeName();
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        org.jsoup.nodes.Element element8 = document1.classNames((java.util.Set<java.lang.String>) strSet6);
        org.jsoup.nodes.Element element10 = element8.addClass("#document");
        org.jsoup.select.Elements elements13 = element10.getElementsByAttributeValueNot("#root", "org.jsoup.select.Selector$SelectorParseException: ");
        java.lang.String str14 = element10.toString();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0073");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements5 = elements3.prepend("");
        org.jsoup.select.Elements elements7 = elements5.removeAttr("");
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements11 = document9.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements13 = elements11.prepend("");
        org.jsoup.select.Elements elements15 = elements13.removeAttr("");
        boolean boolean16 = elements5.containsAll((java.util.Collection<org.jsoup.nodes.Element>) elements13);
        org.jsoup.select.Elements elements18 = elements5.toggleClass("#root");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(elements18);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0074");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("#root", "");
        java.lang.String str3 = document2.outerHtml();
        org.jsoup.nodes.Element element5 = document2.append("<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        org.jsoup.select.Elements elements7 = document2.getElementsByIndexEquals(1);
        org.jsoup.nodes.Node node8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element9 = document2.appendChild(node8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>" + "'", str3, "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements7);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0075");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = org.jsoup.Jsoup.parse(file0, "", " class=\"hi!\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0076");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements5 = elements3.prepend("");
        org.jsoup.select.Elements elements7 = elements5.removeAttr("");
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements11 = document9.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements13 = elements11.prepend("");
        org.jsoup.select.Elements elements15 = elements13.removeAttr("");
        boolean boolean16 = elements5.containsAll((java.util.Collection<org.jsoup.nodes.Element>) elements13);
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
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean52 = elements13.addAll((int) 'a', (java.util.Collection<org.jsoup.nodes.Element>) elements51);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 97, Size: 0");
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
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0077");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element18 = elements10.get(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(element14);
        org.junit.Assert.assertNotNull(elements16);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0078");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.hasText();
        java.lang.String str3 = document1.nodeName();
        org.jsoup.select.Elements elements4 = document1.children();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements7 = document1.getElementsByAttributeValueEnding("\n<!--#root-->", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(elements4);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0079");
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
        java.util.Iterator<org.jsoup.nodes.Element> elementItor14 = elements10.iterator();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(elementItor14);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0080");
        org.jsoup.safety.Whitelist whitelist2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.jsoup.Jsoup.clean("<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>", whitelist2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0081");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.hasText();
        java.lang.String str3 = document1.nodeName();
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        org.jsoup.nodes.Element element8 = document1.classNames((java.util.Set<java.lang.String>) strSet6);
        org.jsoup.nodes.Element element10 = element8.addClass("#document");
        java.lang.String str11 = element10.html();
        org.jsoup.nodes.Element element13 = element10.prepend("#data");
        java.lang.String str14 = element13.data();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0082");
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
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = elements10.is("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
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
        org.junit.Assert.assertNull(element14);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0083");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parse(file0, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0084");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("#root", "");
        org.jsoup.nodes.Element element5 = document2.attr("#root", "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        java.lang.String str6 = document2.tagName();
        org.jsoup.nodes.Element element7 = document2.parent();
        java.lang.String str8 = document2.title();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#root" + "'", str6, "#root");
        org.junit.Assert.assertNull(element7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0085");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.hasText();
        java.lang.String str3 = document1.nodeName();
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        org.jsoup.nodes.Element element8 = document1.classNames((java.util.Set<java.lang.String>) strSet6);
        org.jsoup.nodes.Element element10 = document1.append("#document");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element12 = element10.child((int) 'a');
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
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0086");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = org.jsoup.Jsoup.parse(file0, "\n<!--#root-->", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0087");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.hasText();
        java.lang.String str3 = document1.nodeName();
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        org.jsoup.nodes.Element element8 = document1.classNames((java.util.Set<java.lang.String>) strSet6);
        org.jsoup.nodes.Element element10 = document1.append("#document");
        org.jsoup.nodes.Element element12 = element10.html("<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        java.lang.String str13 = element12.className();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0088");
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
        org.jsoup.nodes.Element element32 = element30.addClass("#document#document");
        org.jsoup.select.Elements elements34 = element30.getElementsByAttribute("[#, d, o, c, u, m, e, n, t]");
        java.util.stream.Stream<org.jsoup.nodes.Element> elementStream35 = elements34.parallelStream();
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
        org.junit.Assert.assertNotNull(elements34);
        org.junit.Assert.assertNotNull(elementStream35);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0089");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        java.lang.String str4 = elements3.outerHtml();
        java.lang.String str5 = elements3.val();
        org.jsoup.select.Elements elements6 = new org.jsoup.select.Elements((java.util.List<org.jsoup.nodes.Element>) elements3);
        org.jsoup.nodes.TextNode textNode9 = org.jsoup.nodes.TextNode.createFromEncoded("#data", "#root");
        java.lang.String str10 = textNode9.nodeName();
        int int11 = elements3.lastIndexOf((java.lang.Object) str10);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(textNode9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#text" + "'", str10, "#text");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0090");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        int int1 = attributes0.size();
        java.lang.String str2 = attributes0.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = attributes0.get("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0091");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        org.junit.Assert.assertNotNull(document1);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0092");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = org.jsoup.Jsoup.parse(file0, "#data", "#document");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0093");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.hasText();
        java.lang.String str3 = document1.nodeName();
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        org.jsoup.nodes.Element element8 = document1.classNames((java.util.Set<java.lang.String>) strSet6);
        org.jsoup.nodes.Element element10 = element8.addClass("#document");
        org.jsoup.select.Elements elements13 = element10.getElementsByAttributeValueNot("#root", "org.jsoup.select.Selector$SelectorParseException: ");
        java.lang.String str14 = element10.data();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element17 = element10.attr("", "");
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
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0094");
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
        boolean boolean34 = elements33.isEmpty();
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
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0095");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Document document4 = org.jsoup.parser.Parser.parseBodyFragment("#document", "");
        org.jsoup.nodes.Element element6 = document4.addClass("hi!");
        org.jsoup.nodes.Element element7 = document4.body();
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        boolean boolean10 = document9.hasText();
        java.lang.String str11 = document9.nodeName();
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet14 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet14, strArray13);
        org.jsoup.nodes.Element element16 = document9.classNames((java.util.Set<java.lang.String>) strSet14);
        org.jsoup.nodes.Element element18 = element16.addClass("#document");
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
        org.jsoup.nodes.Element element34 = element16.classNames(strSet33);
        org.jsoup.nodes.Element element35 = element7.classNames(strSet33);
        java.util.List<org.jsoup.nodes.Node> nodeList36 = element35.siblingNodes();
        // The following exception was thrown during execution in test generation
        try {
            document1.replaceWith((org.jsoup.nodes.Node) element35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#document" + "'", str11, "#document");
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "#document" + "'", str26, "#document");
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertNotNull(element32);
        org.junit.Assert.assertNotNull(strSet33);
        org.junit.Assert.assertNotNull(element34);
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertNotNull(nodeList36);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0096");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.hasText();
        java.lang.String str3 = document1.nodeName();
        org.jsoup.nodes.Document document5 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element8 = document5.attr("hi!", "#root");
        org.jsoup.nodes.Attributes attributes9 = document5.attributes();
        boolean boolean10 = document1.equals((java.lang.Object) attributes9);
        org.jsoup.nodes.Attributes attributes11 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes9.addAll(attributes11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0097");
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
        java.lang.Class<?> wildcardClass14 = element13.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#document" + "'", str7, "#document");
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0098");
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parseBodyFragment("#document#document", "#comment");
        document2.setBaseUri("org.jsoup.select.Selector$SelectorParseException: ");
        org.junit.Assert.assertNotNull(document2);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0099");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements5 = elements3.prepend("");
        elements5.clear();
        int int8 = elements5.indexOf((java.lang.Object) "org.jsoup.select.Selector$SelectorParseException: ");
        org.jsoup.select.Elements elements10 = elements5.append("#document");
        java.util.Iterator<org.jsoup.nodes.Element> elementItor11 = elements5.iterator();
        org.jsoup.nodes.Document document13 = org.jsoup.Jsoup.parseBodyFragment(" class=\"hi!\"");
        boolean boolean14 = elements5.add((org.jsoup.nodes.Element) document13);
        boolean boolean16 = document13.hasClass("#document");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(elementItor11);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0100");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element4 = elements3.first();
        org.jsoup.select.Elements elements6 = elements3.toggleClass("#document");
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
        org.jsoup.select.Elements elements46 = elements21.val("#root=\"hi!\"");
        org.jsoup.select.Elements elements48 = elements46.append("#text");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean49 = elements6.addAll((-1), (java.util.Collection<org.jsoup.nodes.Element>) elements48);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNull(element4);
        org.junit.Assert.assertNotNull(elements6);
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
        org.junit.Assert.assertNotNull(elements46);
        org.junit.Assert.assertNotNull(elements48);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0101");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element35 = elements33.get((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
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
        org.junit.Assert.assertNotNull(elements31);
        org.junit.Assert.assertNotNull(elements33);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0102");
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
        java.util.Collection<org.jsoup.nodes.Element> elementCollection16 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = elements15.addAll(elementCollection16);
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
        org.junit.Assert.assertNotNull(elements15);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0103");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        java.lang.String str5 = elements3.attr("#root");
        java.lang.String str6 = elements3.text();
        org.jsoup.select.Elements elements8 = elements3.prepend("org.jsoup.select.selector$selectorparseexception:");
        java.lang.String str9 = elements8.val();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0104");
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
        org.jsoup.nodes.Document document18 = new org.jsoup.nodes.Document("");
        boolean boolean19 = document18.hasText();
        java.lang.String str20 = document18.nodeName();
        org.jsoup.select.Elements elements21 = document18.children();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element22 = elements3.set((int) (short) 10, (org.jsoup.nodes.Element) document18);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
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
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "#document" + "'", str20, "#document");
        org.junit.Assert.assertNotNull(elements21);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0105");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        java.lang.String str4 = elements3.val();
        java.lang.Object obj5 = null;
        int int6 = elements3.lastIndexOf(obj5);
        org.jsoup.select.Elements elements8 = elements3.eq((int) '#');
        boolean boolean10 = elements3.hasAttr("#root");
        int int12 = elements3.indexOf((java.lang.Object) (byte) 100);
        int int13 = elements3.size();
        org.jsoup.nodes.Document document17 = org.jsoup.parser.Parser.parseBodyFragment("#document", "");
        org.jsoup.nodes.Element element19 = document17.addClass("hi!");
        org.jsoup.nodes.Element element20 = document17.body();
        org.jsoup.nodes.Document document22 = new org.jsoup.nodes.Document("");
        boolean boolean23 = document22.hasText();
        java.lang.String str24 = document22.nodeName();
        java.lang.String[] strArray26 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet27 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet27, strArray26);
        org.jsoup.nodes.Element element29 = document22.classNames((java.util.Set<java.lang.String>) strSet27);
        org.jsoup.nodes.Element element31 = element29.addClass("#document");
        org.jsoup.nodes.Document document33 = new org.jsoup.nodes.Document("");
        boolean boolean34 = document33.hasText();
        boolean boolean35 = document33.hasText();
        org.jsoup.nodes.Document document37 = new org.jsoup.nodes.Document("");
        boolean boolean38 = document37.hasText();
        java.lang.String str39 = document37.nodeName();
        java.lang.String[] strArray41 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet42 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet42, strArray41);
        org.jsoup.nodes.Element element44 = document37.classNames((java.util.Set<java.lang.String>) strSet42);
        org.jsoup.nodes.Element element45 = document33.classNames((java.util.Set<java.lang.String>) strSet42);
        java.util.Set<java.lang.String> strSet46 = document33.classNames();
        org.jsoup.nodes.Element element47 = element29.classNames(strSet46);
        org.jsoup.nodes.Element element48 = element20.classNames(strSet46);
        boolean boolean50 = element48.hasClass("#document#document");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element51 = elements3.set((int) (short) -1, element48);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(document17);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "#document" + "'", str24, "#document");
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "#document" + "'", str39, "#document");
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(element44);
        org.junit.Assert.assertNotNull(element45);
        org.junit.Assert.assertNotNull(strSet46);
        org.junit.Assert.assertNotNull(element47);
        org.junit.Assert.assertNotNull(element48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0106");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("#document#document=\"#document#document\"", "hi!=\"#root=&quot;hi!&quot;\"");
        org.junit.Assert.assertNotNull(document2);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0107");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        int int1 = attributes0.size();
        java.lang.String str2 = attributes0.html();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor3 = attributes0.iterator();
        attributes0.put("#comment", "");
        int int7 = attributes0.size();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(attributeItor3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0108");
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
        org.jsoup.nodes.Document document54 = org.jsoup.Jsoup.parseBodyFragment("hi!=\"#root=&quot;hi!&quot;\"", "#root=\"hi!\"");
        org.jsoup.select.Elements elements57 = document54.getElementsByAttributeValueContaining("[]", "#root");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean58 = elements18.addAll(3, (java.util.Collection<org.jsoup.nodes.Element>) elements57);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 3, Size: 0");
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
        org.junit.Assert.assertNotNull(document54);
        org.junit.Assert.assertNotNull(elements57);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0109");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("#root", "");
        java.lang.String str3 = document2.html();
        java.lang.String str5 = document2.attr("org.jsoup.select.selector$selectorparseexception:");
        java.lang.String str6 = document2.id();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node9 = document2.attr("", "hi!=\"#root=&quot;hi!&quot;\"");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>" + "'", str3, "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0110");
        org.jsoup.nodes.Document document2 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document2.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements6 = elements4.prepend("");
        elements6.clear();
        int int9 = elements6.indexOf((java.lang.Object) "org.jsoup.select.Selector$SelectorParseException: ");
        org.jsoup.select.Elements elements11 = elements6.removeClass("#data");
        org.jsoup.select.Elements elements12 = org.jsoup.select.Selector.select("#data", (java.lang.Iterable<org.jsoup.nodes.Element>) elements11);
        org.jsoup.parser.Tag tag14 = org.jsoup.parser.Tag.valueOf("org.jsoup.select.Selector$SelectorParseException: ");
        boolean boolean15 = tag14.isData();
        boolean boolean16 = tag14.requiresSpecificParent();
        boolean boolean17 = tag14.isBlock();
        org.jsoup.parser.Tag tag19 = org.jsoup.parser.Tag.valueOf("org.jsoup.select.Selector$SelectorParseException: ");
        boolean boolean20 = tag19.isData();
        boolean boolean21 = tag19.requiresSpecificParent();
        boolean boolean22 = tag19.isBlock();
        boolean boolean23 = tag14.canContain(tag19);
        boolean boolean24 = elements11.equals((java.lang.Object) tag19);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element26 = elements11.get((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(tag14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(tag19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0111");
        org.jsoup.safety.Whitelist whitelist2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.jsoup.Jsoup.clean(" class=\"hi!\"", "", whitelist2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0112");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("<?#document#document>");
        org.junit.Assert.assertNotNull(document1);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0113");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("");
        boolean boolean3 = tokenQueue1.matchChomp("org.jsoup.select.selector$selectorparseexception:");
        java.lang.String str4 = tokenQueue1.consumeWord();
        java.lang.String str5 = tokenQueue1.consumeAttributeKey();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0114");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element20 = elements5.get((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 97, Size: 0");
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
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0115");
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
        java.lang.String str51 = elements32.html();
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
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0116");
        java.net.URL uRL0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parse(uRL0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0117");
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
        org.jsoup.nodes.Document document34 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element37 = document34.attr("hi!", "#root");
        org.jsoup.nodes.Attributes attributes38 = document34.attributes();
        // The following exception was thrown during execution in test generation
        try {
            elements31.add(3, (org.jsoup.nodes.Element) document34);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 3, Size: 0");
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
        org.junit.Assert.assertNotNull(elements31);
        org.junit.Assert.assertNotNull(element37);
        org.junit.Assert.assertNotNull(attributes38);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0118");
        org.jsoup.safety.Whitelist whitelist2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.jsoup.Jsoup.clean("hi!", "#document#documentdocument", whitelist2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0119");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = org.jsoup.Jsoup.parse(file0, "#root=\"hi!\"", "[]");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0120");
        org.jsoup.nodes.Document document3 = org.jsoup.parser.Parser.parseBodyFragmentRelaxed("hi!", "#data");
        org.jsoup.parser.Tag tag4 = document3.tag();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements5 = org.jsoup.select.Selector.select("", (org.jsoup.nodes.Element) document3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(tag4);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0121");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("#root", "#root");
        java.lang.String str3 = comment2.nodeName();
        java.lang.String str4 = comment2.nodeName();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#comment" + "'", str3, "#comment");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#comment" + "'", str4, "#comment");
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0122");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("#document");
        java.lang.String str2 = tokenQueue1.consumeAttributeKey();
        java.lang.String str3 = tokenQueue1.consumeCssIdentifier();
        boolean boolean5 = tokenQueue1.matches("#comment");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0123");
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
            org.jsoup.nodes.Element element18 = element16.getElementById("#document#document=\"#document#document\"");
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
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0124");
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
        java.lang.Class<?> wildcardClass15 = element13.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#document" + "'", str7, "#document");
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0125");
        org.jsoup.safety.Whitelist whitelist1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.jsoup.Jsoup.clean("org.jsoup.select.selector$selectorparseexception:", whitelist1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0126");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("#root");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0127");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("#document", "");
        org.jsoup.nodes.Element element4 = document2.addClass("hi!");
        org.jsoup.nodes.Element element5 = document2.body();
        org.jsoup.nodes.Element element6 = document2.body();
        boolean boolean7 = element6.isBlock();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0128");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("#document#document", "\n<!--#document-->", false);
        java.lang.String str4 = xmlDeclaration3.toString();
        java.lang.String str5 = xmlDeclaration3.getWholeDeclaration();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<?#document#document>" + "'", str4, "<?#document#document>");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#document#document" + "'", str5, "#document#document");
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0129");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("#document");
        boolean boolean3 = tokenQueue1.matches("\n<!--#root-->");
        boolean boolean5 = tokenQueue1.matchChomp("#data");
        boolean boolean7 = tokenQueue1.matchChomp("#document#document");
        boolean boolean8 = tokenQueue1.matchesWord();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0130");
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
        java.lang.String str13 = tag1.toString();
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
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0131");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.hasText();
        java.lang.String str3 = document1.nodeName();
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        org.jsoup.nodes.Element element8 = document1.classNames((java.util.Set<java.lang.String>) strSet6);
        org.jsoup.nodes.Element element10 = document1.append("#document");
        org.jsoup.nodes.Element element12 = element10.html("<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        // The following exception was thrown during execution in test generation
        try {
            element12.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
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
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0132");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Document document2 = document1.normalise();
        org.jsoup.nodes.Element element3 = document1.head();
        org.jsoup.nodes.Element element5 = element3.append("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        boolean boolean7 = element3.hasClass("#text");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0133");
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
        org.jsoup.nodes.Attributes attributes23 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes15.addAll(attributes23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0134");
        java.net.URL uRL0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parse(uRL0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0135");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parse(file0, "<?#document#document>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0136");
        org.jsoup.safety.Whitelist whitelist2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.jsoup.Jsoup.clean("", "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>", whitelist2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0137");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements5 = elements3.prepend("");
        org.jsoup.select.Elements elements7 = elements5.removeAttr("");
        org.jsoup.select.Elements elements9 = elements7.removeAttr("hi!");
        org.jsoup.nodes.Document document11 = org.jsoup.Jsoup.parse("hi!");
        org.jsoup.select.Elements elements14 = document11.getElementsByAttributeValue("hi!", "hi!");
        document11.title("[]");
        org.jsoup.nodes.Element element18 = document11.prependText("#document#document");
        boolean boolean19 = elements9.add(element18);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0138");
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
        java.lang.String str14 = element12.toString();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#document#document" + "'", str14, "#document#document");
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0139");
        org.jsoup.nodes.DataNode dataNode2 = new org.jsoup.nodes.DataNode("\n<!--#root-->", "hi!");
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0140");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element49 = elements45.get((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
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
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0141");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.hasText();
        org.jsoup.nodes.Element element4 = document1.createElement("#text");
        java.lang.String str5 = document1.outerHtml();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0142");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element5 = document1.prepend("#document");
        org.jsoup.select.Elements elements7 = element5.getElementsByAttribute("hi!");
        java.lang.String str8 = elements7.val();
        org.jsoup.nodes.Document document11 = new org.jsoup.nodes.Document("");
        boolean boolean12 = document11.hasText();
        boolean boolean13 = document11.hasText();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element14 = elements7.set(0, (org.jsoup.nodes.Element) document11);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0143");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        java.lang.String str4 = elements3.val();
        java.lang.Object obj5 = null;
        int int6 = elements3.lastIndexOf(obj5);
        org.jsoup.select.Elements elements8 = elements3.eq((int) '#');
        boolean boolean10 = elements3.hasAttr("#root");
        org.jsoup.nodes.Document document14 = org.jsoup.parser.Parser.parse("#root", "");
        java.lang.String str15 = document14.outerHtml();
        org.jsoup.nodes.Element element17 = document14.append("<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        org.jsoup.select.Elements elements19 = document14.getElementsByIndexEquals(1);
        org.jsoup.nodes.Element element20 = document14.body();
        // The following exception was thrown during execution in test generation
        try {
            elements3.add((int) (byte) -1, element20);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(document14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>" + "'", str15, "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertNotNull(element20);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0144");
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
        org.jsoup.select.Elements elements40 = elements38.append("#text");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean42 = elements38.is("");
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
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0145");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element5 = document1.prepend("#document");
        org.jsoup.nodes.Element element7 = document1.createElement("#data");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements10 = element7.getElementsByAttributeValueNot("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0146");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parse("hi!");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValue("hi!", "hi!");
        org.jsoup.nodes.Element element6 = document1.text("<?#document#document>");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(element6);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0147");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("#document#documentdocument", "");
        org.junit.Assert.assertNotNull(textNode2);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0148");
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parseBodyFragment("<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>", "");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node4 = document2.childNode((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0149");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("#root", "hi!");
        attribute2.setValue("hi!=\"#root=&quot;hi!&quot;\"");
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0150");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("#data", "#root");
        org.jsoup.nodes.Node node3 = textNode2.parent();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNull(node3);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0151");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element4 = document1.attr("hi!", "#root");
        org.jsoup.select.Elements elements6 = element4.getElementsByTag("\n<!--#root-->");
        int int7 = elements6.size();
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0152");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parse("hi!");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValue("hi!", "hi!");
        org.jsoup.nodes.Attributes attributes5 = document1.attributes();
        org.jsoup.nodes.Element element6 = document1.head();
        java.lang.String str7 = document1.title();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0153");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "\n<!--#root-->");
        java.lang.String str3 = textNode2.getWholeText();
        org.jsoup.nodes.TextNode textNode5 = textNode2.text("hi!");
        org.jsoup.nodes.TextNode textNode7 = textNode2.text("#root=\"hi!\"");
        org.jsoup.nodes.TextNode textNode9 = textNode2.text("#data");
        java.lang.String str10 = textNode2.getWholeText();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = textNode2.childNode(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(textNode5);
        org.junit.Assert.assertNotNull(textNode7);
        org.junit.Assert.assertNotNull(textNode9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#data" + "'", str10, "#data");
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0154");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.hasText();
        java.lang.String str3 = document1.nodeName();
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        org.jsoup.nodes.Element element8 = document1.classNames((java.util.Set<java.lang.String>) strSet6);
        org.jsoup.nodes.Element element10 = document1.append("#document");
        java.lang.String str11 = element10.html();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#document" + "'", str11, "#document");
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0155");
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
        org.jsoup.select.Elements elements14 = element12.children();
        org.jsoup.nodes.Element element16 = element12.prependElement("#comment");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(element16);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0156");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements23 = element20.getElementsByTag("");
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
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(document17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>" + "'", str18, "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(element21);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0157");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "\n<!--#root-->");
        java.lang.String str3 = textNode2.getWholeText();
        org.jsoup.nodes.TextNode textNode5 = textNode2.text("hi!");
        org.jsoup.nodes.TextNode textNode7 = textNode2.text("#root=\"hi!\"");
        org.jsoup.nodes.TextNode textNode9 = textNode2.text("#data");
        java.lang.String str10 = textNode2.nodeName();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(textNode5);
        org.junit.Assert.assertNotNull(textNode7);
        org.junit.Assert.assertNotNull(textNode9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#text" + "'", str10, "#text");
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0158");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("#root", "");
        org.jsoup.nodes.Element element5 = document2.attr("#root", "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        java.lang.String str6 = document2.tagName();
        org.jsoup.nodes.Element element7 = document2.empty();
        org.jsoup.select.Elements elements8 = element7.children();
        // The following exception was thrown during execution in test generation
        try {
            element7.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#root" + "'", str6, "#root");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(elements8);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0159");
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
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0160");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("#document", "");
        org.jsoup.nodes.Element element4 = document2.addClass("hi!");
        org.jsoup.nodes.Document document6 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements8 = document6.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements10 = elements8.prepend("");
        org.jsoup.select.Elements elements12 = elements10.removeAttr("");
        org.jsoup.nodes.Document document14 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements16 = document14.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements18 = elements16.prepend("");
        org.jsoup.select.Elements elements20 = elements18.removeAttr("");
        boolean boolean21 = elements10.containsAll((java.util.Collection<org.jsoup.nodes.Element>) elements18);
        java.lang.Object[] objArray22 = elements10.toArray();
        org.jsoup.nodes.Document document24 = new org.jsoup.nodes.Document("");
        boolean boolean25 = document24.hasText();
        java.lang.String str26 = document24.nodeName();
        java.lang.String str27 = document24.val();
        boolean boolean28 = elements10.add((org.jsoup.nodes.Element) document24);
        org.jsoup.nodes.Element element31 = document24.attr("[#, d, o, c, u, m, e, n, t]", "#text");
        // The following exception was thrown during execution in test generation
        try {
            document2.replaceWith((org.jsoup.nodes.Node) document24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertNotNull(elements20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "#document" + "'", str26, "#document");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(element31);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0161");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.hasText();
        java.lang.String str3 = document1.nodeName();
        org.jsoup.select.Elements elements4 = document1.children();
        org.jsoup.nodes.Element element6 = document1.prependElement("[#, d, o, c, u, m, e, n, t]");
        java.lang.String str8 = element6.absUrl("#document#documentdocument");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0162");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parse("hi!");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValue("hi!", "hi!");
        org.jsoup.nodes.Attributes attributes5 = document1.attributes();
        org.jsoup.nodes.Element element6 = document1.head();
        org.jsoup.select.Elements elements7 = element6.getAllElements();
        org.jsoup.nodes.DataNode dataNode10 = org.jsoup.nodes.DataNode.createFromEncoded("#document", "#document");
        java.lang.String str11 = dataNode10.nodeName();
        boolean boolean12 = elements7.remove((java.lang.Object) dataNode10);
        java.lang.String str13 = dataNode10.toString();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(dataNode10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#data" + "'", str11, "#data");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "#document" + "'", str13, "#document");
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0163");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements24 = org.jsoup.select.Selector.select("\n<!--#document-->", (java.lang.Iterable<org.jsoup.nodes.Element>) elements20);
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query <!--#document-->");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
        // Expected exception.
        }
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
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0164");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element4 = document1.attr("hi!", "#root");
        org.jsoup.nodes.Attributes attributes5 = document1.attributes();
        org.jsoup.select.Elements elements8 = document1.getElementsByAttributeValueNot("org.jsoup.select.selector$selectorparseexception:", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Element> elementList11 = elements8.subList((int) (byte) 100, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: toIndex = 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertNotNull(elements8);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0165");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("#data", "#root");
        java.lang.String str3 = textNode2.nodeName();
        boolean boolean4 = textNode2.isBlank();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node6 = textNode2.removeAttr("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#text" + "'", str3, "#text");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0166");
        org.jsoup.nodes.Evaluator evaluator0 = null;
        org.jsoup.nodes.Document document2 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document2.getElementsByIndexGreaterThan((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements5 = org.jsoup.select.Collector.collect(evaluator0, (org.jsoup.nodes.Element) document2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements4);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0167");
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
        boolean boolean19 = tag1.canContainBlock();
        java.lang.Class<?> wildcardClass20 = tag1.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0168");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("#document", "#root");
        java.lang.String str3 = comment2.nodeName();
        java.lang.String str4 = comment2.getData();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#comment" + "'", str3, "#comment");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#document" + "'", str4, "#document");
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0169");
        org.jsoup.nodes.Evaluator evaluator0 = null;
        org.jsoup.nodes.Element element1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements2 = org.jsoup.select.Collector.collect(evaluator0, element1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0170");
        org.jsoup.select.Selector.SelectorParseException selectorParseException1 = new org.jsoup.select.Selector.SelectorParseException("org.jsoup.select.selector$selectorparseexception:");
        org.jsoup.select.Selector.SelectorParseException selectorParseException3 = new org.jsoup.select.Selector.SelectorParseException("org.jsoup.select.selector$selectorparseexception:");
        java.lang.Throwable[] throwableArray4 = selectorParseException3.getSuppressed();
        org.jsoup.select.Selector.SelectorParseException selectorParseException6 = new org.jsoup.select.Selector.SelectorParseException("\n<!--#document-->");
        selectorParseException3.addSuppressed((java.lang.Throwable) selectorParseException6);
        selectorParseException1.addSuppressed((java.lang.Throwable) selectorParseException6);
        java.lang.String str9 = selectorParseException6.toString();
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "org.jsoup.select.Selector$SelectorParseException: \n<!--#document-->" + "'", str9, "org.jsoup.select.Selector$SelectorParseException: \n<!--#document-->");
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0171");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element5 = document1.prepend("#document");
        org.jsoup.nodes.Element element6 = element5.empty();
        org.jsoup.select.Elements elements8 = element5.getElementsByTag("org.jsoup.select.Selector$SelectorParseException: ");
        org.jsoup.select.Elements elements10 = elements8.removeClass("#root");
        org.jsoup.select.Elements elements12 = elements8.append("");
        boolean boolean14 = elements8.hasAttr("#document#document");
        org.jsoup.select.Elements elements16 = elements8.toggleClass("#document#document");
        java.util.HashSet<java.lang.String>[] strSetArray17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.HashSet<java.lang.String>[] strSetArray18 = elements8.toArray(strSetArray17);
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
        org.junit.Assert.assertNotNull(elements16);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0172");
        java.net.URL uRL0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parse(uRL0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0173");
        org.jsoup.safety.Whitelist whitelist2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.jsoup.Jsoup.clean("#document#document=\"#document#document\"", "a", whitelist2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0174");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements20 = org.jsoup.select.Selector.select("\n<!--#document-->", (org.jsoup.nodes.Element) document2);
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query <!--#document-->");
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
        org.junit.Assert.assertNotNull(tag19);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0175");
        org.jsoup.safety.Whitelist whitelist1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.jsoup.Jsoup.clean(" class=\"hi!\"", whitelist1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0176");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Document document2 = document1.normalise();
        org.jsoup.nodes.Element element3 = document1.head();
        org.jsoup.nodes.Element element5 = document1.removeClass("\n<!--#root-->");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0177");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element4 = elements3.first();
        org.jsoup.select.Elements elements6 = elements3.toggleClass("#document");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Element> elementList9 = elements6.subList(0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: toIndex = 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNull(element4);
        org.junit.Assert.assertNotNull(elements6);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0178");
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parseBodyFragment("org.jsoup.select.selector$selectorparseexception:", "#document");
        org.junit.Assert.assertNotNull(document2);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0179");
        org.jsoup.nodes.DataNode dataNode2 = org.jsoup.nodes.DataNode.createFromEncoded("org.jsoup.select.selector$selectorparseexception:", "hi!");
        java.lang.String str3 = dataNode2.toString();
        java.lang.String str4 = dataNode2.outerHtml();
        org.junit.Assert.assertNotNull(dataNode2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "org.jsoup.select.selector$selectorparseexception:" + "'", str3, "org.jsoup.select.selector$selectorparseexception:");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "org.jsoup.select.selector$selectorparseexception:" + "'", str4, "org.jsoup.select.selector$selectorparseexception:");
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0180");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("#document#document=\"#document#document\"", "\n<!--#document-->");
        org.junit.Assert.assertNotNull(document2);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0181");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("#document");
        java.lang.String str2 = tokenQueue1.consumeAttributeKey();
        java.lang.String str3 = tokenQueue1.remainder();
        // The following exception was thrown during execution in test generation
        try {
            tokenQueue1.consume("<?#document#document>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Queue did not match expected sequence");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0182");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("");
        org.junit.Assert.assertNotNull(document1);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0183");
        org.jsoup.safety.Whitelist whitelist2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.jsoup.Jsoup.clean("\n<!--#root-->", "org.jsoup.select.Selector$SelectorParseException: ", whitelist2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0184");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element5 = document1.prepend("#document");
        org.jsoup.nodes.Element element7 = document1.createElement("#data");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node9 = document1.childNode((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 35, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element7);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0185");
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
        java.util.List<org.jsoup.nodes.Node> nodeList22 = element20.childNodes();
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
        org.junit.Assert.assertNotNull(nodeList22);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0186");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = element16.data();
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
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNull(element16);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0187");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("#document#document");
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0188");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("#root", "");
        java.lang.String str3 = document2.outerHtml();
        org.jsoup.nodes.Element element5 = document2.append("<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        org.jsoup.select.Elements elements7 = document2.getElementsByIndexEquals(1);
        java.lang.String str8 = document2.nodeName();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements11 = document2.getElementsByAttributeValue("", "body");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>" + "'", str3, "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#document" + "'", str8, "#document");
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0189");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("#root");
        org.jsoup.nodes.Element element3 = document1.html("org.jsoup.select.Selector$SelectorParseException: ");
        org.jsoup.nodes.Element element4 = element3.empty();
        org.jsoup.nodes.Node node6 = element4.removeAttr("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        java.lang.String str7 = node6.nodeName();
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#document" + "'", str7, "#document");
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0190");
        org.jsoup.parser.Tag tag0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element2 = new org.jsoup.nodes.Element(tag0, "#document#documenthi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0191");
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
        boolean boolean16 = element12.isBlock();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNull(element14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0192");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        java.lang.String str4 = document1.nodeName();
        java.lang.String str5 = document1.outerHtml();
        boolean boolean7 = document1.hasAttr("#document#document");
        org.jsoup.nodes.Element element9 = document1.val("[#, d, o, c, u, m, e, n, t]");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements11 = document1.select("<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query <html>?<head>?</head>?<body>? #root ?</body>?</html>");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#document" + "'", str4, "#document");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(element9);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0193");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("#root", "");
        org.jsoup.nodes.Element element5 = document2.attr("#root", "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        java.lang.String str6 = document2.tagName();
        org.jsoup.nodes.Element element7 = document2.empty();
        org.jsoup.select.Elements elements8 = element7.children();
        org.jsoup.nodes.Element element10 = element7.appendText("");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#root" + "'", str6, "#root");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(element10);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0194");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        java.lang.String str5 = elements3.attr("#root");
        java.lang.String str6 = elements3.text();
        org.jsoup.select.Elements elements8 = elements3.prepend("org.jsoup.select.selector$selectorparseexception:");
        java.lang.String str9 = elements3.html();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0195");
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parseBodyFragment("#document#document", "#comment");
        document2.setBaseUri("[#, d, o, c, u, m, e, n, t]");
        document2.title("#root=\"hi!\"");
        org.junit.Assert.assertNotNull(document2);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0196");
        org.jsoup.nodes.DataNode dataNode2 = org.jsoup.nodes.DataNode.createFromEncoded("org.jsoup.select.Selector$SelectorParseException: ", "");
        java.lang.Class<?> wildcardClass3 = dataNode2.getClass();
        org.junit.Assert.assertNotNull(dataNode2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0197");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.ListIterator<org.jsoup.nodes.Element> elementItor28 = elements26.listIterator((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10");
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
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(elements26);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0198");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("#root", "");
        java.lang.String str3 = document2.outerHtml();
        org.jsoup.nodes.Element element5 = document2.append("<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        org.jsoup.select.Elements elements7 = document2.getElementsByIndexEquals(1);
        java.lang.String str8 = document2.nodeName();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element11 = document2.attr("", "org.jsoup.select.selector$selectorparseexception:");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>" + "'", str3, "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#document" + "'", str8, "#document");
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0199");
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
        org.jsoup.select.Selector.SelectorParseException selectorParseException29 = new org.jsoup.select.Selector.SelectorParseException("#data");
        boolean boolean30 = element25.equals((java.lang.Object) "#data");
        org.jsoup.nodes.Element element32 = element25.getElementById("#document#document");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str33 = element32.nodeName();
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
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(element32);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0200");
        java.net.URL uRL0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parse(uRL0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0201");
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
        java.lang.String str19 = elements18.html();
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
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0202");
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
        java.util.Collection<org.jsoup.nodes.Element> elementCollection18 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = elements17.retainAll(elementCollection18);
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
        org.junit.Assert.assertNotNull(elements17);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0203");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("");
        boolean boolean2 = tokenQueue1.isEmpty();
        boolean boolean3 = tokenQueue1.matchesWhitespace();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Character char4 = tokenQueue1.consume();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0204");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("[]");
        org.jsoup.nodes.Element element3 = document1.val("<?#document#document>");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0205");
        org.jsoup.safety.Whitelist whitelist2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.jsoup.Jsoup.clean("#document", "#text", whitelist2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0206");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!=\"#root=&quot;hi!&quot;\"");
        org.junit.Assert.assertNotNull(document1);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0207");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element20 = elements18.remove((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 97, Size: 0");
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
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0208");
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
        java.lang.String str34 = element33.val();
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
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0209");
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
        org.jsoup.nodes.Document document15 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements17 = document15.getElementsByAttribute("hi!");
        java.lang.String str18 = elements17.val();
        java.lang.Object obj19 = null;
        int int20 = elements17.lastIndexOf(obj19);
        org.jsoup.select.Elements elements22 = elements17.eq((int) '#');
        elements17.clear();
        int int24 = elements17.size();
        org.jsoup.nodes.TextNode textNode27 = new org.jsoup.nodes.TextNode("#root", "");
        boolean boolean28 = elements17.equals((java.lang.Object) "#root");
        boolean boolean29 = elements13.removeAll((java.util.Collection<org.jsoup.nodes.Element>) elements17);
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
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor61 = elements58.listIterator(0);
        org.jsoup.select.Elements elements63 = elements58.append("");
        org.jsoup.select.Elements elements65 = elements58.html(" class=\"hi!\"");
        int int66 = elements17.lastIndexOf((java.lang.Object) elements65);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(elements22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
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
        org.junit.Assert.assertNotNull(elementItor61);
        org.junit.Assert.assertNotNull(elements63);
        org.junit.Assert.assertNotNull(elements65);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + (-1) + "'", int66 == (-1));
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0210");
        org.jsoup.safety.Whitelist whitelist2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.jsoup.Jsoup.clean("#document#documenthi!", "body", whitelist2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0211");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element5 = document1.prepend("#document");
        org.jsoup.nodes.Element element6 = element5.empty();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element8 = element5.getElementById("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element6);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0212");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("#document#document", "\n<!--#document-->", false);
        java.lang.String str4 = xmlDeclaration3.toString();
        java.lang.String str5 = xmlDeclaration3.nodeName();
        java.lang.String str6 = xmlDeclaration3.getWholeDeclaration();
        java.lang.String str7 = xmlDeclaration3.baseUri();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<?#document#document>" + "'", str4, "<?#document#document>");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#declaration" + "'", str5, "#declaration");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#document#document" + "'", str6, "#document#document");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!--#document-->" + "'", str7, "<!--#document-->");
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0213");
        org.jsoup.nodes.Document document3 = org.jsoup.parser.Parser.parseBodyFragment("#document", "");
        org.jsoup.nodes.Element element5 = document3.addClass("hi!");
        java.lang.String str6 = document3.title();
        org.jsoup.select.Elements elements7 = org.jsoup.select.Selector.select("#document#document", (org.jsoup.nodes.Element) document3);
        org.jsoup.select.Elements elements9 = document3.getElementsByAttribute("org.jsoup.select.selector$selectorparseexception:");
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(elements9);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0214");
        org.jsoup.safety.Whitelist whitelist1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.jsoup.Jsoup.clean(" class=&quot;hi!&quot;", whitelist1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0215");
        org.jsoup.select.Selector.SelectorParseException selectorParseException1 = new org.jsoup.select.Selector.SelectorParseException("org.jsoup.select.selector$selectorparseexception:");
        java.lang.Throwable[] throwableArray2 = selectorParseException1.getSuppressed();
        org.jsoup.select.Selector.SelectorParseException selectorParseException4 = new org.jsoup.select.Selector.SelectorParseException("\n<!--#document-->");
        selectorParseException1.addSuppressed((java.lang.Throwable) selectorParseException4);
        java.lang.String str6 = selectorParseException1.toString();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "org.jsoup.select.Selector$SelectorParseException: org.jsoup.select.selector$selectorparseexception:" + "'", str6, "org.jsoup.select.Selector$SelectorParseException: org.jsoup.select.selector$selectorparseexception:");
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0216");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("", "org.jsoup.select.Selector$SelectorParseException: \n<!--#document-->");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0217");
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parse("", "");
        java.lang.String str3 = document2.nodeName();
        java.lang.String str4 = document2.text();
        org.jsoup.nodes.Element element6 = document2.wrap("hi!=\"#root=&quot;hi!&quot;\"");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(element6);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0218");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("#document", "");
        org.jsoup.nodes.Element element4 = document2.addClass("hi!");
        org.jsoup.nodes.Element element5 = document2.body();
        org.jsoup.nodes.Document document7 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements9 = document7.getElementsByAttribute("hi!");
        java.lang.String str10 = elements9.outerHtml();
        java.lang.String str11 = elements9.val();
        org.jsoup.select.Elements elements12 = new org.jsoup.select.Elements((java.util.List<org.jsoup.nodes.Element>) elements9);
        org.jsoup.select.Elements elements13 = new org.jsoup.select.Elements((java.util.Collection<org.jsoup.nodes.Element>) elements9);
        org.jsoup.select.Elements elements15 = elements13.addClass("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        boolean boolean16 = element5.equals((java.lang.Object) "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0219");
        org.jsoup.nodes.Evaluator evaluator0 = null;
        org.jsoup.nodes.Document document2 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements4 = document2.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements6 = elements4.prepend("");
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
        int int21 = elements4.indexOf((java.lang.Object) element20);
        org.jsoup.select.Elements elements22 = element20.children();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements23 = org.jsoup.select.Collector.collect(evaluator0, element20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#document" + "'", str14, "#document");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(elements22);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0220");
        org.jsoup.nodes.DataNode dataNode2 = new org.jsoup.nodes.DataNode("hi!=\"#root=&quot;hi!&quot;\"", "");
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0221");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.ListIterator<org.jsoup.nodes.Element> elementItor19 = elements5.listIterator((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32");
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
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0222");
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
        org.jsoup.nodes.Document document21 = org.jsoup.nodes.Document.createShell("hi!");
        boolean boolean22 = elements19.add((org.jsoup.nodes.Element) document21);
        org.jsoup.select.Elements elements24 = elements19.html("#comment");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertNotNull(document21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(elements24);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0223");
        org.jsoup.nodes.Document document3 = org.jsoup.parser.Parser.parse("#root", "\n<!--#root-->");
        org.jsoup.select.Elements elements4 = org.jsoup.select.Selector.select("#declaration", (org.jsoup.nodes.Element) document3);
        org.jsoup.nodes.Element element5 = document3.body();
        org.jsoup.nodes.Element element6 = element5.firstElementSibling();
        org.jsoup.nodes.Node node7 = element6.parent();
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(node7);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0224");
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
        boolean boolean39 = elements13.hasClass("#document#documenthi!");
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
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0225");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parse("hi!");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValue("hi!", "hi!");
        org.jsoup.nodes.Attributes attributes5 = document1.attributes();
        org.jsoup.select.Elements elements8 = document1.getElementsByAttributeValueNot(" class=&quot;hi!&quot;", "\n<!--#document-->");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertNotNull(elements8);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0226");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.ListIterator<org.jsoup.nodes.Element> elementItor39 = elements37.listIterator((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 35");
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
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0227");
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
        java.util.Collection<org.jsoup.nodes.Element> elementCollection25 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean26 = elements20.removeAll(elementCollection25);
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
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0228");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements5 = elements3.prepend("");
        org.jsoup.select.Elements elements7 = elements5.removeAttr("");
        org.jsoup.select.Elements elements9 = elements5.addClass("#document#documenthi!");
        org.jsoup.select.Elements elements10 = new org.jsoup.select.Elements((java.util.Collection<org.jsoup.nodes.Element>) elements5);
        org.jsoup.select.Elements elements12 = elements5.toggleClass("\n<!--#root-->");
        // The following exception was thrown during execution in test generation
        try {
            java.util.ListIterator<org.jsoup.nodes.Element> elementItor14 = elements5.listIterator((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(elements12);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0229");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("\n<!--#root-->", "");
        org.junit.Assert.assertNotNull(textNode2);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0230");
        org.jsoup.safety.Whitelist whitelist1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.jsoup.Jsoup.clean("<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>", whitelist1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0231");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("#document");
        boolean boolean3 = tokenQueue1.matches("\n<!--#root-->");
        boolean boolean5 = tokenQueue1.matchChomp("#data");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!=\"#root=&quot;hi!&quot;\"" };
        java.lang.String str8 = tokenQueue1.consumeToAny(strArray7);
        java.lang.String str9 = tokenQueue1.remainder();
        java.lang.String str10 = tokenQueue1.toString();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#document" + "'", str8, "#document");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0232");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>", "org.jsoup.select.Selector$SelectorParseException: ");
        org.jsoup.nodes.Element element4 = document2.toggleClass("<!--#document-->");
        java.lang.String str5 = document2.nodeName();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#document" + "'", str5, "#document");
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0233");
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parseBodyFragment("hi!=\"#root=&quot;hi!&quot;\"", "#root=\"hi!\"");
        document2.title(" class=\"hi!\"");
        org.junit.Assert.assertNotNull(document2);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0234");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("#root", "");
        org.jsoup.nodes.Element element5 = document2.attr("#root", "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        java.lang.String str6 = element5.id();
        java.lang.String str7 = element5.html();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>" + "'", str7, "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0235");
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
        org.jsoup.select.Elements elements17 = element15.getElementsByIndexEquals((int) 'd');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(elements17);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0236");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("", "org.jsoup.select.selector$selectorparseexception:");
        boolean boolean4 = document2.hasAttr("#root");
        java.lang.String str5 = document2.title();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0237");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Element> elementList21 = elements18.subList(0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: toIndex = 10");
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
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0238");
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
        boolean boolean20 = tag16.isEmpty();
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
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0239");
        org.jsoup.nodes.Document document3 = org.jsoup.parser.Parser.parse("#root", "\n<!--#root-->");
        org.jsoup.select.Elements elements4 = org.jsoup.select.Selector.select("#declaration", (org.jsoup.nodes.Element) document3);
        org.jsoup.nodes.Element element5 = document3.body();
        org.jsoup.nodes.Element element6 = element5.firstElementSibling();
        java.lang.String str8 = element5.absUrl("[]");
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0240");
        org.jsoup.nodes.DataNode dataNode2 = new org.jsoup.nodes.DataNode("<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "hi!=\"#root=&quot;hi!&quot;\"");
        java.lang.String str3 = dataNode2.nodeName();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#data" + "'", str3, "#data");
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0241");
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
            java.lang.String str15 = element14.toString();
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
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0242");
        org.jsoup.nodes.DataNode dataNode2 = org.jsoup.nodes.DataNode.createFromEncoded("body", "#root");
        org.junit.Assert.assertNotNull(dataNode2);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0243");
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
        java.util.Iterator<org.jsoup.nodes.Element> elementItor17 = elements10.iterator();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(elementItor17);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0244");
        org.jsoup.safety.Whitelist whitelist2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.jsoup.Jsoup.clean("<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>", "#root=\"hi!\"", whitelist2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0245");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.hasText();
        java.lang.String str3 = document1.nodeName();
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        org.jsoup.nodes.Element element8 = document1.classNames((java.util.Set<java.lang.String>) strSet6);
        org.jsoup.nodes.Element element10 = document1.append("#document");
        org.jsoup.select.Elements elements12 = document1.getElementsByTag(" class=\"hi!\"");
        java.util.function.UnaryOperator<org.jsoup.nodes.Element> elementUnaryOperator13 = null;
        // The following exception was thrown during execution in test generation
        try {
            elements12.replaceAll(elementUnaryOperator13);
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
        org.junit.Assert.assertNotNull(elements12);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0246");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        java.lang.String str4 = document1.nodeName();
        org.jsoup.nodes.Element element6 = document1.appendElement("#document#document");
        org.jsoup.nodes.Node node7 = element6.previousSibling();
        org.jsoup.nodes.Document document9 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements11 = document9.getElementsByAttribute("hi!");
        java.lang.String str13 = elements11.attr("#root");
        org.jsoup.nodes.Document document15 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element[] elementArray16 = new org.jsoup.nodes.Element[] { document15 };
        java.util.ArrayList<org.jsoup.nodes.Element> elementList17 = new java.util.ArrayList<org.jsoup.nodes.Element>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<org.jsoup.nodes.Element>) elementList17, elementArray16);
        java.util.Spliterator<org.jsoup.nodes.Element> elementSpliterator19 = elementList17.spliterator();
        java.util.Spliterator<org.jsoup.nodes.Element> elementSpliterator20 = elementList17.spliterator();
        boolean boolean21 = elements11.containsAll((java.util.Collection<org.jsoup.nodes.Element>) elementList17);
        org.jsoup.select.Elements elements22 = new org.jsoup.select.Elements((java.util.List<org.jsoup.nodes.Element>) elementList17);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = node7.equals((java.lang.Object) elements22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#document" + "'", str4, "#document");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(elementArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(elementSpliterator19);
        org.junit.Assert.assertNotNull(elementSpliterator20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0247");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Document document2 = document1.normalise();
        org.jsoup.nodes.Element element3 = document1.head();
        org.jsoup.nodes.Element element5 = element3.append("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element7 = element3.wrap("#text");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node9 = element3.removeAttr("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNull(element7);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0248");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("#root", "");
        java.lang.String str3 = document2.outerHtml();
        org.jsoup.nodes.Element element5 = document2.append("<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        org.jsoup.select.Elements elements8 = document2.getElementsByAttributeValueStarting("#root=\"hi!\"", "org.jsoup.select.Selector$SelectorParseException: ");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements11 = document2.getElementsByAttributeValueNot("", "org.jsoup.select.selector$selectorparseexception:");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>" + "'", str3, "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements8);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0249");
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
        org.jsoup.select.Elements elements40 = elements13.removeAttr("#document#documenthi!");
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
        org.junit.Assert.assertNotNull(elements40);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0250");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("#document");
        boolean boolean3 = tokenQueue1.matches("\n<!--#root-->");
        boolean boolean5 = tokenQueue1.matchChomp("#data");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!=\"#root=&quot;hi!&quot;\"" };
        java.lang.String str8 = tokenQueue1.consumeToAny(strArray7);
        java.lang.String str9 = tokenQueue1.remainder();
        boolean boolean10 = tokenQueue1.matchesWhitespace();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#document" + "'", str8, "#document");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0251");
        org.jsoup.safety.Whitelist whitelist1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.jsoup.Jsoup.clean("org.jsoup.select.Selector$SelectorParseException: ", whitelist1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0252");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        boolean boolean5 = document1.hasClass("");
        java.lang.String str6 = document1.nodeName();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements8 = document1.select("org.jsoup.select.Selector$SelectorParseException: \n<!--#document-->");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query org.jsoup.select.Selector$SelectorParseException: ?<!--#document-->");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#document" + "'", str6, "#document");
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0253");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element5 = document1.prepend("#document");
        java.lang.String str6 = element5.nodeName();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#document" + "'", str6, "#document");
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0254");
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
        org.jsoup.select.Elements elements28 = elements15.val("a");
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
        org.junit.Assert.assertNotNull(elements28);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0255");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element5 = document1.prepend("#document");
        org.jsoup.select.Elements elements7 = element5.getElementsByAttribute("hi!");
        java.lang.String str8 = elements7.val();
        org.jsoup.select.Elements elements10 = elements7.toggleClass("#document#document");
        org.jsoup.select.Elements elements12 = elements7.eq((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element14 = elements7.remove(2);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 2, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(elements12);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0256");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Element> elementList18 = elements15.subList((int) '#', (int) 'd');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: toIndex = 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(elements15);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0257");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("#root", "");
        java.lang.String str3 = document2.html();
        java.lang.String str4 = document2.outerHtml();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>" + "'", str3, "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>" + "'", str4, "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0258");
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
        boolean boolean23 = elements19.is("[#, d, o, c, u, m, e, n, t]");
        java.lang.String str24 = elements19.text();
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
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0259");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("#root", "");
        java.lang.String str3 = document2.outerHtml();
        org.jsoup.nodes.Element element5 = document2.append("<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        org.jsoup.select.Elements elements8 = document2.getElementsByAttributeValueStarting("#root=\"hi!\"", "org.jsoup.select.Selector$SelectorParseException: ");
        org.jsoup.nodes.Element element10 = document2.prepend("#root=\"hi!\"");
        java.lang.String str11 = element10.id();
        org.jsoup.nodes.Element element13 = element10.prependElement("[#, d, o, c, u, m, e, n, t]");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>" + "'", str3, "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(element13);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0260");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.hasText();
        org.jsoup.nodes.Element element4 = document1.addClass("\n<!--#document-->");
        org.jsoup.nodes.Element element6 = element4.removeClass("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0261");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("#root", "");
        org.jsoup.nodes.Element element5 = document2.attr("#root", "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        java.lang.String str6 = document2.tagName();
        org.jsoup.nodes.Element element7 = document2.empty();
        org.jsoup.select.Elements elements8 = element7.children();
        org.jsoup.select.Elements elements9 = element7.children();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#root" + "'", str6, "#root");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(elements9);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0262");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements5 = elements3.prepend("");
        org.jsoup.select.Elements elements7 = elements5.removeAttr("");
        org.jsoup.select.Elements elements9 = elements7.removeAttr("hi!");
        java.lang.String str10 = elements7.outerHtml();
        java.util.stream.Stream<org.jsoup.nodes.Element> elementStream11 = elements7.parallelStream();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(elementStream11);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0263");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        java.lang.String str4 = document1.nodeName();
        org.jsoup.nodes.Element element6 = document1.appendElement("#document#document");
        org.jsoup.nodes.Element element7 = element6.firstElementSibling();
        org.jsoup.nodes.Element element9 = element6.append("a");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#document" + "'", str4, "#document");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNull(element7);
        org.junit.Assert.assertNotNull(element9);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0264");
        org.jsoup.nodes.Document document3 = org.jsoup.parser.Parser.parse("#root", "\n<!--#root-->");
        org.jsoup.select.Elements elements4 = org.jsoup.select.Selector.select("#declaration", (org.jsoup.nodes.Element) document3);
        org.jsoup.nodes.Element element5 = document3.body();
        java.lang.Object obj6 = null;
        boolean boolean7 = element5.equals(obj6);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0265");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document(" class=\"hi!\"");
        // The following exception was thrown during execution in test generation
        try {
            document1.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0266");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("#root", "");
        java.lang.String str3 = document2.outerHtml();
        org.jsoup.nodes.Element element5 = document2.append("<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        org.jsoup.select.Elements elements7 = document2.getElementsByIndexEquals(1);
        java.lang.String str8 = document2.nodeName();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node10 = document2.childNode((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32, Size: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>" + "'", str3, "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#document" + "'", str8, "#document");
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0267");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element5 = document1.prepend("#document");
        org.jsoup.nodes.Element element6 = element5.empty();
        org.jsoup.select.Elements elements8 = element5.getElementsByTag("org.jsoup.select.Selector$SelectorParseException: ");
        org.jsoup.select.Elements elements10 = elements8.removeClass("#root");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Element> elementList13 = elements10.subList((int) '#', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: toIndex = 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(elements10);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0268");
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parse("", "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document2);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0269");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("#root", "");
        comment2.setBaseUri("#document#documenthi!");
        java.lang.String str5 = comment2.getData();
        java.lang.String str6 = comment2.nodeName();
        java.lang.String str7 = comment2.getData();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#root" + "'", str5, "#root");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#comment" + "'", str6, "#comment");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#root" + "'", str7, "#root");
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0270");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("#document#document", "\n<!--#document-->", false);
        java.lang.String str4 = xmlDeclaration3.toString();
        java.lang.String str5 = xmlDeclaration3.nodeName();
        java.lang.String str6 = xmlDeclaration3.getWholeDeclaration();
        java.lang.String str7 = xmlDeclaration3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<?#document#document>" + "'", str4, "<?#document#document>");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#declaration" + "'", str5, "#declaration");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#document#document" + "'", str6, "#document#document");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<?#document#document>" + "'", str7, "<?#document#document>");
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0271");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragmentRelaxed("hi!", "#data");
        document2.title("org.jsoup.select.Selector$SelectorParseException: \n<!--#document-->");
        org.junit.Assert.assertNotNull(document2);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0272");
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
        java.util.function.UnaryOperator<org.jsoup.nodes.Element> elementUnaryOperator16 = null;
        // The following exception was thrown during execution in test generation
        try {
            elements10.replaceAll(elementUnaryOperator16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(elements15);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0273");
        org.jsoup.select.Selector.SelectorParseException selectorParseException1 = new org.jsoup.select.Selector.SelectorParseException("org.jsoup.select.selector$selectorparseexception:");
        java.lang.Throwable[] throwableArray2 = selectorParseException1.getSuppressed();
        java.lang.Throwable[] throwableArray3 = selectorParseException1.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray3);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0274");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = org.jsoup.Jsoup.parse(file0, "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0275");
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
        java.lang.Class<?> wildcardClass15 = elementList9.getClass();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(elementArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(elementSpliterator11);
        org.junit.Assert.assertNotNull(elementSpliterator12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0276");
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
        boolean boolean15 = elements14.hasText();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0277");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element28 = elements15.remove((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0278");
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
        org.jsoup.nodes.Element element54 = element18.appendElement("org.jsoup.select.Selector$SelectorParseException: org.jsoup.select.selector$selectorparseexception:");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements57 = element54.getElementsByAttributeValueStarting("<?#document#document>", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(element54);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0279");
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
        org.jsoup.select.Elements elements18 = document16.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements20 = elements18.prepend("");
        elements20.clear();
        int int23 = elements20.indexOf((java.lang.Object) "org.jsoup.select.Selector$SelectorParseException: ");
        org.jsoup.select.Elements elements25 = elements20.append("#document");
        java.util.Iterator<org.jsoup.nodes.Element> elementItor26 = elements20.iterator();
        org.jsoup.nodes.Element element27 = elements20.last();
        boolean boolean28 = elements14.removeAll((java.util.Collection<org.jsoup.nodes.Element>) elements20);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertNotNull(elements20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(elements25);
        org.junit.Assert.assertNotNull(elementItor26);
        org.junit.Assert.assertNull(element27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0280");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        java.lang.String str4 = elements3.val();
        java.lang.Object obj5 = null;
        int int6 = elements3.lastIndexOf(obj5);
        org.jsoup.select.Elements elements8 = elements3.eq((int) '#');
        elements3.clear();
        org.jsoup.select.Elements elements11 = elements3.prepend("hi!");
        org.jsoup.nodes.Document document14 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element17 = document14.attr("hi!", "#root");
        java.lang.String str18 = document14.id();
        org.jsoup.nodes.Element element20 = document14.append("hi!=\"#root=&quot;hi!&quot;\"");
        boolean boolean22 = document14.hasClass("");
        // The following exception was thrown during execution in test generation
        try {
            elements11.add((int) '#', (org.jsoup.nodes.Element) document14);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 35, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0281");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("#declaration", "body");
        org.junit.Assert.assertNotNull(textNode2);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0282");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements23 = element21.select("");
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
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(document17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>" + "'", str18, "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(element21);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0283");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("");
        boolean boolean3 = tokenQueue1.matchChomp("org.jsoup.select.selector$selectorparseexception:");
        java.lang.String str4 = tokenQueue1.consumeCssIdentifier();
        org.jsoup.parser.TokenQueue tokenQueue6 = new org.jsoup.parser.TokenQueue("");
        boolean boolean8 = tokenQueue6.matchChomp("org.jsoup.select.selector$selectorparseexception:");
        java.lang.String str9 = tokenQueue6.consumeWord();
        org.jsoup.parser.TokenQueue tokenQueue11 = new org.jsoup.parser.TokenQueue("");
        boolean boolean12 = tokenQueue11.isEmpty();
        java.lang.String[] strArray16 = new java.lang.String[] { " class=\"hi!\"", "#data", "[]" };
        java.lang.String str17 = tokenQueue11.consumeToAny(strArray16);
        java.lang.String str18 = tokenQueue6.consumeToAny(strArray16);
        boolean boolean19 = tokenQueue1.matchesAny(strArray16);
        java.lang.String str20 = tokenQueue1.remainder();
        java.lang.String[] strArray26 = new java.lang.String[] { " ", "#root=\"hi!\"", "#text", "#document", "#document" };
        boolean boolean27 = tokenQueue1.matchesAny(strArray26);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0284");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("org.jsoup.select.Selector$SelectorParseException: ");
        boolean boolean2 = tag1.isData();
        boolean boolean3 = tag1.requiresSpecificParent();
        boolean boolean4 = tag1.isBlock();
        boolean boolean5 = tag1.isEmpty();
        boolean boolean6 = tag1.isData();
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0285");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("#document");
        boolean boolean3 = tokenQueue1.matches("\n<!--#root-->");
        boolean boolean5 = tokenQueue1.matchChomp("#data");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!=\"#root=&quot;hi!&quot;\"" };
        java.lang.String str8 = tokenQueue1.consumeToAny(strArray7);
        boolean boolean9 = tokenQueue1.consumeWhitespace();
        java.lang.String[] strArray14 = new java.lang.String[] { "org.jsoup.select.Selector$SelectorParseException: \n<!--#document-->", "#root=\"hi!\"", "\n&lt;!--#root--&gt;", "\n<!--#root-->" };
        java.lang.String str15 = tokenQueue1.consumeToAny(strArray14);
        boolean boolean17 = tokenQueue1.matches("<!--#document-->");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Character char18 = tokenQueue1.consume();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#document" + "'", str8, "#document");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0286");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!", "hi!");
        attribute2.setKey("#root");
        java.lang.String str5 = attribute2.getKey();
        java.lang.String str6 = attribute2.html();
        java.lang.String str7 = attribute2.getValue();
        java.lang.String str8 = attribute2.getValue();
        java.lang.String str9 = attribute2.toString();
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#root" + "'", str5, "#root");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#root=\"hi!\"" + "'", str6, "#root=\"hi!\"");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#root=\"hi!\"" + "'", str9, "#root=\"hi!\"");
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0287");
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
        java.util.Spliterator<org.jsoup.nodes.Element> elementSpliterator42 = elements38.spliterator();
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
        org.junit.Assert.assertNotNull(elementSpliterator42);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0288");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("org.jsoup.select.Selector$SelectorParseException: ");
        boolean boolean2 = tag1.isData();
        boolean boolean3 = tag1.requiresSpecificParent();
        org.jsoup.parser.Tag tag5 = org.jsoup.parser.Tag.valueOf("org.jsoup.select.Selector$SelectorParseException: ");
        boolean boolean6 = tag5.isData();
        org.jsoup.parser.Tag tag8 = org.jsoup.parser.Tag.valueOf("#root");
        boolean boolean9 = tag8.isInline();
        boolean boolean10 = tag5.isValidParent(tag8);
        boolean boolean11 = tag1.canContain(tag8);
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0289");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("", "org.jsoup.select.selector$selectorparseexception:");
        java.lang.String str3 = document2.nodeName();
        org.jsoup.nodes.Element element5 = document2.prependElement("<!--#document-->");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(element5);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0290");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parse("hi!");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("org.jsoup.select.selector$selectorparseexception:");
        java.lang.String str4 = document1.nodeName();
        org.jsoup.nodes.Element element6 = document1.appendText("\n&lt;!--#root--&gt;");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = element6.absUrl("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#document" + "'", str4, "#document");
        org.junit.Assert.assertNotNull(element6);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0291");
        org.jsoup.safety.Whitelist whitelist2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.jsoup.Jsoup.clean("[#, d, o, c, u, m, e, n, t, #, d, o, c, u, m, e, n, t, =, \", #, d, o, c, u, m, e, n, t, #, d, o, c, u, m, e, n, t, \"]", "", whitelist2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0292");
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
        org.jsoup.nodes.Attributes attributes20 = new org.jsoup.nodes.Attributes();
        int int21 = attributes20.size();
        java.lang.String str22 = attributes20.html();
        java.lang.String str23 = attributes20.html();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator24 = attributes20.spliterator();
        java.lang.String str25 = attributes20.html();
        attributes15.addAll(attributes20);
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor27 = attributes15.iterator();
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
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(attributeSpliterator24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(attributeItor27);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0293");
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
            org.jsoup.nodes.Element element16 = element14.toggleClass("#document#documentdocument");
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
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0294");
        org.jsoup.safety.Whitelist whitelist1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.jsoup.Jsoup.clean("#root=\"hi!\"", whitelist1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0295");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parse("hi!");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("org.jsoup.select.selector$selectorparseexception:");
        java.lang.String str4 = elements3.text();
        org.jsoup.nodes.Document document7 = new org.jsoup.nodes.Document("");
        boolean boolean8 = document7.hasText();
        java.lang.String str9 = document7.nodeName();
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet12 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet12, strArray11);
        org.jsoup.nodes.Element element14 = document7.classNames((java.util.Set<java.lang.String>) strSet12);
        org.jsoup.nodes.Element element16 = element14.addClass("#document");
        java.lang.String str17 = element16.html();
        org.jsoup.nodes.Element element19 = element16.appendElement("#document");
        java.lang.String str20 = element19.html();
        org.jsoup.nodes.Document document23 = org.jsoup.parser.Parser.parse("#root", "");
        java.lang.String str24 = document23.outerHtml();
        org.jsoup.nodes.Element element26 = document23.createElement("#document#documenthi!");
        org.jsoup.nodes.Element element27 = element19.prependChild((org.jsoup.nodes.Node) element26);
        // The following exception was thrown during execution in test generation
        try {
            elements3.add((int) (short) 1, element19);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#document" + "'", str9, "#document");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(document23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>" + "'", str24, "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertNotNull(element27);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0296");
        org.jsoup.safety.Whitelist whitelist2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.jsoup.Jsoup.clean("body", "#data", whitelist2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0297");
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
        org.jsoup.nodes.Document document21 = org.jsoup.nodes.Document.createShell("hi!");
        boolean boolean22 = elements19.add((org.jsoup.nodes.Element) document21);
        boolean boolean24 = elements19.hasClass("org.jsoup.select.Selector$SelectorParseException:");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertNotNull(document21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0298");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        java.lang.String str5 = elements3.attr("#root");
        java.lang.String str6 = elements3.text();
        org.jsoup.select.Elements elements8 = elements3.prepend("org.jsoup.select.selector$selectorparseexception:");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Element> elementList11 = elements3.subList((int) (short) 10, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: toIndex = 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(elements8);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0299");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        java.lang.String str5 = elements3.attr("#root");
        java.lang.String str6 = elements3.text();
        org.jsoup.select.Elements elements8 = elements3.eq((int) (short) 10);
        boolean boolean10 = elements3.is("org.jsoup.select.Selector$SelectorParseException: ");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0300");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parse(file0, "org.jsoup.select.selector$selectorparseexception:");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0301");
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
        org.jsoup.select.Elements elements17 = document15.getElementsByAttribute("hi!");
        java.lang.String str19 = elements17.attr("#root");
        org.jsoup.nodes.Document document21 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element[] elementArray22 = new org.jsoup.nodes.Element[] { document21 };
        java.util.ArrayList<org.jsoup.nodes.Element> elementList23 = new java.util.ArrayList<org.jsoup.nodes.Element>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<org.jsoup.nodes.Element>) elementList23, elementArray22);
        java.util.Spliterator<org.jsoup.nodes.Element> elementSpliterator25 = elementList23.spliterator();
        java.util.Spliterator<org.jsoup.nodes.Element> elementSpliterator26 = elementList23.spliterator();
        boolean boolean27 = elements17.containsAll((java.util.Collection<org.jsoup.nodes.Element>) elementList23);
        org.jsoup.select.Elements elements29 = elements17.addClass("org.jsoup.select.Selector$SelectorParseException: ");
        boolean boolean30 = element10.equals((java.lang.Object) "org.jsoup.select.Selector$SelectorParseException: ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(elementArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(elementSpliterator25);
        org.junit.Assert.assertNotNull(elementSpliterator26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(elements29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0302");
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
        org.jsoup.select.Elements elements17 = element13.getElementsByAttribute("org.jsoup.select.Selector$SelectorParseException: ");
        org.jsoup.nodes.Document document20 = new org.jsoup.nodes.Document("");
        boolean boolean21 = document20.hasText();
        java.lang.String str22 = document20.nodeName();
        java.lang.String str23 = document20.val();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element24 = elements17.set((int) (short) 10, (org.jsoup.nodes.Element) document20);
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
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "#document" + "'", str22, "#document");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0303");
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
        boolean boolean43 = tag35.isEmpty();
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
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0304");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("org.jsoup.select.Selector$SelectorParseException: ");
        java.lang.String str2 = tag1.getName();
        boolean boolean3 = tag1.isInline();
        boolean boolean4 = tag1.isEmpty();
        boolean boolean5 = tag1.isEmpty();
        org.jsoup.parser.Tag tag6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = tag1.isValidParent(tag6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.jsoup.select.selector$selectorparseexception:" + "'", str2, "org.jsoup.select.selector$selectorparseexception:");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0305");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "\n<!--#root-->");
        java.lang.String str3 = textNode2.getWholeText();
        org.jsoup.nodes.TextNode textNode5 = textNode2.text("hi!");
        org.jsoup.nodes.TextNode textNode7 = textNode2.text("#root=\"hi!\"");
        java.lang.String str8 = textNode7.getWholeText();
        org.jsoup.nodes.Node node11 = textNode7.attr("org.jsoup.select.Selector$SelectorParseException: org.jsoup.select.selector$selectorparseexception:", "org.jsoup.select.Selector$SelectorParseException:");
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(textNode5);
        org.junit.Assert.assertNotNull(textNode7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#root=\"hi!\"" + "'", str8, "#root=\"hi!\"");
        org.junit.Assert.assertNotNull(node11);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0306");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element5 = document1.prepend("#document");
        org.jsoup.nodes.Element element6 = element5.empty();
        org.jsoup.select.Elements elements8 = element5.getElementsByTag("org.jsoup.select.Selector$SelectorParseException: ");
        org.jsoup.select.Elements elements10 = elements8.removeClass("#root");
        org.jsoup.select.Elements elements12 = elements8.append("");
        boolean boolean14 = elements8.hasAttr("#document#document");
        org.jsoup.select.Elements elements16 = elements8.toggleClass("#document#document");
        java.lang.String str17 = elements16.outerHtml();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0307");
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
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor14 = elements3.listIterator();
        java.lang.String str15 = elements3.val();
        org.jsoup.nodes.Document document19 = org.jsoup.parser.Parser.parse("#root", "\n<!--#root-->");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element20 = elements3.set((-1), (org.jsoup.nodes.Element) document19);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(elementArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(elementSpliterator11);
        org.junit.Assert.assertNotNull(elementSpliterator12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(elementItor14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(document19);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0308");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("#root", "");
        comment2.setBaseUri("#document#documenthi!");
        java.lang.String str5 = comment2.getData();
        java.lang.String str7 = comment2.attr("[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#root" + "'", str5, "#root");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0309");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("<?#document#document>");
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0310");
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
        java.lang.String str31 = element26.outerHtml();
        java.lang.String str32 = element26.toString();
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
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "#document#document" + "'", str31, "#document#document");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "#document#document" + "'", str32, "#document#document");
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0311");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parse("hi!");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("org.jsoup.select.selector$selectorparseexception:");
        java.lang.String str4 = document1.nodeName();
        org.jsoup.nodes.Node node5 = null;
        // The following exception was thrown during execution in test generation
        try {
            document1.replaceWith(node5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#document" + "'", str4, "#document");
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0312");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("#declaration");
        org.junit.Assert.assertNotNull(document1);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0313");
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
        org.jsoup.select.Elements elements46 = elements19.append("\n<!--#document-->");
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
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0314");
        org.jsoup.nodes.DataNode dataNode2 = new org.jsoup.nodes.DataNode("#data", "[]");
        boolean boolean4 = dataNode2.hasAttr("org.jsoup.select.selector$selectorparseexception:");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0315");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("#root", "");
        java.lang.String str3 = document2.html();
        java.lang.String str5 = document2.attr("org.jsoup.select.selector$selectorparseexception:");
        java.lang.String str6 = document2.id();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element8 = document2.child((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>" + "'", str3, "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0316");
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
        org.jsoup.nodes.Element element28 = elements15.first();
        java.util.function.UnaryOperator<org.jsoup.nodes.Element> elementUnaryOperator29 = null;
        // The following exception was thrown during execution in test generation
        try {
            elements15.replaceAll(elementUnaryOperator29);
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
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertNotNull(element28);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0317");
        org.jsoup.safety.Whitelist whitelist1 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.jsoup.Jsoup.isValid("org.jsoup.select.selector$selectorparseexception:", whitelist1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0318");
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
        org.jsoup.nodes.Element element51 = element49.html("");
        org.jsoup.select.Elements elements54 = element49.getElementsByAttributeValueNot("#root", "org.jsoup.select.Selector$SelectorParseException: ");
        // The following exception was thrown during execution in test generation
        try {
            document37.replaceWith((org.jsoup.nodes.Node) element49);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(elements54);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0319");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements5 = elements3.prepend("");
        org.jsoup.select.Elements elements7 = elements5.removeAttr("");
        org.jsoup.select.Elements elements9 = elements7.removeAttr("hi!");
        org.jsoup.nodes.Document document12 = org.jsoup.parser.Parser.parse("#root", "");
        org.jsoup.nodes.Element element15 = document12.attr("#root", "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        java.lang.String str16 = document12.tagName();
        java.lang.String str17 = document12.toString();
        org.jsoup.nodes.Node node19 = document12.removeAttr("[#, d, o, c, u, m, e, n, t]");
        boolean boolean20 = elements7.equals((java.lang.Object) "[#, d, o, c, u, m, e, n, t]");
        java.lang.String str21 = elements7.outerHtml();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "#root" + "'", str16, "#root");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>" + "'", str17, "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0320");
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
            org.jsoup.nodes.Element element16 = element14.toggleClass("document");
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
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0321");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("#document");
        boolean boolean3 = tokenQueue1.matches("\n<!--#root-->");
        boolean boolean5 = tokenQueue1.matchChomp("#data");
        boolean boolean7 = tokenQueue1.matchChomp("#document#document");
        boolean boolean8 = tokenQueue1.matchesWord();
        boolean boolean9 = tokenQueue1.matchesWord();
        java.lang.String str10 = tokenQueue1.consumeAttributeKey();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0322");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("#root", "");
        org.jsoup.nodes.Element element5 = document2.attr("#root", "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        java.lang.String str6 = document2.tagName();
        java.lang.String str7 = document2.text();
        org.jsoup.nodes.Element element9 = document2.text("#document#documentdocument");
        org.jsoup.nodes.Element element10 = element9.parent();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#root" + "'", str6, "#root");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#root" + "'", str7, "#root");
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNull(element10);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0323");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("org.jsoup.select.Selector$SelectorParseException: ");
        boolean boolean2 = tag1.isData();
        org.jsoup.nodes.Attributes attributes4 = new org.jsoup.nodes.Attributes();
        int int5 = attributes4.size();
        java.lang.String str6 = attributes4.html();
        org.jsoup.nodes.Element element7 = new org.jsoup.nodes.Element(tag1, "org.jsoup.select.selector$selectorparseexception:", attributes4);
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor8 = attributes4.iterator();
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributeItor8);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0324");
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
        org.jsoup.nodes.Document document50 = new org.jsoup.nodes.Document("");
        boolean boolean51 = document50.hasText();
        java.lang.String str52 = document50.nodeName();
        java.lang.String[] strArray54 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet55 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet55, strArray54);
        org.jsoup.nodes.Element element57 = document50.classNames((java.util.Set<java.lang.String>) strSet55);
        org.jsoup.nodes.Element element59 = document50.append("#document");
        org.jsoup.nodes.Element element61 = element59.html("");
        org.jsoup.select.Elements elements64 = element59.getElementsByAttributeValueNot("#root", "org.jsoup.select.Selector$SelectorParseException: ");
        java.lang.String str65 = element59.val();
        org.jsoup.nodes.Element element67 = element59.wrap("\n<!--#root-->");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element68 = elements35.set(0, element59);
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
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "#document" + "'", str52, "#document");
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(element57);
        org.junit.Assert.assertNotNull(element59);
        org.junit.Assert.assertNotNull(element61);
        org.junit.Assert.assertNotNull(elements64);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertNull(element67);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0325");
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
        org.jsoup.select.Elements elements19 = elements17.toggleClass("<!--#document-->");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertNotNull(elements19);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0326");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("org.jsoup.select.Selector$SelectorParseException: org.jsoup.select.selector$selectorparseexception:", "#root");
        java.lang.String str3 = attribute2.toString();
        java.lang.String str4 = attribute2.getKey();
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "org.jsoup.select.selector$selectorparseexception: org.jsoup.select.selector$selectorparseexception:=\"#root\"" + "'", str3, "org.jsoup.select.selector$selectorparseexception: org.jsoup.select.selector$selectorparseexception:=\"#root\"");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "org.jsoup.select.selector$selectorparseexception: org.jsoup.select.selector$selectorparseexception:" + "'", str4, "org.jsoup.select.selector$selectorparseexception: org.jsoup.select.selector$selectorparseexception:");
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0327");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        java.lang.String str4 = elements3.val();
        boolean boolean6 = elements3.is("org.jsoup.select.selector$selectorparseexception:");
        // The following exception was thrown during execution in test generation
        try {
            java.util.ListIterator<org.jsoup.nodes.Element> elementItor8 = elements3.listIterator(3);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0328");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("org.jsoup.select.Selector$SelectorParseException: ");
        boolean boolean2 = tag1.isData();
        org.jsoup.nodes.Attributes attributes4 = new org.jsoup.nodes.Attributes();
        int int5 = attributes4.size();
        java.lang.String str6 = attributes4.html();
        org.jsoup.nodes.Element element7 = new org.jsoup.nodes.Element(tag1, "org.jsoup.select.selector$selectorparseexception:", attributes4);
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator8 = attributes4.spliterator();
        boolean boolean10 = attributes4.hasKey("#root");
        org.jsoup.nodes.Document document12 = new org.jsoup.nodes.Document("");
        boolean boolean13 = document12.hasText();
        java.lang.String str14 = document12.nodeName();
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet17 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet17, strArray16);
        org.jsoup.nodes.Element element19 = document12.classNames((java.util.Set<java.lang.String>) strSet17);
        org.jsoup.nodes.Element element21 = element19.addClass("#document");
        java.lang.String str22 = element21.html();
        org.jsoup.nodes.Element element24 = element21.appendElement("#document");
        java.lang.String str25 = element24.html();
        org.jsoup.select.Elements elements28 = element24.getElementsByAttributeValueStarting("#root=\"hi!\"", "[#, d, o, c, u, m, e, n, t]");
        java.lang.String str29 = element24.text();
        boolean boolean30 = attributes4.equals((java.lang.Object) element24);
        int int31 = attributes4.size();
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributeSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#document" + "'", str14, "#document");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(elements28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0329");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element4 = document1.attr("hi!", "#root");
        java.lang.String str5 = document1.id();
        org.jsoup.select.Elements elements6 = document1.children();
        boolean boolean7 = elements6.isEmpty();
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0330");
        org.jsoup.select.Selector.SelectorParseException selectorParseException1 = new org.jsoup.select.Selector.SelectorParseException("org.jsoup.select.selector$selectorparseexception:");
        org.jsoup.select.Selector.SelectorParseException selectorParseException3 = new org.jsoup.select.Selector.SelectorParseException("org.jsoup.select.selector$selectorparseexception:");
        java.lang.Throwable[] throwableArray4 = selectorParseException3.getSuppressed();
        org.jsoup.select.Selector.SelectorParseException selectorParseException6 = new org.jsoup.select.Selector.SelectorParseException("\n<!--#document-->");
        selectorParseException3.addSuppressed((java.lang.Throwable) selectorParseException6);
        selectorParseException1.addSuppressed((java.lang.Throwable) selectorParseException6);
        java.lang.String str9 = selectorParseException1.toString();
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "org.jsoup.select.Selector$SelectorParseException: org.jsoup.select.selector$selectorparseexception:" + "'", str9, "org.jsoup.select.Selector$SelectorParseException: org.jsoup.select.selector$selectorparseexception:");
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0331");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        java.lang.String str4 = elements3.val();
        java.lang.Object obj5 = null;
        int int6 = elements3.lastIndexOf(obj5);
        org.jsoup.select.Elements elements8 = elements3.eq((int) '#');
        boolean boolean10 = elements3.hasAttr("#root");
        int int12 = elements3.indexOf((java.lang.Object) (byte) 100);
        int int13 = elements3.size();
        java.util.stream.Stream<org.jsoup.nodes.Element> elementStream14 = elements3.parallelStream();
        org.jsoup.nodes.Document document18 = org.jsoup.Jsoup.parseBodyFragment("hi!=\"#root=&quot;hi!&quot;\"", "#root=\"hi!\"");
        org.jsoup.select.Elements elements21 = document18.getElementsByAttributeValueContaining("[]", "#root");
        // The following exception was thrown during execution in test generation
        try {
            elements3.add(10, (org.jsoup.nodes.Element) document18);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(elementStream14);
        org.junit.Assert.assertNotNull(document18);
        org.junit.Assert.assertNotNull(elements21);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0332");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element40 = elements13.remove((int) (byte) 10);
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
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0333");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Document document2 = document1.normalise();
        org.jsoup.nodes.Element element3 = document2.head();
        org.jsoup.nodes.Element element6 = document2.attr("org.jsoup.select.Selector$SelectorParseException: ", "[]");
        org.jsoup.nodes.Element element8 = element6.appendElement("#comment");
        org.jsoup.nodes.Element element10 = element6.prependText("#document");
        org.jsoup.nodes.Node node13 = element10.attr("org.jsoup.select.Selector$SelectorParseException: org.jsoup.select.selector$selectorparseexception:", "[#, d, o, c, u, m, e, n, t, #, d, o, c, u, m, e, n, t, =, \", #, d, o, c, u, m, e, n, t, #, d, o, c, u, m, e, n, t, \"]");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(node13);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0334");
        org.jsoup.nodes.DataNode dataNode2 = new org.jsoup.nodes.DataNode("#root=\"hi!\"", "\n<!--#root-->");
        java.lang.String str3 = dataNode2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#root=\"hi!\"" + "'", str3, "#root=\"hi!\"");
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0335");
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
        java.lang.String str19 = elements18.val();
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
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0336");
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
        java.util.function.UnaryOperator<org.jsoup.nodes.Element> elementUnaryOperator42 = null;
        // The following exception was thrown during execution in test generation
        try {
            elements38.replaceAll(elementUnaryOperator42);
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
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0337");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.hasText();
        java.lang.String str3 = document1.nodeName();
        org.jsoup.select.Elements elements4 = document1.children();
        org.jsoup.select.Elements elements6 = document1.getElementsByTag("#document#documenthi!");
        org.jsoup.select.Elements elements8 = elements6.removeClass("#document#documentdocument");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Element> elementList11 = elements6.subList((int) (byte) 1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: toIndex = 35");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements8);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0338");
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parseBodyFragment("hi!=\"#root=&quot;hi!&quot;\"", "#root=\"hi!\"");
        java.lang.String str3 = document2.id();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node5 = document2.childNode((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 97, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0339");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element29 = elements15.remove((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32, Size: 1");
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
        org.junit.Assert.assertNotNull(elements20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(elements23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(elements26);
        org.junit.Assert.assertNotNull(element27);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0340");
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parse("", "");
        java.lang.String str3 = document2.nodeName();
        java.lang.String str4 = document2.text();
        org.jsoup.nodes.Element element5 = document2.head();
        java.lang.String str6 = document2.data();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0341");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded(" class=\"hi!\"", "org.jsoup.select.Selector$SelectorParseException: ");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("#data");
        java.lang.Class<?> wildcardClass5 = textNode4.getClass();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0342");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        java.lang.String str4 = elements3.val();
        java.lang.Object obj5 = null;
        int int6 = elements3.lastIndexOf(obj5);
        org.jsoup.select.Elements elements8 = elements3.eq((int) '#');
        elements3.clear();
        org.jsoup.select.Elements elements11 = elements3.prepend("hi!");
        java.util.Collection<org.jsoup.nodes.Element> elementCollection12 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = elements3.retainAll(elementCollection12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(elements11);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0343");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element5 = document1.prepend("#document");
        org.jsoup.select.Elements elements7 = element5.getElementsByAttribute("hi!");
        java.lang.String str8 = elements7.val();
        java.lang.String str9 = elements7.outerHtml();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0344");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.ListIterator<org.jsoup.nodes.Element> elementItor21 = elements13.listIterator((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32");
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
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(attributeItor18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0345");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        java.lang.String str4 = elements3.outerHtml();
        org.jsoup.select.Elements elements6 = elements3.select("\n<!--#document-->");
        java.lang.String str7 = elements3.val();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0346");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "<html> \n <head> \n </head> \n <body>\n   #root  \n </body>\n</html>", false);
        java.lang.String str4 = xmlDeclaration3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<?>" + "'", str4, "<?>");
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0347");
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
        org.jsoup.nodes.Document document37 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements39 = document37.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements41 = elements39.prepend("");
        org.jsoup.select.Elements elements43 = elements41.removeAttr("");
        org.jsoup.nodes.Document document45 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements47 = document45.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements49 = elements47.prepend("");
        org.jsoup.select.Elements elements51 = elements49.removeAttr("");
        boolean boolean52 = elements41.containsAll((java.util.Collection<org.jsoup.nodes.Element>) elements49);
        java.lang.Object[] objArray53 = elements41.toArray();
        org.jsoup.select.Elements elements55 = elements41.select("#document#document");
        org.jsoup.select.Elements elements56 = org.jsoup.select.Selector.select("hi!", (java.lang.Iterable<org.jsoup.nodes.Element>) elements41);
        boolean boolean57 = elements31.addAll(0, (java.util.Collection<org.jsoup.nodes.Element>) elements41);
        org.jsoup.nodes.Document document59 = new org.jsoup.nodes.Document("");
        boolean boolean60 = document59.hasText();
        java.lang.String str61 = document59.nodeName();
        java.lang.String[] strArray63 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet64 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet64, strArray63);
        org.jsoup.nodes.Element element66 = document59.classNames((java.util.Set<java.lang.String>) strSet64);
        org.jsoup.nodes.Element element68 = document59.append("#document");
        org.jsoup.nodes.Element element70 = document59.prepend("#document");
        org.jsoup.select.Elements elements71 = document59.parents();
        org.jsoup.nodes.Document document73 = new org.jsoup.nodes.Document("");
        boolean boolean74 = document73.hasText();
        java.lang.String str75 = document73.nodeName();
        java.lang.String[] strArray77 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet78 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet78, strArray77);
        org.jsoup.nodes.Element element80 = document73.classNames((java.util.Set<java.lang.String>) strSet78);
        org.jsoup.nodes.Element element82 = element80.addClass("#document");
        java.lang.String str83 = element82.html();
        org.jsoup.nodes.Element element85 = element82.appendElement("#document");
        java.lang.String str86 = element85.html();
        java.lang.String str87 = element85.text();
        org.jsoup.select.Elements elements89 = element85.getElementsByAttribute("org.jsoup.select.Selector$SelectorParseException: ");
        org.jsoup.select.Elements elements91 = element85.getElementsByIndexEquals((int) (byte) 1);
        boolean boolean92 = elements71.removeAll((java.util.Collection<org.jsoup.nodes.Element>) elements91);
        int int93 = elements31.indexOf((java.lang.Object) elements91);
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
        org.junit.Assert.assertNotNull(elements39);
        org.junit.Assert.assertNotNull(elements41);
        org.junit.Assert.assertNotNull(elements43);
        org.junit.Assert.assertNotNull(elements47);
        org.junit.Assert.assertNotNull(elements49);
        org.junit.Assert.assertNotNull(elements51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray53), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray53), "[]");
        org.junit.Assert.assertNotNull(elements55);
        org.junit.Assert.assertNotNull(elements56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "#document" + "'", str61, "#document");
        org.junit.Assert.assertNotNull(strArray63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(element66);
        org.junit.Assert.assertNotNull(element68);
        org.junit.Assert.assertNotNull(element70);
        org.junit.Assert.assertNotNull(elements71);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "#document" + "'", str75, "#document");
        org.junit.Assert.assertNotNull(strArray77);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertNotNull(element80);
        org.junit.Assert.assertNotNull(element82);
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "" + "'", str83, "");
        org.junit.Assert.assertNotNull(element85);
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "" + "'", str86, "");
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "" + "'", str87, "");
        org.junit.Assert.assertNotNull(elements89);
        org.junit.Assert.assertNotNull(elements91);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertTrue("'" + int93 + "' != '" + (-1) + "'", int93 == (-1));
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0348");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("org.jsoup.select.selector$selectorparseexception: org.jsoup.select.selector$selectorparseexception:=\"#root\"", "org.jsoup.select.Selector$SelectorParseException: org.jsoup.select.selector$selectorparseexception:");
        java.lang.String str3 = comment2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n<!--org.jsoup.select.selector$selectorparseexception: org.jsoup.select.selector$selectorparseexception:=\"#root\"-->" + "'", str3, "\n<!--org.jsoup.select.selector$selectorparseexception: org.jsoup.select.selector$selectorparseexception:=\"#root\"-->");
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0349");
        org.jsoup.nodes.DataNode dataNode2 = new org.jsoup.nodes.DataNode("body", "#document#document=\"#document#document\"");
        java.lang.String str4 = dataNode2.absUrl("#document#document");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0350");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parse("hi!");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValue("hi!", "hi!");
        org.jsoup.nodes.Attributes attributes5 = document1.attributes();
        org.jsoup.nodes.Element element6 = document1.head();
        org.jsoup.select.Elements elements8 = document1.getElementsByAttribute("<?#document#document>");
        java.lang.String str9 = elements8.text();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0351");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("#declaration", "a");
        java.lang.String str3 = comment2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n<!--#declaration-->" + "'", str3, "\n<!--#declaration-->");
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0352");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements5 = elements3.prepend("");
        elements5.clear();
        int int8 = elements5.indexOf((java.lang.Object) "org.jsoup.select.Selector$SelectorParseException: ");
        org.jsoup.select.Elements elements10 = elements5.append("#document");
        java.util.Iterator<org.jsoup.nodes.Element> elementItor11 = elements5.iterator();
        org.jsoup.nodes.Element element12 = elements5.last();
        org.jsoup.nodes.Document document14 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements16 = document14.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements18 = elements16.prepend("");
        org.jsoup.select.Elements elements20 = elements18.removeAttr("");
        org.jsoup.nodes.Document document22 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements24 = document22.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements26 = elements24.prepend("");
        org.jsoup.select.Elements elements28 = elements26.removeAttr("");
        boolean boolean29 = elements18.containsAll((java.util.Collection<org.jsoup.nodes.Element>) elements26);
        org.jsoup.nodes.Document document31 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements33 = document31.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements35 = elements33.prepend("");
        org.jsoup.select.Elements elements37 = elements35.removeAttr("");
        org.jsoup.nodes.Document document39 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements41 = document39.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements43 = elements41.prepend("");
        org.jsoup.select.Elements elements45 = elements43.removeAttr("");
        boolean boolean46 = elements35.containsAll((java.util.Collection<org.jsoup.nodes.Element>) elements43);
        org.jsoup.select.Elements elements48 = elements43.wrap("#root");
        boolean boolean49 = elements26.containsAll((java.util.Collection<org.jsoup.nodes.Element>) elements48);
        org.jsoup.select.Elements elements50 = new org.jsoup.select.Elements((java.util.Collection<org.jsoup.nodes.Element>) elements26);
        org.jsoup.nodes.Element element51 = elements26.first();
        org.jsoup.nodes.Document document54 = org.jsoup.parser.Parser.parseBodyFragment("\n<!--#root-->", "#root");
        org.jsoup.nodes.Element element56 = document54.removeClass("#root=\"hi!\"");
        boolean boolean57 = elements26.add(element56);
        boolean boolean58 = elements5.retainAll((java.util.Collection<org.jsoup.nodes.Element>) elements26);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(elementItor11);
        org.junit.Assert.assertNull(element12);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertNotNull(elements20);
        org.junit.Assert.assertNotNull(elements24);
        org.junit.Assert.assertNotNull(elements26);
        org.junit.Assert.assertNotNull(elements28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(elements33);
        org.junit.Assert.assertNotNull(elements35);
        org.junit.Assert.assertNotNull(elements37);
        org.junit.Assert.assertNotNull(elements41);
        org.junit.Assert.assertNotNull(elements43);
        org.junit.Assert.assertNotNull(elements45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(elements48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNull(element51);
        org.junit.Assert.assertNotNull(document54);
        org.junit.Assert.assertNotNull(element56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0353");
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
        java.util.stream.Stream<org.jsoup.nodes.Element> elementStream19 = elements5.parallelStream();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertNotNull(elementStream19);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0354");
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
        java.util.function.UnaryOperator<org.jsoup.nodes.Element> elementUnaryOperator15 = null;
        // The following exception was thrown during execution in test generation
        try {
            elements13.replaceAll(elementUnaryOperator15);
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
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0355");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.hasText();
        java.lang.String str3 = document1.nodeName();
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        org.jsoup.nodes.Element element8 = document1.classNames((java.util.Set<java.lang.String>) strSet6);
        org.jsoup.nodes.Element element10 = element8.addClass("#document");
        org.jsoup.select.Elements elements13 = element10.getElementsByAttributeValueNot("#root", "org.jsoup.select.Selector$SelectorParseException: ");
        org.jsoup.select.Elements elements15 = element10.getElementsByIndexEquals((int) '4');
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
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0356");
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
        org.jsoup.nodes.Document document24 = org.jsoup.Jsoup.parse("hi!=\"#root=&quot;hi!&quot;\"", "");
        int int25 = elements13.lastIndexOf((java.lang.Object) "");
        java.lang.IllegalStateException[] illegalStateExceptionArray26 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.IllegalStateException[] illegalStateExceptionArray27 = elements13.toArray(illegalStateExceptionArray26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0357");
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parse("hi!", "org.jsoup.select.Selector$SelectorParseException:");
        org.junit.Assert.assertNotNull(document2);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0358");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "\n&lt;!--#root--&gt;");
        org.junit.Assert.assertNotNull(textNode2);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0359");
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
        boolean boolean20 = elements8.hasAttr("\n<!--#root-->");
        java.util.function.UnaryOperator<org.jsoup.nodes.Element> elementUnaryOperator21 = null;
        // The following exception was thrown during execution in test generation
        try {
            elements8.replaceAll(elementUnaryOperator21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(elementSpliterator17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0360");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("\n<!--#root-->", "#root");
        org.jsoup.nodes.Element element4 = document2.removeClass("#root=\"hi!\"");
        java.lang.String str5 = document2.html();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<html>\n<head>\n</head>\n<body> \n <!--#root-->\n</body>\n</html>" + "'", str5, "<html>\n<head>\n</head>\n<body> \n <!--#root-->\n</body>\n</html>");
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0361");
        org.jsoup.safety.Whitelist whitelist2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.jsoup.Jsoup.clean("org.jsoup.select.selector$selectorparseexception: org.jsoup.select.selector$selectorparseexception:=\"#root\"", "a", whitelist2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0362");
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
        org.jsoup.select.Elements elements23 = new org.jsoup.select.Elements((java.util.List<org.jsoup.nodes.Element>) elements5);
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
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0363");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        org.jsoup.parser.Tag tag4 = org.jsoup.parser.Tag.valueOf("org.jsoup.select.Selector$SelectorParseException: ");
        boolean boolean5 = tag4.isData();
        boolean boolean6 = tag4.requiresSpecificParent();
        boolean boolean7 = tag4.isBlock();
        org.jsoup.parser.Tag tag9 = org.jsoup.parser.Tag.valueOf("org.jsoup.select.Selector$SelectorParseException: ");
        boolean boolean10 = tag9.isData();
        boolean boolean11 = tag9.requiresSpecificParent();
        boolean boolean12 = tag9.isBlock();
        boolean boolean13 = tag4.canContain(tag9);
        org.jsoup.nodes.Document document16 = new org.jsoup.nodes.Document("");
        boolean boolean17 = document16.hasText();
        java.lang.String str18 = document16.nodeName();
        org.jsoup.nodes.Document document20 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element23 = document20.attr("hi!", "#root");
        org.jsoup.nodes.Attributes attributes24 = document20.attributes();
        boolean boolean25 = document16.equals((java.lang.Object) attributes24);
        org.jsoup.nodes.Element element26 = new org.jsoup.nodes.Element(tag4, "#document#document=\"#document#document\"", attributes24);
        org.jsoup.nodes.Element element27 = new org.jsoup.nodes.Element(tag1, "hi!=\"#root=&quot;hi!&quot;\"", attributes24);
        java.lang.Object obj28 = null;
        boolean boolean29 = attributes24.equals(obj28);
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "#document" + "'", str18, "#document");
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(attributes24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0364");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("#root");
        org.jsoup.nodes.Element element3 = document1.html("org.jsoup.select.Selector$SelectorParseException: ");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements5 = element3.select("org.jsoup.select.selector$selectorparseexception: org.jsoup.select.selector$selectorparseexception:=\"#root\"");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query org.jsoup.select.selector$selectorparseexception: org.jsoup.select.selector$selectorparseexception:=\"#root\"");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(element3);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0365");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parse("hi!");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValue("hi!", "hi!");
        org.jsoup.nodes.Attributes attributes5 = document1.attributes();
        org.jsoup.nodes.Element element6 = document1.head();
        org.jsoup.select.Elements elements8 = document1.getElementsByAttribute("<?#document#document>");
        java.lang.String str9 = document1.title();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0366");
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
        boolean boolean19 = tag1.canContainBlock();
        boolean boolean20 = tag1.canContainBlock();
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
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0367");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        java.lang.String str5 = elements3.attr("#root");
        java.lang.String str6 = elements3.text();
        org.jsoup.select.Elements elements8 = elements3.prepend("org.jsoup.select.selector$selectorparseexception:");
        org.jsoup.nodes.Document document11 = org.jsoup.parser.Parser.parseBodyFragment("#document", "");
        org.jsoup.nodes.Element element13 = document11.addClass("hi!");
        java.lang.String str14 = document11.title();
        boolean boolean15 = elements3.add((org.jsoup.nodes.Element) document11);
        org.jsoup.nodes.Node node17 = document11.removeAttr("org.jsoup.select.selector$selectorparseexception:");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(node17);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0368");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("#root", "");
        org.jsoup.nodes.Element element5 = document2.attr("#root", "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        java.lang.String str6 = document2.tagName();
        java.lang.String str7 = document2.text();
        boolean boolean8 = document2.isBlock();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = document2.childNodes();
        org.jsoup.nodes.Element element11 = document2.getElementById("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element13 = element11.child((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#root" + "'", str6, "#root");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#root" + "'", str7, "#root");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNull(element11);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0369");
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
        org.jsoup.nodes.Document document19 = new org.jsoup.nodes.Document(" class=\"hi!\"");
        java.lang.String str20 = document19.toString();
        java.lang.String str21 = document19.outerHtml();
        // The following exception was thrown during execution in test generation
        try {
            element17.replaceWith((org.jsoup.nodes.Node) document19);
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0370");
        org.jsoup.safety.Whitelist whitelist1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.jsoup.Jsoup.clean("#document", whitelist1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0371");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("#root", "#root");
        java.lang.String str3 = comment2.toString();
        java.lang.String str4 = comment2.getData();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n<!--#root-->" + "'", str3, "\n<!--#root-->");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#root" + "'", str4, "#root");
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0372");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("#data", "[#, d, o, c, u, m, e, n, t]");
        java.lang.String str3 = comment2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n<!--#data-->" + "'", str3, "\n<!--#data-->");
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0373");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element5 = document1.prepend("#document");
        org.jsoup.select.Elements elements7 = element5.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element8 = elements7.last();
        java.lang.Object[] objArray9 = elements7.toArray();
        org.jsoup.nodes.Document document12 = new org.jsoup.nodes.Document("");
        boolean boolean13 = document12.hasText();
        java.lang.String str14 = document12.nodeName();
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet17 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet17, strArray16);
        org.jsoup.nodes.Element element19 = document12.classNames((java.util.Set<java.lang.String>) strSet17);
        org.jsoup.nodes.Element element21 = element19.addClass("#document");
        org.jsoup.nodes.Document document23 = new org.jsoup.nodes.Document("");
        boolean boolean24 = document23.hasText();
        boolean boolean25 = document23.hasText();
        org.jsoup.nodes.Document document27 = new org.jsoup.nodes.Document("");
        boolean boolean28 = document27.hasText();
        java.lang.String str29 = document27.nodeName();
        java.lang.String[] strArray31 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet32 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet32, strArray31);
        org.jsoup.nodes.Element element34 = document27.classNames((java.util.Set<java.lang.String>) strSet32);
        org.jsoup.nodes.Element element35 = document23.classNames((java.util.Set<java.lang.String>) strSet32);
        java.util.Set<java.lang.String> strSet36 = document23.classNames();
        org.jsoup.nodes.Element element37 = element19.classNames(strSet36);
        org.jsoup.nodes.Element element39 = element37.toggleClass("body");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element40 = elements7.set(0, element37);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNull(element8);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#document" + "'", str14, "#document");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "#document" + "'", str29, "#document");
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(element34);
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertNotNull(strSet36);
        org.junit.Assert.assertNotNull(element37);
        org.junit.Assert.assertNotNull(element39);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0374");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        java.lang.String str4 = elements3.val();
        java.lang.Object obj5 = null;
        int int6 = elements3.lastIndexOf(obj5);
        org.jsoup.select.Elements elements8 = elements3.eq((int) '#');
        boolean boolean10 = elements3.hasAttr("#root");
        boolean boolean12 = elements3.hasAttr("hi!");
        org.jsoup.nodes.Document document14 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements16 = document14.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements18 = elements16.prepend("");
        org.jsoup.select.Elements elements20 = elements18.removeAttr("");
        boolean boolean21 = elements3.retainAll((java.util.Collection<org.jsoup.nodes.Element>) elements20);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element23 = elements3.get(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertNotNull(elements20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0375");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Document document2 = document1.normalise();
        org.jsoup.nodes.Element element3 = document1.head();
        org.jsoup.nodes.Element element5 = element3.append("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Node node8 = element3.attr("<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "org.jsoup.select.Selector$SelectorParseException: org.jsoup.select.selector$selectorparseexception:");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(node8);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0376");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragmentRelaxed("org.jsoup.select.selector$selectorparseexception:", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document2.childNodes();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(nodeList3);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0377");
        org.jsoup.nodes.Document document2 = new org.jsoup.nodes.Document(" class=\"hi!\"");
        java.lang.String str3 = document2.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements4 = org.jsoup.select.Selector.select("<!--#document-->", (org.jsoup.nodes.Element) document2);
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query <!--#document-->");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0378");
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
        org.jsoup.select.Elements elements14 = element12.children();
        boolean boolean16 = elements14.hasAttr("\n&lt;!--#root--&gt;");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0379");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragmentRelaxed("body", "");
        org.jsoup.select.Elements elements4 = document2.getElementsByIndexEquals((-1));
        org.jsoup.nodes.Document document7 = new org.jsoup.nodes.Document("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element8 = elements4.set((int) (byte) 100, (org.jsoup.nodes.Element) document7);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(elements4);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0380");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("");
        boolean boolean2 = tokenQueue1.isEmpty();
        java.lang.Character char3 = tokenQueue1.peek();
        java.lang.String str5 = tokenQueue1.chompTo("org.jsoup.select.Selector$SelectorParseException: ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(char3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0381");
        org.jsoup.safety.Whitelist whitelist1 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.jsoup.Jsoup.isValid("hi!", whitelist1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0382");
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
        java.lang.String str20 = document15.nodeName();
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "#document" + "'", str20, "#document");
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0383");
        org.jsoup.nodes.DataNode dataNode2 = org.jsoup.nodes.DataNode.createFromEncoded("org.jsoup.select.selector$selectorparseexception:", "hi!");
        java.lang.String str3 = dataNode2.getWholeData();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = dataNode2.childNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = dataNode2.childNodes();
        java.lang.String str6 = dataNode2.getWholeData();
        java.lang.String str7 = dataNode2.nodeName();
        java.lang.String str8 = dataNode2.toString();
        java.lang.String str9 = dataNode2.toString();
        org.junit.Assert.assertNotNull(dataNode2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "org.jsoup.select.selector$selectorparseexception:" + "'", str3, "org.jsoup.select.selector$selectorparseexception:");
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "org.jsoup.select.selector$selectorparseexception:" + "'", str6, "org.jsoup.select.selector$selectorparseexception:");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#data" + "'", str7, "#data");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "org.jsoup.select.selector$selectorparseexception:" + "'", str8, "org.jsoup.select.selector$selectorparseexception:");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "org.jsoup.select.selector$selectorparseexception:" + "'", str9, "org.jsoup.select.selector$selectorparseexception:");
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0384");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements16 = element13.getElementsByAttributeValueEnding("\n<!--#root-->", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
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
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0385");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements5 = elements3.prepend("");
        org.jsoup.nodes.Document document7 = new org.jsoup.nodes.Document("");
        boolean boolean8 = document7.hasText();
        boolean boolean9 = document7.hasText();
        org.jsoup.nodes.Document document11 = new org.jsoup.nodes.Document("");
        boolean boolean12 = document11.hasText();
        java.lang.String str13 = document11.nodeName();
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet16 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet16, strArray15);
        org.jsoup.nodes.Element element18 = document11.classNames((java.util.Set<java.lang.String>) strSet16);
        org.jsoup.nodes.Element element19 = document7.classNames((java.util.Set<java.lang.String>) strSet16);
        int int20 = elements3.indexOf((java.lang.Object) element19);
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
        org.jsoup.select.Elements elements58 = new org.jsoup.select.Elements((java.util.Collection<org.jsoup.nodes.Element>) elements34);
        boolean boolean59 = elements3.containsAll((java.util.Collection<org.jsoup.nodes.Element>) elements34);
        org.jsoup.nodes.Attributes attributes60 = new org.jsoup.nodes.Attributes();
        int int61 = attributes60.size();
        org.jsoup.nodes.Document document63 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements65 = document63.getElementsByAttribute("hi!");
        java.lang.String str66 = elements65.val();
        java.lang.Object obj67 = null;
        int int68 = elements65.lastIndexOf(obj67);
        org.jsoup.select.Elements elements70 = elements65.eq((int) '#');
        boolean boolean71 = attributes60.equals((java.lang.Object) elements70);
        boolean boolean73 = elements70.hasClass("<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        org.jsoup.nodes.Element element74 = elements70.last();
        org.jsoup.select.Elements elements76 = elements70.removeClass("#root=\"hi!\"");
        org.jsoup.select.Elements elements78 = elements76.val("");
        boolean boolean79 = elements34.retainAll((java.util.Collection<org.jsoup.nodes.Element>) elements78);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "#document" + "'", str13, "#document");
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
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
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertNotNull(elements65);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + (-1) + "'", int68 == (-1));
        org.junit.Assert.assertNotNull(elements70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNull(element74);
        org.junit.Assert.assertNotNull(elements76);
        org.junit.Assert.assertNotNull(elements78);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0386");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("#root", "");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("#document");
        java.lang.String str5 = textNode2.getWholeText();
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#document" + "'", str5, "#document");
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0387");
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
        java.lang.String str19 = elements14.html();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(elementArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(elementSpliterator11);
        org.junit.Assert.assertNotNull(elementSpliterator12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(document17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0388");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Document document2 = document1.normalise();
        org.jsoup.nodes.Element element4 = document1.prependElement("org.jsoup.select.selector$selectorparseexception:");
        org.jsoup.nodes.Element element6 = element4.wrap("#root");
        org.jsoup.nodes.Node node7 = element4.parent();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNull(element6);
        org.junit.Assert.assertNotNull(node7);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0389");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!", "hi!");
        attribute2.setKey("#root");
        java.lang.String str5 = attribute2.html();
        attribute2.setKey("#data");
        java.lang.String str8 = attribute2.getValue();
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#root=\"hi!\"" + "'", str5, "#root=\"hi!\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0390");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element5 = document1.prepend("#document");
        org.jsoup.nodes.Element element6 = element5.empty();
        org.jsoup.select.Elements elements8 = element5.getElementsByTag("org.jsoup.select.Selector$SelectorParseException: ");
        org.jsoup.select.Elements elements10 = elements8.removeClass("#root");
        org.jsoup.select.Elements elements12 = elements8.append("");
        java.lang.String str14 = elements8.attr("<html>\n<head>\n</head>\n<body> \n <!--#root-->\n</body>\n</html>");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0391");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Document document2 = document1.normalise();
        org.jsoup.nodes.Element element3 = document2.head();
        org.jsoup.nodes.Element element6 = document2.attr("org.jsoup.select.Selector$SelectorParseException: ", "[]");
        org.jsoup.nodes.Element element8 = element6.appendElement("#comment");
        org.jsoup.nodes.Element element10 = element6.prependText("#document");
        org.jsoup.nodes.Element element12 = element6.toggleClass("<html> \n <head> \n </head> \n <body>\n   #root  \n </body>\n</html>");
        java.lang.String str13 = element6.id();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0392");
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
        tokenQueue1.addFirst((java.lang.Character) ' ');
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
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0393");
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
        element24.setBaseUri("");
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
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0394");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = org.jsoup.Jsoup.parse(file0, "#comment", "#comment");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0395");
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
        boolean boolean13 = document12.isBlock();
        java.lang.String str14 = document12.tagName();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#root" + "'", str14, "#root");
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0396");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("org.jsoup.select.Selector$SelectorParseException: ");
        boolean boolean2 = tag1.isData();
        org.jsoup.nodes.Attributes attributes4 = new org.jsoup.nodes.Attributes();
        int int5 = attributes4.size();
        java.lang.String str6 = attributes4.html();
        org.jsoup.nodes.Element element7 = new org.jsoup.nodes.Element(tag1, "org.jsoup.select.selector$selectorparseexception:", attributes4);
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator8 = attributes4.spliterator();
        java.lang.Object obj9 = null;
        boolean boolean10 = attributes4.equals(obj9);
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributeSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0397");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parse("hi!");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValue("hi!", "hi!");
        document1.title("[]");
        org.jsoup.nodes.Element element8 = document1.prependText("#document#document");
        org.jsoup.nodes.Document document10 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements12 = document10.getElementsByAttribute("hi!");
        java.lang.String str14 = elements12.attr("#root");
        org.jsoup.nodes.Document document16 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element[] elementArray17 = new org.jsoup.nodes.Element[] { document16 };
        java.util.ArrayList<org.jsoup.nodes.Element> elementList18 = new java.util.ArrayList<org.jsoup.nodes.Element>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<org.jsoup.nodes.Element>) elementList18, elementArray17);
        java.util.Spliterator<org.jsoup.nodes.Element> elementSpliterator20 = elementList18.spliterator();
        java.util.Spliterator<org.jsoup.nodes.Element> elementSpliterator21 = elementList18.spliterator();
        boolean boolean22 = elements12.containsAll((java.util.Collection<org.jsoup.nodes.Element>) elementList18);
        org.jsoup.select.Elements elements23 = new org.jsoup.select.Elements((java.util.List<org.jsoup.nodes.Element>) elementList18);
        org.jsoup.select.Elements elements24 = new org.jsoup.select.Elements((java.util.Collection<org.jsoup.nodes.Element>) elements23);
        java.lang.String str25 = elements24.html();
        org.jsoup.nodes.Document document27 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements29 = document27.getElementsByAttribute("hi!");
        java.lang.String str31 = elements29.attr("#root");
        org.jsoup.select.Elements elements32 = elements29.parents();
        boolean boolean33 = elements24.containsAll((java.util.Collection<org.jsoup.nodes.Element>) elements29);
        org.jsoup.select.Elements elements35 = elements24.eq(0);
        org.jsoup.nodes.Element element36 = elements24.last();
        org.jsoup.nodes.Element element37 = elements24.first();
        // The following exception was thrown during execution in test generation
        try {
            document1.replaceWith((org.jsoup.nodes.Node) element37);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(elementArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(elementSpliterator20);
        org.junit.Assert.assertNotNull(elementSpliterator21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(elements29);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(elements32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(elements35);
        org.junit.Assert.assertNotNull(element36);
        org.junit.Assert.assertNotNull(element37);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0398");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("#root", "");
        java.lang.String str3 = document2.outerHtml();
        org.jsoup.nodes.Element element5 = document2.append("<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        org.jsoup.select.Elements elements7 = document2.getElementsByIndexEquals(1);
        org.jsoup.nodes.Element element8 = document2.body();
        java.lang.String str9 = document2.baseUri();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>" + "'", str3, "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0399");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("#document", "#root");
        java.lang.String str3 = comment2.toString();
        java.lang.String str4 = comment2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n<!--#document-->" + "'", str3, "\n<!--#document-->");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\n<!--#document-->" + "'", str4, "\n<!--#document-->");
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0400");
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
        java.lang.String str27 = document17.nodeName();
        org.jsoup.nodes.Element element28 = document17.head();
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
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "#document" + "'", str27, "#document");
        org.junit.Assert.assertNull(element28);
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0401");
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
        java.lang.Throwable[] throwableArray23 = selectorParseException4.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(throwableArray23);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0402");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = org.jsoup.Jsoup.parse(file0, "#document#documenthi!#root=&quot;hi!&quot;", "#document#documenthi!#root=&quot;hi!&quot;");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0403");
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
        java.util.Spliterator<org.jsoup.nodes.Element> elementSpliterator39 = elements13.spliterator();
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor41 = elements13.listIterator(0);
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
        org.junit.Assert.assertNotNull(elementSpliterator39);
        org.junit.Assert.assertNotNull(elementItor41);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0404");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("org.jsoup.select.selector$selectorparseexception: org.jsoup.select.selector$selectorparseexception:=\"#root\"", "#document#documentdocument");
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0405");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("org.jsoup.select.Selector$SelectorParseException: ");
        boolean boolean2 = tag1.isData();
        org.jsoup.nodes.Attributes attributes4 = new org.jsoup.nodes.Attributes();
        int int5 = attributes4.size();
        java.lang.String str6 = attributes4.html();
        org.jsoup.nodes.Element element7 = new org.jsoup.nodes.Element(tag1, "org.jsoup.select.selector$selectorparseexception:", attributes4);
        boolean boolean8 = tag1.requiresSpecificParent();
        org.jsoup.parser.Tag tag9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = tag1.isValidAncestor(tag9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0406");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("#root", "");
        org.jsoup.nodes.Element element5 = document2.attr("#root", "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        java.lang.String str6 = element5.text();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#root" + "'", str6, "#root");
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0407");
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
        java.util.stream.Stream<org.jsoup.nodes.Element> elementStream22 = elements19.stream();
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
        org.junit.Assert.assertNotNull(elementStream22);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0408");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parse("hi!=\"#root=&quot;hi!&quot;\"");
        org.junit.Assert.assertNotNull(document1);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0409");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragmentRelaxed("<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>", "#document#documenthi!");
        org.jsoup.select.Elements elements5 = document2.getElementsByAttributeValueEnding("[#, d, o, c, u, m, e, n, t, #, d, o, c, u, m, e, n, t, =, \", #, d, o, c, u, m, e, n, t, #, d, o, c, u, m, e, n, t, \"]", "#root=\"hi!\"");
        java.lang.String str6 = document2.nodeName();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#document" + "'", str6, "#document");
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0410");
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
        java.lang.String str32 = attributes18.get("a");
        java.lang.Object obj33 = null;
        boolean boolean34 = attributes18.equals(obj33);
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
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0411");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("#document");
        java.lang.String str2 = tokenQueue1.consumeAttributeKey();
        java.lang.String str4 = tokenQueue1.consumeTo("#root=\"hi!\"");
        boolean boolean5 = tokenQueue1.isEmpty();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#document" + "'", str4, "#document");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0412");
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
        int int48 = elements35.size();
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
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0413");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = org.jsoup.Jsoup.parse(file0, "#data", "#root");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0414");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parse("hi!");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("org.jsoup.select.selector$selectorparseexception:");
        java.lang.String str4 = document1.nodeName();
        org.jsoup.nodes.Element element6 = document1.appendText("\n&lt;!--#root--&gt;");
        org.jsoup.nodes.Node node9 = document1.attr("hi!=\"#root=&quot;hi!&quot;\"", "#root=\"hi!\"");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements12 = document1.getElementsByAttributeValueStarting("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#document" + "'", str4, "#document");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(node9);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0415");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!", "hi!");
        attribute2.setKey("#root");
        java.lang.String str5 = attribute2.getKey();
        java.lang.String str6 = attribute2.toString();
        java.lang.String str7 = attribute2.html();
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#root" + "'", str5, "#root");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#root=\"hi!\"" + "'", str6, "#root=\"hi!\"");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#root=\"hi!\"" + "'", str7, "#root=\"hi!\"");
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0416");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("#document");
        boolean boolean3 = tokenQueue1.matches("\n<!--#root-->");
        boolean boolean5 = tokenQueue1.matchChomp("#data");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!=\"#root=&quot;hi!&quot;\"" };
        java.lang.String str8 = tokenQueue1.consumeToAny(strArray7);
        boolean boolean9 = tokenQueue1.consumeWhitespace();
        java.lang.String[] strArray14 = new java.lang.String[] { "org.jsoup.select.Selector$SelectorParseException: \n<!--#document-->", "#root=\"hi!\"", "\n&lt;!--#root--&gt;", "\n<!--#root-->" };
        java.lang.String str15 = tokenQueue1.consumeToAny(strArray14);
        java.lang.String str16 = tokenQueue1.remainder();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#document" + "'", str8, "#document");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0417");
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
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0418");
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
        boolean boolean24 = elements23.hasText();
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
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0419");
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
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0420");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Document document2 = document1.normalise();
        org.jsoup.nodes.Element element3 = document1.head();
        java.lang.String str4 = element3.id();
        java.lang.String str6 = element3.absUrl("#document#documenthi!");
        org.jsoup.select.Elements elements7 = element3.getAllElements();
        org.jsoup.select.Elements elements9 = elements7.wrap("[#, d, o, c, u, m, e, n, t]");
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor10 = elements9.listIterator();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(elementItor10);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0421");
        org.jsoup.safety.Whitelist whitelist1 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.jsoup.Jsoup.isValid("[#, d, o, c, u, m, e, n, t]", whitelist1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0422");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("#document", "#root");
        java.lang.String str3 = comment2.nodeName();
        java.lang.String str4 = comment2.nodeName();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#comment" + "'", str3, "#comment");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#comment" + "'", str4, "#comment");
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0423");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("", "#declaration");
        org.junit.Assert.assertNotNull(document2);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0424");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("#root", "");
        java.lang.String str3 = document2.html();
        java.lang.String str5 = document2.attr("org.jsoup.select.selector$selectorparseexception:");
        boolean boolean6 = document2.isBlock();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>" + "'", str3, "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0425");
        org.jsoup.safety.Whitelist whitelist1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.jsoup.Jsoup.clean("<html> \n <head> \n </head> \n <body>\n   #root  \n </body>\n</html>", whitelist1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0426");
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
        org.jsoup.nodes.Element element20 = element12.attr("<?#document#document>", "#document");
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
        org.junit.Assert.assertNotNull(element20);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0427");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("\n<!--#document-->", "#document");
        org.junit.Assert.assertNotNull(textNode2);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0428");
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
        org.jsoup.select.Elements elements25 = document19.getAllElements();
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
        org.junit.Assert.assertNotNull(elements25);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0429");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = org.jsoup.Jsoup.parse(file0, " class=&quot;hi!&quot;", "org.jsoup.select.Selector$SelectorParseException:");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0430");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded(" class=\"hi!\"", "org.jsoup.select.Selector$SelectorParseException: ");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("#data");
        org.jsoup.nodes.Node node6 = textNode2.removeAttr("#document");
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertNotNull(node6);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0431");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        boolean boolean2 = document1.hasText();
        org.jsoup.nodes.Element element4 = document1.addClass("\n<!--#document-->");
        java.lang.String str5 = document1.nodeName();
        org.jsoup.nodes.Element element7 = document1.removeClass("\n<!--#root-->");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#document" + "'", str5, "#document");
        org.junit.Assert.assertNotNull(element7);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0432");
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
        java.lang.String str22 = element20.val();
        org.jsoup.nodes.Node node23 = element20.previousSibling();
        org.jsoup.nodes.Node node24 = node23.previousSibling();
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
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNull(node24);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0433");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "\n<!--#root-->");
        java.lang.String str3 = textNode2.text();
        java.lang.String str4 = textNode2.text();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0434");
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parse("org.jsoup.select.Selector$SelectorParseException: org.jsoup.select.selector$selectorparseexception:", "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document2);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0435");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("org.jsoup.select.Selector$SelectorParseException: ");
        java.lang.String str2 = tag1.getName();
        boolean boolean3 = tag1.isInline();
        boolean boolean4 = tag1.isEmpty();
        boolean boolean5 = tag1.isEmpty();
        org.jsoup.nodes.Document document8 = org.jsoup.parser.Parser.parse("#root", "");
        org.jsoup.nodes.Element element11 = document8.attr("#root", "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        java.lang.String str12 = document8.tagName();
        java.lang.String str13 = document8.text();
        boolean boolean14 = document8.isBlock();
        boolean boolean15 = tag1.equals((java.lang.Object) document8);
        boolean boolean16 = tag1.preserveWhitespace();
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.jsoup.select.selector$selectorparseexception:" + "'", str2, "org.jsoup.select.selector$selectorparseexception:");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "#root" + "'", str12, "#root");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "#root" + "'", str13, "#root");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0436");
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
        boolean boolean22 = tag20.requiresSpecificParent();
        boolean boolean23 = tag20.isBlock();
        org.jsoup.parser.Tag tag25 = org.jsoup.parser.Tag.valueOf("org.jsoup.select.Selector$SelectorParseException: ");
        boolean boolean26 = tag25.isData();
        boolean boolean27 = tag25.requiresSpecificParent();
        boolean boolean28 = tag25.isBlock();
        boolean boolean29 = tag20.canContain(tag25);
        boolean boolean30 = tag20.isBlock();
        boolean boolean31 = tag20.isData();
        boolean boolean32 = tag20.isBlock();
        java.lang.String str33 = tag20.getName();
        org.jsoup.parser.Tag tag35 = org.jsoup.parser.Tag.valueOf("org.jsoup.select.Selector$SelectorParseException: ");
        java.lang.String str36 = tag35.getName();
        boolean boolean37 = tag35.canContainBlock();
        boolean boolean38 = tag20.isValidParent(tag35);
        boolean boolean39 = tag16.isValidAncestor(tag35);
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
        org.junit.Assert.assertNotNull(tag25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "org.jsoup.select.selector$selectorparseexception:" + "'", str33, "org.jsoup.select.selector$selectorparseexception:");
        org.junit.Assert.assertNotNull(tag35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "org.jsoup.select.selector$selectorparseexception:" + "'", str36, "org.jsoup.select.selector$selectorparseexception:");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0437");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements5 = elements3.prepend("");
        org.jsoup.select.Elements elements7 = elements5.removeAttr("");
        org.jsoup.select.Elements elements9 = elements7.prepend("<?#document#document>");
        org.jsoup.select.Elements elements11 = elements7.eq((int) (short) 0);
        java.lang.Class<?> wildcardClass12 = elements7.getClass();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0438");
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
        attribute10.setValue("#data");
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attribute10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "#root=\"hi!\"" + "'", str13, "#root=\"hi!\"");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "#root=\"hi!\"" + "'", str15, "#root=\"hi!\"");
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0439");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("#root", "\n<!--#root-->");
        java.lang.String str3 = document2.nodeName();
        java.lang.String str4 = document2.outerHtml();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>" + "'", str4, "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0440");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parse("hi!");
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValue("hi!", "hi!");
        org.jsoup.nodes.Attributes attributes5 = document1.attributes();
        org.jsoup.nodes.Element element6 = document1.head();
        org.jsoup.select.Elements elements8 = document1.getElementsByAttribute("<?#document#document>");
        org.jsoup.nodes.Attributes attributes9 = new org.jsoup.nodes.Attributes();
        int int10 = attributes9.size();
        org.jsoup.nodes.Document document12 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements14 = document12.getElementsByAttribute("hi!");
        java.lang.String str15 = elements14.val();
        java.lang.Object obj16 = null;
        int int17 = elements14.lastIndexOf(obj16);
        org.jsoup.select.Elements elements19 = elements14.eq((int) '#');
        boolean boolean20 = attributes9.equals((java.lang.Object) elements19);
        boolean boolean21 = elements19.hasText();
        boolean boolean22 = elements8.contains((java.lang.Object) boolean21);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element24 = elements8.get((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0441");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragmentRelaxed("<!--#document-->", "a");
        org.junit.Assert.assertNotNull(document2);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0442");
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parse("", "");
        java.lang.String str3 = document2.nodeName();
        java.lang.String str4 = document2.text();
        org.jsoup.nodes.Element element5 = document2.head();
        org.jsoup.nodes.Element element6 = document2.empty();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element6);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0443");
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
        org.jsoup.select.Elements elements16 = element10.getAllElements();
        org.jsoup.nodes.Element element18 = element10.val(" class=&quot;hi!&quot;");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertNotNull(element18);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0444");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element4 = document1.attr("hi!", "#root");
        org.jsoup.nodes.Attributes attributes5 = document1.attributes();
        org.jsoup.nodes.Document document6 = document1.normalise();
        java.lang.String str7 = document1.title();
        java.lang.String str8 = document1.text();
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0445");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("#document");
        java.lang.String str2 = tokenQueue1.consumeAttributeKey();
        java.lang.String str4 = tokenQueue1.consumeTo("#root=\"hi!\"");
        java.lang.String str5 = tokenQueue1.toString();
        java.lang.String str7 = tokenQueue1.chompTo("");
        boolean boolean8 = tokenQueue1.matchesWord();
        boolean boolean9 = tokenQueue1.isEmpty();
        boolean boolean10 = tokenQueue1.matchesWord();
        boolean boolean11 = tokenQueue1.consumeWhitespace();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#document" + "'", str4, "#document");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0446");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("#document");
        boolean boolean3 = tokenQueue1.matches("\n<!--#root-->");
        boolean boolean5 = tokenQueue1.matchChomp("#data");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!=\"#root=&quot;hi!&quot;\"" };
        java.lang.String str8 = tokenQueue1.consumeToAny(strArray7);
        boolean boolean9 = tokenQueue1.consumeWhitespace();
        java.lang.String[] strArray14 = new java.lang.String[] { "org.jsoup.select.Selector$SelectorParseException: \n<!--#document-->", "#root=\"hi!\"", "\n&lt;!--#root--&gt;", "\n<!--#root-->" };
        java.lang.String str15 = tokenQueue1.consumeToAny(strArray14);
        org.jsoup.parser.TokenQueue tokenQueue17 = new org.jsoup.parser.TokenQueue("#document");
        boolean boolean19 = tokenQueue17.matches("\n<!--#root-->");
        boolean boolean21 = tokenQueue17.matchChomp("#data");
        java.lang.String[] strArray23 = new java.lang.String[] { "hi!=\"#root=&quot;hi!&quot;\"" };
        java.lang.String str24 = tokenQueue17.consumeToAny(strArray23);
        boolean boolean25 = tokenQueue17.consumeWhitespace();
        java.lang.String[] strArray30 = new java.lang.String[] { "org.jsoup.select.Selector$SelectorParseException: \n<!--#document-->", "#root=\"hi!\"", "\n&lt;!--#root--&gt;", "\n<!--#root-->" };
        java.lang.String str31 = tokenQueue17.consumeToAny(strArray30);
        boolean boolean32 = tokenQueue1.matchesAny(strArray30);
        java.lang.String str33 = tokenQueue1.consumeWord();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#document" + "'", str8, "#document");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "#document" + "'", str24, "#document");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0447");
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
        java.util.stream.Stream<org.jsoup.nodes.Element> elementStream19 = elements18.stream();
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
        org.junit.Assert.assertNotNull(elementStream19);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0448");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("#root", "");
        boolean boolean3 = textNode2.isBlank();
        java.lang.String str4 = textNode2.toString();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#root" + "'", str4, "#root");
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0449");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("", "body");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0450");
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
        org.jsoup.nodes.Attributes attributes20 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes15.addAll(attributes20);
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
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(attributeItor18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0451");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("#document");
        boolean boolean3 = tokenQueue1.matches("\n<!--#root-->");
        boolean boolean5 = tokenQueue1.matchChomp("#data");
        java.lang.String str7 = tokenQueue1.consumeTo("a");
        java.lang.String str8 = tokenQueue1.consumeCssIdentifier();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#document" + "'", str7, "#document");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0452");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("<html> \n <head> \n </head> \n <body>\n   #root  \n </body>\n</html>", "document");
        org.jsoup.nodes.Node node3 = document2.parent();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNull(node3);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0453");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("org.jsoup.select.Selector$SelectorParseException: org.jsoup.select.selector$selectorparseexception:", "#root");
        attribute2.setKey("<!--#document-->");
        org.junit.Assert.assertNotNull(attribute2);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0454");
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
        java.lang.Object obj16 = null;
        boolean boolean17 = element13.equals(obj16);
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
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0455");
        org.jsoup.nodes.Evaluator evaluator0 = null;
        org.jsoup.nodes.Document document3 = org.jsoup.Jsoup.parse("hi!=\"#root=&quot;hi!&quot;\"", "");
        org.jsoup.nodes.Element element5 = document3.createElement("a");
        org.jsoup.nodes.Element element6 = document3.empty();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements7 = org.jsoup.select.Collector.collect(evaluator0, (org.jsoup.nodes.Element) document3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element6);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0456");
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
        org.jsoup.nodes.Attributes attributes21 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributes13.addAll(attributes21);
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
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertNotNull(attributeSpliterator14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(attributeItor18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + " class=\"hi!\"" + "'", str20, " class=\"hi!\"");
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0457");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragmentRelaxed("body", "");
        org.jsoup.nodes.Element element4 = document2.prependElement("<#root hi!=\"#root\">\n</#root>");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0458");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements5 = elements3.prepend("");
        org.jsoup.select.Elements elements7 = elements5.removeAttr("");
        org.jsoup.select.Elements elements9 = elements5.addClass("#document#documenthi!");
        org.jsoup.nodes.Document document12 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements14 = document12.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements16 = elements14.prepend("");
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
        int int31 = elements14.indexOf((java.lang.Object) element30);
        java.lang.String str32 = element30.nodeName();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element33 = elements9.set((int) (short) -1, element30);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "#document" + "'", str24, "#document");
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "#document" + "'", str32, "#document");
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0459");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements5 = elements3.prepend("");
        org.jsoup.select.Elements elements7 = elements3.toggleClass("org.jsoup.select.selector$selectorparseexception: org.jsoup.select.selector$selectorparseexception:=\"#root\"");
        org.jsoup.parser.Tag tag10 = org.jsoup.parser.Tag.valueOf("#root");
        boolean boolean11 = tag10.isInline();
        boolean boolean12 = tag10.isInline();
        org.jsoup.nodes.Document document14 = new org.jsoup.nodes.Document("");
        boolean boolean15 = document14.hasText();
        java.lang.String str16 = document14.nodeName();
        java.lang.String[] strArray18 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet19 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet19, strArray18);
        org.jsoup.nodes.Element element21 = document14.classNames((java.util.Set<java.lang.String>) strSet19);
        org.jsoup.nodes.Element element23 = element21.addClass("#document");
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
        java.util.Set<java.lang.String> strSet38 = document25.classNames();
        org.jsoup.nodes.Element element39 = element21.classNames(strSet38);
        boolean boolean40 = tag10.equals((java.lang.Object) element21);
        org.jsoup.select.Elements elements41 = org.jsoup.select.Selector.select("body", element21);
        org.jsoup.select.Elements elements43 = elements41.removeClass("");
        java.lang.String str44 = elements41.text();
        int int45 = elements3.indexOf((java.lang.Object) str44);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "#document" + "'", str16, "#document");
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "#document" + "'", str31, "#document");
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(element36);
        org.junit.Assert.assertNotNull(element37);
        org.junit.Assert.assertNotNull(strSet38);
        org.junit.Assert.assertNotNull(element39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(elements41);
        org.junit.Assert.assertNotNull(elements43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0460");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.nodes.Element element4 = document1.attr("hi!", "#root");
        org.jsoup.nodes.Attributes attributes5 = document1.attributes();
        org.jsoup.nodes.Element element6 = document1.body();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList7 = element6.childNodes();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertNull(element6);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0461");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("#root", "");
        org.jsoup.select.Elements elements5 = document2.getElementsByAttributeValueContaining("\n<!--#declaration-->", "<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(elements5);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0462");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("#root", "");
        org.jsoup.nodes.Element element5 = document2.attr("#root", "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        java.lang.String str6 = document2.tagName();
        org.jsoup.nodes.Element element7 = document2.empty();
        java.lang.String str9 = document2.absUrl("#data");
        org.jsoup.select.Elements elements11 = document2.getElementsByIndexEquals((int) (short) 100);
        org.jsoup.nodes.Element element12 = elements11.first();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#root" + "'", str6, "#root");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNull(element12);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0463");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Element> elementList24 = elements3.subList(0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(0) > toIndex(-1)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
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
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0464");
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
        java.lang.String str15 = document7.title();
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#document" + "'", str9, "#document");
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0465");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parse(file0, "org.jsoup.select.Selector$SelectorParseException: ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0466");
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
        java.util.List<org.jsoup.nodes.Attribute> attributeList60 = attributes18.asList();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator61 = attributeList60.spliterator();
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
        org.junit.Assert.assertNotNull(attributeList60);
        org.junit.Assert.assertNotNull(attributeSpliterator61);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0467");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("<html>\n<head>\n</head>\n<body>\n</body>\n</html>", "");
        java.lang.String str3 = attribute2.html();
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<html>\n<head>\n</head>\n<body>\n</body>\n</html>=\"\"" + "'", str3, "<html>\n<head>\n</head>\n<body>\n</body>\n</html>=\"\"");
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0468");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("#document#document=\"#document#document\"");
        boolean boolean2 = tokenQueue1.consumeWhitespace();
        tokenQueue1.addFirst("#data");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0469");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element4 = elements3.first();
        org.jsoup.nodes.Document document7 = org.jsoup.parser.Parser.parse("#root", "");
        java.lang.String str8 = document7.outerHtml();
        org.jsoup.nodes.Element element10 = document7.append("<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        org.jsoup.select.Elements elements13 = document7.getElementsByAttributeValueStarting("#root=\"hi!\"", "org.jsoup.select.Selector$SelectorParseException: ");
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
        org.jsoup.nodes.Document document49 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements51 = document49.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements53 = elements51.prepend("");
        org.jsoup.select.Elements elements55 = elements53.removeAttr("");
        org.jsoup.nodes.Document document57 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements59 = document57.getElementsByAttribute("hi!");
        org.jsoup.select.Elements elements61 = elements59.prepend("");
        org.jsoup.select.Elements elements63 = elements61.removeAttr("");
        boolean boolean64 = elements53.containsAll((java.util.Collection<org.jsoup.nodes.Element>) elements61);
        java.util.Collection[] collectionArray66 = new java.util.Collection[3];
        @SuppressWarnings("unchecked")
        java.util.Collection<org.jsoup.nodes.Element>[] elementCollectionArray67 = (java.util.Collection<org.jsoup.nodes.Element>[]) collectionArray66;
        elementCollectionArray67[0] = elements13;
        elementCollectionArray67[1] = elements47;
        elementCollectionArray67[2] = elements53;
        java.util.Collection<org.jsoup.nodes.Element>[] elementCollectionArray74 = elements3.toArray(elementCollectionArray67);
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor76 = elements3.listIterator(0);
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNull(element4);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>" + "'", str8, "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(elements13);
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
        org.junit.Assert.assertNotNull(elements51);
        org.junit.Assert.assertNotNull(elements53);
        org.junit.Assert.assertNotNull(elements55);
        org.junit.Assert.assertNotNull(elements59);
        org.junit.Assert.assertNotNull(elements61);
        org.junit.Assert.assertNotNull(elements63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(collectionArray66);
        org.junit.Assert.assertNotNull(elementCollectionArray67);
        org.junit.Assert.assertNotNull(elementCollectionArray74);
        org.junit.Assert.assertNotNull(elementItor76);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0470");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("#root", "");
        java.lang.String str3 = document2.outerHtml();
        org.jsoup.nodes.Element element5 = document2.append("<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        org.jsoup.select.Elements elements8 = document2.getElementsByAttributeValueStarting("#root=\"hi!\"", "org.jsoup.select.Selector$SelectorParseException: ");
        java.lang.String str9 = document2.data();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>" + "'", str3, "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0471");
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
        org.jsoup.nodes.Document document21 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements23 = document21.getElementsByAttribute("hi!");
        java.lang.String str24 = document21.nodeName();
        java.lang.String str25 = document21.outerHtml();
        boolean boolean27 = document21.hasAttr("#document#document");
        org.jsoup.nodes.Element element29 = document21.val("[#, d, o, c, u, m, e, n, t]");
        boolean boolean30 = elements19.add(element29);
        org.jsoup.nodes.Document document32 = org.jsoup.Jsoup.parse("hi!");
        org.jsoup.select.Elements elements35 = document32.getElementsByAttributeValue("hi!", "hi!");
        org.jsoup.nodes.Attributes attributes36 = document32.attributes();
        org.jsoup.nodes.Element element37 = document32.head();
        org.jsoup.select.Elements elements38 = element37.getAllElements();
        org.jsoup.select.Elements elements39 = element37.getAllElements();
        org.jsoup.select.Elements elements41 = elements39.val(" class=\"hi!\"");
        boolean boolean42 = element29.equals((java.lang.Object) elements39);
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
        org.junit.Assert.assertNotNull(elements23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "#document" + "'", str24, "#document");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(document32);
        org.junit.Assert.assertNotNull(elements35);
        org.junit.Assert.assertNotNull(attributes36);
        org.junit.Assert.assertNotNull(element37);
        org.junit.Assert.assertNotNull(elements38);
        org.junit.Assert.assertNotNull(elements39);
        org.junit.Assert.assertNotNull(elements41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0472");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        org.jsoup.select.Elements elements3 = document1.getElementsByAttribute("hi!");
        org.jsoup.nodes.Element element5 = document1.prepend("#document");
        org.jsoup.select.Elements elements7 = element5.getElementsByAttribute("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node9 = element5.removeAttr("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements7);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0473");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("#root", "");
        java.lang.String str3 = document2.outerHtml();
        org.jsoup.nodes.Element element5 = document2.append("<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element7 = document2.wrap("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>" + "'", str3, "<html>\n<head>\n</head>\n<body>\n #root \n</body>\n</html>");
        org.junit.Assert.assertNotNull(element5);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0474");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("hi!");
        org.jsoup.nodes.Document document2 = document1.normalise();
        org.jsoup.nodes.Element element3 = document1.head();
        org.jsoup.nodes.Element element5 = element3.append("<html>\n<head>\n</head>\n<body>\n</body>\n</html>");
        org.jsoup.nodes.Element element7 = element3.wrap("#text");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element8 = element7.empty();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNull(element7);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0475");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("#document#document", "#data");
        org.jsoup.nodes.Element element4 = document2.appendText("org.jsoup.select.Selector$SelectorParseException: ");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0476");
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
        org.jsoup.nodes.Document document16 = new org.jsoup.nodes.Document("");
        boolean boolean17 = document16.hasText();
        java.lang.String str18 = document16.nodeName();
        org.jsoup.select.Elements elements19 = document16.children();
        org.jsoup.select.Elements elements21 = document16.getElementsByTag("#document#documenthi!");
        org.jsoup.select.Elements elements23 = elements21.removeClass("#document#documentdocument");
        org.jsoup.select.Elements elements25 = elements21.html("#text");
        boolean boolean26 = element12.equals((java.lang.Object) elements25);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNull(element14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "#document" + "'", str18, "#document");
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertNotNull(elements21);
        org.junit.Assert.assertNotNull(elements23);
        org.junit.Assert.assertNotNull(elements25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0477");
        org.jsoup.safety.Whitelist whitelist2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.jsoup.Jsoup.clean("org.jsoup.select.Selector$SelectorParseException:", "#root", whitelist2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0478");
        org.jsoup.nodes.Document document2 = new org.jsoup.nodes.Document("");
        boolean boolean3 = document2.hasText();
        java.lang.String str4 = document2.nodeName();
        java.lang.String str5 = document2.val();
        java.lang.String str6 = document2.outerHtml();
        java.lang.String[] strArray9 = new java.lang.String[] { "\n<!--#document-->", "#data" };
        java.util.LinkedHashSet<java.lang.String> strSet10 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet10, strArray9);
        org.jsoup.nodes.Element element12 = document2.classNames((java.util.Set<java.lang.String>) strSet10);
        org.jsoup.nodes.Document document13 = document2.normalise();
        boolean boolean14 = document13.isBlock();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements15 = org.jsoup.select.Selector.select("<[#, d, o, c, u, m, e, n, t]>\n</[#, d, o, c, u, m, e, n, t]>#root=&quot;hi!&quot;", (org.jsoup.nodes.Element) document13);
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query <[#, d, o, c, u, m, e, n, t]>?</[#, d, o, c, u, m, e, n, t]>#root=&quot;hi!&quot;");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#document" + "'", str4, "#document");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0479");
        org.jsoup.safety.Whitelist whitelist1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.jsoup.Jsoup.clean("<[#, d, o, c, u, m, e, n, t]>\n</[#, d, o, c, u, m, e, n, t]>#root=&quot;hi!&quot;", whitelist1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated object is null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0480");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("#text");
        org.junit.Assert.assertNotNull(document1);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0481");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element25 = element23.wrap("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The validated string is empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
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
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0482");
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
        org.jsoup.nodes.Element element23 = new org.jsoup.nodes.Element(tag1, "#declaration");
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
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0483");
        org.jsoup.nodes.DataNode dataNode2 = new org.jsoup.nodes.DataNode("body", "#document#document=\"#document#document\"");
        java.lang.String str4 = dataNode2.absUrl("#document#document");
        java.lang.String str5 = dataNode2.nodeName();
        java.lang.String str6 = dataNode2.nodeName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#data" + "'", str5, "#data");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#data" + "'", str6, "#data");
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0484");
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
        java.util.function.UnaryOperator<org.jsoup.nodes.Element> elementUnaryOperator30 = null;
        // The following exception was thrown during execution in test generation
        try {
            elements23.replaceAll(elementUnaryOperator30);
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
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertNotNull(elements23);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(elements28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0485");
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
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0486");
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
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0487");
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
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0488");
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
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0489");
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
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0490");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded(" class=\"hi!\"", "org.jsoup.select.Selector$SelectorParseException: ");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("#data");
        java.lang.String str5 = textNode4.text();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#data" + "'", str5, "#data");
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0491");
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
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0492");
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
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0493");
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
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0494");
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
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0495");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!", "hi!");
        attribute2.setValue("#root=\"hi!\"");
        java.lang.String str5 = attribute2.getKey();
        java.lang.String str6 = attribute2.getKey();
        org.junit.Assert.assertNotNull(attribute2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0496");
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
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0497");
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
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0498");
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
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0499");
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
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0500");
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
}

