package org.jsoup.nodes;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test001");
        org.jsoup.nodes.Document.OutputSettings outputSettings1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.jsoup.nodes.Entities.escape("hi!", outputSettings1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        java.lang.String str1 = org.jsoup.nodes.Entities.unescape("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        org.jsoup.nodes.Document.OutputSettings outputSettings1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.jsoup.nodes.Entities.escape("", outputSettings1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        java.lang.String str1 = org.jsoup.nodes.Entities.unescape("hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode2 = org.jsoup.nodes.Entities.EscapeMode.extended;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.jsoup.nodes.Entities.escape("hi!", charsetEncoder1, escapeMode2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + escapeMode2 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.extended + "'", escapeMode2.equals(org.jsoup.nodes.Entities.EscapeMode.extended));
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode2 = org.jsoup.nodes.Entities.EscapeMode.base;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.jsoup.nodes.Entities.escape("hi!", charsetEncoder1, escapeMode2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + escapeMode2 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode2.equals(org.jsoup.nodes.Entities.EscapeMode.base));
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        org.jsoup.nodes.Entities entities0 = new org.jsoup.nodes.Entities();
        java.lang.Class<?> wildcardClass1 = entities0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode4 = org.jsoup.nodes.Entities.EscapeMode.base;
        java.lang.String str5 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = org.jsoup.nodes.Entities.escape("hi!", charsetEncoder1, escapeMode4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + escapeMode4 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode4.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode2 = org.jsoup.nodes.Entities.EscapeMode.base;
        java.lang.String str3 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode2);
        java.lang.Class<?> wildcardClass4 = escapeMode2.getClass();
        org.junit.Assert.assertTrue("'" + escapeMode2 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode2.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode8 = org.jsoup.nodes.Entities.EscapeMode.base;
        java.lang.String str9 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode8);
        java.lang.String str10 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode8);
        java.lang.String str11 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = org.jsoup.nodes.Entities.escape("hi!", charsetEncoder1, escapeMode8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + escapeMode8 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode8.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode6 = org.jsoup.nodes.Entities.EscapeMode.base;
        java.lang.String str7 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode6);
        java.lang.String str8 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode6);
        java.lang.String str9 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode6);
        java.lang.Class<?> wildcardClass10 = escapeMode6.getClass();
        org.junit.Assert.assertTrue("'" + escapeMode6 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode6.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode4 = org.jsoup.nodes.Entities.EscapeMode.extended;
        java.lang.String str5 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = org.jsoup.nodes.Entities.escape("hi!", charsetEncoder1, escapeMode4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + escapeMode4 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.extended + "'", escapeMode4.equals(org.jsoup.nodes.Entities.EscapeMode.extended));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode4 = org.jsoup.nodes.Entities.EscapeMode.extended;
        java.lang.String str5 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode4);
        java.lang.String str6 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode4);
        java.lang.Class<?> wildcardClass7 = escapeMode4.getClass();
        org.junit.Assert.assertTrue("'" + escapeMode4 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.extended + "'", escapeMode4.equals(org.jsoup.nodes.Entities.EscapeMode.extended));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode6 = org.jsoup.nodes.Entities.EscapeMode.extended;
        java.lang.String str7 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode6);
        java.lang.String str8 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = org.jsoup.nodes.Entities.escape("hi!", charsetEncoder1, escapeMode6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + escapeMode6 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.extended + "'", escapeMode6.equals(org.jsoup.nodes.Entities.EscapeMode.extended));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode4 = org.jsoup.nodes.Entities.EscapeMode.base;
        java.lang.String str5 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode4);
        java.lang.String str6 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode4);
        java.lang.Class<?> wildcardClass7 = escapeMode4.getClass();
        org.junit.Assert.assertTrue("'" + escapeMode4 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode4.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode2 = null;
        java.lang.String str3 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode6 = org.jsoup.nodes.Entities.EscapeMode.extended;
        java.lang.String str7 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode6);
        java.lang.String str8 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode6);
        java.lang.String str9 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode6);
        java.lang.Class<?> wildcardClass10 = escapeMode6.getClass();
        org.junit.Assert.assertTrue("'" + escapeMode6 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.extended + "'", escapeMode6.equals(org.jsoup.nodes.Entities.EscapeMode.extended));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode6 = org.jsoup.nodes.Entities.EscapeMode.base;
        java.lang.String str7 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode6);
        java.lang.String str8 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = org.jsoup.nodes.Entities.escape("hi!", charsetEncoder1, escapeMode6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + escapeMode6 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode6.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode2 = org.jsoup.nodes.Entities.EscapeMode.extended;
        java.lang.String str3 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode2);
        java.lang.Class<?> wildcardClass4 = escapeMode2.getClass();
        org.junit.Assert.assertTrue("'" + escapeMode2 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.extended + "'", escapeMode2.equals(org.jsoup.nodes.Entities.EscapeMode.extended));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.jsoup.nodes.Entities.escape("hi!", charsetEncoder1, escapeMode2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode8 = org.jsoup.nodes.Entities.EscapeMode.base;
        java.lang.String str9 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode8);
        java.lang.String str10 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode8);
        java.lang.String str11 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode8);
        java.lang.String str12 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode8);
        java.lang.Class<?> wildcardClass13 = escapeMode8.getClass();
        org.junit.Assert.assertTrue("'" + escapeMode8 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode8.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        java.nio.charset.CharsetEncoder charsetEncoder11 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode12 = org.jsoup.nodes.Entities.EscapeMode.base;
        java.lang.String str13 = org.jsoup.nodes.Entities.escape("", charsetEncoder11, escapeMode12);
        java.lang.String str14 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode12);
        java.lang.String str15 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode12);
        java.lang.String str16 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode12);
        java.lang.String str17 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode12);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = org.jsoup.nodes.Entities.escape("hi!", charsetEncoder1, escapeMode12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + escapeMode12 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode12.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode10 = org.jsoup.nodes.Entities.EscapeMode.base;
        java.lang.String str11 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode10);
        java.lang.String str12 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode10);
        java.lang.String str13 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode10);
        java.lang.String str14 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode10);
        java.lang.String str15 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode10);
        java.lang.Class<?> wildcardClass16 = escapeMode10.getClass();
        org.junit.Assert.assertTrue("'" + escapeMode10 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode10.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode8 = org.jsoup.nodes.Entities.EscapeMode.extended;
        java.lang.String str9 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode8);
        java.lang.String str10 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode8);
        java.lang.String str11 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode8);
        java.lang.String str12 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode8);
        java.lang.Class<?> wildcardClass13 = escapeMode8.getClass();
        org.junit.Assert.assertTrue("'" + escapeMode8 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.extended + "'", escapeMode8.equals(org.jsoup.nodes.Entities.EscapeMode.extended));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode10 = org.jsoup.nodes.Entities.EscapeMode.extended;
        java.lang.String str11 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode10);
        java.lang.String str12 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode10);
        java.lang.String str13 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode10);
        java.lang.String str14 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = org.jsoup.nodes.Entities.escape("hi!", charsetEncoder1, escapeMode10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + escapeMode10 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.extended + "'", escapeMode10.equals(org.jsoup.nodes.Entities.EscapeMode.extended));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        java.nio.charset.CharsetEncoder charsetEncoder11 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode12 = org.jsoup.nodes.Entities.EscapeMode.extended;
        java.lang.String str13 = org.jsoup.nodes.Entities.escape("", charsetEncoder11, escapeMode12);
        java.lang.String str14 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode12);
        java.lang.String str15 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode12);
        java.lang.String str16 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode12);
        java.lang.String str17 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode12);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = org.jsoup.nodes.Entities.escape("hi!", charsetEncoder1, escapeMode12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + escapeMode12 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.extended + "'", escapeMode12.equals(org.jsoup.nodes.Entities.EscapeMode.extended));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode10 = org.jsoup.nodes.Entities.EscapeMode.extended;
        java.lang.String str11 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode10);
        java.lang.String str12 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode10);
        java.lang.String str13 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode10);
        java.lang.String str14 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode10);
        java.lang.String str15 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode10);
        java.lang.Class<?> wildcardClass16 = escapeMode10.getClass();
        org.junit.Assert.assertTrue("'" + escapeMode10 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.extended + "'", escapeMode10.equals(org.jsoup.nodes.Entities.EscapeMode.extended));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        java.nio.charset.CharsetEncoder charsetEncoder11 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode12 = org.jsoup.nodes.Entities.EscapeMode.extended;
        java.lang.String str13 = org.jsoup.nodes.Entities.escape("", charsetEncoder11, escapeMode12);
        java.lang.String str14 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode12);
        java.lang.String str15 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode12);
        java.lang.String str16 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode12);
        java.lang.String str17 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode12);
        java.lang.String str18 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode12);
        java.lang.Class<?> wildcardClass19 = escapeMode12.getClass();
        org.junit.Assert.assertTrue("'" + escapeMode12 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.extended + "'", escapeMode12.equals(org.jsoup.nodes.Entities.EscapeMode.extended));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode10 = org.jsoup.nodes.Entities.EscapeMode.base;
        java.lang.String str11 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode10);
        java.lang.String str12 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode10);
        java.lang.String str13 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode10);
        java.lang.String str14 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = org.jsoup.nodes.Entities.escape("hi!", charsetEncoder1, escapeMode10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + escapeMode10 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode10.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        java.nio.charset.CharsetEncoder charsetEncoder11 = null;
        java.nio.charset.CharsetEncoder charsetEncoder13 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode14 = org.jsoup.nodes.Entities.EscapeMode.extended;
        java.lang.String str15 = org.jsoup.nodes.Entities.escape("", charsetEncoder13, escapeMode14);
        java.lang.String str16 = org.jsoup.nodes.Entities.escape("", charsetEncoder11, escapeMode14);
        java.lang.String str17 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode14);
        java.lang.String str18 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode14);
        java.lang.String str19 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode14);
        java.lang.String str20 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode14);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = org.jsoup.nodes.Entities.escape("hi!", charsetEncoder1, escapeMode14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + escapeMode14 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.extended + "'", escapeMode14.equals(org.jsoup.nodes.Entities.EscapeMode.extended));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode8 = org.jsoup.nodes.Entities.EscapeMode.extended;
        java.lang.String str9 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode8);
        java.lang.String str10 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode8);
        java.lang.String str11 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = org.jsoup.nodes.Entities.escape("hi!", charsetEncoder1, escapeMode8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + escapeMode8 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.extended + "'", escapeMode8.equals(org.jsoup.nodes.Entities.EscapeMode.extended));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        java.nio.charset.CharsetEncoder charsetEncoder11 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode12 = org.jsoup.nodes.Entities.EscapeMode.base;
        java.lang.String str13 = org.jsoup.nodes.Entities.escape("", charsetEncoder11, escapeMode12);
        java.lang.String str14 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode12);
        java.lang.String str15 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode12);
        java.lang.String str16 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode12);
        java.lang.String str17 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode12);
        java.lang.String str18 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode12);
        java.lang.Class<?> wildcardClass19 = escapeMode12.getClass();
        org.junit.Assert.assertTrue("'" + escapeMode12 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode12.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        java.nio.charset.CharsetEncoder charsetEncoder11 = null;
        java.nio.charset.CharsetEncoder charsetEncoder13 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode14 = org.jsoup.nodes.Entities.EscapeMode.base;
        java.lang.String str15 = org.jsoup.nodes.Entities.escape("", charsetEncoder13, escapeMode14);
        java.lang.String str16 = org.jsoup.nodes.Entities.escape("", charsetEncoder11, escapeMode14);
        java.lang.String str17 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode14);
        java.lang.String str18 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode14);
        java.lang.String str19 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode14);
        java.lang.String str20 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode14);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = org.jsoup.nodes.Entities.escape("hi!", charsetEncoder1, escapeMode14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + escapeMode14 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode14.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        java.nio.charset.CharsetEncoder charsetEncoder11 = null;
        java.nio.charset.CharsetEncoder charsetEncoder13 = null;
        java.nio.charset.CharsetEncoder charsetEncoder15 = null;
        java.nio.charset.CharsetEncoder charsetEncoder17 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode18 = org.jsoup.nodes.Entities.EscapeMode.base;
        java.lang.String str19 = org.jsoup.nodes.Entities.escape("", charsetEncoder17, escapeMode18);
        java.lang.String str20 = org.jsoup.nodes.Entities.escape("", charsetEncoder15, escapeMode18);
        java.lang.String str21 = org.jsoup.nodes.Entities.escape("", charsetEncoder13, escapeMode18);
        java.lang.String str22 = org.jsoup.nodes.Entities.escape("", charsetEncoder11, escapeMode18);
        java.lang.String str23 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode18);
        java.lang.String str24 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode18);
        java.lang.String str25 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode18);
        java.lang.String str26 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode18);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str27 = org.jsoup.nodes.Entities.escape("hi!", charsetEncoder1, escapeMode18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + escapeMode18 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode18.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        java.nio.charset.CharsetEncoder charsetEncoder11 = null;
        java.nio.charset.CharsetEncoder charsetEncoder13 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode14 = org.jsoup.nodes.Entities.EscapeMode.extended;
        java.lang.String str15 = org.jsoup.nodes.Entities.escape("", charsetEncoder13, escapeMode14);
        java.lang.String str16 = org.jsoup.nodes.Entities.escape("", charsetEncoder11, escapeMode14);
        java.lang.String str17 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode14);
        java.lang.String str18 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode14);
        java.lang.String str19 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode14);
        java.lang.String str20 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode14);
        java.lang.String str21 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode14);
        java.lang.Class<?> wildcardClass22 = escapeMode14.getClass();
        org.junit.Assert.assertTrue("'" + escapeMode14 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.extended + "'", escapeMode14.equals(org.jsoup.nodes.Entities.EscapeMode.extended));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        java.nio.charset.CharsetEncoder charsetEncoder11 = null;
        java.nio.charset.CharsetEncoder charsetEncoder13 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode14 = org.jsoup.nodes.Entities.EscapeMode.base;
        java.lang.String str15 = org.jsoup.nodes.Entities.escape("", charsetEncoder13, escapeMode14);
        java.lang.String str16 = org.jsoup.nodes.Entities.escape("", charsetEncoder11, escapeMode14);
        java.lang.String str17 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode14);
        java.lang.String str18 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode14);
        java.lang.String str19 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode14);
        java.lang.String str20 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode14);
        java.lang.String str21 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode14);
        java.lang.Class<?> wildcardClass22 = escapeMode14.getClass();
        org.junit.Assert.assertTrue("'" + escapeMode14 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode14.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        java.nio.charset.CharsetEncoder charsetEncoder11 = null;
        java.nio.charset.CharsetEncoder charsetEncoder13 = null;
        java.nio.charset.CharsetEncoder charsetEncoder15 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode16 = org.jsoup.nodes.Entities.EscapeMode.base;
        java.lang.String str17 = org.jsoup.nodes.Entities.escape("", charsetEncoder15, escapeMode16);
        java.lang.String str18 = org.jsoup.nodes.Entities.escape("", charsetEncoder13, escapeMode16);
        java.lang.String str19 = org.jsoup.nodes.Entities.escape("", charsetEncoder11, escapeMode16);
        java.lang.String str20 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode16);
        java.lang.String str21 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode16);
        java.lang.String str22 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode16);
        java.lang.String str23 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode16);
        java.lang.String str24 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode16);
        java.lang.Class<?> wildcardClass25 = escapeMode16.getClass();
        org.junit.Assert.assertTrue("'" + escapeMode16 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode16.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        java.nio.charset.CharsetEncoder charsetEncoder11 = null;
        java.nio.charset.CharsetEncoder charsetEncoder13 = null;
        java.nio.charset.CharsetEncoder charsetEncoder15 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode16 = org.jsoup.nodes.Entities.EscapeMode.extended;
        java.lang.String str17 = org.jsoup.nodes.Entities.escape("", charsetEncoder15, escapeMode16);
        java.lang.String str18 = org.jsoup.nodes.Entities.escape("", charsetEncoder13, escapeMode16);
        java.lang.String str19 = org.jsoup.nodes.Entities.escape("", charsetEncoder11, escapeMode16);
        java.lang.String str20 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode16);
        java.lang.String str21 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode16);
        java.lang.String str22 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode16);
        java.lang.String str23 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode16);
        java.lang.String str24 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode16);
        java.lang.Class<?> wildcardClass25 = escapeMode16.getClass();
        org.junit.Assert.assertTrue("'" + escapeMode16 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.extended + "'", escapeMode16.equals(org.jsoup.nodes.Entities.EscapeMode.extended));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        java.nio.charset.CharsetEncoder charsetEncoder11 = null;
        java.nio.charset.CharsetEncoder charsetEncoder13 = null;
        java.nio.charset.CharsetEncoder charsetEncoder15 = null;
        java.nio.charset.CharsetEncoder charsetEncoder17 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode18 = org.jsoup.nodes.Entities.EscapeMode.extended;
        java.lang.String str19 = org.jsoup.nodes.Entities.escape("", charsetEncoder17, escapeMode18);
        java.lang.String str20 = org.jsoup.nodes.Entities.escape("", charsetEncoder15, escapeMode18);
        java.lang.String str21 = org.jsoup.nodes.Entities.escape("", charsetEncoder13, escapeMode18);
        java.lang.String str22 = org.jsoup.nodes.Entities.escape("", charsetEncoder11, escapeMode18);
        java.lang.String str23 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode18);
        java.lang.String str24 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode18);
        java.lang.String str25 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode18);
        java.lang.String str26 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode18);
        java.lang.String str27 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode18);
        java.lang.Class<?> wildcardClass28 = escapeMode18.getClass();
        org.junit.Assert.assertTrue("'" + escapeMode18 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.extended + "'", escapeMode18.equals(org.jsoup.nodes.Entities.EscapeMode.extended));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        java.nio.charset.CharsetEncoder charsetEncoder11 = null;
        java.nio.charset.CharsetEncoder charsetEncoder13 = null;
        java.nio.charset.CharsetEncoder charsetEncoder15 = null;
        java.nio.charset.CharsetEncoder charsetEncoder17 = null;
        java.nio.charset.CharsetEncoder charsetEncoder19 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode20 = org.jsoup.nodes.Entities.EscapeMode.base;
        java.lang.String str21 = org.jsoup.nodes.Entities.escape("", charsetEncoder19, escapeMode20);
        java.lang.String str22 = org.jsoup.nodes.Entities.escape("", charsetEncoder17, escapeMode20);
        java.lang.String str23 = org.jsoup.nodes.Entities.escape("", charsetEncoder15, escapeMode20);
        java.lang.String str24 = org.jsoup.nodes.Entities.escape("", charsetEncoder13, escapeMode20);
        java.lang.String str25 = org.jsoup.nodes.Entities.escape("", charsetEncoder11, escapeMode20);
        java.lang.String str26 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode20);
        java.lang.String str27 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode20);
        java.lang.String str28 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode20);
        java.lang.String str29 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode20);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str30 = org.jsoup.nodes.Entities.escape("hi!", charsetEncoder1, escapeMode20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + escapeMode20 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode20.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        java.nio.charset.CharsetEncoder charsetEncoder11 = null;
        java.nio.charset.CharsetEncoder charsetEncoder13 = null;
        java.nio.charset.CharsetEncoder charsetEncoder15 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode16 = org.jsoup.nodes.Entities.EscapeMode.extended;
        java.lang.String str17 = org.jsoup.nodes.Entities.escape("", charsetEncoder15, escapeMode16);
        java.lang.String str18 = org.jsoup.nodes.Entities.escape("", charsetEncoder13, escapeMode16);
        java.lang.String str19 = org.jsoup.nodes.Entities.escape("", charsetEncoder11, escapeMode16);
        java.lang.String str20 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode16);
        java.lang.String str21 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode16);
        java.lang.String str22 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode16);
        java.lang.String str23 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode16);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = org.jsoup.nodes.Entities.escape("hi!", charsetEncoder1, escapeMode16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + escapeMode16 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.extended + "'", escapeMode16.equals(org.jsoup.nodes.Entities.EscapeMode.extended));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        java.nio.charset.CharsetEncoder charsetEncoder11 = null;
        java.nio.charset.CharsetEncoder charsetEncoder13 = null;
        java.nio.charset.CharsetEncoder charsetEncoder15 = null;
        java.nio.charset.CharsetEncoder charsetEncoder17 = null;
        java.nio.charset.CharsetEncoder charsetEncoder19 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode20 = org.jsoup.nodes.Entities.EscapeMode.extended;
        java.lang.String str21 = org.jsoup.nodes.Entities.escape("", charsetEncoder19, escapeMode20);
        java.lang.String str22 = org.jsoup.nodes.Entities.escape("", charsetEncoder17, escapeMode20);
        java.lang.String str23 = org.jsoup.nodes.Entities.escape("", charsetEncoder15, escapeMode20);
        java.lang.String str24 = org.jsoup.nodes.Entities.escape("", charsetEncoder13, escapeMode20);
        java.lang.String str25 = org.jsoup.nodes.Entities.escape("", charsetEncoder11, escapeMode20);
        java.lang.String str26 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode20);
        java.lang.String str27 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode20);
        java.lang.String str28 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode20);
        java.lang.String str29 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode20);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str30 = org.jsoup.nodes.Entities.escape("hi!", charsetEncoder1, escapeMode20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + escapeMode20 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.extended + "'", escapeMode20.equals(org.jsoup.nodes.Entities.EscapeMode.extended));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        java.nio.charset.CharsetEncoder charsetEncoder11 = null;
        java.nio.charset.CharsetEncoder charsetEncoder13 = null;
        java.nio.charset.CharsetEncoder charsetEncoder15 = null;
        java.nio.charset.CharsetEncoder charsetEncoder17 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode18 = org.jsoup.nodes.Entities.EscapeMode.base;
        java.lang.String str19 = org.jsoup.nodes.Entities.escape("", charsetEncoder17, escapeMode18);
        java.lang.String str20 = org.jsoup.nodes.Entities.escape("", charsetEncoder15, escapeMode18);
        java.lang.String str21 = org.jsoup.nodes.Entities.escape("", charsetEncoder13, escapeMode18);
        java.lang.String str22 = org.jsoup.nodes.Entities.escape("", charsetEncoder11, escapeMode18);
        java.lang.String str23 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode18);
        java.lang.String str24 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode18);
        java.lang.String str25 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode18);
        java.lang.String str26 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode18);
        java.lang.String str27 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode18);
        java.lang.Class<?> wildcardClass28 = escapeMode18.getClass();
        org.junit.Assert.assertTrue("'" + escapeMode18 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode18.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        java.nio.charset.CharsetEncoder charsetEncoder11 = null;
        java.nio.charset.CharsetEncoder charsetEncoder13 = null;
        java.nio.charset.CharsetEncoder charsetEncoder15 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode16 = org.jsoup.nodes.Entities.EscapeMode.base;
        java.lang.String str17 = org.jsoup.nodes.Entities.escape("", charsetEncoder15, escapeMode16);
        java.lang.String str18 = org.jsoup.nodes.Entities.escape("", charsetEncoder13, escapeMode16);
        java.lang.String str19 = org.jsoup.nodes.Entities.escape("", charsetEncoder11, escapeMode16);
        java.lang.String str20 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode16);
        java.lang.String str21 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode16);
        java.lang.String str22 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode16);
        java.lang.String str23 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode16);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = org.jsoup.nodes.Entities.escape("hi!", charsetEncoder1, escapeMode16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + escapeMode16 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode16.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        java.nio.charset.CharsetEncoder charsetEncoder11 = null;
        java.nio.charset.CharsetEncoder charsetEncoder13 = null;
        java.nio.charset.CharsetEncoder charsetEncoder15 = null;
        java.nio.charset.CharsetEncoder charsetEncoder17 = null;
        java.nio.charset.CharsetEncoder charsetEncoder19 = null;
        java.nio.charset.CharsetEncoder charsetEncoder21 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode22 = org.jsoup.nodes.Entities.EscapeMode.base;
        java.lang.String str23 = org.jsoup.nodes.Entities.escape("", charsetEncoder21, escapeMode22);
        java.lang.String str24 = org.jsoup.nodes.Entities.escape("", charsetEncoder19, escapeMode22);
        java.lang.String str25 = org.jsoup.nodes.Entities.escape("", charsetEncoder17, escapeMode22);
        java.lang.String str26 = org.jsoup.nodes.Entities.escape("", charsetEncoder15, escapeMode22);
        java.lang.String str27 = org.jsoup.nodes.Entities.escape("", charsetEncoder13, escapeMode22);
        java.lang.String str28 = org.jsoup.nodes.Entities.escape("", charsetEncoder11, escapeMode22);
        java.lang.String str29 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode22);
        java.lang.String str30 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode22);
        java.lang.String str31 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode22);
        java.lang.String str32 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode22);
        java.lang.String str33 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode22);
        java.lang.Class<?> wildcardClass34 = escapeMode22.getClass();
        org.junit.Assert.assertTrue("'" + escapeMode22 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode22.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        java.nio.charset.CharsetEncoder charsetEncoder11 = null;
        java.nio.charset.CharsetEncoder charsetEncoder13 = null;
        java.nio.charset.CharsetEncoder charsetEncoder15 = null;
        java.nio.charset.CharsetEncoder charsetEncoder17 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode18 = org.jsoup.nodes.Entities.EscapeMode.extended;
        java.lang.String str19 = org.jsoup.nodes.Entities.escape("", charsetEncoder17, escapeMode18);
        java.lang.String str20 = org.jsoup.nodes.Entities.escape("", charsetEncoder15, escapeMode18);
        java.lang.String str21 = org.jsoup.nodes.Entities.escape("", charsetEncoder13, escapeMode18);
        java.lang.String str22 = org.jsoup.nodes.Entities.escape("", charsetEncoder11, escapeMode18);
        java.lang.String str23 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode18);
        java.lang.String str24 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode18);
        java.lang.String str25 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode18);
        java.lang.String str26 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode18);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str27 = org.jsoup.nodes.Entities.escape("hi!", charsetEncoder1, escapeMode18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + escapeMode18 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.extended + "'", escapeMode18.equals(org.jsoup.nodes.Entities.EscapeMode.extended));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        java.nio.charset.CharsetEncoder charsetEncoder11 = null;
        java.nio.charset.CharsetEncoder charsetEncoder13 = null;
        java.nio.charset.CharsetEncoder charsetEncoder15 = null;
        java.nio.charset.CharsetEncoder charsetEncoder17 = null;
        java.nio.charset.CharsetEncoder charsetEncoder19 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode20 = org.jsoup.nodes.Entities.EscapeMode.base;
        java.lang.String str21 = org.jsoup.nodes.Entities.escape("", charsetEncoder19, escapeMode20);
        java.lang.String str22 = org.jsoup.nodes.Entities.escape("", charsetEncoder17, escapeMode20);
        java.lang.String str23 = org.jsoup.nodes.Entities.escape("", charsetEncoder15, escapeMode20);
        java.lang.String str24 = org.jsoup.nodes.Entities.escape("", charsetEncoder13, escapeMode20);
        java.lang.String str25 = org.jsoup.nodes.Entities.escape("", charsetEncoder11, escapeMode20);
        java.lang.String str26 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode20);
        java.lang.String str27 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode20);
        java.lang.String str28 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode20);
        java.lang.String str29 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode20);
        java.lang.String str30 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode20);
        java.lang.Class<?> wildcardClass31 = escapeMode20.getClass();
        org.junit.Assert.assertTrue("'" + escapeMode20 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode20.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        java.nio.charset.CharsetEncoder charsetEncoder11 = null;
        java.nio.charset.CharsetEncoder charsetEncoder13 = null;
        java.nio.charset.CharsetEncoder charsetEncoder15 = null;
        java.nio.charset.CharsetEncoder charsetEncoder17 = null;
        java.nio.charset.CharsetEncoder charsetEncoder19 = null;
        java.nio.charset.CharsetEncoder charsetEncoder21 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode22 = org.jsoup.nodes.Entities.EscapeMode.extended;
        java.lang.String str23 = org.jsoup.nodes.Entities.escape("", charsetEncoder21, escapeMode22);
        java.lang.String str24 = org.jsoup.nodes.Entities.escape("", charsetEncoder19, escapeMode22);
        java.lang.String str25 = org.jsoup.nodes.Entities.escape("", charsetEncoder17, escapeMode22);
        java.lang.String str26 = org.jsoup.nodes.Entities.escape("", charsetEncoder15, escapeMode22);
        java.lang.String str27 = org.jsoup.nodes.Entities.escape("", charsetEncoder13, escapeMode22);
        java.lang.String str28 = org.jsoup.nodes.Entities.escape("", charsetEncoder11, escapeMode22);
        java.lang.String str29 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode22);
        java.lang.String str30 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode22);
        java.lang.String str31 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode22);
        java.lang.String str32 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode22);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str33 = org.jsoup.nodes.Entities.escape("hi!", charsetEncoder1, escapeMode22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + escapeMode22 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.extended + "'", escapeMode22.equals(org.jsoup.nodes.Entities.EscapeMode.extended));
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        java.nio.charset.CharsetEncoder charsetEncoder11 = null;
        java.nio.charset.CharsetEncoder charsetEncoder13 = null;
        java.nio.charset.CharsetEncoder charsetEncoder15 = null;
        java.nio.charset.CharsetEncoder charsetEncoder17 = null;
        java.nio.charset.CharsetEncoder charsetEncoder19 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode20 = org.jsoup.nodes.Entities.EscapeMode.extended;
        java.lang.String str21 = org.jsoup.nodes.Entities.escape("", charsetEncoder19, escapeMode20);
        java.lang.String str22 = org.jsoup.nodes.Entities.escape("", charsetEncoder17, escapeMode20);
        java.lang.String str23 = org.jsoup.nodes.Entities.escape("", charsetEncoder15, escapeMode20);
        java.lang.String str24 = org.jsoup.nodes.Entities.escape("", charsetEncoder13, escapeMode20);
        java.lang.String str25 = org.jsoup.nodes.Entities.escape("", charsetEncoder11, escapeMode20);
        java.lang.String str26 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode20);
        java.lang.String str27 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode20);
        java.lang.String str28 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode20);
        java.lang.String str29 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode20);
        java.lang.String str30 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode20);
        java.lang.Class<?> wildcardClass31 = escapeMode20.getClass();
        org.junit.Assert.assertTrue("'" + escapeMode20 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.extended + "'", escapeMode20.equals(org.jsoup.nodes.Entities.EscapeMode.extended));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        java.nio.charset.CharsetEncoder charsetEncoder11 = null;
        java.nio.charset.CharsetEncoder charsetEncoder13 = null;
        java.nio.charset.CharsetEncoder charsetEncoder15 = null;
        java.nio.charset.CharsetEncoder charsetEncoder17 = null;
        java.nio.charset.CharsetEncoder charsetEncoder19 = null;
        java.nio.charset.CharsetEncoder charsetEncoder21 = null;
        java.nio.charset.CharsetEncoder charsetEncoder23 = null;
        java.nio.charset.CharsetEncoder charsetEncoder25 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode26 = org.jsoup.nodes.Entities.EscapeMode.base;
        java.lang.String str27 = org.jsoup.nodes.Entities.escape("", charsetEncoder25, escapeMode26);
        java.lang.String str28 = org.jsoup.nodes.Entities.escape("", charsetEncoder23, escapeMode26);
        java.lang.String str29 = org.jsoup.nodes.Entities.escape("", charsetEncoder21, escapeMode26);
        java.lang.String str30 = org.jsoup.nodes.Entities.escape("", charsetEncoder19, escapeMode26);
        java.lang.String str31 = org.jsoup.nodes.Entities.escape("", charsetEncoder17, escapeMode26);
        java.lang.String str32 = org.jsoup.nodes.Entities.escape("", charsetEncoder15, escapeMode26);
        java.lang.String str33 = org.jsoup.nodes.Entities.escape("", charsetEncoder13, escapeMode26);
        java.lang.String str34 = org.jsoup.nodes.Entities.escape("", charsetEncoder11, escapeMode26);
        java.lang.String str35 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode26);
        java.lang.String str36 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode26);
        java.lang.String str37 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode26);
        java.lang.String str38 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode26);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str39 = org.jsoup.nodes.Entities.escape("hi!", charsetEncoder1, escapeMode26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + escapeMode26 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode26.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        java.nio.charset.CharsetEncoder charsetEncoder11 = null;
        java.nio.charset.CharsetEncoder charsetEncoder13 = null;
        java.nio.charset.CharsetEncoder charsetEncoder15 = null;
        java.nio.charset.CharsetEncoder charsetEncoder17 = null;
        java.nio.charset.CharsetEncoder charsetEncoder19 = null;
        java.nio.charset.CharsetEncoder charsetEncoder21 = null;
        java.nio.charset.CharsetEncoder charsetEncoder23 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode24 = org.jsoup.nodes.Entities.EscapeMode.base;
        java.lang.String str25 = org.jsoup.nodes.Entities.escape("", charsetEncoder23, escapeMode24);
        java.lang.String str26 = org.jsoup.nodes.Entities.escape("", charsetEncoder21, escapeMode24);
        java.lang.String str27 = org.jsoup.nodes.Entities.escape("", charsetEncoder19, escapeMode24);
        java.lang.String str28 = org.jsoup.nodes.Entities.escape("", charsetEncoder17, escapeMode24);
        java.lang.String str29 = org.jsoup.nodes.Entities.escape("", charsetEncoder15, escapeMode24);
        java.lang.String str30 = org.jsoup.nodes.Entities.escape("", charsetEncoder13, escapeMode24);
        java.lang.String str31 = org.jsoup.nodes.Entities.escape("", charsetEncoder11, escapeMode24);
        java.lang.String str32 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode24);
        java.lang.String str33 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode24);
        java.lang.String str34 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode24);
        java.lang.String str35 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode24);
        java.lang.String str36 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode24);
        java.lang.Class<?> wildcardClass37 = escapeMode24.getClass();
        org.junit.Assert.assertTrue("'" + escapeMode24 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode24.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        java.nio.charset.CharsetEncoder charsetEncoder11 = null;
        java.nio.charset.CharsetEncoder charsetEncoder13 = null;
        java.nio.charset.CharsetEncoder charsetEncoder15 = null;
        java.nio.charset.CharsetEncoder charsetEncoder17 = null;
        java.nio.charset.CharsetEncoder charsetEncoder19 = null;
        java.nio.charset.CharsetEncoder charsetEncoder21 = null;
        java.nio.charset.CharsetEncoder charsetEncoder23 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode24 = org.jsoup.nodes.Entities.EscapeMode.base;
        java.lang.String str25 = org.jsoup.nodes.Entities.escape("", charsetEncoder23, escapeMode24);
        java.lang.String str26 = org.jsoup.nodes.Entities.escape("", charsetEncoder21, escapeMode24);
        java.lang.String str27 = org.jsoup.nodes.Entities.escape("", charsetEncoder19, escapeMode24);
        java.lang.String str28 = org.jsoup.nodes.Entities.escape("", charsetEncoder17, escapeMode24);
        java.lang.String str29 = org.jsoup.nodes.Entities.escape("", charsetEncoder15, escapeMode24);
        java.lang.String str30 = org.jsoup.nodes.Entities.escape("", charsetEncoder13, escapeMode24);
        java.lang.String str31 = org.jsoup.nodes.Entities.escape("", charsetEncoder11, escapeMode24);
        java.lang.String str32 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode24);
        java.lang.String str33 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode24);
        java.lang.String str34 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode24);
        java.lang.String str35 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode24);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str36 = org.jsoup.nodes.Entities.escape("hi!", charsetEncoder1, escapeMode24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + escapeMode24 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode24.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        java.nio.charset.CharsetEncoder charsetEncoder11 = null;
        java.nio.charset.CharsetEncoder charsetEncoder13 = null;
        java.nio.charset.CharsetEncoder charsetEncoder15 = null;
        java.nio.charset.CharsetEncoder charsetEncoder17 = null;
        java.nio.charset.CharsetEncoder charsetEncoder19 = null;
        java.nio.charset.CharsetEncoder charsetEncoder21 = null;
        java.nio.charset.CharsetEncoder charsetEncoder23 = null;
        java.nio.charset.CharsetEncoder charsetEncoder25 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode26 = org.jsoup.nodes.Entities.EscapeMode.base;
        java.lang.String str27 = org.jsoup.nodes.Entities.escape("", charsetEncoder25, escapeMode26);
        java.lang.String str28 = org.jsoup.nodes.Entities.escape("", charsetEncoder23, escapeMode26);
        java.lang.String str29 = org.jsoup.nodes.Entities.escape("", charsetEncoder21, escapeMode26);
        java.lang.String str30 = org.jsoup.nodes.Entities.escape("", charsetEncoder19, escapeMode26);
        java.lang.String str31 = org.jsoup.nodes.Entities.escape("", charsetEncoder17, escapeMode26);
        java.lang.String str32 = org.jsoup.nodes.Entities.escape("", charsetEncoder15, escapeMode26);
        java.lang.String str33 = org.jsoup.nodes.Entities.escape("", charsetEncoder13, escapeMode26);
        java.lang.String str34 = org.jsoup.nodes.Entities.escape("", charsetEncoder11, escapeMode26);
        java.lang.String str35 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode26);
        java.lang.String str36 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode26);
        java.lang.String str37 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode26);
        java.lang.String str38 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode26);
        java.lang.String str39 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode26);
        java.lang.Class<?> wildcardClass40 = escapeMode26.getClass();
        org.junit.Assert.assertTrue("'" + escapeMode26 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode26.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        java.nio.charset.CharsetEncoder charsetEncoder11 = null;
        java.nio.charset.CharsetEncoder charsetEncoder13 = null;
        java.nio.charset.CharsetEncoder charsetEncoder15 = null;
        java.nio.charset.CharsetEncoder charsetEncoder17 = null;
        java.nio.charset.CharsetEncoder charsetEncoder19 = null;
        java.nio.charset.CharsetEncoder charsetEncoder21 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode22 = org.jsoup.nodes.Entities.EscapeMode.extended;
        java.lang.String str23 = org.jsoup.nodes.Entities.escape("", charsetEncoder21, escapeMode22);
        java.lang.String str24 = org.jsoup.nodes.Entities.escape("", charsetEncoder19, escapeMode22);
        java.lang.String str25 = org.jsoup.nodes.Entities.escape("", charsetEncoder17, escapeMode22);
        java.lang.String str26 = org.jsoup.nodes.Entities.escape("", charsetEncoder15, escapeMode22);
        java.lang.String str27 = org.jsoup.nodes.Entities.escape("", charsetEncoder13, escapeMode22);
        java.lang.String str28 = org.jsoup.nodes.Entities.escape("", charsetEncoder11, escapeMode22);
        java.lang.String str29 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode22);
        java.lang.String str30 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode22);
        java.lang.String str31 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode22);
        java.lang.String str32 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode22);
        java.lang.String str33 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode22);
        java.lang.Class<?> wildcardClass34 = escapeMode22.getClass();
        org.junit.Assert.assertTrue("'" + escapeMode22 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.extended + "'", escapeMode22.equals(org.jsoup.nodes.Entities.EscapeMode.extended));
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        java.nio.charset.CharsetEncoder charsetEncoder11 = null;
        java.nio.charset.CharsetEncoder charsetEncoder13 = null;
        java.nio.charset.CharsetEncoder charsetEncoder15 = null;
        java.nio.charset.CharsetEncoder charsetEncoder17 = null;
        java.nio.charset.CharsetEncoder charsetEncoder19 = null;
        java.nio.charset.CharsetEncoder charsetEncoder21 = null;
        java.nio.charset.CharsetEncoder charsetEncoder23 = null;
        java.nio.charset.CharsetEncoder charsetEncoder25 = null;
        java.nio.charset.CharsetEncoder charsetEncoder27 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode28 = org.jsoup.nodes.Entities.EscapeMode.base;
        java.lang.String str29 = org.jsoup.nodes.Entities.escape("", charsetEncoder27, escapeMode28);
        java.lang.String str30 = org.jsoup.nodes.Entities.escape("", charsetEncoder25, escapeMode28);
        java.lang.String str31 = org.jsoup.nodes.Entities.escape("", charsetEncoder23, escapeMode28);
        java.lang.String str32 = org.jsoup.nodes.Entities.escape("", charsetEncoder21, escapeMode28);
        java.lang.String str33 = org.jsoup.nodes.Entities.escape("", charsetEncoder19, escapeMode28);
        java.lang.String str34 = org.jsoup.nodes.Entities.escape("", charsetEncoder17, escapeMode28);
        java.lang.String str35 = org.jsoup.nodes.Entities.escape("", charsetEncoder15, escapeMode28);
        java.lang.String str36 = org.jsoup.nodes.Entities.escape("", charsetEncoder13, escapeMode28);
        java.lang.String str37 = org.jsoup.nodes.Entities.escape("", charsetEncoder11, escapeMode28);
        java.lang.String str38 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode28);
        java.lang.String str39 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode28);
        java.lang.String str40 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode28);
        java.lang.String str41 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode28);
        java.lang.String str42 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode28);
        java.lang.Class<?> wildcardClass43 = escapeMode28.getClass();
        org.junit.Assert.assertTrue("'" + escapeMode28 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode28.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        java.nio.charset.CharsetEncoder charsetEncoder11 = null;
        java.nio.charset.CharsetEncoder charsetEncoder13 = null;
        java.nio.charset.CharsetEncoder charsetEncoder15 = null;
        java.nio.charset.CharsetEncoder charsetEncoder17 = null;
        java.nio.charset.CharsetEncoder charsetEncoder19 = null;
        java.nio.charset.CharsetEncoder charsetEncoder21 = null;
        java.nio.charset.CharsetEncoder charsetEncoder23 = null;
        java.nio.charset.CharsetEncoder charsetEncoder25 = null;
        java.nio.charset.CharsetEncoder charsetEncoder27 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode28 = org.jsoup.nodes.Entities.EscapeMode.base;
        java.lang.String str29 = org.jsoup.nodes.Entities.escape("", charsetEncoder27, escapeMode28);
        java.lang.String str30 = org.jsoup.nodes.Entities.escape("", charsetEncoder25, escapeMode28);
        java.lang.String str31 = org.jsoup.nodes.Entities.escape("", charsetEncoder23, escapeMode28);
        java.lang.String str32 = org.jsoup.nodes.Entities.escape("", charsetEncoder21, escapeMode28);
        java.lang.String str33 = org.jsoup.nodes.Entities.escape("", charsetEncoder19, escapeMode28);
        java.lang.String str34 = org.jsoup.nodes.Entities.escape("", charsetEncoder17, escapeMode28);
        java.lang.String str35 = org.jsoup.nodes.Entities.escape("", charsetEncoder15, escapeMode28);
        java.lang.String str36 = org.jsoup.nodes.Entities.escape("", charsetEncoder13, escapeMode28);
        java.lang.String str37 = org.jsoup.nodes.Entities.escape("", charsetEncoder11, escapeMode28);
        java.lang.String str38 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode28);
        java.lang.String str39 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode28);
        java.lang.String str40 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode28);
        java.lang.String str41 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode28);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str42 = org.jsoup.nodes.Entities.escape("hi!", charsetEncoder1, escapeMode28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + escapeMode28 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode28.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        java.nio.charset.CharsetEncoder charsetEncoder11 = null;
        java.nio.charset.CharsetEncoder charsetEncoder13 = null;
        java.nio.charset.CharsetEncoder charsetEncoder15 = null;
        java.nio.charset.CharsetEncoder charsetEncoder17 = null;
        java.nio.charset.CharsetEncoder charsetEncoder19 = null;
        java.nio.charset.CharsetEncoder charsetEncoder21 = null;
        java.nio.charset.CharsetEncoder charsetEncoder23 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode24 = org.jsoup.nodes.Entities.EscapeMode.extended;
        java.lang.String str25 = org.jsoup.nodes.Entities.escape("", charsetEncoder23, escapeMode24);
        java.lang.String str26 = org.jsoup.nodes.Entities.escape("", charsetEncoder21, escapeMode24);
        java.lang.String str27 = org.jsoup.nodes.Entities.escape("", charsetEncoder19, escapeMode24);
        java.lang.String str28 = org.jsoup.nodes.Entities.escape("", charsetEncoder17, escapeMode24);
        java.lang.String str29 = org.jsoup.nodes.Entities.escape("", charsetEncoder15, escapeMode24);
        java.lang.String str30 = org.jsoup.nodes.Entities.escape("", charsetEncoder13, escapeMode24);
        java.lang.String str31 = org.jsoup.nodes.Entities.escape("", charsetEncoder11, escapeMode24);
        java.lang.String str32 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode24);
        java.lang.String str33 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode24);
        java.lang.String str34 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode24);
        java.lang.String str35 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode24);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str36 = org.jsoup.nodes.Entities.escape("hi!", charsetEncoder1, escapeMode24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + escapeMode24 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.extended + "'", escapeMode24.equals(org.jsoup.nodes.Entities.EscapeMode.extended));
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        java.nio.charset.CharsetEncoder charsetEncoder11 = null;
        java.nio.charset.CharsetEncoder charsetEncoder13 = null;
        java.nio.charset.CharsetEncoder charsetEncoder15 = null;
        java.nio.charset.CharsetEncoder charsetEncoder17 = null;
        java.nio.charset.CharsetEncoder charsetEncoder19 = null;
        java.nio.charset.CharsetEncoder charsetEncoder21 = null;
        java.nio.charset.CharsetEncoder charsetEncoder23 = null;
        java.nio.charset.CharsetEncoder charsetEncoder25 = null;
        java.nio.charset.CharsetEncoder charsetEncoder27 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode28 = org.jsoup.nodes.Entities.EscapeMode.extended;
        java.lang.String str29 = org.jsoup.nodes.Entities.escape("", charsetEncoder27, escapeMode28);
        java.lang.String str30 = org.jsoup.nodes.Entities.escape("", charsetEncoder25, escapeMode28);
        java.lang.String str31 = org.jsoup.nodes.Entities.escape("", charsetEncoder23, escapeMode28);
        java.lang.String str32 = org.jsoup.nodes.Entities.escape("", charsetEncoder21, escapeMode28);
        java.lang.String str33 = org.jsoup.nodes.Entities.escape("", charsetEncoder19, escapeMode28);
        java.lang.String str34 = org.jsoup.nodes.Entities.escape("", charsetEncoder17, escapeMode28);
        java.lang.String str35 = org.jsoup.nodes.Entities.escape("", charsetEncoder15, escapeMode28);
        java.lang.String str36 = org.jsoup.nodes.Entities.escape("", charsetEncoder13, escapeMode28);
        java.lang.String str37 = org.jsoup.nodes.Entities.escape("", charsetEncoder11, escapeMode28);
        java.lang.String str38 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode28);
        java.lang.String str39 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode28);
        java.lang.String str40 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode28);
        java.lang.String str41 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode28);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str42 = org.jsoup.nodes.Entities.escape("hi!", charsetEncoder1, escapeMode28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + escapeMode28 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.extended + "'", escapeMode28.equals(org.jsoup.nodes.Entities.EscapeMode.extended));
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        java.nio.charset.CharsetEncoder charsetEncoder11 = null;
        java.nio.charset.CharsetEncoder charsetEncoder13 = null;
        java.nio.charset.CharsetEncoder charsetEncoder15 = null;
        java.nio.charset.CharsetEncoder charsetEncoder17 = null;
        java.nio.charset.CharsetEncoder charsetEncoder19 = null;
        java.nio.charset.CharsetEncoder charsetEncoder21 = null;
        java.nio.charset.CharsetEncoder charsetEncoder23 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode24 = org.jsoup.nodes.Entities.EscapeMode.extended;
        java.lang.String str25 = org.jsoup.nodes.Entities.escape("", charsetEncoder23, escapeMode24);
        java.lang.String str26 = org.jsoup.nodes.Entities.escape("", charsetEncoder21, escapeMode24);
        java.lang.String str27 = org.jsoup.nodes.Entities.escape("", charsetEncoder19, escapeMode24);
        java.lang.String str28 = org.jsoup.nodes.Entities.escape("", charsetEncoder17, escapeMode24);
        java.lang.String str29 = org.jsoup.nodes.Entities.escape("", charsetEncoder15, escapeMode24);
        java.lang.String str30 = org.jsoup.nodes.Entities.escape("", charsetEncoder13, escapeMode24);
        java.lang.String str31 = org.jsoup.nodes.Entities.escape("", charsetEncoder11, escapeMode24);
        java.lang.String str32 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode24);
        java.lang.String str33 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode24);
        java.lang.String str34 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode24);
        java.lang.String str35 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode24);
        java.lang.String str36 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode24);
        java.lang.Class<?> wildcardClass37 = escapeMode24.getClass();
        org.junit.Assert.assertTrue("'" + escapeMode24 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.extended + "'", escapeMode24.equals(org.jsoup.nodes.Entities.EscapeMode.extended));
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        java.nio.charset.CharsetEncoder charsetEncoder11 = null;
        java.nio.charset.CharsetEncoder charsetEncoder13 = null;
        java.nio.charset.CharsetEncoder charsetEncoder15 = null;
        java.nio.charset.CharsetEncoder charsetEncoder17 = null;
        java.nio.charset.CharsetEncoder charsetEncoder19 = null;
        java.nio.charset.CharsetEncoder charsetEncoder21 = null;
        java.nio.charset.CharsetEncoder charsetEncoder23 = null;
        java.nio.charset.CharsetEncoder charsetEncoder25 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode26 = org.jsoup.nodes.Entities.EscapeMode.extended;
        java.lang.String str27 = org.jsoup.nodes.Entities.escape("", charsetEncoder25, escapeMode26);
        java.lang.String str28 = org.jsoup.nodes.Entities.escape("", charsetEncoder23, escapeMode26);
        java.lang.String str29 = org.jsoup.nodes.Entities.escape("", charsetEncoder21, escapeMode26);
        java.lang.String str30 = org.jsoup.nodes.Entities.escape("", charsetEncoder19, escapeMode26);
        java.lang.String str31 = org.jsoup.nodes.Entities.escape("", charsetEncoder17, escapeMode26);
        java.lang.String str32 = org.jsoup.nodes.Entities.escape("", charsetEncoder15, escapeMode26);
        java.lang.String str33 = org.jsoup.nodes.Entities.escape("", charsetEncoder13, escapeMode26);
        java.lang.String str34 = org.jsoup.nodes.Entities.escape("", charsetEncoder11, escapeMode26);
        java.lang.String str35 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode26);
        java.lang.String str36 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode26);
        java.lang.String str37 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode26);
        java.lang.String str38 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode26);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str39 = org.jsoup.nodes.Entities.escape("hi!", charsetEncoder1, escapeMode26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + escapeMode26 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.extended + "'", escapeMode26.equals(org.jsoup.nodes.Entities.EscapeMode.extended));
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        java.nio.charset.CharsetEncoder charsetEncoder11 = null;
        java.nio.charset.CharsetEncoder charsetEncoder13 = null;
        java.nio.charset.CharsetEncoder charsetEncoder15 = null;
        java.nio.charset.CharsetEncoder charsetEncoder17 = null;
        java.nio.charset.CharsetEncoder charsetEncoder19 = null;
        java.nio.charset.CharsetEncoder charsetEncoder21 = null;
        java.nio.charset.CharsetEncoder charsetEncoder23 = null;
        java.nio.charset.CharsetEncoder charsetEncoder25 = null;
        java.nio.charset.CharsetEncoder charsetEncoder27 = null;
        java.nio.charset.CharsetEncoder charsetEncoder29 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode30 = org.jsoup.nodes.Entities.EscapeMode.base;
        java.lang.String str31 = org.jsoup.nodes.Entities.escape("", charsetEncoder29, escapeMode30);
        java.lang.String str32 = org.jsoup.nodes.Entities.escape("", charsetEncoder27, escapeMode30);
        java.lang.String str33 = org.jsoup.nodes.Entities.escape("", charsetEncoder25, escapeMode30);
        java.lang.String str34 = org.jsoup.nodes.Entities.escape("", charsetEncoder23, escapeMode30);
        java.lang.String str35 = org.jsoup.nodes.Entities.escape("", charsetEncoder21, escapeMode30);
        java.lang.String str36 = org.jsoup.nodes.Entities.escape("", charsetEncoder19, escapeMode30);
        java.lang.String str37 = org.jsoup.nodes.Entities.escape("", charsetEncoder17, escapeMode30);
        java.lang.String str38 = org.jsoup.nodes.Entities.escape("", charsetEncoder15, escapeMode30);
        java.lang.String str39 = org.jsoup.nodes.Entities.escape("", charsetEncoder13, escapeMode30);
        java.lang.String str40 = org.jsoup.nodes.Entities.escape("", charsetEncoder11, escapeMode30);
        java.lang.String str41 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode30);
        java.lang.String str42 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode30);
        java.lang.String str43 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode30);
        java.lang.String str44 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode30);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str45 = org.jsoup.nodes.Entities.escape("hi!", charsetEncoder1, escapeMode30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + escapeMode30 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode30.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        java.nio.charset.CharsetEncoder charsetEncoder11 = null;
        java.nio.charset.CharsetEncoder charsetEncoder13 = null;
        java.nio.charset.CharsetEncoder charsetEncoder15 = null;
        java.nio.charset.CharsetEncoder charsetEncoder17 = null;
        java.nio.charset.CharsetEncoder charsetEncoder19 = null;
        java.nio.charset.CharsetEncoder charsetEncoder21 = null;
        java.nio.charset.CharsetEncoder charsetEncoder23 = null;
        java.nio.charset.CharsetEncoder charsetEncoder25 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode26 = org.jsoup.nodes.Entities.EscapeMode.extended;
        java.lang.String str27 = org.jsoup.nodes.Entities.escape("", charsetEncoder25, escapeMode26);
        java.lang.String str28 = org.jsoup.nodes.Entities.escape("", charsetEncoder23, escapeMode26);
        java.lang.String str29 = org.jsoup.nodes.Entities.escape("", charsetEncoder21, escapeMode26);
        java.lang.String str30 = org.jsoup.nodes.Entities.escape("", charsetEncoder19, escapeMode26);
        java.lang.String str31 = org.jsoup.nodes.Entities.escape("", charsetEncoder17, escapeMode26);
        java.lang.String str32 = org.jsoup.nodes.Entities.escape("", charsetEncoder15, escapeMode26);
        java.lang.String str33 = org.jsoup.nodes.Entities.escape("", charsetEncoder13, escapeMode26);
        java.lang.String str34 = org.jsoup.nodes.Entities.escape("", charsetEncoder11, escapeMode26);
        java.lang.String str35 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode26);
        java.lang.String str36 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode26);
        java.lang.String str37 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode26);
        java.lang.String str38 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode26);
        java.lang.String str39 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode26);
        java.lang.Class<?> wildcardClass40 = escapeMode26.getClass();
        org.junit.Assert.assertTrue("'" + escapeMode26 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.extended + "'", escapeMode26.equals(org.jsoup.nodes.Entities.EscapeMode.extended));
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        java.nio.charset.CharsetEncoder charsetEncoder11 = null;
        java.nio.charset.CharsetEncoder charsetEncoder13 = null;
        java.nio.charset.CharsetEncoder charsetEncoder15 = null;
        java.nio.charset.CharsetEncoder charsetEncoder17 = null;
        java.nio.charset.CharsetEncoder charsetEncoder19 = null;
        java.nio.charset.CharsetEncoder charsetEncoder21 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode22 = org.jsoup.nodes.Entities.EscapeMode.base;
        java.lang.String str23 = org.jsoup.nodes.Entities.escape("", charsetEncoder21, escapeMode22);
        java.lang.String str24 = org.jsoup.nodes.Entities.escape("", charsetEncoder19, escapeMode22);
        java.lang.String str25 = org.jsoup.nodes.Entities.escape("", charsetEncoder17, escapeMode22);
        java.lang.String str26 = org.jsoup.nodes.Entities.escape("", charsetEncoder15, escapeMode22);
        java.lang.String str27 = org.jsoup.nodes.Entities.escape("", charsetEncoder13, escapeMode22);
        java.lang.String str28 = org.jsoup.nodes.Entities.escape("", charsetEncoder11, escapeMode22);
        java.lang.String str29 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode22);
        java.lang.String str30 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode22);
        java.lang.String str31 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode22);
        java.lang.String str32 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode22);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str33 = org.jsoup.nodes.Entities.escape("hi!", charsetEncoder1, escapeMode22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + escapeMode22 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode22.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        java.nio.charset.CharsetEncoder charsetEncoder11 = null;
        java.nio.charset.CharsetEncoder charsetEncoder13 = null;
        java.nio.charset.CharsetEncoder charsetEncoder15 = null;
        java.nio.charset.CharsetEncoder charsetEncoder17 = null;
        java.nio.charset.CharsetEncoder charsetEncoder19 = null;
        java.nio.charset.CharsetEncoder charsetEncoder21 = null;
        java.nio.charset.CharsetEncoder charsetEncoder23 = null;
        java.nio.charset.CharsetEncoder charsetEncoder25 = null;
        java.nio.charset.CharsetEncoder charsetEncoder27 = null;
        java.nio.charset.CharsetEncoder charsetEncoder29 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode30 = org.jsoup.nodes.Entities.EscapeMode.base;
        java.lang.String str31 = org.jsoup.nodes.Entities.escape("", charsetEncoder29, escapeMode30);
        java.lang.String str32 = org.jsoup.nodes.Entities.escape("", charsetEncoder27, escapeMode30);
        java.lang.String str33 = org.jsoup.nodes.Entities.escape("", charsetEncoder25, escapeMode30);
        java.lang.String str34 = org.jsoup.nodes.Entities.escape("", charsetEncoder23, escapeMode30);
        java.lang.String str35 = org.jsoup.nodes.Entities.escape("", charsetEncoder21, escapeMode30);
        java.lang.String str36 = org.jsoup.nodes.Entities.escape("", charsetEncoder19, escapeMode30);
        java.lang.String str37 = org.jsoup.nodes.Entities.escape("", charsetEncoder17, escapeMode30);
        java.lang.String str38 = org.jsoup.nodes.Entities.escape("", charsetEncoder15, escapeMode30);
        java.lang.String str39 = org.jsoup.nodes.Entities.escape("", charsetEncoder13, escapeMode30);
        java.lang.String str40 = org.jsoup.nodes.Entities.escape("", charsetEncoder11, escapeMode30);
        java.lang.String str41 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode30);
        java.lang.String str42 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode30);
        java.lang.String str43 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode30);
        java.lang.String str44 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode30);
        java.lang.String str45 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode30);
        java.lang.Class<?> wildcardClass46 = escapeMode30.getClass();
        org.junit.Assert.assertTrue("'" + escapeMode30 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode30.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        java.nio.charset.CharsetEncoder charsetEncoder11 = null;
        java.nio.charset.CharsetEncoder charsetEncoder13 = null;
        java.nio.charset.CharsetEncoder charsetEncoder15 = null;
        java.nio.charset.CharsetEncoder charsetEncoder17 = null;
        java.nio.charset.CharsetEncoder charsetEncoder19 = null;
        java.nio.charset.CharsetEncoder charsetEncoder21 = null;
        java.nio.charset.CharsetEncoder charsetEncoder23 = null;
        java.nio.charset.CharsetEncoder charsetEncoder25 = null;
        java.nio.charset.CharsetEncoder charsetEncoder27 = null;
        java.nio.charset.CharsetEncoder charsetEncoder29 = null;
        java.nio.charset.CharsetEncoder charsetEncoder31 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode32 = org.jsoup.nodes.Entities.EscapeMode.base;
        java.lang.String str33 = org.jsoup.nodes.Entities.escape("", charsetEncoder31, escapeMode32);
        java.lang.String str34 = org.jsoup.nodes.Entities.escape("", charsetEncoder29, escapeMode32);
        java.lang.String str35 = org.jsoup.nodes.Entities.escape("", charsetEncoder27, escapeMode32);
        java.lang.String str36 = org.jsoup.nodes.Entities.escape("", charsetEncoder25, escapeMode32);
        java.lang.String str37 = org.jsoup.nodes.Entities.escape("", charsetEncoder23, escapeMode32);
        java.lang.String str38 = org.jsoup.nodes.Entities.escape("", charsetEncoder21, escapeMode32);
        java.lang.String str39 = org.jsoup.nodes.Entities.escape("", charsetEncoder19, escapeMode32);
        java.lang.String str40 = org.jsoup.nodes.Entities.escape("", charsetEncoder17, escapeMode32);
        java.lang.String str41 = org.jsoup.nodes.Entities.escape("", charsetEncoder15, escapeMode32);
        java.lang.String str42 = org.jsoup.nodes.Entities.escape("", charsetEncoder13, escapeMode32);
        java.lang.String str43 = org.jsoup.nodes.Entities.escape("", charsetEncoder11, escapeMode32);
        java.lang.String str44 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode32);
        java.lang.String str45 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode32);
        java.lang.String str46 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode32);
        java.lang.String str47 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode32);
        java.lang.String str48 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode32);
        java.lang.Class<?> wildcardClass49 = escapeMode32.getClass();
        org.junit.Assert.assertTrue("'" + escapeMode32 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode32.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        java.nio.charset.CharsetEncoder charsetEncoder11 = null;
        java.nio.charset.CharsetEncoder charsetEncoder13 = null;
        java.nio.charset.CharsetEncoder charsetEncoder15 = null;
        java.nio.charset.CharsetEncoder charsetEncoder17 = null;
        java.nio.charset.CharsetEncoder charsetEncoder19 = null;
        java.nio.charset.CharsetEncoder charsetEncoder21 = null;
        java.nio.charset.CharsetEncoder charsetEncoder23 = null;
        java.nio.charset.CharsetEncoder charsetEncoder25 = null;
        java.nio.charset.CharsetEncoder charsetEncoder27 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode28 = org.jsoup.nodes.Entities.EscapeMode.extended;
        java.lang.String str29 = org.jsoup.nodes.Entities.escape("", charsetEncoder27, escapeMode28);
        java.lang.String str30 = org.jsoup.nodes.Entities.escape("", charsetEncoder25, escapeMode28);
        java.lang.String str31 = org.jsoup.nodes.Entities.escape("", charsetEncoder23, escapeMode28);
        java.lang.String str32 = org.jsoup.nodes.Entities.escape("", charsetEncoder21, escapeMode28);
        java.lang.String str33 = org.jsoup.nodes.Entities.escape("", charsetEncoder19, escapeMode28);
        java.lang.String str34 = org.jsoup.nodes.Entities.escape("", charsetEncoder17, escapeMode28);
        java.lang.String str35 = org.jsoup.nodes.Entities.escape("", charsetEncoder15, escapeMode28);
        java.lang.String str36 = org.jsoup.nodes.Entities.escape("", charsetEncoder13, escapeMode28);
        java.lang.String str37 = org.jsoup.nodes.Entities.escape("", charsetEncoder11, escapeMode28);
        java.lang.String str38 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode28);
        java.lang.String str39 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode28);
        java.lang.String str40 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode28);
        java.lang.String str41 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode28);
        java.lang.String str42 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode28);
        java.lang.Class<?> wildcardClass43 = escapeMode28.getClass();
        org.junit.Assert.assertTrue("'" + escapeMode28 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.extended + "'", escapeMode28.equals(org.jsoup.nodes.Entities.EscapeMode.extended));
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        java.nio.charset.CharsetEncoder charsetEncoder11 = null;
        java.nio.charset.CharsetEncoder charsetEncoder13 = null;
        java.nio.charset.CharsetEncoder charsetEncoder15 = null;
        java.nio.charset.CharsetEncoder charsetEncoder17 = null;
        java.nio.charset.CharsetEncoder charsetEncoder19 = null;
        java.nio.charset.CharsetEncoder charsetEncoder21 = null;
        java.nio.charset.CharsetEncoder charsetEncoder23 = null;
        java.nio.charset.CharsetEncoder charsetEncoder25 = null;
        java.nio.charset.CharsetEncoder charsetEncoder27 = null;
        java.nio.charset.CharsetEncoder charsetEncoder29 = null;
        java.nio.charset.CharsetEncoder charsetEncoder31 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode32 = org.jsoup.nodes.Entities.EscapeMode.base;
        java.lang.String str33 = org.jsoup.nodes.Entities.escape("", charsetEncoder31, escapeMode32);
        java.lang.String str34 = org.jsoup.nodes.Entities.escape("", charsetEncoder29, escapeMode32);
        java.lang.String str35 = org.jsoup.nodes.Entities.escape("", charsetEncoder27, escapeMode32);
        java.lang.String str36 = org.jsoup.nodes.Entities.escape("", charsetEncoder25, escapeMode32);
        java.lang.String str37 = org.jsoup.nodes.Entities.escape("", charsetEncoder23, escapeMode32);
        java.lang.String str38 = org.jsoup.nodes.Entities.escape("", charsetEncoder21, escapeMode32);
        java.lang.String str39 = org.jsoup.nodes.Entities.escape("", charsetEncoder19, escapeMode32);
        java.lang.String str40 = org.jsoup.nodes.Entities.escape("", charsetEncoder17, escapeMode32);
        java.lang.String str41 = org.jsoup.nodes.Entities.escape("", charsetEncoder15, escapeMode32);
        java.lang.String str42 = org.jsoup.nodes.Entities.escape("", charsetEncoder13, escapeMode32);
        java.lang.String str43 = org.jsoup.nodes.Entities.escape("", charsetEncoder11, escapeMode32);
        java.lang.String str44 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode32);
        java.lang.String str45 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode32);
        java.lang.String str46 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode32);
        java.lang.String str47 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode32);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str48 = org.jsoup.nodes.Entities.escape("hi!", charsetEncoder1, escapeMode32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + escapeMode32 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode32.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        java.nio.charset.CharsetEncoder charsetEncoder11 = null;
        java.nio.charset.CharsetEncoder charsetEncoder13 = null;
        java.nio.charset.CharsetEncoder charsetEncoder15 = null;
        java.nio.charset.CharsetEncoder charsetEncoder17 = null;
        java.nio.charset.CharsetEncoder charsetEncoder19 = null;
        java.nio.charset.CharsetEncoder charsetEncoder21 = null;
        java.nio.charset.CharsetEncoder charsetEncoder23 = null;
        java.nio.charset.CharsetEncoder charsetEncoder25 = null;
        java.nio.charset.CharsetEncoder charsetEncoder27 = null;
        java.nio.charset.CharsetEncoder charsetEncoder29 = null;
        java.nio.charset.CharsetEncoder charsetEncoder31 = null;
        java.nio.charset.CharsetEncoder charsetEncoder33 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode34 = org.jsoup.nodes.Entities.EscapeMode.extended;
        java.lang.String str35 = org.jsoup.nodes.Entities.escape("", charsetEncoder33, escapeMode34);
        java.lang.String str36 = org.jsoup.nodes.Entities.escape("", charsetEncoder31, escapeMode34);
        java.lang.String str37 = org.jsoup.nodes.Entities.escape("", charsetEncoder29, escapeMode34);
        java.lang.String str38 = org.jsoup.nodes.Entities.escape("", charsetEncoder27, escapeMode34);
        java.lang.String str39 = org.jsoup.nodes.Entities.escape("", charsetEncoder25, escapeMode34);
        java.lang.String str40 = org.jsoup.nodes.Entities.escape("", charsetEncoder23, escapeMode34);
        java.lang.String str41 = org.jsoup.nodes.Entities.escape("", charsetEncoder21, escapeMode34);
        java.lang.String str42 = org.jsoup.nodes.Entities.escape("", charsetEncoder19, escapeMode34);
        java.lang.String str43 = org.jsoup.nodes.Entities.escape("", charsetEncoder17, escapeMode34);
        java.lang.String str44 = org.jsoup.nodes.Entities.escape("", charsetEncoder15, escapeMode34);
        java.lang.String str45 = org.jsoup.nodes.Entities.escape("", charsetEncoder13, escapeMode34);
        java.lang.String str46 = org.jsoup.nodes.Entities.escape("", charsetEncoder11, escapeMode34);
        java.lang.String str47 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode34);
        java.lang.String str48 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode34);
        java.lang.String str49 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode34);
        java.lang.String str50 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode34);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str51 = org.jsoup.nodes.Entities.escape("hi!", charsetEncoder1, escapeMode34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + escapeMode34 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.extended + "'", escapeMode34.equals(org.jsoup.nodes.Entities.EscapeMode.extended));
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        java.nio.charset.CharsetEncoder charsetEncoder11 = null;
        java.nio.charset.CharsetEncoder charsetEncoder13 = null;
        java.nio.charset.CharsetEncoder charsetEncoder15 = null;
        java.nio.charset.CharsetEncoder charsetEncoder17 = null;
        java.nio.charset.CharsetEncoder charsetEncoder19 = null;
        java.nio.charset.CharsetEncoder charsetEncoder21 = null;
        java.nio.charset.CharsetEncoder charsetEncoder23 = null;
        java.nio.charset.CharsetEncoder charsetEncoder25 = null;
        java.nio.charset.CharsetEncoder charsetEncoder27 = null;
        java.nio.charset.CharsetEncoder charsetEncoder29 = null;
        java.nio.charset.CharsetEncoder charsetEncoder31 = null;
        java.nio.charset.CharsetEncoder charsetEncoder33 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode34 = org.jsoup.nodes.Entities.EscapeMode.base;
        java.lang.String str35 = org.jsoup.nodes.Entities.escape("", charsetEncoder33, escapeMode34);
        java.lang.String str36 = org.jsoup.nodes.Entities.escape("", charsetEncoder31, escapeMode34);
        java.lang.String str37 = org.jsoup.nodes.Entities.escape("", charsetEncoder29, escapeMode34);
        java.lang.String str38 = org.jsoup.nodes.Entities.escape("", charsetEncoder27, escapeMode34);
        java.lang.String str39 = org.jsoup.nodes.Entities.escape("", charsetEncoder25, escapeMode34);
        java.lang.String str40 = org.jsoup.nodes.Entities.escape("", charsetEncoder23, escapeMode34);
        java.lang.String str41 = org.jsoup.nodes.Entities.escape("", charsetEncoder21, escapeMode34);
        java.lang.String str42 = org.jsoup.nodes.Entities.escape("", charsetEncoder19, escapeMode34);
        java.lang.String str43 = org.jsoup.nodes.Entities.escape("", charsetEncoder17, escapeMode34);
        java.lang.String str44 = org.jsoup.nodes.Entities.escape("", charsetEncoder15, escapeMode34);
        java.lang.String str45 = org.jsoup.nodes.Entities.escape("", charsetEncoder13, escapeMode34);
        java.lang.String str46 = org.jsoup.nodes.Entities.escape("", charsetEncoder11, escapeMode34);
        java.lang.String str47 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode34);
        java.lang.String str48 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode34);
        java.lang.String str49 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode34);
        java.lang.String str50 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode34);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str51 = org.jsoup.nodes.Entities.escape("hi!", charsetEncoder1, escapeMode34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + escapeMode34 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode34.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        java.nio.charset.CharsetEncoder charsetEncoder11 = null;
        java.nio.charset.CharsetEncoder charsetEncoder13 = null;
        java.nio.charset.CharsetEncoder charsetEncoder15 = null;
        java.nio.charset.CharsetEncoder charsetEncoder17 = null;
        java.nio.charset.CharsetEncoder charsetEncoder19 = null;
        java.nio.charset.CharsetEncoder charsetEncoder21 = null;
        java.nio.charset.CharsetEncoder charsetEncoder23 = null;
        java.nio.charset.CharsetEncoder charsetEncoder25 = null;
        java.nio.charset.CharsetEncoder charsetEncoder27 = null;
        java.nio.charset.CharsetEncoder charsetEncoder29 = null;
        java.nio.charset.CharsetEncoder charsetEncoder31 = null;
        java.nio.charset.CharsetEncoder charsetEncoder33 = null;
        java.nio.charset.CharsetEncoder charsetEncoder35 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode36 = org.jsoup.nodes.Entities.EscapeMode.base;
        java.lang.String str37 = org.jsoup.nodes.Entities.escape("", charsetEncoder35, escapeMode36);
        java.lang.String str38 = org.jsoup.nodes.Entities.escape("", charsetEncoder33, escapeMode36);
        java.lang.String str39 = org.jsoup.nodes.Entities.escape("", charsetEncoder31, escapeMode36);
        java.lang.String str40 = org.jsoup.nodes.Entities.escape("", charsetEncoder29, escapeMode36);
        java.lang.String str41 = org.jsoup.nodes.Entities.escape("", charsetEncoder27, escapeMode36);
        java.lang.String str42 = org.jsoup.nodes.Entities.escape("", charsetEncoder25, escapeMode36);
        java.lang.String str43 = org.jsoup.nodes.Entities.escape("", charsetEncoder23, escapeMode36);
        java.lang.String str44 = org.jsoup.nodes.Entities.escape("", charsetEncoder21, escapeMode36);
        java.lang.String str45 = org.jsoup.nodes.Entities.escape("", charsetEncoder19, escapeMode36);
        java.lang.String str46 = org.jsoup.nodes.Entities.escape("", charsetEncoder17, escapeMode36);
        java.lang.String str47 = org.jsoup.nodes.Entities.escape("", charsetEncoder15, escapeMode36);
        java.lang.String str48 = org.jsoup.nodes.Entities.escape("", charsetEncoder13, escapeMode36);
        java.lang.String str49 = org.jsoup.nodes.Entities.escape("", charsetEncoder11, escapeMode36);
        java.lang.String str50 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode36);
        java.lang.String str51 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode36);
        java.lang.String str52 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode36);
        java.lang.String str53 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode36);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str54 = org.jsoup.nodes.Entities.escape("hi!", charsetEncoder1, escapeMode36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + escapeMode36 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode36.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        java.nio.charset.CharsetEncoder charsetEncoder11 = null;
        java.nio.charset.CharsetEncoder charsetEncoder13 = null;
        java.nio.charset.CharsetEncoder charsetEncoder15 = null;
        java.nio.charset.CharsetEncoder charsetEncoder17 = null;
        java.nio.charset.CharsetEncoder charsetEncoder19 = null;
        java.nio.charset.CharsetEncoder charsetEncoder21 = null;
        java.nio.charset.CharsetEncoder charsetEncoder23 = null;
        java.nio.charset.CharsetEncoder charsetEncoder25 = null;
        java.nio.charset.CharsetEncoder charsetEncoder27 = null;
        java.nio.charset.CharsetEncoder charsetEncoder29 = null;
        java.nio.charset.CharsetEncoder charsetEncoder31 = null;
        java.nio.charset.CharsetEncoder charsetEncoder33 = null;
        java.nio.charset.CharsetEncoder charsetEncoder35 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode36 = org.jsoup.nodes.Entities.EscapeMode.base;
        java.lang.String str37 = org.jsoup.nodes.Entities.escape("", charsetEncoder35, escapeMode36);
        java.lang.String str38 = org.jsoup.nodes.Entities.escape("", charsetEncoder33, escapeMode36);
        java.lang.String str39 = org.jsoup.nodes.Entities.escape("", charsetEncoder31, escapeMode36);
        java.lang.String str40 = org.jsoup.nodes.Entities.escape("", charsetEncoder29, escapeMode36);
        java.lang.String str41 = org.jsoup.nodes.Entities.escape("", charsetEncoder27, escapeMode36);
        java.lang.String str42 = org.jsoup.nodes.Entities.escape("", charsetEncoder25, escapeMode36);
        java.lang.String str43 = org.jsoup.nodes.Entities.escape("", charsetEncoder23, escapeMode36);
        java.lang.String str44 = org.jsoup.nodes.Entities.escape("", charsetEncoder21, escapeMode36);
        java.lang.String str45 = org.jsoup.nodes.Entities.escape("", charsetEncoder19, escapeMode36);
        java.lang.String str46 = org.jsoup.nodes.Entities.escape("", charsetEncoder17, escapeMode36);
        java.lang.String str47 = org.jsoup.nodes.Entities.escape("", charsetEncoder15, escapeMode36);
        java.lang.String str48 = org.jsoup.nodes.Entities.escape("", charsetEncoder13, escapeMode36);
        java.lang.String str49 = org.jsoup.nodes.Entities.escape("", charsetEncoder11, escapeMode36);
        java.lang.String str50 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode36);
        java.lang.String str51 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode36);
        java.lang.String str52 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode36);
        java.lang.String str53 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode36);
        java.lang.String str54 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode36);
        java.lang.Class<?> wildcardClass55 = escapeMode36.getClass();
        org.junit.Assert.assertTrue("'" + escapeMode36 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode36.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertNotNull(wildcardClass55);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        java.nio.charset.CharsetEncoder charsetEncoder11 = null;
        java.nio.charset.CharsetEncoder charsetEncoder13 = null;
        java.nio.charset.CharsetEncoder charsetEncoder15 = null;
        java.nio.charset.CharsetEncoder charsetEncoder17 = null;
        java.nio.charset.CharsetEncoder charsetEncoder19 = null;
        java.nio.charset.CharsetEncoder charsetEncoder21 = null;
        java.nio.charset.CharsetEncoder charsetEncoder23 = null;
        java.nio.charset.CharsetEncoder charsetEncoder25 = null;
        java.nio.charset.CharsetEncoder charsetEncoder27 = null;
        java.nio.charset.CharsetEncoder charsetEncoder29 = null;
        java.nio.charset.CharsetEncoder charsetEncoder31 = null;
        java.nio.charset.CharsetEncoder charsetEncoder33 = null;
        java.nio.charset.CharsetEncoder charsetEncoder35 = null;
        java.nio.charset.CharsetEncoder charsetEncoder37 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode38 = org.jsoup.nodes.Entities.EscapeMode.base;
        java.lang.String str39 = org.jsoup.nodes.Entities.escape("", charsetEncoder37, escapeMode38);
        java.lang.String str40 = org.jsoup.nodes.Entities.escape("", charsetEncoder35, escapeMode38);
        java.lang.String str41 = org.jsoup.nodes.Entities.escape("", charsetEncoder33, escapeMode38);
        java.lang.String str42 = org.jsoup.nodes.Entities.escape("", charsetEncoder31, escapeMode38);
        java.lang.String str43 = org.jsoup.nodes.Entities.escape("", charsetEncoder29, escapeMode38);
        java.lang.String str44 = org.jsoup.nodes.Entities.escape("", charsetEncoder27, escapeMode38);
        java.lang.String str45 = org.jsoup.nodes.Entities.escape("", charsetEncoder25, escapeMode38);
        java.lang.String str46 = org.jsoup.nodes.Entities.escape("", charsetEncoder23, escapeMode38);
        java.lang.String str47 = org.jsoup.nodes.Entities.escape("", charsetEncoder21, escapeMode38);
        java.lang.String str48 = org.jsoup.nodes.Entities.escape("", charsetEncoder19, escapeMode38);
        java.lang.String str49 = org.jsoup.nodes.Entities.escape("", charsetEncoder17, escapeMode38);
        java.lang.String str50 = org.jsoup.nodes.Entities.escape("", charsetEncoder15, escapeMode38);
        java.lang.String str51 = org.jsoup.nodes.Entities.escape("", charsetEncoder13, escapeMode38);
        java.lang.String str52 = org.jsoup.nodes.Entities.escape("", charsetEncoder11, escapeMode38);
        java.lang.String str53 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode38);
        java.lang.String str54 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode38);
        java.lang.String str55 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode38);
        java.lang.String str56 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode38);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str57 = org.jsoup.nodes.Entities.escape("hi!", charsetEncoder1, escapeMode38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + escapeMode38 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode38.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        java.nio.charset.CharsetEncoder charsetEncoder11 = null;
        java.nio.charset.CharsetEncoder charsetEncoder13 = null;
        java.nio.charset.CharsetEncoder charsetEncoder15 = null;
        java.nio.charset.CharsetEncoder charsetEncoder17 = null;
        java.nio.charset.CharsetEncoder charsetEncoder19 = null;
        java.nio.charset.CharsetEncoder charsetEncoder21 = null;
        java.nio.charset.CharsetEncoder charsetEncoder23 = null;
        java.nio.charset.CharsetEncoder charsetEncoder25 = null;
        java.nio.charset.CharsetEncoder charsetEncoder27 = null;
        java.nio.charset.CharsetEncoder charsetEncoder29 = null;
        java.nio.charset.CharsetEncoder charsetEncoder31 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode32 = org.jsoup.nodes.Entities.EscapeMode.extended;
        java.lang.String str33 = org.jsoup.nodes.Entities.escape("", charsetEncoder31, escapeMode32);
        java.lang.String str34 = org.jsoup.nodes.Entities.escape("", charsetEncoder29, escapeMode32);
        java.lang.String str35 = org.jsoup.nodes.Entities.escape("", charsetEncoder27, escapeMode32);
        java.lang.String str36 = org.jsoup.nodes.Entities.escape("", charsetEncoder25, escapeMode32);
        java.lang.String str37 = org.jsoup.nodes.Entities.escape("", charsetEncoder23, escapeMode32);
        java.lang.String str38 = org.jsoup.nodes.Entities.escape("", charsetEncoder21, escapeMode32);
        java.lang.String str39 = org.jsoup.nodes.Entities.escape("", charsetEncoder19, escapeMode32);
        java.lang.String str40 = org.jsoup.nodes.Entities.escape("", charsetEncoder17, escapeMode32);
        java.lang.String str41 = org.jsoup.nodes.Entities.escape("", charsetEncoder15, escapeMode32);
        java.lang.String str42 = org.jsoup.nodes.Entities.escape("", charsetEncoder13, escapeMode32);
        java.lang.String str43 = org.jsoup.nodes.Entities.escape("", charsetEncoder11, escapeMode32);
        java.lang.String str44 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode32);
        java.lang.String str45 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode32);
        java.lang.String str46 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode32);
        java.lang.String str47 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode32);
        java.lang.String str48 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode32);
        java.lang.Class<?> wildcardClass49 = escapeMode32.getClass();
        org.junit.Assert.assertTrue("'" + escapeMode32 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.extended + "'", escapeMode32.equals(org.jsoup.nodes.Entities.EscapeMode.extended));
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        java.nio.charset.CharsetEncoder charsetEncoder11 = null;
        java.nio.charset.CharsetEncoder charsetEncoder13 = null;
        java.nio.charset.CharsetEncoder charsetEncoder15 = null;
        java.nio.charset.CharsetEncoder charsetEncoder17 = null;
        java.nio.charset.CharsetEncoder charsetEncoder19 = null;
        java.nio.charset.CharsetEncoder charsetEncoder21 = null;
        java.nio.charset.CharsetEncoder charsetEncoder23 = null;
        java.nio.charset.CharsetEncoder charsetEncoder25 = null;
        java.nio.charset.CharsetEncoder charsetEncoder27 = null;
        java.nio.charset.CharsetEncoder charsetEncoder29 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode30 = org.jsoup.nodes.Entities.EscapeMode.extended;
        java.lang.String str31 = org.jsoup.nodes.Entities.escape("", charsetEncoder29, escapeMode30);
        java.lang.String str32 = org.jsoup.nodes.Entities.escape("", charsetEncoder27, escapeMode30);
        java.lang.String str33 = org.jsoup.nodes.Entities.escape("", charsetEncoder25, escapeMode30);
        java.lang.String str34 = org.jsoup.nodes.Entities.escape("", charsetEncoder23, escapeMode30);
        java.lang.String str35 = org.jsoup.nodes.Entities.escape("", charsetEncoder21, escapeMode30);
        java.lang.String str36 = org.jsoup.nodes.Entities.escape("", charsetEncoder19, escapeMode30);
        java.lang.String str37 = org.jsoup.nodes.Entities.escape("", charsetEncoder17, escapeMode30);
        java.lang.String str38 = org.jsoup.nodes.Entities.escape("", charsetEncoder15, escapeMode30);
        java.lang.String str39 = org.jsoup.nodes.Entities.escape("", charsetEncoder13, escapeMode30);
        java.lang.String str40 = org.jsoup.nodes.Entities.escape("", charsetEncoder11, escapeMode30);
        java.lang.String str41 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode30);
        java.lang.String str42 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode30);
        java.lang.String str43 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode30);
        java.lang.String str44 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode30);
        java.lang.String str45 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode30);
        java.lang.Class<?> wildcardClass46 = escapeMode30.getClass();
        org.junit.Assert.assertTrue("'" + escapeMode30 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.extended + "'", escapeMode30.equals(org.jsoup.nodes.Entities.EscapeMode.extended));
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        java.nio.charset.CharsetEncoder charsetEncoder11 = null;
        java.nio.charset.CharsetEncoder charsetEncoder13 = null;
        java.nio.charset.CharsetEncoder charsetEncoder15 = null;
        java.nio.charset.CharsetEncoder charsetEncoder17 = null;
        java.nio.charset.CharsetEncoder charsetEncoder19 = null;
        java.nio.charset.CharsetEncoder charsetEncoder21 = null;
        java.nio.charset.CharsetEncoder charsetEncoder23 = null;
        java.nio.charset.CharsetEncoder charsetEncoder25 = null;
        java.nio.charset.CharsetEncoder charsetEncoder27 = null;
        java.nio.charset.CharsetEncoder charsetEncoder29 = null;
        java.nio.charset.CharsetEncoder charsetEncoder31 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode32 = org.jsoup.nodes.Entities.EscapeMode.extended;
        java.lang.String str33 = org.jsoup.nodes.Entities.escape("", charsetEncoder31, escapeMode32);
        java.lang.String str34 = org.jsoup.nodes.Entities.escape("", charsetEncoder29, escapeMode32);
        java.lang.String str35 = org.jsoup.nodes.Entities.escape("", charsetEncoder27, escapeMode32);
        java.lang.String str36 = org.jsoup.nodes.Entities.escape("", charsetEncoder25, escapeMode32);
        java.lang.String str37 = org.jsoup.nodes.Entities.escape("", charsetEncoder23, escapeMode32);
        java.lang.String str38 = org.jsoup.nodes.Entities.escape("", charsetEncoder21, escapeMode32);
        java.lang.String str39 = org.jsoup.nodes.Entities.escape("", charsetEncoder19, escapeMode32);
        java.lang.String str40 = org.jsoup.nodes.Entities.escape("", charsetEncoder17, escapeMode32);
        java.lang.String str41 = org.jsoup.nodes.Entities.escape("", charsetEncoder15, escapeMode32);
        java.lang.String str42 = org.jsoup.nodes.Entities.escape("", charsetEncoder13, escapeMode32);
        java.lang.String str43 = org.jsoup.nodes.Entities.escape("", charsetEncoder11, escapeMode32);
        java.lang.String str44 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode32);
        java.lang.String str45 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode32);
        java.lang.String str46 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode32);
        java.lang.String str47 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode32);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str48 = org.jsoup.nodes.Entities.escape("hi!", charsetEncoder1, escapeMode32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + escapeMode32 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.extended + "'", escapeMode32.equals(org.jsoup.nodes.Entities.EscapeMode.extended));
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        java.nio.charset.CharsetEncoder charsetEncoder11 = null;
        java.nio.charset.CharsetEncoder charsetEncoder13 = null;
        java.nio.charset.CharsetEncoder charsetEncoder15 = null;
        java.nio.charset.CharsetEncoder charsetEncoder17 = null;
        java.nio.charset.CharsetEncoder charsetEncoder19 = null;
        java.nio.charset.CharsetEncoder charsetEncoder21 = null;
        java.nio.charset.CharsetEncoder charsetEncoder23 = null;
        java.nio.charset.CharsetEncoder charsetEncoder25 = null;
        java.nio.charset.CharsetEncoder charsetEncoder27 = null;
        java.nio.charset.CharsetEncoder charsetEncoder29 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode30 = org.jsoup.nodes.Entities.EscapeMode.extended;
        java.lang.String str31 = org.jsoup.nodes.Entities.escape("", charsetEncoder29, escapeMode30);
        java.lang.String str32 = org.jsoup.nodes.Entities.escape("", charsetEncoder27, escapeMode30);
        java.lang.String str33 = org.jsoup.nodes.Entities.escape("", charsetEncoder25, escapeMode30);
        java.lang.String str34 = org.jsoup.nodes.Entities.escape("", charsetEncoder23, escapeMode30);
        java.lang.String str35 = org.jsoup.nodes.Entities.escape("", charsetEncoder21, escapeMode30);
        java.lang.String str36 = org.jsoup.nodes.Entities.escape("", charsetEncoder19, escapeMode30);
        java.lang.String str37 = org.jsoup.nodes.Entities.escape("", charsetEncoder17, escapeMode30);
        java.lang.String str38 = org.jsoup.nodes.Entities.escape("", charsetEncoder15, escapeMode30);
        java.lang.String str39 = org.jsoup.nodes.Entities.escape("", charsetEncoder13, escapeMode30);
        java.lang.String str40 = org.jsoup.nodes.Entities.escape("", charsetEncoder11, escapeMode30);
        java.lang.String str41 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode30);
        java.lang.String str42 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode30);
        java.lang.String str43 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode30);
        java.lang.String str44 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode30);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str45 = org.jsoup.nodes.Entities.escape("hi!", charsetEncoder1, escapeMode30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + escapeMode30 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.extended + "'", escapeMode30.equals(org.jsoup.nodes.Entities.EscapeMode.extended));
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        java.nio.charset.CharsetEncoder charsetEncoder11 = null;
        java.nio.charset.CharsetEncoder charsetEncoder13 = null;
        java.nio.charset.CharsetEncoder charsetEncoder15 = null;
        java.nio.charset.CharsetEncoder charsetEncoder17 = null;
        java.nio.charset.CharsetEncoder charsetEncoder19 = null;
        java.nio.charset.CharsetEncoder charsetEncoder21 = null;
        java.nio.charset.CharsetEncoder charsetEncoder23 = null;
        java.nio.charset.CharsetEncoder charsetEncoder25 = null;
        java.nio.charset.CharsetEncoder charsetEncoder27 = null;
        java.nio.charset.CharsetEncoder charsetEncoder29 = null;
        java.nio.charset.CharsetEncoder charsetEncoder31 = null;
        java.nio.charset.CharsetEncoder charsetEncoder33 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode34 = org.jsoup.nodes.Entities.EscapeMode.base;
        java.lang.String str35 = org.jsoup.nodes.Entities.escape("", charsetEncoder33, escapeMode34);
        java.lang.String str36 = org.jsoup.nodes.Entities.escape("", charsetEncoder31, escapeMode34);
        java.lang.String str37 = org.jsoup.nodes.Entities.escape("", charsetEncoder29, escapeMode34);
        java.lang.String str38 = org.jsoup.nodes.Entities.escape("", charsetEncoder27, escapeMode34);
        java.lang.String str39 = org.jsoup.nodes.Entities.escape("", charsetEncoder25, escapeMode34);
        java.lang.String str40 = org.jsoup.nodes.Entities.escape("", charsetEncoder23, escapeMode34);
        java.lang.String str41 = org.jsoup.nodes.Entities.escape("", charsetEncoder21, escapeMode34);
        java.lang.String str42 = org.jsoup.nodes.Entities.escape("", charsetEncoder19, escapeMode34);
        java.lang.String str43 = org.jsoup.nodes.Entities.escape("", charsetEncoder17, escapeMode34);
        java.lang.String str44 = org.jsoup.nodes.Entities.escape("", charsetEncoder15, escapeMode34);
        java.lang.String str45 = org.jsoup.nodes.Entities.escape("", charsetEncoder13, escapeMode34);
        java.lang.String str46 = org.jsoup.nodes.Entities.escape("", charsetEncoder11, escapeMode34);
        java.lang.String str47 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode34);
        java.lang.String str48 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode34);
        java.lang.String str49 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode34);
        java.lang.String str50 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode34);
        java.lang.String str51 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode34);
        java.lang.Class<?> wildcardClass52 = escapeMode34.getClass();
        org.junit.Assert.assertTrue("'" + escapeMode34 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode34.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertNotNull(wildcardClass52);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        java.nio.charset.CharsetEncoder charsetEncoder11 = null;
        java.nio.charset.CharsetEncoder charsetEncoder13 = null;
        java.nio.charset.CharsetEncoder charsetEncoder15 = null;
        java.nio.charset.CharsetEncoder charsetEncoder17 = null;
        java.nio.charset.CharsetEncoder charsetEncoder19 = null;
        java.nio.charset.CharsetEncoder charsetEncoder21 = null;
        java.nio.charset.CharsetEncoder charsetEncoder23 = null;
        java.nio.charset.CharsetEncoder charsetEncoder25 = null;
        java.nio.charset.CharsetEncoder charsetEncoder27 = null;
        java.nio.charset.CharsetEncoder charsetEncoder29 = null;
        java.nio.charset.CharsetEncoder charsetEncoder31 = null;
        java.nio.charset.CharsetEncoder charsetEncoder33 = null;
        java.nio.charset.CharsetEncoder charsetEncoder35 = null;
        java.nio.charset.CharsetEncoder charsetEncoder37 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode38 = org.jsoup.nodes.Entities.EscapeMode.base;
        java.lang.String str39 = org.jsoup.nodes.Entities.escape("", charsetEncoder37, escapeMode38);
        java.lang.String str40 = org.jsoup.nodes.Entities.escape("", charsetEncoder35, escapeMode38);
        java.lang.String str41 = org.jsoup.nodes.Entities.escape("", charsetEncoder33, escapeMode38);
        java.lang.String str42 = org.jsoup.nodes.Entities.escape("", charsetEncoder31, escapeMode38);
        java.lang.String str43 = org.jsoup.nodes.Entities.escape("", charsetEncoder29, escapeMode38);
        java.lang.String str44 = org.jsoup.nodes.Entities.escape("", charsetEncoder27, escapeMode38);
        java.lang.String str45 = org.jsoup.nodes.Entities.escape("", charsetEncoder25, escapeMode38);
        java.lang.String str46 = org.jsoup.nodes.Entities.escape("", charsetEncoder23, escapeMode38);
        java.lang.String str47 = org.jsoup.nodes.Entities.escape("", charsetEncoder21, escapeMode38);
        java.lang.String str48 = org.jsoup.nodes.Entities.escape("", charsetEncoder19, escapeMode38);
        java.lang.String str49 = org.jsoup.nodes.Entities.escape("", charsetEncoder17, escapeMode38);
        java.lang.String str50 = org.jsoup.nodes.Entities.escape("", charsetEncoder15, escapeMode38);
        java.lang.String str51 = org.jsoup.nodes.Entities.escape("", charsetEncoder13, escapeMode38);
        java.lang.String str52 = org.jsoup.nodes.Entities.escape("", charsetEncoder11, escapeMode38);
        java.lang.String str53 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode38);
        java.lang.String str54 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode38);
        java.lang.String str55 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode38);
        java.lang.String str56 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode38);
        java.lang.String str57 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode38);
        java.lang.Class<?> wildcardClass58 = escapeMode38.getClass();
        org.junit.Assert.assertTrue("'" + escapeMode38 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode38.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertNotNull(wildcardClass58);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        java.nio.charset.CharsetEncoder charsetEncoder11 = null;
        java.nio.charset.CharsetEncoder charsetEncoder13 = null;
        java.nio.charset.CharsetEncoder charsetEncoder15 = null;
        java.nio.charset.CharsetEncoder charsetEncoder17 = null;
        java.nio.charset.CharsetEncoder charsetEncoder19 = null;
        java.nio.charset.CharsetEncoder charsetEncoder21 = null;
        java.nio.charset.CharsetEncoder charsetEncoder23 = null;
        java.nio.charset.CharsetEncoder charsetEncoder25 = null;
        java.nio.charset.CharsetEncoder charsetEncoder27 = null;
        java.nio.charset.CharsetEncoder charsetEncoder29 = null;
        java.nio.charset.CharsetEncoder charsetEncoder31 = null;
        java.nio.charset.CharsetEncoder charsetEncoder33 = null;
        java.nio.charset.CharsetEncoder charsetEncoder35 = null;
        java.nio.charset.CharsetEncoder charsetEncoder37 = null;
        java.nio.charset.CharsetEncoder charsetEncoder39 = null;
        java.nio.charset.CharsetEncoder charsetEncoder41 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode42 = org.jsoup.nodes.Entities.EscapeMode.base;
        java.lang.String str43 = org.jsoup.nodes.Entities.escape("", charsetEncoder41, escapeMode42);
        java.lang.String str44 = org.jsoup.nodes.Entities.escape("", charsetEncoder39, escapeMode42);
        java.lang.String str45 = org.jsoup.nodes.Entities.escape("", charsetEncoder37, escapeMode42);
        java.lang.String str46 = org.jsoup.nodes.Entities.escape("", charsetEncoder35, escapeMode42);
        java.lang.String str47 = org.jsoup.nodes.Entities.escape("", charsetEncoder33, escapeMode42);
        java.lang.String str48 = org.jsoup.nodes.Entities.escape("", charsetEncoder31, escapeMode42);
        java.lang.String str49 = org.jsoup.nodes.Entities.escape("", charsetEncoder29, escapeMode42);
        java.lang.String str50 = org.jsoup.nodes.Entities.escape("", charsetEncoder27, escapeMode42);
        java.lang.String str51 = org.jsoup.nodes.Entities.escape("", charsetEncoder25, escapeMode42);
        java.lang.String str52 = org.jsoup.nodes.Entities.escape("", charsetEncoder23, escapeMode42);
        java.lang.String str53 = org.jsoup.nodes.Entities.escape("", charsetEncoder21, escapeMode42);
        java.lang.String str54 = org.jsoup.nodes.Entities.escape("", charsetEncoder19, escapeMode42);
        java.lang.String str55 = org.jsoup.nodes.Entities.escape("", charsetEncoder17, escapeMode42);
        java.lang.String str56 = org.jsoup.nodes.Entities.escape("", charsetEncoder15, escapeMode42);
        java.lang.String str57 = org.jsoup.nodes.Entities.escape("", charsetEncoder13, escapeMode42);
        java.lang.String str58 = org.jsoup.nodes.Entities.escape("", charsetEncoder11, escapeMode42);
        java.lang.String str59 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode42);
        java.lang.String str60 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode42);
        java.lang.String str61 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode42);
        java.lang.String str62 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode42);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str63 = org.jsoup.nodes.Entities.escape("hi!", charsetEncoder1, escapeMode42);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + escapeMode42 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode42.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        java.nio.charset.CharsetEncoder charsetEncoder11 = null;
        java.nio.charset.CharsetEncoder charsetEncoder13 = null;
        java.nio.charset.CharsetEncoder charsetEncoder15 = null;
        java.nio.charset.CharsetEncoder charsetEncoder17 = null;
        java.nio.charset.CharsetEncoder charsetEncoder19 = null;
        java.nio.charset.CharsetEncoder charsetEncoder21 = null;
        java.nio.charset.CharsetEncoder charsetEncoder23 = null;
        java.nio.charset.CharsetEncoder charsetEncoder25 = null;
        java.nio.charset.CharsetEncoder charsetEncoder27 = null;
        java.nio.charset.CharsetEncoder charsetEncoder29 = null;
        java.nio.charset.CharsetEncoder charsetEncoder31 = null;
        java.nio.charset.CharsetEncoder charsetEncoder33 = null;
        java.nio.charset.CharsetEncoder charsetEncoder35 = null;
        java.nio.charset.CharsetEncoder charsetEncoder37 = null;
        java.nio.charset.CharsetEncoder charsetEncoder39 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode40 = org.jsoup.nodes.Entities.EscapeMode.base;
        java.lang.String str41 = org.jsoup.nodes.Entities.escape("", charsetEncoder39, escapeMode40);
        java.lang.String str42 = org.jsoup.nodes.Entities.escape("", charsetEncoder37, escapeMode40);
        java.lang.String str43 = org.jsoup.nodes.Entities.escape("", charsetEncoder35, escapeMode40);
        java.lang.String str44 = org.jsoup.nodes.Entities.escape("", charsetEncoder33, escapeMode40);
        java.lang.String str45 = org.jsoup.nodes.Entities.escape("", charsetEncoder31, escapeMode40);
        java.lang.String str46 = org.jsoup.nodes.Entities.escape("", charsetEncoder29, escapeMode40);
        java.lang.String str47 = org.jsoup.nodes.Entities.escape("", charsetEncoder27, escapeMode40);
        java.lang.String str48 = org.jsoup.nodes.Entities.escape("", charsetEncoder25, escapeMode40);
        java.lang.String str49 = org.jsoup.nodes.Entities.escape("", charsetEncoder23, escapeMode40);
        java.lang.String str50 = org.jsoup.nodes.Entities.escape("", charsetEncoder21, escapeMode40);
        java.lang.String str51 = org.jsoup.nodes.Entities.escape("", charsetEncoder19, escapeMode40);
        java.lang.String str52 = org.jsoup.nodes.Entities.escape("", charsetEncoder17, escapeMode40);
        java.lang.String str53 = org.jsoup.nodes.Entities.escape("", charsetEncoder15, escapeMode40);
        java.lang.String str54 = org.jsoup.nodes.Entities.escape("", charsetEncoder13, escapeMode40);
        java.lang.String str55 = org.jsoup.nodes.Entities.escape("", charsetEncoder11, escapeMode40);
        java.lang.String str56 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode40);
        java.lang.String str57 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode40);
        java.lang.String str58 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode40);
        java.lang.String str59 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode40);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str60 = org.jsoup.nodes.Entities.escape("hi!", charsetEncoder1, escapeMode40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + escapeMode40 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode40.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        java.nio.charset.CharsetEncoder charsetEncoder11 = null;
        java.nio.charset.CharsetEncoder charsetEncoder13 = null;
        java.nio.charset.CharsetEncoder charsetEncoder15 = null;
        java.nio.charset.CharsetEncoder charsetEncoder17 = null;
        java.nio.charset.CharsetEncoder charsetEncoder19 = null;
        java.nio.charset.CharsetEncoder charsetEncoder21 = null;
        java.nio.charset.CharsetEncoder charsetEncoder23 = null;
        java.nio.charset.CharsetEncoder charsetEncoder25 = null;
        java.nio.charset.CharsetEncoder charsetEncoder27 = null;
        java.nio.charset.CharsetEncoder charsetEncoder29 = null;
        java.nio.charset.CharsetEncoder charsetEncoder31 = null;
        java.nio.charset.CharsetEncoder charsetEncoder33 = null;
        java.nio.charset.CharsetEncoder charsetEncoder35 = null;
        java.nio.charset.CharsetEncoder charsetEncoder37 = null;
        java.nio.charset.CharsetEncoder charsetEncoder39 = null;
        java.nio.charset.CharsetEncoder charsetEncoder41 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode42 = org.jsoup.nodes.Entities.EscapeMode.base;
        java.lang.String str43 = org.jsoup.nodes.Entities.escape("", charsetEncoder41, escapeMode42);
        java.lang.String str44 = org.jsoup.nodes.Entities.escape("", charsetEncoder39, escapeMode42);
        java.lang.String str45 = org.jsoup.nodes.Entities.escape("", charsetEncoder37, escapeMode42);
        java.lang.String str46 = org.jsoup.nodes.Entities.escape("", charsetEncoder35, escapeMode42);
        java.lang.String str47 = org.jsoup.nodes.Entities.escape("", charsetEncoder33, escapeMode42);
        java.lang.String str48 = org.jsoup.nodes.Entities.escape("", charsetEncoder31, escapeMode42);
        java.lang.String str49 = org.jsoup.nodes.Entities.escape("", charsetEncoder29, escapeMode42);
        java.lang.String str50 = org.jsoup.nodes.Entities.escape("", charsetEncoder27, escapeMode42);
        java.lang.String str51 = org.jsoup.nodes.Entities.escape("", charsetEncoder25, escapeMode42);
        java.lang.String str52 = org.jsoup.nodes.Entities.escape("", charsetEncoder23, escapeMode42);
        java.lang.String str53 = org.jsoup.nodes.Entities.escape("", charsetEncoder21, escapeMode42);
        java.lang.String str54 = org.jsoup.nodes.Entities.escape("", charsetEncoder19, escapeMode42);
        java.lang.String str55 = org.jsoup.nodes.Entities.escape("", charsetEncoder17, escapeMode42);
        java.lang.String str56 = org.jsoup.nodes.Entities.escape("", charsetEncoder15, escapeMode42);
        java.lang.String str57 = org.jsoup.nodes.Entities.escape("", charsetEncoder13, escapeMode42);
        java.lang.String str58 = org.jsoup.nodes.Entities.escape("", charsetEncoder11, escapeMode42);
        java.lang.String str59 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode42);
        java.lang.String str60 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode42);
        java.lang.String str61 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode42);
        java.lang.String str62 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode42);
        java.lang.String str63 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode42);
        java.lang.Class<?> wildcardClass64 = escapeMode42.getClass();
        org.junit.Assert.assertTrue("'" + escapeMode42 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode42.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertNotNull(wildcardClass64);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        java.nio.charset.CharsetEncoder charsetEncoder11 = null;
        java.nio.charset.CharsetEncoder charsetEncoder13 = null;
        java.nio.charset.CharsetEncoder charsetEncoder15 = null;
        java.nio.charset.CharsetEncoder charsetEncoder17 = null;
        java.nio.charset.CharsetEncoder charsetEncoder19 = null;
        java.nio.charset.CharsetEncoder charsetEncoder21 = null;
        java.nio.charset.CharsetEncoder charsetEncoder23 = null;
        java.nio.charset.CharsetEncoder charsetEncoder25 = null;
        java.nio.charset.CharsetEncoder charsetEncoder27 = null;
        java.nio.charset.CharsetEncoder charsetEncoder29 = null;
        java.nio.charset.CharsetEncoder charsetEncoder31 = null;
        java.nio.charset.CharsetEncoder charsetEncoder33 = null;
        java.nio.charset.CharsetEncoder charsetEncoder35 = null;
        java.nio.charset.CharsetEncoder charsetEncoder37 = null;
        java.nio.charset.CharsetEncoder charsetEncoder39 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode40 = org.jsoup.nodes.Entities.EscapeMode.base;
        java.lang.String str41 = org.jsoup.nodes.Entities.escape("", charsetEncoder39, escapeMode40);
        java.lang.String str42 = org.jsoup.nodes.Entities.escape("", charsetEncoder37, escapeMode40);
        java.lang.String str43 = org.jsoup.nodes.Entities.escape("", charsetEncoder35, escapeMode40);
        java.lang.String str44 = org.jsoup.nodes.Entities.escape("", charsetEncoder33, escapeMode40);
        java.lang.String str45 = org.jsoup.nodes.Entities.escape("", charsetEncoder31, escapeMode40);
        java.lang.String str46 = org.jsoup.nodes.Entities.escape("", charsetEncoder29, escapeMode40);
        java.lang.String str47 = org.jsoup.nodes.Entities.escape("", charsetEncoder27, escapeMode40);
        java.lang.String str48 = org.jsoup.nodes.Entities.escape("", charsetEncoder25, escapeMode40);
        java.lang.String str49 = org.jsoup.nodes.Entities.escape("", charsetEncoder23, escapeMode40);
        java.lang.String str50 = org.jsoup.nodes.Entities.escape("", charsetEncoder21, escapeMode40);
        java.lang.String str51 = org.jsoup.nodes.Entities.escape("", charsetEncoder19, escapeMode40);
        java.lang.String str52 = org.jsoup.nodes.Entities.escape("", charsetEncoder17, escapeMode40);
        java.lang.String str53 = org.jsoup.nodes.Entities.escape("", charsetEncoder15, escapeMode40);
        java.lang.String str54 = org.jsoup.nodes.Entities.escape("", charsetEncoder13, escapeMode40);
        java.lang.String str55 = org.jsoup.nodes.Entities.escape("", charsetEncoder11, escapeMode40);
        java.lang.String str56 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode40);
        java.lang.String str57 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode40);
        java.lang.String str58 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode40);
        java.lang.String str59 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode40);
        java.lang.String str60 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode40);
        java.lang.Class<?> wildcardClass61 = escapeMode40.getClass();
        org.junit.Assert.assertTrue("'" + escapeMode40 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode40.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertNotNull(wildcardClass61);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        java.nio.charset.CharsetEncoder charsetEncoder11 = null;
        java.nio.charset.CharsetEncoder charsetEncoder13 = null;
        java.nio.charset.CharsetEncoder charsetEncoder15 = null;
        java.nio.charset.CharsetEncoder charsetEncoder17 = null;
        java.nio.charset.CharsetEncoder charsetEncoder19 = null;
        java.nio.charset.CharsetEncoder charsetEncoder21 = null;
        java.nio.charset.CharsetEncoder charsetEncoder23 = null;
        java.nio.charset.CharsetEncoder charsetEncoder25 = null;
        java.nio.charset.CharsetEncoder charsetEncoder27 = null;
        java.nio.charset.CharsetEncoder charsetEncoder29 = null;
        java.nio.charset.CharsetEncoder charsetEncoder31 = null;
        java.nio.charset.CharsetEncoder charsetEncoder33 = null;
        java.nio.charset.CharsetEncoder charsetEncoder35 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode36 = org.jsoup.nodes.Entities.EscapeMode.extended;
        java.lang.String str37 = org.jsoup.nodes.Entities.escape("", charsetEncoder35, escapeMode36);
        java.lang.String str38 = org.jsoup.nodes.Entities.escape("", charsetEncoder33, escapeMode36);
        java.lang.String str39 = org.jsoup.nodes.Entities.escape("", charsetEncoder31, escapeMode36);
        java.lang.String str40 = org.jsoup.nodes.Entities.escape("", charsetEncoder29, escapeMode36);
        java.lang.String str41 = org.jsoup.nodes.Entities.escape("", charsetEncoder27, escapeMode36);
        java.lang.String str42 = org.jsoup.nodes.Entities.escape("", charsetEncoder25, escapeMode36);
        java.lang.String str43 = org.jsoup.nodes.Entities.escape("", charsetEncoder23, escapeMode36);
        java.lang.String str44 = org.jsoup.nodes.Entities.escape("", charsetEncoder21, escapeMode36);
        java.lang.String str45 = org.jsoup.nodes.Entities.escape("", charsetEncoder19, escapeMode36);
        java.lang.String str46 = org.jsoup.nodes.Entities.escape("", charsetEncoder17, escapeMode36);
        java.lang.String str47 = org.jsoup.nodes.Entities.escape("", charsetEncoder15, escapeMode36);
        java.lang.String str48 = org.jsoup.nodes.Entities.escape("", charsetEncoder13, escapeMode36);
        java.lang.String str49 = org.jsoup.nodes.Entities.escape("", charsetEncoder11, escapeMode36);
        java.lang.String str50 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode36);
        java.lang.String str51 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode36);
        java.lang.String str52 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode36);
        java.lang.String str53 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode36);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str54 = org.jsoup.nodes.Entities.escape("hi!", charsetEncoder1, escapeMode36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + escapeMode36 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.extended + "'", escapeMode36.equals(org.jsoup.nodes.Entities.EscapeMode.extended));
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        java.nio.charset.CharsetEncoder charsetEncoder11 = null;
        java.nio.charset.CharsetEncoder charsetEncoder13 = null;
        java.nio.charset.CharsetEncoder charsetEncoder15 = null;
        java.nio.charset.CharsetEncoder charsetEncoder17 = null;
        java.nio.charset.CharsetEncoder charsetEncoder19 = null;
        java.nio.charset.CharsetEncoder charsetEncoder21 = null;
        java.nio.charset.CharsetEncoder charsetEncoder23 = null;
        java.nio.charset.CharsetEncoder charsetEncoder25 = null;
        java.nio.charset.CharsetEncoder charsetEncoder27 = null;
        java.nio.charset.CharsetEncoder charsetEncoder29 = null;
        java.nio.charset.CharsetEncoder charsetEncoder31 = null;
        java.nio.charset.CharsetEncoder charsetEncoder33 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode34 = org.jsoup.nodes.Entities.EscapeMode.extended;
        java.lang.String str35 = org.jsoup.nodes.Entities.escape("", charsetEncoder33, escapeMode34);
        java.lang.String str36 = org.jsoup.nodes.Entities.escape("", charsetEncoder31, escapeMode34);
        java.lang.String str37 = org.jsoup.nodes.Entities.escape("", charsetEncoder29, escapeMode34);
        java.lang.String str38 = org.jsoup.nodes.Entities.escape("", charsetEncoder27, escapeMode34);
        java.lang.String str39 = org.jsoup.nodes.Entities.escape("", charsetEncoder25, escapeMode34);
        java.lang.String str40 = org.jsoup.nodes.Entities.escape("", charsetEncoder23, escapeMode34);
        java.lang.String str41 = org.jsoup.nodes.Entities.escape("", charsetEncoder21, escapeMode34);
        java.lang.String str42 = org.jsoup.nodes.Entities.escape("", charsetEncoder19, escapeMode34);
        java.lang.String str43 = org.jsoup.nodes.Entities.escape("", charsetEncoder17, escapeMode34);
        java.lang.String str44 = org.jsoup.nodes.Entities.escape("", charsetEncoder15, escapeMode34);
        java.lang.String str45 = org.jsoup.nodes.Entities.escape("", charsetEncoder13, escapeMode34);
        java.lang.String str46 = org.jsoup.nodes.Entities.escape("", charsetEncoder11, escapeMode34);
        java.lang.String str47 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode34);
        java.lang.String str48 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode34);
        java.lang.String str49 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode34);
        java.lang.String str50 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode34);
        java.lang.String str51 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode34);
        java.lang.Class<?> wildcardClass52 = escapeMode34.getClass();
        org.junit.Assert.assertTrue("'" + escapeMode34 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.extended + "'", escapeMode34.equals(org.jsoup.nodes.Entities.EscapeMode.extended));
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertNotNull(wildcardClass52);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        java.nio.charset.CharsetEncoder charsetEncoder11 = null;
        java.nio.charset.CharsetEncoder charsetEncoder13 = null;
        java.nio.charset.CharsetEncoder charsetEncoder15 = null;
        java.nio.charset.CharsetEncoder charsetEncoder17 = null;
        java.nio.charset.CharsetEncoder charsetEncoder19 = null;
        java.nio.charset.CharsetEncoder charsetEncoder21 = null;
        java.nio.charset.CharsetEncoder charsetEncoder23 = null;
        java.nio.charset.CharsetEncoder charsetEncoder25 = null;
        java.nio.charset.CharsetEncoder charsetEncoder27 = null;
        java.nio.charset.CharsetEncoder charsetEncoder29 = null;
        java.nio.charset.CharsetEncoder charsetEncoder31 = null;
        java.nio.charset.CharsetEncoder charsetEncoder33 = null;
        java.nio.charset.CharsetEncoder charsetEncoder35 = null;
        java.nio.charset.CharsetEncoder charsetEncoder37 = null;
        java.nio.charset.CharsetEncoder charsetEncoder39 = null;
        java.nio.charset.CharsetEncoder charsetEncoder41 = null;
        java.nio.charset.CharsetEncoder charsetEncoder43 = null;
        java.nio.charset.CharsetEncoder charsetEncoder45 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode46 = org.jsoup.nodes.Entities.EscapeMode.base;
        java.lang.String str47 = org.jsoup.nodes.Entities.escape("", charsetEncoder45, escapeMode46);
        java.lang.String str48 = org.jsoup.nodes.Entities.escape("", charsetEncoder43, escapeMode46);
        java.lang.String str49 = org.jsoup.nodes.Entities.escape("", charsetEncoder41, escapeMode46);
        java.lang.String str50 = org.jsoup.nodes.Entities.escape("", charsetEncoder39, escapeMode46);
        java.lang.String str51 = org.jsoup.nodes.Entities.escape("", charsetEncoder37, escapeMode46);
        java.lang.String str52 = org.jsoup.nodes.Entities.escape("", charsetEncoder35, escapeMode46);
        java.lang.String str53 = org.jsoup.nodes.Entities.escape("", charsetEncoder33, escapeMode46);
        java.lang.String str54 = org.jsoup.nodes.Entities.escape("", charsetEncoder31, escapeMode46);
        java.lang.String str55 = org.jsoup.nodes.Entities.escape("", charsetEncoder29, escapeMode46);
        java.lang.String str56 = org.jsoup.nodes.Entities.escape("", charsetEncoder27, escapeMode46);
        java.lang.String str57 = org.jsoup.nodes.Entities.escape("", charsetEncoder25, escapeMode46);
        java.lang.String str58 = org.jsoup.nodes.Entities.escape("", charsetEncoder23, escapeMode46);
        java.lang.String str59 = org.jsoup.nodes.Entities.escape("", charsetEncoder21, escapeMode46);
        java.lang.String str60 = org.jsoup.nodes.Entities.escape("", charsetEncoder19, escapeMode46);
        java.lang.String str61 = org.jsoup.nodes.Entities.escape("", charsetEncoder17, escapeMode46);
        java.lang.String str62 = org.jsoup.nodes.Entities.escape("", charsetEncoder15, escapeMode46);
        java.lang.String str63 = org.jsoup.nodes.Entities.escape("", charsetEncoder13, escapeMode46);
        java.lang.String str64 = org.jsoup.nodes.Entities.escape("", charsetEncoder11, escapeMode46);
        java.lang.String str65 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode46);
        java.lang.String str66 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode46);
        java.lang.String str67 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode46);
        java.lang.String str68 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode46);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str69 = org.jsoup.nodes.Entities.escape("hi!", charsetEncoder1, escapeMode46);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + escapeMode46 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode46.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "" + "'", str68, "");
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        java.nio.charset.CharsetEncoder charsetEncoder11 = null;
        java.nio.charset.CharsetEncoder charsetEncoder13 = null;
        java.nio.charset.CharsetEncoder charsetEncoder15 = null;
        java.nio.charset.CharsetEncoder charsetEncoder17 = null;
        java.nio.charset.CharsetEncoder charsetEncoder19 = null;
        java.nio.charset.CharsetEncoder charsetEncoder21 = null;
        java.nio.charset.CharsetEncoder charsetEncoder23 = null;
        java.nio.charset.CharsetEncoder charsetEncoder25 = null;
        java.nio.charset.CharsetEncoder charsetEncoder27 = null;
        java.nio.charset.CharsetEncoder charsetEncoder29 = null;
        java.nio.charset.CharsetEncoder charsetEncoder31 = null;
        java.nio.charset.CharsetEncoder charsetEncoder33 = null;
        java.nio.charset.CharsetEncoder charsetEncoder35 = null;
        java.nio.charset.CharsetEncoder charsetEncoder37 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode38 = org.jsoup.nodes.Entities.EscapeMode.extended;
        java.lang.String str39 = org.jsoup.nodes.Entities.escape("", charsetEncoder37, escapeMode38);
        java.lang.String str40 = org.jsoup.nodes.Entities.escape("", charsetEncoder35, escapeMode38);
        java.lang.String str41 = org.jsoup.nodes.Entities.escape("", charsetEncoder33, escapeMode38);
        java.lang.String str42 = org.jsoup.nodes.Entities.escape("", charsetEncoder31, escapeMode38);
        java.lang.String str43 = org.jsoup.nodes.Entities.escape("", charsetEncoder29, escapeMode38);
        java.lang.String str44 = org.jsoup.nodes.Entities.escape("", charsetEncoder27, escapeMode38);
        java.lang.String str45 = org.jsoup.nodes.Entities.escape("", charsetEncoder25, escapeMode38);
        java.lang.String str46 = org.jsoup.nodes.Entities.escape("", charsetEncoder23, escapeMode38);
        java.lang.String str47 = org.jsoup.nodes.Entities.escape("", charsetEncoder21, escapeMode38);
        java.lang.String str48 = org.jsoup.nodes.Entities.escape("", charsetEncoder19, escapeMode38);
        java.lang.String str49 = org.jsoup.nodes.Entities.escape("", charsetEncoder17, escapeMode38);
        java.lang.String str50 = org.jsoup.nodes.Entities.escape("", charsetEncoder15, escapeMode38);
        java.lang.String str51 = org.jsoup.nodes.Entities.escape("", charsetEncoder13, escapeMode38);
        java.lang.String str52 = org.jsoup.nodes.Entities.escape("", charsetEncoder11, escapeMode38);
        java.lang.String str53 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode38);
        java.lang.String str54 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode38);
        java.lang.String str55 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode38);
        java.lang.String str56 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode38);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str57 = org.jsoup.nodes.Entities.escape("hi!", charsetEncoder1, escapeMode38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + escapeMode38 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.extended + "'", escapeMode38.equals(org.jsoup.nodes.Entities.EscapeMode.extended));
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        java.nio.charset.CharsetEncoder charsetEncoder11 = null;
        java.nio.charset.CharsetEncoder charsetEncoder13 = null;
        java.nio.charset.CharsetEncoder charsetEncoder15 = null;
        java.nio.charset.CharsetEncoder charsetEncoder17 = null;
        java.nio.charset.CharsetEncoder charsetEncoder19 = null;
        java.nio.charset.CharsetEncoder charsetEncoder21 = null;
        java.nio.charset.CharsetEncoder charsetEncoder23 = null;
        java.nio.charset.CharsetEncoder charsetEncoder25 = null;
        java.nio.charset.CharsetEncoder charsetEncoder27 = null;
        java.nio.charset.CharsetEncoder charsetEncoder29 = null;
        java.nio.charset.CharsetEncoder charsetEncoder31 = null;
        java.nio.charset.CharsetEncoder charsetEncoder33 = null;
        java.nio.charset.CharsetEncoder charsetEncoder35 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode36 = org.jsoup.nodes.Entities.EscapeMode.extended;
        java.lang.String str37 = org.jsoup.nodes.Entities.escape("", charsetEncoder35, escapeMode36);
        java.lang.String str38 = org.jsoup.nodes.Entities.escape("", charsetEncoder33, escapeMode36);
        java.lang.String str39 = org.jsoup.nodes.Entities.escape("", charsetEncoder31, escapeMode36);
        java.lang.String str40 = org.jsoup.nodes.Entities.escape("", charsetEncoder29, escapeMode36);
        java.lang.String str41 = org.jsoup.nodes.Entities.escape("", charsetEncoder27, escapeMode36);
        java.lang.String str42 = org.jsoup.nodes.Entities.escape("", charsetEncoder25, escapeMode36);
        java.lang.String str43 = org.jsoup.nodes.Entities.escape("", charsetEncoder23, escapeMode36);
        java.lang.String str44 = org.jsoup.nodes.Entities.escape("", charsetEncoder21, escapeMode36);
        java.lang.String str45 = org.jsoup.nodes.Entities.escape("", charsetEncoder19, escapeMode36);
        java.lang.String str46 = org.jsoup.nodes.Entities.escape("", charsetEncoder17, escapeMode36);
        java.lang.String str47 = org.jsoup.nodes.Entities.escape("", charsetEncoder15, escapeMode36);
        java.lang.String str48 = org.jsoup.nodes.Entities.escape("", charsetEncoder13, escapeMode36);
        java.lang.String str49 = org.jsoup.nodes.Entities.escape("", charsetEncoder11, escapeMode36);
        java.lang.String str50 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode36);
        java.lang.String str51 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode36);
        java.lang.String str52 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode36);
        java.lang.String str53 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode36);
        java.lang.String str54 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode36);
        java.lang.Class<?> wildcardClass55 = escapeMode36.getClass();
        org.junit.Assert.assertTrue("'" + escapeMode36 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.extended + "'", escapeMode36.equals(org.jsoup.nodes.Entities.EscapeMode.extended));
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertNotNull(wildcardClass55);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        java.nio.charset.CharsetEncoder charsetEncoder11 = null;
        java.nio.charset.CharsetEncoder charsetEncoder13 = null;
        java.nio.charset.CharsetEncoder charsetEncoder15 = null;
        java.nio.charset.CharsetEncoder charsetEncoder17 = null;
        java.nio.charset.CharsetEncoder charsetEncoder19 = null;
        java.nio.charset.CharsetEncoder charsetEncoder21 = null;
        java.nio.charset.CharsetEncoder charsetEncoder23 = null;
        java.nio.charset.CharsetEncoder charsetEncoder25 = null;
        java.nio.charset.CharsetEncoder charsetEncoder27 = null;
        java.nio.charset.CharsetEncoder charsetEncoder29 = null;
        java.nio.charset.CharsetEncoder charsetEncoder31 = null;
        java.nio.charset.CharsetEncoder charsetEncoder33 = null;
        java.nio.charset.CharsetEncoder charsetEncoder35 = null;
        java.nio.charset.CharsetEncoder charsetEncoder37 = null;
        java.nio.charset.CharsetEncoder charsetEncoder39 = null;
        java.nio.charset.CharsetEncoder charsetEncoder41 = null;
        java.nio.charset.CharsetEncoder charsetEncoder43 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode44 = org.jsoup.nodes.Entities.EscapeMode.base;
        java.lang.String str45 = org.jsoup.nodes.Entities.escape("", charsetEncoder43, escapeMode44);
        java.lang.String str46 = org.jsoup.nodes.Entities.escape("", charsetEncoder41, escapeMode44);
        java.lang.String str47 = org.jsoup.nodes.Entities.escape("", charsetEncoder39, escapeMode44);
        java.lang.String str48 = org.jsoup.nodes.Entities.escape("", charsetEncoder37, escapeMode44);
        java.lang.String str49 = org.jsoup.nodes.Entities.escape("", charsetEncoder35, escapeMode44);
        java.lang.String str50 = org.jsoup.nodes.Entities.escape("", charsetEncoder33, escapeMode44);
        java.lang.String str51 = org.jsoup.nodes.Entities.escape("", charsetEncoder31, escapeMode44);
        java.lang.String str52 = org.jsoup.nodes.Entities.escape("", charsetEncoder29, escapeMode44);
        java.lang.String str53 = org.jsoup.nodes.Entities.escape("", charsetEncoder27, escapeMode44);
        java.lang.String str54 = org.jsoup.nodes.Entities.escape("", charsetEncoder25, escapeMode44);
        java.lang.String str55 = org.jsoup.nodes.Entities.escape("", charsetEncoder23, escapeMode44);
        java.lang.String str56 = org.jsoup.nodes.Entities.escape("", charsetEncoder21, escapeMode44);
        java.lang.String str57 = org.jsoup.nodes.Entities.escape("", charsetEncoder19, escapeMode44);
        java.lang.String str58 = org.jsoup.nodes.Entities.escape("", charsetEncoder17, escapeMode44);
        java.lang.String str59 = org.jsoup.nodes.Entities.escape("", charsetEncoder15, escapeMode44);
        java.lang.String str60 = org.jsoup.nodes.Entities.escape("", charsetEncoder13, escapeMode44);
        java.lang.String str61 = org.jsoup.nodes.Entities.escape("", charsetEncoder11, escapeMode44);
        java.lang.String str62 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode44);
        java.lang.String str63 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode44);
        java.lang.String str64 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode44);
        java.lang.String str65 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode44);
        java.lang.String str66 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode44);
        java.lang.Class<?> wildcardClass67 = escapeMode44.getClass();
        org.junit.Assert.assertTrue("'" + escapeMode44 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode44.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
        org.junit.Assert.assertNotNull(wildcardClass67);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        java.nio.charset.CharsetEncoder charsetEncoder11 = null;
        java.nio.charset.CharsetEncoder charsetEncoder13 = null;
        java.nio.charset.CharsetEncoder charsetEncoder15 = null;
        java.nio.charset.CharsetEncoder charsetEncoder17 = null;
        java.nio.charset.CharsetEncoder charsetEncoder19 = null;
        java.nio.charset.CharsetEncoder charsetEncoder21 = null;
        java.nio.charset.CharsetEncoder charsetEncoder23 = null;
        java.nio.charset.CharsetEncoder charsetEncoder25 = null;
        java.nio.charset.CharsetEncoder charsetEncoder27 = null;
        java.nio.charset.CharsetEncoder charsetEncoder29 = null;
        java.nio.charset.CharsetEncoder charsetEncoder31 = null;
        java.nio.charset.CharsetEncoder charsetEncoder33 = null;
        java.nio.charset.CharsetEncoder charsetEncoder35 = null;
        java.nio.charset.CharsetEncoder charsetEncoder37 = null;
        java.nio.charset.CharsetEncoder charsetEncoder39 = null;
        java.nio.charset.CharsetEncoder charsetEncoder41 = null;
        java.nio.charset.CharsetEncoder charsetEncoder43 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode44 = org.jsoup.nodes.Entities.EscapeMode.base;
        java.lang.String str45 = org.jsoup.nodes.Entities.escape("", charsetEncoder43, escapeMode44);
        java.lang.String str46 = org.jsoup.nodes.Entities.escape("", charsetEncoder41, escapeMode44);
        java.lang.String str47 = org.jsoup.nodes.Entities.escape("", charsetEncoder39, escapeMode44);
        java.lang.String str48 = org.jsoup.nodes.Entities.escape("", charsetEncoder37, escapeMode44);
        java.lang.String str49 = org.jsoup.nodes.Entities.escape("", charsetEncoder35, escapeMode44);
        java.lang.String str50 = org.jsoup.nodes.Entities.escape("", charsetEncoder33, escapeMode44);
        java.lang.String str51 = org.jsoup.nodes.Entities.escape("", charsetEncoder31, escapeMode44);
        java.lang.String str52 = org.jsoup.nodes.Entities.escape("", charsetEncoder29, escapeMode44);
        java.lang.String str53 = org.jsoup.nodes.Entities.escape("", charsetEncoder27, escapeMode44);
        java.lang.String str54 = org.jsoup.nodes.Entities.escape("", charsetEncoder25, escapeMode44);
        java.lang.String str55 = org.jsoup.nodes.Entities.escape("", charsetEncoder23, escapeMode44);
        java.lang.String str56 = org.jsoup.nodes.Entities.escape("", charsetEncoder21, escapeMode44);
        java.lang.String str57 = org.jsoup.nodes.Entities.escape("", charsetEncoder19, escapeMode44);
        java.lang.String str58 = org.jsoup.nodes.Entities.escape("", charsetEncoder17, escapeMode44);
        java.lang.String str59 = org.jsoup.nodes.Entities.escape("", charsetEncoder15, escapeMode44);
        java.lang.String str60 = org.jsoup.nodes.Entities.escape("", charsetEncoder13, escapeMode44);
        java.lang.String str61 = org.jsoup.nodes.Entities.escape("", charsetEncoder11, escapeMode44);
        java.lang.String str62 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode44);
        java.lang.String str63 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode44);
        java.lang.String str64 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode44);
        java.lang.String str65 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode44);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str66 = org.jsoup.nodes.Entities.escape("hi!", charsetEncoder1, escapeMode44);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + escapeMode44 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode44.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        java.nio.charset.CharsetEncoder charsetEncoder11 = null;
        java.nio.charset.CharsetEncoder charsetEncoder13 = null;
        java.nio.charset.CharsetEncoder charsetEncoder15 = null;
        java.nio.charset.CharsetEncoder charsetEncoder17 = null;
        java.nio.charset.CharsetEncoder charsetEncoder19 = null;
        java.nio.charset.CharsetEncoder charsetEncoder21 = null;
        java.nio.charset.CharsetEncoder charsetEncoder23 = null;
        java.nio.charset.CharsetEncoder charsetEncoder25 = null;
        java.nio.charset.CharsetEncoder charsetEncoder27 = null;
        java.nio.charset.CharsetEncoder charsetEncoder29 = null;
        java.nio.charset.CharsetEncoder charsetEncoder31 = null;
        java.nio.charset.CharsetEncoder charsetEncoder33 = null;
        java.nio.charset.CharsetEncoder charsetEncoder35 = null;
        java.nio.charset.CharsetEncoder charsetEncoder37 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode38 = org.jsoup.nodes.Entities.EscapeMode.extended;
        java.lang.String str39 = org.jsoup.nodes.Entities.escape("", charsetEncoder37, escapeMode38);
        java.lang.String str40 = org.jsoup.nodes.Entities.escape("", charsetEncoder35, escapeMode38);
        java.lang.String str41 = org.jsoup.nodes.Entities.escape("", charsetEncoder33, escapeMode38);
        java.lang.String str42 = org.jsoup.nodes.Entities.escape("", charsetEncoder31, escapeMode38);
        java.lang.String str43 = org.jsoup.nodes.Entities.escape("", charsetEncoder29, escapeMode38);
        java.lang.String str44 = org.jsoup.nodes.Entities.escape("", charsetEncoder27, escapeMode38);
        java.lang.String str45 = org.jsoup.nodes.Entities.escape("", charsetEncoder25, escapeMode38);
        java.lang.String str46 = org.jsoup.nodes.Entities.escape("", charsetEncoder23, escapeMode38);
        java.lang.String str47 = org.jsoup.nodes.Entities.escape("", charsetEncoder21, escapeMode38);
        java.lang.String str48 = org.jsoup.nodes.Entities.escape("", charsetEncoder19, escapeMode38);
        java.lang.String str49 = org.jsoup.nodes.Entities.escape("", charsetEncoder17, escapeMode38);
        java.lang.String str50 = org.jsoup.nodes.Entities.escape("", charsetEncoder15, escapeMode38);
        java.lang.String str51 = org.jsoup.nodes.Entities.escape("", charsetEncoder13, escapeMode38);
        java.lang.String str52 = org.jsoup.nodes.Entities.escape("", charsetEncoder11, escapeMode38);
        java.lang.String str53 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode38);
        java.lang.String str54 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode38);
        java.lang.String str55 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode38);
        java.lang.String str56 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode38);
        java.lang.String str57 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode38);
        java.lang.Class<?> wildcardClass58 = escapeMode38.getClass();
        org.junit.Assert.assertTrue("'" + escapeMode38 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.extended + "'", escapeMode38.equals(org.jsoup.nodes.Entities.EscapeMode.extended));
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertNotNull(wildcardClass58);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        java.nio.charset.CharsetEncoder charsetEncoder11 = null;
        java.nio.charset.CharsetEncoder charsetEncoder13 = null;
        java.nio.charset.CharsetEncoder charsetEncoder15 = null;
        java.nio.charset.CharsetEncoder charsetEncoder17 = null;
        java.nio.charset.CharsetEncoder charsetEncoder19 = null;
        java.nio.charset.CharsetEncoder charsetEncoder21 = null;
        java.nio.charset.CharsetEncoder charsetEncoder23 = null;
        java.nio.charset.CharsetEncoder charsetEncoder25 = null;
        java.nio.charset.CharsetEncoder charsetEncoder27 = null;
        java.nio.charset.CharsetEncoder charsetEncoder29 = null;
        java.nio.charset.CharsetEncoder charsetEncoder31 = null;
        java.nio.charset.CharsetEncoder charsetEncoder33 = null;
        java.nio.charset.CharsetEncoder charsetEncoder35 = null;
        java.nio.charset.CharsetEncoder charsetEncoder37 = null;
        java.nio.charset.CharsetEncoder charsetEncoder39 = null;
        java.nio.charset.CharsetEncoder charsetEncoder41 = null;
        java.nio.charset.CharsetEncoder charsetEncoder43 = null;
        java.nio.charset.CharsetEncoder charsetEncoder45 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode46 = org.jsoup.nodes.Entities.EscapeMode.base;
        java.lang.String str47 = org.jsoup.nodes.Entities.escape("", charsetEncoder45, escapeMode46);
        java.lang.String str48 = org.jsoup.nodes.Entities.escape("", charsetEncoder43, escapeMode46);
        java.lang.String str49 = org.jsoup.nodes.Entities.escape("", charsetEncoder41, escapeMode46);
        java.lang.String str50 = org.jsoup.nodes.Entities.escape("", charsetEncoder39, escapeMode46);
        java.lang.String str51 = org.jsoup.nodes.Entities.escape("", charsetEncoder37, escapeMode46);
        java.lang.String str52 = org.jsoup.nodes.Entities.escape("", charsetEncoder35, escapeMode46);
        java.lang.String str53 = org.jsoup.nodes.Entities.escape("", charsetEncoder33, escapeMode46);
        java.lang.String str54 = org.jsoup.nodes.Entities.escape("", charsetEncoder31, escapeMode46);
        java.lang.String str55 = org.jsoup.nodes.Entities.escape("", charsetEncoder29, escapeMode46);
        java.lang.String str56 = org.jsoup.nodes.Entities.escape("", charsetEncoder27, escapeMode46);
        java.lang.String str57 = org.jsoup.nodes.Entities.escape("", charsetEncoder25, escapeMode46);
        java.lang.String str58 = org.jsoup.nodes.Entities.escape("", charsetEncoder23, escapeMode46);
        java.lang.String str59 = org.jsoup.nodes.Entities.escape("", charsetEncoder21, escapeMode46);
        java.lang.String str60 = org.jsoup.nodes.Entities.escape("", charsetEncoder19, escapeMode46);
        java.lang.String str61 = org.jsoup.nodes.Entities.escape("", charsetEncoder17, escapeMode46);
        java.lang.String str62 = org.jsoup.nodes.Entities.escape("", charsetEncoder15, escapeMode46);
        java.lang.String str63 = org.jsoup.nodes.Entities.escape("", charsetEncoder13, escapeMode46);
        java.lang.String str64 = org.jsoup.nodes.Entities.escape("", charsetEncoder11, escapeMode46);
        java.lang.String str65 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode46);
        java.lang.String str66 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode46);
        java.lang.String str67 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode46);
        java.lang.String str68 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode46);
        java.lang.String str69 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode46);
        java.lang.Class<?> wildcardClass70 = escapeMode46.getClass();
        org.junit.Assert.assertTrue("'" + escapeMode46 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode46.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "" + "'", str68, "");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
        org.junit.Assert.assertNotNull(wildcardClass70);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        java.nio.charset.CharsetEncoder charsetEncoder11 = null;
        java.nio.charset.CharsetEncoder charsetEncoder13 = null;
        java.nio.charset.CharsetEncoder charsetEncoder15 = null;
        java.nio.charset.CharsetEncoder charsetEncoder17 = null;
        java.nio.charset.CharsetEncoder charsetEncoder19 = null;
        java.nio.charset.CharsetEncoder charsetEncoder21 = null;
        java.nio.charset.CharsetEncoder charsetEncoder23 = null;
        java.nio.charset.CharsetEncoder charsetEncoder25 = null;
        java.nio.charset.CharsetEncoder charsetEncoder27 = null;
        java.nio.charset.CharsetEncoder charsetEncoder29 = null;
        java.nio.charset.CharsetEncoder charsetEncoder31 = null;
        java.nio.charset.CharsetEncoder charsetEncoder33 = null;
        java.nio.charset.CharsetEncoder charsetEncoder35 = null;
        java.nio.charset.CharsetEncoder charsetEncoder37 = null;
        java.nio.charset.CharsetEncoder charsetEncoder39 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode40 = org.jsoup.nodes.Entities.EscapeMode.extended;
        java.lang.String str41 = org.jsoup.nodes.Entities.escape("", charsetEncoder39, escapeMode40);
        java.lang.String str42 = org.jsoup.nodes.Entities.escape("", charsetEncoder37, escapeMode40);
        java.lang.String str43 = org.jsoup.nodes.Entities.escape("", charsetEncoder35, escapeMode40);
        java.lang.String str44 = org.jsoup.nodes.Entities.escape("", charsetEncoder33, escapeMode40);
        java.lang.String str45 = org.jsoup.nodes.Entities.escape("", charsetEncoder31, escapeMode40);
        java.lang.String str46 = org.jsoup.nodes.Entities.escape("", charsetEncoder29, escapeMode40);
        java.lang.String str47 = org.jsoup.nodes.Entities.escape("", charsetEncoder27, escapeMode40);
        java.lang.String str48 = org.jsoup.nodes.Entities.escape("", charsetEncoder25, escapeMode40);
        java.lang.String str49 = org.jsoup.nodes.Entities.escape("", charsetEncoder23, escapeMode40);
        java.lang.String str50 = org.jsoup.nodes.Entities.escape("", charsetEncoder21, escapeMode40);
        java.lang.String str51 = org.jsoup.nodes.Entities.escape("", charsetEncoder19, escapeMode40);
        java.lang.String str52 = org.jsoup.nodes.Entities.escape("", charsetEncoder17, escapeMode40);
        java.lang.String str53 = org.jsoup.nodes.Entities.escape("", charsetEncoder15, escapeMode40);
        java.lang.String str54 = org.jsoup.nodes.Entities.escape("", charsetEncoder13, escapeMode40);
        java.lang.String str55 = org.jsoup.nodes.Entities.escape("", charsetEncoder11, escapeMode40);
        java.lang.String str56 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode40);
        java.lang.String str57 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode40);
        java.lang.String str58 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode40);
        java.lang.String str59 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode40);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str60 = org.jsoup.nodes.Entities.escape("hi!", charsetEncoder1, escapeMode40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + escapeMode40 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.extended + "'", escapeMode40.equals(org.jsoup.nodes.Entities.EscapeMode.extended));
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        java.nio.charset.CharsetEncoder charsetEncoder11 = null;
        java.nio.charset.CharsetEncoder charsetEncoder13 = null;
        java.nio.charset.CharsetEncoder charsetEncoder15 = null;
        java.nio.charset.CharsetEncoder charsetEncoder17 = null;
        java.nio.charset.CharsetEncoder charsetEncoder19 = null;
        java.nio.charset.CharsetEncoder charsetEncoder21 = null;
        java.nio.charset.CharsetEncoder charsetEncoder23 = null;
        java.nio.charset.CharsetEncoder charsetEncoder25 = null;
        java.nio.charset.CharsetEncoder charsetEncoder27 = null;
        java.nio.charset.CharsetEncoder charsetEncoder29 = null;
        java.nio.charset.CharsetEncoder charsetEncoder31 = null;
        java.nio.charset.CharsetEncoder charsetEncoder33 = null;
        java.nio.charset.CharsetEncoder charsetEncoder35 = null;
        java.nio.charset.CharsetEncoder charsetEncoder37 = null;
        java.nio.charset.CharsetEncoder charsetEncoder39 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode40 = org.jsoup.nodes.Entities.EscapeMode.extended;
        java.lang.String str41 = org.jsoup.nodes.Entities.escape("", charsetEncoder39, escapeMode40);
        java.lang.String str42 = org.jsoup.nodes.Entities.escape("", charsetEncoder37, escapeMode40);
        java.lang.String str43 = org.jsoup.nodes.Entities.escape("", charsetEncoder35, escapeMode40);
        java.lang.String str44 = org.jsoup.nodes.Entities.escape("", charsetEncoder33, escapeMode40);
        java.lang.String str45 = org.jsoup.nodes.Entities.escape("", charsetEncoder31, escapeMode40);
        java.lang.String str46 = org.jsoup.nodes.Entities.escape("", charsetEncoder29, escapeMode40);
        java.lang.String str47 = org.jsoup.nodes.Entities.escape("", charsetEncoder27, escapeMode40);
        java.lang.String str48 = org.jsoup.nodes.Entities.escape("", charsetEncoder25, escapeMode40);
        java.lang.String str49 = org.jsoup.nodes.Entities.escape("", charsetEncoder23, escapeMode40);
        java.lang.String str50 = org.jsoup.nodes.Entities.escape("", charsetEncoder21, escapeMode40);
        java.lang.String str51 = org.jsoup.nodes.Entities.escape("", charsetEncoder19, escapeMode40);
        java.lang.String str52 = org.jsoup.nodes.Entities.escape("", charsetEncoder17, escapeMode40);
        java.lang.String str53 = org.jsoup.nodes.Entities.escape("", charsetEncoder15, escapeMode40);
        java.lang.String str54 = org.jsoup.nodes.Entities.escape("", charsetEncoder13, escapeMode40);
        java.lang.String str55 = org.jsoup.nodes.Entities.escape("", charsetEncoder11, escapeMode40);
        java.lang.String str56 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode40);
        java.lang.String str57 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode40);
        java.lang.String str58 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode40);
        java.lang.String str59 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode40);
        java.lang.String str60 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode40);
        java.lang.Class<?> wildcardClass61 = escapeMode40.getClass();
        org.junit.Assert.assertTrue("'" + escapeMode40 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.extended + "'", escapeMode40.equals(org.jsoup.nodes.Entities.EscapeMode.extended));
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertNotNull(wildcardClass61);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        java.nio.charset.CharsetEncoder charsetEncoder11 = null;
        java.nio.charset.CharsetEncoder charsetEncoder13 = null;
        java.nio.charset.CharsetEncoder charsetEncoder15 = null;
        java.nio.charset.CharsetEncoder charsetEncoder17 = null;
        java.nio.charset.CharsetEncoder charsetEncoder19 = null;
        java.nio.charset.CharsetEncoder charsetEncoder21 = null;
        java.nio.charset.CharsetEncoder charsetEncoder23 = null;
        java.nio.charset.CharsetEncoder charsetEncoder25 = null;
        java.nio.charset.CharsetEncoder charsetEncoder27 = null;
        java.nio.charset.CharsetEncoder charsetEncoder29 = null;
        java.nio.charset.CharsetEncoder charsetEncoder31 = null;
        java.nio.charset.CharsetEncoder charsetEncoder33 = null;
        java.nio.charset.CharsetEncoder charsetEncoder35 = null;
        java.nio.charset.CharsetEncoder charsetEncoder37 = null;
        java.nio.charset.CharsetEncoder charsetEncoder39 = null;
        java.nio.charset.CharsetEncoder charsetEncoder41 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode42 = org.jsoup.nodes.Entities.EscapeMode.extended;
        java.lang.String str43 = org.jsoup.nodes.Entities.escape("", charsetEncoder41, escapeMode42);
        java.lang.String str44 = org.jsoup.nodes.Entities.escape("", charsetEncoder39, escapeMode42);
        java.lang.String str45 = org.jsoup.nodes.Entities.escape("", charsetEncoder37, escapeMode42);
        java.lang.String str46 = org.jsoup.nodes.Entities.escape("", charsetEncoder35, escapeMode42);
        java.lang.String str47 = org.jsoup.nodes.Entities.escape("", charsetEncoder33, escapeMode42);
        java.lang.String str48 = org.jsoup.nodes.Entities.escape("", charsetEncoder31, escapeMode42);
        java.lang.String str49 = org.jsoup.nodes.Entities.escape("", charsetEncoder29, escapeMode42);
        java.lang.String str50 = org.jsoup.nodes.Entities.escape("", charsetEncoder27, escapeMode42);
        java.lang.String str51 = org.jsoup.nodes.Entities.escape("", charsetEncoder25, escapeMode42);
        java.lang.String str52 = org.jsoup.nodes.Entities.escape("", charsetEncoder23, escapeMode42);
        java.lang.String str53 = org.jsoup.nodes.Entities.escape("", charsetEncoder21, escapeMode42);
        java.lang.String str54 = org.jsoup.nodes.Entities.escape("", charsetEncoder19, escapeMode42);
        java.lang.String str55 = org.jsoup.nodes.Entities.escape("", charsetEncoder17, escapeMode42);
        java.lang.String str56 = org.jsoup.nodes.Entities.escape("", charsetEncoder15, escapeMode42);
        java.lang.String str57 = org.jsoup.nodes.Entities.escape("", charsetEncoder13, escapeMode42);
        java.lang.String str58 = org.jsoup.nodes.Entities.escape("", charsetEncoder11, escapeMode42);
        java.lang.String str59 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode42);
        java.lang.String str60 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode42);
        java.lang.String str61 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode42);
        java.lang.String str62 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode42);
        java.lang.String str63 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode42);
        java.lang.Class<?> wildcardClass64 = escapeMode42.getClass();
        org.junit.Assert.assertTrue("'" + escapeMode42 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.extended + "'", escapeMode42.equals(org.jsoup.nodes.Entities.EscapeMode.extended));
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertNotNull(wildcardClass64);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        java.nio.charset.CharsetEncoder charsetEncoder11 = null;
        java.nio.charset.CharsetEncoder charsetEncoder13 = null;
        java.nio.charset.CharsetEncoder charsetEncoder15 = null;
        java.nio.charset.CharsetEncoder charsetEncoder17 = null;
        java.nio.charset.CharsetEncoder charsetEncoder19 = null;
        java.nio.charset.CharsetEncoder charsetEncoder21 = null;
        java.nio.charset.CharsetEncoder charsetEncoder23 = null;
        java.nio.charset.CharsetEncoder charsetEncoder25 = null;
        java.nio.charset.CharsetEncoder charsetEncoder27 = null;
        java.nio.charset.CharsetEncoder charsetEncoder29 = null;
        java.nio.charset.CharsetEncoder charsetEncoder31 = null;
        java.nio.charset.CharsetEncoder charsetEncoder33 = null;
        java.nio.charset.CharsetEncoder charsetEncoder35 = null;
        java.nio.charset.CharsetEncoder charsetEncoder37 = null;
        java.nio.charset.CharsetEncoder charsetEncoder39 = null;
        java.nio.charset.CharsetEncoder charsetEncoder41 = null;
        java.nio.charset.CharsetEncoder charsetEncoder43 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode44 = org.jsoup.nodes.Entities.EscapeMode.extended;
        java.lang.String str45 = org.jsoup.nodes.Entities.escape("", charsetEncoder43, escapeMode44);
        java.lang.String str46 = org.jsoup.nodes.Entities.escape("", charsetEncoder41, escapeMode44);
        java.lang.String str47 = org.jsoup.nodes.Entities.escape("", charsetEncoder39, escapeMode44);
        java.lang.String str48 = org.jsoup.nodes.Entities.escape("", charsetEncoder37, escapeMode44);
        java.lang.String str49 = org.jsoup.nodes.Entities.escape("", charsetEncoder35, escapeMode44);
        java.lang.String str50 = org.jsoup.nodes.Entities.escape("", charsetEncoder33, escapeMode44);
        java.lang.String str51 = org.jsoup.nodes.Entities.escape("", charsetEncoder31, escapeMode44);
        java.lang.String str52 = org.jsoup.nodes.Entities.escape("", charsetEncoder29, escapeMode44);
        java.lang.String str53 = org.jsoup.nodes.Entities.escape("", charsetEncoder27, escapeMode44);
        java.lang.String str54 = org.jsoup.nodes.Entities.escape("", charsetEncoder25, escapeMode44);
        java.lang.String str55 = org.jsoup.nodes.Entities.escape("", charsetEncoder23, escapeMode44);
        java.lang.String str56 = org.jsoup.nodes.Entities.escape("", charsetEncoder21, escapeMode44);
        java.lang.String str57 = org.jsoup.nodes.Entities.escape("", charsetEncoder19, escapeMode44);
        java.lang.String str58 = org.jsoup.nodes.Entities.escape("", charsetEncoder17, escapeMode44);
        java.lang.String str59 = org.jsoup.nodes.Entities.escape("", charsetEncoder15, escapeMode44);
        java.lang.String str60 = org.jsoup.nodes.Entities.escape("", charsetEncoder13, escapeMode44);
        java.lang.String str61 = org.jsoup.nodes.Entities.escape("", charsetEncoder11, escapeMode44);
        java.lang.String str62 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode44);
        java.lang.String str63 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode44);
        java.lang.String str64 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode44);
        java.lang.String str65 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode44);
        java.lang.String str66 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode44);
        java.lang.Class<?> wildcardClass67 = escapeMode44.getClass();
        org.junit.Assert.assertTrue("'" + escapeMode44 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.extended + "'", escapeMode44.equals(org.jsoup.nodes.Entities.EscapeMode.extended));
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
        org.junit.Assert.assertNotNull(wildcardClass67);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        java.nio.charset.CharsetEncoder charsetEncoder11 = null;
        java.nio.charset.CharsetEncoder charsetEncoder13 = null;
        java.nio.charset.CharsetEncoder charsetEncoder15 = null;
        java.nio.charset.CharsetEncoder charsetEncoder17 = null;
        java.nio.charset.CharsetEncoder charsetEncoder19 = null;
        java.nio.charset.CharsetEncoder charsetEncoder21 = null;
        java.nio.charset.CharsetEncoder charsetEncoder23 = null;
        java.nio.charset.CharsetEncoder charsetEncoder25 = null;
        java.nio.charset.CharsetEncoder charsetEncoder27 = null;
        java.nio.charset.CharsetEncoder charsetEncoder29 = null;
        java.nio.charset.CharsetEncoder charsetEncoder31 = null;
        java.nio.charset.CharsetEncoder charsetEncoder33 = null;
        java.nio.charset.CharsetEncoder charsetEncoder35 = null;
        java.nio.charset.CharsetEncoder charsetEncoder37 = null;
        java.nio.charset.CharsetEncoder charsetEncoder39 = null;
        java.nio.charset.CharsetEncoder charsetEncoder41 = null;
        java.nio.charset.CharsetEncoder charsetEncoder43 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode44 = org.jsoup.nodes.Entities.EscapeMode.extended;
        java.lang.String str45 = org.jsoup.nodes.Entities.escape("", charsetEncoder43, escapeMode44);
        java.lang.String str46 = org.jsoup.nodes.Entities.escape("", charsetEncoder41, escapeMode44);
        java.lang.String str47 = org.jsoup.nodes.Entities.escape("", charsetEncoder39, escapeMode44);
        java.lang.String str48 = org.jsoup.nodes.Entities.escape("", charsetEncoder37, escapeMode44);
        java.lang.String str49 = org.jsoup.nodes.Entities.escape("", charsetEncoder35, escapeMode44);
        java.lang.String str50 = org.jsoup.nodes.Entities.escape("", charsetEncoder33, escapeMode44);
        java.lang.String str51 = org.jsoup.nodes.Entities.escape("", charsetEncoder31, escapeMode44);
        java.lang.String str52 = org.jsoup.nodes.Entities.escape("", charsetEncoder29, escapeMode44);
        java.lang.String str53 = org.jsoup.nodes.Entities.escape("", charsetEncoder27, escapeMode44);
        java.lang.String str54 = org.jsoup.nodes.Entities.escape("", charsetEncoder25, escapeMode44);
        java.lang.String str55 = org.jsoup.nodes.Entities.escape("", charsetEncoder23, escapeMode44);
        java.lang.String str56 = org.jsoup.nodes.Entities.escape("", charsetEncoder21, escapeMode44);
        java.lang.String str57 = org.jsoup.nodes.Entities.escape("", charsetEncoder19, escapeMode44);
        java.lang.String str58 = org.jsoup.nodes.Entities.escape("", charsetEncoder17, escapeMode44);
        java.lang.String str59 = org.jsoup.nodes.Entities.escape("", charsetEncoder15, escapeMode44);
        java.lang.String str60 = org.jsoup.nodes.Entities.escape("", charsetEncoder13, escapeMode44);
        java.lang.String str61 = org.jsoup.nodes.Entities.escape("", charsetEncoder11, escapeMode44);
        java.lang.String str62 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode44);
        java.lang.String str63 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode44);
        java.lang.String str64 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode44);
        java.lang.String str65 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode44);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str66 = org.jsoup.nodes.Entities.escape("hi!", charsetEncoder1, escapeMode44);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + escapeMode44 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.extended + "'", escapeMode44.equals(org.jsoup.nodes.Entities.EscapeMode.extended));
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        java.nio.charset.CharsetEncoder charsetEncoder11 = null;
        java.nio.charset.CharsetEncoder charsetEncoder13 = null;
        java.nio.charset.CharsetEncoder charsetEncoder15 = null;
        java.nio.charset.CharsetEncoder charsetEncoder17 = null;
        java.nio.charset.CharsetEncoder charsetEncoder19 = null;
        java.nio.charset.CharsetEncoder charsetEncoder21 = null;
        java.nio.charset.CharsetEncoder charsetEncoder23 = null;
        java.nio.charset.CharsetEncoder charsetEncoder25 = null;
        java.nio.charset.CharsetEncoder charsetEncoder27 = null;
        java.nio.charset.CharsetEncoder charsetEncoder29 = null;
        java.nio.charset.CharsetEncoder charsetEncoder31 = null;
        java.nio.charset.CharsetEncoder charsetEncoder33 = null;
        java.nio.charset.CharsetEncoder charsetEncoder35 = null;
        java.nio.charset.CharsetEncoder charsetEncoder37 = null;
        java.nio.charset.CharsetEncoder charsetEncoder39 = null;
        java.nio.charset.CharsetEncoder charsetEncoder41 = null;
        java.nio.charset.CharsetEncoder charsetEncoder43 = null;
        java.nio.charset.CharsetEncoder charsetEncoder45 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode46 = org.jsoup.nodes.Entities.EscapeMode.extended;
        java.lang.String str47 = org.jsoup.nodes.Entities.escape("", charsetEncoder45, escapeMode46);
        java.lang.String str48 = org.jsoup.nodes.Entities.escape("", charsetEncoder43, escapeMode46);
        java.lang.String str49 = org.jsoup.nodes.Entities.escape("", charsetEncoder41, escapeMode46);
        java.lang.String str50 = org.jsoup.nodes.Entities.escape("", charsetEncoder39, escapeMode46);
        java.lang.String str51 = org.jsoup.nodes.Entities.escape("", charsetEncoder37, escapeMode46);
        java.lang.String str52 = org.jsoup.nodes.Entities.escape("", charsetEncoder35, escapeMode46);
        java.lang.String str53 = org.jsoup.nodes.Entities.escape("", charsetEncoder33, escapeMode46);
        java.lang.String str54 = org.jsoup.nodes.Entities.escape("", charsetEncoder31, escapeMode46);
        java.lang.String str55 = org.jsoup.nodes.Entities.escape("", charsetEncoder29, escapeMode46);
        java.lang.String str56 = org.jsoup.nodes.Entities.escape("", charsetEncoder27, escapeMode46);
        java.lang.String str57 = org.jsoup.nodes.Entities.escape("", charsetEncoder25, escapeMode46);
        java.lang.String str58 = org.jsoup.nodes.Entities.escape("", charsetEncoder23, escapeMode46);
        java.lang.String str59 = org.jsoup.nodes.Entities.escape("", charsetEncoder21, escapeMode46);
        java.lang.String str60 = org.jsoup.nodes.Entities.escape("", charsetEncoder19, escapeMode46);
        java.lang.String str61 = org.jsoup.nodes.Entities.escape("", charsetEncoder17, escapeMode46);
        java.lang.String str62 = org.jsoup.nodes.Entities.escape("", charsetEncoder15, escapeMode46);
        java.lang.String str63 = org.jsoup.nodes.Entities.escape("", charsetEncoder13, escapeMode46);
        java.lang.String str64 = org.jsoup.nodes.Entities.escape("", charsetEncoder11, escapeMode46);
        java.lang.String str65 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode46);
        java.lang.String str66 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode46);
        java.lang.String str67 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode46);
        java.lang.String str68 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode46);
        java.lang.String str69 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode46);
        java.lang.Class<?> wildcardClass70 = escapeMode46.getClass();
        org.junit.Assert.assertTrue("'" + escapeMode46 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.extended + "'", escapeMode46.equals(org.jsoup.nodes.Entities.EscapeMode.extended));
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "" + "'", str68, "");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
        org.junit.Assert.assertNotNull(wildcardClass70);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        java.nio.charset.CharsetEncoder charsetEncoder11 = null;
        java.nio.charset.CharsetEncoder charsetEncoder13 = null;
        java.nio.charset.CharsetEncoder charsetEncoder15 = null;
        java.nio.charset.CharsetEncoder charsetEncoder17 = null;
        java.nio.charset.CharsetEncoder charsetEncoder19 = null;
        java.nio.charset.CharsetEncoder charsetEncoder21 = null;
        java.nio.charset.CharsetEncoder charsetEncoder23 = null;
        java.nio.charset.CharsetEncoder charsetEncoder25 = null;
        java.nio.charset.CharsetEncoder charsetEncoder27 = null;
        java.nio.charset.CharsetEncoder charsetEncoder29 = null;
        java.nio.charset.CharsetEncoder charsetEncoder31 = null;
        java.nio.charset.CharsetEncoder charsetEncoder33 = null;
        java.nio.charset.CharsetEncoder charsetEncoder35 = null;
        java.nio.charset.CharsetEncoder charsetEncoder37 = null;
        java.nio.charset.CharsetEncoder charsetEncoder39 = null;
        java.nio.charset.CharsetEncoder charsetEncoder41 = null;
        java.nio.charset.CharsetEncoder charsetEncoder43 = null;
        java.nio.charset.CharsetEncoder charsetEncoder45 = null;
        java.nio.charset.CharsetEncoder charsetEncoder47 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode48 = org.jsoup.nodes.Entities.EscapeMode.base;
        java.lang.String str49 = org.jsoup.nodes.Entities.escape("", charsetEncoder47, escapeMode48);
        java.lang.String str50 = org.jsoup.nodes.Entities.escape("", charsetEncoder45, escapeMode48);
        java.lang.String str51 = org.jsoup.nodes.Entities.escape("", charsetEncoder43, escapeMode48);
        java.lang.String str52 = org.jsoup.nodes.Entities.escape("", charsetEncoder41, escapeMode48);
        java.lang.String str53 = org.jsoup.nodes.Entities.escape("", charsetEncoder39, escapeMode48);
        java.lang.String str54 = org.jsoup.nodes.Entities.escape("", charsetEncoder37, escapeMode48);
        java.lang.String str55 = org.jsoup.nodes.Entities.escape("", charsetEncoder35, escapeMode48);
        java.lang.String str56 = org.jsoup.nodes.Entities.escape("", charsetEncoder33, escapeMode48);
        java.lang.String str57 = org.jsoup.nodes.Entities.escape("", charsetEncoder31, escapeMode48);
        java.lang.String str58 = org.jsoup.nodes.Entities.escape("", charsetEncoder29, escapeMode48);
        java.lang.String str59 = org.jsoup.nodes.Entities.escape("", charsetEncoder27, escapeMode48);
        java.lang.String str60 = org.jsoup.nodes.Entities.escape("", charsetEncoder25, escapeMode48);
        java.lang.String str61 = org.jsoup.nodes.Entities.escape("", charsetEncoder23, escapeMode48);
        java.lang.String str62 = org.jsoup.nodes.Entities.escape("", charsetEncoder21, escapeMode48);
        java.lang.String str63 = org.jsoup.nodes.Entities.escape("", charsetEncoder19, escapeMode48);
        java.lang.String str64 = org.jsoup.nodes.Entities.escape("", charsetEncoder17, escapeMode48);
        java.lang.String str65 = org.jsoup.nodes.Entities.escape("", charsetEncoder15, escapeMode48);
        java.lang.String str66 = org.jsoup.nodes.Entities.escape("", charsetEncoder13, escapeMode48);
        java.lang.String str67 = org.jsoup.nodes.Entities.escape("", charsetEncoder11, escapeMode48);
        java.lang.String str68 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode48);
        java.lang.String str69 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode48);
        java.lang.String str70 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode48);
        java.lang.String str71 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode48);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str72 = org.jsoup.nodes.Entities.escape("hi!", charsetEncoder1, escapeMode48);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + escapeMode48 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode48.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "" + "'", str68, "");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        java.nio.charset.CharsetEncoder charsetEncoder11 = null;
        java.nio.charset.CharsetEncoder charsetEncoder13 = null;
        java.nio.charset.CharsetEncoder charsetEncoder15 = null;
        java.nio.charset.CharsetEncoder charsetEncoder17 = null;
        java.nio.charset.CharsetEncoder charsetEncoder19 = null;
        java.nio.charset.CharsetEncoder charsetEncoder21 = null;
        java.nio.charset.CharsetEncoder charsetEncoder23 = null;
        java.nio.charset.CharsetEncoder charsetEncoder25 = null;
        java.nio.charset.CharsetEncoder charsetEncoder27 = null;
        java.nio.charset.CharsetEncoder charsetEncoder29 = null;
        java.nio.charset.CharsetEncoder charsetEncoder31 = null;
        java.nio.charset.CharsetEncoder charsetEncoder33 = null;
        java.nio.charset.CharsetEncoder charsetEncoder35 = null;
        java.nio.charset.CharsetEncoder charsetEncoder37 = null;
        java.nio.charset.CharsetEncoder charsetEncoder39 = null;
        java.nio.charset.CharsetEncoder charsetEncoder41 = null;
        java.nio.charset.CharsetEncoder charsetEncoder43 = null;
        java.nio.charset.CharsetEncoder charsetEncoder45 = null;
        java.nio.charset.CharsetEncoder charsetEncoder47 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode48 = org.jsoup.nodes.Entities.EscapeMode.base;
        java.lang.String str49 = org.jsoup.nodes.Entities.escape("", charsetEncoder47, escapeMode48);
        java.lang.String str50 = org.jsoup.nodes.Entities.escape("", charsetEncoder45, escapeMode48);
        java.lang.String str51 = org.jsoup.nodes.Entities.escape("", charsetEncoder43, escapeMode48);
        java.lang.String str52 = org.jsoup.nodes.Entities.escape("", charsetEncoder41, escapeMode48);
        java.lang.String str53 = org.jsoup.nodes.Entities.escape("", charsetEncoder39, escapeMode48);
        java.lang.String str54 = org.jsoup.nodes.Entities.escape("", charsetEncoder37, escapeMode48);
        java.lang.String str55 = org.jsoup.nodes.Entities.escape("", charsetEncoder35, escapeMode48);
        java.lang.String str56 = org.jsoup.nodes.Entities.escape("", charsetEncoder33, escapeMode48);
        java.lang.String str57 = org.jsoup.nodes.Entities.escape("", charsetEncoder31, escapeMode48);
        java.lang.String str58 = org.jsoup.nodes.Entities.escape("", charsetEncoder29, escapeMode48);
        java.lang.String str59 = org.jsoup.nodes.Entities.escape("", charsetEncoder27, escapeMode48);
        java.lang.String str60 = org.jsoup.nodes.Entities.escape("", charsetEncoder25, escapeMode48);
        java.lang.String str61 = org.jsoup.nodes.Entities.escape("", charsetEncoder23, escapeMode48);
        java.lang.String str62 = org.jsoup.nodes.Entities.escape("", charsetEncoder21, escapeMode48);
        java.lang.String str63 = org.jsoup.nodes.Entities.escape("", charsetEncoder19, escapeMode48);
        java.lang.String str64 = org.jsoup.nodes.Entities.escape("", charsetEncoder17, escapeMode48);
        java.lang.String str65 = org.jsoup.nodes.Entities.escape("", charsetEncoder15, escapeMode48);
        java.lang.String str66 = org.jsoup.nodes.Entities.escape("", charsetEncoder13, escapeMode48);
        java.lang.String str67 = org.jsoup.nodes.Entities.escape("", charsetEncoder11, escapeMode48);
        java.lang.String str68 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode48);
        java.lang.String str69 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode48);
        java.lang.String str70 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode48);
        java.lang.String str71 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode48);
        java.lang.String str72 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode48);
        java.lang.Class<?> wildcardClass73 = escapeMode48.getClass();
        org.junit.Assert.assertTrue("'" + escapeMode48 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode48.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "" + "'", str68, "");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "" + "'", str72, "");
        org.junit.Assert.assertNotNull(wildcardClass73);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        java.nio.charset.CharsetEncoder charsetEncoder11 = null;
        java.nio.charset.CharsetEncoder charsetEncoder13 = null;
        java.nio.charset.CharsetEncoder charsetEncoder15 = null;
        java.nio.charset.CharsetEncoder charsetEncoder17 = null;
        java.nio.charset.CharsetEncoder charsetEncoder19 = null;
        java.nio.charset.CharsetEncoder charsetEncoder21 = null;
        java.nio.charset.CharsetEncoder charsetEncoder23 = null;
        java.nio.charset.CharsetEncoder charsetEncoder25 = null;
        java.nio.charset.CharsetEncoder charsetEncoder27 = null;
        java.nio.charset.CharsetEncoder charsetEncoder29 = null;
        java.nio.charset.CharsetEncoder charsetEncoder31 = null;
        java.nio.charset.CharsetEncoder charsetEncoder33 = null;
        java.nio.charset.CharsetEncoder charsetEncoder35 = null;
        java.nio.charset.CharsetEncoder charsetEncoder37 = null;
        java.nio.charset.CharsetEncoder charsetEncoder39 = null;
        java.nio.charset.CharsetEncoder charsetEncoder41 = null;
        java.nio.charset.CharsetEncoder charsetEncoder43 = null;
        java.nio.charset.CharsetEncoder charsetEncoder45 = null;
        java.nio.charset.CharsetEncoder charsetEncoder47 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode48 = org.jsoup.nodes.Entities.EscapeMode.extended;
        java.lang.String str49 = org.jsoup.nodes.Entities.escape("", charsetEncoder47, escapeMode48);
        java.lang.String str50 = org.jsoup.nodes.Entities.escape("", charsetEncoder45, escapeMode48);
        java.lang.String str51 = org.jsoup.nodes.Entities.escape("", charsetEncoder43, escapeMode48);
        java.lang.String str52 = org.jsoup.nodes.Entities.escape("", charsetEncoder41, escapeMode48);
        java.lang.String str53 = org.jsoup.nodes.Entities.escape("", charsetEncoder39, escapeMode48);
        java.lang.String str54 = org.jsoup.nodes.Entities.escape("", charsetEncoder37, escapeMode48);
        java.lang.String str55 = org.jsoup.nodes.Entities.escape("", charsetEncoder35, escapeMode48);
        java.lang.String str56 = org.jsoup.nodes.Entities.escape("", charsetEncoder33, escapeMode48);
        java.lang.String str57 = org.jsoup.nodes.Entities.escape("", charsetEncoder31, escapeMode48);
        java.lang.String str58 = org.jsoup.nodes.Entities.escape("", charsetEncoder29, escapeMode48);
        java.lang.String str59 = org.jsoup.nodes.Entities.escape("", charsetEncoder27, escapeMode48);
        java.lang.String str60 = org.jsoup.nodes.Entities.escape("", charsetEncoder25, escapeMode48);
        java.lang.String str61 = org.jsoup.nodes.Entities.escape("", charsetEncoder23, escapeMode48);
        java.lang.String str62 = org.jsoup.nodes.Entities.escape("", charsetEncoder21, escapeMode48);
        java.lang.String str63 = org.jsoup.nodes.Entities.escape("", charsetEncoder19, escapeMode48);
        java.lang.String str64 = org.jsoup.nodes.Entities.escape("", charsetEncoder17, escapeMode48);
        java.lang.String str65 = org.jsoup.nodes.Entities.escape("", charsetEncoder15, escapeMode48);
        java.lang.String str66 = org.jsoup.nodes.Entities.escape("", charsetEncoder13, escapeMode48);
        java.lang.String str67 = org.jsoup.nodes.Entities.escape("", charsetEncoder11, escapeMode48);
        java.lang.String str68 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode48);
        java.lang.String str69 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode48);
        java.lang.String str70 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode48);
        java.lang.String str71 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode48);
        java.lang.String str72 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode48);
        java.lang.Class<?> wildcardClass73 = escapeMode48.getClass();
        org.junit.Assert.assertTrue("'" + escapeMode48 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.extended + "'", escapeMode48.equals(org.jsoup.nodes.Entities.EscapeMode.extended));
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "" + "'", str68, "");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "" + "'", str72, "");
        org.junit.Assert.assertNotNull(wildcardClass73);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        java.nio.charset.CharsetEncoder charsetEncoder11 = null;
        java.nio.charset.CharsetEncoder charsetEncoder13 = null;
        java.nio.charset.CharsetEncoder charsetEncoder15 = null;
        java.nio.charset.CharsetEncoder charsetEncoder17 = null;
        java.nio.charset.CharsetEncoder charsetEncoder19 = null;
        java.nio.charset.CharsetEncoder charsetEncoder21 = null;
        java.nio.charset.CharsetEncoder charsetEncoder23 = null;
        java.nio.charset.CharsetEncoder charsetEncoder25 = null;
        java.nio.charset.CharsetEncoder charsetEncoder27 = null;
        java.nio.charset.CharsetEncoder charsetEncoder29 = null;
        java.nio.charset.CharsetEncoder charsetEncoder31 = null;
        java.nio.charset.CharsetEncoder charsetEncoder33 = null;
        java.nio.charset.CharsetEncoder charsetEncoder35 = null;
        java.nio.charset.CharsetEncoder charsetEncoder37 = null;
        java.nio.charset.CharsetEncoder charsetEncoder39 = null;
        java.nio.charset.CharsetEncoder charsetEncoder41 = null;
        java.nio.charset.CharsetEncoder charsetEncoder43 = null;
        java.nio.charset.CharsetEncoder charsetEncoder45 = null;
        java.nio.charset.CharsetEncoder charsetEncoder47 = null;
        java.nio.charset.CharsetEncoder charsetEncoder49 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode50 = org.jsoup.nodes.Entities.EscapeMode.base;
        java.lang.String str51 = org.jsoup.nodes.Entities.escape("", charsetEncoder49, escapeMode50);
        java.lang.String str52 = org.jsoup.nodes.Entities.escape("", charsetEncoder47, escapeMode50);
        java.lang.String str53 = org.jsoup.nodes.Entities.escape("", charsetEncoder45, escapeMode50);
        java.lang.String str54 = org.jsoup.nodes.Entities.escape("", charsetEncoder43, escapeMode50);
        java.lang.String str55 = org.jsoup.nodes.Entities.escape("", charsetEncoder41, escapeMode50);
        java.lang.String str56 = org.jsoup.nodes.Entities.escape("", charsetEncoder39, escapeMode50);
        java.lang.String str57 = org.jsoup.nodes.Entities.escape("", charsetEncoder37, escapeMode50);
        java.lang.String str58 = org.jsoup.nodes.Entities.escape("", charsetEncoder35, escapeMode50);
        java.lang.String str59 = org.jsoup.nodes.Entities.escape("", charsetEncoder33, escapeMode50);
        java.lang.String str60 = org.jsoup.nodes.Entities.escape("", charsetEncoder31, escapeMode50);
        java.lang.String str61 = org.jsoup.nodes.Entities.escape("", charsetEncoder29, escapeMode50);
        java.lang.String str62 = org.jsoup.nodes.Entities.escape("", charsetEncoder27, escapeMode50);
        java.lang.String str63 = org.jsoup.nodes.Entities.escape("", charsetEncoder25, escapeMode50);
        java.lang.String str64 = org.jsoup.nodes.Entities.escape("", charsetEncoder23, escapeMode50);
        java.lang.String str65 = org.jsoup.nodes.Entities.escape("", charsetEncoder21, escapeMode50);
        java.lang.String str66 = org.jsoup.nodes.Entities.escape("", charsetEncoder19, escapeMode50);
        java.lang.String str67 = org.jsoup.nodes.Entities.escape("", charsetEncoder17, escapeMode50);
        java.lang.String str68 = org.jsoup.nodes.Entities.escape("", charsetEncoder15, escapeMode50);
        java.lang.String str69 = org.jsoup.nodes.Entities.escape("", charsetEncoder13, escapeMode50);
        java.lang.String str70 = org.jsoup.nodes.Entities.escape("", charsetEncoder11, escapeMode50);
        java.lang.String str71 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode50);
        java.lang.String str72 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode50);
        java.lang.String str73 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode50);
        java.lang.String str74 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode50);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str75 = org.jsoup.nodes.Entities.escape("hi!", charsetEncoder1, escapeMode50);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + escapeMode50 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode50.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "" + "'", str68, "");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "" + "'", str72, "");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "" + "'", str73, "");
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "" + "'", str74, "");
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        java.nio.charset.CharsetEncoder charsetEncoder11 = null;
        java.nio.charset.CharsetEncoder charsetEncoder13 = null;
        java.nio.charset.CharsetEncoder charsetEncoder15 = null;
        java.nio.charset.CharsetEncoder charsetEncoder17 = null;
        java.nio.charset.CharsetEncoder charsetEncoder19 = null;
        java.nio.charset.CharsetEncoder charsetEncoder21 = null;
        java.nio.charset.CharsetEncoder charsetEncoder23 = null;
        java.nio.charset.CharsetEncoder charsetEncoder25 = null;
        java.nio.charset.CharsetEncoder charsetEncoder27 = null;
        java.nio.charset.CharsetEncoder charsetEncoder29 = null;
        java.nio.charset.CharsetEncoder charsetEncoder31 = null;
        java.nio.charset.CharsetEncoder charsetEncoder33 = null;
        java.nio.charset.CharsetEncoder charsetEncoder35 = null;
        java.nio.charset.CharsetEncoder charsetEncoder37 = null;
        java.nio.charset.CharsetEncoder charsetEncoder39 = null;
        java.nio.charset.CharsetEncoder charsetEncoder41 = null;
        java.nio.charset.CharsetEncoder charsetEncoder43 = null;
        java.nio.charset.CharsetEncoder charsetEncoder45 = null;
        java.nio.charset.CharsetEncoder charsetEncoder47 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode48 = org.jsoup.nodes.Entities.EscapeMode.extended;
        java.lang.String str49 = org.jsoup.nodes.Entities.escape("", charsetEncoder47, escapeMode48);
        java.lang.String str50 = org.jsoup.nodes.Entities.escape("", charsetEncoder45, escapeMode48);
        java.lang.String str51 = org.jsoup.nodes.Entities.escape("", charsetEncoder43, escapeMode48);
        java.lang.String str52 = org.jsoup.nodes.Entities.escape("", charsetEncoder41, escapeMode48);
        java.lang.String str53 = org.jsoup.nodes.Entities.escape("", charsetEncoder39, escapeMode48);
        java.lang.String str54 = org.jsoup.nodes.Entities.escape("", charsetEncoder37, escapeMode48);
        java.lang.String str55 = org.jsoup.nodes.Entities.escape("", charsetEncoder35, escapeMode48);
        java.lang.String str56 = org.jsoup.nodes.Entities.escape("", charsetEncoder33, escapeMode48);
        java.lang.String str57 = org.jsoup.nodes.Entities.escape("", charsetEncoder31, escapeMode48);
        java.lang.String str58 = org.jsoup.nodes.Entities.escape("", charsetEncoder29, escapeMode48);
        java.lang.String str59 = org.jsoup.nodes.Entities.escape("", charsetEncoder27, escapeMode48);
        java.lang.String str60 = org.jsoup.nodes.Entities.escape("", charsetEncoder25, escapeMode48);
        java.lang.String str61 = org.jsoup.nodes.Entities.escape("", charsetEncoder23, escapeMode48);
        java.lang.String str62 = org.jsoup.nodes.Entities.escape("", charsetEncoder21, escapeMode48);
        java.lang.String str63 = org.jsoup.nodes.Entities.escape("", charsetEncoder19, escapeMode48);
        java.lang.String str64 = org.jsoup.nodes.Entities.escape("", charsetEncoder17, escapeMode48);
        java.lang.String str65 = org.jsoup.nodes.Entities.escape("", charsetEncoder15, escapeMode48);
        java.lang.String str66 = org.jsoup.nodes.Entities.escape("", charsetEncoder13, escapeMode48);
        java.lang.String str67 = org.jsoup.nodes.Entities.escape("", charsetEncoder11, escapeMode48);
        java.lang.String str68 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode48);
        java.lang.String str69 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode48);
        java.lang.String str70 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode48);
        java.lang.String str71 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode48);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str72 = org.jsoup.nodes.Entities.escape("hi!", charsetEncoder1, escapeMode48);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + escapeMode48 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.extended + "'", escapeMode48.equals(org.jsoup.nodes.Entities.EscapeMode.extended));
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "" + "'", str68, "");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        java.nio.charset.CharsetEncoder charsetEncoder11 = null;
        java.nio.charset.CharsetEncoder charsetEncoder13 = null;
        java.nio.charset.CharsetEncoder charsetEncoder15 = null;
        java.nio.charset.CharsetEncoder charsetEncoder17 = null;
        java.nio.charset.CharsetEncoder charsetEncoder19 = null;
        java.nio.charset.CharsetEncoder charsetEncoder21 = null;
        java.nio.charset.CharsetEncoder charsetEncoder23 = null;
        java.nio.charset.CharsetEncoder charsetEncoder25 = null;
        java.nio.charset.CharsetEncoder charsetEncoder27 = null;
        java.nio.charset.CharsetEncoder charsetEncoder29 = null;
        java.nio.charset.CharsetEncoder charsetEncoder31 = null;
        java.nio.charset.CharsetEncoder charsetEncoder33 = null;
        java.nio.charset.CharsetEncoder charsetEncoder35 = null;
        java.nio.charset.CharsetEncoder charsetEncoder37 = null;
        java.nio.charset.CharsetEncoder charsetEncoder39 = null;
        java.nio.charset.CharsetEncoder charsetEncoder41 = null;
        java.nio.charset.CharsetEncoder charsetEncoder43 = null;
        java.nio.charset.CharsetEncoder charsetEncoder45 = null;
        java.nio.charset.CharsetEncoder charsetEncoder47 = null;
        java.nio.charset.CharsetEncoder charsetEncoder49 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode50 = org.jsoup.nodes.Entities.EscapeMode.extended;
        java.lang.String str51 = org.jsoup.nodes.Entities.escape("", charsetEncoder49, escapeMode50);
        java.lang.String str52 = org.jsoup.nodes.Entities.escape("", charsetEncoder47, escapeMode50);
        java.lang.String str53 = org.jsoup.nodes.Entities.escape("", charsetEncoder45, escapeMode50);
        java.lang.String str54 = org.jsoup.nodes.Entities.escape("", charsetEncoder43, escapeMode50);
        java.lang.String str55 = org.jsoup.nodes.Entities.escape("", charsetEncoder41, escapeMode50);
        java.lang.String str56 = org.jsoup.nodes.Entities.escape("", charsetEncoder39, escapeMode50);
        java.lang.String str57 = org.jsoup.nodes.Entities.escape("", charsetEncoder37, escapeMode50);
        java.lang.String str58 = org.jsoup.nodes.Entities.escape("", charsetEncoder35, escapeMode50);
        java.lang.String str59 = org.jsoup.nodes.Entities.escape("", charsetEncoder33, escapeMode50);
        java.lang.String str60 = org.jsoup.nodes.Entities.escape("", charsetEncoder31, escapeMode50);
        java.lang.String str61 = org.jsoup.nodes.Entities.escape("", charsetEncoder29, escapeMode50);
        java.lang.String str62 = org.jsoup.nodes.Entities.escape("", charsetEncoder27, escapeMode50);
        java.lang.String str63 = org.jsoup.nodes.Entities.escape("", charsetEncoder25, escapeMode50);
        java.lang.String str64 = org.jsoup.nodes.Entities.escape("", charsetEncoder23, escapeMode50);
        java.lang.String str65 = org.jsoup.nodes.Entities.escape("", charsetEncoder21, escapeMode50);
        java.lang.String str66 = org.jsoup.nodes.Entities.escape("", charsetEncoder19, escapeMode50);
        java.lang.String str67 = org.jsoup.nodes.Entities.escape("", charsetEncoder17, escapeMode50);
        java.lang.String str68 = org.jsoup.nodes.Entities.escape("", charsetEncoder15, escapeMode50);
        java.lang.String str69 = org.jsoup.nodes.Entities.escape("", charsetEncoder13, escapeMode50);
        java.lang.String str70 = org.jsoup.nodes.Entities.escape("", charsetEncoder11, escapeMode50);
        java.lang.String str71 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode50);
        java.lang.String str72 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode50);
        java.lang.String str73 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode50);
        java.lang.String str74 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode50);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str75 = org.jsoup.nodes.Entities.escape("hi!", charsetEncoder1, escapeMode50);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + escapeMode50 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.extended + "'", escapeMode50.equals(org.jsoup.nodes.Entities.EscapeMode.extended));
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "" + "'", str68, "");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "" + "'", str72, "");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "" + "'", str73, "");
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "" + "'", str74, "");
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        java.nio.charset.CharsetEncoder charsetEncoder11 = null;
        java.nio.charset.CharsetEncoder charsetEncoder13 = null;
        java.nio.charset.CharsetEncoder charsetEncoder15 = null;
        java.nio.charset.CharsetEncoder charsetEncoder17 = null;
        java.nio.charset.CharsetEncoder charsetEncoder19 = null;
        java.nio.charset.CharsetEncoder charsetEncoder21 = null;
        java.nio.charset.CharsetEncoder charsetEncoder23 = null;
        java.nio.charset.CharsetEncoder charsetEncoder25 = null;
        java.nio.charset.CharsetEncoder charsetEncoder27 = null;
        java.nio.charset.CharsetEncoder charsetEncoder29 = null;
        java.nio.charset.CharsetEncoder charsetEncoder31 = null;
        java.nio.charset.CharsetEncoder charsetEncoder33 = null;
        java.nio.charset.CharsetEncoder charsetEncoder35 = null;
        java.nio.charset.CharsetEncoder charsetEncoder37 = null;
        java.nio.charset.CharsetEncoder charsetEncoder39 = null;
        java.nio.charset.CharsetEncoder charsetEncoder41 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode42 = org.jsoup.nodes.Entities.EscapeMode.extended;
        java.lang.String str43 = org.jsoup.nodes.Entities.escape("", charsetEncoder41, escapeMode42);
        java.lang.String str44 = org.jsoup.nodes.Entities.escape("", charsetEncoder39, escapeMode42);
        java.lang.String str45 = org.jsoup.nodes.Entities.escape("", charsetEncoder37, escapeMode42);
        java.lang.String str46 = org.jsoup.nodes.Entities.escape("", charsetEncoder35, escapeMode42);
        java.lang.String str47 = org.jsoup.nodes.Entities.escape("", charsetEncoder33, escapeMode42);
        java.lang.String str48 = org.jsoup.nodes.Entities.escape("", charsetEncoder31, escapeMode42);
        java.lang.String str49 = org.jsoup.nodes.Entities.escape("", charsetEncoder29, escapeMode42);
        java.lang.String str50 = org.jsoup.nodes.Entities.escape("", charsetEncoder27, escapeMode42);
        java.lang.String str51 = org.jsoup.nodes.Entities.escape("", charsetEncoder25, escapeMode42);
        java.lang.String str52 = org.jsoup.nodes.Entities.escape("", charsetEncoder23, escapeMode42);
        java.lang.String str53 = org.jsoup.nodes.Entities.escape("", charsetEncoder21, escapeMode42);
        java.lang.String str54 = org.jsoup.nodes.Entities.escape("", charsetEncoder19, escapeMode42);
        java.lang.String str55 = org.jsoup.nodes.Entities.escape("", charsetEncoder17, escapeMode42);
        java.lang.String str56 = org.jsoup.nodes.Entities.escape("", charsetEncoder15, escapeMode42);
        java.lang.String str57 = org.jsoup.nodes.Entities.escape("", charsetEncoder13, escapeMode42);
        java.lang.String str58 = org.jsoup.nodes.Entities.escape("", charsetEncoder11, escapeMode42);
        java.lang.String str59 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode42);
        java.lang.String str60 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode42);
        java.lang.String str61 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode42);
        java.lang.String str62 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode42);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str63 = org.jsoup.nodes.Entities.escape("hi!", charsetEncoder1, escapeMode42);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + escapeMode42 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.extended + "'", escapeMode42.equals(org.jsoup.nodes.Entities.EscapeMode.extended));
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        java.nio.charset.CharsetEncoder charsetEncoder11 = null;
        java.nio.charset.CharsetEncoder charsetEncoder13 = null;
        java.nio.charset.CharsetEncoder charsetEncoder15 = null;
        java.nio.charset.CharsetEncoder charsetEncoder17 = null;
        java.nio.charset.CharsetEncoder charsetEncoder19 = null;
        java.nio.charset.CharsetEncoder charsetEncoder21 = null;
        java.nio.charset.CharsetEncoder charsetEncoder23 = null;
        java.nio.charset.CharsetEncoder charsetEncoder25 = null;
        java.nio.charset.CharsetEncoder charsetEncoder27 = null;
        java.nio.charset.CharsetEncoder charsetEncoder29 = null;
        java.nio.charset.CharsetEncoder charsetEncoder31 = null;
        java.nio.charset.CharsetEncoder charsetEncoder33 = null;
        java.nio.charset.CharsetEncoder charsetEncoder35 = null;
        java.nio.charset.CharsetEncoder charsetEncoder37 = null;
        java.nio.charset.CharsetEncoder charsetEncoder39 = null;
        java.nio.charset.CharsetEncoder charsetEncoder41 = null;
        java.nio.charset.CharsetEncoder charsetEncoder43 = null;
        java.nio.charset.CharsetEncoder charsetEncoder45 = null;
        java.nio.charset.CharsetEncoder charsetEncoder47 = null;
        java.nio.charset.CharsetEncoder charsetEncoder49 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode50 = org.jsoup.nodes.Entities.EscapeMode.base;
        java.lang.String str51 = org.jsoup.nodes.Entities.escape("", charsetEncoder49, escapeMode50);
        java.lang.String str52 = org.jsoup.nodes.Entities.escape("", charsetEncoder47, escapeMode50);
        java.lang.String str53 = org.jsoup.nodes.Entities.escape("", charsetEncoder45, escapeMode50);
        java.lang.String str54 = org.jsoup.nodes.Entities.escape("", charsetEncoder43, escapeMode50);
        java.lang.String str55 = org.jsoup.nodes.Entities.escape("", charsetEncoder41, escapeMode50);
        java.lang.String str56 = org.jsoup.nodes.Entities.escape("", charsetEncoder39, escapeMode50);
        java.lang.String str57 = org.jsoup.nodes.Entities.escape("", charsetEncoder37, escapeMode50);
        java.lang.String str58 = org.jsoup.nodes.Entities.escape("", charsetEncoder35, escapeMode50);
        java.lang.String str59 = org.jsoup.nodes.Entities.escape("", charsetEncoder33, escapeMode50);
        java.lang.String str60 = org.jsoup.nodes.Entities.escape("", charsetEncoder31, escapeMode50);
        java.lang.String str61 = org.jsoup.nodes.Entities.escape("", charsetEncoder29, escapeMode50);
        java.lang.String str62 = org.jsoup.nodes.Entities.escape("", charsetEncoder27, escapeMode50);
        java.lang.String str63 = org.jsoup.nodes.Entities.escape("", charsetEncoder25, escapeMode50);
        java.lang.String str64 = org.jsoup.nodes.Entities.escape("", charsetEncoder23, escapeMode50);
        java.lang.String str65 = org.jsoup.nodes.Entities.escape("", charsetEncoder21, escapeMode50);
        java.lang.String str66 = org.jsoup.nodes.Entities.escape("", charsetEncoder19, escapeMode50);
        java.lang.String str67 = org.jsoup.nodes.Entities.escape("", charsetEncoder17, escapeMode50);
        java.lang.String str68 = org.jsoup.nodes.Entities.escape("", charsetEncoder15, escapeMode50);
        java.lang.String str69 = org.jsoup.nodes.Entities.escape("", charsetEncoder13, escapeMode50);
        java.lang.String str70 = org.jsoup.nodes.Entities.escape("", charsetEncoder11, escapeMode50);
        java.lang.String str71 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode50);
        java.lang.String str72 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode50);
        java.lang.String str73 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode50);
        java.lang.String str74 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode50);
        java.lang.String str75 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode50);
        java.lang.Class<?> wildcardClass76 = escapeMode50.getClass();
        org.junit.Assert.assertTrue("'" + escapeMode50 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode50.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "" + "'", str68, "");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "" + "'", str72, "");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "" + "'", str73, "");
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "" + "'", str74, "");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "" + "'", str75, "");
        org.junit.Assert.assertNotNull(wildcardClass76);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        java.nio.charset.CharsetEncoder charsetEncoder11 = null;
        java.nio.charset.CharsetEncoder charsetEncoder13 = null;
        java.nio.charset.CharsetEncoder charsetEncoder15 = null;
        java.nio.charset.CharsetEncoder charsetEncoder17 = null;
        java.nio.charset.CharsetEncoder charsetEncoder19 = null;
        java.nio.charset.CharsetEncoder charsetEncoder21 = null;
        java.nio.charset.CharsetEncoder charsetEncoder23 = null;
        java.nio.charset.CharsetEncoder charsetEncoder25 = null;
        java.nio.charset.CharsetEncoder charsetEncoder27 = null;
        java.nio.charset.CharsetEncoder charsetEncoder29 = null;
        java.nio.charset.CharsetEncoder charsetEncoder31 = null;
        java.nio.charset.CharsetEncoder charsetEncoder33 = null;
        java.nio.charset.CharsetEncoder charsetEncoder35 = null;
        java.nio.charset.CharsetEncoder charsetEncoder37 = null;
        java.nio.charset.CharsetEncoder charsetEncoder39 = null;
        java.nio.charset.CharsetEncoder charsetEncoder41 = null;
        java.nio.charset.CharsetEncoder charsetEncoder43 = null;
        java.nio.charset.CharsetEncoder charsetEncoder45 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode46 = org.jsoup.nodes.Entities.EscapeMode.extended;
        java.lang.String str47 = org.jsoup.nodes.Entities.escape("", charsetEncoder45, escapeMode46);
        java.lang.String str48 = org.jsoup.nodes.Entities.escape("", charsetEncoder43, escapeMode46);
        java.lang.String str49 = org.jsoup.nodes.Entities.escape("", charsetEncoder41, escapeMode46);
        java.lang.String str50 = org.jsoup.nodes.Entities.escape("", charsetEncoder39, escapeMode46);
        java.lang.String str51 = org.jsoup.nodes.Entities.escape("", charsetEncoder37, escapeMode46);
        java.lang.String str52 = org.jsoup.nodes.Entities.escape("", charsetEncoder35, escapeMode46);
        java.lang.String str53 = org.jsoup.nodes.Entities.escape("", charsetEncoder33, escapeMode46);
        java.lang.String str54 = org.jsoup.nodes.Entities.escape("", charsetEncoder31, escapeMode46);
        java.lang.String str55 = org.jsoup.nodes.Entities.escape("", charsetEncoder29, escapeMode46);
        java.lang.String str56 = org.jsoup.nodes.Entities.escape("", charsetEncoder27, escapeMode46);
        java.lang.String str57 = org.jsoup.nodes.Entities.escape("", charsetEncoder25, escapeMode46);
        java.lang.String str58 = org.jsoup.nodes.Entities.escape("", charsetEncoder23, escapeMode46);
        java.lang.String str59 = org.jsoup.nodes.Entities.escape("", charsetEncoder21, escapeMode46);
        java.lang.String str60 = org.jsoup.nodes.Entities.escape("", charsetEncoder19, escapeMode46);
        java.lang.String str61 = org.jsoup.nodes.Entities.escape("", charsetEncoder17, escapeMode46);
        java.lang.String str62 = org.jsoup.nodes.Entities.escape("", charsetEncoder15, escapeMode46);
        java.lang.String str63 = org.jsoup.nodes.Entities.escape("", charsetEncoder13, escapeMode46);
        java.lang.String str64 = org.jsoup.nodes.Entities.escape("", charsetEncoder11, escapeMode46);
        java.lang.String str65 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode46);
        java.lang.String str66 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode46);
        java.lang.String str67 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode46);
        java.lang.String str68 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode46);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str69 = org.jsoup.nodes.Entities.escape("hi!", charsetEncoder1, escapeMode46);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + escapeMode46 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.extended + "'", escapeMode46.equals(org.jsoup.nodes.Entities.EscapeMode.extended));
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "" + "'", str68, "");
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        java.nio.charset.CharsetEncoder charsetEncoder11 = null;
        java.nio.charset.CharsetEncoder charsetEncoder13 = null;
        java.nio.charset.CharsetEncoder charsetEncoder15 = null;
        java.nio.charset.CharsetEncoder charsetEncoder17 = null;
        java.nio.charset.CharsetEncoder charsetEncoder19 = null;
        java.nio.charset.CharsetEncoder charsetEncoder21 = null;
        java.nio.charset.CharsetEncoder charsetEncoder23 = null;
        java.nio.charset.CharsetEncoder charsetEncoder25 = null;
        java.nio.charset.CharsetEncoder charsetEncoder27 = null;
        java.nio.charset.CharsetEncoder charsetEncoder29 = null;
        java.nio.charset.CharsetEncoder charsetEncoder31 = null;
        java.nio.charset.CharsetEncoder charsetEncoder33 = null;
        java.nio.charset.CharsetEncoder charsetEncoder35 = null;
        java.nio.charset.CharsetEncoder charsetEncoder37 = null;
        java.nio.charset.CharsetEncoder charsetEncoder39 = null;
        java.nio.charset.CharsetEncoder charsetEncoder41 = null;
        java.nio.charset.CharsetEncoder charsetEncoder43 = null;
        java.nio.charset.CharsetEncoder charsetEncoder45 = null;
        java.nio.charset.CharsetEncoder charsetEncoder47 = null;
        java.nio.charset.CharsetEncoder charsetEncoder49 = null;
        java.nio.charset.CharsetEncoder charsetEncoder51 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode52 = org.jsoup.nodes.Entities.EscapeMode.base;
        java.lang.String str53 = org.jsoup.nodes.Entities.escape("", charsetEncoder51, escapeMode52);
        java.lang.String str54 = org.jsoup.nodes.Entities.escape("", charsetEncoder49, escapeMode52);
        java.lang.String str55 = org.jsoup.nodes.Entities.escape("", charsetEncoder47, escapeMode52);
        java.lang.String str56 = org.jsoup.nodes.Entities.escape("", charsetEncoder45, escapeMode52);
        java.lang.String str57 = org.jsoup.nodes.Entities.escape("", charsetEncoder43, escapeMode52);
        java.lang.String str58 = org.jsoup.nodes.Entities.escape("", charsetEncoder41, escapeMode52);
        java.lang.String str59 = org.jsoup.nodes.Entities.escape("", charsetEncoder39, escapeMode52);
        java.lang.String str60 = org.jsoup.nodes.Entities.escape("", charsetEncoder37, escapeMode52);
        java.lang.String str61 = org.jsoup.nodes.Entities.escape("", charsetEncoder35, escapeMode52);
        java.lang.String str62 = org.jsoup.nodes.Entities.escape("", charsetEncoder33, escapeMode52);
        java.lang.String str63 = org.jsoup.nodes.Entities.escape("", charsetEncoder31, escapeMode52);
        java.lang.String str64 = org.jsoup.nodes.Entities.escape("", charsetEncoder29, escapeMode52);
        java.lang.String str65 = org.jsoup.nodes.Entities.escape("", charsetEncoder27, escapeMode52);
        java.lang.String str66 = org.jsoup.nodes.Entities.escape("", charsetEncoder25, escapeMode52);
        java.lang.String str67 = org.jsoup.nodes.Entities.escape("", charsetEncoder23, escapeMode52);
        java.lang.String str68 = org.jsoup.nodes.Entities.escape("", charsetEncoder21, escapeMode52);
        java.lang.String str69 = org.jsoup.nodes.Entities.escape("", charsetEncoder19, escapeMode52);
        java.lang.String str70 = org.jsoup.nodes.Entities.escape("", charsetEncoder17, escapeMode52);
        java.lang.String str71 = org.jsoup.nodes.Entities.escape("", charsetEncoder15, escapeMode52);
        java.lang.String str72 = org.jsoup.nodes.Entities.escape("", charsetEncoder13, escapeMode52);
        java.lang.String str73 = org.jsoup.nodes.Entities.escape("", charsetEncoder11, escapeMode52);
        java.lang.String str74 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode52);
        java.lang.String str75 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode52);
        java.lang.String str76 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode52);
        java.lang.String str77 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode52);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str78 = org.jsoup.nodes.Entities.escape("hi!", charsetEncoder1, escapeMode52);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + escapeMode52 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode52.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "" + "'", str68, "");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "" + "'", str72, "");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "" + "'", str73, "");
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "" + "'", str74, "");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "" + "'", str75, "");
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "" + "'", str76, "");
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "" + "'", str77, "");
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        java.nio.charset.CharsetEncoder charsetEncoder11 = null;
        java.nio.charset.CharsetEncoder charsetEncoder13 = null;
        java.nio.charset.CharsetEncoder charsetEncoder15 = null;
        java.nio.charset.CharsetEncoder charsetEncoder17 = null;
        java.nio.charset.CharsetEncoder charsetEncoder19 = null;
        java.nio.charset.CharsetEncoder charsetEncoder21 = null;
        java.nio.charset.CharsetEncoder charsetEncoder23 = null;
        java.nio.charset.CharsetEncoder charsetEncoder25 = null;
        java.nio.charset.CharsetEncoder charsetEncoder27 = null;
        java.nio.charset.CharsetEncoder charsetEncoder29 = null;
        java.nio.charset.CharsetEncoder charsetEncoder31 = null;
        java.nio.charset.CharsetEncoder charsetEncoder33 = null;
        java.nio.charset.CharsetEncoder charsetEncoder35 = null;
        java.nio.charset.CharsetEncoder charsetEncoder37 = null;
        java.nio.charset.CharsetEncoder charsetEncoder39 = null;
        java.nio.charset.CharsetEncoder charsetEncoder41 = null;
        java.nio.charset.CharsetEncoder charsetEncoder43 = null;
        java.nio.charset.CharsetEncoder charsetEncoder45 = null;
        java.nio.charset.CharsetEncoder charsetEncoder47 = null;
        java.nio.charset.CharsetEncoder charsetEncoder49 = null;
        java.nio.charset.CharsetEncoder charsetEncoder51 = null;
        java.nio.charset.CharsetEncoder charsetEncoder53 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode54 = org.jsoup.nodes.Entities.EscapeMode.base;
        java.lang.String str55 = org.jsoup.nodes.Entities.escape("", charsetEncoder53, escapeMode54);
        java.lang.String str56 = org.jsoup.nodes.Entities.escape("", charsetEncoder51, escapeMode54);
        java.lang.String str57 = org.jsoup.nodes.Entities.escape("", charsetEncoder49, escapeMode54);
        java.lang.String str58 = org.jsoup.nodes.Entities.escape("", charsetEncoder47, escapeMode54);
        java.lang.String str59 = org.jsoup.nodes.Entities.escape("", charsetEncoder45, escapeMode54);
        java.lang.String str60 = org.jsoup.nodes.Entities.escape("", charsetEncoder43, escapeMode54);
        java.lang.String str61 = org.jsoup.nodes.Entities.escape("", charsetEncoder41, escapeMode54);
        java.lang.String str62 = org.jsoup.nodes.Entities.escape("", charsetEncoder39, escapeMode54);
        java.lang.String str63 = org.jsoup.nodes.Entities.escape("", charsetEncoder37, escapeMode54);
        java.lang.String str64 = org.jsoup.nodes.Entities.escape("", charsetEncoder35, escapeMode54);
        java.lang.String str65 = org.jsoup.nodes.Entities.escape("", charsetEncoder33, escapeMode54);
        java.lang.String str66 = org.jsoup.nodes.Entities.escape("", charsetEncoder31, escapeMode54);
        java.lang.String str67 = org.jsoup.nodes.Entities.escape("", charsetEncoder29, escapeMode54);
        java.lang.String str68 = org.jsoup.nodes.Entities.escape("", charsetEncoder27, escapeMode54);
        java.lang.String str69 = org.jsoup.nodes.Entities.escape("", charsetEncoder25, escapeMode54);
        java.lang.String str70 = org.jsoup.nodes.Entities.escape("", charsetEncoder23, escapeMode54);
        java.lang.String str71 = org.jsoup.nodes.Entities.escape("", charsetEncoder21, escapeMode54);
        java.lang.String str72 = org.jsoup.nodes.Entities.escape("", charsetEncoder19, escapeMode54);
        java.lang.String str73 = org.jsoup.nodes.Entities.escape("", charsetEncoder17, escapeMode54);
        java.lang.String str74 = org.jsoup.nodes.Entities.escape("", charsetEncoder15, escapeMode54);
        java.lang.String str75 = org.jsoup.nodes.Entities.escape("", charsetEncoder13, escapeMode54);
        java.lang.String str76 = org.jsoup.nodes.Entities.escape("", charsetEncoder11, escapeMode54);
        java.lang.String str77 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode54);
        java.lang.String str78 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode54);
        java.lang.String str79 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode54);
        java.lang.String str80 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode54);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str81 = org.jsoup.nodes.Entities.escape("hi!", charsetEncoder1, escapeMode54);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + escapeMode54 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode54.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "" + "'", str68, "");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "" + "'", str72, "");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "" + "'", str73, "");
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "" + "'", str74, "");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "" + "'", str75, "");
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "" + "'", str76, "");
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "" + "'", str77, "");
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "" + "'", str78, "");
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "" + "'", str79, "");
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "" + "'", str80, "");
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        java.nio.charset.CharsetEncoder charsetEncoder11 = null;
        java.nio.charset.CharsetEncoder charsetEncoder13 = null;
        java.nio.charset.CharsetEncoder charsetEncoder15 = null;
        java.nio.charset.CharsetEncoder charsetEncoder17 = null;
        java.nio.charset.CharsetEncoder charsetEncoder19 = null;
        java.nio.charset.CharsetEncoder charsetEncoder21 = null;
        java.nio.charset.CharsetEncoder charsetEncoder23 = null;
        java.nio.charset.CharsetEncoder charsetEncoder25 = null;
        java.nio.charset.CharsetEncoder charsetEncoder27 = null;
        java.nio.charset.CharsetEncoder charsetEncoder29 = null;
        java.nio.charset.CharsetEncoder charsetEncoder31 = null;
        java.nio.charset.CharsetEncoder charsetEncoder33 = null;
        java.nio.charset.CharsetEncoder charsetEncoder35 = null;
        java.nio.charset.CharsetEncoder charsetEncoder37 = null;
        java.nio.charset.CharsetEncoder charsetEncoder39 = null;
        java.nio.charset.CharsetEncoder charsetEncoder41 = null;
        java.nio.charset.CharsetEncoder charsetEncoder43 = null;
        java.nio.charset.CharsetEncoder charsetEncoder45 = null;
        java.nio.charset.CharsetEncoder charsetEncoder47 = null;
        java.nio.charset.CharsetEncoder charsetEncoder49 = null;
        java.nio.charset.CharsetEncoder charsetEncoder51 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode52 = org.jsoup.nodes.Entities.EscapeMode.extended;
        java.lang.String str53 = org.jsoup.nodes.Entities.escape("", charsetEncoder51, escapeMode52);
        java.lang.String str54 = org.jsoup.nodes.Entities.escape("", charsetEncoder49, escapeMode52);
        java.lang.String str55 = org.jsoup.nodes.Entities.escape("", charsetEncoder47, escapeMode52);
        java.lang.String str56 = org.jsoup.nodes.Entities.escape("", charsetEncoder45, escapeMode52);
        java.lang.String str57 = org.jsoup.nodes.Entities.escape("", charsetEncoder43, escapeMode52);
        java.lang.String str58 = org.jsoup.nodes.Entities.escape("", charsetEncoder41, escapeMode52);
        java.lang.String str59 = org.jsoup.nodes.Entities.escape("", charsetEncoder39, escapeMode52);
        java.lang.String str60 = org.jsoup.nodes.Entities.escape("", charsetEncoder37, escapeMode52);
        java.lang.String str61 = org.jsoup.nodes.Entities.escape("", charsetEncoder35, escapeMode52);
        java.lang.String str62 = org.jsoup.nodes.Entities.escape("", charsetEncoder33, escapeMode52);
        java.lang.String str63 = org.jsoup.nodes.Entities.escape("", charsetEncoder31, escapeMode52);
        java.lang.String str64 = org.jsoup.nodes.Entities.escape("", charsetEncoder29, escapeMode52);
        java.lang.String str65 = org.jsoup.nodes.Entities.escape("", charsetEncoder27, escapeMode52);
        java.lang.String str66 = org.jsoup.nodes.Entities.escape("", charsetEncoder25, escapeMode52);
        java.lang.String str67 = org.jsoup.nodes.Entities.escape("", charsetEncoder23, escapeMode52);
        java.lang.String str68 = org.jsoup.nodes.Entities.escape("", charsetEncoder21, escapeMode52);
        java.lang.String str69 = org.jsoup.nodes.Entities.escape("", charsetEncoder19, escapeMode52);
        java.lang.String str70 = org.jsoup.nodes.Entities.escape("", charsetEncoder17, escapeMode52);
        java.lang.String str71 = org.jsoup.nodes.Entities.escape("", charsetEncoder15, escapeMode52);
        java.lang.String str72 = org.jsoup.nodes.Entities.escape("", charsetEncoder13, escapeMode52);
        java.lang.String str73 = org.jsoup.nodes.Entities.escape("", charsetEncoder11, escapeMode52);
        java.lang.String str74 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode52);
        java.lang.String str75 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode52);
        java.lang.String str76 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode52);
        java.lang.String str77 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode52);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str78 = org.jsoup.nodes.Entities.escape("hi!", charsetEncoder1, escapeMode52);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + escapeMode52 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.extended + "'", escapeMode52.equals(org.jsoup.nodes.Entities.EscapeMode.extended));
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "" + "'", str68, "");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "" + "'", str72, "");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "" + "'", str73, "");
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "" + "'", str74, "");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "" + "'", str75, "");
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "" + "'", str76, "");
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "" + "'", str77, "");
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        java.nio.charset.CharsetEncoder charsetEncoder11 = null;
        java.nio.charset.CharsetEncoder charsetEncoder13 = null;
        java.nio.charset.CharsetEncoder charsetEncoder15 = null;
        java.nio.charset.CharsetEncoder charsetEncoder17 = null;
        java.nio.charset.CharsetEncoder charsetEncoder19 = null;
        java.nio.charset.CharsetEncoder charsetEncoder21 = null;
        java.nio.charset.CharsetEncoder charsetEncoder23 = null;
        java.nio.charset.CharsetEncoder charsetEncoder25 = null;
        java.nio.charset.CharsetEncoder charsetEncoder27 = null;
        java.nio.charset.CharsetEncoder charsetEncoder29 = null;
        java.nio.charset.CharsetEncoder charsetEncoder31 = null;
        java.nio.charset.CharsetEncoder charsetEncoder33 = null;
        java.nio.charset.CharsetEncoder charsetEncoder35 = null;
        java.nio.charset.CharsetEncoder charsetEncoder37 = null;
        java.nio.charset.CharsetEncoder charsetEncoder39 = null;
        java.nio.charset.CharsetEncoder charsetEncoder41 = null;
        java.nio.charset.CharsetEncoder charsetEncoder43 = null;
        java.nio.charset.CharsetEncoder charsetEncoder45 = null;
        java.nio.charset.CharsetEncoder charsetEncoder47 = null;
        java.nio.charset.CharsetEncoder charsetEncoder49 = null;
        java.nio.charset.CharsetEncoder charsetEncoder51 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode52 = org.jsoup.nodes.Entities.EscapeMode.base;
        java.lang.String str53 = org.jsoup.nodes.Entities.escape("", charsetEncoder51, escapeMode52);
        java.lang.String str54 = org.jsoup.nodes.Entities.escape("", charsetEncoder49, escapeMode52);
        java.lang.String str55 = org.jsoup.nodes.Entities.escape("", charsetEncoder47, escapeMode52);
        java.lang.String str56 = org.jsoup.nodes.Entities.escape("", charsetEncoder45, escapeMode52);
        java.lang.String str57 = org.jsoup.nodes.Entities.escape("", charsetEncoder43, escapeMode52);
        java.lang.String str58 = org.jsoup.nodes.Entities.escape("", charsetEncoder41, escapeMode52);
        java.lang.String str59 = org.jsoup.nodes.Entities.escape("", charsetEncoder39, escapeMode52);
        java.lang.String str60 = org.jsoup.nodes.Entities.escape("", charsetEncoder37, escapeMode52);
        java.lang.String str61 = org.jsoup.nodes.Entities.escape("", charsetEncoder35, escapeMode52);
        java.lang.String str62 = org.jsoup.nodes.Entities.escape("", charsetEncoder33, escapeMode52);
        java.lang.String str63 = org.jsoup.nodes.Entities.escape("", charsetEncoder31, escapeMode52);
        java.lang.String str64 = org.jsoup.nodes.Entities.escape("", charsetEncoder29, escapeMode52);
        java.lang.String str65 = org.jsoup.nodes.Entities.escape("", charsetEncoder27, escapeMode52);
        java.lang.String str66 = org.jsoup.nodes.Entities.escape("", charsetEncoder25, escapeMode52);
        java.lang.String str67 = org.jsoup.nodes.Entities.escape("", charsetEncoder23, escapeMode52);
        java.lang.String str68 = org.jsoup.nodes.Entities.escape("", charsetEncoder21, escapeMode52);
        java.lang.String str69 = org.jsoup.nodes.Entities.escape("", charsetEncoder19, escapeMode52);
        java.lang.String str70 = org.jsoup.nodes.Entities.escape("", charsetEncoder17, escapeMode52);
        java.lang.String str71 = org.jsoup.nodes.Entities.escape("", charsetEncoder15, escapeMode52);
        java.lang.String str72 = org.jsoup.nodes.Entities.escape("", charsetEncoder13, escapeMode52);
        java.lang.String str73 = org.jsoup.nodes.Entities.escape("", charsetEncoder11, escapeMode52);
        java.lang.String str74 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode52);
        java.lang.String str75 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode52);
        java.lang.String str76 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode52);
        java.lang.String str77 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode52);
        java.lang.String str78 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode52);
        java.lang.Class<?> wildcardClass79 = escapeMode52.getClass();
        org.junit.Assert.assertTrue("'" + escapeMode52 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode52.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "" + "'", str68, "");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "" + "'", str72, "");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "" + "'", str73, "");
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "" + "'", str74, "");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "" + "'", str75, "");
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "" + "'", str76, "");
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "" + "'", str77, "");
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "" + "'", str78, "");
        org.junit.Assert.assertNotNull(wildcardClass79);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        java.nio.charset.CharsetEncoder charsetEncoder11 = null;
        java.nio.charset.CharsetEncoder charsetEncoder13 = null;
        java.nio.charset.CharsetEncoder charsetEncoder15 = null;
        java.nio.charset.CharsetEncoder charsetEncoder17 = null;
        java.nio.charset.CharsetEncoder charsetEncoder19 = null;
        java.nio.charset.CharsetEncoder charsetEncoder21 = null;
        java.nio.charset.CharsetEncoder charsetEncoder23 = null;
        java.nio.charset.CharsetEncoder charsetEncoder25 = null;
        java.nio.charset.CharsetEncoder charsetEncoder27 = null;
        java.nio.charset.CharsetEncoder charsetEncoder29 = null;
        java.nio.charset.CharsetEncoder charsetEncoder31 = null;
        java.nio.charset.CharsetEncoder charsetEncoder33 = null;
        java.nio.charset.CharsetEncoder charsetEncoder35 = null;
        java.nio.charset.CharsetEncoder charsetEncoder37 = null;
        java.nio.charset.CharsetEncoder charsetEncoder39 = null;
        java.nio.charset.CharsetEncoder charsetEncoder41 = null;
        java.nio.charset.CharsetEncoder charsetEncoder43 = null;
        java.nio.charset.CharsetEncoder charsetEncoder45 = null;
        java.nio.charset.CharsetEncoder charsetEncoder47 = null;
        java.nio.charset.CharsetEncoder charsetEncoder49 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode50 = org.jsoup.nodes.Entities.EscapeMode.extended;
        java.lang.String str51 = org.jsoup.nodes.Entities.escape("", charsetEncoder49, escapeMode50);
        java.lang.String str52 = org.jsoup.nodes.Entities.escape("", charsetEncoder47, escapeMode50);
        java.lang.String str53 = org.jsoup.nodes.Entities.escape("", charsetEncoder45, escapeMode50);
        java.lang.String str54 = org.jsoup.nodes.Entities.escape("", charsetEncoder43, escapeMode50);
        java.lang.String str55 = org.jsoup.nodes.Entities.escape("", charsetEncoder41, escapeMode50);
        java.lang.String str56 = org.jsoup.nodes.Entities.escape("", charsetEncoder39, escapeMode50);
        java.lang.String str57 = org.jsoup.nodes.Entities.escape("", charsetEncoder37, escapeMode50);
        java.lang.String str58 = org.jsoup.nodes.Entities.escape("", charsetEncoder35, escapeMode50);
        java.lang.String str59 = org.jsoup.nodes.Entities.escape("", charsetEncoder33, escapeMode50);
        java.lang.String str60 = org.jsoup.nodes.Entities.escape("", charsetEncoder31, escapeMode50);
        java.lang.String str61 = org.jsoup.nodes.Entities.escape("", charsetEncoder29, escapeMode50);
        java.lang.String str62 = org.jsoup.nodes.Entities.escape("", charsetEncoder27, escapeMode50);
        java.lang.String str63 = org.jsoup.nodes.Entities.escape("", charsetEncoder25, escapeMode50);
        java.lang.String str64 = org.jsoup.nodes.Entities.escape("", charsetEncoder23, escapeMode50);
        java.lang.String str65 = org.jsoup.nodes.Entities.escape("", charsetEncoder21, escapeMode50);
        java.lang.String str66 = org.jsoup.nodes.Entities.escape("", charsetEncoder19, escapeMode50);
        java.lang.String str67 = org.jsoup.nodes.Entities.escape("", charsetEncoder17, escapeMode50);
        java.lang.String str68 = org.jsoup.nodes.Entities.escape("", charsetEncoder15, escapeMode50);
        java.lang.String str69 = org.jsoup.nodes.Entities.escape("", charsetEncoder13, escapeMode50);
        java.lang.String str70 = org.jsoup.nodes.Entities.escape("", charsetEncoder11, escapeMode50);
        java.lang.String str71 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode50);
        java.lang.String str72 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode50);
        java.lang.String str73 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode50);
        java.lang.String str74 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode50);
        java.lang.String str75 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode50);
        java.lang.Class<?> wildcardClass76 = escapeMode50.getClass();
        org.junit.Assert.assertTrue("'" + escapeMode50 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.extended + "'", escapeMode50.equals(org.jsoup.nodes.Entities.EscapeMode.extended));
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "" + "'", str68, "");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "" + "'", str72, "");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "" + "'", str73, "");
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "" + "'", str74, "");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "" + "'", str75, "");
        org.junit.Assert.assertNotNull(wildcardClass76);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        java.nio.charset.CharsetEncoder charsetEncoder11 = null;
        java.nio.charset.CharsetEncoder charsetEncoder13 = null;
        java.nio.charset.CharsetEncoder charsetEncoder15 = null;
        java.nio.charset.CharsetEncoder charsetEncoder17 = null;
        java.nio.charset.CharsetEncoder charsetEncoder19 = null;
        java.nio.charset.CharsetEncoder charsetEncoder21 = null;
        java.nio.charset.CharsetEncoder charsetEncoder23 = null;
        java.nio.charset.CharsetEncoder charsetEncoder25 = null;
        java.nio.charset.CharsetEncoder charsetEncoder27 = null;
        java.nio.charset.CharsetEncoder charsetEncoder29 = null;
        java.nio.charset.CharsetEncoder charsetEncoder31 = null;
        java.nio.charset.CharsetEncoder charsetEncoder33 = null;
        java.nio.charset.CharsetEncoder charsetEncoder35 = null;
        java.nio.charset.CharsetEncoder charsetEncoder37 = null;
        java.nio.charset.CharsetEncoder charsetEncoder39 = null;
        java.nio.charset.CharsetEncoder charsetEncoder41 = null;
        java.nio.charset.CharsetEncoder charsetEncoder43 = null;
        java.nio.charset.CharsetEncoder charsetEncoder45 = null;
        java.nio.charset.CharsetEncoder charsetEncoder47 = null;
        java.nio.charset.CharsetEncoder charsetEncoder49 = null;
        java.nio.charset.CharsetEncoder charsetEncoder51 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode52 = org.jsoup.nodes.Entities.EscapeMode.extended;
        java.lang.String str53 = org.jsoup.nodes.Entities.escape("", charsetEncoder51, escapeMode52);
        java.lang.String str54 = org.jsoup.nodes.Entities.escape("", charsetEncoder49, escapeMode52);
        java.lang.String str55 = org.jsoup.nodes.Entities.escape("", charsetEncoder47, escapeMode52);
        java.lang.String str56 = org.jsoup.nodes.Entities.escape("", charsetEncoder45, escapeMode52);
        java.lang.String str57 = org.jsoup.nodes.Entities.escape("", charsetEncoder43, escapeMode52);
        java.lang.String str58 = org.jsoup.nodes.Entities.escape("", charsetEncoder41, escapeMode52);
        java.lang.String str59 = org.jsoup.nodes.Entities.escape("", charsetEncoder39, escapeMode52);
        java.lang.String str60 = org.jsoup.nodes.Entities.escape("", charsetEncoder37, escapeMode52);
        java.lang.String str61 = org.jsoup.nodes.Entities.escape("", charsetEncoder35, escapeMode52);
        java.lang.String str62 = org.jsoup.nodes.Entities.escape("", charsetEncoder33, escapeMode52);
        java.lang.String str63 = org.jsoup.nodes.Entities.escape("", charsetEncoder31, escapeMode52);
        java.lang.String str64 = org.jsoup.nodes.Entities.escape("", charsetEncoder29, escapeMode52);
        java.lang.String str65 = org.jsoup.nodes.Entities.escape("", charsetEncoder27, escapeMode52);
        java.lang.String str66 = org.jsoup.nodes.Entities.escape("", charsetEncoder25, escapeMode52);
        java.lang.String str67 = org.jsoup.nodes.Entities.escape("", charsetEncoder23, escapeMode52);
        java.lang.String str68 = org.jsoup.nodes.Entities.escape("", charsetEncoder21, escapeMode52);
        java.lang.String str69 = org.jsoup.nodes.Entities.escape("", charsetEncoder19, escapeMode52);
        java.lang.String str70 = org.jsoup.nodes.Entities.escape("", charsetEncoder17, escapeMode52);
        java.lang.String str71 = org.jsoup.nodes.Entities.escape("", charsetEncoder15, escapeMode52);
        java.lang.String str72 = org.jsoup.nodes.Entities.escape("", charsetEncoder13, escapeMode52);
        java.lang.String str73 = org.jsoup.nodes.Entities.escape("", charsetEncoder11, escapeMode52);
        java.lang.String str74 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode52);
        java.lang.String str75 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode52);
        java.lang.String str76 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode52);
        java.lang.String str77 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode52);
        java.lang.String str78 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode52);
        java.lang.Class<?> wildcardClass79 = escapeMode52.getClass();
        org.junit.Assert.assertTrue("'" + escapeMode52 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.extended + "'", escapeMode52.equals(org.jsoup.nodes.Entities.EscapeMode.extended));
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "" + "'", str68, "");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "" + "'", str72, "");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "" + "'", str73, "");
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "" + "'", str74, "");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "" + "'", str75, "");
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "" + "'", str76, "");
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "" + "'", str77, "");
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "" + "'", str78, "");
        org.junit.Assert.assertNotNull(wildcardClass79);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        java.nio.charset.CharsetEncoder charsetEncoder11 = null;
        java.nio.charset.CharsetEncoder charsetEncoder13 = null;
        java.nio.charset.CharsetEncoder charsetEncoder15 = null;
        java.nio.charset.CharsetEncoder charsetEncoder17 = null;
        java.nio.charset.CharsetEncoder charsetEncoder19 = null;
        java.nio.charset.CharsetEncoder charsetEncoder21 = null;
        java.nio.charset.CharsetEncoder charsetEncoder23 = null;
        java.nio.charset.CharsetEncoder charsetEncoder25 = null;
        java.nio.charset.CharsetEncoder charsetEncoder27 = null;
        java.nio.charset.CharsetEncoder charsetEncoder29 = null;
        java.nio.charset.CharsetEncoder charsetEncoder31 = null;
        java.nio.charset.CharsetEncoder charsetEncoder33 = null;
        java.nio.charset.CharsetEncoder charsetEncoder35 = null;
        java.nio.charset.CharsetEncoder charsetEncoder37 = null;
        java.nio.charset.CharsetEncoder charsetEncoder39 = null;
        java.nio.charset.CharsetEncoder charsetEncoder41 = null;
        java.nio.charset.CharsetEncoder charsetEncoder43 = null;
        java.nio.charset.CharsetEncoder charsetEncoder45 = null;
        java.nio.charset.CharsetEncoder charsetEncoder47 = null;
        java.nio.charset.CharsetEncoder charsetEncoder49 = null;
        java.nio.charset.CharsetEncoder charsetEncoder51 = null;
        java.nio.charset.CharsetEncoder charsetEncoder53 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode54 = org.jsoup.nodes.Entities.EscapeMode.base;
        java.lang.String str55 = org.jsoup.nodes.Entities.escape("", charsetEncoder53, escapeMode54);
        java.lang.String str56 = org.jsoup.nodes.Entities.escape("", charsetEncoder51, escapeMode54);
        java.lang.String str57 = org.jsoup.nodes.Entities.escape("", charsetEncoder49, escapeMode54);
        java.lang.String str58 = org.jsoup.nodes.Entities.escape("", charsetEncoder47, escapeMode54);
        java.lang.String str59 = org.jsoup.nodes.Entities.escape("", charsetEncoder45, escapeMode54);
        java.lang.String str60 = org.jsoup.nodes.Entities.escape("", charsetEncoder43, escapeMode54);
        java.lang.String str61 = org.jsoup.nodes.Entities.escape("", charsetEncoder41, escapeMode54);
        java.lang.String str62 = org.jsoup.nodes.Entities.escape("", charsetEncoder39, escapeMode54);
        java.lang.String str63 = org.jsoup.nodes.Entities.escape("", charsetEncoder37, escapeMode54);
        java.lang.String str64 = org.jsoup.nodes.Entities.escape("", charsetEncoder35, escapeMode54);
        java.lang.String str65 = org.jsoup.nodes.Entities.escape("", charsetEncoder33, escapeMode54);
        java.lang.String str66 = org.jsoup.nodes.Entities.escape("", charsetEncoder31, escapeMode54);
        java.lang.String str67 = org.jsoup.nodes.Entities.escape("", charsetEncoder29, escapeMode54);
        java.lang.String str68 = org.jsoup.nodes.Entities.escape("", charsetEncoder27, escapeMode54);
        java.lang.String str69 = org.jsoup.nodes.Entities.escape("", charsetEncoder25, escapeMode54);
        java.lang.String str70 = org.jsoup.nodes.Entities.escape("", charsetEncoder23, escapeMode54);
        java.lang.String str71 = org.jsoup.nodes.Entities.escape("", charsetEncoder21, escapeMode54);
        java.lang.String str72 = org.jsoup.nodes.Entities.escape("", charsetEncoder19, escapeMode54);
        java.lang.String str73 = org.jsoup.nodes.Entities.escape("", charsetEncoder17, escapeMode54);
        java.lang.String str74 = org.jsoup.nodes.Entities.escape("", charsetEncoder15, escapeMode54);
        java.lang.String str75 = org.jsoup.nodes.Entities.escape("", charsetEncoder13, escapeMode54);
        java.lang.String str76 = org.jsoup.nodes.Entities.escape("", charsetEncoder11, escapeMode54);
        java.lang.String str77 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode54);
        java.lang.String str78 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode54);
        java.lang.String str79 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode54);
        java.lang.String str80 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode54);
        java.lang.String str81 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode54);
        java.lang.Class<?> wildcardClass82 = escapeMode54.getClass();
        org.junit.Assert.assertTrue("'" + escapeMode54 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode54.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "" + "'", str68, "");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "" + "'", str72, "");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "" + "'", str73, "");
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "" + "'", str74, "");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "" + "'", str75, "");
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "" + "'", str76, "");
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "" + "'", str77, "");
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "" + "'", str78, "");
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "" + "'", str79, "");
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "" + "'", str80, "");
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "" + "'", str81, "");
        org.junit.Assert.assertNotNull(wildcardClass82);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        java.nio.charset.CharsetEncoder charsetEncoder11 = null;
        java.nio.charset.CharsetEncoder charsetEncoder13 = null;
        java.nio.charset.CharsetEncoder charsetEncoder15 = null;
        java.nio.charset.CharsetEncoder charsetEncoder17 = null;
        java.nio.charset.CharsetEncoder charsetEncoder19 = null;
        java.nio.charset.CharsetEncoder charsetEncoder21 = null;
        java.nio.charset.CharsetEncoder charsetEncoder23 = null;
        java.nio.charset.CharsetEncoder charsetEncoder25 = null;
        java.nio.charset.CharsetEncoder charsetEncoder27 = null;
        java.nio.charset.CharsetEncoder charsetEncoder29 = null;
        java.nio.charset.CharsetEncoder charsetEncoder31 = null;
        java.nio.charset.CharsetEncoder charsetEncoder33 = null;
        java.nio.charset.CharsetEncoder charsetEncoder35 = null;
        java.nio.charset.CharsetEncoder charsetEncoder37 = null;
        java.nio.charset.CharsetEncoder charsetEncoder39 = null;
        java.nio.charset.CharsetEncoder charsetEncoder41 = null;
        java.nio.charset.CharsetEncoder charsetEncoder43 = null;
        java.nio.charset.CharsetEncoder charsetEncoder45 = null;
        java.nio.charset.CharsetEncoder charsetEncoder47 = null;
        java.nio.charset.CharsetEncoder charsetEncoder49 = null;
        java.nio.charset.CharsetEncoder charsetEncoder51 = null;
        java.nio.charset.CharsetEncoder charsetEncoder53 = null;
        java.nio.charset.CharsetEncoder charsetEncoder55 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode56 = org.jsoup.nodes.Entities.EscapeMode.extended;
        java.lang.String str57 = org.jsoup.nodes.Entities.escape("", charsetEncoder55, escapeMode56);
        java.lang.String str58 = org.jsoup.nodes.Entities.escape("", charsetEncoder53, escapeMode56);
        java.lang.String str59 = org.jsoup.nodes.Entities.escape("", charsetEncoder51, escapeMode56);
        java.lang.String str60 = org.jsoup.nodes.Entities.escape("", charsetEncoder49, escapeMode56);
        java.lang.String str61 = org.jsoup.nodes.Entities.escape("", charsetEncoder47, escapeMode56);
        java.lang.String str62 = org.jsoup.nodes.Entities.escape("", charsetEncoder45, escapeMode56);
        java.lang.String str63 = org.jsoup.nodes.Entities.escape("", charsetEncoder43, escapeMode56);
        java.lang.String str64 = org.jsoup.nodes.Entities.escape("", charsetEncoder41, escapeMode56);
        java.lang.String str65 = org.jsoup.nodes.Entities.escape("", charsetEncoder39, escapeMode56);
        java.lang.String str66 = org.jsoup.nodes.Entities.escape("", charsetEncoder37, escapeMode56);
        java.lang.String str67 = org.jsoup.nodes.Entities.escape("", charsetEncoder35, escapeMode56);
        java.lang.String str68 = org.jsoup.nodes.Entities.escape("", charsetEncoder33, escapeMode56);
        java.lang.String str69 = org.jsoup.nodes.Entities.escape("", charsetEncoder31, escapeMode56);
        java.lang.String str70 = org.jsoup.nodes.Entities.escape("", charsetEncoder29, escapeMode56);
        java.lang.String str71 = org.jsoup.nodes.Entities.escape("", charsetEncoder27, escapeMode56);
        java.lang.String str72 = org.jsoup.nodes.Entities.escape("", charsetEncoder25, escapeMode56);
        java.lang.String str73 = org.jsoup.nodes.Entities.escape("", charsetEncoder23, escapeMode56);
        java.lang.String str74 = org.jsoup.nodes.Entities.escape("", charsetEncoder21, escapeMode56);
        java.lang.String str75 = org.jsoup.nodes.Entities.escape("", charsetEncoder19, escapeMode56);
        java.lang.String str76 = org.jsoup.nodes.Entities.escape("", charsetEncoder17, escapeMode56);
        java.lang.String str77 = org.jsoup.nodes.Entities.escape("", charsetEncoder15, escapeMode56);
        java.lang.String str78 = org.jsoup.nodes.Entities.escape("", charsetEncoder13, escapeMode56);
        java.lang.String str79 = org.jsoup.nodes.Entities.escape("", charsetEncoder11, escapeMode56);
        java.lang.String str80 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode56);
        java.lang.String str81 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode56);
        java.lang.String str82 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode56);
        java.lang.String str83 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode56);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str84 = org.jsoup.nodes.Entities.escape("hi!", charsetEncoder1, escapeMode56);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + escapeMode56 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.extended + "'", escapeMode56.equals(org.jsoup.nodes.Entities.EscapeMode.extended));
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "" + "'", str68, "");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "" + "'", str72, "");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "" + "'", str73, "");
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "" + "'", str74, "");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "" + "'", str75, "");
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "" + "'", str76, "");
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "" + "'", str77, "");
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "" + "'", str78, "");
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "" + "'", str79, "");
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "" + "'", str80, "");
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "" + "'", str81, "");
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "" + "'", str82, "");
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "" + "'", str83, "");
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        java.nio.charset.CharsetEncoder charsetEncoder11 = null;
        java.nio.charset.CharsetEncoder charsetEncoder13 = null;
        java.nio.charset.CharsetEncoder charsetEncoder15 = null;
        java.nio.charset.CharsetEncoder charsetEncoder17 = null;
        java.nio.charset.CharsetEncoder charsetEncoder19 = null;
        java.nio.charset.CharsetEncoder charsetEncoder21 = null;
        java.nio.charset.CharsetEncoder charsetEncoder23 = null;
        java.nio.charset.CharsetEncoder charsetEncoder25 = null;
        java.nio.charset.CharsetEncoder charsetEncoder27 = null;
        java.nio.charset.CharsetEncoder charsetEncoder29 = null;
        java.nio.charset.CharsetEncoder charsetEncoder31 = null;
        java.nio.charset.CharsetEncoder charsetEncoder33 = null;
        java.nio.charset.CharsetEncoder charsetEncoder35 = null;
        java.nio.charset.CharsetEncoder charsetEncoder37 = null;
        java.nio.charset.CharsetEncoder charsetEncoder39 = null;
        java.nio.charset.CharsetEncoder charsetEncoder41 = null;
        java.nio.charset.CharsetEncoder charsetEncoder43 = null;
        java.nio.charset.CharsetEncoder charsetEncoder45 = null;
        java.nio.charset.CharsetEncoder charsetEncoder47 = null;
        java.nio.charset.CharsetEncoder charsetEncoder49 = null;
        java.nio.charset.CharsetEncoder charsetEncoder51 = null;
        java.nio.charset.CharsetEncoder charsetEncoder53 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode54 = org.jsoup.nodes.Entities.EscapeMode.extended;
        java.lang.String str55 = org.jsoup.nodes.Entities.escape("", charsetEncoder53, escapeMode54);
        java.lang.String str56 = org.jsoup.nodes.Entities.escape("", charsetEncoder51, escapeMode54);
        java.lang.String str57 = org.jsoup.nodes.Entities.escape("", charsetEncoder49, escapeMode54);
        java.lang.String str58 = org.jsoup.nodes.Entities.escape("", charsetEncoder47, escapeMode54);
        java.lang.String str59 = org.jsoup.nodes.Entities.escape("", charsetEncoder45, escapeMode54);
        java.lang.String str60 = org.jsoup.nodes.Entities.escape("", charsetEncoder43, escapeMode54);
        java.lang.String str61 = org.jsoup.nodes.Entities.escape("", charsetEncoder41, escapeMode54);
        java.lang.String str62 = org.jsoup.nodes.Entities.escape("", charsetEncoder39, escapeMode54);
        java.lang.String str63 = org.jsoup.nodes.Entities.escape("", charsetEncoder37, escapeMode54);
        java.lang.String str64 = org.jsoup.nodes.Entities.escape("", charsetEncoder35, escapeMode54);
        java.lang.String str65 = org.jsoup.nodes.Entities.escape("", charsetEncoder33, escapeMode54);
        java.lang.String str66 = org.jsoup.nodes.Entities.escape("", charsetEncoder31, escapeMode54);
        java.lang.String str67 = org.jsoup.nodes.Entities.escape("", charsetEncoder29, escapeMode54);
        java.lang.String str68 = org.jsoup.nodes.Entities.escape("", charsetEncoder27, escapeMode54);
        java.lang.String str69 = org.jsoup.nodes.Entities.escape("", charsetEncoder25, escapeMode54);
        java.lang.String str70 = org.jsoup.nodes.Entities.escape("", charsetEncoder23, escapeMode54);
        java.lang.String str71 = org.jsoup.nodes.Entities.escape("", charsetEncoder21, escapeMode54);
        java.lang.String str72 = org.jsoup.nodes.Entities.escape("", charsetEncoder19, escapeMode54);
        java.lang.String str73 = org.jsoup.nodes.Entities.escape("", charsetEncoder17, escapeMode54);
        java.lang.String str74 = org.jsoup.nodes.Entities.escape("", charsetEncoder15, escapeMode54);
        java.lang.String str75 = org.jsoup.nodes.Entities.escape("", charsetEncoder13, escapeMode54);
        java.lang.String str76 = org.jsoup.nodes.Entities.escape("", charsetEncoder11, escapeMode54);
        java.lang.String str77 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode54);
        java.lang.String str78 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode54);
        java.lang.String str79 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode54);
        java.lang.String str80 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode54);
        java.lang.String str81 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode54);
        java.lang.Class<?> wildcardClass82 = escapeMode54.getClass();
        org.junit.Assert.assertTrue("'" + escapeMode54 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.extended + "'", escapeMode54.equals(org.jsoup.nodes.Entities.EscapeMode.extended));
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "" + "'", str68, "");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "" + "'", str72, "");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "" + "'", str73, "");
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "" + "'", str74, "");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "" + "'", str75, "");
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "" + "'", str76, "");
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "" + "'", str77, "");
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "" + "'", str78, "");
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "" + "'", str79, "");
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "" + "'", str80, "");
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "" + "'", str81, "");
        org.junit.Assert.assertNotNull(wildcardClass82);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        java.nio.charset.CharsetEncoder charsetEncoder11 = null;
        java.nio.charset.CharsetEncoder charsetEncoder13 = null;
        java.nio.charset.CharsetEncoder charsetEncoder15 = null;
        java.nio.charset.CharsetEncoder charsetEncoder17 = null;
        java.nio.charset.CharsetEncoder charsetEncoder19 = null;
        java.nio.charset.CharsetEncoder charsetEncoder21 = null;
        java.nio.charset.CharsetEncoder charsetEncoder23 = null;
        java.nio.charset.CharsetEncoder charsetEncoder25 = null;
        java.nio.charset.CharsetEncoder charsetEncoder27 = null;
        java.nio.charset.CharsetEncoder charsetEncoder29 = null;
        java.nio.charset.CharsetEncoder charsetEncoder31 = null;
        java.nio.charset.CharsetEncoder charsetEncoder33 = null;
        java.nio.charset.CharsetEncoder charsetEncoder35 = null;
        java.nio.charset.CharsetEncoder charsetEncoder37 = null;
        java.nio.charset.CharsetEncoder charsetEncoder39 = null;
        java.nio.charset.CharsetEncoder charsetEncoder41 = null;
        java.nio.charset.CharsetEncoder charsetEncoder43 = null;
        java.nio.charset.CharsetEncoder charsetEncoder45 = null;
        java.nio.charset.CharsetEncoder charsetEncoder47 = null;
        java.nio.charset.CharsetEncoder charsetEncoder49 = null;
        java.nio.charset.CharsetEncoder charsetEncoder51 = null;
        java.nio.charset.CharsetEncoder charsetEncoder53 = null;
        java.nio.charset.CharsetEncoder charsetEncoder55 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode56 = org.jsoup.nodes.Entities.EscapeMode.base;
        java.lang.String str57 = org.jsoup.nodes.Entities.escape("", charsetEncoder55, escapeMode56);
        java.lang.String str58 = org.jsoup.nodes.Entities.escape("", charsetEncoder53, escapeMode56);
        java.lang.String str59 = org.jsoup.nodes.Entities.escape("", charsetEncoder51, escapeMode56);
        java.lang.String str60 = org.jsoup.nodes.Entities.escape("", charsetEncoder49, escapeMode56);
        java.lang.String str61 = org.jsoup.nodes.Entities.escape("", charsetEncoder47, escapeMode56);
        java.lang.String str62 = org.jsoup.nodes.Entities.escape("", charsetEncoder45, escapeMode56);
        java.lang.String str63 = org.jsoup.nodes.Entities.escape("", charsetEncoder43, escapeMode56);
        java.lang.String str64 = org.jsoup.nodes.Entities.escape("", charsetEncoder41, escapeMode56);
        java.lang.String str65 = org.jsoup.nodes.Entities.escape("", charsetEncoder39, escapeMode56);
        java.lang.String str66 = org.jsoup.nodes.Entities.escape("", charsetEncoder37, escapeMode56);
        java.lang.String str67 = org.jsoup.nodes.Entities.escape("", charsetEncoder35, escapeMode56);
        java.lang.String str68 = org.jsoup.nodes.Entities.escape("", charsetEncoder33, escapeMode56);
        java.lang.String str69 = org.jsoup.nodes.Entities.escape("", charsetEncoder31, escapeMode56);
        java.lang.String str70 = org.jsoup.nodes.Entities.escape("", charsetEncoder29, escapeMode56);
        java.lang.String str71 = org.jsoup.nodes.Entities.escape("", charsetEncoder27, escapeMode56);
        java.lang.String str72 = org.jsoup.nodes.Entities.escape("", charsetEncoder25, escapeMode56);
        java.lang.String str73 = org.jsoup.nodes.Entities.escape("", charsetEncoder23, escapeMode56);
        java.lang.String str74 = org.jsoup.nodes.Entities.escape("", charsetEncoder21, escapeMode56);
        java.lang.String str75 = org.jsoup.nodes.Entities.escape("", charsetEncoder19, escapeMode56);
        java.lang.String str76 = org.jsoup.nodes.Entities.escape("", charsetEncoder17, escapeMode56);
        java.lang.String str77 = org.jsoup.nodes.Entities.escape("", charsetEncoder15, escapeMode56);
        java.lang.String str78 = org.jsoup.nodes.Entities.escape("", charsetEncoder13, escapeMode56);
        java.lang.String str79 = org.jsoup.nodes.Entities.escape("", charsetEncoder11, escapeMode56);
        java.lang.String str80 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode56);
        java.lang.String str81 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode56);
        java.lang.String str82 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode56);
        java.lang.String str83 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode56);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str84 = org.jsoup.nodes.Entities.escape("hi!", charsetEncoder1, escapeMode56);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + escapeMode56 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode56.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "" + "'", str68, "");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "" + "'", str72, "");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "" + "'", str73, "");
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "" + "'", str74, "");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "" + "'", str75, "");
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "" + "'", str76, "");
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "" + "'", str77, "");
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "" + "'", str78, "");
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "" + "'", str79, "");
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "" + "'", str80, "");
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "" + "'", str81, "");
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "" + "'", str82, "");
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "" + "'", str83, "");
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        java.nio.charset.CharsetEncoder charsetEncoder11 = null;
        java.nio.charset.CharsetEncoder charsetEncoder13 = null;
        java.nio.charset.CharsetEncoder charsetEncoder15 = null;
        java.nio.charset.CharsetEncoder charsetEncoder17 = null;
        java.nio.charset.CharsetEncoder charsetEncoder19 = null;
        java.nio.charset.CharsetEncoder charsetEncoder21 = null;
        java.nio.charset.CharsetEncoder charsetEncoder23 = null;
        java.nio.charset.CharsetEncoder charsetEncoder25 = null;
        java.nio.charset.CharsetEncoder charsetEncoder27 = null;
        java.nio.charset.CharsetEncoder charsetEncoder29 = null;
        java.nio.charset.CharsetEncoder charsetEncoder31 = null;
        java.nio.charset.CharsetEncoder charsetEncoder33 = null;
        java.nio.charset.CharsetEncoder charsetEncoder35 = null;
        java.nio.charset.CharsetEncoder charsetEncoder37 = null;
        java.nio.charset.CharsetEncoder charsetEncoder39 = null;
        java.nio.charset.CharsetEncoder charsetEncoder41 = null;
        java.nio.charset.CharsetEncoder charsetEncoder43 = null;
        java.nio.charset.CharsetEncoder charsetEncoder45 = null;
        java.nio.charset.CharsetEncoder charsetEncoder47 = null;
        java.nio.charset.CharsetEncoder charsetEncoder49 = null;
        java.nio.charset.CharsetEncoder charsetEncoder51 = null;
        java.nio.charset.CharsetEncoder charsetEncoder53 = null;
        java.nio.charset.CharsetEncoder charsetEncoder55 = null;
        java.nio.charset.CharsetEncoder charsetEncoder57 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode58 = org.jsoup.nodes.Entities.EscapeMode.base;
        java.lang.String str59 = org.jsoup.nodes.Entities.escape("", charsetEncoder57, escapeMode58);
        java.lang.String str60 = org.jsoup.nodes.Entities.escape("", charsetEncoder55, escapeMode58);
        java.lang.String str61 = org.jsoup.nodes.Entities.escape("", charsetEncoder53, escapeMode58);
        java.lang.String str62 = org.jsoup.nodes.Entities.escape("", charsetEncoder51, escapeMode58);
        java.lang.String str63 = org.jsoup.nodes.Entities.escape("", charsetEncoder49, escapeMode58);
        java.lang.String str64 = org.jsoup.nodes.Entities.escape("", charsetEncoder47, escapeMode58);
        java.lang.String str65 = org.jsoup.nodes.Entities.escape("", charsetEncoder45, escapeMode58);
        java.lang.String str66 = org.jsoup.nodes.Entities.escape("", charsetEncoder43, escapeMode58);
        java.lang.String str67 = org.jsoup.nodes.Entities.escape("", charsetEncoder41, escapeMode58);
        java.lang.String str68 = org.jsoup.nodes.Entities.escape("", charsetEncoder39, escapeMode58);
        java.lang.String str69 = org.jsoup.nodes.Entities.escape("", charsetEncoder37, escapeMode58);
        java.lang.String str70 = org.jsoup.nodes.Entities.escape("", charsetEncoder35, escapeMode58);
        java.lang.String str71 = org.jsoup.nodes.Entities.escape("", charsetEncoder33, escapeMode58);
        java.lang.String str72 = org.jsoup.nodes.Entities.escape("", charsetEncoder31, escapeMode58);
        java.lang.String str73 = org.jsoup.nodes.Entities.escape("", charsetEncoder29, escapeMode58);
        java.lang.String str74 = org.jsoup.nodes.Entities.escape("", charsetEncoder27, escapeMode58);
        java.lang.String str75 = org.jsoup.nodes.Entities.escape("", charsetEncoder25, escapeMode58);
        java.lang.String str76 = org.jsoup.nodes.Entities.escape("", charsetEncoder23, escapeMode58);
        java.lang.String str77 = org.jsoup.nodes.Entities.escape("", charsetEncoder21, escapeMode58);
        java.lang.String str78 = org.jsoup.nodes.Entities.escape("", charsetEncoder19, escapeMode58);
        java.lang.String str79 = org.jsoup.nodes.Entities.escape("", charsetEncoder17, escapeMode58);
        java.lang.String str80 = org.jsoup.nodes.Entities.escape("", charsetEncoder15, escapeMode58);
        java.lang.String str81 = org.jsoup.nodes.Entities.escape("", charsetEncoder13, escapeMode58);
        java.lang.String str82 = org.jsoup.nodes.Entities.escape("", charsetEncoder11, escapeMode58);
        java.lang.String str83 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode58);
        java.lang.String str84 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode58);
        java.lang.String str85 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode58);
        java.lang.String str86 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode58);
        java.lang.String str87 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode58);
        java.lang.Class<?> wildcardClass88 = escapeMode58.getClass();
        org.junit.Assert.assertTrue("'" + escapeMode58 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode58.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "" + "'", str68, "");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "" + "'", str72, "");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "" + "'", str73, "");
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "" + "'", str74, "");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "" + "'", str75, "");
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "" + "'", str76, "");
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "" + "'", str77, "");
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "" + "'", str78, "");
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "" + "'", str79, "");
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "" + "'", str80, "");
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "" + "'", str81, "");
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "" + "'", str82, "");
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "" + "'", str83, "");
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "" + "'", str84, "");
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "" + "'", str85, "");
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "" + "'", str86, "");
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "" + "'", str87, "");
        org.junit.Assert.assertNotNull(wildcardClass88);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        java.nio.charset.CharsetEncoder charsetEncoder11 = null;
        java.nio.charset.CharsetEncoder charsetEncoder13 = null;
        java.nio.charset.CharsetEncoder charsetEncoder15 = null;
        java.nio.charset.CharsetEncoder charsetEncoder17 = null;
        java.nio.charset.CharsetEncoder charsetEncoder19 = null;
        java.nio.charset.CharsetEncoder charsetEncoder21 = null;
        java.nio.charset.CharsetEncoder charsetEncoder23 = null;
        java.nio.charset.CharsetEncoder charsetEncoder25 = null;
        java.nio.charset.CharsetEncoder charsetEncoder27 = null;
        java.nio.charset.CharsetEncoder charsetEncoder29 = null;
        java.nio.charset.CharsetEncoder charsetEncoder31 = null;
        java.nio.charset.CharsetEncoder charsetEncoder33 = null;
        java.nio.charset.CharsetEncoder charsetEncoder35 = null;
        java.nio.charset.CharsetEncoder charsetEncoder37 = null;
        java.nio.charset.CharsetEncoder charsetEncoder39 = null;
        java.nio.charset.CharsetEncoder charsetEncoder41 = null;
        java.nio.charset.CharsetEncoder charsetEncoder43 = null;
        java.nio.charset.CharsetEncoder charsetEncoder45 = null;
        java.nio.charset.CharsetEncoder charsetEncoder47 = null;
        java.nio.charset.CharsetEncoder charsetEncoder49 = null;
        java.nio.charset.CharsetEncoder charsetEncoder51 = null;
        java.nio.charset.CharsetEncoder charsetEncoder53 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode54 = org.jsoup.nodes.Entities.EscapeMode.extended;
        java.lang.String str55 = org.jsoup.nodes.Entities.escape("", charsetEncoder53, escapeMode54);
        java.lang.String str56 = org.jsoup.nodes.Entities.escape("", charsetEncoder51, escapeMode54);
        java.lang.String str57 = org.jsoup.nodes.Entities.escape("", charsetEncoder49, escapeMode54);
        java.lang.String str58 = org.jsoup.nodes.Entities.escape("", charsetEncoder47, escapeMode54);
        java.lang.String str59 = org.jsoup.nodes.Entities.escape("", charsetEncoder45, escapeMode54);
        java.lang.String str60 = org.jsoup.nodes.Entities.escape("", charsetEncoder43, escapeMode54);
        java.lang.String str61 = org.jsoup.nodes.Entities.escape("", charsetEncoder41, escapeMode54);
        java.lang.String str62 = org.jsoup.nodes.Entities.escape("", charsetEncoder39, escapeMode54);
        java.lang.String str63 = org.jsoup.nodes.Entities.escape("", charsetEncoder37, escapeMode54);
        java.lang.String str64 = org.jsoup.nodes.Entities.escape("", charsetEncoder35, escapeMode54);
        java.lang.String str65 = org.jsoup.nodes.Entities.escape("", charsetEncoder33, escapeMode54);
        java.lang.String str66 = org.jsoup.nodes.Entities.escape("", charsetEncoder31, escapeMode54);
        java.lang.String str67 = org.jsoup.nodes.Entities.escape("", charsetEncoder29, escapeMode54);
        java.lang.String str68 = org.jsoup.nodes.Entities.escape("", charsetEncoder27, escapeMode54);
        java.lang.String str69 = org.jsoup.nodes.Entities.escape("", charsetEncoder25, escapeMode54);
        java.lang.String str70 = org.jsoup.nodes.Entities.escape("", charsetEncoder23, escapeMode54);
        java.lang.String str71 = org.jsoup.nodes.Entities.escape("", charsetEncoder21, escapeMode54);
        java.lang.String str72 = org.jsoup.nodes.Entities.escape("", charsetEncoder19, escapeMode54);
        java.lang.String str73 = org.jsoup.nodes.Entities.escape("", charsetEncoder17, escapeMode54);
        java.lang.String str74 = org.jsoup.nodes.Entities.escape("", charsetEncoder15, escapeMode54);
        java.lang.String str75 = org.jsoup.nodes.Entities.escape("", charsetEncoder13, escapeMode54);
        java.lang.String str76 = org.jsoup.nodes.Entities.escape("", charsetEncoder11, escapeMode54);
        java.lang.String str77 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode54);
        java.lang.String str78 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode54);
        java.lang.String str79 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode54);
        java.lang.String str80 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode54);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str81 = org.jsoup.nodes.Entities.escape("hi!", charsetEncoder1, escapeMode54);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + escapeMode54 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.extended + "'", escapeMode54.equals(org.jsoup.nodes.Entities.EscapeMode.extended));
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "" + "'", str68, "");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "" + "'", str72, "");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "" + "'", str73, "");
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "" + "'", str74, "");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "" + "'", str75, "");
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "" + "'", str76, "");
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "" + "'", str77, "");
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "" + "'", str78, "");
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "" + "'", str79, "");
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "" + "'", str80, "");
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        java.nio.charset.CharsetEncoder charsetEncoder11 = null;
        java.nio.charset.CharsetEncoder charsetEncoder13 = null;
        java.nio.charset.CharsetEncoder charsetEncoder15 = null;
        java.nio.charset.CharsetEncoder charsetEncoder17 = null;
        java.nio.charset.CharsetEncoder charsetEncoder19 = null;
        java.nio.charset.CharsetEncoder charsetEncoder21 = null;
        java.nio.charset.CharsetEncoder charsetEncoder23 = null;
        java.nio.charset.CharsetEncoder charsetEncoder25 = null;
        java.nio.charset.CharsetEncoder charsetEncoder27 = null;
        java.nio.charset.CharsetEncoder charsetEncoder29 = null;
        java.nio.charset.CharsetEncoder charsetEncoder31 = null;
        java.nio.charset.CharsetEncoder charsetEncoder33 = null;
        java.nio.charset.CharsetEncoder charsetEncoder35 = null;
        java.nio.charset.CharsetEncoder charsetEncoder37 = null;
        java.nio.charset.CharsetEncoder charsetEncoder39 = null;
        java.nio.charset.CharsetEncoder charsetEncoder41 = null;
        java.nio.charset.CharsetEncoder charsetEncoder43 = null;
        java.nio.charset.CharsetEncoder charsetEncoder45 = null;
        java.nio.charset.CharsetEncoder charsetEncoder47 = null;
        java.nio.charset.CharsetEncoder charsetEncoder49 = null;
        java.nio.charset.CharsetEncoder charsetEncoder51 = null;
        java.nio.charset.CharsetEncoder charsetEncoder53 = null;
        java.nio.charset.CharsetEncoder charsetEncoder55 = null;
        java.nio.charset.CharsetEncoder charsetEncoder57 = null;
        java.nio.charset.CharsetEncoder charsetEncoder59 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode60 = org.jsoup.nodes.Entities.EscapeMode.base;
        java.lang.String str61 = org.jsoup.nodes.Entities.escape("", charsetEncoder59, escapeMode60);
        java.lang.String str62 = org.jsoup.nodes.Entities.escape("", charsetEncoder57, escapeMode60);
        java.lang.String str63 = org.jsoup.nodes.Entities.escape("", charsetEncoder55, escapeMode60);
        java.lang.String str64 = org.jsoup.nodes.Entities.escape("", charsetEncoder53, escapeMode60);
        java.lang.String str65 = org.jsoup.nodes.Entities.escape("", charsetEncoder51, escapeMode60);
        java.lang.String str66 = org.jsoup.nodes.Entities.escape("", charsetEncoder49, escapeMode60);
        java.lang.String str67 = org.jsoup.nodes.Entities.escape("", charsetEncoder47, escapeMode60);
        java.lang.String str68 = org.jsoup.nodes.Entities.escape("", charsetEncoder45, escapeMode60);
        java.lang.String str69 = org.jsoup.nodes.Entities.escape("", charsetEncoder43, escapeMode60);
        java.lang.String str70 = org.jsoup.nodes.Entities.escape("", charsetEncoder41, escapeMode60);
        java.lang.String str71 = org.jsoup.nodes.Entities.escape("", charsetEncoder39, escapeMode60);
        java.lang.String str72 = org.jsoup.nodes.Entities.escape("", charsetEncoder37, escapeMode60);
        java.lang.String str73 = org.jsoup.nodes.Entities.escape("", charsetEncoder35, escapeMode60);
        java.lang.String str74 = org.jsoup.nodes.Entities.escape("", charsetEncoder33, escapeMode60);
        java.lang.String str75 = org.jsoup.nodes.Entities.escape("", charsetEncoder31, escapeMode60);
        java.lang.String str76 = org.jsoup.nodes.Entities.escape("", charsetEncoder29, escapeMode60);
        java.lang.String str77 = org.jsoup.nodes.Entities.escape("", charsetEncoder27, escapeMode60);
        java.lang.String str78 = org.jsoup.nodes.Entities.escape("", charsetEncoder25, escapeMode60);
        java.lang.String str79 = org.jsoup.nodes.Entities.escape("", charsetEncoder23, escapeMode60);
        java.lang.String str80 = org.jsoup.nodes.Entities.escape("", charsetEncoder21, escapeMode60);
        java.lang.String str81 = org.jsoup.nodes.Entities.escape("", charsetEncoder19, escapeMode60);
        java.lang.String str82 = org.jsoup.nodes.Entities.escape("", charsetEncoder17, escapeMode60);
        java.lang.String str83 = org.jsoup.nodes.Entities.escape("", charsetEncoder15, escapeMode60);
        java.lang.String str84 = org.jsoup.nodes.Entities.escape("", charsetEncoder13, escapeMode60);
        java.lang.String str85 = org.jsoup.nodes.Entities.escape("", charsetEncoder11, escapeMode60);
        java.lang.String str86 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode60);
        java.lang.String str87 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode60);
        java.lang.String str88 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode60);
        java.lang.String str89 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode60);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str90 = org.jsoup.nodes.Entities.escape("hi!", charsetEncoder1, escapeMode60);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + escapeMode60 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode60.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "" + "'", str68, "");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "" + "'", str72, "");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "" + "'", str73, "");
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "" + "'", str74, "");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "" + "'", str75, "");
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "" + "'", str76, "");
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "" + "'", str77, "");
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "" + "'", str78, "");
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "" + "'", str79, "");
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "" + "'", str80, "");
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "" + "'", str81, "");
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "" + "'", str82, "");
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "" + "'", str83, "");
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "" + "'", str84, "");
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "" + "'", str85, "");
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "" + "'", str86, "");
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "" + "'", str87, "");
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "" + "'", str88, "");
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "" + "'", str89, "");
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        java.nio.charset.CharsetEncoder charsetEncoder11 = null;
        java.nio.charset.CharsetEncoder charsetEncoder13 = null;
        java.nio.charset.CharsetEncoder charsetEncoder15 = null;
        java.nio.charset.CharsetEncoder charsetEncoder17 = null;
        java.nio.charset.CharsetEncoder charsetEncoder19 = null;
        java.nio.charset.CharsetEncoder charsetEncoder21 = null;
        java.nio.charset.CharsetEncoder charsetEncoder23 = null;
        java.nio.charset.CharsetEncoder charsetEncoder25 = null;
        java.nio.charset.CharsetEncoder charsetEncoder27 = null;
        java.nio.charset.CharsetEncoder charsetEncoder29 = null;
        java.nio.charset.CharsetEncoder charsetEncoder31 = null;
        java.nio.charset.CharsetEncoder charsetEncoder33 = null;
        java.nio.charset.CharsetEncoder charsetEncoder35 = null;
        java.nio.charset.CharsetEncoder charsetEncoder37 = null;
        java.nio.charset.CharsetEncoder charsetEncoder39 = null;
        java.nio.charset.CharsetEncoder charsetEncoder41 = null;
        java.nio.charset.CharsetEncoder charsetEncoder43 = null;
        java.nio.charset.CharsetEncoder charsetEncoder45 = null;
        java.nio.charset.CharsetEncoder charsetEncoder47 = null;
        java.nio.charset.CharsetEncoder charsetEncoder49 = null;
        java.nio.charset.CharsetEncoder charsetEncoder51 = null;
        java.nio.charset.CharsetEncoder charsetEncoder53 = null;
        java.nio.charset.CharsetEncoder charsetEncoder55 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode56 = org.jsoup.nodes.Entities.EscapeMode.base;
        java.lang.String str57 = org.jsoup.nodes.Entities.escape("", charsetEncoder55, escapeMode56);
        java.lang.String str58 = org.jsoup.nodes.Entities.escape("", charsetEncoder53, escapeMode56);
        java.lang.String str59 = org.jsoup.nodes.Entities.escape("", charsetEncoder51, escapeMode56);
        java.lang.String str60 = org.jsoup.nodes.Entities.escape("", charsetEncoder49, escapeMode56);
        java.lang.String str61 = org.jsoup.nodes.Entities.escape("", charsetEncoder47, escapeMode56);
        java.lang.String str62 = org.jsoup.nodes.Entities.escape("", charsetEncoder45, escapeMode56);
        java.lang.String str63 = org.jsoup.nodes.Entities.escape("", charsetEncoder43, escapeMode56);
        java.lang.String str64 = org.jsoup.nodes.Entities.escape("", charsetEncoder41, escapeMode56);
        java.lang.String str65 = org.jsoup.nodes.Entities.escape("", charsetEncoder39, escapeMode56);
        java.lang.String str66 = org.jsoup.nodes.Entities.escape("", charsetEncoder37, escapeMode56);
        java.lang.String str67 = org.jsoup.nodes.Entities.escape("", charsetEncoder35, escapeMode56);
        java.lang.String str68 = org.jsoup.nodes.Entities.escape("", charsetEncoder33, escapeMode56);
        java.lang.String str69 = org.jsoup.nodes.Entities.escape("", charsetEncoder31, escapeMode56);
        java.lang.String str70 = org.jsoup.nodes.Entities.escape("", charsetEncoder29, escapeMode56);
        java.lang.String str71 = org.jsoup.nodes.Entities.escape("", charsetEncoder27, escapeMode56);
        java.lang.String str72 = org.jsoup.nodes.Entities.escape("", charsetEncoder25, escapeMode56);
        java.lang.String str73 = org.jsoup.nodes.Entities.escape("", charsetEncoder23, escapeMode56);
        java.lang.String str74 = org.jsoup.nodes.Entities.escape("", charsetEncoder21, escapeMode56);
        java.lang.String str75 = org.jsoup.nodes.Entities.escape("", charsetEncoder19, escapeMode56);
        java.lang.String str76 = org.jsoup.nodes.Entities.escape("", charsetEncoder17, escapeMode56);
        java.lang.String str77 = org.jsoup.nodes.Entities.escape("", charsetEncoder15, escapeMode56);
        java.lang.String str78 = org.jsoup.nodes.Entities.escape("", charsetEncoder13, escapeMode56);
        java.lang.String str79 = org.jsoup.nodes.Entities.escape("", charsetEncoder11, escapeMode56);
        java.lang.String str80 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode56);
        java.lang.String str81 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode56);
        java.lang.String str82 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode56);
        java.lang.String str83 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode56);
        java.lang.String str84 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode56);
        java.lang.Class<?> wildcardClass85 = escapeMode56.getClass();
        org.junit.Assert.assertTrue("'" + escapeMode56 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode56.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "" + "'", str68, "");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "" + "'", str72, "");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "" + "'", str73, "");
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "" + "'", str74, "");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "" + "'", str75, "");
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "" + "'", str76, "");
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "" + "'", str77, "");
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "" + "'", str78, "");
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "" + "'", str79, "");
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "" + "'", str80, "");
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "" + "'", str81, "");
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "" + "'", str82, "");
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "" + "'", str83, "");
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "" + "'", str84, "");
        org.junit.Assert.assertNotNull(wildcardClass85);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        java.nio.charset.CharsetEncoder charsetEncoder11 = null;
        java.nio.charset.CharsetEncoder charsetEncoder13 = null;
        java.nio.charset.CharsetEncoder charsetEncoder15 = null;
        java.nio.charset.CharsetEncoder charsetEncoder17 = null;
        java.nio.charset.CharsetEncoder charsetEncoder19 = null;
        java.nio.charset.CharsetEncoder charsetEncoder21 = null;
        java.nio.charset.CharsetEncoder charsetEncoder23 = null;
        java.nio.charset.CharsetEncoder charsetEncoder25 = null;
        java.nio.charset.CharsetEncoder charsetEncoder27 = null;
        java.nio.charset.CharsetEncoder charsetEncoder29 = null;
        java.nio.charset.CharsetEncoder charsetEncoder31 = null;
        java.nio.charset.CharsetEncoder charsetEncoder33 = null;
        java.nio.charset.CharsetEncoder charsetEncoder35 = null;
        java.nio.charset.CharsetEncoder charsetEncoder37 = null;
        java.nio.charset.CharsetEncoder charsetEncoder39 = null;
        java.nio.charset.CharsetEncoder charsetEncoder41 = null;
        java.nio.charset.CharsetEncoder charsetEncoder43 = null;
        java.nio.charset.CharsetEncoder charsetEncoder45 = null;
        java.nio.charset.CharsetEncoder charsetEncoder47 = null;
        java.nio.charset.CharsetEncoder charsetEncoder49 = null;
        java.nio.charset.CharsetEncoder charsetEncoder51 = null;
        java.nio.charset.CharsetEncoder charsetEncoder53 = null;
        java.nio.charset.CharsetEncoder charsetEncoder55 = null;
        java.nio.charset.CharsetEncoder charsetEncoder57 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode58 = org.jsoup.nodes.Entities.EscapeMode.base;
        java.lang.String str59 = org.jsoup.nodes.Entities.escape("", charsetEncoder57, escapeMode58);
        java.lang.String str60 = org.jsoup.nodes.Entities.escape("", charsetEncoder55, escapeMode58);
        java.lang.String str61 = org.jsoup.nodes.Entities.escape("", charsetEncoder53, escapeMode58);
        java.lang.String str62 = org.jsoup.nodes.Entities.escape("", charsetEncoder51, escapeMode58);
        java.lang.String str63 = org.jsoup.nodes.Entities.escape("", charsetEncoder49, escapeMode58);
        java.lang.String str64 = org.jsoup.nodes.Entities.escape("", charsetEncoder47, escapeMode58);
        java.lang.String str65 = org.jsoup.nodes.Entities.escape("", charsetEncoder45, escapeMode58);
        java.lang.String str66 = org.jsoup.nodes.Entities.escape("", charsetEncoder43, escapeMode58);
        java.lang.String str67 = org.jsoup.nodes.Entities.escape("", charsetEncoder41, escapeMode58);
        java.lang.String str68 = org.jsoup.nodes.Entities.escape("", charsetEncoder39, escapeMode58);
        java.lang.String str69 = org.jsoup.nodes.Entities.escape("", charsetEncoder37, escapeMode58);
        java.lang.String str70 = org.jsoup.nodes.Entities.escape("", charsetEncoder35, escapeMode58);
        java.lang.String str71 = org.jsoup.nodes.Entities.escape("", charsetEncoder33, escapeMode58);
        java.lang.String str72 = org.jsoup.nodes.Entities.escape("", charsetEncoder31, escapeMode58);
        java.lang.String str73 = org.jsoup.nodes.Entities.escape("", charsetEncoder29, escapeMode58);
        java.lang.String str74 = org.jsoup.nodes.Entities.escape("", charsetEncoder27, escapeMode58);
        java.lang.String str75 = org.jsoup.nodes.Entities.escape("", charsetEncoder25, escapeMode58);
        java.lang.String str76 = org.jsoup.nodes.Entities.escape("", charsetEncoder23, escapeMode58);
        java.lang.String str77 = org.jsoup.nodes.Entities.escape("", charsetEncoder21, escapeMode58);
        java.lang.String str78 = org.jsoup.nodes.Entities.escape("", charsetEncoder19, escapeMode58);
        java.lang.String str79 = org.jsoup.nodes.Entities.escape("", charsetEncoder17, escapeMode58);
        java.lang.String str80 = org.jsoup.nodes.Entities.escape("", charsetEncoder15, escapeMode58);
        java.lang.String str81 = org.jsoup.nodes.Entities.escape("", charsetEncoder13, escapeMode58);
        java.lang.String str82 = org.jsoup.nodes.Entities.escape("", charsetEncoder11, escapeMode58);
        java.lang.String str83 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode58);
        java.lang.String str84 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode58);
        java.lang.String str85 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode58);
        java.lang.String str86 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode58);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str87 = org.jsoup.nodes.Entities.escape("hi!", charsetEncoder1, escapeMode58);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + escapeMode58 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode58.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "" + "'", str68, "");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "" + "'", str72, "");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "" + "'", str73, "");
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "" + "'", str74, "");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "" + "'", str75, "");
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "" + "'", str76, "");
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "" + "'", str77, "");
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "" + "'", str78, "");
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "" + "'", str79, "");
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "" + "'", str80, "");
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "" + "'", str81, "");
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "" + "'", str82, "");
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "" + "'", str83, "");
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "" + "'", str84, "");
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "" + "'", str85, "");
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "" + "'", str86, "");
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        java.nio.charset.CharsetEncoder charsetEncoder11 = null;
        java.nio.charset.CharsetEncoder charsetEncoder13 = null;
        java.nio.charset.CharsetEncoder charsetEncoder15 = null;
        java.nio.charset.CharsetEncoder charsetEncoder17 = null;
        java.nio.charset.CharsetEncoder charsetEncoder19 = null;
        java.nio.charset.CharsetEncoder charsetEncoder21 = null;
        java.nio.charset.CharsetEncoder charsetEncoder23 = null;
        java.nio.charset.CharsetEncoder charsetEncoder25 = null;
        java.nio.charset.CharsetEncoder charsetEncoder27 = null;
        java.nio.charset.CharsetEncoder charsetEncoder29 = null;
        java.nio.charset.CharsetEncoder charsetEncoder31 = null;
        java.nio.charset.CharsetEncoder charsetEncoder33 = null;
        java.nio.charset.CharsetEncoder charsetEncoder35 = null;
        java.nio.charset.CharsetEncoder charsetEncoder37 = null;
        java.nio.charset.CharsetEncoder charsetEncoder39 = null;
        java.nio.charset.CharsetEncoder charsetEncoder41 = null;
        java.nio.charset.CharsetEncoder charsetEncoder43 = null;
        java.nio.charset.CharsetEncoder charsetEncoder45 = null;
        java.nio.charset.CharsetEncoder charsetEncoder47 = null;
        java.nio.charset.CharsetEncoder charsetEncoder49 = null;
        java.nio.charset.CharsetEncoder charsetEncoder51 = null;
        java.nio.charset.CharsetEncoder charsetEncoder53 = null;
        java.nio.charset.CharsetEncoder charsetEncoder55 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode56 = org.jsoup.nodes.Entities.EscapeMode.extended;
        java.lang.String str57 = org.jsoup.nodes.Entities.escape("", charsetEncoder55, escapeMode56);
        java.lang.String str58 = org.jsoup.nodes.Entities.escape("", charsetEncoder53, escapeMode56);
        java.lang.String str59 = org.jsoup.nodes.Entities.escape("", charsetEncoder51, escapeMode56);
        java.lang.String str60 = org.jsoup.nodes.Entities.escape("", charsetEncoder49, escapeMode56);
        java.lang.String str61 = org.jsoup.nodes.Entities.escape("", charsetEncoder47, escapeMode56);
        java.lang.String str62 = org.jsoup.nodes.Entities.escape("", charsetEncoder45, escapeMode56);
        java.lang.String str63 = org.jsoup.nodes.Entities.escape("", charsetEncoder43, escapeMode56);
        java.lang.String str64 = org.jsoup.nodes.Entities.escape("", charsetEncoder41, escapeMode56);
        java.lang.String str65 = org.jsoup.nodes.Entities.escape("", charsetEncoder39, escapeMode56);
        java.lang.String str66 = org.jsoup.nodes.Entities.escape("", charsetEncoder37, escapeMode56);
        java.lang.String str67 = org.jsoup.nodes.Entities.escape("", charsetEncoder35, escapeMode56);
        java.lang.String str68 = org.jsoup.nodes.Entities.escape("", charsetEncoder33, escapeMode56);
        java.lang.String str69 = org.jsoup.nodes.Entities.escape("", charsetEncoder31, escapeMode56);
        java.lang.String str70 = org.jsoup.nodes.Entities.escape("", charsetEncoder29, escapeMode56);
        java.lang.String str71 = org.jsoup.nodes.Entities.escape("", charsetEncoder27, escapeMode56);
        java.lang.String str72 = org.jsoup.nodes.Entities.escape("", charsetEncoder25, escapeMode56);
        java.lang.String str73 = org.jsoup.nodes.Entities.escape("", charsetEncoder23, escapeMode56);
        java.lang.String str74 = org.jsoup.nodes.Entities.escape("", charsetEncoder21, escapeMode56);
        java.lang.String str75 = org.jsoup.nodes.Entities.escape("", charsetEncoder19, escapeMode56);
        java.lang.String str76 = org.jsoup.nodes.Entities.escape("", charsetEncoder17, escapeMode56);
        java.lang.String str77 = org.jsoup.nodes.Entities.escape("", charsetEncoder15, escapeMode56);
        java.lang.String str78 = org.jsoup.nodes.Entities.escape("", charsetEncoder13, escapeMode56);
        java.lang.String str79 = org.jsoup.nodes.Entities.escape("", charsetEncoder11, escapeMode56);
        java.lang.String str80 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode56);
        java.lang.String str81 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode56);
        java.lang.String str82 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode56);
        java.lang.String str83 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode56);
        java.lang.String str84 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode56);
        java.lang.Class<?> wildcardClass85 = escapeMode56.getClass();
        org.junit.Assert.assertTrue("'" + escapeMode56 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.extended + "'", escapeMode56.equals(org.jsoup.nodes.Entities.EscapeMode.extended));
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "" + "'", str68, "");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "" + "'", str72, "");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "" + "'", str73, "");
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "" + "'", str74, "");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "" + "'", str75, "");
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "" + "'", str76, "");
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "" + "'", str77, "");
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "" + "'", str78, "");
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "" + "'", str79, "");
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "" + "'", str80, "");
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "" + "'", str81, "");
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "" + "'", str82, "");
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "" + "'", str83, "");
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "" + "'", str84, "");
        org.junit.Assert.assertNotNull(wildcardClass85);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        java.nio.charset.CharsetEncoder charsetEncoder11 = null;
        java.nio.charset.CharsetEncoder charsetEncoder13 = null;
        java.nio.charset.CharsetEncoder charsetEncoder15 = null;
        java.nio.charset.CharsetEncoder charsetEncoder17 = null;
        java.nio.charset.CharsetEncoder charsetEncoder19 = null;
        java.nio.charset.CharsetEncoder charsetEncoder21 = null;
        java.nio.charset.CharsetEncoder charsetEncoder23 = null;
        java.nio.charset.CharsetEncoder charsetEncoder25 = null;
        java.nio.charset.CharsetEncoder charsetEncoder27 = null;
        java.nio.charset.CharsetEncoder charsetEncoder29 = null;
        java.nio.charset.CharsetEncoder charsetEncoder31 = null;
        java.nio.charset.CharsetEncoder charsetEncoder33 = null;
        java.nio.charset.CharsetEncoder charsetEncoder35 = null;
        java.nio.charset.CharsetEncoder charsetEncoder37 = null;
        java.nio.charset.CharsetEncoder charsetEncoder39 = null;
        java.nio.charset.CharsetEncoder charsetEncoder41 = null;
        java.nio.charset.CharsetEncoder charsetEncoder43 = null;
        java.nio.charset.CharsetEncoder charsetEncoder45 = null;
        java.nio.charset.CharsetEncoder charsetEncoder47 = null;
        java.nio.charset.CharsetEncoder charsetEncoder49 = null;
        java.nio.charset.CharsetEncoder charsetEncoder51 = null;
        java.nio.charset.CharsetEncoder charsetEncoder53 = null;
        java.nio.charset.CharsetEncoder charsetEncoder55 = null;
        java.nio.charset.CharsetEncoder charsetEncoder57 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode58 = org.jsoup.nodes.Entities.EscapeMode.extended;
        java.lang.String str59 = org.jsoup.nodes.Entities.escape("", charsetEncoder57, escapeMode58);
        java.lang.String str60 = org.jsoup.nodes.Entities.escape("", charsetEncoder55, escapeMode58);
        java.lang.String str61 = org.jsoup.nodes.Entities.escape("", charsetEncoder53, escapeMode58);
        java.lang.String str62 = org.jsoup.nodes.Entities.escape("", charsetEncoder51, escapeMode58);
        java.lang.String str63 = org.jsoup.nodes.Entities.escape("", charsetEncoder49, escapeMode58);
        java.lang.String str64 = org.jsoup.nodes.Entities.escape("", charsetEncoder47, escapeMode58);
        java.lang.String str65 = org.jsoup.nodes.Entities.escape("", charsetEncoder45, escapeMode58);
        java.lang.String str66 = org.jsoup.nodes.Entities.escape("", charsetEncoder43, escapeMode58);
        java.lang.String str67 = org.jsoup.nodes.Entities.escape("", charsetEncoder41, escapeMode58);
        java.lang.String str68 = org.jsoup.nodes.Entities.escape("", charsetEncoder39, escapeMode58);
        java.lang.String str69 = org.jsoup.nodes.Entities.escape("", charsetEncoder37, escapeMode58);
        java.lang.String str70 = org.jsoup.nodes.Entities.escape("", charsetEncoder35, escapeMode58);
        java.lang.String str71 = org.jsoup.nodes.Entities.escape("", charsetEncoder33, escapeMode58);
        java.lang.String str72 = org.jsoup.nodes.Entities.escape("", charsetEncoder31, escapeMode58);
        java.lang.String str73 = org.jsoup.nodes.Entities.escape("", charsetEncoder29, escapeMode58);
        java.lang.String str74 = org.jsoup.nodes.Entities.escape("", charsetEncoder27, escapeMode58);
        java.lang.String str75 = org.jsoup.nodes.Entities.escape("", charsetEncoder25, escapeMode58);
        java.lang.String str76 = org.jsoup.nodes.Entities.escape("", charsetEncoder23, escapeMode58);
        java.lang.String str77 = org.jsoup.nodes.Entities.escape("", charsetEncoder21, escapeMode58);
        java.lang.String str78 = org.jsoup.nodes.Entities.escape("", charsetEncoder19, escapeMode58);
        java.lang.String str79 = org.jsoup.nodes.Entities.escape("", charsetEncoder17, escapeMode58);
        java.lang.String str80 = org.jsoup.nodes.Entities.escape("", charsetEncoder15, escapeMode58);
        java.lang.String str81 = org.jsoup.nodes.Entities.escape("", charsetEncoder13, escapeMode58);
        java.lang.String str82 = org.jsoup.nodes.Entities.escape("", charsetEncoder11, escapeMode58);
        java.lang.String str83 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode58);
        java.lang.String str84 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode58);
        java.lang.String str85 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode58);
        java.lang.String str86 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode58);
        java.lang.String str87 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode58);
        java.lang.Class<?> wildcardClass88 = escapeMode58.getClass();
        org.junit.Assert.assertTrue("'" + escapeMode58 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.extended + "'", escapeMode58.equals(org.jsoup.nodes.Entities.EscapeMode.extended));
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "" + "'", str68, "");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "" + "'", str72, "");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "" + "'", str73, "");
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "" + "'", str74, "");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "" + "'", str75, "");
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "" + "'", str76, "");
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "" + "'", str77, "");
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "" + "'", str78, "");
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "" + "'", str79, "");
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "" + "'", str80, "");
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "" + "'", str81, "");
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "" + "'", str82, "");
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "" + "'", str83, "");
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "" + "'", str84, "");
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "" + "'", str85, "");
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "" + "'", str86, "");
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "" + "'", str87, "");
        org.junit.Assert.assertNotNull(wildcardClass88);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        java.nio.charset.CharsetEncoder charsetEncoder11 = null;
        java.nio.charset.CharsetEncoder charsetEncoder13 = null;
        java.nio.charset.CharsetEncoder charsetEncoder15 = null;
        java.nio.charset.CharsetEncoder charsetEncoder17 = null;
        java.nio.charset.CharsetEncoder charsetEncoder19 = null;
        java.nio.charset.CharsetEncoder charsetEncoder21 = null;
        java.nio.charset.CharsetEncoder charsetEncoder23 = null;
        java.nio.charset.CharsetEncoder charsetEncoder25 = null;
        java.nio.charset.CharsetEncoder charsetEncoder27 = null;
        java.nio.charset.CharsetEncoder charsetEncoder29 = null;
        java.nio.charset.CharsetEncoder charsetEncoder31 = null;
        java.nio.charset.CharsetEncoder charsetEncoder33 = null;
        java.nio.charset.CharsetEncoder charsetEncoder35 = null;
        java.nio.charset.CharsetEncoder charsetEncoder37 = null;
        java.nio.charset.CharsetEncoder charsetEncoder39 = null;
        java.nio.charset.CharsetEncoder charsetEncoder41 = null;
        java.nio.charset.CharsetEncoder charsetEncoder43 = null;
        java.nio.charset.CharsetEncoder charsetEncoder45 = null;
        java.nio.charset.CharsetEncoder charsetEncoder47 = null;
        java.nio.charset.CharsetEncoder charsetEncoder49 = null;
        java.nio.charset.CharsetEncoder charsetEncoder51 = null;
        java.nio.charset.CharsetEncoder charsetEncoder53 = null;
        java.nio.charset.CharsetEncoder charsetEncoder55 = null;
        java.nio.charset.CharsetEncoder charsetEncoder57 = null;
        java.nio.charset.CharsetEncoder charsetEncoder59 = null;
        java.nio.charset.CharsetEncoder charsetEncoder61 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode62 = org.jsoup.nodes.Entities.EscapeMode.base;
        java.lang.String str63 = org.jsoup.nodes.Entities.escape("", charsetEncoder61, escapeMode62);
        java.lang.String str64 = org.jsoup.nodes.Entities.escape("", charsetEncoder59, escapeMode62);
        java.lang.String str65 = org.jsoup.nodes.Entities.escape("", charsetEncoder57, escapeMode62);
        java.lang.String str66 = org.jsoup.nodes.Entities.escape("", charsetEncoder55, escapeMode62);
        java.lang.String str67 = org.jsoup.nodes.Entities.escape("", charsetEncoder53, escapeMode62);
        java.lang.String str68 = org.jsoup.nodes.Entities.escape("", charsetEncoder51, escapeMode62);
        java.lang.String str69 = org.jsoup.nodes.Entities.escape("", charsetEncoder49, escapeMode62);
        java.lang.String str70 = org.jsoup.nodes.Entities.escape("", charsetEncoder47, escapeMode62);
        java.lang.String str71 = org.jsoup.nodes.Entities.escape("", charsetEncoder45, escapeMode62);
        java.lang.String str72 = org.jsoup.nodes.Entities.escape("", charsetEncoder43, escapeMode62);
        java.lang.String str73 = org.jsoup.nodes.Entities.escape("", charsetEncoder41, escapeMode62);
        java.lang.String str74 = org.jsoup.nodes.Entities.escape("", charsetEncoder39, escapeMode62);
        java.lang.String str75 = org.jsoup.nodes.Entities.escape("", charsetEncoder37, escapeMode62);
        java.lang.String str76 = org.jsoup.nodes.Entities.escape("", charsetEncoder35, escapeMode62);
        java.lang.String str77 = org.jsoup.nodes.Entities.escape("", charsetEncoder33, escapeMode62);
        java.lang.String str78 = org.jsoup.nodes.Entities.escape("", charsetEncoder31, escapeMode62);
        java.lang.String str79 = org.jsoup.nodes.Entities.escape("", charsetEncoder29, escapeMode62);
        java.lang.String str80 = org.jsoup.nodes.Entities.escape("", charsetEncoder27, escapeMode62);
        java.lang.String str81 = org.jsoup.nodes.Entities.escape("", charsetEncoder25, escapeMode62);
        java.lang.String str82 = org.jsoup.nodes.Entities.escape("", charsetEncoder23, escapeMode62);
        java.lang.String str83 = org.jsoup.nodes.Entities.escape("", charsetEncoder21, escapeMode62);
        java.lang.String str84 = org.jsoup.nodes.Entities.escape("", charsetEncoder19, escapeMode62);
        java.lang.String str85 = org.jsoup.nodes.Entities.escape("", charsetEncoder17, escapeMode62);
        java.lang.String str86 = org.jsoup.nodes.Entities.escape("", charsetEncoder15, escapeMode62);
        java.lang.String str87 = org.jsoup.nodes.Entities.escape("", charsetEncoder13, escapeMode62);
        java.lang.String str88 = org.jsoup.nodes.Entities.escape("", charsetEncoder11, escapeMode62);
        java.lang.String str89 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode62);
        java.lang.String str90 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode62);
        java.lang.String str91 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode62);
        java.lang.String str92 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode62);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str93 = org.jsoup.nodes.Entities.escape("hi!", charsetEncoder1, escapeMode62);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + escapeMode62 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode62.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "" + "'", str68, "");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "" + "'", str72, "");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "" + "'", str73, "");
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "" + "'", str74, "");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "" + "'", str75, "");
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "" + "'", str76, "");
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "" + "'", str77, "");
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "" + "'", str78, "");
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "" + "'", str79, "");
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "" + "'", str80, "");
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "" + "'", str81, "");
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "" + "'", str82, "");
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "" + "'", str83, "");
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "" + "'", str84, "");
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "" + "'", str85, "");
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "" + "'", str86, "");
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "" + "'", str87, "");
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "" + "'", str88, "");
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "" + "'", str89, "");
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "" + "'", str90, "");
        org.junit.Assert.assertEquals("'" + str91 + "' != '" + "" + "'", str91, "");
        org.junit.Assert.assertEquals("'" + str92 + "' != '" + "" + "'", str92, "");
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        java.nio.charset.CharsetEncoder charsetEncoder11 = null;
        java.nio.charset.CharsetEncoder charsetEncoder13 = null;
        java.nio.charset.CharsetEncoder charsetEncoder15 = null;
        java.nio.charset.CharsetEncoder charsetEncoder17 = null;
        java.nio.charset.CharsetEncoder charsetEncoder19 = null;
        java.nio.charset.CharsetEncoder charsetEncoder21 = null;
        java.nio.charset.CharsetEncoder charsetEncoder23 = null;
        java.nio.charset.CharsetEncoder charsetEncoder25 = null;
        java.nio.charset.CharsetEncoder charsetEncoder27 = null;
        java.nio.charset.CharsetEncoder charsetEncoder29 = null;
        java.nio.charset.CharsetEncoder charsetEncoder31 = null;
        java.nio.charset.CharsetEncoder charsetEncoder33 = null;
        java.nio.charset.CharsetEncoder charsetEncoder35 = null;
        java.nio.charset.CharsetEncoder charsetEncoder37 = null;
        java.nio.charset.CharsetEncoder charsetEncoder39 = null;
        java.nio.charset.CharsetEncoder charsetEncoder41 = null;
        java.nio.charset.CharsetEncoder charsetEncoder43 = null;
        java.nio.charset.CharsetEncoder charsetEncoder45 = null;
        java.nio.charset.CharsetEncoder charsetEncoder47 = null;
        java.nio.charset.CharsetEncoder charsetEncoder49 = null;
        java.nio.charset.CharsetEncoder charsetEncoder51 = null;
        java.nio.charset.CharsetEncoder charsetEncoder53 = null;
        java.nio.charset.CharsetEncoder charsetEncoder55 = null;
        java.nio.charset.CharsetEncoder charsetEncoder57 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode58 = org.jsoup.nodes.Entities.EscapeMode.extended;
        java.lang.String str59 = org.jsoup.nodes.Entities.escape("", charsetEncoder57, escapeMode58);
        java.lang.String str60 = org.jsoup.nodes.Entities.escape("", charsetEncoder55, escapeMode58);
        java.lang.String str61 = org.jsoup.nodes.Entities.escape("", charsetEncoder53, escapeMode58);
        java.lang.String str62 = org.jsoup.nodes.Entities.escape("", charsetEncoder51, escapeMode58);
        java.lang.String str63 = org.jsoup.nodes.Entities.escape("", charsetEncoder49, escapeMode58);
        java.lang.String str64 = org.jsoup.nodes.Entities.escape("", charsetEncoder47, escapeMode58);
        java.lang.String str65 = org.jsoup.nodes.Entities.escape("", charsetEncoder45, escapeMode58);
        java.lang.String str66 = org.jsoup.nodes.Entities.escape("", charsetEncoder43, escapeMode58);
        java.lang.String str67 = org.jsoup.nodes.Entities.escape("", charsetEncoder41, escapeMode58);
        java.lang.String str68 = org.jsoup.nodes.Entities.escape("", charsetEncoder39, escapeMode58);
        java.lang.String str69 = org.jsoup.nodes.Entities.escape("", charsetEncoder37, escapeMode58);
        java.lang.String str70 = org.jsoup.nodes.Entities.escape("", charsetEncoder35, escapeMode58);
        java.lang.String str71 = org.jsoup.nodes.Entities.escape("", charsetEncoder33, escapeMode58);
        java.lang.String str72 = org.jsoup.nodes.Entities.escape("", charsetEncoder31, escapeMode58);
        java.lang.String str73 = org.jsoup.nodes.Entities.escape("", charsetEncoder29, escapeMode58);
        java.lang.String str74 = org.jsoup.nodes.Entities.escape("", charsetEncoder27, escapeMode58);
        java.lang.String str75 = org.jsoup.nodes.Entities.escape("", charsetEncoder25, escapeMode58);
        java.lang.String str76 = org.jsoup.nodes.Entities.escape("", charsetEncoder23, escapeMode58);
        java.lang.String str77 = org.jsoup.nodes.Entities.escape("", charsetEncoder21, escapeMode58);
        java.lang.String str78 = org.jsoup.nodes.Entities.escape("", charsetEncoder19, escapeMode58);
        java.lang.String str79 = org.jsoup.nodes.Entities.escape("", charsetEncoder17, escapeMode58);
        java.lang.String str80 = org.jsoup.nodes.Entities.escape("", charsetEncoder15, escapeMode58);
        java.lang.String str81 = org.jsoup.nodes.Entities.escape("", charsetEncoder13, escapeMode58);
        java.lang.String str82 = org.jsoup.nodes.Entities.escape("", charsetEncoder11, escapeMode58);
        java.lang.String str83 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode58);
        java.lang.String str84 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode58);
        java.lang.String str85 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode58);
        java.lang.String str86 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode58);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str87 = org.jsoup.nodes.Entities.escape("hi!", charsetEncoder1, escapeMode58);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + escapeMode58 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.extended + "'", escapeMode58.equals(org.jsoup.nodes.Entities.EscapeMode.extended));
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "" + "'", str68, "");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "" + "'", str72, "");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "" + "'", str73, "");
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "" + "'", str74, "");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "" + "'", str75, "");
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "" + "'", str76, "");
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "" + "'", str77, "");
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "" + "'", str78, "");
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "" + "'", str79, "");
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "" + "'", str80, "");
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "" + "'", str81, "");
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "" + "'", str82, "");
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "" + "'", str83, "");
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "" + "'", str84, "");
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "" + "'", str85, "");
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "" + "'", str86, "");
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        java.nio.charset.CharsetEncoder charsetEncoder11 = null;
        java.nio.charset.CharsetEncoder charsetEncoder13 = null;
        java.nio.charset.CharsetEncoder charsetEncoder15 = null;
        java.nio.charset.CharsetEncoder charsetEncoder17 = null;
        java.nio.charset.CharsetEncoder charsetEncoder19 = null;
        java.nio.charset.CharsetEncoder charsetEncoder21 = null;
        java.nio.charset.CharsetEncoder charsetEncoder23 = null;
        java.nio.charset.CharsetEncoder charsetEncoder25 = null;
        java.nio.charset.CharsetEncoder charsetEncoder27 = null;
        java.nio.charset.CharsetEncoder charsetEncoder29 = null;
        java.nio.charset.CharsetEncoder charsetEncoder31 = null;
        java.nio.charset.CharsetEncoder charsetEncoder33 = null;
        java.nio.charset.CharsetEncoder charsetEncoder35 = null;
        java.nio.charset.CharsetEncoder charsetEncoder37 = null;
        java.nio.charset.CharsetEncoder charsetEncoder39 = null;
        java.nio.charset.CharsetEncoder charsetEncoder41 = null;
        java.nio.charset.CharsetEncoder charsetEncoder43 = null;
        java.nio.charset.CharsetEncoder charsetEncoder45 = null;
        java.nio.charset.CharsetEncoder charsetEncoder47 = null;
        java.nio.charset.CharsetEncoder charsetEncoder49 = null;
        java.nio.charset.CharsetEncoder charsetEncoder51 = null;
        java.nio.charset.CharsetEncoder charsetEncoder53 = null;
        java.nio.charset.CharsetEncoder charsetEncoder55 = null;
        java.nio.charset.CharsetEncoder charsetEncoder57 = null;
        java.nio.charset.CharsetEncoder charsetEncoder59 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode60 = org.jsoup.nodes.Entities.EscapeMode.extended;
        java.lang.String str61 = org.jsoup.nodes.Entities.escape("", charsetEncoder59, escapeMode60);
        java.lang.String str62 = org.jsoup.nodes.Entities.escape("", charsetEncoder57, escapeMode60);
        java.lang.String str63 = org.jsoup.nodes.Entities.escape("", charsetEncoder55, escapeMode60);
        java.lang.String str64 = org.jsoup.nodes.Entities.escape("", charsetEncoder53, escapeMode60);
        java.lang.String str65 = org.jsoup.nodes.Entities.escape("", charsetEncoder51, escapeMode60);
        java.lang.String str66 = org.jsoup.nodes.Entities.escape("", charsetEncoder49, escapeMode60);
        java.lang.String str67 = org.jsoup.nodes.Entities.escape("", charsetEncoder47, escapeMode60);
        java.lang.String str68 = org.jsoup.nodes.Entities.escape("", charsetEncoder45, escapeMode60);
        java.lang.String str69 = org.jsoup.nodes.Entities.escape("", charsetEncoder43, escapeMode60);
        java.lang.String str70 = org.jsoup.nodes.Entities.escape("", charsetEncoder41, escapeMode60);
        java.lang.String str71 = org.jsoup.nodes.Entities.escape("", charsetEncoder39, escapeMode60);
        java.lang.String str72 = org.jsoup.nodes.Entities.escape("", charsetEncoder37, escapeMode60);
        java.lang.String str73 = org.jsoup.nodes.Entities.escape("", charsetEncoder35, escapeMode60);
        java.lang.String str74 = org.jsoup.nodes.Entities.escape("", charsetEncoder33, escapeMode60);
        java.lang.String str75 = org.jsoup.nodes.Entities.escape("", charsetEncoder31, escapeMode60);
        java.lang.String str76 = org.jsoup.nodes.Entities.escape("", charsetEncoder29, escapeMode60);
        java.lang.String str77 = org.jsoup.nodes.Entities.escape("", charsetEncoder27, escapeMode60);
        java.lang.String str78 = org.jsoup.nodes.Entities.escape("", charsetEncoder25, escapeMode60);
        java.lang.String str79 = org.jsoup.nodes.Entities.escape("", charsetEncoder23, escapeMode60);
        java.lang.String str80 = org.jsoup.nodes.Entities.escape("", charsetEncoder21, escapeMode60);
        java.lang.String str81 = org.jsoup.nodes.Entities.escape("", charsetEncoder19, escapeMode60);
        java.lang.String str82 = org.jsoup.nodes.Entities.escape("", charsetEncoder17, escapeMode60);
        java.lang.String str83 = org.jsoup.nodes.Entities.escape("", charsetEncoder15, escapeMode60);
        java.lang.String str84 = org.jsoup.nodes.Entities.escape("", charsetEncoder13, escapeMode60);
        java.lang.String str85 = org.jsoup.nodes.Entities.escape("", charsetEncoder11, escapeMode60);
        java.lang.String str86 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode60);
        java.lang.String str87 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode60);
        java.lang.String str88 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode60);
        java.lang.String str89 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode60);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str90 = org.jsoup.nodes.Entities.escape("hi!", charsetEncoder1, escapeMode60);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + escapeMode60 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.extended + "'", escapeMode60.equals(org.jsoup.nodes.Entities.EscapeMode.extended));
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "" + "'", str68, "");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "" + "'", str72, "");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "" + "'", str73, "");
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "" + "'", str74, "");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "" + "'", str75, "");
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "" + "'", str76, "");
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "" + "'", str77, "");
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "" + "'", str78, "");
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "" + "'", str79, "");
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "" + "'", str80, "");
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "" + "'", str81, "");
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "" + "'", str82, "");
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "" + "'", str83, "");
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "" + "'", str84, "");
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "" + "'", str85, "");
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "" + "'", str86, "");
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "" + "'", str87, "");
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "" + "'", str88, "");
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "" + "'", str89, "");
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        java.nio.charset.CharsetEncoder charsetEncoder11 = null;
        java.nio.charset.CharsetEncoder charsetEncoder13 = null;
        java.nio.charset.CharsetEncoder charsetEncoder15 = null;
        java.nio.charset.CharsetEncoder charsetEncoder17 = null;
        java.nio.charset.CharsetEncoder charsetEncoder19 = null;
        java.nio.charset.CharsetEncoder charsetEncoder21 = null;
        java.nio.charset.CharsetEncoder charsetEncoder23 = null;
        java.nio.charset.CharsetEncoder charsetEncoder25 = null;
        java.nio.charset.CharsetEncoder charsetEncoder27 = null;
        java.nio.charset.CharsetEncoder charsetEncoder29 = null;
        java.nio.charset.CharsetEncoder charsetEncoder31 = null;
        java.nio.charset.CharsetEncoder charsetEncoder33 = null;
        java.nio.charset.CharsetEncoder charsetEncoder35 = null;
        java.nio.charset.CharsetEncoder charsetEncoder37 = null;
        java.nio.charset.CharsetEncoder charsetEncoder39 = null;
        java.nio.charset.CharsetEncoder charsetEncoder41 = null;
        java.nio.charset.CharsetEncoder charsetEncoder43 = null;
        java.nio.charset.CharsetEncoder charsetEncoder45 = null;
        java.nio.charset.CharsetEncoder charsetEncoder47 = null;
        java.nio.charset.CharsetEncoder charsetEncoder49 = null;
        java.nio.charset.CharsetEncoder charsetEncoder51 = null;
        java.nio.charset.CharsetEncoder charsetEncoder53 = null;
        java.nio.charset.CharsetEncoder charsetEncoder55 = null;
        java.nio.charset.CharsetEncoder charsetEncoder57 = null;
        java.nio.charset.CharsetEncoder charsetEncoder59 = null;
        java.nio.charset.CharsetEncoder charsetEncoder61 = null;
        java.nio.charset.CharsetEncoder charsetEncoder63 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode64 = org.jsoup.nodes.Entities.EscapeMode.base;
        java.lang.String str65 = org.jsoup.nodes.Entities.escape("", charsetEncoder63, escapeMode64);
        java.lang.String str66 = org.jsoup.nodes.Entities.escape("", charsetEncoder61, escapeMode64);
        java.lang.String str67 = org.jsoup.nodes.Entities.escape("", charsetEncoder59, escapeMode64);
        java.lang.String str68 = org.jsoup.nodes.Entities.escape("", charsetEncoder57, escapeMode64);
        java.lang.String str69 = org.jsoup.nodes.Entities.escape("", charsetEncoder55, escapeMode64);
        java.lang.String str70 = org.jsoup.nodes.Entities.escape("", charsetEncoder53, escapeMode64);
        java.lang.String str71 = org.jsoup.nodes.Entities.escape("", charsetEncoder51, escapeMode64);
        java.lang.String str72 = org.jsoup.nodes.Entities.escape("", charsetEncoder49, escapeMode64);
        java.lang.String str73 = org.jsoup.nodes.Entities.escape("", charsetEncoder47, escapeMode64);
        java.lang.String str74 = org.jsoup.nodes.Entities.escape("", charsetEncoder45, escapeMode64);
        java.lang.String str75 = org.jsoup.nodes.Entities.escape("", charsetEncoder43, escapeMode64);
        java.lang.String str76 = org.jsoup.nodes.Entities.escape("", charsetEncoder41, escapeMode64);
        java.lang.String str77 = org.jsoup.nodes.Entities.escape("", charsetEncoder39, escapeMode64);
        java.lang.String str78 = org.jsoup.nodes.Entities.escape("", charsetEncoder37, escapeMode64);
        java.lang.String str79 = org.jsoup.nodes.Entities.escape("", charsetEncoder35, escapeMode64);
        java.lang.String str80 = org.jsoup.nodes.Entities.escape("", charsetEncoder33, escapeMode64);
        java.lang.String str81 = org.jsoup.nodes.Entities.escape("", charsetEncoder31, escapeMode64);
        java.lang.String str82 = org.jsoup.nodes.Entities.escape("", charsetEncoder29, escapeMode64);
        java.lang.String str83 = org.jsoup.nodes.Entities.escape("", charsetEncoder27, escapeMode64);
        java.lang.String str84 = org.jsoup.nodes.Entities.escape("", charsetEncoder25, escapeMode64);
        java.lang.String str85 = org.jsoup.nodes.Entities.escape("", charsetEncoder23, escapeMode64);
        java.lang.String str86 = org.jsoup.nodes.Entities.escape("", charsetEncoder21, escapeMode64);
        java.lang.String str87 = org.jsoup.nodes.Entities.escape("", charsetEncoder19, escapeMode64);
        java.lang.String str88 = org.jsoup.nodes.Entities.escape("", charsetEncoder17, escapeMode64);
        java.lang.String str89 = org.jsoup.nodes.Entities.escape("", charsetEncoder15, escapeMode64);
        java.lang.String str90 = org.jsoup.nodes.Entities.escape("", charsetEncoder13, escapeMode64);
        java.lang.String str91 = org.jsoup.nodes.Entities.escape("", charsetEncoder11, escapeMode64);
        java.lang.String str92 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode64);
        java.lang.String str93 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode64);
        java.lang.String str94 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode64);
        java.lang.String str95 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode64);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str96 = org.jsoup.nodes.Entities.escape("hi!", charsetEncoder1, escapeMode64);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + escapeMode64 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode64.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "" + "'", str68, "");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "" + "'", str72, "");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "" + "'", str73, "");
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "" + "'", str74, "");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "" + "'", str75, "");
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "" + "'", str76, "");
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "" + "'", str77, "");
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "" + "'", str78, "");
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "" + "'", str79, "");
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "" + "'", str80, "");
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "" + "'", str81, "");
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "" + "'", str82, "");
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "" + "'", str83, "");
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "" + "'", str84, "");
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "" + "'", str85, "");
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "" + "'", str86, "");
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "" + "'", str87, "");
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "" + "'", str88, "");
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "" + "'", str89, "");
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "" + "'", str90, "");
        org.junit.Assert.assertEquals("'" + str91 + "' != '" + "" + "'", str91, "");
        org.junit.Assert.assertEquals("'" + str92 + "' != '" + "" + "'", str92, "");
        org.junit.Assert.assertEquals("'" + str93 + "' != '" + "" + "'", str93, "");
        org.junit.Assert.assertEquals("'" + str94 + "' != '" + "" + "'", str94, "");
        org.junit.Assert.assertEquals("'" + str95 + "' != '" + "" + "'", str95, "");
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        java.nio.charset.CharsetEncoder charsetEncoder11 = null;
        java.nio.charset.CharsetEncoder charsetEncoder13 = null;
        java.nio.charset.CharsetEncoder charsetEncoder15 = null;
        java.nio.charset.CharsetEncoder charsetEncoder17 = null;
        java.nio.charset.CharsetEncoder charsetEncoder19 = null;
        java.nio.charset.CharsetEncoder charsetEncoder21 = null;
        java.nio.charset.CharsetEncoder charsetEncoder23 = null;
        java.nio.charset.CharsetEncoder charsetEncoder25 = null;
        java.nio.charset.CharsetEncoder charsetEncoder27 = null;
        java.nio.charset.CharsetEncoder charsetEncoder29 = null;
        java.nio.charset.CharsetEncoder charsetEncoder31 = null;
        java.nio.charset.CharsetEncoder charsetEncoder33 = null;
        java.nio.charset.CharsetEncoder charsetEncoder35 = null;
        java.nio.charset.CharsetEncoder charsetEncoder37 = null;
        java.nio.charset.CharsetEncoder charsetEncoder39 = null;
        java.nio.charset.CharsetEncoder charsetEncoder41 = null;
        java.nio.charset.CharsetEncoder charsetEncoder43 = null;
        java.nio.charset.CharsetEncoder charsetEncoder45 = null;
        java.nio.charset.CharsetEncoder charsetEncoder47 = null;
        java.nio.charset.CharsetEncoder charsetEncoder49 = null;
        java.nio.charset.CharsetEncoder charsetEncoder51 = null;
        java.nio.charset.CharsetEncoder charsetEncoder53 = null;
        java.nio.charset.CharsetEncoder charsetEncoder55 = null;
        java.nio.charset.CharsetEncoder charsetEncoder57 = null;
        java.nio.charset.CharsetEncoder charsetEncoder59 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode60 = org.jsoup.nodes.Entities.EscapeMode.base;
        java.lang.String str61 = org.jsoup.nodes.Entities.escape("", charsetEncoder59, escapeMode60);
        java.lang.String str62 = org.jsoup.nodes.Entities.escape("", charsetEncoder57, escapeMode60);
        java.lang.String str63 = org.jsoup.nodes.Entities.escape("", charsetEncoder55, escapeMode60);
        java.lang.String str64 = org.jsoup.nodes.Entities.escape("", charsetEncoder53, escapeMode60);
        java.lang.String str65 = org.jsoup.nodes.Entities.escape("", charsetEncoder51, escapeMode60);
        java.lang.String str66 = org.jsoup.nodes.Entities.escape("", charsetEncoder49, escapeMode60);
        java.lang.String str67 = org.jsoup.nodes.Entities.escape("", charsetEncoder47, escapeMode60);
        java.lang.String str68 = org.jsoup.nodes.Entities.escape("", charsetEncoder45, escapeMode60);
        java.lang.String str69 = org.jsoup.nodes.Entities.escape("", charsetEncoder43, escapeMode60);
        java.lang.String str70 = org.jsoup.nodes.Entities.escape("", charsetEncoder41, escapeMode60);
        java.lang.String str71 = org.jsoup.nodes.Entities.escape("", charsetEncoder39, escapeMode60);
        java.lang.String str72 = org.jsoup.nodes.Entities.escape("", charsetEncoder37, escapeMode60);
        java.lang.String str73 = org.jsoup.nodes.Entities.escape("", charsetEncoder35, escapeMode60);
        java.lang.String str74 = org.jsoup.nodes.Entities.escape("", charsetEncoder33, escapeMode60);
        java.lang.String str75 = org.jsoup.nodes.Entities.escape("", charsetEncoder31, escapeMode60);
        java.lang.String str76 = org.jsoup.nodes.Entities.escape("", charsetEncoder29, escapeMode60);
        java.lang.String str77 = org.jsoup.nodes.Entities.escape("", charsetEncoder27, escapeMode60);
        java.lang.String str78 = org.jsoup.nodes.Entities.escape("", charsetEncoder25, escapeMode60);
        java.lang.String str79 = org.jsoup.nodes.Entities.escape("", charsetEncoder23, escapeMode60);
        java.lang.String str80 = org.jsoup.nodes.Entities.escape("", charsetEncoder21, escapeMode60);
        java.lang.String str81 = org.jsoup.nodes.Entities.escape("", charsetEncoder19, escapeMode60);
        java.lang.String str82 = org.jsoup.nodes.Entities.escape("", charsetEncoder17, escapeMode60);
        java.lang.String str83 = org.jsoup.nodes.Entities.escape("", charsetEncoder15, escapeMode60);
        java.lang.String str84 = org.jsoup.nodes.Entities.escape("", charsetEncoder13, escapeMode60);
        java.lang.String str85 = org.jsoup.nodes.Entities.escape("", charsetEncoder11, escapeMode60);
        java.lang.String str86 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode60);
        java.lang.String str87 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode60);
        java.lang.String str88 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode60);
        java.lang.String str89 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode60);
        java.lang.String str90 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode60);
        java.lang.Class<?> wildcardClass91 = escapeMode60.getClass();
        org.junit.Assert.assertTrue("'" + escapeMode60 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode60.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "" + "'", str68, "");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "" + "'", str72, "");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "" + "'", str73, "");
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "" + "'", str74, "");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "" + "'", str75, "");
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "" + "'", str76, "");
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "" + "'", str77, "");
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "" + "'", str78, "");
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "" + "'", str79, "");
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "" + "'", str80, "");
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "" + "'", str81, "");
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "" + "'", str82, "");
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "" + "'", str83, "");
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "" + "'", str84, "");
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "" + "'", str85, "");
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "" + "'", str86, "");
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "" + "'", str87, "");
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "" + "'", str88, "");
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "" + "'", str89, "");
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "" + "'", str90, "");
        org.junit.Assert.assertNotNull(wildcardClass91);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        java.nio.charset.CharsetEncoder charsetEncoder11 = null;
        java.nio.charset.CharsetEncoder charsetEncoder13 = null;
        java.nio.charset.CharsetEncoder charsetEncoder15 = null;
        java.nio.charset.CharsetEncoder charsetEncoder17 = null;
        java.nio.charset.CharsetEncoder charsetEncoder19 = null;
        java.nio.charset.CharsetEncoder charsetEncoder21 = null;
        java.nio.charset.CharsetEncoder charsetEncoder23 = null;
        java.nio.charset.CharsetEncoder charsetEncoder25 = null;
        java.nio.charset.CharsetEncoder charsetEncoder27 = null;
        java.nio.charset.CharsetEncoder charsetEncoder29 = null;
        java.nio.charset.CharsetEncoder charsetEncoder31 = null;
        java.nio.charset.CharsetEncoder charsetEncoder33 = null;
        java.nio.charset.CharsetEncoder charsetEncoder35 = null;
        java.nio.charset.CharsetEncoder charsetEncoder37 = null;
        java.nio.charset.CharsetEncoder charsetEncoder39 = null;
        java.nio.charset.CharsetEncoder charsetEncoder41 = null;
        java.nio.charset.CharsetEncoder charsetEncoder43 = null;
        java.nio.charset.CharsetEncoder charsetEncoder45 = null;
        java.nio.charset.CharsetEncoder charsetEncoder47 = null;
        java.nio.charset.CharsetEncoder charsetEncoder49 = null;
        java.nio.charset.CharsetEncoder charsetEncoder51 = null;
        java.nio.charset.CharsetEncoder charsetEncoder53 = null;
        java.nio.charset.CharsetEncoder charsetEncoder55 = null;
        java.nio.charset.CharsetEncoder charsetEncoder57 = null;
        java.nio.charset.CharsetEncoder charsetEncoder59 = null;
        java.nio.charset.CharsetEncoder charsetEncoder61 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode62 = org.jsoup.nodes.Entities.EscapeMode.base;
        java.lang.String str63 = org.jsoup.nodes.Entities.escape("", charsetEncoder61, escapeMode62);
        java.lang.String str64 = org.jsoup.nodes.Entities.escape("", charsetEncoder59, escapeMode62);
        java.lang.String str65 = org.jsoup.nodes.Entities.escape("", charsetEncoder57, escapeMode62);
        java.lang.String str66 = org.jsoup.nodes.Entities.escape("", charsetEncoder55, escapeMode62);
        java.lang.String str67 = org.jsoup.nodes.Entities.escape("", charsetEncoder53, escapeMode62);
        java.lang.String str68 = org.jsoup.nodes.Entities.escape("", charsetEncoder51, escapeMode62);
        java.lang.String str69 = org.jsoup.nodes.Entities.escape("", charsetEncoder49, escapeMode62);
        java.lang.String str70 = org.jsoup.nodes.Entities.escape("", charsetEncoder47, escapeMode62);
        java.lang.String str71 = org.jsoup.nodes.Entities.escape("", charsetEncoder45, escapeMode62);
        java.lang.String str72 = org.jsoup.nodes.Entities.escape("", charsetEncoder43, escapeMode62);
        java.lang.String str73 = org.jsoup.nodes.Entities.escape("", charsetEncoder41, escapeMode62);
        java.lang.String str74 = org.jsoup.nodes.Entities.escape("", charsetEncoder39, escapeMode62);
        java.lang.String str75 = org.jsoup.nodes.Entities.escape("", charsetEncoder37, escapeMode62);
        java.lang.String str76 = org.jsoup.nodes.Entities.escape("", charsetEncoder35, escapeMode62);
        java.lang.String str77 = org.jsoup.nodes.Entities.escape("", charsetEncoder33, escapeMode62);
        java.lang.String str78 = org.jsoup.nodes.Entities.escape("", charsetEncoder31, escapeMode62);
        java.lang.String str79 = org.jsoup.nodes.Entities.escape("", charsetEncoder29, escapeMode62);
        java.lang.String str80 = org.jsoup.nodes.Entities.escape("", charsetEncoder27, escapeMode62);
        java.lang.String str81 = org.jsoup.nodes.Entities.escape("", charsetEncoder25, escapeMode62);
        java.lang.String str82 = org.jsoup.nodes.Entities.escape("", charsetEncoder23, escapeMode62);
        java.lang.String str83 = org.jsoup.nodes.Entities.escape("", charsetEncoder21, escapeMode62);
        java.lang.String str84 = org.jsoup.nodes.Entities.escape("", charsetEncoder19, escapeMode62);
        java.lang.String str85 = org.jsoup.nodes.Entities.escape("", charsetEncoder17, escapeMode62);
        java.lang.String str86 = org.jsoup.nodes.Entities.escape("", charsetEncoder15, escapeMode62);
        java.lang.String str87 = org.jsoup.nodes.Entities.escape("", charsetEncoder13, escapeMode62);
        java.lang.String str88 = org.jsoup.nodes.Entities.escape("", charsetEncoder11, escapeMode62);
        java.lang.String str89 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode62);
        java.lang.String str90 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode62);
        java.lang.String str91 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode62);
        java.lang.String str92 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode62);
        java.lang.String str93 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode62);
        java.lang.Class<?> wildcardClass94 = escapeMode62.getClass();
        org.junit.Assert.assertTrue("'" + escapeMode62 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode62.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "" + "'", str68, "");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "" + "'", str72, "");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "" + "'", str73, "");
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "" + "'", str74, "");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "" + "'", str75, "");
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "" + "'", str76, "");
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "" + "'", str77, "");
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "" + "'", str78, "");
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "" + "'", str79, "");
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "" + "'", str80, "");
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "" + "'", str81, "");
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "" + "'", str82, "");
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "" + "'", str83, "");
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "" + "'", str84, "");
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "" + "'", str85, "");
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "" + "'", str86, "");
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "" + "'", str87, "");
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "" + "'", str88, "");
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "" + "'", str89, "");
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "" + "'", str90, "");
        org.junit.Assert.assertEquals("'" + str91 + "' != '" + "" + "'", str91, "");
        org.junit.Assert.assertEquals("'" + str92 + "' != '" + "" + "'", str92, "");
        org.junit.Assert.assertEquals("'" + str93 + "' != '" + "" + "'", str93, "");
        org.junit.Assert.assertNotNull(wildcardClass94);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        java.nio.charset.CharsetEncoder charsetEncoder11 = null;
        java.nio.charset.CharsetEncoder charsetEncoder13 = null;
        java.nio.charset.CharsetEncoder charsetEncoder15 = null;
        java.nio.charset.CharsetEncoder charsetEncoder17 = null;
        java.nio.charset.CharsetEncoder charsetEncoder19 = null;
        java.nio.charset.CharsetEncoder charsetEncoder21 = null;
        java.nio.charset.CharsetEncoder charsetEncoder23 = null;
        java.nio.charset.CharsetEncoder charsetEncoder25 = null;
        java.nio.charset.CharsetEncoder charsetEncoder27 = null;
        java.nio.charset.CharsetEncoder charsetEncoder29 = null;
        java.nio.charset.CharsetEncoder charsetEncoder31 = null;
        java.nio.charset.CharsetEncoder charsetEncoder33 = null;
        java.nio.charset.CharsetEncoder charsetEncoder35 = null;
        java.nio.charset.CharsetEncoder charsetEncoder37 = null;
        java.nio.charset.CharsetEncoder charsetEncoder39 = null;
        java.nio.charset.CharsetEncoder charsetEncoder41 = null;
        java.nio.charset.CharsetEncoder charsetEncoder43 = null;
        java.nio.charset.CharsetEncoder charsetEncoder45 = null;
        java.nio.charset.CharsetEncoder charsetEncoder47 = null;
        java.nio.charset.CharsetEncoder charsetEncoder49 = null;
        java.nio.charset.CharsetEncoder charsetEncoder51 = null;
        java.nio.charset.CharsetEncoder charsetEncoder53 = null;
        java.nio.charset.CharsetEncoder charsetEncoder55 = null;
        java.nio.charset.CharsetEncoder charsetEncoder57 = null;
        java.nio.charset.CharsetEncoder charsetEncoder59 = null;
        java.nio.charset.CharsetEncoder charsetEncoder61 = null;
        java.nio.charset.CharsetEncoder charsetEncoder63 = null;
        java.nio.charset.CharsetEncoder charsetEncoder65 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode66 = org.jsoup.nodes.Entities.EscapeMode.base;
        java.lang.String str67 = org.jsoup.nodes.Entities.escape("", charsetEncoder65, escapeMode66);
        java.lang.String str68 = org.jsoup.nodes.Entities.escape("", charsetEncoder63, escapeMode66);
        java.lang.String str69 = org.jsoup.nodes.Entities.escape("", charsetEncoder61, escapeMode66);
        java.lang.String str70 = org.jsoup.nodes.Entities.escape("", charsetEncoder59, escapeMode66);
        java.lang.String str71 = org.jsoup.nodes.Entities.escape("", charsetEncoder57, escapeMode66);
        java.lang.String str72 = org.jsoup.nodes.Entities.escape("", charsetEncoder55, escapeMode66);
        java.lang.String str73 = org.jsoup.nodes.Entities.escape("", charsetEncoder53, escapeMode66);
        java.lang.String str74 = org.jsoup.nodes.Entities.escape("", charsetEncoder51, escapeMode66);
        java.lang.String str75 = org.jsoup.nodes.Entities.escape("", charsetEncoder49, escapeMode66);
        java.lang.String str76 = org.jsoup.nodes.Entities.escape("", charsetEncoder47, escapeMode66);
        java.lang.String str77 = org.jsoup.nodes.Entities.escape("", charsetEncoder45, escapeMode66);
        java.lang.String str78 = org.jsoup.nodes.Entities.escape("", charsetEncoder43, escapeMode66);
        java.lang.String str79 = org.jsoup.nodes.Entities.escape("", charsetEncoder41, escapeMode66);
        java.lang.String str80 = org.jsoup.nodes.Entities.escape("", charsetEncoder39, escapeMode66);
        java.lang.String str81 = org.jsoup.nodes.Entities.escape("", charsetEncoder37, escapeMode66);
        java.lang.String str82 = org.jsoup.nodes.Entities.escape("", charsetEncoder35, escapeMode66);
        java.lang.String str83 = org.jsoup.nodes.Entities.escape("", charsetEncoder33, escapeMode66);
        java.lang.String str84 = org.jsoup.nodes.Entities.escape("", charsetEncoder31, escapeMode66);
        java.lang.String str85 = org.jsoup.nodes.Entities.escape("", charsetEncoder29, escapeMode66);
        java.lang.String str86 = org.jsoup.nodes.Entities.escape("", charsetEncoder27, escapeMode66);
        java.lang.String str87 = org.jsoup.nodes.Entities.escape("", charsetEncoder25, escapeMode66);
        java.lang.String str88 = org.jsoup.nodes.Entities.escape("", charsetEncoder23, escapeMode66);
        java.lang.String str89 = org.jsoup.nodes.Entities.escape("", charsetEncoder21, escapeMode66);
        java.lang.String str90 = org.jsoup.nodes.Entities.escape("", charsetEncoder19, escapeMode66);
        java.lang.String str91 = org.jsoup.nodes.Entities.escape("", charsetEncoder17, escapeMode66);
        java.lang.String str92 = org.jsoup.nodes.Entities.escape("", charsetEncoder15, escapeMode66);
        java.lang.String str93 = org.jsoup.nodes.Entities.escape("", charsetEncoder13, escapeMode66);
        java.lang.String str94 = org.jsoup.nodes.Entities.escape("", charsetEncoder11, escapeMode66);
        java.lang.String str95 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode66);
        java.lang.String str96 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode66);
        java.lang.String str97 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode66);
        java.lang.String str98 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode66);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str99 = org.jsoup.nodes.Entities.escape("hi!", charsetEncoder1, escapeMode66);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + escapeMode66 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode66.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "" + "'", str68, "");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "" + "'", str72, "");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "" + "'", str73, "");
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "" + "'", str74, "");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "" + "'", str75, "");
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "" + "'", str76, "");
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "" + "'", str77, "");
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "" + "'", str78, "");
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "" + "'", str79, "");
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "" + "'", str80, "");
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "" + "'", str81, "");
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "" + "'", str82, "");
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "" + "'", str83, "");
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "" + "'", str84, "");
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "" + "'", str85, "");
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "" + "'", str86, "");
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "" + "'", str87, "");
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "" + "'", str88, "");
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "" + "'", str89, "");
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "" + "'", str90, "");
        org.junit.Assert.assertEquals("'" + str91 + "' != '" + "" + "'", str91, "");
        org.junit.Assert.assertEquals("'" + str92 + "' != '" + "" + "'", str92, "");
        org.junit.Assert.assertEquals("'" + str93 + "' != '" + "" + "'", str93, "");
        org.junit.Assert.assertEquals("'" + str94 + "' != '" + "" + "'", str94, "");
        org.junit.Assert.assertEquals("'" + str95 + "' != '" + "" + "'", str95, "");
        org.junit.Assert.assertEquals("'" + str96 + "' != '" + "" + "'", str96, "");
        org.junit.Assert.assertEquals("'" + str97 + "' != '" + "" + "'", str97, "");
        org.junit.Assert.assertEquals("'" + str98 + "' != '" + "" + "'", str98, "");
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        java.nio.charset.CharsetEncoder charsetEncoder11 = null;
        java.nio.charset.CharsetEncoder charsetEncoder13 = null;
        java.nio.charset.CharsetEncoder charsetEncoder15 = null;
        java.nio.charset.CharsetEncoder charsetEncoder17 = null;
        java.nio.charset.CharsetEncoder charsetEncoder19 = null;
        java.nio.charset.CharsetEncoder charsetEncoder21 = null;
        java.nio.charset.CharsetEncoder charsetEncoder23 = null;
        java.nio.charset.CharsetEncoder charsetEncoder25 = null;
        java.nio.charset.CharsetEncoder charsetEncoder27 = null;
        java.nio.charset.CharsetEncoder charsetEncoder29 = null;
        java.nio.charset.CharsetEncoder charsetEncoder31 = null;
        java.nio.charset.CharsetEncoder charsetEncoder33 = null;
        java.nio.charset.CharsetEncoder charsetEncoder35 = null;
        java.nio.charset.CharsetEncoder charsetEncoder37 = null;
        java.nio.charset.CharsetEncoder charsetEncoder39 = null;
        java.nio.charset.CharsetEncoder charsetEncoder41 = null;
        java.nio.charset.CharsetEncoder charsetEncoder43 = null;
        java.nio.charset.CharsetEncoder charsetEncoder45 = null;
        java.nio.charset.CharsetEncoder charsetEncoder47 = null;
        java.nio.charset.CharsetEncoder charsetEncoder49 = null;
        java.nio.charset.CharsetEncoder charsetEncoder51 = null;
        java.nio.charset.CharsetEncoder charsetEncoder53 = null;
        java.nio.charset.CharsetEncoder charsetEncoder55 = null;
        java.nio.charset.CharsetEncoder charsetEncoder57 = null;
        java.nio.charset.CharsetEncoder charsetEncoder59 = null;
        java.nio.charset.CharsetEncoder charsetEncoder61 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode62 = org.jsoup.nodes.Entities.EscapeMode.extended;
        java.lang.String str63 = org.jsoup.nodes.Entities.escape("", charsetEncoder61, escapeMode62);
        java.lang.String str64 = org.jsoup.nodes.Entities.escape("", charsetEncoder59, escapeMode62);
        java.lang.String str65 = org.jsoup.nodes.Entities.escape("", charsetEncoder57, escapeMode62);
        java.lang.String str66 = org.jsoup.nodes.Entities.escape("", charsetEncoder55, escapeMode62);
        java.lang.String str67 = org.jsoup.nodes.Entities.escape("", charsetEncoder53, escapeMode62);
        java.lang.String str68 = org.jsoup.nodes.Entities.escape("", charsetEncoder51, escapeMode62);
        java.lang.String str69 = org.jsoup.nodes.Entities.escape("", charsetEncoder49, escapeMode62);
        java.lang.String str70 = org.jsoup.nodes.Entities.escape("", charsetEncoder47, escapeMode62);
        java.lang.String str71 = org.jsoup.nodes.Entities.escape("", charsetEncoder45, escapeMode62);
        java.lang.String str72 = org.jsoup.nodes.Entities.escape("", charsetEncoder43, escapeMode62);
        java.lang.String str73 = org.jsoup.nodes.Entities.escape("", charsetEncoder41, escapeMode62);
        java.lang.String str74 = org.jsoup.nodes.Entities.escape("", charsetEncoder39, escapeMode62);
        java.lang.String str75 = org.jsoup.nodes.Entities.escape("", charsetEncoder37, escapeMode62);
        java.lang.String str76 = org.jsoup.nodes.Entities.escape("", charsetEncoder35, escapeMode62);
        java.lang.String str77 = org.jsoup.nodes.Entities.escape("", charsetEncoder33, escapeMode62);
        java.lang.String str78 = org.jsoup.nodes.Entities.escape("", charsetEncoder31, escapeMode62);
        java.lang.String str79 = org.jsoup.nodes.Entities.escape("", charsetEncoder29, escapeMode62);
        java.lang.String str80 = org.jsoup.nodes.Entities.escape("", charsetEncoder27, escapeMode62);
        java.lang.String str81 = org.jsoup.nodes.Entities.escape("", charsetEncoder25, escapeMode62);
        java.lang.String str82 = org.jsoup.nodes.Entities.escape("", charsetEncoder23, escapeMode62);
        java.lang.String str83 = org.jsoup.nodes.Entities.escape("", charsetEncoder21, escapeMode62);
        java.lang.String str84 = org.jsoup.nodes.Entities.escape("", charsetEncoder19, escapeMode62);
        java.lang.String str85 = org.jsoup.nodes.Entities.escape("", charsetEncoder17, escapeMode62);
        java.lang.String str86 = org.jsoup.nodes.Entities.escape("", charsetEncoder15, escapeMode62);
        java.lang.String str87 = org.jsoup.nodes.Entities.escape("", charsetEncoder13, escapeMode62);
        java.lang.String str88 = org.jsoup.nodes.Entities.escape("", charsetEncoder11, escapeMode62);
        java.lang.String str89 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode62);
        java.lang.String str90 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode62);
        java.lang.String str91 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode62);
        java.lang.String str92 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode62);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str93 = org.jsoup.nodes.Entities.escape("hi!", charsetEncoder1, escapeMode62);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + escapeMode62 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.extended + "'", escapeMode62.equals(org.jsoup.nodes.Entities.EscapeMode.extended));
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "" + "'", str68, "");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "" + "'", str72, "");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "" + "'", str73, "");
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "" + "'", str74, "");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "" + "'", str75, "");
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "" + "'", str76, "");
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "" + "'", str77, "");
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "" + "'", str78, "");
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "" + "'", str79, "");
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "" + "'", str80, "");
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "" + "'", str81, "");
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "" + "'", str82, "");
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "" + "'", str83, "");
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "" + "'", str84, "");
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "" + "'", str85, "");
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "" + "'", str86, "");
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "" + "'", str87, "");
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "" + "'", str88, "");
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "" + "'", str89, "");
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "" + "'", str90, "");
        org.junit.Assert.assertEquals("'" + str91 + "' != '" + "" + "'", str91, "");
        org.junit.Assert.assertEquals("'" + str92 + "' != '" + "" + "'", str92, "");
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        java.nio.charset.CharsetEncoder charsetEncoder11 = null;
        java.nio.charset.CharsetEncoder charsetEncoder13 = null;
        java.nio.charset.CharsetEncoder charsetEncoder15 = null;
        java.nio.charset.CharsetEncoder charsetEncoder17 = null;
        java.nio.charset.CharsetEncoder charsetEncoder19 = null;
        java.nio.charset.CharsetEncoder charsetEncoder21 = null;
        java.nio.charset.CharsetEncoder charsetEncoder23 = null;
        java.nio.charset.CharsetEncoder charsetEncoder25 = null;
        java.nio.charset.CharsetEncoder charsetEncoder27 = null;
        java.nio.charset.CharsetEncoder charsetEncoder29 = null;
        java.nio.charset.CharsetEncoder charsetEncoder31 = null;
        java.nio.charset.CharsetEncoder charsetEncoder33 = null;
        java.nio.charset.CharsetEncoder charsetEncoder35 = null;
        java.nio.charset.CharsetEncoder charsetEncoder37 = null;
        java.nio.charset.CharsetEncoder charsetEncoder39 = null;
        java.nio.charset.CharsetEncoder charsetEncoder41 = null;
        java.nio.charset.CharsetEncoder charsetEncoder43 = null;
        java.nio.charset.CharsetEncoder charsetEncoder45 = null;
        java.nio.charset.CharsetEncoder charsetEncoder47 = null;
        java.nio.charset.CharsetEncoder charsetEncoder49 = null;
        java.nio.charset.CharsetEncoder charsetEncoder51 = null;
        java.nio.charset.CharsetEncoder charsetEncoder53 = null;
        java.nio.charset.CharsetEncoder charsetEncoder55 = null;
        java.nio.charset.CharsetEncoder charsetEncoder57 = null;
        java.nio.charset.CharsetEncoder charsetEncoder59 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode60 = org.jsoup.nodes.Entities.EscapeMode.extended;
        java.lang.String str61 = org.jsoup.nodes.Entities.escape("", charsetEncoder59, escapeMode60);
        java.lang.String str62 = org.jsoup.nodes.Entities.escape("", charsetEncoder57, escapeMode60);
        java.lang.String str63 = org.jsoup.nodes.Entities.escape("", charsetEncoder55, escapeMode60);
        java.lang.String str64 = org.jsoup.nodes.Entities.escape("", charsetEncoder53, escapeMode60);
        java.lang.String str65 = org.jsoup.nodes.Entities.escape("", charsetEncoder51, escapeMode60);
        java.lang.String str66 = org.jsoup.nodes.Entities.escape("", charsetEncoder49, escapeMode60);
        java.lang.String str67 = org.jsoup.nodes.Entities.escape("", charsetEncoder47, escapeMode60);
        java.lang.String str68 = org.jsoup.nodes.Entities.escape("", charsetEncoder45, escapeMode60);
        java.lang.String str69 = org.jsoup.nodes.Entities.escape("", charsetEncoder43, escapeMode60);
        java.lang.String str70 = org.jsoup.nodes.Entities.escape("", charsetEncoder41, escapeMode60);
        java.lang.String str71 = org.jsoup.nodes.Entities.escape("", charsetEncoder39, escapeMode60);
        java.lang.String str72 = org.jsoup.nodes.Entities.escape("", charsetEncoder37, escapeMode60);
        java.lang.String str73 = org.jsoup.nodes.Entities.escape("", charsetEncoder35, escapeMode60);
        java.lang.String str74 = org.jsoup.nodes.Entities.escape("", charsetEncoder33, escapeMode60);
        java.lang.String str75 = org.jsoup.nodes.Entities.escape("", charsetEncoder31, escapeMode60);
        java.lang.String str76 = org.jsoup.nodes.Entities.escape("", charsetEncoder29, escapeMode60);
        java.lang.String str77 = org.jsoup.nodes.Entities.escape("", charsetEncoder27, escapeMode60);
        java.lang.String str78 = org.jsoup.nodes.Entities.escape("", charsetEncoder25, escapeMode60);
        java.lang.String str79 = org.jsoup.nodes.Entities.escape("", charsetEncoder23, escapeMode60);
        java.lang.String str80 = org.jsoup.nodes.Entities.escape("", charsetEncoder21, escapeMode60);
        java.lang.String str81 = org.jsoup.nodes.Entities.escape("", charsetEncoder19, escapeMode60);
        java.lang.String str82 = org.jsoup.nodes.Entities.escape("", charsetEncoder17, escapeMode60);
        java.lang.String str83 = org.jsoup.nodes.Entities.escape("", charsetEncoder15, escapeMode60);
        java.lang.String str84 = org.jsoup.nodes.Entities.escape("", charsetEncoder13, escapeMode60);
        java.lang.String str85 = org.jsoup.nodes.Entities.escape("", charsetEncoder11, escapeMode60);
        java.lang.String str86 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode60);
        java.lang.String str87 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode60);
        java.lang.String str88 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode60);
        java.lang.String str89 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode60);
        java.lang.String str90 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode60);
        java.lang.Class<?> wildcardClass91 = escapeMode60.getClass();
        org.junit.Assert.assertTrue("'" + escapeMode60 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.extended + "'", escapeMode60.equals(org.jsoup.nodes.Entities.EscapeMode.extended));
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "" + "'", str68, "");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "" + "'", str72, "");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "" + "'", str73, "");
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "" + "'", str74, "");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "" + "'", str75, "");
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "" + "'", str76, "");
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "" + "'", str77, "");
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "" + "'", str78, "");
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "" + "'", str79, "");
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "" + "'", str80, "");
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "" + "'", str81, "");
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "" + "'", str82, "");
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "" + "'", str83, "");
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "" + "'", str84, "");
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "" + "'", str85, "");
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "" + "'", str86, "");
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "" + "'", str87, "");
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "" + "'", str88, "");
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "" + "'", str89, "");
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "" + "'", str90, "");
        org.junit.Assert.assertNotNull(wildcardClass91);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        java.nio.charset.CharsetEncoder charsetEncoder11 = null;
        java.nio.charset.CharsetEncoder charsetEncoder13 = null;
        java.nio.charset.CharsetEncoder charsetEncoder15 = null;
        java.nio.charset.CharsetEncoder charsetEncoder17 = null;
        java.nio.charset.CharsetEncoder charsetEncoder19 = null;
        java.nio.charset.CharsetEncoder charsetEncoder21 = null;
        java.nio.charset.CharsetEncoder charsetEncoder23 = null;
        java.nio.charset.CharsetEncoder charsetEncoder25 = null;
        java.nio.charset.CharsetEncoder charsetEncoder27 = null;
        java.nio.charset.CharsetEncoder charsetEncoder29 = null;
        java.nio.charset.CharsetEncoder charsetEncoder31 = null;
        java.nio.charset.CharsetEncoder charsetEncoder33 = null;
        java.nio.charset.CharsetEncoder charsetEncoder35 = null;
        java.nio.charset.CharsetEncoder charsetEncoder37 = null;
        java.nio.charset.CharsetEncoder charsetEncoder39 = null;
        java.nio.charset.CharsetEncoder charsetEncoder41 = null;
        java.nio.charset.CharsetEncoder charsetEncoder43 = null;
        java.nio.charset.CharsetEncoder charsetEncoder45 = null;
        java.nio.charset.CharsetEncoder charsetEncoder47 = null;
        java.nio.charset.CharsetEncoder charsetEncoder49 = null;
        java.nio.charset.CharsetEncoder charsetEncoder51 = null;
        java.nio.charset.CharsetEncoder charsetEncoder53 = null;
        java.nio.charset.CharsetEncoder charsetEncoder55 = null;
        java.nio.charset.CharsetEncoder charsetEncoder57 = null;
        java.nio.charset.CharsetEncoder charsetEncoder59 = null;
        java.nio.charset.CharsetEncoder charsetEncoder61 = null;
        java.nio.charset.CharsetEncoder charsetEncoder63 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode64 = org.jsoup.nodes.Entities.EscapeMode.base;
        java.lang.String str65 = org.jsoup.nodes.Entities.escape("", charsetEncoder63, escapeMode64);
        java.lang.String str66 = org.jsoup.nodes.Entities.escape("", charsetEncoder61, escapeMode64);
        java.lang.String str67 = org.jsoup.nodes.Entities.escape("", charsetEncoder59, escapeMode64);
        java.lang.String str68 = org.jsoup.nodes.Entities.escape("", charsetEncoder57, escapeMode64);
        java.lang.String str69 = org.jsoup.nodes.Entities.escape("", charsetEncoder55, escapeMode64);
        java.lang.String str70 = org.jsoup.nodes.Entities.escape("", charsetEncoder53, escapeMode64);
        java.lang.String str71 = org.jsoup.nodes.Entities.escape("", charsetEncoder51, escapeMode64);
        java.lang.String str72 = org.jsoup.nodes.Entities.escape("", charsetEncoder49, escapeMode64);
        java.lang.String str73 = org.jsoup.nodes.Entities.escape("", charsetEncoder47, escapeMode64);
        java.lang.String str74 = org.jsoup.nodes.Entities.escape("", charsetEncoder45, escapeMode64);
        java.lang.String str75 = org.jsoup.nodes.Entities.escape("", charsetEncoder43, escapeMode64);
        java.lang.String str76 = org.jsoup.nodes.Entities.escape("", charsetEncoder41, escapeMode64);
        java.lang.String str77 = org.jsoup.nodes.Entities.escape("", charsetEncoder39, escapeMode64);
        java.lang.String str78 = org.jsoup.nodes.Entities.escape("", charsetEncoder37, escapeMode64);
        java.lang.String str79 = org.jsoup.nodes.Entities.escape("", charsetEncoder35, escapeMode64);
        java.lang.String str80 = org.jsoup.nodes.Entities.escape("", charsetEncoder33, escapeMode64);
        java.lang.String str81 = org.jsoup.nodes.Entities.escape("", charsetEncoder31, escapeMode64);
        java.lang.String str82 = org.jsoup.nodes.Entities.escape("", charsetEncoder29, escapeMode64);
        java.lang.String str83 = org.jsoup.nodes.Entities.escape("", charsetEncoder27, escapeMode64);
        java.lang.String str84 = org.jsoup.nodes.Entities.escape("", charsetEncoder25, escapeMode64);
        java.lang.String str85 = org.jsoup.nodes.Entities.escape("", charsetEncoder23, escapeMode64);
        java.lang.String str86 = org.jsoup.nodes.Entities.escape("", charsetEncoder21, escapeMode64);
        java.lang.String str87 = org.jsoup.nodes.Entities.escape("", charsetEncoder19, escapeMode64);
        java.lang.String str88 = org.jsoup.nodes.Entities.escape("", charsetEncoder17, escapeMode64);
        java.lang.String str89 = org.jsoup.nodes.Entities.escape("", charsetEncoder15, escapeMode64);
        java.lang.String str90 = org.jsoup.nodes.Entities.escape("", charsetEncoder13, escapeMode64);
        java.lang.String str91 = org.jsoup.nodes.Entities.escape("", charsetEncoder11, escapeMode64);
        java.lang.String str92 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode64);
        java.lang.String str93 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode64);
        java.lang.String str94 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode64);
        java.lang.String str95 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode64);
        java.lang.String str96 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode64);
        java.lang.Class<?> wildcardClass97 = escapeMode64.getClass();
        org.junit.Assert.assertTrue("'" + escapeMode64 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode64.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "" + "'", str68, "");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "" + "'", str72, "");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "" + "'", str73, "");
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "" + "'", str74, "");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "" + "'", str75, "");
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "" + "'", str76, "");
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "" + "'", str77, "");
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "" + "'", str78, "");
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "" + "'", str79, "");
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "" + "'", str80, "");
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "" + "'", str81, "");
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "" + "'", str82, "");
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "" + "'", str83, "");
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "" + "'", str84, "");
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "" + "'", str85, "");
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "" + "'", str86, "");
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "" + "'", str87, "");
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "" + "'", str88, "");
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "" + "'", str89, "");
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "" + "'", str90, "");
        org.junit.Assert.assertEquals("'" + str91 + "' != '" + "" + "'", str91, "");
        org.junit.Assert.assertEquals("'" + str92 + "' != '" + "" + "'", str92, "");
        org.junit.Assert.assertEquals("'" + str93 + "' != '" + "" + "'", str93, "");
        org.junit.Assert.assertEquals("'" + str94 + "' != '" + "" + "'", str94, "");
        org.junit.Assert.assertEquals("'" + str95 + "' != '" + "" + "'", str95, "");
        org.junit.Assert.assertEquals("'" + str96 + "' != '" + "" + "'", str96, "");
        org.junit.Assert.assertNotNull(wildcardClass97);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        java.nio.charset.CharsetEncoder charsetEncoder11 = null;
        java.nio.charset.CharsetEncoder charsetEncoder13 = null;
        java.nio.charset.CharsetEncoder charsetEncoder15 = null;
        java.nio.charset.CharsetEncoder charsetEncoder17 = null;
        java.nio.charset.CharsetEncoder charsetEncoder19 = null;
        java.nio.charset.CharsetEncoder charsetEncoder21 = null;
        java.nio.charset.CharsetEncoder charsetEncoder23 = null;
        java.nio.charset.CharsetEncoder charsetEncoder25 = null;
        java.nio.charset.CharsetEncoder charsetEncoder27 = null;
        java.nio.charset.CharsetEncoder charsetEncoder29 = null;
        java.nio.charset.CharsetEncoder charsetEncoder31 = null;
        java.nio.charset.CharsetEncoder charsetEncoder33 = null;
        java.nio.charset.CharsetEncoder charsetEncoder35 = null;
        java.nio.charset.CharsetEncoder charsetEncoder37 = null;
        java.nio.charset.CharsetEncoder charsetEncoder39 = null;
        java.nio.charset.CharsetEncoder charsetEncoder41 = null;
        java.nio.charset.CharsetEncoder charsetEncoder43 = null;
        java.nio.charset.CharsetEncoder charsetEncoder45 = null;
        java.nio.charset.CharsetEncoder charsetEncoder47 = null;
        java.nio.charset.CharsetEncoder charsetEncoder49 = null;
        java.nio.charset.CharsetEncoder charsetEncoder51 = null;
        java.nio.charset.CharsetEncoder charsetEncoder53 = null;
        java.nio.charset.CharsetEncoder charsetEncoder55 = null;
        java.nio.charset.CharsetEncoder charsetEncoder57 = null;
        java.nio.charset.CharsetEncoder charsetEncoder59 = null;
        java.nio.charset.CharsetEncoder charsetEncoder61 = null;
        java.nio.charset.CharsetEncoder charsetEncoder63 = null;
        java.nio.charset.CharsetEncoder charsetEncoder65 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode66 = org.jsoup.nodes.Entities.EscapeMode.base;
        java.lang.String str67 = org.jsoup.nodes.Entities.escape("", charsetEncoder65, escapeMode66);
        java.lang.String str68 = org.jsoup.nodes.Entities.escape("", charsetEncoder63, escapeMode66);
        java.lang.String str69 = org.jsoup.nodes.Entities.escape("", charsetEncoder61, escapeMode66);
        java.lang.String str70 = org.jsoup.nodes.Entities.escape("", charsetEncoder59, escapeMode66);
        java.lang.String str71 = org.jsoup.nodes.Entities.escape("", charsetEncoder57, escapeMode66);
        java.lang.String str72 = org.jsoup.nodes.Entities.escape("", charsetEncoder55, escapeMode66);
        java.lang.String str73 = org.jsoup.nodes.Entities.escape("", charsetEncoder53, escapeMode66);
        java.lang.String str74 = org.jsoup.nodes.Entities.escape("", charsetEncoder51, escapeMode66);
        java.lang.String str75 = org.jsoup.nodes.Entities.escape("", charsetEncoder49, escapeMode66);
        java.lang.String str76 = org.jsoup.nodes.Entities.escape("", charsetEncoder47, escapeMode66);
        java.lang.String str77 = org.jsoup.nodes.Entities.escape("", charsetEncoder45, escapeMode66);
        java.lang.String str78 = org.jsoup.nodes.Entities.escape("", charsetEncoder43, escapeMode66);
        java.lang.String str79 = org.jsoup.nodes.Entities.escape("", charsetEncoder41, escapeMode66);
        java.lang.String str80 = org.jsoup.nodes.Entities.escape("", charsetEncoder39, escapeMode66);
        java.lang.String str81 = org.jsoup.nodes.Entities.escape("", charsetEncoder37, escapeMode66);
        java.lang.String str82 = org.jsoup.nodes.Entities.escape("", charsetEncoder35, escapeMode66);
        java.lang.String str83 = org.jsoup.nodes.Entities.escape("", charsetEncoder33, escapeMode66);
        java.lang.String str84 = org.jsoup.nodes.Entities.escape("", charsetEncoder31, escapeMode66);
        java.lang.String str85 = org.jsoup.nodes.Entities.escape("", charsetEncoder29, escapeMode66);
        java.lang.String str86 = org.jsoup.nodes.Entities.escape("", charsetEncoder27, escapeMode66);
        java.lang.String str87 = org.jsoup.nodes.Entities.escape("", charsetEncoder25, escapeMode66);
        java.lang.String str88 = org.jsoup.nodes.Entities.escape("", charsetEncoder23, escapeMode66);
        java.lang.String str89 = org.jsoup.nodes.Entities.escape("", charsetEncoder21, escapeMode66);
        java.lang.String str90 = org.jsoup.nodes.Entities.escape("", charsetEncoder19, escapeMode66);
        java.lang.String str91 = org.jsoup.nodes.Entities.escape("", charsetEncoder17, escapeMode66);
        java.lang.String str92 = org.jsoup.nodes.Entities.escape("", charsetEncoder15, escapeMode66);
        java.lang.String str93 = org.jsoup.nodes.Entities.escape("", charsetEncoder13, escapeMode66);
        java.lang.String str94 = org.jsoup.nodes.Entities.escape("", charsetEncoder11, escapeMode66);
        java.lang.String str95 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode66);
        java.lang.String str96 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode66);
        java.lang.String str97 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode66);
        java.lang.String str98 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode66);
        java.lang.String str99 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode66);
        org.junit.Assert.assertTrue("'" + escapeMode66 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode66.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "" + "'", str68, "");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "" + "'", str72, "");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "" + "'", str73, "");
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "" + "'", str74, "");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "" + "'", str75, "");
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "" + "'", str76, "");
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "" + "'", str77, "");
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "" + "'", str78, "");
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "" + "'", str79, "");
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "" + "'", str80, "");
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "" + "'", str81, "");
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "" + "'", str82, "");
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "" + "'", str83, "");
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "" + "'", str84, "");
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "" + "'", str85, "");
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "" + "'", str86, "");
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "" + "'", str87, "");
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "" + "'", str88, "");
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "" + "'", str89, "");
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "" + "'", str90, "");
        org.junit.Assert.assertEquals("'" + str91 + "' != '" + "" + "'", str91, "");
        org.junit.Assert.assertEquals("'" + str92 + "' != '" + "" + "'", str92, "");
        org.junit.Assert.assertEquals("'" + str93 + "' != '" + "" + "'", str93, "");
        org.junit.Assert.assertEquals("'" + str94 + "' != '" + "" + "'", str94, "");
        org.junit.Assert.assertEquals("'" + str95 + "' != '" + "" + "'", str95, "");
        org.junit.Assert.assertEquals("'" + str96 + "' != '" + "" + "'", str96, "");
        org.junit.Assert.assertEquals("'" + str97 + "' != '" + "" + "'", str97, "");
        org.junit.Assert.assertEquals("'" + str98 + "' != '" + "" + "'", str98, "");
        org.junit.Assert.assertEquals("'" + str99 + "' != '" + "" + "'", str99, "");
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        java.nio.charset.CharsetEncoder charsetEncoder11 = null;
        java.nio.charset.CharsetEncoder charsetEncoder13 = null;
        java.nio.charset.CharsetEncoder charsetEncoder15 = null;
        java.nio.charset.CharsetEncoder charsetEncoder17 = null;
        java.nio.charset.CharsetEncoder charsetEncoder19 = null;
        java.nio.charset.CharsetEncoder charsetEncoder21 = null;
        java.nio.charset.CharsetEncoder charsetEncoder23 = null;
        java.nio.charset.CharsetEncoder charsetEncoder25 = null;
        java.nio.charset.CharsetEncoder charsetEncoder27 = null;
        java.nio.charset.CharsetEncoder charsetEncoder29 = null;
        java.nio.charset.CharsetEncoder charsetEncoder31 = null;
        java.nio.charset.CharsetEncoder charsetEncoder33 = null;
        java.nio.charset.CharsetEncoder charsetEncoder35 = null;
        java.nio.charset.CharsetEncoder charsetEncoder37 = null;
        java.nio.charset.CharsetEncoder charsetEncoder39 = null;
        java.nio.charset.CharsetEncoder charsetEncoder41 = null;
        java.nio.charset.CharsetEncoder charsetEncoder43 = null;
        java.nio.charset.CharsetEncoder charsetEncoder45 = null;
        java.nio.charset.CharsetEncoder charsetEncoder47 = null;
        java.nio.charset.CharsetEncoder charsetEncoder49 = null;
        java.nio.charset.CharsetEncoder charsetEncoder51 = null;
        java.nio.charset.CharsetEncoder charsetEncoder53 = null;
        java.nio.charset.CharsetEncoder charsetEncoder55 = null;
        java.nio.charset.CharsetEncoder charsetEncoder57 = null;
        java.nio.charset.CharsetEncoder charsetEncoder59 = null;
        java.nio.charset.CharsetEncoder charsetEncoder61 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode62 = org.jsoup.nodes.Entities.EscapeMode.extended;
        java.lang.String str63 = org.jsoup.nodes.Entities.escape("", charsetEncoder61, escapeMode62);
        java.lang.String str64 = org.jsoup.nodes.Entities.escape("", charsetEncoder59, escapeMode62);
        java.lang.String str65 = org.jsoup.nodes.Entities.escape("", charsetEncoder57, escapeMode62);
        java.lang.String str66 = org.jsoup.nodes.Entities.escape("", charsetEncoder55, escapeMode62);
        java.lang.String str67 = org.jsoup.nodes.Entities.escape("", charsetEncoder53, escapeMode62);
        java.lang.String str68 = org.jsoup.nodes.Entities.escape("", charsetEncoder51, escapeMode62);
        java.lang.String str69 = org.jsoup.nodes.Entities.escape("", charsetEncoder49, escapeMode62);
        java.lang.String str70 = org.jsoup.nodes.Entities.escape("", charsetEncoder47, escapeMode62);
        java.lang.String str71 = org.jsoup.nodes.Entities.escape("", charsetEncoder45, escapeMode62);
        java.lang.String str72 = org.jsoup.nodes.Entities.escape("", charsetEncoder43, escapeMode62);
        java.lang.String str73 = org.jsoup.nodes.Entities.escape("", charsetEncoder41, escapeMode62);
        java.lang.String str74 = org.jsoup.nodes.Entities.escape("", charsetEncoder39, escapeMode62);
        java.lang.String str75 = org.jsoup.nodes.Entities.escape("", charsetEncoder37, escapeMode62);
        java.lang.String str76 = org.jsoup.nodes.Entities.escape("", charsetEncoder35, escapeMode62);
        java.lang.String str77 = org.jsoup.nodes.Entities.escape("", charsetEncoder33, escapeMode62);
        java.lang.String str78 = org.jsoup.nodes.Entities.escape("", charsetEncoder31, escapeMode62);
        java.lang.String str79 = org.jsoup.nodes.Entities.escape("", charsetEncoder29, escapeMode62);
        java.lang.String str80 = org.jsoup.nodes.Entities.escape("", charsetEncoder27, escapeMode62);
        java.lang.String str81 = org.jsoup.nodes.Entities.escape("", charsetEncoder25, escapeMode62);
        java.lang.String str82 = org.jsoup.nodes.Entities.escape("", charsetEncoder23, escapeMode62);
        java.lang.String str83 = org.jsoup.nodes.Entities.escape("", charsetEncoder21, escapeMode62);
        java.lang.String str84 = org.jsoup.nodes.Entities.escape("", charsetEncoder19, escapeMode62);
        java.lang.String str85 = org.jsoup.nodes.Entities.escape("", charsetEncoder17, escapeMode62);
        java.lang.String str86 = org.jsoup.nodes.Entities.escape("", charsetEncoder15, escapeMode62);
        java.lang.String str87 = org.jsoup.nodes.Entities.escape("", charsetEncoder13, escapeMode62);
        java.lang.String str88 = org.jsoup.nodes.Entities.escape("", charsetEncoder11, escapeMode62);
        java.lang.String str89 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode62);
        java.lang.String str90 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode62);
        java.lang.String str91 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode62);
        java.lang.String str92 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode62);
        java.lang.String str93 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode62);
        java.lang.Class<?> wildcardClass94 = escapeMode62.getClass();
        org.junit.Assert.assertTrue("'" + escapeMode62 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.extended + "'", escapeMode62.equals(org.jsoup.nodes.Entities.EscapeMode.extended));
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "" + "'", str68, "");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "" + "'", str72, "");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "" + "'", str73, "");
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "" + "'", str74, "");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "" + "'", str75, "");
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "" + "'", str76, "");
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "" + "'", str77, "");
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "" + "'", str78, "");
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "" + "'", str79, "");
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "" + "'", str80, "");
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "" + "'", str81, "");
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "" + "'", str82, "");
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "" + "'", str83, "");
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "" + "'", str84, "");
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "" + "'", str85, "");
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "" + "'", str86, "");
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "" + "'", str87, "");
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "" + "'", str88, "");
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "" + "'", str89, "");
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "" + "'", str90, "");
        org.junit.Assert.assertEquals("'" + str91 + "' != '" + "" + "'", str91, "");
        org.junit.Assert.assertEquals("'" + str92 + "' != '" + "" + "'", str92, "");
        org.junit.Assert.assertEquals("'" + str93 + "' != '" + "" + "'", str93, "");
        org.junit.Assert.assertNotNull(wildcardClass94);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        java.nio.charset.CharsetEncoder charsetEncoder11 = null;
        java.nio.charset.CharsetEncoder charsetEncoder13 = null;
        java.nio.charset.CharsetEncoder charsetEncoder15 = null;
        java.nio.charset.CharsetEncoder charsetEncoder17 = null;
        java.nio.charset.CharsetEncoder charsetEncoder19 = null;
        java.nio.charset.CharsetEncoder charsetEncoder21 = null;
        java.nio.charset.CharsetEncoder charsetEncoder23 = null;
        java.nio.charset.CharsetEncoder charsetEncoder25 = null;
        java.nio.charset.CharsetEncoder charsetEncoder27 = null;
        java.nio.charset.CharsetEncoder charsetEncoder29 = null;
        java.nio.charset.CharsetEncoder charsetEncoder31 = null;
        java.nio.charset.CharsetEncoder charsetEncoder33 = null;
        java.nio.charset.CharsetEncoder charsetEncoder35 = null;
        java.nio.charset.CharsetEncoder charsetEncoder37 = null;
        java.nio.charset.CharsetEncoder charsetEncoder39 = null;
        java.nio.charset.CharsetEncoder charsetEncoder41 = null;
        java.nio.charset.CharsetEncoder charsetEncoder43 = null;
        java.nio.charset.CharsetEncoder charsetEncoder45 = null;
        java.nio.charset.CharsetEncoder charsetEncoder47 = null;
        java.nio.charset.CharsetEncoder charsetEncoder49 = null;
        java.nio.charset.CharsetEncoder charsetEncoder51 = null;
        java.nio.charset.CharsetEncoder charsetEncoder53 = null;
        java.nio.charset.CharsetEncoder charsetEncoder55 = null;
        java.nio.charset.CharsetEncoder charsetEncoder57 = null;
        java.nio.charset.CharsetEncoder charsetEncoder59 = null;
        java.nio.charset.CharsetEncoder charsetEncoder61 = null;
        java.nio.charset.CharsetEncoder charsetEncoder63 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode64 = org.jsoup.nodes.Entities.EscapeMode.extended;
        java.lang.String str65 = org.jsoup.nodes.Entities.escape("", charsetEncoder63, escapeMode64);
        java.lang.String str66 = org.jsoup.nodes.Entities.escape("", charsetEncoder61, escapeMode64);
        java.lang.String str67 = org.jsoup.nodes.Entities.escape("", charsetEncoder59, escapeMode64);
        java.lang.String str68 = org.jsoup.nodes.Entities.escape("", charsetEncoder57, escapeMode64);
        java.lang.String str69 = org.jsoup.nodes.Entities.escape("", charsetEncoder55, escapeMode64);
        java.lang.String str70 = org.jsoup.nodes.Entities.escape("", charsetEncoder53, escapeMode64);
        java.lang.String str71 = org.jsoup.nodes.Entities.escape("", charsetEncoder51, escapeMode64);
        java.lang.String str72 = org.jsoup.nodes.Entities.escape("", charsetEncoder49, escapeMode64);
        java.lang.String str73 = org.jsoup.nodes.Entities.escape("", charsetEncoder47, escapeMode64);
        java.lang.String str74 = org.jsoup.nodes.Entities.escape("", charsetEncoder45, escapeMode64);
        java.lang.String str75 = org.jsoup.nodes.Entities.escape("", charsetEncoder43, escapeMode64);
        java.lang.String str76 = org.jsoup.nodes.Entities.escape("", charsetEncoder41, escapeMode64);
        java.lang.String str77 = org.jsoup.nodes.Entities.escape("", charsetEncoder39, escapeMode64);
        java.lang.String str78 = org.jsoup.nodes.Entities.escape("", charsetEncoder37, escapeMode64);
        java.lang.String str79 = org.jsoup.nodes.Entities.escape("", charsetEncoder35, escapeMode64);
        java.lang.String str80 = org.jsoup.nodes.Entities.escape("", charsetEncoder33, escapeMode64);
        java.lang.String str81 = org.jsoup.nodes.Entities.escape("", charsetEncoder31, escapeMode64);
        java.lang.String str82 = org.jsoup.nodes.Entities.escape("", charsetEncoder29, escapeMode64);
        java.lang.String str83 = org.jsoup.nodes.Entities.escape("", charsetEncoder27, escapeMode64);
        java.lang.String str84 = org.jsoup.nodes.Entities.escape("", charsetEncoder25, escapeMode64);
        java.lang.String str85 = org.jsoup.nodes.Entities.escape("", charsetEncoder23, escapeMode64);
        java.lang.String str86 = org.jsoup.nodes.Entities.escape("", charsetEncoder21, escapeMode64);
        java.lang.String str87 = org.jsoup.nodes.Entities.escape("", charsetEncoder19, escapeMode64);
        java.lang.String str88 = org.jsoup.nodes.Entities.escape("", charsetEncoder17, escapeMode64);
        java.lang.String str89 = org.jsoup.nodes.Entities.escape("", charsetEncoder15, escapeMode64);
        java.lang.String str90 = org.jsoup.nodes.Entities.escape("", charsetEncoder13, escapeMode64);
        java.lang.String str91 = org.jsoup.nodes.Entities.escape("", charsetEncoder11, escapeMode64);
        java.lang.String str92 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode64);
        java.lang.String str93 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode64);
        java.lang.String str94 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode64);
        java.lang.String str95 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode64);
        java.lang.String str96 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode64);
        java.lang.Class<?> wildcardClass97 = escapeMode64.getClass();
        org.junit.Assert.assertTrue("'" + escapeMode64 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.extended + "'", escapeMode64.equals(org.jsoup.nodes.Entities.EscapeMode.extended));
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "" + "'", str68, "");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "" + "'", str72, "");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "" + "'", str73, "");
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "" + "'", str74, "");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "" + "'", str75, "");
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "" + "'", str76, "");
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "" + "'", str77, "");
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "" + "'", str78, "");
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "" + "'", str79, "");
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "" + "'", str80, "");
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "" + "'", str81, "");
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "" + "'", str82, "");
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "" + "'", str83, "");
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "" + "'", str84, "");
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "" + "'", str85, "");
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "" + "'", str86, "");
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "" + "'", str87, "");
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "" + "'", str88, "");
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "" + "'", str89, "");
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "" + "'", str90, "");
        org.junit.Assert.assertEquals("'" + str91 + "' != '" + "" + "'", str91, "");
        org.junit.Assert.assertEquals("'" + str92 + "' != '" + "" + "'", str92, "");
        org.junit.Assert.assertEquals("'" + str93 + "' != '" + "" + "'", str93, "");
        org.junit.Assert.assertEquals("'" + str94 + "' != '" + "" + "'", str94, "");
        org.junit.Assert.assertEquals("'" + str95 + "' != '" + "" + "'", str95, "");
        org.junit.Assert.assertEquals("'" + str96 + "' != '" + "" + "'", str96, "");
        org.junit.Assert.assertNotNull(wildcardClass97);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        java.nio.charset.CharsetEncoder charsetEncoder11 = null;
        java.nio.charset.CharsetEncoder charsetEncoder13 = null;
        java.nio.charset.CharsetEncoder charsetEncoder15 = null;
        java.nio.charset.CharsetEncoder charsetEncoder17 = null;
        java.nio.charset.CharsetEncoder charsetEncoder19 = null;
        java.nio.charset.CharsetEncoder charsetEncoder21 = null;
        java.nio.charset.CharsetEncoder charsetEncoder23 = null;
        java.nio.charset.CharsetEncoder charsetEncoder25 = null;
        java.nio.charset.CharsetEncoder charsetEncoder27 = null;
        java.nio.charset.CharsetEncoder charsetEncoder29 = null;
        java.nio.charset.CharsetEncoder charsetEncoder31 = null;
        java.nio.charset.CharsetEncoder charsetEncoder33 = null;
        java.nio.charset.CharsetEncoder charsetEncoder35 = null;
        java.nio.charset.CharsetEncoder charsetEncoder37 = null;
        java.nio.charset.CharsetEncoder charsetEncoder39 = null;
        java.nio.charset.CharsetEncoder charsetEncoder41 = null;
        java.nio.charset.CharsetEncoder charsetEncoder43 = null;
        java.nio.charset.CharsetEncoder charsetEncoder45 = null;
        java.nio.charset.CharsetEncoder charsetEncoder47 = null;
        java.nio.charset.CharsetEncoder charsetEncoder49 = null;
        java.nio.charset.CharsetEncoder charsetEncoder51 = null;
        java.nio.charset.CharsetEncoder charsetEncoder53 = null;
        java.nio.charset.CharsetEncoder charsetEncoder55 = null;
        java.nio.charset.CharsetEncoder charsetEncoder57 = null;
        java.nio.charset.CharsetEncoder charsetEncoder59 = null;
        java.nio.charset.CharsetEncoder charsetEncoder61 = null;
        java.nio.charset.CharsetEncoder charsetEncoder63 = null;
        java.nio.charset.CharsetEncoder charsetEncoder65 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode66 = org.jsoup.nodes.Entities.EscapeMode.extended;
        java.lang.String str67 = org.jsoup.nodes.Entities.escape("", charsetEncoder65, escapeMode66);
        java.lang.String str68 = org.jsoup.nodes.Entities.escape("", charsetEncoder63, escapeMode66);
        java.lang.String str69 = org.jsoup.nodes.Entities.escape("", charsetEncoder61, escapeMode66);
        java.lang.String str70 = org.jsoup.nodes.Entities.escape("", charsetEncoder59, escapeMode66);
        java.lang.String str71 = org.jsoup.nodes.Entities.escape("", charsetEncoder57, escapeMode66);
        java.lang.String str72 = org.jsoup.nodes.Entities.escape("", charsetEncoder55, escapeMode66);
        java.lang.String str73 = org.jsoup.nodes.Entities.escape("", charsetEncoder53, escapeMode66);
        java.lang.String str74 = org.jsoup.nodes.Entities.escape("", charsetEncoder51, escapeMode66);
        java.lang.String str75 = org.jsoup.nodes.Entities.escape("", charsetEncoder49, escapeMode66);
        java.lang.String str76 = org.jsoup.nodes.Entities.escape("", charsetEncoder47, escapeMode66);
        java.lang.String str77 = org.jsoup.nodes.Entities.escape("", charsetEncoder45, escapeMode66);
        java.lang.String str78 = org.jsoup.nodes.Entities.escape("", charsetEncoder43, escapeMode66);
        java.lang.String str79 = org.jsoup.nodes.Entities.escape("", charsetEncoder41, escapeMode66);
        java.lang.String str80 = org.jsoup.nodes.Entities.escape("", charsetEncoder39, escapeMode66);
        java.lang.String str81 = org.jsoup.nodes.Entities.escape("", charsetEncoder37, escapeMode66);
        java.lang.String str82 = org.jsoup.nodes.Entities.escape("", charsetEncoder35, escapeMode66);
        java.lang.String str83 = org.jsoup.nodes.Entities.escape("", charsetEncoder33, escapeMode66);
        java.lang.String str84 = org.jsoup.nodes.Entities.escape("", charsetEncoder31, escapeMode66);
        java.lang.String str85 = org.jsoup.nodes.Entities.escape("", charsetEncoder29, escapeMode66);
        java.lang.String str86 = org.jsoup.nodes.Entities.escape("", charsetEncoder27, escapeMode66);
        java.lang.String str87 = org.jsoup.nodes.Entities.escape("", charsetEncoder25, escapeMode66);
        java.lang.String str88 = org.jsoup.nodes.Entities.escape("", charsetEncoder23, escapeMode66);
        java.lang.String str89 = org.jsoup.nodes.Entities.escape("", charsetEncoder21, escapeMode66);
        java.lang.String str90 = org.jsoup.nodes.Entities.escape("", charsetEncoder19, escapeMode66);
        java.lang.String str91 = org.jsoup.nodes.Entities.escape("", charsetEncoder17, escapeMode66);
        java.lang.String str92 = org.jsoup.nodes.Entities.escape("", charsetEncoder15, escapeMode66);
        java.lang.String str93 = org.jsoup.nodes.Entities.escape("", charsetEncoder13, escapeMode66);
        java.lang.String str94 = org.jsoup.nodes.Entities.escape("", charsetEncoder11, escapeMode66);
        java.lang.String str95 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode66);
        java.lang.String str96 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode66);
        java.lang.String str97 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode66);
        java.lang.String str98 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode66);
        java.lang.String str99 = org.jsoup.nodes.Entities.escape("", charsetEncoder1, escapeMode66);
        org.junit.Assert.assertTrue("'" + escapeMode66 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.extended + "'", escapeMode66.equals(org.jsoup.nodes.Entities.EscapeMode.extended));
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "" + "'", str68, "");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "" + "'", str72, "");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "" + "'", str73, "");
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "" + "'", str74, "");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "" + "'", str75, "");
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "" + "'", str76, "");
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "" + "'", str77, "");
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "" + "'", str78, "");
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "" + "'", str79, "");
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "" + "'", str80, "");
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "" + "'", str81, "");
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "" + "'", str82, "");
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "" + "'", str83, "");
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "" + "'", str84, "");
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "" + "'", str85, "");
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "" + "'", str86, "");
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "" + "'", str87, "");
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "" + "'", str88, "");
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "" + "'", str89, "");
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "" + "'", str90, "");
        org.junit.Assert.assertEquals("'" + str91 + "' != '" + "" + "'", str91, "");
        org.junit.Assert.assertEquals("'" + str92 + "' != '" + "" + "'", str92, "");
        org.junit.Assert.assertEquals("'" + str93 + "' != '" + "" + "'", str93, "");
        org.junit.Assert.assertEquals("'" + str94 + "' != '" + "" + "'", str94, "");
        org.junit.Assert.assertEquals("'" + str95 + "' != '" + "" + "'", str95, "");
        org.junit.Assert.assertEquals("'" + str96 + "' != '" + "" + "'", str96, "");
        org.junit.Assert.assertEquals("'" + str97 + "' != '" + "" + "'", str97, "");
        org.junit.Assert.assertEquals("'" + str98 + "' != '" + "" + "'", str98, "");
        org.junit.Assert.assertEquals("'" + str99 + "' != '" + "" + "'", str99, "");
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        java.nio.charset.CharsetEncoder charsetEncoder11 = null;
        java.nio.charset.CharsetEncoder charsetEncoder13 = null;
        java.nio.charset.CharsetEncoder charsetEncoder15 = null;
        java.nio.charset.CharsetEncoder charsetEncoder17 = null;
        java.nio.charset.CharsetEncoder charsetEncoder19 = null;
        java.nio.charset.CharsetEncoder charsetEncoder21 = null;
        java.nio.charset.CharsetEncoder charsetEncoder23 = null;
        java.nio.charset.CharsetEncoder charsetEncoder25 = null;
        java.nio.charset.CharsetEncoder charsetEncoder27 = null;
        java.nio.charset.CharsetEncoder charsetEncoder29 = null;
        java.nio.charset.CharsetEncoder charsetEncoder31 = null;
        java.nio.charset.CharsetEncoder charsetEncoder33 = null;
        java.nio.charset.CharsetEncoder charsetEncoder35 = null;
        java.nio.charset.CharsetEncoder charsetEncoder37 = null;
        java.nio.charset.CharsetEncoder charsetEncoder39 = null;
        java.nio.charset.CharsetEncoder charsetEncoder41 = null;
        java.nio.charset.CharsetEncoder charsetEncoder43 = null;
        java.nio.charset.CharsetEncoder charsetEncoder45 = null;
        java.nio.charset.CharsetEncoder charsetEncoder47 = null;
        java.nio.charset.CharsetEncoder charsetEncoder49 = null;
        java.nio.charset.CharsetEncoder charsetEncoder51 = null;
        java.nio.charset.CharsetEncoder charsetEncoder53 = null;
        java.nio.charset.CharsetEncoder charsetEncoder55 = null;
        java.nio.charset.CharsetEncoder charsetEncoder57 = null;
        java.nio.charset.CharsetEncoder charsetEncoder59 = null;
        java.nio.charset.CharsetEncoder charsetEncoder61 = null;
        java.nio.charset.CharsetEncoder charsetEncoder63 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode64 = org.jsoup.nodes.Entities.EscapeMode.extended;
        java.lang.String str65 = org.jsoup.nodes.Entities.escape("", charsetEncoder63, escapeMode64);
        java.lang.String str66 = org.jsoup.nodes.Entities.escape("", charsetEncoder61, escapeMode64);
        java.lang.String str67 = org.jsoup.nodes.Entities.escape("", charsetEncoder59, escapeMode64);
        java.lang.String str68 = org.jsoup.nodes.Entities.escape("", charsetEncoder57, escapeMode64);
        java.lang.String str69 = org.jsoup.nodes.Entities.escape("", charsetEncoder55, escapeMode64);
        java.lang.String str70 = org.jsoup.nodes.Entities.escape("", charsetEncoder53, escapeMode64);
        java.lang.String str71 = org.jsoup.nodes.Entities.escape("", charsetEncoder51, escapeMode64);
        java.lang.String str72 = org.jsoup.nodes.Entities.escape("", charsetEncoder49, escapeMode64);
        java.lang.String str73 = org.jsoup.nodes.Entities.escape("", charsetEncoder47, escapeMode64);
        java.lang.String str74 = org.jsoup.nodes.Entities.escape("", charsetEncoder45, escapeMode64);
        java.lang.String str75 = org.jsoup.nodes.Entities.escape("", charsetEncoder43, escapeMode64);
        java.lang.String str76 = org.jsoup.nodes.Entities.escape("", charsetEncoder41, escapeMode64);
        java.lang.String str77 = org.jsoup.nodes.Entities.escape("", charsetEncoder39, escapeMode64);
        java.lang.String str78 = org.jsoup.nodes.Entities.escape("", charsetEncoder37, escapeMode64);
        java.lang.String str79 = org.jsoup.nodes.Entities.escape("", charsetEncoder35, escapeMode64);
        java.lang.String str80 = org.jsoup.nodes.Entities.escape("", charsetEncoder33, escapeMode64);
        java.lang.String str81 = org.jsoup.nodes.Entities.escape("", charsetEncoder31, escapeMode64);
        java.lang.String str82 = org.jsoup.nodes.Entities.escape("", charsetEncoder29, escapeMode64);
        java.lang.String str83 = org.jsoup.nodes.Entities.escape("", charsetEncoder27, escapeMode64);
        java.lang.String str84 = org.jsoup.nodes.Entities.escape("", charsetEncoder25, escapeMode64);
        java.lang.String str85 = org.jsoup.nodes.Entities.escape("", charsetEncoder23, escapeMode64);
        java.lang.String str86 = org.jsoup.nodes.Entities.escape("", charsetEncoder21, escapeMode64);
        java.lang.String str87 = org.jsoup.nodes.Entities.escape("", charsetEncoder19, escapeMode64);
        java.lang.String str88 = org.jsoup.nodes.Entities.escape("", charsetEncoder17, escapeMode64);
        java.lang.String str89 = org.jsoup.nodes.Entities.escape("", charsetEncoder15, escapeMode64);
        java.lang.String str90 = org.jsoup.nodes.Entities.escape("", charsetEncoder13, escapeMode64);
        java.lang.String str91 = org.jsoup.nodes.Entities.escape("", charsetEncoder11, escapeMode64);
        java.lang.String str92 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode64);
        java.lang.String str93 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode64);
        java.lang.String str94 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode64);
        java.lang.String str95 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode64);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str96 = org.jsoup.nodes.Entities.escape("hi!", charsetEncoder1, escapeMode64);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + escapeMode64 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.extended + "'", escapeMode64.equals(org.jsoup.nodes.Entities.EscapeMode.extended));
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "" + "'", str68, "");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "" + "'", str72, "");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "" + "'", str73, "");
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "" + "'", str74, "");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "" + "'", str75, "");
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "" + "'", str76, "");
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "" + "'", str77, "");
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "" + "'", str78, "");
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "" + "'", str79, "");
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "" + "'", str80, "");
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "" + "'", str81, "");
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "" + "'", str82, "");
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "" + "'", str83, "");
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "" + "'", str84, "");
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "" + "'", str85, "");
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "" + "'", str86, "");
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "" + "'", str87, "");
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "" + "'", str88, "");
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "" + "'", str89, "");
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "" + "'", str90, "");
        org.junit.Assert.assertEquals("'" + str91 + "' != '" + "" + "'", str91, "");
        org.junit.Assert.assertEquals("'" + str92 + "' != '" + "" + "'", str92, "");
        org.junit.Assert.assertEquals("'" + str93 + "' != '" + "" + "'", str93, "");
        org.junit.Assert.assertEquals("'" + str94 + "' != '" + "" + "'", str94, "");
        org.junit.Assert.assertEquals("'" + str95 + "' != '" + "" + "'", str95, "");
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.nio.charset.CharsetEncoder charsetEncoder3 = null;
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        java.nio.charset.CharsetEncoder charsetEncoder11 = null;
        java.nio.charset.CharsetEncoder charsetEncoder13 = null;
        java.nio.charset.CharsetEncoder charsetEncoder15 = null;
        java.nio.charset.CharsetEncoder charsetEncoder17 = null;
        java.nio.charset.CharsetEncoder charsetEncoder19 = null;
        java.nio.charset.CharsetEncoder charsetEncoder21 = null;
        java.nio.charset.CharsetEncoder charsetEncoder23 = null;
        java.nio.charset.CharsetEncoder charsetEncoder25 = null;
        java.nio.charset.CharsetEncoder charsetEncoder27 = null;
        java.nio.charset.CharsetEncoder charsetEncoder29 = null;
        java.nio.charset.CharsetEncoder charsetEncoder31 = null;
        java.nio.charset.CharsetEncoder charsetEncoder33 = null;
        java.nio.charset.CharsetEncoder charsetEncoder35 = null;
        java.nio.charset.CharsetEncoder charsetEncoder37 = null;
        java.nio.charset.CharsetEncoder charsetEncoder39 = null;
        java.nio.charset.CharsetEncoder charsetEncoder41 = null;
        java.nio.charset.CharsetEncoder charsetEncoder43 = null;
        java.nio.charset.CharsetEncoder charsetEncoder45 = null;
        java.nio.charset.CharsetEncoder charsetEncoder47 = null;
        java.nio.charset.CharsetEncoder charsetEncoder49 = null;
        java.nio.charset.CharsetEncoder charsetEncoder51 = null;
        java.nio.charset.CharsetEncoder charsetEncoder53 = null;
        java.nio.charset.CharsetEncoder charsetEncoder55 = null;
        java.nio.charset.CharsetEncoder charsetEncoder57 = null;
        java.nio.charset.CharsetEncoder charsetEncoder59 = null;
        java.nio.charset.CharsetEncoder charsetEncoder61 = null;
        java.nio.charset.CharsetEncoder charsetEncoder63 = null;
        java.nio.charset.CharsetEncoder charsetEncoder65 = null;
        org.jsoup.nodes.Entities.EscapeMode escapeMode66 = org.jsoup.nodes.Entities.EscapeMode.extended;
        java.lang.String str67 = org.jsoup.nodes.Entities.escape("", charsetEncoder65, escapeMode66);
        java.lang.String str68 = org.jsoup.nodes.Entities.escape("", charsetEncoder63, escapeMode66);
        java.lang.String str69 = org.jsoup.nodes.Entities.escape("", charsetEncoder61, escapeMode66);
        java.lang.String str70 = org.jsoup.nodes.Entities.escape("", charsetEncoder59, escapeMode66);
        java.lang.String str71 = org.jsoup.nodes.Entities.escape("", charsetEncoder57, escapeMode66);
        java.lang.String str72 = org.jsoup.nodes.Entities.escape("", charsetEncoder55, escapeMode66);
        java.lang.String str73 = org.jsoup.nodes.Entities.escape("", charsetEncoder53, escapeMode66);
        java.lang.String str74 = org.jsoup.nodes.Entities.escape("", charsetEncoder51, escapeMode66);
        java.lang.String str75 = org.jsoup.nodes.Entities.escape("", charsetEncoder49, escapeMode66);
        java.lang.String str76 = org.jsoup.nodes.Entities.escape("", charsetEncoder47, escapeMode66);
        java.lang.String str77 = org.jsoup.nodes.Entities.escape("", charsetEncoder45, escapeMode66);
        java.lang.String str78 = org.jsoup.nodes.Entities.escape("", charsetEncoder43, escapeMode66);
        java.lang.String str79 = org.jsoup.nodes.Entities.escape("", charsetEncoder41, escapeMode66);
        java.lang.String str80 = org.jsoup.nodes.Entities.escape("", charsetEncoder39, escapeMode66);
        java.lang.String str81 = org.jsoup.nodes.Entities.escape("", charsetEncoder37, escapeMode66);
        java.lang.String str82 = org.jsoup.nodes.Entities.escape("", charsetEncoder35, escapeMode66);
        java.lang.String str83 = org.jsoup.nodes.Entities.escape("", charsetEncoder33, escapeMode66);
        java.lang.String str84 = org.jsoup.nodes.Entities.escape("", charsetEncoder31, escapeMode66);
        java.lang.String str85 = org.jsoup.nodes.Entities.escape("", charsetEncoder29, escapeMode66);
        java.lang.String str86 = org.jsoup.nodes.Entities.escape("", charsetEncoder27, escapeMode66);
        java.lang.String str87 = org.jsoup.nodes.Entities.escape("", charsetEncoder25, escapeMode66);
        java.lang.String str88 = org.jsoup.nodes.Entities.escape("", charsetEncoder23, escapeMode66);
        java.lang.String str89 = org.jsoup.nodes.Entities.escape("", charsetEncoder21, escapeMode66);
        java.lang.String str90 = org.jsoup.nodes.Entities.escape("", charsetEncoder19, escapeMode66);
        java.lang.String str91 = org.jsoup.nodes.Entities.escape("", charsetEncoder17, escapeMode66);
        java.lang.String str92 = org.jsoup.nodes.Entities.escape("", charsetEncoder15, escapeMode66);
        java.lang.String str93 = org.jsoup.nodes.Entities.escape("", charsetEncoder13, escapeMode66);
        java.lang.String str94 = org.jsoup.nodes.Entities.escape("", charsetEncoder11, escapeMode66);
        java.lang.String str95 = org.jsoup.nodes.Entities.escape("", charsetEncoder9, escapeMode66);
        java.lang.String str96 = org.jsoup.nodes.Entities.escape("", charsetEncoder7, escapeMode66);
        java.lang.String str97 = org.jsoup.nodes.Entities.escape("", charsetEncoder5, escapeMode66);
        java.lang.String str98 = org.jsoup.nodes.Entities.escape("", charsetEncoder3, escapeMode66);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str99 = org.jsoup.nodes.Entities.escape("hi!", charsetEncoder1, escapeMode66);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + escapeMode66 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.extended + "'", escapeMode66.equals(org.jsoup.nodes.Entities.EscapeMode.extended));
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "" + "'", str68, "");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "" + "'", str72, "");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "" + "'", str73, "");
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "" + "'", str74, "");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "" + "'", str75, "");
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "" + "'", str76, "");
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "" + "'", str77, "");
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "" + "'", str78, "");
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "" + "'", str79, "");
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "" + "'", str80, "");
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "" + "'", str81, "");
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "" + "'", str82, "");
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "" + "'", str83, "");
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "" + "'", str84, "");
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "" + "'", str85, "");
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "" + "'", str86, "");
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "" + "'", str87, "");
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "" + "'", str88, "");
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "" + "'", str89, "");
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "" + "'", str90, "");
        org.junit.Assert.assertEquals("'" + str91 + "' != '" + "" + "'", str91, "");
        org.junit.Assert.assertEquals("'" + str92 + "' != '" + "" + "'", str92, "");
        org.junit.Assert.assertEquals("'" + str93 + "' != '" + "" + "'", str93, "");
        org.junit.Assert.assertEquals("'" + str94 + "' != '" + "" + "'", str94, "");
        org.junit.Assert.assertEquals("'" + str95 + "' != '" + "" + "'", str95, "");
        org.junit.Assert.assertEquals("'" + str96 + "' != '" + "" + "'", str96, "");
        org.junit.Assert.assertEquals("'" + str97 + "' != '" + "" + "'", str97, "");
        org.junit.Assert.assertEquals("'" + str98 + "' != '" + "" + "'", str98, "");
    }
}

